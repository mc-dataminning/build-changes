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

public class etm {
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
   private static final uv al = uv.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final etl<Boolean> am = etl.a("options.darkMojangStudiosBackgroundColor", etl.a(al), false);
   private static final uv an = uv.c("options.hideLightningFlashes.tooltip");
   private final etl<Boolean> ao = etl.a("options.hideLightningFlashes", etl.a(an), false);
   private static final uv ap = uv.c("options.hideSplashTexts.tooltip");
   private final etl<Boolean> aq = etl.a("options.hideSplashTexts", etl.a(ap), false);
   private final etl<Double> ar = new etl<>("options.sensitivity", etl.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, uv.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, uv.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, etl.m.a, 0.5, $$0x -> {
   });
   private final etl<Integer> as;
   private final etl<Integer> at;
   private int au = 0;
   private final etl<Double> av = new etl<>(
      "options.entityDistanceScaling",
      etl.a(),
      etm::a,
      new etl.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final etl<Integer> aw = new etl<>(
      "options.framerateLimit",
      etl.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, uv.c("options.framerateLimit.max")) : a($$0x, uv.a("options.framerate", $$1x)),
      new etl.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> eti.N().aL().a($$0x)
   );
   private final etl<esw> ax = new etl<>(
      "options.renderClouds",
      etl.a(),
      etl.b(),
      new etl.e<>(Arrays.asList(esw.values()), asy.a(esw.d, Codec.BOOL, $$0x -> $$0x ? esw.c : esw.a)),
      esw.c,
      $$0x -> {
         if (eti.L()) {
            emn $$1x = eti.N().f.x();
            if ($$1x != null) {
               $$1x.b(eti.a);
            }
         }
      }
   );
   private static final uv ay = uv.c("options.graphics.fast.tooltip");
   private static final uv az = uv.a("options.graphics.fabulous.tooltip", uv.c("options.graphics.fabulous").a(n.u));
   private static final uv aA = uv.c("options.graphics.fancy.tooltip");
   private final etl<etb> aB = new etl<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> ewp.a(aA);
            case a -> ewp.a(ay);
            case c -> ewp.a(az);
         };
      },
      ($$0x, $$1x) -> {
         vj $$2x = uv.c($$1x.b());
         return $$1x == etb.c ? $$2x.a(n.u) : $$2x;
      },
      new etl.a<>(
         Arrays.asList(etb.values()),
         Stream.of(etb.values()).filter($$0x -> $$0x != etb.c).collect(Collectors.toList()),
         () -> eti.N().q() && eti.N().ag().h(),
         ($$0x, $$1x) -> {
            eti $$2x = eti.N();
            fqt $$3x = $$2x.ag();
            if ($$1x == etb.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(etb::a, etb::a)
      ),
      etb.b,
      $$0x -> {
      }
   );
   private final etl<Boolean> aC = etl.a("options.ao", true, $$0x -> eti.N().f.f());
   private static final uv aD = uv.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final uv aE = uv.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final uv aF = uv.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final etl<etp> aG = new etl<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> ewp.a(aD);
         case b -> ewp.a(aE);
         case c -> ewp.a(aF);
      };
   }, etl.b(), new etl.e<>(Arrays.asList(etp.values()), Codec.INT.xmap(etp::a, etp::a)), etp.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final etl<cdx> aH = new etl<>(
      "options.chat.visibility", etl.a(), etl.b(), new etl.e<>(Arrays.asList(cdx.values()), Codec.INT.xmap(cdx::a, cdx::a)), cdx.a, $$0x -> {
      }
   );
   private final etl<Double> aI = new etl<>("options.chat.opacity", etl.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), etl.m.a, 1.0, $$0x -> eti.N().l.d().b());
   private final etl<Double> aJ = new etl<>("options.chat.line_spacing", etl.a(), etm::a, etl.m.a, 0.0, $$0x -> {
   });
   private final etl<Double> aK = new etl<>("options.accessibility.text_background_opacity", etl.a(), etm::a, etl.m.a, 0.5, $$0x -> eti.N().l.d().b());
   private final etl<Double> aL = new etl<>("options.accessibility.panorama_speed", etl.a(), etm::a, etl.m.a, 1.0, $$0x -> {
   });
   private static final uv aM = uv.c("options.accessibility.high_contrast.tooltip");
   private final etl<Boolean> aN = etl.a("options.accessibility.high_contrast", etl.a(aM), false, $$0x -> {
      aow $$1x = eti.N().Z();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final etl<Boolean> aO = etl.a("options.accessibility.narrator_hotkey", etl.a(uv.c("options.accessibility.narrator_hotkey.tooltip")), true);
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cea> aP = EnumSet.allOf(cea.class);
   private final etl<blf> aQ = new etl<>("options.mainHand", etl.a(), etl.b(), new etl.e<>(Arrays.asList(blf.values()), blf.c), blf.b, $$0x -> this.au());
   public int o;
   public int p;
   private final etl<Double> aR = new etl<>(
      "options.chat.scale",
      etl.a(),
      ($$0x, $$1x) -> (uv)($$1x == 0.0 ? uu.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      etl.m.a,
      1.0,
      $$0x -> eti.N().l.d().b()
   );
   private final etl<Double> aS = new etl<>("options.chat.width", etl.a(), ($$0x, $$1x) -> b($$0x, evf.a($$1x)), etl.m.a, 1.0, $$0x -> eti.N().l.d().b());
   private final etl<Double> aT = new etl<>(
      "options.chat.height.unfocused", etl.a(), ($$0x, $$1x) -> b($$0x, evf.b($$1x)), etl.m.a, evf.h(), $$0x -> eti.N().l.d().b()
   );
   private final etl<Double> aU = new etl<>(
      "options.chat.height.focused", etl.a(), ($$0x, $$1x) -> b($$0x, evf.b($$1x)), etl.m.a, 1.0, $$0x -> eti.N().l.d().b()
   );
   private final etl<Double> aV = new etl<>(
      "options.chat.delay_instant",
      etl.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? uv.c("options.chat.delay_none") : uv.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new etl.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> eti.N().aV().a($$0x)
   );
   private static final uv aW = uv.c("options.notifications.display_time.tooltip");
   private final etl<Double> aX = new etl<>(
      "options.notifications.display_time",
      etl.a(aW),
      ($$0x, $$1x) -> a($$0x, uv.a("options.multiplier", $$1x)),
      new etl.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final etl<Integer> aY = new etl<>(
      "options.mipmapLevels", etl.a(), ($$0x, $$1x) -> (uv)($$1x == 0 ? uu.a($$0x, false) : a($$0x, $$1x.intValue())), new etl.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final etl<ess> aZ = new etl<>(
      "options.attackIndicator", etl.a(), etl.b(), new etl.e<>(Arrays.asList(ess.values()), Codec.INT.xmap(ess::a, ess::a)), ess.b, $$0x -> {
      }
   );
   public ghq r = ghq.a;
   public boolean s = false;
   public boolean t = false;
   private final etl<Integer> ba = new etl<>("options.biomeBlendRadius", etl.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, uv.c("options.biomeBlendRadius." + $$2x));
   }, new etl.f(0, 7), 2, $$0x -> eti.N().f.f());
   private final etl<Double> bb = new etl<>(
      "options.mouseWheelSensitivity",
      etl.a(),
      ($$0x, $$1x) -> a($$0x, uv.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new etl.f(-200, 100).a(etm::c, etm::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final etl<Boolean> bc = etl.a("options.rawMouseInput", true, $$0x -> {
      enf $$1x = eti.N().aL();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final etl<Boolean> bd = etl.a("options.autoJump", false);
   private final etl<Boolean> be = etl.a("options.operatorItemsTab", false);
   private final etl<Boolean> bf = etl.a("options.autoSuggestCommands", true);
   private final etl<Boolean> bg = etl.a("options.chat.color", true);
   private final etl<Boolean> bh = etl.a("options.chat.links", true);
   private final etl<Boolean> bi = etl.a("options.chat.links.prompt", true);
   private final etl<Boolean> bj = etl.a("options.vsync", true, $$0x -> {
      if (eti.N().aL() != null) {
         eti.N().aL().a($$0x);
      }
   });
   private final etl<Boolean> bk = etl.a("options.entityShadows", true);
   private final etl<Boolean> bl = etl.a("options.forceUnicodeFont", false, $$0x -> {
      eti $$1x = eti.N();
      if ($$1x.aL() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final etl<Boolean> bm = etl.a("options.invertMouse", false);
   private final etl<Boolean> bn = etl.a("options.discrete_mouse_scroll", false);
   private final etl<Boolean> bo = etl.a("options.realmsNotifications", true);
   private static final uv bp = uv.c("options.allowServerListing.tooltip");
   private final etl<Boolean> bq = etl.a("options.allowServerListing", etl.a(bp), true, $$0x -> this.au());
   private final etl<Boolean> br = etl.a("options.reducedDebugInfo", false);
   private final Map<aqw, etl<Double>> bs = ac.a(new EnumMap<>(aqw.class), $$0x -> {
      for (aqw $$1x : aqw.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final etl<Boolean> bt = etl.a("options.showSubtitles", false);
   private static final uv bu = uv.c("options.directionalAudio.on.tooltip");
   private static final uv bv = uv.c("options.directionalAudio.off.tooltip");
   private final etl<Boolean> bw = etl.a("options.directionalAudio", $$0x -> $$0x ? ewp.a(bu) : ewp.a(bv), false, $$0x -> {
      ggl $$1x = eti.N().ah();
      $$1x.j();
      $$1x.a(gfc.a(aqv.yZ, 1.0F));
   });
   private final etl<Boolean> bx = new etl<>(
      "options.accessibility.text_background",
      etl.a(),
      ($$0x, $$1x) -> $$1x ? uv.c("options.accessibility.text_background.chat") : uv.c("options.accessibility.text_background.everywhere"),
      etl.a,
      true,
      $$0x -> {
      }
   );
   private final etl<Boolean> by = etl.a("options.touchscreen", false);
   private final etl<Boolean> bz = etl.a("options.fullscreen", false, $$0x -> {
      eti $$1x = eti.N();
      if ($$1x.aL() != null && $$1x.aL().j() != $$0x) {
         $$1x.aL().h();
         this.X().a($$1x.aL().j());
      }
   });
   private final etl<Boolean> bA = etl.a("options.viewBobbing", true);
   private static final uv bB = uv.c("options.key.toggle");
   private static final uv bC = uv.c("options.key.hold");
   private final etl<Boolean> bD = new etl<>("key.sneak", etl.a(), ($$0x, $$1x) -> $$1x ? bB : bC, etl.a, false, $$0x -> {
   });
   private final etl<Boolean> bE = new etl<>("key.sprint", etl.a(), ($$0x, $$1x) -> $$1x ? bB : bC, etl.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final uv bF = uv.c("options.hideMatchedNames.tooltip");
   private final etl<Boolean> bG = etl.a("options.hideMatchedNames", etl.a(bF), true);
   private final etl<Boolean> bH = etl.a("options.autosaveIndicator", true);
   private static final uv bI = uv.c("options.onlyShowSecureChat.tooltip");
   private final etl<Boolean> bJ = etl.a("options.onlyShowSecureChat", etl.a(bI), false);
   public final etg x = new etg("key.forward", 87, "key.categories.movement");
   public final etg y = new etg("key.left", 65, "key.categories.movement");
   public final etg z = new etg("key.back", 83, "key.categories.movement");
   public final etg A = new etg("key.right", 68, "key.categories.movement");
   public final etg B = new etg("key.jump", 32, "key.categories.movement");
   public final etg C = new etw("key.sneak", 340, "key.categories.movement", this.bD::c);
   public final etg D = new etw("key.sprint", 341, "key.categories.movement", this.bE::c);
   public final etg E = new etg("key.inventory", 69, "key.categories.inventory");
   public final etg F = new etg("key.swapOffhand", 70, "key.categories.inventory");
   public final etg G = new etg("key.drop", 81, "key.categories.inventory");
   public final etg H = new etg("key.use", emw.b.c, 1, "key.categories.gameplay");
   public final etg I = new etg("key.attack", emw.b.c, 0, "key.categories.gameplay");
   public final etg J = new etg("key.pickItem", emw.b.c, 2, "key.categories.gameplay");
   public final etg K = new etg("key.chat", 84, "key.categories.multiplayer");
   public final etg L = new etg("key.playerlist", 258, "key.categories.multiplayer");
   public final etg M = new etg("key.command", 47, "key.categories.multiplayer");
   public final etg N = new etg("key.socialInteractions", 80, "key.categories.multiplayer");
   public final etg O = new etg("key.screenshot", 291, "key.categories.misc");
   public final etg P = new etg("key.togglePerspective", 294, "key.categories.misc");
   public final etg Q = new etg("key.smoothCamera", emw.bv.b(), "key.categories.misc");
   public final etg R = new etg("key.fullscreen", 300, "key.categories.misc");
   public final etg S = new etg("key.spectatorOutlines", emw.bv.b(), "key.categories.misc");
   public final etg T = new etg("key.advancements", 76, "key.categories.misc");
   public final etg[] U = new etg[]{
      new etg("key.hotbar.1", 49, "key.categories.inventory"),
      new etg("key.hotbar.2", 50, "key.categories.inventory"),
      new etg("key.hotbar.3", 51, "key.categories.inventory"),
      new etg("key.hotbar.4", 52, "key.categories.inventory"),
      new etg("key.hotbar.5", 53, "key.categories.inventory"),
      new etg("key.hotbar.6", 54, "key.categories.inventory"),
      new etg("key.hotbar.7", 55, "key.categories.inventory"),
      new etg("key.hotbar.8", 56, "key.categories.inventory"),
      new etg("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final etg V = new etg("key.saveToolbarActivator", 67, "key.categories.creative");
   public final etg W = new etg("key.loadToolbarActivator", 88, "key.categories.creative");
   public final etg[] X = (etg[])ArrayUtils.addAll(
      new etg[]{
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
   protected eti Y;
   private final File bK;
   public boolean Z;
   private esu bL = esu.a;
   public String aa = "";
   public boolean ab;
   private final etl<Integer> bM = new etl<>("options.fov", etl.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, uv.c("options.fov.min"));
         case 110 -> a($$0x, uv.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new etl.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> eti.N().f.r());
   private static final uv bN = uv.a("options.telemetry.button.tooltip", uv.c("options.telemetry.state.minimal"), uv.c("options.telemetry.state.all"));
   private final etl<Boolean> bO = etl.a("options.telemetry.button", etl.a(bN), ($$0x, $$1x) -> {
      eti $$2x = eti.N();
      if (!$$2x.B()) {
         return uv.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.A() ? uv.c("options.telemetry.state.all") : uv.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final uv bP = uv.c("options.screenEffectScale.tooltip");
   private final etl<Double> bQ = new etl<>(
      "options.screenEffectScale", etl.a(bP), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uu.c) : a($$0x, $$1x.doubleValue()), etl.m.a, 1.0, $$0x -> {
      }
   );
   private static final uv bR = uv.c("options.fovEffectScale.tooltip");
   private final etl<Double> bS = new etl<>(
      "options.fovEffectScale",
      etl.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uu.c) : a($$0x, $$1x.doubleValue()),
      etl.m.a.a(atq::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final uv bT = uv.c("options.darknessEffectScale.tooltip");
   private final etl<Double> bU = new etl<>(
      "options.darknessEffectScale",
      etl.a(bT),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uu.c) : a($$0x, $$1x.doubleValue()),
      etl.m.a.a(atq::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final uv bV = uv.c("options.glintSpeed.tooltip");
   private final etl<Double> bW = new etl<>(
      "options.glintSpeed", etl.a(bV), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uu.c) : a($$0x, $$1x.doubleValue()), etl.m.a, 0.5, $$0x -> {
      }
   );
   private static final uv bX = uv.c("options.glintStrength.tooltip");
   private final etl<Double> bY = new etl<>(
      "options.glintStrength",
      etl.a(bX),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uu.c) : a($$0x, $$1x.doubleValue()),
      etl.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final uv bZ = uv.c("options.damageTiltStrength.tooltip");
   private final etl<Double> ca = new etl<>(
      "options.damageTiltStrength", etl.a(bZ), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uu.c) : a($$0x, $$1x.doubleValue()), etl.m.a, 1.0, $$0x -> {
      }
   );
   private final etl<Double> cb = new etl<>("options.gamma", etl.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, uv.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, uv.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, uv.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, etl.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cc = 2147483646;
   private final etl<Integer> cd = new etl<>(
      "options.guiScale", etl.a(), ($$0x, $$1x) -> $$1x == 0 ? uv.c("options.guiScale.auto") : uv.b(Integer.toString($$1x)), new etl.c(0, () -> {
         eti $$0x = eti.N();
         return !$$0x.q() ? 2147483646 : $$0x.aL().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final etl<etn> ce = new etl<>(
      "options.particles", etl.a(), etl.b(), new etl.e<>(Arrays.asList(etn.values()), Codec.INT.xmap(etn::a, etn::a)), etn.a, $$0x -> {
      }
   );
   private final etl<etk> cf = new etl<>(
      "options.narrator",
      etl.a(),
      ($$0x, $$1x) -> (uv)(this.Y.aU().a() ? $$1x.b() : uv.c("options.narrator.notavailable")),
      new etl.e<>(Arrays.asList(etk.values()), Codec.INT.xmap(etk::a, etk::a)),
      etk.a,
      $$0x -> this.Y.aU().a($$0x)
   );
   public String ad = "en_us";
   private final etl<String> cg = new etl<>(
      "options.audioDevice",
      etl.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return uv.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? uv.b($$1x.substring(ggi.c)) : uv.b($$1x);
         }
      },
      new etl.h<>(
         () -> Stream.concat(Stream.of(""), eti.N().ah().a().stream()).toList(),
         $$0x -> eti.N().q() && $$0x != "" && !eti.N().ah().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         ggl $$1x = eti.N().ah();
         $$1x.j();
         $$1x.a(gfc.a(aqv.yZ, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public etl<Boolean> a() {
      return this.am;
   }

   public etl<Boolean> b() {
      return this.ao;
   }

   public etl<Boolean> c() {
      return this.aq;
   }

   public etl<Double> d() {
      return this.ar;
   }

   public etl<Integer> e() {
      return this.as;
   }

   public etl<Integer> f() {
      return this.at;
   }

   public etl<Double> g() {
      return this.av;
   }

   public etl<Integer> h() {
      return this.aw;
   }

   public etl<esw> i() {
      return this.ax;
   }

   public etl<etb> j() {
      return this.aB;
   }

   public etl<Boolean> k() {
      return this.aC;
   }

   public etl<etp> l() {
      return this.aG;
   }

   public void a(aow $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (aot $$2 : $$0.f()) {
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

   public etl<cdx> m() {
      return this.aH;
   }

   public etl<Double> n() {
      return this.aI;
   }

   public etl<Double> o() {
      return this.aJ;
   }

   public etl<Double> p() {
      return this.aK;
   }

   public etl<Double> q() {
      return this.aL;
   }

   public etl<Boolean> r() {
      return this.aN;
   }

   public etl<Boolean> s() {
      return this.aO;
   }

   public etl<blf> t() {
      return this.aQ;
   }

   public etl<Double> u() {
      return this.aR;
   }

   public etl<Double> v() {
      return this.aS;
   }

   public etl<Double> w() {
      return this.aT;
   }

   public etl<Double> x() {
      return this.aU;
   }

   public etl<Double> y() {
      return this.aV;
   }

   public etl<Double> z() {
      return this.aX;
   }

   public etl<Integer> A() {
      return this.aY;
   }

   public etl<ess> B() {
      return this.aZ;
   }

   public etl<Integer> C() {
      return this.ba;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return atq.a(Math.log10($$0) * 100.0);
   }

   public etl<Double> D() {
      return this.bb;
   }

   public etl<Boolean> E() {
      return this.bc;
   }

   public etl<Boolean> F() {
      return this.bd;
   }

   public etl<Boolean> G() {
      return this.be;
   }

   public etl<Boolean> H() {
      return this.bf;
   }

   public etl<Boolean> I() {
      return this.bg;
   }

   public etl<Boolean> J() {
      return this.bh;
   }

   public etl<Boolean> K() {
      return this.bi;
   }

   public etl<Boolean> L() {
      return this.bj;
   }

   public etl<Boolean> M() {
      return this.bk;
   }

   public etl<Boolean> N() {
      return this.bl;
   }

   public etl<Boolean> O() {
      return this.bm;
   }

   public etl<Boolean> P() {
      return this.bn;
   }

   public etl<Boolean> Q() {
      return this.bo;
   }

   public etl<Boolean> R() {
      return this.bq;
   }

   public etl<Boolean> S() {
      return this.br;
   }

   public final float a(aqw $$0) {
      return this.b($$0).c().floatValue();
   }

   public final etl<Double> b(aqw $$0) {
      return Objects.requireNonNull(this.bs.get($$0));
   }

   private etl<Double> a(String $$0, aqw $$1) {
      return new etl<>(
         $$0, etl.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uu.c) : a($$0x, $$1x.doubleValue()), etl.m.a, 1.0, $$1x -> eti.N().ah().a($$1, $$1x.floatValue())
      );
   }

   public etl<Boolean> T() {
      return this.bt;
   }

   public etl<Boolean> U() {
      return this.bw;
   }

   public etl<Boolean> V() {
      return this.bx;
   }

   public etl<Boolean> W() {
      return this.by;
   }

   public etl<Boolean> X() {
      return this.bz;
   }

   public etl<Boolean> Y() {
      return this.bA;
   }

   public etl<Boolean> Z() {
      return this.bD;
   }

   public etl<Boolean> aa() {
      return this.bE;
   }

   public etl<Boolean> ab() {
      return this.bG;
   }

   public etl<Boolean> ac() {
      return this.bH;
   }

   public etl<Boolean> ad() {
      return this.bJ;
   }

   public etl<Integer> ae() {
      return this.bM;
   }

   public etl<Boolean> af() {
      return this.bO;
   }

   public etl<Double> ag() {
      return this.bQ;
   }

   public etl<Double> ah() {
      return this.bS;
   }

   public etl<Double> ai() {
      return this.bU;
   }

   public etl<Double> aj() {
      return this.bW;
   }

   public etl<Double> ak() {
      return this.bY;
   }

   public etl<Double> al() {
      return this.ca;
   }

   public etl<Double> am() {
      return this.cb;
   }

   public etl<Integer> an() {
      return this.cd;
   }

   public etl<etn> ao() {
      return this.ce;
   }

   public etl<etk> ap() {
      return this.cf;
   }

   public etl<String> aq() {
      return this.cg;
   }

   public etm(eti $$0, File $$1) {
      this.Y = $$0;
      this.bK = new File($$1, "options.txt");
      boolean $$2 = $$0.ae();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.as = new etl<>(
         "options.renderDistance",
         etl.a(),
         ($$0x, $$1x) -> a($$0x, uv.a("options.chunks", $$1x)),
         new etl.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> eti.N().f.r()
      );
      this.at = new etl<>(
         "options.simulationDistance", etl.a(), ($$0x, $$1x) -> a($$0x, uv.a("options.chunks", $$1x)), new etl.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
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

   public void a(etg $$0, emw.a $$1) {
      $$0.b($$1);
      this.as();
   }

   private void a(etm.a $$0) {
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
      this.i = $$0.a("resourcePacks", this.i, etm::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, etm::c, ah::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, ghq::a, ghq::a);
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

      for (etg $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(emw.a($$3));
         }
      }

      for (aqw $$4 : aqw.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bs.get($$4));
      }

      for (cea $$5 : cea.values()) {
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

         sd $$0 = new sd();

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

         final sd $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(etb.b);
            } else {
               this.aB.a(etb.a);
            }
         }

         this.a(new etm.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, etl<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> etm.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     etm.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? etm.a($$2) : $$1;
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
               } else if (etm.a($$2)) {
                  return 1.0F;
               } else if (etm.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     etm.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         etg.d();
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

   private sd a(sd $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return auw.e.a(this.Y.aq(), $$0, $$1);
   }

   public void as() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bK), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new etm.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, etl<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> etm.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(etm.ah.toJson($$2x));
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

   public alx at() {
      int $$0 = 0;

      for (cea $$1 : this.aP) {
         $$0 |= $$1.a();
      }

      return new alx(this.ad, this.as.c(), this.aH.c(), this.bg.c(), $$0, this.aQ.c(), this.Y.aP(), this.bq.c());
   }

   public void au() {
      if (this.Y.s != null) {
         this.Y.s.cn.b(new wz(this.at()));
      }
   }

   private void b(cea $$0, boolean $$1) {
      if ($$1) {
         this.aP.add($$0);
      } else {
         this.aP.remove($$0);
      }
   }

   public boolean a(cea $$0) {
      return this.aP.contains($$0);
   }

   public void a(cea $$0, boolean $$1) {
      this.b($$0, $$1);
      this.au();
   }

   public esw av() {
      return this.aA() >= 4 ? this.ax.c() : esw.a;
   }

   public boolean aw() {
      return this.q;
   }

   public void b(aow $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         aot $$4 = $$0.c($$3);
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

   public esu ax() {
      return this.bL;
   }

   public void a(esu $$0) {
      this.bL = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = atg.a(ah, $$0, ai);
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

   private static uv b(uv $$0, int $$1) {
      return uv.a("options.pixel_value", $$0, $$1);
   }

   private static uv a(uv $$0, double $$1) {
      return uv.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static uv a(uv $$0, uv $$1) {
      return uv.a("options.generic_value", $$0, $$1);
   }

   public static uv a(uv $$0, int $$1) {
      return a($$0, uv.b(Integer.toString($$1)));
   }

   interface a {
      <T> void a(String var1, etl<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
