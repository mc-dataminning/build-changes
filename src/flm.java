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

public class flm {
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
   private final fll<Boolean> aj = fll.a("options.darkMojangStudiosBackgroundColor", fll.a(ai), false);
   private static final wp ak = wp.c("options.hideLightningFlashes.tooltip");
   private final fll<Boolean> al = fll.a("options.hideLightningFlashes", fll.a(ak), false);
   private static final wp am = wp.c("options.hideSplashTexts.tooltip");
   private final fll<Boolean> an = fll.a("options.hideSplashTexts", fll.a(am), false);
   private final fll<Double> ao = new fll<>("options.sensitivity", fll.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wp.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wp.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fll.m.a, 0.5, $$0x -> {
   });
   private final fll<Integer> ap;
   private final fll<Integer> aq;
   private int ar = 0;
   private final fll<Double> as = new fll<>(
      "options.entityDistanceScaling",
      fll.a(),
      flm::a,
      new fll.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fll<Integer> at = new fll<>(
      "options.framerateLimit",
      fll.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wp.c("options.framerateLimit.max")) : a($$0x, wp.a("options.framerate", $$1x)),
      new fll.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fli.Q().aP().a($$0x)
   );
   private static final wp au = wp.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final wp av = wp.c("options.inactivityFpsLimit.afk.tooltip");
   private final fll<fle> aw = new fll<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> fqd.a(au);
         case b -> fqd.a(av);
      };
   }, fll.b(), new fll.e<>(Arrays.asList(fle.values()), fle.c), fle.b, $$0x -> {
   });
   private final fll<fku> ax = new fll<>(
      "options.renderClouds",
      fll.a(),
      fll.b(),
      new fll.e<>(Arrays.asList(fku.values()), Codec.withAlternative(fku.d, Codec.BOOL, $$0x -> $$0x ? fku.c : fku.a)),
      fku.c,
      $$0x -> {
      }
   );
   private static final wp ay = wp.c("options.graphics.fast.tooltip");
   private static final wp az = wp.a("options.graphics.fabulous.tooltip", wp.c("options.graphics.fabulous").a(n.u));
   private static final wp aA = wp.c("options.graphics.fancy.tooltip");
   private final fll<fla> aB = new fll<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fqd.a(aA);
            case a -> fqd.a(ay);
            case c -> fqd.a(az);
         };
      },
      ($$0x, $$1x) -> {
         xd $$2x = wp.c($$1x.a());
         return $$1x == fla.c ? $$2x.a(n.u) : $$2x;
      },
      new fll.a<>(
         Arrays.asList(fla.values()),
         Stream.of(fla.values()).filter($$0x -> $$0x != fla.c).collect(Collectors.toList()),
         () -> fli.Q().r() && fli.Q().aj().h(),
         ($$0x, $$1x) -> {
            fli $$2x = fli.Q();
            glp $$3 = $$2x.aj();
            if ($$1x == fla.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.e();
            }
         },
         Codec.INT.xmap(fla::a, fla::b)
      ),
      fla.b,
      $$0x -> {
      }
   );
   private final fll<Boolean> aC = fll.a("options.ao", true, $$0x -> fli.Q().f.e());
   private static final wp aD = wp.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wp aE = wp.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wp aF = wp.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fll<flo> aG = new fll<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fqd.a(aD);
         case b -> fqd.a(aE);
         case c -> fqd.a(aF);
      };
   }, fll.b(), new fll.e<>(Arrays.asList(flo.values()), Codec.INT.xmap(flo::a, flo::b)), flo.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fll<cot> aH = new fll<>(
      "options.chat.visibility", fll.a(), fll.b(), new fll.e<>(Arrays.asList(cot.values()), Codec.INT.xmap(cot::a, cot::b)), cot.a, $$0x -> {
      }
   );
   private final fll<Double> aI = new fll<>("options.chat.opacity", fll.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fll.m.a, 1.0, $$0x -> fli.Q().m.d().b());
   private final fll<Double> aJ = new fll<>("options.chat.line_spacing", fll.a(), flm::a, fll.m.a, 0.0, $$0x -> {
   });
   private static final wp aK = wp.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aL = 5;
   private final fll<Integer> aM = new fll<>("options.accessibility.menu_background_blurriness", fll.a(aK), flm::b, new fll.f(0, 10), 5, $$0x -> {
   });
   private final fll<Double> aN = new fll<>("options.accessibility.text_background_opacity", fll.a(), flm::a, fll.m.a, 0.5, $$0x -> fli.Q().m.d().b());
   private final fll<Double> aO = new fll<>("options.accessibility.panorama_speed", fll.a(), flm::a, fll.m.a, 1.0, $$0x -> {
   });
   private static final wp aP = wp.c("options.accessibility.high_contrast.tooltip");
   private final fll<Boolean> aQ = fll.a("options.accessibility.high_contrast", fll.a(aP), false, $$0x -> {
      aua $$1x = fli.Q().ad();
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
   private final fll<Boolean> aS = fll.a("options.accessibility.high_contrast_block_outline", fll.a(aR), false);
   private final fll<Boolean> aT = fll.a(
      "options.accessibility.narrator_hotkey",
      fll.a(fli.a ? wp.c("options.accessibility.narrator_hotkey.mac.tooltip") : wp.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cox> aU = EnumSet.allOf(cox.class);
   private final fll<bva> aV = new fll<>("options.mainHand", fll.a(), fll.b(), new fll.e<>(Arrays.asList(bva.values()), bva.c), bva.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fll<Double> aW = new fll<>(
      "options.chat.scale",
      fll.a(),
      ($$0x, $$1x) -> (wp)($$1x == 0.0 ? wo.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fll.m.a,
      1.0,
      $$0x -> fli.Q().m.d().b()
   );
   private final fll<Double> aX = new fll<>("options.chat.width", fll.a(), ($$0x, $$1x) -> c($$0x, fot.a($$1x)), fll.m.a, 1.0, $$0x -> fli.Q().m.d().b());
   private final fll<Double> aY = new fll<>(
      "options.chat.height.unfocused", fll.a(), ($$0x, $$1x) -> c($$0x, fot.b($$1x)), fll.m.a, fot.i(), $$0x -> fli.Q().m.d().b()
   );
   private final fll<Double> aZ = new fll<>(
      "options.chat.height.focused", fll.a(), ($$0x, $$1x) -> c($$0x, fot.b($$1x)), fll.m.a, 1.0, $$0x -> fli.Q().m.d().b()
   );
   private final fll<Double> ba = new fll<>(
      "options.chat.delay_instant",
      fll.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wp.c("options.chat.delay_none") : wp.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fll.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fli.Q().aZ().a($$0x)
   );
   private static final wp bb = wp.c("options.notifications.display_time.tooltip");
   private final fll<Double> bc = new fll<>(
      "options.notifications.display_time",
      fll.a(bb),
      ($$0x, $$1x) -> a($$0x, wp.a("options.multiplier", $$1x)),
      new fll.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fll<Integer> bd = new fll<>(
      "options.mipmapLevels", fll.a(), ($$0x, $$1x) -> (wp)($$1x == 0 ? wo.a($$0x, false) : a($$0x, $$1x.intValue())), new fll.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fll<fkp> be = new fll<>(
      "options.attackIndicator", fll.a(), fll.b(), new fll.e<>(Arrays.asList(fkp.values()), Codec.INT.xmap(fkp::a, fkp::b)), fkp.b, $$0x -> {
      }
   );
   public hky r = hky.a;
   public boolean s = false;
   private final fll<Integer> bf = new fll<>("options.biomeBlendRadius", fll.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wp.c("options.biomeBlendRadius." + $$2x));
   }, new fll.f(0, 7, false), 2, $$0x -> fli.Q().f.e());
   private final fll<Double> bg = new fll<>(
      "options.mouseWheelSensitivity",
      fll.a(),
      ($$0x, $$1x) -> a($$0x, wp.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fll.f(-200, 100).a(flm::c, flm::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fll<Boolean> bh = fll.a("options.rawMouseInput", true, $$0x -> {
      few $$1x = fli.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fll<Boolean> bi = fll.a("options.autoJump", false);
   private static final wp bj = wp.c("options.rotateWithMinecart.tooltip");
   private final fll<Boolean> bk = fll.a("options.rotateWithMinecart", fll.a(bj), false);
   private final fll<Boolean> bl = fll.a("options.operatorItemsTab", false);
   private final fll<Boolean> bm = fll.a("options.autoSuggestCommands", true);
   private final fll<Boolean> bn = fll.a("options.chat.color", true);
   private final fll<Boolean> bo = fll.a("options.chat.links", true);
   private final fll<Boolean> bp = fll.a("options.chat.links.prompt", true);
   private final fll<Boolean> bq = fll.a("options.vsync", true, $$0x -> {
      if (fli.Q().aO() != null) {
         fli.Q().aO().a($$0x);
      }
   });
   private final fll<Boolean> br = fll.a("options.entityShadows", true);
   private final fll<Boolean> bs = fll.a("options.forceUnicodeFont", false, $$0x -> aI());
   private final fll<Boolean> bt = fll.a("options.japaneseGlyphVariants", fll.a(wp.c("options.japaneseGlyphVariants.tooltip")), aJ(), $$0x -> aI());
   private final fll<Boolean> bu = fll.a("options.invertMouse", false);
   private final fll<Boolean> bv = fll.a("options.discrete_mouse_scroll", false);
   private static final wp bw = wp.c("options.realmsNotifications.tooltip");
   private final fll<Boolean> bx = fll.a("options.realmsNotifications", fll.a(bw), true);
   private static final wp by = wp.c("options.allowServerListing.tooltip");
   private final fll<Boolean> bz = fll.a("options.allowServerListing", fll.a(by), true, $$0x -> {
   });
   private final fll<Boolean> bA = fll.a("options.reducedDebugInfo", false);
   private final Map<awb, fll<Double>> bB = af.a(new EnumMap<>(awb.class), $$0x -> {
      for (awb $$1x : awb.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fll<Boolean> bC = fll.a("options.showSubtitles", false);
   private static final wp bD = wp.c("options.directionalAudio.on.tooltip");
   private static final wp bE = wp.c("options.directionalAudio.off.tooltip");
   private final fll<Boolean> bF = fll.a("options.directionalAudio", $$0x -> $$0x ? fqd.a(bD) : fqd.a(bE), false, $$0x -> {
      hju $$1x = fli.Q().ak();
      $$1x.k();
      $$1x.a(hij.a(awa.Bf, 1.0F));
   });
   private final fll<Boolean> bG = new fll<>(
      "options.accessibility.text_background",
      fll.a(),
      ($$0x, $$1x) -> $$1x ? wp.c("options.accessibility.text_background.chat") : wp.c("options.accessibility.text_background.everywhere"),
      fll.a,
      true,
      $$0x -> {
      }
   );
   private final fll<Boolean> bH = fll.a("options.touchscreen", false);
   private final fll<Boolean> bI = fll.a("options.fullscreen", false, $$0x -> {
      fli $$1x = fli.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ad().a($$1x.aO().i());
      }
   });
   private final fll<Boolean> bJ = fll.a("options.viewBobbing", true);
   private static final wp bK = wp.c("options.key.toggle");
   private static final wp bL = wp.c("options.key.hold");
   private final fll<Boolean> bM = new fll<>("key.sneak", fll.a(), ($$0x, $$1x) -> $$1x ? bK : bL, fll.a, false, $$0x -> {
   });
   private final fll<Boolean> bN = new fll<>("key.sprint", fll.a(), ($$0x, $$1x) -> $$1x ? bK : bL, fll.a, false, $$0x -> {
   });
   public boolean u;
   private static final wp bO = wp.c("options.hideMatchedNames.tooltip");
   private final fll<Boolean> bP = fll.a("options.hideMatchedNames", fll.a(bO), true);
   private final fll<Boolean> bQ = fll.a("options.autosaveIndicator", true);
   private static final wp bR = wp.c("options.onlyShowSecureChat.tooltip");
   private final fll<Boolean> bS = fll.a("options.onlyShowSecureChat", fll.a(bR), false);
   public final flg v = new flg("key.forward", 87, "key.categories.movement");
   public final flg w = new flg("key.left", 65, "key.categories.movement");
   public final flg x = new flg("key.back", 83, "key.categories.movement");
   public final flg y = new flg("key.right", 68, "key.categories.movement");
   public final flg z = new flg("key.jump", 32, "key.categories.movement");
   public final flg A = new flt("key.sneak", 340, "key.categories.movement", this.bM::c);
   public final flg B = new flt("key.sprint", 341, "key.categories.movement", this.bN::c);
   public final flg C = new flg("key.inventory", 69, "key.categories.inventory");
   public final flg D = new flg("key.swapOffhand", 70, "key.categories.inventory");
   public final flg E = new flg("key.drop", 81, "key.categories.inventory");
   public final flg F = new flg("key.use", feo.b.c, 1, "key.categories.gameplay");
   public final flg G = new flg("key.attack", feo.b.c, 0, "key.categories.gameplay");
   public final flg H = new flg("key.pickItem", feo.b.c, 2, "key.categories.gameplay");
   public final flg I = new flg("key.chat", 84, "key.categories.multiplayer");
   public final flg J = new flg("key.playerlist", 258, "key.categories.multiplayer");
   public final flg K = new flg("key.command", 47, "key.categories.multiplayer");
   public final flg L = new flg("key.socialInteractions", 80, "key.categories.multiplayer");
   public final flg M = new flg("key.screenshot", 291, "key.categories.misc");
   public final flg N = new flg("key.togglePerspective", 294, "key.categories.misc");
   public final flg O = new flg("key.smoothCamera", feo.bv.b(), "key.categories.misc");
   public final flg P = new flg("key.fullscreen", 300, "key.categories.misc");
   public final flg Q = new flg("key.spectatorOutlines", feo.bv.b(), "key.categories.misc");
   public final flg R = new flg("key.advancements", 76, "key.categories.misc");
   public final flg[] S = new flg[]{
      new flg("key.hotbar.1", 49, "key.categories.inventory"),
      new flg("key.hotbar.2", 50, "key.categories.inventory"),
      new flg("key.hotbar.3", 51, "key.categories.inventory"),
      new flg("key.hotbar.4", 52, "key.categories.inventory"),
      new flg("key.hotbar.5", 53, "key.categories.inventory"),
      new flg("key.hotbar.6", 54, "key.categories.inventory"),
      new flg("key.hotbar.7", 55, "key.categories.inventory"),
      new flg("key.hotbar.8", 56, "key.categories.inventory"),
      new flg("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final flg T = new flg("key.saveToolbarActivator", 67, "key.categories.creative");
   public final flg U = new flg("key.loadToolbarActivator", 88, "key.categories.creative");
   public final flg[] V = (flg[])ArrayUtils.addAll(
      new flg[]{
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
   protected fli W;
   private final File bT;
   public boolean X;
   private fkr bU = fkr.a;
   public String Y = "";
   public boolean Z;
   private final fll<Integer> bV = new fll<>("options.fov", fll.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wp.c("options.fov.min"));
         case 110 -> a($$0x, wp.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fll.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fli.Q().f.p());
   private static final wp bW = wp.a("options.telemetry.button.tooltip", wp.c("options.telemetry.state.minimal"), wp.c("options.telemetry.state.all"));
   private final fll<Boolean> bX = fll.a("options.telemetry.button", fll.a(bW), ($$0x, $$1x) -> {
      fli $$2x = fli.Q();
      if (!$$2x.E()) {
         return wp.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wp.c("options.telemetry.state.all") : wp.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wp bY = wp.c("options.screenEffectScale.tooltip");
   private final fll<Double> bZ = new fll<>("options.screenEffectScale", fll.a(bY), flm::b, fll.m.a, 1.0, $$0x -> {
   });
   private static final wp ca = wp.c("options.fovEffectScale.tooltip");
   private final fll<Double> cb = new fll<>(
      "options.fovEffectScale", fll.a(ca), flm::b, fll.m.a.a(ayz::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final wp cc = wp.c("options.darknessEffectScale.tooltip");
   private final fll<Double> cd = new fll<>("options.darknessEffectScale", fll.a(cc), flm::b, fll.m.a.a(ayz::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final wp ce = wp.c("options.glintSpeed.tooltip");
   private final fll<Double> cf = new fll<>("options.glintSpeed", fll.a(ce), flm::b, fll.m.a, 0.5, $$0x -> {
   });
   private static final wp cg = wp.c("options.glintStrength.tooltip");
   private final fll<Double> ch = new fll<>("options.glintStrength", fll.a(cg), flm::b, fll.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final wp ci = wp.c("options.damageTiltStrength.tooltip");
   private final fll<Double> cj = new fll<>("options.damageTiltStrength", fll.a(ci), flm::b, fll.m.a, 1.0, $$0x -> {
   });
   private final fll<Double> ck = new fll<>("options.gamma", fll.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wp.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wp.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wp.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fll.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cl = 2147483646;
   private final fll<Integer> cm = new fll<>(
      "options.guiScale", fll.a(), ($$0x, $$1x) -> $$1x == 0 ? wp.c("options.guiScale.auto") : wp.b(Integer.toString($$1x)), new fll.c(0, () -> {
         fli $$0x = fli.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fll<aqv> cn = new fll<>(
      "options.particles", fll.a(), fll.b(), new fll.e<>(Arrays.asList(aqv.values()), Codec.INT.xmap(aqv::a, aqv::b)), aqv.a, $$0x -> {
      }
   );
   private final fll<flk> co = new fll<>(
      "options.narrator",
      fll.a(),
      ($$0x, $$1x) -> (wp)(this.W.aY().a() ? $$1x.b() : wp.c("options.narrator.notavailable")),
      new fll.e<>(Arrays.asList(flk.values()), Codec.INT.xmap(flk::a, flk::a)),
      flk.a,
      $$0x -> this.W.aY().a($$0x)
   );
   public String ab = "en_us";
   private final fll<String> cp = new fll<>(
      "options.audioDevice",
      fll.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wp.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wp.b($$1x.substring(hjr.c)) : wp.b($$1x);
         }
      },
      new fll.h<>(
         () -> Stream.concat(Stream.of(""), fli.Q().ak().a().stream()).toList(),
         $$0x -> fli.Q().r() && $$0x != "" && !fli.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hju $$1x = fli.Q().ak();
         $$1x.k();
         $$1x.a(hij.a(awa.Bf, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;

   public fll<Boolean> a() {
      return this.aj;
   }

   public fll<Boolean> b() {
      return this.al;
   }

   public fll<Boolean> c() {
      return this.an;
   }

   public fll<Double> d() {
      return this.ao;
   }

   public fll<Integer> e() {
      return this.ap;
   }

   public fll<Integer> f() {
      return this.aq;
   }

   public fll<Double> g() {
      return this.as;
   }

   public fll<Integer> h() {
      return this.at;
   }

   public fll<fle> i() {
      return this.aw;
   }

   public fll<fku> j() {
      return this.ax;
   }

   public fll<fla> k() {
      return this.aB;
   }

   public fll<Boolean> l() {
      return this.aC;
   }

   public fll<flo> m() {
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

   public fll<cot> n() {
      return this.aH;
   }

   public fll<Double> o() {
      return this.aI;
   }

   public fll<Double> p() {
      return this.aJ;
   }

   public fll<Integer> q() {
      return this.aM;
   }

   public int r() {
      return this.q().c();
   }

   public fll<Double> s() {
      return this.aN;
   }

   public fll<Double> t() {
      return this.aO;
   }

   public fll<Boolean> u() {
      return this.aQ;
   }

   public fll<Boolean> v() {
      return this.aS;
   }

   public fll<Boolean> w() {
      return this.aT;
   }

   public fll<bva> x() {
      return this.aV;
   }

   public fll<Double> y() {
      return this.aW;
   }

   public fll<Double> z() {
      return this.aX;
   }

   public fll<Double> A() {
      return this.aY;
   }

   public fll<Double> B() {
      return this.aZ;
   }

   public fll<Double> C() {
      return this.ba;
   }

   public fll<Double> D() {
      return this.bc;
   }

   public fll<Integer> E() {
      return this.bd;
   }

   public fll<fkp> F() {
      return this.be;
   }

   public fll<Integer> G() {
      return this.bf;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ayz.a(Math.log10($$0) * 100.0);
   }

   public fll<Double> H() {
      return this.bg;
   }

   public fll<Boolean> I() {
      return this.bh;
   }

   public fll<Boolean> J() {
      return this.bi;
   }

   public fll<Boolean> K() {
      return this.bk;
   }

   public fll<Boolean> L() {
      return this.bl;
   }

   public fll<Boolean> M() {
      return this.bm;
   }

   public fll<Boolean> N() {
      return this.bn;
   }

   public fll<Boolean> O() {
      return this.bo;
   }

   public fll<Boolean> P() {
      return this.bp;
   }

   public fll<Boolean> Q() {
      return this.bq;
   }

   public fll<Boolean> R() {
      return this.br;
   }

   private static void aI() {
      fli $$0 = fli.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fll<Boolean> S() {
      return this.bs;
   }

   private static boolean aJ() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fll<Boolean> T() {
      return this.bt;
   }

   public fll<Boolean> U() {
      return this.bu;
   }

   public fll<Boolean> V() {
      return this.bv;
   }

   public fll<Boolean> W() {
      return this.bx;
   }

   public fll<Boolean> X() {
      return this.bz;
   }

   public fll<Boolean> Y() {
      return this.bA;
   }

   public final float a(awb $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fll<Double> b(awb $$0) {
      return Objects.requireNonNull(this.bB.get($$0));
   }

   private fll<Double> a(String $$0, awb $$1) {
      return new fll<>($$0, fll.a(), flm::b, fll.m.a, 1.0, $$1x -> fli.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fll<Boolean> Z() {
      return this.bC;
   }

   public fll<Boolean> aa() {
      return this.bF;
   }

   public fll<Boolean> ab() {
      return this.bG;
   }

   public fll<Boolean> ac() {
      return this.bH;
   }

   public fll<Boolean> ad() {
      return this.bI;
   }

   public fll<Boolean> ae() {
      return this.bJ;
   }

   public fll<Boolean> af() {
      return this.bM;
   }

   public fll<Boolean> ag() {
      return this.bN;
   }

   public fll<Boolean> ah() {
      return this.bP;
   }

   public fll<Boolean> ai() {
      return this.bQ;
   }

   public fll<Boolean> aj() {
      return this.bS;
   }

   public fll<Integer> ak() {
      return this.bV;
   }

   public fll<Boolean> al() {
      return this.bX;
   }

   public fll<Double> am() {
      return this.bZ;
   }

   public fll<Double> an() {
      return this.cb;
   }

   public fll<Double> ao() {
      return this.cd;
   }

   public fll<Double> ap() {
      return this.cf;
   }

   public fll<Double> aq() {
      return this.ch;
   }

   public fll<Double> ar() {
      return this.cj;
   }

   public fll<Double> as() {
      return this.ck;
   }

   public fll<Integer> at() {
      return this.cm;
   }

   public fll<aqv> au() {
      return this.cn;
   }

   public fll<flk> av() {
      return this.co;
   }

   public fll<String> aw() {
      return this.cp;
   }

   public void ax() {
      this.ac = false;
      this.az();
   }

   public flm(fli $$0, File $$1) {
      this.W = $$0;
      this.bT = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ap = new fll<>(
         "options.renderDistance",
         fll.a(),
         ($$0x, $$1x) -> a($$0x, wp.a("options.chunks", $$1x)),
         new fll.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fli.Q().f.p()
      );
      this.aq = new fll<>(
         "options.simulationDistance", fll.a(), ($$0x, $$1x) -> a($$0x, wp.a("options.chunks", $$1x)), new fll.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = af.m() == af.a.c;
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

   private void a(flm.b $$0) {
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

   private void a(flm.a $$0) {
      this.a((flm.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, flm::c, af::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, flm::c, af::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, hky::a, hky::a);
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

      for (flg $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(feo.a($$3));
         }
      }

      for (awb $$4 : awb.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bB.get($$4));
      }

      for (cox $$5 : cox.values()) {
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
               this.aB.a(fla.b);
            } else {
               this.aB.a(fla.a);
            }
         }

         this.a(new flm.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).u_() : null;
            }

            @Override
            public <T> void a(String $$0, fll<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> flm.ae.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     flm.ae.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? flm.a($$2) : $$1;
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
               } else if (flm.a($$2)) {
                  return 1.0F;
               } else if (flm.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     flm.ae.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         flg.d();
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
         this.a(new flm.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fll<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> flm.ae.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(flm.af.toJson($$2));
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

      for (cox $$1 : this.aU) {
         $$0 |= $$1.a();
      }

      return new aqo(this.ab, this.ap.c(), this.aH.c(), this.bn.c(), $$0, this.aV.c(), this.W.aT(), this.bz.c(), this.cn.c());
   }

   public void aB() {
      if (this.W.t != null) {
         this.W.t.j.a(this.aA());
      }
   }

   public void a(cox $$0, boolean $$1) {
      if ($$1) {
         this.aU.add($$0);
      } else {
         this.aU.remove($$0);
      }
   }

   public boolean a(cox $$0) {
      return this.aU.contains($$0);
   }

   public fku aC() {
      return this.aH() >= 4 ? this.ax.c() : fku.a;
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

   public fkr aE() {
      return this.bU;
   }

   public void a(fkr $$0) {
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
      this.a(new flm.b() {
         @Override
         public <T> void a(String $$0x, fll<T> $$1) {
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

   interface a extends flm.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fll<T> var2);
   }
}
