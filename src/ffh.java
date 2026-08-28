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

public class ffh {
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
   private final ffg<Boolean> ak = ffg.a("options.darkMojangStudiosBackgroundColor", ffg.a(aj), false);
   private static final xo al = xo.c("options.hideLightningFlashes.tooltip");
   private final ffg<Boolean> am = ffg.a("options.hideLightningFlashes", ffg.a(al), false);
   private static final xo an = xo.c("options.hideSplashTexts.tooltip");
   private final ffg<Boolean> ao = ffg.a("options.hideSplashTexts", ffg.a(an), false);
   private final ffg<Double> ap = new ffg<>("options.sensitivity", ffg.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xo.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xo.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, ffg.m.a, 0.5, $$0x -> {
   });
   private final ffg<Integer> aq;
   private final ffg<Integer> ar;
   private int as = 0;
   private final ffg<Double> at = new ffg<>(
      "options.entityDistanceScaling",
      ffg.a(),
      ffh::a,
      new ffg.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final ffg<Integer> au = new ffg<>(
      "options.framerateLimit",
      ffg.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xo.c("options.framerateLimit.max")) : a($$0x, xo.a("options.framerate", $$1x)),
      new ffg.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> ffd.Q().aO().a($$0x)
   );
   private final ffg<fer> av = new ffg<>(
      "options.renderClouds",
      ffg.a(),
      ffg.b(),
      new ffg.e<>(Arrays.asList(fer.values()), Codec.withAlternative(fer.d, Codec.BOOL, $$0x -> $$0x ? fer.c : fer.a)),
      fer.c,
      $$0x -> {
         if (ffd.O()) {
            eyi $$1x = ffd.Q().f.x();
            if ($$1x != null) {
               $$1x.b(ffd.a);
            }
         }
      }
   );
   private static final xo aw = xo.c("options.graphics.fast.tooltip");
   private static final xo ax = xo.a("options.graphics.fabulous.tooltip", xo.c("options.graphics.fabulous").a(n.u));
   private static final xo ay = xo.c("options.graphics.fancy.tooltip");
   private final ffg<few> az = new ffg<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fin.a(ay);
            case a -> fin.a(aw);
            case c -> fin.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         yc $$2x = xo.c($$1x.b());
         return $$1x == few.c ? $$2x.a(n.u) : $$2x;
      },
      new ffg.a<>(
         Arrays.asList(few.values()),
         Stream.of(few.values()).filter($$0x -> $$0x != few.c).collect(Collectors.toList()),
         () -> ffd.Q().r() && ffd.Q().ai().h(),
         ($$0x, $$1x) -> {
            ffd $$2x = ffd.Q();
            gdg $$3 = $$2x.ai();
            if ($$1x == few.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(few::a, few::a)
      ),
      few.b,
      $$0x -> {
      }
   );
   private final ffg<Boolean> aA = ffg.a("options.ao", true, $$0x -> ffd.Q().f.f());
   private static final xo aB = xo.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xo aC = xo.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xo aD = xo.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final ffg<ffk> aE = new ffg<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fin.a(aB);
         case b -> fin.a(aC);
         case c -> fin.a(aD);
      };
   }, ffg.b(), new ffg.e<>(Arrays.asList(ffk.values()), Codec.INT.xmap(ffk::a, ffk::a)), ffk.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final ffg<cmt> aF = new ffg<>(
      "options.chat.visibility", ffg.a(), ffg.b(), new ffg.e<>(Arrays.asList(cmt.values()), Codec.INT.xmap(cmt::a, cmt::a)), cmt.a, $$0x -> {
      }
   );
   private final ffg<Double> aG = new ffg<>("options.chat.opacity", ffg.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), ffg.m.a, 1.0, $$0x -> ffd.Q().l.d().b());
   private final ffg<Double> aH = new ffg<>("options.chat.line_spacing", ffg.a(), ffh::a, ffg.m.a, 0.0, $$0x -> {
   });
   private static final xo aI = xo.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final double aJ = 0.5;
   private final ffg<Double> aK = new ffg<>("options.accessibility.menu_background_blurriness", ffg.a(aI), ffh::b, ffg.m.a, 0.5, $$0x -> {
   });
   private final ffg<Double> aL = new ffg<>("options.accessibility.text_background_opacity", ffg.a(), ffh::a, ffg.m.a, 0.5, $$0x -> ffd.Q().l.d().b());
   private final ffg<Double> aM = new ffg<>("options.accessibility.panorama_speed", ffg.a(), ffh::a, ffg.m.a, 1.0, $$0x -> {
   });
   private static final xo aN = xo.c("options.accessibility.high_contrast.tooltip");
   private final ffg<Boolean> aO = ffg.a("options.accessibility.high_contrast", ffg.a(aN), false, $$0x -> {
      atz $$1x = ffd.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final ffg<Boolean> aP = ffg.a(
      "options.accessibility.narrator_hotkey",
      ffg.a(ffd.a ? xo.c("options.accessibility.narrator_hotkey.mac.tooltip") : xo.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cmw> aQ = EnumSet.allOf(cmw.class);
   private final ffg<bth> aR = new ffg<>("options.mainHand", ffg.a(), ffg.b(), new ffg.e<>(Arrays.asList(bth.values()), bth.c), bth.b, $$0x -> this.ax());
   public int o;
   public int p;
   private final ffg<Double> aS = new ffg<>(
      "options.chat.scale",
      ffg.a(),
      ($$0x, $$1x) -> (xo)($$1x == 0.0 ? xn.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      ffg.m.a,
      1.0,
      $$0x -> ffd.Q().l.d().b()
   );
   private final ffg<Double> aT = new ffg<>("options.chat.width", ffg.a(), ($$0x, $$1x) -> b($$0x, fhd.a($$1x)), ffg.m.a, 1.0, $$0x -> ffd.Q().l.d().b());
   private final ffg<Double> aU = new ffg<>(
      "options.chat.height.unfocused", ffg.a(), ($$0x, $$1x) -> b($$0x, fhd.b($$1x)), ffg.m.a, fhd.i(), $$0x -> ffd.Q().l.d().b()
   );
   private final ffg<Double> aV = new ffg<>(
      "options.chat.height.focused", ffg.a(), ($$0x, $$1x) -> b($$0x, fhd.b($$1x)), ffg.m.a, 1.0, $$0x -> ffd.Q().l.d().b()
   );
   private final ffg<Double> aW = new ffg<>(
      "options.chat.delay_instant",
      ffg.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xo.c("options.chat.delay_none") : xo.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new ffg.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> ffd.Q().aY().a($$0x)
   );
   private static final xo aX = xo.c("options.notifications.display_time.tooltip");
   private final ffg<Double> aY = new ffg<>(
      "options.notifications.display_time",
      ffg.a(aX),
      ($$0x, $$1x) -> a($$0x, xo.a("options.multiplier", $$1x)),
      new ffg.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final ffg<Integer> aZ = new ffg<>(
      "options.mipmapLevels", ffg.a(), ($$0x, $$1x) -> (xo)($$1x == 0 ? xn.a($$0x, false) : a($$0x, $$1x.intValue())), new ffg.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final ffg<fen> ba = new ffg<>(
      "options.attackIndicator", ffg.a(), ffg.b(), new ffg.e<>(Arrays.asList(fen.values()), Codec.INT.xmap(fen::a, fen::a)), fen.b, $$0x -> {
      }
   );
   public guy r = guy.a;
   public boolean s = false;
   public boolean t = false;
   private final ffg<Integer> bb = new ffg<>("options.biomeBlendRadius", ffg.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xo.c("options.biomeBlendRadius." + $$2x));
   }, new ffg.f(0, 7), 2, $$0x -> ffd.Q().f.f());
   private final ffg<Double> bc = new ffg<>(
      "options.mouseWheelSensitivity",
      ffg.a(),
      ($$0x, $$1x) -> a($$0x, xo.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new ffg.f(-200, 100).a(ffh::c, ffh::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final ffg<Boolean> bd = ffg.a("options.rawMouseInput", true, $$0x -> {
      eza $$1x = ffd.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final ffg<Boolean> be = ffg.a("options.autoJump", false);
   private final ffg<Boolean> bf = ffg.a("options.operatorItemsTab", false);
   private final ffg<Boolean> bg = ffg.a("options.autoSuggestCommands", true);
   private final ffg<Boolean> bh = ffg.a("options.chat.color", true);
   private final ffg<Boolean> bi = ffg.a("options.chat.links", true);
   private final ffg<Boolean> bj = ffg.a("options.chat.links.prompt", true);
   private final ffg<Boolean> bk = ffg.a("options.vsync", true, $$0x -> {
      if (ffd.Q().aO() != null) {
         ffd.Q().aO().a($$0x);
      }
   });
   private final ffg<Boolean> bl = ffg.a("options.entityShadows", true);
   private final ffg<Boolean> bm = ffg.a("options.forceUnicodeFont", false, $$0x -> aE());
   private final ffg<Boolean> bn = ffg.a("options.japaneseGlyphVariants", ffg.a(xo.c("options.japaneseGlyphVariants.tooltip")), aF(), $$0x -> aE());
   private final ffg<Boolean> bo = ffg.a("options.invertMouse", false);
   private final ffg<Boolean> bp = ffg.a("options.discrete_mouse_scroll", false);
   private final ffg<Boolean> bq = ffg.a("options.realmsNotifications", true);
   private static final xo br = xo.c("options.allowServerListing.tooltip");
   private final ffg<Boolean> bs = ffg.a("options.allowServerListing", ffg.a(br), true, $$0x -> this.ax());
   private final ffg<Boolean> bt = ffg.a("options.reducedDebugInfo", false);
   private final Map<awa, ffg<Double>> bu = ac.a(new EnumMap<>(awa.class), $$0x -> {
      for (awa $$1x : awa.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final ffg<Boolean> bv = ffg.a("options.showSubtitles", false);
   private static final xo bw = xo.c("options.directionalAudio.on.tooltip");
   private static final xo bx = xo.c("options.directionalAudio.off.tooltip");
   private final ffg<Boolean> by = ffg.a("options.directionalAudio", $$0x -> $$0x ? fin.a(bw) : fin.a(bx), false, $$0x -> {
      gtt $$1x = ffd.Q().aj();
      $$1x.k();
      $$1x.a(gsg.a(avz.Ao, 1.0F));
   });
   private final ffg<Boolean> bz = new ffg<>(
      "options.accessibility.text_background",
      ffg.a(),
      ($$0x, $$1x) -> $$1x ? xo.c("options.accessibility.text_background.chat") : xo.c("options.accessibility.text_background.everywhere"),
      ffg.a,
      true,
      $$0x -> {
      }
   );
   private final ffg<Boolean> bA = ffg.a("options.touchscreen", false);
   private final ffg<Boolean> bB = ffg.a("options.fullscreen", false, $$0x -> {
      ffd $$1x = ffd.Q();
      if ($$1x.aO() != null && $$1x.aO().j() != $$0x) {
         $$1x.aO().h();
         this.aa().a($$1x.aO().j());
      }
   });
   private final ffg<Boolean> bC = ffg.a("options.viewBobbing", true);
   private static final xo bD = xo.c("options.key.toggle");
   private static final xo bE = xo.c("options.key.hold");
   private final ffg<Boolean> bF = new ffg<>("key.sneak", ffg.a(), ($$0x, $$1x) -> $$1x ? bD : bE, ffg.a, false, $$0x -> {
   });
   private final ffg<Boolean> bG = new ffg<>("key.sprint", ffg.a(), ($$0x, $$1x) -> $$1x ? bD : bE, ffg.a, false, $$0x -> {
   });
   public boolean v;
   private static final xo bH = xo.c("options.hideMatchedNames.tooltip");
   private final ffg<Boolean> bI = ffg.a("options.hideMatchedNames", ffg.a(bH), true);
   private final ffg<Boolean> bJ = ffg.a("options.autosaveIndicator", true);
   private static final xo bK = xo.c("options.onlyShowSecureChat.tooltip");
   private final ffg<Boolean> bL = ffg.a("options.onlyShowSecureChat", ffg.a(bK), false);
   public final ffb w = new ffb("key.forward", 87, "key.categories.movement");
   public final ffb x = new ffb("key.left", 65, "key.categories.movement");
   public final ffb y = new ffb("key.back", 83, "key.categories.movement");
   public final ffb z = new ffb("key.right", 68, "key.categories.movement");
   public final ffb A = new ffb("key.jump", 32, "key.categories.movement");
   public final ffb B = new ffq("key.sneak", 340, "key.categories.movement", this.bF::c);
   public final ffb C = new ffq("key.sprint", 341, "key.categories.movement", this.bG::c);
   public final ffb D = new ffb("key.inventory", 69, "key.categories.inventory");
   public final ffb E = new ffb("key.swapOffhand", 70, "key.categories.inventory");
   public final ffb F = new ffb("key.drop", 81, "key.categories.inventory");
   public final ffb G = new ffb("key.use", eyr.b.c, 1, "key.categories.gameplay");
   public final ffb H = new ffb("key.attack", eyr.b.c, 0, "key.categories.gameplay");
   public final ffb I = new ffb("key.pickItem", eyr.b.c, 2, "key.categories.gameplay");
   public final ffb J = new ffb("key.chat", 84, "key.categories.multiplayer");
   public final ffb K = new ffb("key.playerlist", 258, "key.categories.multiplayer");
   public final ffb L = new ffb("key.command", 47, "key.categories.multiplayer");
   public final ffb M = new ffb("key.socialInteractions", 80, "key.categories.multiplayer");
   public final ffb N = new ffb("key.screenshot", 291, "key.categories.misc");
   public final ffb O = new ffb("key.togglePerspective", 294, "key.categories.misc");
   public final ffb P = new ffb("key.smoothCamera", eyr.bv.b(), "key.categories.misc");
   public final ffb Q = new ffb("key.fullscreen", 300, "key.categories.misc");
   public final ffb R = new ffb("key.spectatorOutlines", eyr.bv.b(), "key.categories.misc");
   public final ffb S = new ffb("key.advancements", 76, "key.categories.misc");
   public final ffb[] T = new ffb[]{
      new ffb("key.hotbar.1", 49, "key.categories.inventory"),
      new ffb("key.hotbar.2", 50, "key.categories.inventory"),
      new ffb("key.hotbar.3", 51, "key.categories.inventory"),
      new ffb("key.hotbar.4", 52, "key.categories.inventory"),
      new ffb("key.hotbar.5", 53, "key.categories.inventory"),
      new ffb("key.hotbar.6", 54, "key.categories.inventory"),
      new ffb("key.hotbar.7", 55, "key.categories.inventory"),
      new ffb("key.hotbar.8", 56, "key.categories.inventory"),
      new ffb("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final ffb U = new ffb("key.saveToolbarActivator", 67, "key.categories.creative");
   public final ffb V = new ffb("key.loadToolbarActivator", 88, "key.categories.creative");
   public final ffb[] W = (ffb[])ArrayUtils.addAll(
      new ffb[]{
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
   protected ffd X;
   private final File bM;
   public boolean Y;
   private fep bN = fep.a;
   public String Z = "";
   public boolean aa;
   private final ffg<Integer> bO = new ffg<>("options.fov", ffg.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xo.c("options.fov.min"));
         case 110 -> a($$0x, xo.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new ffg.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> ffd.Q().f.r());
   private static final xo bP = xo.a("options.telemetry.button.tooltip", xo.c("options.telemetry.state.minimal"), xo.c("options.telemetry.state.all"));
   private final ffg<Boolean> bQ = ffg.a("options.telemetry.button", ffg.a(bP), ($$0x, $$1x) -> {
      ffd $$2x = ffd.Q();
      if (!$$2x.E()) {
         return xo.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xo.c("options.telemetry.state.all") : xo.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xo bR = xo.c("options.screenEffectScale.tooltip");
   private final ffg<Double> bS = new ffg<>("options.screenEffectScale", ffg.a(bR), ffh::b, ffg.m.a, 1.0, $$0x -> {
   });
   private static final xo bT = xo.c("options.fovEffectScale.tooltip");
   private final ffg<Double> bU = new ffg<>(
      "options.fovEffectScale", ffg.a(bT), ffh::b, ffg.m.a.a(ayx::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final xo bV = xo.c("options.darknessEffectScale.tooltip");
   private final ffg<Double> bW = new ffg<>("options.darknessEffectScale", ffg.a(bV), ffh::b, ffg.m.a.a(ayx::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final xo bX = xo.c("options.glintSpeed.tooltip");
   private final ffg<Double> bY = new ffg<>("options.glintSpeed", ffg.a(bX), ffh::b, ffg.m.a, 0.5, $$0x -> {
   });
   private static final xo bZ = xo.c("options.glintStrength.tooltip");
   private final ffg<Double> ca = new ffg<>("options.glintStrength", ffg.a(bZ), ffh::b, ffg.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final xo cb = xo.c("options.damageTiltStrength.tooltip");
   private final ffg<Double> cc = new ffg<>("options.damageTiltStrength", ffg.a(cb), ffh::b, ffg.m.a, 1.0, $$0x -> {
   });
   private final ffg<Double> cd = new ffg<>("options.gamma", ffg.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xo.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xo.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xo.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, ffg.m.a, 0.5, $$0x -> {
   });
   public static final int ab = 0;
   private static final int ce = 2147483646;
   private final ffg<Integer> cf = new ffg<>(
      "options.guiScale", ffg.a(), ($$0x, $$1x) -> $$1x == 0 ? xo.c("options.guiScale.auto") : xo.b(Integer.toString($$1x)), new ffg.c(0, () -> {
         ffd $$0x = ffd.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.X.a()
   );
   private final ffg<ffi> cg = new ffg<>(
      "options.particles", ffg.a(), ffg.b(), new ffg.e<>(Arrays.asList(ffi.values()), Codec.INT.xmap(ffi::a, ffi::a)), ffi.a, $$0x -> {
      }
   );
   private final ffg<fff> ch = new ffg<>(
      "options.narrator",
      ffg.a(),
      ($$0x, $$1x) -> (xo)(this.X.aX().a() ? $$1x.b() : xo.c("options.narrator.notavailable")),
      new ffg.e<>(Arrays.asList(fff.values()), Codec.INT.xmap(fff::a, fff::a)),
      fff.a,
      $$0x -> this.X.aX().a($$0x)
   );
   public String ac = "en_us";
   private final ffg<String> ci = new ffg<>(
      "options.audioDevice",
      ffg.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xo.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xo.b($$1x.substring(gtq.c)) : xo.b($$1x);
         }
      },
      new ffg.h<>(
         () -> Stream.concat(Stream.of(""), ffd.Q().aj().a().stream()).toList(),
         $$0x -> ffd.Q().r() && $$0x != "" && !ffd.Q().aj().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gtt $$1x = ffd.Q().aj();
         $$1x.k();
         $$1x.a(gsg.a(avz.Ao, 1.0F));
      }
   );
   public boolean ad = true;
   public boolean ae;

   public ffg<Boolean> a() {
      return this.ak;
   }

   public ffg<Boolean> b() {
      return this.am;
   }

   public ffg<Boolean> c() {
      return this.ao;
   }

   public ffg<Double> d() {
      return this.ap;
   }

   public ffg<Integer> e() {
      return this.aq;
   }

   public ffg<Integer> f() {
      return this.ar;
   }

   public ffg<Double> g() {
      return this.at;
   }

   public ffg<Integer> h() {
      return this.au;
   }

   public ffg<fer> i() {
      return this.av;
   }

   public ffg<few> j() {
      return this.az;
   }

   public ffg<Boolean> k() {
      return this.aA;
   }

   public ffg<ffk> l() {
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

   public ffg<cmt> m() {
      return this.aF;
   }

   public ffg<Double> n() {
      return this.aG;
   }

   public ffg<Double> o() {
      return this.aH;
   }

   public ffg<Double> p() {
      return this.aK;
   }

   public double q() {
      return this.p().c();
   }

   public ffg<Double> r() {
      return this.aL;
   }

   public ffg<Double> s() {
      return this.aM;
   }

   public ffg<Boolean> t() {
      return this.aO;
   }

   public ffg<Boolean> u() {
      return this.aP;
   }

   public ffg<bth> v() {
      return this.aR;
   }

   public ffg<Double> w() {
      return this.aS;
   }

   public ffg<Double> x() {
      return this.aT;
   }

   public ffg<Double> y() {
      return this.aU;
   }

   public ffg<Double> z() {
      return this.aV;
   }

   public ffg<Double> A() {
      return this.aW;
   }

   public ffg<Double> B() {
      return this.aY;
   }

   public ffg<Integer> C() {
      return this.aZ;
   }

   public ffg<fen> D() {
      return this.ba;
   }

   public ffg<Integer> E() {
      return this.bb;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ayx.a(Math.log10($$0) * 100.0);
   }

   public ffg<Double> F() {
      return this.bc;
   }

   public ffg<Boolean> G() {
      return this.bd;
   }

   public ffg<Boolean> H() {
      return this.be;
   }

   public ffg<Boolean> I() {
      return this.bf;
   }

   public ffg<Boolean> J() {
      return this.bg;
   }

   public ffg<Boolean> K() {
      return this.bh;
   }

   public ffg<Boolean> L() {
      return this.bi;
   }

   public ffg<Boolean> M() {
      return this.bj;
   }

   public ffg<Boolean> N() {
      return this.bk;
   }

   public ffg<Boolean> O() {
      return this.bl;
   }

   private static void aE() {
      ffd $$0 = ffd.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public ffg<Boolean> P() {
      return this.bm;
   }

   private static boolean aF() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public ffg<Boolean> Q() {
      return this.bn;
   }

   public ffg<Boolean> R() {
      return this.bo;
   }

   public ffg<Boolean> S() {
      return this.bp;
   }

   public ffg<Boolean> T() {
      return this.bq;
   }

   public ffg<Boolean> U() {
      return this.bs;
   }

   public ffg<Boolean> V() {
      return this.bt;
   }

   public final float a(awa $$0) {
      return this.b($$0).c().floatValue();
   }

   public final ffg<Double> b(awa $$0) {
      return Objects.requireNonNull(this.bu.get($$0));
   }

   private ffg<Double> a(String $$0, awa $$1) {
      return new ffg<>($$0, ffg.a(), ffh::b, ffg.m.a, 1.0, $$1x -> ffd.Q().aj().a($$1, $$1x.floatValue()));
   }

   public ffg<Boolean> W() {
      return this.bv;
   }

   public ffg<Boolean> X() {
      return this.by;
   }

   public ffg<Boolean> Y() {
      return this.bz;
   }

   public ffg<Boolean> Z() {
      return this.bA;
   }

   public ffg<Boolean> aa() {
      return this.bB;
   }

   public ffg<Boolean> ab() {
      return this.bC;
   }

   public ffg<Boolean> ac() {
      return this.bF;
   }

   public ffg<Boolean> ad() {
      return this.bG;
   }

   public ffg<Boolean> ae() {
      return this.bI;
   }

   public ffg<Boolean> af() {
      return this.bJ;
   }

   public ffg<Boolean> ag() {
      return this.bL;
   }

   public ffg<Integer> ah() {
      return this.bO;
   }

   public ffg<Boolean> ai() {
      return this.bQ;
   }

   public ffg<Double> aj() {
      return this.bS;
   }

   public ffg<Double> ak() {
      return this.bU;
   }

   public ffg<Double> al() {
      return this.bW;
   }

   public ffg<Double> am() {
      return this.bY;
   }

   public ffg<Double> an() {
      return this.ca;
   }

   public ffg<Double> ao() {
      return this.cc;
   }

   public ffg<Double> ap() {
      return this.cd;
   }

   public ffg<Integer> aq() {
      return this.cf;
   }

   public ffg<ffi> ar() {
      return this.cg;
   }

   public ffg<fff> as() {
      return this.ch;
   }

   public ffg<String> at() {
      return this.ci;
   }

   public ffh(ffd $$0, File $$1) {
      this.X = $$0;
      this.bM = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new ffg<>(
         "options.renderDistance", ffg.a(), ($$0x, $$1x) -> a($$0x, xo.a("options.chunks", $$1x)), new ffg.f(2, $$2 ? 32 : 16), 12, $$0x -> ffd.Q().f.r()
      );
      this.ar = new ffg<>(
         "options.simulationDistance", ffg.a(), ($$0x, $$1x) -> a($$0x, xo.a("options.chunks", $$1x)), new ffg.f(5, $$2 ? 32 : 16), 12, $$0x -> {
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

   public void a(ffb $$0, eyr.a $$1) {
      $$0.b($$1);
      this.av();
   }

   private void a(ffh.b $$0) {
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

   private void a(ffh.a $$0) {
      this.a((ffh.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, ffh::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, ffh::c, ag::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, guy::a, guy::a);
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

      for (ffb $$1 : this.W) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(eyr.a($$3));
         }
      }

      for (awa $$4 : awa.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bu.get($$4));
      }

      for (cmw $$5 : cmw.values()) {
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
               this.az.a(few.b);
            } else {
               this.az.a(few.a);
            }
         }

         this.a(new ffh.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, ffg<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> ffh.af.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     ffh.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? ffh.a($$2) : $$1;
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
               } else if (ffh.a($$2)) {
                  return 1.0F;
               } else if (ffh.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     ffh.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         ffb.d();
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

      return bae.e.a(this.X.as(), $$0, $$1);
   }

   public void av() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bM), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new ffh.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, ffg<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> ffh.af.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(ffh.ag.toJson($$2));
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

      for (cmw $$1 : this.aQ) {
         $$0 |= $$1.a();
      }

      return new aqt(this.ac, this.aq.c(), this.aF.c(), this.bh.c(), $$0, this.aR.c(), this.X.aS(), this.bs.c());
   }

   public void ax() {
      if (this.X.s != null) {
         this.X.s.cz.b(new aan(this.aw()));
      }
   }

   private void b(cmw $$0, boolean $$1) {
      if ($$1) {
         this.aQ.add($$0);
      } else {
         this.aQ.remove($$0);
      }
   }

   public boolean a(cmw $$0) {
      return this.aQ.contains($$0);
   }

   public void a(cmw $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ax();
   }

   public fer ay() {
      return this.aD() >= 4 ? this.av.c() : fer.a;
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

   public fep aA() {
      return this.bN;
   }

   public void a(fep $$0) {
      this.bN = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = ayn.a(ag, $$0, ah);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aB() {
      return this.bM;
   }

   public String aC() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new ffh.b() {
         @Override
         public <T> void a(String $$0x, ffg<T> $$1) {
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

   interface a extends ffh.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, ffg<T> var2);
   }
}
