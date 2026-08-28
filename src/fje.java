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

public class fje {
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
   private static final xh ai = xh.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fjd<Boolean> aj = fjd.a("options.darkMojangStudiosBackgroundColor", fjd.a(ai), false);
   private static final xh ak = xh.c("options.hideLightningFlashes.tooltip");
   private final fjd<Boolean> al = fjd.a("options.hideLightningFlashes", fjd.a(ak), false);
   private static final xh am = xh.c("options.hideSplashTexts.tooltip");
   private final fjd<Boolean> an = fjd.a("options.hideSplashTexts", fjd.a(am), false);
   private final fjd<Double> ao = new fjd<>("options.sensitivity", fjd.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xh.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xh.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fjd.m.a, 0.5, $$0x -> {
   });
   private final fjd<Integer> ap;
   private final fjd<Integer> aq;
   private int ar = 0;
   private final fjd<Double> as = new fjd<>(
      "options.entityDistanceScaling",
      fjd.a(),
      fje::a,
      new fjd.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fjd<Integer> at = new fjd<>(
      "options.framerateLimit",
      fjd.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xh.c("options.framerateLimit.max")) : a($$0x, xh.a("options.framerate", $$1x)),
      new fjd.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fja.Q().aQ().a($$0x)
   );
   private static final xh au = xh.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final xh av = xh.c("options.inactivityFpsLimit.afk.tooltip");
   private final fjd<fiw> aw = new fjd<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> fmk.a(au);
         case b -> fmk.a(av);
      };
   }, fjd.b(), new fjd.e<>(Arrays.asList(fiw.values()), fiw.c), fiw.b, $$0x -> {
   });
   private final fjd<fim> ax = new fjd<>(
      "options.renderClouds",
      fjd.a(),
      fjd.b(),
      new fjd.e<>(Arrays.asList(fim.values()), Codec.withAlternative(fim.d, Codec.BOOL, $$0x -> $$0x ? fim.c : fim.a)),
      fim.c,
      $$0x -> {
      }
   );
   private static final xh ay = xh.c("options.graphics.fast.tooltip");
   private static final xh az = xh.a("options.graphics.fabulous.tooltip", xh.c("options.graphics.fabulous").a(n.u));
   private static final xh aA = xh.c("options.graphics.fancy.tooltip");
   private final fjd<fis> aB = new fjd<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fmk.a(aA);
            case a -> fmk.a(ay);
            case c -> fmk.a(az);
         };
      },
      ($$0x, $$1x) -> {
         xv $$2x = xh.c($$1x.a());
         return $$1x == fis.c ? $$2x.a(n.u) : $$2x;
      },
      new fjd.a<>(
         Arrays.asList(fis.values()),
         Stream.of(fis.values()).filter($$0x -> $$0x != fis.c).collect(Collectors.toList()),
         () -> fja.Q().r() && fja.Q().aj().h(),
         ($$0x, $$1x) -> {
            fja $$2x = fja.Q();
            ghn $$3 = $$2x.aj();
            if ($$1x == fis.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.e();
            }
         },
         Codec.INT.xmap(fis::a, fis::b)
      ),
      fis.b,
      $$0x -> {
      }
   );
   private final fjd<Boolean> aC = fjd.a("options.ao", true, $$0x -> fja.Q().f.e());
   private static final xh aD = xh.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xh aE = xh.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xh aF = xh.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fjd<fjg> aG = new fjd<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fmk.a(aD);
         case b -> fmk.a(aE);
         case c -> fmk.a(aF);
      };
   }, fjd.b(), new fjd.e<>(Arrays.asList(fjg.values()), Codec.INT.xmap(fjg::a, fjg::b)), fjg.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fjd<coe> aH = new fjd<>(
      "options.chat.visibility", fjd.a(), fjd.b(), new fjd.e<>(Arrays.asList(coe.values()), Codec.INT.xmap(coe::a, coe::b)), coe.a, $$0x -> {
      }
   );
   private final fjd<Double> aI = new fjd<>("options.chat.opacity", fjd.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fjd.m.a, 1.0, $$0x -> fja.Q().m.d().b());
   private final fjd<Double> aJ = new fjd<>("options.chat.line_spacing", fjd.a(), fje::a, fjd.m.a, 0.0, $$0x -> {
   });
   private static final xh aK = xh.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aL = 5;
   private final fjd<Integer> aM = new fjd<>("options.accessibility.menu_background_blurriness", fjd.a(aK), fje::b, new fjd.f(0, 10), 5, $$0x -> {
   });
   private final fjd<Double> aN = new fjd<>("options.accessibility.text_background_opacity", fjd.a(), fje::a, fjd.m.a, 0.5, $$0x -> fja.Q().m.d().b());
   private final fjd<Double> aO = new fjd<>("options.accessibility.panorama_speed", fjd.a(), fje::a, fjd.m.a, 1.0, $$0x -> {
   });
   private static final xh aP = xh.c("options.accessibility.high_contrast.tooltip");
   private final fjd<Boolean> aQ = fjd.a("options.accessibility.high_contrast", fjd.a(aP), false, $$0x -> {
      auk $$1x = fja.Q().ad();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final fjd<Boolean> aR = fjd.a(
      "options.accessibility.narrator_hotkey",
      fjd.a(fja.a ? xh.c("options.accessibility.narrator_hotkey.mac.tooltip") : xh.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<coi> aS = EnumSet.allOf(coi.class);
   private final fjd<bup> aT = new fjd<>("options.mainHand", fjd.a(), fjd.b(), new fjd.e<>(Arrays.asList(bup.values()), bup.c), bup.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fjd<Double> aU = new fjd<>(
      "options.chat.scale",
      fjd.a(),
      ($$0x, $$1x) -> (xh)($$1x == 0.0 ? xg.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fjd.m.a,
      1.0,
      $$0x -> fja.Q().m.d().b()
   );
   private final fjd<Double> aV = new fjd<>("options.chat.width", fjd.a(), ($$0x, $$1x) -> c($$0x, fla.a($$1x)), fjd.m.a, 1.0, $$0x -> fja.Q().m.d().b());
   private final fjd<Double> aW = new fjd<>(
      "options.chat.height.unfocused", fjd.a(), ($$0x, $$1x) -> c($$0x, fla.b($$1x)), fjd.m.a, fla.i(), $$0x -> fja.Q().m.d().b()
   );
   private final fjd<Double> aX = new fjd<>(
      "options.chat.height.focused", fjd.a(), ($$0x, $$1x) -> c($$0x, fla.b($$1x)), fjd.m.a, 1.0, $$0x -> fja.Q().m.d().b()
   );
   private final fjd<Double> aY = new fjd<>(
      "options.chat.delay_instant",
      fjd.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xh.c("options.chat.delay_none") : xh.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fjd.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fja.Q().bb().a($$0x)
   );
   private static final xh aZ = xh.c("options.notifications.display_time.tooltip");
   private final fjd<Double> ba = new fjd<>(
      "options.notifications.display_time",
      fjd.a(aZ),
      ($$0x, $$1x) -> a($$0x, xh.a("options.multiplier", $$1x)),
      new fjd.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fjd<Integer> bb = new fjd<>(
      "options.mipmapLevels", fjd.a(), ($$0x, $$1x) -> (xh)($$1x == 0 ? xg.a($$0x, false) : a($$0x, $$1x.intValue())), new fjd.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fjd<fii> bc = new fjd<>(
      "options.attackIndicator", fjd.a(), fjd.b(), new fjd.e<>(Arrays.asList(fii.values()), Codec.INT.xmap(fii::a, fii::b)), fii.b, $$0x -> {
      }
   );
   public hdy r = hdy.a;
   public boolean s = false;
   private final fjd<Integer> bd = new fjd<>("options.biomeBlendRadius", fjd.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xh.c("options.biomeBlendRadius." + $$2x));
   }, new fjd.f(0, 7, false), 2, $$0x -> fja.Q().f.e());
   private final fjd<Double> be = new fjd<>(
      "options.mouseWheelSensitivity",
      fjd.a(),
      ($$0x, $$1x) -> a($$0x, xh.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fjd.f(-200, 100).a(fje::c, fje::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fjd<Boolean> bf = fjd.a("options.rawMouseInput", true, $$0x -> {
      fcw $$1x = fja.Q().aP();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fjd<Boolean> bg = fjd.a("options.autoJump", false);
   private static final xh bh = xh.c("options.rotateWithMinecart.tooltip");
   private final fjd<Boolean> bi = fjd.a("options.rotateWithMinecart", fjd.a(bh), false);
   private final fjd<Boolean> bj = fjd.a("options.operatorItemsTab", false);
   private final fjd<Boolean> bk = fjd.a("options.autoSuggestCommands", true);
   private final fjd<Boolean> bl = fjd.a("options.chat.color", true);
   private final fjd<Boolean> bm = fjd.a("options.chat.links", true);
   private final fjd<Boolean> bn = fjd.a("options.chat.links.prompt", true);
   private final fjd<Boolean> bo = fjd.a("options.vsync", true, $$0x -> {
      if (fja.Q().aP() != null) {
         fja.Q().aP().a($$0x);
      }
   });
   private final fjd<Boolean> bp = fjd.a("options.entityShadows", true);
   private final fjd<Boolean> bq = fjd.a("options.forceUnicodeFont", false, $$0x -> aH());
   private final fjd<Boolean> br = fjd.a("options.japaneseGlyphVariants", fjd.a(xh.c("options.japaneseGlyphVariants.tooltip")), aI(), $$0x -> aH());
   private final fjd<Boolean> bs = fjd.a("options.invertMouse", false);
   private final fjd<Boolean> bt = fjd.a("options.discrete_mouse_scroll", false);
   private static final xh bu = xh.c("options.realmsNotifications.tooltip");
   private final fjd<Boolean> bv = fjd.a("options.realmsNotifications", fjd.a(bu), true);
   private static final xh bw = xh.c("options.allowServerListing.tooltip");
   private final fjd<Boolean> bx = fjd.a("options.allowServerListing", fjd.a(bw), true, $$0x -> {
   });
   private final fjd<Boolean> by = fjd.a("options.reducedDebugInfo", false);
   private final Map<awl, fjd<Double>> bz = ad.a(new EnumMap<>(awl.class), $$0x -> {
      for (awl $$1x : awl.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fjd<Boolean> bA = fjd.a("options.showSubtitles", false);
   private static final xh bB = xh.c("options.directionalAudio.on.tooltip");
   private static final xh bC = xh.c("options.directionalAudio.off.tooltip");
   private final fjd<Boolean> bD = fjd.a("options.directionalAudio", $$0x -> $$0x ? fmk.a(bB) : fmk.a(bC), false, $$0x -> {
      hcu $$1x = fja.Q().ak();
      $$1x.k();
      $$1x.a(hbk.a(awk.Av, 1.0F));
   });
   private final fjd<Boolean> bE = new fjd<>(
      "options.accessibility.text_background",
      fjd.a(),
      ($$0x, $$1x) -> $$1x ? xh.c("options.accessibility.text_background.chat") : xh.c("options.accessibility.text_background.everywhere"),
      fjd.a,
      true,
      $$0x -> {
      }
   );
   private final fjd<Boolean> bF = fjd.a("options.touchscreen", false);
   private final fjd<Boolean> bG = fjd.a("options.fullscreen", false, $$0x -> {
      fja $$1x = fja.Q();
      if ($$1x.aP() != null && $$1x.aP().j() != $$0x) {
         $$1x.aP().h();
         this.ac().a($$1x.aP().j());
      }
   });
   private final fjd<Boolean> bH = fjd.a("options.viewBobbing", true);
   private static final xh bI = xh.c("options.key.toggle");
   private static final xh bJ = xh.c("options.key.hold");
   private final fjd<Boolean> bK = new fjd<>("key.sneak", fjd.a(), ($$0x, $$1x) -> $$1x ? bI : bJ, fjd.a, false, $$0x -> {
   });
   private final fjd<Boolean> bL = new fjd<>("key.sprint", fjd.a(), ($$0x, $$1x) -> $$1x ? bI : bJ, fjd.a, false, $$0x -> {
   });
   public boolean u;
   private static final xh bM = xh.c("options.hideMatchedNames.tooltip");
   private final fjd<Boolean> bN = fjd.a("options.hideMatchedNames", fjd.a(bM), true);
   private final fjd<Boolean> bO = fjd.a("options.autosaveIndicator", true);
   private static final xh bP = xh.c("options.onlyShowSecureChat.tooltip");
   private final fjd<Boolean> bQ = fjd.a("options.onlyShowSecureChat", fjd.a(bP), false);
   public final fiy v = new fiy("key.forward", 87, "key.categories.movement");
   public final fiy w = new fiy("key.left", 65, "key.categories.movement");
   public final fiy x = new fiy("key.back", 83, "key.categories.movement");
   public final fiy y = new fiy("key.right", 68, "key.categories.movement");
   public final fiy z = new fiy("key.jump", 32, "key.categories.movement");
   public final fiy A = new fjm("key.sneak", 340, "key.categories.movement", this.bK::c);
   public final fiy B = new fjm("key.sprint", 341, "key.categories.movement", this.bL::c);
   public final fiy C = new fiy("key.inventory", 69, "key.categories.inventory");
   public final fiy D = new fiy("key.swapOffhand", 70, "key.categories.inventory");
   public final fiy E = new fiy("key.drop", 81, "key.categories.inventory");
   public final fiy F = new fiy("key.use", fco.b.c, 1, "key.categories.gameplay");
   public final fiy G = new fiy("key.attack", fco.b.c, 0, "key.categories.gameplay");
   public final fiy H = new fiy("key.pickItem", fco.b.c, 2, "key.categories.gameplay");
   public final fiy I = new fiy("key.chat", 84, "key.categories.multiplayer");
   public final fiy J = new fiy("key.playerlist", 258, "key.categories.multiplayer");
   public final fiy K = new fiy("key.command", 47, "key.categories.multiplayer");
   public final fiy L = new fiy("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fiy M = new fiy("key.screenshot", 291, "key.categories.misc");
   public final fiy N = new fiy("key.togglePerspective", 294, "key.categories.misc");
   public final fiy O = new fiy("key.smoothCamera", fco.bv.b(), "key.categories.misc");
   public final fiy P = new fiy("key.fullscreen", 300, "key.categories.misc");
   public final fiy Q = new fiy("key.spectatorOutlines", fco.bv.b(), "key.categories.misc");
   public final fiy R = new fiy("key.advancements", 76, "key.categories.misc");
   public final fiy[] S = new fiy[]{
      new fiy("key.hotbar.1", 49, "key.categories.inventory"),
      new fiy("key.hotbar.2", 50, "key.categories.inventory"),
      new fiy("key.hotbar.3", 51, "key.categories.inventory"),
      new fiy("key.hotbar.4", 52, "key.categories.inventory"),
      new fiy("key.hotbar.5", 53, "key.categories.inventory"),
      new fiy("key.hotbar.6", 54, "key.categories.inventory"),
      new fiy("key.hotbar.7", 55, "key.categories.inventory"),
      new fiy("key.hotbar.8", 56, "key.categories.inventory"),
      new fiy("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fiy T = new fiy("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fiy U = new fiy("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fiy[] V = (fiy[])ArrayUtils.addAll(
      new fiy[]{
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
   protected fja W;
   private final File bR;
   public boolean X;
   private fik bS = fik.a;
   public String Y = "";
   public boolean Z;
   private final fjd<Integer> bT = new fjd<>("options.fov", fjd.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xh.c("options.fov.min"));
         case 110 -> a($$0x, xh.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fjd.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fja.Q().f.p());
   private static final xh bU = xh.a("options.telemetry.button.tooltip", xh.c("options.telemetry.state.minimal"), xh.c("options.telemetry.state.all"));
   private final fjd<Boolean> bV = fjd.a("options.telemetry.button", fjd.a(bU), ($$0x, $$1x) -> {
      fja $$2x = fja.Q();
      if (!$$2x.E()) {
         return xh.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xh.c("options.telemetry.state.all") : xh.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xh bW = xh.c("options.screenEffectScale.tooltip");
   private final fjd<Double> bX = new fjd<>("options.screenEffectScale", fjd.a(bW), fje::b, fjd.m.a, 1.0, $$0x -> {
   });
   private static final xh bY = xh.c("options.fovEffectScale.tooltip");
   private final fjd<Double> bZ = new fjd<>(
      "options.fovEffectScale", fjd.a(bY), fje::b, fjd.m.a.a(azj::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final xh ca = xh.c("options.darknessEffectScale.tooltip");
   private final fjd<Double> cb = new fjd<>("options.darknessEffectScale", fjd.a(ca), fje::b, fjd.m.a.a(azj::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final xh cc = xh.c("options.glintSpeed.tooltip");
   private final fjd<Double> cd = new fjd<>("options.glintSpeed", fjd.a(cc), fje::b, fjd.m.a, 0.5, $$0x -> {
   });
   private static final xh ce = xh.c("options.glintStrength.tooltip");
   private final fjd<Double> cf = new fjd<>("options.glintStrength", fjd.a(ce), fje::b, fjd.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final xh cg = xh.c("options.damageTiltStrength.tooltip");
   private final fjd<Double> ch = new fjd<>("options.damageTiltStrength", fjd.a(cg), fje::b, fjd.m.a, 1.0, $$0x -> {
   });
   private final fjd<Double> ci = new fjd<>("options.gamma", fjd.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xh.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xh.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xh.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fjd.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cj = 2147483646;
   private final fjd<Integer> ck = new fjd<>(
      "options.guiScale", fjd.a(), ($$0x, $$1x) -> $$1x == 0 ? xh.c("options.guiScale.auto") : xh.b(Integer.toString($$1x)), new fjd.c(0, () -> {
         fja $$0x = fja.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aP().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fjd<arf> cl = new fjd<>(
      "options.particles", fjd.a(), fjd.b(), new fjd.e<>(Arrays.asList(arf.values()), Codec.INT.xmap(arf::a, arf::b)), arf.a, $$0x -> {
      }
   );
   private final fjd<fjc> cm = new fjd<>(
      "options.narrator",
      fjd.a(),
      ($$0x, $$1x) -> (xh)(this.W.ba().a() ? $$1x.b() : xh.c("options.narrator.notavailable")),
      new fjd.e<>(Arrays.asList(fjc.values()), Codec.INT.xmap(fjc::a, fjc::a)),
      fjc.a,
      $$0x -> this.W.ba().a($$0x)
   );
   public String ab = "en_us";
   private final fjd<String> cn = new fjd<>(
      "options.audioDevice",
      fjd.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xh.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xh.b($$1x.substring(hcr.c)) : xh.b($$1x);
         }
      },
      new fjd.h<>(
         () -> Stream.concat(Stream.of(""), fja.Q().ak().a().stream()).toList(),
         $$0x -> fja.Q().r() && $$0x != "" && !fja.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hcu $$1x = fja.Q().ak();
         $$1x.k();
         $$1x.a(hbk.a(awk.Av, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;

   public fjd<Boolean> a() {
      return this.aj;
   }

   public fjd<Boolean> b() {
      return this.al;
   }

   public fjd<Boolean> c() {
      return this.an;
   }

   public fjd<Double> d() {
      return this.ao;
   }

   public fjd<Integer> e() {
      return this.ap;
   }

   public fjd<Integer> f() {
      return this.aq;
   }

   public fjd<Double> g() {
      return this.as;
   }

   public fjd<Integer> h() {
      return this.at;
   }

   public fjd<fiw> i() {
      return this.aw;
   }

   public fjd<fim> j() {
      return this.ax;
   }

   public fjd<fis> k() {
      return this.aB;
   }

   public fjd<Boolean> l() {
      return this.aC;
   }

   public fjd<fjg> m() {
      return this.aG;
   }

   public void a(auk $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (auh $$2 : $$0.g()) {
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

   public fjd<coe> n() {
      return this.aH;
   }

   public fjd<Double> o() {
      return this.aI;
   }

   public fjd<Double> p() {
      return this.aJ;
   }

   public fjd<Integer> q() {
      return this.aM;
   }

   public int r() {
      return this.q().c();
   }

   public fjd<Double> s() {
      return this.aN;
   }

   public fjd<Double> t() {
      return this.aO;
   }

   public fjd<Boolean> u() {
      return this.aQ;
   }

   public fjd<Boolean> v() {
      return this.aR;
   }

   public fjd<bup> w() {
      return this.aT;
   }

   public fjd<Double> x() {
      return this.aU;
   }

   public fjd<Double> y() {
      return this.aV;
   }

   public fjd<Double> z() {
      return this.aW;
   }

   public fjd<Double> A() {
      return this.aX;
   }

   public fjd<Double> B() {
      return this.aY;
   }

   public fjd<Double> C() {
      return this.ba;
   }

   public fjd<Integer> D() {
      return this.bb;
   }

   public fjd<fii> E() {
      return this.bc;
   }

   public fjd<Integer> F() {
      return this.bd;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return azj.a(Math.log10($$0) * 100.0);
   }

   public fjd<Double> G() {
      return this.be;
   }

   public fjd<Boolean> H() {
      return this.bf;
   }

   public fjd<Boolean> I() {
      return this.bg;
   }

   public fjd<Boolean> J() {
      return this.bi;
   }

   public fjd<Boolean> K() {
      return this.bj;
   }

   public fjd<Boolean> L() {
      return this.bk;
   }

   public fjd<Boolean> M() {
      return this.bl;
   }

   public fjd<Boolean> N() {
      return this.bm;
   }

   public fjd<Boolean> O() {
      return this.bn;
   }

   public fjd<Boolean> P() {
      return this.bo;
   }

   public fjd<Boolean> Q() {
      return this.bp;
   }

   private static void aH() {
      fja $$0 = fja.Q();
      if ($$0.aP() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fjd<Boolean> R() {
      return this.bq;
   }

   private static boolean aI() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fjd<Boolean> S() {
      return this.br;
   }

   public fjd<Boolean> T() {
      return this.bs;
   }

   public fjd<Boolean> U() {
      return this.bt;
   }

   public fjd<Boolean> V() {
      return this.bv;
   }

   public fjd<Boolean> W() {
      return this.bx;
   }

   public fjd<Boolean> X() {
      return this.by;
   }

   public final float a(awl $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fjd<Double> b(awl $$0) {
      return Objects.requireNonNull(this.bz.get($$0));
   }

   private fjd<Double> a(String $$0, awl $$1) {
      return new fjd<>($$0, fjd.a(), fje::b, fjd.m.a, 1.0, $$1x -> fja.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fjd<Boolean> Y() {
      return this.bA;
   }

   public fjd<Boolean> Z() {
      return this.bD;
   }

   public fjd<Boolean> aa() {
      return this.bE;
   }

   public fjd<Boolean> ab() {
      return this.bF;
   }

   public fjd<Boolean> ac() {
      return this.bG;
   }

   public fjd<Boolean> ad() {
      return this.bH;
   }

   public fjd<Boolean> ae() {
      return this.bK;
   }

   public fjd<Boolean> af() {
      return this.bL;
   }

   public fjd<Boolean> ag() {
      return this.bN;
   }

   public fjd<Boolean> ah() {
      return this.bO;
   }

   public fjd<Boolean> ai() {
      return this.bQ;
   }

   public fjd<Integer> aj() {
      return this.bT;
   }

   public fjd<Boolean> ak() {
      return this.bV;
   }

   public fjd<Double> al() {
      return this.bX;
   }

   public fjd<Double> am() {
      return this.bZ;
   }

   public fjd<Double> an() {
      return this.cb;
   }

   public fjd<Double> ao() {
      return this.cd;
   }

   public fjd<Double> ap() {
      return this.cf;
   }

   public fjd<Double> aq() {
      return this.ch;
   }

   public fjd<Double> ar() {
      return this.ci;
   }

   public fjd<Integer> as() {
      return this.ck;
   }

   public fjd<arf> at() {
      return this.cl;
   }

   public fjd<fjc> au() {
      return this.cm;
   }

   public fjd<String> av() {
      return this.cn;
   }

   public void aw() {
      this.ac = false;
      this.ay();
   }

   public fje(fja $$0, File $$1) {
      this.W = $$0;
      this.bR = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ap = new fjd<>(
         "options.renderDistance",
         fjd.a(),
         ($$0x, $$1x) -> a($$0x, xh.a("options.chunks", $$1x)),
         new fjd.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fja.Q().f.p()
      );
      this.aq = new fjd<>(
         "options.simulationDistance", fjd.a(), ($$0x, $$1x) -> a($$0x, xh.a("options.chunks", $$1x)), new fjd.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = ad.m() == ad.a.c;
      this.ax();
   }

   public float a(float $$0) {
      return this.bE.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return axu.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bE.c() ? $$0 : axu.a(this.aN.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(fje.b $$0) {
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

   private void a(fje.a $$0) {
      this.a((fje.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, fje::c, af::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fje::c, af::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, hdy::a, hdy::a);
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

      for (fiy $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fco.a($$3));
         }
      }

      for (awl $$4 : awl.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bz.get($$4));
      }

      for (coi $$5 : coi.values()) {
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

         uj $$0 = new uj();

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

         final uj $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(fis.b);
            } else {
               this.aB.a(fis.a);
            }
         }

         this.a(new fje.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).s_() : null;
            }

            @Override
            public <T> void a(String $$0, fjd<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fje.ae.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fje.ae.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fje.a($$2) : $$1;
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
               } else if (fje.a($$2)) {
                  return 1.0F;
               } else if (fje.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fje.ae.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fiy.d();
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

   private uj a(uj $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return bas.e.a(this.W.au(), $$0, $$1);
   }

   public void ay() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bR), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fje.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fjd<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> fje.ae.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(fje.af.toJson($$2));
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
         if (this.W.aP().f().isPresent()) {
            $$0.println("fullscreenResolution:" + this.W.aP().f().get().g());
         }
      } catch (Exception var6) {
         ae.error("Failed to save options", var6);
      }

      this.aA();
   }

   public aqy az() {
      int $$0 = 0;

      for (coi $$1 : this.aS) {
         $$0 |= $$1.a();
      }

      return new aqy(this.ab, this.ap.c(), this.aH.c(), this.bl.c(), $$0, this.aT.c(), this.W.aV(), this.bx.c(), this.cl.c());
   }

   public void aA() {
      if (this.W.t != null) {
         this.W.t.cw.a(this.az());
      }
   }

   public void a(coi $$0, boolean $$1) {
      if ($$1) {
         this.aS.add($$0);
      } else {
         this.aS.remove($$0);
      }
   }

   public boolean a(coi $$0) {
      return this.aS.contains($$0);
   }

   public fim aB() {
      return this.aG() >= 4 ? this.ax.c() : fim.a;
   }

   public boolean aC() {
      return this.q;
   }

   public void b(auk $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         auh $$4 = $$0.c($$3);
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

   public fik aD() {
      return this.bS;
   }

   public void a(fik $$0) {
      this.bS = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = ayz.a(af, $$0, ag);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aE() {
      return this.bR;
   }

   public String aF() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fje.b() {
         @Override
         public <T> void a(String $$0x, fjd<T> $$1) {
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

   private static xh c(xh $$0, int $$1) {
      return xh.a("options.pixel_value", $$0, $$1);
   }

   private static xh a(xh $$0, double $$1) {
      return xh.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static xh a(xh $$0, xh $$1) {
      return xh.a("options.generic_value", $$0, $$1);
   }

   public static xh a(xh $$0, int $$1) {
      return a($$0, xh.b(Integer.toString($$1)));
   }

   public static xh b(xh $$0, int $$1) {
      return $$1 == 0 ? a($$0, xg.c) : a($$0, $$1);
   }

   private static xh b(xh $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, xg.c) : a($$0, $$1);
   }

   interface a extends fje.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fjd<T> var2);
   }
}
