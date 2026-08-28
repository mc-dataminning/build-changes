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

public class flo {
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
   private static final wp ai = wp.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fln<Boolean> aj = fln.a("options.darkMojangStudiosBackgroundColor", fln.a(ai), false);
   private static final wp ak = wp.c("options.hideLightningFlashes.tooltip");
   private final fln<Boolean> al = fln.a("options.hideLightningFlashes", fln.a(ak), false);
   private static final wp am = wp.c("options.hideSplashTexts.tooltip");
   private final fln<Boolean> an = fln.a("options.hideSplashTexts", fln.a(am), false);
   private final fln<Double> ao = new fln<>("options.sensitivity", fln.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wp.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wp.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fln.m.a, 0.5, $$0x -> {
   });
   private final fln<Integer> ap;
   private final fln<Integer> aq;
   private int ar = 0;
   private final fln<Double> as = new fln<>(
      "options.entityDistanceScaling",
      fln.a(),
      flo::a,
      new fln.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fln<Integer> at = new fln<>(
      "options.framerateLimit",
      fln.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wp.c("options.framerateLimit.max")) : a($$0x, wp.a("options.framerate", $$1x)),
      new fln.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> flk.Q().aP().a($$0x)
   );
   private static final wp au = wp.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final wp av = wp.c("options.inactivityFpsLimit.afk.tooltip");
   private final fln<flg> aw = new fln<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> fqf.a(au);
         case b -> fqf.a(av);
      };
   }, fln.b(), new fln.e<>(Arrays.asList(flg.values()), flg.c), flg.b, $$0x -> {
   });
   private final fln<fkw> ax = new fln<>(
      "options.renderClouds",
      fln.a(),
      fln.b(),
      new fln.e<>(Arrays.asList(fkw.values()), Codec.withAlternative(fkw.d, Codec.BOOL, $$0x -> $$0x ? fkw.c : fkw.a)),
      fkw.c,
      $$0x -> {
      }
   );
   private static final wp ay = wp.c("options.graphics.fast.tooltip");
   private static final wp az = wp.a("options.graphics.fabulous.tooltip", wp.c("options.graphics.fabulous").a(n.u));
   private static final wp aA = wp.c("options.graphics.fancy.tooltip");
   private final fln<flc> aB = new fln<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fqf.a(aA);
            case a -> fqf.a(ay);
            case c -> fqf.a(az);
         };
      },
      ($$0x, $$1x) -> {
         xd $$2x = wp.c($$1x.a());
         return $$1x == flc.c ? $$2x.a(n.u) : $$2x;
      },
      new fln.a<>(
         Arrays.asList(flc.values()),
         Stream.of(flc.values()).filter($$0x -> $$0x != flc.c).collect(Collectors.toList()),
         () -> flk.Q().r() && flk.Q().aj().h(),
         ($$0x, $$1x) -> {
            flk $$2x = flk.Q();
            glr $$3 = $$2x.aj();
            if ($$1x == flc.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.e();
            }
         },
         Codec.INT.xmap(flc::a, flc::b)
      ),
      flc.b,
      $$0x -> {
      }
   );
   private final fln<Boolean> aC = fln.a("options.ao", true, $$0x -> flk.Q().f.e());
   private static final wp aD = wp.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wp aE = wp.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wp aF = wp.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fln<flq> aG = new fln<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fqf.a(aD);
         case b -> fqf.a(aE);
         case c -> fqf.a(aF);
      };
   }, fln.b(), new fln.e<>(Arrays.asList(flq.values()), Codec.INT.xmap(flq::a, flq::b)), flq.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fln<cov> aH = new fln<>(
      "options.chat.visibility", fln.a(), fln.b(), new fln.e<>(Arrays.asList(cov.values()), Codec.INT.xmap(cov::a, cov::b)), cov.a, $$0x -> {
      }
   );
   private final fln<Double> aI = new fln<>("options.chat.opacity", fln.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fln.m.a, 1.0, $$0x -> flk.Q().m.d().b());
   private final fln<Double> aJ = new fln<>("options.chat.line_spacing", fln.a(), flo::a, fln.m.a, 0.0, $$0x -> {
   });
   private static final wp aK = wp.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aL = 5;
   private final fln<Integer> aM = new fln<>("options.accessibility.menu_background_blurriness", fln.a(aK), flo::b, new fln.f(0, 10), 5, $$0x -> {
   });
   private final fln<Double> aN = new fln<>("options.accessibility.text_background_opacity", fln.a(), flo::a, fln.m.a, 0.5, $$0x -> flk.Q().m.d().b());
   private final fln<Double> aO = new fln<>("options.accessibility.panorama_speed", fln.a(), flo::a, fln.m.a, 1.0, $$0x -> {
   });
   private static final wp aP = wp.c("options.accessibility.high_contrast.tooltip");
   private final fln<Boolean> aQ = fln.a("options.accessibility.high_contrast", fln.a(aP), false, $$0x -> {
      aua $$1x = flk.Q().ad();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private static final wp aR = wp.c("options.accessibility.high_contrast_block_outline.tooltip");
   private final fln<Boolean> aS = fln.a("options.accessibility.high_contrast_block_outline", fln.a(aR), false);
   private final fln<Boolean> aT = fln.a(
      "options.accessibility.narrator_hotkey",
      fln.a(flk.a ? wp.c("options.accessibility.narrator_hotkey.mac.tooltip") : wp.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<coz> aU = EnumSet.allOf(coz.class);
   private final fln<bvc> aV = new fln<>("options.mainHand", fln.a(), fln.b(), new fln.e<>(Arrays.asList(bvc.values()), bvc.c), bvc.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fln<Double> aW = new fln<>(
      "options.chat.scale",
      fln.a(),
      ($$0x, $$1x) -> (wp)($$1x == 0.0 ? wo.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fln.m.a,
      1.0,
      $$0x -> flk.Q().m.d().b()
   );
   private final fln<Double> aX = new fln<>("options.chat.width", fln.a(), ($$0x, $$1x) -> c($$0x, fov.a($$1x)), fln.m.a, 1.0, $$0x -> flk.Q().m.d().b());
   private final fln<Double> aY = new fln<>(
      "options.chat.height.unfocused", fln.a(), ($$0x, $$1x) -> c($$0x, fov.b($$1x)), fln.m.a, fov.i(), $$0x -> flk.Q().m.d().b()
   );
   private final fln<Double> aZ = new fln<>(
      "options.chat.height.focused", fln.a(), ($$0x, $$1x) -> c($$0x, fov.b($$1x)), fln.m.a, 1.0, $$0x -> flk.Q().m.d().b()
   );
   private final fln<Double> ba = new fln<>(
      "options.chat.delay_instant",
      fln.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wp.c("options.chat.delay_none") : wp.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fln.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> flk.Q().aZ().a($$0x)
   );
   private static final wp bb = wp.c("options.notifications.display_time.tooltip");
   private final fln<Double> bc = new fln<>(
      "options.notifications.display_time",
      fln.a(bb),
      ($$0x, $$1x) -> a($$0x, wp.a("options.multiplier", $$1x)),
      new fln.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fln<Integer> bd = new fln<>(
      "options.mipmapLevels", fln.a(), ($$0x, $$1x) -> (wp)($$1x == 0 ? wo.a($$0x, false) : a($$0x, $$1x.intValue())), new fln.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fln<fkr> be = new fln<>(
      "options.attackIndicator", fln.a(), fln.b(), new fln.e<>(Arrays.asList(fkr.values()), Codec.INT.xmap(fkr::a, fkr::b)), fkr.b, $$0x -> {
      }
   );
   public hla r = hla.a;
   public boolean s = false;
   private final fln<Integer> bf = new fln<>("options.biomeBlendRadius", fln.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wp.c("options.biomeBlendRadius." + $$2x));
   }, new fln.f(0, 7, false), 2, $$0x -> flk.Q().f.e());
   private final fln<Double> bg = new fln<>(
      "options.mouseWheelSensitivity",
      fln.a(),
      ($$0x, $$1x) -> a($$0x, wp.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fln.f(-200, 100).a(flo::c, flo::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fln<Boolean> bh = fln.a("options.rawMouseInput", true, $$0x -> {
      fey $$1x = flk.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fln<Boolean> bi = fln.a("options.autoJump", false);
   private static final wp bj = wp.c("options.rotateWithMinecart.tooltip");
   private final fln<Boolean> bk = fln.a("options.rotateWithMinecart", fln.a(bj), false);
   private final fln<Boolean> bl = fln.a("options.operatorItemsTab", false);
   private final fln<Boolean> bm = fln.a("options.autoSuggestCommands", true);
   private final fln<Boolean> bn = fln.a("options.chat.color", true);
   private final fln<Boolean> bo = fln.a("options.chat.links", true);
   private final fln<Boolean> bp = fln.a("options.chat.links.prompt", true);
   private final fln<Boolean> bq = fln.a("options.vsync", true, $$0x -> {
      if (flk.Q().aO() != null) {
         flk.Q().aO().a($$0x);
      }
   });
   private final fln<Boolean> br = fln.a("options.entityShadows", true);
   private final fln<Boolean> bs = fln.a("options.forceUnicodeFont", false, $$0x -> aI());
   private final fln<Boolean> bt = fln.a("options.japaneseGlyphVariants", fln.a(wp.c("options.japaneseGlyphVariants.tooltip")), aJ(), $$0x -> aI());
   private final fln<Boolean> bu = fln.a("options.invertMouse", false);
   private final fln<Boolean> bv = fln.a("options.discrete_mouse_scroll", false);
   private static final wp bw = wp.c("options.realmsNotifications.tooltip");
   private final fln<Boolean> bx = fln.a("options.realmsNotifications", fln.a(bw), true);
   private static final wp by = wp.c("options.allowServerListing.tooltip");
   private final fln<Boolean> bz = fln.a("options.allowServerListing", fln.a(by), true, $$0x -> {
   });
   private final fln<Boolean> bA = fln.a("options.reducedDebugInfo", false);
   private final Map<awb, fln<Double>> bB = af.a(new EnumMap<>(awb.class), $$0x -> {
      for (awb $$1x : awb.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fln<Boolean> bC = fln.a("options.showSubtitles", false);
   private static final wp bD = wp.c("options.directionalAudio.on.tooltip");
   private static final wp bE = wp.c("options.directionalAudio.off.tooltip");
   private final fln<Boolean> bF = fln.a("options.directionalAudio", $$0x -> $$0x ? fqf.a(bD) : fqf.a(bE), false, $$0x -> {
      hjw $$1x = flk.Q().ak();
      $$1x.k();
      $$1x.a(hil.a(awa.Bf, 1.0F));
   });
   private final fln<Boolean> bG = new fln<>(
      "options.accessibility.text_background",
      fln.a(),
      ($$0x, $$1x) -> $$1x ? wp.c("options.accessibility.text_background.chat") : wp.c("options.accessibility.text_background.everywhere"),
      fln.a,
      true,
      $$0x -> {
      }
   );
   private final fln<Boolean> bH = fln.a("options.touchscreen", false);
   private final fln<Boolean> bI = fln.a("options.fullscreen", false, $$0x -> {
      flk $$1x = flk.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ad().a($$1x.aO().i());
      }
   });
   private final fln<Boolean> bJ = fln.a("options.viewBobbing", true);
   private static final wp bK = wp.c("options.key.toggle");
   private static final wp bL = wp.c("options.key.hold");
   private final fln<Boolean> bM = new fln<>("key.sneak", fln.a(), ($$0x, $$1x) -> $$1x ? bK : bL, fln.a, false, $$0x -> {
   });
   private final fln<Boolean> bN = new fln<>("key.sprint", fln.a(), ($$0x, $$1x) -> $$1x ? bK : bL, fln.a, false, $$0x -> {
   });
   public boolean u;
   private static final wp bO = wp.c("options.hideMatchedNames.tooltip");
   private final fln<Boolean> bP = fln.a("options.hideMatchedNames", fln.a(bO), true);
   private final fln<Boolean> bQ = fln.a("options.autosaveIndicator", true);
   private static final wp bR = wp.c("options.onlyShowSecureChat.tooltip");
   private final fln<Boolean> bS = fln.a("options.onlyShowSecureChat", fln.a(bR), false);
   public final fli v = new fli("key.forward", 87, "key.categories.movement");
   public final fli w = new fli("key.left", 65, "key.categories.movement");
   public final fli x = new fli("key.back", 83, "key.categories.movement");
   public final fli y = new fli("key.right", 68, "key.categories.movement");
   public final fli z = new fli("key.jump", 32, "key.categories.movement");
   public final fli A = new flv("key.sneak", 340, "key.categories.movement", this.bM::c);
   public final fli B = new flv("key.sprint", 341, "key.categories.movement", this.bN::c);
   public final fli C = new fli("key.inventory", 69, "key.categories.inventory");
   public final fli D = new fli("key.swapOffhand", 70, "key.categories.inventory");
   public final fli E = new fli("key.drop", 81, "key.categories.inventory");
   public final fli F = new fli("key.use", feq.b.c, 1, "key.categories.gameplay");
   public final fli G = new fli("key.attack", feq.b.c, 0, "key.categories.gameplay");
   public final fli H = new fli("key.pickItem", feq.b.c, 2, "key.categories.gameplay");
   public final fli I = new fli("key.chat", 84, "key.categories.multiplayer");
   public final fli J = new fli("key.playerlist", 258, "key.categories.multiplayer");
   public final fli K = new fli("key.command", 47, "key.categories.multiplayer");
   public final fli L = new fli("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fli M = new fli("key.screenshot", 291, "key.categories.misc");
   public final fli N = new fli("key.togglePerspective", 294, "key.categories.misc");
   public final fli O = new fli("key.smoothCamera", feq.bv.b(), "key.categories.misc");
   public final fli P = new fli("key.fullscreen", 300, "key.categories.misc");
   public final fli Q = new fli("key.spectatorOutlines", feq.bv.b(), "key.categories.misc");
   public final fli R = new fli("key.advancements", 76, "key.categories.misc");
   public final fli[] S = new fli[]{
      new fli("key.hotbar.1", 49, "key.categories.inventory"),
      new fli("key.hotbar.2", 50, "key.categories.inventory"),
      new fli("key.hotbar.3", 51, "key.categories.inventory"),
      new fli("key.hotbar.4", 52, "key.categories.inventory"),
      new fli("key.hotbar.5", 53, "key.categories.inventory"),
      new fli("key.hotbar.6", 54, "key.categories.inventory"),
      new fli("key.hotbar.7", 55, "key.categories.inventory"),
      new fli("key.hotbar.8", 56, "key.categories.inventory"),
      new fli("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fli T = new fli("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fli U = new fli("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fli[] V = (fli[])ArrayUtils.addAll(
      new fli[]{
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
   protected flk W;
   private final File bT;
   public boolean X;
   private fkt bU = fkt.a;
   public String Y = "";
   public boolean Z;
   private final fln<Integer> bV = new fln<>("options.fov", fln.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wp.c("options.fov.min"));
         case 110 -> a($$0x, wp.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fln.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> flk.Q().f.p());
   private static final wp bW = wp.a("options.telemetry.button.tooltip", wp.c("options.telemetry.state.minimal"), wp.c("options.telemetry.state.all"));
   private final fln<Boolean> bX = fln.a("options.telemetry.button", fln.a(bW), ($$0x, $$1x) -> {
      flk $$2x = flk.Q();
      if (!$$2x.E()) {
         return wp.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wp.c("options.telemetry.state.all") : wp.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wp bY = wp.c("options.screenEffectScale.tooltip");
   private final fln<Double> bZ = new fln<>("options.screenEffectScale", fln.a(bY), flo::b, fln.m.a, 1.0, $$0x -> {
   });
   private static final wp ca = wp.c("options.fovEffectScale.tooltip");
   private final fln<Double> cb = new fln<>(
      "options.fovEffectScale", fln.a(ca), flo::b, fln.m.a.a(ayz::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final wp cc = wp.c("options.darknessEffectScale.tooltip");
   private final fln<Double> cd = new fln<>("options.darknessEffectScale", fln.a(cc), flo::b, fln.m.a.a(ayz::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final wp ce = wp.c("options.glintSpeed.tooltip");
   private final fln<Double> cf = new fln<>("options.glintSpeed", fln.a(ce), flo::b, fln.m.a, 0.5, $$0x -> {
   });
   private static final wp cg = wp.c("options.glintStrength.tooltip");
   private final fln<Double> ch = new fln<>("options.glintStrength", fln.a(cg), flo::b, fln.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final wp ci = wp.c("options.damageTiltStrength.tooltip");
   private final fln<Double> cj = new fln<>("options.damageTiltStrength", fln.a(ci), flo::b, fln.m.a, 1.0, $$0x -> {
   });
   private final fln<Double> ck = new fln<>("options.gamma", fln.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wp.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wp.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wp.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fln.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cl = 2147483646;
   private final fln<Integer> cm = new fln<>(
      "options.guiScale", fln.a(), ($$0x, $$1x) -> $$1x == 0 ? wp.c("options.guiScale.auto") : wp.b(Integer.toString($$1x)), new fln.c(0, () -> {
         flk $$0x = flk.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fln<aqv> cn = new fln<>(
      "options.particles", fln.a(), fln.b(), new fln.e<>(Arrays.asList(aqv.values()), Codec.INT.xmap(aqv::a, aqv::b)), aqv.a, $$0x -> {
      }
   );
   private final fln<flm> co = new fln<>(
      "options.narrator",
      fln.a(),
      ($$0x, $$1x) -> (wp)(this.W.aY().a() ? $$1x.b() : wp.c("options.narrator.notavailable")),
      new fln.e<>(Arrays.asList(flm.values()), Codec.INT.xmap(flm::a, flm::a)),
      flm.a,
      $$0x -> this.W.aY().a($$0x)
   );
   public String ab = "en_us";
   private final fln<String> cp = new fln<>(
      "options.audioDevice",
      fln.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wp.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wp.b($$1x.substring(hjt.c)) : wp.b($$1x);
         }
      },
      new fln.h<>(
         () -> Stream.concat(Stream.of(""), flk.Q().ak().a().stream()).toList(),
         $$0x -> flk.Q().r() && $$0x != "" && !flk.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hjw $$1x = flk.Q().ak();
         $$1x.k();
         $$1x.a(hil.a(awa.Bf, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;

   public fln<Boolean> a() {
      return this.aj;
   }

   public fln<Boolean> b() {
      return this.al;
   }

   public fln<Boolean> c() {
      return this.an;
   }

   public fln<Double> d() {
      return this.ao;
   }

   public fln<Integer> e() {
      return this.ap;
   }

   public fln<Integer> f() {
      return this.aq;
   }

   public fln<Double> g() {
      return this.as;
   }

   public fln<Integer> h() {
      return this.at;
   }

   public fln<flg> i() {
      return this.aw;
   }

   public fln<fkw> j() {
      return this.ax;
   }

   public fln<flc> k() {
      return this.aB;
   }

   public fln<Boolean> l() {
      return this.aC;
   }

   public fln<flq> m() {
      return this.aG;
   }

   public void a(aua $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (atx $$2 : $$0.g()) {
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

   public fln<cov> n() {
      return this.aH;
   }

   public fln<Double> o() {
      return this.aI;
   }

   public fln<Double> p() {
      return this.aJ;
   }

   public fln<Integer> q() {
      return this.aM;
   }

   public int r() {
      return this.q().c();
   }

   public fln<Double> s() {
      return this.aN;
   }

   public fln<Double> t() {
      return this.aO;
   }

   public fln<Boolean> u() {
      return this.aQ;
   }

   public fln<Boolean> v() {
      return this.aS;
   }

   public fln<Boolean> w() {
      return this.aT;
   }

   public fln<bvc> x() {
      return this.aV;
   }

   public fln<Double> y() {
      return this.aW;
   }

   public fln<Double> z() {
      return this.aX;
   }

   public fln<Double> A() {
      return this.aY;
   }

   public fln<Double> B() {
      return this.aZ;
   }

   public fln<Double> C() {
      return this.ba;
   }

   public fln<Double> D() {
      return this.bc;
   }

   public fln<Integer> E() {
      return this.bd;
   }

   public fln<fkr> F() {
      return this.be;
   }

   public fln<Integer> G() {
      return this.bf;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ayz.a(Math.log10($$0) * 100.0);
   }

   public fln<Double> H() {
      return this.bg;
   }

   public fln<Boolean> I() {
      return this.bh;
   }

   public fln<Boolean> J() {
      return this.bi;
   }

   public fln<Boolean> K() {
      return this.bk;
   }

   public fln<Boolean> L() {
      return this.bl;
   }

   public fln<Boolean> M() {
      return this.bm;
   }

   public fln<Boolean> N() {
      return this.bn;
   }

   public fln<Boolean> O() {
      return this.bo;
   }

   public fln<Boolean> P() {
      return this.bp;
   }

   public fln<Boolean> Q() {
      return this.bq;
   }

   public fln<Boolean> R() {
      return this.br;
   }

   private static void aI() {
      flk $$0 = flk.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fln<Boolean> S() {
      return this.bs;
   }

   private static boolean aJ() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fln<Boolean> T() {
      return this.bt;
   }

   public fln<Boolean> U() {
      return this.bu;
   }

   public fln<Boolean> V() {
      return this.bv;
   }

   public fln<Boolean> W() {
      return this.bx;
   }

   public fln<Boolean> X() {
      return this.bz;
   }

   public fln<Boolean> Y() {
      return this.bA;
   }

   public final float a(awb $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fln<Double> b(awb $$0) {
      return Objects.requireNonNull(this.bB.get($$0));
   }

   private fln<Double> a(String $$0, awb $$1) {
      return new fln<>($$0, fln.a(), flo::b, fln.m.a, 1.0, $$1x -> flk.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fln<Boolean> Z() {
      return this.bC;
   }

   public fln<Boolean> aa() {
      return this.bF;
   }

   public fln<Boolean> ab() {
      return this.bG;
   }

   public fln<Boolean> ac() {
      return this.bH;
   }

   public fln<Boolean> ad() {
      return this.bI;
   }

   public fln<Boolean> ae() {
      return this.bJ;
   }

   public fln<Boolean> af() {
      return this.bM;
   }

   public fln<Boolean> ag() {
      return this.bN;
   }

   public fln<Boolean> ah() {
      return this.bP;
   }

   public fln<Boolean> ai() {
      return this.bQ;
   }

   public fln<Boolean> aj() {
      return this.bS;
   }

   public fln<Integer> ak() {
      return this.bV;
   }

   public fln<Boolean> al() {
      return this.bX;
   }

   public fln<Double> am() {
      return this.bZ;
   }

   public fln<Double> an() {
      return this.cb;
   }

   public fln<Double> ao() {
      return this.cd;
   }

   public fln<Double> ap() {
      return this.cf;
   }

   public fln<Double> aq() {
      return this.ch;
   }

   public fln<Double> ar() {
      return this.cj;
   }

   public fln<Double> as() {
      return this.ck;
   }

   public fln<Integer> at() {
      return this.cm;
   }

   public fln<aqv> au() {
      return this.cn;
   }

   public fln<flm> av() {
      return this.co;
   }

   public fln<String> aw() {
      return this.cp;
   }

   public void ax() {
      this.ac = false;
      this.az();
   }

   public flo(flk $$0, File $$1) {
      this.W = $$0;
      this.bT = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ap = new fln<>(
         "options.renderDistance",
         fln.a(),
         ($$0x, $$1x) -> a($$0x, wp.a("options.chunks", $$1x)),
         new fln.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> flk.Q().f.p()
      );
      this.aq = new fln<>(
         "options.simulationDistance", fln.a(), ($$0x, $$1x) -> a($$0x, wp.a("options.chunks", $$1x)), new fln.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = af.n() == af.a.c;
      this.ay();
   }

   public float a(float $$0) {
      return this.bG.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return axk.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bG.c() ? $$0 : axk.a(this.aN.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(flo.b $$0) {
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

   private void a(flo.a $$0) {
      this.a((flo.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, flo::c, af::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, flo::c, af::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, hla::a, hla::a);
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

      for (fli $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(feq.a($$3));
         }
      }

      for (awb $$4 : awb.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bB.get($$4));
      }

      for (coz $$5 : coz.values()) {
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

         tq $$0 = new tq();

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

         final tq $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(flc.b);
            } else {
               this.aB.a(flc.a);
            }
         }

         this.a(new flo.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).u_() : null;
            }

            @Override
            public <T> void a(String $$0, fln<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> flo.ae.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     flo.ae.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? flo.a($$2) : $$1;
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
               } else if (flo.a($$2)) {
                  return 1.0F;
               } else if (flo.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     flo.ae.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fli.d();
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

   private tq a(tq $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return ban.e.a(this.W.au(), $$0, $$1);
   }

   public void az() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bT), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new flo.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fln<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> flo.ae.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(flo.af.toJson($$2));
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

   public aqo aA() {
      int $$0 = 0;

      for (coz $$1 : this.aU) {
         $$0 |= $$1.a();
      }

      return new aqo(this.ab, this.ap.c(), this.aH.c(), this.bn.c(), $$0, this.aV.c(), this.W.aT(), this.bz.c(), this.cn.c());
   }

   public void aB() {
      if (this.W.t != null) {
         this.W.t.j.a(this.aA());
      }
   }

   public void a(coz $$0, boolean $$1) {
      if ($$1) {
         this.aU.add($$0);
      } else {
         this.aU.remove($$0);
      }
   }

   public boolean a(coz $$0) {
      return this.aU.contains($$0);
   }

   public fkw aC() {
      return this.aH() >= 4 ? this.ax.c() : fkw.a;
   }

   public boolean aD() {
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

   public fkt aE() {
      return this.bU;
   }

   public void a(fkt $$0) {
      this.bU = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = ayp.a(af, $$0, ag);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aF() {
      return this.bT;
   }

   public String aG() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new flo.b() {
         @Override
         public <T> void a(String $$0x, fln<T> $$1) {
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

   private static wp c(wp $$0, int $$1) {
      return wp.a("options.pixel_value", $$0, $$1);
   }

   private static wp a(wp $$0, double $$1) {
      return wp.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static wp a(wp $$0, wp $$1) {
      return wp.a("options.generic_value", $$0, $$1);
   }

   public static wp a(wp $$0, int $$1) {
      return a($$0, wp.b(Integer.toString($$1)));
   }

   public static wp b(wp $$0, int $$1) {
      return $$1 == 0 ? a($$0, wo.c) : a($$0, $$1);
   }

   private static wp b(wp $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, wo.c) : a($$0, $$1);
   }

   interface a extends flo.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fln<T> var2);
   }
}
