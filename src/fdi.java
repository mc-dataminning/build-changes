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

public class fdi {
   static final Logger ag = LogUtils.getLogger();
   static final Gson ah = new Gson();
   private static final TypeToken<List<String>> ai = new TypeToken<List<String>>() {
   };
   public static final int a = 2;
   public static final int b = 4;
   public static final int c = 8;
   public static final int d = 12;
   public static final int e = 16;
   public static final int f = 32;
   private static final Splitter aj = Splitter.on(':').limit(2);
   public static final String g = "";
   private static final wu ak = wu.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fdh<Boolean> al = fdh.a("options.darkMojangStudiosBackgroundColor", fdh.a(ak), false);
   private static final wu am = wu.c("options.hideLightningFlashes.tooltip");
   private final fdh<Boolean> an = fdh.a("options.hideLightningFlashes", fdh.a(am), false);
   private static final wu ao = wu.c("options.hideSplashTexts.tooltip");
   private final fdh<Boolean> ap = fdh.a("options.hideSplashTexts", fdh.a(ao), false);
   private final fdh<Double> aq = new fdh<>("options.sensitivity", fdh.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wu.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wu.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fdh.m.a, 0.5, $$0x -> {
   });
   private final fdh<Integer> ar;
   private final fdh<Integer> as;
   private int at = 0;
   private final fdh<Double> au = new fdh<>(
      "options.entityDistanceScaling",
      fdh.a(),
      fdi::a,
      new fdh.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fdh<Integer> av = new fdh<>(
      "options.framerateLimit",
      fdh.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wu.c("options.framerateLimit.max")) : a($$0x, wu.a("options.framerate", $$1x)),
      new fdh.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fde.Q().aP().a($$0x)
   );
   private final fdh<fcs> aw = new fdh<>(
      "options.renderClouds",
      fdh.a(),
      fdh.b(),
      new fdh.e<>(Arrays.asList(fcs.values()), axh.a(fcs.d, Codec.BOOL, $$0x -> $$0x ? fcs.c : fcs.a)),
      fcs.c,
      $$0x -> {
         if (fde.O()) {
            ewj $$1x = fde.Q().f.x();
            if ($$1x != null) {
               $$1x.b(fde.a);
            }
         }
      }
   );
   private static final wu ax = wu.c("options.graphics.fast.tooltip");
   private static final wu ay = wu.a("options.graphics.fabulous.tooltip", wu.c("options.graphics.fabulous").a(n.u));
   private static final wu az = wu.c("options.graphics.fancy.tooltip");
   private final fdh<fcx> aA = new fdh<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fgp.a(az);
            case a -> fgp.a(ax);
            case c -> fgp.a(ay);
         };
      },
      ($$0x, $$1x) -> {
         xi $$2x = wu.c($$1x.b());
         return $$1x == fcx.c ? $$2x.a(n.u) : $$2x;
      },
      new fdh.a<>(
         Arrays.asList(fcx.values()),
         Stream.of(fcx.values()).filter($$0x -> $$0x != fcx.c).collect(Collectors.toList()),
         () -> fde.Q().r() && fde.Q().aj().h(),
         ($$0x, $$1x) -> {
            fde $$2x = fde.Q();
            gbi $$3x = $$2x.aj();
            if ($$1x == fcx.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(fcx::a, fcx::a)
      ),
      fcx.b,
      $$0x -> {
      }
   );
   private final fdh<Boolean> aB = fdh.a("options.ao", true, $$0x -> fde.Q().f.f());
   private static final wu aC = wu.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wu aD = wu.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wu aE = wu.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fdh<fdl> aF = new fdh<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fgp.a(aC);
         case b -> fgp.a(aD);
         case c -> fgp.a(aE);
      };
   }, fdh.b(), new fdh.e<>(Arrays.asList(fdl.values()), Codec.INT.xmap(fdl::a, fdl::a)), fdl.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fdh<clf> aG = new fdh<>(
      "options.chat.visibility", fdh.a(), fdh.b(), new fdh.e<>(Arrays.asList(clf.values()), Codec.INT.xmap(clf::a, clf::a)), clf.a, $$0x -> {
      }
   );
   private final fdh<Double> aH = new fdh<>("options.chat.opacity", fdh.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fdh.m.a, 1.0, $$0x -> fde.Q().l.d().b());
   private final fdh<Double> aI = new fdh<>("options.chat.line_spacing", fdh.a(), fdi::a, fdh.m.a, 0.0, $$0x -> {
   });
   private static final wu aJ = wu.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final double aK = 0.5;
   private final fdh<Double> aL = new fdh<>("options.accessibility.menu_background_blurriness", fdh.a(aJ), fdi::a, fdh.m.a, 0.5, $$0x -> {
   });
   private final fdh<Double> aM = new fdh<>("options.accessibility.text_background_opacity", fdh.a(), fdi::a, fdh.m.a, 0.5, $$0x -> fde.Q().l.d().b());
   private final fdh<Double> aN = new fdh<>("options.accessibility.panorama_speed", fdh.a(), fdi::a, fdh.m.a, 1.0, $$0x -> {
   });
   private static final wu aO = wu.c("options.accessibility.high_contrast.tooltip");
   private final fdh<Boolean> aP = fdh.a("options.accessibility.high_contrast", fdh.a(aO), false, $$0x -> {
      atc $$1x = fde.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final fdh<Boolean> aQ = fdh.a(
      "options.accessibility.narrator_hotkey",
      fdh.a(fde.a ? wu.c("options.accessibility.narrator_hotkey.mac.tooltip") : wu.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cli> aR = EnumSet.allOf(cli.class);
   private final fdh<bru> aS = new fdh<>("options.mainHand", fdh.a(), fdh.b(), new fdh.e<>(Arrays.asList(bru.values()), bru.c), bru.b, $$0x -> this.ax());
   public int o;
   public int p;
   private final fdh<Double> aT = new fdh<>(
      "options.chat.scale",
      fdh.a(),
      ($$0x, $$1x) -> (wu)($$1x == 0.0 ? wt.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fdh.m.a,
      1.0,
      $$0x -> fde.Q().l.d().b()
   );
   private final fdh<Double> aU = new fdh<>("options.chat.width", fdh.a(), ($$0x, $$1x) -> b($$0x, fff.a($$1x)), fdh.m.a, 1.0, $$0x -> fde.Q().l.d().b());
   private final fdh<Double> aV = new fdh<>(
      "options.chat.height.unfocused", fdh.a(), ($$0x, $$1x) -> b($$0x, fff.b($$1x)), fdh.m.a, fff.i(), $$0x -> fde.Q().l.d().b()
   );
   private final fdh<Double> aW = new fdh<>(
      "options.chat.height.focused", fdh.a(), ($$0x, $$1x) -> b($$0x, fff.b($$1x)), fdh.m.a, 1.0, $$0x -> fde.Q().l.d().b()
   );
   private final fdh<Double> aX = new fdh<>(
      "options.chat.delay_instant",
      fdh.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wu.c("options.chat.delay_none") : wu.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fdh.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fde.Q().ba().a($$0x)
   );
   private static final wu aY = wu.c("options.notifications.display_time.tooltip");
   private final fdh<Double> aZ = new fdh<>(
      "options.notifications.display_time",
      fdh.a(aY),
      ($$0x, $$1x) -> a($$0x, wu.a("options.multiplier", $$1x)),
      new fdh.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fdh<Integer> ba = new fdh<>(
      "options.mipmapLevels", fdh.a(), ($$0x, $$1x) -> (wu)($$1x == 0 ? wt.a($$0x, false) : a($$0x, $$1x.intValue())), new fdh.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fdh<fco> bb = new fdh<>(
      "options.attackIndicator", fdh.a(), fdh.b(), new fdh.e<>(Arrays.asList(fco.values()), Codec.INT.xmap(fco::a, fco::a)), fco.b, $$0x -> {
      }
   );
   public gsv r = gsv.a;
   public boolean s = false;
   public boolean t = false;
   private final fdh<Integer> bc = new fdh<>("options.biomeBlendRadius", fdh.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wu.c("options.biomeBlendRadius." + $$2x));
   }, new fdh.f(0, 7), 2, $$0x -> fde.Q().f.f());
   private final fdh<Double> bd = new fdh<>(
      "options.mouseWheelSensitivity",
      fdh.a(),
      ($$0x, $$1x) -> a($$0x, wu.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fdh.f(-200, 100).a(fdi::c, fdi::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fdh<Boolean> be = fdh.a("options.rawMouseInput", true, $$0x -> {
      exb $$1x = fde.Q().aP();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final fdh<Boolean> bf = fdh.a("options.autoJump", false);
   private final fdh<Boolean> bg = fdh.a("options.operatorItemsTab", false);
   private final fdh<Boolean> bh = fdh.a("options.autoSuggestCommands", true);
   private final fdh<Boolean> bi = fdh.a("options.chat.color", true);
   private final fdh<Boolean> bj = fdh.a("options.chat.links", true);
   private final fdh<Boolean> bk = fdh.a("options.chat.links.prompt", true);
   private final fdh<Boolean> bl = fdh.a("options.vsync", true, $$0x -> {
      if (fde.Q().aP() != null) {
         fde.Q().aP().a($$0x);
      }
   });
   private final fdh<Boolean> bm = fdh.a("options.entityShadows", true);
   private final fdh<Boolean> bn = fdh.a("options.forceUnicodeFont", false, $$0x -> aE());
   private final fdh<Boolean> bo = fdh.a("options.japaneseGlyphVariants", fdh.a(wu.c("options.japaneseGlyphVariants.tooltip")), aF(), $$0x -> aE());
   private final fdh<Boolean> bp = fdh.a("options.invertMouse", false);
   private final fdh<Boolean> bq = fdh.a("options.discrete_mouse_scroll", false);
   private final fdh<Boolean> br = fdh.a("options.realmsNotifications", true);
   private static final wu bs = wu.c("options.allowServerListing.tooltip");
   private final fdh<Boolean> bt = fdh.a("options.allowServerListing", fdh.a(bs), true, $$0x -> this.ax());
   private final fdh<Boolean> bu = fdh.a("options.reducedDebugInfo", false);
   private final Map<avd, fdh<Double>> bv = ac.a(new EnumMap<>(avd.class), $$0x -> {
      for (avd $$1x : avd.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fdh<Boolean> bw = fdh.a("options.showSubtitles", false);
   private static final wu bx = wu.c("options.directionalAudio.on.tooltip");
   private static final wu by = wu.c("options.directionalAudio.off.tooltip");
   private final fdh<Boolean> bz = fdh.a("options.directionalAudio", $$0x -> $$0x ? fgp.a(bx) : fgp.a(by), false, $$0x -> {
      grq $$1x = fde.Q().ak();
      $$1x.k();
      $$1x.a(gqh.a(avc.Ad, 1.0F));
   });
   private final fdh<Boolean> bA = new fdh<>(
      "options.accessibility.text_background",
      fdh.a(),
      ($$0x, $$1x) -> $$1x ? wu.c("options.accessibility.text_background.chat") : wu.c("options.accessibility.text_background.everywhere"),
      fdh.a,
      true,
      $$0x -> {
      }
   );
   private final fdh<Boolean> bB = fdh.a("options.touchscreen", false);
   private final fdh<Boolean> bC = fdh.a("options.fullscreen", false, $$0x -> {
      fde $$1x = fde.Q();
      if ($$1x.aP() != null && $$1x.aP().j() != $$0x) {
         $$1x.aP().h();
         this.aa().a($$1x.aP().j());
      }
   });
   private final fdh<Boolean> bD = fdh.a("options.viewBobbing", true);
   private static final wu bE = wu.c("options.key.toggle");
   private static final wu bF = wu.c("options.key.hold");
   private final fdh<Boolean> bG = new fdh<>("key.sneak", fdh.a(), ($$0x, $$1x) -> $$1x ? bE : bF, fdh.a, false, $$0x -> {
   });
   private final fdh<Boolean> bH = new fdh<>("key.sprint", fdh.a(), ($$0x, $$1x) -> $$1x ? bE : bF, fdh.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final wu bI = wu.c("options.hideMatchedNames.tooltip");
   private final fdh<Boolean> bJ = fdh.a("options.hideMatchedNames", fdh.a(bI), true);
   private final fdh<Boolean> bK = fdh.a("options.autosaveIndicator", true);
   private static final wu bL = wu.c("options.onlyShowSecureChat.tooltip");
   private final fdh<Boolean> bM = fdh.a("options.onlyShowSecureChat", fdh.a(bL), false);
   public final fdc x = new fdc("key.forward", 87, "key.categories.movement");
   public final fdc y = new fdc("key.left", 65, "key.categories.movement");
   public final fdc z = new fdc("key.back", 83, "key.categories.movement");
   public final fdc A = new fdc("key.right", 68, "key.categories.movement");
   public final fdc B = new fdc("key.jump", 32, "key.categories.movement");
   public final fdc C = new fds("key.sneak", 340, "key.categories.movement", this.bG::c);
   public final fdc D = new fds("key.sprint", 341, "key.categories.movement", this.bH::c);
   public final fdc E = new fdc("key.inventory", 69, "key.categories.inventory");
   public final fdc F = new fdc("key.swapOffhand", 70, "key.categories.inventory");
   public final fdc G = new fdc("key.drop", 81, "key.categories.inventory");
   public final fdc H = new fdc("key.use", ews.b.c, 1, "key.categories.gameplay");
   public final fdc I = new fdc("key.attack", ews.b.c, 0, "key.categories.gameplay");
   public final fdc J = new fdc("key.pickItem", ews.b.c, 2, "key.categories.gameplay");
   public final fdc K = new fdc("key.chat", 84, "key.categories.multiplayer");
   public final fdc L = new fdc("key.playerlist", 258, "key.categories.multiplayer");
   public final fdc M = new fdc("key.command", 47, "key.categories.multiplayer");
   public final fdc N = new fdc("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fdc O = new fdc("key.screenshot", 291, "key.categories.misc");
   public final fdc P = new fdc("key.togglePerspective", 294, "key.categories.misc");
   public final fdc Q = new fdc("key.smoothCamera", ews.bv.b(), "key.categories.misc");
   public final fdc R = new fdc("key.fullscreen", 300, "key.categories.misc");
   public final fdc S = new fdc("key.spectatorOutlines", ews.bv.b(), "key.categories.misc");
   public final fdc T = new fdc("key.advancements", 76, "key.categories.misc");
   public final fdc[] U = new fdc[]{
      new fdc("key.hotbar.1", 49, "key.categories.inventory"),
      new fdc("key.hotbar.2", 50, "key.categories.inventory"),
      new fdc("key.hotbar.3", 51, "key.categories.inventory"),
      new fdc("key.hotbar.4", 52, "key.categories.inventory"),
      new fdc("key.hotbar.5", 53, "key.categories.inventory"),
      new fdc("key.hotbar.6", 54, "key.categories.inventory"),
      new fdc("key.hotbar.7", 55, "key.categories.inventory"),
      new fdc("key.hotbar.8", 56, "key.categories.inventory"),
      new fdc("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fdc V = new fdc("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fdc W = new fdc("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fdc[] X = (fdc[])ArrayUtils.addAll(
      new fdc[]{
         this.I,
         this.H,
         this.x,
         this.y,
         this.z,
         this.A,
         this.B,
         this.C,
         this.D,
         this.G,
         this.E,
         this.K,
         this.L,
         this.J,
         this.M,
         this.N,
         this.O,
         this.P,
         this.Q,
         this.R,
         this.S,
         this.F,
         this.V,
         this.W,
         this.T
      },
      this.U
   );
   protected fde Y;
   private final File bN;
   public boolean Z;
   private fcq bO = fcq.a;
   public String aa = "";
   public boolean ab;
   private final fdh<Integer> bP = new fdh<>("options.fov", fdh.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wu.c("options.fov.min"));
         case 110 -> a($$0x, wu.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fdh.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fde.Q().f.r());
   private static final wu bQ = wu.a("options.telemetry.button.tooltip", wu.c("options.telemetry.state.minimal"), wu.c("options.telemetry.state.all"));
   private final fdh<Boolean> bR = fdh.a("options.telemetry.button", fdh.a(bQ), ($$0x, $$1x) -> {
      fde $$2x = fde.Q();
      if (!$$2x.E()) {
         return wu.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wu.c("options.telemetry.state.all") : wu.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wu bS = wu.c("options.screenEffectScale.tooltip");
   private final fdh<Double> bT = new fdh<>(
      "options.screenEffectScale", fdh.a(bS), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wt.c) : a($$0x, $$1x.doubleValue()), fdh.m.a, 1.0, $$0x -> {
      }
   );
   private static final wu bU = wu.c("options.fovEffectScale.tooltip");
   private final fdh<Double> bV = new fdh<>(
      "options.fovEffectScale",
      fdh.a(bU),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wt.c) : a($$0x, $$1x.doubleValue()),
      fdh.m.a.a(axz::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final wu bW = wu.c("options.darknessEffectScale.tooltip");
   private final fdh<Double> bX = new fdh<>(
      "options.darknessEffectScale",
      fdh.a(bW),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wt.c) : a($$0x, $$1x.doubleValue()),
      fdh.m.a.a(axz::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final wu bY = wu.c("options.glintSpeed.tooltip");
   private final fdh<Double> bZ = new fdh<>(
      "options.glintSpeed", fdh.a(bY), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wt.c) : a($$0x, $$1x.doubleValue()), fdh.m.a, 0.5, $$0x -> {
      }
   );
   private static final wu ca = wu.c("options.glintStrength.tooltip");
   private final fdh<Double> cb = new fdh<>(
      "options.glintStrength",
      fdh.a(ca),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wt.c) : a($$0x, $$1x.doubleValue()),
      fdh.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final wu cc = wu.c("options.damageTiltStrength.tooltip");
   private final fdh<Double> cd = new fdh<>(
      "options.damageTiltStrength", fdh.a(cc), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wt.c) : a($$0x, $$1x.doubleValue()), fdh.m.a, 1.0, $$0x -> {
      }
   );
   private final fdh<Double> ce = new fdh<>("options.gamma", fdh.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wu.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wu.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wu.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fdh.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cf = 2147483646;
   private final fdh<Integer> cg = new fdh<>(
      "options.guiScale", fdh.a(), ($$0x, $$1x) -> $$1x == 0 ? wu.c("options.guiScale.auto") : wu.b(Integer.toString($$1x)), new fdh.c(0, () -> {
         fde $$0x = fde.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aP().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final fdh<fdj> ch = new fdh<>(
      "options.particles", fdh.a(), fdh.b(), new fdh.e<>(Arrays.asList(fdj.values()), Codec.INT.xmap(fdj::a, fdj::a)), fdj.a, $$0x -> {
      }
   );
   private final fdh<fdg> ci = new fdh<>(
      "options.narrator",
      fdh.a(),
      ($$0x, $$1x) -> (wu)(this.Y.aZ().a() ? $$1x.b() : wu.c("options.narrator.notavailable")),
      new fdh.e<>(Arrays.asList(fdg.values()), Codec.INT.xmap(fdg::a, fdg::a)),
      fdg.a,
      $$0x -> this.Y.aZ().a($$0x)
   );
   public String ad = "en_us";
   private final fdh<String> cj = new fdh<>(
      "options.audioDevice",
      fdh.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wu.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wu.b($$1x.substring(grn.c)) : wu.b($$1x);
         }
      },
      new fdh.h<>(
         () -> Stream.concat(Stream.of(""), fde.Q().ak().a().stream()).toList(),
         $$0x -> fde.Q().r() && $$0x != "" && !fde.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         grq $$1x = fde.Q().ak();
         $$1x.k();
         $$1x.a(gqh.a(avc.Ad, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public fdh<Boolean> a() {
      return this.al;
   }

   public fdh<Boolean> b() {
      return this.an;
   }

   public fdh<Boolean> c() {
      return this.ap;
   }

   public fdh<Double> d() {
      return this.aq;
   }

   public fdh<Integer> e() {
      return this.ar;
   }

   public fdh<Integer> f() {
      return this.as;
   }

   public fdh<Double> g() {
      return this.au;
   }

   public fdh<Integer> h() {
      return this.av;
   }

   public fdh<fcs> i() {
      return this.aw;
   }

   public fdh<fcx> j() {
      return this.aA;
   }

   public fdh<Boolean> k() {
      return this.aB;
   }

   public fdh<fdl> l() {
      return this.aF;
   }

   public void a(atc $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (asz $$2 : $$0.f()) {
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
         this.Y.l();
      }
   }

   public fdh<clf> m() {
      return this.aG;
   }

   public fdh<Double> n() {
      return this.aH;
   }

   public fdh<Double> o() {
      return this.aI;
   }

   public fdh<Double> p() {
      return this.aL;
   }

   public double q() {
      return this.p().c();
   }

   public fdh<Double> r() {
      return this.aM;
   }

   public fdh<Double> s() {
      return this.aN;
   }

   public fdh<Boolean> t() {
      return this.aP;
   }

   public fdh<Boolean> u() {
      return this.aQ;
   }

   public fdh<bru> v() {
      return this.aS;
   }

   public fdh<Double> w() {
      return this.aT;
   }

   public fdh<Double> x() {
      return this.aU;
   }

   public fdh<Double> y() {
      return this.aV;
   }

   public fdh<Double> z() {
      return this.aW;
   }

   public fdh<Double> A() {
      return this.aX;
   }

   public fdh<Double> B() {
      return this.aZ;
   }

   public fdh<Integer> C() {
      return this.ba;
   }

   public fdh<fco> D() {
      return this.bb;
   }

   public fdh<Integer> E() {
      return this.bc;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return axz.a(Math.log10($$0) * 100.0);
   }

   public fdh<Double> F() {
      return this.bd;
   }

   public fdh<Boolean> G() {
      return this.be;
   }

   public fdh<Boolean> H() {
      return this.bf;
   }

   public fdh<Boolean> I() {
      return this.bg;
   }

   public fdh<Boolean> J() {
      return this.bh;
   }

   public fdh<Boolean> K() {
      return this.bi;
   }

   public fdh<Boolean> L() {
      return this.bj;
   }

   public fdh<Boolean> M() {
      return this.bk;
   }

   public fdh<Boolean> N() {
      return this.bl;
   }

   public fdh<Boolean> O() {
      return this.bm;
   }

   private static void aE() {
      fde $$0 = fde.Q();
      if ($$0.aP() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fdh<Boolean> P() {
      return this.bn;
   }

   private static boolean aF() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fdh<Boolean> Q() {
      return this.bo;
   }

   public fdh<Boolean> R() {
      return this.bp;
   }

   public fdh<Boolean> S() {
      return this.bq;
   }

   public fdh<Boolean> T() {
      return this.br;
   }

   public fdh<Boolean> U() {
      return this.bt;
   }

   public fdh<Boolean> V() {
      return this.bu;
   }

   public final float a(avd $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fdh<Double> b(avd $$0) {
      return Objects.requireNonNull(this.bv.get($$0));
   }

   private fdh<Double> a(String $$0, avd $$1) {
      return new fdh<>(
         $$0, fdh.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wt.c) : a($$0x, $$1x.doubleValue()), fdh.m.a, 1.0, $$1x -> fde.Q().ak().a($$1, $$1x.floatValue())
      );
   }

   public fdh<Boolean> W() {
      return this.bw;
   }

   public fdh<Boolean> X() {
      return this.bz;
   }

   public fdh<Boolean> Y() {
      return this.bA;
   }

   public fdh<Boolean> Z() {
      return this.bB;
   }

   public fdh<Boolean> aa() {
      return this.bC;
   }

   public fdh<Boolean> ab() {
      return this.bD;
   }

   public fdh<Boolean> ac() {
      return this.bG;
   }

   public fdh<Boolean> ad() {
      return this.bH;
   }

   public fdh<Boolean> ae() {
      return this.bJ;
   }

   public fdh<Boolean> af() {
      return this.bK;
   }

   public fdh<Boolean> ag() {
      return this.bM;
   }

   public fdh<Integer> ah() {
      return this.bP;
   }

   public fdh<Boolean> ai() {
      return this.bR;
   }

   public fdh<Double> aj() {
      return this.bT;
   }

   public fdh<Double> ak() {
      return this.bV;
   }

   public fdh<Double> al() {
      return this.bX;
   }

   public fdh<Double> am() {
      return this.bZ;
   }

   public fdh<Double> an() {
      return this.cb;
   }

   public fdh<Double> ao() {
      return this.cd;
   }

   public fdh<Double> ap() {
      return this.ce;
   }

   public fdh<Integer> aq() {
      return this.cg;
   }

   public fdh<fdj> ar() {
      return this.ch;
   }

   public fdh<fdg> as() {
      return this.ci;
   }

   public fdh<String> at() {
      return this.cj;
   }

   public fdi(fde $$0, File $$1) {
      this.Y = $$0;
      this.bN = new File($$1, "options.txt");
      boolean $$2 = $$0.ah();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ar = new fdh<>(
         "options.renderDistance",
         fdh.a(),
         ($$0x, $$1x) -> a($$0x, wu.a("options.chunks", $$1x)),
         new fdh.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> fde.Q().f.r()
      );
      this.as = new fdh<>(
         "options.simulationDistance", fdh.a(), ($$0x, $$1x) -> a($$0x, wu.a("options.chunks", $$1x)), new fdh.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
         }
      );
      this.af = ac.j() == ac.a.c;
      this.au();
   }

   public float a(float $$0) {
      return this.bA.c() ? $$0 : this.r().c().floatValue();
   }

   public int b(float $$0) {
      return (int)(this.a($$0) * 255.0F) << 24 & 0xFF000000;
   }

   public int a(int $$0) {
      return this.bA.c() ? $$0 : (int)(this.aM.c() * 255.0) << 24 & 0xFF000000;
   }

   public void a(fdc $$0, ews.a $$1) {
      $$0.b($$1);
      this.av();
   }

   private void a(fdi.b $$0) {
      $$0.a("ao", this.aB);
      $$0.a("biomeBlendRadius", this.bc);
      $$0.a("enableVsync", this.bl);
      $$0.a("entityDistanceScaling", this.au);
      $$0.a("entityShadows", this.bm);
      $$0.a("forceUnicodeFont", this.bn);
      $$0.a("japaneseGlyphVariants", this.bo);
      $$0.a("fov", this.bP);
      $$0.a("fovEffectScale", this.bV);
      $$0.a("darknessEffectScale", this.bX);
      $$0.a("glintSpeed", this.bZ);
      $$0.a("glintStrength", this.cb);
      $$0.a("prioritizeChunkUpdates", this.aF);
      $$0.a("fullscreen", this.bC);
      $$0.a("gamma", this.ce);
      $$0.a("graphicsMode", this.aA);
      $$0.a("guiScale", this.cg);
      $$0.a("maxFps", this.av);
      $$0.a("mipmapLevels", this.ba);
      $$0.a("narrator", this.ci);
      $$0.a("particles", this.ch);
      $$0.a("reducedDebugInfo", this.bu);
      $$0.a("renderClouds", this.aw);
      $$0.a("renderDistance", this.ar);
      $$0.a("simulationDistance", this.as);
      $$0.a("screenEffectScale", this.bT);
      $$0.a("soundDevice", this.cj);
   }

   private void a(fdi.a $$0) {
      this.a((fdi.b)$$0);
      $$0.a("autoJump", this.bf);
      $$0.a("operatorItemsTab", this.bg);
      $$0.a("autoSuggestions", this.bh);
      $$0.a("chatColors", this.bi);
      $$0.a("chatLinks", this.bj);
      $$0.a("chatLinksPrompt", this.bk);
      $$0.a("discrete_mouse_scroll", this.bq);
      $$0.a("invertYMouse", this.bp);
      $$0.a("realmsNotifications", this.br);
      $$0.a("showSubtitles", this.bw);
      $$0.a("directionalAudio", this.bz);
      $$0.a("touchscreen", this.bB);
      $$0.a("bobView", this.bD);
      $$0.a("toggleCrouch", this.bG);
      $$0.a("toggleSprint", this.bH);
      $$0.a("darkMojangStudiosBackground", this.al);
      $$0.a("hideLightningFlashes", this.an);
      $$0.a("hideSplashTexts", this.ap);
      $$0.a("mouseSensitivity", this.aq);
      $$0.a("damageTiltStrength", this.cd);
      $$0.a("highContrast", this.aP);
      $$0.a("narratorHotkey", this.aQ);
      this.i = $$0.a("resourcePacks", this.i, fdi::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fdi::c, ah::toJson);
      this.aa = $$0.a("lastServer", this.aa);
      this.ad = $$0.a("lang", this.ad);
      $$0.a("chatVisibility", this.aG);
      $$0.a("chatOpacity", this.aH);
      $$0.a("chatLineSpacing", this.aI);
      $$0.a("textBackgroundOpacity", this.aM);
      $$0.a("backgroundForChatOnly", this.bA);
      this.l = $$0.a("hideServerAddress", this.l);
      this.m = $$0.a("advancedItemTooltips", this.m);
      this.n = $$0.a("pauseOnLostFocus", this.n);
      this.o = $$0.a("overrideWidth", this.o);
      this.p = $$0.a("overrideHeight", this.p);
      $$0.a("chatHeightFocused", this.aW);
      $$0.a("chatDelay", this.aX);
      $$0.a("chatHeightUnfocused", this.aV);
      $$0.a("chatScale", this.aT);
      $$0.a("chatWidth", this.aU);
      $$0.a("notificationDisplayTime", this.aZ);
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aS);
      $$0.a("attackIndicator", this.bb);
      this.r = $$0.a("tutorialStep", this.r, gsv::a, gsv::a);
      $$0.a("mouseWheelSensitivity", this.bd);
      $$0.a("rawMouseInput", this.be);
      this.u = $$0.a("glDebugVerbosity", this.u);
      this.v = $$0.a("skipMultiplayerWarning", this.v);
      this.w = $$0.a("skipRealms32bitWarning", this.w);
      $$0.a("hideMatchedNames", this.bJ);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.t = $$0.a("hideBundleTutorial", this.t);
      this.af = $$0.a("syncChunkWrites", this.af);
      $$0.a("showAutosaveIndicator", this.bK);
      $$0.a("allowServerListing", this.bt);
      $$0.a("onlyShowSecureChat", this.bM);
      $$0.a("panoramaScrollSpeed", this.aN);
      $$0.a("telemetryOptInExtra", this.bR);
      this.ae = $$0.a("onboardAccessibility", this.ae);
      $$0.a("menuBackgroundBlurriness", this.aL);

      for (fdc $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(ews.a($$3));
         }
      }

      for (avd $$4 : avd.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bv.get($$4));
      }

      for (cli $$5 : cli.values()) {
         boolean $$6 = this.aR.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.b($$5, $$7);
         }
      }
   }

   public void au() {
      try {
         if (!this.bN.exists()) {
            return;
         }

         ua $$0 = new ua();

         try (BufferedReader $$1 = Files.newReader(this.bN, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = aj.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  ag.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final ua $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aA.a(fcx.b);
            } else {
               this.aA.a(fcx.a);
            }
         }

         this.a(new fdi.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, fdh<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fdi.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
                  $$5.result().ifPresent($$1::a);
               }
            }

            @Override
            public int a(String $$0, int $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  try {
                     return Integer.parseInt($$2);
                  } catch (NumberFormatException var5) {
                     fdi.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fdi.a($$2) : $$1;
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
               } else if (fdi.a($$2)) {
                  return 1.0F;
               } else if (fdi.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fdi.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         if (this.Y.aP() != null) {
            this.Y.aP().a(this.av.c());
         }

         fdc.d();
      } catch (Exception var7) {
         ag.error("Failed to load options", var7);
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
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return azf.e.a(this.Y.at(), $$0, $$1);
   }

   public void av() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bN), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new fdi.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fdh<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> fdi.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(fdi.ah.toJson($$2x));
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
         if (this.Y.aP().f().isPresent()) {
            $$0.println("fullscreenResolution:" + this.Y.aP().f().get().g());
         }
      } catch (Exception var6) {
         ag.error("Failed to save options", var6);
      }

      this.ax();
   }

   public apw aw() {
      int $$0 = 0;

      for (cli $$1 : this.aR) {
         $$0 |= $$1.a();
      }

      return new apw(this.ad, this.ar.c(), this.aG.c(), this.bi.c(), $$0, this.aS.c(), this.Y.aT(), this.bt.c());
   }

   public void ax() {
      if (this.Y.s != null) {
         this.Y.s.h.b(new zt(this.aw()));
      }
   }

   private void b(cli $$0, boolean $$1) {
      if ($$1) {
         this.aR.add($$0);
      } else {
         this.aR.remove($$0);
      }
   }

   public boolean a(cli $$0) {
      return this.aR.contains($$0);
   }

   public void a(cli $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ax();
   }

   public fcs ay() {
      return this.aD() >= 4 ? this.aw.c() : fcs.a;
   }

   public boolean az() {
      return this.q;
   }

   public void b(atc $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         asz $$4 = $$0.c($$3);
         if ($$4 == null && !$$3.startsWith("file/")) {
            $$4 = $$0.c("file/" + $$3);
         }

         if ($$4 == null) {
            ag.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", $$3);
            $$2.remove();
         } else if (!$$4.d().a() && !this.j.contains($$3)) {
            ag.warn("Removed resource pack {} from options because it is no longer compatible", $$3);
            $$2.remove();
         } else if ($$4.d().a() && this.j.contains($$3)) {
            ag.info("Removed resource pack {} from incompatibility list because it's now compatible", $$3);
            this.j.remove($$3);
         } else {
            $$1.add($$4.g());
         }
      }

      $$0.a($$1);
   }

   public fcq aA() {
      return this.bO;
   }

   public void a(fcq $$0) {
      this.bO = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = axp.a(ah, $$0, ai);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aB() {
      return this.bN;
   }

   public String aC() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fdi.b() {
         @Override
         public <T> void a(String $$0x, fdh<T> $$1) {
            $$0.add(Pair.of($$0, $$1.c()));
         }
      });
      $$0.add(Pair.of("fullscreenResolution", String.valueOf(this.k)));
      $$0.add(Pair.of("glDebugVerbosity", this.u));
      $$0.add(Pair.of("overrideHeight", this.p));
      $$0.add(Pair.of("overrideWidth", this.o));
      $$0.add(Pair.of("syncChunkWrites", this.af));
      $$0.add(Pair.of("useNativeTransport", this.q));
      $$0.add(Pair.of("resourcePacks", this.i));
      return $$0.stream()
         .sorted(Comparator.comparing(Pair::getFirst))
         .map($$0x -> (String)$$0x.getFirst() + ": " + $$0x.getSecond())
         .collect(Collectors.joining(System.lineSeparator()));
   }

   public void b(int $$0) {
      this.at = $$0;
   }

   public int aD() {
      return this.at > 0 ? Math.min(this.ar.c(), this.at) : this.ar.c();
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

   public static wu a(wu $$0, int $$1) {
      return a($$0, wu.b(Integer.toString($$1)));
   }

   interface a extends fdi.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fdh<T> var2);
   }
}
