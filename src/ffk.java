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

public class ffk {
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
   private final ffj<Boolean> ak = ffj.a("options.darkMojangStudiosBackgroundColor", ffj.a(aj), false);
   private static final xp al = xp.c("options.hideLightningFlashes.tooltip");
   private final ffj<Boolean> am = ffj.a("options.hideLightningFlashes", ffj.a(al), false);
   private static final xp an = xp.c("options.hideSplashTexts.tooltip");
   private final ffj<Boolean> ao = ffj.a("options.hideSplashTexts", ffj.a(an), false);
   private final ffj<Double> ap = new ffj<>("options.sensitivity", ffj.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xp.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xp.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, ffj.m.a, 0.5, $$0x -> {
   });
   private final ffj<Integer> aq;
   private final ffj<Integer> ar;
   private int as = 0;
   private final ffj<Double> at = new ffj<>(
      "options.entityDistanceScaling",
      ffj.a(),
      ffk::a,
      new ffj.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final ffj<Integer> au = new ffj<>(
      "options.framerateLimit",
      ffj.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xp.c("options.framerateLimit.max")) : a($$0x, xp.a("options.framerate", $$1x)),
      new ffj.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> ffg.Q().aO().a($$0x)
   );
   private final ffj<feu> av = new ffj<>(
      "options.renderClouds",
      ffj.a(),
      ffj.b(),
      new ffj.e<>(Arrays.asList(feu.values()), Codec.withAlternative(feu.d, Codec.BOOL, $$0x -> $$0x ? feu.c : feu.a)),
      feu.c,
      $$0x -> {
         if (ffg.O()) {
            eyl $$1x = ffg.Q().f.x();
            if ($$1x != null) {
               $$1x.b(ffg.a);
            }
         }
      }
   );
   private static final xp aw = xp.c("options.graphics.fast.tooltip");
   private static final xp ax = xp.a("options.graphics.fabulous.tooltip", xp.c("options.graphics.fabulous").a(n.u));
   private static final xp ay = xp.c("options.graphics.fancy.tooltip");
   private final ffj<fez> az = new ffj<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fiq.a(ay);
            case a -> fiq.a(aw);
            case c -> fiq.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         yd $$2x = xp.c($$1x.b());
         return $$1x == fez.c ? $$2x.a(n.u) : $$2x;
      },
      new ffj.a<>(
         Arrays.asList(fez.values()),
         Stream.of(fez.values()).filter($$0x -> $$0x != fez.c).collect(Collectors.toList()),
         () -> ffg.Q().r() && ffg.Q().ai().h(),
         ($$0x, $$1x) -> {
            ffg $$2x = ffg.Q();
            gdj $$3 = $$2x.ai();
            if ($$1x == fez.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(fez::a, fez::a)
      ),
      fez.b,
      $$0x -> {
      }
   );
   private final ffj<Boolean> aA = ffj.a("options.ao", true, $$0x -> ffg.Q().f.f());
   private static final xp aB = xp.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xp aC = xp.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xp aD = xp.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final ffj<ffn> aE = new ffj<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fiq.a(aB);
         case b -> fiq.a(aC);
         case c -> fiq.a(aD);
      };
   }, ffj.b(), new ffj.e<>(Arrays.asList(ffn.values()), Codec.INT.xmap(ffn::a, ffn::a)), ffn.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final ffj<cmw> aF = new ffj<>(
      "options.chat.visibility", ffj.a(), ffj.b(), new ffj.e<>(Arrays.asList(cmw.values()), Codec.INT.xmap(cmw::a, cmw::a)), cmw.a, $$0x -> {
      }
   );
   private final ffj<Double> aG = new ffj<>("options.chat.opacity", ffj.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), ffj.m.a, 1.0, $$0x -> ffg.Q().l.d().b());
   private final ffj<Double> aH = new ffj<>("options.chat.line_spacing", ffj.a(), ffk::a, ffj.m.a, 0.0, $$0x -> {
   });
   private static final xp aI = xp.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final double aJ = 0.5;
   private final ffj<Double> aK = new ffj<>("options.accessibility.menu_background_blurriness", ffj.a(aI), ffk::b, ffj.m.a, 0.5, $$0x -> {
   });
   private final ffj<Double> aL = new ffj<>("options.accessibility.text_background_opacity", ffj.a(), ffk::a, ffj.m.a, 0.5, $$0x -> ffg.Q().l.d().b());
   private final ffj<Double> aM = new ffj<>("options.accessibility.panorama_speed", ffj.a(), ffk::a, ffj.m.a, 1.0, $$0x -> {
   });
   private static final xp aN = xp.c("options.accessibility.high_contrast.tooltip");
   private final ffj<Boolean> aO = ffj.a("options.accessibility.high_contrast", ffj.a(aN), false, $$0x -> {
      aua $$1x = ffg.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final ffj<Boolean> aP = ffj.a(
      "options.accessibility.narrator_hotkey",
      ffj.a(ffg.a ? xp.c("options.accessibility.narrator_hotkey.mac.tooltip") : xp.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cmz> aQ = EnumSet.allOf(cmz.class);
   private final ffj<btk> aR = new ffj<>("options.mainHand", ffj.a(), ffj.b(), new ffj.e<>(Arrays.asList(btk.values()), btk.c), btk.b, $$0x -> this.ax());
   public int o;
   public int p;
   private final ffj<Double> aS = new ffj<>(
      "options.chat.scale",
      ffj.a(),
      ($$0x, $$1x) -> (xp)($$1x == 0.0 ? xo.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      ffj.m.a,
      1.0,
      $$0x -> ffg.Q().l.d().b()
   );
   private final ffj<Double> aT = new ffj<>("options.chat.width", ffj.a(), ($$0x, $$1x) -> b($$0x, fhg.a($$1x)), ffj.m.a, 1.0, $$0x -> ffg.Q().l.d().b());
   private final ffj<Double> aU = new ffj<>(
      "options.chat.height.unfocused", ffj.a(), ($$0x, $$1x) -> b($$0x, fhg.b($$1x)), ffj.m.a, fhg.i(), $$0x -> ffg.Q().l.d().b()
   );
   private final ffj<Double> aV = new ffj<>(
      "options.chat.height.focused", ffj.a(), ($$0x, $$1x) -> b($$0x, fhg.b($$1x)), ffj.m.a, 1.0, $$0x -> ffg.Q().l.d().b()
   );
   private final ffj<Double> aW = new ffj<>(
      "options.chat.delay_instant",
      ffj.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xp.c("options.chat.delay_none") : xp.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new ffj.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> ffg.Q().aY().a($$0x)
   );
   private static final xp aX = xp.c("options.notifications.display_time.tooltip");
   private final ffj<Double> aY = new ffj<>(
      "options.notifications.display_time",
      ffj.a(aX),
      ($$0x, $$1x) -> a($$0x, xp.a("options.multiplier", $$1x)),
      new ffj.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final ffj<Integer> aZ = new ffj<>(
      "options.mipmapLevels", ffj.a(), ($$0x, $$1x) -> (xp)($$1x == 0 ? xo.a($$0x, false) : a($$0x, $$1x.intValue())), new ffj.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final ffj<feq> ba = new ffj<>(
      "options.attackIndicator", ffj.a(), ffj.b(), new ffj.e<>(Arrays.asList(feq.values()), Codec.INT.xmap(feq::a, feq::a)), feq.b, $$0x -> {
      }
   );
   public gvb r = gvb.a;
   public boolean s = false;
   public boolean t = false;
   private final ffj<Integer> bb = new ffj<>("options.biomeBlendRadius", ffj.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xp.c("options.biomeBlendRadius." + $$2x));
   }, new ffj.f(0, 7, false), 2, $$0x -> ffg.Q().f.f());
   private final ffj<Double> bc = new ffj<>(
      "options.mouseWheelSensitivity",
      ffj.a(),
      ($$0x, $$1x) -> a($$0x, xp.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new ffj.f(-200, 100).a(ffk::c, ffk::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final ffj<Boolean> bd = ffj.a("options.rawMouseInput", true, $$0x -> {
      ezd $$1x = ffg.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final ffj<Boolean> be = ffj.a("options.autoJump", false);
   private final ffj<Boolean> bf = ffj.a("options.operatorItemsTab", false);
   private final ffj<Boolean> bg = ffj.a("options.autoSuggestCommands", true);
   private final ffj<Boolean> bh = ffj.a("options.chat.color", true);
   private final ffj<Boolean> bi = ffj.a("options.chat.links", true);
   private final ffj<Boolean> bj = ffj.a("options.chat.links.prompt", true);
   private final ffj<Boolean> bk = ffj.a("options.vsync", true, $$0x -> {
      if (ffg.Q().aO() != null) {
         ffg.Q().aO().a($$0x);
      }
   });
   private final ffj<Boolean> bl = ffj.a("options.entityShadows", true);
   private final ffj<Boolean> bm = ffj.a("options.forceUnicodeFont", false, $$0x -> aE());
   private final ffj<Boolean> bn = ffj.a("options.japaneseGlyphVariants", ffj.a(xp.c("options.japaneseGlyphVariants.tooltip")), aF(), $$0x -> aE());
   private final ffj<Boolean> bo = ffj.a("options.invertMouse", false);
   private final ffj<Boolean> bp = ffj.a("options.discrete_mouse_scroll", false);
   private final ffj<Boolean> bq = ffj.a("options.realmsNotifications", true);
   private static final xp br = xp.c("options.allowServerListing.tooltip");
   private final ffj<Boolean> bs = ffj.a("options.allowServerListing", ffj.a(br), true, $$0x -> this.ax());
   private final ffj<Boolean> bt = ffj.a("options.reducedDebugInfo", false);
   private final Map<awb, ffj<Double>> bu = ac.a(new EnumMap<>(awb.class), $$0x -> {
      for (awb $$1x : awb.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final ffj<Boolean> bv = ffj.a("options.showSubtitles", false);
   private static final xp bw = xp.c("options.directionalAudio.on.tooltip");
   private static final xp bx = xp.c("options.directionalAudio.off.tooltip");
   private final ffj<Boolean> by = ffj.a("options.directionalAudio", $$0x -> $$0x ? fiq.a(bw) : fiq.a(bx), false, $$0x -> {
      gtw $$1x = ffg.Q().aj();
      $$1x.k();
      $$1x.a(gsj.a(awa.Ao, 1.0F));
   });
   private final ffj<Boolean> bz = new ffj<>(
      "options.accessibility.text_background",
      ffj.a(),
      ($$0x, $$1x) -> $$1x ? xp.c("options.accessibility.text_background.chat") : xp.c("options.accessibility.text_background.everywhere"),
      ffj.a,
      true,
      $$0x -> {
      }
   );
   private final ffj<Boolean> bA = ffj.a("options.touchscreen", false);
   private final ffj<Boolean> bB = ffj.a("options.fullscreen", false, $$0x -> {
      ffg $$1x = ffg.Q();
      if ($$1x.aO() != null && $$1x.aO().j() != $$0x) {
         $$1x.aO().h();
         this.aa().a($$1x.aO().j());
      }
   });
   private final ffj<Boolean> bC = ffj.a("options.viewBobbing", true);
   private static final xp bD = xp.c("options.key.toggle");
   private static final xp bE = xp.c("options.key.hold");
   private final ffj<Boolean> bF = new ffj<>("key.sneak", ffj.a(), ($$0x, $$1x) -> $$1x ? bD : bE, ffj.a, false, $$0x -> {
   });
   private final ffj<Boolean> bG = new ffj<>("key.sprint", ffj.a(), ($$0x, $$1x) -> $$1x ? bD : bE, ffj.a, false, $$0x -> {
   });
   public boolean v;
   private static final xp bH = xp.c("options.hideMatchedNames.tooltip");
   private final ffj<Boolean> bI = ffj.a("options.hideMatchedNames", ffj.a(bH), true);
   private final ffj<Boolean> bJ = ffj.a("options.autosaveIndicator", true);
   private static final xp bK = xp.c("options.onlyShowSecureChat.tooltip");
   private final ffj<Boolean> bL = ffj.a("options.onlyShowSecureChat", ffj.a(bK), false);
   public final ffe w = new ffe("key.forward", 87, "key.categories.movement");
   public final ffe x = new ffe("key.left", 65, "key.categories.movement");
   public final ffe y = new ffe("key.back", 83, "key.categories.movement");
   public final ffe z = new ffe("key.right", 68, "key.categories.movement");
   public final ffe A = new ffe("key.jump", 32, "key.categories.movement");
   public final ffe B = new fft("key.sneak", 340, "key.categories.movement", this.bF::c);
   public final ffe C = new fft("key.sprint", 341, "key.categories.movement", this.bG::c);
   public final ffe D = new ffe("key.inventory", 69, "key.categories.inventory");
   public final ffe E = new ffe("key.swapOffhand", 70, "key.categories.inventory");
   public final ffe F = new ffe("key.drop", 81, "key.categories.inventory");
   public final ffe G = new ffe("key.use", eyu.b.c, 1, "key.categories.gameplay");
   public final ffe H = new ffe("key.attack", eyu.b.c, 0, "key.categories.gameplay");
   public final ffe I = new ffe("key.pickItem", eyu.b.c, 2, "key.categories.gameplay");
   public final ffe J = new ffe("key.chat", 84, "key.categories.multiplayer");
   public final ffe K = new ffe("key.playerlist", 258, "key.categories.multiplayer");
   public final ffe L = new ffe("key.command", 47, "key.categories.multiplayer");
   public final ffe M = new ffe("key.socialInteractions", 80, "key.categories.multiplayer");
   public final ffe N = new ffe("key.screenshot", 291, "key.categories.misc");
   public final ffe O = new ffe("key.togglePerspective", 294, "key.categories.misc");
   public final ffe P = new ffe("key.smoothCamera", eyu.bv.b(), "key.categories.misc");
   public final ffe Q = new ffe("key.fullscreen", 300, "key.categories.misc");
   public final ffe R = new ffe("key.spectatorOutlines", eyu.bv.b(), "key.categories.misc");
   public final ffe S = new ffe("key.advancements", 76, "key.categories.misc");
   public final ffe[] T = new ffe[]{
      new ffe("key.hotbar.1", 49, "key.categories.inventory"),
      new ffe("key.hotbar.2", 50, "key.categories.inventory"),
      new ffe("key.hotbar.3", 51, "key.categories.inventory"),
      new ffe("key.hotbar.4", 52, "key.categories.inventory"),
      new ffe("key.hotbar.5", 53, "key.categories.inventory"),
      new ffe("key.hotbar.6", 54, "key.categories.inventory"),
      new ffe("key.hotbar.7", 55, "key.categories.inventory"),
      new ffe("key.hotbar.8", 56, "key.categories.inventory"),
      new ffe("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final ffe U = new ffe("key.saveToolbarActivator", 67, "key.categories.creative");
   public final ffe V = new ffe("key.loadToolbarActivator", 88, "key.categories.creative");
   public final ffe[] W = (ffe[])ArrayUtils.addAll(
      new ffe[]{
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
   protected ffg X;
   private final File bM;
   public boolean Y;
   private fes bN = fes.a;
   public String Z = "";
   public boolean aa;
   private final ffj<Integer> bO = new ffj<>("options.fov", ffj.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xp.c("options.fov.min"));
         case 110 -> a($$0x, xp.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new ffj.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> ffg.Q().f.r());
   private static final xp bP = xp.a("options.telemetry.button.tooltip", xp.c("options.telemetry.state.minimal"), xp.c("options.telemetry.state.all"));
   private final ffj<Boolean> bQ = ffj.a("options.telemetry.button", ffj.a(bP), ($$0x, $$1x) -> {
      ffg $$2x = ffg.Q();
      if (!$$2x.E()) {
         return xp.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xp.c("options.telemetry.state.all") : xp.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xp bR = xp.c("options.screenEffectScale.tooltip");
   private final ffj<Double> bS = new ffj<>("options.screenEffectScale", ffj.a(bR), ffk::b, ffj.m.a, 1.0, $$0x -> {
   });
   private static final xp bT = xp.c("options.fovEffectScale.tooltip");
   private final ffj<Double> bU = new ffj<>(
      "options.fovEffectScale", ffj.a(bT), ffk::b, ffj.m.a.a(ayz::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final xp bV = xp.c("options.darknessEffectScale.tooltip");
   private final ffj<Double> bW = new ffj<>("options.darknessEffectScale", ffj.a(bV), ffk::b, ffj.m.a.a(ayz::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final xp bX = xp.c("options.glintSpeed.tooltip");
   private final ffj<Double> bY = new ffj<>("options.glintSpeed", ffj.a(bX), ffk::b, ffj.m.a, 0.5, $$0x -> {
   });
   private static final xp bZ = xp.c("options.glintStrength.tooltip");
   private final ffj<Double> ca = new ffj<>("options.glintStrength", ffj.a(bZ), ffk::b, ffj.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final xp cb = xp.c("options.damageTiltStrength.tooltip");
   private final ffj<Double> cc = new ffj<>("options.damageTiltStrength", ffj.a(cb), ffk::b, ffj.m.a, 1.0, $$0x -> {
   });
   private final ffj<Double> cd = new ffj<>("options.gamma", ffj.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xp.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xp.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xp.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, ffj.m.a, 0.5, $$0x -> {
   });
   public static final int ab = 0;
   private static final int ce = 2147483646;
   private final ffj<Integer> cf = new ffj<>(
      "options.guiScale", ffj.a(), ($$0x, $$1x) -> $$1x == 0 ? xp.c("options.guiScale.auto") : xp.b(Integer.toString($$1x)), new ffj.c(0, () -> {
         ffg $$0x = ffg.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.X.a()
   );
   private final ffj<ffl> cg = new ffj<>(
      "options.particles", ffj.a(), ffj.b(), new ffj.e<>(Arrays.asList(ffl.values()), Codec.INT.xmap(ffl::a, ffl::a)), ffl.a, $$0x -> {
      }
   );
   private final ffj<ffi> ch = new ffj<>(
      "options.narrator",
      ffj.a(),
      ($$0x, $$1x) -> (xp)(this.X.aX().a() ? $$1x.b() : xp.c("options.narrator.notavailable")),
      new ffj.e<>(Arrays.asList(ffi.values()), Codec.INT.xmap(ffi::a, ffi::a)),
      ffi.a,
      $$0x -> this.X.aX().a($$0x)
   );
   public String ac = "en_us";
   private final ffj<String> ci = new ffj<>(
      "options.audioDevice",
      ffj.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xp.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xp.b($$1x.substring(gtt.c)) : xp.b($$1x);
         }
      },
      new ffj.h<>(
         () -> Stream.concat(Stream.of(""), ffg.Q().aj().a().stream()).toList(),
         $$0x -> ffg.Q().r() && $$0x != "" && !ffg.Q().aj().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gtw $$1x = ffg.Q().aj();
         $$1x.k();
         $$1x.a(gsj.a(awa.Ao, 1.0F));
      }
   );
   public boolean ad = true;
   public boolean ae;

   public ffj<Boolean> a() {
      return this.ak;
   }

   public ffj<Boolean> b() {
      return this.am;
   }

   public ffj<Boolean> c() {
      return this.ao;
   }

   public ffj<Double> d() {
      return this.ap;
   }

   public ffj<Integer> e() {
      return this.aq;
   }

   public ffj<Integer> f() {
      return this.ar;
   }

   public ffj<Double> g() {
      return this.at;
   }

   public ffj<Integer> h() {
      return this.au;
   }

   public ffj<feu> i() {
      return this.av;
   }

   public ffj<fez> j() {
      return this.az;
   }

   public ffj<Boolean> k() {
      return this.aA;
   }

   public ffj<ffn> l() {
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

   public ffj<cmw> m() {
      return this.aF;
   }

   public ffj<Double> n() {
      return this.aG;
   }

   public ffj<Double> o() {
      return this.aH;
   }

   public ffj<Double> p() {
      return this.aK;
   }

   public double q() {
      return this.p().c();
   }

   public ffj<Double> r() {
      return this.aL;
   }

   public ffj<Double> s() {
      return this.aM;
   }

   public ffj<Boolean> t() {
      return this.aO;
   }

   public ffj<Boolean> u() {
      return this.aP;
   }

   public ffj<btk> v() {
      return this.aR;
   }

   public ffj<Double> w() {
      return this.aS;
   }

   public ffj<Double> x() {
      return this.aT;
   }

   public ffj<Double> y() {
      return this.aU;
   }

   public ffj<Double> z() {
      return this.aV;
   }

   public ffj<Double> A() {
      return this.aW;
   }

   public ffj<Double> B() {
      return this.aY;
   }

   public ffj<Integer> C() {
      return this.aZ;
   }

   public ffj<feq> D() {
      return this.ba;
   }

   public ffj<Integer> E() {
      return this.bb;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ayz.a(Math.log10($$0) * 100.0);
   }

   public ffj<Double> F() {
      return this.bc;
   }

   public ffj<Boolean> G() {
      return this.bd;
   }

   public ffj<Boolean> H() {
      return this.be;
   }

   public ffj<Boolean> I() {
      return this.bf;
   }

   public ffj<Boolean> J() {
      return this.bg;
   }

   public ffj<Boolean> K() {
      return this.bh;
   }

   public ffj<Boolean> L() {
      return this.bi;
   }

   public ffj<Boolean> M() {
      return this.bj;
   }

   public ffj<Boolean> N() {
      return this.bk;
   }

   public ffj<Boolean> O() {
      return this.bl;
   }

   private static void aE() {
      ffg $$0 = ffg.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public ffj<Boolean> P() {
      return this.bm;
   }

   private static boolean aF() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public ffj<Boolean> Q() {
      return this.bn;
   }

   public ffj<Boolean> R() {
      return this.bo;
   }

   public ffj<Boolean> S() {
      return this.bp;
   }

   public ffj<Boolean> T() {
      return this.bq;
   }

   public ffj<Boolean> U() {
      return this.bs;
   }

   public ffj<Boolean> V() {
      return this.bt;
   }

   public final float a(awb $$0) {
      return this.b($$0).c().floatValue();
   }

   public final ffj<Double> b(awb $$0) {
      return Objects.requireNonNull(this.bu.get($$0));
   }

   private ffj<Double> a(String $$0, awb $$1) {
      return new ffj<>($$0, ffj.a(), ffk::b, ffj.m.a, 1.0, $$1x -> ffg.Q().aj().a($$1, $$1x.floatValue()));
   }

   public ffj<Boolean> W() {
      return this.bv;
   }

   public ffj<Boolean> X() {
      return this.by;
   }

   public ffj<Boolean> Y() {
      return this.bz;
   }

   public ffj<Boolean> Z() {
      return this.bA;
   }

   public ffj<Boolean> aa() {
      return this.bB;
   }

   public ffj<Boolean> ab() {
      return this.bC;
   }

   public ffj<Boolean> ac() {
      return this.bF;
   }

   public ffj<Boolean> ad() {
      return this.bG;
   }

   public ffj<Boolean> ae() {
      return this.bI;
   }

   public ffj<Boolean> af() {
      return this.bJ;
   }

   public ffj<Boolean> ag() {
      return this.bL;
   }

   public ffj<Integer> ah() {
      return this.bO;
   }

   public ffj<Boolean> ai() {
      return this.bQ;
   }

   public ffj<Double> aj() {
      return this.bS;
   }

   public ffj<Double> ak() {
      return this.bU;
   }

   public ffj<Double> al() {
      return this.bW;
   }

   public ffj<Double> am() {
      return this.bY;
   }

   public ffj<Double> an() {
      return this.ca;
   }

   public ffj<Double> ao() {
      return this.cc;
   }

   public ffj<Double> ap() {
      return this.cd;
   }

   public ffj<Integer> aq() {
      return this.cf;
   }

   public ffj<ffl> ar() {
      return this.cg;
   }

   public ffj<ffi> as() {
      return this.ch;
   }

   public ffj<String> at() {
      return this.ci;
   }

   public ffk(ffg $$0, File $$1) {
      this.X = $$0;
      this.bM = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new ffj<>(
         "options.renderDistance",
         ffj.a(),
         ($$0x, $$1x) -> a($$0x, xp.a("options.chunks", $$1x)),
         new ffj.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> ffg.Q().f.r()
      );
      this.ar = new ffj<>(
         "options.simulationDistance", ffj.a(), ($$0x, $$1x) -> a($$0x, xp.a("options.chunks", $$1x)), new ffj.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
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

   public void a(ffe $$0, eyu.a $$1) {
      $$0.b($$1);
      this.av();
   }

   private void a(ffk.b $$0) {
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

   private void a(ffk.a $$0) {
      this.a((ffk.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, ffk::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, ffk::c, ag::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, gvb::a, gvb::a);
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

      for (ffe $$1 : this.W) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(eyu.a($$3));
         }
      }

      for (awb $$4 : awb.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bu.get($$4));
      }

      for (cmz $$5 : cmz.values()) {
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
               this.az.a(fez.b);
            } else {
               this.az.a(fez.a);
            }
         }

         this.a(new ffk.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, ffj<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> ffk.af.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     ffk.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? ffk.a($$2) : $$1;
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
               } else if (ffk.a($$2)) {
                  return 1.0F;
               } else if (ffk.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     ffk.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         ffe.d();
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
         this.a(new ffk.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, ffj<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> ffk.af.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(ffk.ag.toJson($$2));
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

      for (cmz $$1 : this.aQ) {
         $$0 |= $$1.a();
      }

      return new aqu(this.ac, this.aq.c(), this.aF.c(), this.bh.c(), $$0, this.aR.c(), this.X.aS(), this.bs.c());
   }

   public void ax() {
      if (this.X.s != null) {
         this.X.s.cz.b(new aao(this.aw()));
      }
   }

   private void b(cmz $$0, boolean $$1) {
      if ($$1) {
         this.aQ.add($$0);
      } else {
         this.aQ.remove($$0);
      }
   }

   public boolean a(cmz $$0) {
      return this.aQ.contains($$0);
   }

   public void a(cmz $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ax();
   }

   public feu ay() {
      return this.aD() >= 4 ? this.av.c() : feu.a;
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

   public fes aA() {
      return this.bN;
   }

   public void a(fes $$0) {
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
      this.a(new ffk.b() {
         @Override
         public <T> void a(String $$0x, ffj<T> $$1) {
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

   interface a extends ffk.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, ffj<T> var2);
   }
}
