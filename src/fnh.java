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

public class fnh {
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
   private static final wv aj = wv.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fng<Boolean> ak = fng.a("options.darkMojangStudiosBackgroundColor", fng.a(aj), false);
   private static final wv al = wv.c("options.hideLightningFlashes.tooltip");
   private final fng<Boolean> am = fng.a("options.hideLightningFlashes", fng.a(al), false);
   private static final wv an = wv.c("options.hideSplashTexts.tooltip");
   private final fng<Boolean> ao = fng.a("options.hideSplashTexts", fng.a(an), false);
   private final fng<Double> ap = new fng<>("options.sensitivity", fng.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wv.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wv.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fng.m.a, 0.5, $$0x -> {
   });
   private final fng<Integer> aq;
   private final fng<Integer> ar;
   private int as = 0;
   private final fng<Double> at = new fng<>(
      "options.entityDistanceScaling",
      fng.a(),
      fnh::a,
      new fng.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fng<Integer> au = new fng<>(
      "options.framerateLimit",
      fng.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wv.c("options.framerateLimit.max")) : a($$0x, wv.a("options.framerate", $$1x)),
      new fng.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fnd.Q().aP().a($$0x)
   );
   private static final wv av = wv.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final wv aw = wv.c("options.inactivityFpsLimit.afk.tooltip");
   private final fng<fmz> ax = new fng<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> fry.a(av);
         case b -> fry.a(aw);
      };
   }, fng.b(), new fng.e<>(Arrays.asList(fmz.values()), fmz.c), fmz.b, $$0x -> {
   });
   private final fng<fmp> ay = new fng<>(
      "options.renderClouds",
      fng.a(),
      fng.b(),
      new fng.e<>(Arrays.asList(fmp.values()), Codec.withAlternative(fmp.d, Codec.BOOL, $$0x -> $$0x ? fmp.c : fmp.a)),
      fmp.c,
      $$0x -> {
      }
   );
   private static final wv az = wv.c("options.graphics.fast.tooltip");
   private static final wv aA = wv.a("options.graphics.fabulous.tooltip", wv.c("options.graphics.fabulous").a(n.u));
   private static final wv aB = wv.c("options.graphics.fancy.tooltip");
   private final fng<fmv> aC = new fng<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fry.a(aB);
            case a -> fry.a(az);
            case c -> fry.a(aA);
         };
      },
      ($$0x, $$1x) -> {
         xj $$2x = wv.c($$1x.a());
         return $$1x == fmv.c ? $$2x.a(n.u) : $$2x;
      },
      new fng.a<>(
         Arrays.asList(fmv.values()),
         Stream.of(fmv.values()).filter($$0x -> $$0x != fmv.c).collect(Collectors.toList()),
         () -> fnd.Q().r() && fnd.Q().aj().h(),
         ($$0x, $$1x) -> {
            fnd $$2x = fnd.Q();
            gnq $$3 = $$2x.aj();
            if ($$1x == fmv.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.e();
            }
         },
         Codec.INT.xmap(fmv::a, fmv::b)
      ),
      fmv.b,
      $$0x -> {
      }
   );
   private final fng<Boolean> aD = fng.a("options.ao", true, $$0x -> fnd.Q().f.e());
   private static final wv aE = wv.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wv aF = wv.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wv aG = wv.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fng<fnj> aH = new fng<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fry.a(aE);
         case b -> fry.a(aF);
         case c -> fry.a(aG);
      };
   }, fng.b(), new fng.e<>(Arrays.asList(fnj.values()), Codec.INT.xmap(fnj::a, fnj::b)), fnj.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fng<cqf> aI = new fng<>(
      "options.chat.visibility", fng.a(), fng.b(), new fng.e<>(Arrays.asList(cqf.values()), Codec.INT.xmap(cqf::a, cqf::b)), cqf.a, $$0x -> {
      }
   );
   private final fng<Double> aJ = new fng<>("options.chat.opacity", fng.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fng.m.a, 1.0, $$0x -> fnd.Q().m.d().b());
   private final fng<Double> aK = new fng<>("options.chat.line_spacing", fng.a(), fnh::a, fng.m.a, 0.0, $$0x -> {
   });
   private static final wv aL = wv.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aM = 5;
   private final fng<Integer> aN = new fng<>("options.accessibility.menu_background_blurriness", fng.a(aL), fnh::b, new fng.f(0, 10), 5, $$0x -> {
   });
   private final fng<Double> aO = new fng<>("options.accessibility.text_background_opacity", fng.a(), fnh::a, fng.m.a, 0.5, $$0x -> fnd.Q().m.d().b());
   private final fng<Double> aP = new fng<>("options.accessibility.panorama_speed", fng.a(), fnh::a, fng.m.a, 1.0, $$0x -> {
   });
   private static final wv aQ = wv.c("options.accessibility.high_contrast.tooltip");
   private final fng<Boolean> aR = fng.a("options.accessibility.high_contrast", fng.a(aQ), false, $$0x -> {
      auk $$1x = fnd.Q().ad();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private static final wv aS = wv.c("options.accessibility.high_contrast_block_outline.tooltip");
   private final fng<Boolean> aT = fng.a("options.accessibility.high_contrast_block_outline", fng.a(aS), false);
   private final fng<Boolean> aU = fng.a(
      "options.accessibility.narrator_hotkey",
      fng.a(fnd.a ? wv.c("options.accessibility.narrator_hotkey.mac.tooltip") : wv.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cqj> aV = EnumSet.allOf(cqj.class);
   private final fng<bwk> aW = new fng<>("options.mainHand", fng.a(), fng.b(), new fng.e<>(Arrays.asList(bwk.values()), bwk.c), bwk.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fng<Double> aX = new fng<>(
      "options.chat.scale",
      fng.a(),
      ($$0x, $$1x) -> (wv)($$1x == 0.0 ? wu.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fng.m.a,
      1.0,
      $$0x -> fnd.Q().m.d().b()
   );
   private final fng<Double> aY = new fng<>("options.chat.width", fng.a(), ($$0x, $$1x) -> c($$0x, fqo.a($$1x)), fng.m.a, 1.0, $$0x -> fnd.Q().m.d().b());
   private final fng<Double> aZ = new fng<>(
      "options.chat.height.unfocused", fng.a(), ($$0x, $$1x) -> c($$0x, fqo.b($$1x)), fng.m.a, fqo.i(), $$0x -> fnd.Q().m.d().b()
   );
   private final fng<Double> ba = new fng<>(
      "options.chat.height.focused", fng.a(), ($$0x, $$1x) -> c($$0x, fqo.b($$1x)), fng.m.a, 1.0, $$0x -> fnd.Q().m.d().b()
   );
   private final fng<Double> bb = new fng<>(
      "options.chat.delay_instant",
      fng.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wv.c("options.chat.delay_none") : wv.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fng.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fnd.Q().aZ().a($$0x)
   );
   private static final wv bc = wv.c("options.notifications.display_time.tooltip");
   private final fng<Double> bd = new fng<>(
      "options.notifications.display_time",
      fng.a(bc),
      ($$0x, $$1x) -> a($$0x, wv.a("options.multiplier", $$1x)),
      new fng.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fng<Integer> be = new fng<>(
      "options.mipmapLevels", fng.a(), ($$0x, $$1x) -> (wv)($$1x == 0 ? wu.a($$0x, false) : a($$0x, $$1x.intValue())), new fng.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fng<fmk> bf = new fng<>(
      "options.attackIndicator", fng.a(), fng.b(), new fng.e<>(Arrays.asList(fmk.values()), Codec.INT.xmap(fmk::a, fmk::b)), fmk.b, $$0x -> {
      }
   );
   public hmz r = hmz.a;
   public boolean s = false;
   private final fng<Integer> bg = new fng<>("options.biomeBlendRadius", fng.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wv.c("options.biomeBlendRadius." + $$2x));
   }, new fng.f(0, 7, false), 2, $$0x -> fnd.Q().f.e());
   private final fng<Double> bh = new fng<>(
      "options.mouseWheelSensitivity",
      fng.a(),
      ($$0x, $$1x) -> a($$0x, wv.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fng.f(-200, 100).a(fnh::c, fnh::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fng<Boolean> bi = fng.a("options.rawMouseInput", true, $$0x -> {
      fgr $$1x = fnd.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fng<Boolean> bj = fng.a("options.autoJump", false);
   private static final wv bk = wv.c("options.rotateWithMinecart.tooltip");
   private final fng<Boolean> bl = fng.a("options.rotateWithMinecart", fng.a(bk), false);
   private final fng<Boolean> bm = fng.a("options.operatorItemsTab", false);
   private final fng<Boolean> bn = fng.a("options.autoSuggestCommands", true);
   private final fng<Boolean> bo = fng.a("options.chat.color", true);
   private final fng<Boolean> bp = fng.a("options.chat.links", true);
   private final fng<Boolean> bq = fng.a("options.chat.links.prompt", true);
   private final fng<Boolean> br = fng.a("options.vsync", true, $$0x -> {
      if (fnd.Q().aO() != null) {
         fnd.Q().aO().a($$0x);
      }
   });
   private final fng<Boolean> bs = fng.a("options.entityShadows", true);
   private final fng<Boolean> bt = fng.a("options.forceUnicodeFont", false, $$0x -> aI());
   private final fng<Boolean> bu = fng.a("options.japaneseGlyphVariants", fng.a(wv.c("options.japaneseGlyphVariants.tooltip")), aJ(), $$0x -> aI());
   private final fng<Boolean> bv = fng.a("options.invertMouse", false);
   private final fng<Boolean> bw = fng.a("options.discrete_mouse_scroll", false);
   private static final wv bx = wv.c("options.realmsNotifications.tooltip");
   private final fng<Boolean> by = fng.a("options.realmsNotifications", fng.a(bx), true);
   private static final wv bz = wv.c("options.allowServerListing.tooltip");
   private final fng<Boolean> bA = fng.a("options.allowServerListing", fng.a(bz), true, $$0x -> {
   });
   private final fng<Boolean> bB = fng.a("options.reducedDebugInfo", false);
   private final Map<awl, fng<Double>> bC = af.a(awl.class, $$0x -> this.a("soundCategory." + $$0x.a(), $$0x));
   private final fng<Boolean> bD = fng.a("options.showSubtitles", false);
   private static final wv bE = wv.c("options.directionalAudio.on.tooltip");
   private static final wv bF = wv.c("options.directionalAudio.off.tooltip");
   private final fng<Boolean> bG = fng.a("options.directionalAudio", $$0x -> $$0x ? fry.a(bE) : fry.a(bF), false, $$0x -> {
      hlv $$1x = fnd.Q().ak();
      $$1x.k();
      $$1x.a(hkk.a(awk.Bp, 1.0F));
   });
   private final fng<Boolean> bH = new fng<>(
      "options.accessibility.text_background",
      fng.a(),
      ($$0x, $$1x) -> $$1x ? wv.c("options.accessibility.text_background.chat") : wv.c("options.accessibility.text_background.everywhere"),
      fng.a,
      true,
      $$0x -> {
      }
   );
   private final fng<Boolean> bI = fng.a("options.touchscreen", false);
   private final fng<Boolean> bJ = fng.a("options.fullscreen", false, $$0x -> {
      fnd $$1x = fnd.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ad().a($$1x.aO().i());
      }
   });
   private final fng<Boolean> bK = fng.a("options.viewBobbing", true);
   private static final wv bL = wv.c("options.key.toggle");
   private static final wv bM = wv.c("options.key.hold");
   private final fng<Boolean> bN = new fng<>("key.sneak", fng.a(), ($$0x, $$1x) -> $$1x ? bL : bM, fng.a, false, $$0x -> {
   });
   private final fng<Boolean> bO = new fng<>("key.sprint", fng.a(), ($$0x, $$1x) -> $$1x ? bL : bM, fng.a, false, $$0x -> {
   });
   public boolean u;
   private static final wv bP = wv.c("options.hideMatchedNames.tooltip");
   private final fng<Boolean> bQ = fng.a("options.hideMatchedNames", fng.a(bP), true);
   private final fng<Boolean> bR = fng.a("options.autosaveIndicator", true);
   private static final wv bS = wv.c("options.onlyShowSecureChat.tooltip");
   private final fng<Boolean> bT = fng.a("options.onlyShowSecureChat", fng.a(bS), false);
   public final fnb v = new fnb("key.forward", 87, "key.categories.movement");
   public final fnb w = new fnb("key.left", 65, "key.categories.movement");
   public final fnb x = new fnb("key.back", 83, "key.categories.movement");
   public final fnb y = new fnb("key.right", 68, "key.categories.movement");
   public final fnb z = new fnb("key.jump", 32, "key.categories.movement");
   public final fnb A = new fno("key.sneak", 340, "key.categories.movement", this.bN::c);
   public final fnb B = new fno("key.sprint", 341, "key.categories.movement", this.bO::c);
   public final fnb C = new fnb("key.inventory", 69, "key.categories.inventory");
   public final fnb D = new fnb("key.swapOffhand", 70, "key.categories.inventory");
   public final fnb E = new fnb("key.drop", 81, "key.categories.inventory");
   public final fnb F = new fnb("key.use", fgj.b.c, 1, "key.categories.gameplay");
   public final fnb G = new fnb("key.attack", fgj.b.c, 0, "key.categories.gameplay");
   public final fnb H = new fnb("key.pickItem", fgj.b.c, 2, "key.categories.gameplay");
   public final fnb I = new fnb("key.chat", 84, "key.categories.multiplayer");
   public final fnb J = new fnb("key.playerlist", 258, "key.categories.multiplayer");
   public final fnb K = new fnb("key.command", 47, "key.categories.multiplayer");
   public final fnb L = new fnb("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fnb M = new fnb("key.screenshot", 291, "key.categories.misc");
   public final fnb N = new fnb("key.togglePerspective", 294, "key.categories.misc");
   public final fnb O = new fnb("key.smoothCamera", fgj.bv.b(), "key.categories.misc");
   public final fnb P = new fnb("key.fullscreen", 300, "key.categories.misc");
   public final fnb Q = new fnb("key.spectatorOutlines", fgj.bv.b(), "key.categories.misc");
   public final fnb R = new fnb("key.advancements", 76, "key.categories.misc");
   public final fnb[] S = new fnb[]{
      new fnb("key.hotbar.1", 49, "key.categories.inventory"),
      new fnb("key.hotbar.2", 50, "key.categories.inventory"),
      new fnb("key.hotbar.3", 51, "key.categories.inventory"),
      new fnb("key.hotbar.4", 52, "key.categories.inventory"),
      new fnb("key.hotbar.5", 53, "key.categories.inventory"),
      new fnb("key.hotbar.6", 54, "key.categories.inventory"),
      new fnb("key.hotbar.7", 55, "key.categories.inventory"),
      new fnb("key.hotbar.8", 56, "key.categories.inventory"),
      new fnb("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fnb T = new fnb("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fnb U = new fnb("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fnb[] V = (fnb[])ArrayUtils.addAll(
      new fnb[]{
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
   protected fnd W;
   private final File bU;
   public boolean X;
   private fmm bV = fmm.a;
   public String Y = "";
   public boolean Z;
   private final fng<Integer> bW = new fng<>("options.fov", fng.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wv.c("options.fov.min"));
         case 110 -> a($$0x, wv.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fng.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fnd.Q().f.p());
   private static final wv bX = wv.a("options.telemetry.button.tooltip", wv.c("options.telemetry.state.minimal"), wv.c("options.telemetry.state.all"));
   private final fng<Boolean> bY = fng.a("options.telemetry.button", fng.a(bX), ($$0x, $$1x) -> {
      fnd $$2x = fnd.Q();
      if (!$$2x.E()) {
         return wv.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wv.c("options.telemetry.state.all") : wv.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wv bZ = wv.c("options.screenEffectScale.tooltip");
   private final fng<Double> ca = new fng<>("options.screenEffectScale", fng.a(bZ), fnh::b, fng.m.a, 1.0, $$0x -> {
   });
   private static final wv cb = wv.c("options.fovEffectScale.tooltip");
   private final fng<Double> cc = new fng<>(
      "options.fovEffectScale", fng.a(cb), fnh::b, fng.m.a.a(azk::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final wv cd = wv.c("options.darknessEffectScale.tooltip");
   private final fng<Double> ce = new fng<>("options.darknessEffectScale", fng.a(cd), fnh::b, fng.m.a.a(azk::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final wv cf = wv.c("options.glintSpeed.tooltip");
   private final fng<Double> cg = new fng<>("options.glintSpeed", fng.a(cf), fnh::b, fng.m.a, 0.5, $$0x -> {
   });
   private static final wv ch = wv.c("options.glintStrength.tooltip");
   private final fng<Double> ci = new fng<>("options.glintStrength", fng.a(ch), fnh::b, fng.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final wv cj = wv.c("options.damageTiltStrength.tooltip");
   private final fng<Double> ck = new fng<>("options.damageTiltStrength", fng.a(cj), fnh::b, fng.m.a, 1.0, $$0x -> {
   });
   private final fng<Double> cl = new fng<>("options.gamma", fng.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wv.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wv.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wv.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fng.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cm = 2147483646;
   private final fng<Integer> cn = new fng<>(
      "options.guiScale", fng.a(), ($$0x, $$1x) -> $$1x == 0 ? wv.c("options.guiScale.auto") : wv.b(Integer.toString($$1x)), new fng.c(0, () -> {
         fnd $$0x = fnd.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fng<arf> co = new fng<>(
      "options.particles", fng.a(), fng.b(), new fng.e<>(Arrays.asList(arf.values()), Codec.INT.xmap(arf::a, arf::b)), arf.a, $$0x -> {
      }
   );
   private final fng<fnf> cp = new fng<>(
      "options.narrator",
      fng.a(),
      ($$0x, $$1x) -> (wv)(this.W.aY().a() ? $$1x.b() : wv.c("options.narrator.notavailable")),
      new fng.e<>(Arrays.asList(fnf.values()), Codec.INT.xmap(fnf::a, fnf::a)),
      fnf.a,
      $$0x -> this.W.aY().a($$0x)
   );
   public String ab = "en_us";
   private final fng<String> cq = new fng<>(
      "options.audioDevice",
      fng.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wv.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wv.b($$1x.substring(hls.c)) : wv.b($$1x);
         }
      },
      new fng.h<>(
         () -> Stream.concat(Stream.of(""), fnd.Q().ak().a().stream()).toList(),
         $$0x -> fnd.Q().r() && $$0x != "" && !fnd.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hlv $$1x = fnd.Q().ak();
         $$1x.k();
         $$1x.a(hkk.a(awk.Bp, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;
   public boolean ae = true;

   public fng<Boolean> a() {
      return this.ak;
   }

   public fng<Boolean> b() {
      return this.am;
   }

   public fng<Boolean> c() {
      return this.ao;
   }

   public fng<Double> d() {
      return this.ap;
   }

   public fng<Integer> e() {
      return this.aq;
   }

   public fng<Integer> f() {
      return this.ar;
   }

   public fng<Double> g() {
      return this.at;
   }

   public fng<Integer> h() {
      return this.au;
   }

   public fng<fmz> i() {
      return this.ax;
   }

   public fng<fmp> j() {
      return this.ay;
   }

   public fng<fmv> k() {
      return this.aC;
   }

   public fng<Boolean> l() {
      return this.aD;
   }

   public fng<fnj> m() {
      return this.aH;
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

      this.az();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.W.l();
      }
   }

   public fng<cqf> n() {
      return this.aI;
   }

   public fng<Double> o() {
      return this.aJ;
   }

   public fng<Double> p() {
      return this.aK;
   }

   public fng<Integer> q() {
      return this.aN;
   }

   public int r() {
      return this.q().c();
   }

   public fng<Double> s() {
      return this.aO;
   }

   public fng<Double> t() {
      return this.aP;
   }

   public fng<Boolean> u() {
      return this.aR;
   }

   public fng<Boolean> v() {
      return this.aT;
   }

   public fng<Boolean> w() {
      return this.aU;
   }

   public fng<bwk> x() {
      return this.aW;
   }

   public fng<Double> y() {
      return this.aX;
   }

   public fng<Double> z() {
      return this.aY;
   }

   public fng<Double> A() {
      return this.aZ;
   }

   public fng<Double> B() {
      return this.ba;
   }

   public fng<Double> C() {
      return this.bb;
   }

   public fng<Double> D() {
      return this.bd;
   }

   public fng<Integer> E() {
      return this.be;
   }

   public fng<fmk> F() {
      return this.bf;
   }

   public fng<Integer> G() {
      return this.bg;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return azk.a(Math.log10($$0) * 100.0);
   }

   public fng<Double> H() {
      return this.bh;
   }

   public fng<Boolean> I() {
      return this.bi;
   }

   public fng<Boolean> J() {
      return this.bj;
   }

   public fng<Boolean> K() {
      return this.bl;
   }

   public fng<Boolean> L() {
      return this.bm;
   }

   public fng<Boolean> M() {
      return this.bn;
   }

   public fng<Boolean> N() {
      return this.bo;
   }

   public fng<Boolean> O() {
      return this.bp;
   }

   public fng<Boolean> P() {
      return this.bq;
   }

   public fng<Boolean> Q() {
      return this.br;
   }

   public fng<Boolean> R() {
      return this.bs;
   }

   private static void aI() {
      fnd $$0 = fnd.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fng<Boolean> S() {
      return this.bt;
   }

   private static boolean aJ() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fng<Boolean> T() {
      return this.bu;
   }

   public fng<Boolean> U() {
      return this.bv;
   }

   public fng<Boolean> V() {
      return this.bw;
   }

   public fng<Boolean> W() {
      return this.by;
   }

   public fng<Boolean> X() {
      return this.bA;
   }

   public fng<Boolean> Y() {
      return this.bB;
   }

   public final float a(awl $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fng<Double> b(awl $$0) {
      return Objects.requireNonNull(this.bC.get($$0));
   }

   private fng<Double> a(String $$0, awl $$1) {
      return new fng<>($$0, fng.a(), fnh::b, fng.m.a, 1.0, $$1x -> fnd.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fng<Boolean> Z() {
      return this.bD;
   }

   public fng<Boolean> aa() {
      return this.bG;
   }

   public fng<Boolean> ab() {
      return this.bH;
   }

   public fng<Boolean> ac() {
      return this.bI;
   }

   public fng<Boolean> ad() {
      return this.bJ;
   }

   public fng<Boolean> ae() {
      return this.bK;
   }

   public fng<Boolean> af() {
      return this.bN;
   }

   public fng<Boolean> ag() {
      return this.bO;
   }

   public fng<Boolean> ah() {
      return this.bQ;
   }

   public fng<Boolean> ai() {
      return this.bR;
   }

   public fng<Boolean> aj() {
      return this.bT;
   }

   public fng<Integer> ak() {
      return this.bW;
   }

   public fng<Boolean> al() {
      return this.bY;
   }

   public fng<Double> am() {
      return this.ca;
   }

   public fng<Double> an() {
      return this.cc;
   }

   public fng<Double> ao() {
      return this.ce;
   }

   public fng<Double> ap() {
      return this.cg;
   }

   public fng<Double> aq() {
      return this.ci;
   }

   public fng<Double> ar() {
      return this.ck;
   }

   public fng<Double> as() {
      return this.cl;
   }

   public fng<Integer> at() {
      return this.cn;
   }

   public fng<arf> au() {
      return this.co;
   }

   public fng<fnf> av() {
      return this.cp;
   }

   public fng<String> aw() {
      return this.cq;
   }

   public void ax() {
      this.ac = false;
      this.az();
   }

   public fnh(fnd $$0, File $$1) {
      this.W = $$0;
      this.bU = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new fng<>(
         "options.renderDistance",
         fng.a(),
         ($$0x, $$1x) -> a($$0x, wv.a("options.chunks", $$1x)),
         new fng.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fnd.Q().f.p()
      );
      this.ar = new fng<>(
         "options.simulationDistance", fng.a(), ($$0x, $$1x) -> a($$0x, wv.a("options.chunks", $$1x)), new fng.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
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

   private void a(fnh.b $$0) {
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

   private void a(fnh.a $$0) {
      this.a((fnh.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, fnh::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fnh::c, ag::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, hmz::a, hmz::a);
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

      for (fnb $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fgj.a($$3));
         }
      }

      for (awl $$4 : awl.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bC.get($$4));
      }

      for (cqj $$5 : cqj.values()) {
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

         tw $$0 = new tw();

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

         final tw $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aC.a(fmv.b);
            } else {
               this.aC.a(fmv.a);
            }
         }

         this.a(new fnh.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).p_() : null;
            }

            @Override
            public <T> void a(String $$0, fng<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fnh.af.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fnh.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fnh.a($$2) : $$1;
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
               } else if (fnh.a($$2)) {
                  return 1.0F;
               } else if (fnh.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fnh.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fnb.d();
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

   private tw a(tw $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return bax.e.a(this.W.au(), $$0, $$1);
   }

   public void az() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bU), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fnh.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fng<T> $$1) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1x -> fnh.af.error("Error saving option " + $$1 + ": " + $$1x)).ifSuccess($$2x -> {
                  this.a($$0);
                  $$0.println(fnh.ag.toJson($$2x));
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
      fgr $$0 = this.W.aO();
      if ($$0 == null) {
         return this.k;
      } else {
         return $$0.e().isPresent() ? $$0.e().get().g() : null;
      }
   }

   public aqx aA() {
      int $$0 = 0;

      for (cqj $$1 : this.aV) {
         $$0 |= $$1.a();
      }

      return new aqx(this.ab, this.aq.c(), this.aI.c(), this.bo.c(), $$0, this.aW.c(), this.W.aT(), this.bA.c(), this.co.c());
   }

   public void aB() {
      if (this.W.t != null) {
         this.W.t.j.a(this.aA());
      }
   }

   public void a(cqj $$0, boolean $$1) {
      if ($$1) {
         this.aV.add($$0);
      } else {
         this.aV.remove($$0);
      }
   }

   public boolean a(cqj $$0) {
      return this.aV.contains($$0);
   }

   public fmp aC() {
      return this.aH() >= 4 ? this.ay.c() : fmp.a;
   }

   public boolean aD() {
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

   public fmm aE() {
      return this.bV;
   }

   public void a(fmm $$0) {
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
      this.a(new fnh.b() {
         @Override
         public <T> void a(String $$0x, fng<T> $$1) {
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

   private static wv c(wv $$0, int $$1) {
      return wv.a("options.pixel_value", $$0, $$1);
   }

   private static wv a(wv $$0, double $$1) {
      return wv.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static wv a(wv $$0, wv $$1) {
      return wv.a("options.generic_value", $$0, $$1);
   }

   public static wv a(wv $$0, int $$1) {
      return a($$0, wv.b(Integer.toString($$1)));
   }

   public static wv b(wv $$0, int $$1) {
      return $$1 == 0 ? a($$0, wu.c) : a($$0, $$1);
   }

   private static wv b(wv $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, wu.c) : a($$0, $$1);
   }

   interface a extends fnh.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fng<T> var2);
   }
}
