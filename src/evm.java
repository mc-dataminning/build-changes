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
import java.util.Arrays;
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

public class evm {
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
   private static final float ak = 1.0F;
   public static final String g = "";
   private static final vf al = vf.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final evl<Boolean> am = evl.a("options.darkMojangStudiosBackgroundColor", evl.a(al), false);
   private static final vf an = vf.c("options.hideLightningFlashes.tooltip");
   private final evl<Boolean> ao = evl.a("options.hideLightningFlashes", evl.a(an), false);
   private static final vf ap = vf.c("options.hideSplashTexts.tooltip");
   private final evl<Boolean> aq = evl.a("options.hideSplashTexts", evl.a(ap), false);
   private final evl<Double> ar = new evl<>("options.sensitivity", evl.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, vf.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, vf.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, evl.m.a, 0.5, $$0x -> {
   });
   private final evl<Integer> as;
   private final evl<Integer> at;
   private int au = 0;
   private final evl<Double> av = new evl<>(
      "options.entityDistanceScaling",
      evl.a(),
      evm::a,
      new evl.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final evl<Integer> aw = new evl<>(
      "options.framerateLimit",
      evl.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, vf.c("options.framerateLimit.max")) : a($$0x, vf.a("options.framerate", $$1x)),
      new evl.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> evi.O().aM().a($$0x)
   );
   private final evl<euw> ax = new evl<>(
      "options.renderClouds",
      evl.a(),
      evl.b(),
      new evl.e<>(Arrays.asList(euw.values()), atw.a(euw.d, Codec.BOOL, $$0x -> $$0x ? euw.c : euw.a)),
      euw.c,
      $$0x -> {
         if (evi.M()) {
            eon $$1x = evi.O().f.x();
            if ($$1x != null) {
               $$1x.b(evi.a);
            }
         }
      }
   );
   private static final vf ay = vf.c("options.graphics.fast.tooltip");
   private static final vf az = vf.a("options.graphics.fabulous.tooltip", vf.c("options.graphics.fabulous").a(n.u));
   private static final vf aA = vf.c("options.graphics.fancy.tooltip");
   private final evl<evb> aB = new evl<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> eyr.a(aA);
            case a -> eyr.a(ay);
            case c -> eyr.a(az);
         };
      },
      ($$0x, $$1x) -> {
         vt $$2x = vf.c($$1x.b());
         return $$1x == evb.c ? $$2x.a(n.u) : $$2x;
      },
      new evl.a<>(
         Arrays.asList(evb.values()),
         Stream.of(evb.values()).filter($$0x -> $$0x != evb.c).collect(Collectors.toList()),
         () -> evi.O().q() && evi.O().ah().h(),
         ($$0x, $$1x) -> {
            evi $$2x = evi.O();
            ftb $$3x = $$2x.ah();
            if ($$1x == evb.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(evb::a, evb::a)
      ),
      evb.b,
      $$0x -> {
      }
   );
   private final evl<Boolean> aC = evl.a("options.ao", true, $$0x -> evi.O().f.f());
   private static final vf aD = vf.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final vf aE = vf.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final vf aF = vf.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final evl<evp> aG = new evl<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> eyr.a(aD);
         case b -> eyr.a(aE);
         case c -> eyr.a(aF);
      };
   }, evl.b(), new evl.e<>(Arrays.asList(evp.values()), Codec.INT.xmap(evp::a, evp::a)), evp.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final evl<cfg> aH = new evl<>(
      "options.chat.visibility", evl.a(), evl.b(), new evl.e<>(Arrays.asList(cfg.values()), Codec.INT.xmap(cfg::a, cfg::a)), cfg.a, $$0x -> {
      }
   );
   private final evl<Double> aI = new evl<>("options.chat.opacity", evl.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), evl.m.a, 1.0, $$0x -> evi.O().l.d().b());
   private final evl<Double> aJ = new evl<>("options.chat.line_spacing", evl.a(), evm::a, evl.m.a, 0.0, $$0x -> {
   });
   private final evl<Double> aK = new evl<>("options.accessibility.text_background_opacity", evl.a(), evm::a, evl.m.a, 0.5, $$0x -> evi.O().l.d().b());
   private final evl<Double> aL = new evl<>("options.accessibility.panorama_speed", evl.a(), evm::a, evl.m.a, 1.0, $$0x -> {
   });
   private static final vf aM = vf.c("options.accessibility.high_contrast.tooltip");
   private final evl<Boolean> aN = evl.a("options.accessibility.high_contrast", evl.a(aM), false, $$0x -> {
      apt $$1x = evi.O().aa();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final evl<Boolean> aO = evl.a(
      "options.accessibility.narrator_hotkey",
      evl.a(evi.a ? vf.c("options.accessibility.narrator_hotkey.mac.tooltip") : vf.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cfj> aP = EnumSet.allOf(cfj.class);
   private final evl<bmf> aQ = new evl<>("options.mainHand", evl.a(), evl.b(), new evl.e<>(Arrays.asList(bmf.values()), bmf.c), bmf.b, $$0x -> this.au());
   public int o;
   public int p;
   private final evl<Double> aR = new evl<>(
      "options.chat.scale",
      evl.a(),
      ($$0x, $$1x) -> (vf)($$1x == 0.0 ? ve.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      evl.m.a,
      1.0,
      $$0x -> evi.O().l.d().b()
   );
   private final evl<Double> aS = new evl<>("options.chat.width", evl.a(), ($$0x, $$1x) -> b($$0x, exh.a($$1x)), evl.m.a, 1.0, $$0x -> evi.O().l.d().b());
   private final evl<Double> aT = new evl<>(
      "options.chat.height.unfocused", evl.a(), ($$0x, $$1x) -> b($$0x, exh.b($$1x)), evl.m.a, exh.h(), $$0x -> evi.O().l.d().b()
   );
   private final evl<Double> aU = new evl<>(
      "options.chat.height.focused", evl.a(), ($$0x, $$1x) -> b($$0x, exh.b($$1x)), evl.m.a, 1.0, $$0x -> evi.O().l.d().b()
   );
   private final evl<Double> aV = new evl<>(
      "options.chat.delay_instant",
      evl.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? vf.c("options.chat.delay_none") : vf.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new evl.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> evi.O().aX().a($$0x)
   );
   private static final vf aW = vf.c("options.notifications.display_time.tooltip");
   private final evl<Double> aX = new evl<>(
      "options.notifications.display_time",
      evl.a(aW),
      ($$0x, $$1x) -> a($$0x, vf.a("options.multiplier", $$1x)),
      new evl.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final evl<Integer> aY = new evl<>(
      "options.mipmapLevels", evl.a(), ($$0x, $$1x) -> (vf)($$1x == 0 ? ve.a($$0x, false) : a($$0x, $$1x.intValue())), new evl.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final evl<eus> aZ = new evl<>(
      "options.attackIndicator", evl.a(), evl.b(), new evl.e<>(Arrays.asList(eus.values()), Codec.INT.xmap(eus::a, eus::a)), eus.b, $$0x -> {
      }
   );
   public gkj r = gkj.a;
   public boolean s = false;
   public boolean t = false;
   private final evl<Integer> ba = new evl<>("options.biomeBlendRadius", evl.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, vf.c("options.biomeBlendRadius." + $$2x));
   }, new evl.f(0, 7), 2, $$0x -> evi.O().f.f());
   private final evl<Double> bb = new evl<>(
      "options.mouseWheelSensitivity",
      evl.a(),
      ($$0x, $$1x) -> a($$0x, vf.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new evl.f(-200, 100).a(evm::c, evm::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final evl<Boolean> bc = evl.a("options.rawMouseInput", true, $$0x -> {
      epf $$1x = evi.O().aM();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final evl<Boolean> bd = evl.a("options.autoJump", false);
   private final evl<Boolean> be = evl.a("options.operatorItemsTab", false);
   private final evl<Boolean> bf = evl.a("options.autoSuggestCommands", true);
   private final evl<Boolean> bg = evl.a("options.chat.color", true);
   private final evl<Boolean> bh = evl.a("options.chat.links", true);
   private final evl<Boolean> bi = evl.a("options.chat.links.prompt", true);
   private final evl<Boolean> bj = evl.a("options.vsync", true, $$0x -> {
      if (evi.O().aM() != null) {
         evi.O().aM().a($$0x);
      }
   });
   private final evl<Boolean> bk = evl.a("options.entityShadows", true);
   private final evl<Boolean> bl = evl.a("options.forceUnicodeFont", false, $$0x -> {
      evi $$1x = evi.O();
      if ($$1x.aM() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final evl<Boolean> bm = evl.a("options.invertMouse", false);
   private final evl<Boolean> bn = evl.a("options.discrete_mouse_scroll", false);
   private final evl<Boolean> bo = evl.a("options.realmsNotifications", true);
   private static final vf bp = vf.c("options.allowServerListing.tooltip");
   private final evl<Boolean> bq = evl.a("options.allowServerListing", evl.a(bp), true, $$0x -> this.au());
   private final evl<Boolean> br = evl.a("options.reducedDebugInfo", false);
   private final Map<art, evl<Double>> bs = ac.a(new EnumMap<>(art.class), $$0x -> {
      for (art $$1x : art.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final evl<Boolean> bt = evl.a("options.showSubtitles", false);
   private static final vf bu = vf.c("options.directionalAudio.on.tooltip");
   private static final vf bv = vf.c("options.directionalAudio.off.tooltip");
   private final evl<Boolean> bw = evl.a("options.directionalAudio", $$0x -> $$0x ? eyr.a(bu) : eyr.a(bv), false, $$0x -> {
      gje $$1x = evi.O().ai();
      $$1x.k();
      $$1x.a(ghv.a(ars.zu, 1.0F));
   });
   private final evl<Boolean> bx = new evl<>(
      "options.accessibility.text_background",
      evl.a(),
      ($$0x, $$1x) -> $$1x ? vf.c("options.accessibility.text_background.chat") : vf.c("options.accessibility.text_background.everywhere"),
      evl.a,
      true,
      $$0x -> {
      }
   );
   private final evl<Boolean> by = evl.a("options.touchscreen", false);
   private final evl<Boolean> bz = evl.a("options.fullscreen", false, $$0x -> {
      evi $$1x = evi.O();
      if ($$1x.aM() != null && $$1x.aM().j() != $$0x) {
         $$1x.aM().h();
         this.X().a($$1x.aM().j());
      }
   });
   private final evl<Boolean> bA = evl.a("options.viewBobbing", true);
   private static final vf bB = vf.c("options.key.toggle");
   private static final vf bC = vf.c("options.key.hold");
   private final evl<Boolean> bD = new evl<>("key.sneak", evl.a(), ($$0x, $$1x) -> $$1x ? bB : bC, evl.a, false, $$0x -> {
   });
   private final evl<Boolean> bE = new evl<>("key.sprint", evl.a(), ($$0x, $$1x) -> $$1x ? bB : bC, evl.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final vf bF = vf.c("options.hideMatchedNames.tooltip");
   private final evl<Boolean> bG = evl.a("options.hideMatchedNames", evl.a(bF), true);
   private final evl<Boolean> bH = evl.a("options.autosaveIndicator", true);
   private static final vf bI = vf.c("options.onlyShowSecureChat.tooltip");
   private final evl<Boolean> bJ = evl.a("options.onlyShowSecureChat", evl.a(bI), false);
   public final evg x = new evg("key.forward", 87, "key.categories.movement");
   public final evg y = new evg("key.left", 65, "key.categories.movement");
   public final evg z = new evg("key.back", 83, "key.categories.movement");
   public final evg A = new evg("key.right", 68, "key.categories.movement");
   public final evg B = new evg("key.jump", 32, "key.categories.movement");
   public final evg C = new evw("key.sneak", 340, "key.categories.movement", this.bD::c);
   public final evg D = new evw("key.sprint", 341, "key.categories.movement", this.bE::c);
   public final evg E = new evg("key.inventory", 69, "key.categories.inventory");
   public final evg F = new evg("key.swapOffhand", 70, "key.categories.inventory");
   public final evg G = new evg("key.drop", 81, "key.categories.inventory");
   public final evg H = new evg("key.use", eow.b.c, 1, "key.categories.gameplay");
   public final evg I = new evg("key.attack", eow.b.c, 0, "key.categories.gameplay");
   public final evg J = new evg("key.pickItem", eow.b.c, 2, "key.categories.gameplay");
   public final evg K = new evg("key.chat", 84, "key.categories.multiplayer");
   public final evg L = new evg("key.playerlist", 258, "key.categories.multiplayer");
   public final evg M = new evg("key.command", 47, "key.categories.multiplayer");
   public final evg N = new evg("key.socialInteractions", 80, "key.categories.multiplayer");
   public final evg O = new evg("key.screenshot", 291, "key.categories.misc");
   public final evg P = new evg("key.togglePerspective", 294, "key.categories.misc");
   public final evg Q = new evg("key.smoothCamera", eow.bv.b(), "key.categories.misc");
   public final evg R = new evg("key.fullscreen", 300, "key.categories.misc");
   public final evg S = new evg("key.spectatorOutlines", eow.bv.b(), "key.categories.misc");
   public final evg T = new evg("key.advancements", 76, "key.categories.misc");
   public final evg[] U = new evg[]{
      new evg("key.hotbar.1", 49, "key.categories.inventory"),
      new evg("key.hotbar.2", 50, "key.categories.inventory"),
      new evg("key.hotbar.3", 51, "key.categories.inventory"),
      new evg("key.hotbar.4", 52, "key.categories.inventory"),
      new evg("key.hotbar.5", 53, "key.categories.inventory"),
      new evg("key.hotbar.6", 54, "key.categories.inventory"),
      new evg("key.hotbar.7", 55, "key.categories.inventory"),
      new evg("key.hotbar.8", 56, "key.categories.inventory"),
      new evg("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final evg V = new evg("key.saveToolbarActivator", 67, "key.categories.creative");
   public final evg W = new evg("key.loadToolbarActivator", 88, "key.categories.creative");
   public final evg[] X = (evg[])ArrayUtils.addAll(
      new evg[]{
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
   protected evi Y;
   private final File bK;
   public boolean Z;
   private euu bL = euu.a;
   public String aa = "";
   public boolean ab;
   private final evl<Integer> bM = new evl<>("options.fov", evl.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, vf.c("options.fov.min"));
         case 110 -> a($$0x, vf.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new evl.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> evi.O().f.r());
   private static final vf bN = vf.a("options.telemetry.button.tooltip", vf.c("options.telemetry.state.minimal"), vf.c("options.telemetry.state.all"));
   private final evl<Boolean> bO = evl.a("options.telemetry.button", evl.a(bN), ($$0x, $$1x) -> {
      evi $$2x = evi.O();
      if (!$$2x.C()) {
         return vf.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.B() ? vf.c("options.telemetry.state.all") : vf.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final vf bP = vf.c("options.screenEffectScale.tooltip");
   private final evl<Double> bQ = new evl<>(
      "options.screenEffectScale", evl.a(bP), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()), evl.m.a, 1.0, $$0x -> {
      }
   );
   private static final vf bR = vf.c("options.fovEffectScale.tooltip");
   private final evl<Double> bS = new evl<>(
      "options.fovEffectScale",
      evl.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()),
      evl.m.a.a(auo::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final vf bT = vf.c("options.darknessEffectScale.tooltip");
   private final evl<Double> bU = new evl<>(
      "options.darknessEffectScale",
      evl.a(bT),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()),
      evl.m.a.a(auo::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final vf bV = vf.c("options.glintSpeed.tooltip");
   private final evl<Double> bW = new evl<>(
      "options.glintSpeed", evl.a(bV), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()), evl.m.a, 0.5, $$0x -> {
      }
   );
   private static final vf bX = vf.c("options.glintStrength.tooltip");
   private final evl<Double> bY = new evl<>(
      "options.glintStrength",
      evl.a(bX),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()),
      evl.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final vf bZ = vf.c("options.damageTiltStrength.tooltip");
   private final evl<Double> ca = new evl<>(
      "options.damageTiltStrength", evl.a(bZ), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()), evl.m.a, 1.0, $$0x -> {
      }
   );
   private final evl<Double> cb = new evl<>("options.gamma", evl.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, vf.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, vf.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, vf.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, evl.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cc = 2147483646;
   private final evl<Integer> cd = new evl<>(
      "options.guiScale", evl.a(), ($$0x, $$1x) -> $$1x == 0 ? vf.c("options.guiScale.auto") : vf.b(Integer.toString($$1x)), new evl.c(0, () -> {
         evi $$0x = evi.O();
         return !$$0x.q() ? 2147483646 : $$0x.aM().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final evl<evn> ce = new evl<>(
      "options.particles", evl.a(), evl.b(), new evl.e<>(Arrays.asList(evn.values()), Codec.INT.xmap(evn::a, evn::a)), evn.a, $$0x -> {
      }
   );
   private final evl<evk> cf = new evl<>(
      "options.narrator",
      evl.a(),
      ($$0x, $$1x) -> (vf)(this.Y.aW().a() ? $$1x.b() : vf.c("options.narrator.notavailable")),
      new evl.e<>(Arrays.asList(evk.values()), Codec.INT.xmap(evk::a, evk::a)),
      evk.a,
      $$0x -> this.Y.aW().a($$0x)
   );
   public String ad = "en_us";
   private final evl<String> cg = new evl<>(
      "options.audioDevice",
      evl.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return vf.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? vf.b($$1x.substring(gjb.c)) : vf.b($$1x);
         }
      },
      new evl.h<>(
         () -> Stream.concat(Stream.of(""), evi.O().ai().a().stream()).toList(),
         $$0x -> evi.O().q() && $$0x != "" && !evi.O().ai().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gje $$1x = evi.O().ai();
         $$1x.k();
         $$1x.a(ghv.a(ars.zu, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public evl<Boolean> a() {
      return this.am;
   }

   public evl<Boolean> b() {
      return this.ao;
   }

   public evl<Boolean> c() {
      return this.aq;
   }

   public evl<Double> d() {
      return this.ar;
   }

   public evl<Integer> e() {
      return this.as;
   }

   public evl<Integer> f() {
      return this.at;
   }

   public evl<Double> g() {
      return this.av;
   }

   public evl<Integer> h() {
      return this.aw;
   }

   public evl<euw> i() {
      return this.ax;
   }

   public evl<evb> j() {
      return this.aB;
   }

   public evl<Boolean> k() {
      return this.aC;
   }

   public evl<evp> l() {
      return this.aG;
   }

   public void a(apt $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (apq $$2 : $$0.f()) {
         if (!$$2.h()) {
            this.i.add($$2.f());
            if (!$$2.c().a()) {
               this.j.add($$2.f());
            }
         }
      }

      this.as();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.Y.k();
      }
   }

   public evl<cfg> m() {
      return this.aH;
   }

   public evl<Double> n() {
      return this.aI;
   }

   public evl<Double> o() {
      return this.aJ;
   }

   public evl<Double> p() {
      return this.aK;
   }

   public evl<Double> q() {
      return this.aL;
   }

   public evl<Boolean> r() {
      return this.aN;
   }

   public evl<Boolean> s() {
      return this.aO;
   }

   public evl<bmf> t() {
      return this.aQ;
   }

   public evl<Double> u() {
      return this.aR;
   }

   public evl<Double> v() {
      return this.aS;
   }

   public evl<Double> w() {
      return this.aT;
   }

   public evl<Double> x() {
      return this.aU;
   }

   public evl<Double> y() {
      return this.aV;
   }

   public evl<Double> z() {
      return this.aX;
   }

   public evl<Integer> A() {
      return this.aY;
   }

   public evl<eus> B() {
      return this.aZ;
   }

   public evl<Integer> C() {
      return this.ba;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return auo.a(Math.log10($$0) * 100.0);
   }

   public evl<Double> D() {
      return this.bb;
   }

   public evl<Boolean> E() {
      return this.bc;
   }

   public evl<Boolean> F() {
      return this.bd;
   }

   public evl<Boolean> G() {
      return this.be;
   }

   public evl<Boolean> H() {
      return this.bf;
   }

   public evl<Boolean> I() {
      return this.bg;
   }

   public evl<Boolean> J() {
      return this.bh;
   }

   public evl<Boolean> K() {
      return this.bi;
   }

   public evl<Boolean> L() {
      return this.bj;
   }

   public evl<Boolean> M() {
      return this.bk;
   }

   public evl<Boolean> N() {
      return this.bl;
   }

   public evl<Boolean> O() {
      return this.bm;
   }

   public evl<Boolean> P() {
      return this.bn;
   }

   public evl<Boolean> Q() {
      return this.bo;
   }

   public evl<Boolean> R() {
      return this.bq;
   }

   public evl<Boolean> S() {
      return this.br;
   }

   public final float a(art $$0) {
      return this.b($$0).c().floatValue();
   }

   public final evl<Double> b(art $$0) {
      return Objects.requireNonNull(this.bs.get($$0));
   }

   private evl<Double> a(String $$0, art $$1) {
      return new evl<>(
         $$0, evl.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()), evl.m.a, 1.0, $$1x -> evi.O().ai().a($$1, $$1x.floatValue())
      );
   }

   public evl<Boolean> T() {
      return this.bt;
   }

   public evl<Boolean> U() {
      return this.bw;
   }

   public evl<Boolean> V() {
      return this.bx;
   }

   public evl<Boolean> W() {
      return this.by;
   }

   public evl<Boolean> X() {
      return this.bz;
   }

   public evl<Boolean> Y() {
      return this.bA;
   }

   public evl<Boolean> Z() {
      return this.bD;
   }

   public evl<Boolean> aa() {
      return this.bE;
   }

   public evl<Boolean> ab() {
      return this.bG;
   }

   public evl<Boolean> ac() {
      return this.bH;
   }

   public evl<Boolean> ad() {
      return this.bJ;
   }

   public evl<Integer> ae() {
      return this.bM;
   }

   public evl<Boolean> af() {
      return this.bO;
   }

   public evl<Double> ag() {
      return this.bQ;
   }

   public evl<Double> ah() {
      return this.bS;
   }

   public evl<Double> ai() {
      return this.bU;
   }

   public evl<Double> aj() {
      return this.bW;
   }

   public evl<Double> ak() {
      return this.bY;
   }

   public evl<Double> al() {
      return this.ca;
   }

   public evl<Double> am() {
      return this.cb;
   }

   public evl<Integer> an() {
      return this.cd;
   }

   public evl<evn> ao() {
      return this.ce;
   }

   public evl<evk> ap() {
      return this.cf;
   }

   public evl<String> aq() {
      return this.cg;
   }

   public evm(evi $$0, File $$1) {
      this.Y = $$0;
      this.bK = new File($$1, "options.txt");
      boolean $$2 = $$0.af();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.as = new evl<>(
         "options.renderDistance",
         evl.a(),
         ($$0x, $$1x) -> a($$0x, vf.a("options.chunks", $$1x)),
         new evl.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> evi.O().f.r()
      );
      this.at = new evl<>(
         "options.simulationDistance", evl.a(), ($$0x, $$1x) -> a($$0x, vf.a("options.chunks", $$1x)), new evl.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
         }
      );
      this.af = ac.j() == ac.a.c;
      this.ar();
   }

   public float a(float $$0) {
      return this.bx.c() ? $$0 : this.p().c().floatValue();
   }

   public int b(float $$0) {
      return (int)(this.a($$0) * 255.0F) << 24 & 0xFF000000;
   }

   public int a(int $$0) {
      return this.bx.c() ? $$0 : (int)(this.aK.c() * 255.0) << 24 & 0xFF000000;
   }

   public void a(evg $$0, eow.a $$1) {
      $$0.b($$1);
      this.as();
   }

   private void a(evm.a $$0) {
      $$0.a("autoJump", this.bd);
      $$0.a("operatorItemsTab", this.be);
      $$0.a("autoSuggestions", this.bf);
      $$0.a("chatColors", this.bg);
      $$0.a("chatLinks", this.bh);
      $$0.a("chatLinksPrompt", this.bi);
      $$0.a("enableVsync", this.bj);
      $$0.a("entityShadows", this.bk);
      $$0.a("forceUnicodeFont", this.bl);
      $$0.a("discrete_mouse_scroll", this.bn);
      $$0.a("invertYMouse", this.bm);
      $$0.a("realmsNotifications", this.bo);
      $$0.a("reducedDebugInfo", this.br);
      $$0.a("showSubtitles", this.bt);
      $$0.a("directionalAudio", this.bw);
      $$0.a("touchscreen", this.by);
      $$0.a("fullscreen", this.bz);
      $$0.a("bobView", this.bA);
      $$0.a("toggleCrouch", this.bD);
      $$0.a("toggleSprint", this.bE);
      $$0.a("darkMojangStudiosBackground", this.am);
      $$0.a("hideLightningFlashes", this.ao);
      $$0.a("hideSplashTexts", this.aq);
      $$0.a("mouseSensitivity", this.ar);
      $$0.a("fov", this.bM);
      $$0.a("screenEffectScale", this.bQ);
      $$0.a("fovEffectScale", this.bS);
      $$0.a("darknessEffectScale", this.bU);
      $$0.a("glintSpeed", this.bW);
      $$0.a("glintStrength", this.bY);
      $$0.a("damageTiltStrength", this.ca);
      $$0.a("highContrast", this.aN);
      $$0.a("narratorHotkey", this.aO);
      $$0.a("gamma", this.cb);
      $$0.a("renderDistance", this.as);
      $$0.a("simulationDistance", this.at);
      $$0.a("entityDistanceScaling", this.av);
      $$0.a("guiScale", this.cd);
      $$0.a("particles", this.ce);
      $$0.a("maxFps", this.aw);
      $$0.a("graphicsMode", this.aB);
      $$0.a("ao", this.aC);
      $$0.a("prioritizeChunkUpdates", this.aG);
      $$0.a("biomeBlendRadius", this.ba);
      $$0.a("renderClouds", this.ax);
      this.i = $$0.a("resourcePacks", this.i, evm::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, evm::c, ah::toJson);
      this.aa = $$0.a("lastServer", this.aa);
      this.ad = $$0.a("lang", this.ad);
      $$0.a("soundDevice", this.cg);
      $$0.a("chatVisibility", this.aH);
      $$0.a("chatOpacity", this.aI);
      $$0.a("chatLineSpacing", this.aJ);
      $$0.a("textBackgroundOpacity", this.aK);
      $$0.a("backgroundForChatOnly", this.bx);
      this.l = $$0.a("hideServerAddress", this.l);
      this.m = $$0.a("advancedItemTooltips", this.m);
      this.n = $$0.a("pauseOnLostFocus", this.n);
      this.o = $$0.a("overrideWidth", this.o);
      this.p = $$0.a("overrideHeight", this.p);
      $$0.a("chatHeightFocused", this.aU);
      $$0.a("chatDelay", this.aV);
      $$0.a("chatHeightUnfocused", this.aT);
      $$0.a("chatScale", this.aR);
      $$0.a("chatWidth", this.aS);
      $$0.a("notificationDisplayTime", this.aX);
      $$0.a("mipmapLevels", this.aY);
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aQ);
      $$0.a("attackIndicator", this.aZ);
      $$0.a("narrator", this.cf);
      this.r = $$0.a("tutorialStep", this.r, gkj::a, gkj::a);
      $$0.a("mouseWheelSensitivity", this.bb);
      $$0.a("rawMouseInput", this.bc);
      this.u = $$0.a("glDebugVerbosity", this.u);
      this.v = $$0.a("skipMultiplayerWarning", this.v);
      this.w = $$0.a("skipRealms32bitWarning", this.w);
      $$0.a("hideMatchedNames", this.bG);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.t = $$0.a("hideBundleTutorial", this.t);
      this.af = $$0.a("syncChunkWrites", this.af);
      $$0.a("showAutosaveIndicator", this.bH);
      $$0.a("allowServerListing", this.bq);
      $$0.a("onlyShowSecureChat", this.bJ);
      $$0.a("panoramaScrollSpeed", this.aL);
      $$0.a("telemetryOptInExtra", this.bO);
      this.ae = $$0.a("onboardAccessibility", this.ae);

      for (evg $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(eow.a($$3));
         }
      }

      for (art $$4 : art.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bs.get($$4));
      }

      for (cfj $$5 : cfj.values()) {
         boolean $$6 = this.aP.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.b($$5, $$7);
         }
      }
   }

   public void ar() {
      try {
         if (!this.bK.exists()) {
            return;
         }

         sn $$0 = new sn();

         try (BufferedReader $$1 = Files.newReader(this.bK, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = aj.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  ag.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final sn $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(evb.b);
            } else {
               this.aB.a(evb.a);
            }
         }

         this.a(new evm.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, evl<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> evm.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     evm.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? evm.a($$2) : $$1;
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
               } else if (evm.a($$2)) {
                  return 1.0F;
               } else if (evm.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     evm.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         if (this.Y.aM() != null) {
            this.Y.aM().a(this.aw.c());
         }

         evg.d();
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

   private sn a(sn $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return avw.e.a(this.Y.ar(), $$0, $$1);
   }

   public void as() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bK), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new evm.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, evl<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> evm.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(evm.ah.toJson($$2x));
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
         if (this.Y.aM().f().isPresent()) {
            $$0.println("fullscreenResolution:" + this.Y.aM().f().get().g());
         }
      } catch (Exception var6) {
         ag.error("Failed to save options", var6);
      }

      this.au();
   }

   public ams at() {
      int $$0 = 0;

      for (cfj $$1 : this.aP) {
         $$0 |= $$1.a();
      }

      return new ams(this.ad, this.as.c(), this.aH.c(), this.bg.c(), $$0, this.aQ.c(), this.Y.aQ(), this.bq.c());
   }

   public void au() {
      if (this.Y.s != null) {
         this.Y.s.cn.b(new xr(this.at()));
      }
   }

   private void b(cfj $$0, boolean $$1) {
      if ($$1) {
         this.aP.add($$0);
      } else {
         this.aP.remove($$0);
      }
   }

   public boolean a(cfj $$0) {
      return this.aP.contains($$0);
   }

   public void a(cfj $$0, boolean $$1) {
      this.b($$0, $$1);
      this.au();
   }

   public euw av() {
      return this.aA() >= 4 ? this.ax.c() : euw.a;
   }

   public boolean aw() {
      return this.q;
   }

   public void b(apt $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         apq $$4 = $$0.c($$3);
         if ($$4 == null && !$$3.startsWith("file/")) {
            $$4 = $$0.c("file/" + $$3);
         }

         if ($$4 == null) {
            ag.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", $$3);
            $$2.remove();
         } else if (!$$4.c().a() && !this.j.contains($$3)) {
            ag.warn("Removed resource pack {} from options because it is no longer compatible", $$3);
            $$2.remove();
         } else if ($$4.c().a() && this.j.contains($$3)) {
            ag.info("Removed resource pack {} from incompatibility list because it's now compatible", $$3);
            this.j.remove($$3);
         } else {
            $$1.add($$4.f());
         }
      }

      $$0.a($$1);
   }

   public euu ax() {
      return this.bL;
   }

   public void a(euu $$0) {
      this.bL = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = aue.a(ah, $$0, ai);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File ay() {
      return this.bK;
   }

   public String az() {
      Stream<Pair<String, Object>> $$0 = Stream.<Pair<String, Object>>builder()
         .add(Pair.of("ao", this.aC.c()))
         .add(Pair.of("biomeBlendRadius", this.ba.c()))
         .add(Pair.of("enableVsync", this.bj.c()))
         .add(Pair.of("entityDistanceScaling", this.av.c()))
         .add(Pair.of("entityShadows", this.bk.c()))
         .add(Pair.of("forceUnicodeFont", this.bl.c()))
         .add(Pair.of("fov", this.bM.c()))
         .add(Pair.of("fovEffectScale", this.bS.c()))
         .add(Pair.of("darknessEffectScale", this.bU.c()))
         .add(Pair.of("glintSpeed", this.bW.c()))
         .add(Pair.of("glintStrength", this.bY.c()))
         .add(Pair.of("prioritizeChunkUpdates", this.aG.c()))
         .add(Pair.of("fullscreen", this.bz.c()))
         .add(Pair.of("fullscreenResolution", String.valueOf(this.k)))
         .add(Pair.of("gamma", this.cb.c()))
         .add(Pair.of("glDebugVerbosity", this.u))
         .add(Pair.of("graphicsMode", this.aB.c()))
         .add(Pair.of("guiScale", this.cd.c()))
         .add(Pair.of("maxFps", this.aw.c()))
         .add(Pair.of("mipmapLevels", this.aY.c()))
         .add(Pair.of("narrator", this.cf.c()))
         .add(Pair.of("overrideHeight", this.p))
         .add(Pair.of("overrideWidth", this.o))
         .add(Pair.of("particles", this.ce.c()))
         .add(Pair.of("reducedDebugInfo", this.br.c()))
         .add(Pair.of("renderClouds", this.ax.c()))
         .add(Pair.of("renderDistance", this.as.c()))
         .add(Pair.of("simulationDistance", this.at.c()))
         .add(Pair.of("resourcePacks", this.i))
         .add(Pair.of("screenEffectScale", this.bQ.c()))
         .add(Pair.of("syncChunkWrites", this.af))
         .add(Pair.of("useNativeTransport", this.q))
         .add(Pair.of("soundDevice", this.cg.c()))
         .build();
      return $$0.<CharSequence>map($$0x -> (String)$$0x.getFirst() + ": " + $$0x.getSecond()).collect(Collectors.joining(System.lineSeparator()));
   }

   public void b(int $$0) {
      this.au = $$0;
   }

   public int aA() {
      return this.au > 0 ? Math.min(this.as.c(), this.au) : this.as.c();
   }

   private static vf b(vf $$0, int $$1) {
      return vf.a("options.pixel_value", $$0, $$1);
   }

   private static vf a(vf $$0, double $$1) {
      return vf.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static vf a(vf $$0, vf $$1) {
      return vf.a("options.generic_value", $$0, $$1);
   }

   public static vf a(vf $$0, int $$1) {
      return a($$0, vf.b(Integer.toString($$1)));
   }

   interface a {
      <T> void a(String var1, evl<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
