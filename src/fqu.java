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

public class fqu {
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
   private static final xg aj = xg.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fqt<Boolean> ak = fqt.a("options.darkMojangStudiosBackgroundColor", fqt.a(aj), false);
   private static final xg al = xg.c("options.hideLightningFlashes.tooltip");
   private final fqt<Boolean> am = fqt.a("options.hideLightningFlashes", fqt.a(al), false);
   private static final xg an = xg.c("options.hideSplashTexts.tooltip");
   private final fqt<Boolean> ao = fqt.a("options.hideSplashTexts", fqt.a(an), false);
   private final fqt<Double> ap = new fqt<>("options.sensitivity", fqt.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xg.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xg.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fqt.m.a, 0.5, $$0x -> {
   });
   private final fqt<Integer> aq;
   private final fqt<Integer> ar;
   private int as = 0;
   private final fqt<Double> at = new fqt<>(
      "options.entityDistanceScaling",
      fqt.a(),
      fqu::a,
      new fqt.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fqt<Integer> au = new fqt<>(
      "options.framerateLimit",
      fqt.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xg.c("options.framerateLimit.max")) : a($$0x, xg.a("options.framerate", $$1x)),
      new fqt.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fqq.Q().aP().a($$0x)
   );
   private static final xg av = xg.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final xg aw = xg.c("options.inactivityFpsLimit.afk.tooltip");
   private final fqt<fqm> ax = new fqt<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> fvj.a(av);
         case b -> fvj.a(aw);
      };
   }, fqt.b(), new fqt.e<>(Arrays.asList(fqm.values()), fqm.c), fqm.b, $$0x -> {
   });
   private final fqt<fqc> ay = new fqt<>(
      "options.renderClouds",
      fqt.a(),
      fqt.b(),
      new fqt.e<>(Arrays.asList(fqc.values()), Codec.withAlternative(fqc.d, Codec.BOOL, $$0x -> $$0x ? fqc.c : fqc.a)),
      fqc.c,
      $$0x -> {
      }
   );
   private static final xg az = xg.c("options.graphics.fast.tooltip");
   private static final xg aA = xg.a("options.graphics.fabulous.tooltip", xg.c("options.graphics.fabulous").a(o.u));
   private static final xg aB = xg.c("options.graphics.fancy.tooltip");
   private final fqt<fqi> aC = new fqt<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fvj.a(aB);
            case a -> fvj.a(az);
            case c -> fvj.a(aA);
         };
      },
      ($$0x, $$1x) -> {
         xu $$2x = xg.c($$1x.a());
         return $$1x == fqi.c ? $$2x.a(o.u) : $$2x;
      },
      new fqt.a<>(
         Arrays.asList(fqi.values()),
         Stream.of(fqi.values()).filter($$0x -> $$0x != fqi.c).collect(Collectors.toList()),
         () -> fqq.Q().r() && fqq.Q().aj().g(),
         ($$0x, $$1x) -> {
            fqq $$2x = fqq.Q();
            gre $$3 = $$2x.aj();
            if ($$1x == fqi.c && $$3.b()) {
               $$3.c();
            } else {
               $$0x.a($$1x);
               $$2x.f.d();
            }
         },
         Codec.INT.xmap(fqi::a, fqi::b)
      ),
      fqi.b,
      $$0x -> {
      }
   );
   private final fqt<Boolean> aD = fqt.a("options.ao", true, $$0x -> fqq.Q().f.d());
   private static final xg aE = xg.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xg aF = xg.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xg aG = xg.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fqt<fqw> aH = new fqt<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fvj.a(aE);
         case b -> fvj.a(aF);
         case c -> fvj.a(aG);
      };
   }, fqt.b(), new fqt.e<>(Arrays.asList(fqw.values()), Codec.INT.xmap(fqw::a, fqw::b)), fqw.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fqt<csf> aI = new fqt<>(
      "options.chat.visibility", fqt.a(), fqt.b(), new fqt.e<>(Arrays.asList(csf.values()), Codec.INT.xmap(csf::a, csf::b)), csf.a, $$0x -> {
      }
   );
   private final fqt<Double> aJ = new fqt<>("options.chat.opacity", fqt.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fqt.m.a, 1.0, $$0x -> fqq.Q().m.d().b());
   private final fqt<Double> aK = new fqt<>("options.chat.line_spacing", fqt.a(), fqu::a, fqt.m.a, 0.0, $$0x -> {
   });
   private static final xg aL = xg.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aM = 5;
   private final fqt<Integer> aN = new fqt<>("options.accessibility.menu_background_blurriness", fqt.a(aL), fqu::b, new fqt.f(0, 10), 5, $$0x -> {
   });
   private final fqt<Double> aO = new fqt<>("options.accessibility.text_background_opacity", fqt.a(), fqu::a, fqt.m.a, 0.5, $$0x -> fqq.Q().m.d().b());
   private final fqt<Double> aP = new fqt<>("options.accessibility.panorama_speed", fqt.a(), fqu::a, fqt.m.a, 1.0, $$0x -> {
   });
   private static final xg aQ = xg.c("options.accessibility.high_contrast.tooltip");
   private final fqt<Boolean> aR = fqt.a("options.accessibility.high_contrast", fqt.a(aQ), false, $$0x -> {
      auz $$1x = fqq.Q().ad();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private static final xg aS = xg.c("options.accessibility.high_contrast_block_outline.tooltip");
   private final fqt<Boolean> aT = fqt.a("options.accessibility.high_contrast_block_outline", fqt.a(aS), false);
   private final fqt<Boolean> aU = fqt.a(
      "options.accessibility.narrator_hotkey",
      fqt.a(fqq.a ? xg.c("options.accessibility.narrator_hotkey.mac.tooltip") : xg.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<csk> aV = EnumSet.allOf(csk.class);
   private final fqt<bxw> aW = new fqt<>("options.mainHand", fqt.a(), fqt.b(), new fqt.e<>(Arrays.asList(bxw.values()), bxw.c), bxw.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fqt<Double> aX = new fqt<>(
      "options.chat.scale",
      fqt.a(),
      ($$0x, $$1x) -> (xg)($$1x == 0.0 ? xf.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fqt.m.a,
      1.0,
      $$0x -> fqq.Q().m.d().b()
   );
   private final fqt<Double> aY = new fqt<>("options.chat.width", fqt.a(), ($$0x, $$1x) -> c($$0x, ftz.a($$1x)), fqt.m.a, 1.0, $$0x -> fqq.Q().m.d().b());
   private final fqt<Double> aZ = new fqt<>(
      "options.chat.height.unfocused", fqt.a(), ($$0x, $$1x) -> c($$0x, ftz.b($$1x)), fqt.m.a, ftz.i(), $$0x -> fqq.Q().m.d().b()
   );
   private final fqt<Double> ba = new fqt<>(
      "options.chat.height.focused", fqt.a(), ($$0x, $$1x) -> c($$0x, ftz.b($$1x)), fqt.m.a, 1.0, $$0x -> fqq.Q().m.d().b()
   );
   private final fqt<Double> bb = new fqt<>(
      "options.chat.delay_instant",
      fqt.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xg.c("options.chat.delay_none") : xg.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fqt.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fqq.Q().aZ().a($$0x)
   );
   private static final xg bc = xg.c("options.notifications.display_time.tooltip");
   private final fqt<Double> bd = new fqt<>(
      "options.notifications.display_time",
      fqt.a(bc),
      ($$0x, $$1x) -> a($$0x, xg.a("options.multiplier", $$1x)),
      new fqt.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fqt<Integer> be = new fqt<>(
      "options.mipmapLevels", fqt.a(), ($$0x, $$1x) -> (xg)($$1x == 0 ? xf.a($$0x, false) : a($$0x, $$1x.intValue())), new fqt.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fqt<fpx> bf = new fqt<>(
      "options.attackIndicator", fqt.a(), fqt.b(), new fqt.e<>(Arrays.asList(fpx.values()), Codec.INT.xmap(fpx::a, fpx::b)), fpx.b, $$0x -> {
      }
   );
   public hqx r = hqx.a;
   public boolean s = false;
   private final fqt<Integer> bg = new fqt<>("options.biomeBlendRadius", fqt.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xg.c("options.biomeBlendRadius." + $$2x));
   }, new fqt.f(0, 7, false), 2, $$0x -> fqq.Q().f.d());
   private final fqt<Double> bh = new fqt<>(
      "options.mouseWheelSensitivity",
      fqt.a(),
      ($$0x, $$1x) -> a($$0x, xg.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fqt.f(-200, 100).a(fqu::c, fqu::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fqt<Boolean> bi = fqt.a("options.rawMouseInput", true, $$0x -> {
      fki $$1x = fqq.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fqt<Boolean> bj = fqt.a("options.autoJump", false);
   private static final xg bk = xg.c("options.rotateWithMinecart.tooltip");
   private final fqt<Boolean> bl = fqt.a("options.rotateWithMinecart", fqt.a(bk), false);
   private final fqt<Boolean> bm = fqt.a("options.operatorItemsTab", false);
   private final fqt<Boolean> bn = fqt.a("options.autoSuggestCommands", true);
   private final fqt<Boolean> bo = fqt.a("options.chat.color", true);
   private final fqt<Boolean> bp = fqt.a("options.chat.links", true);
   private final fqt<Boolean> bq = fqt.a("options.chat.links.prompt", true);
   private final fqt<Boolean> br = fqt.a("options.vsync", true, $$0x -> {
      if (fqq.Q().aO() != null) {
         fqq.Q().aO().a($$0x);
      }
   });
   private final fqt<Boolean> bs = fqt.a("options.entityShadows", true);
   private final fqt<Boolean> bt = fqt.a("options.forceUnicodeFont", false, $$0x -> aI());
   private final fqt<Boolean> bu = fqt.a("options.japaneseGlyphVariants", fqt.a(xg.c("options.japaneseGlyphVariants.tooltip")), aJ(), $$0x -> aI());
   private final fqt<Boolean> bv = fqt.a("options.invertMouse", false);
   private final fqt<Boolean> bw = fqt.a("options.discrete_mouse_scroll", false);
   private static final xg bx = xg.c("options.realmsNotifications.tooltip");
   private final fqt<Boolean> by = fqt.a("options.realmsNotifications", fqt.a(bx), true);
   private static final xg bz = xg.c("options.allowServerListing.tooltip");
   private final fqt<Boolean> bA = fqt.a("options.allowServerListing", fqt.a(bz), true, $$0x -> {
   });
   private final fqt<Boolean> bB = fqt.a("options.reducedDebugInfo", false);
   private final Map<awz, fqt<Double>> bC = ag.a(awz.class, $$0x -> this.a("soundCategory." + $$0x.a(), $$0x));
   private final fqt<Boolean> bD = fqt.a("options.showSubtitles", false);
   private static final xg bE = xg.c("options.directionalAudio.on.tooltip");
   private static final xg bF = xg.c("options.directionalAudio.off.tooltip");
   private final fqt<Boolean> bG = fqt.a("options.directionalAudio", $$0x -> $$0x ? fvj.a(bE) : fvj.a(bF), false, $$0x -> {
      hpt $$1x = fqq.Q().ak();
      $$1x.j();
      $$1x.a(hoi.a(awy.Bv, 1.0F));
   });
   private final fqt<Boolean> bH = new fqt<>(
      "options.accessibility.text_background",
      fqt.a(),
      ($$0x, $$1x) -> $$1x ? xg.c("options.accessibility.text_background.chat") : xg.c("options.accessibility.text_background.everywhere"),
      fqt.a,
      true,
      $$0x -> {
      }
   );
   private final fqt<Boolean> bI = fqt.a("options.touchscreen", false);
   private final fqt<Boolean> bJ = fqt.a("options.fullscreen", false, $$0x -> {
      fqq $$1x = fqq.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ad().a($$1x.aO().i());
      }
   });
   private final fqt<Boolean> bK = fqt.a("options.viewBobbing", true);
   private static final xg bL = xg.c("options.key.toggle");
   private static final xg bM = xg.c("options.key.hold");
   private final fqt<Boolean> bN = new fqt<>("key.sneak", fqt.a(), ($$0x, $$1x) -> $$1x ? bL : bM, fqt.a, false, $$0x -> {
   });
   private final fqt<Boolean> bO = new fqt<>("key.sprint", fqt.a(), ($$0x, $$1x) -> $$1x ? bL : bM, fqt.a, false, $$0x -> {
   });
   public boolean u;
   private static final xg bP = xg.c("options.hideMatchedNames.tooltip");
   private final fqt<Boolean> bQ = fqt.a("options.hideMatchedNames", fqt.a(bP), true);
   private final fqt<Boolean> bR = fqt.a("options.autosaveIndicator", true);
   private static final xg bS = xg.c("options.onlyShowSecureChat.tooltip");
   private final fqt<Boolean> bT = fqt.a("options.onlyShowSecureChat", fqt.a(bS), false);
   public final fqo v = new fqo("key.forward", 87, "key.categories.movement");
   public final fqo w = new fqo("key.left", 65, "key.categories.movement");
   public final fqo x = new fqo("key.back", 83, "key.categories.movement");
   public final fqo y = new fqo("key.right", 68, "key.categories.movement");
   public final fqo z = new fqo("key.jump", 32, "key.categories.movement");
   public final fqo A = new frb("key.sneak", 340, "key.categories.movement", this.bN::c);
   public final fqo B = new frb("key.sprint", 341, "key.categories.movement", this.bO::c);
   public final fqo C = new fqo("key.inventory", 69, "key.categories.inventory");
   public final fqo D = new fqo("key.swapOffhand", 70, "key.categories.inventory");
   public final fqo E = new fqo("key.drop", 81, "key.categories.inventory");
   public final fqo F = new fqo("key.use", fka.b.c, 1, "key.categories.gameplay");
   public final fqo G = new fqo("key.attack", fka.b.c, 0, "key.categories.gameplay");
   public final fqo H = new fqo("key.pickItem", fka.b.c, 2, "key.categories.gameplay");
   public final fqo I = new fqo("key.chat", 84, "key.categories.multiplayer");
   public final fqo J = new fqo("key.playerlist", 258, "key.categories.multiplayer");
   public final fqo K = new fqo("key.command", 47, "key.categories.multiplayer");
   public final fqo L = new fqo("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fqo M = new fqo("key.screenshot", 291, "key.categories.misc");
   public final fqo N = new fqo("key.togglePerspective", 294, "key.categories.misc");
   public final fqo O = new fqo("key.smoothCamera", fka.bv.b(), "key.categories.misc");
   public final fqo P = new fqo("key.fullscreen", 300, "key.categories.misc");
   public final fqo Q = new fqo("key.spectatorOutlines", fka.bv.b(), "key.categories.misc");
   public final fqo R = new fqo("key.advancements", 76, "key.categories.misc");
   public final fqo[] S = new fqo[]{
      new fqo("key.hotbar.1", 49, "key.categories.inventory"),
      new fqo("key.hotbar.2", 50, "key.categories.inventory"),
      new fqo("key.hotbar.3", 51, "key.categories.inventory"),
      new fqo("key.hotbar.4", 52, "key.categories.inventory"),
      new fqo("key.hotbar.5", 53, "key.categories.inventory"),
      new fqo("key.hotbar.6", 54, "key.categories.inventory"),
      new fqo("key.hotbar.7", 55, "key.categories.inventory"),
      new fqo("key.hotbar.8", 56, "key.categories.inventory"),
      new fqo("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fqo T = new fqo("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fqo U = new fqo("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fqo[] V = (fqo[])ArrayUtils.addAll(
      new fqo[]{
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
   protected fqq W;
   private final File bU;
   public boolean X;
   private fpz bV = fpz.a;
   public String Y = "";
   public boolean Z;
   private final fqt<Integer> bW = new fqt<>("options.fov", fqt.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xg.c("options.fov.min"));
         case 110 -> a($$0x, xg.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fqt.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fqq.Q().f.o());
   private static final xg bX = xg.a("options.telemetry.button.tooltip", xg.c("options.telemetry.state.minimal"), xg.c("options.telemetry.state.all"));
   private final fqt<Boolean> bY = fqt.a("options.telemetry.button", fqt.a(bX), ($$0x, $$1x) -> {
      fqq $$2x = fqq.Q();
      if (!$$2x.E()) {
         return xg.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xg.c("options.telemetry.state.all") : xg.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xg bZ = xg.c("options.screenEffectScale.tooltip");
   private final fqt<Double> ca = new fqt<>("options.screenEffectScale", fqt.a(bZ), fqu::b, fqt.m.a, 1.0, $$0x -> {
   });
   private static final xg cb = xg.c("options.fovEffectScale.tooltip");
   private final fqt<Double> cc = new fqt<>(
      "options.fovEffectScale", fqt.a(cb), fqu::b, fqt.m.a.a(azz::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final xg cd = xg.c("options.darknessEffectScale.tooltip");
   private final fqt<Double> ce = new fqt<>("options.darknessEffectScale", fqt.a(cd), fqu::b, fqt.m.a.a(azz::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final xg cf = xg.c("options.glintSpeed.tooltip");
   private final fqt<Double> cg = new fqt<>("options.glintSpeed", fqt.a(cf), fqu::b, fqt.m.a, 0.5, $$0x -> {
   });
   private static final xg ch = xg.c("options.glintStrength.tooltip");
   private final fqt<Double> ci = new fqt<>("options.glintStrength", fqt.a(ch), fqu::b, fqt.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final xg cj = xg.c("options.damageTiltStrength.tooltip");
   private final fqt<Double> ck = new fqt<>("options.damageTiltStrength", fqt.a(cj), fqu::b, fqt.m.a, 1.0, $$0x -> {
   });
   private final fqt<Double> cl = new fqt<>("options.gamma", fqt.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xg.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xg.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xg.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fqt.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cm = 2147483646;
   private final fqt<Integer> cn = new fqt<>(
      "options.guiScale", fqt.a(), ($$0x, $$1x) -> $$1x == 0 ? xg.c("options.guiScale.auto") : xg.b(Integer.toString($$1x)), new fqt.c(0, () -> {
         fqq $$0x = fqq.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fqt<art> co = new fqt<>(
      "options.particles", fqt.a(), fqt.b(), new fqt.e<>(Arrays.asList(art.values()), Codec.INT.xmap(art::a, art::b)), art.a, $$0x -> {
      }
   );
   private final fqt<fqs> cp = new fqt<>(
      "options.narrator",
      fqt.a(),
      ($$0x, $$1x) -> (xg)(this.W.aY().a() ? $$1x.b() : xg.c("options.narrator.notavailable")),
      new fqt.e<>(Arrays.asList(fqs.values()), Codec.INT.xmap(fqs::a, fqs::a)),
      fqs.a,
      $$0x -> this.W.aY().a($$0x)
   );
   public String ab = "en_us";
   private final fqt<String> cq = new fqt<>(
      "options.audioDevice",
      fqt.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xg.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xg.b($$1x.substring(hpq.c)) : xg.b($$1x);
         }
      },
      new fqt.h<>(
         () -> Stream.concat(Stream.of(""), fqq.Q().ak().a().stream()).toList(),
         $$0x -> fqq.Q().r() && $$0x != "" && !fqq.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hpt $$1x = fqq.Q().ak();
         $$1x.j();
         $$1x.a(hoi.a(awy.Bv, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;
   public boolean ae = true;

   public fqt<Boolean> a() {
      return this.ak;
   }

   public fqt<Boolean> b() {
      return this.am;
   }

   public fqt<Boolean> c() {
      return this.ao;
   }

   public fqt<Double> d() {
      return this.ap;
   }

   public fqt<Integer> e() {
      return this.aq;
   }

   public fqt<Integer> f() {
      return this.ar;
   }

   public fqt<Double> g() {
      return this.at;
   }

   public fqt<Integer> h() {
      return this.au;
   }

   public fqt<fqm> i() {
      return this.ax;
   }

   public fqt<fqc> j() {
      return this.ay;
   }

   public fqt<fqi> k() {
      return this.aC;
   }

   public fqt<Boolean> l() {
      return this.aD;
   }

   public fqt<fqw> m() {
      return this.aH;
   }

   public void a(auz $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (auv $$2 : $$0.g()) {
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

   public fqt<csf> n() {
      return this.aI;
   }

   public fqt<Double> o() {
      return this.aJ;
   }

   public fqt<Double> p() {
      return this.aK;
   }

   public fqt<Integer> q() {
      return this.aN;
   }

   public int r() {
      return this.q().c();
   }

   public fqt<Double> s() {
      return this.aO;
   }

   public fqt<Double> t() {
      return this.aP;
   }

   public fqt<Boolean> u() {
      return this.aR;
   }

   public fqt<Boolean> v() {
      return this.aT;
   }

   public fqt<Boolean> w() {
      return this.aU;
   }

   public fqt<bxw> x() {
      return this.aW;
   }

   public fqt<Double> y() {
      return this.aX;
   }

   public fqt<Double> z() {
      return this.aY;
   }

   public fqt<Double> A() {
      return this.aZ;
   }

   public fqt<Double> B() {
      return this.ba;
   }

   public fqt<Double> C() {
      return this.bb;
   }

   public fqt<Double> D() {
      return this.bd;
   }

   public fqt<Integer> E() {
      return this.be;
   }

   public fqt<fpx> F() {
      return this.bf;
   }

   public fqt<Integer> G() {
      return this.bg;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return azz.a(Math.log10($$0) * 100.0);
   }

   public fqt<Double> H() {
      return this.bh;
   }

   public fqt<Boolean> I() {
      return this.bi;
   }

   public fqt<Boolean> J() {
      return this.bj;
   }

   public fqt<Boolean> K() {
      return this.bl;
   }

   public fqt<Boolean> L() {
      return this.bm;
   }

   public fqt<Boolean> M() {
      return this.bn;
   }

   public fqt<Boolean> N() {
      return this.bo;
   }

   public fqt<Boolean> O() {
      return this.bp;
   }

   public fqt<Boolean> P() {
      return this.bq;
   }

   public fqt<Boolean> Q() {
      return this.br;
   }

   public fqt<Boolean> R() {
      return this.bs;
   }

   private static void aI() {
      fqq $$0 = fqq.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fqt<Boolean> S() {
      return this.bt;
   }

   private static boolean aJ() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fqt<Boolean> T() {
      return this.bu;
   }

   public fqt<Boolean> U() {
      return this.bv;
   }

   public fqt<Boolean> V() {
      return this.bw;
   }

   public fqt<Boolean> W() {
      return this.by;
   }

   public fqt<Boolean> X() {
      return this.bA;
   }

   public fqt<Boolean> Y() {
      return this.bB;
   }

   public final float a(awz $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fqt<Double> b(awz $$0) {
      return Objects.requireNonNull(this.bC.get($$0));
   }

   private fqt<Double> a(String $$0, awz $$1) {
      return new fqt<>($$0, fqt.a(), fqu::b, fqt.m.a, 1.0, $$1x -> fqq.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fqt<Boolean> Z() {
      return this.bD;
   }

   public fqt<Boolean> aa() {
      return this.bG;
   }

   public fqt<Boolean> ab() {
      return this.bH;
   }

   public fqt<Boolean> ac() {
      return this.bI;
   }

   public fqt<Boolean> ad() {
      return this.bJ;
   }

   public fqt<Boolean> ae() {
      return this.bK;
   }

   public fqt<Boolean> af() {
      return this.bN;
   }

   public fqt<Boolean> ag() {
      return this.bO;
   }

   public fqt<Boolean> ah() {
      return this.bQ;
   }

   public fqt<Boolean> ai() {
      return this.bR;
   }

   public fqt<Boolean> aj() {
      return this.bT;
   }

   public fqt<Integer> ak() {
      return this.bW;
   }

   public fqt<Boolean> al() {
      return this.bY;
   }

   public fqt<Double> am() {
      return this.ca;
   }

   public fqt<Double> an() {
      return this.cc;
   }

   public fqt<Double> ao() {
      return this.ce;
   }

   public fqt<Double> ap() {
      return this.cg;
   }

   public fqt<Double> aq() {
      return this.ci;
   }

   public fqt<Double> ar() {
      return this.ck;
   }

   public fqt<Double> as() {
      return this.cl;
   }

   public fqt<Integer> at() {
      return this.cn;
   }

   public fqt<art> au() {
      return this.co;
   }

   public fqt<fqs> av() {
      return this.cp;
   }

   public fqt<String> aw() {
      return this.cq;
   }

   public void ax() {
      this.ac = false;
      this.az();
   }

   public fqu(fqq $$0, File $$1) {
      this.W = $$0;
      this.bU = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new fqt<>(
         "options.renderDistance",
         fqt.a(),
         ($$0x, $$1x) -> a($$0x, xg.a("options.chunks", $$1x)),
         new fqt.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fqq.Q().f.o()
      );
      this.ar = new fqt<>(
         "options.simulationDistance", fqt.a(), ($$0x, $$1x) -> a($$0x, xg.a("options.chunks", $$1x)), new fqt.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = ag.n() == ag.a.c;
      this.ay();
   }

   public float a(float $$0) {
      return this.bH.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return ayh.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bH.c() ? $$0 : ayh.a(this.aO.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(fqu.b $$0) {
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

   private void a(fqu.a $$0) {
      this.a((fqu.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, fqu::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fqu::c, ag::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, hqx::a, hqx::a);
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

      for (fqo $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fka.a($$3));
         }
      }

      for (awz $$4 : awz.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bC.get($$4));
      }

      for (csk $$5 : csk.values()) {
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

         ua $$0 = new ua();

         try (BufferedReader $$1 = Files.newReader(this.bU, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = ai.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3x) {
                  af.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final ua $$2 = this.a($$0);
         Optional<String> $$3 = $$2.i("fancyGraphics");
         if ($$3.isPresent() && !$$2.b("graphicsMode")) {
            this.aC.a(a($$3.get()) ? fqi.b : fqi.a);
         }

         this.a(
            new fqu.a() {
               @Nullable
               private String a(String $$0) {
                  va $$1 = $$2.a($$0);
                  if ($$1 == null) {
                     return null;
                  } else if ($$1 instanceof uy var3) {
                     uy var10000 = var3;

                     try {
                        var7 = var10000.k();
                     } catch (Throwable var6) {
                        throw new MatchException(var6.toString(), var6);
                     }

                     return var7;
                  } else {
                     throw new IllegalStateException("Cannot read field of wrong type, expected string: " + $$1);
                  }
               }

               @Override
               public <T> void a(String $$0, fqt<T> $$1) {
                  String $$2 = this.a($$0);
                  if ($$2 != null) {
                     JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                     JsonElement $$4 = JsonParser.parseReader($$3);
                     $$1.d()
                        .parse(JsonOps.INSTANCE, $$4)
                        .ifError($$2xx -> fqu.af.error("Error parsing option value {} for option {}: {}", new Object[]{$$2, $$1, $$2xx.message()}))
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
                        fqu.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                     }
                  }

                  return $$1;
               }

               @Override
               public boolean a(String $$0, boolean $$1) {
                  String $$2 = this.a($$0);
                  return $$2 != null ? fqu.a($$2) : $$1;
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
                  } else if (fqu.a($$2)) {
                     return 1.0F;
                  } else if (fqu.b($$2)) {
                     return 0.0F;
                  } else {
                     try {
                        return Float.parseFloat($$2);
                     } catch (NumberFormatException var5) {
                        fqu.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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
         $$2.i("fullscreenResolution").ifPresent($$0x -> this.k = $$0x);
         fqo.d();
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

   private ua a(ua $$0) {
      int $$1 = 0;

      try {
         $$1 = $$0.i("version").map(Integer::parseInt).orElse(0);
      } catch (RuntimeException var4) {
      }

      return bbo.e.a(this.W.au(), $$0, $$1);
   }

   public void az() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bU), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ac.b().d().c());
         this.a(new fqu.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fqt<T> $$1) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1x -> fqu.af.error("Error saving option " + $$1 + ": " + $$1x)).ifSuccess($$2x -> {
                  this.a($$0);
                  $$0.println(fqu.ag.toJson($$2x));
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
      fki $$0 = this.W.aO();
      if ($$0 == null) {
         return this.k;
      } else {
         return $$0.e().isPresent() ? $$0.e().get().g() : null;
      }
   }

   public arl aA() {
      int $$0 = 0;

      for (csk $$1 : this.aV) {
         $$0 |= $$1.a();
      }

      return new arl(this.ab, this.aq.c(), this.aI.c(), this.bo.c(), $$0, this.aW.c(), this.W.aT(), this.bA.c(), this.co.c());
   }

   public void aB() {
      if (this.W.t != null) {
         this.W.t.j.a(this.aA());
      }
   }

   public void a(csk $$0, boolean $$1) {
      if ($$1) {
         this.aV.add($$0);
      } else {
         this.aV.remove($$0);
      }
   }

   public boolean a(csk $$0) {
      return this.aV.contains($$0);
   }

   public fqc aC() {
      return this.aH() >= 4 ? this.ay.c() : fqc.a;
   }

   public boolean aD() {
      return this.q;
   }

   public void b(auz $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         auv $$4 = $$0.c($$3);
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

   public fpz aE() {
      return this.bV;
   }

   public void a(fpz $$0) {
      this.bV = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = azo.a(ag, $$0, ah);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aF() {
      return this.bU;
   }

   public String aG() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fqu.b() {
         @Override
         public <T> void a(String $$0x, fqt<T> $$1) {
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

   private static xg c(xg $$0, int $$1) {
      return xg.a("options.pixel_value", $$0, $$1);
   }

   private static xg a(xg $$0, double $$1) {
      return xg.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static xg a(xg $$0, xg $$1) {
      return xg.a("options.generic_value", $$0, $$1);
   }

   public static xg a(xg $$0, int $$1) {
      return a($$0, xg.b(Integer.toString($$1)));
   }

   public static xg b(xg $$0, int $$1) {
      return $$1 == 0 ? a($$0, xf.c) : a($$0, $$1);
   }

   private static xg b(xg $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, xf.c) : a($$0, $$1);
   }

   interface a extends fqu.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fqt<T> var2);
   }
}
