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

public class ffj {
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
   private static final xp aj = xp.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final ffi<Boolean> ak = ffi.a("options.darkMojangStudiosBackgroundColor", ffi.a(aj), false);
   private static final xp al = xp.c("options.hideLightningFlashes.tooltip");
   private final ffi<Boolean> am = ffi.a("options.hideLightningFlashes", ffi.a(al), false);
   private static final xp an = xp.c("options.hideSplashTexts.tooltip");
   private final ffi<Boolean> ao = ffi.a("options.hideSplashTexts", ffi.a(an), false);
   private final ffi<Double> ap = new ffi<>("options.sensitivity", ffi.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xp.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xp.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, ffi.m.a, 0.5, $$0x -> {
   });
   private final ffi<Integer> aq;
   private final ffi<Integer> ar;
   private int as = 0;
   private final ffi<Double> at = new ffi<>(
      "options.entityDistanceScaling",
      ffi.a(),
      ffj::a,
      new ffi.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final ffi<Integer> au = new ffi<>(
      "options.framerateLimit",
      ffi.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xp.c("options.framerateLimit.max")) : a($$0x, xp.a("options.framerate", $$1x)),
      new ffi.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fff.Q().aO().a($$0x)
   );
   private final ffi<fet> av = new ffi<>(
      "options.renderClouds",
      ffi.a(),
      ffi.b(),
      new ffi.e<>(Arrays.asList(fet.values()), Codec.withAlternative(fet.d, Codec.BOOL, $$0x -> $$0x ? fet.c : fet.a)),
      fet.c,
      $$0x -> {
         if (fff.O()) {
            eyk $$1x = fff.Q().f.x();
            if ($$1x != null) {
               $$1x.b(fff.a);
            }
         }
      }
   );
   private static final xp aw = xp.c("options.graphics.fast.tooltip");
   private static final xp ax = xp.a("options.graphics.fabulous.tooltip", xp.c("options.graphics.fabulous").a(n.u));
   private static final xp ay = xp.c("options.graphics.fancy.tooltip");
   private final ffi<fey> az = new ffi<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fip.a(ay);
            case a -> fip.a(aw);
            case c -> fip.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         yd $$2x = xp.c($$1x.b());
         return $$1x == fey.c ? $$2x.a(n.u) : $$2x;
      },
      new ffi.a<>(
         Arrays.asList(fey.values()),
         Stream.of(fey.values()).filter($$0x -> $$0x != fey.c).collect(Collectors.toList()),
         () -> fff.Q().r() && fff.Q().ai().h(),
         ($$0x, $$1x) -> {
            fff $$2x = fff.Q();
            gdi $$3 = $$2x.ai();
            if ($$1x == fey.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(fey::a, fey::a)
      ),
      fey.b,
      $$0x -> {
      }
   );
   private final ffi<Boolean> aA = ffi.a("options.ao", true, $$0x -> fff.Q().f.f());
   private static final xp aB = xp.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xp aC = xp.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xp aD = xp.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final ffi<ffm> aE = new ffi<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fip.a(aB);
         case b -> fip.a(aC);
         case c -> fip.a(aD);
      };
   }, ffi.b(), new ffi.e<>(Arrays.asList(ffm.values()), Codec.INT.xmap(ffm::a, ffm::a)), ffm.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final ffi<cmv> aF = new ffi<>(
      "options.chat.visibility", ffi.a(), ffi.b(), new ffi.e<>(Arrays.asList(cmv.values()), Codec.INT.xmap(cmv::a, cmv::a)), cmv.a, $$0x -> {
      }
   );
   private final ffi<Double> aG = new ffi<>("options.chat.opacity", ffi.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), ffi.m.a, 1.0, $$0x -> fff.Q().l.d().b());
   private final ffi<Double> aH = new ffi<>("options.chat.line_spacing", ffi.a(), ffj::a, ffi.m.a, 0.0, $$0x -> {
   });
   private static final xp aI = xp.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final double aJ = 0.5;
   private final ffi<Double> aK = new ffi<>("options.accessibility.menu_background_blurriness", ffi.a(aI), ffj::b, ffi.m.a, 0.5, $$0x -> {
   });
   private final ffi<Double> aL = new ffi<>("options.accessibility.text_background_opacity", ffi.a(), ffj::a, ffi.m.a, 0.5, $$0x -> fff.Q().l.d().b());
   private final ffi<Double> aM = new ffi<>("options.accessibility.panorama_speed", ffi.a(), ffj::a, ffi.m.a, 1.0, $$0x -> {
   });
   private static final xp aN = xp.c("options.accessibility.high_contrast.tooltip");
   private final ffi<Boolean> aO = ffi.a("options.accessibility.high_contrast", ffi.a(aN), false, $$0x -> {
      aua $$1x = fff.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final ffi<Boolean> aP = ffi.a(
      "options.accessibility.narrator_hotkey",
      ffi.a(fff.a ? xp.c("options.accessibility.narrator_hotkey.mac.tooltip") : xp.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cmy> aQ = EnumSet.allOf(cmy.class);
   private final ffi<btj> aR = new ffi<>("options.mainHand", ffi.a(), ffi.b(), new ffi.e<>(Arrays.asList(btj.values()), btj.c), btj.b, $$0x -> this.ax());
   public int o;
   public int p;
   private final ffi<Double> aS = new ffi<>(
      "options.chat.scale",
      ffi.a(),
      ($$0x, $$1x) -> (xp)($$1x == 0.0 ? xo.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      ffi.m.a,
      1.0,
      $$0x -> fff.Q().l.d().b()
   );
   private final ffi<Double> aT = new ffi<>("options.chat.width", ffi.a(), ($$0x, $$1x) -> b($$0x, fhf.a($$1x)), ffi.m.a, 1.0, $$0x -> fff.Q().l.d().b());
   private final ffi<Double> aU = new ffi<>(
      "options.chat.height.unfocused", ffi.a(), ($$0x, $$1x) -> b($$0x, fhf.b($$1x)), ffi.m.a, fhf.i(), $$0x -> fff.Q().l.d().b()
   );
   private final ffi<Double> aV = new ffi<>(
      "options.chat.height.focused", ffi.a(), ($$0x, $$1x) -> b($$0x, fhf.b($$1x)), ffi.m.a, 1.0, $$0x -> fff.Q().l.d().b()
   );
   private final ffi<Double> aW = new ffi<>(
      "options.chat.delay_instant",
      ffi.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xp.c("options.chat.delay_none") : xp.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new ffi.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fff.Q().aY().a($$0x)
   );
   private static final xp aX = xp.c("options.notifications.display_time.tooltip");
   private final ffi<Double> aY = new ffi<>(
      "options.notifications.display_time",
      ffi.a(aX),
      ($$0x, $$1x) -> a($$0x, xp.a("options.multiplier", $$1x)),
      new ffi.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final ffi<Integer> aZ = new ffi<>(
      "options.mipmapLevels", ffi.a(), ($$0x, $$1x) -> (xp)($$1x == 0 ? xo.a($$0x, false) : a($$0x, $$1x.intValue())), new ffi.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final ffi<fep> ba = new ffi<>(
      "options.attackIndicator", ffi.a(), ffi.b(), new ffi.e<>(Arrays.asList(fep.values()), Codec.INT.xmap(fep::a, fep::a)), fep.b, $$0x -> {
      }
   );
   public gva r = gva.a;
   public boolean s = false;
   public boolean t = false;
   private final ffi<Integer> bb = new ffi<>("options.biomeBlendRadius", ffi.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xp.c("options.biomeBlendRadius." + $$2x));
   }, new ffi.f(0, 7, false), 2, $$0x -> fff.Q().f.f());
   private final ffi<Double> bc = new ffi<>(
      "options.mouseWheelSensitivity",
      ffi.a(),
      ($$0x, $$1x) -> a($$0x, xp.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new ffi.f(-200, 100).a(ffj::c, ffj::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final ffi<Boolean> bd = ffi.a("options.rawMouseInput", true, $$0x -> {
      ezc $$1x = fff.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final ffi<Boolean> be = ffi.a("options.autoJump", false);
   private final ffi<Boolean> bf = ffi.a("options.operatorItemsTab", false);
   private final ffi<Boolean> bg = ffi.a("options.autoSuggestCommands", true);
   private final ffi<Boolean> bh = ffi.a("options.chat.color", true);
   private final ffi<Boolean> bi = ffi.a("options.chat.links", true);
   private final ffi<Boolean> bj = ffi.a("options.chat.links.prompt", true);
   private final ffi<Boolean> bk = ffi.a("options.vsync", true, $$0x -> {
      if (fff.Q().aO() != null) {
         fff.Q().aO().a($$0x);
      }
   });
   private final ffi<Boolean> bl = ffi.a("options.entityShadows", true);
   private final ffi<Boolean> bm = ffi.a("options.forceUnicodeFont", false, $$0x -> aE());
   private final ffi<Boolean> bn = ffi.a("options.japaneseGlyphVariants", ffi.a(xp.c("options.japaneseGlyphVariants.tooltip")), aF(), $$0x -> aE());
   private final ffi<Boolean> bo = ffi.a("options.invertMouse", false);
   private final ffi<Boolean> bp = ffi.a("options.discrete_mouse_scroll", false);
   private final ffi<Boolean> bq = ffi.a("options.realmsNotifications", true);
   private static final xp br = xp.c("options.allowServerListing.tooltip");
   private final ffi<Boolean> bs = ffi.a("options.allowServerListing", ffi.a(br), true, $$0x -> this.ax());
   private final ffi<Boolean> bt = ffi.a("options.reducedDebugInfo", false);
   private final Map<awb, ffi<Double>> bu = ac.a(new EnumMap<>(awb.class), $$0x -> {
      for (awb $$1x : awb.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final ffi<Boolean> bv = ffi.a("options.showSubtitles", false);
   private static final xp bw = xp.c("options.directionalAudio.on.tooltip");
   private static final xp bx = xp.c("options.directionalAudio.off.tooltip");
   private final ffi<Boolean> by = ffi.a("options.directionalAudio", $$0x -> $$0x ? fip.a(bw) : fip.a(bx), false, $$0x -> {
      gtv $$1x = fff.Q().aj();
      $$1x.k();
      $$1x.a(gsi.a(awa.Ao, 1.0F));
   });
   private final ffi<Boolean> bz = new ffi<>(
      "options.accessibility.text_background",
      ffi.a(),
      ($$0x, $$1x) -> $$1x ? xp.c("options.accessibility.text_background.chat") : xp.c("options.accessibility.text_background.everywhere"),
      ffi.a,
      true,
      $$0x -> {
      }
   );
   private final ffi<Boolean> bA = ffi.a("options.touchscreen", false);
   private final ffi<Boolean> bB = ffi.a("options.fullscreen", false, $$0x -> {
      fff $$1x = fff.Q();
      if ($$1x.aO() != null && $$1x.aO().j() != $$0x) {
         $$1x.aO().h();
         this.aa().a($$1x.aO().j());
      }
   });
   private final ffi<Boolean> bC = ffi.a("options.viewBobbing", true);
   private static final xp bD = xp.c("options.key.toggle");
   private static final xp bE = xp.c("options.key.hold");
   private final ffi<Boolean> bF = new ffi<>("key.sneak", ffi.a(), ($$0x, $$1x) -> $$1x ? bD : bE, ffi.a, false, $$0x -> {
   });
   private final ffi<Boolean> bG = new ffi<>("key.sprint", ffi.a(), ($$0x, $$1x) -> $$1x ? bD : bE, ffi.a, false, $$0x -> {
   });
   public boolean v;
   private static final xp bH = xp.c("options.hideMatchedNames.tooltip");
   private final ffi<Boolean> bI = ffi.a("options.hideMatchedNames", ffi.a(bH), true);
   private final ffi<Boolean> bJ = ffi.a("options.autosaveIndicator", true);
   private static final xp bK = xp.c("options.onlyShowSecureChat.tooltip");
   private final ffi<Boolean> bL = ffi.a("options.onlyShowSecureChat", ffi.a(bK), false);
   public final ffd w = new ffd("key.forward", 87, "key.categories.movement");
   public final ffd x = new ffd("key.left", 65, "key.categories.movement");
   public final ffd y = new ffd("key.back", 83, "key.categories.movement");
   public final ffd z = new ffd("key.right", 68, "key.categories.movement");
   public final ffd A = new ffd("key.jump", 32, "key.categories.movement");
   public final ffd B = new ffs("key.sneak", 340, "key.categories.movement", this.bF::c);
   public final ffd C = new ffs("key.sprint", 341, "key.categories.movement", this.bG::c);
   public final ffd D = new ffd("key.inventory", 69, "key.categories.inventory");
   public final ffd E = new ffd("key.swapOffhand", 70, "key.categories.inventory");
   public final ffd F = new ffd("key.drop", 81, "key.categories.inventory");
   public final ffd G = new ffd("key.use", eyt.b.c, 1, "key.categories.gameplay");
   public final ffd H = new ffd("key.attack", eyt.b.c, 0, "key.categories.gameplay");
   public final ffd I = new ffd("key.pickItem", eyt.b.c, 2, "key.categories.gameplay");
   public final ffd J = new ffd("key.chat", 84, "key.categories.multiplayer");
   public final ffd K = new ffd("key.playerlist", 258, "key.categories.multiplayer");
   public final ffd L = new ffd("key.command", 47, "key.categories.multiplayer");
   public final ffd M = new ffd("key.socialInteractions", 80, "key.categories.multiplayer");
   public final ffd N = new ffd("key.screenshot", 291, "key.categories.misc");
   public final ffd O = new ffd("key.togglePerspective", 294, "key.categories.misc");
   public final ffd P = new ffd("key.smoothCamera", eyt.bv.b(), "key.categories.misc");
   public final ffd Q = new ffd("key.fullscreen", 300, "key.categories.misc");
   public final ffd R = new ffd("key.spectatorOutlines", eyt.bv.b(), "key.categories.misc");
   public final ffd S = new ffd("key.advancements", 76, "key.categories.misc");
   public final ffd[] T = new ffd[]{
      new ffd("key.hotbar.1", 49, "key.categories.inventory"),
      new ffd("key.hotbar.2", 50, "key.categories.inventory"),
      new ffd("key.hotbar.3", 51, "key.categories.inventory"),
      new ffd("key.hotbar.4", 52, "key.categories.inventory"),
      new ffd("key.hotbar.5", 53, "key.categories.inventory"),
      new ffd("key.hotbar.6", 54, "key.categories.inventory"),
      new ffd("key.hotbar.7", 55, "key.categories.inventory"),
      new ffd("key.hotbar.8", 56, "key.categories.inventory"),
      new ffd("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final ffd U = new ffd("key.saveToolbarActivator", 67, "key.categories.creative");
   public final ffd V = new ffd("key.loadToolbarActivator", 88, "key.categories.creative");
   public final ffd[] W = (ffd[])ArrayUtils.addAll(
      new ffd[]{
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
   protected fff X;
   private final File bM;
   public boolean Y;
   private fer bN = fer.a;
   public String Z = "";
   public boolean aa;
   private final ffi<Integer> bO = new ffi<>("options.fov", ffi.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xp.c("options.fov.min"));
         case 110 -> a($$0x, xp.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new ffi.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fff.Q().f.r());
   private static final xp bP = xp.a("options.telemetry.button.tooltip", xp.c("options.telemetry.state.minimal"), xp.c("options.telemetry.state.all"));
   private final ffi<Boolean> bQ = ffi.a("options.telemetry.button", ffi.a(bP), ($$0x, $$1x) -> {
      fff $$2x = fff.Q();
      if (!$$2x.E()) {
         return xp.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xp.c("options.telemetry.state.all") : xp.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xp bR = xp.c("options.screenEffectScale.tooltip");
   private final ffi<Double> bS = new ffi<>("options.screenEffectScale", ffi.a(bR), ffj::b, ffi.m.a, 1.0, $$0x -> {
   });
   private static final xp bT = xp.c("options.fovEffectScale.tooltip");
   private final ffi<Double> bU = new ffi<>(
      "options.fovEffectScale", ffi.a(bT), ffj::b, ffi.m.a.a(ayz::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final xp bV = xp.c("options.darknessEffectScale.tooltip");
   private final ffi<Double> bW = new ffi<>("options.darknessEffectScale", ffi.a(bV), ffj::b, ffi.m.a.a(ayz::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final xp bX = xp.c("options.glintSpeed.tooltip");
   private final ffi<Double> bY = new ffi<>("options.glintSpeed", ffi.a(bX), ffj::b, ffi.m.a, 0.5, $$0x -> {
   });
   private static final xp bZ = xp.c("options.glintStrength.tooltip");
   private final ffi<Double> ca = new ffi<>("options.glintStrength", ffi.a(bZ), ffj::b, ffi.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final xp cb = xp.c("options.damageTiltStrength.tooltip");
   private final ffi<Double> cc = new ffi<>("options.damageTiltStrength", ffi.a(cb), ffj::b, ffi.m.a, 1.0, $$0x -> {
   });
   private final ffi<Double> cd = new ffi<>("options.gamma", ffi.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xp.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xp.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xp.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, ffi.m.a, 0.5, $$0x -> {
   });
   public static final int ab = 0;
   private static final int ce = 2147483646;
   private final ffi<Integer> cf = new ffi<>(
      "options.guiScale", ffi.a(), ($$0x, $$1x) -> $$1x == 0 ? xp.c("options.guiScale.auto") : xp.b(Integer.toString($$1x)), new ffi.c(0, () -> {
         fff $$0x = fff.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.X.a()
   );
   private final ffi<ffk> cg = new ffi<>(
      "options.particles", ffi.a(), ffi.b(), new ffi.e<>(Arrays.asList(ffk.values()), Codec.INT.xmap(ffk::a, ffk::a)), ffk.a, $$0x -> {
      }
   );
   private final ffi<ffh> ch = new ffi<>(
      "options.narrator",
      ffi.a(),
      ($$0x, $$1x) -> (xp)(this.X.aX().a() ? $$1x.b() : xp.c("options.narrator.notavailable")),
      new ffi.e<>(Arrays.asList(ffh.values()), Codec.INT.xmap(ffh::a, ffh::a)),
      ffh.a,
      $$0x -> this.X.aX().a($$0x)
   );
   public String ac = "en_us";
   private final ffi<String> ci = new ffi<>(
      "options.audioDevice",
      ffi.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xp.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xp.b($$1x.substring(gts.c)) : xp.b($$1x);
         }
      },
      new ffi.h<>(
         () -> Stream.concat(Stream.of(""), fff.Q().aj().a().stream()).toList(),
         $$0x -> fff.Q().r() && $$0x != "" && !fff.Q().aj().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gtv $$1x = fff.Q().aj();
         $$1x.k();
         $$1x.a(gsi.a(awa.Ao, 1.0F));
      }
   );
   public boolean ad = true;
   public boolean ae;

   public ffi<Boolean> a() {
      return this.ak;
   }

   public ffi<Boolean> b() {
      return this.am;
   }

   public ffi<Boolean> c() {
      return this.ao;
   }

   public ffi<Double> d() {
      return this.ap;
   }

   public ffi<Integer> e() {
      return this.aq;
   }

   public ffi<Integer> f() {
      return this.ar;
   }

   public ffi<Double> g() {
      return this.at;
   }

   public ffi<Integer> h() {
      return this.au;
   }

   public ffi<fet> i() {
      return this.av;
   }

   public ffi<fey> j() {
      return this.az;
   }

   public ffi<Boolean> k() {
      return this.aA;
   }

   public ffi<ffm> l() {
      return this.aE;
   }

   public void a(aua $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (atx $$2 : $$0.f()) {
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

   public ffi<cmv> m() {
      return this.aF;
   }

   public ffi<Double> n() {
      return this.aG;
   }

   public ffi<Double> o() {
      return this.aH;
   }

   public ffi<Double> p() {
      return this.aK;
   }

   public double q() {
      return this.p().c();
   }

   public ffi<Double> r() {
      return this.aL;
   }

   public ffi<Double> s() {
      return this.aM;
   }

   public ffi<Boolean> t() {
      return this.aO;
   }

   public ffi<Boolean> u() {
      return this.aP;
   }

   public ffi<btj> v() {
      return this.aR;
   }

   public ffi<Double> w() {
      return this.aS;
   }

   public ffi<Double> x() {
      return this.aT;
   }

   public ffi<Double> y() {
      return this.aU;
   }

   public ffi<Double> z() {
      return this.aV;
   }

   public ffi<Double> A() {
      return this.aW;
   }

   public ffi<Double> B() {
      return this.aY;
   }

   public ffi<Integer> C() {
      return this.aZ;
   }

   public ffi<fep> D() {
      return this.ba;
   }

   public ffi<Integer> E() {
      return this.bb;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ayz.a(Math.log10($$0) * 100.0);
   }

   public ffi<Double> F() {
      return this.bc;
   }

   public ffi<Boolean> G() {
      return this.bd;
   }

   public ffi<Boolean> H() {
      return this.be;
   }

   public ffi<Boolean> I() {
      return this.bf;
   }

   public ffi<Boolean> J() {
      return this.bg;
   }

   public ffi<Boolean> K() {
      return this.bh;
   }

   public ffi<Boolean> L() {
      return this.bi;
   }

   public ffi<Boolean> M() {
      return this.bj;
   }

   public ffi<Boolean> N() {
      return this.bk;
   }

   public ffi<Boolean> O() {
      return this.bl;
   }

   private static void aE() {
      fff $$0 = fff.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public ffi<Boolean> P() {
      return this.bm;
   }

   private static boolean aF() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public ffi<Boolean> Q() {
      return this.bn;
   }

   public ffi<Boolean> R() {
      return this.bo;
   }

   public ffi<Boolean> S() {
      return this.bp;
   }

   public ffi<Boolean> T() {
      return this.bq;
   }

   public ffi<Boolean> U() {
      return this.bs;
   }

   public ffi<Boolean> V() {
      return this.bt;
   }

   public final float a(awb $$0) {
      return this.b($$0).c().floatValue();
   }

   public final ffi<Double> b(awb $$0) {
      return Objects.requireNonNull(this.bu.get($$0));
   }

   private ffi<Double> a(String $$0, awb $$1) {
      return new ffi<>($$0, ffi.a(), ffj::b, ffi.m.a, 1.0, $$1x -> fff.Q().aj().a($$1, $$1x.floatValue()));
   }

   public ffi<Boolean> W() {
      return this.bv;
   }

   public ffi<Boolean> X() {
      return this.by;
   }

   public ffi<Boolean> Y() {
      return this.bz;
   }

   public ffi<Boolean> Z() {
      return this.bA;
   }

   public ffi<Boolean> aa() {
      return this.bB;
   }

   public ffi<Boolean> ab() {
      return this.bC;
   }

   public ffi<Boolean> ac() {
      return this.bF;
   }

   public ffi<Boolean> ad() {
      return this.bG;
   }

   public ffi<Boolean> ae() {
      return this.bI;
   }

   public ffi<Boolean> af() {
      return this.bJ;
   }

   public ffi<Boolean> ag() {
      return this.bL;
   }

   public ffi<Integer> ah() {
      return this.bO;
   }

   public ffi<Boolean> ai() {
      return this.bQ;
   }

   public ffi<Double> aj() {
      return this.bS;
   }

   public ffi<Double> ak() {
      return this.bU;
   }

   public ffi<Double> al() {
      return this.bW;
   }

   public ffi<Double> am() {
      return this.bY;
   }

   public ffi<Double> an() {
      return this.ca;
   }

   public ffi<Double> ao() {
      return this.cc;
   }

   public ffi<Double> ap() {
      return this.cd;
   }

   public ffi<Integer> aq() {
      return this.cf;
   }

   public ffi<ffk> ar() {
      return this.cg;
   }

   public ffi<ffh> as() {
      return this.ch;
   }

   public ffi<String> at() {
      return this.ci;
   }

   public ffj(fff $$0, File $$1) {
      this.X = $$0;
      this.bM = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new ffi<>(
         "options.renderDistance",
         ffi.a(),
         ($$0x, $$1x) -> a($$0x, xp.a("options.chunks", $$1x)),
         new ffi.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fff.Q().f.r()
      );
      this.ar = new ffi<>(
         "options.simulationDistance", ffi.a(), ($$0x, $$1x) -> a($$0x, xp.a("options.chunks", $$1x)), new ffi.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
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

   public void a(ffd $$0, eyt.a $$1) {
      $$0.b($$1);
      this.av();
   }

   private void a(ffj.b $$0) {
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

   private void a(ffj.a $$0) {
      this.a((ffj.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, ffj::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, ffj::c, ag::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, gva::a, gva::a);
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

      for (ffd $$1 : this.W) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(eyt.a($$3));
         }
      }

      for (awb $$4 : awb.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bu.get($$4));
      }

      for (cmy $$5 : cmy.values()) {
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

         us $$0 = new us();

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

         final us $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.az.a(fey.b);
            } else {
               this.az.a(fey.a);
            }
         }

         this.a(new ffj.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, ffi<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> ffj.af.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     ffj.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? ffj.a($$2) : $$1;
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
               } else if (ffj.a($$2)) {
                  return 1.0F;
               } else if (ffj.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     ffj.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         ffd.d();
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

   private us a(us $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return bag.e.a(this.X.as(), $$0, $$1);
   }

   public void av() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bM), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new ffj.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, ffi<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> ffj.af.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(ffj.ag.toJson($$2));
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

   public aqu aw() {
      int $$0 = 0;

      for (cmy $$1 : this.aQ) {
         $$0 |= $$1.a();
      }

      return new aqu(this.ac, this.aq.c(), this.aF.c(), this.bh.c(), $$0, this.aR.c(), this.X.aS(), this.bs.c());
   }

   public void ax() {
      if (this.X.s != null) {
         this.X.s.cz.b(new aao(this.aw()));
      }
   }

   private void b(cmy $$0, boolean $$1) {
      if ($$1) {
         this.aQ.add($$0);
      } else {
         this.aQ.remove($$0);
      }
   }

   public boolean a(cmy $$0) {
      return this.aQ.contains($$0);
   }

   public void a(cmy $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ax();
   }

   public fet ay() {
      return this.aD() >= 4 ? this.av.c() : fet.a;
   }

   public boolean az() {
      return this.q;
   }

   public void b(aua $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         atx $$4 = $$0.c($$3);
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

   public fer aA() {
      return this.bN;
   }

   public void a(fer $$0) {
      this.bN = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = ayp.a(ag, $$0, ah);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aB() {
      return this.bM;
   }

   public String aC() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new ffj.b() {
         @Override
         public <T> void a(String $$0x, ffi<T> $$1) {
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

   private static xp b(xp $$0, int $$1) {
      return xp.a("options.pixel_value", $$0, $$1);
   }

   private static xp a(xp $$0, double $$1) {
      return xp.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static xp a(xp $$0, xp $$1) {
      return xp.a("options.generic_value", $$0, $$1);
   }

   private static xp b(xp $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, xo.c) : a($$0, $$1);
   }

   public static xp a(xp $$0, int $$1) {
      return a($$0, xp.b(Integer.toString($$1)));
   }

   interface a extends ffj.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, ffi<T> var2);
   }
}
