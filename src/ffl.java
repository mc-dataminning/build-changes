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

public class ffl {
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
   private final ffk<Boolean> ak = ffk.a("options.darkMojangStudiosBackgroundColor", ffk.a(aj), false);
   private static final xp al = xp.c("options.hideLightningFlashes.tooltip");
   private final ffk<Boolean> am = ffk.a("options.hideLightningFlashes", ffk.a(al), false);
   private static final xp an = xp.c("options.hideSplashTexts.tooltip");
   private final ffk<Boolean> ao = ffk.a("options.hideSplashTexts", ffk.a(an), false);
   private final ffk<Double> ap = new ffk<>("options.sensitivity", ffk.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xp.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xp.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, ffk.m.a, 0.5, $$0x -> {
   });
   private final ffk<Integer> aq;
   private final ffk<Integer> ar;
   private int as = 0;
   private final ffk<Double> at = new ffk<>(
      "options.entityDistanceScaling",
      ffk.a(),
      ffl::a,
      new ffk.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final ffk<Integer> au = new ffk<>(
      "options.framerateLimit",
      ffk.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xp.c("options.framerateLimit.max")) : a($$0x, xp.a("options.framerate", $$1x)),
      new ffk.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> ffh.Q().aO().a($$0x)
   );
   private final ffk<fev> av = new ffk<>(
      "options.renderClouds",
      ffk.a(),
      ffk.b(),
      new ffk.e<>(Arrays.asList(fev.values()), Codec.withAlternative(fev.d, Codec.BOOL, $$0x -> $$0x ? fev.c : fev.a)),
      fev.c,
      $$0x -> {
         if (ffh.O()) {
            eym $$1x = ffh.Q().f.x();
            if ($$1x != null) {
               $$1x.b(ffh.a);
            }
         }
      }
   );
   private static final xp aw = xp.c("options.graphics.fast.tooltip");
   private static final xp ax = xp.a("options.graphics.fabulous.tooltip", xp.c("options.graphics.fabulous").a(n.u));
   private static final xp ay = xp.c("options.graphics.fancy.tooltip");
   private final ffk<ffa> az = new ffk<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fir.a(ay);
            case a -> fir.a(aw);
            case c -> fir.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         yd $$2x = xp.c($$1x.b());
         return $$1x == ffa.c ? $$2x.a(n.u) : $$2x;
      },
      new ffk.a<>(
         Arrays.asList(ffa.values()),
         Stream.of(ffa.values()).filter($$0x -> $$0x != ffa.c).collect(Collectors.toList()),
         () -> ffh.Q().r() && ffh.Q().ai().h(),
         ($$0x, $$1x) -> {
            ffh $$2x = ffh.Q();
            gdk $$3 = $$2x.ai();
            if ($$1x == ffa.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(ffa::a, ffa::a)
      ),
      ffa.b,
      $$0x -> {
      }
   );
   private final ffk<Boolean> aA = ffk.a("options.ao", true, $$0x -> ffh.Q().f.f());
   private static final xp aB = xp.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xp aC = xp.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xp aD = xp.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final ffk<ffo> aE = new ffk<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fir.a(aB);
         case b -> fir.a(aC);
         case c -> fir.a(aD);
      };
   }, ffk.b(), new ffk.e<>(Arrays.asList(ffo.values()), Codec.INT.xmap(ffo::a, ffo::a)), ffo.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final ffk<cmx> aF = new ffk<>(
      "options.chat.visibility", ffk.a(), ffk.b(), new ffk.e<>(Arrays.asList(cmx.values()), Codec.INT.xmap(cmx::a, cmx::a)), cmx.a, $$0x -> {
      }
   );
   private final ffk<Double> aG = new ffk<>("options.chat.opacity", ffk.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), ffk.m.a, 1.0, $$0x -> ffh.Q().l.d().b());
   private final ffk<Double> aH = new ffk<>("options.chat.line_spacing", ffk.a(), ffl::a, ffk.m.a, 0.0, $$0x -> {
   });
   private static final xp aI = xp.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final double aJ = 0.5;
   private final ffk<Double> aK = new ffk<>("options.accessibility.menu_background_blurriness", ffk.a(aI), ffl::b, ffk.m.a, 0.5, $$0x -> {
   });
   private final ffk<Double> aL = new ffk<>("options.accessibility.text_background_opacity", ffk.a(), ffl::a, ffk.m.a, 0.5, $$0x -> ffh.Q().l.d().b());
   private final ffk<Double> aM = new ffk<>("options.accessibility.panorama_speed", ffk.a(), ffl::a, ffk.m.a, 1.0, $$0x -> {
   });
   private static final xp aN = xp.c("options.accessibility.high_contrast.tooltip");
   private final ffk<Boolean> aO = ffk.a("options.accessibility.high_contrast", ffk.a(aN), false, $$0x -> {
      aua $$1x = ffh.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final ffk<Boolean> aP = ffk.a(
      "options.accessibility.narrator_hotkey",
      ffk.a(ffh.a ? xp.c("options.accessibility.narrator_hotkey.mac.tooltip") : xp.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cna> aQ = EnumSet.allOf(cna.class);
   private final ffk<btl> aR = new ffk<>("options.mainHand", ffk.a(), ffk.b(), new ffk.e<>(Arrays.asList(btl.values()), btl.c), btl.b, $$0x -> this.ax());
   public int o;
   public int p;
   private final ffk<Double> aS = new ffk<>(
      "options.chat.scale",
      ffk.a(),
      ($$0x, $$1x) -> (xp)($$1x == 0.0 ? xo.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      ffk.m.a,
      1.0,
      $$0x -> ffh.Q().l.d().b()
   );
   private final ffk<Double> aT = new ffk<>("options.chat.width", ffk.a(), ($$0x, $$1x) -> b($$0x, fhh.a($$1x)), ffk.m.a, 1.0, $$0x -> ffh.Q().l.d().b());
   private final ffk<Double> aU = new ffk<>(
      "options.chat.height.unfocused", ffk.a(), ($$0x, $$1x) -> b($$0x, fhh.b($$1x)), ffk.m.a, fhh.i(), $$0x -> ffh.Q().l.d().b()
   );
   private final ffk<Double> aV = new ffk<>(
      "options.chat.height.focused", ffk.a(), ($$0x, $$1x) -> b($$0x, fhh.b($$1x)), ffk.m.a, 1.0, $$0x -> ffh.Q().l.d().b()
   );
   private final ffk<Double> aW = new ffk<>(
      "options.chat.delay_instant",
      ffk.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xp.c("options.chat.delay_none") : xp.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new ffk.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> ffh.Q().aY().a($$0x)
   );
   private static final xp aX = xp.c("options.notifications.display_time.tooltip");
   private final ffk<Double> aY = new ffk<>(
      "options.notifications.display_time",
      ffk.a(aX),
      ($$0x, $$1x) -> a($$0x, xp.a("options.multiplier", $$1x)),
      new ffk.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final ffk<Integer> aZ = new ffk<>(
      "options.mipmapLevels", ffk.a(), ($$0x, $$1x) -> (xp)($$1x == 0 ? xo.a($$0x, false) : a($$0x, $$1x.intValue())), new ffk.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final ffk<fer> ba = new ffk<>(
      "options.attackIndicator", ffk.a(), ffk.b(), new ffk.e<>(Arrays.asList(fer.values()), Codec.INT.xmap(fer::a, fer::a)), fer.b, $$0x -> {
      }
   );
   public gvc r = gvc.a;
   public boolean s = false;
   public boolean t = false;
   private final ffk<Integer> bb = new ffk<>("options.biomeBlendRadius", ffk.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xp.c("options.biomeBlendRadius." + $$2x));
   }, new ffk.f(0, 7, false), 2, $$0x -> ffh.Q().f.f());
   private final ffk<Double> bc = new ffk<>(
      "options.mouseWheelSensitivity",
      ffk.a(),
      ($$0x, $$1x) -> a($$0x, xp.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new ffk.f(-200, 100).a(ffl::c, ffl::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final ffk<Boolean> bd = ffk.a("options.rawMouseInput", true, $$0x -> {
      eze $$1x = ffh.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final ffk<Boolean> be = ffk.a("options.autoJump", false);
   private final ffk<Boolean> bf = ffk.a("options.operatorItemsTab", false);
   private final ffk<Boolean> bg = ffk.a("options.autoSuggestCommands", true);
   private final ffk<Boolean> bh = ffk.a("options.chat.color", true);
   private final ffk<Boolean> bi = ffk.a("options.chat.links", true);
   private final ffk<Boolean> bj = ffk.a("options.chat.links.prompt", true);
   private final ffk<Boolean> bk = ffk.a("options.vsync", true, $$0x -> {
      if (ffh.Q().aO() != null) {
         ffh.Q().aO().a($$0x);
      }
   });
   private final ffk<Boolean> bl = ffk.a("options.entityShadows", true);
   private final ffk<Boolean> bm = ffk.a("options.forceUnicodeFont", false, $$0x -> aE());
   private final ffk<Boolean> bn = ffk.a("options.japaneseGlyphVariants", ffk.a(xp.c("options.japaneseGlyphVariants.tooltip")), aF(), $$0x -> aE());
   private final ffk<Boolean> bo = ffk.a("options.invertMouse", false);
   private final ffk<Boolean> bp = ffk.a("options.discrete_mouse_scroll", false);
   private final ffk<Boolean> bq = ffk.a("options.realmsNotifications", true);
   private static final xp br = xp.c("options.allowServerListing.tooltip");
   private final ffk<Boolean> bs = ffk.a("options.allowServerListing", ffk.a(br), true, $$0x -> this.ax());
   private final ffk<Boolean> bt = ffk.a("options.reducedDebugInfo", false);
   private final Map<awb, ffk<Double>> bu = ac.a(new EnumMap<>(awb.class), $$0x -> {
      for (awb $$1x : awb.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final ffk<Boolean> bv = ffk.a("options.showSubtitles", false);
   private static final xp bw = xp.c("options.directionalAudio.on.tooltip");
   private static final xp bx = xp.c("options.directionalAudio.off.tooltip");
   private final ffk<Boolean> by = ffk.a("options.directionalAudio", $$0x -> $$0x ? fir.a(bw) : fir.a(bx), false, $$0x -> {
      gtx $$1x = ffh.Q().aj();
      $$1x.k();
      $$1x.a(gsk.a(awa.Ao, 1.0F));
   });
   private final ffk<Boolean> bz = new ffk<>(
      "options.accessibility.text_background",
      ffk.a(),
      ($$0x, $$1x) -> $$1x ? xp.c("options.accessibility.text_background.chat") : xp.c("options.accessibility.text_background.everywhere"),
      ffk.a,
      true,
      $$0x -> {
      }
   );
   private final ffk<Boolean> bA = ffk.a("options.touchscreen", false);
   private final ffk<Boolean> bB = ffk.a("options.fullscreen", false, $$0x -> {
      ffh $$1x = ffh.Q();
      if ($$1x.aO() != null && $$1x.aO().j() != $$0x) {
         $$1x.aO().h();
         this.aa().a($$1x.aO().j());
      }
   });
   private final ffk<Boolean> bC = ffk.a("options.viewBobbing", true);
   private static final xp bD = xp.c("options.key.toggle");
   private static final xp bE = xp.c("options.key.hold");
   private final ffk<Boolean> bF = new ffk<>("key.sneak", ffk.a(), ($$0x, $$1x) -> $$1x ? bD : bE, ffk.a, false, $$0x -> {
   });
   private final ffk<Boolean> bG = new ffk<>("key.sprint", ffk.a(), ($$0x, $$1x) -> $$1x ? bD : bE, ffk.a, false, $$0x -> {
   });
   public boolean v;
   private static final xp bH = xp.c("options.hideMatchedNames.tooltip");
   private final ffk<Boolean> bI = ffk.a("options.hideMatchedNames", ffk.a(bH), true);
   private final ffk<Boolean> bJ = ffk.a("options.autosaveIndicator", true);
   private static final xp bK = xp.c("options.onlyShowSecureChat.tooltip");
   private final ffk<Boolean> bL = ffk.a("options.onlyShowSecureChat", ffk.a(bK), false);
   public final fff w = new fff("key.forward", 87, "key.categories.movement");
   public final fff x = new fff("key.left", 65, "key.categories.movement");
   public final fff y = new fff("key.back", 83, "key.categories.movement");
   public final fff z = new fff("key.right", 68, "key.categories.movement");
   public final fff A = new fff("key.jump", 32, "key.categories.movement");
   public final fff B = new ffu("key.sneak", 340, "key.categories.movement", this.bF::c);
   public final fff C = new ffu("key.sprint", 341, "key.categories.movement", this.bG::c);
   public final fff D = new fff("key.inventory", 69, "key.categories.inventory");
   public final fff E = new fff("key.swapOffhand", 70, "key.categories.inventory");
   public final fff F = new fff("key.drop", 81, "key.categories.inventory");
   public final fff G = new fff("key.use", eyv.b.c, 1, "key.categories.gameplay");
   public final fff H = new fff("key.attack", eyv.b.c, 0, "key.categories.gameplay");
   public final fff I = new fff("key.pickItem", eyv.b.c, 2, "key.categories.gameplay");
   public final fff J = new fff("key.chat", 84, "key.categories.multiplayer");
   public final fff K = new fff("key.playerlist", 258, "key.categories.multiplayer");
   public final fff L = new fff("key.command", 47, "key.categories.multiplayer");
   public final fff M = new fff("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fff N = new fff("key.screenshot", 291, "key.categories.misc");
   public final fff O = new fff("key.togglePerspective", 294, "key.categories.misc");
   public final fff P = new fff("key.smoothCamera", eyv.bv.b(), "key.categories.misc");
   public final fff Q = new fff("key.fullscreen", 300, "key.categories.misc");
   public final fff R = new fff("key.spectatorOutlines", eyv.bv.b(), "key.categories.misc");
   public final fff S = new fff("key.advancements", 76, "key.categories.misc");
   public final fff[] T = new fff[]{
      new fff("key.hotbar.1", 49, "key.categories.inventory"),
      new fff("key.hotbar.2", 50, "key.categories.inventory"),
      new fff("key.hotbar.3", 51, "key.categories.inventory"),
      new fff("key.hotbar.4", 52, "key.categories.inventory"),
      new fff("key.hotbar.5", 53, "key.categories.inventory"),
      new fff("key.hotbar.6", 54, "key.categories.inventory"),
      new fff("key.hotbar.7", 55, "key.categories.inventory"),
      new fff("key.hotbar.8", 56, "key.categories.inventory"),
      new fff("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fff U = new fff("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fff V = new fff("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fff[] W = (fff[])ArrayUtils.addAll(
      new fff[]{
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
   protected ffh X;
   private final File bM;
   public boolean Y;
   private fet bN = fet.a;
   public String Z = "";
   public boolean aa;
   private final ffk<Integer> bO = new ffk<>("options.fov", ffk.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xp.c("options.fov.min"));
         case 110 -> a($$0x, xp.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new ffk.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> ffh.Q().f.r());
   private static final xp bP = xp.a("options.telemetry.button.tooltip", xp.c("options.telemetry.state.minimal"), xp.c("options.telemetry.state.all"));
   private final ffk<Boolean> bQ = ffk.a("options.telemetry.button", ffk.a(bP), ($$0x, $$1x) -> {
      ffh $$2x = ffh.Q();
      if (!$$2x.E()) {
         return xp.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xp.c("options.telemetry.state.all") : xp.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xp bR = xp.c("options.screenEffectScale.tooltip");
   private final ffk<Double> bS = new ffk<>("options.screenEffectScale", ffk.a(bR), ffl::b, ffk.m.a, 1.0, $$0x -> {
   });
   private static final xp bT = xp.c("options.fovEffectScale.tooltip");
   private final ffk<Double> bU = new ffk<>(
      "options.fovEffectScale", ffk.a(bT), ffl::b, ffk.m.a.a(ayz::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final xp bV = xp.c("options.darknessEffectScale.tooltip");
   private final ffk<Double> bW = new ffk<>("options.darknessEffectScale", ffk.a(bV), ffl::b, ffk.m.a.a(ayz::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final xp bX = xp.c("options.glintSpeed.tooltip");
   private final ffk<Double> bY = new ffk<>("options.glintSpeed", ffk.a(bX), ffl::b, ffk.m.a, 0.5, $$0x -> {
   });
   private static final xp bZ = xp.c("options.glintStrength.tooltip");
   private final ffk<Double> ca = new ffk<>("options.glintStrength", ffk.a(bZ), ffl::b, ffk.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final xp cb = xp.c("options.damageTiltStrength.tooltip");
   private final ffk<Double> cc = new ffk<>("options.damageTiltStrength", ffk.a(cb), ffl::b, ffk.m.a, 1.0, $$0x -> {
   });
   private final ffk<Double> cd = new ffk<>("options.gamma", ffk.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xp.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xp.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xp.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, ffk.m.a, 0.5, $$0x -> {
   });
   public static final int ab = 0;
   private static final int ce = 2147483646;
   private final ffk<Integer> cf = new ffk<>(
      "options.guiScale", ffk.a(), ($$0x, $$1x) -> $$1x == 0 ? xp.c("options.guiScale.auto") : xp.b(Integer.toString($$1x)), new ffk.c(0, () -> {
         ffh $$0x = ffh.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.X.a()
   );
   private final ffk<ffm> cg = new ffk<>(
      "options.particles", ffk.a(), ffk.b(), new ffk.e<>(Arrays.asList(ffm.values()), Codec.INT.xmap(ffm::a, ffm::a)), ffm.a, $$0x -> {
      }
   );
   private final ffk<ffj> ch = new ffk<>(
      "options.narrator",
      ffk.a(),
      ($$0x, $$1x) -> (xp)(this.X.aX().a() ? $$1x.b() : xp.c("options.narrator.notavailable")),
      new ffk.e<>(Arrays.asList(ffj.values()), Codec.INT.xmap(ffj::a, ffj::a)),
      ffj.a,
      $$0x -> this.X.aX().a($$0x)
   );
   public String ac = "en_us";
   private final ffk<String> ci = new ffk<>(
      "options.audioDevice",
      ffk.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xp.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xp.b($$1x.substring(gtu.c)) : xp.b($$1x);
         }
      },
      new ffk.h<>(
         () -> Stream.concat(Stream.of(""), ffh.Q().aj().a().stream()).toList(),
         $$0x -> ffh.Q().r() && $$0x != "" && !ffh.Q().aj().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gtx $$1x = ffh.Q().aj();
         $$1x.k();
         $$1x.a(gsk.a(awa.Ao, 1.0F));
      }
   );
   public boolean ad = true;
   public boolean ae;

   public ffk<Boolean> a() {
      return this.ak;
   }

   public ffk<Boolean> b() {
      return this.am;
   }

   public ffk<Boolean> c() {
      return this.ao;
   }

   public ffk<Double> d() {
      return this.ap;
   }

   public ffk<Integer> e() {
      return this.aq;
   }

   public ffk<Integer> f() {
      return this.ar;
   }

   public ffk<Double> g() {
      return this.at;
   }

   public ffk<Integer> h() {
      return this.au;
   }

   public ffk<fev> i() {
      return this.av;
   }

   public ffk<ffa> j() {
      return this.az;
   }

   public ffk<Boolean> k() {
      return this.aA;
   }

   public ffk<ffo> l() {
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

   public ffk<cmx> m() {
      return this.aF;
   }

   public ffk<Double> n() {
      return this.aG;
   }

   public ffk<Double> o() {
      return this.aH;
   }

   public ffk<Double> p() {
      return this.aK;
   }

   public double q() {
      return this.p().c();
   }

   public ffk<Double> r() {
      return this.aL;
   }

   public ffk<Double> s() {
      return this.aM;
   }

   public ffk<Boolean> t() {
      return this.aO;
   }

   public ffk<Boolean> u() {
      return this.aP;
   }

   public ffk<btl> v() {
      return this.aR;
   }

   public ffk<Double> w() {
      return this.aS;
   }

   public ffk<Double> x() {
      return this.aT;
   }

   public ffk<Double> y() {
      return this.aU;
   }

   public ffk<Double> z() {
      return this.aV;
   }

   public ffk<Double> A() {
      return this.aW;
   }

   public ffk<Double> B() {
      return this.aY;
   }

   public ffk<Integer> C() {
      return this.aZ;
   }

   public ffk<fer> D() {
      return this.ba;
   }

   public ffk<Integer> E() {
      return this.bb;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ayz.a(Math.log10($$0) * 100.0);
   }

   public ffk<Double> F() {
      return this.bc;
   }

   public ffk<Boolean> G() {
      return this.bd;
   }

   public ffk<Boolean> H() {
      return this.be;
   }

   public ffk<Boolean> I() {
      return this.bf;
   }

   public ffk<Boolean> J() {
      return this.bg;
   }

   public ffk<Boolean> K() {
      return this.bh;
   }

   public ffk<Boolean> L() {
      return this.bi;
   }

   public ffk<Boolean> M() {
      return this.bj;
   }

   public ffk<Boolean> N() {
      return this.bk;
   }

   public ffk<Boolean> O() {
      return this.bl;
   }

   private static void aE() {
      ffh $$0 = ffh.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public ffk<Boolean> P() {
      return this.bm;
   }

   private static boolean aF() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public ffk<Boolean> Q() {
      return this.bn;
   }

   public ffk<Boolean> R() {
      return this.bo;
   }

   public ffk<Boolean> S() {
      return this.bp;
   }

   public ffk<Boolean> T() {
      return this.bq;
   }

   public ffk<Boolean> U() {
      return this.bs;
   }

   public ffk<Boolean> V() {
      return this.bt;
   }

   public final float a(awb $$0) {
      return this.b($$0).c().floatValue();
   }

   public final ffk<Double> b(awb $$0) {
      return Objects.requireNonNull(this.bu.get($$0));
   }

   private ffk<Double> a(String $$0, awb $$1) {
      return new ffk<>($$0, ffk.a(), ffl::b, ffk.m.a, 1.0, $$1x -> ffh.Q().aj().a($$1, $$1x.floatValue()));
   }

   public ffk<Boolean> W() {
      return this.bv;
   }

   public ffk<Boolean> X() {
      return this.by;
   }

   public ffk<Boolean> Y() {
      return this.bz;
   }

   public ffk<Boolean> Z() {
      return this.bA;
   }

   public ffk<Boolean> aa() {
      return this.bB;
   }

   public ffk<Boolean> ab() {
      return this.bC;
   }

   public ffk<Boolean> ac() {
      return this.bF;
   }

   public ffk<Boolean> ad() {
      return this.bG;
   }

   public ffk<Boolean> ae() {
      return this.bI;
   }

   public ffk<Boolean> af() {
      return this.bJ;
   }

   public ffk<Boolean> ag() {
      return this.bL;
   }

   public ffk<Integer> ah() {
      return this.bO;
   }

   public ffk<Boolean> ai() {
      return this.bQ;
   }

   public ffk<Double> aj() {
      return this.bS;
   }

   public ffk<Double> ak() {
      return this.bU;
   }

   public ffk<Double> al() {
      return this.bW;
   }

   public ffk<Double> am() {
      return this.bY;
   }

   public ffk<Double> an() {
      return this.ca;
   }

   public ffk<Double> ao() {
      return this.cc;
   }

   public ffk<Double> ap() {
      return this.cd;
   }

   public ffk<Integer> aq() {
      return this.cf;
   }

   public ffk<ffm> ar() {
      return this.cg;
   }

   public ffk<ffj> as() {
      return this.ch;
   }

   public ffk<String> at() {
      return this.ci;
   }

   public ffl(ffh $$0, File $$1) {
      this.X = $$0;
      this.bM = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new ffk<>(
         "options.renderDistance",
         ffk.a(),
         ($$0x, $$1x) -> a($$0x, xp.a("options.chunks", $$1x)),
         new ffk.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> ffh.Q().f.r()
      );
      this.ar = new ffk<>(
         "options.simulationDistance", ffk.a(), ($$0x, $$1x) -> a($$0x, xp.a("options.chunks", $$1x)), new ffk.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
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

   public void a(fff $$0, eyv.a $$1) {
      $$0.b($$1);
      this.av();
   }

   private void a(ffl.b $$0) {
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

   private void a(ffl.a $$0) {
      this.a((ffl.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, ffl::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, ffl::c, ag::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, gvc::a, gvc::a);
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

      for (fff $$1 : this.W) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(eyv.a($$3));
         }
      }

      for (awb $$4 : awb.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bu.get($$4));
      }

      for (cna $$5 : cna.values()) {
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
               this.az.a(ffa.b);
            } else {
               this.az.a(ffa.a);
            }
         }

         this.a(new ffl.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, ffk<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> ffl.af.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     ffl.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? ffl.a($$2) : $$1;
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
               } else if (ffl.a($$2)) {
                  return 1.0F;
               } else if (ffl.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     ffl.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fff.d();
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
         this.a(new ffl.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, ffk<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> ffl.af.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(ffl.ag.toJson($$2));
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

      for (cna $$1 : this.aQ) {
         $$0 |= $$1.a();
      }

      return new aqu(this.ac, this.aq.c(), this.aF.c(), this.bh.c(), $$0, this.aR.c(), this.X.aS(), this.bs.c());
   }

   public void ax() {
      if (this.X.s != null) {
         this.X.s.cz.b(new aao(this.aw()));
      }
   }

   private void b(cna $$0, boolean $$1) {
      if ($$1) {
         this.aQ.add($$0);
      } else {
         this.aQ.remove($$0);
      }
   }

   public boolean a(cna $$0) {
      return this.aQ.contains($$0);
   }

   public void a(cna $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ax();
   }

   public fev ay() {
      return this.aD() >= 4 ? this.av.c() : fev.a;
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

   public fet aA() {
      return this.bN;
   }

   public void a(fet $$0) {
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
      this.a(new ffl.b() {
         @Override
         public <T> void a(String $$0x, ffk<T> $$1) {
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

   interface a extends ffl.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, ffk<T> var2);
   }
}
