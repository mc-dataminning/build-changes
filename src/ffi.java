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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

public class ffi {
   static final Logger af = LogUtils.getLogger();
   static final Gson ag = new Gson();
   private static final TypeToken<List<String>> ah = new TypeToken<List<String>>() {
   };
   public static final int a = 2;
   public static final int b = 4;
   public static final int c = 8;
   public static final int d = 12;
   public static final int e = 16;
   public static final int f = 32;
   private static final Splitter ai = Splitter.on(':').limit(2);
   public static final String g = "";
   private static final xo aj = xo.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final ffh<Boolean> ak = ffh.a("options.darkMojangStudiosBackgroundColor", ffh.a(aj), false);
   private static final xo al = xo.c("options.hideLightningFlashes.tooltip");
   private final ffh<Boolean> am = ffh.a("options.hideLightningFlashes", ffh.a(al), false);
   private static final xo an = xo.c("options.hideSplashTexts.tooltip");
   private final ffh<Boolean> ao = ffh.a("options.hideSplashTexts", ffh.a(an), false);
   private final ffh<Double> ap = new ffh<>("options.sensitivity", ffh.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xo.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xo.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, ffh.m.a, 0.5, $$0x -> {
   });
   private final ffh<Integer> aq;
   private final ffh<Integer> ar;
   private int as = 0;
   private final ffh<Double> at = new ffh<>(
      "options.entityDistanceScaling",
      ffh.a(),
      ffi::a,
      new ffh.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final ffh<Integer> au = new ffh<>(
      "options.framerateLimit",
      ffh.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xo.c("options.framerateLimit.max")) : a($$0x, xo.a("options.framerate", $$1x)),
      new ffh.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> ffe.Q().aO().a($$0x)
   );
   private final ffh<fes> av = new ffh<>(
      "options.renderClouds",
      ffh.a(),
      ffh.b(),
      new ffh.e<>(Arrays.asList(fes.values()), Codec.withAlternative(fes.d, Codec.BOOL, $$0x -> $$0x ? fes.c : fes.a)),
      fes.c,
      $$0x -> {
         if (ffe.O()) {
            eyj $$1x = ffe.Q().f.x();
            if ($$1x != null) {
               $$1x.b(ffe.a);
            }
         }
      }
   );
   private static final xo aw = xo.c("options.graphics.fast.tooltip");
   private static final xo ax = xo.a("options.graphics.fabulous.tooltip", xo.c("options.graphics.fabulous").a(n.u));
   private static final xo ay = xo.c("options.graphics.fancy.tooltip");
   private final ffh<fex> az = new ffh<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fio.a(ay);
            case a -> fio.a(aw);
            case c -> fio.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         yc $$2x = xo.c($$1x.b());
         return $$1x == fex.c ? $$2x.a(n.u) : $$2x;
      },
      new ffh.a<>(
         Arrays.asList(fex.values()),
         Stream.of(fex.values()).filter($$0x -> $$0x != fex.c).collect(Collectors.toList()),
         () -> ffe.Q().r() && ffe.Q().ai().h(),
         ($$0x, $$1x) -> {
            ffe $$2x = ffe.Q();
            gdh $$3 = $$2x.ai();
            if ($$1x == fex.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(fex::a, fex::a)
      ),
      fex.b,
      $$0x -> {
      }
   );
   private final ffh<Boolean> aA = ffh.a("options.ao", true, $$0x -> ffe.Q().f.f());
   private static final xo aB = xo.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xo aC = xo.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xo aD = xo.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final ffh<ffl> aE = new ffh<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fio.a(aB);
         case b -> fio.a(aC);
         case c -> fio.a(aD);
      };
   }, ffh.b(), new ffh.e<>(Arrays.asList(ffl.values()), Codec.INT.xmap(ffl::a, ffl::a)), ffl.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final ffh<cmu> aF = new ffh<>(
      "options.chat.visibility", ffh.a(), ffh.b(), new ffh.e<>(Arrays.asList(cmu.values()), Codec.INT.xmap(cmu::a, cmu::a)), cmu.a, $$0x -> {
      }
   );
   private final ffh<Double> aG = new ffh<>("options.chat.opacity", ffh.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), ffh.m.a, 1.0, $$0x -> ffe.Q().l.d().b());
   private final ffh<Double> aH = new ffh<>("options.chat.line_spacing", ffh.a(), ffi::a, ffh.m.a, 0.0, $$0x -> {
   });
   private static final xo aI = xo.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final double aJ = 0.5;
   private final ffh<Double> aK = new ffh<>("options.accessibility.menu_background_blurriness", ffh.a(aI), ffi::b, ffh.m.a, 0.5, $$0x -> {
   });
   private final ffh<Double> aL = new ffh<>("options.accessibility.text_background_opacity", ffh.a(), ffi::a, ffh.m.a, 0.5, $$0x -> ffe.Q().l.d().b());
   private final ffh<Double> aM = new ffh<>("options.accessibility.panorama_speed", ffh.a(), ffi::a, ffh.m.a, 1.0, $$0x -> {
   });
   private static final xo aN = xo.c("options.accessibility.high_contrast.tooltip");
   private final ffh<Boolean> aO = ffh.a("options.accessibility.high_contrast", ffh.a(aN), false, $$0x -> {
      atz $$1x = ffe.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final ffh<Boolean> aP = ffh.a(
      "options.accessibility.narrator_hotkey",
      ffh.a(ffe.a ? xo.c("options.accessibility.narrator_hotkey.mac.tooltip") : xo.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cmx> aQ = EnumSet.allOf(cmx.class);
   private final ffh<bti> aR = new ffh<>("options.mainHand", ffh.a(), ffh.b(), new ffh.e<>(Arrays.asList(bti.values()), bti.c), bti.b, $$0x -> this.ax());
   public int o;
   public int p;
   private final ffh<Double> aS = new ffh<>(
      "options.chat.scale",
      ffh.a(),
      ($$0x, $$1x) -> (xo)($$1x == 0.0 ? xn.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      ffh.m.a,
      1.0,
      $$0x -> ffe.Q().l.d().b()
   );
   private final ffh<Double> aT = new ffh<>("options.chat.width", ffh.a(), ($$0x, $$1x) -> b($$0x, fhe.a($$1x)), ffh.m.a, 1.0, $$0x -> ffe.Q().l.d().b());
   private final ffh<Double> aU = new ffh<>(
      "options.chat.height.unfocused", ffh.a(), ($$0x, $$1x) -> b($$0x, fhe.b($$1x)), ffh.m.a, fhe.i(), $$0x -> ffe.Q().l.d().b()
   );
   private final ffh<Double> aV = new ffh<>(
      "options.chat.height.focused", ffh.a(), ($$0x, $$1x) -> b($$0x, fhe.b($$1x)), ffh.m.a, 1.0, $$0x -> ffe.Q().l.d().b()
   );
   private final ffh<Double> aW = new ffh<>(
      "options.chat.delay_instant",
      ffh.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xo.c("options.chat.delay_none") : xo.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new ffh.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> ffe.Q().aY().a($$0x)
   );
   private static final xo aX = xo.c("options.notifications.display_time.tooltip");
   private final ffh<Double> aY = new ffh<>(
      "options.notifications.display_time",
      ffh.a(aX),
      ($$0x, $$1x) -> a($$0x, xo.a("options.multiplier", $$1x)),
      new ffh.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final ffh<Integer> aZ = new ffh<>(
      "options.mipmapLevels", ffh.a(), ($$0x, $$1x) -> (xo)($$1x == 0 ? xn.a($$0x, false) : a($$0x, $$1x.intValue())), new ffh.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final ffh<feo> ba = new ffh<>(
      "options.attackIndicator", ffh.a(), ffh.b(), new ffh.e<>(Arrays.asList(feo.values()), Codec.INT.xmap(feo::a, feo::a)), feo.b, $$0x -> {
      }
   );
   public guz r = guz.a;
   public boolean s = false;
   public boolean t = false;
   private final ffh<Integer> bb = new ffh<>("options.biomeBlendRadius", ffh.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xo.c("options.biomeBlendRadius." + $$2x));
   }, new ffh.f(0, 7, false), 2, $$0x -> ffe.Q().f.f());
   private final ffh<Double> bc = new ffh<>(
      "options.mouseWheelSensitivity",
      ffh.a(),
      ($$0x, $$1x) -> a($$0x, xo.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new ffh.f(-200, 100).a(ffi::c, ffi::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final ffh<Boolean> bd = ffh.a("options.rawMouseInput", true, $$0x -> {
      ezb $$1x = ffe.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final ffh<Boolean> be = ffh.a("options.autoJump", false);
   private final ffh<Boolean> bf = ffh.a("options.operatorItemsTab", false);
   private final ffh<Boolean> bg = ffh.a("options.autoSuggestCommands", true);
   private final ffh<Boolean> bh = ffh.a("options.chat.color", true);
   private final ffh<Boolean> bi = ffh.a("options.chat.links", true);
   private final ffh<Boolean> bj = ffh.a("options.chat.links.prompt", true);
   private final ffh<Boolean> bk = ffh.a("options.vsync", true, $$0x -> {
      if (ffe.Q().aO() != null) {
         ffe.Q().aO().a($$0x);
      }
   });
   private final ffh<Boolean> bl = ffh.a("options.entityShadows", true);
   private final ffh<Boolean> bm = ffh.a("options.forceUnicodeFont", false, $$0x -> aE());
   private final ffh<Boolean> bn = ffh.a("options.japaneseGlyphVariants", ffh.a(xo.c("options.japaneseGlyphVariants.tooltip")), aF(), $$0x -> aE());
   private final ffh<Boolean> bo = ffh.a("options.invertMouse", false);
   private final ffh<Boolean> bp = ffh.a("options.discrete_mouse_scroll", false);
   private final ffh<Boolean> bq = ffh.a("options.realmsNotifications", true);
   private static final xo br = xo.c("options.allowServerListing.tooltip");
   private final ffh<Boolean> bs = ffh.a("options.allowServerListing", ffh.a(br), true, $$0x -> this.ax());
   private final ffh<Boolean> bt = ffh.a("options.reducedDebugInfo", false);
   private final Map<awa, ffh<Double>> bu = ac.a(new EnumMap<>(awa.class), $$0x -> {
      for (awa $$1x : awa.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final ffh<Boolean> bv = ffh.a("options.showSubtitles", false);
   private static final xo bw = xo.c("options.directionalAudio.on.tooltip");
   private static final xo bx = xo.c("options.directionalAudio.off.tooltip");
   private final ffh<Boolean> by = ffh.a("options.directionalAudio", $$0x -> $$0x ? fio.a(bw) : fio.a(bx), false, $$0x -> {
      gtu $$1x = ffe.Q().aj();
      $$1x.k();
      $$1x.a(gsh.a(avz.Ao, 1.0F));
   });
   private final ffh<Boolean> bz = new ffh<>(
      "options.accessibility.text_background",
      ffh.a(),
      ($$0x, $$1x) -> $$1x ? xo.c("options.accessibility.text_background.chat") : xo.c("options.accessibility.text_background.everywhere"),
      ffh.a,
      true,
      $$0x -> {
      }
   );
   private final ffh<Boolean> bA = ffh.a("options.touchscreen", false);
   private final ffh<Boolean> bB = ffh.a("options.fullscreen", false, $$0x -> {
      ffe $$1x = ffe.Q();
      if ($$1x.aO() != null && $$1x.aO().j() != $$0x) {
         $$1x.aO().h();
         this.aa().a($$1x.aO().j());
      }
   });
   private final ffh<Boolean> bC = ffh.a("options.viewBobbing", true);
   private static final xo bD = xo.c("options.key.toggle");
   private static final xo bE = xo.c("options.key.hold");
   private final ffh<Boolean> bF = new ffh<>("key.sneak", ffh.a(), ($$0x, $$1x) -> $$1x ? bD : bE, ffh.a, false, $$0x -> {
   });
   private final ffh<Boolean> bG = new ffh<>("key.sprint", ffh.a(), ($$0x, $$1x) -> $$1x ? bD : bE, ffh.a, false, $$0x -> {
   });
   public boolean v;
   private static final xo bH = xo.c("options.hideMatchedNames.tooltip");
   private final ffh<Boolean> bI = ffh.a("options.hideMatchedNames", ffh.a(bH), true);
   private final ffh<Boolean> bJ = ffh.a("options.autosaveIndicator", true);
   private static final xo bK = xo.c("options.onlyShowSecureChat.tooltip");
   private final ffh<Boolean> bL = ffh.a("options.onlyShowSecureChat", ffh.a(bK), false);
   public final ffc w = new ffc("key.forward", 87, "key.categories.movement");
   public final ffc x = new ffc("key.left", 65, "key.categories.movement");
   public final ffc y = new ffc("key.back", 83, "key.categories.movement");
   public final ffc z = new ffc("key.right", 68, "key.categories.movement");
   public final ffc A = new ffc("key.jump", 32, "key.categories.movement");
   public final ffc B = new ffr("key.sneak", 340, "key.categories.movement", this.bF::c);
   public final ffc C = new ffr("key.sprint", 341, "key.categories.movement", this.bG::c);
   public final ffc D = new ffc("key.inventory", 69, "key.categories.inventory");
   public final ffc E = new ffc("key.swapOffhand", 70, "key.categories.inventory");
   public final ffc F = new ffc("key.drop", 81, "key.categories.inventory");
   public final ffc G = new ffc("key.use", eys.b.c, 1, "key.categories.gameplay");
   public final ffc H = new ffc("key.attack", eys.b.c, 0, "key.categories.gameplay");
   public final ffc I = new ffc("key.pickItem", eys.b.c, 2, "key.categories.gameplay");
   public final ffc J = new ffc("key.chat", 84, "key.categories.multiplayer");
   public final ffc K = new ffc("key.playerlist", 258, "key.categories.multiplayer");
   public final ffc L = new ffc("key.command", 47, "key.categories.multiplayer");
   public final ffc M = new ffc("key.socialInteractions", 80, "key.categories.multiplayer");
   public final ffc N = new ffc("key.screenshot", 291, "key.categories.misc");
   public final ffc O = new ffc("key.togglePerspective", 294, "key.categories.misc");
   public final ffc P = new ffc("key.smoothCamera", eys.bv.b(), "key.categories.misc");
   public final ffc Q = new ffc("key.fullscreen", 300, "key.categories.misc");
   public final ffc R = new ffc("key.spectatorOutlines", eys.bv.b(), "key.categories.misc");
   public final ffc S = new ffc("key.advancements", 76, "key.categories.misc");
   public final ffc[] T = new ffc[]{
      new ffc("key.hotbar.1", 49, "key.categories.inventory"),
      new ffc("key.hotbar.2", 50, "key.categories.inventory"),
      new ffc("key.hotbar.3", 51, "key.categories.inventory"),
      new ffc("key.hotbar.4", 52, "key.categories.inventory"),
      new ffc("key.hotbar.5", 53, "key.categories.inventory"),
      new ffc("key.hotbar.6", 54, "key.categories.inventory"),
      new ffc("key.hotbar.7", 55, "key.categories.inventory"),
      new ffc("key.hotbar.8", 56, "key.categories.inventory"),
      new ffc("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final ffc U = new ffc("key.saveToolbarActivator", 67, "key.categories.creative");
   public final ffc V = new ffc("key.loadToolbarActivator", 88, "key.categories.creative");
   public final ffc[] W = (ffc[])ArrayUtils.addAll(
      new ffc[]{
         this.H,
         this.G,
         this.w,
         this.x,
         this.y,
         this.z,
         this.A,
         this.B,
         this.C,
         this.F,
         this.D,
         this.J,
         this.K,
         this.I,
         this.L,
         this.M,
         this.N,
         this.O,
         this.P,
         this.Q,
         this.R,
         this.E,
         this.U,
         this.V,
         this.S
      },
      this.T
   );
   protected ffe X;
   private final File bM;
   public boolean Y;
   private feq bN = feq.a;
   public String Z = "";
   public boolean aa;
   private final ffh<Integer> bO = new ffh<>("options.fov", ffh.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xo.c("options.fov.min"));
         case 110 -> a($$0x, xo.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new ffh.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> ffe.Q().f.r());
   private static final xo bP = xo.a("options.telemetry.button.tooltip", xo.c("options.telemetry.state.minimal"), xo.c("options.telemetry.state.all"));
   private final ffh<Boolean> bQ = ffh.a("options.telemetry.button", ffh.a(bP), ($$0x, $$1x) -> {
      ffe $$2x = ffe.Q();
      if (!$$2x.E()) {
         return xo.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xo.c("options.telemetry.state.all") : xo.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xo bR = xo.c("options.screenEffectScale.tooltip");
   private final ffh<Double> bS = new ffh<>("options.screenEffectScale", ffh.a(bR), ffi::b, ffh.m.a, 1.0, $$0x -> {
   });
   private static final xo bT = xo.c("options.fovEffectScale.tooltip");
   private final ffh<Double> bU = new ffh<>(
      "options.fovEffectScale", ffh.a(bT), ffi::b, ffh.m.a.a(ayy::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final xo bV = xo.c("options.darknessEffectScale.tooltip");
   private final ffh<Double> bW = new ffh<>("options.darknessEffectScale", ffh.a(bV), ffi::b, ffh.m.a.a(ayy::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final xo bX = xo.c("options.glintSpeed.tooltip");
   private final ffh<Double> bY = new ffh<>("options.glintSpeed", ffh.a(bX), ffi::b, ffh.m.a, 0.5, $$0x -> {
   });
   private static final xo bZ = xo.c("options.glintStrength.tooltip");
   private final ffh<Double> ca = new ffh<>("options.glintStrength", ffh.a(bZ), ffi::b, ffh.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final xo cb = xo.c("options.damageTiltStrength.tooltip");
   private final ffh<Double> cc = new ffh<>("options.damageTiltStrength", ffh.a(cb), ffi::b, ffh.m.a, 1.0, $$0x -> {
   });
   private final ffh<Double> cd = new ffh<>("options.gamma", ffh.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xo.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xo.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xo.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, ffh.m.a, 0.5, $$0x -> {
   });
   public static final int ab = 0;
   private static final int ce = 2147483646;
   private final ffh<Integer> cf = new ffh<>(
      "options.guiScale", ffh.a(), ($$0x, $$1x) -> $$1x == 0 ? xo.c("options.guiScale.auto") : xo.b(Integer.toString($$1x)), new ffh.c(0, () -> {
         ffe $$0x = ffe.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.X.a()
   );
   private final ffh<ffj> cg = new ffh<>(
      "options.particles", ffh.a(), ffh.b(), new ffh.e<>(Arrays.asList(ffj.values()), Codec.INT.xmap(ffj::a, ffj::a)), ffj.a, $$0x -> {
      }
   );
   private final ffh<ffg> ch = new ffh<>(
      "options.narrator",
      ffh.a(),
      ($$0x, $$1x) -> (xo)(this.X.aX().a() ? $$1x.b() : xo.c("options.narrator.notavailable")),
      new ffh.e<>(Arrays.asList(ffg.values()), Codec.INT.xmap(ffg::a, ffg::a)),
      ffg.a,
      $$0x -> this.X.aX().a($$0x)
   );
   public String ac = "en_us";
   private final ffh<String> ci = new ffh<>(
      "options.audioDevice",
      ffh.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xo.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xo.b($$1x.substring(gtr.c)) : xo.b($$1x);
         }
      },
      new ffh.h<>(
         () -> Stream.concat(Stream.of(""), ffe.Q().aj().a().stream()).toList(),
         $$0x -> ffe.Q().r() && $$0x != "" && !ffe.Q().aj().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gtu $$1x = ffe.Q().aj();
         $$1x.k();
         $$1x.a(gsh.a(avz.Ao, 1.0F));
      }
   );
   public boolean ad = true;
   public boolean ae;

   public ffh<Boolean> a() {
      return this.ak;
   }

   public ffh<Boolean> b() {
      return this.am;
   }

   public ffh<Boolean> c() {
      return this.ao;
   }

   public ffh<Double> d() {
      return this.ap;
   }

   public ffh<Integer> e() {
      return this.aq;
   }

   public ffh<Integer> f() {
      return this.ar;
   }

   public ffh<Double> g() {
      return this.at;
   }

   public ffh<Integer> h() {
      return this.au;
   }

   public ffh<fes> i() {
      return this.av;
   }

   public ffh<fex> j() {
      return this.az;
   }

   public ffh<Boolean> k() {
      return this.aA;
   }

   public ffh<ffl> l() {
      return this.aE;
   }

   public void a(atz $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (atw $$2 : $$0.f()) {
         if (!$$2.j()) {
            this.i.add($$2.g());
            if (!$$2.d().a()) {
               this.j.add($$2.g());
            }
         }
      }

      this.av();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.X.l();
      }
   }

   public ffh<cmu> m() {
      return this.aF;
   }

   public ffh<Double> n() {
      return this.aG;
   }

   public ffh<Double> o() {
      return this.aH;
   }

   public ffh<Double> p() {
      return this.aK;
   }

   public double q() {
      return this.p().c();
   }

   public ffh<Double> r() {
      return this.aL;
   }

   public ffh<Double> s() {
      return this.aM;
   }

   public ffh<Boolean> t() {
      return this.aO;
   }

   public ffh<Boolean> u() {
      return this.aP;
   }

   public ffh<bti> v() {
      return this.aR;
   }

   public ffh<Double> w() {
      return this.aS;
   }

   public ffh<Double> x() {
      return this.aT;
   }

   public ffh<Double> y() {
      return this.aU;
   }

   public ffh<Double> z() {
      return this.aV;
   }

   public ffh<Double> A() {
      return this.aW;
   }

   public ffh<Double> B() {
      return this.aY;
   }

   public ffh<Integer> C() {
      return this.aZ;
   }

   public ffh<feo> D() {
      return this.ba;
   }

   public ffh<Integer> E() {
      return this.bb;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ayy.a(Math.log10($$0) * 100.0);
   }

   public ffh<Double> F() {
      return this.bc;
   }

   public ffh<Boolean> G() {
      return this.bd;
   }

   public ffh<Boolean> H() {
      return this.be;
   }

   public ffh<Boolean> I() {
      return this.bf;
   }

   public ffh<Boolean> J() {
      return this.bg;
   }

   public ffh<Boolean> K() {
      return this.bh;
   }

   public ffh<Boolean> L() {
      return this.bi;
   }

   public ffh<Boolean> M() {
      return this.bj;
   }

   public ffh<Boolean> N() {
      return this.bk;
   }

   public ffh<Boolean> O() {
      return this.bl;
   }

   private static void aE() {
      ffe $$0 = ffe.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public ffh<Boolean> P() {
      return this.bm;
   }

   private static boolean aF() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public ffh<Boolean> Q() {
      return this.bn;
   }

   public ffh<Boolean> R() {
      return this.bo;
   }

   public ffh<Boolean> S() {
      return this.bp;
   }

   public ffh<Boolean> T() {
      return this.bq;
   }

   public ffh<Boolean> U() {
      return this.bs;
   }

   public ffh<Boolean> V() {
      return this.bt;
   }

   public final float a(awa $$0) {
      return this.b($$0).c().floatValue();
   }

   public final ffh<Double> b(awa $$0) {
      return Objects.requireNonNull(this.bu.get($$0));
   }

   private ffh<Double> a(String $$0, awa $$1) {
      return new ffh<>($$0, ffh.a(), ffi::b, ffh.m.a, 1.0, $$1x -> ffe.Q().aj().a($$1, $$1x.floatValue()));
   }

   public ffh<Boolean> W() {
      return this.bv;
   }

   public ffh<Boolean> X() {
      return this.by;
   }

   public ffh<Boolean> Y() {
      return this.bz;
   }

   public ffh<Boolean> Z() {
      return this.bA;
   }

   public ffh<Boolean> aa() {
      return this.bB;
   }

   public ffh<Boolean> ab() {
      return this.bC;
   }

   public ffh<Boolean> ac() {
      return this.bF;
   }

   public ffh<Boolean> ad() {
      return this.bG;
   }

   public ffh<Boolean> ae() {
      return this.bI;
   }

   public ffh<Boolean> af() {
      return this.bJ;
   }

   public ffh<Boolean> ag() {
      return this.bL;
   }

   public ffh<Integer> ah() {
      return this.bO;
   }

   public ffh<Boolean> ai() {
      return this.bQ;
   }

   public ffh<Double> aj() {
      return this.bS;
   }

   public ffh<Double> ak() {
      return this.bU;
   }

   public ffh<Double> al() {
      return this.bW;
   }

   public ffh<Double> am() {
      return this.bY;
   }

   public ffh<Double> an() {
      return this.ca;
   }

   public ffh<Double> ao() {
      return this.cc;
   }

   public ffh<Double> ap() {
      return this.cd;
   }

   public ffh<Integer> aq() {
      return this.cf;
   }

   public ffh<ffj> ar() {
      return this.cg;
   }

   public ffh<ffg> as() {
      return this.ch;
   }

   public ffh<String> at() {
      return this.ci;
   }

   public ffi(ffe $$0, File $$1) {
      this.X = $$0;
      this.bM = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new ffh<>(
         "options.renderDistance",
         ffh.a(),
         ($$0x, $$1x) -> a($$0x, xo.a("options.chunks", $$1x)),
         new ffh.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> ffe.Q().f.r()
      );
      this.ar = new ffh<>(
         "options.simulationDistance", ffh.a(), ($$0x, $$1x) -> a($$0x, xo.a("options.chunks", $$1x)), new ffh.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ae = ac.k() == ac.a.c;
      this.au();
   }

   public float a(float $$0) {
      return this.bz.c() ? $$0 : this.r().c().floatValue();
   }

   public int b(float $$0) {
      return (int)(this.a($$0) * 255.0F) << 24 & 0xFF000000;
   }

   public int a(int $$0) {
      return this.bz.c() ? $$0 : (int)(this.aL.c() * 255.0) << 24 & 0xFF000000;
   }

   public void a(ffc $$0, eys.a $$1) {
      $$0.b($$1);
      this.av();
   }

   private void a(ffi.b $$0) {
      $$0.a("ao", this.aA);
      $$0.a("biomeBlendRadius", this.bb);
      $$0.a("enableVsync", this.bk);
      $$0.a("entityDistanceScaling", this.at);
      $$0.a("entityShadows", this.bl);
      $$0.a("forceUnicodeFont", this.bm);
      $$0.a("japaneseGlyphVariants", this.bn);
      $$0.a("fov", this.bO);
      $$0.a("fovEffectScale", this.bU);
      $$0.a("darknessEffectScale", this.bW);
      $$0.a("glintSpeed", this.bY);
      $$0.a("glintStrength", this.ca);
      $$0.a("prioritizeChunkUpdates", this.aE);
      $$0.a("fullscreen", this.bB);
      $$0.a("gamma", this.cd);
      $$0.a("graphicsMode", this.az);
      $$0.a("guiScale", this.cf);
      $$0.a("maxFps", this.au);
      $$0.a("mipmapLevels", this.aZ);
      $$0.a("narrator", this.ch);
      $$0.a("particles", this.cg);
      $$0.a("reducedDebugInfo", this.bt);
      $$0.a("renderClouds", this.av);
      $$0.a("renderDistance", this.aq);
      $$0.a("simulationDistance", this.ar);
      $$0.a("screenEffectScale", this.bS);
      $$0.a("soundDevice", this.ci);
   }

   private void a(ffi.a $$0) {
      this.a((ffi.b)$$0);
      $$0.a("autoJump", this.be);
      $$0.a("operatorItemsTab", this.bf);
      $$0.a("autoSuggestions", this.bg);
      $$0.a("chatColors", this.bh);
      $$0.a("chatLinks", this.bi);
      $$0.a("chatLinksPrompt", this.bj);
      $$0.a("discrete_mouse_scroll", this.bp);
      $$0.a("invertYMouse", this.bo);
      $$0.a("realmsNotifications", this.bq);
      $$0.a("showSubtitles", this.bv);
      $$0.a("directionalAudio", this.by);
      $$0.a("touchscreen", this.bA);
      $$0.a("bobView", this.bC);
      $$0.a("toggleCrouch", this.bF);
      $$0.a("toggleSprint", this.bG);
      $$0.a("darkMojangStudiosBackground", this.ak);
      $$0.a("hideLightningFlashes", this.am);
      $$0.a("hideSplashTexts", this.ao);
      $$0.a("mouseSensitivity", this.ap);
      $$0.a("damageTiltStrength", this.cc);
      $$0.a("highContrast", this.aO);
      $$0.a("narratorHotkey", this.aP);
      this.i = $$0.a("resourcePacks", this.i, ffi::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, ffi::c, ag::toJson);
      this.Z = $$0.a("lastServer", this.Z);
      this.ac = $$0.a("lang", this.ac);
      $$0.a("chatVisibility", this.aF);
      $$0.a("chatOpacity", this.aG);
      $$0.a("chatLineSpacing", this.aH);
      $$0.a("textBackgroundOpacity", this.aL);
      $$0.a("backgroundForChatOnly", this.bz);
      this.l = $$0.a("hideServerAddress", this.l);
      this.m = $$0.a("advancedItemTooltips", this.m);
      this.n = $$0.a("pauseOnLostFocus", this.n);
      this.o = $$0.a("overrideWidth", this.o);
      this.p = $$0.a("overrideHeight", this.p);
      $$0.a("chatHeightFocused", this.aV);
      $$0.a("chatDelay", this.aW);
      $$0.a("chatHeightUnfocused", this.aU);
      $$0.a("chatScale", this.aS);
      $$0.a("chatWidth", this.aT);
      $$0.a("notificationDisplayTime", this.aY);
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aR);
      $$0.a("attackIndicator", this.ba);
      this.r = $$0.a("tutorialStep", this.r, guz::a, guz::a);
      $$0.a("mouseWheelSensitivity", this.bc);
      $$0.a("rawMouseInput", this.bd);
      this.u = $$0.a("glDebugVerbosity", this.u);
      this.v = $$0.a("skipMultiplayerWarning", this.v);
      $$0.a("hideMatchedNames", this.bI);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.t = $$0.a("hideBundleTutorial", this.t);
      this.ae = $$0.a("syncChunkWrites", this.ae);
      $$0.a("showAutosaveIndicator", this.bJ);
      $$0.a("allowServerListing", this.bs);
      $$0.a("onlyShowSecureChat", this.bL);
      $$0.a("panoramaScrollSpeed", this.aM);
      $$0.a("telemetryOptInExtra", this.bQ);
      this.ad = $$0.a("onboardAccessibility", this.ad);
      $$0.a("menuBackgroundBlurriness", this.aK);

      for (ffc $$1 : this.W) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(eys.a($$3));
         }
      }

      for (awa $$4 : awa.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bu.get($$4));
      }

      for (cmx $$5 : cmx.values()) {
         boolean $$6 = this.aQ.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.b($$5, $$7);
         }
      }
   }

   public void au() {
      try {
         if (!this.bM.exists()) {
            return;
         }

         ur $$0 = new ur();

         try (BufferedReader $$1 = Files.newReader(this.bM, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = ai.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  af.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final ur $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.az.a(fex.b);
            } else {
               this.az.a(fex.a);
            }
         }

         this.a(new ffi.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, ffh<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> ffi.af.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
                  $$5.ifSuccess($$1::a);
               }
            }

            @Override
            public int a(String $$0, int $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  try {
                     return Integer.parseInt($$2);
                  } catch (NumberFormatException var5) {
                     ffi.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? ffi.a($$2) : $$1;
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
               } else if (ffi.a($$2)) {
                  return 1.0F;
               } else if (ffi.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     ffi.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         if (this.X.aO() != null) {
            this.X.aO().a(this.au.c());
         }

         ffc.d();
      } catch (Exception var7) {
         af.error("Failed to load options", var7);
      }
   }

   static boolean a(String $$0) {
      return "true".equals($$0);
   }

   static boolean b(String $$0) {
      return "false".equals($$0);
   }

   private ur a(ur $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return baf.e.a(this.X.as(), $$0, $$1);
   }

   public void av() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bM), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new ffi.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, ffh<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> ffi.af.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(ffi.ag.toJson($$2));
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
         if (this.X.aO().f().isPresent()) {
            $$0.println("fullscreenResolution:" + this.X.aO().f().get().g());
         }
      } catch (Exception var6) {
         af.error("Failed to save options", var6);
      }

      this.ax();
   }

   public aqt aw() {
      int $$0 = 0;

      for (cmx $$1 : this.aQ) {
         $$0 |= $$1.a();
      }

      return new aqt(this.ac, this.aq.c(), this.aF.c(), this.bh.c(), $$0, this.aR.c(), this.X.aS(), this.bs.c());
   }

   public void ax() {
      if (this.X.s != null) {
         this.X.s.cz.b(new aan(this.aw()));
      }
   }

   private void b(cmx $$0, boolean $$1) {
      if ($$1) {
         this.aQ.add($$0);
      } else {
         this.aQ.remove($$0);
      }
   }

   public boolean a(cmx $$0) {
      return this.aQ.contains($$0);
   }

   public void a(cmx $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ax();
   }

   public fes ay() {
      return this.aD() >= 4 ? this.av.c() : fes.a;
   }

   public boolean az() {
      return this.q;
   }

   public void b(atz $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         atw $$4 = $$0.c($$3);
         if ($$4 == null && !$$3.startsWith("file/")) {
            $$4 = $$0.c("file/" + $$3);
         }

         if ($$4 == null) {
            af.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", $$3);
            $$2.remove();
         } else if (!$$4.d().a() && !this.j.contains($$3)) {
            af.warn("Removed resource pack {} from options because it is no longer compatible", $$3);
            $$2.remove();
         } else if ($$4.d().a() && this.j.contains($$3)) {
            af.info("Removed resource pack {} from incompatibility list because it's now compatible", $$3);
            this.j.remove($$3);
         } else {
            $$1.add($$4.g());
         }
      }

      $$0.b($$1);
   }

   public feq aA() {
      return this.bN;
   }

   public void a(feq $$0) {
      this.bN = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = ayo.a(ag, $$0, ah);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aB() {
      return this.bM;
   }

   public String aC() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new ffi.b() {
         @Override
         public <T> void a(String $$0x, ffh<T> $$1) {
            $$0.add(Pair.of($$0, $$1.c()));
         }
      });
      $$0.add(Pair.of("fullscreenResolution", String.valueOf(this.k)));
      $$0.add(Pair.of("glDebugVerbosity", this.u));
      $$0.add(Pair.of("overrideHeight", this.p));
      $$0.add(Pair.of("overrideWidth", this.o));
      $$0.add(Pair.of("syncChunkWrites", this.ae));
      $$0.add(Pair.of("useNativeTransport", this.q));
      $$0.add(Pair.of("resourcePacks", this.i));
      return $$0.stream()
         .sorted(Comparator.comparing(Pair::getFirst))
         .map($$0x -> (String)$$0x.getFirst() + ": " + $$0x.getSecond())
         .collect(Collectors.joining(System.lineSeparator()));
   }

   public void b(int $$0) {
      this.as = $$0;
   }

   public int aD() {
      return this.as > 0 ? Math.min(this.aq.c(), this.as) : this.aq.c();
   }

   private static xo b(xo $$0, int $$1) {
      return xo.a("options.pixel_value", $$0, $$1);
   }

   private static xo a(xo $$0, double $$1) {
      return xo.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static xo a(xo $$0, xo $$1) {
      return xo.a("options.generic_value", $$0, $$1);
   }

   private static xo b(xo $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, xn.c) : a($$0, $$1);
   }

   public static xo a(xo $$0, int $$1) {
      return a($$0, xo.b(Integer.toString($$1)));
   }

   interface a extends ffi.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, ffh<T> var2);
   }
}
