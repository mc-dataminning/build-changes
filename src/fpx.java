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

public class fpx {
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
   private static final wy aj = wy.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fpw<Boolean> ak = fpw.a("options.darkMojangStudiosBackgroundColor", fpw.a(aj), false);
   private static final wy al = wy.c("options.hideLightningFlashes.tooltip");
   private final fpw<Boolean> am = fpw.a("options.hideLightningFlashes", fpw.a(al), false);
   private static final wy an = wy.c("options.hideSplashTexts.tooltip");
   private final fpw<Boolean> ao = fpw.a("options.hideSplashTexts", fpw.a(an), false);
   private final fpw<Double> ap = new fpw<>("options.sensitivity", fpw.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wy.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wy.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fpw.m.a, 0.5, $$0x -> {
   });
   private final fpw<Integer> aq;
   private final fpw<Integer> ar;
   private int as = 0;
   private final fpw<Double> at = new fpw<>(
      "options.entityDistanceScaling",
      fpw.a(),
      fpx::a,
      new fpw.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fpw<Integer> au = new fpw<>(
      "options.framerateLimit",
      fpw.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wy.c("options.framerateLimit.max")) : a($$0x, wy.a("options.framerate", $$1x)),
      new fpw.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fpt.Q().aP().a($$0x)
   );
   private static final wy av = wy.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final wy aw = wy.c("options.inactivityFpsLimit.afk.tooltip");
   private final fpw<fpp> ax = new fpw<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> ful.a(av);
         case b -> ful.a(aw);
      };
   }, fpw.b(), new fpw.e<>(Arrays.asList(fpp.values()), fpp.c), fpp.b, $$0x -> {
   });
   private final fpw<fpf> ay = new fpw<>(
      "options.renderClouds",
      fpw.a(),
      fpw.b(),
      new fpw.e<>(Arrays.asList(fpf.values()), Codec.withAlternative(fpf.d, Codec.BOOL, $$0x -> $$0x ? fpf.c : fpf.a)),
      fpf.c,
      $$0x -> {
      }
   );
   private static final wy az = wy.c("options.graphics.fast.tooltip");
   private static final wy aA = wy.a("options.graphics.fabulous.tooltip", wy.c("options.graphics.fabulous").a(o.u));
   private static final wy aB = wy.c("options.graphics.fancy.tooltip");
   private final fpw<fpl> aC = new fpw<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> ful.a(aB);
            case a -> ful.a(az);
            case c -> ful.a(aA);
         };
      },
      ($$0x, $$1x) -> {
         xm $$2x = wy.c($$1x.a());
         return $$1x == fpl.c ? $$2x.a(o.u) : $$2x;
      },
      new fpw.a<>(
         Arrays.asList(fpl.values()),
         Stream.of(fpl.values()).filter($$0x -> $$0x != fpl.c).collect(Collectors.toList()),
         () -> fpt.Q().r() && fpt.Q().aj().g(),
         ($$0x, $$1x) -> {
            fpt $$2x = fpt.Q();
            gqi $$3 = $$2x.aj();
            if ($$1x == fpl.c && $$3.b()) {
               $$3.c();
            } else {
               $$0x.a($$1x);
               $$2x.f.d();
            }
         },
         Codec.INT.xmap(fpl::a, fpl::b)
      ),
      fpl.b,
      $$0x -> {
      }
   );
   private final fpw<Boolean> aD = fpw.a("options.ao", true, $$0x -> fpt.Q().f.d());
   private static final wy aE = wy.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wy aF = wy.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wy aG = wy.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fpw<fpz> aH = new fpw<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> ful.a(aE);
         case b -> ful.a(aF);
         case c -> ful.a(aG);
      };
   }, fpw.b(), new fpw.e<>(Arrays.asList(fpz.values()), Codec.INT.xmap(fpz::a, fpz::b)), fpz.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fpw<crj> aI = new fpw<>(
      "options.chat.visibility", fpw.a(), fpw.b(), new fpw.e<>(Arrays.asList(crj.values()), Codec.INT.xmap(crj::a, crj::b)), crj.a, $$0x -> {
      }
   );
   private final fpw<Double> aJ = new fpw<>("options.chat.opacity", fpw.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fpw.m.a, 1.0, $$0x -> fpt.Q().m.d().b());
   private final fpw<Double> aK = new fpw<>("options.chat.line_spacing", fpw.a(), fpx::a, fpw.m.a, 0.0, $$0x -> {
   });
   private static final wy aL = wy.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aM = 5;
   private final fpw<Integer> aN = new fpw<>("options.accessibility.menu_background_blurriness", fpw.a(aL), fpx::b, new fpw.f(0, 10), 5, $$0x -> {
   });
   private final fpw<Double> aO = new fpw<>("options.accessibility.text_background_opacity", fpw.a(), fpx::a, fpw.m.a, 0.5, $$0x -> fpt.Q().m.d().b());
   private final fpw<Double> aP = new fpw<>("options.accessibility.panorama_speed", fpw.a(), fpx::a, fpw.m.a, 1.0, $$0x -> {
   });
   private static final wy aQ = wy.c("options.accessibility.high_contrast.tooltip");
   private final fpw<Boolean> aR = fpw.a("options.accessibility.high_contrast", fpw.a(aQ), false, $$0x -> {
      aun $$1x = fpt.Q().ad();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private static final wy aS = wy.c("options.accessibility.high_contrast_block_outline.tooltip");
   private final fpw<Boolean> aT = fpw.a("options.accessibility.high_contrast_block_outline", fpw.a(aS), false);
   private final fpw<Boolean> aU = fpw.a(
      "options.accessibility.narrator_hotkey",
      fpw.a(fpt.a ? wy.c("options.accessibility.narrator_hotkey.mac.tooltip") : wy.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cro> aV = EnumSet.allOf(cro.class);
   private final fpw<bxa> aW = new fpw<>("options.mainHand", fpw.a(), fpw.b(), new fpw.e<>(Arrays.asList(bxa.values()), bxa.c), bxa.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fpw<Double> aX = new fpw<>(
      "options.chat.scale",
      fpw.a(),
      ($$0x, $$1x) -> (wy)($$1x == 0.0 ? wx.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fpw.m.a,
      1.0,
      $$0x -> fpt.Q().m.d().b()
   );
   private final fpw<Double> aY = new fpw<>("options.chat.width", fpw.a(), ($$0x, $$1x) -> c($$0x, ftb.a($$1x)), fpw.m.a, 1.0, $$0x -> fpt.Q().m.d().b());
   private final fpw<Double> aZ = new fpw<>(
      "options.chat.height.unfocused", fpw.a(), ($$0x, $$1x) -> c($$0x, ftb.b($$1x)), fpw.m.a, ftb.i(), $$0x -> fpt.Q().m.d().b()
   );
   private final fpw<Double> ba = new fpw<>(
      "options.chat.height.focused", fpw.a(), ($$0x, $$1x) -> c($$0x, ftb.b($$1x)), fpw.m.a, 1.0, $$0x -> fpt.Q().m.d().b()
   );
   private final fpw<Double> bb = new fpw<>(
      "options.chat.delay_instant",
      fpw.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wy.c("options.chat.delay_none") : wy.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fpw.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fpt.Q().aZ().a($$0x)
   );
   private static final wy bc = wy.c("options.notifications.display_time.tooltip");
   private final fpw<Double> bd = new fpw<>(
      "options.notifications.display_time",
      fpw.a(bc),
      ($$0x, $$1x) -> a($$0x, wy.a("options.multiplier", $$1x)),
      new fpw.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fpw<Integer> be = new fpw<>(
      "options.mipmapLevels", fpw.a(), ($$0x, $$1x) -> (wy)($$1x == 0 ? wx.a($$0x, false) : a($$0x, $$1x.intValue())), new fpw.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fpw<fpa> bf = new fpw<>(
      "options.attackIndicator", fpw.a(), fpw.b(), new fpw.e<>(Arrays.asList(fpa.values()), Codec.INT.xmap(fpa::a, fpa::b)), fpa.b, $$0x -> {
      }
   );
   public hpy r = hpy.a;
   public boolean s = false;
   private final fpw<Integer> bg = new fpw<>("options.biomeBlendRadius", fpw.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wy.c("options.biomeBlendRadius." + $$2x));
   }, new fpw.f(0, 7, false), 2, $$0x -> fpt.Q().f.d());
   private final fpw<Double> bh = new fpw<>(
      "options.mouseWheelSensitivity",
      fpw.a(),
      ($$0x, $$1x) -> a($$0x, wy.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fpw.f(-200, 100).a(fpx::c, fpx::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fpw<Boolean> bi = fpw.a("options.rawMouseInput", true, $$0x -> {
      fjc $$1x = fpt.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fpw<Boolean> bj = fpw.a("options.autoJump", false);
   private static final wy bk = wy.c("options.rotateWithMinecart.tooltip");
   private final fpw<Boolean> bl = fpw.a("options.rotateWithMinecart", fpw.a(bk), false);
   private final fpw<Boolean> bm = fpw.a("options.operatorItemsTab", false);
   private final fpw<Boolean> bn = fpw.a("options.autoSuggestCommands", true);
   private final fpw<Boolean> bo = fpw.a("options.chat.color", true);
   private final fpw<Boolean> bp = fpw.a("options.chat.links", true);
   private final fpw<Boolean> bq = fpw.a("options.chat.links.prompt", true);
   private final fpw<Boolean> br = fpw.a("options.vsync", true, $$0x -> {
      if (fpt.Q().aO() != null) {
         fpt.Q().aO().a($$0x);
      }
   });
   private final fpw<Boolean> bs = fpw.a("options.entityShadows", true);
   private final fpw<Boolean> bt = fpw.a("options.forceUnicodeFont", false, $$0x -> aI());
   private final fpw<Boolean> bu = fpw.a("options.japaneseGlyphVariants", fpw.a(wy.c("options.japaneseGlyphVariants.tooltip")), aJ(), $$0x -> aI());
   private final fpw<Boolean> bv = fpw.a("options.invertMouse", false);
   private final fpw<Boolean> bw = fpw.a("options.discrete_mouse_scroll", false);
   private static final wy bx = wy.c("options.realmsNotifications.tooltip");
   private final fpw<Boolean> by = fpw.a("options.realmsNotifications", fpw.a(bx), true);
   private static final wy bz = wy.c("options.allowServerListing.tooltip");
   private final fpw<Boolean> bA = fpw.a("options.allowServerListing", fpw.a(bz), true, $$0x -> {
   });
   private final fpw<Boolean> bB = fpw.a("options.reducedDebugInfo", false);
   private final Map<awo, fpw<Double>> bC = ag.a(awo.class, $$0x -> this.a("soundCategory." + $$0x.a(), $$0x));
   private final fpw<Boolean> bD = fpw.a("options.showSubtitles", false);
   private static final wy bE = wy.c("options.directionalAudio.on.tooltip");
   private static final wy bF = wy.c("options.directionalAudio.off.tooltip");
   private final fpw<Boolean> bG = fpw.a("options.directionalAudio", $$0x -> $$0x ? ful.a(bE) : ful.a(bF), false, $$0x -> {
      hou $$1x = fpt.Q().ak();
      $$1x.j();
      $$1x.a(hnj.a(awn.Bv, 1.0F));
   });
   private final fpw<Boolean> bH = new fpw<>(
      "options.accessibility.text_background",
      fpw.a(),
      ($$0x, $$1x) -> $$1x ? wy.c("options.accessibility.text_background.chat") : wy.c("options.accessibility.text_background.everywhere"),
      fpw.a,
      true,
      $$0x -> {
      }
   );
   private final fpw<Boolean> bI = fpw.a("options.touchscreen", false);
   private final fpw<Boolean> bJ = fpw.a("options.fullscreen", false, $$0x -> {
      fpt $$1x = fpt.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ad().a($$1x.aO().i());
      }
   });
   private final fpw<Boolean> bK = fpw.a("options.viewBobbing", true);
   private static final wy bL = wy.c("options.key.toggle");
   private static final wy bM = wy.c("options.key.hold");
   private final fpw<Boolean> bN = new fpw<>("key.sneak", fpw.a(), ($$0x, $$1x) -> $$1x ? bL : bM, fpw.a, false, $$0x -> {
   });
   private final fpw<Boolean> bO = new fpw<>("key.sprint", fpw.a(), ($$0x, $$1x) -> $$1x ? bL : bM, fpw.a, false, $$0x -> {
   });
   public boolean u;
   private static final wy bP = wy.c("options.hideMatchedNames.tooltip");
   private final fpw<Boolean> bQ = fpw.a("options.hideMatchedNames", fpw.a(bP), true);
   private final fpw<Boolean> bR = fpw.a("options.autosaveIndicator", true);
   private static final wy bS = wy.c("options.onlyShowSecureChat.tooltip");
   private final fpw<Boolean> bT = fpw.a("options.onlyShowSecureChat", fpw.a(bS), false);
   public final fpr v = new fpr("key.forward", 87, "key.categories.movement");
   public final fpr w = new fpr("key.left", 65, "key.categories.movement");
   public final fpr x = new fpr("key.back", 83, "key.categories.movement");
   public final fpr y = new fpr("key.right", 68, "key.categories.movement");
   public final fpr z = new fpr("key.jump", 32, "key.categories.movement");
   public final fpr A = new fqe("key.sneak", 340, "key.categories.movement", this.bN::c);
   public final fpr B = new fqe("key.sprint", 341, "key.categories.movement", this.bO::c);
   public final fpr C = new fpr("key.inventory", 69, "key.categories.inventory");
   public final fpr D = new fpr("key.swapOffhand", 70, "key.categories.inventory");
   public final fpr E = new fpr("key.drop", 81, "key.categories.inventory");
   public final fpr F = new fpr("key.use", fiu.b.c, 1, "key.categories.gameplay");
   public final fpr G = new fpr("key.attack", fiu.b.c, 0, "key.categories.gameplay");
   public final fpr H = new fpr("key.pickItem", fiu.b.c, 2, "key.categories.gameplay");
   public final fpr I = new fpr("key.chat", 84, "key.categories.multiplayer");
   public final fpr J = new fpr("key.playerlist", 258, "key.categories.multiplayer");
   public final fpr K = new fpr("key.command", 47, "key.categories.multiplayer");
   public final fpr L = new fpr("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fpr M = new fpr("key.screenshot", 291, "key.categories.misc");
   public final fpr N = new fpr("key.togglePerspective", 294, "key.categories.misc");
   public final fpr O = new fpr("key.smoothCamera", fiu.bv.b(), "key.categories.misc");
   public final fpr P = new fpr("key.fullscreen", 300, "key.categories.misc");
   public final fpr Q = new fpr("key.spectatorOutlines", fiu.bv.b(), "key.categories.misc");
   public final fpr R = new fpr("key.advancements", 76, "key.categories.misc");
   public final fpr[] S = new fpr[]{
      new fpr("key.hotbar.1", 49, "key.categories.inventory"),
      new fpr("key.hotbar.2", 50, "key.categories.inventory"),
      new fpr("key.hotbar.3", 51, "key.categories.inventory"),
      new fpr("key.hotbar.4", 52, "key.categories.inventory"),
      new fpr("key.hotbar.5", 53, "key.categories.inventory"),
      new fpr("key.hotbar.6", 54, "key.categories.inventory"),
      new fpr("key.hotbar.7", 55, "key.categories.inventory"),
      new fpr("key.hotbar.8", 56, "key.categories.inventory"),
      new fpr("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fpr T = new fpr("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fpr U = new fpr("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fpr[] V = (fpr[])ArrayUtils.addAll(
      new fpr[]{
         this.G,
         this.F,
         this.v,
         this.w,
         this.x,
         this.y,
         this.z,
         this.A,
         this.B,
         this.E,
         this.C,
         this.I,
         this.J,
         this.H,
         this.K,
         this.L,
         this.M,
         this.N,
         this.O,
         this.P,
         this.Q,
         this.D,
         this.T,
         this.U,
         this.R
      },
      this.S
   );
   protected fpt W;
   private final File bU;
   public boolean X;
   private fpc bV = fpc.a;
   public String Y = "";
   public boolean Z;
   private final fpw<Integer> bW = new fpw<>("options.fov", fpw.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wy.c("options.fov.min"));
         case 110 -> a($$0x, wy.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fpw.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fpt.Q().f.o());
   private static final wy bX = wy.a("options.telemetry.button.tooltip", wy.c("options.telemetry.state.minimal"), wy.c("options.telemetry.state.all"));
   private final fpw<Boolean> bY = fpw.a("options.telemetry.button", fpw.a(bX), ($$0x, $$1x) -> {
      fpt $$2x = fpt.Q();
      if (!$$2x.E()) {
         return wy.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wy.c("options.telemetry.state.all") : wy.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wy bZ = wy.c("options.screenEffectScale.tooltip");
   private final fpw<Double> ca = new fpw<>("options.screenEffectScale", fpw.a(bZ), fpx::b, fpw.m.a, 1.0, $$0x -> {
   });
   private static final wy cb = wy.c("options.fovEffectScale.tooltip");
   private final fpw<Double> cc = new fpw<>(
      "options.fovEffectScale", fpw.a(cb), fpx::b, fpw.m.a.a(azm::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final wy cd = wy.c("options.darknessEffectScale.tooltip");
   private final fpw<Double> ce = new fpw<>("options.darknessEffectScale", fpw.a(cd), fpx::b, fpw.m.a.a(azm::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final wy cf = wy.c("options.glintSpeed.tooltip");
   private final fpw<Double> cg = new fpw<>("options.glintSpeed", fpw.a(cf), fpx::b, fpw.m.a, 0.5, $$0x -> {
   });
   private static final wy ch = wy.c("options.glintStrength.tooltip");
   private final fpw<Double> ci = new fpw<>("options.glintStrength", fpw.a(ch), fpx::b, fpw.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final wy cj = wy.c("options.damageTiltStrength.tooltip");
   private final fpw<Double> ck = new fpw<>("options.damageTiltStrength", fpw.a(cj), fpx::b, fpw.m.a, 1.0, $$0x -> {
   });
   private final fpw<Double> cl = new fpw<>("options.gamma", fpw.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wy.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wy.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wy.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fpw.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cm = 2147483646;
   private final fpw<Integer> cn = new fpw<>(
      "options.guiScale", fpw.a(), ($$0x, $$1x) -> $$1x == 0 ? wy.c("options.guiScale.auto") : wy.b(Integer.toString($$1x)), new fpw.c(0, () -> {
         fpt $$0x = fpt.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fpw<ari> co = new fpw<>(
      "options.particles", fpw.a(), fpw.b(), new fpw.e<>(Arrays.asList(ari.values()), Codec.INT.xmap(ari::a, ari::b)), ari.a, $$0x -> {
      }
   );
   private final fpw<fpv> cp = new fpw<>(
      "options.narrator",
      fpw.a(),
      ($$0x, $$1x) -> (wy)(this.W.aY().a() ? $$1x.b() : wy.c("options.narrator.notavailable")),
      new fpw.e<>(Arrays.asList(fpv.values()), Codec.INT.xmap(fpv::a, fpv::a)),
      fpv.a,
      $$0x -> this.W.aY().a($$0x)
   );
   public String ab = "en_us";
   private final fpw<String> cq = new fpw<>(
      "options.audioDevice",
      fpw.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wy.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wy.b($$1x.substring(hor.c)) : wy.b($$1x);
         }
      },
      new fpw.h<>(
         () -> Stream.concat(Stream.of(""), fpt.Q().ak().a().stream()).toList(),
         $$0x -> fpt.Q().r() && $$0x != "" && !fpt.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hou $$1x = fpt.Q().ak();
         $$1x.j();
         $$1x.a(hnj.a(awn.Bv, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;
   public boolean ae = true;

   public fpw<Boolean> a() {
      return this.ak;
   }

   public fpw<Boolean> b() {
      return this.am;
   }

   public fpw<Boolean> c() {
      return this.ao;
   }

   public fpw<Double> d() {
      return this.ap;
   }

   public fpw<Integer> e() {
      return this.aq;
   }

   public fpw<Integer> f() {
      return this.ar;
   }

   public fpw<Double> g() {
      return this.at;
   }

   public fpw<Integer> h() {
      return this.au;
   }

   public fpw<fpp> i() {
      return this.ax;
   }

   public fpw<fpf> j() {
      return this.ay;
   }

   public fpw<fpl> k() {
      return this.aC;
   }

   public fpw<Boolean> l() {
      return this.aD;
   }

   public fpw<fpz> m() {
      return this.aH;
   }

   public void a(aun $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (auk $$2 : $$0.g()) {
         if (!$$2.j()) {
            this.i.add($$2.g());
            if (!$$2.d().a()) {
               this.j.add($$2.g());
            }
         }
      }

      this.az();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.W.l();
      }
   }

   public fpw<crj> n() {
      return this.aI;
   }

   public fpw<Double> o() {
      return this.aJ;
   }

   public fpw<Double> p() {
      return this.aK;
   }

   public fpw<Integer> q() {
      return this.aN;
   }

   public int r() {
      return this.q().c();
   }

   public fpw<Double> s() {
      return this.aO;
   }

   public fpw<Double> t() {
      return this.aP;
   }

   public fpw<Boolean> u() {
      return this.aR;
   }

   public fpw<Boolean> v() {
      return this.aT;
   }

   public fpw<Boolean> w() {
      return this.aU;
   }

   public fpw<bxa> x() {
      return this.aW;
   }

   public fpw<Double> y() {
      return this.aX;
   }

   public fpw<Double> z() {
      return this.aY;
   }

   public fpw<Double> A() {
      return this.aZ;
   }

   public fpw<Double> B() {
      return this.ba;
   }

   public fpw<Double> C() {
      return this.bb;
   }

   public fpw<Double> D() {
      return this.bd;
   }

   public fpw<Integer> E() {
      return this.be;
   }

   public fpw<fpa> F() {
      return this.bf;
   }

   public fpw<Integer> G() {
      return this.bg;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return azm.a(Math.log10($$0) * 100.0);
   }

   public fpw<Double> H() {
      return this.bh;
   }

   public fpw<Boolean> I() {
      return this.bi;
   }

   public fpw<Boolean> J() {
      return this.bj;
   }

   public fpw<Boolean> K() {
      return this.bl;
   }

   public fpw<Boolean> L() {
      return this.bm;
   }

   public fpw<Boolean> M() {
      return this.bn;
   }

   public fpw<Boolean> N() {
      return this.bo;
   }

   public fpw<Boolean> O() {
      return this.bp;
   }

   public fpw<Boolean> P() {
      return this.bq;
   }

   public fpw<Boolean> Q() {
      return this.br;
   }

   public fpw<Boolean> R() {
      return this.bs;
   }

   private static void aI() {
      fpt $$0 = fpt.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fpw<Boolean> S() {
      return this.bt;
   }

   private static boolean aJ() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fpw<Boolean> T() {
      return this.bu;
   }

   public fpw<Boolean> U() {
      return this.bv;
   }

   public fpw<Boolean> V() {
      return this.bw;
   }

   public fpw<Boolean> W() {
      return this.by;
   }

   public fpw<Boolean> X() {
      return this.bA;
   }

   public fpw<Boolean> Y() {
      return this.bB;
   }

   public final float a(awo $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fpw<Double> b(awo $$0) {
      return Objects.requireNonNull(this.bC.get($$0));
   }

   private fpw<Double> a(String $$0, awo $$1) {
      return new fpw<>($$0, fpw.a(), fpx::b, fpw.m.a, 1.0, $$1x -> fpt.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fpw<Boolean> Z() {
      return this.bD;
   }

   public fpw<Boolean> aa() {
      return this.bG;
   }

   public fpw<Boolean> ab() {
      return this.bH;
   }

   public fpw<Boolean> ac() {
      return this.bI;
   }

   public fpw<Boolean> ad() {
      return this.bJ;
   }

   public fpw<Boolean> ae() {
      return this.bK;
   }

   public fpw<Boolean> af() {
      return this.bN;
   }

   public fpw<Boolean> ag() {
      return this.bO;
   }

   public fpw<Boolean> ah() {
      return this.bQ;
   }

   public fpw<Boolean> ai() {
      return this.bR;
   }

   public fpw<Boolean> aj() {
      return this.bT;
   }

   public fpw<Integer> ak() {
      return this.bW;
   }

   public fpw<Boolean> al() {
      return this.bY;
   }

   public fpw<Double> am() {
      return this.ca;
   }

   public fpw<Double> an() {
      return this.cc;
   }

   public fpw<Double> ao() {
      return this.ce;
   }

   public fpw<Double> ap() {
      return this.cg;
   }

   public fpw<Double> aq() {
      return this.ci;
   }

   public fpw<Double> ar() {
      return this.ck;
   }

   public fpw<Double> as() {
      return this.cl;
   }

   public fpw<Integer> at() {
      return this.cn;
   }

   public fpw<ari> au() {
      return this.co;
   }

   public fpw<fpv> av() {
      return this.cp;
   }

   public fpw<String> aw() {
      return this.cq;
   }

   public void ax() {
      this.ac = false;
      this.az();
   }

   public fpx(fpt $$0, File $$1) {
      this.W = $$0;
      this.bU = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new fpw<>(
         "options.renderDistance",
         fpw.a(),
         ($$0x, $$1x) -> a($$0x, wy.a("options.chunks", $$1x)),
         new fpw.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fpt.Q().f.o()
      );
      this.ar = new fpw<>(
         "options.simulationDistance", fpw.a(), ($$0x, $$1x) -> a($$0x, wy.a("options.chunks", $$1x)), new fpw.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = ag.n() == ag.a.c;
      this.ay();
   }

   public float a(float $$0) {
      return this.bH.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return axw.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bH.c() ? $$0 : axw.a(this.aO.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(fpx.b $$0) {
      $$0.a("ao", this.aD);
      $$0.a("biomeBlendRadius", this.bg);
      $$0.a("enableVsync", this.br);
      $$0.a("entityDistanceScaling", this.at);
      $$0.a("entityShadows", this.bs);
      $$0.a("forceUnicodeFont", this.bt);
      $$0.a("japaneseGlyphVariants", this.bu);
      $$0.a("fov", this.bW);
      $$0.a("fovEffectScale", this.cc);
      $$0.a("darknessEffectScale", this.ce);
      $$0.a("glintSpeed", this.cg);
      $$0.a("glintStrength", this.ci);
      $$0.a("prioritizeChunkUpdates", this.aH);
      $$0.a("fullscreen", this.bJ);
      $$0.a("gamma", this.cl);
      $$0.a("graphicsMode", this.aC);
      $$0.a("guiScale", this.cn);
      $$0.a("maxFps", this.au);
      $$0.a("inactivityFpsLimit", this.ax);
      $$0.a("mipmapLevels", this.be);
      $$0.a("narrator", this.cp);
      $$0.a("particles", this.co);
      $$0.a("reducedDebugInfo", this.bB);
      $$0.a("renderClouds", this.ay);
      $$0.a("renderDistance", this.aq);
      $$0.a("simulationDistance", this.ar);
      $$0.a("screenEffectScale", this.ca);
      $$0.a("soundDevice", this.cq);
   }

   private void a(fpx.a $$0) {
      this.a((fpx.b)$$0);
      $$0.a("autoJump", this.bj);
      $$0.a("rotateWithMinecart", this.bl);
      $$0.a("operatorItemsTab", this.bm);
      $$0.a("autoSuggestions", this.bn);
      $$0.a("chatColors", this.bo);
      $$0.a("chatLinks", this.bp);
      $$0.a("chatLinksPrompt", this.bq);
      $$0.a("discrete_mouse_scroll", this.bw);
      $$0.a("invertYMouse", this.bv);
      $$0.a("realmsNotifications", this.by);
      $$0.a("showSubtitles", this.bD);
      $$0.a("directionalAudio", this.bG);
      $$0.a("touchscreen", this.bI);
      $$0.a("bobView", this.bK);
      $$0.a("toggleCrouch", this.bN);
      $$0.a("toggleSprint", this.bO);
      $$0.a("darkMojangStudiosBackground", this.ak);
      $$0.a("hideLightningFlashes", this.am);
      $$0.a("hideSplashTexts", this.ao);
      $$0.a("mouseSensitivity", this.ap);
      $$0.a("damageTiltStrength", this.ck);
      $$0.a("highContrast", this.aR);
      $$0.a("highContrastBlockOutline", this.aT);
      $$0.a("narratorHotkey", this.aU);
      this.i = $$0.a("resourcePacks", this.i, fpx::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fpx::c, ag::toJson);
      this.Y = $$0.a("lastServer", this.Y);
      this.ab = $$0.a("lang", this.ab);
      $$0.a("chatVisibility", this.aI);
      $$0.a("chatOpacity", this.aJ);
      $$0.a("chatLineSpacing", this.aK);
      $$0.a("textBackgroundOpacity", this.aO);
      $$0.a("backgroundForChatOnly", this.bH);
      this.l = $$0.a("hideServerAddress", this.l);
      this.m = $$0.a("advancedItemTooltips", this.m);
      this.n = $$0.a("pauseOnLostFocus", this.n);
      this.o = $$0.a("overrideWidth", this.o);
      this.p = $$0.a("overrideHeight", this.p);
      $$0.a("chatHeightFocused", this.ba);
      $$0.a("chatDelay", this.bb);
      $$0.a("chatHeightUnfocused", this.aZ);
      $$0.a("chatScale", this.aX);
      $$0.a("chatWidth", this.aY);
      $$0.a("notificationDisplayTime", this.bd);
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aW);
      $$0.a("attackIndicator", this.bf);
      this.r = $$0.a("tutorialStep", this.r, hpy::a, hpy::a);
      $$0.a("mouseWheelSensitivity", this.bh);
      $$0.a("rawMouseInput", this.bi);
      this.t = $$0.a("glDebugVerbosity", this.t);
      this.u = $$0.a("skipMultiplayerWarning", this.u);
      $$0.a("hideMatchedNames", this.bQ);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.ad = $$0.a("syncChunkWrites", this.ad);
      $$0.a("showAutosaveIndicator", this.bR);
      $$0.a("allowServerListing", this.bA);
      $$0.a("onlyShowSecureChat", this.bT);
      $$0.a("panoramaScrollSpeed", this.aP);
      $$0.a("telemetryOptInExtra", this.bY);
      this.ac = $$0.a("onboardAccessibility", this.ac);
      $$0.a("menuBackgroundBlurriness", this.aN);
      this.ae = $$0.a("startedCleanly", this.ae);

      for (fpr $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fiu.a($$3));
         }
      }

      for (awo $$4 : awo.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bC.get($$4));
      }

      for (cro $$5 : cro.values()) {
         boolean $$6 = this.aV.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.a($$5, $$7);
         }
      }
   }

   public void ay() {
      try {
         if (!this.bU.exists()) {
            return;
         }

         tz $$0 = new tz();

         try (BufferedReader $$1 = Files.newReader(this.bU, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = ai.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  af.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final tz $$2 = this.a($$0);
         if (!$$2.c("graphicsMode") && $$2.c("fancyGraphics")) {
            if (a($$2.j("fancyGraphics"))) {
               this.aC.a(fpl.b);
            } else {
               this.aC.a(fpl.a);
            }
         }

         this.a(
            new fpx.a() {
               @Nullable
               private String a(String $$0) {
                  uw $$1 = $$2.a($$0);
                  if ($$1 == null) {
                     return null;
                  } else if ($$1 instanceof uu $$2) {
                     return $$2.p_();
                  } else {
                     throw new IllegalStateException("Cannot read field of wrong type, expected string: " + $$1);
                  }
               }

               @Override
               public <T> void a(String $$0, fpw<T> $$1) {
                  String $$2 = this.a($$0);
                  if ($$2 != null) {
                     JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                     JsonElement $$4 = JsonParser.parseReader($$3);
                     $$1.d()
                        .parse(JsonOps.INSTANCE, $$4)
                        .ifError($$2xx -> fpx.af.error("Error parsing option value {} for option {}: {}", new Object[]{$$2, $$1, $$2xx.message()}))
                        .ifSuccess($$1::a);
                  }
               }

               @Override
               public int a(String $$0, int $$1) {
                  String $$2 = this.a($$0);
                  if ($$2 != null) {
                     try {
                        return Integer.parseInt($$2);
                     } catch (NumberFormatException var5) {
                        fpx.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                     }
                  }

                  return $$1;
               }

               @Override
               public boolean a(String $$0, boolean $$1) {
                  String $$2 = this.a($$0);
                  return $$2 != null ? fpx.a($$2) : $$1;
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
                  } else if (fpx.a($$2)) {
                     return 1.0F;
                  } else if (fpx.b($$2)) {
                     return 0.0F;
                  } else {
                     try {
                        return Float.parseFloat($$2);
                     } catch (NumberFormatException var5) {
                        fpx.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
                        return $$1;
                     }
                  }
               }

               @Override
               public <T> T a(String $$0, T $$1, Function<String, T> $$2, Function<T, String> $$3) {
                  String $$4 = this.a($$0);
                  return $$4 == null ? $$1 : $$2.apply($$4);
               }
            }
         );
         if ($$2.c("fullscreenResolution")) {
            this.k = $$2.j("fullscreenResolution");
         }

         fpr.d();
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

   private tz a(tz $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.j("version"));
      } catch (RuntimeException var4) {
      }

      return bbb.e.a(this.W.au(), $$0, $$1);
   }

   public void az() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bU), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ac.b().d().c());
         this.a(new fpx.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fpw<T> $$1) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1x -> fpx.af.error("Error saving option " + $$1 + ": " + $$1x)).ifSuccess($$2x -> {
                  this.a($$0);
                  $$0.println(fpx.ag.toJson($$2x));
               });
            }

            @Override
            public int a(String $$0, int $$1) {
               this.a($$0);
               $$0.println($$1);
               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               this.a($$0);
               $$0.println($$1);
               return $$1;
            }

            @Override
            public String a(String $$0, String $$1) {
               this.a($$0);
               $$0.println($$1);
               return $$1;
            }

            @Override
            public float a(String $$0, float $$1) {
               this.a($$0);
               $$0.println($$1);
               return $$1;
            }

            @Override
            public <T> T a(String $$0, T $$1, Function<String, T> $$2x, Function<T, String> $$3) {
               this.a($$0);
               $$0.println($$3.apply($$1));
               return $$1;
            }
         });
         String $$1 = this.aK();
         if ($$1 != null) {
            $$0.println("fullscreenResolution:" + $$1);
         }
      } catch (Exception var6) {
         af.error("Failed to save options", var6);
      }

      this.aB();
   }

   @Nullable
   private String aK() {
      fjc $$0 = this.W.aO();
      if ($$0 == null) {
         return this.k;
      } else {
         return $$0.e().isPresent() ? $$0.e().get().g() : null;
      }
   }

   public ara aA() {
      int $$0 = 0;

      for (cro $$1 : this.aV) {
         $$0 |= $$1.a();
      }

      return new ara(this.ab, this.aq.c(), this.aI.c(), this.bo.c(), $$0, this.aW.c(), this.W.aT(), this.bA.c(), this.co.c());
   }

   public void aB() {
      if (this.W.t != null) {
         this.W.t.j.a(this.aA());
      }
   }

   public void a(cro $$0, boolean $$1) {
      if ($$1) {
         this.aV.add($$0);
      } else {
         this.aV.remove($$0);
      }
   }

   public boolean a(cro $$0) {
      return this.aV.contains($$0);
   }

   public fpf aC() {
      return this.aH() >= 4 ? this.ay.c() : fpf.a;
   }

   public boolean aD() {
      return this.q;
   }

   public void b(aun $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         auk $$4 = $$0.c($$3);
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

   public fpc aE() {
      return this.bV;
   }

   public void a(fpc $$0) {
      this.bV = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = azc.a(ag, $$0, ah);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aF() {
      return this.bU;
   }

   public String aG() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fpx.b() {
         @Override
         public <T> void a(String $$0x, fpw<T> $$1) {
            $$0.add(Pair.of($$0, $$1.c()));
         }
      });
      $$0.add(Pair.of("fullscreenResolution", String.valueOf(this.k)));
      $$0.add(Pair.of("glDebugVerbosity", this.t));
      $$0.add(Pair.of("overrideHeight", this.p));
      $$0.add(Pair.of("overrideWidth", this.o));
      $$0.add(Pair.of("syncChunkWrites", this.ad));
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

   public int aH() {
      return this.as > 0 ? Math.min(this.aq.c(), this.as) : this.aq.c();
   }

   private static wy c(wy $$0, int $$1) {
      return wy.a("options.pixel_value", $$0, $$1);
   }

   private static wy a(wy $$0, double $$1) {
      return wy.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static wy a(wy $$0, wy $$1) {
      return wy.a("options.generic_value", $$0, $$1);
   }

   public static wy a(wy $$0, int $$1) {
      return a($$0, wy.b(Integer.toString($$1)));
   }

   public static wy b(wy $$0, int $$1) {
      return $$1 == 0 ? a($$0, wx.c) : a($$0, $$1);
   }

   private static wy b(wy $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, wx.c) : a($$0, $$1);
   }

   interface a extends fpx.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fpw<T> var2);
   }
}
