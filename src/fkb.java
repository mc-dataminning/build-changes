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

public class fkb {
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
   private static final xl ai = xl.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fka<Boolean> aj = fka.a("options.darkMojangStudiosBackgroundColor", fka.a(ai), false);
   private static final xl ak = xl.c("options.hideLightningFlashes.tooltip");
   private final fka<Boolean> al = fka.a("options.hideLightningFlashes", fka.a(ak), false);
   private static final xl am = xl.c("options.hideSplashTexts.tooltip");
   private final fka<Boolean> an = fka.a("options.hideSplashTexts", fka.a(am), false);
   private final fka<Double> ao = new fka<>("options.sensitivity", fka.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xl.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xl.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fka.m.a, 0.5, $$0x -> {
   });
   private final fka<Integer> ap;
   private final fka<Integer> aq;
   private int ar = 0;
   private final fka<Double> as = new fka<>(
      "options.entityDistanceScaling",
      fka.a(),
      fkb::a,
      new fka.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fka<Integer> at = new fka<>(
      "options.framerateLimit",
      fka.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xl.c("options.framerateLimit.max")) : a($$0x, xl.a("options.framerate", $$1x)),
      new fka.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fjx.Q().aP().a($$0x)
   );
   private static final xl au = xl.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final xl av = xl.c("options.inactivityFpsLimit.afk.tooltip");
   private final fka<fjt> aw = new fka<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> fnh.a(au);
         case b -> fnh.a(av);
      };
   }, fka.b(), new fka.e<>(Arrays.asList(fjt.values()), fjt.c), fjt.b, $$0x -> {
   });
   private final fka<fjj> ax = new fka<>(
      "options.renderClouds",
      fka.a(),
      fka.b(),
      new fka.e<>(Arrays.asList(fjj.values()), Codec.withAlternative(fjj.d, Codec.BOOL, $$0x -> $$0x ? fjj.c : fjj.a)),
      fjj.c,
      $$0x -> {
      }
   );
   private static final xl ay = xl.c("options.graphics.fast.tooltip");
   private static final xl az = xl.a("options.graphics.fabulous.tooltip", xl.c("options.graphics.fabulous").a(n.u));
   private static final xl aA = xl.c("options.graphics.fancy.tooltip");
   private final fka<fjp> aB = new fka<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fnh.a(aA);
            case a -> fnh.a(ay);
            case c -> fnh.a(az);
         };
      },
      ($$0x, $$1x) -> {
         xz $$2x = xl.c($$1x.a());
         return $$1x == fjp.c ? $$2x.a(n.u) : $$2x;
      },
      new fka.a<>(
         Arrays.asList(fjp.values()),
         Stream.of(fjp.values()).filter($$0x -> $$0x != fjp.c).collect(Collectors.toList()),
         () -> fjx.Q().r() && fjx.Q().aj().h(),
         ($$0x, $$1x) -> {
            fjx $$2x = fjx.Q();
            gio $$3 = $$2x.aj();
            if ($$1x == fjp.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.e();
            }
         },
         Codec.INT.xmap(fjp::a, fjp::b)
      ),
      fjp.b,
      $$0x -> {
      }
   );
   private final fka<Boolean> aC = fka.a("options.ao", true, $$0x -> fjx.Q().f.e());
   private static final xl aD = xl.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xl aE = xl.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xl aF = xl.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fka<fkd> aG = new fka<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fnh.a(aD);
         case b -> fnh.a(aE);
         case c -> fnh.a(aF);
      };
   }, fka.b(), new fka.e<>(Arrays.asList(fkd.values()), Codec.INT.xmap(fkd::a, fkd::b)), fkd.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fka<coo> aH = new fka<>(
      "options.chat.visibility", fka.a(), fka.b(), new fka.e<>(Arrays.asList(coo.values()), Codec.INT.xmap(coo::a, coo::b)), coo.a, $$0x -> {
      }
   );
   private final fka<Double> aI = new fka<>("options.chat.opacity", fka.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fka.m.a, 1.0, $$0x -> fjx.Q().m.d().b());
   private final fka<Double> aJ = new fka<>("options.chat.line_spacing", fka.a(), fkb::a, fka.m.a, 0.0, $$0x -> {
   });
   private static final xl aK = xl.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aL = 5;
   private final fka<Integer> aM = new fka<>("options.accessibility.menu_background_blurriness", fka.a(aK), fkb::b, new fka.f(0, 10), 5, $$0x -> {
   });
   private final fka<Double> aN = new fka<>("options.accessibility.text_background_opacity", fka.a(), fkb::a, fka.m.a, 0.5, $$0x -> fjx.Q().m.d().b());
   private final fka<Double> aO = new fka<>("options.accessibility.panorama_speed", fka.a(), fkb::a, fka.m.a, 1.0, $$0x -> {
   });
   private static final xl aP = xl.c("options.accessibility.high_contrast.tooltip");
   private final fka<Boolean> aQ = fka.a("options.accessibility.high_contrast", fka.a(aP), false, $$0x -> {
      auo $$1x = fjx.Q().ad();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final fka<Boolean> aR = fka.a(
      "options.accessibility.narrator_hotkey",
      fka.a(fjx.a ? xl.c("options.accessibility.narrator_hotkey.mac.tooltip") : xl.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cos> aS = EnumSet.allOf(cos.class);
   private final fka<buy> aT = new fka<>("options.mainHand", fka.a(), fka.b(), new fka.e<>(Arrays.asList(buy.values()), buy.c), buy.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fka<Double> aU = new fka<>(
      "options.chat.scale",
      fka.a(),
      ($$0x, $$1x) -> (xl)($$1x == 0.0 ? xk.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fka.m.a,
      1.0,
      $$0x -> fjx.Q().m.d().b()
   );
   private final fka<Double> aV = new fka<>("options.chat.width", fka.a(), ($$0x, $$1x) -> c($$0x, flx.a($$1x)), fka.m.a, 1.0, $$0x -> fjx.Q().m.d().b());
   private final fka<Double> aW = new fka<>(
      "options.chat.height.unfocused", fka.a(), ($$0x, $$1x) -> c($$0x, flx.b($$1x)), fka.m.a, flx.i(), $$0x -> fjx.Q().m.d().b()
   );
   private final fka<Double> aX = new fka<>(
      "options.chat.height.focused", fka.a(), ($$0x, $$1x) -> c($$0x, flx.b($$1x)), fka.m.a, 1.0, $$0x -> fjx.Q().m.d().b()
   );
   private final fka<Double> aY = new fka<>(
      "options.chat.delay_instant",
      fka.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xl.c("options.chat.delay_none") : xl.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fka.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fjx.Q().ba().a($$0x)
   );
   private static final xl aZ = xl.c("options.notifications.display_time.tooltip");
   private final fka<Double> ba = new fka<>(
      "options.notifications.display_time",
      fka.a(aZ),
      ($$0x, $$1x) -> a($$0x, xl.a("options.multiplier", $$1x)),
      new fka.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fka<Integer> bb = new fka<>(
      "options.mipmapLevels", fka.a(), ($$0x, $$1x) -> (xl)($$1x == 0 ? xk.a($$0x, false) : a($$0x, $$1x.intValue())), new fka.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fka<fjf> bc = new fka<>(
      "options.attackIndicator", fka.a(), fka.b(), new fka.e<>(Arrays.asList(fjf.values()), Codec.INT.xmap(fjf::a, fjf::b)), fjf.b, $$0x -> {
      }
   );
   public hez r = hez.a;
   public boolean s = false;
   private final fka<Integer> bd = new fka<>("options.biomeBlendRadius", fka.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xl.c("options.biomeBlendRadius." + $$2x));
   }, new fka.f(0, 7, false), 2, $$0x -> fjx.Q().f.e());
   private final fka<Double> be = new fka<>(
      "options.mouseWheelSensitivity",
      fka.a(),
      ($$0x, $$1x) -> a($$0x, xl.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fka.f(-200, 100).a(fkb::c, fkb::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fka<Boolean> bf = fka.a("options.rawMouseInput", true, $$0x -> {
      fdn $$1x = fjx.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fka<Boolean> bg = fka.a("options.autoJump", false);
   private static final xl bh = xl.c("options.rotateWithMinecart.tooltip");
   private final fka<Boolean> bi = fka.a("options.rotateWithMinecart", fka.a(bh), false);
   private final fka<Boolean> bj = fka.a("options.operatorItemsTab", false);
   private final fka<Boolean> bk = fka.a("options.autoSuggestCommands", true);
   private final fka<Boolean> bl = fka.a("options.chat.color", true);
   private final fka<Boolean> bm = fka.a("options.chat.links", true);
   private final fka<Boolean> bn = fka.a("options.chat.links.prompt", true);
   private final fka<Boolean> bo = fka.a("options.vsync", true, $$0x -> {
      if (fjx.Q().aO() != null) {
         fjx.Q().aO().a($$0x);
      }
   });
   private final fka<Boolean> bp = fka.a("options.entityShadows", true);
   private final fka<Boolean> bq = fka.a("options.forceUnicodeFont", false, $$0x -> aH());
   private final fka<Boolean> br = fka.a("options.japaneseGlyphVariants", fka.a(xl.c("options.japaneseGlyphVariants.tooltip")), aI(), $$0x -> aH());
   private final fka<Boolean> bs = fka.a("options.invertMouse", false);
   private final fka<Boolean> bt = fka.a("options.discrete_mouse_scroll", false);
   private static final xl bu = xl.c("options.realmsNotifications.tooltip");
   private final fka<Boolean> bv = fka.a("options.realmsNotifications", fka.a(bu), true);
   private static final xl bw = xl.c("options.allowServerListing.tooltip");
   private final fka<Boolean> bx = fka.a("options.allowServerListing", fka.a(bw), true, $$0x -> {
   });
   private final fka<Boolean> by = fka.a("options.reducedDebugInfo", false);
   private final Map<awp, fka<Double>> bz = ae.a(new EnumMap<>(awp.class), $$0x -> {
      for (awp $$1x : awp.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fka<Boolean> bA = fka.a("options.showSubtitles", false);
   private static final xl bB = xl.c("options.directionalAudio.on.tooltip");
   private static final xl bC = xl.c("options.directionalAudio.off.tooltip");
   private final fka<Boolean> bD = fka.a("options.directionalAudio", $$0x -> $$0x ? fnh.a(bB) : fnh.a(bC), false, $$0x -> {
      hdv $$1x = fjx.Q().ak();
      $$1x.k();
      $$1x.a(hcl.a(awo.Av, 1.0F));
   });
   private final fka<Boolean> bE = new fka<>(
      "options.accessibility.text_background",
      fka.a(),
      ($$0x, $$1x) -> $$1x ? xl.c("options.accessibility.text_background.chat") : xl.c("options.accessibility.text_background.everywhere"),
      fka.a,
      true,
      $$0x -> {
      }
   );
   private final fka<Boolean> bF = fka.a("options.touchscreen", false);
   private final fka<Boolean> bG = fka.a("options.fullscreen", false, $$0x -> {
      fjx $$1x = fjx.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ac().a($$1x.aO().i());
      }
   });
   private final fka<Boolean> bH = fka.a("options.viewBobbing", true);
   private static final xl bI = xl.c("options.key.toggle");
   private static final xl bJ = xl.c("options.key.hold");
   private final fka<Boolean> bK = new fka<>("key.sneak", fka.a(), ($$0x, $$1x) -> $$1x ? bI : bJ, fka.a, false, $$0x -> {
   });
   private final fka<Boolean> bL = new fka<>("key.sprint", fka.a(), ($$0x, $$1x) -> $$1x ? bI : bJ, fka.a, false, $$0x -> {
   });
   public boolean u;
   private static final xl bM = xl.c("options.hideMatchedNames.tooltip");
   private final fka<Boolean> bN = fka.a("options.hideMatchedNames", fka.a(bM), true);
   private final fka<Boolean> bO = fka.a("options.autosaveIndicator", true);
   private static final xl bP = xl.c("options.onlyShowSecureChat.tooltip");
   private final fka<Boolean> bQ = fka.a("options.onlyShowSecureChat", fka.a(bP), false);
   public final fjv v = new fjv("key.forward", 87, "key.categories.movement");
   public final fjv w = new fjv("key.left", 65, "key.categories.movement");
   public final fjv x = new fjv("key.back", 83, "key.categories.movement");
   public final fjv y = new fjv("key.right", 68, "key.categories.movement");
   public final fjv z = new fjv("key.jump", 32, "key.categories.movement");
   public final fjv A = new fkj("key.sneak", 340, "key.categories.movement", this.bK::c);
   public final fjv B = new fkj("key.sprint", 341, "key.categories.movement", this.bL::c);
   public final fjv C = new fjv("key.inventory", 69, "key.categories.inventory");
   public final fjv D = new fjv("key.swapOffhand", 70, "key.categories.inventory");
   public final fjv E = new fjv("key.drop", 81, "key.categories.inventory");
   public final fjv F = new fjv("key.use", fdf.b.c, 1, "key.categories.gameplay");
   public final fjv G = new fjv("key.attack", fdf.b.c, 0, "key.categories.gameplay");
   public final fjv H = new fjv("key.pickItem", fdf.b.c, 2, "key.categories.gameplay");
   public final fjv I = new fjv("key.chat", 84, "key.categories.multiplayer");
   public final fjv J = new fjv("key.playerlist", 258, "key.categories.multiplayer");
   public final fjv K = new fjv("key.command", 47, "key.categories.multiplayer");
   public final fjv L = new fjv("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fjv M = new fjv("key.screenshot", 291, "key.categories.misc");
   public final fjv N = new fjv("key.togglePerspective", 294, "key.categories.misc");
   public final fjv O = new fjv("key.smoothCamera", fdf.bv.b(), "key.categories.misc");
   public final fjv P = new fjv("key.fullscreen", 300, "key.categories.misc");
   public final fjv Q = new fjv("key.spectatorOutlines", fdf.bv.b(), "key.categories.misc");
   public final fjv R = new fjv("key.advancements", 76, "key.categories.misc");
   public final fjv[] S = new fjv[]{
      new fjv("key.hotbar.1", 49, "key.categories.inventory"),
      new fjv("key.hotbar.2", 50, "key.categories.inventory"),
      new fjv("key.hotbar.3", 51, "key.categories.inventory"),
      new fjv("key.hotbar.4", 52, "key.categories.inventory"),
      new fjv("key.hotbar.5", 53, "key.categories.inventory"),
      new fjv("key.hotbar.6", 54, "key.categories.inventory"),
      new fjv("key.hotbar.7", 55, "key.categories.inventory"),
      new fjv("key.hotbar.8", 56, "key.categories.inventory"),
      new fjv("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fjv T = new fjv("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fjv U = new fjv("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fjv[] V = (fjv[])ArrayUtils.addAll(
      new fjv[]{
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
   protected fjx W;
   private final File bR;
   public boolean X;
   private fjh bS = fjh.a;
   public String Y = "";
   public boolean Z;
   private final fka<Integer> bT = new fka<>("options.fov", fka.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xl.c("options.fov.min"));
         case 110 -> a($$0x, xl.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fka.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fjx.Q().f.p());
   private static final xl bU = xl.a("options.telemetry.button.tooltip", xl.c("options.telemetry.state.minimal"), xl.c("options.telemetry.state.all"));
   private final fka<Boolean> bV = fka.a("options.telemetry.button", fka.a(bU), ($$0x, $$1x) -> {
      fjx $$2x = fjx.Q();
      if (!$$2x.E()) {
         return xl.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xl.c("options.telemetry.state.all") : xl.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xl bW = xl.c("options.screenEffectScale.tooltip");
   private final fka<Double> bX = new fka<>("options.screenEffectScale", fka.a(bW), fkb::b, fka.m.a, 1.0, $$0x -> {
   });
   private static final xl bY = xl.c("options.fovEffectScale.tooltip");
   private final fka<Double> bZ = new fka<>(
      "options.fovEffectScale", fka.a(bY), fkb::b, fka.m.a.a(azn::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final xl ca = xl.c("options.darknessEffectScale.tooltip");
   private final fka<Double> cb = new fka<>("options.darknessEffectScale", fka.a(ca), fkb::b, fka.m.a.a(azn::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final xl cc = xl.c("options.glintSpeed.tooltip");
   private final fka<Double> cd = new fka<>("options.glintSpeed", fka.a(cc), fkb::b, fka.m.a, 0.5, $$0x -> {
   });
   private static final xl ce = xl.c("options.glintStrength.tooltip");
   private final fka<Double> cf = new fka<>("options.glintStrength", fka.a(ce), fkb::b, fka.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final xl cg = xl.c("options.damageTiltStrength.tooltip");
   private final fka<Double> ch = new fka<>("options.damageTiltStrength", fka.a(cg), fkb::b, fka.m.a, 1.0, $$0x -> {
   });
   private final fka<Double> ci = new fka<>("options.gamma", fka.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xl.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xl.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xl.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fka.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cj = 2147483646;
   private final fka<Integer> ck = new fka<>(
      "options.guiScale", fka.a(), ($$0x, $$1x) -> $$1x == 0 ? xl.c("options.guiScale.auto") : xl.b(Integer.toString($$1x)), new fka.c(0, () -> {
         fjx $$0x = fjx.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fka<arj> cl = new fka<>(
      "options.particles", fka.a(), fka.b(), new fka.e<>(Arrays.asList(arj.values()), Codec.INT.xmap(arj::a, arj::b)), arj.a, $$0x -> {
      }
   );
   private final fka<fjz> cm = new fka<>(
      "options.narrator",
      fka.a(),
      ($$0x, $$1x) -> (xl)(this.W.aZ().a() ? $$1x.b() : xl.c("options.narrator.notavailable")),
      new fka.e<>(Arrays.asList(fjz.values()), Codec.INT.xmap(fjz::a, fjz::a)),
      fjz.a,
      $$0x -> this.W.aZ().a($$0x)
   );
   public String ab = "en_us";
   private final fka<String> cn = new fka<>(
      "options.audioDevice",
      fka.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xl.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xl.b($$1x.substring(hds.c)) : xl.b($$1x);
         }
      },
      new fka.h<>(
         () -> Stream.concat(Stream.of(""), fjx.Q().ak().a().stream()).toList(),
         $$0x -> fjx.Q().r() && $$0x != "" && !fjx.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hdv $$1x = fjx.Q().ak();
         $$1x.k();
         $$1x.a(hcl.a(awo.Av, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;

   public fka<Boolean> a() {
      return this.aj;
   }

   public fka<Boolean> b() {
      return this.al;
   }

   public fka<Boolean> c() {
      return this.an;
   }

   public fka<Double> d() {
      return this.ao;
   }

   public fka<Integer> e() {
      return this.ap;
   }

   public fka<Integer> f() {
      return this.aq;
   }

   public fka<Double> g() {
      return this.as;
   }

   public fka<Integer> h() {
      return this.at;
   }

   public fka<fjt> i() {
      return this.aw;
   }

   public fka<fjj> j() {
      return this.ax;
   }

   public fka<fjp> k() {
      return this.aB;
   }

   public fka<Boolean> l() {
      return this.aC;
   }

   public fka<fkd> m() {
      return this.aG;
   }

   public void a(auo $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (aul $$2 : $$0.g()) {
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

   public fka<coo> n() {
      return this.aH;
   }

   public fka<Double> o() {
      return this.aI;
   }

   public fka<Double> p() {
      return this.aJ;
   }

   public fka<Integer> q() {
      return this.aM;
   }

   public int r() {
      return this.q().c();
   }

   public fka<Double> s() {
      return this.aN;
   }

   public fka<Double> t() {
      return this.aO;
   }

   public fka<Boolean> u() {
      return this.aQ;
   }

   public fka<Boolean> v() {
      return this.aR;
   }

   public fka<buy> w() {
      return this.aT;
   }

   public fka<Double> x() {
      return this.aU;
   }

   public fka<Double> y() {
      return this.aV;
   }

   public fka<Double> z() {
      return this.aW;
   }

   public fka<Double> A() {
      return this.aX;
   }

   public fka<Double> B() {
      return this.aY;
   }

   public fka<Double> C() {
      return this.ba;
   }

   public fka<Integer> D() {
      return this.bb;
   }

   public fka<fjf> E() {
      return this.bc;
   }

   public fka<Integer> F() {
      return this.bd;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return azn.a(Math.log10($$0) * 100.0);
   }

   public fka<Double> G() {
      return this.be;
   }

   public fka<Boolean> H() {
      return this.bf;
   }

   public fka<Boolean> I() {
      return this.bg;
   }

   public fka<Boolean> J() {
      return this.bi;
   }

   public fka<Boolean> K() {
      return this.bj;
   }

   public fka<Boolean> L() {
      return this.bk;
   }

   public fka<Boolean> M() {
      return this.bl;
   }

   public fka<Boolean> N() {
      return this.bm;
   }

   public fka<Boolean> O() {
      return this.bn;
   }

   public fka<Boolean> P() {
      return this.bo;
   }

   public fka<Boolean> Q() {
      return this.bp;
   }

   private static void aH() {
      fjx $$0 = fjx.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fka<Boolean> R() {
      return this.bq;
   }

   private static boolean aI() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fka<Boolean> S() {
      return this.br;
   }

   public fka<Boolean> T() {
      return this.bs;
   }

   public fka<Boolean> U() {
      return this.bt;
   }

   public fka<Boolean> V() {
      return this.bv;
   }

   public fka<Boolean> W() {
      return this.bx;
   }

   public fka<Boolean> X() {
      return this.by;
   }

   public final float a(awp $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fka<Double> b(awp $$0) {
      return Objects.requireNonNull(this.bz.get($$0));
   }

   private fka<Double> a(String $$0, awp $$1) {
      return new fka<>($$0, fka.a(), fkb::b, fka.m.a, 1.0, $$1x -> fjx.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fka<Boolean> Y() {
      return this.bA;
   }

   public fka<Boolean> Z() {
      return this.bD;
   }

   public fka<Boolean> aa() {
      return this.bE;
   }

   public fka<Boolean> ab() {
      return this.bF;
   }

   public fka<Boolean> ac() {
      return this.bG;
   }

   public fka<Boolean> ad() {
      return this.bH;
   }

   public fka<Boolean> ae() {
      return this.bK;
   }

   public fka<Boolean> af() {
      return this.bL;
   }

   public fka<Boolean> ag() {
      return this.bN;
   }

   public fka<Boolean> ah() {
      return this.bO;
   }

   public fka<Boolean> ai() {
      return this.bQ;
   }

   public fka<Integer> aj() {
      return this.bT;
   }

   public fka<Boolean> ak() {
      return this.bV;
   }

   public fka<Double> al() {
      return this.bX;
   }

   public fka<Double> am() {
      return this.bZ;
   }

   public fka<Double> an() {
      return this.cb;
   }

   public fka<Double> ao() {
      return this.cd;
   }

   public fka<Double> ap() {
      return this.cf;
   }

   public fka<Double> aq() {
      return this.ch;
   }

   public fka<Double> ar() {
      return this.ci;
   }

   public fka<Integer> as() {
      return this.ck;
   }

   public fka<arj> at() {
      return this.cl;
   }

   public fka<fjz> au() {
      return this.cm;
   }

   public fka<String> av() {
      return this.cn;
   }

   public void aw() {
      this.ac = false;
      this.ay();
   }

   public fkb(fjx $$0, File $$1) {
      this.W = $$0;
      this.bR = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ap = new fka<>(
         "options.renderDistance",
         fka.a(),
         ($$0x, $$1x) -> a($$0x, xl.a("options.chunks", $$1x)),
         new fka.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fjx.Q().f.p()
      );
      this.aq = new fka<>(
         "options.simulationDistance", fka.a(), ($$0x, $$1x) -> a($$0x, xl.a("options.chunks", $$1x)), new fka.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = ae.m() == ae.a.c;
      this.ax();
   }

   public float a(float $$0) {
      return this.bE.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return axy.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bE.c() ? $$0 : axy.a(this.aN.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(fkb.b $$0) {
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

   private void a(fkb.a $$0) {
      this.a((fkb.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, fkb::c, af::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fkb::c, af::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, hez::a, hez::a);
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

      for (fjv $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fdf.a($$3));
         }
      }

      for (awp $$4 : awp.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bz.get($$4));
      }

      for (cos $$5 : cos.values()) {
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

         un $$0 = new un();

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

         final un $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(fjp.b);
            } else {
               this.aB.a(fjp.a);
            }
         }

         this.a(new fkb.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).s_() : null;
            }

            @Override
            public <T> void a(String $$0, fka<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fkb.ae.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fkb.ae.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fkb.a($$2) : $$1;
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
               } else if (fkb.a($$2)) {
                  return 1.0F;
               } else if (fkb.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fkb.ae.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fjv.d();
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

   private un a(un $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return bax.e.a(this.W.au(), $$0, $$1);
   }

   public void ay() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bR), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fkb.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fka<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> fkb.ae.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(fkb.af.toJson($$2));
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

      this.aA();
   }

   public arc az() {
      int $$0 = 0;

      for (cos $$1 : this.aS) {
         $$0 |= $$1.a();
      }

      return new arc(this.ab, this.ap.c(), this.aH.c(), this.bl.c(), $$0, this.aT.c(), this.W.aU(), this.bx.c(), this.cl.c());
   }

   public void aA() {
      if (this.W.t != null) {
         this.W.t.j.a(this.az());
      }
   }

   public void a(cos $$0, boolean $$1) {
      if ($$1) {
         this.aS.add($$0);
      } else {
         this.aS.remove($$0);
      }
   }

   public boolean a(cos $$0) {
      return this.aS.contains($$0);
   }

   public fjj aB() {
      return this.aG() >= 4 ? this.ax.c() : fjj.a;
   }

   public boolean aC() {
      return this.q;
   }

   public void b(auo $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         aul $$4 = $$0.c($$3);
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

   public fjh aD() {
      return this.bS;
   }

   public void a(fjh $$0) {
      this.bS = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = azd.a(af, $$0, ag);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aE() {
      return this.bR;
   }

   public String aF() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fkb.b() {
         @Override
         public <T> void a(String $$0x, fka<T> $$1) {
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

   private static xl c(xl $$0, int $$1) {
      return xl.a("options.pixel_value", $$0, $$1);
   }

   private static xl a(xl $$0, double $$1) {
      return xl.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static xl a(xl $$0, xl $$1) {
      return xl.a("options.generic_value", $$0, $$1);
   }

   public static xl a(xl $$0, int $$1) {
      return a($$0, xl.b(Integer.toString($$1)));
   }

   public static xl b(xl $$0, int $$1) {
      return $$1 == 0 ? a($$0, xk.c) : a($$0, $$1);
   }

   private static xl b(xl $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, xk.c) : a($$0, $$1);
   }

   interface a extends fkb.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fka<T> var2);
   }
}
