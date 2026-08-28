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

public class fmk {
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
   private static final xv ai = xv.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fmj<Boolean> aj = fmj.a("options.darkMojangStudiosBackgroundColor", fmj.a(ai), false);
   private static final xv ak = xv.c("options.hideLightningFlashes.tooltip");
   private final fmj<Boolean> al = fmj.a("options.hideLightningFlashes", fmj.a(ak), false);
   private static final xv am = xv.c("options.hideSplashTexts.tooltip");
   private final fmj<Boolean> an = fmj.a("options.hideSplashTexts", fmj.a(am), false);
   private final fmj<Double> ao = new fmj<>("options.sensitivity", fmj.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xv.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xv.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fmj.m.a, 0.5, $$0x -> {
   });
   private final fmj<Integer> ap;
   private final fmj<Integer> aq;
   private int ar = 0;
   private final fmj<Double> as = new fmj<>(
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
   private final fmj<Integer> at = new fmj<>(
      "options.framerateLimit",
      fmj.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xv.c("options.framerateLimit.max")) : a($$0x, xv.a("options.framerate", $$1x)),
      new fmj.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fmg.Q().aP().a($$0x)
   );
   private static final xv au = xv.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final xv av = xv.c("options.inactivityFpsLimit.afk.tooltip");
   private final fmj<fmc> aw = new fmj<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> fpr.a(au);
         case b -> fpr.a(av);
      };
   }, fmj.b(), new fmj.e<>(Arrays.asList(fmc.values()), fmc.c), fmc.b, $$0x -> {
   });
   private final fmj<fls> ax = new fmj<>(
      "options.renderClouds",
      fmj.a(),
      fmj.b(),
      new fmj.e<>(Arrays.asList(fls.values()), Codec.withAlternative(fls.d, Codec.BOOL, $$0x -> $$0x ? fls.c : fls.a)),
      fls.c,
      $$0x -> {
      }
   );
   private static final xv ay = xv.c("options.graphics.fast.tooltip");
   private static final xv az = xv.a("options.graphics.fabulous.tooltip", xv.c("options.graphics.fabulous").a(n.u));
   private static final xv aA = xv.c("options.graphics.fancy.tooltip");
   private final fmj<fly> aB = new fmj<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fpr.a(aA);
            case a -> fpr.a(ay);
            case c -> fpr.a(az);
         };
      },
      ($$0x, $$1x) -> {
         yj $$2x = xv.c($$1x.a());
         return $$1x == fly.c ? $$2x.a(n.u) : $$2x;
      },
      new fmj.a<>(
         Arrays.asList(fly.values()),
         Stream.of(fly.values()).filter($$0x -> $$0x != fly.c).collect(Collectors.toList()),
         () -> fmg.Q().r() && fmg.Q().aj().h(),
         ($$0x, $$1x) -> {
            fmg $$2x = fmg.Q();
            glc $$3 = $$2x.aj();
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
   private final fmj<Boolean> aC = fmj.a("options.ao", true, $$0x -> fmg.Q().f.e());
   private static final xv aD = xv.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xv aE = xv.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xv aF = xv.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fmj<fmm> aG = new fmj<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fpr.a(aD);
         case b -> fpr.a(aE);
         case c -> fpr.a(aF);
      };
   }, fmj.b(), new fmj.e<>(Arrays.asList(fmm.values()), Codec.INT.xmap(fmm::a, fmm::b)), fmm.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fmj<cpu> aH = new fmj<>(
      "options.chat.visibility", fmj.a(), fmj.b(), new fmj.e<>(Arrays.asList(cpu.values()), Codec.INT.xmap(cpu::a, cpu::b)), cpu.a, $$0x -> {
      }
   );
   private final fmj<Double> aI = new fmj<>("options.chat.opacity", fmj.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fmj.m.a, 1.0, $$0x -> fmg.Q().m.d().b());
   private final fmj<Double> aJ = new fmj<>("options.chat.line_spacing", fmj.a(), fmk::a, fmj.m.a, 0.0, $$0x -> {
   });
   private static final xv aK = xv.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aL = 5;
   private final fmj<Integer> aM = new fmj<>("options.accessibility.menu_background_blurriness", fmj.a(aK), fmk::b, new fmj.f(0, 10), 5, $$0x -> {
   });
   private final fmj<Double> aN = new fmj<>("options.accessibility.text_background_opacity", fmj.a(), fmk::a, fmj.m.a, 0.5, $$0x -> fmg.Q().m.d().b());
   private final fmj<Double> aO = new fmj<>("options.accessibility.panorama_speed", fmj.a(), fmk::a, fmj.m.a, 1.0, $$0x -> {
   });
   private static final xv aP = xv.c("options.accessibility.high_contrast.tooltip");
   private final fmj<Boolean> aQ = fmj.a("options.accessibility.high_contrast", fmj.a(aP), false, $$0x -> {
      avg $$1x = fmg.Q().ad();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private static final xv aR = xv.c("options.accessibility.high_contrast_block_outline.tooltip");
   private final fmj<Boolean> aS = fmj.a("options.accessibility.high_contrast_block_outline", fmj.a(aR), false);
   private final fmj<Boolean> aT = fmj.a(
      "options.accessibility.narrator_hotkey",
      fmj.a(fmg.a ? xv.c("options.accessibility.narrator_hotkey.mac.tooltip") : xv.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cpy> aU = EnumSet.allOf(cpy.class);
   private final fmj<bwa> aV = new fmj<>("options.mainHand", fmj.a(), fmj.b(), new fmj.e<>(Arrays.asList(bwa.values()), bwa.c), bwa.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fmj<Double> aW = new fmj<>(
      "options.chat.scale",
      fmj.a(),
      ($$0x, $$1x) -> (xv)($$1x == 0.0 ? xu.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fmj.m.a,
      1.0,
      $$0x -> fmg.Q().m.d().b()
   );
   private final fmj<Double> aX = new fmj<>("options.chat.width", fmj.a(), ($$0x, $$1x) -> c($$0x, fog.a($$1x)), fmj.m.a, 1.0, $$0x -> fmg.Q().m.d().b());
   private final fmj<Double> aY = new fmj<>(
      "options.chat.height.unfocused", fmj.a(), ($$0x, $$1x) -> c($$0x, fog.b($$1x)), fmj.m.a, fog.i(), $$0x -> fmg.Q().m.d().b()
   );
   private final fmj<Double> aZ = new fmj<>(
      "options.chat.height.focused", fmj.a(), ($$0x, $$1x) -> c($$0x, fog.b($$1x)), fmj.m.a, 1.0, $$0x -> fmg.Q().m.d().b()
   );
   private final fmj<Double> ba = new fmj<>(
      "options.chat.delay_instant",
      fmj.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xv.c("options.chat.delay_none") : xv.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fmj.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fmg.Q().ba().a($$0x)
   );
   private static final xv bb = xv.c("options.notifications.display_time.tooltip");
   private final fmj<Double> bc = new fmj<>(
      "options.notifications.display_time",
      fmj.a(bb),
      ($$0x, $$1x) -> a($$0x, xv.a("options.multiplier", $$1x)),
      new fmj.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fmj<Integer> bd = new fmj<>(
      "options.mipmapLevels", fmj.a(), ($$0x, $$1x) -> (xv)($$1x == 0 ? xu.a($$0x, false) : a($$0x, $$1x.intValue())), new fmj.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fmj<flo> be = new fmj<>(
      "options.attackIndicator", fmj.a(), fmj.b(), new fmj.e<>(Arrays.asList(flo.values()), Codec.INT.xmap(flo::a, flo::b)), flo.b, $$0x -> {
      }
   );
   public hhr r = hhr.a;
   public boolean s = false;
   private final fmj<Integer> bf = new fmj<>("options.biomeBlendRadius", fmj.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xv.c("options.biomeBlendRadius." + $$2x));
   }, new fmj.f(0, 7, false), 2, $$0x -> fmg.Q().f.e());
   private final fmj<Double> bg = new fmj<>(
      "options.mouseWheelSensitivity",
      fmj.a(),
      ($$0x, $$1x) -> a($$0x, xv.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fmj.f(-200, 100).a(fmk::c, fmk::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fmj<Boolean> bh = fmj.a("options.rawMouseInput", true, $$0x -> {
      ffv $$1x = fmg.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fmj<Boolean> bi = fmj.a("options.autoJump", false);
   private static final xv bj = xv.c("options.rotateWithMinecart.tooltip");
   private final fmj<Boolean> bk = fmj.a("options.rotateWithMinecart", fmj.a(bj), false);
   private final fmj<Boolean> bl = fmj.a("options.operatorItemsTab", false);
   private final fmj<Boolean> bm = fmj.a("options.autoSuggestCommands", true);
   private final fmj<Boolean> bn = fmj.a("options.chat.color", true);
   private final fmj<Boolean> bo = fmj.a("options.chat.links", true);
   private final fmj<Boolean> bp = fmj.a("options.chat.links.prompt", true);
   private final fmj<Boolean> bq = fmj.a("options.vsync", true, $$0x -> {
      if (fmg.Q().aO() != null) {
         fmg.Q().aO().a($$0x);
      }
   });
   private final fmj<Boolean> br = fmj.a("options.entityShadows", true);
   private final fmj<Boolean> bs = fmj.a("options.forceUnicodeFont", false, $$0x -> aI());
   private final fmj<Boolean> bt = fmj.a("options.japaneseGlyphVariants", fmj.a(xv.c("options.japaneseGlyphVariants.tooltip")), aJ(), $$0x -> aI());
   private final fmj<Boolean> bu = fmj.a("options.invertMouse", false);
   private final fmj<Boolean> bv = fmj.a("options.discrete_mouse_scroll", false);
   private static final xv bw = xv.c("options.realmsNotifications.tooltip");
   private final fmj<Boolean> bx = fmj.a("options.realmsNotifications", fmj.a(bw), true);
   private static final xv by = xv.c("options.allowServerListing.tooltip");
   private final fmj<Boolean> bz = fmj.a("options.allowServerListing", fmj.a(by), true, $$0x -> {
   });
   private final fmj<Boolean> bA = fmj.a("options.reducedDebugInfo", false);
   private final Map<axg, fmj<Double>> bB = ae.a(new EnumMap<>(axg.class), $$0x -> {
      for (axg $$1x : axg.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fmj<Boolean> bC = fmj.a("options.showSubtitles", false);
   private static final xv bD = xv.c("options.directionalAudio.on.tooltip");
   private static final xv bE = xv.c("options.directionalAudio.off.tooltip");
   private final fmj<Boolean> bF = fmj.a("options.directionalAudio", $$0x -> $$0x ? fpr.a(bD) : fpr.a(bE), false, $$0x -> {
      hgn $$1x = fmg.Q().ak();
      $$1x.k();
      $$1x.a(hfd.a(axf.AQ, 1.0F));
   });
   private final fmj<Boolean> bG = new fmj<>(
      "options.accessibility.text_background",
      fmj.a(),
      ($$0x, $$1x) -> $$1x ? xv.c("options.accessibility.text_background.chat") : xv.c("options.accessibility.text_background.everywhere"),
      fmj.a,
      true,
      $$0x -> {
      }
   );
   private final fmj<Boolean> bH = fmj.a("options.touchscreen", false);
   private final fmj<Boolean> bI = fmj.a("options.fullscreen", false, $$0x -> {
      fmg $$1x = fmg.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ad().a($$1x.aO().i());
      }
   });
   private final fmj<Boolean> bJ = fmj.a("options.viewBobbing", true);
   private static final xv bK = xv.c("options.key.toggle");
   private static final xv bL = xv.c("options.key.hold");
   private final fmj<Boolean> bM = new fmj<>("key.sneak", fmj.a(), ($$0x, $$1x) -> $$1x ? bK : bL, fmj.a, false, $$0x -> {
   });
   private final fmj<Boolean> bN = new fmj<>("key.sprint", fmj.a(), ($$0x, $$1x) -> $$1x ? bK : bL, fmj.a, false, $$0x -> {
   });
   public boolean u;
   private static final xv bO = xv.c("options.hideMatchedNames.tooltip");
   private final fmj<Boolean> bP = fmj.a("options.hideMatchedNames", fmj.a(bO), true);
   private final fmj<Boolean> bQ = fmj.a("options.autosaveIndicator", true);
   private static final xv bR = xv.c("options.onlyShowSecureChat.tooltip");
   private final fmj<Boolean> bS = fmj.a("options.onlyShowSecureChat", fmj.a(bR), false);
   public final fme v = new fme("key.forward", 87, "key.categories.movement");
   public final fme w = new fme("key.left", 65, "key.categories.movement");
   public final fme x = new fme("key.back", 83, "key.categories.movement");
   public final fme y = new fme("key.right", 68, "key.categories.movement");
   public final fme z = new fme("key.jump", 32, "key.categories.movement");
   public final fme A = new fmr("key.sneak", 340, "key.categories.movement", this.bM::c);
   public final fme B = new fmr("key.sprint", 341, "key.categories.movement", this.bN::c);
   public final fme C = new fme("key.inventory", 69, "key.categories.inventory");
   public final fme D = new fme("key.swapOffhand", 70, "key.categories.inventory");
   public final fme E = new fme("key.drop", 81, "key.categories.inventory");
   public final fme F = new fme("key.use", ffn.b.c, 1, "key.categories.gameplay");
   public final fme G = new fme("key.attack", ffn.b.c, 0, "key.categories.gameplay");
   public final fme H = new fme("key.pickItem", ffn.b.c, 2, "key.categories.gameplay");
   public final fme I = new fme("key.chat", 84, "key.categories.multiplayer");
   public final fme J = new fme("key.playerlist", 258, "key.categories.multiplayer");
   public final fme K = new fme("key.command", 47, "key.categories.multiplayer");
   public final fme L = new fme("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fme M = new fme("key.screenshot", 291, "key.categories.misc");
   public final fme N = new fme("key.togglePerspective", 294, "key.categories.misc");
   public final fme O = new fme("key.smoothCamera", ffn.bv.b(), "key.categories.misc");
   public final fme P = new fme("key.fullscreen", 300, "key.categories.misc");
   public final fme Q = new fme("key.spectatorOutlines", ffn.bv.b(), "key.categories.misc");
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
   private final File bT;
   public boolean X;
   private flq bU = flq.a;
   public String Y = "";
   public boolean Z;
   private final fmj<Integer> bV = new fmj<>("options.fov", fmj.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xv.c("options.fov.min"));
         case 110 -> a($$0x, xv.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fmj.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fmg.Q().f.p());
   private static final xv bW = xv.a("options.telemetry.button.tooltip", xv.c("options.telemetry.state.minimal"), xv.c("options.telemetry.state.all"));
   private final fmj<Boolean> bX = fmj.a("options.telemetry.button", fmj.a(bW), ($$0x, $$1x) -> {
      fmg $$2x = fmg.Q();
      if (!$$2x.E()) {
         return xv.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xv.c("options.telemetry.state.all") : xv.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xv bY = xv.c("options.screenEffectScale.tooltip");
   private final fmj<Double> bZ = new fmj<>("options.screenEffectScale", fmj.a(bY), fmk::b, fmj.m.a, 1.0, $$0x -> {
   });
   private static final xv ca = xv.c("options.fovEffectScale.tooltip");
   private final fmj<Double> cb = new fmj<>(
      "options.fovEffectScale", fmj.a(ca), fmk::b, fmj.m.a.a(bae::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final xv cc = xv.c("options.darknessEffectScale.tooltip");
   private final fmj<Double> cd = new fmj<>("options.darknessEffectScale", fmj.a(cc), fmk::b, fmj.m.a.a(bae::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final xv ce = xv.c("options.glintSpeed.tooltip");
   private final fmj<Double> cf = new fmj<>("options.glintSpeed", fmj.a(ce), fmk::b, fmj.m.a, 0.5, $$0x -> {
   });
   private static final xv cg = xv.c("options.glintStrength.tooltip");
   private final fmj<Double> ch = new fmj<>("options.glintStrength", fmj.a(cg), fmk::b, fmj.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final xv ci = xv.c("options.damageTiltStrength.tooltip");
   private final fmj<Double> cj = new fmj<>("options.damageTiltStrength", fmj.a(ci), fmk::b, fmj.m.a, 1.0, $$0x -> {
   });
   private final fmj<Double> ck = new fmj<>("options.gamma", fmj.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xv.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xv.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xv.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fmj.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cl = 2147483646;
   private final fmj<Integer> cm = new fmj<>(
      "options.guiScale", fmj.a(), ($$0x, $$1x) -> $$1x == 0 ? xv.c("options.guiScale.auto") : xv.b(Integer.toString($$1x)), new fmj.c(0, () -> {
         fmg $$0x = fmg.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fmj<arz> cn = new fmj<>(
      "options.particles", fmj.a(), fmj.b(), new fmj.e<>(Arrays.asList(arz.values()), Codec.INT.xmap(arz::a, arz::b)), arz.a, $$0x -> {
      }
   );
   private final fmj<fmi> co = new fmj<>(
      "options.narrator",
      fmj.a(),
      ($$0x, $$1x) -> (xv)(this.W.aZ().a() ? $$1x.b() : xv.c("options.narrator.notavailable")),
      new fmj.e<>(Arrays.asList(fmi.values()), Codec.INT.xmap(fmi::a, fmi::a)),
      fmi.a,
      $$0x -> this.W.aZ().a($$0x)
   );
   public String ab = "en_us";
   private final fmj<String> cp = new fmj<>(
      "options.audioDevice",
      fmj.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xv.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xv.b($$1x.substring(hgk.c)) : xv.b($$1x);
         }
      },
      new fmj.h<>(
         () -> Stream.concat(Stream.of(""), fmg.Q().ak().a().stream()).toList(),
         $$0x -> fmg.Q().r() && $$0x != "" && !fmg.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hgn $$1x = fmg.Q().ak();
         $$1x.k();
         $$1x.a(hfd.a(axf.AQ, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;

   public fmj<Boolean> a() {
      return this.aj;
   }

   public fmj<Boolean> b() {
      return this.al;
   }

   public fmj<Boolean> c() {
      return this.an;
   }

   public fmj<Double> d() {
      return this.ao;
   }

   public fmj<Integer> e() {
      return this.ap;
   }

   public fmj<Integer> f() {
      return this.aq;
   }

   public fmj<Double> g() {
      return this.as;
   }

   public fmj<Integer> h() {
      return this.at;
   }

   public fmj<fmc> i() {
      return this.aw;
   }

   public fmj<fls> j() {
      return this.ax;
   }

   public fmj<fly> k() {
      return this.aB;
   }

   public fmj<Boolean> l() {
      return this.aC;
   }

   public fmj<fmm> m() {
      return this.aG;
   }

   public void a(avg $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (avd $$2 : $$0.g()) {
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

   public fmj<cpu> n() {
      return this.aH;
   }

   public fmj<Double> o() {
      return this.aI;
   }

   public fmj<Double> p() {
      return this.aJ;
   }

   public fmj<Integer> q() {
      return this.aM;
   }

   public int r() {
      return this.q().c();
   }

   public fmj<Double> s() {
      return this.aN;
   }

   public fmj<Double> t() {
      return this.aO;
   }

   public fmj<Boolean> u() {
      return this.aQ;
   }

   public fmj<Boolean> v() {
      return this.aS;
   }

   public fmj<Boolean> w() {
      return this.aT;
   }

   public fmj<bwa> x() {
      return this.aV;
   }

   public fmj<Double> y() {
      return this.aW;
   }

   public fmj<Double> z() {
      return this.aX;
   }

   public fmj<Double> A() {
      return this.aY;
   }

   public fmj<Double> B() {
      return this.aZ;
   }

   public fmj<Double> C() {
      return this.ba;
   }

   public fmj<Double> D() {
      return this.bc;
   }

   public fmj<Integer> E() {
      return this.bd;
   }

   public fmj<flo> F() {
      return this.be;
   }

   public fmj<Integer> G() {
      return this.bf;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return bae.a(Math.log10($$0) * 100.0);
   }

   public fmj<Double> H() {
      return this.bg;
   }

   public fmj<Boolean> I() {
      return this.bh;
   }

   public fmj<Boolean> J() {
      return this.bi;
   }

   public fmj<Boolean> K() {
      return this.bk;
   }

   public fmj<Boolean> L() {
      return this.bl;
   }

   public fmj<Boolean> M() {
      return this.bm;
   }

   public fmj<Boolean> N() {
      return this.bn;
   }

   public fmj<Boolean> O() {
      return this.bo;
   }

   public fmj<Boolean> P() {
      return this.bp;
   }

   public fmj<Boolean> Q() {
      return this.bq;
   }

   public fmj<Boolean> R() {
      return this.br;
   }

   private static void aI() {
      fmg $$0 = fmg.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fmj<Boolean> S() {
      return this.bs;
   }

   private static boolean aJ() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fmj<Boolean> T() {
      return this.bt;
   }

   public fmj<Boolean> U() {
      return this.bu;
   }

   public fmj<Boolean> V() {
      return this.bv;
   }

   public fmj<Boolean> W() {
      return this.bx;
   }

   public fmj<Boolean> X() {
      return this.bz;
   }

   public fmj<Boolean> Y() {
      return this.bA;
   }

   public final float a(axg $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fmj<Double> b(axg $$0) {
      return Objects.requireNonNull(this.bB.get($$0));
   }

   private fmj<Double> a(String $$0, axg $$1) {
      return new fmj<>($$0, fmj.a(), fmk::b, fmj.m.a, 1.0, $$1x -> fmg.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fmj<Boolean> Z() {
      return this.bC;
   }

   public fmj<Boolean> aa() {
      return this.bF;
   }

   public fmj<Boolean> ab() {
      return this.bG;
   }

   public fmj<Boolean> ac() {
      return this.bH;
   }

   public fmj<Boolean> ad() {
      return this.bI;
   }

   public fmj<Boolean> ae() {
      return this.bJ;
   }

   public fmj<Boolean> af() {
      return this.bM;
   }

   public fmj<Boolean> ag() {
      return this.bN;
   }

   public fmj<Boolean> ah() {
      return this.bP;
   }

   public fmj<Boolean> ai() {
      return this.bQ;
   }

   public fmj<Boolean> aj() {
      return this.bS;
   }

   public fmj<Integer> ak() {
      return this.bV;
   }

   public fmj<Boolean> al() {
      return this.bX;
   }

   public fmj<Double> am() {
      return this.bZ;
   }

   public fmj<Double> an() {
      return this.cb;
   }

   public fmj<Double> ao() {
      return this.cd;
   }

   public fmj<Double> ap() {
      return this.cf;
   }

   public fmj<Double> aq() {
      return this.ch;
   }

   public fmj<Double> ar() {
      return this.cj;
   }

   public fmj<Double> as() {
      return this.ck;
   }

   public fmj<Integer> at() {
      return this.cm;
   }

   public fmj<arz> au() {
      return this.cn;
   }

   public fmj<fmi> av() {
      return this.co;
   }

   public fmj<String> aw() {
      return this.cp;
   }

   public void ax() {
      this.ac = false;
      this.az();
   }

   public fmk(fmg $$0, File $$1) {
      this.W = $$0;
      this.bT = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ap = new fmj<>(
         "options.renderDistance",
         fmj.a(),
         ($$0x, $$1x) -> a($$0x, xv.a("options.chunks", $$1x)),
         new fmj.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fmg.Q().f.p()
      );
      this.aq = new fmj<>(
         "options.simulationDistance", fmj.a(), ($$0x, $$1x) -> a($$0x, xv.a("options.chunks", $$1x)), new fmj.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = ae.m() == ae.a.c;
      this.ay();
   }

   public float a(float $$0) {
      return this.bG.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return ayp.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bG.c() ? $$0 : ayp.a(this.aN.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(fmk.b $$0) {
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

   private void a(fmk.a $$0) {
      this.a((fmk.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, fmk::c, af::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fmk::c, af::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, hhr::a, hhr::a);
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

      for (fme $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(ffn.a($$3));
         }
      }

      for (axg $$4 : axg.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bB.get($$4));
      }

      for (cpy $$5 : cpy.values()) {
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

         ux $$0 = new ux();

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

         final ux $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(fly.b);
            } else {
               this.aB.a(fly.a);
            }
         }

         this.a(new fmk.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).u_() : null;
            }

            @Override
            public <T> void a(String $$0, fmj<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fmk.ae.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fmk.ae.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
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
                     fmk.ae.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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
         ae.error("Failed to load options", var7);
      }
   }

   static boolean a(String $$0) {
      return "true".equals($$0);
   }

   static boolean b(String $$0) {
      return "false".equals($$0);
   }

   private ux a(ux $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return bbs.e.a(this.W.au(), $$0, $$1);
   }

   public void az() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bT), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fmk.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fmj<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> fmk.ae.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(fmk.af.toJson($$2));
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

   public ars aA() {
      int $$0 = 0;

      for (cpy $$1 : this.aU) {
         $$0 |= $$1.a();
      }

      return new ars(this.ab, this.ap.c(), this.aH.c(), this.bn.c(), $$0, this.aV.c(), this.W.aU(), this.bz.c(), this.cn.c());
   }

   public void aB() {
      if (this.W.t != null) {
         this.W.t.i.a(this.aA());
      }
   }

   public void a(cpy $$0, boolean $$1) {
      if ($$1) {
         this.aU.add($$0);
      } else {
         this.aU.remove($$0);
      }
   }

   public boolean a(cpy $$0) {
      return this.aU.contains($$0);
   }

   public fls aC() {
      return this.aH() >= 4 ? this.ax.c() : fls.a;
   }

   public boolean aD() {
      return this.q;
   }

   public void b(avg $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         avd $$4 = $$0.c($$3);
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

   public flq aE() {
      return this.bU;
   }

   public void a(flq $$0) {
      this.bU = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = azu.a(af, $$0, ag);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aF() {
      return this.bT;
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
      this.ar = $$0;
   }

   public int aH() {
      return this.ar > 0 ? Math.min(this.ap.c(), this.ar) : this.ap.c();
   }

   private static xv c(xv $$0, int $$1) {
      return xv.a("options.pixel_value", $$0, $$1);
   }

   private static xv a(xv $$0, double $$1) {
      return xv.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static xv a(xv $$0, xv $$1) {
      return xv.a("options.generic_value", $$0, $$1);
   }

   public static xv a(xv $$0, int $$1) {
      return a($$0, xv.b(Integer.toString($$1)));
   }

   public static xv b(xv $$0, int $$1) {
      return $$1 == 0 ? a($$0, xu.c) : a($$0, $$1);
   }

   private static xv b(xv $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, xu.c) : a($$0, $$1);
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
