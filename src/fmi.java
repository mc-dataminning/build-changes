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

public class fmi {
   static final Logger ae = LogUtils.getLogger();
   static final Gson af = new Gson();
   private static final TypeToken<List<String>> ag = new TypeToken<List<String>>() {
   };
   public static final int a = 2;
   public static final int b = 4;
   public static final int c = 8;
   public static final int d = 12;
   public static final int e = 16;
   public static final int f = 32;
   private static final Splitter ah = Splitter.on(':').limit(2);
   public static final String g = "";
   private static final xv ai = xv.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fmh<Boolean> aj = fmh.a("options.darkMojangStudiosBackgroundColor", fmh.a(ai), false);
   private static final xv ak = xv.c("options.hideLightningFlashes.tooltip");
   private final fmh<Boolean> al = fmh.a("options.hideLightningFlashes", fmh.a(ak), false);
   private static final xv am = xv.c("options.hideSplashTexts.tooltip");
   private final fmh<Boolean> an = fmh.a("options.hideSplashTexts", fmh.a(am), false);
   private final fmh<Double> ao = new fmh<>("options.sensitivity", fmh.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xv.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xv.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fmh.m.a, 0.5, $$0x -> {
   });
   private final fmh<Integer> ap;
   private final fmh<Integer> aq;
   private int ar = 0;
   private final fmh<Double> as = new fmh<>(
      "options.entityDistanceScaling",
      fmh.a(),
      fmi::a,
      new fmh.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fmh<Integer> at = new fmh<>(
      "options.framerateLimit",
      fmh.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xv.c("options.framerateLimit.max")) : a($$0x, xv.a("options.framerate", $$1x)),
      new fmh.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fme.Q().aP().a($$0x)
   );
   private static final xv au = xv.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final xv av = xv.c("options.inactivityFpsLimit.afk.tooltip");
   private final fmh<fma> aw = new fmh<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> fpp.a(au);
         case b -> fpp.a(av);
      };
   }, fmh.b(), new fmh.e<>(Arrays.asList(fma.values()), fma.c), fma.b, $$0x -> {
   });
   private final fmh<flq> ax = new fmh<>(
      "options.renderClouds",
      fmh.a(),
      fmh.b(),
      new fmh.e<>(Arrays.asList(flq.values()), Codec.withAlternative(flq.d, Codec.BOOL, $$0x -> $$0x ? flq.c : flq.a)),
      flq.c,
      $$0x -> {
      }
   );
   private static final xv ay = xv.c("options.graphics.fast.tooltip");
   private static final xv az = xv.a("options.graphics.fabulous.tooltip", xv.c("options.graphics.fabulous").a(n.u));
   private static final xv aA = xv.c("options.graphics.fancy.tooltip");
   private final fmh<flw> aB = new fmh<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fpp.a(aA);
            case a -> fpp.a(ay);
            case c -> fpp.a(az);
         };
      },
      ($$0x, $$1x) -> {
         yj $$2x = xv.c($$1x.a());
         return $$1x == flw.c ? $$2x.a(n.u) : $$2x;
      },
      new fmh.a<>(
         Arrays.asList(flw.values()),
         Stream.of(flw.values()).filter($$0x -> $$0x != flw.c).collect(Collectors.toList()),
         () -> fme.Q().r() && fme.Q().aj().h(),
         ($$0x, $$1x) -> {
            fme $$2x = fme.Q();
            gla $$3 = $$2x.aj();
            if ($$1x == flw.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.e();
            }
         },
         Codec.INT.xmap(flw::a, flw::b)
      ),
      flw.b,
      $$0x -> {
      }
   );
   private final fmh<Boolean> aC = fmh.a("options.ao", true, $$0x -> fme.Q().f.e());
   private static final xv aD = xv.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xv aE = xv.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xv aF = xv.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fmh<fmk> aG = new fmh<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fpp.a(aD);
         case b -> fpp.a(aE);
         case c -> fpp.a(aF);
      };
   }, fmh.b(), new fmh.e<>(Arrays.asList(fmk.values()), Codec.INT.xmap(fmk::a, fmk::b)), fmk.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fmh<cpt> aH = new fmh<>(
      "options.chat.visibility", fmh.a(), fmh.b(), new fmh.e<>(Arrays.asList(cpt.values()), Codec.INT.xmap(cpt::a, cpt::b)), cpt.a, $$0x -> {
      }
   );
   private final fmh<Double> aI = new fmh<>("options.chat.opacity", fmh.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fmh.m.a, 1.0, $$0x -> fme.Q().m.d().b());
   private final fmh<Double> aJ = new fmh<>("options.chat.line_spacing", fmh.a(), fmi::a, fmh.m.a, 0.0, $$0x -> {
   });
   private static final xv aK = xv.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aL = 5;
   private final fmh<Integer> aM = new fmh<>("options.accessibility.menu_background_blurriness", fmh.a(aK), fmi::b, new fmh.f(0, 10), 5, $$0x -> {
   });
   private final fmh<Double> aN = new fmh<>("options.accessibility.text_background_opacity", fmh.a(), fmi::a, fmh.m.a, 0.5, $$0x -> fme.Q().m.d().b());
   private final fmh<Double> aO = new fmh<>("options.accessibility.panorama_speed", fmh.a(), fmi::a, fmh.m.a, 1.0, $$0x -> {
   });
   private static final xv aP = xv.c("options.accessibility.high_contrast.tooltip");
   private final fmh<Boolean> aQ = fmh.a("options.accessibility.high_contrast", fmh.a(aP), false, $$0x -> {
      avg $$1x = fme.Q().ad();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private static final xv aR = xv.c("options.accessibility.high_contrast_block_outline.tooltip");
   private final fmh<Boolean> aS = fmh.a("options.accessibility.high_contrast_block_outline", fmh.a(aR), false);
   private final fmh<Boolean> aT = fmh.a(
      "options.accessibility.narrator_hotkey",
      fmh.a(fme.a ? xv.c("options.accessibility.narrator_hotkey.mac.tooltip") : xv.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cpx> aU = EnumSet.allOf(cpx.class);
   private final fmh<bvz> aV = new fmh<>("options.mainHand", fmh.a(), fmh.b(), new fmh.e<>(Arrays.asList(bvz.values()), bvz.c), bvz.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fmh<Double> aW = new fmh<>(
      "options.chat.scale",
      fmh.a(),
      ($$0x, $$1x) -> (xv)($$1x == 0.0 ? xu.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fmh.m.a,
      1.0,
      $$0x -> fme.Q().m.d().b()
   );
   private final fmh<Double> aX = new fmh<>("options.chat.width", fmh.a(), ($$0x, $$1x) -> c($$0x, foe.a($$1x)), fmh.m.a, 1.0, $$0x -> fme.Q().m.d().b());
   private final fmh<Double> aY = new fmh<>(
      "options.chat.height.unfocused", fmh.a(), ($$0x, $$1x) -> c($$0x, foe.b($$1x)), fmh.m.a, foe.i(), $$0x -> fme.Q().m.d().b()
   );
   private final fmh<Double> aZ = new fmh<>(
      "options.chat.height.focused", fmh.a(), ($$0x, $$1x) -> c($$0x, foe.b($$1x)), fmh.m.a, 1.0, $$0x -> fme.Q().m.d().b()
   );
   private final fmh<Double> ba = new fmh<>(
      "options.chat.delay_instant",
      fmh.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xv.c("options.chat.delay_none") : xv.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fmh.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fme.Q().ba().a($$0x)
   );
   private static final xv bb = xv.c("options.notifications.display_time.tooltip");
   private final fmh<Double> bc = new fmh<>(
      "options.notifications.display_time",
      fmh.a(bb),
      ($$0x, $$1x) -> a($$0x, xv.a("options.multiplier", $$1x)),
      new fmh.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fmh<Integer> bd = new fmh<>(
      "options.mipmapLevels", fmh.a(), ($$0x, $$1x) -> (xv)($$1x == 0 ? xu.a($$0x, false) : a($$0x, $$1x.intValue())), new fmh.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fmh<flm> be = new fmh<>(
      "options.attackIndicator", fmh.a(), fmh.b(), new fmh.e<>(Arrays.asList(flm.values()), Codec.INT.xmap(flm::a, flm::b)), flm.b, $$0x -> {
      }
   );
   public hhp r = hhp.a;
   public boolean s = false;
   private final fmh<Integer> bf = new fmh<>("options.biomeBlendRadius", fmh.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xv.c("options.biomeBlendRadius." + $$2x));
   }, new fmh.f(0, 7, false), 2, $$0x -> fme.Q().f.e());
   private final fmh<Double> bg = new fmh<>(
      "options.mouseWheelSensitivity",
      fmh.a(),
      ($$0x, $$1x) -> a($$0x, xv.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fmh.f(-200, 100).a(fmi::c, fmi::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fmh<Boolean> bh = fmh.a("options.rawMouseInput", true, $$0x -> {
      fft $$1x = fme.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fmh<Boolean> bi = fmh.a("options.autoJump", false);
   private static final xv bj = xv.c("options.rotateWithMinecart.tooltip");
   private final fmh<Boolean> bk = fmh.a("options.rotateWithMinecart", fmh.a(bj), false);
   private final fmh<Boolean> bl = fmh.a("options.operatorItemsTab", false);
   private final fmh<Boolean> bm = fmh.a("options.autoSuggestCommands", true);
   private final fmh<Boolean> bn = fmh.a("options.chat.color", true);
   private final fmh<Boolean> bo = fmh.a("options.chat.links", true);
   private final fmh<Boolean> bp = fmh.a("options.chat.links.prompt", true);
   private final fmh<Boolean> bq = fmh.a("options.vsync", true, $$0x -> {
      if (fme.Q().aO() != null) {
         fme.Q().aO().a($$0x);
      }
   });
   private final fmh<Boolean> br = fmh.a("options.entityShadows", true);
   private final fmh<Boolean> bs = fmh.a("options.forceUnicodeFont", false, $$0x -> aI());
   private final fmh<Boolean> bt = fmh.a("options.japaneseGlyphVariants", fmh.a(xv.c("options.japaneseGlyphVariants.tooltip")), aJ(), $$0x -> aI());
   private final fmh<Boolean> bu = fmh.a("options.invertMouse", false);
   private final fmh<Boolean> bv = fmh.a("options.discrete_mouse_scroll", false);
   private static final xv bw = xv.c("options.realmsNotifications.tooltip");
   private final fmh<Boolean> bx = fmh.a("options.realmsNotifications", fmh.a(bw), true);
   private static final xv by = xv.c("options.allowServerListing.tooltip");
   private final fmh<Boolean> bz = fmh.a("options.allowServerListing", fmh.a(by), true, $$0x -> {
   });
   private final fmh<Boolean> bA = fmh.a("options.reducedDebugInfo", false);
   private final Map<axg, fmh<Double>> bB = ae.a(new EnumMap<>(axg.class), $$0x -> {
      for (axg $$1x : axg.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fmh<Boolean> bC = fmh.a("options.showSubtitles", false);
   private static final xv bD = xv.c("options.directionalAudio.on.tooltip");
   private static final xv bE = xv.c("options.directionalAudio.off.tooltip");
   private final fmh<Boolean> bF = fmh.a("options.directionalAudio", $$0x -> $$0x ? fpp.a(bD) : fpp.a(bE), false, $$0x -> {
      hgl $$1x = fme.Q().ak();
      $$1x.k();
      $$1x.a(hfb.a(axf.AQ, 1.0F));
   });
   private final fmh<Boolean> bG = new fmh<>(
      "options.accessibility.text_background",
      fmh.a(),
      ($$0x, $$1x) -> $$1x ? xv.c("options.accessibility.text_background.chat") : xv.c("options.accessibility.text_background.everywhere"),
      fmh.a,
      true,
      $$0x -> {
      }
   );
   private final fmh<Boolean> bH = fmh.a("options.touchscreen", false);
   private final fmh<Boolean> bI = fmh.a("options.fullscreen", false, $$0x -> {
      fme $$1x = fme.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ad().a($$1x.aO().i());
      }
   });
   private final fmh<Boolean> bJ = fmh.a("options.viewBobbing", true);
   private static final xv bK = xv.c("options.key.toggle");
   private static final xv bL = xv.c("options.key.hold");
   private final fmh<Boolean> bM = new fmh<>("key.sneak", fmh.a(), ($$0x, $$1x) -> $$1x ? bK : bL, fmh.a, false, $$0x -> {
   });
   private final fmh<Boolean> bN = new fmh<>("key.sprint", fmh.a(), ($$0x, $$1x) -> $$1x ? bK : bL, fmh.a, false, $$0x -> {
   });
   public boolean u;
   private static final xv bO = xv.c("options.hideMatchedNames.tooltip");
   private final fmh<Boolean> bP = fmh.a("options.hideMatchedNames", fmh.a(bO), true);
   private final fmh<Boolean> bQ = fmh.a("options.autosaveIndicator", true);
   private static final xv bR = xv.c("options.onlyShowSecureChat.tooltip");
   private final fmh<Boolean> bS = fmh.a("options.onlyShowSecureChat", fmh.a(bR), false);
   public final fmc v = new fmc("key.forward", 87, "key.categories.movement");
   public final fmc w = new fmc("key.left", 65, "key.categories.movement");
   public final fmc x = new fmc("key.back", 83, "key.categories.movement");
   public final fmc y = new fmc("key.right", 68, "key.categories.movement");
   public final fmc z = new fmc("key.jump", 32, "key.categories.movement");
   public final fmc A = new fmp("key.sneak", 340, "key.categories.movement", this.bM::c);
   public final fmc B = new fmp("key.sprint", 341, "key.categories.movement", this.bN::c);
   public final fmc C = new fmc("key.inventory", 69, "key.categories.inventory");
   public final fmc D = new fmc("key.swapOffhand", 70, "key.categories.inventory");
   public final fmc E = new fmc("key.drop", 81, "key.categories.inventory");
   public final fmc F = new fmc("key.use", ffl.b.c, 1, "key.categories.gameplay");
   public final fmc G = new fmc("key.attack", ffl.b.c, 0, "key.categories.gameplay");
   public final fmc H = new fmc("key.pickItem", ffl.b.c, 2, "key.categories.gameplay");
   public final fmc I = new fmc("key.chat", 84, "key.categories.multiplayer");
   public final fmc J = new fmc("key.playerlist", 258, "key.categories.multiplayer");
   public final fmc K = new fmc("key.command", 47, "key.categories.multiplayer");
   public final fmc L = new fmc("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fmc M = new fmc("key.screenshot", 291, "key.categories.misc");
   public final fmc N = new fmc("key.togglePerspective", 294, "key.categories.misc");
   public final fmc O = new fmc("key.smoothCamera", ffl.bv.b(), "key.categories.misc");
   public final fmc P = new fmc("key.fullscreen", 300, "key.categories.misc");
   public final fmc Q = new fmc("key.spectatorOutlines", ffl.bv.b(), "key.categories.misc");
   public final fmc R = new fmc("key.advancements", 76, "key.categories.misc");
   public final fmc[] S = new fmc[]{
      new fmc("key.hotbar.1", 49, "key.categories.inventory"),
      new fmc("key.hotbar.2", 50, "key.categories.inventory"),
      new fmc("key.hotbar.3", 51, "key.categories.inventory"),
      new fmc("key.hotbar.4", 52, "key.categories.inventory"),
      new fmc("key.hotbar.5", 53, "key.categories.inventory"),
      new fmc("key.hotbar.6", 54, "key.categories.inventory"),
      new fmc("key.hotbar.7", 55, "key.categories.inventory"),
      new fmc("key.hotbar.8", 56, "key.categories.inventory"),
      new fmc("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fmc T = new fmc("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fmc U = new fmc("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fmc[] V = (fmc[])ArrayUtils.addAll(
      new fmc[]{
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
   protected fme W;
   private final File bT;
   public boolean X;
   private flo bU = flo.a;
   public String Y = "";
   public boolean Z;
   private final fmh<Integer> bV = new fmh<>("options.fov", fmh.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xv.c("options.fov.min"));
         case 110 -> a($$0x, xv.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fmh.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fme.Q().f.p());
   private static final xv bW = xv.a("options.telemetry.button.tooltip", xv.c("options.telemetry.state.minimal"), xv.c("options.telemetry.state.all"));
   private final fmh<Boolean> bX = fmh.a("options.telemetry.button", fmh.a(bW), ($$0x, $$1x) -> {
      fme $$2x = fme.Q();
      if (!$$2x.E()) {
         return xv.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xv.c("options.telemetry.state.all") : xv.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xv bY = xv.c("options.screenEffectScale.tooltip");
   private final fmh<Double> bZ = new fmh<>("options.screenEffectScale", fmh.a(bY), fmi::b, fmh.m.a, 1.0, $$0x -> {
   });
   private static final xv ca = xv.c("options.fovEffectScale.tooltip");
   private final fmh<Double> cb = new fmh<>(
      "options.fovEffectScale", fmh.a(ca), fmi::b, fmh.m.a.a(bae::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final xv cc = xv.c("options.darknessEffectScale.tooltip");
   private final fmh<Double> cd = new fmh<>("options.darknessEffectScale", fmh.a(cc), fmi::b, fmh.m.a.a(bae::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final xv ce = xv.c("options.glintSpeed.tooltip");
   private final fmh<Double> cf = new fmh<>("options.glintSpeed", fmh.a(ce), fmi::b, fmh.m.a, 0.5, $$0x -> {
   });
   private static final xv cg = xv.c("options.glintStrength.tooltip");
   private final fmh<Double> ch = new fmh<>("options.glintStrength", fmh.a(cg), fmi::b, fmh.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final xv ci = xv.c("options.damageTiltStrength.tooltip");
   private final fmh<Double> cj = new fmh<>("options.damageTiltStrength", fmh.a(ci), fmi::b, fmh.m.a, 1.0, $$0x -> {
   });
   private final fmh<Double> ck = new fmh<>("options.gamma", fmh.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xv.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xv.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xv.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fmh.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cl = 2147483646;
   private final fmh<Integer> cm = new fmh<>(
      "options.guiScale", fmh.a(), ($$0x, $$1x) -> $$1x == 0 ? xv.c("options.guiScale.auto") : xv.b(Integer.toString($$1x)), new fmh.c(0, () -> {
         fme $$0x = fme.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fmh<arz> cn = new fmh<>(
      "options.particles", fmh.a(), fmh.b(), new fmh.e<>(Arrays.asList(arz.values()), Codec.INT.xmap(arz::a, arz::b)), arz.a, $$0x -> {
      }
   );
   private final fmh<fmg> co = new fmh<>(
      "options.narrator",
      fmh.a(),
      ($$0x, $$1x) -> (xv)(this.W.aZ().a() ? $$1x.b() : xv.c("options.narrator.notavailable")),
      new fmh.e<>(Arrays.asList(fmg.values()), Codec.INT.xmap(fmg::a, fmg::a)),
      fmg.a,
      $$0x -> this.W.aZ().a($$0x)
   );
   public String ab = "en_us";
   private final fmh<String> cp = new fmh<>(
      "options.audioDevice",
      fmh.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xv.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xv.b($$1x.substring(hgi.c)) : xv.b($$1x);
         }
      },
      new fmh.h<>(
         () -> Stream.concat(Stream.of(""), fme.Q().ak().a().stream()).toList(),
         $$0x -> fme.Q().r() && $$0x != "" && !fme.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hgl $$1x = fme.Q().ak();
         $$1x.k();
         $$1x.a(hfb.a(axf.AQ, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;

   public fmh<Boolean> a() {
      return this.aj;
   }

   public fmh<Boolean> b() {
      return this.al;
   }

   public fmh<Boolean> c() {
      return this.an;
   }

   public fmh<Double> d() {
      return this.ao;
   }

   public fmh<Integer> e() {
      return this.ap;
   }

   public fmh<Integer> f() {
      return this.aq;
   }

   public fmh<Double> g() {
      return this.as;
   }

   public fmh<Integer> h() {
      return this.at;
   }

   public fmh<fma> i() {
      return this.aw;
   }

   public fmh<flq> j() {
      return this.ax;
   }

   public fmh<flw> k() {
      return this.aB;
   }

   public fmh<Boolean> l() {
      return this.aC;
   }

   public fmh<fmk> m() {
      return this.aG;
   }

   public void a(avg $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (avd $$2 : $$0.g()) {
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

   public fmh<cpt> n() {
      return this.aH;
   }

   public fmh<Double> o() {
      return this.aI;
   }

   public fmh<Double> p() {
      return this.aJ;
   }

   public fmh<Integer> q() {
      return this.aM;
   }

   public int r() {
      return this.q().c();
   }

   public fmh<Double> s() {
      return this.aN;
   }

   public fmh<Double> t() {
      return this.aO;
   }

   public fmh<Boolean> u() {
      return this.aQ;
   }

   public fmh<Boolean> v() {
      return this.aS;
   }

   public fmh<Boolean> w() {
      return this.aT;
   }

   public fmh<bvz> x() {
      return this.aV;
   }

   public fmh<Double> y() {
      return this.aW;
   }

   public fmh<Double> z() {
      return this.aX;
   }

   public fmh<Double> A() {
      return this.aY;
   }

   public fmh<Double> B() {
      return this.aZ;
   }

   public fmh<Double> C() {
      return this.ba;
   }

   public fmh<Double> D() {
      return this.bc;
   }

   public fmh<Integer> E() {
      return this.bd;
   }

   public fmh<flm> F() {
      return this.be;
   }

   public fmh<Integer> G() {
      return this.bf;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return bae.a(Math.log10($$0) * 100.0);
   }

   public fmh<Double> H() {
      return this.bg;
   }

   public fmh<Boolean> I() {
      return this.bh;
   }

   public fmh<Boolean> J() {
      return this.bi;
   }

   public fmh<Boolean> K() {
      return this.bk;
   }

   public fmh<Boolean> L() {
      return this.bl;
   }

   public fmh<Boolean> M() {
      return this.bm;
   }

   public fmh<Boolean> N() {
      return this.bn;
   }

   public fmh<Boolean> O() {
      return this.bo;
   }

   public fmh<Boolean> P() {
      return this.bp;
   }

   public fmh<Boolean> Q() {
      return this.bq;
   }

   public fmh<Boolean> R() {
      return this.br;
   }

   private static void aI() {
      fme $$0 = fme.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fmh<Boolean> S() {
      return this.bs;
   }

   private static boolean aJ() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fmh<Boolean> T() {
      return this.bt;
   }

   public fmh<Boolean> U() {
      return this.bu;
   }

   public fmh<Boolean> V() {
      return this.bv;
   }

   public fmh<Boolean> W() {
      return this.bx;
   }

   public fmh<Boolean> X() {
      return this.bz;
   }

   public fmh<Boolean> Y() {
      return this.bA;
   }

   public final float a(axg $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fmh<Double> b(axg $$0) {
      return Objects.requireNonNull(this.bB.get($$0));
   }

   private fmh<Double> a(String $$0, axg $$1) {
      return new fmh<>($$0, fmh.a(), fmi::b, fmh.m.a, 1.0, $$1x -> fme.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fmh<Boolean> Z() {
      return this.bC;
   }

   public fmh<Boolean> aa() {
      return this.bF;
   }

   public fmh<Boolean> ab() {
      return this.bG;
   }

   public fmh<Boolean> ac() {
      return this.bH;
   }

   public fmh<Boolean> ad() {
      return this.bI;
   }

   public fmh<Boolean> ae() {
      return this.bJ;
   }

   public fmh<Boolean> af() {
      return this.bM;
   }

   public fmh<Boolean> ag() {
      return this.bN;
   }

   public fmh<Boolean> ah() {
      return this.bP;
   }

   public fmh<Boolean> ai() {
      return this.bQ;
   }

   public fmh<Boolean> aj() {
      return this.bS;
   }

   public fmh<Integer> ak() {
      return this.bV;
   }

   public fmh<Boolean> al() {
      return this.bX;
   }

   public fmh<Double> am() {
      return this.bZ;
   }

   public fmh<Double> an() {
      return this.cb;
   }

   public fmh<Double> ao() {
      return this.cd;
   }

   public fmh<Double> ap() {
      return this.cf;
   }

   public fmh<Double> aq() {
      return this.ch;
   }

   public fmh<Double> ar() {
      return this.cj;
   }

   public fmh<Double> as() {
      return this.ck;
   }

   public fmh<Integer> at() {
      return this.cm;
   }

   public fmh<arz> au() {
      return this.cn;
   }

   public fmh<fmg> av() {
      return this.co;
   }

   public fmh<String> aw() {
      return this.cp;
   }

   public void ax() {
      this.ac = false;
      this.az();
   }

   public fmi(fme $$0, File $$1) {
      this.W = $$0;
      this.bT = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ap = new fmh<>(
         "options.renderDistance",
         fmh.a(),
         ($$0x, $$1x) -> a($$0x, xv.a("options.chunks", $$1x)),
         new fmh.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fme.Q().f.p()
      );
      this.aq = new fmh<>(
         "options.simulationDistance", fmh.a(), ($$0x, $$1x) -> a($$0x, xv.a("options.chunks", $$1x)), new fmh.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = ae.m() == ae.a.c;
      this.ay();
   }

   public float a(float $$0) {
      return this.bG.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return ayp.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bG.c() ? $$0 : ayp.a(this.aN.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(fmi.b $$0) {
      $$0.a("ao", this.aC);
      $$0.a("biomeBlendRadius", this.bf);
      $$0.a("enableVsync", this.bq);
      $$0.a("entityDistanceScaling", this.as);
      $$0.a("entityShadows", this.br);
      $$0.a("forceUnicodeFont", this.bs);
      $$0.a("japaneseGlyphVariants", this.bt);
      $$0.a("fov", this.bV);
      $$0.a("fovEffectScale", this.cb);
      $$0.a("darknessEffectScale", this.cd);
      $$0.a("glintSpeed", this.cf);
      $$0.a("glintStrength", this.ch);
      $$0.a("prioritizeChunkUpdates", this.aG);
      $$0.a("fullscreen", this.bI);
      $$0.a("gamma", this.ck);
      $$0.a("graphicsMode", this.aB);
      $$0.a("guiScale", this.cm);
      $$0.a("maxFps", this.at);
      $$0.a("inactivityFpsLimit", this.aw);
      $$0.a("mipmapLevels", this.bd);
      $$0.a("narrator", this.co);
      $$0.a("particles", this.cn);
      $$0.a("reducedDebugInfo", this.bA);
      $$0.a("renderClouds", this.ax);
      $$0.a("renderDistance", this.ap);
      $$0.a("simulationDistance", this.aq);
      $$0.a("screenEffectScale", this.bZ);
      $$0.a("soundDevice", this.cp);
   }

   private void a(fmi.a $$0) {
      this.a((fmi.b)$$0);
      $$0.a("autoJump", this.bi);
      $$0.a("rotateWithMinecart", this.bk);
      $$0.a("operatorItemsTab", this.bl);
      $$0.a("autoSuggestions", this.bm);
      $$0.a("chatColors", this.bn);
      $$0.a("chatLinks", this.bo);
      $$0.a("chatLinksPrompt", this.bp);
      $$0.a("discrete_mouse_scroll", this.bv);
      $$0.a("invertYMouse", this.bu);
      $$0.a("realmsNotifications", this.bx);
      $$0.a("showSubtitles", this.bC);
      $$0.a("directionalAudio", this.bF);
      $$0.a("touchscreen", this.bH);
      $$0.a("bobView", this.bJ);
      $$0.a("toggleCrouch", this.bM);
      $$0.a("toggleSprint", this.bN);
      $$0.a("darkMojangStudiosBackground", this.aj);
      $$0.a("hideLightningFlashes", this.al);
      $$0.a("hideSplashTexts", this.an);
      $$0.a("mouseSensitivity", this.ao);
      $$0.a("damageTiltStrength", this.cj);
      $$0.a("highContrast", this.aQ);
      $$0.a("highContrastBlockOutline", this.aS);
      $$0.a("narratorHotkey", this.aT);
      this.i = $$0.a("resourcePacks", this.i, fmi::c, af::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fmi::c, af::toJson);
      this.Y = $$0.a("lastServer", this.Y);
      this.ab = $$0.a("lang", this.ab);
      $$0.a("chatVisibility", this.aH);
      $$0.a("chatOpacity", this.aI);
      $$0.a("chatLineSpacing", this.aJ);
      $$0.a("textBackgroundOpacity", this.aN);
      $$0.a("backgroundForChatOnly", this.bG);
      this.l = $$0.a("hideServerAddress", this.l);
      this.m = $$0.a("advancedItemTooltips", this.m);
      this.n = $$0.a("pauseOnLostFocus", this.n);
      this.o = $$0.a("overrideWidth", this.o);
      this.p = $$0.a("overrideHeight", this.p);
      $$0.a("chatHeightFocused", this.aZ);
      $$0.a("chatDelay", this.ba);
      $$0.a("chatHeightUnfocused", this.aY);
      $$0.a("chatScale", this.aW);
      $$0.a("chatWidth", this.aX);
      $$0.a("notificationDisplayTime", this.bc);
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aV);
      $$0.a("attackIndicator", this.be);
      this.r = $$0.a("tutorialStep", this.r, hhp::a, hhp::a);
      $$0.a("mouseWheelSensitivity", this.bg);
      $$0.a("rawMouseInput", this.bh);
      this.t = $$0.a("glDebugVerbosity", this.t);
      this.u = $$0.a("skipMultiplayerWarning", this.u);
      $$0.a("hideMatchedNames", this.bP);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.ad = $$0.a("syncChunkWrites", this.ad);
      $$0.a("showAutosaveIndicator", this.bQ);
      $$0.a("allowServerListing", this.bz);
      $$0.a("onlyShowSecureChat", this.bS);
      $$0.a("panoramaScrollSpeed", this.aO);
      $$0.a("telemetryOptInExtra", this.bX);
      this.ac = $$0.a("onboardAccessibility", this.ac);
      $$0.a("menuBackgroundBlurriness", this.aM);

      for (fmc $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(ffl.a($$3));
         }
      }

      for (axg $$4 : axg.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bB.get($$4));
      }

      for (cpx $$5 : cpx.values()) {
         boolean $$6 = this.aU.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.a($$5, $$7);
         }
      }
   }

   public void ay() {
      try {
         if (!this.bT.exists()) {
            return;
         }

         ux $$0 = new ux();

         try (BufferedReader $$1 = Files.newReader(this.bT, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = ah.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  ae.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final ux $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(flw.b);
            } else {
               this.aB.a(flw.a);
            }
         }

         this.a(new fmi.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).u_() : null;
            }

            @Override
            public <T> void a(String $$0, fmh<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fmi.ae.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fmi.ae.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fmi.a($$2) : $$1;
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
               } else if (fmi.a($$2)) {
                  return 1.0F;
               } else if (fmi.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fmi.ae.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fmc.d();
      } catch (Exception var7) {
         ae.error("Failed to load options", var7);
      }
   }

   static boolean a(String $$0) {
      return "true".equals($$0);
   }

   static boolean b(String $$0) {
      return "false".equals($$0);
   }

   private ux a(ux $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return bbs.e.a(this.W.au(), $$0, $$1);
   }

   public void az() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bT), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fmi.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fmh<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> fmi.ae.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(fmi.af.toJson($$2));
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
         if (this.W.aO().e().isPresent()) {
            $$0.println("fullscreenResolution:" + this.W.aO().e().get().g());
         }
      } catch (Exception var6) {
         ae.error("Failed to save options", var6);
      }

      this.aB();
   }

   public ars aA() {
      int $$0 = 0;

      for (cpx $$1 : this.aU) {
         $$0 |= $$1.a();
      }

      return new ars(this.ab, this.ap.c(), this.aH.c(), this.bn.c(), $$0, this.aV.c(), this.W.aU(), this.bz.c(), this.cn.c());
   }

   public void aB() {
      if (this.W.t != null) {
         this.W.t.i.a(this.aA());
      }
   }

   public void a(cpx $$0, boolean $$1) {
      if ($$1) {
         this.aU.add($$0);
      } else {
         this.aU.remove($$0);
      }
   }

   public boolean a(cpx $$0) {
      return this.aU.contains($$0);
   }

   public flq aC() {
      return this.aH() >= 4 ? this.ax.c() : flq.a;
   }

   public boolean aD() {
      return this.q;
   }

   public void b(avg $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         avd $$4 = $$0.c($$3);
         if ($$4 == null && !$$3.startsWith("file/")) {
            $$4 = $$0.c("file/" + $$3);
         }

         if ($$4 == null) {
            ae.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", $$3);
            $$2.remove();
         } else if (!$$4.d().a() && !this.j.contains($$3)) {
            ae.warn("Removed resource pack {} from options because it is no longer compatible", $$3);
            $$2.remove();
         } else if ($$4.d().a() && this.j.contains($$3)) {
            ae.info("Removed resource pack {} from incompatibility list because it's now compatible", $$3);
            this.j.remove($$3);
         } else {
            $$1.add($$4.g());
         }
      }

      $$0.b($$1);
   }

   public flo aE() {
      return this.bU;
   }

   public void a(flo $$0) {
      this.bU = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = azu.a(af, $$0, ag);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aF() {
      return this.bT;
   }

   public String aG() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fmi.b() {
         @Override
         public <T> void a(String $$0x, fmh<T> $$1) {
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
      this.ar = $$0;
   }

   public int aH() {
      return this.ar > 0 ? Math.min(this.ap.c(), this.ar) : this.ap.c();
   }

   private static xv c(xv $$0, int $$1) {
      return xv.a("options.pixel_value", $$0, $$1);
   }

   private static xv a(xv $$0, double $$1) {
      return xv.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static xv a(xv $$0, xv $$1) {
      return xv.a("options.generic_value", $$0, $$1);
   }

   public static xv a(xv $$0, int $$1) {
      return a($$0, xv.b(Integer.toString($$1)));
   }

   public static xv b(xv $$0, int $$1) {
      return $$1 == 0 ? a($$0, xu.c) : a($$0, $$1);
   }

   private static xv b(xv $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, xu.c) : a($$0, $$1);
   }

   interface a extends fmi.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fmh<T> var2);
   }
}
