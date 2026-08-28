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

public class fgm {
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
   private static final wy aj = wy.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fgl<Boolean> ak = fgl.a("options.darkMojangStudiosBackgroundColor", fgl.a(aj), false);
   private static final wy al = wy.c("options.hideLightningFlashes.tooltip");
   private final fgl<Boolean> am = fgl.a("options.hideLightningFlashes", fgl.a(al), false);
   private static final wy an = wy.c("options.hideSplashTexts.tooltip");
   private final fgl<Boolean> ao = fgl.a("options.hideSplashTexts", fgl.a(an), false);
   private final fgl<Double> ap = new fgl<>("options.sensitivity", fgl.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wy.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wy.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fgl.m.a, 0.5, $$0x -> {
   });
   private final fgl<Integer> aq;
   private final fgl<Integer> ar;
   private int as = 0;
   private final fgl<Double> at = new fgl<>(
      "options.entityDistanceScaling",
      fgl.a(),
      fgm::a,
      new fgl.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fgl<Integer> au = new fgl<>(
      "options.framerateLimit",
      fgl.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wy.c("options.framerateLimit.max")) : a($$0x, wy.a("options.framerate", $$1x)),
      new fgl.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fgi.Q().aM().a($$0x)
   );
   private final fgl<ffv> av = new fgl<>(
      "options.renderClouds",
      fgl.a(),
      fgl.b(),
      new fgl.e<>(Arrays.asList(ffv.values()), Codec.withAlternative(ffv.d, Codec.BOOL, $$0x -> $$0x ? ffv.c : ffv.a)),
      ffv.c,
      $$0x -> {
         if (fgi.O()) {
            ezp $$1x = fgi.Q().f.x();
            if ($$1x != null) {
               $$1x.b(fgi.a);
            }
         }
      }
   );
   private static final wy aw = wy.c("options.graphics.fast.tooltip");
   private static final wy ax = wy.a("options.graphics.fabulous.tooltip", wy.c("options.graphics.fabulous").a(n.u));
   private static final wy ay = wy.c("options.graphics.fancy.tooltip");
   private final fgl<fgb> az = new fgl<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fjr.a(ay);
            case a -> fjr.a(aw);
            case c -> fjr.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         xm $$2x = wy.c($$1x.b());
         return $$1x == fgb.c ? $$2x.a(n.u) : $$2x;
      },
      new fgl.a<>(
         Arrays.asList(fgb.values()),
         Stream.of(fgb.values()).filter($$0x -> $$0x != fgb.c).collect(Collectors.toList()),
         () -> fgi.Q().r() && fgi.Q().ai().h(),
         ($$0x, $$1x) -> {
            fgi $$2x = fgi.Q();
            gen $$3 = $$2x.ai();
            if ($$1x == fgb.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(fgb::a, fgb::a)
      ),
      fgb.b,
      $$0x -> {
      }
   );
   private final fgl<Boolean> aA = fgl.a("options.ao", true, $$0x -> fgi.Q().f.f());
   private static final wy aB = wy.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wy aC = wy.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wy aD = wy.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fgl<fgp> aE = new fgl<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fjr.a(aB);
         case b -> fjr.a(aC);
         case c -> fjr.a(aD);
      };
   }, fgl.b(), new fgl.e<>(Arrays.asList(fgp.values()), Codec.INT.xmap(fgp::a, fgp::a)), fgp.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fgl<cmt> aF = new fgl<>(
      "options.chat.visibility", fgl.a(), fgl.b(), new fgl.e<>(Arrays.asList(cmt.values()), Codec.INT.xmap(cmt::a, cmt::a)), cmt.a, $$0x -> {
      }
   );
   private final fgl<Double> aG = new fgl<>("options.chat.opacity", fgl.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fgl.m.a, 1.0, $$0x -> fgi.Q().l.d().b());
   private final fgl<Double> aH = new fgl<>("options.chat.line_spacing", fgl.a(), fgm::a, fgl.m.a, 0.0, $$0x -> {
   });
   private static final wy aI = wy.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aJ = 5;
   private final fgl<Integer> aK = new fgl<>("options.accessibility.menu_background_blurriness", fgl.a(aI), fgm::b, new fgl.f(0, 10), 5, $$0x -> {
   });
   private final fgl<Double> aL = new fgl<>("options.accessibility.text_background_opacity", fgl.a(), fgm::a, fgl.m.a, 0.5, $$0x -> fgi.Q().l.d().b());
   private final fgl<Double> aM = new fgl<>("options.accessibility.panorama_speed", fgl.a(), fgm::a, fgl.m.a, 1.0, $$0x -> {
   });
   private static final wy aN = wy.c("options.accessibility.high_contrast.tooltip");
   private final fgl<Boolean> aO = fgl.a("options.accessibility.high_contrast", fgl.a(aN), false, $$0x -> {
      ato $$1x = fgi.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final fgl<Boolean> aP = fgl.a(
      "options.accessibility.narrator_hotkey",
      fgl.a(fgi.a ? wy.c("options.accessibility.narrator_hotkey.mac.tooltip") : wy.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cmw> aQ = EnumSet.allOf(cmw.class);
   private final fgl<btf> aR = new fgl<>("options.mainHand", fgl.a(), fgl.b(), new fgl.e<>(Arrays.asList(btf.values()), btf.c), btf.b, $$0x -> this.ax());
   public int o;
   public int p;
   private final fgl<Double> aS = new fgl<>(
      "options.chat.scale",
      fgl.a(),
      ($$0x, $$1x) -> (wy)($$1x == 0.0 ? wx.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fgl.m.a,
      1.0,
      $$0x -> fgi.Q().l.d().b()
   );
   private final fgl<Double> aT = new fgl<>("options.chat.width", fgl.a(), ($$0x, $$1x) -> c($$0x, fih.a($$1x)), fgl.m.a, 1.0, $$0x -> fgi.Q().l.d().b());
   private final fgl<Double> aU = new fgl<>(
      "options.chat.height.unfocused", fgl.a(), ($$0x, $$1x) -> c($$0x, fih.b($$1x)), fgl.m.a, fih.i(), $$0x -> fgi.Q().l.d().b()
   );
   private final fgl<Double> aV = new fgl<>(
      "options.chat.height.focused", fgl.a(), ($$0x, $$1x) -> c($$0x, fih.b($$1x)), fgl.m.a, 1.0, $$0x -> fgi.Q().l.d().b()
   );
   private final fgl<Double> aW = new fgl<>(
      "options.chat.delay_instant",
      fgl.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wy.c("options.chat.delay_none") : wy.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fgl.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fgi.Q().aW().a($$0x)
   );
   private static final wy aX = wy.c("options.notifications.display_time.tooltip");
   private final fgl<Double> aY = new fgl<>(
      "options.notifications.display_time",
      fgl.a(aX),
      ($$0x, $$1x) -> a($$0x, wy.a("options.multiplier", $$1x)),
      new fgl.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fgl<Integer> aZ = new fgl<>(
      "options.mipmapLevels", fgl.a(), ($$0x, $$1x) -> (wy)($$1x == 0 ? wx.a($$0x, false) : a($$0x, $$1x.intValue())), new fgl.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fgl<ffr> ba = new fgl<>(
      "options.attackIndicator", fgl.a(), fgl.b(), new fgl.e<>(Arrays.asList(ffr.values()), Codec.INT.xmap(ffr::a, ffr::a)), ffr.b, $$0x -> {
      }
   );
   public gwd r = gwd.a;
   public boolean s = false;
   public boolean t = false;
   private final fgl<Integer> bb = new fgl<>("options.biomeBlendRadius", fgl.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wy.c("options.biomeBlendRadius." + $$2x));
   }, new fgl.f(0, 7, false), 2, $$0x -> fgi.Q().f.f());
   private final fgl<Double> bc = new fgl<>(
      "options.mouseWheelSensitivity",
      fgl.a(),
      ($$0x, $$1x) -> a($$0x, wy.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fgl.f(-200, 100).a(fgm::c, fgm::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fgl<Boolean> bd = fgl.a("options.rawMouseInput", true, $$0x -> {
      fag $$1x = fgi.Q().aM();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final fgl<Boolean> be = fgl.a("options.autoJump", false);
   private final fgl<Boolean> bf = fgl.a("options.operatorItemsTab", false);
   private final fgl<Boolean> bg = fgl.a("options.autoSuggestCommands", true);
   private final fgl<Boolean> bh = fgl.a("options.chat.color", true);
   private final fgl<Boolean> bi = fgl.a("options.chat.links", true);
   private final fgl<Boolean> bj = fgl.a("options.chat.links.prompt", true);
   private final fgl<Boolean> bk = fgl.a("options.vsync", true, $$0x -> {
      if (fgi.Q().aM() != null) {
         fgi.Q().aM().a($$0x);
      }
   });
   private final fgl<Boolean> bl = fgl.a("options.entityShadows", true);
   private final fgl<Boolean> bm = fgl.a("options.forceUnicodeFont", false, $$0x -> aE());
   private final fgl<Boolean> bn = fgl.a("options.japaneseGlyphVariants", fgl.a(wy.c("options.japaneseGlyphVariants.tooltip")), aF(), $$0x -> aE());
   private final fgl<Boolean> bo = fgl.a("options.invertMouse", false);
   private final fgl<Boolean> bp = fgl.a("options.discrete_mouse_scroll", false);
   private static final wy bq = wy.c("options.realmsNotifications.tooltip");
   private final fgl<Boolean> br = fgl.a("options.realmsNotifications", fgl.a(bq), true);
   private static final wy bs = wy.c("options.allowServerListing.tooltip");
   private final fgl<Boolean> bt = fgl.a("options.allowServerListing", fgl.a(bs), true, $$0x -> this.ax());
   private final fgl<Boolean> bu = fgl.a("options.reducedDebugInfo", false);
   private final Map<avp, fgl<Double>> bv = ad.a(new EnumMap<>(avp.class), $$0x -> {
      for (avp $$1x : avp.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fgl<Boolean> bw = fgl.a("options.showSubtitles", false);
   private static final wy bx = wy.c("options.directionalAudio.on.tooltip");
   private static final wy by = wy.c("options.directionalAudio.off.tooltip");
   private final fgl<Boolean> bz = fgl.a("options.directionalAudio", $$0x -> $$0x ? fjr.a(bx) : fjr.a(by), false, $$0x -> {
      guy $$1x = fgi.Q().aj();
      $$1x.k();
      $$1x.a(gto.a(avo.Ar, 1.0F));
   });
   private final fgl<Boolean> bA = new fgl<>(
      "options.accessibility.text_background",
      fgl.a(),
      ($$0x, $$1x) -> $$1x ? wy.c("options.accessibility.text_background.chat") : wy.c("options.accessibility.text_background.everywhere"),
      fgl.a,
      true,
      $$0x -> {
      }
   );
   private final fgl<Boolean> bB = fgl.a("options.touchscreen", false);
   private final fgl<Boolean> bC = fgl.a("options.fullscreen", false, $$0x -> {
      fgi $$1x = fgi.Q();
      if ($$1x.aM() != null && $$1x.aM().k() != $$0x) {
         $$1x.aM().i();
         this.aa().a($$1x.aM().k());
      }
   });
   private final fgl<Boolean> bD = fgl.a("options.viewBobbing", true);
   private static final wy bE = wy.c("options.key.toggle");
   private static final wy bF = wy.c("options.key.hold");
   private final fgl<Boolean> bG = new fgl<>("key.sneak", fgl.a(), ($$0x, $$1x) -> $$1x ? bE : bF, fgl.a, false, $$0x -> {
   });
   private final fgl<Boolean> bH = new fgl<>("key.sprint", fgl.a(), ($$0x, $$1x) -> $$1x ? bE : bF, fgl.a, false, $$0x -> {
   });
   public boolean v;
   private static final wy bI = wy.c("options.hideMatchedNames.tooltip");
   private final fgl<Boolean> bJ = fgl.a("options.hideMatchedNames", fgl.a(bI), true);
   private final fgl<Boolean> bK = fgl.a("options.autosaveIndicator", true);
   private static final wy bL = wy.c("options.onlyShowSecureChat.tooltip");
   private final fgl<Boolean> bM = fgl.a("options.onlyShowSecureChat", fgl.a(bL), false);
   public final fgg w = new fgg("key.forward", 87, "key.categories.movement");
   public final fgg x = new fgg("key.left", 65, "key.categories.movement");
   public final fgg y = new fgg("key.back", 83, "key.categories.movement");
   public final fgg z = new fgg("key.right", 68, "key.categories.movement");
   public final fgg A = new fgg("key.jump", 32, "key.categories.movement");
   public final fgg B = new fgu("key.sneak", 340, "key.categories.movement", this.bG::c);
   public final fgg C = new fgu("key.sprint", 341, "key.categories.movement", this.bH::c);
   public final fgg D = new fgg("key.inventory", 69, "key.categories.inventory");
   public final fgg E = new fgg("key.swapOffhand", 70, "key.categories.inventory");
   public final fgg F = new fgg("key.drop", 81, "key.categories.inventory");
   public final fgg G = new fgg("key.use", ezy.b.c, 1, "key.categories.gameplay");
   public final fgg H = new fgg("key.attack", ezy.b.c, 0, "key.categories.gameplay");
   public final fgg I = new fgg("key.pickItem", ezy.b.c, 2, "key.categories.gameplay");
   public final fgg J = new fgg("key.chat", 84, "key.categories.multiplayer");
   public final fgg K = new fgg("key.playerlist", 258, "key.categories.multiplayer");
   public final fgg L = new fgg("key.command", 47, "key.categories.multiplayer");
   public final fgg M = new fgg("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fgg N = new fgg("key.screenshot", 291, "key.categories.misc");
   public final fgg O = new fgg("key.togglePerspective", 294, "key.categories.misc");
   public final fgg P = new fgg("key.smoothCamera", ezy.bv.b(), "key.categories.misc");
   public final fgg Q = new fgg("key.fullscreen", 300, "key.categories.misc");
   public final fgg R = new fgg("key.spectatorOutlines", ezy.bv.b(), "key.categories.misc");
   public final fgg S = new fgg("key.advancements", 76, "key.categories.misc");
   public final fgg[] T = new fgg[]{
      new fgg("key.hotbar.1", 49, "key.categories.inventory"),
      new fgg("key.hotbar.2", 50, "key.categories.inventory"),
      new fgg("key.hotbar.3", 51, "key.categories.inventory"),
      new fgg("key.hotbar.4", 52, "key.categories.inventory"),
      new fgg("key.hotbar.5", 53, "key.categories.inventory"),
      new fgg("key.hotbar.6", 54, "key.categories.inventory"),
      new fgg("key.hotbar.7", 55, "key.categories.inventory"),
      new fgg("key.hotbar.8", 56, "key.categories.inventory"),
      new fgg("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fgg U = new fgg("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fgg V = new fgg("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fgg[] W = (fgg[])ArrayUtils.addAll(
      new fgg[]{
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
   protected fgi X;
   private final File bN;
   public boolean Y;
   private fft bO = fft.a;
   public String Z = "";
   public boolean aa;
   private final fgl<Integer> bP = new fgl<>("options.fov", fgl.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wy.c("options.fov.min"));
         case 110 -> a($$0x, wy.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fgl.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fgi.Q().f.r());
   private static final wy bQ = wy.a("options.telemetry.button.tooltip", wy.c("options.telemetry.state.minimal"), wy.c("options.telemetry.state.all"));
   private final fgl<Boolean> bR = fgl.a("options.telemetry.button", fgl.a(bQ), ($$0x, $$1x) -> {
      fgi $$2x = fgi.Q();
      if (!$$2x.E()) {
         return wy.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wy.c("options.telemetry.state.all") : wy.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wy bS = wy.c("options.screenEffectScale.tooltip");
   private final fgl<Double> bT = new fgl<>("options.screenEffectScale", fgl.a(bS), fgm::b, fgl.m.a, 1.0, $$0x -> {
   });
   private static final wy bU = wy.c("options.fovEffectScale.tooltip");
   private final fgl<Double> bV = new fgl<>(
      "options.fovEffectScale", fgl.a(bU), fgm::b, fgl.m.a.a(ayn::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final wy bW = wy.c("options.darknessEffectScale.tooltip");
   private final fgl<Double> bX = new fgl<>("options.darknessEffectScale", fgl.a(bW), fgm::b, fgl.m.a.a(ayn::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final wy bY = wy.c("options.glintSpeed.tooltip");
   private final fgl<Double> bZ = new fgl<>("options.glintSpeed", fgl.a(bY), fgm::b, fgl.m.a, 0.5, $$0x -> {
   });
   private static final wy ca = wy.c("options.glintStrength.tooltip");
   private final fgl<Double> cb = new fgl<>("options.glintStrength", fgl.a(ca), fgm::b, fgl.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final wy cc = wy.c("options.damageTiltStrength.tooltip");
   private final fgl<Double> cd = new fgl<>("options.damageTiltStrength", fgl.a(cc), fgm::b, fgl.m.a, 1.0, $$0x -> {
   });
   private final fgl<Double> ce = new fgl<>("options.gamma", fgl.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wy.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wy.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wy.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fgl.m.a, 0.5, $$0x -> {
   });
   public static final int ab = 0;
   private static final int cf = 2147483646;
   private final fgl<Integer> cg = new fgl<>(
      "options.guiScale", fgl.a(), ($$0x, $$1x) -> $$1x == 0 ? wy.c("options.guiScale.auto") : wy.b(Integer.toString($$1x)), new fgl.c(0, () -> {
         fgi $$0x = fgi.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aM().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.X.a()
   );
   private final fgl<fgn> ch = new fgl<>(
      "options.particles", fgl.a(), fgl.b(), new fgl.e<>(Arrays.asList(fgn.values()), Codec.INT.xmap(fgn::a, fgn::a)), fgn.a, $$0x -> {
      }
   );
   private final fgl<fgk> ci = new fgl<>(
      "options.narrator",
      fgl.a(),
      ($$0x, $$1x) -> (wy)(this.X.aV().a() ? $$1x.b() : wy.c("options.narrator.notavailable")),
      new fgl.e<>(Arrays.asList(fgk.values()), Codec.INT.xmap(fgk::a, fgk::a)),
      fgk.a,
      $$0x -> this.X.aV().a($$0x)
   );
   public String ac = "en_us";
   private final fgl<String> cj = new fgl<>(
      "options.audioDevice",
      fgl.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wy.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wy.b($$1x.substring(guv.c)) : wy.b($$1x);
         }
      },
      new fgl.h<>(
         () -> Stream.concat(Stream.of(""), fgi.Q().aj().a().stream()).toList(),
         $$0x -> fgi.Q().r() && $$0x != "" && !fgi.Q().aj().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         guy $$1x = fgi.Q().aj();
         $$1x.k();
         $$1x.a(gto.a(avo.Ar, 1.0F));
      }
   );
   public boolean ad = true;
   public boolean ae;

   public fgl<Boolean> a() {
      return this.ak;
   }

   public fgl<Boolean> b() {
      return this.am;
   }

   public fgl<Boolean> c() {
      return this.ao;
   }

   public fgl<Double> d() {
      return this.ap;
   }

   public fgl<Integer> e() {
      return this.aq;
   }

   public fgl<Integer> f() {
      return this.ar;
   }

   public fgl<Double> g() {
      return this.at;
   }

   public fgl<Integer> h() {
      return this.au;
   }

   public fgl<ffv> i() {
      return this.av;
   }

   public fgl<fgb> j() {
      return this.az;
   }

   public fgl<Boolean> k() {
      return this.aA;
   }

   public fgl<fgp> l() {
      return this.aE;
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
         this.X.l();
      }
   }

   public fgl<cmt> m() {
      return this.aF;
   }

   public fgl<Double> n() {
      return this.aG;
   }

   public fgl<Double> o() {
      return this.aH;
   }

   public fgl<Integer> p() {
      return this.aK;
   }

   public int q() {
      return this.p().c();
   }

   public fgl<Double> r() {
      return this.aL;
   }

   public fgl<Double> s() {
      return this.aM;
   }

   public fgl<Boolean> t() {
      return this.aO;
   }

   public fgl<Boolean> u() {
      return this.aP;
   }

   public fgl<btf> v() {
      return this.aR;
   }

   public fgl<Double> w() {
      return this.aS;
   }

   public fgl<Double> x() {
      return this.aT;
   }

   public fgl<Double> y() {
      return this.aU;
   }

   public fgl<Double> z() {
      return this.aV;
   }

   public fgl<Double> A() {
      return this.aW;
   }

   public fgl<Double> B() {
      return this.aY;
   }

   public fgl<Integer> C() {
      return this.aZ;
   }

   public fgl<ffr> D() {
      return this.ba;
   }

   public fgl<Integer> E() {
      return this.bb;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ayn.a(Math.log10($$0) * 100.0);
   }

   public fgl<Double> F() {
      return this.bc;
   }

   public fgl<Boolean> G() {
      return this.bd;
   }

   public fgl<Boolean> H() {
      return this.be;
   }

   public fgl<Boolean> I() {
      return this.bf;
   }

   public fgl<Boolean> J() {
      return this.bg;
   }

   public fgl<Boolean> K() {
      return this.bh;
   }

   public fgl<Boolean> L() {
      return this.bi;
   }

   public fgl<Boolean> M() {
      return this.bj;
   }

   public fgl<Boolean> N() {
      return this.bk;
   }

   public fgl<Boolean> O() {
      return this.bl;
   }

   private static void aE() {
      fgi $$0 = fgi.Q();
      if ($$0.aM() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fgl<Boolean> P() {
      return this.bm;
   }

   private static boolean aF() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fgl<Boolean> Q() {
      return this.bn;
   }

   public fgl<Boolean> R() {
      return this.bo;
   }

   public fgl<Boolean> S() {
      return this.bp;
   }

   public fgl<Boolean> T() {
      return this.br;
   }

   public fgl<Boolean> U() {
      return this.bt;
   }

   public fgl<Boolean> V() {
      return this.bu;
   }

   public final float a(avp $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fgl<Double> b(avp $$0) {
      return Objects.requireNonNull(this.bv.get($$0));
   }

   private fgl<Double> a(String $$0, avp $$1) {
      return new fgl<>($$0, fgl.a(), fgm::b, fgl.m.a, 1.0, $$1x -> fgi.Q().aj().a($$1, $$1x.floatValue()));
   }

   public fgl<Boolean> W() {
      return this.bw;
   }

   public fgl<Boolean> X() {
      return this.bz;
   }

   public fgl<Boolean> Y() {
      return this.bA;
   }

   public fgl<Boolean> Z() {
      return this.bB;
   }

   public fgl<Boolean> aa() {
      return this.bC;
   }

   public fgl<Boolean> ab() {
      return this.bD;
   }

   public fgl<Boolean> ac() {
      return this.bG;
   }

   public fgl<Boolean> ad() {
      return this.bH;
   }

   public fgl<Boolean> ae() {
      return this.bJ;
   }

   public fgl<Boolean> af() {
      return this.bK;
   }

   public fgl<Boolean> ag() {
      return this.bM;
   }

   public fgl<Integer> ah() {
      return this.bP;
   }

   public fgl<Boolean> ai() {
      return this.bR;
   }

   public fgl<Double> aj() {
      return this.bT;
   }

   public fgl<Double> ak() {
      return this.bV;
   }

   public fgl<Double> al() {
      return this.bX;
   }

   public fgl<Double> am() {
      return this.bZ;
   }

   public fgl<Double> an() {
      return this.cb;
   }

   public fgl<Double> ao() {
      return this.cd;
   }

   public fgl<Double> ap() {
      return this.ce;
   }

   public fgl<Integer> aq() {
      return this.cg;
   }

   public fgl<fgn> ar() {
      return this.ch;
   }

   public fgl<fgk> as() {
      return this.ci;
   }

   public fgl<String> at() {
      return this.cj;
   }

   public fgm(fgi $$0, File $$1) {
      this.X = $$0;
      this.bN = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new fgl<>(
         "options.renderDistance",
         fgl.a(),
         ($$0x, $$1x) -> a($$0x, wy.a("options.chunks", $$1x)),
         new fgl.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fgi.Q().f.r()
      );
      this.ar = new fgl<>(
         "options.simulationDistance", fgl.a(), ($$0x, $$1x) -> a($$0x, wy.a("options.chunks", $$1x)), new fgl.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ae = ad.k() == ad.a.c;
      this.au();
   }

   public float a(float $$0) {
      return this.bA.c() ? $$0 : this.r().c().floatValue();
   }

   public int b(float $$0) {
      return (int)(this.a($$0) * 255.0F) << 24 & 0xFF000000;
   }

   public int a(int $$0) {
      return this.bA.c() ? $$0 : (int)(this.aL.c() * 255.0) << 24 & 0xFF000000;
   }

   public void a(fgg $$0, ezy.a $$1) {
      $$0.b($$1);
      this.av();
   }

   private void a(fgm.b $$0) {
      $$0.a("ao", this.aA);
      $$0.a("biomeBlendRadius", this.bb);
      $$0.a("enableVsync", this.bk);
      $$0.a("entityDistanceScaling", this.at);
      $$0.a("entityShadows", this.bl);
      $$0.a("forceUnicodeFont", this.bm);
      $$0.a("japaneseGlyphVariants", this.bn);
      $$0.a("fov", this.bP);
      $$0.a("fovEffectScale", this.bV);
      $$0.a("darknessEffectScale", this.bX);
      $$0.a("glintSpeed", this.bZ);
      $$0.a("glintStrength", this.cb);
      $$0.a("prioritizeChunkUpdates", this.aE);
      $$0.a("fullscreen", this.bC);
      $$0.a("gamma", this.ce);
      $$0.a("graphicsMode", this.az);
      $$0.a("guiScale", this.cg);
      $$0.a("maxFps", this.au);
      $$0.a("mipmapLevels", this.aZ);
      $$0.a("narrator", this.ci);
      $$0.a("particles", this.ch);
      $$0.a("reducedDebugInfo", this.bu);
      $$0.a("renderClouds", this.av);
      $$0.a("renderDistance", this.aq);
      $$0.a("simulationDistance", this.ar);
      $$0.a("screenEffectScale", this.bT);
      $$0.a("soundDevice", this.cj);
   }

   private void a(fgm.a $$0) {
      this.a((fgm.b)$$0);
      $$0.a("autoJump", this.be);
      $$0.a("operatorItemsTab", this.bf);
      $$0.a("autoSuggestions", this.bg);
      $$0.a("chatColors", this.bh);
      $$0.a("chatLinks", this.bi);
      $$0.a("chatLinksPrompt", this.bj);
      $$0.a("discrete_mouse_scroll", this.bp);
      $$0.a("invertYMouse", this.bo);
      $$0.a("realmsNotifications", this.br);
      $$0.a("showSubtitles", this.bw);
      $$0.a("directionalAudio", this.bz);
      $$0.a("touchscreen", this.bB);
      $$0.a("bobView", this.bD);
      $$0.a("toggleCrouch", this.bG);
      $$0.a("toggleSprint", this.bH);
      $$0.a("darkMojangStudiosBackground", this.ak);
      $$0.a("hideLightningFlashes", this.am);
      $$0.a("hideSplashTexts", this.ao);
      $$0.a("mouseSensitivity", this.ap);
      $$0.a("damageTiltStrength", this.cd);
      $$0.a("highContrast", this.aO);
      $$0.a("narratorHotkey", this.aP);
      this.i = $$0.a("resourcePacks", this.i, fgm::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fgm::c, ag::toJson);
      this.Z = $$0.a("lastServer", this.Z);
      this.ac = $$0.a("lang", this.ac);
      $$0.a("chatVisibility", this.aF);
      $$0.a("chatOpacity", this.aG);
      $$0.a("chatLineSpacing", this.aH);
      $$0.a("textBackgroundOpacity", this.aL);
      $$0.a("backgroundForChatOnly", this.bA);
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
      this.r = $$0.a("tutorialStep", this.r, gwd::a, gwd::a);
      $$0.a("mouseWheelSensitivity", this.bc);
      $$0.a("rawMouseInput", this.bd);
      this.u = $$0.a("glDebugVerbosity", this.u);
      this.v = $$0.a("skipMultiplayerWarning", this.v);
      $$0.a("hideMatchedNames", this.bJ);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.t = $$0.a("hideBundleTutorial", this.t);
      this.ae = $$0.a("syncChunkWrites", this.ae);
      $$0.a("showAutosaveIndicator", this.bK);
      $$0.a("allowServerListing", this.bt);
      $$0.a("onlyShowSecureChat", this.bM);
      $$0.a("panoramaScrollSpeed", this.aM);
      $$0.a("telemetryOptInExtra", this.bR);
      this.ad = $$0.a("onboardAccessibility", this.ad);
      $$0.a("menuBackgroundBlurriness", this.aK);

      for (fgg $$1 : this.W) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(ezy.a($$3));
         }
      }

      for (avp $$4 : avp.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bv.get($$4));
      }

      for (cmw $$5 : cmw.values()) {
         boolean $$6 = this.aQ.contains($$5);
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
                  Iterator<String> $$2x = ai.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  af.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final ua $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.az.a(fgb.b);
            } else {
               this.az.a(fgb.a);
            }
         }

         this.a(new fgm.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).s_() : null;
            }

            @Override
            public <T> void a(String $$0, fgl<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fgm.af.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fgm.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fgm.a($$2) : $$1;
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
               } else if (fgm.a($$2)) {
                  return 1.0F;
               } else if (fgm.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fgm.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fgg.d();
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
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return azv.e.a(this.X.as(), $$0, $$1);
   }

   public void av() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bN), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fgm.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fgl<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> fgm.af.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(fgm.ag.toJson($$2));
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
         if (this.X.aM().g().isPresent()) {
            $$0.println("fullscreenResolution:" + this.X.aM().g().get().g());
         }
      } catch (Exception var6) {
         af.error("Failed to save options", var6);
      }

      this.ax();
   }

   public aqg aw() {
      int $$0 = 0;

      for (cmw $$1 : this.aQ) {
         $$0 |= $$1.a();
      }

      return new aqg(this.ac, this.aq.c(), this.aF.c(), this.bh.c(), $$0, this.aR.c(), this.X.aQ(), this.bt.c());
   }

   public void ax() {
      if (this.X.s != null) {
         this.X.s.h.b(new zz(this.aw()));
      }
   }

   private void b(cmw $$0, boolean $$1) {
      if ($$1) {
         this.aQ.add($$0);
      } else {
         this.aQ.remove($$0);
      }
   }

   public boolean a(cmw $$0) {
      return this.aQ.contains($$0);
   }

   public void a(cmw $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ax();
   }

   public ffv ay() {
      return this.aD() >= 4 ? this.av.c() : ffv.a;
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

   public fft aA() {
      return this.bO;
   }

   public void a(fft $$0) {
      this.bO = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = ayd.a(ag, $$0, ah);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aB() {
      return this.bN;
   }

   public String aC() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fgm.b() {
         @Override
         public <T> void a(String $$0x, fgl<T> $$1) {
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

   private static wy c(wy $$0, int $$1) {
      return wy.a("options.pixel_value", $$0, $$1);
   }

   private static wy a(wy $$0, double $$1) {
      return wy.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static wy a(wy $$0, wy $$1) {
      return wy.a("options.generic_value", $$0, $$1);
   }

   public static wy a(wy $$0, int $$1) {
      return a($$0, wy.b(Integer.toString($$1)));
   }

   public static wy b(wy $$0, int $$1) {
      return $$1 == 0 ? a($$0, wx.c) : a($$0, $$1);
   }

   private static wy b(wy $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, wx.c) : a($$0, $$1);
   }

   interface a extends fgm.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fgl<T> var2);
   }
}
