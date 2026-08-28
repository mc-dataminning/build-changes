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

public class fll {
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
   private static final wo ai = wo.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final flk<Boolean> aj = flk.a("options.darkMojangStudiosBackgroundColor", flk.a(ai), false);
   private static final wo ak = wo.c("options.hideLightningFlashes.tooltip");
   private final flk<Boolean> al = flk.a("options.hideLightningFlashes", flk.a(ak), false);
   private static final wo am = wo.c("options.hideSplashTexts.tooltip");
   private final flk<Boolean> an = flk.a("options.hideSplashTexts", flk.a(am), false);
   private final flk<Double> ao = new flk<>("options.sensitivity", flk.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wo.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wo.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, flk.m.a, 0.5, $$0x -> {
   });
   private final flk<Integer> ap;
   private final flk<Integer> aq;
   private int ar = 0;
   private final flk<Double> as = new flk<>(
      "options.entityDistanceScaling",
      flk.a(),
      fll::a,
      new flk.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final flk<Integer> at = new flk<>(
      "options.framerateLimit",
      flk.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wo.c("options.framerateLimit.max")) : a($$0x, wo.a("options.framerate", $$1x)),
      new flk.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> flh.Q().aP().a($$0x)
   );
   private static final wo au = wo.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final wo av = wo.c("options.inactivityFpsLimit.afk.tooltip");
   private final flk<fld> aw = new flk<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> fqb.a(au);
         case b -> fqb.a(av);
      };
   }, flk.b(), new flk.e<>(Arrays.asList(fld.values()), fld.c), fld.b, $$0x -> {
   });
   private final flk<fkt> ax = new flk<>(
      "options.renderClouds",
      flk.a(),
      flk.b(),
      new flk.e<>(Arrays.asList(fkt.values()), Codec.withAlternative(fkt.d, Codec.BOOL, $$0x -> $$0x ? fkt.c : fkt.a)),
      fkt.c,
      $$0x -> {
      }
   );
   private static final wo ay = wo.c("options.graphics.fast.tooltip");
   private static final wo az = wo.a("options.graphics.fabulous.tooltip", wo.c("options.graphics.fabulous").a(n.u));
   private static final wo aA = wo.c("options.graphics.fancy.tooltip");
   private final flk<fkz> aB = new flk<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fqb.a(aA);
            case a -> fqb.a(ay);
            case c -> fqb.a(az);
         };
      },
      ($$0x, $$1x) -> {
         xc $$2x = wo.c($$1x.a());
         return $$1x == fkz.c ? $$2x.a(n.u) : $$2x;
      },
      new flk.a<>(
         Arrays.asList(fkz.values()),
         Stream.of(fkz.values()).filter($$0x -> $$0x != fkz.c).collect(Collectors.toList()),
         () -> flh.Q().r() && flh.Q().aj().h(),
         ($$0x, $$1x) -> {
            flh $$2x = flh.Q();
            gln $$3 = $$2x.aj();
            if ($$1x == fkz.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.e();
            }
         },
         Codec.INT.xmap(fkz::a, fkz::b)
      ),
      fkz.b,
      $$0x -> {
      }
   );
   private final flk<Boolean> aC = flk.a("options.ao", true, $$0x -> flh.Q().f.e());
   private static final wo aD = wo.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wo aE = wo.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wo aF = wo.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final flk<fln> aG = new flk<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fqb.a(aD);
         case b -> fqb.a(aE);
         case c -> fqb.a(aF);
      };
   }, flk.b(), new flk.e<>(Arrays.asList(fln.values()), Codec.INT.xmap(fln::a, fln::b)), fln.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final flk<cos> aH = new flk<>(
      "options.chat.visibility", flk.a(), flk.b(), new flk.e<>(Arrays.asList(cos.values()), Codec.INT.xmap(cos::a, cos::b)), cos.a, $$0x -> {
      }
   );
   private final flk<Double> aI = new flk<>("options.chat.opacity", flk.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), flk.m.a, 1.0, $$0x -> flh.Q().m.d().b());
   private final flk<Double> aJ = new flk<>("options.chat.line_spacing", flk.a(), fll::a, flk.m.a, 0.0, $$0x -> {
   });
   private static final wo aK = wo.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aL = 5;
   private final flk<Integer> aM = new flk<>("options.accessibility.menu_background_blurriness", flk.a(aK), fll::b, new flk.f(0, 10), 5, $$0x -> {
   });
   private final flk<Double> aN = new flk<>("options.accessibility.text_background_opacity", flk.a(), fll::a, flk.m.a, 0.5, $$0x -> flh.Q().m.d().b());
   private final flk<Double> aO = new flk<>("options.accessibility.panorama_speed", flk.a(), fll::a, flk.m.a, 1.0, $$0x -> {
   });
   private static final wo aP = wo.c("options.accessibility.high_contrast.tooltip");
   private final flk<Boolean> aQ = flk.a("options.accessibility.high_contrast", flk.a(aP), false, $$0x -> {
      atz $$1x = flh.Q().ad();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private static final wo aR = wo.c("options.accessibility.high_contrast_block_outline.tooltip");
   private final flk<Boolean> aS = flk.a("options.accessibility.high_contrast_block_outline", flk.a(aR), false);
   private final flk<Boolean> aT = flk.a(
      "options.accessibility.narrator_hotkey",
      flk.a(flh.a ? wo.c("options.accessibility.narrator_hotkey.mac.tooltip") : wo.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cow> aU = EnumSet.allOf(cow.class);
   private final flk<buz> aV = new flk<>("options.mainHand", flk.a(), flk.b(), new flk.e<>(Arrays.asList(buz.values()), buz.c), buz.b, $$0x -> {
   });
   public int o;
   public int p;
   private final flk<Double> aW = new flk<>(
      "options.chat.scale",
      flk.a(),
      ($$0x, $$1x) -> (wo)($$1x == 0.0 ? wn.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      flk.m.a,
      1.0,
      $$0x -> flh.Q().m.d().b()
   );
   private final flk<Double> aX = new flk<>("options.chat.width", flk.a(), ($$0x, $$1x) -> c($$0x, foq.a($$1x)), flk.m.a, 1.0, $$0x -> flh.Q().m.d().b());
   private final flk<Double> aY = new flk<>(
      "options.chat.height.unfocused", flk.a(), ($$0x, $$1x) -> c($$0x, foq.b($$1x)), flk.m.a, foq.i(), $$0x -> flh.Q().m.d().b()
   );
   private final flk<Double> aZ = new flk<>(
      "options.chat.height.focused", flk.a(), ($$0x, $$1x) -> c($$0x, foq.b($$1x)), flk.m.a, 1.0, $$0x -> flh.Q().m.d().b()
   );
   private final flk<Double> ba = new flk<>(
      "options.chat.delay_instant",
      flk.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wo.c("options.chat.delay_none") : wo.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new flk.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> flh.Q().aZ().a($$0x)
   );
   private static final wo bb = wo.c("options.notifications.display_time.tooltip");
   private final flk<Double> bc = new flk<>(
      "options.notifications.display_time",
      flk.a(bb),
      ($$0x, $$1x) -> a($$0x, wo.a("options.multiplier", $$1x)),
      new flk.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final flk<Integer> bd = new flk<>(
      "options.mipmapLevels", flk.a(), ($$0x, $$1x) -> (wo)($$1x == 0 ? wn.a($$0x, false) : a($$0x, $$1x.intValue())), new flk.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final flk<fko> be = new flk<>(
      "options.attackIndicator", flk.a(), flk.b(), new flk.e<>(Arrays.asList(fko.values()), Codec.INT.xmap(fko::a, fko::b)), fko.b, $$0x -> {
      }
   );
   public hkt r = hkt.a;
   public boolean s = false;
   private final flk<Integer> bf = new flk<>("options.biomeBlendRadius", flk.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wo.c("options.biomeBlendRadius." + $$2x));
   }, new flk.f(0, 7, false), 2, $$0x -> flh.Q().f.e());
   private final flk<Double> bg = new flk<>(
      "options.mouseWheelSensitivity",
      flk.a(),
      ($$0x, $$1x) -> a($$0x, wo.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new flk.f(-200, 100).a(fll::c, fll::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final flk<Boolean> bh = flk.a("options.rawMouseInput", true, $$0x -> {
      fev $$1x = flh.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final flk<Boolean> bi = flk.a("options.autoJump", false);
   private static final wo bj = wo.c("options.rotateWithMinecart.tooltip");
   private final flk<Boolean> bk = flk.a("options.rotateWithMinecart", flk.a(bj), false);
   private final flk<Boolean> bl = flk.a("options.operatorItemsTab", false);
   private final flk<Boolean> bm = flk.a("options.autoSuggestCommands", true);
   private final flk<Boolean> bn = flk.a("options.chat.color", true);
   private final flk<Boolean> bo = flk.a("options.chat.links", true);
   private final flk<Boolean> bp = flk.a("options.chat.links.prompt", true);
   private final flk<Boolean> bq = flk.a("options.vsync", true, $$0x -> {
      if (flh.Q().aO() != null) {
         flh.Q().aO().a($$0x);
      }
   });
   private final flk<Boolean> br = flk.a("options.entityShadows", true);
   private final flk<Boolean> bs = flk.a("options.forceUnicodeFont", false, $$0x -> aI());
   private final flk<Boolean> bt = flk.a("options.japaneseGlyphVariants", flk.a(wo.c("options.japaneseGlyphVariants.tooltip")), aJ(), $$0x -> aI());
   private final flk<Boolean> bu = flk.a("options.invertMouse", false);
   private final flk<Boolean> bv = flk.a("options.discrete_mouse_scroll", false);
   private static final wo bw = wo.c("options.realmsNotifications.tooltip");
   private final flk<Boolean> bx = flk.a("options.realmsNotifications", flk.a(bw), true);
   private static final wo by = wo.c("options.allowServerListing.tooltip");
   private final flk<Boolean> bz = flk.a("options.allowServerListing", flk.a(by), true, $$0x -> {
   });
   private final flk<Boolean> bA = flk.a("options.reducedDebugInfo", false);
   private final Map<awa, flk<Double>> bB = af.a(new EnumMap<>(awa.class), $$0x -> {
      for (awa $$1x : awa.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final flk<Boolean> bC = flk.a("options.showSubtitles", false);
   private static final wo bD = wo.c("options.directionalAudio.on.tooltip");
   private static final wo bE = wo.c("options.directionalAudio.off.tooltip");
   private final flk<Boolean> bF = flk.a("options.directionalAudio", $$0x -> $$0x ? fqb.a(bD) : fqb.a(bE), false, $$0x -> {
      hjp $$1x = flh.Q().ak();
      $$1x.k();
      $$1x.a(hie.a(avz.Bf, 1.0F));
   });
   private final flk<Boolean> bG = new flk<>(
      "options.accessibility.text_background",
      flk.a(),
      ($$0x, $$1x) -> $$1x ? wo.c("options.accessibility.text_background.chat") : wo.c("options.accessibility.text_background.everywhere"),
      flk.a,
      true,
      $$0x -> {
      }
   );
   private final flk<Boolean> bH = flk.a("options.touchscreen", false);
   private final flk<Boolean> bI = flk.a("options.fullscreen", false, $$0x -> {
      flh $$1x = flh.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ad().a($$1x.aO().i());
      }
   });
   private final flk<Boolean> bJ = flk.a("options.viewBobbing", true);
   private static final wo bK = wo.c("options.key.toggle");
   private static final wo bL = wo.c("options.key.hold");
   private final flk<Boolean> bM = new flk<>("key.sneak", flk.a(), ($$0x, $$1x) -> $$1x ? bK : bL, flk.a, false, $$0x -> {
   });
   private final flk<Boolean> bN = new flk<>("key.sprint", flk.a(), ($$0x, $$1x) -> $$1x ? bK : bL, flk.a, false, $$0x -> {
   });
   public boolean u;
   private static final wo bO = wo.c("options.hideMatchedNames.tooltip");
   private final flk<Boolean> bP = flk.a("options.hideMatchedNames", flk.a(bO), true);
   private final flk<Boolean> bQ = flk.a("options.autosaveIndicator", true);
   private static final wo bR = wo.c("options.onlyShowSecureChat.tooltip");
   private final flk<Boolean> bS = flk.a("options.onlyShowSecureChat", flk.a(bR), false);
   public final flf v = new flf("key.forward", 87, "key.categories.movement");
   public final flf w = new flf("key.left", 65, "key.categories.movement");
   public final flf x = new flf("key.back", 83, "key.categories.movement");
   public final flf y = new flf("key.right", 68, "key.categories.movement");
   public final flf z = new flf("key.jump", 32, "key.categories.movement");
   public final flf A = new fls("key.sneak", 340, "key.categories.movement", this.bM::c);
   public final flf B = new fls("key.sprint", 341, "key.categories.movement", this.bN::c);
   public final flf C = new flf("key.inventory", 69, "key.categories.inventory");
   public final flf D = new flf("key.swapOffhand", 70, "key.categories.inventory");
   public final flf E = new flf("key.drop", 81, "key.categories.inventory");
   public final flf F = new flf("key.use", fen.b.c, 1, "key.categories.gameplay");
   public final flf G = new flf("key.attack", fen.b.c, 0, "key.categories.gameplay");
   public final flf H = new flf("key.pickItem", fen.b.c, 2, "key.categories.gameplay");
   public final flf I = new flf("key.chat", 84, "key.categories.multiplayer");
   public final flf J = new flf("key.playerlist", 258, "key.categories.multiplayer");
   public final flf K = new flf("key.command", 47, "key.categories.multiplayer");
   public final flf L = new flf("key.socialInteractions", 80, "key.categories.multiplayer");
   public final flf M = new flf("key.screenshot", 291, "key.categories.misc");
   public final flf N = new flf("key.togglePerspective", 294, "key.categories.misc");
   public final flf O = new flf("key.smoothCamera", fen.bv.b(), "key.categories.misc");
   public final flf P = new flf("key.fullscreen", 300, "key.categories.misc");
   public final flf Q = new flf("key.spectatorOutlines", fen.bv.b(), "key.categories.misc");
   public final flf R = new flf("key.advancements", 76, "key.categories.misc");
   public final flf[] S = new flf[]{
      new flf("key.hotbar.1", 49, "key.categories.inventory"),
      new flf("key.hotbar.2", 50, "key.categories.inventory"),
      new flf("key.hotbar.3", 51, "key.categories.inventory"),
      new flf("key.hotbar.4", 52, "key.categories.inventory"),
      new flf("key.hotbar.5", 53, "key.categories.inventory"),
      new flf("key.hotbar.6", 54, "key.categories.inventory"),
      new flf("key.hotbar.7", 55, "key.categories.inventory"),
      new flf("key.hotbar.8", 56, "key.categories.inventory"),
      new flf("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final flf T = new flf("key.saveToolbarActivator", 67, "key.categories.creative");
   public final flf U = new flf("key.loadToolbarActivator", 88, "key.categories.creative");
   public final flf[] V = (flf[])ArrayUtils.addAll(
      new flf[]{
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
   protected flh W;
   private final File bT;
   public boolean X;
   private fkq bU = fkq.a;
   public String Y = "";
   public boolean Z;
   private final flk<Integer> bV = new flk<>("options.fov", flk.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wo.c("options.fov.min"));
         case 110 -> a($$0x, wo.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new flk.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> flh.Q().f.p());
   private static final wo bW = wo.a("options.telemetry.button.tooltip", wo.c("options.telemetry.state.minimal"), wo.c("options.telemetry.state.all"));
   private final flk<Boolean> bX = flk.a("options.telemetry.button", flk.a(bW), ($$0x, $$1x) -> {
      flh $$2x = flh.Q();
      if (!$$2x.E()) {
         return wo.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wo.c("options.telemetry.state.all") : wo.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wo bY = wo.c("options.screenEffectScale.tooltip");
   private final flk<Double> bZ = new flk<>("options.screenEffectScale", flk.a(bY), fll::b, flk.m.a, 1.0, $$0x -> {
   });
   private static final wo ca = wo.c("options.fovEffectScale.tooltip");
   private final flk<Double> cb = new flk<>(
      "options.fovEffectScale", flk.a(ca), fll::b, flk.m.a.a(ayy::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final wo cc = wo.c("options.darknessEffectScale.tooltip");
   private final flk<Double> cd = new flk<>("options.darknessEffectScale", flk.a(cc), fll::b, flk.m.a.a(ayy::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final wo ce = wo.c("options.glintSpeed.tooltip");
   private final flk<Double> cf = new flk<>("options.glintSpeed", flk.a(ce), fll::b, flk.m.a, 0.5, $$0x -> {
   });
   private static final wo cg = wo.c("options.glintStrength.tooltip");
   private final flk<Double> ch = new flk<>("options.glintStrength", flk.a(cg), fll::b, flk.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final wo ci = wo.c("options.damageTiltStrength.tooltip");
   private final flk<Double> cj = new flk<>("options.damageTiltStrength", flk.a(ci), fll::b, flk.m.a, 1.0, $$0x -> {
   });
   private final flk<Double> ck = new flk<>("options.gamma", flk.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wo.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wo.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wo.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, flk.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cl = 2147483646;
   private final flk<Integer> cm = new flk<>(
      "options.guiScale", flk.a(), ($$0x, $$1x) -> $$1x == 0 ? wo.c("options.guiScale.auto") : wo.b(Integer.toString($$1x)), new flk.c(0, () -> {
         flh $$0x = flh.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final flk<aqu> cn = new flk<>(
      "options.particles", flk.a(), flk.b(), new flk.e<>(Arrays.asList(aqu.values()), Codec.INT.xmap(aqu::a, aqu::b)), aqu.a, $$0x -> {
      }
   );
   private final flk<flj> co = new flk<>(
      "options.narrator",
      flk.a(),
      ($$0x, $$1x) -> (wo)(this.W.aY().a() ? $$1x.b() : wo.c("options.narrator.notavailable")),
      new flk.e<>(Arrays.asList(flj.values()), Codec.INT.xmap(flj::a, flj::a)),
      flj.a,
      $$0x -> this.W.aY().a($$0x)
   );
   public String ab = "en_us";
   private final flk<String> cp = new flk<>(
      "options.audioDevice",
      flk.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wo.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wo.b($$1x.substring(hjm.c)) : wo.b($$1x);
         }
      },
      new flk.h<>(
         () -> Stream.concat(Stream.of(""), flh.Q().ak().a().stream()).toList(),
         $$0x -> flh.Q().r() && $$0x != "" && !flh.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hjp $$1x = flh.Q().ak();
         $$1x.k();
         $$1x.a(hie.a(avz.Bf, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;

   public flk<Boolean> a() {
      return this.aj;
   }

   public flk<Boolean> b() {
      return this.al;
   }

   public flk<Boolean> c() {
      return this.an;
   }

   public flk<Double> d() {
      return this.ao;
   }

   public flk<Integer> e() {
      return this.ap;
   }

   public flk<Integer> f() {
      return this.aq;
   }

   public flk<Double> g() {
      return this.as;
   }

   public flk<Integer> h() {
      return this.at;
   }

   public flk<fld> i() {
      return this.aw;
   }

   public flk<fkt> j() {
      return this.ax;
   }

   public flk<fkz> k() {
      return this.aB;
   }

   public flk<Boolean> l() {
      return this.aC;
   }

   public flk<fln> m() {
      return this.aG;
   }

   public void a(atz $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (atw $$2 : $$0.g()) {
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

   public flk<cos> n() {
      return this.aH;
   }

   public flk<Double> o() {
      return this.aI;
   }

   public flk<Double> p() {
      return this.aJ;
   }

   public flk<Integer> q() {
      return this.aM;
   }

   public int r() {
      return this.q().c();
   }

   public flk<Double> s() {
      return this.aN;
   }

   public flk<Double> t() {
      return this.aO;
   }

   public flk<Boolean> u() {
      return this.aQ;
   }

   public flk<Boolean> v() {
      return this.aS;
   }

   public flk<Boolean> w() {
      return this.aT;
   }

   public flk<buz> x() {
      return this.aV;
   }

   public flk<Double> y() {
      return this.aW;
   }

   public flk<Double> z() {
      return this.aX;
   }

   public flk<Double> A() {
      return this.aY;
   }

   public flk<Double> B() {
      return this.aZ;
   }

   public flk<Double> C() {
      return this.ba;
   }

   public flk<Double> D() {
      return this.bc;
   }

   public flk<Integer> E() {
      return this.bd;
   }

   public flk<fko> F() {
      return this.be;
   }

   public flk<Integer> G() {
      return this.bf;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ayy.a(Math.log10($$0) * 100.0);
   }

   public flk<Double> H() {
      return this.bg;
   }

   public flk<Boolean> I() {
      return this.bh;
   }

   public flk<Boolean> J() {
      return this.bi;
   }

   public flk<Boolean> K() {
      return this.bk;
   }

   public flk<Boolean> L() {
      return this.bl;
   }

   public flk<Boolean> M() {
      return this.bm;
   }

   public flk<Boolean> N() {
      return this.bn;
   }

   public flk<Boolean> O() {
      return this.bo;
   }

   public flk<Boolean> P() {
      return this.bp;
   }

   public flk<Boolean> Q() {
      return this.bq;
   }

   public flk<Boolean> R() {
      return this.br;
   }

   private static void aI() {
      flh $$0 = flh.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public flk<Boolean> S() {
      return this.bs;
   }

   private static boolean aJ() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public flk<Boolean> T() {
      return this.bt;
   }

   public flk<Boolean> U() {
      return this.bu;
   }

   public flk<Boolean> V() {
      return this.bv;
   }

   public flk<Boolean> W() {
      return this.bx;
   }

   public flk<Boolean> X() {
      return this.bz;
   }

   public flk<Boolean> Y() {
      return this.bA;
   }

   public final float a(awa $$0) {
      return this.b($$0).c().floatValue();
   }

   public final flk<Double> b(awa $$0) {
      return Objects.requireNonNull(this.bB.get($$0));
   }

   private flk<Double> a(String $$0, awa $$1) {
      return new flk<>($$0, flk.a(), fll::b, flk.m.a, 1.0, $$1x -> flh.Q().ak().a($$1, $$1x.floatValue()));
   }

   public flk<Boolean> Z() {
      return this.bC;
   }

   public flk<Boolean> aa() {
      return this.bF;
   }

   public flk<Boolean> ab() {
      return this.bG;
   }

   public flk<Boolean> ac() {
      return this.bH;
   }

   public flk<Boolean> ad() {
      return this.bI;
   }

   public flk<Boolean> ae() {
      return this.bJ;
   }

   public flk<Boolean> af() {
      return this.bM;
   }

   public flk<Boolean> ag() {
      return this.bN;
   }

   public flk<Boolean> ah() {
      return this.bP;
   }

   public flk<Boolean> ai() {
      return this.bQ;
   }

   public flk<Boolean> aj() {
      return this.bS;
   }

   public flk<Integer> ak() {
      return this.bV;
   }

   public flk<Boolean> al() {
      return this.bX;
   }

   public flk<Double> am() {
      return this.bZ;
   }

   public flk<Double> an() {
      return this.cb;
   }

   public flk<Double> ao() {
      return this.cd;
   }

   public flk<Double> ap() {
      return this.cf;
   }

   public flk<Double> aq() {
      return this.ch;
   }

   public flk<Double> ar() {
      return this.cj;
   }

   public flk<Double> as() {
      return this.ck;
   }

   public flk<Integer> at() {
      return this.cm;
   }

   public flk<aqu> au() {
      return this.cn;
   }

   public flk<flj> av() {
      return this.co;
   }

   public flk<String> aw() {
      return this.cp;
   }

   public void ax() {
      this.ac = false;
      this.az();
   }

   public fll(flh $$0, File $$1) {
      this.W = $$0;
      this.bT = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ap = new flk<>(
         "options.renderDistance",
         flk.a(),
         ($$0x, $$1x) -> a($$0x, wo.a("options.chunks", $$1x)),
         new flk.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> flh.Q().f.p()
      );
      this.aq = new flk<>(
         "options.simulationDistance", flk.a(), ($$0x, $$1x) -> a($$0x, wo.a("options.chunks", $$1x)), new flk.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = af.m() == af.a.c;
      this.ay();
   }

   public float a(float $$0) {
      return this.bG.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return axj.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bG.c() ? $$0 : axj.a(this.aN.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(fll.b $$0) {
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

   private void a(fll.a $$0) {
      this.a((fll.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, fll::c, af::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fll::c, af::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, hkt::a, hkt::a);
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

      for (flf $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fen.a($$3));
         }
      }

      for (awa $$4 : awa.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bB.get($$4));
      }

      for (cow $$5 : cow.values()) {
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
               this.aB.a(fkz.b);
            } else {
               this.aB.a(fkz.a);
            }
         }

         this.a(new fll.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).u_() : null;
            }

            @Override
            public <T> void a(String $$0, flk<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fll.ae.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fll.ae.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fll.a($$2) : $$1;
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
               } else if (fll.a($$2)) {
                  return 1.0F;
               } else if (fll.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fll.ae.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         flf.d();
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

      return bam.e.a(this.W.au(), $$0, $$1);
   }

   public void az() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bT), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fll.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, flk<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> fll.ae.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(fll.af.toJson($$2));
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

   public aqn aA() {
      int $$0 = 0;

      for (cow $$1 : this.aU) {
         $$0 |= $$1.a();
      }

      return new aqn(this.ab, this.ap.c(), this.aH.c(), this.bn.c(), $$0, this.aV.c(), this.W.aT(), this.bz.c(), this.cn.c());
   }

   public void aB() {
      if (this.W.t != null) {
         this.W.t.j.a(this.aA());
      }
   }

   public void a(cow $$0, boolean $$1) {
      if ($$1) {
         this.aU.add($$0);
      } else {
         this.aU.remove($$0);
      }
   }

   public boolean a(cow $$0) {
      return this.aU.contains($$0);
   }

   public fkt aC() {
      return this.aH() >= 4 ? this.ax.c() : fkt.a;
   }

   public boolean aD() {
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

   public fkq aE() {
      return this.bU;
   }

   public void a(fkq $$0) {
      this.bU = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = ayo.a(af, $$0, ag);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aF() {
      return this.bT;
   }

   public String aG() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fll.b() {
         @Override
         public <T> void a(String $$0x, flk<T> $$1) {
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

   private static wo c(wo $$0, int $$1) {
      return wo.a("options.pixel_value", $$0, $$1);
   }

   private static wo a(wo $$0, double $$1) {
      return wo.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static wo a(wo $$0, wo $$1) {
      return wo.a("options.generic_value", $$0, $$1);
   }

   public static wo a(wo $$0, int $$1) {
      return a($$0, wo.b(Integer.toString($$1)));
   }

   public static wo b(wo $$0, int $$1) {
      return $$1 == 0 ? a($$0, wn.c) : a($$0, $$1);
   }

   private static wo b(wo $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, wn.c) : a($$0, $$1);
   }

   interface a extends fll.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, flk<T> var2);
   }
}
