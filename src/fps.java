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

public class fps {
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
   private final fpr<Boolean> ak = fpr.a("options.darkMojangStudiosBackgroundColor", fpr.a(aj), false);
   private static final wy al = wy.c("options.hideLightningFlashes.tooltip");
   private final fpr<Boolean> am = fpr.a("options.hideLightningFlashes", fpr.a(al), false);
   private static final wy an = wy.c("options.hideSplashTexts.tooltip");
   private final fpr<Boolean> ao = fpr.a("options.hideSplashTexts", fpr.a(an), false);
   private final fpr<Double> ap = new fpr<>("options.sensitivity", fpr.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wy.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wy.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fpr.m.a, 0.5, $$0x -> {
   });
   private final fpr<Integer> aq;
   private final fpr<Integer> ar;
   private int as = 0;
   private final fpr<Double> at = new fpr<>(
      "options.entityDistanceScaling",
      fpr.a(),
      fps::a,
      new fpr.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fpr<Integer> au = new fpr<>(
      "options.framerateLimit",
      fpr.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wy.c("options.framerateLimit.max")) : a($$0x, wy.a("options.framerate", $$1x)),
      new fpr.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fpo.Q().aP().a($$0x)
   );
   private static final wy av = wy.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final wy aw = wy.c("options.inactivityFpsLimit.afk.tooltip");
   private final fpr<fpk> ax = new fpr<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> fug.a(av);
         case b -> fug.a(aw);
      };
   }, fpr.b(), new fpr.e<>(Arrays.asList(fpk.values()), fpk.c), fpk.b, $$0x -> {
   });
   private final fpr<fpa> ay = new fpr<>(
      "options.renderClouds",
      fpr.a(),
      fpr.b(),
      new fpr.e<>(Arrays.asList(fpa.values()), Codec.withAlternative(fpa.d, Codec.BOOL, $$0x -> $$0x ? fpa.c : fpa.a)),
      fpa.c,
      $$0x -> {
      }
   );
   private static final wy az = wy.c("options.graphics.fast.tooltip");
   private static final wy aA = wy.a("options.graphics.fabulous.tooltip", wy.c("options.graphics.fabulous").a(o.u));
   private static final wy aB = wy.c("options.graphics.fancy.tooltip");
   private final fpr<fpg> aC = new fpr<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fug.a(aB);
            case a -> fug.a(az);
            case c -> fug.a(aA);
         };
      },
      ($$0x, $$1x) -> {
         xm $$2x = wy.c($$1x.a());
         return $$1x == fpg.c ? $$2x.a(o.u) : $$2x;
      },
      new fpr.a<>(
         Arrays.asList(fpg.values()),
         Stream.of(fpg.values()).filter($$0x -> $$0x != fpg.c).collect(Collectors.toList()),
         () -> fpo.Q().r() && fpo.Q().aj().g(),
         ($$0x, $$1x) -> {
            fpo $$2x = fpo.Q();
            gqd $$3 = $$2x.aj();
            if ($$1x == fpg.c && $$3.b()) {
               $$3.c();
            } else {
               $$0x.a($$1x);
               $$2x.f.d();
            }
         },
         Codec.INT.xmap(fpg::a, fpg::b)
      ),
      fpg.b,
      $$0x -> {
      }
   );
   private final fpr<Boolean> aD = fpr.a("options.ao", true, $$0x -> fpo.Q().f.d());
   private static final wy aE = wy.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wy aF = wy.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wy aG = wy.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fpr<fpu> aH = new fpr<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fug.a(aE);
         case b -> fug.a(aF);
         case c -> fug.a(aG);
      };
   }, fpr.b(), new fpr.e<>(Arrays.asList(fpu.values()), Codec.INT.xmap(fpu::a, fpu::b)), fpu.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fpr<crg> aI = new fpr<>(
      "options.chat.visibility", fpr.a(), fpr.b(), new fpr.e<>(Arrays.asList(crg.values()), Codec.INT.xmap(crg::a, crg::b)), crg.a, $$0x -> {
      }
   );
   private final fpr<Double> aJ = new fpr<>("options.chat.opacity", fpr.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fpr.m.a, 1.0, $$0x -> fpo.Q().m.d().b());
   private final fpr<Double> aK = new fpr<>("options.chat.line_spacing", fpr.a(), fps::a, fpr.m.a, 0.0, $$0x -> {
   });
   private static final wy aL = wy.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aM = 5;
   private final fpr<Integer> aN = new fpr<>("options.accessibility.menu_background_blurriness", fpr.a(aL), fps::b, new fpr.f(0, 10), 5, $$0x -> {
   });
   private final fpr<Double> aO = new fpr<>("options.accessibility.text_background_opacity", fpr.a(), fps::a, fpr.m.a, 0.5, $$0x -> fpo.Q().m.d().b());
   private final fpr<Double> aP = new fpr<>("options.accessibility.panorama_speed", fpr.a(), fps::a, fpr.m.a, 1.0, $$0x -> {
   });
   private static final wy aQ = wy.c("options.accessibility.high_contrast.tooltip");
   private final fpr<Boolean> aR = fpr.a("options.accessibility.high_contrast", fpr.a(aQ), false, $$0x -> {
      aun $$1x = fpo.Q().ad();
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
   private final fpr<Boolean> aT = fpr.a("options.accessibility.high_contrast_block_outline", fpr.a(aS), false);
   private final fpr<Boolean> aU = fpr.a(
      "options.accessibility.narrator_hotkey",
      fpr.a(fpo.a ? wy.c("options.accessibility.narrator_hotkey.mac.tooltip") : wy.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<crl> aV = EnumSet.allOf(crl.class);
   private final fpr<bxa> aW = new fpr<>("options.mainHand", fpr.a(), fpr.b(), new fpr.e<>(Arrays.asList(bxa.values()), bxa.c), bxa.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fpr<Double> aX = new fpr<>(
      "options.chat.scale",
      fpr.a(),
      ($$0x, $$1x) -> (wy)($$1x == 0.0 ? wx.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fpr.m.a,
      1.0,
      $$0x -> fpo.Q().m.d().b()
   );
   private final fpr<Double> aY = new fpr<>("options.chat.width", fpr.a(), ($$0x, $$1x) -> c($$0x, fsw.a($$1x)), fpr.m.a, 1.0, $$0x -> fpo.Q().m.d().b());
   private final fpr<Double> aZ = new fpr<>(
      "options.chat.height.unfocused", fpr.a(), ($$0x, $$1x) -> c($$0x, fsw.b($$1x)), fpr.m.a, fsw.i(), $$0x -> fpo.Q().m.d().b()
   );
   private final fpr<Double> ba = new fpr<>(
      "options.chat.height.focused", fpr.a(), ($$0x, $$1x) -> c($$0x, fsw.b($$1x)), fpr.m.a, 1.0, $$0x -> fpo.Q().m.d().b()
   );
   private final fpr<Double> bb = new fpr<>(
      "options.chat.delay_instant",
      fpr.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wy.c("options.chat.delay_none") : wy.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fpr.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fpo.Q().aZ().a($$0x)
   );
   private static final wy bc = wy.c("options.notifications.display_time.tooltip");
   private final fpr<Double> bd = new fpr<>(
      "options.notifications.display_time",
      fpr.a(bc),
      ($$0x, $$1x) -> a($$0x, wy.a("options.multiplier", $$1x)),
      new fpr.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fpr<Integer> be = new fpr<>(
      "options.mipmapLevels", fpr.a(), ($$0x, $$1x) -> (wy)($$1x == 0 ? wx.a($$0x, false) : a($$0x, $$1x.intValue())), new fpr.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fpr<fov> bf = new fpr<>(
      "options.attackIndicator", fpr.a(), fpr.b(), new fpr.e<>(Arrays.asList(fov.values()), Codec.INT.xmap(fov::a, fov::b)), fov.b, $$0x -> {
      }
   );
   public hpr r = hpr.a;
   public boolean s = false;
   private final fpr<Integer> bg = new fpr<>("options.biomeBlendRadius", fpr.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wy.c("options.biomeBlendRadius." + $$2x));
   }, new fpr.f(0, 7, false), 2, $$0x -> fpo.Q().f.d());
   private final fpr<Double> bh = new fpr<>(
      "options.mouseWheelSensitivity",
      fpr.a(),
      ($$0x, $$1x) -> a($$0x, wy.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fpr.f(-200, 100).a(fps::c, fps::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fpr<Boolean> bi = fpr.a("options.rawMouseInput", true, $$0x -> {
      fix $$1x = fpo.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fpr<Boolean> bj = fpr.a("options.autoJump", false);
   private static final wy bk = wy.c("options.rotateWithMinecart.tooltip");
   private final fpr<Boolean> bl = fpr.a("options.rotateWithMinecart", fpr.a(bk), false);
   private final fpr<Boolean> bm = fpr.a("options.operatorItemsTab", false);
   private final fpr<Boolean> bn = fpr.a("options.autoSuggestCommands", true);
   private final fpr<Boolean> bo = fpr.a("options.chat.color", true);
   private final fpr<Boolean> bp = fpr.a("options.chat.links", true);
   private final fpr<Boolean> bq = fpr.a("options.chat.links.prompt", true);
   private final fpr<Boolean> br = fpr.a("options.vsync", true, $$0x -> {
      if (fpo.Q().aO() != null) {
         fpo.Q().aO().a($$0x);
      }
   });
   private final fpr<Boolean> bs = fpr.a("options.entityShadows", true);
   private final fpr<Boolean> bt = fpr.a("options.forceUnicodeFont", false, $$0x -> aI());
   private final fpr<Boolean> bu = fpr.a("options.japaneseGlyphVariants", fpr.a(wy.c("options.japaneseGlyphVariants.tooltip")), aJ(), $$0x -> aI());
   private final fpr<Boolean> bv = fpr.a("options.invertMouse", false);
   private final fpr<Boolean> bw = fpr.a("options.discrete_mouse_scroll", false);
   private static final wy bx = wy.c("options.realmsNotifications.tooltip");
   private final fpr<Boolean> by = fpr.a("options.realmsNotifications", fpr.a(bx), true);
   private static final wy bz = wy.c("options.allowServerListing.tooltip");
   private final fpr<Boolean> bA = fpr.a("options.allowServerListing", fpr.a(bz), true, $$0x -> {
   });
   private final fpr<Boolean> bB = fpr.a("options.reducedDebugInfo", false);
   private final Map<awo, fpr<Double>> bC = ag.a(awo.class, $$0x -> this.a("soundCategory." + $$0x.a(), $$0x));
   private final fpr<Boolean> bD = fpr.a("options.showSubtitles", false);
   private static final wy bE = wy.c("options.directionalAudio.on.tooltip");
   private static final wy bF = wy.c("options.directionalAudio.off.tooltip");
   private final fpr<Boolean> bG = fpr.a("options.directionalAudio", $$0x -> $$0x ? fug.a(bE) : fug.a(bF), false, $$0x -> {
      hon $$1x = fpo.Q().ak();
      $$1x.j();
      $$1x.a(hnc.a(awn.Bv, 1.0F));
   });
   private final fpr<Boolean> bH = new fpr<>(
      "options.accessibility.text_background",
      fpr.a(),
      ($$0x, $$1x) -> $$1x ? wy.c("options.accessibility.text_background.chat") : wy.c("options.accessibility.text_background.everywhere"),
      fpr.a,
      true,
      $$0x -> {
      }
   );
   private final fpr<Boolean> bI = fpr.a("options.touchscreen", false);
   private final fpr<Boolean> bJ = fpr.a("options.fullscreen", false, $$0x -> {
      fpo $$1x = fpo.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ad().a($$1x.aO().i());
      }
   });
   private final fpr<Boolean> bK = fpr.a("options.viewBobbing", true);
   private static final wy bL = wy.c("options.key.toggle");
   private static final wy bM = wy.c("options.key.hold");
   private final fpr<Boolean> bN = new fpr<>("key.sneak", fpr.a(), ($$0x, $$1x) -> $$1x ? bL : bM, fpr.a, false, $$0x -> {
   });
   private final fpr<Boolean> bO = new fpr<>("key.sprint", fpr.a(), ($$0x, $$1x) -> $$1x ? bL : bM, fpr.a, false, $$0x -> {
   });
   public boolean u;
   private static final wy bP = wy.c("options.hideMatchedNames.tooltip");
   private final fpr<Boolean> bQ = fpr.a("options.hideMatchedNames", fpr.a(bP), true);
   private final fpr<Boolean> bR = fpr.a("options.autosaveIndicator", true);
   private static final wy bS = wy.c("options.onlyShowSecureChat.tooltip");
   private final fpr<Boolean> bT = fpr.a("options.onlyShowSecureChat", fpr.a(bS), false);
   public final fpm v = new fpm("key.forward", 87, "key.categories.movement");
   public final fpm w = new fpm("key.left", 65, "key.categories.movement");
   public final fpm x = new fpm("key.back", 83, "key.categories.movement");
   public final fpm y = new fpm("key.right", 68, "key.categories.movement");
   public final fpm z = new fpm("key.jump", 32, "key.categories.movement");
   public final fpm A = new fpz("key.sneak", 340, "key.categories.movement", this.bN::c);
   public final fpm B = new fpz("key.sprint", 341, "key.categories.movement", this.bO::c);
   public final fpm C = new fpm("key.inventory", 69, "key.categories.inventory");
   public final fpm D = new fpm("key.swapOffhand", 70, "key.categories.inventory");
   public final fpm E = new fpm("key.drop", 81, "key.categories.inventory");
   public final fpm F = new fpm("key.use", fip.b.c, 1, "key.categories.gameplay");
   public final fpm G = new fpm("key.attack", fip.b.c, 0, "key.categories.gameplay");
   public final fpm H = new fpm("key.pickItem", fip.b.c, 2, "key.categories.gameplay");
   public final fpm I = new fpm("key.chat", 84, "key.categories.multiplayer");
   public final fpm J = new fpm("key.playerlist", 258, "key.categories.multiplayer");
   public final fpm K = new fpm("key.command", 47, "key.categories.multiplayer");
   public final fpm L = new fpm("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fpm M = new fpm("key.screenshot", 291, "key.categories.misc");
   public final fpm N = new fpm("key.togglePerspective", 294, "key.categories.misc");
   public final fpm O = new fpm("key.smoothCamera", fip.bv.b(), "key.categories.misc");
   public final fpm P = new fpm("key.fullscreen", 300, "key.categories.misc");
   public final fpm Q = new fpm("key.spectatorOutlines", fip.bv.b(), "key.categories.misc");
   public final fpm R = new fpm("key.advancements", 76, "key.categories.misc");
   public final fpm[] S = new fpm[]{
      new fpm("key.hotbar.1", 49, "key.categories.inventory"),
      new fpm("key.hotbar.2", 50, "key.categories.inventory"),
      new fpm("key.hotbar.3", 51, "key.categories.inventory"),
      new fpm("key.hotbar.4", 52, "key.categories.inventory"),
      new fpm("key.hotbar.5", 53, "key.categories.inventory"),
      new fpm("key.hotbar.6", 54, "key.categories.inventory"),
      new fpm("key.hotbar.7", 55, "key.categories.inventory"),
      new fpm("key.hotbar.8", 56, "key.categories.inventory"),
      new fpm("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fpm T = new fpm("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fpm U = new fpm("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fpm[] V = (fpm[])ArrayUtils.addAll(
      new fpm[]{
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
   protected fpo W;
   private final File bU;
   public boolean X;
   private fox bV = fox.a;
   public String Y = "";
   public boolean Z;
   private final fpr<Integer> bW = new fpr<>("options.fov", fpr.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wy.c("options.fov.min"));
         case 110 -> a($$0x, wy.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fpr.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fpo.Q().f.o());
   private static final wy bX = wy.a("options.telemetry.button.tooltip", wy.c("options.telemetry.state.minimal"), wy.c("options.telemetry.state.all"));
   private final fpr<Boolean> bY = fpr.a("options.telemetry.button", fpr.a(bX), ($$0x, $$1x) -> {
      fpo $$2x = fpo.Q();
      if (!$$2x.E()) {
         return wy.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wy.c("options.telemetry.state.all") : wy.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wy bZ = wy.c("options.screenEffectScale.tooltip");
   private final fpr<Double> ca = new fpr<>("options.screenEffectScale", fpr.a(bZ), fps::b, fpr.m.a, 1.0, $$0x -> {
   });
   private static final wy cb = wy.c("options.fovEffectScale.tooltip");
   private final fpr<Double> cc = new fpr<>(
      "options.fovEffectScale", fpr.a(cb), fps::b, fpr.m.a.a(azm::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final wy cd = wy.c("options.darknessEffectScale.tooltip");
   private final fpr<Double> ce = new fpr<>("options.darknessEffectScale", fpr.a(cd), fps::b, fpr.m.a.a(azm::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final wy cf = wy.c("options.glintSpeed.tooltip");
   private final fpr<Double> cg = new fpr<>("options.glintSpeed", fpr.a(cf), fps::b, fpr.m.a, 0.5, $$0x -> {
   });
   private static final wy ch = wy.c("options.glintStrength.tooltip");
   private final fpr<Double> ci = new fpr<>("options.glintStrength", fpr.a(ch), fps::b, fpr.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final wy cj = wy.c("options.damageTiltStrength.tooltip");
   private final fpr<Double> ck = new fpr<>("options.damageTiltStrength", fpr.a(cj), fps::b, fpr.m.a, 1.0, $$0x -> {
   });
   private final fpr<Double> cl = new fpr<>("options.gamma", fpr.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wy.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wy.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wy.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fpr.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cm = 2147483646;
   private final fpr<Integer> cn = new fpr<>(
      "options.guiScale", fpr.a(), ($$0x, $$1x) -> $$1x == 0 ? wy.c("options.guiScale.auto") : wy.b(Integer.toString($$1x)), new fpr.c(0, () -> {
         fpo $$0x = fpo.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fpr<ari> co = new fpr<>(
      "options.particles", fpr.a(), fpr.b(), new fpr.e<>(Arrays.asList(ari.values()), Codec.INT.xmap(ari::a, ari::b)), ari.a, $$0x -> {
      }
   );
   private final fpr<fpq> cp = new fpr<>(
      "options.narrator",
      fpr.a(),
      ($$0x, $$1x) -> (wy)(this.W.aY().a() ? $$1x.b() : wy.c("options.narrator.notavailable")),
      new fpr.e<>(Arrays.asList(fpq.values()), Codec.INT.xmap(fpq::a, fpq::a)),
      fpq.a,
      $$0x -> this.W.aY().a($$0x)
   );
   public String ab = "en_us";
   private final fpr<String> cq = new fpr<>(
      "options.audioDevice",
      fpr.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wy.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wy.b($$1x.substring(hok.c)) : wy.b($$1x);
         }
      },
      new fpr.h<>(
         () -> Stream.concat(Stream.of(""), fpo.Q().ak().a().stream()).toList(),
         $$0x -> fpo.Q().r() && $$0x != "" && !fpo.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hon $$1x = fpo.Q().ak();
         $$1x.j();
         $$1x.a(hnc.a(awn.Bv, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;
   public boolean ae = true;

   public fpr<Boolean> a() {
      return this.ak;
   }

   public fpr<Boolean> b() {
      return this.am;
   }

   public fpr<Boolean> c() {
      return this.ao;
   }

   public fpr<Double> d() {
      return this.ap;
   }

   public fpr<Integer> e() {
      return this.aq;
   }

   public fpr<Integer> f() {
      return this.ar;
   }

   public fpr<Double> g() {
      return this.at;
   }

   public fpr<Integer> h() {
      return this.au;
   }

   public fpr<fpk> i() {
      return this.ax;
   }

   public fpr<fpa> j() {
      return this.ay;
   }

   public fpr<fpg> k() {
      return this.aC;
   }

   public fpr<Boolean> l() {
      return this.aD;
   }

   public fpr<fpu> m() {
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

   public fpr<crg> n() {
      return this.aI;
   }

   public fpr<Double> o() {
      return this.aJ;
   }

   public fpr<Double> p() {
      return this.aK;
   }

   public fpr<Integer> q() {
      return this.aN;
   }

   public int r() {
      return this.q().c();
   }

   public fpr<Double> s() {
      return this.aO;
   }

   public fpr<Double> t() {
      return this.aP;
   }

   public fpr<Boolean> u() {
      return this.aR;
   }

   public fpr<Boolean> v() {
      return this.aT;
   }

   public fpr<Boolean> w() {
      return this.aU;
   }

   public fpr<bxa> x() {
      return this.aW;
   }

   public fpr<Double> y() {
      return this.aX;
   }

   public fpr<Double> z() {
      return this.aY;
   }

   public fpr<Double> A() {
      return this.aZ;
   }

   public fpr<Double> B() {
      return this.ba;
   }

   public fpr<Double> C() {
      return this.bb;
   }

   public fpr<Double> D() {
      return this.bd;
   }

   public fpr<Integer> E() {
      return this.be;
   }

   public fpr<fov> F() {
      return this.bf;
   }

   public fpr<Integer> G() {
      return this.bg;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return azm.a(Math.log10($$0) * 100.0);
   }

   public fpr<Double> H() {
      return this.bh;
   }

   public fpr<Boolean> I() {
      return this.bi;
   }

   public fpr<Boolean> J() {
      return this.bj;
   }

   public fpr<Boolean> K() {
      return this.bl;
   }

   public fpr<Boolean> L() {
      return this.bm;
   }

   public fpr<Boolean> M() {
      return this.bn;
   }

   public fpr<Boolean> N() {
      return this.bo;
   }

   public fpr<Boolean> O() {
      return this.bp;
   }

   public fpr<Boolean> P() {
      return this.bq;
   }

   public fpr<Boolean> Q() {
      return this.br;
   }

   public fpr<Boolean> R() {
      return this.bs;
   }

   private static void aI() {
      fpo $$0 = fpo.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fpr<Boolean> S() {
      return this.bt;
   }

   private static boolean aJ() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fpr<Boolean> T() {
      return this.bu;
   }

   public fpr<Boolean> U() {
      return this.bv;
   }

   public fpr<Boolean> V() {
      return this.bw;
   }

   public fpr<Boolean> W() {
      return this.by;
   }

   public fpr<Boolean> X() {
      return this.bA;
   }

   public fpr<Boolean> Y() {
      return this.bB;
   }

   public final float a(awo $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fpr<Double> b(awo $$0) {
      return Objects.requireNonNull(this.bC.get($$0));
   }

   private fpr<Double> a(String $$0, awo $$1) {
      return new fpr<>($$0, fpr.a(), fps::b, fpr.m.a, 1.0, $$1x -> fpo.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fpr<Boolean> Z() {
      return this.bD;
   }

   public fpr<Boolean> aa() {
      return this.bG;
   }

   public fpr<Boolean> ab() {
      return this.bH;
   }

   public fpr<Boolean> ac() {
      return this.bI;
   }

   public fpr<Boolean> ad() {
      return this.bJ;
   }

   public fpr<Boolean> ae() {
      return this.bK;
   }

   public fpr<Boolean> af() {
      return this.bN;
   }

   public fpr<Boolean> ag() {
      return this.bO;
   }

   public fpr<Boolean> ah() {
      return this.bQ;
   }

   public fpr<Boolean> ai() {
      return this.bR;
   }

   public fpr<Boolean> aj() {
      return this.bT;
   }

   public fpr<Integer> ak() {
      return this.bW;
   }

   public fpr<Boolean> al() {
      return this.bY;
   }

   public fpr<Double> am() {
      return this.ca;
   }

   public fpr<Double> an() {
      return this.cc;
   }

   public fpr<Double> ao() {
      return this.ce;
   }

   public fpr<Double> ap() {
      return this.cg;
   }

   public fpr<Double> aq() {
      return this.ci;
   }

   public fpr<Double> ar() {
      return this.ck;
   }

   public fpr<Double> as() {
      return this.cl;
   }

   public fpr<Integer> at() {
      return this.cn;
   }

   public fpr<ari> au() {
      return this.co;
   }

   public fpr<fpq> av() {
      return this.cp;
   }

   public fpr<String> aw() {
      return this.cq;
   }

   public void ax() {
      this.ac = false;
      this.az();
   }

   public fps(fpo $$0, File $$1) {
      this.W = $$0;
      this.bU = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new fpr<>(
         "options.renderDistance",
         fpr.a(),
         ($$0x, $$1x) -> a($$0x, wy.a("options.chunks", $$1x)),
         new fpr.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fpo.Q().f.o()
      );
      this.ar = new fpr<>(
         "options.simulationDistance", fpr.a(), ($$0x, $$1x) -> a($$0x, wy.a("options.chunks", $$1x)), new fpr.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
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

   private void a(fps.b $$0) {
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

   private void a(fps.a $$0) {
      this.a((fps.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, fps::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fps::c, ag::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, hpr::a, hpr::a);
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

      for (fpm $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fip.a($$3));
         }
      }

      for (awo $$4 : awo.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bC.get($$4));
      }

      for (crl $$5 : crl.values()) {
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
               this.aC.a(fpg.b);
            } else {
               this.aC.a(fpg.a);
            }
         }

         this.a(
            new fps.a() {
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
               public <T> void a(String $$0, fpr<T> $$1) {
                  String $$2 = this.a($$0);
                  if ($$2 != null) {
                     JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                     JsonElement $$4 = JsonParser.parseReader($$3);
                     $$1.d()
                        .parse(JsonOps.INSTANCE, $$4)
                        .ifError($$2xx -> fps.af.error("Error parsing option value {} for option {}: {}", new Object[]{$$2, $$1, $$2xx.message()}))
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
                        fps.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                     }
                  }

                  return $$1;
               }

               @Override
               public boolean a(String $$0, boolean $$1) {
                  String $$2 = this.a($$0);
                  return $$2 != null ? fps.a($$2) : $$1;
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
                  } else if (fps.a($$2)) {
                     return 1.0F;
                  } else if (fps.b($$2)) {
                     return 0.0F;
                  } else {
                     try {
                        return Float.parseFloat($$2);
                     } catch (NumberFormatException var5) {
                        fps.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fpm.d();
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
         this.a(new fps.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fpr<T> $$1) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1x -> fps.af.error("Error saving option " + $$1 + ": " + $$1x)).ifSuccess($$2x -> {
                  this.a($$0);
                  $$0.println(fps.ag.toJson($$2x));
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
      fix $$0 = this.W.aO();
      if ($$0 == null) {
         return this.k;
      } else {
         return $$0.e().isPresent() ? $$0.e().get().g() : null;
      }
   }

   public ara aA() {
      int $$0 = 0;

      for (crl $$1 : this.aV) {
         $$0 |= $$1.a();
      }

      return new ara(this.ab, this.aq.c(), this.aI.c(), this.bo.c(), $$0, this.aW.c(), this.W.aT(), this.bA.c(), this.co.c());
   }

   public void aB() {
      if (this.W.t != null) {
         this.W.t.j.a(this.aA());
      }
   }

   public void a(crl $$0, boolean $$1) {
      if ($$1) {
         this.aV.add($$0);
      } else {
         this.aV.remove($$0);
      }
   }

   public boolean a(crl $$0) {
      return this.aV.contains($$0);
   }

   public fpa aC() {
      return this.aH() >= 4 ? this.ay.c() : fpa.a;
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

   public fox aE() {
      return this.bV;
   }

   public void a(fox $$0) {
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
      this.a(new fps.b() {
         @Override
         public <T> void a(String $$0x, fpr<T> $$1) {
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

   interface a extends fps.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fpr<T> var2);
   }
}
