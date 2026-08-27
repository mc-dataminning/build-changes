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

public class fgn {
   static final Logger ah = LogUtils.getLogger();
   static final Gson ai = new Gson();
   private static final TypeToken<List<String>> aj = new TypeToken<List<String>>() {
   };
   public static final int a = 2;
   public static final int b = 4;
   public static final int c = 8;
   public static final int d = 12;
   public static final int e = 16;
   public static final int f = 32;
   private static final Splitter ak = Splitter.on(':').limit(2);
   public static final String g = "";
   private static final xe al = xe.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fgm<Boolean> am = fgm.a("options.darkMojangStudiosBackgroundColor", fgm.a(al), false);
   private static final xe an = xe.c("options.hideLightningFlashes.tooltip");
   private final fgm<Boolean> ao = fgm.a("options.hideLightningFlashes", fgm.a(an), false);
   private static final xe ap = xe.c("options.hideSplashTexts.tooltip");
   private final fgm<Boolean> aq = fgm.a("options.hideSplashTexts", fgm.a(ap), false);
   private final fgm<Double> ar = new fgm<>("options.sensitivity", fgm.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xe.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xe.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fgm.m.a, 0.5, $$0x -> {
   });
   private final fgm<Integer> as;
   private final fgm<Integer> at;
   private int au = 0;
   private final fgm<Double> av = new fgm<>(
      "options.entityDistanceScaling",
      fgm.a(),
      fgn::a,
      new fgm.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fgm<Integer> aw = new fgm<>(
      "options.framerateLimit",
      fgm.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xe.c("options.framerateLimit.max")) : a($$0x, xe.a("options.framerate", $$1x)),
      new fgm.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fgj.Q().aP().a($$0x)
   );
   private final fgm<ffx> ax = new fgm<>(
      "options.renderClouds",
      fgm.a(),
      fgm.b(),
      new fgm.e<>(Arrays.asList(ffx.values()), axu.a(ffx.d, Codec.BOOL, $$0x -> $$0x ? ffx.c : ffx.a)),
      ffx.c,
      $$0x -> {
         if (fgj.O()) {
            ezo $$1x = fgj.Q().f.x();
            if ($$1x != null) {
               $$1x.b(fgj.a);
            }
         }
      }
   );
   private static final xe ay = xe.c("options.graphics.fast.tooltip");
   private static final xe az = xe.a("options.graphics.fabulous.tooltip", xe.c("options.graphics.fabulous").a(n.u));
   private static final xe aA = xe.c("options.graphics.fancy.tooltip");
   private final fgm<fgc> aB = new fgm<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fjy.a(aA);
            case a -> fjy.a(ay);
            case c -> fjy.a(az);
         };
      },
      ($$0x, $$1x) -> {
         xs $$2x = xe.c($$1x.b());
         return $$1x == fgc.c ? $$2x.a(n.u) : $$2x;
      },
      new fgm.a<>(
         Arrays.asList(fgc.values()),
         Stream.of(fgc.values()).filter($$0x -> $$0x != fgc.c).collect(Collectors.toList()),
         () -> fgj.Q().r() && fgj.Q().aj().h(),
         ($$0x, $$1x) -> {
            fgj $$2x = fgj.Q();
            gfa $$3x = $$2x.aj();
            if ($$1x == fgc.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(fgc::a, fgc::a)
      ),
      fgc.b,
      $$0x -> {
      }
   );
   private final fgm<Boolean> aC = fgm.a("options.ao", true, $$0x -> fgj.Q().f.f());
   private static final xe aD = xe.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xe aE = xe.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xe aF = xe.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fgm<fgq> aG = new fgm<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fjy.a(aD);
         case b -> fjy.a(aE);
         case c -> fjy.a(aF);
      };
   }, fgm.b(), new fgm.e<>(Arrays.asList(fgq.values()), Codec.INT.xmap(fgq::a, fgq::a)), fgq.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fgm<clw> aH = new fgm<>(
      "options.chat.visibility", fgm.a(), fgm.b(), new fgm.e<>(Arrays.asList(clw.values()), Codec.INT.xmap(clw::a, clw::a)), clw.a, $$0x -> {
      }
   );
   private final fgm<Double> aI = new fgm<>("options.chat.opacity", fgm.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fgm.m.a, 1.0, $$0x -> fgj.Q().l.d().b());
   private final fgm<Double> aJ = new fgm<>("options.chat.line_spacing", fgm.a(), fgn::a, fgm.m.a, 0.0, $$0x -> {
   });
   private static final xe aK = xe.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final double aL = 0.5;
   private final fgm<Double> aM = new fgm<>("options.accessibility.menu_background_blurriness", fgm.a(aK), fgn::a, fgm.m.a, 0.5, $$0x -> {
   });
   private final fgm<Double> aN = new fgm<>("options.accessibility.text_background_opacity", fgm.a(), fgn::a, fgm.m.a, 0.5, $$0x -> fgj.Q().l.d().b());
   private final fgm<Double> aO = new fgm<>("options.accessibility.panorama_speed", fgm.a(), fgn::a, fgm.m.a, 1.0, $$0x -> {
   });
   private static final xe aP = xe.c("options.accessibility.high_contrast.tooltip");
   private final fgm<Boolean> aQ = fgm.a("options.accessibility.high_contrast", fgm.a(aP), false, $$0x -> {
      ato $$1x = fgj.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final fgm<Boolean> aR = fgm.a(
      "options.accessibility.narrator_hotkey",
      fgm.a(fgj.a ? xe.c("options.accessibility.narrator_hotkey.mac.tooltip") : xe.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<clz> aS = EnumSet.allOf(clz.class);
   private final fgm<bsi> aT = new fgm<>("options.mainHand", fgm.a(), fgm.b(), new fgm.e<>(Arrays.asList(bsi.values()), bsi.c), bsi.b, $$0x -> this.ax());
   public int o;
   public int p;
   private final fgm<Double> aU = new fgm<>(
      "options.chat.scale",
      fgm.a(),
      ($$0x, $$1x) -> (xe)($$1x == 0.0 ? xd.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fgm.m.a,
      1.0,
      $$0x -> fgj.Q().l.d().b()
   );
   private final fgm<Double> aV = new fgm<>("options.chat.width", fgm.a(), ($$0x, $$1x) -> b($$0x, fio.a($$1x)), fgm.m.a, 1.0, $$0x -> fgj.Q().l.d().b());
   private final fgm<Double> aW = new fgm<>(
      "options.chat.height.unfocused", fgm.a(), ($$0x, $$1x) -> b($$0x, fio.b($$1x)), fgm.m.a, fio.i(), $$0x -> fgj.Q().l.d().b()
   );
   private final fgm<Double> aX = new fgm<>(
      "options.chat.height.focused", fgm.a(), ($$0x, $$1x) -> b($$0x, fio.b($$1x)), fgm.m.a, 1.0, $$0x -> fgj.Q().l.d().b()
   );
   private final fgm<Double> aY = new fgm<>(
      "options.chat.delay_instant",
      fgm.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xe.c("options.chat.delay_none") : xe.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fgm.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fgj.Q().ba().a($$0x)
   );
   private static final xe aZ = xe.c("options.notifications.display_time.tooltip");
   private final fgm<Double> ba = new fgm<>(
      "options.notifications.display_time",
      fgm.a(aZ),
      ($$0x, $$1x) -> a($$0x, xe.a("options.multiplier", $$1x)),
      new fgm.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fgm<Integer> bb = new fgm<>(
      "options.mipmapLevels", fgm.a(), ($$0x, $$1x) -> (xe)($$1x == 0 ? xd.a($$0x, false) : a($$0x, $$1x.intValue())), new fgm.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fgm<fft> bc = new fgm<>(
      "options.attackIndicator", fgm.a(), fgm.b(), new fgm.e<>(Arrays.asList(fft.values()), Codec.INT.xmap(fft::a, fft::a)), fft.b, $$0x -> {
      }
   );
   public gwv r = gwv.a;
   public boolean s = false;
   public boolean t = false;
   private final fgm<Integer> bd = new fgm<>("options.biomeBlendRadius", fgm.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xe.c("options.biomeBlendRadius." + $$2x));
   }, new fgm.f(0, 7), 2, $$0x -> fgj.Q().f.f());
   private final fgm<Double> be = new fgm<>(
      "options.mouseWheelSensitivity",
      fgm.a(),
      ($$0x, $$1x) -> a($$0x, xe.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fgm.f(-200, 100).a(fgn::c, fgn::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fgm<Boolean> bf = fgm.a("options.rawMouseInput", true, $$0x -> {
      fag $$1x = fgj.Q().aP();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final fgm<Boolean> bg = fgm.a("options.autoJump", false);
   private final fgm<Boolean> bh = fgm.a("options.operatorItemsTab", false);
   private final fgm<Boolean> bi = fgm.a("options.autoSuggestCommands", true);
   private final fgm<Boolean> bj = fgm.a("options.chat.color", true);
   private final fgm<Boolean> bk = fgm.a("options.chat.links", true);
   private final fgm<Boolean> bl = fgm.a("options.chat.links.prompt", true);
   private final fgm<Boolean> bm = fgm.a("options.vsync", true, $$0x -> {
      if (fgj.Q().aP() != null) {
         fgj.Q().aP().a($$0x);
      }
   });
   private final fgm<Boolean> bn = fgm.a("options.entityShadows", true);
   private final fgm<Boolean> bo = fgm.a("options.forceUnicodeFont", false, $$0x -> aE());
   private final fgm<Boolean> bp = fgm.a("options.japaneseGlyphVariants", fgm.a(xe.c("options.japaneseGlyphVariants.tooltip")), aF(), $$0x -> aE());
   private final fgm<Boolean> bq = fgm.a("options.invertMouse", false);
   private final fgm<Boolean> br = fgm.a("options.discrete_mouse_scroll", false);
   private final fgm<Boolean> bs = fgm.a("options.realmsNotifications", true);
   private static final xe bt = xe.c("options.allowServerListing.tooltip");
   private final fgm<Boolean> bu = fgm.a("options.allowServerListing", fgm.a(bt), true, $$0x -> this.ax());
   private final fgm<Boolean> bv = fgm.a("options.reducedDebugInfo", false);
   private final Map<avq, fgm<Double>> bw = ad.a(new EnumMap<>(avq.class), $$0x -> {
      for (avq $$1x : avq.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fgm<Boolean> bx = fgm.a("options.showSubtitles", false);
   private static final xe by = xe.c("options.directionalAudio.on.tooltip");
   private static final xe bz = xe.c("options.directionalAudio.off.tooltip");
   private final fgm<Boolean> bA = fgm.a("options.directionalAudio", $$0x -> $$0x ? fjy.a(by) : fjy.a(bz), false, $$0x -> {
      gvq $$1x = fgj.Q().ak();
      $$1x.k();
      $$1x.a(guh.a(avo.AM, 1.0F));
   });
   private final fgm<Boolean> bB = new fgm<>(
      "options.accessibility.text_background",
      fgm.a(),
      ($$0x, $$1x) -> $$1x ? xe.c("options.accessibility.text_background.chat") : xe.c("options.accessibility.text_background.everywhere"),
      fgm.a,
      true,
      $$0x -> {
      }
   );
   private final fgm<Boolean> bC = fgm.a("options.touchscreen", false);
   private final fgm<Boolean> bD = fgm.a("options.fullscreen", false, $$0x -> {
      fgj $$1x = fgj.Q();
      if ($$1x.aP() != null && $$1x.aP().j() != $$0x) {
         $$1x.aP().h();
         this.aa().a($$1x.aP().j());
      }
   });
   private final fgm<Boolean> bE = fgm.a("options.viewBobbing", true);
   private static final xe bF = xe.c("options.key.toggle");
   private static final xe bG = xe.c("options.key.hold");
   private final fgm<Boolean> bH = new fgm<>("key.sneak", fgm.a(), ($$0x, $$1x) -> $$1x ? bF : bG, fgm.a, false, $$0x -> {
   });
   private final fgm<Boolean> bI = new fgm<>("key.sprint", fgm.a(), ($$0x, $$1x) -> $$1x ? bF : bG, fgm.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final xe bJ = xe.c("options.hideMatchedNames.tooltip");
   private final fgm<Boolean> bK = fgm.a("options.hideMatchedNames", fgm.a(bJ), true);
   private final fgm<Boolean> bL = fgm.a("options.autosaveIndicator", true);
   private static final xe bM = xe.c("options.onlyShowSecureChat.tooltip");
   private final fgm<Boolean> bN = fgm.a("options.onlyShowSecureChat", fgm.a(bM), false);
   public final fgh x = new fgh("key.forward", 87, "key.categories.movement");
   public final fgh y = new fgh("key.left", 65, "key.categories.movement");
   public final fgh z = new fgh("key.back", 83, "key.categories.movement");
   public final fgh A = new fgh("key.right", 68, "key.categories.movement");
   public final fgh B = new fgh("key.jump", 32, "key.categories.movement");
   public final fgh C = new fgx("key.sneak", 340, "key.categories.movement", this.bH::c);
   public final fgh D = new fgx("key.sprint", 341, "key.categories.movement", this.bI::c);
   public final fgh E = new fgh("key.inventory", 69, "key.categories.inventory");
   public final fgh F = new fgh("key.swapOffhand", 70, "key.categories.inventory");
   public final fgh G = new fgh("key.drop", 81, "key.categories.inventory");
   public final fgh H = new fgh("key.use", ezx.b.c, 1, "key.categories.gameplay");
   public final fgh I = new fgh("key.attack", ezx.b.c, 0, "key.categories.gameplay");
   public final fgh J = new fgh("key.pickItem", ezx.b.c, 2, "key.categories.gameplay");
   public final fgh K = new fgh("key.chat", 84, "key.categories.multiplayer");
   public final fgh L = new fgh("key.playerlist", 258, "key.categories.multiplayer");
   public final fgh M = new fgh("key.command", 47, "key.categories.multiplayer");
   public final fgh N = new fgh("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fgh O = new fgh("key.potato", 39, "key.categories.multiplayer");
   public final fgh P = new fgh("key.screenshot", 291, "key.categories.misc");
   public final fgh Q = new fgh("key.togglePerspective", 294, "key.categories.misc");
   public final fgh R = new fgh("key.smoothCamera", ezx.bv.b(), "key.categories.misc");
   public final fgh S = new fgh("key.fullscreen", 300, "key.categories.misc");
   public final fgh T = new fgh("key.spectatorOutlines", ezx.bv.b(), "key.categories.misc");
   public final fgh U = new fgh("key.advancements", 76, "key.categories.misc");
   public final fgh[] V = new fgh[]{
      new fgh("key.hotbar.1", 49, "key.categories.inventory"),
      new fgh("key.hotbar.2", 50, "key.categories.inventory"),
      new fgh("key.hotbar.3", 51, "key.categories.inventory"),
      new fgh("key.hotbar.4", 52, "key.categories.inventory"),
      new fgh("key.hotbar.5", 53, "key.categories.inventory"),
      new fgh("key.hotbar.6", 54, "key.categories.inventory"),
      new fgh("key.hotbar.7", 55, "key.categories.inventory"),
      new fgh("key.hotbar.8", 56, "key.categories.inventory"),
      new fgh("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fgh W = new fgh("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fgh X = new fgh("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fgh[] Y = (fgh[])ArrayUtils.addAll(
      new fgh[]{
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
         this.T,
         this.F,
         this.W,
         this.X,
         this.U
      },
      this.V
   );
   protected fgj Z;
   private final File bO;
   public boolean aa;
   private ffv bP = ffv.a;
   public String ab = "";
   public boolean ac;
   private final fgm<Integer> bQ = new fgm<>("options.fov", fgm.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xe.c("options.fov.min"));
         case 110 -> a($$0x, xe.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fgm.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fgj.Q().f.r());
   private static final xe bR = xe.a("options.telemetry.button.tooltip", xe.c("options.telemetry.state.minimal"), xe.c("options.telemetry.state.all"));
   private final fgm<Boolean> bS = fgm.a("options.telemetry.button", fgm.a(bR), ($$0x, $$1x) -> {
      fgj $$2x = fgj.Q();
      if (!$$2x.E()) {
         return xe.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xe.c("options.telemetry.state.all") : xe.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xe bT = xe.c("options.screenEffectScale.tooltip");
   private final fgm<Double> bU = new fgm<>(
      "options.screenEffectScale", fgm.a(bT), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, xd.c) : a($$0x, $$1x.doubleValue()), fgm.m.a, 1.0, $$0x -> {
      }
   );
   private static final xe bV = xe.c("options.fovEffectScale.tooltip");
   private final fgm<Double> bW = new fgm<>(
      "options.fovEffectScale",
      fgm.a(bV),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, xd.c) : a($$0x, $$1x.doubleValue()),
      fgm.m.a.a(aym::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final xe bX = xe.c("options.darknessEffectScale.tooltip");
   private final fgm<Double> bY = new fgm<>(
      "options.darknessEffectScale",
      fgm.a(bX),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, xd.c) : a($$0x, $$1x.doubleValue()),
      fgm.m.a.a(aym::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final xe bZ = xe.c("options.glintSpeed.tooltip");
   private final fgm<Double> ca = new fgm<>(
      "options.glintSpeed", fgm.a(bZ), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, xd.c) : a($$0x, $$1x.doubleValue()), fgm.m.a, 0.5, $$0x -> {
      }
   );
   private static final xe cb = xe.c("options.glintStrength.tooltip");
   private final fgm<Double> cc = new fgm<>(
      "options.glintStrength",
      fgm.a(cb),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, xd.c) : a($$0x, $$1x.doubleValue()),
      fgm.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final xe cd = xe.c("options.damageTiltStrength.tooltip");
   private final fgm<Double> ce = new fgm<>(
      "options.damageTiltStrength", fgm.a(cd), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, xd.c) : a($$0x, $$1x.doubleValue()), fgm.m.a, 1.0, $$0x -> {
      }
   );
   private final fgm<Double> cf = new fgm<>("options.gamma", fgm.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xe.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xe.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xe.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fgm.m.a, 0.5, $$0x -> {
   });
   public static final int ad = 0;
   private static final int cg = 2147483646;
   private final fgm<Integer> ch = new fgm<>(
      "options.guiScale", fgm.a(), ($$0x, $$1x) -> $$1x == 0 ? xe.c("options.guiScale.auto") : xe.b(Integer.toString($$1x)), new fgm.c(0, () -> {
         fgj $$0x = fgj.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aP().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final fgm<fgo> ci = new fgm<>(
      "options.particles", fgm.a(), fgm.b(), new fgm.e<>(Arrays.asList(fgo.values()), Codec.INT.xmap(fgo::a, fgo::a)), fgo.a, $$0x -> {
      }
   );
   private final fgm<fgl> cj = new fgm<>(
      "options.narrator",
      fgm.a(),
      ($$0x, $$1x) -> (xe)(this.Z.aZ().a() ? $$1x.b() : xe.c("options.narrator.notavailable")),
      new fgm.e<>(Arrays.asList(fgl.values()), Codec.INT.xmap(fgl::a, fgl::a)),
      fgl.a,
      $$0x -> this.Z.aZ().a($$0x)
   );
   public String ae = "en_us";
   private final fgm<String> ck = new fgm<>(
      "options.audioDevice",
      fgm.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xe.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xe.b($$1x.substring(gvn.c)) : xe.b($$1x);
         }
      },
      new fgm.h<>(
         () -> Stream.concat(Stream.of(""), fgj.Q().ak().a().stream()).toList(),
         $$0x -> fgj.Q().r() && $$0x != "" && !fgj.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gvq $$1x = fgj.Q().ak();
         $$1x.k();
         $$1x.a(guh.a(avo.AM, 1.0F));
      }
   );
   public boolean af = true;
   public boolean ag;

   public fgm<Boolean> a() {
      return this.am;
   }

   public fgm<Boolean> b() {
      return this.ao;
   }

   public fgm<Boolean> c() {
      return this.aq;
   }

   public fgm<Double> d() {
      return this.ar;
   }

   public fgm<Integer> e() {
      return this.as;
   }

   public fgm<Integer> f() {
      return this.at;
   }

   public fgm<Double> g() {
      return this.av;
   }

   public fgm<Integer> h() {
      return this.aw;
   }

   public fgm<ffx> i() {
      return this.ax;
   }

   public fgm<fgc> j() {
      return this.aB;
   }

   public fgm<Boolean> k() {
      return this.aC;
   }

   public fgm<fgq> l() {
      return this.aG;
   }

   public void a(ato $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (atl $$2 : $$0.f()) {
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
         this.Z.l();
      }
   }

   public fgm<clw> m() {
      return this.aH;
   }

   public fgm<Double> n() {
      return this.aI;
   }

   public fgm<Double> o() {
      return this.aJ;
   }

   public fgm<Double> p() {
      return this.aM;
   }

   public double q() {
      return this.p().c();
   }

   public fgm<Double> r() {
      return this.aN;
   }

   public fgm<Double> s() {
      return this.aO;
   }

   public fgm<Boolean> t() {
      return this.aQ;
   }

   public fgm<Boolean> u() {
      return this.aR;
   }

   public fgm<bsi> v() {
      return this.aT;
   }

   public fgm<Double> w() {
      return this.aU;
   }

   public fgm<Double> x() {
      return this.aV;
   }

   public fgm<Double> y() {
      return this.aW;
   }

   public fgm<Double> z() {
      return this.aX;
   }

   public fgm<Double> A() {
      return this.aY;
   }

   public fgm<Double> B() {
      return this.ba;
   }

   public fgm<Integer> C() {
      return this.bb;
   }

   public fgm<fft> D() {
      return this.bc;
   }

   public fgm<Integer> E() {
      return this.bd;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return aym.a(Math.log10($$0) * 100.0);
   }

   public fgm<Double> F() {
      return this.be;
   }

   public fgm<Boolean> G() {
      return this.bf;
   }

   public fgm<Boolean> H() {
      return this.bg;
   }

   public fgm<Boolean> I() {
      return this.bh;
   }

   public fgm<Boolean> J() {
      return this.bi;
   }

   public fgm<Boolean> K() {
      return this.bj;
   }

   public fgm<Boolean> L() {
      return this.bk;
   }

   public fgm<Boolean> M() {
      return this.bl;
   }

   public fgm<Boolean> N() {
      return this.bm;
   }

   public fgm<Boolean> O() {
      return this.bn;
   }

   private static void aE() {
      fgj $$0 = fgj.Q();
      if ($$0.aP() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fgm<Boolean> P() {
      return this.bo;
   }

   private static boolean aF() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fgm<Boolean> Q() {
      return this.bp;
   }

   public fgm<Boolean> R() {
      return this.bq;
   }

   public fgm<Boolean> S() {
      return this.br;
   }

   public fgm<Boolean> T() {
      return this.bs;
   }

   public fgm<Boolean> U() {
      return this.bu;
   }

   public fgm<Boolean> V() {
      return this.bv;
   }

   public final float a(avq $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fgm<Double> b(avq $$0) {
      return Objects.requireNonNull(this.bw.get($$0));
   }

   private fgm<Double> a(String $$0, avq $$1) {
      return new fgm<>(
         $$0, fgm.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, xd.c) : a($$0x, $$1x.doubleValue()), fgm.m.a, 1.0, $$1x -> fgj.Q().ak().a($$1, $$1x.floatValue())
      );
   }

   public fgm<Boolean> W() {
      return this.bx;
   }

   public fgm<Boolean> X() {
      return this.bA;
   }

   public fgm<Boolean> Y() {
      return this.bB;
   }

   public fgm<Boolean> Z() {
      return this.bC;
   }

   public fgm<Boolean> aa() {
      return this.bD;
   }

   public fgm<Boolean> ab() {
      return this.bE;
   }

   public fgm<Boolean> ac() {
      return this.bH;
   }

   public fgm<Boolean> ad() {
      return this.bI;
   }

   public fgm<Boolean> ae() {
      return this.bK;
   }

   public fgm<Boolean> af() {
      return this.bL;
   }

   public fgm<Boolean> ag() {
      return this.bN;
   }

   public fgm<Integer> ah() {
      return this.bQ;
   }

   public fgm<Boolean> ai() {
      return this.bS;
   }

   public fgm<Double> aj() {
      return this.bU;
   }

   public fgm<Double> ak() {
      return this.bW;
   }

   public fgm<Double> al() {
      return this.bY;
   }

   public fgm<Double> am() {
      return this.ca;
   }

   public fgm<Double> an() {
      return this.cc;
   }

   public fgm<Double> ao() {
      return this.ce;
   }

   public fgm<Double> ap() {
      return this.cf;
   }

   public fgm<Integer> aq() {
      return this.ch;
   }

   public fgm<fgo> ar() {
      return this.ci;
   }

   public fgm<fgl> as() {
      return this.cj;
   }

   public fgm<String> at() {
      return this.ck;
   }

   public fgn(fgj $$0, File $$1) {
      this.Z = $$0;
      this.bO = new File($$1, "options.txt");
      boolean $$2 = $$0.ah();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.as = new fgm<>(
         "options.renderDistance",
         fgm.a(),
         ($$0x, $$1x) -> a($$0x, xe.a("options.chunks", $$1x)),
         new fgm.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> fgj.Q().f.r()
      );
      this.at = new fgm<>(
         "options.simulationDistance", fgm.a(), ($$0x, $$1x) -> a($$0x, xe.a("options.chunks", $$1x)), new fgm.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
         }
      );
      this.ag = ad.j() == ad.a.c;
      this.au();
   }

   public float a(float $$0) {
      return this.bB.c() ? $$0 : this.r().c().floatValue();
   }

   public int b(float $$0) {
      return (int)(this.a($$0) * 255.0F) << 24 & 0xFF000000;
   }

   public int a(int $$0) {
      return this.bB.c() ? $$0 : (int)(this.aN.c() * 255.0) << 24 & 0xFF000000;
   }

   public void a(fgh $$0, ezx.a $$1) {
      $$0.b($$1);
      this.av();
   }

   private void a(fgn.b $$0) {
      $$0.a("ao", this.aC);
      $$0.a("biomeBlendRadius", this.bd);
      $$0.a("enableVsync", this.bm);
      $$0.a("entityDistanceScaling", this.av);
      $$0.a("entityShadows", this.bn);
      $$0.a("forceUnicodeFont", this.bo);
      $$0.a("japaneseGlyphVariants", this.bp);
      $$0.a("fov", this.bQ);
      $$0.a("fovEffectScale", this.bW);
      $$0.a("darknessEffectScale", this.bY);
      $$0.a("glintSpeed", this.ca);
      $$0.a("glintStrength", this.cc);
      $$0.a("prioritizeChunkUpdates", this.aG);
      $$0.a("fullscreen", this.bD);
      $$0.a("gamma", this.cf);
      $$0.a("graphicsMode", this.aB);
      $$0.a("guiScale", this.ch);
      $$0.a("maxFps", this.aw);
      $$0.a("mipmapLevels", this.bb);
      $$0.a("narrator", this.cj);
      $$0.a("particles", this.ci);
      $$0.a("reducedDebugInfo", this.bv);
      $$0.a("renderClouds", this.ax);
      $$0.a("renderDistance", this.as);
      $$0.a("simulationDistance", this.at);
      $$0.a("screenEffectScale", this.bU);
      $$0.a("soundDevice", this.ck);
   }

   private void a(fgn.a $$0) {
      this.a((fgn.b)$$0);
      $$0.a("autoJump", this.bg);
      $$0.a("operatorItemsTab", this.bh);
      $$0.a("autoSuggestions", this.bi);
      $$0.a("chatColors", this.bj);
      $$0.a("chatLinks", this.bk);
      $$0.a("chatLinksPrompt", this.bl);
      $$0.a("discrete_mouse_scroll", this.br);
      $$0.a("invertYMouse", this.bq);
      $$0.a("realmsNotifications", this.bs);
      $$0.a("showSubtitles", this.bx);
      $$0.a("directionalAudio", this.bA);
      $$0.a("touchscreen", this.bC);
      $$0.a("bobView", this.bE);
      $$0.a("toggleCrouch", this.bH);
      $$0.a("toggleSprint", this.bI);
      $$0.a("darkMojangStudiosBackground", this.am);
      $$0.a("hideLightningFlashes", this.ao);
      $$0.a("hideSplashTexts", this.aq);
      $$0.a("mouseSensitivity", this.ar);
      $$0.a("damageTiltStrength", this.ce);
      $$0.a("highContrast", this.aQ);
      $$0.a("narratorHotkey", this.aR);
      this.i = $$0.a("resourcePacks", this.i, fgn::c, ai::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fgn::c, ai::toJson);
      this.ab = $$0.a("lastServer", this.ab);
      this.ae = $$0.a("lang", this.ae);
      $$0.a("chatVisibility", this.aH);
      $$0.a("chatOpacity", this.aI);
      $$0.a("chatLineSpacing", this.aJ);
      $$0.a("textBackgroundOpacity", this.aN);
      $$0.a("backgroundForChatOnly", this.bB);
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
      this.r = $$0.a("tutorialStep", this.r, gwv::a, gwv::a);
      $$0.a("mouseWheelSensitivity", this.be);
      $$0.a("rawMouseInput", this.bf);
      this.u = $$0.a("glDebugVerbosity", this.u);
      this.v = $$0.a("skipMultiplayerWarning", this.v);
      this.w = $$0.a("skipRealms32bitWarning", this.w);
      $$0.a("hideMatchedNames", this.bK);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.t = $$0.a("hideBundleTutorial", this.t);
      this.ag = $$0.a("syncChunkWrites", this.ag);
      $$0.a("showAutosaveIndicator", this.bL);
      $$0.a("allowServerListing", this.bu);
      $$0.a("onlyShowSecureChat", this.bN);
      $$0.a("panoramaScrollSpeed", this.aO);
      $$0.a("telemetryOptInExtra", this.bS);
      this.af = $$0.a("onboardAccessibility", this.af);
      $$0.a("menuBackgroundBlurriness", this.aM);

      for (fgh $$1 : this.Y) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(ezx.a($$3));
         }
      }

      for (avq $$4 : avq.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bw.get($$4));
      }

      for (clz $$5 : clz.values()) {
         boolean $$6 = this.aS.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.b($$5, $$7);
         }
      }
   }

   public void au() {
      try {
         if (!this.bO.exists()) {
            return;
         }

         uk $$0 = new uk();

         try (BufferedReader $$1 = Files.newReader(this.bO, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = ak.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  ah.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final uk $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(fgc.b);
            } else {
               this.aB.a(fgc.a);
            }
         }

         this.a(new fgn.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, fgm<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fgn.ah.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fgn.ah.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fgn.a($$2) : $$1;
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
               } else if (fgn.a($$2)) {
                  return 1.0F;
               } else if (fgn.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fgn.ah.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         if (this.Z.aP() != null) {
            this.Z.aP().a(this.aw.c());
         }

         fgh.d();
      } catch (Exception var7) {
         ah.error("Failed to load options", var7);
      }
   }

   static boolean a(String $$0) {
      return "true".equals($$0);
   }

   static boolean b(String $$0) {
      return "false".equals($$0);
   }

   private uk a(uk $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return azs.e.a(this.Z.at(), $$0, $$1);
   }

   public void av() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bO), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fgn.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fgm<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> fgn.ah.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(fgn.ai.toJson($$2x));
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
         if (this.Z.aP().f().isPresent()) {
            $$0.println("fullscreenResolution:" + this.Z.aP().f().get().g());
         }
      } catch (Exception var6) {
         ah.error("Failed to save options", var6);
      }

      this.ax();
   }

   public aqi aw() {
      int $$0 = 0;

      for (clz $$1 : this.aS) {
         $$0 |= $$1.a();
      }

      return new aqi(this.ae, this.as.c(), this.aH.c(), this.bj.c(), $$0, this.aT.c(), this.Z.aT(), this.bu.c());
   }

   public void ax() {
      if (this.Z.s != null) {
         this.Z.s.h.b(new aad(this.aw()));
      }
   }

   private void b(clz $$0, boolean $$1) {
      if ($$1) {
         this.aS.add($$0);
      } else {
         this.aS.remove($$0);
      }
   }

   public boolean a(clz $$0) {
      return this.aS.contains($$0);
   }

   public void a(clz $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ax();
   }

   public ffx ay() {
      return this.aD() >= 4 ? this.ax.c() : ffx.a;
   }

   public boolean az() {
      return this.q;
   }

   public void b(ato $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         atl $$4 = $$0.c($$3);
         if ($$4 == null && !$$3.startsWith("file/")) {
            $$4 = $$0.c("file/" + $$3);
         }

         if ($$4 == null) {
            ah.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", $$3);
            $$2.remove();
         } else if (!$$4.d().a() && !this.j.contains($$3)) {
            ah.warn("Removed resource pack {} from options because it is no longer compatible", $$3);
            $$2.remove();
         } else if ($$4.d().a() && this.j.contains($$3)) {
            ah.info("Removed resource pack {} from incompatibility list because it's now compatible", $$3);
            this.j.remove($$3);
         } else {
            $$1.add($$4.g());
         }
      }

      $$0.a($$1);
   }

   public ffv aA() {
      return this.bP;
   }

   public void a(ffv $$0) {
      this.bP = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = ayc.a(ai, $$0, aj);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aB() {
      return this.bO;
   }

   public String aC() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fgn.b() {
         @Override
         public <T> void a(String $$0x, fgm<T> $$1) {
            $$0.add(Pair.of($$0, $$1.c()));
         }
      });
      $$0.add(Pair.of("fullscreenResolution", String.valueOf(this.k)));
      $$0.add(Pair.of("glDebugVerbosity", this.u));
      $$0.add(Pair.of("overrideHeight", this.p));
      $$0.add(Pair.of("overrideWidth", this.o));
      $$0.add(Pair.of("syncChunkWrites", this.ag));
      $$0.add(Pair.of("useNativeTransport", this.q));
      $$0.add(Pair.of("resourcePacks", this.i));
      return $$0.stream()
         .sorted(Comparator.comparing(Pair::getFirst))
         .map($$0x -> (String)$$0x.getFirst() + ": " + $$0x.getSecond())
         .collect(Collectors.joining(System.lineSeparator()));
   }

   public void b(int $$0) {
      this.au = $$0;
   }

   public int aD() {
      return this.au > 0 ? Math.min(this.as.c(), this.au) : this.as.c();
   }

   private static xe b(xe $$0, int $$1) {
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

   interface a extends fgn.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fgm<T> var2);
   }
}
