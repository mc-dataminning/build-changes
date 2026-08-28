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

public class ffx {
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
   private final ffw<Boolean> ak = ffw.a("options.darkMojangStudiosBackgroundColor", ffw.a(aj), false);
   private static final wu al = wu.c("options.hideLightningFlashes.tooltip");
   private final ffw<Boolean> am = ffw.a("options.hideLightningFlashes", ffw.a(al), false);
   private static final wu an = wu.c("options.hideSplashTexts.tooltip");
   private final ffw<Boolean> ao = ffw.a("options.hideSplashTexts", ffw.a(an), false);
   private final ffw<Double> ap = new ffw<>("options.sensitivity", ffw.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wu.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wu.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, ffw.m.a, 0.5, $$0x -> {
   });
   private final ffw<Integer> aq;
   private final ffw<Integer> ar;
   private int as = 0;
   private final ffw<Double> at = new ffw<>(
      "options.entityDistanceScaling",
      ffw.a(),
      ffx::a,
      new ffw.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final ffw<Integer> au = new ffw<>(
      "options.framerateLimit",
      ffw.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wu.c("options.framerateLimit.max")) : a($$0x, wu.a("options.framerate", $$1x)),
      new ffw.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fft.Q().aO().a($$0x)
   );
   private final ffw<ffh> av = new ffw<>(
      "options.renderClouds",
      ffw.a(),
      ffw.b(),
      new ffw.e<>(Arrays.asList(ffh.values()), Codec.withAlternative(ffh.d, Codec.BOOL, $$0x -> $$0x ? ffh.c : ffh.a)),
      ffh.c,
      $$0x -> {
         if (fft.O()) {
            eyy $$1x = fft.Q().f.x();
            if ($$1x != null) {
               $$1x.b(fft.a);
            }
         }
      }
   );
   private static final wu aw = wu.c("options.graphics.fast.tooltip");
   private static final wu ax = wu.a("options.graphics.fabulous.tooltip", wu.c("options.graphics.fabulous").a(n.u));
   private static final wu ay = wu.c("options.graphics.fancy.tooltip");
   private final ffw<ffm> az = new ffw<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fjd.a(ay);
            case a -> fjd.a(aw);
            case c -> fjd.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         xi $$2x = wu.c($$1x.b());
         return $$1x == ffm.c ? $$2x.a(n.u) : $$2x;
      },
      new ffw.a<>(
         Arrays.asList(ffm.values()),
         Stream.of(ffm.values()).filter($$0x -> $$0x != ffm.c).collect(Collectors.toList()),
         () -> fft.Q().r() && fft.Q().ai().h(),
         ($$0x, $$1x) -> {
            fft $$2x = fft.Q();
            gdx $$3 = $$2x.ai();
            if ($$1x == ffm.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(ffm::a, ffm::a)
      ),
      ffm.b,
      $$0x -> {
      }
   );
   private final ffw<Boolean> aA = ffw.a("options.ao", true, $$0x -> fft.Q().f.f());
   private static final wu aB = wu.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wu aC = wu.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wu aD = wu.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final ffw<fga> aE = new ffw<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fjd.a(aB);
         case b -> fjd.a(aC);
         case c -> fjd.a(aD);
      };
   }, ffw.b(), new ffw.e<>(Arrays.asList(fga.values()), Codec.INT.xmap(fga::a, fga::a)), fga.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final ffw<cmi> aF = new ffw<>(
      "options.chat.visibility", ffw.a(), ffw.b(), new ffw.e<>(Arrays.asList(cmi.values()), Codec.INT.xmap(cmi::a, cmi::a)), cmi.a, $$0x -> {
      }
   );
   private final ffw<Double> aG = new ffw<>("options.chat.opacity", ffw.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), ffw.m.a, 1.0, $$0x -> fft.Q().l.d().b());
   private final ffw<Double> aH = new ffw<>("options.chat.line_spacing", ffw.a(), ffx::a, ffw.m.a, 0.0, $$0x -> {
   });
   private static final wu aI = wu.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final double aJ = 0.5;
   private final ffw<Double> aK = new ffw<>("options.accessibility.menu_background_blurriness", ffw.a(aI), ffx::b, ffw.m.a, 0.5, $$0x -> {
   });
   private final ffw<Double> aL = new ffw<>("options.accessibility.text_background_opacity", ffw.a(), ffx::a, ffw.m.a, 0.5, $$0x -> fft.Q().l.d().b());
   private final ffw<Double> aM = new ffw<>("options.accessibility.panorama_speed", ffw.a(), ffx::a, ffw.m.a, 1.0, $$0x -> {
   });
   private static final wu aN = wu.c("options.accessibility.high_contrast.tooltip");
   private final ffw<Boolean> aO = ffw.a("options.accessibility.high_contrast", ffw.a(aN), false, $$0x -> {
      ath $$1x = fft.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final ffw<Boolean> aP = ffw.a(
      "options.accessibility.narrator_hotkey",
      ffw.a(fft.a ? wu.c("options.accessibility.narrator_hotkey.mac.tooltip") : wu.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cml> aQ = EnumSet.allOf(cml.class);
   private final ffw<bsv> aR = new ffw<>("options.mainHand", ffw.a(), ffw.b(), new ffw.e<>(Arrays.asList(bsv.values()), bsv.c), bsv.b, $$0x -> this.ax());
   public int o;
   public int p;
   private final ffw<Double> aS = new ffw<>(
      "options.chat.scale",
      ffw.a(),
      ($$0x, $$1x) -> (wu)($$1x == 0.0 ? wt.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      ffw.m.a,
      1.0,
      $$0x -> fft.Q().l.d().b()
   );
   private final ffw<Double> aT = new ffw<>("options.chat.width", ffw.a(), ($$0x, $$1x) -> b($$0x, fht.a($$1x)), ffw.m.a, 1.0, $$0x -> fft.Q().l.d().b());
   private final ffw<Double> aU = new ffw<>(
      "options.chat.height.unfocused", ffw.a(), ($$0x, $$1x) -> b($$0x, fht.b($$1x)), ffw.m.a, fht.i(), $$0x -> fft.Q().l.d().b()
   );
   private final ffw<Double> aV = new ffw<>(
      "options.chat.height.focused", ffw.a(), ($$0x, $$1x) -> b($$0x, fht.b($$1x)), ffw.m.a, 1.0, $$0x -> fft.Q().l.d().b()
   );
   private final ffw<Double> aW = new ffw<>(
      "options.chat.delay_instant",
      ffw.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wu.c("options.chat.delay_none") : wu.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new ffw.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fft.Q().aY().a($$0x)
   );
   private static final wu aX = wu.c("options.notifications.display_time.tooltip");
   private final ffw<Double> aY = new ffw<>(
      "options.notifications.display_time",
      ffw.a(aX),
      ($$0x, $$1x) -> a($$0x, wu.a("options.multiplier", $$1x)),
      new ffw.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final ffw<Integer> aZ = new ffw<>(
      "options.mipmapLevels", ffw.a(), ($$0x, $$1x) -> (wu)($$1x == 0 ? wt.a($$0x, false) : a($$0x, $$1x.intValue())), new ffw.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final ffw<ffd> ba = new ffw<>(
      "options.attackIndicator", ffw.a(), ffw.b(), new ffw.e<>(Arrays.asList(ffd.values()), Codec.INT.xmap(ffd::a, ffd::a)), ffd.b, $$0x -> {
      }
   );
   public gvm r = gvm.a;
   public boolean s = false;
   public boolean t = false;
   private final ffw<Integer> bb = new ffw<>("options.biomeBlendRadius", ffw.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wu.c("options.biomeBlendRadius." + $$2x));
   }, new ffw.f(0, 7, false), 2, $$0x -> fft.Q().f.f());
   private final ffw<Double> bc = new ffw<>(
      "options.mouseWheelSensitivity",
      ffw.a(),
      ($$0x, $$1x) -> a($$0x, wu.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new ffw.f(-200, 100).a(ffx::c, ffx::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final ffw<Boolean> bd = ffw.a("options.rawMouseInput", true, $$0x -> {
      ezq $$1x = fft.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final ffw<Boolean> be = ffw.a("options.autoJump", false);
   private final ffw<Boolean> bf = ffw.a("options.operatorItemsTab", false);
   private final ffw<Boolean> bg = ffw.a("options.autoSuggestCommands", true);
   private final ffw<Boolean> bh = ffw.a("options.chat.color", true);
   private final ffw<Boolean> bi = ffw.a("options.chat.links", true);
   private final ffw<Boolean> bj = ffw.a("options.chat.links.prompt", true);
   private final ffw<Boolean> bk = ffw.a("options.vsync", true, $$0x -> {
      if (fft.Q().aO() != null) {
         fft.Q().aO().a($$0x);
      }
   });
   private final ffw<Boolean> bl = ffw.a("options.entityShadows", true);
   private final ffw<Boolean> bm = ffw.a("options.forceUnicodeFont", false, $$0x -> aE());
   private final ffw<Boolean> bn = ffw.a("options.japaneseGlyphVariants", ffw.a(wu.c("options.japaneseGlyphVariants.tooltip")), aF(), $$0x -> aE());
   private final ffw<Boolean> bo = ffw.a("options.invertMouse", false);
   private final ffw<Boolean> bp = ffw.a("options.discrete_mouse_scroll", false);
   private final ffw<Boolean> bq = ffw.a("options.realmsNotifications", true);
   private static final wu br = wu.c("options.allowServerListing.tooltip");
   private final ffw<Boolean> bs = ffw.a("options.allowServerListing", ffw.a(br), true, $$0x -> this.ax());
   private final ffw<Boolean> bt = ffw.a("options.reducedDebugInfo", false);
   private final Map<avi, ffw<Double>> bu = ac.a(new EnumMap<>(avi.class), $$0x -> {
      for (avi $$1x : avi.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final ffw<Boolean> bv = ffw.a("options.showSubtitles", false);
   private static final wu bw = wu.c("options.directionalAudio.on.tooltip");
   private static final wu bx = wu.c("options.directionalAudio.off.tooltip");
   private final ffw<Boolean> by = ffw.a("options.directionalAudio", $$0x -> $$0x ? fjd.a(bw) : fjd.a(bx), false, $$0x -> {
      guh $$1x = fft.Q().aj();
      $$1x.k();
      $$1x.a(gsx.a(avh.Ar, 1.0F));
   });
   private final ffw<Boolean> bz = new ffw<>(
      "options.accessibility.text_background",
      ffw.a(),
      ($$0x, $$1x) -> $$1x ? wu.c("options.accessibility.text_background.chat") : wu.c("options.accessibility.text_background.everywhere"),
      ffw.a,
      true,
      $$0x -> {
      }
   );
   private final ffw<Boolean> bA = ffw.a("options.touchscreen", false);
   private final ffw<Boolean> bB = ffw.a("options.fullscreen", false, $$0x -> {
      fft $$1x = fft.Q();
      if ($$1x.aO() != null && $$1x.aO().j() != $$0x) {
         $$1x.aO().h();
         this.aa().a($$1x.aO().j());
      }
   });
   private final ffw<Boolean> bC = ffw.a("options.viewBobbing", true);
   private static final wu bD = wu.c("options.key.toggle");
   private static final wu bE = wu.c("options.key.hold");
   private final ffw<Boolean> bF = new ffw<>("key.sneak", ffw.a(), ($$0x, $$1x) -> $$1x ? bD : bE, ffw.a, false, $$0x -> {
   });
   private final ffw<Boolean> bG = new ffw<>("key.sprint", ffw.a(), ($$0x, $$1x) -> $$1x ? bD : bE, ffw.a, false, $$0x -> {
   });
   public boolean v;
   private static final wu bH = wu.c("options.hideMatchedNames.tooltip");
   private final ffw<Boolean> bI = ffw.a("options.hideMatchedNames", ffw.a(bH), true);
   private final ffw<Boolean> bJ = ffw.a("options.autosaveIndicator", true);
   private static final wu bK = wu.c("options.onlyShowSecureChat.tooltip");
   private final ffw<Boolean> bL = ffw.a("options.onlyShowSecureChat", ffw.a(bK), false);
   public final ffr w = new ffr("key.forward", 87, "key.categories.movement");
   public final ffr x = new ffr("key.left", 65, "key.categories.movement");
   public final ffr y = new ffr("key.back", 83, "key.categories.movement");
   public final ffr z = new ffr("key.right", 68, "key.categories.movement");
   public final ffr A = new ffr("key.jump", 32, "key.categories.movement");
   public final ffr B = new fgg("key.sneak", 340, "key.categories.movement", this.bF::c);
   public final ffr C = new fgg("key.sprint", 341, "key.categories.movement", this.bG::c);
   public final ffr D = new ffr("key.inventory", 69, "key.categories.inventory");
   public final ffr E = new ffr("key.swapOffhand", 70, "key.categories.inventory");
   public final ffr F = new ffr("key.drop", 81, "key.categories.inventory");
   public final ffr G = new ffr("key.use", ezh.b.c, 1, "key.categories.gameplay");
   public final ffr H = new ffr("key.attack", ezh.b.c, 0, "key.categories.gameplay");
   public final ffr I = new ffr("key.pickItem", ezh.b.c, 2, "key.categories.gameplay");
   public final ffr J = new ffr("key.chat", 84, "key.categories.multiplayer");
   public final ffr K = new ffr("key.playerlist", 258, "key.categories.multiplayer");
   public final ffr L = new ffr("key.command", 47, "key.categories.multiplayer");
   public final ffr M = new ffr("key.socialInteractions", 80, "key.categories.multiplayer");
   public final ffr N = new ffr("key.screenshot", 291, "key.categories.misc");
   public final ffr O = new ffr("key.togglePerspective", 294, "key.categories.misc");
   public final ffr P = new ffr("key.smoothCamera", ezh.bv.b(), "key.categories.misc");
   public final ffr Q = new ffr("key.fullscreen", 300, "key.categories.misc");
   public final ffr R = new ffr("key.spectatorOutlines", ezh.bv.b(), "key.categories.misc");
   public final ffr S = new ffr("key.advancements", 76, "key.categories.misc");
   public final ffr[] T = new ffr[]{
      new ffr("key.hotbar.1", 49, "key.categories.inventory"),
      new ffr("key.hotbar.2", 50, "key.categories.inventory"),
      new ffr("key.hotbar.3", 51, "key.categories.inventory"),
      new ffr("key.hotbar.4", 52, "key.categories.inventory"),
      new ffr("key.hotbar.5", 53, "key.categories.inventory"),
      new ffr("key.hotbar.6", 54, "key.categories.inventory"),
      new ffr("key.hotbar.7", 55, "key.categories.inventory"),
      new ffr("key.hotbar.8", 56, "key.categories.inventory"),
      new ffr("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final ffr U = new ffr("key.saveToolbarActivator", 67, "key.categories.creative");
   public final ffr V = new ffr("key.loadToolbarActivator", 88, "key.categories.creative");
   public final ffr[] W = (ffr[])ArrayUtils.addAll(
      new ffr[]{
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
   protected fft X;
   private final File bM;
   public boolean Y;
   private fff bN = fff.a;
   public String Z = "";
   public boolean aa;
   private final ffw<Integer> bO = new ffw<>("options.fov", ffw.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wu.c("options.fov.min"));
         case 110 -> a($$0x, wu.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new ffw.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fft.Q().f.r());
   private static final wu bP = wu.a("options.telemetry.button.tooltip", wu.c("options.telemetry.state.minimal"), wu.c("options.telemetry.state.all"));
   private final ffw<Boolean> bQ = ffw.a("options.telemetry.button", ffw.a(bP), ($$0x, $$1x) -> {
      fft $$2x = fft.Q();
      if (!$$2x.E()) {
         return wu.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wu.c("options.telemetry.state.all") : wu.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wu bR = wu.c("options.screenEffectScale.tooltip");
   private final ffw<Double> bS = new ffw<>("options.screenEffectScale", ffw.a(bR), ffx::b, ffw.m.a, 1.0, $$0x -> {
   });
   private static final wu bT = wu.c("options.fovEffectScale.tooltip");
   private final ffw<Double> bU = new ffw<>(
      "options.fovEffectScale", ffw.a(bT), ffx::b, ffw.m.a.a(ayg::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final wu bV = wu.c("options.darknessEffectScale.tooltip");
   private final ffw<Double> bW = new ffw<>("options.darknessEffectScale", ffw.a(bV), ffx::b, ffw.m.a.a(ayg::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final wu bX = wu.c("options.glintSpeed.tooltip");
   private final ffw<Double> bY = new ffw<>("options.glintSpeed", ffw.a(bX), ffx::b, ffw.m.a, 0.5, $$0x -> {
   });
   private static final wu bZ = wu.c("options.glintStrength.tooltip");
   private final ffw<Double> ca = new ffw<>("options.glintStrength", ffw.a(bZ), ffx::b, ffw.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final wu cb = wu.c("options.damageTiltStrength.tooltip");
   private final ffw<Double> cc = new ffw<>("options.damageTiltStrength", ffw.a(cb), ffx::b, ffw.m.a, 1.0, $$0x -> {
   });
   private final ffw<Double> cd = new ffw<>("options.gamma", ffw.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wu.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wu.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wu.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, ffw.m.a, 0.5, $$0x -> {
   });
   public static final int ab = 0;
   private static final int ce = 2147483646;
   private final ffw<Integer> cf = new ffw<>(
      "options.guiScale", ffw.a(), ($$0x, $$1x) -> $$1x == 0 ? wu.c("options.guiScale.auto") : wu.b(Integer.toString($$1x)), new ffw.c(0, () -> {
         fft $$0x = fft.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.X.a()
   );
   private final ffw<ffy> cg = new ffw<>(
      "options.particles", ffw.a(), ffw.b(), new ffw.e<>(Arrays.asList(ffy.values()), Codec.INT.xmap(ffy::a, ffy::a)), ffy.a, $$0x -> {
      }
   );
   private final ffw<ffv> ch = new ffw<>(
      "options.narrator",
      ffw.a(),
      ($$0x, $$1x) -> (wu)(this.X.aX().a() ? $$1x.b() : wu.c("options.narrator.notavailable")),
      new ffw.e<>(Arrays.asList(ffv.values()), Codec.INT.xmap(ffv::a, ffv::a)),
      ffv.a,
      $$0x -> this.X.aX().a($$0x)
   );
   public String ac = "en_us";
   private final ffw<String> ci = new ffw<>(
      "options.audioDevice",
      ffw.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wu.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wu.b($$1x.substring(gue.c)) : wu.b($$1x);
         }
      },
      new ffw.h<>(
         () -> Stream.concat(Stream.of(""), fft.Q().aj().a().stream()).toList(),
         $$0x -> fft.Q().r() && $$0x != "" && !fft.Q().aj().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         guh $$1x = fft.Q().aj();
         $$1x.k();
         $$1x.a(gsx.a(avh.Ar, 1.0F));
      }
   );
   public boolean ad = true;
   public boolean ae;

   public ffw<Boolean> a() {
      return this.ak;
   }

   public ffw<Boolean> b() {
      return this.am;
   }

   public ffw<Boolean> c() {
      return this.ao;
   }

   public ffw<Double> d() {
      return this.ap;
   }

   public ffw<Integer> e() {
      return this.aq;
   }

   public ffw<Integer> f() {
      return this.ar;
   }

   public ffw<Double> g() {
      return this.at;
   }

   public ffw<Integer> h() {
      return this.au;
   }

   public ffw<ffh> i() {
      return this.av;
   }

   public ffw<ffm> j() {
      return this.az;
   }

   public ffw<Boolean> k() {
      return this.aA;
   }

   public ffw<fga> l() {
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

   public ffw<cmi> m() {
      return this.aF;
   }

   public ffw<Double> n() {
      return this.aG;
   }

   public ffw<Double> o() {
      return this.aH;
   }

   public ffw<Double> p() {
      return this.aK;
   }

   public double q() {
      return this.p().c();
   }

   public ffw<Double> r() {
      return this.aL;
   }

   public ffw<Double> s() {
      return this.aM;
   }

   public ffw<Boolean> t() {
      return this.aO;
   }

   public ffw<Boolean> u() {
      return this.aP;
   }

   public ffw<bsv> v() {
      return this.aR;
   }

   public ffw<Double> w() {
      return this.aS;
   }

   public ffw<Double> x() {
      return this.aT;
   }

   public ffw<Double> y() {
      return this.aU;
   }

   public ffw<Double> z() {
      return this.aV;
   }

   public ffw<Double> A() {
      return this.aW;
   }

   public ffw<Double> B() {
      return this.aY;
   }

   public ffw<Integer> C() {
      return this.aZ;
   }

   public ffw<ffd> D() {
      return this.ba;
   }

   public ffw<Integer> E() {
      return this.bb;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ayg.a(Math.log10($$0) * 100.0);
   }

   public ffw<Double> F() {
      return this.bc;
   }

   public ffw<Boolean> G() {
      return this.bd;
   }

   public ffw<Boolean> H() {
      return this.be;
   }

   public ffw<Boolean> I() {
      return this.bf;
   }

   public ffw<Boolean> J() {
      return this.bg;
   }

   public ffw<Boolean> K() {
      return this.bh;
   }

   public ffw<Boolean> L() {
      return this.bi;
   }

   public ffw<Boolean> M() {
      return this.bj;
   }

   public ffw<Boolean> N() {
      return this.bk;
   }

   public ffw<Boolean> O() {
      return this.bl;
   }

   private static void aE() {
      fft $$0 = fft.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public ffw<Boolean> P() {
      return this.bm;
   }

   private static boolean aF() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public ffw<Boolean> Q() {
      return this.bn;
   }

   public ffw<Boolean> R() {
      return this.bo;
   }

   public ffw<Boolean> S() {
      return this.bp;
   }

   public ffw<Boolean> T() {
      return this.bq;
   }

   public ffw<Boolean> U() {
      return this.bs;
   }

   public ffw<Boolean> V() {
      return this.bt;
   }

   public final float a(avi $$0) {
      return this.b($$0).c().floatValue();
   }

   public final ffw<Double> b(avi $$0) {
      return Objects.requireNonNull(this.bu.get($$0));
   }

   private ffw<Double> a(String $$0, avi $$1) {
      return new ffw<>($$0, ffw.a(), ffx::b, ffw.m.a, 1.0, $$1x -> fft.Q().aj().a($$1, $$1x.floatValue()));
   }

   public ffw<Boolean> W() {
      return this.bv;
   }

   public ffw<Boolean> X() {
      return this.by;
   }

   public ffw<Boolean> Y() {
      return this.bz;
   }

   public ffw<Boolean> Z() {
      return this.bA;
   }

   public ffw<Boolean> aa() {
      return this.bB;
   }

   public ffw<Boolean> ab() {
      return this.bC;
   }

   public ffw<Boolean> ac() {
      return this.bF;
   }

   public ffw<Boolean> ad() {
      return this.bG;
   }

   public ffw<Boolean> ae() {
      return this.bI;
   }

   public ffw<Boolean> af() {
      return this.bJ;
   }

   public ffw<Boolean> ag() {
      return this.bL;
   }

   public ffw<Integer> ah() {
      return this.bO;
   }

   public ffw<Boolean> ai() {
      return this.bQ;
   }

   public ffw<Double> aj() {
      return this.bS;
   }

   public ffw<Double> ak() {
      return this.bU;
   }

   public ffw<Double> al() {
      return this.bW;
   }

   public ffw<Double> am() {
      return this.bY;
   }

   public ffw<Double> an() {
      return this.ca;
   }

   public ffw<Double> ao() {
      return this.cc;
   }

   public ffw<Double> ap() {
      return this.cd;
   }

   public ffw<Integer> aq() {
      return this.cf;
   }

   public ffw<ffy> ar() {
      return this.cg;
   }

   public ffw<ffv> as() {
      return this.ch;
   }

   public ffw<String> at() {
      return this.ci;
   }

   public ffx(fft $$0, File $$1) {
      this.X = $$0;
      this.bM = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new ffw<>(
         "options.renderDistance",
         ffw.a(),
         ($$0x, $$1x) -> a($$0x, wu.a("options.chunks", $$1x)),
         new ffw.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fft.Q().f.r()
      );
      this.ar = new ffw<>(
         "options.simulationDistance", ffw.a(), ($$0x, $$1x) -> a($$0x, wu.a("options.chunks", $$1x)), new ffw.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
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

   public void a(ffr $$0, ezh.a $$1) {
      $$0.b($$1);
      this.av();
   }

   private void a(ffx.b $$0) {
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

   private void a(ffx.a $$0) {
      this.a((ffx.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, ffx::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, ffx::c, ag::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, gvm::a, gvm::a);
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

      for (ffr $$1 : this.W) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(ezh.a($$3));
         }
      }

      for (avi $$4 : avi.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bu.get($$4));
      }

      for (cml $$5 : cml.values()) {
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
               this.az.a(ffm.b);
            } else {
               this.az.a(ffm.a);
            }
         }

         this.a(new ffx.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, ffw<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> ffx.af.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     ffx.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? ffx.a($$2) : $$1;
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
               } else if (ffx.a($$2)) {
                  return 1.0F;
               } else if (ffx.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     ffx.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         ffr.d();
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
         this.a(new ffx.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, ffw<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> ffx.af.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(ffx.ag.toJson($$2));
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

      for (cml $$1 : this.aQ) {
         $$0 |= $$1.a();
      }

      return new apz(this.ac, this.aq.c(), this.aF.c(), this.bh.c(), $$0, this.aR.c(), this.X.aS(), this.bs.c());
   }

   public void ax() {
      if (this.X.s != null) {
         this.X.s.cB.b(new zt(this.aw()));
      }
   }

   private void b(cml $$0, boolean $$1) {
      if ($$1) {
         this.aQ.add($$0);
      } else {
         this.aQ.remove($$0);
      }
   }

   public boolean a(cml $$0) {
      return this.aQ.contains($$0);
   }

   public void a(cml $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ax();
   }

   public ffh ay() {
      return this.aD() >= 4 ? this.av.c() : ffh.a;
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

   public fff aA() {
      return this.bN;
   }

   public void a(fff $$0) {
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
      this.a(new ffx.b() {
         @Override
         public <T> void a(String $$0x, ffw<T> $$1) {
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

   interface a extends ffx.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, ffw<T> var2);
   }
}
