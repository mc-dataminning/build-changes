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

public class fmk {
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
   private static final wp aj = wp.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fmj<Boolean> ak = fmj.a("options.darkMojangStudiosBackgroundColor", fmj.a(aj), false);
   private static final wp al = wp.c("options.hideLightningFlashes.tooltip");
   private final fmj<Boolean> am = fmj.a("options.hideLightningFlashes", fmj.a(al), false);
   private static final wp an = wp.c("options.hideSplashTexts.tooltip");
   private final fmj<Boolean> ao = fmj.a("options.hideSplashTexts", fmj.a(an), false);
   private final fmj<Double> ap = new fmj<>("options.sensitivity", fmj.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wp.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wp.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fmj.m.a, 0.5, $$0x -> {
   });
   private final fmj<Integer> aq;
   private final fmj<Integer> ar;
   private int as = 0;
   private final fmj<Double> at = new fmj<>(
      "options.entityDistanceScaling",
      fmj.a(),
      fmk::a,
      new fmj.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fmj<Integer> au = new fmj<>(
      "options.framerateLimit",
      fmj.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wp.c("options.framerateLimit.max")) : a($$0x, wp.a("options.framerate", $$1x)),
      new fmj.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fmg.Q().aP().a($$0x)
   );
   private static final wp av = wp.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final wp aw = wp.c("options.inactivityFpsLimit.afk.tooltip");
   private final fmj<fmc> ax = new fmj<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> frb.a(av);
         case b -> frb.a(aw);
      };
   }, fmj.b(), new fmj.e<>(Arrays.asList(fmc.values()), fmc.c), fmc.b, $$0x -> {
   });
   private final fmj<fls> ay = new fmj<>(
      "options.renderClouds",
      fmj.a(),
      fmj.b(),
      new fmj.e<>(Arrays.asList(fls.values()), Codec.withAlternative(fls.d, Codec.BOOL, $$0x -> $$0x ? fls.c : fls.a)),
      fls.c,
      $$0x -> {
      }
   );
   private static final wp az = wp.c("options.graphics.fast.tooltip");
   private static final wp aA = wp.a("options.graphics.fabulous.tooltip", wp.c("options.graphics.fabulous").a(n.u));
   private static final wp aB = wp.c("options.graphics.fancy.tooltip");
   private final fmj<fly> aC = new fmj<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> frb.a(aB);
            case a -> frb.a(az);
            case c -> frb.a(aA);
         };
      },
      ($$0x, $$1x) -> {
         xd $$2x = wp.c($$1x.a());
         return $$1x == fly.c ? $$2x.a(n.u) : $$2x;
      },
      new fmj.a<>(
         Arrays.asList(fly.values()),
         Stream.of(fly.values()).filter($$0x -> $$0x != fly.c).collect(Collectors.toList()),
         () -> fmg.Q().r() && fmg.Q().aj().h(),
         ($$0x, $$1x) -> {
            fmg $$2x = fmg.Q();
            gmp $$3 = $$2x.aj();
            if ($$1x == fly.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.e();
            }
         },
         Codec.INT.xmap(fly::a, fly::b)
      ),
      fly.b,
      $$0x -> {
      }
   );
   private final fmj<Boolean> aD = fmj.a("options.ao", true, $$0x -> fmg.Q().f.e());
   private static final wp aE = wp.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wp aF = wp.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wp aG = wp.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fmj<fmm> aH = new fmj<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> frb.a(aE);
         case b -> frb.a(aF);
         case c -> frb.a(aG);
      };
   }, fmj.b(), new fmj.e<>(Arrays.asList(fmm.values()), Codec.INT.xmap(fmm::a, fmm::b)), fmm.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fmj<cpo> aI = new fmj<>(
      "options.chat.visibility", fmj.a(), fmj.b(), new fmj.e<>(Arrays.asList(cpo.values()), Codec.INT.xmap(cpo::a, cpo::b)), cpo.a, $$0x -> {
      }
   );
   private final fmj<Double> aJ = new fmj<>("options.chat.opacity", fmj.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fmj.m.a, 1.0, $$0x -> fmg.Q().m.d().b());
   private final fmj<Double> aK = new fmj<>("options.chat.line_spacing", fmj.a(), fmk::a, fmj.m.a, 0.0, $$0x -> {
   });
   private static final wp aL = wp.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aM = 5;
   private final fmj<Integer> aN = new fmj<>("options.accessibility.menu_background_blurriness", fmj.a(aL), fmk::b, new fmj.f(0, 10), 5, $$0x -> {
   });
   private final fmj<Double> aO = new fmj<>("options.accessibility.text_background_opacity", fmj.a(), fmk::a, fmj.m.a, 0.5, $$0x -> fmg.Q().m.d().b());
   private final fmj<Double> aP = new fmj<>("options.accessibility.panorama_speed", fmj.a(), fmk::a, fmj.m.a, 1.0, $$0x -> {
   });
   private static final wp aQ = wp.c("options.accessibility.high_contrast.tooltip");
   private final fmj<Boolean> aR = fmj.a("options.accessibility.high_contrast", fmj.a(aQ), false, $$0x -> {
      aua $$1x = fmg.Q().ad();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private static final wp aS = wp.c("options.accessibility.high_contrast_block_outline.tooltip");
   private final fmj<Boolean> aT = fmj.a("options.accessibility.high_contrast_block_outline", fmj.a(aS), false);
   private final fmj<Boolean> aU = fmj.a(
      "options.accessibility.narrator_hotkey",
      fmj.a(fmg.a ? wp.c("options.accessibility.narrator_hotkey.mac.tooltip") : wp.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cps> aV = EnumSet.allOf(cps.class);
   private final fmj<bvr> aW = new fmj<>("options.mainHand", fmj.a(), fmj.b(), new fmj.e<>(Arrays.asList(bvr.values()), bvr.c), bvr.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fmj<Double> aX = new fmj<>(
      "options.chat.scale",
      fmj.a(),
      ($$0x, $$1x) -> (wp)($$1x == 0.0 ? wo.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fmj.m.a,
      1.0,
      $$0x -> fmg.Q().m.d().b()
   );
   private final fmj<Double> aY = new fmj<>("options.chat.width", fmj.a(), ($$0x, $$1x) -> c($$0x, fpr.a($$1x)), fmj.m.a, 1.0, $$0x -> fmg.Q().m.d().b());
   private final fmj<Double> aZ = new fmj<>(
      "options.chat.height.unfocused", fmj.a(), ($$0x, $$1x) -> c($$0x, fpr.b($$1x)), fmj.m.a, fpr.i(), $$0x -> fmg.Q().m.d().b()
   );
   private final fmj<Double> ba = new fmj<>(
      "options.chat.height.focused", fmj.a(), ($$0x, $$1x) -> c($$0x, fpr.b($$1x)), fmj.m.a, 1.0, $$0x -> fmg.Q().m.d().b()
   );
   private final fmj<Double> bb = new fmj<>(
      "options.chat.delay_instant",
      fmj.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wp.c("options.chat.delay_none") : wp.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fmj.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fmg.Q().aZ().a($$0x)
   );
   private static final wp bc = wp.c("options.notifications.display_time.tooltip");
   private final fmj<Double> bd = new fmj<>(
      "options.notifications.display_time",
      fmj.a(bc),
      ($$0x, $$1x) -> a($$0x, wp.a("options.multiplier", $$1x)),
      new fmj.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fmj<Integer> be = new fmj<>(
      "options.mipmapLevels", fmj.a(), ($$0x, $$1x) -> (wp)($$1x == 0 ? wo.a($$0x, false) : a($$0x, $$1x.intValue())), new fmj.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fmj<fln> bf = new fmj<>(
      "options.attackIndicator", fmj.a(), fmj.b(), new fmj.e<>(Arrays.asList(fln.values()), Codec.INT.xmap(fln::a, fln::b)), fln.b, $$0x -> {
      }
   );
   public hly r = hly.a;
   public boolean s = false;
   private final fmj<Integer> bg = new fmj<>("options.biomeBlendRadius", fmj.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wp.c("options.biomeBlendRadius." + $$2x));
   }, new fmj.f(0, 7, false), 2, $$0x -> fmg.Q().f.e());
   private final fmj<Double> bh = new fmj<>(
      "options.mouseWheelSensitivity",
      fmj.a(),
      ($$0x, $$1x) -> a($$0x, wp.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fmj.f(-200, 100).a(fmk::c, fmk::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fmj<Boolean> bi = fmj.a("options.rawMouseInput", true, $$0x -> {
      ffu $$1x = fmg.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fmj<Boolean> bj = fmj.a("options.autoJump", false);
   private static final wp bk = wp.c("options.rotateWithMinecart.tooltip");
   private final fmj<Boolean> bl = fmj.a("options.rotateWithMinecart", fmj.a(bk), false);
   private final fmj<Boolean> bm = fmj.a("options.operatorItemsTab", false);
   private final fmj<Boolean> bn = fmj.a("options.autoSuggestCommands", true);
   private final fmj<Boolean> bo = fmj.a("options.chat.color", true);
   private final fmj<Boolean> bp = fmj.a("options.chat.links", true);
   private final fmj<Boolean> bq = fmj.a("options.chat.links.prompt", true);
   private final fmj<Boolean> br = fmj.a("options.vsync", true, $$0x -> {
      if (fmg.Q().aO() != null) {
         fmg.Q().aO().a($$0x);
      }
   });
   private final fmj<Boolean> bs = fmj.a("options.entityShadows", true);
   private final fmj<Boolean> bt = fmj.a("options.forceUnicodeFont", false, $$0x -> aI());
   private final fmj<Boolean> bu = fmj.a("options.japaneseGlyphVariants", fmj.a(wp.c("options.japaneseGlyphVariants.tooltip")), aJ(), $$0x -> aI());
   private final fmj<Boolean> bv = fmj.a("options.invertMouse", false);
   private final fmj<Boolean> bw = fmj.a("options.discrete_mouse_scroll", false);
   private static final wp bx = wp.c("options.realmsNotifications.tooltip");
   private final fmj<Boolean> by = fmj.a("options.realmsNotifications", fmj.a(bx), true);
   private static final wp bz = wp.c("options.allowServerListing.tooltip");
   private final fmj<Boolean> bA = fmj.a("options.allowServerListing", fmj.a(bz), true, $$0x -> {
   });
   private final fmj<Boolean> bB = fmj.a("options.reducedDebugInfo", false);
   private final Map<awb, fmj<Double>> bC = af.a(awb.class, $$0x -> this.a("soundCategory." + $$0x.a(), $$0x));
   private final fmj<Boolean> bD = fmj.a("options.showSubtitles", false);
   private static final wp bE = wp.c("options.directionalAudio.on.tooltip");
   private static final wp bF = wp.c("options.directionalAudio.off.tooltip");
   private final fmj<Boolean> bG = fmj.a("options.directionalAudio", $$0x -> $$0x ? frb.a(bE) : frb.a(bF), false, $$0x -> {
      hku $$1x = fmg.Q().ak();
      $$1x.k();
      $$1x.a(hjj.a(awa.Bp, 1.0F));
   });
   private final fmj<Boolean> bH = new fmj<>(
      "options.accessibility.text_background",
      fmj.a(),
      ($$0x, $$1x) -> $$1x ? wp.c("options.accessibility.text_background.chat") : wp.c("options.accessibility.text_background.everywhere"),
      fmj.a,
      true,
      $$0x -> {
      }
   );
   private final fmj<Boolean> bI = fmj.a("options.touchscreen", false);
   private final fmj<Boolean> bJ = fmj.a("options.fullscreen", false, $$0x -> {
      fmg $$1x = fmg.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ad().a($$1x.aO().i());
      }
   });
   private final fmj<Boolean> bK = fmj.a("options.viewBobbing", true);
   private static final wp bL = wp.c("options.key.toggle");
   private static final wp bM = wp.c("options.key.hold");
   private final fmj<Boolean> bN = new fmj<>("key.sneak", fmj.a(), ($$0x, $$1x) -> $$1x ? bL : bM, fmj.a, false, $$0x -> {
   });
   private final fmj<Boolean> bO = new fmj<>("key.sprint", fmj.a(), ($$0x, $$1x) -> $$1x ? bL : bM, fmj.a, false, $$0x -> {
   });
   public boolean u;
   private static final wp bP = wp.c("options.hideMatchedNames.tooltip");
   private final fmj<Boolean> bQ = fmj.a("options.hideMatchedNames", fmj.a(bP), true);
   private final fmj<Boolean> bR = fmj.a("options.autosaveIndicator", true);
   private static final wp bS = wp.c("options.onlyShowSecureChat.tooltip");
   private final fmj<Boolean> bT = fmj.a("options.onlyShowSecureChat", fmj.a(bS), false);
   public final fme v = new fme("key.forward", 87, "key.categories.movement");
   public final fme w = new fme("key.left", 65, "key.categories.movement");
   public final fme x = new fme("key.back", 83, "key.categories.movement");
   public final fme y = new fme("key.right", 68, "key.categories.movement");
   public final fme z = new fme("key.jump", 32, "key.categories.movement");
   public final fme A = new fmr("key.sneak", 340, "key.categories.movement", this.bN::c);
   public final fme B = new fmr("key.sprint", 341, "key.categories.movement", this.bO::c);
   public final fme C = new fme("key.inventory", 69, "key.categories.inventory");
   public final fme D = new fme("key.swapOffhand", 70, "key.categories.inventory");
   public final fme E = new fme("key.drop", 81, "key.categories.inventory");
   public final fme F = new fme("key.use", ffm.b.c, 1, "key.categories.gameplay");
   public final fme G = new fme("key.attack", ffm.b.c, 0, "key.categories.gameplay");
   public final fme H = new fme("key.pickItem", ffm.b.c, 2, "key.categories.gameplay");
   public final fme I = new fme("key.chat", 84, "key.categories.multiplayer");
   public final fme J = new fme("key.playerlist", 258, "key.categories.multiplayer");
   public final fme K = new fme("key.command", 47, "key.categories.multiplayer");
   public final fme L = new fme("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fme M = new fme("key.screenshot", 291, "key.categories.misc");
   public final fme N = new fme("key.togglePerspective", 294, "key.categories.misc");
   public final fme O = new fme("key.smoothCamera", ffm.bv.b(), "key.categories.misc");
   public final fme P = new fme("key.fullscreen", 300, "key.categories.misc");
   public final fme Q = new fme("key.spectatorOutlines", ffm.bv.b(), "key.categories.misc");
   public final fme R = new fme("key.advancements", 76, "key.categories.misc");
   public final fme[] S = new fme[]{
      new fme("key.hotbar.1", 49, "key.categories.inventory"),
      new fme("key.hotbar.2", 50, "key.categories.inventory"),
      new fme("key.hotbar.3", 51, "key.categories.inventory"),
      new fme("key.hotbar.4", 52, "key.categories.inventory"),
      new fme("key.hotbar.5", 53, "key.categories.inventory"),
      new fme("key.hotbar.6", 54, "key.categories.inventory"),
      new fme("key.hotbar.7", 55, "key.categories.inventory"),
      new fme("key.hotbar.8", 56, "key.categories.inventory"),
      new fme("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fme T = new fme("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fme U = new fme("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fme[] V = (fme[])ArrayUtils.addAll(
      new fme[]{
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
   protected fmg W;
   private final File bU;
   public boolean X;
   private flp bV = flp.a;
   public String Y = "";
   public boolean Z;
   private final fmj<Integer> bW = new fmj<>("options.fov", fmj.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wp.c("options.fov.min"));
         case 110 -> a($$0x, wp.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fmj.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fmg.Q().f.p());
   private static final wp bX = wp.a("options.telemetry.button.tooltip", wp.c("options.telemetry.state.minimal"), wp.c("options.telemetry.state.all"));
   private final fmj<Boolean> bY = fmj.a("options.telemetry.button", fmj.a(bX), ($$0x, $$1x) -> {
      fmg $$2x = fmg.Q();
      if (!$$2x.E()) {
         return wp.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wp.c("options.telemetry.state.all") : wp.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wp bZ = wp.c("options.screenEffectScale.tooltip");
   private final fmj<Double> ca = new fmj<>("options.screenEffectScale", fmj.a(bZ), fmk::b, fmj.m.a, 1.0, $$0x -> {
   });
   private static final wp cb = wp.c("options.fovEffectScale.tooltip");
   private final fmj<Double> cc = new fmj<>(
      "options.fovEffectScale", fmj.a(cb), fmk::b, fmj.m.a.a(ayz::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final wp cd = wp.c("options.darknessEffectScale.tooltip");
   private final fmj<Double> ce = new fmj<>("options.darknessEffectScale", fmj.a(cd), fmk::b, fmj.m.a.a(ayz::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final wp cf = wp.c("options.glintSpeed.tooltip");
   private final fmj<Double> cg = new fmj<>("options.glintSpeed", fmj.a(cf), fmk::b, fmj.m.a, 0.5, $$0x -> {
   });
   private static final wp ch = wp.c("options.glintStrength.tooltip");
   private final fmj<Double> ci = new fmj<>("options.glintStrength", fmj.a(ch), fmk::b, fmj.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final wp cj = wp.c("options.damageTiltStrength.tooltip");
   private final fmj<Double> ck = new fmj<>("options.damageTiltStrength", fmj.a(cj), fmk::b, fmj.m.a, 1.0, $$0x -> {
   });
   private final fmj<Double> cl = new fmj<>("options.gamma", fmj.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wp.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wp.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wp.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fmj.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cm = 2147483646;
   private final fmj<Integer> cn = new fmj<>(
      "options.guiScale", fmj.a(), ($$0x, $$1x) -> $$1x == 0 ? wp.c("options.guiScale.auto") : wp.b(Integer.toString($$1x)), new fmj.c(0, () -> {
         fmg $$0x = fmg.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fmj<aqv> co = new fmj<>(
      "options.particles", fmj.a(), fmj.b(), new fmj.e<>(Arrays.asList(aqv.values()), Codec.INT.xmap(aqv::a, aqv::b)), aqv.a, $$0x -> {
      }
   );
   private final fmj<fmi> cp = new fmj<>(
      "options.narrator",
      fmj.a(),
      ($$0x, $$1x) -> (wp)(this.W.aY().a() ? $$1x.b() : wp.c("options.narrator.notavailable")),
      new fmj.e<>(Arrays.asList(fmi.values()), Codec.INT.xmap(fmi::a, fmi::a)),
      fmi.a,
      $$0x -> this.W.aY().a($$0x)
   );
   public String ab = "en_us";
   private final fmj<String> cq = new fmj<>(
      "options.audioDevice",
      fmj.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wp.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wp.b($$1x.substring(hkr.c)) : wp.b($$1x);
         }
      },
      new fmj.h<>(
         () -> Stream.concat(Stream.of(""), fmg.Q().ak().a().stream()).toList(),
         $$0x -> fmg.Q().r() && $$0x != "" && !fmg.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hku $$1x = fmg.Q().ak();
         $$1x.k();
         $$1x.a(hjj.a(awa.Bp, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;
   public boolean ae = true;

   public fmj<Boolean> a() {
      return this.ak;
   }

   public fmj<Boolean> b() {
      return this.am;
   }

   public fmj<Boolean> c() {
      return this.ao;
   }

   public fmj<Double> d() {
      return this.ap;
   }

   public fmj<Integer> e() {
      return this.aq;
   }

   public fmj<Integer> f() {
      return this.ar;
   }

   public fmj<Double> g() {
      return this.at;
   }

   public fmj<Integer> h() {
      return this.au;
   }

   public fmj<fmc> i() {
      return this.ax;
   }

   public fmj<fls> j() {
      return this.ay;
   }

   public fmj<fly> k() {
      return this.aC;
   }

   public fmj<Boolean> l() {
      return this.aD;
   }

   public fmj<fmm> m() {
      return this.aH;
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

   public fmj<cpo> n() {
      return this.aI;
   }

   public fmj<Double> o() {
      return this.aJ;
   }

   public fmj<Double> p() {
      return this.aK;
   }

   public fmj<Integer> q() {
      return this.aN;
   }

   public int r() {
      return this.q().c();
   }

   public fmj<Double> s() {
      return this.aO;
   }

   public fmj<Double> t() {
      return this.aP;
   }

   public fmj<Boolean> u() {
      return this.aR;
   }

   public fmj<Boolean> v() {
      return this.aT;
   }

   public fmj<Boolean> w() {
      return this.aU;
   }

   public fmj<bvr> x() {
      return this.aW;
   }

   public fmj<Double> y() {
      return this.aX;
   }

   public fmj<Double> z() {
      return this.aY;
   }

   public fmj<Double> A() {
      return this.aZ;
   }

   public fmj<Double> B() {
      return this.ba;
   }

   public fmj<Double> C() {
      return this.bb;
   }

   public fmj<Double> D() {
      return this.bd;
   }

   public fmj<Integer> E() {
      return this.be;
   }

   public fmj<fln> F() {
      return this.bf;
   }

   public fmj<Integer> G() {
      return this.bg;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ayz.a(Math.log10($$0) * 100.0);
   }

   public fmj<Double> H() {
      return this.bh;
   }

   public fmj<Boolean> I() {
      return this.bi;
   }

   public fmj<Boolean> J() {
      return this.bj;
   }

   public fmj<Boolean> K() {
      return this.bl;
   }

   public fmj<Boolean> L() {
      return this.bm;
   }

   public fmj<Boolean> M() {
      return this.bn;
   }

   public fmj<Boolean> N() {
      return this.bo;
   }

   public fmj<Boolean> O() {
      return this.bp;
   }

   public fmj<Boolean> P() {
      return this.bq;
   }

   public fmj<Boolean> Q() {
      return this.br;
   }

   public fmj<Boolean> R() {
      return this.bs;
   }

   private static void aI() {
      fmg $$0 = fmg.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fmj<Boolean> S() {
      return this.bt;
   }

   private static boolean aJ() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fmj<Boolean> T() {
      return this.bu;
   }

   public fmj<Boolean> U() {
      return this.bv;
   }

   public fmj<Boolean> V() {
      return this.bw;
   }

   public fmj<Boolean> W() {
      return this.by;
   }

   public fmj<Boolean> X() {
      return this.bA;
   }

   public fmj<Boolean> Y() {
      return this.bB;
   }

   public final float a(awb $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fmj<Double> b(awb $$0) {
      return Objects.requireNonNull(this.bC.get($$0));
   }

   private fmj<Double> a(String $$0, awb $$1) {
      return new fmj<>($$0, fmj.a(), fmk::b, fmj.m.a, 1.0, $$1x -> fmg.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fmj<Boolean> Z() {
      return this.bD;
   }

   public fmj<Boolean> aa() {
      return this.bG;
   }

   public fmj<Boolean> ab() {
      return this.bH;
   }

   public fmj<Boolean> ac() {
      return this.bI;
   }

   public fmj<Boolean> ad() {
      return this.bJ;
   }

   public fmj<Boolean> ae() {
      return this.bK;
   }

   public fmj<Boolean> af() {
      return this.bN;
   }

   public fmj<Boolean> ag() {
      return this.bO;
   }

   public fmj<Boolean> ah() {
      return this.bQ;
   }

   public fmj<Boolean> ai() {
      return this.bR;
   }

   public fmj<Boolean> aj() {
      return this.bT;
   }

   public fmj<Integer> ak() {
      return this.bW;
   }

   public fmj<Boolean> al() {
      return this.bY;
   }

   public fmj<Double> am() {
      return this.ca;
   }

   public fmj<Double> an() {
      return this.cc;
   }

   public fmj<Double> ao() {
      return this.ce;
   }

   public fmj<Double> ap() {
      return this.cg;
   }

   public fmj<Double> aq() {
      return this.ci;
   }

   public fmj<Double> ar() {
      return this.ck;
   }

   public fmj<Double> as() {
      return this.cl;
   }

   public fmj<Integer> at() {
      return this.cn;
   }

   public fmj<aqv> au() {
      return this.co;
   }

   public fmj<fmi> av() {
      return this.cp;
   }

   public fmj<String> aw() {
      return this.cq;
   }

   public void ax() {
      this.ac = false;
      this.az();
   }

   public fmk(fmg $$0, File $$1) {
      this.W = $$0;
      this.bU = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new fmj<>(
         "options.renderDistance",
         fmj.a(),
         ($$0x, $$1x) -> a($$0x, wp.a("options.chunks", $$1x)),
         new fmj.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fmg.Q().f.p()
      );
      this.ar = new fmj<>(
         "options.simulationDistance", fmj.a(), ($$0x, $$1x) -> a($$0x, wp.a("options.chunks", $$1x)), new fmj.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = af.n() == af.a.c;
      this.ay();
   }

   public float a(float $$0) {
      return this.bH.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return axk.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bH.c() ? $$0 : axk.a(this.aO.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(fmk.b $$0) {
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

   private void a(fmk.a $$0) {
      this.a((fmk.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, fmk::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fmk::c, ag::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, hly::a, hly::a);
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

      for (fme $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(ffm.a($$3));
         }
      }

      for (awb $$4 : awb.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bC.get($$4));
      }

      for (cps $$5 : cps.values()) {
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

         tq $$0 = new tq();

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

         final tq $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aC.a(fly.b);
            } else {
               this.aC.a(fly.a);
            }
         }

         this.a(new fmk.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).p_() : null;
            }

            @Override
            public <T> void a(String $$0, fmj<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fmk.af.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fmk.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fmk.a($$2) : $$1;
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
               } else if (fmk.a($$2)) {
                  return 1.0F;
               } else if (fmk.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fmk.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fme.d();
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

   private tq a(tq $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return bam.e.a(this.W.au(), $$0, $$1);
   }

   public void az() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bU), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fmk.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fmj<T> $$1) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1x -> fmk.af.error("Error saving option " + $$1 + ": " + $$1x)).ifSuccess($$2x -> {
                  this.a($$0);
                  $$0.println(fmk.ag.toJson($$2x));
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
      ffu $$0 = this.W.aO();
      if ($$0 == null) {
         return this.k;
      } else {
         return $$0.e().isPresent() ? $$0.e().get().g() : null;
      }
   }

   public aqn aA() {
      int $$0 = 0;

      for (cps $$1 : this.aV) {
         $$0 |= $$1.a();
      }

      return new aqn(this.ab, this.aq.c(), this.aI.c(), this.bo.c(), $$0, this.aW.c(), this.W.aT(), this.bA.c(), this.co.c());
   }

   public void aB() {
      if (this.W.t != null) {
         this.W.t.j.a(this.aA());
      }
   }

   public void a(cps $$0, boolean $$1) {
      if ($$1) {
         this.aV.add($$0);
      } else {
         this.aV.remove($$0);
      }
   }

   public boolean a(cps $$0) {
      return this.aV.contains($$0);
   }

   public fls aC() {
      return this.aH() >= 4 ? this.ay.c() : fls.a;
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

   public flp aE() {
      return this.bV;
   }

   public void a(flp $$0) {
      this.bV = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = ayp.a(ag, $$0, ah);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aF() {
      return this.bU;
   }

   public String aG() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fmk.b() {
         @Override
         public <T> void a(String $$0x, fmj<T> $$1) {
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

   interface a extends fmk.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fmj<T> var2);
   }
}
