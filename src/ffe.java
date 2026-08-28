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

public class ffe {
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
   private static final xl aj = xl.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final ffd<Boolean> ak = ffd.a("options.darkMojangStudiosBackgroundColor", ffd.a(aj), false);
   private static final xl al = xl.c("options.hideLightningFlashes.tooltip");
   private final ffd<Boolean> am = ffd.a("options.hideLightningFlashes", ffd.a(al), false);
   private static final xl an = xl.c("options.hideSplashTexts.tooltip");
   private final ffd<Boolean> ao = ffd.a("options.hideSplashTexts", ffd.a(an), false);
   private final ffd<Double> ap = new ffd<>("options.sensitivity", ffd.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xl.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xl.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, ffd.m.a, 0.5, $$0x -> {
   });
   private final ffd<Integer> aq;
   private final ffd<Integer> ar;
   private int as = 0;
   private final ffd<Double> at = new ffd<>(
      "options.entityDistanceScaling",
      ffd.a(),
      ffe::a,
      new ffd.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final ffd<Integer> au = new ffd<>(
      "options.framerateLimit",
      ffd.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xl.c("options.framerateLimit.max")) : a($$0x, xl.a("options.framerate", $$1x)),
      new ffd.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> ffa.Q().aO().a($$0x)
   );
   private final ffd<feo> av = new ffd<>(
      "options.renderClouds",
      ffd.a(),
      ffd.b(),
      new ffd.e<>(Arrays.asList(feo.values()), Codec.withAlternative(feo.d, Codec.BOOL, $$0x -> $$0x ? feo.c : feo.a)),
      feo.c,
      $$0x -> {
         if (ffa.O()) {
            eyf $$1x = ffa.Q().f.x();
            if ($$1x != null) {
               $$1x.b(ffa.a);
            }
         }
      }
   );
   private static final xl aw = xl.c("options.graphics.fast.tooltip");
   private static final xl ax = xl.a("options.graphics.fabulous.tooltip", xl.c("options.graphics.fabulous").a(n.u));
   private static final xl ay = xl.c("options.graphics.fancy.tooltip");
   private final ffd<fet> az = new ffd<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fik.a(ay);
            case a -> fik.a(aw);
            case c -> fik.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         xz $$2x = xl.c($$1x.b());
         return $$1x == fet.c ? $$2x.a(n.u) : $$2x;
      },
      new ffd.a<>(
         Arrays.asList(fet.values()),
         Stream.of(fet.values()).filter($$0x -> $$0x != fet.c).collect(Collectors.toList()),
         () -> ffa.Q().r() && ffa.Q().ai().h(),
         ($$0x, $$1x) -> {
            ffa $$2x = ffa.Q();
            gdd $$3 = $$2x.ai();
            if ($$1x == fet.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(fet::a, fet::a)
      ),
      fet.b,
      $$0x -> {
      }
   );
   private final ffd<Boolean> aA = ffd.a("options.ao", true, $$0x -> ffa.Q().f.f());
   private static final xl aB = xl.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xl aC = xl.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xl aD = xl.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final ffd<ffh> aE = new ffd<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fik.a(aB);
         case b -> fik.a(aC);
         case c -> fik.a(aD);
      };
   }, ffd.b(), new ffd.e<>(Arrays.asList(ffh.values()), Codec.INT.xmap(ffh::a, ffh::a)), ffh.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final ffd<cmq> aF = new ffd<>(
      "options.chat.visibility", ffd.a(), ffd.b(), new ffd.e<>(Arrays.asList(cmq.values()), Codec.INT.xmap(cmq::a, cmq::a)), cmq.a, $$0x -> {
      }
   );
   private final ffd<Double> aG = new ffd<>("options.chat.opacity", ffd.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), ffd.m.a, 1.0, $$0x -> ffa.Q().l.d().b());
   private final ffd<Double> aH = new ffd<>("options.chat.line_spacing", ffd.a(), ffe::a, ffd.m.a, 0.0, $$0x -> {
   });
   private static final xl aI = xl.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final double aJ = 0.5;
   private final ffd<Double> aK = new ffd<>("options.accessibility.menu_background_blurriness", ffd.a(aI), ffe::a, ffd.m.a, 0.5, $$0x -> {
   });
   private final ffd<Double> aL = new ffd<>("options.accessibility.text_background_opacity", ffd.a(), ffe::a, ffd.m.a, 0.5, $$0x -> ffa.Q().l.d().b());
   private final ffd<Double> aM = new ffd<>("options.accessibility.panorama_speed", ffd.a(), ffe::a, ffd.m.a, 1.0, $$0x -> {
   });
   private static final xl aN = xl.c("options.accessibility.high_contrast.tooltip");
   private final ffd<Boolean> aO = ffd.a("options.accessibility.high_contrast", ffd.a(aN), false, $$0x -> {
      atw $$1x = ffa.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final ffd<Boolean> aP = ffd.a(
      "options.accessibility.narrator_hotkey",
      ffd.a(ffa.a ? xl.c("options.accessibility.narrator_hotkey.mac.tooltip") : xl.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cmt> aQ = EnumSet.allOf(cmt.class);
   private final ffd<bte> aR = new ffd<>("options.mainHand", ffd.a(), ffd.b(), new ffd.e<>(Arrays.asList(bte.values()), bte.c), bte.b, $$0x -> this.ax());
   public int o;
   public int p;
   private final ffd<Double> aS = new ffd<>(
      "options.chat.scale",
      ffd.a(),
      ($$0x, $$1x) -> (xl)($$1x == 0.0 ? xk.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      ffd.m.a,
      1.0,
      $$0x -> ffa.Q().l.d().b()
   );
   private final ffd<Double> aT = new ffd<>("options.chat.width", ffd.a(), ($$0x, $$1x) -> b($$0x, fha.a($$1x)), ffd.m.a, 1.0, $$0x -> ffa.Q().l.d().b());
   private final ffd<Double> aU = new ffd<>(
      "options.chat.height.unfocused", ffd.a(), ($$0x, $$1x) -> b($$0x, fha.b($$1x)), ffd.m.a, fha.i(), $$0x -> ffa.Q().l.d().b()
   );
   private final ffd<Double> aV = new ffd<>(
      "options.chat.height.focused", ffd.a(), ($$0x, $$1x) -> b($$0x, fha.b($$1x)), ffd.m.a, 1.0, $$0x -> ffa.Q().l.d().b()
   );
   private final ffd<Double> aW = new ffd<>(
      "options.chat.delay_instant",
      ffd.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xl.c("options.chat.delay_none") : xl.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new ffd.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> ffa.Q().aY().a($$0x)
   );
   private static final xl aX = xl.c("options.notifications.display_time.tooltip");
   private final ffd<Double> aY = new ffd<>(
      "options.notifications.display_time",
      ffd.a(aX),
      ($$0x, $$1x) -> a($$0x, xl.a("options.multiplier", $$1x)),
      new ffd.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final ffd<Integer> aZ = new ffd<>(
      "options.mipmapLevels", ffd.a(), ($$0x, $$1x) -> (xl)($$1x == 0 ? xk.a($$0x, false) : a($$0x, $$1x.intValue())), new ffd.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final ffd<fek> ba = new ffd<>(
      "options.attackIndicator", ffd.a(), ffd.b(), new ffd.e<>(Arrays.asList(fek.values()), Codec.INT.xmap(fek::a, fek::a)), fek.b, $$0x -> {
      }
   );
   public guv r = guv.a;
   public boolean s = false;
   public boolean t = false;
   private final ffd<Integer> bb = new ffd<>("options.biomeBlendRadius", ffd.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xl.c("options.biomeBlendRadius." + $$2x));
   }, new ffd.f(0, 7), 2, $$0x -> ffa.Q().f.f());
   private final ffd<Double> bc = new ffd<>(
      "options.mouseWheelSensitivity",
      ffd.a(),
      ($$0x, $$1x) -> a($$0x, xl.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new ffd.f(-200, 100).a(ffe::c, ffe::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final ffd<Boolean> bd = ffd.a("options.rawMouseInput", true, $$0x -> {
      eyx $$1x = ffa.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final ffd<Boolean> be = ffd.a("options.autoJump", false);
   private final ffd<Boolean> bf = ffd.a("options.operatorItemsTab", false);
   private final ffd<Boolean> bg = ffd.a("options.autoSuggestCommands", true);
   private final ffd<Boolean> bh = ffd.a("options.chat.color", true);
   private final ffd<Boolean> bi = ffd.a("options.chat.links", true);
   private final ffd<Boolean> bj = ffd.a("options.chat.links.prompt", true);
   private final ffd<Boolean> bk = ffd.a("options.vsync", true, $$0x -> {
      if (ffa.Q().aO() != null) {
         ffa.Q().aO().a($$0x);
      }
   });
   private final ffd<Boolean> bl = ffd.a("options.entityShadows", true);
   private final ffd<Boolean> bm = ffd.a("options.forceUnicodeFont", false, $$0x -> aE());
   private final ffd<Boolean> bn = ffd.a("options.japaneseGlyphVariants", ffd.a(xl.c("options.japaneseGlyphVariants.tooltip")), aF(), $$0x -> aE());
   private final ffd<Boolean> bo = ffd.a("options.invertMouse", false);
   private final ffd<Boolean> bp = ffd.a("options.discrete_mouse_scroll", false);
   private final ffd<Boolean> bq = ffd.a("options.realmsNotifications", true);
   private static final xl br = xl.c("options.allowServerListing.tooltip");
   private final ffd<Boolean> bs = ffd.a("options.allowServerListing", ffd.a(br), true, $$0x -> this.ax());
   private final ffd<Boolean> bt = ffd.a("options.reducedDebugInfo", false);
   private final Map<avx, ffd<Double>> bu = ac.a(new EnumMap<>(avx.class), $$0x -> {
      for (avx $$1x : avx.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final ffd<Boolean> bv = ffd.a("options.showSubtitles", false);
   private static final xl bw = xl.c("options.directionalAudio.on.tooltip");
   private static final xl bx = xl.c("options.directionalAudio.off.tooltip");
   private final ffd<Boolean> by = ffd.a("options.directionalAudio", $$0x -> $$0x ? fik.a(bw) : fik.a(bx), false, $$0x -> {
      gtq $$1x = ffa.Q().aj();
      $$1x.k();
      $$1x.a(gsd.a(avw.Ao, 1.0F));
   });
   private final ffd<Boolean> bz = new ffd<>(
      "options.accessibility.text_background",
      ffd.a(),
      ($$0x, $$1x) -> $$1x ? xl.c("options.accessibility.text_background.chat") : xl.c("options.accessibility.text_background.everywhere"),
      ffd.a,
      true,
      $$0x -> {
      }
   );
   private final ffd<Boolean> bA = ffd.a("options.touchscreen", false);
   private final ffd<Boolean> bB = ffd.a("options.fullscreen", false, $$0x -> {
      ffa $$1x = ffa.Q();
      if ($$1x.aO() != null && $$1x.aO().j() != $$0x) {
         $$1x.aO().h();
         this.aa().a($$1x.aO().j());
      }
   });
   private final ffd<Boolean> bC = ffd.a("options.viewBobbing", true);
   private static final xl bD = xl.c("options.key.toggle");
   private static final xl bE = xl.c("options.key.hold");
   private final ffd<Boolean> bF = new ffd<>("key.sneak", ffd.a(), ($$0x, $$1x) -> $$1x ? bD : bE, ffd.a, false, $$0x -> {
   });
   private final ffd<Boolean> bG = new ffd<>("key.sprint", ffd.a(), ($$0x, $$1x) -> $$1x ? bD : bE, ffd.a, false, $$0x -> {
   });
   public boolean v;
   private static final xl bH = xl.c("options.hideMatchedNames.tooltip");
   private final ffd<Boolean> bI = ffd.a("options.hideMatchedNames", ffd.a(bH), true);
   private final ffd<Boolean> bJ = ffd.a("options.autosaveIndicator", true);
   private static final xl bK = xl.c("options.onlyShowSecureChat.tooltip");
   private final ffd<Boolean> bL = ffd.a("options.onlyShowSecureChat", ffd.a(bK), false);
   public final fey w = new fey("key.forward", 87, "key.categories.movement");
   public final fey x = new fey("key.left", 65, "key.categories.movement");
   public final fey y = new fey("key.back", 83, "key.categories.movement");
   public final fey z = new fey("key.right", 68, "key.categories.movement");
   public final fey A = new fey("key.jump", 32, "key.categories.movement");
   public final fey B = new ffn("key.sneak", 340, "key.categories.movement", this.bF::c);
   public final fey C = new ffn("key.sprint", 341, "key.categories.movement", this.bG::c);
   public final fey D = new fey("key.inventory", 69, "key.categories.inventory");
   public final fey E = new fey("key.swapOffhand", 70, "key.categories.inventory");
   public final fey F = new fey("key.drop", 81, "key.categories.inventory");
   public final fey G = new fey("key.use", eyo.b.c, 1, "key.categories.gameplay");
   public final fey H = new fey("key.attack", eyo.b.c, 0, "key.categories.gameplay");
   public final fey I = new fey("key.pickItem", eyo.b.c, 2, "key.categories.gameplay");
   public final fey J = new fey("key.chat", 84, "key.categories.multiplayer");
   public final fey K = new fey("key.playerlist", 258, "key.categories.multiplayer");
   public final fey L = new fey("key.command", 47, "key.categories.multiplayer");
   public final fey M = new fey("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fey N = new fey("key.screenshot", 291, "key.categories.misc");
   public final fey O = new fey("key.togglePerspective", 294, "key.categories.misc");
   public final fey P = new fey("key.smoothCamera", eyo.bv.b(), "key.categories.misc");
   public final fey Q = new fey("key.fullscreen", 300, "key.categories.misc");
   public final fey R = new fey("key.spectatorOutlines", eyo.bv.b(), "key.categories.misc");
   public final fey S = new fey("key.advancements", 76, "key.categories.misc");
   public final fey[] T = new fey[]{
      new fey("key.hotbar.1", 49, "key.categories.inventory"),
      new fey("key.hotbar.2", 50, "key.categories.inventory"),
      new fey("key.hotbar.3", 51, "key.categories.inventory"),
      new fey("key.hotbar.4", 52, "key.categories.inventory"),
      new fey("key.hotbar.5", 53, "key.categories.inventory"),
      new fey("key.hotbar.6", 54, "key.categories.inventory"),
      new fey("key.hotbar.7", 55, "key.categories.inventory"),
      new fey("key.hotbar.8", 56, "key.categories.inventory"),
      new fey("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fey U = new fey("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fey V = new fey("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fey[] W = (fey[])ArrayUtils.addAll(
      new fey[]{
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
   protected ffa X;
   private final File bM;
   public boolean Y;
   private fem bN = fem.a;
   public String Z = "";
   public boolean aa;
   private final ffd<Integer> bO = new ffd<>("options.fov", ffd.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xl.c("options.fov.min"));
         case 110 -> a($$0x, xl.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new ffd.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> ffa.Q().f.r());
   private static final xl bP = xl.a("options.telemetry.button.tooltip", xl.c("options.telemetry.state.minimal"), xl.c("options.telemetry.state.all"));
   private final ffd<Boolean> bQ = ffd.a("options.telemetry.button", ffd.a(bP), ($$0x, $$1x) -> {
      ffa $$2x = ffa.Q();
      if (!$$2x.E()) {
         return xl.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xl.c("options.telemetry.state.all") : xl.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xl bR = xl.c("options.screenEffectScale.tooltip");
   private final ffd<Double> bS = new ffd<>(
      "options.screenEffectScale", ffd.a(bR), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, xk.c) : a($$0x, $$1x.doubleValue()), ffd.m.a, 1.0, $$0x -> {
      }
   );
   private static final xl bT = xl.c("options.fovEffectScale.tooltip");
   private final ffd<Double> bU = new ffd<>(
      "options.fovEffectScale",
      ffd.a(bT),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, xk.c) : a($$0x, $$1x.doubleValue()),
      ffd.m.a.a(ayu::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final xl bV = xl.c("options.darknessEffectScale.tooltip");
   private final ffd<Double> bW = new ffd<>(
      "options.darknessEffectScale",
      ffd.a(bV),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, xk.c) : a($$0x, $$1x.doubleValue()),
      ffd.m.a.a(ayu::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final xl bX = xl.c("options.glintSpeed.tooltip");
   private final ffd<Double> bY = new ffd<>(
      "options.glintSpeed", ffd.a(bX), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, xk.c) : a($$0x, $$1x.doubleValue()), ffd.m.a, 0.5, $$0x -> {
      }
   );
   private static final xl bZ = xl.c("options.glintStrength.tooltip");
   private final ffd<Double> ca = new ffd<>(
      "options.glintStrength",
      ffd.a(bZ),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, xk.c) : a($$0x, $$1x.doubleValue()),
      ffd.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final xl cb = xl.c("options.damageTiltStrength.tooltip");
   private final ffd<Double> cc = new ffd<>(
      "options.damageTiltStrength", ffd.a(cb), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, xk.c) : a($$0x, $$1x.doubleValue()), ffd.m.a, 1.0, $$0x -> {
      }
   );
   private final ffd<Double> cd = new ffd<>("options.gamma", ffd.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xl.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xl.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xl.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, ffd.m.a, 0.5, $$0x -> {
   });
   public static final int ab = 0;
   private static final int ce = 2147483646;
   private final ffd<Integer> cf = new ffd<>(
      "options.guiScale", ffd.a(), ($$0x, $$1x) -> $$1x == 0 ? xl.c("options.guiScale.auto") : xl.b(Integer.toString($$1x)), new ffd.c(0, () -> {
         ffa $$0x = ffa.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.X.a()
   );
   private final ffd<fff> cg = new ffd<>(
      "options.particles", ffd.a(), ffd.b(), new ffd.e<>(Arrays.asList(fff.values()), Codec.INT.xmap(fff::a, fff::a)), fff.a, $$0x -> {
      }
   );
   private final ffd<ffc> ch = new ffd<>(
      "options.narrator",
      ffd.a(),
      ($$0x, $$1x) -> (xl)(this.X.aX().a() ? $$1x.b() : xl.c("options.narrator.notavailable")),
      new ffd.e<>(Arrays.asList(ffc.values()), Codec.INT.xmap(ffc::a, ffc::a)),
      ffc.a,
      $$0x -> this.X.aX().a($$0x)
   );
   public String ac = "en_us";
   private final ffd<String> ci = new ffd<>(
      "options.audioDevice",
      ffd.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xl.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xl.b($$1x.substring(gtn.c)) : xl.b($$1x);
         }
      },
      new ffd.h<>(
         () -> Stream.concat(Stream.of(""), ffa.Q().aj().a().stream()).toList(),
         $$0x -> ffa.Q().r() && $$0x != "" && !ffa.Q().aj().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gtq $$1x = ffa.Q().aj();
         $$1x.k();
         $$1x.a(gsd.a(avw.Ao, 1.0F));
      }
   );
   public boolean ad = true;
   public boolean ae;

   public ffd<Boolean> a() {
      return this.ak;
   }

   public ffd<Boolean> b() {
      return this.am;
   }

   public ffd<Boolean> c() {
      return this.ao;
   }

   public ffd<Double> d() {
      return this.ap;
   }

   public ffd<Integer> e() {
      return this.aq;
   }

   public ffd<Integer> f() {
      return this.ar;
   }

   public ffd<Double> g() {
      return this.at;
   }

   public ffd<Integer> h() {
      return this.au;
   }

   public ffd<feo> i() {
      return this.av;
   }

   public ffd<fet> j() {
      return this.az;
   }

   public ffd<Boolean> k() {
      return this.aA;
   }

   public ffd<ffh> l() {
      return this.aE;
   }

   public void a(atw $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (att $$2 : $$0.f()) {
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

   public ffd<cmq> m() {
      return this.aF;
   }

   public ffd<Double> n() {
      return this.aG;
   }

   public ffd<Double> o() {
      return this.aH;
   }

   public ffd<Double> p() {
      return this.aK;
   }

   public double q() {
      return this.p().c();
   }

   public ffd<Double> r() {
      return this.aL;
   }

   public ffd<Double> s() {
      return this.aM;
   }

   public ffd<Boolean> t() {
      return this.aO;
   }

   public ffd<Boolean> u() {
      return this.aP;
   }

   public ffd<bte> v() {
      return this.aR;
   }

   public ffd<Double> w() {
      return this.aS;
   }

   public ffd<Double> x() {
      return this.aT;
   }

   public ffd<Double> y() {
      return this.aU;
   }

   public ffd<Double> z() {
      return this.aV;
   }

   public ffd<Double> A() {
      return this.aW;
   }

   public ffd<Double> B() {
      return this.aY;
   }

   public ffd<Integer> C() {
      return this.aZ;
   }

   public ffd<fek> D() {
      return this.ba;
   }

   public ffd<Integer> E() {
      return this.bb;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ayu.a(Math.log10($$0) * 100.0);
   }

   public ffd<Double> F() {
      return this.bc;
   }

   public ffd<Boolean> G() {
      return this.bd;
   }

   public ffd<Boolean> H() {
      return this.be;
   }

   public ffd<Boolean> I() {
      return this.bf;
   }

   public ffd<Boolean> J() {
      return this.bg;
   }

   public ffd<Boolean> K() {
      return this.bh;
   }

   public ffd<Boolean> L() {
      return this.bi;
   }

   public ffd<Boolean> M() {
      return this.bj;
   }

   public ffd<Boolean> N() {
      return this.bk;
   }

   public ffd<Boolean> O() {
      return this.bl;
   }

   private static void aE() {
      ffa $$0 = ffa.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public ffd<Boolean> P() {
      return this.bm;
   }

   private static boolean aF() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public ffd<Boolean> Q() {
      return this.bn;
   }

   public ffd<Boolean> R() {
      return this.bo;
   }

   public ffd<Boolean> S() {
      return this.bp;
   }

   public ffd<Boolean> T() {
      return this.bq;
   }

   public ffd<Boolean> U() {
      return this.bs;
   }

   public ffd<Boolean> V() {
      return this.bt;
   }

   public final float a(avx $$0) {
      return this.b($$0).c().floatValue();
   }

   public final ffd<Double> b(avx $$0) {
      return Objects.requireNonNull(this.bu.get($$0));
   }

   private ffd<Double> a(String $$0, avx $$1) {
      return new ffd<>(
         $$0, ffd.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, xk.c) : a($$0x, $$1x.doubleValue()), ffd.m.a, 1.0, $$1x -> ffa.Q().aj().a($$1, $$1x.floatValue())
      );
   }

   public ffd<Boolean> W() {
      return this.bv;
   }

   public ffd<Boolean> X() {
      return this.by;
   }

   public ffd<Boolean> Y() {
      return this.bz;
   }

   public ffd<Boolean> Z() {
      return this.bA;
   }

   public ffd<Boolean> aa() {
      return this.bB;
   }

   public ffd<Boolean> ab() {
      return this.bC;
   }

   public ffd<Boolean> ac() {
      return this.bF;
   }

   public ffd<Boolean> ad() {
      return this.bG;
   }

   public ffd<Boolean> ae() {
      return this.bI;
   }

   public ffd<Boolean> af() {
      return this.bJ;
   }

   public ffd<Boolean> ag() {
      return this.bL;
   }

   public ffd<Integer> ah() {
      return this.bO;
   }

   public ffd<Boolean> ai() {
      return this.bQ;
   }

   public ffd<Double> aj() {
      return this.bS;
   }

   public ffd<Double> ak() {
      return this.bU;
   }

   public ffd<Double> al() {
      return this.bW;
   }

   public ffd<Double> am() {
      return this.bY;
   }

   public ffd<Double> an() {
      return this.ca;
   }

   public ffd<Double> ao() {
      return this.cc;
   }

   public ffd<Double> ap() {
      return this.cd;
   }

   public ffd<Integer> aq() {
      return this.cf;
   }

   public ffd<fff> ar() {
      return this.cg;
   }

   public ffd<ffc> as() {
      return this.ch;
   }

   public ffd<String> at() {
      return this.ci;
   }

   public ffe(ffa $$0, File $$1) {
      this.X = $$0;
      this.bM = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new ffd<>(
         "options.renderDistance", ffd.a(), ($$0x, $$1x) -> a($$0x, xl.a("options.chunks", $$1x)), new ffd.f(2, $$2 ? 32 : 16), 12, $$0x -> ffa.Q().f.r()
      );
      this.ar = new ffd<>(
         "options.simulationDistance", ffd.a(), ($$0x, $$1x) -> a($$0x, xl.a("options.chunks", $$1x)), new ffd.f(5, $$2 ? 32 : 16), 12, $$0x -> {
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

   public void a(fey $$0, eyo.a $$1) {
      $$0.b($$1);
      this.av();
   }

   private void a(ffe.b $$0) {
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

   private void a(ffe.a $$0) {
      this.a((ffe.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, ffe::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, ffe::c, ag::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, guv::a, guv::a);
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

      for (fey $$1 : this.W) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(eyo.a($$3));
         }
      }

      for (avx $$4 : avx.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bu.get($$4));
      }

      for (cmt $$5 : cmt.values()) {
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
               this.az.a(fet.b);
            } else {
               this.az.a(fet.a);
            }
         }

         this.a(new ffe.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, ffd<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> ffe.af.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     ffe.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? ffe.a($$2) : $$1;
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
               } else if (ffe.a($$2)) {
                  return 1.0F;
               } else if (ffe.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     ffe.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fey.d();
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

      return bab.e.a(this.X.as(), $$0, $$1);
   }

   public void av() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bM), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new ffe.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, ffd<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> ffe.af.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(ffe.ag.toJson($$2));
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

   public aqq aw() {
      int $$0 = 0;

      for (cmt $$1 : this.aQ) {
         $$0 |= $$1.a();
      }

      return new aqq(this.ac, this.aq.c(), this.aF.c(), this.bh.c(), $$0, this.aR.c(), this.X.aS(), this.bs.c());
   }

   public void ax() {
      if (this.X.s != null) {
         this.X.s.cz.b(new aak(this.aw()));
      }
   }

   private void b(cmt $$0, boolean $$1) {
      if ($$1) {
         this.aQ.add($$0);
      } else {
         this.aQ.remove($$0);
      }
   }

   public boolean a(cmt $$0) {
      return this.aQ.contains($$0);
   }

   public void a(cmt $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ax();
   }

   public feo ay() {
      return this.aD() >= 4 ? this.av.c() : feo.a;
   }

   public boolean az() {
      return this.q;
   }

   public void b(atw $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         att $$4 = $$0.c($$3);
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

      $$0.a($$1);
   }

   public fem aA() {
      return this.bN;
   }

   public void a(fem $$0) {
      this.bN = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = ayk.a(ag, $$0, ah);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aB() {
      return this.bM;
   }

   public String aC() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new ffe.b() {
         @Override
         public <T> void a(String $$0x, ffd<T> $$1) {
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

   private static xl b(xl $$0, int $$1) {
      return xl.a("options.pixel_value", $$0, $$1);
   }

   private static xl a(xl $$0, double $$1) {
      return xl.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static xl a(xl $$0, xl $$1) {
      return xl.a("options.generic_value", $$0, $$1);
   }

   public static xl a(xl $$0, int $$1) {
      return a($$0, xl.b(Integer.toString($$1)));
   }

   interface a extends ffe.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, ffd<T> var2);
   }
}
