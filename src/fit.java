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

public class fit {
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
   private static final xe ai = xe.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fis<Boolean> aj = fis.a("options.darkMojangStudiosBackgroundColor", fis.a(ai), false);
   private static final xe ak = xe.c("options.hideLightningFlashes.tooltip");
   private final fis<Boolean> al = fis.a("options.hideLightningFlashes", fis.a(ak), false);
   private static final xe am = xe.c("options.hideSplashTexts.tooltip");
   private final fis<Boolean> an = fis.a("options.hideSplashTexts", fis.a(am), false);
   private final fis<Double> ao = new fis<>("options.sensitivity", fis.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xe.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xe.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fis.m.a, 0.5, $$0x -> {
   });
   private final fis<Integer> ap;
   private final fis<Integer> aq;
   private int ar = 0;
   private final fis<Double> as = new fis<>(
      "options.entityDistanceScaling",
      fis.a(),
      fit::a,
      new fis.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fis<Integer> at = new fis<>(
      "options.framerateLimit",
      fis.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xe.c("options.framerateLimit.max")) : a($$0x, xe.a("options.framerate", $$1x)),
      new fis.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fip.Q().aQ().a($$0x)
   );
   private static final xe au = xe.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final xe av = xe.c("options.inactivityFpsLimit.afk.tooltip");
   private final fis<fil> aw = new fis<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> flz.a(au);
         case b -> flz.a(av);
      };
   }, fis.b(), new fis.e<>(Arrays.asList(fil.values()), fil.c), fil.b, $$0x -> {
   });
   private final fis<fib> ax = new fis<>(
      "options.renderClouds",
      fis.a(),
      fis.b(),
      new fis.e<>(Arrays.asList(fib.values()), Codec.withAlternative(fib.d, Codec.BOOL, $$0x -> $$0x ? fib.c : fib.a)),
      fib.c,
      $$0x -> {
      }
   );
   private static final xe ay = xe.c("options.graphics.fast.tooltip");
   private static final xe az = xe.a("options.graphics.fabulous.tooltip", xe.c("options.graphics.fabulous").a(n.u));
   private static final xe aA = xe.c("options.graphics.fancy.tooltip");
   private final fis<fih> aB = new fis<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> flz.a(aA);
            case a -> flz.a(ay);
            case c -> flz.a(az);
         };
      },
      ($$0x, $$1x) -> {
         xs $$2x = xe.c($$1x.a());
         return $$1x == fih.c ? $$2x.a(n.u) : $$2x;
      },
      new fis.a<>(
         Arrays.asList(fih.values()),
         Stream.of(fih.values()).filter($$0x -> $$0x != fih.c).collect(Collectors.toList()),
         () -> fip.Q().r() && fip.Q().aj().h(),
         ($$0x, $$1x) -> {
            fip $$2x = fip.Q();
            ghc $$3 = $$2x.aj();
            if ($$1x == fih.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.e();
            }
         },
         Codec.INT.xmap(fih::a, fih::b)
      ),
      fih.b,
      $$0x -> {
      }
   );
   private final fis<Boolean> aC = fis.a("options.ao", true, $$0x -> fip.Q().f.e());
   private static final xe aD = xe.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xe aE = xe.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xe aF = xe.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fis<fiv> aG = new fis<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> flz.a(aD);
         case b -> flz.a(aE);
         case c -> flz.a(aF);
      };
   }, fis.b(), new fis.e<>(Arrays.asList(fiv.values()), Codec.INT.xmap(fiv::a, fiv::b)), fiv.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fis<cnv> aH = new fis<>(
      "options.chat.visibility", fis.a(), fis.b(), new fis.e<>(Arrays.asList(cnv.values()), Codec.INT.xmap(cnv::a, cnv::b)), cnv.a, $$0x -> {
      }
   );
   private final fis<Double> aI = new fis<>("options.chat.opacity", fis.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fis.m.a, 1.0, $$0x -> fip.Q().m.d().b());
   private final fis<Double> aJ = new fis<>("options.chat.line_spacing", fis.a(), fit::a, fis.m.a, 0.0, $$0x -> {
   });
   private static final xe aK = xe.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aL = 5;
   private final fis<Integer> aM = new fis<>("options.accessibility.menu_background_blurriness", fis.a(aK), fit::b, new fis.f(0, 10), 5, $$0x -> {
   });
   private final fis<Double> aN = new fis<>("options.accessibility.text_background_opacity", fis.a(), fit::a, fis.m.a, 0.5, $$0x -> fip.Q().m.d().b());
   private final fis<Double> aO = new fis<>("options.accessibility.panorama_speed", fis.a(), fit::a, fis.m.a, 1.0, $$0x -> {
   });
   private static final xe aP = xe.c("options.accessibility.high_contrast.tooltip");
   private final fis<Boolean> aQ = fis.a("options.accessibility.high_contrast", fis.a(aP), false, $$0x -> {
      aug $$1x = fip.Q().ad();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final fis<Boolean> aR = fis.a(
      "options.accessibility.narrator_hotkey",
      fis.a(fip.a ? xe.c("options.accessibility.narrator_hotkey.mac.tooltip") : xe.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cny> aS = EnumSet.allOf(cny.class);
   private final fis<buh> aT = new fis<>("options.mainHand", fis.a(), fis.b(), new fis.e<>(Arrays.asList(buh.values()), buh.c), buh.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fis<Double> aU = new fis<>(
      "options.chat.scale",
      fis.a(),
      ($$0x, $$1x) -> (xe)($$1x == 0.0 ? xd.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fis.m.a,
      1.0,
      $$0x -> fip.Q().m.d().b()
   );
   private final fis<Double> aV = new fis<>("options.chat.width", fis.a(), ($$0x, $$1x) -> c($$0x, fkp.a($$1x)), fis.m.a, 1.0, $$0x -> fip.Q().m.d().b());
   private final fis<Double> aW = new fis<>(
      "options.chat.height.unfocused", fis.a(), ($$0x, $$1x) -> c($$0x, fkp.b($$1x)), fis.m.a, fkp.i(), $$0x -> fip.Q().m.d().b()
   );
   private final fis<Double> aX = new fis<>(
      "options.chat.height.focused", fis.a(), ($$0x, $$1x) -> c($$0x, fkp.b($$1x)), fis.m.a, 1.0, $$0x -> fip.Q().m.d().b()
   );
   private final fis<Double> aY = new fis<>(
      "options.chat.delay_instant",
      fis.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xe.c("options.chat.delay_none") : xe.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fis.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fip.Q().ba().a($$0x)
   );
   private static final xe aZ = xe.c("options.notifications.display_time.tooltip");
   private final fis<Double> ba = new fis<>(
      "options.notifications.display_time",
      fis.a(aZ),
      ($$0x, $$1x) -> a($$0x, xe.a("options.multiplier", $$1x)),
      new fis.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fis<Integer> bb = new fis<>(
      "options.mipmapLevels", fis.a(), ($$0x, $$1x) -> (xe)($$1x == 0 ? xd.a($$0x, false) : a($$0x, $$1x.intValue())), new fis.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fis<fhx> bc = new fis<>(
      "options.attackIndicator", fis.a(), fis.b(), new fis.e<>(Arrays.asList(fhx.values()), Codec.INT.xmap(fhx::a, fhx::b)), fhx.b, $$0x -> {
      }
   );
   public hdj r = hdj.a;
   public boolean s = false;
   private final fis<Integer> bd = new fis<>("options.biomeBlendRadius", fis.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xe.c("options.biomeBlendRadius." + $$2x));
   }, new fis.f(0, 7, false), 2, $$0x -> fip.Q().f.e());
   private final fis<Double> be = new fis<>(
      "options.mouseWheelSensitivity",
      fis.a(),
      ($$0x, $$1x) -> a($$0x, xe.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fis.f(-200, 100).a(fit::c, fit::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fis<Boolean> bf = fis.a("options.rawMouseInput", true, $$0x -> {
      fcl $$1x = fip.Q().aP();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fis<Boolean> bg = fis.a("options.autoJump", false);
   private static final xe bh = xe.c("options.rotateWithMinecart.tooltip");
   private final fis<Boolean> bi = fis.a("options.rotateWithMinecart", fis.a(bh), false);
   private final fis<Boolean> bj = fis.a("options.operatorItemsTab", false);
   private final fis<Boolean> bk = fis.a("options.autoSuggestCommands", true);
   private final fis<Boolean> bl = fis.a("options.chat.color", true);
   private final fis<Boolean> bm = fis.a("options.chat.links", true);
   private final fis<Boolean> bn = fis.a("options.chat.links.prompt", true);
   private final fis<Boolean> bo = fis.a("options.vsync", true, $$0x -> {
      if (fip.Q().aP() != null) {
         fip.Q().aP().a($$0x);
      }
   });
   private final fis<Boolean> bp = fis.a("options.entityShadows", true);
   private final fis<Boolean> bq = fis.a("options.forceUnicodeFont", false, $$0x -> aH());
   private final fis<Boolean> br = fis.a("options.japaneseGlyphVariants", fis.a(xe.c("options.japaneseGlyphVariants.tooltip")), aI(), $$0x -> aH());
   private final fis<Boolean> bs = fis.a("options.invertMouse", false);
   private final fis<Boolean> bt = fis.a("options.discrete_mouse_scroll", false);
   private static final xe bu = xe.c("options.realmsNotifications.tooltip");
   private final fis<Boolean> bv = fis.a("options.realmsNotifications", fis.a(bu), true);
   private static final xe bw = xe.c("options.allowServerListing.tooltip");
   private final fis<Boolean> bx = fis.a("options.allowServerListing", fis.a(bw), true, $$0x -> {
   });
   private final fis<Boolean> by = fis.a("options.reducedDebugInfo", false);
   private final Map<awh, fis<Double>> bz = ad.a(new EnumMap<>(awh.class), $$0x -> {
      for (awh $$1x : awh.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fis<Boolean> bA = fis.a("options.showSubtitles", false);
   private static final xe bB = xe.c("options.directionalAudio.on.tooltip");
   private static final xe bC = xe.c("options.directionalAudio.off.tooltip");
   private final fis<Boolean> bD = fis.a("options.directionalAudio", $$0x -> $$0x ? flz.a(bB) : flz.a(bC), false, $$0x -> {
      hcf $$1x = fip.Q().ak();
      $$1x.k();
      $$1x.a(hav.a(awg.Ax, 1.0F));
   });
   private final fis<Boolean> bE = new fis<>(
      "options.accessibility.text_background",
      fis.a(),
      ($$0x, $$1x) -> $$1x ? xe.c("options.accessibility.text_background.chat") : xe.c("options.accessibility.text_background.everywhere"),
      fis.a,
      true,
      $$0x -> {
      }
   );
   private final fis<Boolean> bF = fis.a("options.touchscreen", false);
   private final fis<Boolean> bG = fis.a("options.fullscreen", false, $$0x -> {
      fip $$1x = fip.Q();
      if ($$1x.aP() != null && $$1x.aP().j() != $$0x) {
         $$1x.aP().h();
         this.ac().a($$1x.aP().j());
      }
   });
   private final fis<Boolean> bH = fis.a("options.viewBobbing", true);
   private static final xe bI = xe.c("options.key.toggle");
   private static final xe bJ = xe.c("options.key.hold");
   private final fis<Boolean> bK = new fis<>("key.sneak", fis.a(), ($$0x, $$1x) -> $$1x ? bI : bJ, fis.a, false, $$0x -> {
   });
   private final fis<Boolean> bL = new fis<>("key.sprint", fis.a(), ($$0x, $$1x) -> $$1x ? bI : bJ, fis.a, false, $$0x -> {
   });
   public boolean u;
   private static final xe bM = xe.c("options.hideMatchedNames.tooltip");
   private final fis<Boolean> bN = fis.a("options.hideMatchedNames", fis.a(bM), true);
   private final fis<Boolean> bO = fis.a("options.autosaveIndicator", true);
   private static final xe bP = xe.c("options.onlyShowSecureChat.tooltip");
   private final fis<Boolean> bQ = fis.a("options.onlyShowSecureChat", fis.a(bP), false);
   public final fin v = new fin("key.forward", 87, "key.categories.movement");
   public final fin w = new fin("key.left", 65, "key.categories.movement");
   public final fin x = new fin("key.back", 83, "key.categories.movement");
   public final fin y = new fin("key.right", 68, "key.categories.movement");
   public final fin z = new fin("key.jump", 32, "key.categories.movement");
   public final fin A = new fjb("key.sneak", 340, "key.categories.movement", this.bK::c);
   public final fin B = new fjb("key.sprint", 341, "key.categories.movement", this.bL::c);
   public final fin C = new fin("key.inventory", 69, "key.categories.inventory");
   public final fin D = new fin("key.swapOffhand", 70, "key.categories.inventory");
   public final fin E = new fin("key.drop", 81, "key.categories.inventory");
   public final fin F = new fin("key.use", fcd.b.c, 1, "key.categories.gameplay");
   public final fin G = new fin("key.attack", fcd.b.c, 0, "key.categories.gameplay");
   public final fin H = new fin("key.pickItem", fcd.b.c, 2, "key.categories.gameplay");
   public final fin I = new fin("key.chat", 84, "key.categories.multiplayer");
   public final fin J = new fin("key.playerlist", 258, "key.categories.multiplayer");
   public final fin K = new fin("key.command", 47, "key.categories.multiplayer");
   public final fin L = new fin("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fin M = new fin("key.screenshot", 291, "key.categories.misc");
   public final fin N = new fin("key.togglePerspective", 294, "key.categories.misc");
   public final fin O = new fin("key.smoothCamera", fcd.bv.b(), "key.categories.misc");
   public final fin P = new fin("key.fullscreen", 300, "key.categories.misc");
   public final fin Q = new fin("key.spectatorOutlines", fcd.bv.b(), "key.categories.misc");
   public final fin R = new fin("key.advancements", 76, "key.categories.misc");
   public final fin[] S = new fin[]{
      new fin("key.hotbar.1", 49, "key.categories.inventory"),
      new fin("key.hotbar.2", 50, "key.categories.inventory"),
      new fin("key.hotbar.3", 51, "key.categories.inventory"),
      new fin("key.hotbar.4", 52, "key.categories.inventory"),
      new fin("key.hotbar.5", 53, "key.categories.inventory"),
      new fin("key.hotbar.6", 54, "key.categories.inventory"),
      new fin("key.hotbar.7", 55, "key.categories.inventory"),
      new fin("key.hotbar.8", 56, "key.categories.inventory"),
      new fin("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fin T = new fin("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fin U = new fin("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fin[] V = (fin[])ArrayUtils.addAll(
      new fin[]{
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
   protected fip W;
   private final File bR;
   public boolean X;
   private fhz bS = fhz.a;
   public String Y = "";
   public boolean Z;
   private final fis<Integer> bT = new fis<>("options.fov", fis.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xe.c("options.fov.min"));
         case 110 -> a($$0x, xe.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fis.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fip.Q().f.p());
   private static final xe bU = xe.a("options.telemetry.button.tooltip", xe.c("options.telemetry.state.minimal"), xe.c("options.telemetry.state.all"));
   private final fis<Boolean> bV = fis.a("options.telemetry.button", fis.a(bU), ($$0x, $$1x) -> {
      fip $$2x = fip.Q();
      if (!$$2x.E()) {
         return xe.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xe.c("options.telemetry.state.all") : xe.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xe bW = xe.c("options.screenEffectScale.tooltip");
   private final fis<Double> bX = new fis<>("options.screenEffectScale", fis.a(bW), fit::b, fis.m.a, 1.0, $$0x -> {
   });
   private static final xe bY = xe.c("options.fovEffectScale.tooltip");
   private final fis<Double> bZ = new fis<>(
      "options.fovEffectScale", fis.a(bY), fit::b, fis.m.a.a(azf::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final xe ca = xe.c("options.darknessEffectScale.tooltip");
   private final fis<Double> cb = new fis<>("options.darknessEffectScale", fis.a(ca), fit::b, fis.m.a.a(azf::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final xe cc = xe.c("options.glintSpeed.tooltip");
   private final fis<Double> cd = new fis<>("options.glintSpeed", fis.a(cc), fit::b, fis.m.a, 0.5, $$0x -> {
   });
   private static final xe ce = xe.c("options.glintStrength.tooltip");
   private final fis<Double> cf = new fis<>("options.glintStrength", fis.a(ce), fit::b, fis.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final xe cg = xe.c("options.damageTiltStrength.tooltip");
   private final fis<Double> ch = new fis<>("options.damageTiltStrength", fis.a(cg), fit::b, fis.m.a, 1.0, $$0x -> {
   });
   private final fis<Double> ci = new fis<>("options.gamma", fis.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xe.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xe.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xe.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fis.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cj = 2147483646;
   private final fis<Integer> ck = new fis<>(
      "options.guiScale", fis.a(), ($$0x, $$1x) -> $$1x == 0 ? xe.c("options.guiScale.auto") : xe.b(Integer.toString($$1x)), new fis.c(0, () -> {
         fip $$0x = fip.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aP().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fis<arc> cl = new fis<>(
      "options.particles", fis.a(), fis.b(), new fis.e<>(Arrays.asList(arc.values()), Codec.INT.xmap(arc::a, arc::b)), arc.a, $$0x -> {
      }
   );
   private final fis<fir> cm = new fis<>(
      "options.narrator",
      fis.a(),
      ($$0x, $$1x) -> (xe)(this.W.aZ().a() ? $$1x.b() : xe.c("options.narrator.notavailable")),
      new fis.e<>(Arrays.asList(fir.values()), Codec.INT.xmap(fir::a, fir::a)),
      fir.a,
      $$0x -> this.W.aZ().a($$0x)
   );
   public String ab = "en_us";
   private final fis<String> cn = new fis<>(
      "options.audioDevice",
      fis.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xe.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xe.b($$1x.substring(hcc.c)) : xe.b($$1x);
         }
      },
      new fis.h<>(
         () -> Stream.concat(Stream.of(""), fip.Q().ak().a().stream()).toList(),
         $$0x -> fip.Q().r() && $$0x != "" && !fip.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hcf $$1x = fip.Q().ak();
         $$1x.k();
         $$1x.a(hav.a(awg.Ax, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;

   public fis<Boolean> a() {
      return this.aj;
   }

   public fis<Boolean> b() {
      return this.al;
   }

   public fis<Boolean> c() {
      return this.an;
   }

   public fis<Double> d() {
      return this.ao;
   }

   public fis<Integer> e() {
      return this.ap;
   }

   public fis<Integer> f() {
      return this.aq;
   }

   public fis<Double> g() {
      return this.as;
   }

   public fis<Integer> h() {
      return this.at;
   }

   public fis<fil> i() {
      return this.aw;
   }

   public fis<fib> j() {
      return this.ax;
   }

   public fis<fih> k() {
      return this.aB;
   }

   public fis<Boolean> l() {
      return this.aC;
   }

   public fis<fiv> m() {
      return this.aG;
   }

   public void a(aug $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (aud $$2 : $$0.f()) {
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

   public fis<cnv> n() {
      return this.aH;
   }

   public fis<Double> o() {
      return this.aI;
   }

   public fis<Double> p() {
      return this.aJ;
   }

   public fis<Integer> q() {
      return this.aM;
   }

   public int r() {
      return this.q().c();
   }

   public fis<Double> s() {
      return this.aN;
   }

   public fis<Double> t() {
      return this.aO;
   }

   public fis<Boolean> u() {
      return this.aQ;
   }

   public fis<Boolean> v() {
      return this.aR;
   }

   public fis<buh> w() {
      return this.aT;
   }

   public fis<Double> x() {
      return this.aU;
   }

   public fis<Double> y() {
      return this.aV;
   }

   public fis<Double> z() {
      return this.aW;
   }

   public fis<Double> A() {
      return this.aX;
   }

   public fis<Double> B() {
      return this.aY;
   }

   public fis<Double> C() {
      return this.ba;
   }

   public fis<Integer> D() {
      return this.bb;
   }

   public fis<fhx> E() {
      return this.bc;
   }

   public fis<Integer> F() {
      return this.bd;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return azf.a(Math.log10($$0) * 100.0);
   }

   public fis<Double> G() {
      return this.be;
   }

   public fis<Boolean> H() {
      return this.bf;
   }

   public fis<Boolean> I() {
      return this.bg;
   }

   public fis<Boolean> J() {
      return this.bi;
   }

   public fis<Boolean> K() {
      return this.bj;
   }

   public fis<Boolean> L() {
      return this.bk;
   }

   public fis<Boolean> M() {
      return this.bl;
   }

   public fis<Boolean> N() {
      return this.bm;
   }

   public fis<Boolean> O() {
      return this.bn;
   }

   public fis<Boolean> P() {
      return this.bo;
   }

   public fis<Boolean> Q() {
      return this.bp;
   }

   private static void aH() {
      fip $$0 = fip.Q();
      if ($$0.aP() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fis<Boolean> R() {
      return this.bq;
   }

   private static boolean aI() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fis<Boolean> S() {
      return this.br;
   }

   public fis<Boolean> T() {
      return this.bs;
   }

   public fis<Boolean> U() {
      return this.bt;
   }

   public fis<Boolean> V() {
      return this.bv;
   }

   public fis<Boolean> W() {
      return this.bx;
   }

   public fis<Boolean> X() {
      return this.by;
   }

   public final float a(awh $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fis<Double> b(awh $$0) {
      return Objects.requireNonNull(this.bz.get($$0));
   }

   private fis<Double> a(String $$0, awh $$1) {
      return new fis<>($$0, fis.a(), fit::b, fis.m.a, 1.0, $$1x -> fip.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fis<Boolean> Y() {
      return this.bA;
   }

   public fis<Boolean> Z() {
      return this.bD;
   }

   public fis<Boolean> aa() {
      return this.bE;
   }

   public fis<Boolean> ab() {
      return this.bF;
   }

   public fis<Boolean> ac() {
      return this.bG;
   }

   public fis<Boolean> ad() {
      return this.bH;
   }

   public fis<Boolean> ae() {
      return this.bK;
   }

   public fis<Boolean> af() {
      return this.bL;
   }

   public fis<Boolean> ag() {
      return this.bN;
   }

   public fis<Boolean> ah() {
      return this.bO;
   }

   public fis<Boolean> ai() {
      return this.bQ;
   }

   public fis<Integer> aj() {
      return this.bT;
   }

   public fis<Boolean> ak() {
      return this.bV;
   }

   public fis<Double> al() {
      return this.bX;
   }

   public fis<Double> am() {
      return this.bZ;
   }

   public fis<Double> an() {
      return this.cb;
   }

   public fis<Double> ao() {
      return this.cd;
   }

   public fis<Double> ap() {
      return this.cf;
   }

   public fis<Double> aq() {
      return this.ch;
   }

   public fis<Double> ar() {
      return this.ci;
   }

   public fis<Integer> as() {
      return this.ck;
   }

   public fis<arc> at() {
      return this.cl;
   }

   public fis<fir> au() {
      return this.cm;
   }

   public fis<String> av() {
      return this.cn;
   }

   public void aw() {
      this.ac = false;
      this.ay();
   }

   public fit(fip $$0, File $$1) {
      this.W = $$0;
      this.bR = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ap = new fis<>(
         "options.renderDistance",
         fis.a(),
         ($$0x, $$1x) -> a($$0x, xe.a("options.chunks", $$1x)),
         new fis.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fip.Q().f.p()
      );
      this.aq = new fis<>(
         "options.simulationDistance", fis.a(), ($$0x, $$1x) -> a($$0x, xe.a("options.chunks", $$1x)), new fis.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = ad.m() == ad.a.c;
      this.ax();
   }

   public float a(float $$0) {
      return this.bE.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return axq.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bE.c() ? $$0 : axq.a(this.aN.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(fit.b $$0) {
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

   private void a(fit.a $$0) {
      this.a((fit.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, fit::c, af::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fit::c, af::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, hdj::a, hdj::a);
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

      for (fin $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fcd.a($$3));
         }
      }

      for (awh $$4 : awh.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bz.get($$4));
      }

      for (cny $$5 : cny.values()) {
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

         ug $$0 = new ug();

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

         final ug $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(fih.b);
            } else {
               this.aB.a(fih.a);
            }
         }

         this.a(new fit.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).s_() : null;
            }

            @Override
            public <T> void a(String $$0, fis<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fit.ae.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fit.ae.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fit.a($$2) : $$1;
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
               } else if (fit.a($$2)) {
                  return 1.0F;
               } else if (fit.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fit.ae.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fin.d();
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

   private ug a(ug $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return bao.e.a(this.W.au(), $$0, $$1);
   }

   public void ay() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bR), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fit.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fis<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> fit.ae.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(fit.af.toJson($$2));
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

   public aqv az() {
      int $$0 = 0;

      for (cny $$1 : this.aS) {
         $$0 |= $$1.a();
      }

      return new aqv(this.ab, this.ap.c(), this.aH.c(), this.bl.c(), $$0, this.aT.c(), this.W.aU(), this.bx.c(), this.cl.c());
   }

   public void aA() {
      if (this.W.t != null) {
         this.W.t.cw.a(this.az());
      }
   }

   public void a(cny $$0, boolean $$1) {
      if ($$1) {
         this.aS.add($$0);
      } else {
         this.aS.remove($$0);
      }
   }

   public boolean a(cny $$0) {
      return this.aS.contains($$0);
   }

   public fib aB() {
      return this.aG() >= 4 ? this.ax.c() : fib.a;
   }

   public boolean aC() {
      return this.q;
   }

   public void b(aug $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         aud $$4 = $$0.c($$3);
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

   public fhz aD() {
      return this.bS;
   }

   public void a(fhz $$0) {
      this.bS = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = ayv.a(af, $$0, ag);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aE() {
      return this.bR;
   }

   public String aF() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fit.b() {
         @Override
         public <T> void a(String $$0x, fis<T> $$1) {
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

   private static xe c(xe $$0, int $$1) {
      return xe.a("options.pixel_value", $$0, $$1);
   }

   private static xe a(xe $$0, double $$1) {
      return xe.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static xe a(xe $$0, xe $$1) {
      return xe.a("options.generic_value", $$0, $$1);
   }

   public static xe a(xe $$0, int $$1) {
      return a($$0, xe.b(Integer.toString($$1)));
   }

   public static xe b(xe $$0, int $$1) {
      return $$1 == 0 ? a($$0, xd.c) : a($$0, $$1);
   }

   private static xe b(xe $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, xd.c) : a($$0, $$1);
   }

   interface a extends fit.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fis<T> var2);
   }
}
