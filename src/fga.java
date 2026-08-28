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

public class fga {
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
   private final ffz<Boolean> ak = ffz.a("options.darkMojangStudiosBackgroundColor", ffz.a(aj), false);
   private static final wu al = wu.c("options.hideLightningFlashes.tooltip");
   private final ffz<Boolean> am = ffz.a("options.hideLightningFlashes", ffz.a(al), false);
   private static final wu an = wu.c("options.hideSplashTexts.tooltip");
   private final ffz<Boolean> ao = ffz.a("options.hideSplashTexts", ffz.a(an), false);
   private final ffz<Double> ap = new ffz<>("options.sensitivity", ffz.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wu.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wu.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, ffz.m.a, 0.5, $$0x -> {
   });
   private final ffz<Integer> aq;
   private final ffz<Integer> ar;
   private int as = 0;
   private final ffz<Double> at = new ffz<>(
      "options.entityDistanceScaling",
      ffz.a(),
      fga::a,
      new ffz.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final ffz<Integer> au = new ffz<>(
      "options.framerateLimit",
      ffz.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wu.c("options.framerateLimit.max")) : a($$0x, wu.a("options.framerate", $$1x)),
      new ffz.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> ffw.Q().aM().a($$0x)
   );
   private final ffz<ffj> av = new ffz<>(
      "options.renderClouds",
      ffz.a(),
      ffz.b(),
      new ffz.e<>(Arrays.asList(ffj.values()), Codec.withAlternative(ffj.d, Codec.BOOL, $$0x -> $$0x ? ffj.c : ffj.a)),
      ffj.c,
      $$0x -> {
         if (ffw.O()) {
            eza $$1x = ffw.Q().f.x();
            if ($$1x != null) {
               $$1x.b(ffw.a);
            }
         }
      }
   );
   private static final wu aw = wu.c("options.graphics.fast.tooltip");
   private static final wu ax = wu.a("options.graphics.fabulous.tooltip", wu.c("options.graphics.fabulous").a(n.u));
   private static final wu ay = wu.c("options.graphics.fancy.tooltip");
   private final ffz<ffp> az = new ffz<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fjf.a(ay);
            case a -> fjf.a(aw);
            case c -> fjf.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         xi $$2x = wu.c($$1x.b());
         return $$1x == ffp.c ? $$2x.a(n.u) : $$2x;
      },
      new ffz.a<>(
         Arrays.asList(ffp.values()),
         Stream.of(ffp.values()).filter($$0x -> $$0x != ffp.c).collect(Collectors.toList()),
         () -> ffw.Q().r() && ffw.Q().ai().h(),
         ($$0x, $$1x) -> {
            ffw $$2x = ffw.Q();
            gdz $$3 = $$2x.ai();
            if ($$1x == ffp.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(ffp::a, ffp::a)
      ),
      ffp.b,
      $$0x -> {
      }
   );
   private final ffz<Boolean> aA = ffz.a("options.ao", true, $$0x -> ffw.Q().f.f());
   private static final wu aB = wu.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wu aC = wu.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wu aD = wu.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final ffz<fgd> aE = new ffz<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fjf.a(aB);
         case b -> fjf.a(aC);
         case c -> fjf.a(aD);
      };
   }, ffz.b(), new ffz.e<>(Arrays.asList(fgd.values()), Codec.INT.xmap(fgd::a, fgd::a)), fgd.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final ffz<cmj> aF = new ffz<>(
      "options.chat.visibility", ffz.a(), ffz.b(), new ffz.e<>(Arrays.asList(cmj.values()), Codec.INT.xmap(cmj::a, cmj::a)), cmj.a, $$0x -> {
      }
   );
   private final ffz<Double> aG = new ffz<>("options.chat.opacity", ffz.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), ffz.m.a, 1.0, $$0x -> ffw.Q().l.d().b());
   private final ffz<Double> aH = new ffz<>("options.chat.line_spacing", ffz.a(), fga::a, ffz.m.a, 0.0, $$0x -> {
   });
   private static final wu aI = wu.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aJ = 5;
   private final ffz<Integer> aK = new ffz<>("options.accessibility.menu_background_blurriness", ffz.a(aI), fga::b, new ffz.f(0, 10), 5, $$0x -> {
   });
   private final ffz<Double> aL = new ffz<>("options.accessibility.text_background_opacity", ffz.a(), fga::a, ffz.m.a, 0.5, $$0x -> ffw.Q().l.d().b());
   private final ffz<Double> aM = new ffz<>("options.accessibility.panorama_speed", ffz.a(), fga::a, ffz.m.a, 1.0, $$0x -> {
   });
   private static final wu aN = wu.c("options.accessibility.high_contrast.tooltip");
   private final ffz<Boolean> aO = ffz.a("options.accessibility.high_contrast", ffz.a(aN), false, $$0x -> {
      ath $$1x = ffw.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final ffz<Boolean> aP = ffz.a(
      "options.accessibility.narrator_hotkey",
      ffz.a(ffw.a ? wu.c("options.accessibility.narrator_hotkey.mac.tooltip") : wu.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cmm> aQ = EnumSet.allOf(cmm.class);
   private final ffz<bsw> aR = new ffz<>("options.mainHand", ffz.a(), ffz.b(), new ffz.e<>(Arrays.asList(bsw.values()), bsw.c), bsw.b, $$0x -> this.ax());
   public int o;
   public int p;
   private final ffz<Double> aS = new ffz<>(
      "options.chat.scale",
      ffz.a(),
      ($$0x, $$1x) -> (wu)($$1x == 0.0 ? wt.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      ffz.m.a,
      1.0,
      $$0x -> ffw.Q().l.d().b()
   );
   private final ffz<Double> aT = new ffz<>("options.chat.width", ffz.a(), ($$0x, $$1x) -> c($$0x, fhv.a($$1x)), ffz.m.a, 1.0, $$0x -> ffw.Q().l.d().b());
   private final ffz<Double> aU = new ffz<>(
      "options.chat.height.unfocused", ffz.a(), ($$0x, $$1x) -> c($$0x, fhv.b($$1x)), ffz.m.a, fhv.i(), $$0x -> ffw.Q().l.d().b()
   );
   private final ffz<Double> aV = new ffz<>(
      "options.chat.height.focused", ffz.a(), ($$0x, $$1x) -> c($$0x, fhv.b($$1x)), ffz.m.a, 1.0, $$0x -> ffw.Q().l.d().b()
   );
   private final ffz<Double> aW = new ffz<>(
      "options.chat.delay_instant",
      ffz.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wu.c("options.chat.delay_none") : wu.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new ffz.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> ffw.Q().aW().a($$0x)
   );
   private static final wu aX = wu.c("options.notifications.display_time.tooltip");
   private final ffz<Double> aY = new ffz<>(
      "options.notifications.display_time",
      ffz.a(aX),
      ($$0x, $$1x) -> a($$0x, wu.a("options.multiplier", $$1x)),
      new ffz.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final ffz<Integer> aZ = new ffz<>(
      "options.mipmapLevels", ffz.a(), ($$0x, $$1x) -> (wu)($$1x == 0 ? wt.a($$0x, false) : a($$0x, $$1x.intValue())), new ffz.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final ffz<fff> ba = new ffz<>(
      "options.attackIndicator", ffz.a(), ffz.b(), new ffz.e<>(Arrays.asList(fff.values()), Codec.INT.xmap(fff::a, fff::a)), fff.b, $$0x -> {
      }
   );
   public gvo r = gvo.a;
   public boolean s = false;
   public boolean t = false;
   private final ffz<Integer> bb = new ffz<>("options.biomeBlendRadius", ffz.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wu.c("options.biomeBlendRadius." + $$2x));
   }, new ffz.f(0, 7, false), 2, $$0x -> ffw.Q().f.f());
   private final ffz<Double> bc = new ffz<>(
      "options.mouseWheelSensitivity",
      ffz.a(),
      ($$0x, $$1x) -> a($$0x, wu.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new ffz.f(-200, 100).a(fga::c, fga::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final ffz<Boolean> bd = ffz.a("options.rawMouseInput", true, $$0x -> {
      ezs $$1x = ffw.Q().aM();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final ffz<Boolean> be = ffz.a("options.autoJump", false);
   private final ffz<Boolean> bf = ffz.a("options.operatorItemsTab", false);
   private final ffz<Boolean> bg = ffz.a("options.autoSuggestCommands", true);
   private final ffz<Boolean> bh = ffz.a("options.chat.color", true);
   private final ffz<Boolean> bi = ffz.a("options.chat.links", true);
   private final ffz<Boolean> bj = ffz.a("options.chat.links.prompt", true);
   private final ffz<Boolean> bk = ffz.a("options.vsync", true, $$0x -> {
      if (ffw.Q().aM() != null) {
         ffw.Q().aM().a($$0x);
      }
   });
   private final ffz<Boolean> bl = ffz.a("options.entityShadows", true);
   private final ffz<Boolean> bm = ffz.a("options.forceUnicodeFont", false, $$0x -> aE());
   private final ffz<Boolean> bn = ffz.a("options.japaneseGlyphVariants", ffz.a(wu.c("options.japaneseGlyphVariants.tooltip")), aF(), $$0x -> aE());
   private final ffz<Boolean> bo = ffz.a("options.invertMouse", false);
   private final ffz<Boolean> bp = ffz.a("options.discrete_mouse_scroll", false);
   private final ffz<Boolean> bq = ffz.a("options.realmsNotifications", true);
   private static final wu br = wu.c("options.allowServerListing.tooltip");
   private final ffz<Boolean> bs = ffz.a("options.allowServerListing", ffz.a(br), true, $$0x -> this.ax());
   private final ffz<Boolean> bt = ffz.a("options.reducedDebugInfo", false);
   private final Map<avi, ffz<Double>> bu = ac.a(new EnumMap<>(avi.class), $$0x -> {
      for (avi $$1x : avi.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final ffz<Boolean> bv = ffz.a("options.showSubtitles", false);
   private static final wu bw = wu.c("options.directionalAudio.on.tooltip");
   private static final wu bx = wu.c("options.directionalAudio.off.tooltip");
   private final ffz<Boolean> by = ffz.a("options.directionalAudio", $$0x -> $$0x ? fjf.a(bw) : fjf.a(bx), false, $$0x -> {
      guj $$1x = ffw.Q().aj();
      $$1x.k();
      $$1x.a(gsz.a(avh.Ar, 1.0F));
   });
   private final ffz<Boolean> bz = new ffz<>(
      "options.accessibility.text_background",
      ffz.a(),
      ($$0x, $$1x) -> $$1x ? wu.c("options.accessibility.text_background.chat") : wu.c("options.accessibility.text_background.everywhere"),
      ffz.a,
      true,
      $$0x -> {
      }
   );
   private final ffz<Boolean> bA = ffz.a("options.touchscreen", false);
   private final ffz<Boolean> bB = ffz.a("options.fullscreen", false, $$0x -> {
      ffw $$1x = ffw.Q();
      if ($$1x.aM() != null && $$1x.aM().j() != $$0x) {
         $$1x.aM().h();
         this.aa().a($$1x.aM().j());
      }
   });
   private final ffz<Boolean> bC = ffz.a("options.viewBobbing", true);
   private static final wu bD = wu.c("options.key.toggle");
   private static final wu bE = wu.c("options.key.hold");
   private final ffz<Boolean> bF = new ffz<>("key.sneak", ffz.a(), ($$0x, $$1x) -> $$1x ? bD : bE, ffz.a, false, $$0x -> {
   });
   private final ffz<Boolean> bG = new ffz<>("key.sprint", ffz.a(), ($$0x, $$1x) -> $$1x ? bD : bE, ffz.a, false, $$0x -> {
   });
   public boolean v;
   private static final wu bH = wu.c("options.hideMatchedNames.tooltip");
   private final ffz<Boolean> bI = ffz.a("options.hideMatchedNames", ffz.a(bH), true);
   private final ffz<Boolean> bJ = ffz.a("options.autosaveIndicator", true);
   private static final wu bK = wu.c("options.onlyShowSecureChat.tooltip");
   private final ffz<Boolean> bL = ffz.a("options.onlyShowSecureChat", ffz.a(bK), false);
   public final ffu w = new ffu("key.forward", 87, "key.categories.movement");
   public final ffu x = new ffu("key.left", 65, "key.categories.movement");
   public final ffu y = new ffu("key.back", 83, "key.categories.movement");
   public final ffu z = new ffu("key.right", 68, "key.categories.movement");
   public final ffu A = new ffu("key.jump", 32, "key.categories.movement");
   public final ffu B = new fgi("key.sneak", 340, "key.categories.movement", this.bF::c);
   public final ffu C = new fgi("key.sprint", 341, "key.categories.movement", this.bG::c);
   public final ffu D = new ffu("key.inventory", 69, "key.categories.inventory");
   public final ffu E = new ffu("key.swapOffhand", 70, "key.categories.inventory");
   public final ffu F = new ffu("key.drop", 81, "key.categories.inventory");
   public final ffu G = new ffu("key.use", ezj.b.c, 1, "key.categories.gameplay");
   public final ffu H = new ffu("key.attack", ezj.b.c, 0, "key.categories.gameplay");
   public final ffu I = new ffu("key.pickItem", ezj.b.c, 2, "key.categories.gameplay");
   public final ffu J = new ffu("key.chat", 84, "key.categories.multiplayer");
   public final ffu K = new ffu("key.playerlist", 258, "key.categories.multiplayer");
   public final ffu L = new ffu("key.command", 47, "key.categories.multiplayer");
   public final ffu M = new ffu("key.socialInteractions", 80, "key.categories.multiplayer");
   public final ffu N = new ffu("key.screenshot", 291, "key.categories.misc");
   public final ffu O = new ffu("key.togglePerspective", 294, "key.categories.misc");
   public final ffu P = new ffu("key.smoothCamera", ezj.bv.b(), "key.categories.misc");
   public final ffu Q = new ffu("key.fullscreen", 300, "key.categories.misc");
   public final ffu R = new ffu("key.spectatorOutlines", ezj.bv.b(), "key.categories.misc");
   public final ffu S = new ffu("key.advancements", 76, "key.categories.misc");
   public final ffu[] T = new ffu[]{
      new ffu("key.hotbar.1", 49, "key.categories.inventory"),
      new ffu("key.hotbar.2", 50, "key.categories.inventory"),
      new ffu("key.hotbar.3", 51, "key.categories.inventory"),
      new ffu("key.hotbar.4", 52, "key.categories.inventory"),
      new ffu("key.hotbar.5", 53, "key.categories.inventory"),
      new ffu("key.hotbar.6", 54, "key.categories.inventory"),
      new ffu("key.hotbar.7", 55, "key.categories.inventory"),
      new ffu("key.hotbar.8", 56, "key.categories.inventory"),
      new ffu("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final ffu U = new ffu("key.saveToolbarActivator", 67, "key.categories.creative");
   public final ffu V = new ffu("key.loadToolbarActivator", 88, "key.categories.creative");
   public final ffu[] W = (ffu[])ArrayUtils.addAll(
      new ffu[]{
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
   protected ffw X;
   private final File bM;
   public boolean Y;
   private ffh bN = ffh.a;
   public String Z = "";
   public boolean aa;
   private final ffz<Integer> bO = new ffz<>("options.fov", ffz.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wu.c("options.fov.min"));
         case 110 -> a($$0x, wu.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new ffz.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> ffw.Q().f.r());
   private static final wu bP = wu.a("options.telemetry.button.tooltip", wu.c("options.telemetry.state.minimal"), wu.c("options.telemetry.state.all"));
   private final ffz<Boolean> bQ = ffz.a("options.telemetry.button", ffz.a(bP), ($$0x, $$1x) -> {
      ffw $$2x = ffw.Q();
      if (!$$2x.E()) {
         return wu.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wu.c("options.telemetry.state.all") : wu.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wu bR = wu.c("options.screenEffectScale.tooltip");
   private final ffz<Double> bS = new ffz<>("options.screenEffectScale", ffz.a(bR), fga::b, ffz.m.a, 1.0, $$0x -> {
   });
   private static final wu bT = wu.c("options.fovEffectScale.tooltip");
   private final ffz<Double> bU = new ffz<>(
      "options.fovEffectScale", ffz.a(bT), fga::b, ffz.m.a.a(ayg::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final wu bV = wu.c("options.darknessEffectScale.tooltip");
   private final ffz<Double> bW = new ffz<>("options.darknessEffectScale", ffz.a(bV), fga::b, ffz.m.a.a(ayg::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final wu bX = wu.c("options.glintSpeed.tooltip");
   private final ffz<Double> bY = new ffz<>("options.glintSpeed", ffz.a(bX), fga::b, ffz.m.a, 0.5, $$0x -> {
   });
   private static final wu bZ = wu.c("options.glintStrength.tooltip");
   private final ffz<Double> ca = new ffz<>("options.glintStrength", ffz.a(bZ), fga::b, ffz.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final wu cb = wu.c("options.damageTiltStrength.tooltip");
   private final ffz<Double> cc = new ffz<>("options.damageTiltStrength", ffz.a(cb), fga::b, ffz.m.a, 1.0, $$0x -> {
   });
   private final ffz<Double> cd = new ffz<>("options.gamma", ffz.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wu.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wu.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wu.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, ffz.m.a, 0.5, $$0x -> {
   });
   public static final int ab = 0;
   private static final int ce = 2147483646;
   private final ffz<Integer> cf = new ffz<>(
      "options.guiScale", ffz.a(), ($$0x, $$1x) -> $$1x == 0 ? wu.c("options.guiScale.auto") : wu.b(Integer.toString($$1x)), new ffz.c(0, () -> {
         ffw $$0x = ffw.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aM().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.X.a()
   );
   private final ffz<fgb> cg = new ffz<>(
      "options.particles", ffz.a(), ffz.b(), new ffz.e<>(Arrays.asList(fgb.values()), Codec.INT.xmap(fgb::a, fgb::a)), fgb.a, $$0x -> {
      }
   );
   private final ffz<ffy> ch = new ffz<>(
      "options.narrator",
      ffz.a(),
      ($$0x, $$1x) -> (wu)(this.X.aV().a() ? $$1x.b() : wu.c("options.narrator.notavailable")),
      new ffz.e<>(Arrays.asList(ffy.values()), Codec.INT.xmap(ffy::a, ffy::a)),
      ffy.a,
      $$0x -> this.X.aV().a($$0x)
   );
   public String ac = "en_us";
   private final ffz<String> ci = new ffz<>(
      "options.audioDevice",
      ffz.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wu.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wu.b($$1x.substring(gug.c)) : wu.b($$1x);
         }
      },
      new ffz.h<>(
         () -> Stream.concat(Stream.of(""), ffw.Q().aj().a().stream()).toList(),
         $$0x -> ffw.Q().r() && $$0x != "" && !ffw.Q().aj().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         guj $$1x = ffw.Q().aj();
         $$1x.k();
         $$1x.a(gsz.a(avh.Ar, 1.0F));
      }
   );
   public boolean ad = true;
   public boolean ae;

   public ffz<Boolean> a() {
      return this.ak;
   }

   public ffz<Boolean> b() {
      return this.am;
   }

   public ffz<Boolean> c() {
      return this.ao;
   }

   public ffz<Double> d() {
      return this.ap;
   }

   public ffz<Integer> e() {
      return this.aq;
   }

   public ffz<Integer> f() {
      return this.ar;
   }

   public ffz<Double> g() {
      return this.at;
   }

   public ffz<Integer> h() {
      return this.au;
   }

   public ffz<ffj> i() {
      return this.av;
   }

   public ffz<ffp> j() {
      return this.az;
   }

   public ffz<Boolean> k() {
      return this.aA;
   }

   public ffz<fgd> l() {
      return this.aE;
   }

   public void a(ath $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (ate $$2 : $$0.f()) {
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

   public ffz<cmj> m() {
      return this.aF;
   }

   public ffz<Double> n() {
      return this.aG;
   }

   public ffz<Double> o() {
      return this.aH;
   }

   public ffz<Integer> p() {
      return this.aK;
   }

   public int q() {
      return this.p().c();
   }

   public ffz<Double> r() {
      return this.aL;
   }

   public ffz<Double> s() {
      return this.aM;
   }

   public ffz<Boolean> t() {
      return this.aO;
   }

   public ffz<Boolean> u() {
      return this.aP;
   }

   public ffz<bsw> v() {
      return this.aR;
   }

   public ffz<Double> w() {
      return this.aS;
   }

   public ffz<Double> x() {
      return this.aT;
   }

   public ffz<Double> y() {
      return this.aU;
   }

   public ffz<Double> z() {
      return this.aV;
   }

   public ffz<Double> A() {
      return this.aW;
   }

   public ffz<Double> B() {
      return this.aY;
   }

   public ffz<Integer> C() {
      return this.aZ;
   }

   public ffz<fff> D() {
      return this.ba;
   }

   public ffz<Integer> E() {
      return this.bb;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ayg.a(Math.log10($$0) * 100.0);
   }

   public ffz<Double> F() {
      return this.bc;
   }

   public ffz<Boolean> G() {
      return this.bd;
   }

   public ffz<Boolean> H() {
      return this.be;
   }

   public ffz<Boolean> I() {
      return this.bf;
   }

   public ffz<Boolean> J() {
      return this.bg;
   }

   public ffz<Boolean> K() {
      return this.bh;
   }

   public ffz<Boolean> L() {
      return this.bi;
   }

   public ffz<Boolean> M() {
      return this.bj;
   }

   public ffz<Boolean> N() {
      return this.bk;
   }

   public ffz<Boolean> O() {
      return this.bl;
   }

   private static void aE() {
      ffw $$0 = ffw.Q();
      if ($$0.aM() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public ffz<Boolean> P() {
      return this.bm;
   }

   private static boolean aF() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public ffz<Boolean> Q() {
      return this.bn;
   }

   public ffz<Boolean> R() {
      return this.bo;
   }

   public ffz<Boolean> S() {
      return this.bp;
   }

   public ffz<Boolean> T() {
      return this.bq;
   }

   public ffz<Boolean> U() {
      return this.bs;
   }

   public ffz<Boolean> V() {
      return this.bt;
   }

   public final float a(avi $$0) {
      return this.b($$0).c().floatValue();
   }

   public final ffz<Double> b(avi $$0) {
      return Objects.requireNonNull(this.bu.get($$0));
   }

   private ffz<Double> a(String $$0, avi $$1) {
      return new ffz<>($$0, ffz.a(), fga::b, ffz.m.a, 1.0, $$1x -> ffw.Q().aj().a($$1, $$1x.floatValue()));
   }

   public ffz<Boolean> W() {
      return this.bv;
   }

   public ffz<Boolean> X() {
      return this.by;
   }

   public ffz<Boolean> Y() {
      return this.bz;
   }

   public ffz<Boolean> Z() {
      return this.bA;
   }

   public ffz<Boolean> aa() {
      return this.bB;
   }

   public ffz<Boolean> ab() {
      return this.bC;
   }

   public ffz<Boolean> ac() {
      return this.bF;
   }

   public ffz<Boolean> ad() {
      return this.bG;
   }

   public ffz<Boolean> ae() {
      return this.bI;
   }

   public ffz<Boolean> af() {
      return this.bJ;
   }

   public ffz<Boolean> ag() {
      return this.bL;
   }

   public ffz<Integer> ah() {
      return this.bO;
   }

   public ffz<Boolean> ai() {
      return this.bQ;
   }

   public ffz<Double> aj() {
      return this.bS;
   }

   public ffz<Double> ak() {
      return this.bU;
   }

   public ffz<Double> al() {
      return this.bW;
   }

   public ffz<Double> am() {
      return this.bY;
   }

   public ffz<Double> an() {
      return this.ca;
   }

   public ffz<Double> ao() {
      return this.cc;
   }

   public ffz<Double> ap() {
      return this.cd;
   }

   public ffz<Integer> aq() {
      return this.cf;
   }

   public ffz<fgb> ar() {
      return this.cg;
   }

   public ffz<ffy> as() {
      return this.ch;
   }

   public ffz<String> at() {
      return this.ci;
   }

   public fga(ffw $$0, File $$1) {
      this.X = $$0;
      this.bM = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new ffz<>(
         "options.renderDistance",
         ffz.a(),
         ($$0x, $$1x) -> a($$0x, wu.a("options.chunks", $$1x)),
         new ffz.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> ffw.Q().f.r()
      );
      this.ar = new ffz<>(
         "options.simulationDistance", ffz.a(), ($$0x, $$1x) -> a($$0x, wu.a("options.chunks", $$1x)), new ffz.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
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

   public void a(ffu $$0, ezj.a $$1) {
      $$0.b($$1);
      this.av();
   }

   private void a(fga.b $$0) {
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

   private void a(fga.a $$0) {
      this.a((fga.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, fga::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fga::c, ag::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, gvo::a, gvo::a);
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

      for (ffu $$1 : this.W) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(ezj.a($$3));
         }
      }

      for (avi $$4 : avi.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bu.get($$4));
      }

      for (cmm $$5 : cmm.values()) {
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
               this.az.a(ffp.b);
            } else {
               this.az.a(ffp.a);
            }
         }

         this.a(new fga.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).s_() : null;
            }

            @Override
            public <T> void a(String $$0, ffz<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fga.af.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fga.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fga.a($$2) : $$1;
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
               } else if (fga.a($$2)) {
                  return 1.0F;
               } else if (fga.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fga.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         if (this.X.aM() != null) {
            this.X.aM().a(this.au.c());
         }

         ffu.d();
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

      return azo.e.a(this.X.as(), $$0, $$1);
   }

   public void av() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bM), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new fga.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, ffz<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> fga.af.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(fga.ag.toJson($$2));
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
         if (this.X.aM().f().isPresent()) {
            $$0.println("fullscreenResolution:" + this.X.aM().f().get().g());
         }
      } catch (Exception var6) {
         af.error("Failed to save options", var6);
      }

      this.ax();
   }

   public apz aw() {
      int $$0 = 0;

      for (cmm $$1 : this.aQ) {
         $$0 |= $$1.a();
      }

      return new apz(this.ac, this.aq.c(), this.aF.c(), this.bh.c(), $$0, this.aR.c(), this.X.aQ(), this.bs.c());
   }

   public void ax() {
      if (this.X.s != null) {
         this.X.s.h.b(new zt(this.aw()));
      }
   }

   private void b(cmm $$0, boolean $$1) {
      if ($$1) {
         this.aQ.add($$0);
      } else {
         this.aQ.remove($$0);
      }
   }

   public boolean a(cmm $$0) {
      return this.aQ.contains($$0);
   }

   public void a(cmm $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ax();
   }

   public ffj ay() {
      return this.aD() >= 4 ? this.av.c() : ffj.a;
   }

   public boolean az() {
      return this.q;
   }

   public void b(ath $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         ate $$4 = $$0.c($$3);
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

   public ffh aA() {
      return this.bN;
   }

   public void a(ffh $$0) {
      this.bN = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = axw.a(ag, $$0, ah);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aB() {
      return this.bM;
   }

   public String aC() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fga.b() {
         @Override
         public <T> void a(String $$0x, ffz<T> $$1) {
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

   private static wu c(wu $$0, int $$1) {
      return wu.a("options.pixel_value", $$0, $$1);
   }

   private static wu a(wu $$0, double $$1) {
      return wu.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static wu a(wu $$0, wu $$1) {
      return wu.a("options.generic_value", $$0, $$1);
   }

   public static wu a(wu $$0, int $$1) {
      return a($$0, wu.b(Integer.toString($$1)));
   }

   public static wu b(wu $$0, int $$1) {
      return $$1 == 0 ? a($$0, wt.c) : a($$0, $$1);
   }

   private static wu b(wu $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, wt.c) : a($$0, $$1);
   }

   interface a extends fga.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, ffz<T> var2);
   }
}
