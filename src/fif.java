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

public class fif {
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
   private static final xd ai = xd.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fie<Boolean> aj = fie.a("options.darkMojangStudiosBackgroundColor", fie.a(ai), false);
   private static final xd ak = xd.c("options.hideLightningFlashes.tooltip");
   private final fie<Boolean> al = fie.a("options.hideLightningFlashes", fie.a(ak), false);
   private static final xd am = xd.c("options.hideSplashTexts.tooltip");
   private final fie<Boolean> an = fie.a("options.hideSplashTexts", fie.a(am), false);
   private final fie<Double> ao = new fie<>("options.sensitivity", fie.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xd.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xd.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fie.m.a, 0.5, $$0x -> {
   });
   private final fie<Integer> ap;
   private final fie<Integer> aq;
   private int ar = 0;
   private final fie<Double> as = new fie<>(
      "options.entityDistanceScaling",
      fie.a(),
      fif::a,
      new fie.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fie<Integer> at = new fie<>(
      "options.framerateLimit",
      fie.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xd.c("options.framerateLimit.max")) : a($$0x, xd.a("options.framerate", $$1x)),
      new fie.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fib.Q().aP().a($$0x)
   );
   private static final xd au = xd.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final xd av = xd.c("options.inactivityFpsLimit.afk.tooltip");
   private final fie<fhx> aw = new fie<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> fll.a(au);
         case b -> fll.a(av);
      };
   }, fie.b(), new fie.e<>(Arrays.asList(fhx.values()), fhx.c), fhx.b, $$0x -> {
   });
   private final fie<fhn> ax = new fie<>(
      "options.renderClouds",
      fie.a(),
      fie.b(),
      new fie.e<>(Arrays.asList(fhn.values()), Codec.withAlternative(fhn.d, Codec.BOOL, $$0x -> $$0x ? fhn.c : fhn.a)),
      fhn.c,
      $$0x -> {
         if (fib.O()) {
            faz $$1x = fib.Q().f.w();
            if ($$1x != null) {
               $$1x.f();
            }
         }
      }
   );
   private static final xd ay = xd.c("options.graphics.fast.tooltip");
   private static final xd az = xd.a("options.graphics.fabulous.tooltip", xd.c("options.graphics.fabulous").a(n.u));
   private static final xd aA = xd.c("options.graphics.fancy.tooltip");
   private final fie<fht> aB = new fie<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fll.a(aA);
            case a -> fll.a(ay);
            case c -> fll.a(az);
         };
      },
      ($$0x, $$1x) -> {
         xr $$2x = xd.c($$1x.a());
         return $$1x == fht.c ? $$2x.a(n.u) : $$2x;
      },
      new fie.a<>(
         Arrays.asList(fht.values()),
         Stream.of(fht.values()).filter($$0x -> $$0x != fht.c).collect(Collectors.toList()),
         () -> fib.Q().r() && fib.Q().ai().h(),
         ($$0x, $$1x) -> {
            fib $$2x = fib.Q();
            ggm $$3 = $$2x.ai();
            if ($$1x == fht.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(fht::a, fht::b)
      ),
      fht.b,
      $$0x -> {
      }
   );
   private final fie<Boolean> aC = fie.a("options.ao", true, $$0x -> fib.Q().f.f());
   private static final xd aD = xd.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xd aE = xd.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xd aF = xd.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fie<fih> aG = new fie<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fll.a(aD);
         case b -> fll.a(aE);
         case c -> fll.a(aF);
      };
   }, fie.b(), new fie.e<>(Arrays.asList(fih.values()), Codec.INT.xmap(fih::a, fih::b)), fih.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fie<cnn> aH = new fie<>(
      "options.chat.visibility", fie.a(), fie.b(), new fie.e<>(Arrays.asList(cnn.values()), Codec.INT.xmap(cnn::a, cnn::b)), cnn.a, $$0x -> {
      }
   );
   private final fie<Double> aI = new fie<>("options.chat.opacity", fie.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fie.m.a, 1.0, $$0x -> fib.Q().m.d().b());
   private final fie<Double> aJ = new fie<>("options.chat.line_spacing", fie.a(), fif::a, fie.m.a, 0.0, $$0x -> {
   });
   private static final xd aK = xd.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aL = 5;
   private final fie<Integer> aM = new fie<>("options.accessibility.menu_background_blurriness", fie.a(aK), fif::b, new fie.f(0, 10), 5, $$0x -> {
   });
   private final fie<Double> aN = new fie<>("options.accessibility.text_background_opacity", fie.a(), fif::a, fie.m.a, 0.5, $$0x -> fib.Q().m.d().b());
   private final fie<Double> aO = new fie<>("options.accessibility.panorama_speed", fie.a(), fif::a, fie.m.a, 1.0, $$0x -> {
   });
   private static final xd aP = xd.c("options.accessibility.high_contrast.tooltip");
   private final fie<Boolean> aQ = fie.a("options.accessibility.high_contrast", fie.a(aP), false, $$0x -> {
      aud $$1x = fib.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final fie<Boolean> aR = fie.a(
      "options.accessibility.narrator_hotkey",
      fie.a(fib.a ? xd.c("options.accessibility.narrator_hotkey.mac.tooltip") : xd.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cnq> aS = EnumSet.allOf(cnq.class);
   private final fie<btz> aT = new fie<>("options.mainHand", fie.a(), fie.b(), new fie.e<>(Arrays.asList(btz.values()), btz.c), btz.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fie<Double> aU = new fie<>(
      "options.chat.scale",
      fie.a(),
      ($$0x, $$1x) -> (xd)($$1x == 0.0 ? xc.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fie.m.a,
      1.0,
      $$0x -> fib.Q().m.d().b()
   );
   private final fie<Double> aV = new fie<>("options.chat.width", fie.a(), ($$0x, $$1x) -> c($$0x, fkb.a($$1x)), fie.m.a, 1.0, $$0x -> fib.Q().m.d().b());
   private final fie<Double> aW = new fie<>(
      "options.chat.height.unfocused", fie.a(), ($$0x, $$1x) -> c($$0x, fkb.b($$1x)), fie.m.a, fkb.i(), $$0x -> fib.Q().m.d().b()
   );
   private final fie<Double> aX = new fie<>(
      "options.chat.height.focused", fie.a(), ($$0x, $$1x) -> c($$0x, fkb.b($$1x)), fie.m.a, 1.0, $$0x -> fib.Q().m.d().b()
   );
   private final fie<Double> aY = new fie<>(
      "options.chat.delay_instant",
      fie.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xd.c("options.chat.delay_none") : xd.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fie.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fib.Q().aZ().a($$0x)
   );
   private static final xd aZ = xd.c("options.notifications.display_time.tooltip");
   private final fie<Double> ba = new fie<>(
      "options.notifications.display_time",
      fie.a(aZ),
      ($$0x, $$1x) -> a($$0x, xd.a("options.multiplier", $$1x)),
      new fie.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fie<Integer> bb = new fie<>(
      "options.mipmapLevels", fie.a(), ($$0x, $$1x) -> (xd)($$1x == 0 ? xc.a($$0x, false) : a($$0x, $$1x.intValue())), new fie.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fie<fhj> bc = new fie<>(
      "options.attackIndicator", fie.a(), fie.b(), new fie.e<>(Arrays.asList(fhj.values()), Codec.INT.xmap(fhj::a, fhj::b)), fhj.b, $$0x -> {
      }
   );
   public hcn r = hcn.a;
   public boolean s = false;
   private final fie<Integer> bd = new fie<>("options.biomeBlendRadius", fie.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xd.c("options.biomeBlendRadius." + $$2x));
   }, new fie.f(0, 7, false), 2, $$0x -> fib.Q().f.f());
   private final fie<Double> be = new fie<>(
      "options.mouseWheelSensitivity",
      fie.a(),
      ($$0x, $$1x) -> a($$0x, xd.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fie.f(-200, 100).a(fif::c, fif::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fie<Boolean> bf = fie.a("options.rawMouseInput", true, $$0x -> {
      fbs $$1x = fib.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fie<Boolean> bg = fie.a("options.autoJump", false);
   private static final xd bh = xd.c("options.rotateWithMinecart.tooltip");
   private final fie<Boolean> bi = fie.a("options.rotateWithMinecart", fie.a(bh), false);
   private final fie<Boolean> bj = fie.a("options.operatorItemsTab", false);
   private final fie<Boolean> bk = fie.a("options.autoSuggestCommands", true);
   private final fie<Boolean> bl = fie.a("options.chat.color", true);
   private final fie<Boolean> bm = fie.a("options.chat.links", true);
   private final fie<Boolean> bn = fie.a("options.chat.links.prompt", true);
   private final fie<Boolean> bo = fie.a("options.vsync", true, $$0x -> {
      if (fib.Q().aO() != null) {
         fib.Q().aO().a($$0x);
      }
   });
   private final fie<Boolean> bp = fie.a("options.entityShadows", true);
   private final fie<Boolean> bq = fie.a("options.forceUnicodeFont", false, $$0x -> aH());
   private final fie<Boolean> br = fie.a("options.japaneseGlyphVariants", fie.a(xd.c("options.japaneseGlyphVariants.tooltip")), aI(), $$0x -> aH());
   private final fie<Boolean> bs = fie.a("options.invertMouse", false);
   private final fie<Boolean> bt = fie.a("options.discrete_mouse_scroll", false);
   private static final xd bu = xd.c("options.realmsNotifications.tooltip");
   private final fie<Boolean> bv = fie.a("options.realmsNotifications", fie.a(bu), true);
   private static final xd bw = xd.c("options.allowServerListing.tooltip");
   private final fie<Boolean> bx = fie.a("options.allowServerListing", fie.a(bw), true, $$0x -> {
   });
   private final fie<Boolean> by = fie.a("options.reducedDebugInfo", false);
   private final Map<awe, fie<Double>> bz = ad.a(new EnumMap<>(awe.class), $$0x -> {
      for (awe $$1x : awe.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fie<Boolean> bA = fie.a("options.showSubtitles", false);
   private static final xd bB = xd.c("options.directionalAudio.on.tooltip");
   private static final xd bC = xd.c("options.directionalAudio.off.tooltip");
   private final fie<Boolean> bD = fie.a("options.directionalAudio", $$0x -> $$0x ? fll.a(bB) : fll.a(bC), false, $$0x -> {
      hbj $$1x = fib.Q().aj();
      $$1x.k();
      $$1x.a(gzz.a(awd.Ax, 1.0F));
   });
   private final fie<Boolean> bE = new fie<>(
      "options.accessibility.text_background",
      fie.a(),
      ($$0x, $$1x) -> $$1x ? xd.c("options.accessibility.text_background.chat") : xd.c("options.accessibility.text_background.everywhere"),
      fie.a,
      true,
      $$0x -> {
      }
   );
   private final fie<Boolean> bF = fie.a("options.touchscreen", false);
   private final fie<Boolean> bG = fie.a("options.fullscreen", false, $$0x -> {
      fib $$1x = fib.Q();
      if ($$1x.aO() != null && $$1x.aO().j() != $$0x) {
         $$1x.aO().h();
         this.ac().a($$1x.aO().j());
      }
   });
   private final fie<Boolean> bH = fie.a("options.viewBobbing", true);
   private static final xd bI = xd.c("options.key.toggle");
   private static final xd bJ = xd.c("options.key.hold");
   private final fie<Boolean> bK = new fie<>("key.sneak", fie.a(), ($$0x, $$1x) -> $$1x ? bI : bJ, fie.a, false, $$0x -> {
   });
   private final fie<Boolean> bL = new fie<>("key.sprint", fie.a(), ($$0x, $$1x) -> $$1x ? bI : bJ, fie.a, false, $$0x -> {
   });
   public boolean u;
   private static final xd bM = xd.c("options.hideMatchedNames.tooltip");
   private final fie<Boolean> bN = fie.a("options.hideMatchedNames", fie.a(bM), true);
   private final fie<Boolean> bO = fie.a("options.autosaveIndicator", true);
   private static final xd bP = xd.c("options.onlyShowSecureChat.tooltip");
   private final fie<Boolean> bQ = fie.a("options.onlyShowSecureChat", fie.a(bP), false);
   public final fhz v = new fhz("key.forward", 87, "key.categories.movement");
   public final fhz w = new fhz("key.left", 65, "key.categories.movement");
   public final fhz x = new fhz("key.back", 83, "key.categories.movement");
   public final fhz y = new fhz("key.right", 68, "key.categories.movement");
   public final fhz z = new fhz("key.jump", 32, "key.categories.movement");
   public final fhz A = new fin("key.sneak", 340, "key.categories.movement", this.bK::c);
   public final fhz B = new fin("key.sprint", 341, "key.categories.movement", this.bL::c);
   public final fhz C = new fhz("key.inventory", 69, "key.categories.inventory");
   public final fhz D = new fhz("key.swapOffhand", 70, "key.categories.inventory");
   public final fhz E = new fhz("key.drop", 81, "key.categories.inventory");
   public final fhz F = new fhz("key.use", fbk.b.c, 1, "key.categories.gameplay");
   public final fhz G = new fhz("key.attack", fbk.b.c, 0, "key.categories.gameplay");
   public final fhz H = new fhz("key.pickItem", fbk.b.c, 2, "key.categories.gameplay");
   public final fhz I = new fhz("key.chat", 84, "key.categories.multiplayer");
   public final fhz J = new fhz("key.playerlist", 258, "key.categories.multiplayer");
   public final fhz K = new fhz("key.command", 47, "key.categories.multiplayer");
   public final fhz L = new fhz("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fhz M = new fhz("key.screenshot", 291, "key.categories.misc");
   public final fhz N = new fhz("key.togglePerspective", 294, "key.categories.misc");
   public final fhz O = new fhz("key.smoothCamera", fbk.bv.b(), "key.categories.misc");
   public final fhz P = new fhz("key.fullscreen", 300, "key.categories.misc");
   public final fhz Q = new fhz("key.spectatorOutlines", fbk.bv.b(), "key.categories.misc");
   public final fhz R = new fhz("key.advancements", 76, "key.categories.misc");
   public final fhz[] S = new fhz[]{
      new fhz("key.hotbar.1", 49, "key.categories.inventory"),
      new fhz("key.hotbar.2", 50, "key.categories.inventory"),
      new fhz("key.hotbar.3", 51, "key.categories.inventory"),
      new fhz("key.hotbar.4", 52, "key.categories.inventory"),
      new fhz("key.hotbar.5", 53, "key.categories.inventory"),
      new fhz("key.hotbar.6", 54, "key.categories.inventory"),
      new fhz("key.hotbar.7", 55, "key.categories.inventory"),
      new fhz("key.hotbar.8", 56, "key.categories.inventory"),
      new fhz("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fhz T = new fhz("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fhz U = new fhz("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fhz[] V = (fhz[])ArrayUtils.addAll(
      new fhz[]{
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
   protected fib W;
   private final File bR;
   public boolean X;
   private fhl bS = fhl.a;
   public String Y = "";
   public boolean Z;
   private final fie<Integer> bT = new fie<>("options.fov", fie.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xd.c("options.fov.min"));
         case 110 -> a($$0x, xd.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fie.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fib.Q().f.q());
   private static final xd bU = xd.a("options.telemetry.button.tooltip", xd.c("options.telemetry.state.minimal"), xd.c("options.telemetry.state.all"));
   private final fie<Boolean> bV = fie.a("options.telemetry.button", fie.a(bU), ($$0x, $$1x) -> {
      fib $$2x = fib.Q();
      if (!$$2x.E()) {
         return xd.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xd.c("options.telemetry.state.all") : xd.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xd bW = xd.c("options.screenEffectScale.tooltip");
   private final fie<Double> bX = new fie<>("options.screenEffectScale", fie.a(bW), fif::b, fie.m.a, 1.0, $$0x -> {
   });
   private static final xd bY = xd.c("options.fovEffectScale.tooltip");
   private final fie<Double> bZ = new fie<>(
      "options.fovEffectScale", fie.a(bY), fif::b, fie.m.a.a(azc::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final xd ca = xd.c("options.darknessEffectScale.tooltip");
   private final fie<Double> cb = new fie<>("options.darknessEffectScale", fie.a(ca), fif::b, fie.m.a.a(azc::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final xd cc = xd.c("options.glintSpeed.tooltip");
   private final fie<Double> cd = new fie<>("options.glintSpeed", fie.a(cc), fif::b, fie.m.a, 0.5, $$0x -> {
   });
   private static final xd ce = xd.c("options.glintStrength.tooltip");
   private final fie<Double> cf = new fie<>("options.glintStrength", fie.a(ce), fif::b, fie.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final xd cg = xd.c("options.damageTiltStrength.tooltip");
   private final fie<Double> ch = new fie<>("options.damageTiltStrength", fie.a(cg), fif::b, fie.m.a, 1.0, $$0x -> {
   });
   private final fie<Double> ci = new fie<>("options.gamma", fie.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xd.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xd.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xd.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fie.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cj = 2147483646;
   private final fie<Integer> ck = new fie<>(
      "options.guiScale", fie.a(), ($$0x, $$1x) -> $$1x == 0 ? xd.c("options.guiScale.auto") : xd.b(Integer.toString($$1x)), new fie.c(0, () -> {
         fib $$0x = fib.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fie<aqz> cl = new fie<>(
      "options.particles", fie.a(), fie.b(), new fie.e<>(Arrays.asList(aqz.values()), Codec.INT.xmap(aqz::a, aqz::b)), aqz.a, $$0x -> {
      }
   );
   private final fie<fid> cm = new fie<>(
      "options.narrator",
      fie.a(),
      ($$0x, $$1x) -> (xd)(this.W.aY().a() ? $$1x.b() : xd.c("options.narrator.notavailable")),
      new fie.e<>(Arrays.asList(fid.values()), Codec.INT.xmap(fid::a, fid::a)),
      fid.a,
      $$0x -> this.W.aY().a($$0x)
   );
   public String ab = "en_us";
   private final fie<String> cn = new fie<>(
      "options.audioDevice",
      fie.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xd.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xd.b($$1x.substring(hbg.c)) : xd.b($$1x);
         }
      },
      new fie.h<>(
         () -> Stream.concat(Stream.of(""), fib.Q().aj().a().stream()).toList(),
         $$0x -> fib.Q().r() && $$0x != "" && !fib.Q().aj().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hbj $$1x = fib.Q().aj();
         $$1x.k();
         $$1x.a(gzz.a(awd.Ax, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;

   public fie<Boolean> a() {
      return this.aj;
   }

   public fie<Boolean> b() {
      return this.al;
   }

   public fie<Boolean> c() {
      return this.an;
   }

   public fie<Double> d() {
      return this.ao;
   }

   public fie<Integer> e() {
      return this.ap;
   }

   public fie<Integer> f() {
      return this.aq;
   }

   public fie<Double> g() {
      return this.as;
   }

   public fie<Integer> h() {
      return this.at;
   }

   public fie<fhx> i() {
      return this.aw;
   }

   public fie<fhn> j() {
      return this.ax;
   }

   public fie<fht> k() {
      return this.aB;
   }

   public fie<Boolean> l() {
      return this.aC;
   }

   public fie<fih> m() {
      return this.aG;
   }

   public void a(aud $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (aua $$2 : $$0.f()) {
         if (!$$2.j()) {
            this.i.add($$2.g());
            if (!$$2.d().a()) {
               this.j.add($$2.g());
            }
         }
      }

      this.ay();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.W.l();
      }
   }

   public fie<cnn> n() {
      return this.aH;
   }

   public fie<Double> o() {
      return this.aI;
   }

   public fie<Double> p() {
      return this.aJ;
   }

   public fie<Integer> q() {
      return this.aM;
   }

   public int r() {
      return this.q().c();
   }

   public fie<Double> s() {
      return this.aN;
   }

   public fie<Double> t() {
      return this.aO;
   }

   public fie<Boolean> u() {
      return this.aQ;
   }

   public fie<Boolean> v() {
      return this.aR;
   }

   public fie<btz> w() {
      return this.aT;
   }

   public fie<Double> x() {
      return this.aU;
   }

   public fie<Double> y() {
      return this.aV;
   }

   public fie<Double> z() {
      return this.aW;
   }

   public fie<Double> A() {
      return this.aX;
   }

   public fie<Double> B() {
      return this.aY;
   }

   public fie<Double> C() {
      return this.ba;
   }

   public fie<Integer> D() {
      return this.bb;
   }

   public fie<fhj> E() {
      return this.bc;
   }

   public fie<Integer> F() {
      return this.bd;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return azc.a(Math.log10($$0) * 100.0);
   }

   public fie<Double> G() {
      return this.be;
   }

   public fie<Boolean> H() {
      return this.bf;
   }

   public fie<Boolean> I() {
      return this.bg;
   }

   public fie<Boolean> J() {
      return this.bi;
   }

   public fie<Boolean> K() {
      return this.bj;
   }

   public fie<Boolean> L() {
      return this.bk;
   }

   public fie<Boolean> M() {
      return this.bl;
   }

   public fie<Boolean> N() {
      return this.bm;
   }

   public fie<Boolean> O() {
      return this.bn;
   }

   public fie<Boolean> P() {
      return this.bo;
   }

   public fie<Boolean> Q() {
      return this.bp;
   }

   private static void aH() {
      fib $$0 = fib.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fie<Boolean> R() {
      return this.bq;
   }

   private static boolean aI() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fie<Boolean> S() {
      return this.br;
   }

   public fie<Boolean> T() {
      return this.bs;
   }

   public fie<Boolean> U() {
      return this.bt;
   }

   public fie<Boolean> V() {
      return this.bv;
   }

   public fie<Boolean> W() {
      return this.bx;
   }

   public fie<Boolean> X() {
      return this.by;
   }

   public final float a(awe $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fie<Double> b(awe $$0) {
      return Objects.requireNonNull(this.bz.get($$0));
   }

   private fie<Double> a(String $$0, awe $$1) {
      return new fie<>($$0, fie.a(), fif::b, fie.m.a, 1.0, $$1x -> fib.Q().aj().a($$1, $$1x.floatValue()));
   }

   public fie<Boolean> Y() {
      return this.bA;
   }

   public fie<Boolean> Z() {
      return this.bD;
   }

   public fie<Boolean> aa() {
      return this.bE;
   }

   public fie<Boolean> ab() {
      return this.bF;
   }

   public fie<Boolean> ac() {
      return this.bG;
   }

   public fie<Boolean> ad() {
      return this.bH;
   }

   public fie<Boolean> ae() {
      return this.bK;
   }

   public fie<Boolean> af() {
      return this.bL;
   }

   public fie<Boolean> ag() {
      return this.bN;
   }

   public fie<Boolean> ah() {
      return this.bO;
   }

   public fie<Boolean> ai() {
      return this.bQ;
   }

   public fie<Integer> aj() {
      return this.bT;
   }

   public fie<Boolean> ak() {
      return this.bV;
   }

   public fie<Double> al() {
      return this.bX;
   }

   public fie<Double> am() {
      return this.bZ;
   }

   public fie<Double> an() {
      return this.cb;
   }

   public fie<Double> ao() {
      return this.cd;
   }

   public fie<Double> ap() {
      return this.cf;
   }

   public fie<Double> aq() {
      return this.ch;
   }

   public fie<Double> ar() {
      return this.ci;
   }

   public fie<Integer> as() {
      return this.ck;
   }

   public fie<aqz> at() {
      return this.cl;
   }

   public fie<fid> au() {
      return this.cm;
   }

   public fie<String> av() {
      return this.cn;
   }

   public void aw() {
      this.ac = false;
      this.ay();
   }

   public fif(fib $$0, File $$1) {
      this.W = $$0;
      this.bR = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ap = new fie<>(
         "options.renderDistance",
         fie.a(),
         ($$0x, $$1x) -> a($$0x, xd.a("options.chunks", $$1x)),
         new fie.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fib.Q().f.q()
      );
      this.aq = new fie<>(
         "options.simulationDistance", fie.a(), ($$0x, $$1x) -> a($$0x, xd.a("options.chunks", $$1x)), new fie.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = ad.m() == ad.a.c;
      this.ax();
   }

   public float a(float $$0) {
      return this.bE.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return axn.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bE.c() ? $$0 : axn.a(this.aN.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(fif.b $$0) {
      $$0.a("ao", this.aC);
      $$0.a("biomeBlendRadius", this.bd);
      $$0.a("enableVsync", this.bo);
      $$0.a("entityDistanceScaling", this.as);
      $$0.a("entityShadows", this.bp);
      $$0.a("forceUnicodeFont", this.bq);
      $$0.a("japaneseGlyphVariants", this.br);
      $$0.a("fov", this.bT);
      $$0.a("fovEffectScale", this.bZ);
      $$0.a("darknessEffectScale", this.cb);
      $$0.a("glintSpeed", this.cd);
      $$0.a("glintStrength", this.cf);
      $$0.a("prioritizeChunkUpdates", this.aG);
      $$0.a("fullscreen", this.bG);
      $$0.a("gamma", this.ci);
      $$0.a("graphicsMode", this.aB);
      $$0.a("guiScale", this.ck);
      $$0.a("maxFps", this.at);
      $$0.a("inactivityFpsLimit", this.aw);
      $$0.a("mipmapLevels", this.bb);
      $$0.a("narrator", this.cm);
      $$0.a("particles", this.cl);
      $$0.a("reducedDebugInfo", this.by);
      $$0.a("renderClouds", this.ax);
      $$0.a("renderDistance", this.ap);
      $$0.a("simulationDistance", this.aq);
      $$0.a("screenEffectScale", this.bX);
      $$0.a("soundDevice", this.cn);
   }

   private void a(fif.a $$0) {
      this.a((fif.b)$$0);
      $$0.a("autoJump", this.bg);
      $$0.a("rotateWithMinecart", this.bi);
      $$0.a("operatorItemsTab", this.bj);
      $$0.a("autoSuggestions", this.bk);
      $$0.a("chatColors", this.bl);
      $$0.a("chatLinks", this.bm);
      $$0.a("chatLinksPrompt", this.bn);
      $$0.a("discrete_mouse_scroll", this.bt);
      $$0.a("invertYMouse", this.bs);
      $$0.a("realmsNotifications", this.bv);
      $$0.a("showSubtitles", this.bA);
      $$0.a("directionalAudio", this.bD);
      $$0.a("touchscreen", this.bF);
      $$0.a("bobView", this.bH);
      $$0.a("toggleCrouch", this.bK);
      $$0.a("toggleSprint", this.bL);
      $$0.a("darkMojangStudiosBackground", this.aj);
      $$0.a("hideLightningFlashes", this.al);
      $$0.a("hideSplashTexts", this.an);
      $$0.a("mouseSensitivity", this.ao);
      $$0.a("damageTiltStrength", this.ch);
      $$0.a("highContrast", this.aQ);
      $$0.a("narratorHotkey", this.aR);
      this.i = $$0.a("resourcePacks", this.i, fif::c, af::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fif::c, af::toJson);
      this.Y = $$0.a("lastServer", this.Y);
      this.ab = $$0.a("lang", this.ab);
      $$0.a("chatVisibility", this.aH);
      $$0.a("chatOpacity", this.aI);
      $$0.a("chatLineSpacing", this.aJ);
      $$0.a("textBackgroundOpacity", this.aN);
      $$0.a("backgroundForChatOnly", this.bE);
      this.l = $$0.a("hideServerAddress", this.l);
      this.m = $$0.a("advancedItemTooltips", this.m);
      this.n = $$0.a("pauseOnLostFocus", this.n);
      this.o = $$0.a("overrideWidth", this.o);
      this.p = $$0.a("overrideHeight", this.p);
      $$0.a("chatHeightFocused", this.aX);
      $$0.a("chatDelay", this.aY);
      $$0.a("chatHeightUnfocused", this.aW);
      $$0.a("chatScale", this.aU);
      $$0.a("chatWidth", this.aV);
      $$0.a("notificationDisplayTime", this.ba);
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aT);
      $$0.a("attackIndicator", this.bc);
      this.r = $$0.a("tutorialStep", this.r, hcn::a, hcn::a);
      $$0.a("mouseWheelSensitivity", this.be);
      $$0.a("rawMouseInput", this.bf);
      this.t = $$0.a("glDebugVerbosity", this.t);
      this.u = $$0.a("skipMultiplayerWarning", this.u);
      $$0.a("hideMatchedNames", this.bN);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.ad = $$0.a("syncChunkWrites", this.ad);
      $$0.a("showAutosaveIndicator", this.bO);
      $$0.a("allowServerListing", this.bx);
      $$0.a("onlyShowSecureChat", this.bQ);
      $$0.a("panoramaScrollSpeed", this.aO);
      $$0.a("telemetryOptInExtra", this.bV);
      this.ac = $$0.a("onboardAccessibility", this.ac);
      $$0.a("menuBackgroundBlurriness", this.aM);

      for (fhz $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fbk.a($$3));
         }
      }

      for (awe $$4 : awe.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bz.get($$4));
      }

      for (cnq $$5 : cnq.values()) {
         boolean $$6 = this.aS.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.a($$5, $$7);
         }
      }
   }

   public void ax() {
      try {
         if (!this.bR.exists()) {
            return;
         }

         uf $$0 = new uf();

         try (BufferedReader $$1 = Files.newReader(this.bR, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = ah.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  ae.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final uf $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(fht.b);
            } else {
               this.aB.a(fht.a);
            }
         }

         this.a(new fif.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).r_() : null;
            }

            @Override
            public <T> void a(String $$0, fie<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fif.ae.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fif.ae.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fif.a($$2) : $$1;
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
               } else if (fif.a($$2)) {
                  return 1.0F;
               } else if (fif.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fif.ae.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fhz.d();
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

   private uf a(uf $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return bal.e.a(this.W.at(), $$0, $$1);
   }

   public void ay() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bR), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fif.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fie<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> fif.ae.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(fif.af.toJson($$2));
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
         if (this.W.aO().f().isPresent()) {
            $$0.println("fullscreenResolution:" + this.W.aO().f().get().g());
         }
      } catch (Exception var6) {
         ae.error("Failed to save options", var6);
      }

      this.aA();
   }

   public aqs az() {
      int $$0 = 0;

      for (cnq $$1 : this.aS) {
         $$0 |= $$1.a();
      }

      return new aqs(this.ab, this.ap.c(), this.aH.c(), this.bl.c(), $$0, this.aT.c(), this.W.aT(), this.bx.c(), this.cl.c());
   }

   public void aA() {
      if (this.W.t != null) {
         this.W.t.cx.a(this.az());
      }
   }

   public void a(cnq $$0, boolean $$1) {
      if ($$1) {
         this.aS.add($$0);
      } else {
         this.aS.remove($$0);
      }
   }

   public boolean a(cnq $$0) {
      return this.aS.contains($$0);
   }

   public fhn aB() {
      return this.aG() >= 4 ? this.ax.c() : fhn.a;
   }

   public boolean aC() {
      return this.q;
   }

   public void b(aud $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         aua $$4 = $$0.c($$3);
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

   public fhl aD() {
      return this.bS;
   }

   public void a(fhl $$0) {
      this.bS = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = ays.a(af, $$0, ag);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aE() {
      return this.bR;
   }

   public String aF() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fif.b() {
         @Override
         public <T> void a(String $$0x, fie<T> $$1) {
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

   public int aG() {
      return this.ar > 0 ? Math.min(this.ap.c(), this.ar) : this.ap.c();
   }

   private static xd c(xd $$0, int $$1) {
      return xd.a("options.pixel_value", $$0, $$1);
   }

   private static xd a(xd $$0, double $$1) {
      return xd.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static xd a(xd $$0, xd $$1) {
      return xd.a("options.generic_value", $$0, $$1);
   }

   public static xd a(xd $$0, int $$1) {
      return a($$0, xd.b(Integer.toString($$1)));
   }

   public static xd b(xd $$0, int $$1) {
      return $$1 == 0 ? a($$0, xc.c) : a($$0, $$1);
   }

   private static xd b(xd $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, xc.c) : a($$0, $$1);
   }

   interface a extends fif.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fie<T> var2);
   }
}
