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

public class fmd {
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
   private static final xk ai = xk.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fmc<Boolean> aj = fmc.a("options.darkMojangStudiosBackgroundColor", fmc.a(ai), false);
   private static final xk ak = xk.c("options.hideLightningFlashes.tooltip");
   private final fmc<Boolean> al = fmc.a("options.hideLightningFlashes", fmc.a(ak), false);
   private static final xk am = xk.c("options.hideSplashTexts.tooltip");
   private final fmc<Boolean> an = fmc.a("options.hideSplashTexts", fmc.a(am), false);
   private final fmc<Double> ao = new fmc<>("options.sensitivity", fmc.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xk.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xk.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fmc.m.a, 0.5, $$0x -> {
   });
   private final fmc<Integer> ap;
   private final fmc<Integer> aq;
   private int ar = 0;
   private final fmc<Double> as = new fmc<>(
      "options.entityDistanceScaling",
      fmc.a(),
      fmd::a,
      new fmc.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fmc<Integer> at = new fmc<>(
      "options.framerateLimit",
      fmc.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xk.c("options.framerateLimit.max")) : a($$0x, xk.a("options.framerate", $$1x)),
      new fmc.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> flz.Q().aP().a($$0x)
   );
   private static final xk au = xk.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final xk av = xk.c("options.inactivityFpsLimit.afk.tooltip");
   private final fmc<flv> aw = new fmc<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> fpk.a(au);
         case b -> fpk.a(av);
      };
   }, fmc.b(), new fmc.e<>(Arrays.asList(flv.values()), flv.c), flv.b, $$0x -> {
   });
   private final fmc<fll> ax = new fmc<>(
      "options.renderClouds",
      fmc.a(),
      fmc.b(),
      new fmc.e<>(Arrays.asList(fll.values()), Codec.withAlternative(fll.d, Codec.BOOL, $$0x -> $$0x ? fll.c : fll.a)),
      fll.c,
      $$0x -> {
      }
   );
   private static final xk ay = xk.c("options.graphics.fast.tooltip");
   private static final xk az = xk.a("options.graphics.fabulous.tooltip", xk.c("options.graphics.fabulous").a(n.u));
   private static final xk aA = xk.c("options.graphics.fancy.tooltip");
   private final fmc<flr> aB = new fmc<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fpk.a(aA);
            case a -> fpk.a(ay);
            case c -> fpk.a(az);
         };
      },
      ($$0x, $$1x) -> {
         xy $$2x = xk.c($$1x.a());
         return $$1x == flr.c ? $$2x.a(n.u) : $$2x;
      },
      new fmc.a<>(
         Arrays.asList(flr.values()),
         Stream.of(flr.values()).filter($$0x -> $$0x != flr.c).collect(Collectors.toList()),
         () -> flz.Q().r() && flz.Q().aj().h(),
         ($$0x, $$1x) -> {
            flz $$2x = flz.Q();
            gkx $$3 = $$2x.aj();
            if ($$1x == flr.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.e();
            }
         },
         Codec.INT.xmap(flr::a, flr::b)
      ),
      flr.b,
      $$0x -> {
      }
   );
   private final fmc<Boolean> aC = fmc.a("options.ao", true, $$0x -> flz.Q().f.e());
   private static final xk aD = xk.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xk aE = xk.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xk aF = xk.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fmc<fmf> aG = new fmc<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fpk.a(aD);
         case b -> fpk.a(aE);
         case c -> fpk.a(aF);
      };
   }, fmc.b(), new fmc.e<>(Arrays.asList(fmf.values()), Codec.INT.xmap(fmf::a, fmf::b)), fmf.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fmc<cpl> aH = new fmc<>(
      "options.chat.visibility", fmc.a(), fmc.b(), new fmc.e<>(Arrays.asList(cpl.values()), Codec.INT.xmap(cpl::a, cpl::b)), cpl.a, $$0x -> {
      }
   );
   private final fmc<Double> aI = new fmc<>("options.chat.opacity", fmc.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fmc.m.a, 1.0, $$0x -> flz.Q().m.d().b());
   private final fmc<Double> aJ = new fmc<>("options.chat.line_spacing", fmc.a(), fmd::a, fmc.m.a, 0.0, $$0x -> {
   });
   private static final xk aK = xk.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aL = 5;
   private final fmc<Integer> aM = new fmc<>("options.accessibility.menu_background_blurriness", fmc.a(aK), fmd::b, new fmc.f(0, 10), 5, $$0x -> {
   });
   private final fmc<Double> aN = new fmc<>("options.accessibility.text_background_opacity", fmc.a(), fmd::a, fmc.m.a, 0.5, $$0x -> flz.Q().m.d().b());
   private final fmc<Double> aO = new fmc<>("options.accessibility.panorama_speed", fmc.a(), fmd::a, fmc.m.a, 1.0, $$0x -> {
   });
   private static final xk aP = xk.c("options.accessibility.high_contrast.tooltip");
   private final fmc<Boolean> aQ = fmc.a("options.accessibility.high_contrast", fmc.a(aP), false, $$0x -> {
      auv $$1x = flz.Q().ad();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private static final xk aR = xk.c("options.accessibility.high_contrast_block_outline.tooltip");
   private final fmc<Boolean> aS = fmc.a("options.accessibility.high_contrast_block_outline", fmc.a(aR), false);
   private final fmc<Boolean> aT = fmc.a(
      "options.accessibility.narrator_hotkey",
      fmc.a(flz.a ? xk.c("options.accessibility.narrator_hotkey.mac.tooltip") : xk.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cpp> aU = EnumSet.allOf(cpp.class);
   private final fmc<bvr> aV = new fmc<>("options.mainHand", fmc.a(), fmc.b(), new fmc.e<>(Arrays.asList(bvr.values()), bvr.c), bvr.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fmc<Double> aW = new fmc<>(
      "options.chat.scale",
      fmc.a(),
      ($$0x, $$1x) -> (xk)($$1x == 0.0 ? xj.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fmc.m.a,
      1.0,
      $$0x -> flz.Q().m.d().b()
   );
   private final fmc<Double> aX = new fmc<>("options.chat.width", fmc.a(), ($$0x, $$1x) -> c($$0x, fnz.a($$1x)), fmc.m.a, 1.0, $$0x -> flz.Q().m.d().b());
   private final fmc<Double> aY = new fmc<>(
      "options.chat.height.unfocused", fmc.a(), ($$0x, $$1x) -> c($$0x, fnz.b($$1x)), fmc.m.a, fnz.i(), $$0x -> flz.Q().m.d().b()
   );
   private final fmc<Double> aZ = new fmc<>(
      "options.chat.height.focused", fmc.a(), ($$0x, $$1x) -> c($$0x, fnz.b($$1x)), fmc.m.a, 1.0, $$0x -> flz.Q().m.d().b()
   );
   private final fmc<Double> ba = new fmc<>(
      "options.chat.delay_instant",
      fmc.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xk.c("options.chat.delay_none") : xk.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fmc.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> flz.Q().ba().a($$0x)
   );
   private static final xk bb = xk.c("options.notifications.display_time.tooltip");
   private final fmc<Double> bc = new fmc<>(
      "options.notifications.display_time",
      fmc.a(bb),
      ($$0x, $$1x) -> a($$0x, xk.a("options.multiplier", $$1x)),
      new fmc.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fmc<Integer> bd = new fmc<>(
      "options.mipmapLevels", fmc.a(), ($$0x, $$1x) -> (xk)($$1x == 0 ? xj.a($$0x, false) : a($$0x, $$1x.intValue())), new fmc.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fmc<flh> be = new fmc<>(
      "options.attackIndicator", fmc.a(), fmc.b(), new fmc.e<>(Arrays.asList(flh.values()), Codec.INT.xmap(flh::a, flh::b)), flh.b, $$0x -> {
      }
   );
   public hhn r = hhn.a;
   public boolean s = false;
   private final fmc<Integer> bf = new fmc<>("options.biomeBlendRadius", fmc.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xk.c("options.biomeBlendRadius." + $$2x));
   }, new fmc.f(0, 7, false), 2, $$0x -> flz.Q().f.e());
   private final fmc<Double> bg = new fmc<>(
      "options.mouseWheelSensitivity",
      fmc.a(),
      ($$0x, $$1x) -> a($$0x, xk.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fmc.f(-200, 100).a(fmd::c, fmd::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fmc<Boolean> bh = fmc.a("options.rawMouseInput", true, $$0x -> {
      ffo $$1x = flz.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fmc<Boolean> bi = fmc.a("options.autoJump", false);
   private static final xk bj = xk.c("options.rotateWithMinecart.tooltip");
   private final fmc<Boolean> bk = fmc.a("options.rotateWithMinecart", fmc.a(bj), false);
   private final fmc<Boolean> bl = fmc.a("options.operatorItemsTab", false);
   private final fmc<Boolean> bm = fmc.a("options.autoSuggestCommands", true);
   private final fmc<Boolean> bn = fmc.a("options.chat.color", true);
   private final fmc<Boolean> bo = fmc.a("options.chat.links", true);
   private final fmc<Boolean> bp = fmc.a("options.chat.links.prompt", true);
   private final fmc<Boolean> bq = fmc.a("options.vsync", true, $$0x -> {
      if (flz.Q().aO() != null) {
         flz.Q().aO().a($$0x);
      }
   });
   private final fmc<Boolean> br = fmc.a("options.entityShadows", true);
   private final fmc<Boolean> bs = fmc.a("options.forceUnicodeFont", false, $$0x -> aI());
   private final fmc<Boolean> bt = fmc.a("options.japaneseGlyphVariants", fmc.a(xk.c("options.japaneseGlyphVariants.tooltip")), aJ(), $$0x -> aI());
   private final fmc<Boolean> bu = fmc.a("options.invertMouse", false);
   private final fmc<Boolean> bv = fmc.a("options.discrete_mouse_scroll", false);
   private static final xk bw = xk.c("options.realmsNotifications.tooltip");
   private final fmc<Boolean> bx = fmc.a("options.realmsNotifications", fmc.a(bw), true);
   private static final xk by = xk.c("options.allowServerListing.tooltip");
   private final fmc<Boolean> bz = fmc.a("options.allowServerListing", fmc.a(by), true, $$0x -> {
   });
   private final fmc<Boolean> bA = fmc.a("options.reducedDebugInfo", false);
   private final Map<aww, fmc<Double>> bB = ae.a(new EnumMap<>(aww.class), $$0x -> {
      for (aww $$1x : aww.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fmc<Boolean> bC = fmc.a("options.showSubtitles", false);
   private static final xk bD = xk.c("options.directionalAudio.on.tooltip");
   private static final xk bE = xk.c("options.directionalAudio.off.tooltip");
   private final fmc<Boolean> bF = fmc.a("options.directionalAudio", $$0x -> $$0x ? fpk.a(bD) : fpk.a(bE), false, $$0x -> {
      hgj $$1x = flz.Q().ak();
      $$1x.k();
      $$1x.a(hey.a(awv.Bg, 1.0F));
   });
   private final fmc<Boolean> bG = new fmc<>(
      "options.accessibility.text_background",
      fmc.a(),
      ($$0x, $$1x) -> $$1x ? xk.c("options.accessibility.text_background.chat") : xk.c("options.accessibility.text_background.everywhere"),
      fmc.a,
      true,
      $$0x -> {
      }
   );
   private final fmc<Boolean> bH = fmc.a("options.touchscreen", false);
   private final fmc<Boolean> bI = fmc.a("options.fullscreen", false, $$0x -> {
      flz $$1x = flz.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ad().a($$1x.aO().i());
      }
   });
   private final fmc<Boolean> bJ = fmc.a("options.viewBobbing", true);
   private static final xk bK = xk.c("options.key.toggle");
   private static final xk bL = xk.c("options.key.hold");
   private final fmc<Boolean> bM = new fmc<>("key.sneak", fmc.a(), ($$0x, $$1x) -> $$1x ? bK : bL, fmc.a, false, $$0x -> {
   });
   private final fmc<Boolean> bN = new fmc<>("key.sprint", fmc.a(), ($$0x, $$1x) -> $$1x ? bK : bL, fmc.a, false, $$0x -> {
   });
   public boolean u;
   private static final xk bO = xk.c("options.hideMatchedNames.tooltip");
   private final fmc<Boolean> bP = fmc.a("options.hideMatchedNames", fmc.a(bO), true);
   private final fmc<Boolean> bQ = fmc.a("options.autosaveIndicator", true);
   private static final xk bR = xk.c("options.onlyShowSecureChat.tooltip");
   private final fmc<Boolean> bS = fmc.a("options.onlyShowSecureChat", fmc.a(bR), false);
   public final flx v = new flx("key.forward", 87, "key.categories.movement");
   public final flx w = new flx("key.left", 65, "key.categories.movement");
   public final flx x = new flx("key.back", 83, "key.categories.movement");
   public final flx y = new flx("key.right", 68, "key.categories.movement");
   public final flx z = new flx("key.jump", 32, "key.categories.movement");
   public final flx A = new fmk("key.sneak", 340, "key.categories.movement", this.bM::c);
   public final flx B = new fmk("key.sprint", 341, "key.categories.movement", this.bN::c);
   public final flx C = new flx("key.inventory", 69, "key.categories.inventory");
   public final flx D = new flx("key.swapOffhand", 70, "key.categories.inventory");
   public final flx E = new flx("key.drop", 81, "key.categories.inventory");
   public final flx F = new flx("key.use", ffg.b.c, 1, "key.categories.gameplay");
   public final flx G = new flx("key.attack", ffg.b.c, 0, "key.categories.gameplay");
   public final flx H = new flx("key.pickItem", ffg.b.c, 2, "key.categories.gameplay");
   public final flx I = new flx("key.chat", 84, "key.categories.multiplayer");
   public final flx J = new flx("key.playerlist", 258, "key.categories.multiplayer");
   public final flx K = new flx("key.command", 47, "key.categories.multiplayer");
   public final flx L = new flx("key.socialInteractions", 80, "key.categories.multiplayer");
   public final flx M = new flx("key.screenshot", 291, "key.categories.misc");
   public final flx N = new flx("key.togglePerspective", 294, "key.categories.misc");
   public final flx O = new flx("key.smoothCamera", ffg.bv.b(), "key.categories.misc");
   public final flx P = new flx("key.fullscreen", 300, "key.categories.misc");
   public final flx Q = new flx("key.spectatorOutlines", ffg.bv.b(), "key.categories.misc");
   public final flx R = new flx("key.advancements", 76, "key.categories.misc");
   public final flx[] S = new flx[]{
      new flx("key.hotbar.1", 49, "key.categories.inventory"),
      new flx("key.hotbar.2", 50, "key.categories.inventory"),
      new flx("key.hotbar.3", 51, "key.categories.inventory"),
      new flx("key.hotbar.4", 52, "key.categories.inventory"),
      new flx("key.hotbar.5", 53, "key.categories.inventory"),
      new flx("key.hotbar.6", 54, "key.categories.inventory"),
      new flx("key.hotbar.7", 55, "key.categories.inventory"),
      new flx("key.hotbar.8", 56, "key.categories.inventory"),
      new flx("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final flx T = new flx("key.saveToolbarActivator", 67, "key.categories.creative");
   public final flx U = new flx("key.loadToolbarActivator", 88, "key.categories.creative");
   public final flx[] V = (flx[])ArrayUtils.addAll(
      new flx[]{
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
   protected flz W;
   private final File bT;
   public boolean X;
   private flj bU = flj.a;
   public String Y = "";
   public boolean Z;
   private final fmc<Integer> bV = new fmc<>("options.fov", fmc.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xk.c("options.fov.min"));
         case 110 -> a($$0x, xk.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fmc.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> flz.Q().f.p());
   private static final xk bW = xk.a("options.telemetry.button.tooltip", xk.c("options.telemetry.state.minimal"), xk.c("options.telemetry.state.all"));
   private final fmc<Boolean> bX = fmc.a("options.telemetry.button", fmc.a(bW), ($$0x, $$1x) -> {
      flz $$2x = flz.Q();
      if (!$$2x.E()) {
         return xk.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xk.c("options.telemetry.state.all") : xk.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xk bY = xk.c("options.screenEffectScale.tooltip");
   private final fmc<Double> bZ = new fmc<>("options.screenEffectScale", fmc.a(bY), fmd::b, fmc.m.a, 1.0, $$0x -> {
   });
   private static final xk ca = xk.c("options.fovEffectScale.tooltip");
   private final fmc<Double> cb = new fmc<>(
      "options.fovEffectScale", fmc.a(ca), fmd::b, fmc.m.a.a(azu::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final xk cc = xk.c("options.darknessEffectScale.tooltip");
   private final fmc<Double> cd = new fmc<>("options.darknessEffectScale", fmc.a(cc), fmd::b, fmc.m.a.a(azu::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final xk ce = xk.c("options.glintSpeed.tooltip");
   private final fmc<Double> cf = new fmc<>("options.glintSpeed", fmc.a(ce), fmd::b, fmc.m.a, 0.5, $$0x -> {
   });
   private static final xk cg = xk.c("options.glintStrength.tooltip");
   private final fmc<Double> ch = new fmc<>("options.glintStrength", fmc.a(cg), fmd::b, fmc.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final xk ci = xk.c("options.damageTiltStrength.tooltip");
   private final fmc<Double> cj = new fmc<>("options.damageTiltStrength", fmc.a(ci), fmd::b, fmc.m.a, 1.0, $$0x -> {
   });
   private final fmc<Double> ck = new fmc<>("options.gamma", fmc.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xk.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xk.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xk.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fmc.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cl = 2147483646;
   private final fmc<Integer> cm = new fmc<>(
      "options.guiScale", fmc.a(), ($$0x, $$1x) -> $$1x == 0 ? xk.c("options.guiScale.auto") : xk.b(Integer.toString($$1x)), new fmc.c(0, () -> {
         flz $$0x = flz.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fmc<arp> cn = new fmc<>(
      "options.particles", fmc.a(), fmc.b(), new fmc.e<>(Arrays.asList(arp.values()), Codec.INT.xmap(arp::a, arp::b)), arp.a, $$0x -> {
      }
   );
   private final fmc<fmb> co = new fmc<>(
      "options.narrator",
      fmc.a(),
      ($$0x, $$1x) -> (xk)(this.W.aZ().a() ? $$1x.b() : xk.c("options.narrator.notavailable")),
      new fmc.e<>(Arrays.asList(fmb.values()), Codec.INT.xmap(fmb::a, fmb::a)),
      fmb.a,
      $$0x -> this.W.aZ().a($$0x)
   );
   public String ab = "en_us";
   private final fmc<String> cp = new fmc<>(
      "options.audioDevice",
      fmc.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xk.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xk.b($$1x.substring(hgg.c)) : xk.b($$1x);
         }
      },
      new fmc.h<>(
         () -> Stream.concat(Stream.of(""), flz.Q().ak().a().stream()).toList(),
         $$0x -> flz.Q().r() && $$0x != "" && !flz.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hgj $$1x = flz.Q().ak();
         $$1x.k();
         $$1x.a(hey.a(awv.Bg, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;

   public fmc<Boolean> a() {
      return this.aj;
   }

   public fmc<Boolean> b() {
      return this.al;
   }

   public fmc<Boolean> c() {
      return this.an;
   }

   public fmc<Double> d() {
      return this.ao;
   }

   public fmc<Integer> e() {
      return this.ap;
   }

   public fmc<Integer> f() {
      return this.aq;
   }

   public fmc<Double> g() {
      return this.as;
   }

   public fmc<Integer> h() {
      return this.at;
   }

   public fmc<flv> i() {
      return this.aw;
   }

   public fmc<fll> j() {
      return this.ax;
   }

   public fmc<flr> k() {
      return this.aB;
   }

   public fmc<Boolean> l() {
      return this.aC;
   }

   public fmc<fmf> m() {
      return this.aG;
   }

   public void a(auv $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (aus $$2 : $$0.g()) {
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

   public fmc<cpl> n() {
      return this.aH;
   }

   public fmc<Double> o() {
      return this.aI;
   }

   public fmc<Double> p() {
      return this.aJ;
   }

   public fmc<Integer> q() {
      return this.aM;
   }

   public int r() {
      return this.q().c();
   }

   public fmc<Double> s() {
      return this.aN;
   }

   public fmc<Double> t() {
      return this.aO;
   }

   public fmc<Boolean> u() {
      return this.aQ;
   }

   public fmc<Boolean> v() {
      return this.aS;
   }

   public fmc<Boolean> w() {
      return this.aT;
   }

   public fmc<bvr> x() {
      return this.aV;
   }

   public fmc<Double> y() {
      return this.aW;
   }

   public fmc<Double> z() {
      return this.aX;
   }

   public fmc<Double> A() {
      return this.aY;
   }

   public fmc<Double> B() {
      return this.aZ;
   }

   public fmc<Double> C() {
      return this.ba;
   }

   public fmc<Double> D() {
      return this.bc;
   }

   public fmc<Integer> E() {
      return this.bd;
   }

   public fmc<flh> F() {
      return this.be;
   }

   public fmc<Integer> G() {
      return this.bf;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return azu.a(Math.log10($$0) * 100.0);
   }

   public fmc<Double> H() {
      return this.bg;
   }

   public fmc<Boolean> I() {
      return this.bh;
   }

   public fmc<Boolean> J() {
      return this.bi;
   }

   public fmc<Boolean> K() {
      return this.bk;
   }

   public fmc<Boolean> L() {
      return this.bl;
   }

   public fmc<Boolean> M() {
      return this.bm;
   }

   public fmc<Boolean> N() {
      return this.bn;
   }

   public fmc<Boolean> O() {
      return this.bo;
   }

   public fmc<Boolean> P() {
      return this.bp;
   }

   public fmc<Boolean> Q() {
      return this.bq;
   }

   public fmc<Boolean> R() {
      return this.br;
   }

   private static void aI() {
      flz $$0 = flz.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fmc<Boolean> S() {
      return this.bs;
   }

   private static boolean aJ() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fmc<Boolean> T() {
      return this.bt;
   }

   public fmc<Boolean> U() {
      return this.bu;
   }

   public fmc<Boolean> V() {
      return this.bv;
   }

   public fmc<Boolean> W() {
      return this.bx;
   }

   public fmc<Boolean> X() {
      return this.bz;
   }

   public fmc<Boolean> Y() {
      return this.bA;
   }

   public final float a(aww $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fmc<Double> b(aww $$0) {
      return Objects.requireNonNull(this.bB.get($$0));
   }

   private fmc<Double> a(String $$0, aww $$1) {
      return new fmc<>($$0, fmc.a(), fmd::b, fmc.m.a, 1.0, $$1x -> flz.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fmc<Boolean> Z() {
      return this.bC;
   }

   public fmc<Boolean> aa() {
      return this.bF;
   }

   public fmc<Boolean> ab() {
      return this.bG;
   }

   public fmc<Boolean> ac() {
      return this.bH;
   }

   public fmc<Boolean> ad() {
      return this.bI;
   }

   public fmc<Boolean> ae() {
      return this.bJ;
   }

   public fmc<Boolean> af() {
      return this.bM;
   }

   public fmc<Boolean> ag() {
      return this.bN;
   }

   public fmc<Boolean> ah() {
      return this.bP;
   }

   public fmc<Boolean> ai() {
      return this.bQ;
   }

   public fmc<Boolean> aj() {
      return this.bS;
   }

   public fmc<Integer> ak() {
      return this.bV;
   }

   public fmc<Boolean> al() {
      return this.bX;
   }

   public fmc<Double> am() {
      return this.bZ;
   }

   public fmc<Double> an() {
      return this.cb;
   }

   public fmc<Double> ao() {
      return this.cd;
   }

   public fmc<Double> ap() {
      return this.cf;
   }

   public fmc<Double> aq() {
      return this.ch;
   }

   public fmc<Double> ar() {
      return this.cj;
   }

   public fmc<Double> as() {
      return this.ck;
   }

   public fmc<Integer> at() {
      return this.cm;
   }

   public fmc<arp> au() {
      return this.cn;
   }

   public fmc<fmb> av() {
      return this.co;
   }

   public fmc<String> aw() {
      return this.cp;
   }

   public void ax() {
      this.ac = false;
      this.az();
   }

   public fmd(flz $$0, File $$1) {
      this.W = $$0;
      this.bT = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ap = new fmc<>(
         "options.renderDistance",
         fmc.a(),
         ($$0x, $$1x) -> a($$0x, xk.a("options.chunks", $$1x)),
         new fmc.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> flz.Q().f.p()
      );
      this.aq = new fmc<>(
         "options.simulationDistance", fmc.a(), ($$0x, $$1x) -> a($$0x, xk.a("options.chunks", $$1x)), new fmc.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = ae.m() == ae.a.c;
      this.ay();
   }

   public float a(float $$0) {
      return this.bG.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return ayf.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bG.c() ? $$0 : ayf.a(this.aN.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(fmd.b $$0) {
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

   private void a(fmd.a $$0) {
      this.a((fmd.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, fmd::c, af::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fmd::c, af::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, hhn::a, hhn::a);
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

      for (flx $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(ffg.a($$3));
         }
      }

      for (aww $$4 : aww.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bB.get($$4));
      }

      for (cpp $$5 : cpp.values()) {
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

         um $$0 = new um();

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

         final um $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(flr.b);
            } else {
               this.aB.a(flr.a);
            }
         }

         this.a(new fmd.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).u_() : null;
            }

            @Override
            public <T> void a(String $$0, fmc<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fmd.ae.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fmd.ae.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fmd.a($$2) : $$1;
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
               } else if (fmd.a($$2)) {
                  return 1.0F;
               } else if (fmd.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fmd.ae.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         flx.d();
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

   private um a(um $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return bbi.e.a(this.W.au(), $$0, $$1);
   }

   public void az() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bT), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fmd.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fmc<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> fmd.ae.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(fmd.af.toJson($$2));
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

   public ari aA() {
      int $$0 = 0;

      for (cpp $$1 : this.aU) {
         $$0 |= $$1.a();
      }

      return new ari(this.ab, this.ap.c(), this.aH.c(), this.bn.c(), $$0, this.aV.c(), this.W.aU(), this.bz.c(), this.cn.c());
   }

   public void aB() {
      if (this.W.t != null) {
         this.W.t.j.a(this.aA());
      }
   }

   public void a(cpp $$0, boolean $$1) {
      if ($$1) {
         this.aU.add($$0);
      } else {
         this.aU.remove($$0);
      }
   }

   public boolean a(cpp $$0) {
      return this.aU.contains($$0);
   }

   public fll aC() {
      return this.aH() >= 4 ? this.ax.c() : fll.a;
   }

   public boolean aD() {
      return this.q;
   }

   public void b(auv $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         aus $$4 = $$0.c($$3);
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

   public flj aE() {
      return this.bU;
   }

   public void a(flj $$0) {
      this.bU = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = azk.a(af, $$0, ag);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aF() {
      return this.bT;
   }

   public String aG() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fmd.b() {
         @Override
         public <T> void a(String $$0x, fmc<T> $$1) {
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

   private static xk c(xk $$0, int $$1) {
      return xk.a("options.pixel_value", $$0, $$1);
   }

   private static xk a(xk $$0, double $$1) {
      return xk.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static xk a(xk $$0, xk $$1) {
      return xk.a("options.generic_value", $$0, $$1);
   }

   public static xk a(xk $$0, int $$1) {
      return a($$0, xk.b(Integer.toString($$1)));
   }

   public static xk b(xk $$0, int $$1) {
      return $$1 == 0 ? a($$0, xj.c) : a($$0, $$1);
   }

   private static xk b(xk $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, xj.c) : a($$0, $$1);
   }

   interface a extends fmd.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fmc<T> var2);
   }
}
