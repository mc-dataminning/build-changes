import com.google.common.base.Charsets;
import com.google.common.base.MoreObjects;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;

public class eth {
   static final Logger ag = LogUtils.getLogger();
   static final Gson ah = new Gson();
   private static final TypeToken<List<String>> ai = new TypeToken<List<String>>() {
   };
   public static final int a = 2;
   public static final int b = 4;
   public static final int c = 8;
   public static final int d = 12;
   public static final int e = 16;
   public static final int f = 32;
   private static final Splitter aj = Splitter.on(':').limit(2);
   private static final float ak = 1.0F;
   public static final String g = "";
   private static final ur al = ur.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final etg<Boolean> am = etg.a("options.darkMojangStudiosBackgroundColor", etg.a(al), false);
   private static final ur an = ur.c("options.hideLightningFlashes.tooltip");
   private final etg<Boolean> ao = etg.a("options.hideLightningFlashes", etg.a(an), false);
   private static final ur ap = ur.c("options.hideSplashTexts.tooltip");
   private final etg<Boolean> aq = etg.a("options.hideSplashTexts", etg.a(ap), false);
   private final etg<Double> ar = new etg<>("options.sensitivity", etg.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, ur.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, ur.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, etg.m.a, 0.5, $$0x -> {
   });
   private final etg<Integer> as;
   private final etg<Integer> at;
   private int au = 0;
   private final etg<Double> av = new etg<>(
      "options.entityDistanceScaling",
      etg.a(),
      eth::a,
      new etg.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final etg<Integer> aw = new etg<>(
      "options.framerateLimit",
      etg.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, ur.c("options.framerateLimit.max")) : a($$0x, ur.a("options.framerate", $$1x)),
      new etg.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> etd.N().aL().a($$0x)
   );
   private final etg<esr> ax = new etg<>(
      "options.renderClouds",
      etg.a(),
      etg.b(),
      new etg.e<>(Arrays.asList(esr.values()), asu.a(esr.d, Codec.BOOL, $$0x -> $$0x ? esr.c : esr.a)),
      esr.c,
      $$0x -> {
         if (etd.L()) {
            emi $$1x = etd.N().f.x();
            if ($$1x != null) {
               $$1x.b(etd.a);
            }
         }
      }
   );
   private static final ur ay = ur.c("options.graphics.fast.tooltip");
   private static final ur az = ur.a("options.graphics.fabulous.tooltip", ur.c("options.graphics.fabulous").a(n.u));
   private static final ur aA = ur.c("options.graphics.fancy.tooltip");
   private final etg<esw> aB = new etg<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> ewk.a(aA);
            case a -> ewk.a(ay);
            case c -> ewk.a(az);
         };
      },
      ($$0x, $$1x) -> {
         vf $$2x = ur.c($$1x.b());
         return $$1x == esw.c ? $$2x.a(n.u) : $$2x;
      },
      new etg.a<>(
         Arrays.asList(esw.values()),
         Stream.of(esw.values()).filter($$0x -> $$0x != esw.c).collect(Collectors.toList()),
         () -> etd.N().q() && etd.N().ag().h(),
         ($$0x, $$1x) -> {
            etd $$2x = etd.N();
            fqo $$3x = $$2x.ag();
            if ($$1x == esw.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(esw::a, esw::a)
      ),
      esw.b,
      $$0x -> {
      }
   );
   private final etg<Boolean> aC = etg.a("options.ao", true, $$0x -> etd.N().f.f());
   private static final ur aD = ur.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final ur aE = ur.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final ur aF = ur.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final etg<etk> aG = new etg<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> ewk.a(aD);
         case b -> ewk.a(aE);
         case c -> ewk.a(aF);
      };
   }, etg.b(), new etg.e<>(Arrays.asList(etk.values()), Codec.INT.xmap(etk::a, etk::a)), etk.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final etg<cds> aH = new etg<>(
      "options.chat.visibility", etg.a(), etg.b(), new etg.e<>(Arrays.asList(cds.values()), Codec.INT.xmap(cds::a, cds::a)), cds.a, $$0x -> {
      }
   );
   private final etg<Double> aI = new etg<>("options.chat.opacity", etg.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), etg.m.a, 1.0, $$0x -> etd.N().l.d().b());
   private final etg<Double> aJ = new etg<>("options.chat.line_spacing", etg.a(), eth::a, etg.m.a, 0.0, $$0x -> {
   });
   private final etg<Double> aK = new etg<>("options.accessibility.text_background_opacity", etg.a(), eth::a, etg.m.a, 0.5, $$0x -> etd.N().l.d().b());
   private final etg<Double> aL = new etg<>("options.accessibility.panorama_speed", etg.a(), eth::a, etg.m.a, 1.0, $$0x -> {
   });
   private static final ur aM = ur.c("options.accessibility.high_contrast.tooltip");
   private final etg<Boolean> aN = etg.a("options.accessibility.high_contrast", etg.a(aM), false, $$0x -> {
      aos $$1x = etd.N().Z();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final etg<Boolean> aO = etg.a("options.accessibility.narrator_hotkey", etg.a(ur.c("options.accessibility.narrator_hotkey.tooltip")), true);
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cdv> aP = EnumSet.allOf(cdv.class);
   private final etg<bla> aQ = new etg<>("options.mainHand", etg.a(), etg.b(), new etg.e<>(Arrays.asList(bla.values()), bla.c), bla.b, $$0x -> this.au());
   public int o;
   public int p;
   private final etg<Double> aR = new etg<>(
      "options.chat.scale",
      etg.a(),
      ($$0x, $$1x) -> (ur)($$1x == 0.0 ? uq.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      etg.m.a,
      1.0,
      $$0x -> etd.N().l.d().b()
   );
   private final etg<Double> aS = new etg<>("options.chat.width", etg.a(), ($$0x, $$1x) -> b($$0x, eva.a($$1x)), etg.m.a, 1.0, $$0x -> etd.N().l.d().b());
   private final etg<Double> aT = new etg<>(
      "options.chat.height.unfocused", etg.a(), ($$0x, $$1x) -> b($$0x, eva.b($$1x)), etg.m.a, eva.h(), $$0x -> etd.N().l.d().b()
   );
   private final etg<Double> aU = new etg<>(
      "options.chat.height.focused", etg.a(), ($$0x, $$1x) -> b($$0x, eva.b($$1x)), etg.m.a, 1.0, $$0x -> etd.N().l.d().b()
   );
   private final etg<Double> aV = new etg<>(
      "options.chat.delay_instant",
      etg.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? ur.c("options.chat.delay_none") : ur.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new etg.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> etd.N().aV().a($$0x)
   );
   private static final ur aW = ur.c("options.notifications.display_time.tooltip");
   private final etg<Double> aX = new etg<>(
      "options.notifications.display_time",
      etg.a(aW),
      ($$0x, $$1x) -> a($$0x, ur.a("options.multiplier", $$1x)),
      new etg.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final etg<Integer> aY = new etg<>(
      "options.mipmapLevels", etg.a(), ($$0x, $$1x) -> (ur)($$1x == 0 ? uq.a($$0x, false) : a($$0x, $$1x.intValue())), new etg.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final etg<esn> aZ = new etg<>(
      "options.attackIndicator", etg.a(), etg.b(), new etg.e<>(Arrays.asList(esn.values()), Codec.INT.xmap(esn::a, esn::a)), esn.b, $$0x -> {
      }
   );
   public ghl r = ghl.a;
   public boolean s = false;
   public boolean t = false;
   private final etg<Integer> ba = new etg<>("options.biomeBlendRadius", etg.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, ur.c("options.biomeBlendRadius." + $$2x));
   }, new etg.f(0, 7), 2, $$0x -> etd.N().f.f());
   private final etg<Double> bb = new etg<>(
      "options.mouseWheelSensitivity",
      etg.a(),
      ($$0x, $$1x) -> a($$0x, ur.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new etg.f(-200, 100).a(eth::c, eth::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final etg<Boolean> bc = etg.a("options.rawMouseInput", true, $$0x -> {
      ena $$1x = etd.N().aL();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final etg<Boolean> bd = etg.a("options.autoJump", false);
   private final etg<Boolean> be = etg.a("options.operatorItemsTab", false);
   private final etg<Boolean> bf = etg.a("options.autoSuggestCommands", true);
   private final etg<Boolean> bg = etg.a("options.chat.color", true);
   private final etg<Boolean> bh = etg.a("options.chat.links", true);
   private final etg<Boolean> bi = etg.a("options.chat.links.prompt", true);
   private final etg<Boolean> bj = etg.a("options.vsync", true, $$0x -> {
      if (etd.N().aL() != null) {
         etd.N().aL().a($$0x);
      }
   });
   private final etg<Boolean> bk = etg.a("options.entityShadows", true);
   private final etg<Boolean> bl = etg.a("options.forceUnicodeFont", false, $$0x -> {
      etd $$1x = etd.N();
      if ($$1x.aL() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final etg<Boolean> bm = etg.a("options.invertMouse", false);
   private final etg<Boolean> bn = etg.a("options.discrete_mouse_scroll", false);
   private final etg<Boolean> bo = etg.a("options.realmsNotifications", true);
   private static final ur bp = ur.c("options.allowServerListing.tooltip");
   private final etg<Boolean> bq = etg.a("options.allowServerListing", etg.a(bp), true, $$0x -> this.au());
   private final etg<Boolean> br = etg.a("options.reducedDebugInfo", false);
   private final Map<aqs, etg<Double>> bs = ac.a(new EnumMap<>(aqs.class), $$0x -> {
      for (aqs $$1x : aqs.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final etg<Boolean> bt = etg.a("options.showSubtitles", false);
   private static final ur bu = ur.c("options.directionalAudio.on.tooltip");
   private static final ur bv = ur.c("options.directionalAudio.off.tooltip");
   private final etg<Boolean> bw = etg.a("options.directionalAudio", $$0x -> $$0x ? ewk.a(bu) : ewk.a(bv), false, $$0x -> {
      ggg $$1x = etd.N().ah();
      $$1x.j();
      $$1x.a(gex.a(aqr.yZ, 1.0F));
   });
   private final etg<Boolean> bx = new etg<>(
      "options.accessibility.text_background",
      etg.a(),
      ($$0x, $$1x) -> $$1x ? ur.c("options.accessibility.text_background.chat") : ur.c("options.accessibility.text_background.everywhere"),
      etg.a,
      true,
      $$0x -> {
      }
   );
   private final etg<Boolean> by = etg.a("options.touchscreen", false);
   private final etg<Boolean> bz = etg.a("options.fullscreen", false, $$0x -> {
      etd $$1x = etd.N();
      if ($$1x.aL() != null && $$1x.aL().j() != $$0x) {
         $$1x.aL().h();
         this.X().a($$1x.aL().j());
      }
   });
   private final etg<Boolean> bA = etg.a("options.viewBobbing", true);
   private static final ur bB = ur.c("options.key.toggle");
   private static final ur bC = ur.c("options.key.hold");
   private final etg<Boolean> bD = new etg<>("key.sneak", etg.a(), ($$0x, $$1x) -> $$1x ? bB : bC, etg.a, false, $$0x -> {
   });
   private final etg<Boolean> bE = new etg<>("key.sprint", etg.a(), ($$0x, $$1x) -> $$1x ? bB : bC, etg.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final ur bF = ur.c("options.hideMatchedNames.tooltip");
   private final etg<Boolean> bG = etg.a("options.hideMatchedNames", etg.a(bF), true);
   private final etg<Boolean> bH = etg.a("options.autosaveIndicator", true);
   private static final ur bI = ur.c("options.onlyShowSecureChat.tooltip");
   private final etg<Boolean> bJ = etg.a("options.onlyShowSecureChat", etg.a(bI), false);
   public final etb x = new etb("key.forward", 87, "key.categories.movement");
   public final etb y = new etb("key.left", 65, "key.categories.movement");
   public final etb z = new etb("key.back", 83, "key.categories.movement");
   public final etb A = new etb("key.right", 68, "key.categories.movement");
   public final etb B = new etb("key.jump", 32, "key.categories.movement");
   public final etb C = new etr("key.sneak", 340, "key.categories.movement", this.bD::c);
   public final etb D = new etr("key.sprint", 341, "key.categories.movement", this.bE::c);
   public final etb E = new etb("key.inventory", 69, "key.categories.inventory");
   public final etb F = new etb("key.swapOffhand", 70, "key.categories.inventory");
   public final etb G = new etb("key.drop", 81, "key.categories.inventory");
   public final etb H = new etb("key.use", emr.b.c, 1, "key.categories.gameplay");
   public final etb I = new etb("key.attack", emr.b.c, 0, "key.categories.gameplay");
   public final etb J = new etb("key.pickItem", emr.b.c, 2, "key.categories.gameplay");
   public final etb K = new etb("key.chat", 84, "key.categories.multiplayer");
   public final etb L = new etb("key.playerlist", 258, "key.categories.multiplayer");
   public final etb M = new etb("key.command", 47, "key.categories.multiplayer");
   public final etb N = new etb("key.socialInteractions", 80, "key.categories.multiplayer");
   public final etb O = new etb("key.screenshot", 291, "key.categories.misc");
   public final etb P = new etb("key.togglePerspective", 294, "key.categories.misc");
   public final etb Q = new etb("key.smoothCamera", emr.bv.b(), "key.categories.misc");
   public final etb R = new etb("key.fullscreen", 300, "key.categories.misc");
   public final etb S = new etb("key.spectatorOutlines", emr.bv.b(), "key.categories.misc");
   public final etb T = new etb("key.advancements", 76, "key.categories.misc");
   public final etb[] U = new etb[]{
      new etb("key.hotbar.1", 49, "key.categories.inventory"),
      new etb("key.hotbar.2", 50, "key.categories.inventory"),
      new etb("key.hotbar.3", 51, "key.categories.inventory"),
      new etb("key.hotbar.4", 52, "key.categories.inventory"),
      new etb("key.hotbar.5", 53, "key.categories.inventory"),
      new etb("key.hotbar.6", 54, "key.categories.inventory"),
      new etb("key.hotbar.7", 55, "key.categories.inventory"),
      new etb("key.hotbar.8", 56, "key.categories.inventory"),
      new etb("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final etb V = new etb("key.saveToolbarActivator", 67, "key.categories.creative");
   public final etb W = new etb("key.loadToolbarActivator", 88, "key.categories.creative");
   public final etb[] X = (etb[])ArrayUtils.addAll(
      new etb[]{
         this.I,
         this.H,
         this.x,
         this.y,
         this.z,
         this.A,
         this.B,
         this.C,
         this.D,
         this.G,
         this.E,
         this.K,
         this.L,
         this.J,
         this.M,
         this.N,
         this.O,
         this.P,
         this.Q,
         this.R,
         this.S,
         this.F,
         this.V,
         this.W,
         this.T
      },
      this.U
   );
   protected etd Y;
   private final File bK;
   public boolean Z;
   private esp bL = esp.a;
   public String aa = "";
   public boolean ab;
   private final etg<Integer> bM = new etg<>("options.fov", etg.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, ur.c("options.fov.min"));
         case 110 -> a($$0x, ur.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new etg.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> etd.N().f.r());
   private static final ur bN = ur.a("options.telemetry.button.tooltip", ur.c("options.telemetry.state.minimal"), ur.c("options.telemetry.state.all"));
   private final etg<Boolean> bO = etg.a("options.telemetry.button", etg.a(bN), ($$0x, $$1x) -> {
      etd $$2x = etd.N();
      if (!$$2x.B()) {
         return ur.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.A() ? ur.c("options.telemetry.state.all") : ur.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final ur bP = ur.c("options.screenEffectScale.tooltip");
   private final etg<Double> bQ = new etg<>(
      "options.screenEffectScale", etg.a(bP), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uq.c) : a($$0x, $$1x.doubleValue()), etg.m.a, 1.0, $$0x -> {
      }
   );
   private static final ur bR = ur.c("options.fovEffectScale.tooltip");
   private final etg<Double> bS = new etg<>(
      "options.fovEffectScale",
      etg.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uq.c) : a($$0x, $$1x.doubleValue()),
      etg.m.a.a(atm::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final ur bT = ur.c("options.darknessEffectScale.tooltip");
   private final etg<Double> bU = new etg<>(
      "options.darknessEffectScale",
      etg.a(bT),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uq.c) : a($$0x, $$1x.doubleValue()),
      etg.m.a.a(atm::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final ur bV = ur.c("options.glintSpeed.tooltip");
   private final etg<Double> bW = new etg<>(
      "options.glintSpeed", etg.a(bV), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uq.c) : a($$0x, $$1x.doubleValue()), etg.m.a, 0.5, $$0x -> {
      }
   );
   private static final ur bX = ur.c("options.glintStrength.tooltip");
   private final etg<Double> bY = new etg<>(
      "options.glintStrength",
      etg.a(bX),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uq.c) : a($$0x, $$1x.doubleValue()),
      etg.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final ur bZ = ur.c("options.damageTiltStrength.tooltip");
   private final etg<Double> ca = new etg<>(
      "options.damageTiltStrength", etg.a(bZ), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uq.c) : a($$0x, $$1x.doubleValue()), etg.m.a, 1.0, $$0x -> {
      }
   );
   private final etg<Double> cb = new etg<>("options.gamma", etg.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, ur.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, ur.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, ur.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, etg.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cc = 2147483646;
   private final etg<Integer> cd = new etg<>(
      "options.guiScale", etg.a(), ($$0x, $$1x) -> $$1x == 0 ? ur.c("options.guiScale.auto") : ur.b(Integer.toString($$1x)), new etg.c(0, () -> {
         etd $$0x = etd.N();
         return !$$0x.q() ? 2147483646 : $$0x.aL().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final etg<eti> ce = new etg<>(
      "options.particles", etg.a(), etg.b(), new etg.e<>(Arrays.asList(eti.values()), Codec.INT.xmap(eti::a, eti::a)), eti.a, $$0x -> {
      }
   );
   private final etg<etf> cf = new etg<>(
      "options.narrator",
      etg.a(),
      ($$0x, $$1x) -> (ur)(this.Y.aU().a() ? $$1x.b() : ur.c("options.narrator.notavailable")),
      new etg.e<>(Arrays.asList(etf.values()), Codec.INT.xmap(etf::a, etf::a)),
      etf.a,
      $$0x -> this.Y.aU().a($$0x)
   );
   public String ad = "en_us";
   private final etg<String> cg = new etg<>(
      "options.audioDevice",
      etg.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return ur.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? ur.b($$1x.substring(ggd.c)) : ur.b($$1x);
         }
      },
      new etg.h<>(
         () -> Stream.concat(Stream.of(""), etd.N().ah().a().stream()).toList(),
         $$0x -> etd.N().q() && $$0x != "" && !etd.N().ah().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         ggg $$1x = etd.N().ah();
         $$1x.j();
         $$1x.a(gex.a(aqr.yZ, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public etg<Boolean> a() {
      return this.am;
   }

   public etg<Boolean> b() {
      return this.ao;
   }

   public etg<Boolean> c() {
      return this.aq;
   }

   public etg<Double> d() {
      return this.ar;
   }

   public etg<Integer> e() {
      return this.as;
   }

   public etg<Integer> f() {
      return this.at;
   }

   public etg<Double> g() {
      return this.av;
   }

   public etg<Integer> h() {
      return this.aw;
   }

   public etg<esr> i() {
      return this.ax;
   }

   public etg<esw> j() {
      return this.aB;
   }

   public etg<Boolean> k() {
      return this.aC;
   }

   public etg<etk> l() {
      return this.aG;
   }

   public void a(aos $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (aop $$2 : $$0.f()) {
         if (!$$2.h()) {
            this.i.add($$2.f());
            if (!$$2.c().a()) {
               this.j.add($$2.f());
            }
         }
      }

      this.as();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.Y.k();
      }
   }

   public etg<cds> m() {
      return this.aH;
   }

   public etg<Double> n() {
      return this.aI;
   }

   public etg<Double> o() {
      return this.aJ;
   }

   public etg<Double> p() {
      return this.aK;
   }

   public etg<Double> q() {
      return this.aL;
   }

   public etg<Boolean> r() {
      return this.aN;
   }

   public etg<Boolean> s() {
      return this.aO;
   }

   public etg<bla> t() {
      return this.aQ;
   }

   public etg<Double> u() {
      return this.aR;
   }

   public etg<Double> v() {
      return this.aS;
   }

   public etg<Double> w() {
      return this.aT;
   }

   public etg<Double> x() {
      return this.aU;
   }

   public etg<Double> y() {
      return this.aV;
   }

   public etg<Double> z() {
      return this.aX;
   }

   public etg<Integer> A() {
      return this.aY;
   }

   public etg<esn> B() {
      return this.aZ;
   }

   public etg<Integer> C() {
      return this.ba;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return atm.a(Math.log10($$0) * 100.0);
   }

   public etg<Double> D() {
      return this.bb;
   }

   public etg<Boolean> E() {
      return this.bc;
   }

   public etg<Boolean> F() {
      return this.bd;
   }

   public etg<Boolean> G() {
      return this.be;
   }

   public etg<Boolean> H() {
      return this.bf;
   }

   public etg<Boolean> I() {
      return this.bg;
   }

   public etg<Boolean> J() {
      return this.bh;
   }

   public etg<Boolean> K() {
      return this.bi;
   }

   public etg<Boolean> L() {
      return this.bj;
   }

   public etg<Boolean> M() {
      return this.bk;
   }

   public etg<Boolean> N() {
      return this.bl;
   }

   public etg<Boolean> O() {
      return this.bm;
   }

   public etg<Boolean> P() {
      return this.bn;
   }

   public etg<Boolean> Q() {
      return this.bo;
   }

   public etg<Boolean> R() {
      return this.bq;
   }

   public etg<Boolean> S() {
      return this.br;
   }

   public final float a(aqs $$0) {
      return this.b($$0).c().floatValue();
   }

   public final etg<Double> b(aqs $$0) {
      return Objects.requireNonNull(this.bs.get($$0));
   }

   private etg<Double> a(String $$0, aqs $$1) {
      return new etg<>(
         $$0, etg.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uq.c) : a($$0x, $$1x.doubleValue()), etg.m.a, 1.0, $$1x -> etd.N().ah().a($$1, $$1x.floatValue())
      );
   }

   public etg<Boolean> T() {
      return this.bt;
   }

   public etg<Boolean> U() {
      return this.bw;
   }

   public etg<Boolean> V() {
      return this.bx;
   }

   public etg<Boolean> W() {
      return this.by;
   }

   public etg<Boolean> X() {
      return this.bz;
   }

   public etg<Boolean> Y() {
      return this.bA;
   }

   public etg<Boolean> Z() {
      return this.bD;
   }

   public etg<Boolean> aa() {
      return this.bE;
   }

   public etg<Boolean> ab() {
      return this.bG;
   }

   public etg<Boolean> ac() {
      return this.bH;
   }

   public etg<Boolean> ad() {
      return this.bJ;
   }

   public etg<Integer> ae() {
      return this.bM;
   }

   public etg<Boolean> af() {
      return this.bO;
   }

   public etg<Double> ag() {
      return this.bQ;
   }

   public etg<Double> ah() {
      return this.bS;
   }

   public etg<Double> ai() {
      return this.bU;
   }

   public etg<Double> aj() {
      return this.bW;
   }

   public etg<Double> ak() {
      return this.bY;
   }

   public etg<Double> al() {
      return this.ca;
   }

   public etg<Double> am() {
      return this.cb;
   }

   public etg<Integer> an() {
      return this.cd;
   }

   public etg<eti> ao() {
      return this.ce;
   }

   public etg<etf> ap() {
      return this.cf;
   }

   public etg<String> aq() {
      return this.cg;
   }

   public eth(etd $$0, File $$1) {
      this.Y = $$0;
      this.bK = new File($$1, "options.txt");
      boolean $$2 = $$0.ae();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.as = new etg<>(
         "options.renderDistance",
         etg.a(),
         ($$0x, $$1x) -> a($$0x, ur.a("options.chunks", $$1x)),
         new etg.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> etd.N().f.r()
      );
      this.at = new etg<>(
         "options.simulationDistance", etg.a(), ($$0x, $$1x) -> a($$0x, ur.a("options.chunks", $$1x)), new etg.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
         }
      );
      this.af = ac.i() == ac.a.c;
      this.ar();
   }

   public float a(float $$0) {
      return this.bx.c() ? $$0 : this.p().c().floatValue();
   }

   public int b(float $$0) {
      return (int)(this.a($$0) * 255.0F) << 24 & 0xFF000000;
   }

   public int a(int $$0) {
      return this.bx.c() ? $$0 : (int)(this.aK.c() * 255.0) << 24 & 0xFF000000;
   }

   public void a(etb $$0, emr.a $$1) {
      $$0.b($$1);
      this.as();
   }

   private void a(eth.a $$0) {
      $$0.a("autoJump", this.bd);
      $$0.a("operatorItemsTab", this.be);
      $$0.a("autoSuggestions", this.bf);
      $$0.a("chatColors", this.bg);
      $$0.a("chatLinks", this.bh);
      $$0.a("chatLinksPrompt", this.bi);
      $$0.a("enableVsync", this.bj);
      $$0.a("entityShadows", this.bk);
      $$0.a("forceUnicodeFont", this.bl);
      $$0.a("discrete_mouse_scroll", this.bn);
      $$0.a("invertYMouse", this.bm);
      $$0.a("realmsNotifications", this.bo);
      $$0.a("reducedDebugInfo", this.br);
      $$0.a("showSubtitles", this.bt);
      $$0.a("directionalAudio", this.bw);
      $$0.a("touchscreen", this.by);
      $$0.a("fullscreen", this.bz);
      $$0.a("bobView", this.bA);
      $$0.a("toggleCrouch", this.bD);
      $$0.a("toggleSprint", this.bE);
      $$0.a("darkMojangStudiosBackground", this.am);
      $$0.a("hideLightningFlashes", this.ao);
      $$0.a("hideSplashTexts", this.aq);
      $$0.a("mouseSensitivity", this.ar);
      $$0.a("fov", this.bM);
      $$0.a("screenEffectScale", this.bQ);
      $$0.a("fovEffectScale", this.bS);
      $$0.a("darknessEffectScale", this.bU);
      $$0.a("glintSpeed", this.bW);
      $$0.a("glintStrength", this.bY);
      $$0.a("damageTiltStrength", this.ca);
      $$0.a("highContrast", this.aN);
      $$0.a("narratorHotkey", this.aO);
      $$0.a("gamma", this.cb);
      $$0.a("renderDistance", this.as);
      $$0.a("simulationDistance", this.at);
      $$0.a("entityDistanceScaling", this.av);
      $$0.a("guiScale", this.cd);
      $$0.a("particles", this.ce);
      $$0.a("maxFps", this.aw);
      $$0.a("graphicsMode", this.aB);
      $$0.a("ao", this.aC);
      $$0.a("prioritizeChunkUpdates", this.aG);
      $$0.a("biomeBlendRadius", this.ba);
      $$0.a("renderClouds", this.ax);
      this.i = $$0.a("resourcePacks", this.i, eth::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, eth::c, ah::toJson);
      this.aa = $$0.a("lastServer", this.aa);
      this.ad = $$0.a("lang", this.ad);
      $$0.a("soundDevice", this.cg);
      $$0.a("chatVisibility", this.aH);
      $$0.a("chatOpacity", this.aI);
      $$0.a("chatLineSpacing", this.aJ);
      $$0.a("textBackgroundOpacity", this.aK);
      $$0.a("backgroundForChatOnly", this.bx);
      this.l = $$0.a("hideServerAddress", this.l);
      this.m = $$0.a("advancedItemTooltips", this.m);
      this.n = $$0.a("pauseOnLostFocus", this.n);
      this.o = $$0.a("overrideWidth", this.o);
      this.p = $$0.a("overrideHeight", this.p);
      $$0.a("chatHeightFocused", this.aU);
      $$0.a("chatDelay", this.aV);
      $$0.a("chatHeightUnfocused", this.aT);
      $$0.a("chatScale", this.aR);
      $$0.a("chatWidth", this.aS);
      $$0.a("notificationDisplayTime", this.aX);
      $$0.a("mipmapLevels", this.aY);
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aQ);
      $$0.a("attackIndicator", this.aZ);
      $$0.a("narrator", this.cf);
      this.r = $$0.a("tutorialStep", this.r, ghl::a, ghl::a);
      $$0.a("mouseWheelSensitivity", this.bb);
      $$0.a("rawMouseInput", this.bc);
      this.u = $$0.a("glDebugVerbosity", this.u);
      this.v = $$0.a("skipMultiplayerWarning", this.v);
      this.w = $$0.a("skipRealms32bitWarning", this.w);
      $$0.a("hideMatchedNames", this.bG);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.t = $$0.a("hideBundleTutorial", this.t);
      this.af = $$0.a("syncChunkWrites", this.af);
      $$0.a("showAutosaveIndicator", this.bH);
      $$0.a("allowServerListing", this.bq);
      $$0.a("onlyShowSecureChat", this.bJ);
      $$0.a("panoramaScrollSpeed", this.aL);
      $$0.a("telemetryOptInExtra", this.bO);
      this.ae = $$0.a("onboardAccessibility", this.ae);

      for (etb $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(emr.a($$3));
         }
      }

      for (aqs $$4 : aqs.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bs.get($$4));
      }

      for (cdv $$5 : cdv.values()) {
         boolean $$6 = this.aP.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.b($$5, $$7);
         }
      }
   }

   public void ar() {
      try {
         if (!this.bK.exists()) {
            return;
         }

         rz $$0 = new rz();

         try (BufferedReader $$1 = Files.newReader(this.bK, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = aj.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  ag.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final rz $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(esw.b);
            } else {
               this.aB.a(esw.a);
            }
         }

         this.a(new eth.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, etg<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> eth.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
                  $$5.result().ifPresent($$1::a);
               }
            }

            @Override
            public int a(String $$0, int $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  try {
                     return Integer.parseInt($$2);
                  } catch (NumberFormatException var5) {
                     eth.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? eth.a($$2) : $$1;
            }

            @Override
            public String a(String $$0, String $$1) {
               return (String)MoreObjects.firstNonNull(this.a($$0), $$1);
            }

            @Override
            public float a(String $$0, float $$1) {
               String $$2 = this.a($$0);
               if ($$2 == null) {
                  return $$1;
               } else if (eth.a($$2)) {
                  return 1.0F;
               } else if (eth.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     eth.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
                     return $$1;
                  }
               }
            }

            @Override
            public <T> T a(String $$0, T $$1, Function<String, T> $$2, Function<T, String> $$3) {
               String $$4 = this.a($$0);
               return $$4 == null ? $$1 : $$2.apply($$4);
            }
         });
         if ($$2.e("fullscreenResolution")) {
            this.k = $$2.l("fullscreenResolution");
         }

         if (this.Y.aL() != null) {
            this.Y.aL().a(this.aw.c());
         }

         etb.d();
      } catch (Exception var7) {
         ag.error("Failed to load options", var7);
      }
   }

   static boolean a(String $$0) {
      return "true".equals($$0);
   }

   static boolean b(String $$0) {
      return "false".equals($$0);
   }

   private rz a(rz $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return aus.e.a(this.Y.aq(), $$0, $$1);
   }

   public void as() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bK), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new eth.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, etg<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> eth.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(eth.ah.toJson($$2x));
               });
            }

            @Override
            public int a(String $$0, int $$1x) {
               this.a($$0);
               $$0.println($$1);
               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1x) {
               this.a($$0);
               $$0.println($$1);
               return $$1;
            }

            @Override
            public String a(String $$0, String $$1x) {
               this.a($$0);
               $$0.println($$1);
               return $$1;
            }

            @Override
            public float a(String $$0, float $$1x) {
               this.a($$0);
               $$0.println($$1);
               return $$1;
            }

            @Override
            public <T> T a(String $$0, T $$1x, Function<String, T> $$2, Function<T, String> $$3) {
               this.a($$0);
               $$0.println($$3.apply($$1));
               return $$1;
            }
         });
         if (this.Y.aL().f().isPresent()) {
            $$0.println("fullscreenResolution:" + this.Y.aL().f().get().g());
         }
      } catch (Exception var6) {
         ag.error("Failed to save options", var6);
      }

      this.au();
   }

   public alt at() {
      int $$0 = 0;

      for (cdv $$1 : this.aP) {
         $$0 |= $$1.a();
      }

      return new alt(this.ad, this.as.c(), this.aH.c(), this.bg.c(), $$0, this.aQ.c(), this.Y.aP(), this.bq.c());
   }

   public void au() {
      if (this.Y.s != null) {
         this.Y.s.cn.b(new wv(this.at()));
      }
   }

   private void b(cdv $$0, boolean $$1) {
      if ($$1) {
         this.aP.add($$0);
      } else {
         this.aP.remove($$0);
      }
   }

   public boolean a(cdv $$0) {
      return this.aP.contains($$0);
   }

   public void a(cdv $$0, boolean $$1) {
      this.b($$0, $$1);
      this.au();
   }

   public esr av() {
      return this.aA() >= 4 ? this.ax.c() : esr.a;
   }

   public boolean aw() {
      return this.q;
   }

   public void b(aos $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         aop $$4 = $$0.c($$3);
         if ($$4 == null && !$$3.startsWith("file/")) {
            $$4 = $$0.c("file/" + $$3);
         }

         if ($$4 == null) {
            ag.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", $$3);
            $$2.remove();
         } else if (!$$4.c().a() && !this.j.contains($$3)) {
            ag.warn("Removed resource pack {} from options because it is no longer compatible", $$3);
            $$2.remove();
         } else if ($$4.c().a() && this.j.contains($$3)) {
            ag.info("Removed resource pack {} from incompatibility list because it's now compatible", $$3);
            this.j.remove($$3);
         } else {
            $$1.add($$4.f());
         }
      }

      $$0.a($$1);
   }

   public esp ax() {
      return this.bL;
   }

   public void a(esp $$0) {
      this.bL = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = atc.a(ah, $$0, ai);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File ay() {
      return this.bK;
   }

   public String az() {
      Stream<Pair<String, Object>> $$0 = Stream.<Pair<String, Object>>builder()
         .add(Pair.of("ao", this.aC.c()))
         .add(Pair.of("biomeBlendRadius", this.ba.c()))
         .add(Pair.of("enableVsync", this.bj.c()))
         .add(Pair.of("entityDistanceScaling", this.av.c()))
         .add(Pair.of("entityShadows", this.bk.c()))
         .add(Pair.of("forceUnicodeFont", this.bl.c()))
         .add(Pair.of("fov", this.bM.c()))
         .add(Pair.of("fovEffectScale", this.bS.c()))
         .add(Pair.of("darknessEffectScale", this.bU.c()))
         .add(Pair.of("glintSpeed", this.bW.c()))
         .add(Pair.of("glintStrength", this.bY.c()))
         .add(Pair.of("prioritizeChunkUpdates", this.aG.c()))
         .add(Pair.of("fullscreen", this.bz.c()))
         .add(Pair.of("fullscreenResolution", String.valueOf(this.k)))
         .add(Pair.of("gamma", this.cb.c()))
         .add(Pair.of("glDebugVerbosity", this.u))
         .add(Pair.of("graphicsMode", this.aB.c()))
         .add(Pair.of("guiScale", this.cd.c()))
         .add(Pair.of("maxFps", this.aw.c()))
         .add(Pair.of("mipmapLevels", this.aY.c()))
         .add(Pair.of("narrator", this.cf.c()))
         .add(Pair.of("overrideHeight", this.p))
         .add(Pair.of("overrideWidth", this.o))
         .add(Pair.of("particles", this.ce.c()))
         .add(Pair.of("reducedDebugInfo", this.br.c()))
         .add(Pair.of("renderClouds", this.ax.c()))
         .add(Pair.of("renderDistance", this.as.c()))
         .add(Pair.of("simulationDistance", this.at.c()))
         .add(Pair.of("resourcePacks", this.i))
         .add(Pair.of("screenEffectScale", this.bQ.c()))
         .add(Pair.of("syncChunkWrites", this.af))
         .add(Pair.of("useNativeTransport", this.q))
         .add(Pair.of("soundDevice", this.cg.c()))
         .build();
      return $$0.<CharSequence>map($$0x -> (String)$$0x.getFirst() + ": " + $$0x.getSecond()).collect(Collectors.joining(System.lineSeparator()));
   }

   public void b(int $$0) {
      this.au = $$0;
   }

   public int aA() {
      return this.au > 0 ? Math.min(this.as.c(), this.au) : this.as.c();
   }

   private static ur b(ur $$0, int $$1) {
      return ur.a("options.pixel_value", $$0, $$1);
   }

   private static ur a(ur $$0, double $$1) {
      return ur.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static ur a(ur $$0, ur $$1) {
      return ur.a("options.generic_value", $$0, $$1);
   }

   public static ur a(ur $$0, int $$1) {
      return a($$0, ur.b(Integer.toString($$1)));
   }

   interface a {
      <T> void a(String var1, etg<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
