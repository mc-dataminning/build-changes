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

public class esv {
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
   private final esu<Boolean> am = esu.a("options.darkMojangStudiosBackgroundColor", esu.a(al), false);
   private static final ur an = ur.c("options.hideLightningFlashes.tooltip");
   private final esu<Boolean> ao = esu.a("options.hideLightningFlashes", esu.a(an), false);
   private static final ur ap = ur.c("options.hideSplashTexts.tooltip");
   private final esu<Boolean> aq = esu.a("options.hideSplashTexts", esu.a(ap), false);
   private final esu<Double> ar = new esu<>("options.sensitivity", esu.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, ur.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, ur.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, esu.m.a, 0.5, $$0x -> {
   });
   private final esu<Integer> as;
   private final esu<Integer> at;
   private int au = 0;
   private final esu<Double> av = new esu<>(
      "options.entityDistanceScaling",
      esu.a(),
      esv::a,
      new esu.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final esu<Integer> aw = new esu<>(
      "options.framerateLimit",
      esu.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, ur.c("options.framerateLimit.max")) : a($$0x, ur.a("options.framerate", $$1x)),
      new esu.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> esr.N().aL().a($$0x)
   );
   private final esu<esf> ax = new esu<>(
      "options.renderClouds",
      esu.a(),
      esu.b(),
      new esu.e<>(Arrays.asList(esf.values()), asq.a(esf.d, Codec.BOOL, $$0x -> $$0x ? esf.c : esf.a)),
      esf.c,
      $$0x -> {
         if (esr.L()) {
            elw $$1x = esr.N().f.x();
            if ($$1x != null) {
               $$1x.b(esr.a);
            }
         }
      }
   );
   private static final ur ay = ur.c("options.graphics.fast.tooltip");
   private static final ur az = ur.a("options.graphics.fabulous.tooltip", ur.c("options.graphics.fabulous").a(n.u));
   private static final ur aA = ur.c("options.graphics.fancy.tooltip");
   private final esu<esk> aB = new esu<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> evx.a(aA);
            case a -> evx.a(ay);
            case c -> evx.a(az);
         };
      },
      ($$0x, $$1x) -> {
         vf $$2x = ur.c($$1x.b());
         return $$1x == esk.c ? $$2x.a(n.u) : $$2x;
      },
      new esu.a<>(
         Arrays.asList(esk.values()),
         Stream.of(esk.values()).filter($$0x -> $$0x != esk.c).collect(Collectors.toList()),
         () -> esr.N().q() && esr.N().ag().h(),
         ($$0x, $$1x) -> {
            esr $$2x = esr.N();
            fqb $$3x = $$2x.ag();
            if ($$1x == esk.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(esk::a, esk::a)
      ),
      esk.b,
      $$0x -> {
      }
   );
   private final esu<Boolean> aC = esu.a("options.ao", true, $$0x -> esr.N().f.f());
   private static final ur aD = ur.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final ur aE = ur.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final ur aF = ur.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final esu<esy> aG = new esu<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> evx.a(aD);
         case b -> evx.a(aE);
         case c -> evx.a(aF);
      };
   }, esu.b(), new esu.e<>(Arrays.asList(esy.values()), Codec.INT.xmap(esy::a, esy::a)), esy.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final esu<cdk> aH = new esu<>(
      "options.chat.visibility", esu.a(), esu.b(), new esu.e<>(Arrays.asList(cdk.values()), Codec.INT.xmap(cdk::a, cdk::a)), cdk.a, $$0x -> {
      }
   );
   private final esu<Double> aI = new esu<>("options.chat.opacity", esu.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), esu.m.a, 1.0, $$0x -> esr.N().l.d().b());
   private final esu<Double> aJ = new esu<>("options.chat.line_spacing", esu.a(), esv::a, esu.m.a, 0.0, $$0x -> {
   });
   private final esu<Double> aK = new esu<>("options.accessibility.text_background_opacity", esu.a(), esv::a, esu.m.a, 0.5, $$0x -> esr.N().l.d().b());
   private final esu<Double> aL = new esu<>("options.accessibility.panorama_speed", esu.a(), esv::a, esu.m.a, 1.0, $$0x -> {
   });
   private static final ur aM = ur.c("options.accessibility.high_contrast.tooltip");
   private final esu<Boolean> aN = esu.a("options.accessibility.high_contrast", esu.a(aM), false, $$0x -> {
      aoo $$1x = esr.N().Z();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final esu<Boolean> aO = esu.a("options.accessibility.narrator_hotkey", esu.a(ur.c("options.accessibility.narrator_hotkey.tooltip")), true);
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cdn> aP = EnumSet.allOf(cdn.class);
   private final esu<bks> aQ = new esu<>("options.mainHand", esu.a(), esu.b(), new esu.e<>(Arrays.asList(bks.values()), bks.c), bks.b, $$0x -> this.au());
   public int o;
   public int p;
   private final esu<Double> aR = new esu<>(
      "options.chat.scale",
      esu.a(),
      ($$0x, $$1x) -> (ur)($$1x == 0.0 ? uq.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      esu.m.a,
      1.0,
      $$0x -> esr.N().l.d().b()
   );
   private final esu<Double> aS = new esu<>("options.chat.width", esu.a(), ($$0x, $$1x) -> b($$0x, eun.a($$1x)), esu.m.a, 1.0, $$0x -> esr.N().l.d().b());
   private final esu<Double> aT = new esu<>(
      "options.chat.height.unfocused", esu.a(), ($$0x, $$1x) -> b($$0x, eun.b($$1x)), esu.m.a, eun.h(), $$0x -> esr.N().l.d().b()
   );
   private final esu<Double> aU = new esu<>(
      "options.chat.height.focused", esu.a(), ($$0x, $$1x) -> b($$0x, eun.b($$1x)), esu.m.a, 1.0, $$0x -> esr.N().l.d().b()
   );
   private final esu<Double> aV = new esu<>(
      "options.chat.delay_instant",
      esu.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? ur.c("options.chat.delay_none") : ur.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new esu.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> esr.N().aV().a($$0x)
   );
   private static final ur aW = ur.c("options.notifications.display_time.tooltip");
   private final esu<Double> aX = new esu<>(
      "options.notifications.display_time",
      esu.a(aW),
      ($$0x, $$1x) -> a($$0x, ur.a("options.multiplier", $$1x)),
      new esu.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final esu<Integer> aY = new esu<>(
      "options.mipmapLevels", esu.a(), ($$0x, $$1x) -> (ur)($$1x == 0 ? uq.a($$0x, false) : a($$0x, $$1x.intValue())), new esu.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final esu<esb> aZ = new esu<>(
      "options.attackIndicator", esu.a(), esu.b(), new esu.e<>(Arrays.asList(esb.values()), Codec.INT.xmap(esb::a, esb::a)), esb.b, $$0x -> {
      }
   );
   public ggy r = ggy.a;
   public boolean s = false;
   public boolean t = false;
   private final esu<Integer> ba = new esu<>("options.biomeBlendRadius", esu.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, ur.c("options.biomeBlendRadius." + $$2x));
   }, new esu.f(0, 7), 2, $$0x -> esr.N().f.f());
   private final esu<Double> bb = new esu<>(
      "options.mouseWheelSensitivity",
      esu.a(),
      ($$0x, $$1x) -> a($$0x, ur.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new esu.f(-200, 100).a(esv::c, esv::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final esu<Boolean> bc = esu.a("options.rawMouseInput", true, $$0x -> {
      emo $$1x = esr.N().aL();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final esu<Boolean> bd = esu.a("options.autoJump", false);
   private final esu<Boolean> be = esu.a("options.operatorItemsTab", false);
   private final esu<Boolean> bf = esu.a("options.autoSuggestCommands", true);
   private final esu<Boolean> bg = esu.a("options.chat.color", true);
   private final esu<Boolean> bh = esu.a("options.chat.links", true);
   private final esu<Boolean> bi = esu.a("options.chat.links.prompt", true);
   private final esu<Boolean> bj = esu.a("options.vsync", true, $$0x -> {
      if (esr.N().aL() != null) {
         esr.N().aL().a($$0x);
      }
   });
   private final esu<Boolean> bk = esu.a("options.entityShadows", true);
   private final esu<Boolean> bl = esu.a("options.forceUnicodeFont", false, $$0x -> {
      esr $$1x = esr.N();
      if ($$1x.aL() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final esu<Boolean> bm = esu.a("options.invertMouse", false);
   private final esu<Boolean> bn = esu.a("options.discrete_mouse_scroll", false);
   private final esu<Boolean> bo = esu.a("options.realmsNotifications", true);
   private static final ur bp = ur.c("options.allowServerListing.tooltip");
   private final esu<Boolean> bq = esu.a("options.allowServerListing", esu.a(bp), true, $$0x -> this.au());
   private final esu<Boolean> br = esu.a("options.reducedDebugInfo", false);
   private final Map<aqo, esu<Double>> bs = ac.a(new EnumMap<>(aqo.class), $$0x -> {
      for (aqo $$1x : aqo.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final esu<Boolean> bt = esu.a("options.showSubtitles", false);
   private static final ur bu = ur.c("options.directionalAudio.on.tooltip");
   private static final ur bv = ur.c("options.directionalAudio.off.tooltip");
   private final esu<Boolean> bw = esu.a("options.directionalAudio", $$0x -> $$0x ? evx.a(bu) : evx.a(bv), false, $$0x -> {
      gft $$1x = esr.N().ah();
      $$1x.j();
      $$1x.a(gek.a(aqn.yy, 1.0F));
   });
   private final esu<Boolean> bx = new esu<>(
      "options.accessibility.text_background",
      esu.a(),
      ($$0x, $$1x) -> $$1x ? ur.c("options.accessibility.text_background.chat") : ur.c("options.accessibility.text_background.everywhere"),
      esu.a,
      true,
      $$0x -> {
      }
   );
   private final esu<Boolean> by = esu.a("options.touchscreen", false);
   private final esu<Boolean> bz = esu.a("options.fullscreen", false, $$0x -> {
      esr $$1x = esr.N();
      if ($$1x.aL() != null && $$1x.aL().j() != $$0x) {
         $$1x.aL().h();
         this.X().a($$1x.aL().j());
      }
   });
   private final esu<Boolean> bA = esu.a("options.viewBobbing", true);
   private static final ur bB = ur.c("options.key.toggle");
   private static final ur bC = ur.c("options.key.hold");
   private final esu<Boolean> bD = new esu<>("key.sneak", esu.a(), ($$0x, $$1x) -> $$1x ? bB : bC, esu.a, false, $$0x -> {
   });
   private final esu<Boolean> bE = new esu<>("key.sprint", esu.a(), ($$0x, $$1x) -> $$1x ? bB : bC, esu.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final ur bF = ur.c("options.hideMatchedNames.tooltip");
   private final esu<Boolean> bG = esu.a("options.hideMatchedNames", esu.a(bF), true);
   private final esu<Boolean> bH = esu.a("options.autosaveIndicator", true);
   private static final ur bI = ur.c("options.onlyShowSecureChat.tooltip");
   private final esu<Boolean> bJ = esu.a("options.onlyShowSecureChat", esu.a(bI), false);
   public final esp x = new esp("key.forward", 87, "key.categories.movement");
   public final esp y = new esp("key.left", 65, "key.categories.movement");
   public final esp z = new esp("key.back", 83, "key.categories.movement");
   public final esp A = new esp("key.right", 68, "key.categories.movement");
   public final esp B = new esp("key.jump", 32, "key.categories.movement");
   public final esp C = new etf("key.sneak", 340, "key.categories.movement", this.bD::c);
   public final esp D = new etf("key.sprint", 341, "key.categories.movement", this.bE::c);
   public final esp E = new esp("key.inventory", 69, "key.categories.inventory");
   public final esp F = new esp("key.swapOffhand", 70, "key.categories.inventory");
   public final esp G = new esp("key.drop", 81, "key.categories.inventory");
   public final esp H = new esp("key.use", emf.b.c, 1, "key.categories.gameplay");
   public final esp I = new esp("key.attack", emf.b.c, 0, "key.categories.gameplay");
   public final esp J = new esp("key.pickItem", emf.b.c, 2, "key.categories.gameplay");
   public final esp K = new esp("key.chat", 84, "key.categories.multiplayer");
   public final esp L = new esp("key.playerlist", 258, "key.categories.multiplayer");
   public final esp M = new esp("key.command", 47, "key.categories.multiplayer");
   public final esp N = new esp("key.socialInteractions", 80, "key.categories.multiplayer");
   public final esp O = new esp("key.screenshot", 291, "key.categories.misc");
   public final esp P = new esp("key.togglePerspective", 294, "key.categories.misc");
   public final esp Q = new esp("key.smoothCamera", emf.bv.b(), "key.categories.misc");
   public final esp R = new esp("key.fullscreen", 300, "key.categories.misc");
   public final esp S = new esp("key.spectatorOutlines", emf.bv.b(), "key.categories.misc");
   public final esp T = new esp("key.advancements", 76, "key.categories.misc");
   public final esp[] U = new esp[]{
      new esp("key.hotbar.1", 49, "key.categories.inventory"),
      new esp("key.hotbar.2", 50, "key.categories.inventory"),
      new esp("key.hotbar.3", 51, "key.categories.inventory"),
      new esp("key.hotbar.4", 52, "key.categories.inventory"),
      new esp("key.hotbar.5", 53, "key.categories.inventory"),
      new esp("key.hotbar.6", 54, "key.categories.inventory"),
      new esp("key.hotbar.7", 55, "key.categories.inventory"),
      new esp("key.hotbar.8", 56, "key.categories.inventory"),
      new esp("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final esp V = new esp("key.saveToolbarActivator", 67, "key.categories.creative");
   public final esp W = new esp("key.loadToolbarActivator", 88, "key.categories.creative");
   public final esp[] X = (esp[])ArrayUtils.addAll(
      new esp[]{
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
   protected esr Y;
   private final File bK;
   public boolean Z;
   private esd bL = esd.a;
   public String aa = "";
   public boolean ab;
   private final esu<Integer> bM = new esu<>("options.fov", esu.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, ur.c("options.fov.min"));
         case 110 -> a($$0x, ur.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new esu.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> esr.N().f.r());
   private static final ur bN = ur.a("options.telemetry.button.tooltip", ur.c("options.telemetry.state.minimal"), ur.c("options.telemetry.state.all"));
   private final esu<Boolean> bO = esu.a("options.telemetry.button", esu.a(bN), ($$0x, $$1x) -> {
      esr $$2x = esr.N();
      if (!$$2x.B()) {
         return ur.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.A() ? ur.c("options.telemetry.state.all") : ur.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final ur bP = ur.c("options.screenEffectScale.tooltip");
   private final esu<Double> bQ = new esu<>(
      "options.screenEffectScale", esu.a(bP), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uq.c) : a($$0x, $$1x.doubleValue()), esu.m.a, 1.0, $$0x -> {
      }
   );
   private static final ur bR = ur.c("options.fovEffectScale.tooltip");
   private final esu<Double> bS = new esu<>(
      "options.fovEffectScale",
      esu.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uq.c) : a($$0x, $$1x.doubleValue()),
      esu.m.a.a(ati::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final ur bT = ur.c("options.darknessEffectScale.tooltip");
   private final esu<Double> bU = new esu<>(
      "options.darknessEffectScale",
      esu.a(bT),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uq.c) : a($$0x, $$1x.doubleValue()),
      esu.m.a.a(ati::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final ur bV = ur.c("options.glintSpeed.tooltip");
   private final esu<Double> bW = new esu<>(
      "options.glintSpeed", esu.a(bV), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uq.c) : a($$0x, $$1x.doubleValue()), esu.m.a, 0.5, $$0x -> {
      }
   );
   private static final ur bX = ur.c("options.glintStrength.tooltip");
   private final esu<Double> bY = new esu<>(
      "options.glintStrength",
      esu.a(bX),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uq.c) : a($$0x, $$1x.doubleValue()),
      esu.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final ur bZ = ur.c("options.damageTiltStrength.tooltip");
   private final esu<Double> ca = new esu<>(
      "options.damageTiltStrength", esu.a(bZ), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uq.c) : a($$0x, $$1x.doubleValue()), esu.m.a, 1.0, $$0x -> {
      }
   );
   private final esu<Double> cb = new esu<>("options.gamma", esu.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, ur.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, ur.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, ur.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, esu.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cc = 2147483646;
   private final esu<Integer> cd = new esu<>(
      "options.guiScale", esu.a(), ($$0x, $$1x) -> $$1x == 0 ? ur.c("options.guiScale.auto") : ur.b(Integer.toString($$1x)), new esu.c(0, () -> {
         esr $$0x = esr.N();
         return !$$0x.q() ? 2147483646 : $$0x.aL().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final esu<esw> ce = new esu<>(
      "options.particles", esu.a(), esu.b(), new esu.e<>(Arrays.asList(esw.values()), Codec.INT.xmap(esw::a, esw::a)), esw.a, $$0x -> {
      }
   );
   private final esu<est> cf = new esu<>(
      "options.narrator",
      esu.a(),
      ($$0x, $$1x) -> (ur)(this.Y.aU().a() ? $$1x.b() : ur.c("options.narrator.notavailable")),
      new esu.e<>(Arrays.asList(est.values()), Codec.INT.xmap(est::a, est::a)),
      est.a,
      $$0x -> this.Y.aU().a($$0x)
   );
   public String ad = "en_us";
   private final esu<String> cg = new esu<>(
      "options.audioDevice",
      esu.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return ur.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? ur.b($$1x.substring(gfq.c)) : ur.b($$1x);
         }
      },
      new esu.h<>(
         () -> Stream.concat(Stream.of(""), esr.N().ah().a().stream()).toList(),
         $$0x -> esr.N().q() && $$0x != "" && !esr.N().ah().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gft $$1x = esr.N().ah();
         $$1x.j();
         $$1x.a(gek.a(aqn.yy, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public esu<Boolean> a() {
      return this.am;
   }

   public esu<Boolean> b() {
      return this.ao;
   }

   public esu<Boolean> c() {
      return this.aq;
   }

   public esu<Double> d() {
      return this.ar;
   }

   public esu<Integer> e() {
      return this.as;
   }

   public esu<Integer> f() {
      return this.at;
   }

   public esu<Double> g() {
      return this.av;
   }

   public esu<Integer> h() {
      return this.aw;
   }

   public esu<esf> i() {
      return this.ax;
   }

   public esu<esk> j() {
      return this.aB;
   }

   public esu<Boolean> k() {
      return this.aC;
   }

   public esu<esy> l() {
      return this.aG;
   }

   public void a(aoo $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (aol $$2 : $$0.f()) {
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

   public esu<cdk> m() {
      return this.aH;
   }

   public esu<Double> n() {
      return this.aI;
   }

   public esu<Double> o() {
      return this.aJ;
   }

   public esu<Double> p() {
      return this.aK;
   }

   public esu<Double> q() {
      return this.aL;
   }

   public esu<Boolean> r() {
      return this.aN;
   }

   public esu<Boolean> s() {
      return this.aO;
   }

   public esu<bks> t() {
      return this.aQ;
   }

   public esu<Double> u() {
      return this.aR;
   }

   public esu<Double> v() {
      return this.aS;
   }

   public esu<Double> w() {
      return this.aT;
   }

   public esu<Double> x() {
      return this.aU;
   }

   public esu<Double> y() {
      return this.aV;
   }

   public esu<Double> z() {
      return this.aX;
   }

   public esu<Integer> A() {
      return this.aY;
   }

   public esu<esb> B() {
      return this.aZ;
   }

   public esu<Integer> C() {
      return this.ba;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ati.a(Math.log10($$0) * 100.0);
   }

   public esu<Double> D() {
      return this.bb;
   }

   public esu<Boolean> E() {
      return this.bc;
   }

   public esu<Boolean> F() {
      return this.bd;
   }

   public esu<Boolean> G() {
      return this.be;
   }

   public esu<Boolean> H() {
      return this.bf;
   }

   public esu<Boolean> I() {
      return this.bg;
   }

   public esu<Boolean> J() {
      return this.bh;
   }

   public esu<Boolean> K() {
      return this.bi;
   }

   public esu<Boolean> L() {
      return this.bj;
   }

   public esu<Boolean> M() {
      return this.bk;
   }

   public esu<Boolean> N() {
      return this.bl;
   }

   public esu<Boolean> O() {
      return this.bm;
   }

   public esu<Boolean> P() {
      return this.bn;
   }

   public esu<Boolean> Q() {
      return this.bo;
   }

   public esu<Boolean> R() {
      return this.bq;
   }

   public esu<Boolean> S() {
      return this.br;
   }

   public final float a(aqo $$0) {
      return this.b($$0).c().floatValue();
   }

   public final esu<Double> b(aqo $$0) {
      return Objects.requireNonNull(this.bs.get($$0));
   }

   private esu<Double> a(String $$0, aqo $$1) {
      return new esu<>(
         $$0, esu.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uq.c) : a($$0x, $$1x.doubleValue()), esu.m.a, 1.0, $$1x -> esr.N().ah().a($$1, $$1x.floatValue())
      );
   }

   public esu<Boolean> T() {
      return this.bt;
   }

   public esu<Boolean> U() {
      return this.bw;
   }

   public esu<Boolean> V() {
      return this.bx;
   }

   public esu<Boolean> W() {
      return this.by;
   }

   public esu<Boolean> X() {
      return this.bz;
   }

   public esu<Boolean> Y() {
      return this.bA;
   }

   public esu<Boolean> Z() {
      return this.bD;
   }

   public esu<Boolean> aa() {
      return this.bE;
   }

   public esu<Boolean> ab() {
      return this.bG;
   }

   public esu<Boolean> ac() {
      return this.bH;
   }

   public esu<Boolean> ad() {
      return this.bJ;
   }

   public esu<Integer> ae() {
      return this.bM;
   }

   public esu<Boolean> af() {
      return this.bO;
   }

   public esu<Double> ag() {
      return this.bQ;
   }

   public esu<Double> ah() {
      return this.bS;
   }

   public esu<Double> ai() {
      return this.bU;
   }

   public esu<Double> aj() {
      return this.bW;
   }

   public esu<Double> ak() {
      return this.bY;
   }

   public esu<Double> al() {
      return this.ca;
   }

   public esu<Double> am() {
      return this.cb;
   }

   public esu<Integer> an() {
      return this.cd;
   }

   public esu<esw> ao() {
      return this.ce;
   }

   public esu<est> ap() {
      return this.cf;
   }

   public esu<String> aq() {
      return this.cg;
   }

   public esv(esr $$0, File $$1) {
      this.Y = $$0;
      this.bK = new File($$1, "options.txt");
      boolean $$2 = $$0.ae();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.as = new esu<>(
         "options.renderDistance",
         esu.a(),
         ($$0x, $$1x) -> a($$0x, ur.a("options.chunks", $$1x)),
         new esu.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> esr.N().f.r()
      );
      this.at = new esu<>(
         "options.simulationDistance", esu.a(), ($$0x, $$1x) -> a($$0x, ur.a("options.chunks", $$1x)), new esu.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
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

   public void a(esp $$0, emf.a $$1) {
      $$0.b($$1);
      this.as();
   }

   private void a(esv.a $$0) {
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
      this.i = $$0.a("resourcePacks", this.i, esv::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, esv::c, ah::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, ggy::a, ggy::a);
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

      for (esp $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(emf.a($$3));
         }
      }

      for (aqo $$4 : aqo.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bs.get($$4));
      }

      for (cdn $$5 : cdn.values()) {
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
               this.aB.a(esk.b);
            } else {
               this.aB.a(esk.a);
            }
         }

         this.a(new esv.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, esu<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> esv.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     esv.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? esv.a($$2) : $$1;
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
               } else if (esv.a($$2)) {
                  return 1.0F;
               } else if (esv.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     esv.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         esp.d();
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

      return aun.e.a(this.Y.aq(), $$0, $$1);
   }

   public void as() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bK), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new esv.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, esu<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> esv.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(esv.ah.toJson($$2x));
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

   public alp at() {
      int $$0 = 0;

      for (cdn $$1 : this.aP) {
         $$0 |= $$1.a();
      }

      return new alp(this.ad, this.as.c(), this.aH.c(), this.bg.c(), $$0, this.aQ.c(), this.Y.aP(), this.bq.c());
   }

   public void au() {
      if (this.Y.s != null) {
         this.Y.s.cn.b(new wv(this.at()));
      }
   }

   private void b(cdn $$0, boolean $$1) {
      if ($$1) {
         this.aP.add($$0);
      } else {
         this.aP.remove($$0);
      }
   }

   public boolean a(cdn $$0) {
      return this.aP.contains($$0);
   }

   public void a(cdn $$0, boolean $$1) {
      this.b($$0, $$1);
      this.au();
   }

   public esf av() {
      return this.aA() >= 4 ? this.ax.c() : esf.a;
   }

   public boolean aw() {
      return this.q;
   }

   public void b(aoo $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         aol $$4 = $$0.c($$3);
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

   public esd ax() {
      return this.bL;
   }

   public void a(esd $$0) {
      this.bL = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = asy.a(ah, $$0, ai);
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
      <T> void a(String var1, esu<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
