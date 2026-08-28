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

public class ffr {
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
   private static final wu aj = wu.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final ffq<Boolean> ak = ffq.a("options.darkMojangStudiosBackgroundColor", ffq.a(aj), false);
   private static final wu al = wu.c("options.hideLightningFlashes.tooltip");
   private final ffq<Boolean> am = ffq.a("options.hideLightningFlashes", ffq.a(al), false);
   private static final wu an = wu.c("options.hideSplashTexts.tooltip");
   private final ffq<Boolean> ao = ffq.a("options.hideSplashTexts", ffq.a(an), false);
   private final ffq<Double> ap = new ffq<>("options.sensitivity", ffq.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wu.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wu.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, ffq.m.a, 0.5, $$0x -> {
   });
   private final ffq<Integer> aq;
   private final ffq<Integer> ar;
   private int as = 0;
   private final ffq<Double> at = new ffq<>(
      "options.entityDistanceScaling",
      ffq.a(),
      ffr::a,
      new ffq.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final ffq<Integer> au = new ffq<>(
      "options.framerateLimit",
      ffq.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wu.c("options.framerateLimit.max")) : a($$0x, wu.a("options.framerate", $$1x)),
      new ffq.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> ffn.Q().aO().a($$0x)
   );
   private final ffq<ffb> av = new ffq<>(
      "options.renderClouds",
      ffq.a(),
      ffq.b(),
      new ffq.e<>(Arrays.asList(ffb.values()), Codec.withAlternative(ffb.d, Codec.BOOL, $$0x -> $$0x ? ffb.c : ffb.a)),
      ffb.c,
      $$0x -> {
         if (ffn.O()) {
            eys $$1x = ffn.Q().f.x();
            if ($$1x != null) {
               $$1x.b(ffn.a);
            }
         }
      }
   );
   private static final wu aw = wu.c("options.graphics.fast.tooltip");
   private static final wu ax = wu.a("options.graphics.fabulous.tooltip", wu.c("options.graphics.fabulous").a(n.u));
   private static final wu ay = wu.c("options.graphics.fancy.tooltip");
   private final ffq<ffg> az = new ffq<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fix.a(ay);
            case a -> fix.a(aw);
            case c -> fix.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         xi $$2x = wu.c($$1x.b());
         return $$1x == ffg.c ? $$2x.a(n.u) : $$2x;
      },
      new ffq.a<>(
         Arrays.asList(ffg.values()),
         Stream.of(ffg.values()).filter($$0x -> $$0x != ffg.c).collect(Collectors.toList()),
         () -> ffn.Q().r() && ffn.Q().ai().h(),
         ($$0x, $$1x) -> {
            ffn $$2x = ffn.Q();
            gdr $$3 = $$2x.ai();
            if ($$1x == ffg.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(ffg::a, ffg::a)
      ),
      ffg.b,
      $$0x -> {
      }
   );
   private final ffq<Boolean> aA = ffq.a("options.ao", true, $$0x -> ffn.Q().f.f());
   private static final wu aB = wu.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wu aC = wu.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wu aD = wu.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final ffq<ffu> aE = new ffq<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fix.a(aB);
         case b -> fix.a(aC);
         case c -> fix.a(aD);
      };
   }, ffq.b(), new ffq.e<>(Arrays.asList(ffu.values()), Codec.INT.xmap(ffu::a, ffu::a)), ffu.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final ffq<cmf> aF = new ffq<>(
      "options.chat.visibility", ffq.a(), ffq.b(), new ffq.e<>(Arrays.asList(cmf.values()), Codec.INT.xmap(cmf::a, cmf::a)), cmf.a, $$0x -> {
      }
   );
   private final ffq<Double> aG = new ffq<>("options.chat.opacity", ffq.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), ffq.m.a, 1.0, $$0x -> ffn.Q().l.d().b());
   private final ffq<Double> aH = new ffq<>("options.chat.line_spacing", ffq.a(), ffr::a, ffq.m.a, 0.0, $$0x -> {
   });
   private static final wu aI = wu.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final double aJ = 0.5;
   private final ffq<Double> aK = new ffq<>("options.accessibility.menu_background_blurriness", ffq.a(aI), ffr::b, ffq.m.a, 0.5, $$0x -> {
   });
   private final ffq<Double> aL = new ffq<>("options.accessibility.text_background_opacity", ffq.a(), ffr::a, ffq.m.a, 0.5, $$0x -> ffn.Q().l.d().b());
   private final ffq<Double> aM = new ffq<>("options.accessibility.panorama_speed", ffq.a(), ffr::a, ffq.m.a, 1.0, $$0x -> {
   });
   private static final wu aN = wu.c("options.accessibility.high_contrast.tooltip");
   private final ffq<Boolean> aO = ffq.a("options.accessibility.high_contrast", ffq.a(aN), false, $$0x -> {
      atf $$1x = ffn.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final ffq<Boolean> aP = ffq.a(
      "options.accessibility.narrator_hotkey",
      ffq.a(ffn.a ? wu.c("options.accessibility.narrator_hotkey.mac.tooltip") : wu.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cmi> aQ = EnumSet.allOf(cmi.class);
   private final ffq<bss> aR = new ffq<>("options.mainHand", ffq.a(), ffq.b(), new ffq.e<>(Arrays.asList(bss.values()), bss.c), bss.b, $$0x -> this.ax());
   public int o;
   public int p;
   private final ffq<Double> aS = new ffq<>(
      "options.chat.scale",
      ffq.a(),
      ($$0x, $$1x) -> (wu)($$1x == 0.0 ? wt.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      ffq.m.a,
      1.0,
      $$0x -> ffn.Q().l.d().b()
   );
   private final ffq<Double> aT = new ffq<>("options.chat.width", ffq.a(), ($$0x, $$1x) -> b($$0x, fhn.a($$1x)), ffq.m.a, 1.0, $$0x -> ffn.Q().l.d().b());
   private final ffq<Double> aU = new ffq<>(
      "options.chat.height.unfocused", ffq.a(), ($$0x, $$1x) -> b($$0x, fhn.b($$1x)), ffq.m.a, fhn.i(), $$0x -> ffn.Q().l.d().b()
   );
   private final ffq<Double> aV = new ffq<>(
      "options.chat.height.focused", ffq.a(), ($$0x, $$1x) -> b($$0x, fhn.b($$1x)), ffq.m.a, 1.0, $$0x -> ffn.Q().l.d().b()
   );
   private final ffq<Double> aW = new ffq<>(
      "options.chat.delay_instant",
      ffq.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wu.c("options.chat.delay_none") : wu.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new ffq.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> ffn.Q().aY().a($$0x)
   );
   private static final wu aX = wu.c("options.notifications.display_time.tooltip");
   private final ffq<Double> aY = new ffq<>(
      "options.notifications.display_time",
      ffq.a(aX),
      ($$0x, $$1x) -> a($$0x, wu.a("options.multiplier", $$1x)),
      new ffq.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final ffq<Integer> aZ = new ffq<>(
      "options.mipmapLevels", ffq.a(), ($$0x, $$1x) -> (wu)($$1x == 0 ? wt.a($$0x, false) : a($$0x, $$1x.intValue())), new ffq.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final ffq<fex> ba = new ffq<>(
      "options.attackIndicator", ffq.a(), ffq.b(), new ffq.e<>(Arrays.asList(fex.values()), Codec.INT.xmap(fex::a, fex::a)), fex.b, $$0x -> {
      }
   );
   public gvg r = gvg.a;
   public boolean s = false;
   public boolean t = false;
   private final ffq<Integer> bb = new ffq<>("options.biomeBlendRadius", ffq.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wu.c("options.biomeBlendRadius." + $$2x));
   }, new ffq.f(0, 7, false), 2, $$0x -> ffn.Q().f.f());
   private final ffq<Double> bc = new ffq<>(
      "options.mouseWheelSensitivity",
      ffq.a(),
      ($$0x, $$1x) -> a($$0x, wu.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new ffq.f(-200, 100).a(ffr::c, ffr::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final ffq<Boolean> bd = ffq.a("options.rawMouseInput", true, $$0x -> {
      ezk $$1x = ffn.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final ffq<Boolean> be = ffq.a("options.autoJump", false);
   private final ffq<Boolean> bf = ffq.a("options.operatorItemsTab", false);
   private final ffq<Boolean> bg = ffq.a("options.autoSuggestCommands", true);
   private final ffq<Boolean> bh = ffq.a("options.chat.color", true);
   private final ffq<Boolean> bi = ffq.a("options.chat.links", true);
   private final ffq<Boolean> bj = ffq.a("options.chat.links.prompt", true);
   private final ffq<Boolean> bk = ffq.a("options.vsync", true, $$0x -> {
      if (ffn.Q().aO() != null) {
         ffn.Q().aO().a($$0x);
      }
   });
   private final ffq<Boolean> bl = ffq.a("options.entityShadows", true);
   private final ffq<Boolean> bm = ffq.a("options.forceUnicodeFont", false, $$0x -> aE());
   private final ffq<Boolean> bn = ffq.a("options.japaneseGlyphVariants", ffq.a(wu.c("options.japaneseGlyphVariants.tooltip")), aF(), $$0x -> aE());
   private final ffq<Boolean> bo = ffq.a("options.invertMouse", false);
   private final ffq<Boolean> bp = ffq.a("options.discrete_mouse_scroll", false);
   private final ffq<Boolean> bq = ffq.a("options.realmsNotifications", true);
   private static final wu br = wu.c("options.allowServerListing.tooltip");
   private final ffq<Boolean> bs = ffq.a("options.allowServerListing", ffq.a(br), true, $$0x -> this.ax());
   private final ffq<Boolean> bt = ffq.a("options.reducedDebugInfo", false);
   private final Map<avg, ffq<Double>> bu = ac.a(new EnumMap<>(avg.class), $$0x -> {
      for (avg $$1x : avg.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final ffq<Boolean> bv = ffq.a("options.showSubtitles", false);
   private static final wu bw = wu.c("options.directionalAudio.on.tooltip");
   private static final wu bx = wu.c("options.directionalAudio.off.tooltip");
   private final ffq<Boolean> by = ffq.a("options.directionalAudio", $$0x -> $$0x ? fix.a(bw) : fix.a(bx), false, $$0x -> {
      gub $$1x = ffn.Q().aj();
      $$1x.k();
      $$1x.a(gsr.a(avf.Ar, 1.0F));
   });
   private final ffq<Boolean> bz = new ffq<>(
      "options.accessibility.text_background",
      ffq.a(),
      ($$0x, $$1x) -> $$1x ? wu.c("options.accessibility.text_background.chat") : wu.c("options.accessibility.text_background.everywhere"),
      ffq.a,
      true,
      $$0x -> {
      }
   );
   private final ffq<Boolean> bA = ffq.a("options.touchscreen", false);
   private final ffq<Boolean> bB = ffq.a("options.fullscreen", false, $$0x -> {
      ffn $$1x = ffn.Q();
      if ($$1x.aO() != null && $$1x.aO().j() != $$0x) {
         $$1x.aO().h();
         this.aa().a($$1x.aO().j());
      }
   });
   private final ffq<Boolean> bC = ffq.a("options.viewBobbing", true);
   private static final wu bD = wu.c("options.key.toggle");
   private static final wu bE = wu.c("options.key.hold");
   private final ffq<Boolean> bF = new ffq<>("key.sneak", ffq.a(), ($$0x, $$1x) -> $$1x ? bD : bE, ffq.a, false, $$0x -> {
   });
   private final ffq<Boolean> bG = new ffq<>("key.sprint", ffq.a(), ($$0x, $$1x) -> $$1x ? bD : bE, ffq.a, false, $$0x -> {
   });
   public boolean v;
   private static final wu bH = wu.c("options.hideMatchedNames.tooltip");
   private final ffq<Boolean> bI = ffq.a("options.hideMatchedNames", ffq.a(bH), true);
   private final ffq<Boolean> bJ = ffq.a("options.autosaveIndicator", true);
   private static final wu bK = wu.c("options.onlyShowSecureChat.tooltip");
   private final ffq<Boolean> bL = ffq.a("options.onlyShowSecureChat", ffq.a(bK), false);
   public final ffl w = new ffl("key.forward", 87, "key.categories.movement");
   public final ffl x = new ffl("key.left", 65, "key.categories.movement");
   public final ffl y = new ffl("key.back", 83, "key.categories.movement");
   public final ffl z = new ffl("key.right", 68, "key.categories.movement");
   public final ffl A = new ffl("key.jump", 32, "key.categories.movement");
   public final ffl B = new fga("key.sneak", 340, "key.categories.movement", this.bF::c);
   public final ffl C = new fga("key.sprint", 341, "key.categories.movement", this.bG::c);
   public final ffl D = new ffl("key.inventory", 69, "key.categories.inventory");
   public final ffl E = new ffl("key.swapOffhand", 70, "key.categories.inventory");
   public final ffl F = new ffl("key.drop", 81, "key.categories.inventory");
   public final ffl G = new ffl("key.use", ezb.b.c, 1, "key.categories.gameplay");
   public final ffl H = new ffl("key.attack", ezb.b.c, 0, "key.categories.gameplay");
   public final ffl I = new ffl("key.pickItem", ezb.b.c, 2, "key.categories.gameplay");
   public final ffl J = new ffl("key.chat", 84, "key.categories.multiplayer");
   public final ffl K = new ffl("key.playerlist", 258, "key.categories.multiplayer");
   public final ffl L = new ffl("key.command", 47, "key.categories.multiplayer");
   public final ffl M = new ffl("key.socialInteractions", 80, "key.categories.multiplayer");
   public final ffl N = new ffl("key.screenshot", 291, "key.categories.misc");
   public final ffl O = new ffl("key.togglePerspective", 294, "key.categories.misc");
   public final ffl P = new ffl("key.smoothCamera", ezb.bv.b(), "key.categories.misc");
   public final ffl Q = new ffl("key.fullscreen", 300, "key.categories.misc");
   public final ffl R = new ffl("key.spectatorOutlines", ezb.bv.b(), "key.categories.misc");
   public final ffl S = new ffl("key.advancements", 76, "key.categories.misc");
   public final ffl[] T = new ffl[]{
      new ffl("key.hotbar.1", 49, "key.categories.inventory"),
      new ffl("key.hotbar.2", 50, "key.categories.inventory"),
      new ffl("key.hotbar.3", 51, "key.categories.inventory"),
      new ffl("key.hotbar.4", 52, "key.categories.inventory"),
      new ffl("key.hotbar.5", 53, "key.categories.inventory"),
      new ffl("key.hotbar.6", 54, "key.categories.inventory"),
      new ffl("key.hotbar.7", 55, "key.categories.inventory"),
      new ffl("key.hotbar.8", 56, "key.categories.inventory"),
      new ffl("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final ffl U = new ffl("key.saveToolbarActivator", 67, "key.categories.creative");
   public final ffl V = new ffl("key.loadToolbarActivator", 88, "key.categories.creative");
   public final ffl[] W = (ffl[])ArrayUtils.addAll(
      new ffl[]{
         this.H,
         this.G,
         this.w,
         this.x,
         this.y,
         this.z,
         this.A,
         this.B,
         this.C,
         this.F,
         this.D,
         this.J,
         this.K,
         this.I,
         this.L,
         this.M,
         this.N,
         this.O,
         this.P,
         this.Q,
         this.R,
         this.E,
         this.U,
         this.V,
         this.S
      },
      this.T
   );
   protected ffn X;
   private final File bM;
   public boolean Y;
   private fez bN = fez.a;
   public String Z = "";
   public boolean aa;
   private final ffq<Integer> bO = new ffq<>("options.fov", ffq.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wu.c("options.fov.min"));
         case 110 -> a($$0x, wu.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new ffq.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> ffn.Q().f.r());
   private static final wu bP = wu.a("options.telemetry.button.tooltip", wu.c("options.telemetry.state.minimal"), wu.c("options.telemetry.state.all"));
   private final ffq<Boolean> bQ = ffq.a("options.telemetry.button", ffq.a(bP), ($$0x, $$1x) -> {
      ffn $$2x = ffn.Q();
      if (!$$2x.E()) {
         return wu.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wu.c("options.telemetry.state.all") : wu.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wu bR = wu.c("options.screenEffectScale.tooltip");
   private final ffq<Double> bS = new ffq<>("options.screenEffectScale", ffq.a(bR), ffr::b, ffq.m.a, 1.0, $$0x -> {
   });
   private static final wu bT = wu.c("options.fovEffectScale.tooltip");
   private final ffq<Double> bU = new ffq<>(
      "options.fovEffectScale", ffq.a(bT), ffr::b, ffq.m.a.a(aye::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final wu bV = wu.c("options.darknessEffectScale.tooltip");
   private final ffq<Double> bW = new ffq<>("options.darknessEffectScale", ffq.a(bV), ffr::b, ffq.m.a.a(aye::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final wu bX = wu.c("options.glintSpeed.tooltip");
   private final ffq<Double> bY = new ffq<>("options.glintSpeed", ffq.a(bX), ffr::b, ffq.m.a, 0.5, $$0x -> {
   });
   private static final wu bZ = wu.c("options.glintStrength.tooltip");
   private final ffq<Double> ca = new ffq<>("options.glintStrength", ffq.a(bZ), ffr::b, ffq.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final wu cb = wu.c("options.damageTiltStrength.tooltip");
   private final ffq<Double> cc = new ffq<>("options.damageTiltStrength", ffq.a(cb), ffr::b, ffq.m.a, 1.0, $$0x -> {
   });
   private final ffq<Double> cd = new ffq<>("options.gamma", ffq.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wu.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wu.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wu.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, ffq.m.a, 0.5, $$0x -> {
   });
   public static final int ab = 0;
   private static final int ce = 2147483646;
   private final ffq<Integer> cf = new ffq<>(
      "options.guiScale", ffq.a(), ($$0x, $$1x) -> $$1x == 0 ? wu.c("options.guiScale.auto") : wu.b(Integer.toString($$1x)), new ffq.c(0, () -> {
         ffn $$0x = ffn.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.X.a()
   );
   private final ffq<ffs> cg = new ffq<>(
      "options.particles", ffq.a(), ffq.b(), new ffq.e<>(Arrays.asList(ffs.values()), Codec.INT.xmap(ffs::a, ffs::a)), ffs.a, $$0x -> {
      }
   );
   private final ffq<ffp> ch = new ffq<>(
      "options.narrator",
      ffq.a(),
      ($$0x, $$1x) -> (wu)(this.X.aX().a() ? $$1x.b() : wu.c("options.narrator.notavailable")),
      new ffq.e<>(Arrays.asList(ffp.values()), Codec.INT.xmap(ffp::a, ffp::a)),
      ffp.a,
      $$0x -> this.X.aX().a($$0x)
   );
   public String ac = "en_us";
   private final ffq<String> ci = new ffq<>(
      "options.audioDevice",
      ffq.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wu.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wu.b($$1x.substring(gty.c)) : wu.b($$1x);
         }
      },
      new ffq.h<>(
         () -> Stream.concat(Stream.of(""), ffn.Q().aj().a().stream()).toList(),
         $$0x -> ffn.Q().r() && $$0x != "" && !ffn.Q().aj().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gub $$1x = ffn.Q().aj();
         $$1x.k();
         $$1x.a(gsr.a(avf.Ar, 1.0F));
      }
   );
   public boolean ad = true;
   public boolean ae;

   public ffq<Boolean> a() {
      return this.ak;
   }

   public ffq<Boolean> b() {
      return this.am;
   }

   public ffq<Boolean> c() {
      return this.ao;
   }

   public ffq<Double> d() {
      return this.ap;
   }

   public ffq<Integer> e() {
      return this.aq;
   }

   public ffq<Integer> f() {
      return this.ar;
   }

   public ffq<Double> g() {
      return this.at;
   }

   public ffq<Integer> h() {
      return this.au;
   }

   public ffq<ffb> i() {
      return this.av;
   }

   public ffq<ffg> j() {
      return this.az;
   }

   public ffq<Boolean> k() {
      return this.aA;
   }

   public ffq<ffu> l() {
      return this.aE;
   }

   public void a(atf $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (atc $$2 : $$0.f()) {
         if (!$$2.j()) {
            this.i.add($$2.g());
            if (!$$2.d().a()) {
               this.j.add($$2.g());
            }
         }
      }

      this.av();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.X.l();
      }
   }

   public ffq<cmf> m() {
      return this.aF;
   }

   public ffq<Double> n() {
      return this.aG;
   }

   public ffq<Double> o() {
      return this.aH;
   }

   public ffq<Double> p() {
      return this.aK;
   }

   public double q() {
      return this.p().c();
   }

   public ffq<Double> r() {
      return this.aL;
   }

   public ffq<Double> s() {
      return this.aM;
   }

   public ffq<Boolean> t() {
      return this.aO;
   }

   public ffq<Boolean> u() {
      return this.aP;
   }

   public ffq<bss> v() {
      return this.aR;
   }

   public ffq<Double> w() {
      return this.aS;
   }

   public ffq<Double> x() {
      return this.aT;
   }

   public ffq<Double> y() {
      return this.aU;
   }

   public ffq<Double> z() {
      return this.aV;
   }

   public ffq<Double> A() {
      return this.aW;
   }

   public ffq<Double> B() {
      return this.aY;
   }

   public ffq<Integer> C() {
      return this.aZ;
   }

   public ffq<fex> D() {
      return this.ba;
   }

   public ffq<Integer> E() {
      return this.bb;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return aye.a(Math.log10($$0) * 100.0);
   }

   public ffq<Double> F() {
      return this.bc;
   }

   public ffq<Boolean> G() {
      return this.bd;
   }

   public ffq<Boolean> H() {
      return this.be;
   }

   public ffq<Boolean> I() {
      return this.bf;
   }

   public ffq<Boolean> J() {
      return this.bg;
   }

   public ffq<Boolean> K() {
      return this.bh;
   }

   public ffq<Boolean> L() {
      return this.bi;
   }

   public ffq<Boolean> M() {
      return this.bj;
   }

   public ffq<Boolean> N() {
      return this.bk;
   }

   public ffq<Boolean> O() {
      return this.bl;
   }

   private static void aE() {
      ffn $$0 = ffn.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public ffq<Boolean> P() {
      return this.bm;
   }

   private static boolean aF() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public ffq<Boolean> Q() {
      return this.bn;
   }

   public ffq<Boolean> R() {
      return this.bo;
   }

   public ffq<Boolean> S() {
      return this.bp;
   }

   public ffq<Boolean> T() {
      return this.bq;
   }

   public ffq<Boolean> U() {
      return this.bs;
   }

   public ffq<Boolean> V() {
      return this.bt;
   }

   public final float a(avg $$0) {
      return this.b($$0).c().floatValue();
   }

   public final ffq<Double> b(avg $$0) {
      return Objects.requireNonNull(this.bu.get($$0));
   }

   private ffq<Double> a(String $$0, avg $$1) {
      return new ffq<>($$0, ffq.a(), ffr::b, ffq.m.a, 1.0, $$1x -> ffn.Q().aj().a($$1, $$1x.floatValue()));
   }

   public ffq<Boolean> W() {
      return this.bv;
   }

   public ffq<Boolean> X() {
      return this.by;
   }

   public ffq<Boolean> Y() {
      return this.bz;
   }

   public ffq<Boolean> Z() {
      return this.bA;
   }

   public ffq<Boolean> aa() {
      return this.bB;
   }

   public ffq<Boolean> ab() {
      return this.bC;
   }

   public ffq<Boolean> ac() {
      return this.bF;
   }

   public ffq<Boolean> ad() {
      return this.bG;
   }

   public ffq<Boolean> ae() {
      return this.bI;
   }

   public ffq<Boolean> af() {
      return this.bJ;
   }

   public ffq<Boolean> ag() {
      return this.bL;
   }

   public ffq<Integer> ah() {
      return this.bO;
   }

   public ffq<Boolean> ai() {
      return this.bQ;
   }

   public ffq<Double> aj() {
      return this.bS;
   }

   public ffq<Double> ak() {
      return this.bU;
   }

   public ffq<Double> al() {
      return this.bW;
   }

   public ffq<Double> am() {
      return this.bY;
   }

   public ffq<Double> an() {
      return this.ca;
   }

   public ffq<Double> ao() {
      return this.cc;
   }

   public ffq<Double> ap() {
      return this.cd;
   }

   public ffq<Integer> aq() {
      return this.cf;
   }

   public ffq<ffs> ar() {
      return this.cg;
   }

   public ffq<ffp> as() {
      return this.ch;
   }

   public ffq<String> at() {
      return this.ci;
   }

   public ffr(ffn $$0, File $$1) {
      this.X = $$0;
      this.bM = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new ffq<>(
         "options.renderDistance",
         ffq.a(),
         ($$0x, $$1x) -> a($$0x, wu.a("options.chunks", $$1x)),
         new ffq.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> ffn.Q().f.r()
      );
      this.ar = new ffq<>(
         "options.simulationDistance", ffq.a(), ($$0x, $$1x) -> a($$0x, wu.a("options.chunks", $$1x)), new ffq.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ae = ac.k() == ac.a.c;
      this.au();
   }

   public float a(float $$0) {
      return this.bz.c() ? $$0 : this.r().c().floatValue();
   }

   public int b(float $$0) {
      return (int)(this.a($$0) * 255.0F) << 24 & 0xFF000000;
   }

   public int a(int $$0) {
      return this.bz.c() ? $$0 : (int)(this.aL.c() * 255.0) << 24 & 0xFF000000;
   }

   public void a(ffl $$0, ezb.a $$1) {
      $$0.b($$1);
      this.av();
   }

   private void a(ffr.b $$0) {
      $$0.a("ao", this.aA);
      $$0.a("biomeBlendRadius", this.bb);
      $$0.a("enableVsync", this.bk);
      $$0.a("entityDistanceScaling", this.at);
      $$0.a("entityShadows", this.bl);
      $$0.a("forceUnicodeFont", this.bm);
      $$0.a("japaneseGlyphVariants", this.bn);
      $$0.a("fov", this.bO);
      $$0.a("fovEffectScale", this.bU);
      $$0.a("darknessEffectScale", this.bW);
      $$0.a("glintSpeed", this.bY);
      $$0.a("glintStrength", this.ca);
      $$0.a("prioritizeChunkUpdates", this.aE);
      $$0.a("fullscreen", this.bB);
      $$0.a("gamma", this.cd);
      $$0.a("graphicsMode", this.az);
      $$0.a("guiScale", this.cf);
      $$0.a("maxFps", this.au);
      $$0.a("mipmapLevels", this.aZ);
      $$0.a("narrator", this.ch);
      $$0.a("particles", this.cg);
      $$0.a("reducedDebugInfo", this.bt);
      $$0.a("renderClouds", this.av);
      $$0.a("renderDistance", this.aq);
      $$0.a("simulationDistance", this.ar);
      $$0.a("screenEffectScale", this.bS);
      $$0.a("soundDevice", this.ci);
   }

   private void a(ffr.a $$0) {
      this.a((ffr.b)$$0);
      $$0.a("autoJump", this.be);
      $$0.a("operatorItemsTab", this.bf);
      $$0.a("autoSuggestions", this.bg);
      $$0.a("chatColors", this.bh);
      $$0.a("chatLinks", this.bi);
      $$0.a("chatLinksPrompt", this.bj);
      $$0.a("discrete_mouse_scroll", this.bp);
      $$0.a("invertYMouse", this.bo);
      $$0.a("realmsNotifications", this.bq);
      $$0.a("showSubtitles", this.bv);
      $$0.a("directionalAudio", this.by);
      $$0.a("touchscreen", this.bA);
      $$0.a("bobView", this.bC);
      $$0.a("toggleCrouch", this.bF);
      $$0.a("toggleSprint", this.bG);
      $$0.a("darkMojangStudiosBackground", this.ak);
      $$0.a("hideLightningFlashes", this.am);
      $$0.a("hideSplashTexts", this.ao);
      $$0.a("mouseSensitivity", this.ap);
      $$0.a("damageTiltStrength", this.cc);
      $$0.a("highContrast", this.aO);
      $$0.a("narratorHotkey", this.aP);
      this.i = $$0.a("resourcePacks", this.i, ffr::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, ffr::c, ag::toJson);
      this.Z = $$0.a("lastServer", this.Z);
      this.ac = $$0.a("lang", this.ac);
      $$0.a("chatVisibility", this.aF);
      $$0.a("chatOpacity", this.aG);
      $$0.a("chatLineSpacing", this.aH);
      $$0.a("textBackgroundOpacity", this.aL);
      $$0.a("backgroundForChatOnly", this.bz);
      this.l = $$0.a("hideServerAddress", this.l);
      this.m = $$0.a("advancedItemTooltips", this.m);
      this.n = $$0.a("pauseOnLostFocus", this.n);
      this.o = $$0.a("overrideWidth", this.o);
      this.p = $$0.a("overrideHeight", this.p);
      $$0.a("chatHeightFocused", this.aV);
      $$0.a("chatDelay", this.aW);
      $$0.a("chatHeightUnfocused", this.aU);
      $$0.a("chatScale", this.aS);
      $$0.a("chatWidth", this.aT);
      $$0.a("notificationDisplayTime", this.aY);
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aR);
      $$0.a("attackIndicator", this.ba);
      this.r = $$0.a("tutorialStep", this.r, gvg::a, gvg::a);
      $$0.a("mouseWheelSensitivity", this.bc);
      $$0.a("rawMouseInput", this.bd);
      this.u = $$0.a("glDebugVerbosity", this.u);
      this.v = $$0.a("skipMultiplayerWarning", this.v);
      $$0.a("hideMatchedNames", this.bI);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.t = $$0.a("hideBundleTutorial", this.t);
      this.ae = $$0.a("syncChunkWrites", this.ae);
      $$0.a("showAutosaveIndicator", this.bJ);
      $$0.a("allowServerListing", this.bs);
      $$0.a("onlyShowSecureChat", this.bL);
      $$0.a("panoramaScrollSpeed", this.aM);
      $$0.a("telemetryOptInExtra", this.bQ);
      this.ad = $$0.a("onboardAccessibility", this.ad);
      $$0.a("menuBackgroundBlurriness", this.aK);

      for (ffl $$1 : this.W) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(ezb.a($$3));
         }
      }

      for (avg $$4 : avg.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bu.get($$4));
      }

      for (cmi $$5 : cmi.values()) {
         boolean $$6 = this.aQ.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.b($$5, $$7);
         }
      }
   }

   public void au() {
      try {
         if (!this.bM.exists()) {
            return;
         }

         tx $$0 = new tx();

         try (BufferedReader $$1 = Files.newReader(this.bM, Charsets.UTF_8)) {
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
               this.az.a(ffg.b);
            } else {
               this.az.a(ffg.a);
            }
         }

         this.a(new ffr.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, ffq<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> ffr.af.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     ffr.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? ffr.a($$2) : $$1;
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
               } else if (ffr.a($$2)) {
                  return 1.0F;
               } else if (ffr.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     ffr.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         if (this.X.aO() != null) {
            this.X.aO().a(this.au.c());
         }

         ffl.d();
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

      return azl.e.a(this.X.as(), $$0, $$1);
   }

   public void av() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bM), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new ffr.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, ffq<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> ffr.af.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(ffr.ag.toJson($$2));
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
         if (this.X.aO().f().isPresent()) {
            $$0.println("fullscreenResolution:" + this.X.aO().f().get().g());
         }
      } catch (Exception var6) {
         af.error("Failed to save options", var6);
      }

      this.ax();
   }

   public apz aw() {
      int $$0 = 0;

      for (cmi $$1 : this.aQ) {
         $$0 |= $$1.a();
      }

      return new apz(this.ac, this.aq.c(), this.aF.c(), this.bh.c(), $$0, this.aR.c(), this.X.aS(), this.bs.c());
   }

   public void ax() {
      if (this.X.s != null) {
         this.X.s.cB.b(new zt(this.aw()));
      }
   }

   private void b(cmi $$0, boolean $$1) {
      if ($$1) {
         this.aQ.add($$0);
      } else {
         this.aQ.remove($$0);
      }
   }

   public boolean a(cmi $$0) {
      return this.aQ.contains($$0);
   }

   public void a(cmi $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ax();
   }

   public ffb ay() {
      return this.aD() >= 4 ? this.av.c() : ffb.a;
   }

   public boolean az() {
      return this.q;
   }

   public void b(atf $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         atc $$4 = $$0.c($$3);
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

   public fez aA() {
      return this.bN;
   }

   public void a(fez $$0) {
      this.bN = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = axu.a(ag, $$0, ah);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aB() {
      return this.bM;
   }

   public String aC() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new ffr.b() {
         @Override
         public <T> void a(String $$0x, ffq<T> $$1) {
            $$0.add(Pair.of($$0, $$1.c()));
         }
      });
      $$0.add(Pair.of("fullscreenResolution", String.valueOf(this.k)));
      $$0.add(Pair.of("glDebugVerbosity", this.u));
      $$0.add(Pair.of("overrideHeight", this.p));
      $$0.add(Pair.of("overrideWidth", this.o));
      $$0.add(Pair.of("syncChunkWrites", this.ae));
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

   public int aD() {
      return this.as > 0 ? Math.min(this.aq.c(), this.as) : this.aq.c();
   }

   private static wu b(wu $$0, int $$1) {
      return wu.a("options.pixel_value", $$0, $$1);
   }

   private static wu a(wu $$0, double $$1) {
      return wu.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static wu a(wu $$0, wu $$1) {
      return wu.a("options.generic_value", $$0, $$1);
   }

   private static wu b(wu $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, wt.c) : a($$0, $$1);
   }

   public static wu a(wu $$0, int $$1) {
      return a($$0, wu.b(Integer.toString($$1)));
   }

   interface a extends ffr.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, ffq<T> var2);
   }
}
