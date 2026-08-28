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

public class fjm {
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
   private static final xi ai = xi.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fjl<Boolean> aj = fjl.a("options.darkMojangStudiosBackgroundColor", fjl.a(ai), false);
   private static final xi ak = xi.c("options.hideLightningFlashes.tooltip");
   private final fjl<Boolean> al = fjl.a("options.hideLightningFlashes", fjl.a(ak), false);
   private static final xi am = xi.c("options.hideSplashTexts.tooltip");
   private final fjl<Boolean> an = fjl.a("options.hideSplashTexts", fjl.a(am), false);
   private final fjl<Double> ao = new fjl<>("options.sensitivity", fjl.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xi.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xi.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fjl.m.a, 0.5, $$0x -> {
   });
   private final fjl<Integer> ap;
   private final fjl<Integer> aq;
   private int ar = 0;
   private final fjl<Double> as = new fjl<>(
      "options.entityDistanceScaling",
      fjl.a(),
      fjm::a,
      new fjl.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fjl<Integer> at = new fjl<>(
      "options.framerateLimit",
      fjl.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xi.c("options.framerateLimit.max")) : a($$0x, xi.a("options.framerate", $$1x)),
      new fjl.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fji.Q().aP().a($$0x)
   );
   private static final xi au = xi.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final xi av = xi.c("options.inactivityFpsLimit.afk.tooltip");
   private final fjl<fje> aw = new fjl<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> fms.a(au);
         case b -> fms.a(av);
      };
   }, fjl.b(), new fjl.e<>(Arrays.asList(fje.values()), fje.c), fje.b, $$0x -> {
   });
   private final fjl<fiu> ax = new fjl<>(
      "options.renderClouds",
      fjl.a(),
      fjl.b(),
      new fjl.e<>(Arrays.asList(fiu.values()), Codec.withAlternative(fiu.d, Codec.BOOL, $$0x -> $$0x ? fiu.c : fiu.a)),
      fiu.c,
      $$0x -> {
      }
   );
   private static final xi ay = xi.c("options.graphics.fast.tooltip");
   private static final xi az = xi.a("options.graphics.fabulous.tooltip", xi.c("options.graphics.fabulous").a(n.u));
   private static final xi aA = xi.c("options.graphics.fancy.tooltip");
   private final fjl<fja> aB = new fjl<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fms.a(aA);
            case a -> fms.a(ay);
            case c -> fms.a(az);
         };
      },
      ($$0x, $$1x) -> {
         xw $$2x = xi.c($$1x.a());
         return $$1x == fja.c ? $$2x.a(n.u) : $$2x;
      },
      new fjl.a<>(
         Arrays.asList(fja.values()),
         Stream.of(fja.values()).filter($$0x -> $$0x != fja.c).collect(Collectors.toList()),
         () -> fji.Q().r() && fji.Q().aj().h(),
         ($$0x, $$1x) -> {
            fji $$2x = fji.Q();
            ghy $$3 = $$2x.aj();
            if ($$1x == fja.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.e();
            }
         },
         Codec.INT.xmap(fja::a, fja::b)
      ),
      fja.b,
      $$0x -> {
      }
   );
   private final fjl<Boolean> aC = fjl.a("options.ao", true, $$0x -> fji.Q().f.e());
   private static final xi aD = xi.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xi aE = xi.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xi aF = xi.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fjl<fjo> aG = new fjl<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fms.a(aD);
         case b -> fms.a(aE);
         case c -> fms.a(aF);
      };
   }, fjl.b(), new fjl.e<>(Arrays.asList(fjo.values()), Codec.INT.xmap(fjo::a, fjo::b)), fjo.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fjl<coj> aH = new fjl<>(
      "options.chat.visibility", fjl.a(), fjl.b(), new fjl.e<>(Arrays.asList(coj.values()), Codec.INT.xmap(coj::a, coj::b)), coj.a, $$0x -> {
      }
   );
   private final fjl<Double> aI = new fjl<>("options.chat.opacity", fjl.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fjl.m.a, 1.0, $$0x -> fji.Q().m.d().b());
   private final fjl<Double> aJ = new fjl<>("options.chat.line_spacing", fjl.a(), fjm::a, fjl.m.a, 0.0, $$0x -> {
   });
   private static final xi aK = xi.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aL = 5;
   private final fjl<Integer> aM = new fjl<>("options.accessibility.menu_background_blurriness", fjl.a(aK), fjm::b, new fjl.f(0, 10), 5, $$0x -> {
   });
   private final fjl<Double> aN = new fjl<>("options.accessibility.text_background_opacity", fjl.a(), fjm::a, fjl.m.a, 0.5, $$0x -> fji.Q().m.d().b());
   private final fjl<Double> aO = new fjl<>("options.accessibility.panorama_speed", fjl.a(), fjm::a, fjl.m.a, 1.0, $$0x -> {
   });
   private static final xi aP = xi.c("options.accessibility.high_contrast.tooltip");
   private final fjl<Boolean> aQ = fjl.a("options.accessibility.high_contrast", fjl.a(aP), false, $$0x -> {
      aul $$1x = fji.Q().ad();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final fjl<Boolean> aR = fjl.a(
      "options.accessibility.narrator_hotkey",
      fjl.a(fji.a ? xi.c("options.accessibility.narrator_hotkey.mac.tooltip") : xi.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<coo> aS = EnumSet.allOf(coo.class);
   private final fjl<buu> aT = new fjl<>("options.mainHand", fjl.a(), fjl.b(), new fjl.e<>(Arrays.asList(buu.values()), buu.c), buu.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fjl<Double> aU = new fjl<>(
      "options.chat.scale",
      fjl.a(),
      ($$0x, $$1x) -> (xi)($$1x == 0.0 ? xh.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fjl.m.a,
      1.0,
      $$0x -> fji.Q().m.d().b()
   );
   private final fjl<Double> aV = new fjl<>("options.chat.width", fjl.a(), ($$0x, $$1x) -> c($$0x, fli.a($$1x)), fjl.m.a, 1.0, $$0x -> fji.Q().m.d().b());
   private final fjl<Double> aW = new fjl<>(
      "options.chat.height.unfocused", fjl.a(), ($$0x, $$1x) -> c($$0x, fli.b($$1x)), fjl.m.a, fli.i(), $$0x -> fji.Q().m.d().b()
   );
   private final fjl<Double> aX = new fjl<>(
      "options.chat.height.focused", fjl.a(), ($$0x, $$1x) -> c($$0x, fli.b($$1x)), fjl.m.a, 1.0, $$0x -> fji.Q().m.d().b()
   );
   private final fjl<Double> aY = new fjl<>(
      "options.chat.delay_instant",
      fjl.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xi.c("options.chat.delay_none") : xi.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fjl.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fji.Q().ba().a($$0x)
   );
   private static final xi aZ = xi.c("options.notifications.display_time.tooltip");
   private final fjl<Double> ba = new fjl<>(
      "options.notifications.display_time",
      fjl.a(aZ),
      ($$0x, $$1x) -> a($$0x, xi.a("options.multiplier", $$1x)),
      new fjl.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fjl<Integer> bb = new fjl<>(
      "options.mipmapLevels", fjl.a(), ($$0x, $$1x) -> (xi)($$1x == 0 ? xh.a($$0x, false) : a($$0x, $$1x.intValue())), new fjl.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fjl<fiq> bc = new fjl<>(
      "options.attackIndicator", fjl.a(), fjl.b(), new fjl.e<>(Arrays.asList(fiq.values()), Codec.INT.xmap(fiq::a, fiq::b)), fiq.b, $$0x -> {
      }
   );
   public hej r = hej.a;
   public boolean s = false;
   private final fjl<Integer> bd = new fjl<>("options.biomeBlendRadius", fjl.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xi.c("options.biomeBlendRadius." + $$2x));
   }, new fjl.f(0, 7, false), 2, $$0x -> fji.Q().f.e());
   private final fjl<Double> be = new fjl<>(
      "options.mouseWheelSensitivity",
      fjl.a(),
      ($$0x, $$1x) -> a($$0x, xi.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fjl.f(-200, 100).a(fjm::c, fjm::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fjl<Boolean> bf = fjl.a("options.rawMouseInput", true, $$0x -> {
      fde $$1x = fji.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fjl<Boolean> bg = fjl.a("options.autoJump", false);
   private static final xi bh = xi.c("options.rotateWithMinecart.tooltip");
   private final fjl<Boolean> bi = fjl.a("options.rotateWithMinecart", fjl.a(bh), false);
   private final fjl<Boolean> bj = fjl.a("options.operatorItemsTab", false);
   private final fjl<Boolean> bk = fjl.a("options.autoSuggestCommands", true);
   private final fjl<Boolean> bl = fjl.a("options.chat.color", true);
   private final fjl<Boolean> bm = fjl.a("options.chat.links", true);
   private final fjl<Boolean> bn = fjl.a("options.chat.links.prompt", true);
   private final fjl<Boolean> bo = fjl.a("options.vsync", true, $$0x -> {
      if (fji.Q().aO() != null) {
         fji.Q().aO().a($$0x);
      }
   });
   private final fjl<Boolean> bp = fjl.a("options.entityShadows", true);
   private final fjl<Boolean> bq = fjl.a("options.forceUnicodeFont", false, $$0x -> aH());
   private final fjl<Boolean> br = fjl.a("options.japaneseGlyphVariants", fjl.a(xi.c("options.japaneseGlyphVariants.tooltip")), aI(), $$0x -> aH());
   private final fjl<Boolean> bs = fjl.a("options.invertMouse", false);
   private final fjl<Boolean> bt = fjl.a("options.discrete_mouse_scroll", false);
   private static final xi bu = xi.c("options.realmsNotifications.tooltip");
   private final fjl<Boolean> bv = fjl.a("options.realmsNotifications", fjl.a(bu), true);
   private static final xi bw = xi.c("options.allowServerListing.tooltip");
   private final fjl<Boolean> bx = fjl.a("options.allowServerListing", fjl.a(bw), true, $$0x -> {
   });
   private final fjl<Boolean> by = fjl.a("options.reducedDebugInfo", false);
   private final Map<awm, fjl<Double>> bz = ae.a(new EnumMap<>(awm.class), $$0x -> {
      for (awm $$1x : awm.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fjl<Boolean> bA = fjl.a("options.showSubtitles", false);
   private static final xi bB = xi.c("options.directionalAudio.on.tooltip");
   private static final xi bC = xi.c("options.directionalAudio.off.tooltip");
   private final fjl<Boolean> bD = fjl.a("options.directionalAudio", $$0x -> $$0x ? fms.a(bB) : fms.a(bC), false, $$0x -> {
      hdf $$1x = fji.Q().ak();
      $$1x.k();
      $$1x.a(hbv.a(awl.Av, 1.0F));
   });
   private final fjl<Boolean> bE = new fjl<>(
      "options.accessibility.text_background",
      fjl.a(),
      ($$0x, $$1x) -> $$1x ? xi.c("options.accessibility.text_background.chat") : xi.c("options.accessibility.text_background.everywhere"),
      fjl.a,
      true,
      $$0x -> {
      }
   );
   private final fjl<Boolean> bF = fjl.a("options.touchscreen", false);
   private final fjl<Boolean> bG = fjl.a("options.fullscreen", false, $$0x -> {
      fji $$1x = fji.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ac().a($$1x.aO().i());
      }
   });
   private final fjl<Boolean> bH = fjl.a("options.viewBobbing", true);
   private static final xi bI = xi.c("options.key.toggle");
   private static final xi bJ = xi.c("options.key.hold");
   private final fjl<Boolean> bK = new fjl<>("key.sneak", fjl.a(), ($$0x, $$1x) -> $$1x ? bI : bJ, fjl.a, false, $$0x -> {
   });
   private final fjl<Boolean> bL = new fjl<>("key.sprint", fjl.a(), ($$0x, $$1x) -> $$1x ? bI : bJ, fjl.a, false, $$0x -> {
   });
   public boolean u;
   private static final xi bM = xi.c("options.hideMatchedNames.tooltip");
   private final fjl<Boolean> bN = fjl.a("options.hideMatchedNames", fjl.a(bM), true);
   private final fjl<Boolean> bO = fjl.a("options.autosaveIndicator", true);
   private static final xi bP = xi.c("options.onlyShowSecureChat.tooltip");
   private final fjl<Boolean> bQ = fjl.a("options.onlyShowSecureChat", fjl.a(bP), false);
   public final fjg v = new fjg("key.forward", 87, "key.categories.movement");
   public final fjg w = new fjg("key.left", 65, "key.categories.movement");
   public final fjg x = new fjg("key.back", 83, "key.categories.movement");
   public final fjg y = new fjg("key.right", 68, "key.categories.movement");
   public final fjg z = new fjg("key.jump", 32, "key.categories.movement");
   public final fjg A = new fju("key.sneak", 340, "key.categories.movement", this.bK::c);
   public final fjg B = new fju("key.sprint", 341, "key.categories.movement", this.bL::c);
   public final fjg C = new fjg("key.inventory", 69, "key.categories.inventory");
   public final fjg D = new fjg("key.swapOffhand", 70, "key.categories.inventory");
   public final fjg E = new fjg("key.drop", 81, "key.categories.inventory");
   public final fjg F = new fjg("key.use", fcw.b.c, 1, "key.categories.gameplay");
   public final fjg G = new fjg("key.attack", fcw.b.c, 0, "key.categories.gameplay");
   public final fjg H = new fjg("key.pickItem", fcw.b.c, 2, "key.categories.gameplay");
   public final fjg I = new fjg("key.chat", 84, "key.categories.multiplayer");
   public final fjg J = new fjg("key.playerlist", 258, "key.categories.multiplayer");
   public final fjg K = new fjg("key.command", 47, "key.categories.multiplayer");
   public final fjg L = new fjg("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fjg M = new fjg("key.screenshot", 291, "key.categories.misc");
   public final fjg N = new fjg("key.togglePerspective", 294, "key.categories.misc");
   public final fjg O = new fjg("key.smoothCamera", fcw.bv.b(), "key.categories.misc");
   public final fjg P = new fjg("key.fullscreen", 300, "key.categories.misc");
   public final fjg Q = new fjg("key.spectatorOutlines", fcw.bv.b(), "key.categories.misc");
   public final fjg R = new fjg("key.advancements", 76, "key.categories.misc");
   public final fjg[] S = new fjg[]{
      new fjg("key.hotbar.1", 49, "key.categories.inventory"),
      new fjg("key.hotbar.2", 50, "key.categories.inventory"),
      new fjg("key.hotbar.3", 51, "key.categories.inventory"),
      new fjg("key.hotbar.4", 52, "key.categories.inventory"),
      new fjg("key.hotbar.5", 53, "key.categories.inventory"),
      new fjg("key.hotbar.6", 54, "key.categories.inventory"),
      new fjg("key.hotbar.7", 55, "key.categories.inventory"),
      new fjg("key.hotbar.8", 56, "key.categories.inventory"),
      new fjg("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fjg T = new fjg("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fjg U = new fjg("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fjg[] V = (fjg[])ArrayUtils.addAll(
      new fjg[]{
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
   protected fji W;
   private final File bR;
   public boolean X;
   private fis bS = fis.a;
   public String Y = "";
   public boolean Z;
   private final fjl<Integer> bT = new fjl<>("options.fov", fjl.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xi.c("options.fov.min"));
         case 110 -> a($$0x, xi.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fjl.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fji.Q().f.p());
   private static final xi bU = xi.a("options.telemetry.button.tooltip", xi.c("options.telemetry.state.minimal"), xi.c("options.telemetry.state.all"));
   private final fjl<Boolean> bV = fjl.a("options.telemetry.button", fjl.a(bU), ($$0x, $$1x) -> {
      fji $$2x = fji.Q();
      if (!$$2x.E()) {
         return xi.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xi.c("options.telemetry.state.all") : xi.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xi bW = xi.c("options.screenEffectScale.tooltip");
   private final fjl<Double> bX = new fjl<>("options.screenEffectScale", fjl.a(bW), fjm::b, fjl.m.a, 1.0, $$0x -> {
   });
   private static final xi bY = xi.c("options.fovEffectScale.tooltip");
   private final fjl<Double> bZ = new fjl<>(
      "options.fovEffectScale", fjl.a(bY), fjm::b, fjl.m.a.a(azk::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final xi ca = xi.c("options.darknessEffectScale.tooltip");
   private final fjl<Double> cb = new fjl<>("options.darknessEffectScale", fjl.a(ca), fjm::b, fjl.m.a.a(azk::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final xi cc = xi.c("options.glintSpeed.tooltip");
   private final fjl<Double> cd = new fjl<>("options.glintSpeed", fjl.a(cc), fjm::b, fjl.m.a, 0.5, $$0x -> {
   });
   private static final xi ce = xi.c("options.glintStrength.tooltip");
   private final fjl<Double> cf = new fjl<>("options.glintStrength", fjl.a(ce), fjm::b, fjl.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final xi cg = xi.c("options.damageTiltStrength.tooltip");
   private final fjl<Double> ch = new fjl<>("options.damageTiltStrength", fjl.a(cg), fjm::b, fjl.m.a, 1.0, $$0x -> {
   });
   private final fjl<Double> ci = new fjl<>("options.gamma", fjl.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xi.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xi.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xi.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fjl.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cj = 2147483646;
   private final fjl<Integer> ck = new fjl<>(
      "options.guiScale", fjl.a(), ($$0x, $$1x) -> $$1x == 0 ? xi.c("options.guiScale.auto") : xi.b(Integer.toString($$1x)), new fjl.c(0, () -> {
         fji $$0x = fji.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fjl<arg> cl = new fjl<>(
      "options.particles", fjl.a(), fjl.b(), new fjl.e<>(Arrays.asList(arg.values()), Codec.INT.xmap(arg::a, arg::b)), arg.a, $$0x -> {
      }
   );
   private final fjl<fjk> cm = new fjl<>(
      "options.narrator",
      fjl.a(),
      ($$0x, $$1x) -> (xi)(this.W.aZ().a() ? $$1x.b() : xi.c("options.narrator.notavailable")),
      new fjl.e<>(Arrays.asList(fjk.values()), Codec.INT.xmap(fjk::a, fjk::a)),
      fjk.a,
      $$0x -> this.W.aZ().a($$0x)
   );
   public String ab = "en_us";
   private final fjl<String> cn = new fjl<>(
      "options.audioDevice",
      fjl.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xi.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xi.b($$1x.substring(hdc.c)) : xi.b($$1x);
         }
      },
      new fjl.h<>(
         () -> Stream.concat(Stream.of(""), fji.Q().ak().a().stream()).toList(),
         $$0x -> fji.Q().r() && $$0x != "" && !fji.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hdf $$1x = fji.Q().ak();
         $$1x.k();
         $$1x.a(hbv.a(awl.Av, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;

   public fjl<Boolean> a() {
      return this.aj;
   }

   public fjl<Boolean> b() {
      return this.al;
   }

   public fjl<Boolean> c() {
      return this.an;
   }

   public fjl<Double> d() {
      return this.ao;
   }

   public fjl<Integer> e() {
      return this.ap;
   }

   public fjl<Integer> f() {
      return this.aq;
   }

   public fjl<Double> g() {
      return this.as;
   }

   public fjl<Integer> h() {
      return this.at;
   }

   public fjl<fje> i() {
      return this.aw;
   }

   public fjl<fiu> j() {
      return this.ax;
   }

   public fjl<fja> k() {
      return this.aB;
   }

   public fjl<Boolean> l() {
      return this.aC;
   }

   public fjl<fjo> m() {
      return this.aG;
   }

   public void a(aul $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (aui $$2 : $$0.g()) {
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

   public fjl<coj> n() {
      return this.aH;
   }

   public fjl<Double> o() {
      return this.aI;
   }

   public fjl<Double> p() {
      return this.aJ;
   }

   public fjl<Integer> q() {
      return this.aM;
   }

   public int r() {
      return this.q().c();
   }

   public fjl<Double> s() {
      return this.aN;
   }

   public fjl<Double> t() {
      return this.aO;
   }

   public fjl<Boolean> u() {
      return this.aQ;
   }

   public fjl<Boolean> v() {
      return this.aR;
   }

   public fjl<buu> w() {
      return this.aT;
   }

   public fjl<Double> x() {
      return this.aU;
   }

   public fjl<Double> y() {
      return this.aV;
   }

   public fjl<Double> z() {
      return this.aW;
   }

   public fjl<Double> A() {
      return this.aX;
   }

   public fjl<Double> B() {
      return this.aY;
   }

   public fjl<Double> C() {
      return this.ba;
   }

   public fjl<Integer> D() {
      return this.bb;
   }

   public fjl<fiq> E() {
      return this.bc;
   }

   public fjl<Integer> F() {
      return this.bd;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return azk.a(Math.log10($$0) * 100.0);
   }

   public fjl<Double> G() {
      return this.be;
   }

   public fjl<Boolean> H() {
      return this.bf;
   }

   public fjl<Boolean> I() {
      return this.bg;
   }

   public fjl<Boolean> J() {
      return this.bi;
   }

   public fjl<Boolean> K() {
      return this.bj;
   }

   public fjl<Boolean> L() {
      return this.bk;
   }

   public fjl<Boolean> M() {
      return this.bl;
   }

   public fjl<Boolean> N() {
      return this.bm;
   }

   public fjl<Boolean> O() {
      return this.bn;
   }

   public fjl<Boolean> P() {
      return this.bo;
   }

   public fjl<Boolean> Q() {
      return this.bp;
   }

   private static void aH() {
      fji $$0 = fji.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fjl<Boolean> R() {
      return this.bq;
   }

   private static boolean aI() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fjl<Boolean> S() {
      return this.br;
   }

   public fjl<Boolean> T() {
      return this.bs;
   }

   public fjl<Boolean> U() {
      return this.bt;
   }

   public fjl<Boolean> V() {
      return this.bv;
   }

   public fjl<Boolean> W() {
      return this.bx;
   }

   public fjl<Boolean> X() {
      return this.by;
   }

   public final float a(awm $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fjl<Double> b(awm $$0) {
      return Objects.requireNonNull(this.bz.get($$0));
   }

   private fjl<Double> a(String $$0, awm $$1) {
      return new fjl<>($$0, fjl.a(), fjm::b, fjl.m.a, 1.0, $$1x -> fji.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fjl<Boolean> Y() {
      return this.bA;
   }

   public fjl<Boolean> Z() {
      return this.bD;
   }

   public fjl<Boolean> aa() {
      return this.bE;
   }

   public fjl<Boolean> ab() {
      return this.bF;
   }

   public fjl<Boolean> ac() {
      return this.bG;
   }

   public fjl<Boolean> ad() {
      return this.bH;
   }

   public fjl<Boolean> ae() {
      return this.bK;
   }

   public fjl<Boolean> af() {
      return this.bL;
   }

   public fjl<Boolean> ag() {
      return this.bN;
   }

   public fjl<Boolean> ah() {
      return this.bO;
   }

   public fjl<Boolean> ai() {
      return this.bQ;
   }

   public fjl<Integer> aj() {
      return this.bT;
   }

   public fjl<Boolean> ak() {
      return this.bV;
   }

   public fjl<Double> al() {
      return this.bX;
   }

   public fjl<Double> am() {
      return this.bZ;
   }

   public fjl<Double> an() {
      return this.cb;
   }

   public fjl<Double> ao() {
      return this.cd;
   }

   public fjl<Double> ap() {
      return this.cf;
   }

   public fjl<Double> aq() {
      return this.ch;
   }

   public fjl<Double> ar() {
      return this.ci;
   }

   public fjl<Integer> as() {
      return this.ck;
   }

   public fjl<arg> at() {
      return this.cl;
   }

   public fjl<fjk> au() {
      return this.cm;
   }

   public fjl<String> av() {
      return this.cn;
   }

   public void aw() {
      this.ac = false;
      this.ay();
   }

   public fjm(fji $$0, File $$1) {
      this.W = $$0;
      this.bR = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ap = new fjl<>(
         "options.renderDistance",
         fjl.a(),
         ($$0x, $$1x) -> a($$0x, xi.a("options.chunks", $$1x)),
         new fjl.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fji.Q().f.p()
      );
      this.aq = new fjl<>(
         "options.simulationDistance", fjl.a(), ($$0x, $$1x) -> a($$0x, xi.a("options.chunks", $$1x)), new fjl.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = ae.m() == ae.a.c;
      this.ax();
   }

   public float a(float $$0) {
      return this.bE.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return axv.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bE.c() ? $$0 : axv.a(this.aN.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(fjm.b $$0) {
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

   private void a(fjm.a $$0) {
      this.a((fjm.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, fjm::c, af::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fjm::c, af::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, hej::a, hej::a);
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

      for (fjg $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fcw.a($$3));
         }
      }

      for (awm $$4 : awm.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bz.get($$4));
      }

      for (coo $$5 : coo.values()) {
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

         uk $$0 = new uk();

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

         final uk $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(fja.b);
            } else {
               this.aB.a(fja.a);
            }
         }

         this.a(new fjm.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).s_() : null;
            }

            @Override
            public <T> void a(String $$0, fjl<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fjm.ae.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fjm.ae.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fjm.a($$2) : $$1;
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
               } else if (fjm.a($$2)) {
                  return 1.0F;
               } else if (fjm.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fjm.ae.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fjg.d();
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

   private uk a(uk $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return bat.e.a(this.W.au(), $$0, $$1);
   }

   public void ay() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bR), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fjm.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fjl<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> fjm.ae.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(fjm.af.toJson($$2));
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

   public aqz az() {
      int $$0 = 0;

      for (coo $$1 : this.aS) {
         $$0 |= $$1.a();
      }

      return new aqz(this.ab, this.ap.c(), this.aH.c(), this.bl.c(), $$0, this.aT.c(), this.W.aU(), this.bx.c(), this.cl.c());
   }

   public void aA() {
      if (this.W.t != null) {
         this.W.t.j.a(this.az());
      }
   }

   public void a(coo $$0, boolean $$1) {
      if ($$1) {
         this.aS.add($$0);
      } else {
         this.aS.remove($$0);
      }
   }

   public boolean a(coo $$0) {
      return this.aS.contains($$0);
   }

   public fiu aB() {
      return this.aG() >= 4 ? this.ax.c() : fiu.a;
   }

   public boolean aC() {
      return this.q;
   }

   public void b(aul $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         aui $$4 = $$0.c($$3);
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

   public fis aD() {
      return this.bS;
   }

   public void a(fis $$0) {
      this.bS = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = aza.a(af, $$0, ag);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aE() {
      return this.bR;
   }

   public String aF() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fjm.b() {
         @Override
         public <T> void a(String $$0x, fjl<T> $$1) {
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

   private static xi c(xi $$0, int $$1) {
      return xi.a("options.pixel_value", $$0, $$1);
   }

   private static xi a(xi $$0, double $$1) {
      return xi.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static xi a(xi $$0, xi $$1) {
      return xi.a("options.generic_value", $$0, $$1);
   }

   public static xi a(xi $$0, int $$1) {
      return a($$0, xi.b(Integer.toString($$1)));
   }

   public static xi b(xi $$0, int $$1) {
      return $$1 == 0 ? a($$0, xh.c) : a($$0, $$1);
   }

   private static xi b(xi $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, xh.c) : a($$0, $$1);
   }

   interface a extends fjm.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fjl<T> var2);
   }
}
