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

public class foj {
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
   private static final ww aj = ww.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final foi<Boolean> ak = foi.a("options.darkMojangStudiosBackgroundColor", foi.a(aj), false);
   private static final ww al = ww.c("options.hideLightningFlashes.tooltip");
   private final foi<Boolean> am = foi.a("options.hideLightningFlashes", foi.a(al), false);
   private static final ww an = ww.c("options.hideSplashTexts.tooltip");
   private final foi<Boolean> ao = foi.a("options.hideSplashTexts", foi.a(an), false);
   private final foi<Double> ap = new foi<>("options.sensitivity", foi.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, ww.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, ww.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, foi.m.a, 0.5, $$0x -> {
   });
   private final foi<Integer> aq;
   private final foi<Integer> ar;
   private int as = 0;
   private final foi<Double> at = new foi<>(
      "options.entityDistanceScaling",
      foi.a(),
      foj::a,
      new foi.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final foi<Integer> au = new foi<>(
      "options.framerateLimit",
      foi.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, ww.c("options.framerateLimit.max")) : a($$0x, ww.a("options.framerate", $$1x)),
      new foi.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fof.Q().aP().a($$0x)
   );
   private static final ww av = ww.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final ww aw = ww.c("options.inactivityFpsLimit.afk.tooltip");
   private final foi<fob> ax = new foi<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> ftb.a(av);
         case b -> ftb.a(aw);
      };
   }, foi.b(), new foi.e<>(Arrays.asList(fob.values()), fob.c), fob.b, $$0x -> {
   });
   private final foi<fnr> ay = new foi<>(
      "options.renderClouds",
      foi.a(),
      foi.b(),
      new foi.e<>(Arrays.asList(fnr.values()), Codec.withAlternative(fnr.d, Codec.BOOL, $$0x -> $$0x ? fnr.c : fnr.a)),
      fnr.c,
      $$0x -> {
      }
   );
   private static final ww az = ww.c("options.graphics.fast.tooltip");
   private static final ww aA = ww.a("options.graphics.fabulous.tooltip", ww.c("options.graphics.fabulous").a(n.u));
   private static final ww aB = ww.c("options.graphics.fancy.tooltip");
   private final foi<fnx> aC = new foi<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> ftb.a(aB);
            case a -> ftb.a(az);
            case c -> ftb.a(aA);
         };
      },
      ($$0x, $$1x) -> {
         xk $$2x = ww.c($$1x.a());
         return $$1x == fnx.c ? $$2x.a(n.u) : $$2x;
      },
      new foi.a<>(
         Arrays.asList(fnx.values()),
         Stream.of(fnx.values()).filter($$0x -> $$0x != fnx.c).collect(Collectors.toList()),
         () -> fof.Q().r() && fof.Q().aj().h(),
         ($$0x, $$1x) -> {
            fof $$2x = fof.Q();
            gou $$3 = $$2x.aj();
            if ($$1x == fnx.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.e();
            }
         },
         Codec.INT.xmap(fnx::a, fnx::b)
      ),
      fnx.b,
      $$0x -> {
      }
   );
   private final foi<Boolean> aD = foi.a("options.ao", true, $$0x -> fof.Q().f.e());
   private static final ww aE = ww.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final ww aF = ww.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final ww aG = ww.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final foi<fol> aH = new foi<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> ftb.a(aE);
         case b -> ftb.a(aF);
         case c -> ftb.a(aG);
      };
   }, foi.b(), new foi.e<>(Arrays.asList(fol.values()), Codec.INT.xmap(fol::a, fol::b)), fol.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final foi<cqp> aI = new foi<>(
      "options.chat.visibility", foi.a(), foi.b(), new foi.e<>(Arrays.asList(cqp.values()), Codec.INT.xmap(cqp::a, cqp::b)), cqp.a, $$0x -> {
      }
   );
   private final foi<Double> aJ = new foi<>("options.chat.opacity", foi.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), foi.m.a, 1.0, $$0x -> fof.Q().m.d().b());
   private final foi<Double> aK = new foi<>("options.chat.line_spacing", foi.a(), foj::a, foi.m.a, 0.0, $$0x -> {
   });
   private static final ww aL = ww.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aM = 5;
   private final foi<Integer> aN = new foi<>("options.accessibility.menu_background_blurriness", foi.a(aL), foj::b, new foi.f(0, 10), 5, $$0x -> {
   });
   private final foi<Double> aO = new foi<>("options.accessibility.text_background_opacity", foi.a(), foj::a, foi.m.a, 0.5, $$0x -> fof.Q().m.d().b());
   private final foi<Double> aP = new foi<>("options.accessibility.panorama_speed", foi.a(), foj::a, foi.m.a, 1.0, $$0x -> {
   });
   private static final ww aQ = ww.c("options.accessibility.high_contrast.tooltip");
   private final foi<Boolean> aR = foi.a("options.accessibility.high_contrast", foi.a(aQ), false, $$0x -> {
      aul $$1x = fof.Q().ad();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private static final ww aS = ww.c("options.accessibility.high_contrast_block_outline.tooltip");
   private final foi<Boolean> aT = foi.a("options.accessibility.high_contrast_block_outline", foi.a(aS), false);
   private final foi<Boolean> aU = foi.a(
      "options.accessibility.narrator_hotkey",
      foi.a(fof.a ? ww.c("options.accessibility.narrator_hotkey.mac.tooltip") : ww.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cqt> aV = EnumSet.allOf(cqt.class);
   private final foi<bws> aW = new foi<>("options.mainHand", foi.a(), foi.b(), new foi.e<>(Arrays.asList(bws.values()), bws.c), bws.b, $$0x -> {
   });
   public int o;
   public int p;
   private final foi<Double> aX = new foi<>(
      "options.chat.scale",
      foi.a(),
      ($$0x, $$1x) -> (ww)($$1x == 0.0 ? wv.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      foi.m.a,
      1.0,
      $$0x -> fof.Q().m.d().b()
   );
   private final foi<Double> aY = new foi<>("options.chat.width", foi.a(), ($$0x, $$1x) -> c($$0x, frr.a($$1x)), foi.m.a, 1.0, $$0x -> fof.Q().m.d().b());
   private final foi<Double> aZ = new foi<>(
      "options.chat.height.unfocused", foi.a(), ($$0x, $$1x) -> c($$0x, frr.b($$1x)), foi.m.a, frr.i(), $$0x -> fof.Q().m.d().b()
   );
   private final foi<Double> ba = new foi<>(
      "options.chat.height.focused", foi.a(), ($$0x, $$1x) -> c($$0x, frr.b($$1x)), foi.m.a, 1.0, $$0x -> fof.Q().m.d().b()
   );
   private final foi<Double> bb = new foi<>(
      "options.chat.delay_instant",
      foi.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? ww.c("options.chat.delay_none") : ww.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new foi.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fof.Q().aZ().a($$0x)
   );
   private static final ww bc = ww.c("options.notifications.display_time.tooltip");
   private final foi<Double> bd = new foi<>(
      "options.notifications.display_time",
      foi.a(bc),
      ($$0x, $$1x) -> a($$0x, ww.a("options.multiplier", $$1x)),
      new foi.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final foi<Integer> be = new foi<>(
      "options.mipmapLevels", foi.a(), ($$0x, $$1x) -> (ww)($$1x == 0 ? wv.a($$0x, false) : a($$0x, $$1x.intValue())), new foi.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final foi<fnm> bf = new foi<>(
      "options.attackIndicator", foi.a(), foi.b(), new foi.e<>(Arrays.asList(fnm.values()), Codec.INT.xmap(fnm::a, fnm::b)), fnm.b, $$0x -> {
      }
   );
   public hog r = hog.a;
   public boolean s = false;
   private final foi<Integer> bg = new foi<>("options.biomeBlendRadius", foi.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, ww.c("options.biomeBlendRadius." + $$2x));
   }, new foi.f(0, 7, false), 2, $$0x -> fof.Q().f.e());
   private final foi<Double> bh = new foi<>(
      "options.mouseWheelSensitivity",
      foi.a(),
      ($$0x, $$1x) -> a($$0x, ww.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new foi.f(-200, 100).a(foj::c, foj::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final foi<Boolean> bi = foi.a("options.rawMouseInput", true, $$0x -> {
      fht $$1x = fof.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final foi<Boolean> bj = foi.a("options.autoJump", false);
   private static final ww bk = ww.c("options.rotateWithMinecart.tooltip");
   private final foi<Boolean> bl = foi.a("options.rotateWithMinecart", foi.a(bk), false);
   private final foi<Boolean> bm = foi.a("options.operatorItemsTab", false);
   private final foi<Boolean> bn = foi.a("options.autoSuggestCommands", true);
   private final foi<Boolean> bo = foi.a("options.chat.color", true);
   private final foi<Boolean> bp = foi.a("options.chat.links", true);
   private final foi<Boolean> bq = foi.a("options.chat.links.prompt", true);
   private final foi<Boolean> br = foi.a("options.vsync", true, $$0x -> {
      if (fof.Q().aO() != null) {
         fof.Q().aO().a($$0x);
      }
   });
   private final foi<Boolean> bs = foi.a("options.entityShadows", true);
   private final foi<Boolean> bt = foi.a("options.forceUnicodeFont", false, $$0x -> aI());
   private final foi<Boolean> bu = foi.a("options.japaneseGlyphVariants", foi.a(ww.c("options.japaneseGlyphVariants.tooltip")), aJ(), $$0x -> aI());
   private final foi<Boolean> bv = foi.a("options.invertMouse", false);
   private final foi<Boolean> bw = foi.a("options.discrete_mouse_scroll", false);
   private static final ww bx = ww.c("options.realmsNotifications.tooltip");
   private final foi<Boolean> by = foi.a("options.realmsNotifications", foi.a(bx), true);
   private static final ww bz = ww.c("options.allowServerListing.tooltip");
   private final foi<Boolean> bA = foi.a("options.allowServerListing", foi.a(bz), true, $$0x -> {
   });
   private final foi<Boolean> bB = foi.a("options.reducedDebugInfo", false);
   private final Map<awm, foi<Double>> bC = af.a(awm.class, $$0x -> this.a("soundCategory." + $$0x.a(), $$0x));
   private final foi<Boolean> bD = foi.a("options.showSubtitles", false);
   private static final ww bE = ww.c("options.directionalAudio.on.tooltip");
   private static final ww bF = ww.c("options.directionalAudio.off.tooltip");
   private final foi<Boolean> bG = foi.a("options.directionalAudio", $$0x -> $$0x ? ftb.a(bE) : ftb.a(bF), false, $$0x -> {
      hnc $$1x = fof.Q().ak();
      $$1x.k();
      $$1x.a(hlr.a(awl.Bp, 1.0F));
   });
   private final foi<Boolean> bH = new foi<>(
      "options.accessibility.text_background",
      foi.a(),
      ($$0x, $$1x) -> $$1x ? ww.c("options.accessibility.text_background.chat") : ww.c("options.accessibility.text_background.everywhere"),
      foi.a,
      true,
      $$0x -> {
      }
   );
   private final foi<Boolean> bI = foi.a("options.touchscreen", false);
   private final foi<Boolean> bJ = foi.a("options.fullscreen", false, $$0x -> {
      fof $$1x = fof.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ad().a($$1x.aO().i());
      }
   });
   private final foi<Boolean> bK = foi.a("options.viewBobbing", true);
   private static final ww bL = ww.c("options.key.toggle");
   private static final ww bM = ww.c("options.key.hold");
   private final foi<Boolean> bN = new foi<>("key.sneak", foi.a(), ($$0x, $$1x) -> $$1x ? bL : bM, foi.a, false, $$0x -> {
   });
   private final foi<Boolean> bO = new foi<>("key.sprint", foi.a(), ($$0x, $$1x) -> $$1x ? bL : bM, foi.a, false, $$0x -> {
   });
   public boolean u;
   private static final ww bP = ww.c("options.hideMatchedNames.tooltip");
   private final foi<Boolean> bQ = foi.a("options.hideMatchedNames", foi.a(bP), true);
   private final foi<Boolean> bR = foi.a("options.autosaveIndicator", true);
   private static final ww bS = ww.c("options.onlyShowSecureChat.tooltip");
   private final foi<Boolean> bT = foi.a("options.onlyShowSecureChat", foi.a(bS), false);
   public final fod v = new fod("key.forward", 87, "key.categories.movement");
   public final fod w = new fod("key.left", 65, "key.categories.movement");
   public final fod x = new fod("key.back", 83, "key.categories.movement");
   public final fod y = new fod("key.right", 68, "key.categories.movement");
   public final fod z = new fod("key.jump", 32, "key.categories.movement");
   public final fod A = new foq("key.sneak", 340, "key.categories.movement", this.bN::c);
   public final fod B = new foq("key.sprint", 341, "key.categories.movement", this.bO::c);
   public final fod C = new fod("key.inventory", 69, "key.categories.inventory");
   public final fod D = new fod("key.swapOffhand", 70, "key.categories.inventory");
   public final fod E = new fod("key.drop", 81, "key.categories.inventory");
   public final fod F = new fod("key.use", fhl.b.c, 1, "key.categories.gameplay");
   public final fod G = new fod("key.attack", fhl.b.c, 0, "key.categories.gameplay");
   public final fod H = new fod("key.pickItem", fhl.b.c, 2, "key.categories.gameplay");
   public final fod I = new fod("key.chat", 84, "key.categories.multiplayer");
   public final fod J = new fod("key.playerlist", 258, "key.categories.multiplayer");
   public final fod K = new fod("key.command", 47, "key.categories.multiplayer");
   public final fod L = new fod("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fod M = new fod("key.screenshot", 291, "key.categories.misc");
   public final fod N = new fod("key.togglePerspective", 294, "key.categories.misc");
   public final fod O = new fod("key.smoothCamera", fhl.bv.b(), "key.categories.misc");
   public final fod P = new fod("key.fullscreen", 300, "key.categories.misc");
   public final fod Q = new fod("key.spectatorOutlines", fhl.bv.b(), "key.categories.misc");
   public final fod R = new fod("key.advancements", 76, "key.categories.misc");
   public final fod[] S = new fod[]{
      new fod("key.hotbar.1", 49, "key.categories.inventory"),
      new fod("key.hotbar.2", 50, "key.categories.inventory"),
      new fod("key.hotbar.3", 51, "key.categories.inventory"),
      new fod("key.hotbar.4", 52, "key.categories.inventory"),
      new fod("key.hotbar.5", 53, "key.categories.inventory"),
      new fod("key.hotbar.6", 54, "key.categories.inventory"),
      new fod("key.hotbar.7", 55, "key.categories.inventory"),
      new fod("key.hotbar.8", 56, "key.categories.inventory"),
      new fod("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fod T = new fod("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fod U = new fod("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fod[] V = (fod[])ArrayUtils.addAll(
      new fod[]{
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
   protected fof W;
   private final File bU;
   public boolean X;
   private fno bV = fno.a;
   public String Y = "";
   public boolean Z;
   private final foi<Integer> bW = new foi<>("options.fov", foi.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, ww.c("options.fov.min"));
         case 110 -> a($$0x, ww.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new foi.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fof.Q().f.p());
   private static final ww bX = ww.a("options.telemetry.button.tooltip", ww.c("options.telemetry.state.minimal"), ww.c("options.telemetry.state.all"));
   private final foi<Boolean> bY = foi.a("options.telemetry.button", foi.a(bX), ($$0x, $$1x) -> {
      fof $$2x = fof.Q();
      if (!$$2x.E()) {
         return ww.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? ww.c("options.telemetry.state.all") : ww.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final ww bZ = ww.c("options.screenEffectScale.tooltip");
   private final foi<Double> ca = new foi<>("options.screenEffectScale", foi.a(bZ), foj::b, foi.m.a, 1.0, $$0x -> {
   });
   private static final ww cb = ww.c("options.fovEffectScale.tooltip");
   private final foi<Double> cc = new foi<>(
      "options.fovEffectScale", foi.a(cb), foj::b, foi.m.a.a(azk::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final ww cd = ww.c("options.darknessEffectScale.tooltip");
   private final foi<Double> ce = new foi<>("options.darknessEffectScale", foi.a(cd), foj::b, foi.m.a.a(azk::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final ww cf = ww.c("options.glintSpeed.tooltip");
   private final foi<Double> cg = new foi<>("options.glintSpeed", foi.a(cf), foj::b, foi.m.a, 0.5, $$0x -> {
   });
   private static final ww ch = ww.c("options.glintStrength.tooltip");
   private final foi<Double> ci = new foi<>("options.glintStrength", foi.a(ch), foj::b, foi.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final ww cj = ww.c("options.damageTiltStrength.tooltip");
   private final foi<Double> ck = new foi<>("options.damageTiltStrength", foi.a(cj), foj::b, foi.m.a, 1.0, $$0x -> {
   });
   private final foi<Double> cl = new foi<>("options.gamma", foi.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, ww.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, ww.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, ww.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, foi.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cm = 2147483646;
   private final foi<Integer> cn = new foi<>(
      "options.guiScale", foi.a(), ($$0x, $$1x) -> $$1x == 0 ? ww.c("options.guiScale.auto") : ww.b(Integer.toString($$1x)), new foi.c(0, () -> {
         fof $$0x = fof.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final foi<arg> co = new foi<>(
      "options.particles", foi.a(), foi.b(), new foi.e<>(Arrays.asList(arg.values()), Codec.INT.xmap(arg::a, arg::b)), arg.a, $$0x -> {
      }
   );
   private final foi<foh> cp = new foi<>(
      "options.narrator",
      foi.a(),
      ($$0x, $$1x) -> (ww)(this.W.aY().a() ? $$1x.b() : ww.c("options.narrator.notavailable")),
      new foi.e<>(Arrays.asList(foh.values()), Codec.INT.xmap(foh::a, foh::a)),
      foh.a,
      $$0x -> this.W.aY().a($$0x)
   );
   public String ab = "en_us";
   private final foi<String> cq = new foi<>(
      "options.audioDevice",
      foi.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return ww.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? ww.b($$1x.substring(hmz.c)) : ww.b($$1x);
         }
      },
      new foi.h<>(
         () -> Stream.concat(Stream.of(""), fof.Q().ak().a().stream()).toList(),
         $$0x -> fof.Q().r() && $$0x != "" && !fof.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hnc $$1x = fof.Q().ak();
         $$1x.k();
         $$1x.a(hlr.a(awl.Bp, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;
   public boolean ae = true;

   public foi<Boolean> a() {
      return this.ak;
   }

   public foi<Boolean> b() {
      return this.am;
   }

   public foi<Boolean> c() {
      return this.ao;
   }

   public foi<Double> d() {
      return this.ap;
   }

   public foi<Integer> e() {
      return this.aq;
   }

   public foi<Integer> f() {
      return this.ar;
   }

   public foi<Double> g() {
      return this.at;
   }

   public foi<Integer> h() {
      return this.au;
   }

   public foi<fob> i() {
      return this.ax;
   }

   public foi<fnr> j() {
      return this.ay;
   }

   public foi<fnx> k() {
      return this.aC;
   }

   public foi<Boolean> l() {
      return this.aD;
   }

   public foi<fol> m() {
      return this.aH;
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

      this.az();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.W.l();
      }
   }

   public foi<cqp> n() {
      return this.aI;
   }

   public foi<Double> o() {
      return this.aJ;
   }

   public foi<Double> p() {
      return this.aK;
   }

   public foi<Integer> q() {
      return this.aN;
   }

   public int r() {
      return this.q().c();
   }

   public foi<Double> s() {
      return this.aO;
   }

   public foi<Double> t() {
      return this.aP;
   }

   public foi<Boolean> u() {
      return this.aR;
   }

   public foi<Boolean> v() {
      return this.aT;
   }

   public foi<Boolean> w() {
      return this.aU;
   }

   public foi<bws> x() {
      return this.aW;
   }

   public foi<Double> y() {
      return this.aX;
   }

   public foi<Double> z() {
      return this.aY;
   }

   public foi<Double> A() {
      return this.aZ;
   }

   public foi<Double> B() {
      return this.ba;
   }

   public foi<Double> C() {
      return this.bb;
   }

   public foi<Double> D() {
      return this.bd;
   }

   public foi<Integer> E() {
      return this.be;
   }

   public foi<fnm> F() {
      return this.bf;
   }

   public foi<Integer> G() {
      return this.bg;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return azk.a(Math.log10($$0) * 100.0);
   }

   public foi<Double> H() {
      return this.bh;
   }

   public foi<Boolean> I() {
      return this.bi;
   }

   public foi<Boolean> J() {
      return this.bj;
   }

   public foi<Boolean> K() {
      return this.bl;
   }

   public foi<Boolean> L() {
      return this.bm;
   }

   public foi<Boolean> M() {
      return this.bn;
   }

   public foi<Boolean> N() {
      return this.bo;
   }

   public foi<Boolean> O() {
      return this.bp;
   }

   public foi<Boolean> P() {
      return this.bq;
   }

   public foi<Boolean> Q() {
      return this.br;
   }

   public foi<Boolean> R() {
      return this.bs;
   }

   private static void aI() {
      fof $$0 = fof.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public foi<Boolean> S() {
      return this.bt;
   }

   private static boolean aJ() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public foi<Boolean> T() {
      return this.bu;
   }

   public foi<Boolean> U() {
      return this.bv;
   }

   public foi<Boolean> V() {
      return this.bw;
   }

   public foi<Boolean> W() {
      return this.by;
   }

   public foi<Boolean> X() {
      return this.bA;
   }

   public foi<Boolean> Y() {
      return this.bB;
   }

   public final float a(awm $$0) {
      return this.b($$0).c().floatValue();
   }

   public final foi<Double> b(awm $$0) {
      return Objects.requireNonNull(this.bC.get($$0));
   }

   private foi<Double> a(String $$0, awm $$1) {
      return new foi<>($$0, foi.a(), foj::b, foi.m.a, 1.0, $$1x -> fof.Q().ak().a($$1, $$1x.floatValue()));
   }

   public foi<Boolean> Z() {
      return this.bD;
   }

   public foi<Boolean> aa() {
      return this.bG;
   }

   public foi<Boolean> ab() {
      return this.bH;
   }

   public foi<Boolean> ac() {
      return this.bI;
   }

   public foi<Boolean> ad() {
      return this.bJ;
   }

   public foi<Boolean> ae() {
      return this.bK;
   }

   public foi<Boolean> af() {
      return this.bN;
   }

   public foi<Boolean> ag() {
      return this.bO;
   }

   public foi<Boolean> ah() {
      return this.bQ;
   }

   public foi<Boolean> ai() {
      return this.bR;
   }

   public foi<Boolean> aj() {
      return this.bT;
   }

   public foi<Integer> ak() {
      return this.bW;
   }

   public foi<Boolean> al() {
      return this.bY;
   }

   public foi<Double> am() {
      return this.ca;
   }

   public foi<Double> an() {
      return this.cc;
   }

   public foi<Double> ao() {
      return this.ce;
   }

   public foi<Double> ap() {
      return this.cg;
   }

   public foi<Double> aq() {
      return this.ci;
   }

   public foi<Double> ar() {
      return this.ck;
   }

   public foi<Double> as() {
      return this.cl;
   }

   public foi<Integer> at() {
      return this.cn;
   }

   public foi<arg> au() {
      return this.co;
   }

   public foi<foh> av() {
      return this.cp;
   }

   public foi<String> aw() {
      return this.cq;
   }

   public void ax() {
      this.ac = false;
      this.az();
   }

   public foj(fof $$0, File $$1) {
      this.W = $$0;
      this.bU = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new foi<>(
         "options.renderDistance",
         foi.a(),
         ($$0x, $$1x) -> a($$0x, ww.a("options.chunks", $$1x)),
         new foi.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fof.Q().f.p()
      );
      this.ar = new foi<>(
         "options.simulationDistance", foi.a(), ($$0x, $$1x) -> a($$0x, ww.a("options.chunks", $$1x)), new foi.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = af.n() == af.a.c;
      this.ay();
   }

   public float a(float $$0) {
      return this.bH.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return axu.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bH.c() ? $$0 : axu.a(this.aO.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(foj.b $$0) {
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

   private void a(foj.a $$0) {
      this.a((foj.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, foj::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, foj::c, ag::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, hog::a, hog::a);
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

      for (fod $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fhl.a($$3));
         }
      }

      for (awm $$4 : awm.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bC.get($$4));
      }

      for (cqt $$5 : cqt.values()) {
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

         tx $$0 = new tx();

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

         final tx $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aC.a(fnx.b);
            } else {
               this.aC.a(fnx.a);
            }
         }

         this.a(new foj.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).p_() : null;
            }

            @Override
            public <T> void a(String $$0, foi<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> foj.af.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     foj.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? foj.a($$2) : $$1;
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
               } else if (foj.a($$2)) {
                  return 1.0F;
               } else if (foj.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     foj.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fod.d();
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

   private tx a(tx $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return baz.e.a(this.W.au(), $$0, $$1);
   }

   public void az() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bU), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new foj.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, foi<T> $$1) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1x -> foj.af.error("Error saving option " + $$1 + ": " + $$1x)).ifSuccess($$2x -> {
                  this.a($$0);
                  $$0.println(foj.ag.toJson($$2x));
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
      fht $$0 = this.W.aO();
      if ($$0 == null) {
         return this.k;
      } else {
         return $$0.e().isPresent() ? $$0.e().get().g() : null;
      }
   }

   public aqy aA() {
      int $$0 = 0;

      for (cqt $$1 : this.aV) {
         $$0 |= $$1.a();
      }

      return new aqy(this.ab, this.aq.c(), this.aI.c(), this.bo.c(), $$0, this.aW.c(), this.W.aT(), this.bA.c(), this.co.c());
   }

   public void aB() {
      if (this.W.t != null) {
         this.W.t.j.a(this.aA());
      }
   }

   public void a(cqt $$0, boolean $$1) {
      if ($$1) {
         this.aV.add($$0);
      } else {
         this.aV.remove($$0);
      }
   }

   public boolean a(cqt $$0) {
      return this.aV.contains($$0);
   }

   public fnr aC() {
      return this.aH() >= 4 ? this.ay.c() : fnr.a;
   }

   public boolean aD() {
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

   public fno aE() {
      return this.bV;
   }

   public void a(fno $$0) {
      this.bV = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = aza.a(ag, $$0, ah);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aF() {
      return this.bU;
   }

   public String aG() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new foj.b() {
         @Override
         public <T> void a(String $$0x, foi<T> $$1) {
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

   private static ww c(ww $$0, int $$1) {
      return ww.a("options.pixel_value", $$0, $$1);
   }

   private static ww a(ww $$0, double $$1) {
      return ww.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static ww a(ww $$0, ww $$1) {
      return ww.a("options.generic_value", $$0, $$1);
   }

   public static ww a(ww $$0, int $$1) {
      return a($$0, ww.b(Integer.toString($$1)));
   }

   public static ww b(ww $$0, int $$1) {
      return $$1 == 0 ? a($$0, wv.c) : a($$0, $$1);
   }

   private static ww b(ww $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, wv.c) : a($$0, $$1);
   }

   interface a extends foj.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, foi<T> var2);
   }
}
