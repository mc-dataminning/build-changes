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

public class exs {
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
   private static final vq al = vq.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final exr<Boolean> am = exr.a("options.darkMojangStudiosBackgroundColor", exr.a(al), false);
   private static final vq an = vq.c("options.hideLightningFlashes.tooltip");
   private final exr<Boolean> ao = exr.a("options.hideLightningFlashes", exr.a(an), false);
   private static final vq ap = vq.c("options.hideSplashTexts.tooltip");
   private final exr<Boolean> aq = exr.a("options.hideSplashTexts", exr.a(ap), false);
   private final exr<Double> ar = new exr<>("options.sensitivity", exr.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, vq.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, vq.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, exr.m.a, 0.5, $$0x -> {
   });
   private final exr<Integer> as;
   private final exr<Integer> at;
   private int au = 0;
   private final exr<Double> av = new exr<>(
      "options.entityDistanceScaling",
      exr.a(),
      exs::a,
      new exr.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final exr<Integer> aw = new exr<>(
      "options.framerateLimit",
      exr.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, vq.c("options.framerateLimit.max")) : a($$0x, vq.a("options.framerate", $$1x)),
      new exr.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> exo.P().aN().a($$0x)
   );
   private final exr<exc> ax = new exr<>(
      "options.renderClouds",
      exr.a(),
      exr.b(),
      new exr.e<>(Arrays.asList(exc.values()), avq.a(exc.d, Codec.BOOL, $$0x -> $$0x ? exc.c : exc.a)),
      exc.c,
      $$0x -> {
         if (exo.N()) {
            eqt $$1x = exo.P().f.x();
            if ($$1x != null) {
               $$1x.b(exo.a);
            }
         }
      }
   );
   private static final vq ay = vq.c("options.graphics.fast.tooltip");
   private static final vq az = vq.a("options.graphics.fabulous.tooltip", vq.c("options.graphics.fabulous").a(n.u));
   private static final vq aA = vq.c("options.graphics.fancy.tooltip");
   private final exr<exh> aB = new exr<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> faz.a(aA);
            case a -> faz.a(ay);
            case c -> faz.a(az);
         };
      },
      ($$0x, $$1x) -> {
         we $$2x = vq.c($$1x.b());
         return $$1x == exh.c ? $$2x.a(n.u) : $$2x;
      },
      new exr.a<>(
         Arrays.asList(exh.values()),
         Stream.of(exh.values()).filter($$0x -> $$0x != exh.c).collect(Collectors.toList()),
         () -> exo.P().q() && exo.P().ai().h(),
         ($$0x, $$1x) -> {
            exo $$2x = exo.P();
            fvn $$3x = $$2x.ai();
            if ($$1x == exh.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(exh::a, exh::a)
      ),
      exh.b,
      $$0x -> {
      }
   );
   private final exr<Boolean> aC = exr.a("options.ao", true, $$0x -> exo.P().f.f());
   private static final vq aD = vq.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final vq aE = vq.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final vq aF = vq.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final exr<exv> aG = new exr<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> faz.a(aD);
         case b -> faz.a(aE);
         case c -> faz.a(aF);
      };
   }, exr.b(), new exr.e<>(Arrays.asList(exv.values()), Codec.INT.xmap(exv::a, exv::a)), exv.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final exr<chj> aH = new exr<>(
      "options.chat.visibility", exr.a(), exr.b(), new exr.e<>(Arrays.asList(chj.values()), Codec.INT.xmap(chj::a, chj::a)), chj.a, $$0x -> {
      }
   );
   private final exr<Double> aI = new exr<>("options.chat.opacity", exr.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), exr.m.a, 1.0, $$0x -> exo.P().l.d().b());
   private final exr<Double> aJ = new exr<>("options.chat.line_spacing", exr.a(), exs::a, exr.m.a, 0.0, $$0x -> {
   });
   private final exr<Double> aK = new exr<>("options.accessibility.text_background_opacity", exr.a(), exs::a, exr.m.a, 0.5, $$0x -> exo.P().l.d().b());
   private final exr<Double> aL = new exr<>("options.accessibility.panorama_speed", exr.a(), exs::a, exr.m.a, 1.0, $$0x -> {
   });
   private static final vq aM = vq.c("options.accessibility.high_contrast.tooltip");
   private final exr<Boolean> aN = exr.a("options.accessibility.high_contrast", exr.a(aM), false, $$0x -> {
      arm $$1x = exo.P().ab();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final exr<Boolean> aO = exr.a(
      "options.accessibility.narrator_hotkey",
      exr.a(exo.a ? vq.c("options.accessibility.narrator_hotkey.mac.tooltip") : vq.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<chm> aP = EnumSet.allOf(chm.class);
   private final exr<boc> aQ = new exr<>("options.mainHand", exr.a(), exr.b(), new exr.e<>(Arrays.asList(boc.values()), boc.c), boc.b, $$0x -> this.au());
   public int o;
   public int p;
   private final exr<Double> aR = new exr<>(
      "options.chat.scale",
      exr.a(),
      ($$0x, $$1x) -> (vq)($$1x == 0.0 ? vp.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      exr.m.a,
      1.0,
      $$0x -> exo.P().l.d().b()
   );
   private final exr<Double> aS = new exr<>("options.chat.width", exr.a(), ($$0x, $$1x) -> b($$0x, ezp.a($$1x)), exr.m.a, 1.0, $$0x -> exo.P().l.d().b());
   private final exr<Double> aT = new exr<>(
      "options.chat.height.unfocused", exr.a(), ($$0x, $$1x) -> b($$0x, ezp.b($$1x)), exr.m.a, ezp.i(), $$0x -> exo.P().l.d().b()
   );
   private final exr<Double> aU = new exr<>(
      "options.chat.height.focused", exr.a(), ($$0x, $$1x) -> b($$0x, ezp.b($$1x)), exr.m.a, 1.0, $$0x -> exo.P().l.d().b()
   );
   private final exr<Double> aV = new exr<>(
      "options.chat.delay_instant",
      exr.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? vq.c("options.chat.delay_none") : vq.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new exr.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> exo.P().aY().a($$0x)
   );
   private static final vq aW = vq.c("options.notifications.display_time.tooltip");
   private final exr<Double> aX = new exr<>(
      "options.notifications.display_time",
      exr.a(aW),
      ($$0x, $$1x) -> a($$0x, vq.a("options.multiplier", $$1x)),
      new exr.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final exr<Integer> aY = new exr<>(
      "options.mipmapLevels", exr.a(), ($$0x, $$1x) -> (vq)($$1x == 0 ? vp.a($$0x, false) : a($$0x, $$1x.intValue())), new exr.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final exr<ewy> aZ = new exr<>(
      "options.attackIndicator", exr.a(), exr.b(), new exr.e<>(Arrays.asList(ewy.values()), Codec.INT.xmap(ewy::a, ewy::a)), ewy.b, $$0x -> {
      }
   );
   public gmx r = gmx.a;
   public boolean s = false;
   public boolean t = false;
   private final exr<Integer> ba = new exr<>("options.biomeBlendRadius", exr.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, vq.c("options.biomeBlendRadius." + $$2x));
   }, new exr.f(0, 7), 2, $$0x -> exo.P().f.f());
   private final exr<Double> bb = new exr<>(
      "options.mouseWheelSensitivity",
      exr.a(),
      ($$0x, $$1x) -> a($$0x, vq.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new exr.f(-200, 100).a(exs::c, exs::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final exr<Boolean> bc = exr.a("options.rawMouseInput", true, $$0x -> {
      erl $$1x = exo.P().aN();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final exr<Boolean> bd = exr.a("options.autoJump", false);
   private final exr<Boolean> be = exr.a("options.operatorItemsTab", false);
   private final exr<Boolean> bf = exr.a("options.autoSuggestCommands", true);
   private final exr<Boolean> bg = exr.a("options.chat.color", true);
   private final exr<Boolean> bh = exr.a("options.chat.links", true);
   private final exr<Boolean> bi = exr.a("options.chat.links.prompt", true);
   private final exr<Boolean> bj = exr.a("options.vsync", true, $$0x -> {
      if (exo.P().aN() != null) {
         exo.P().aN().a($$0x);
      }
   });
   private final exr<Boolean> bk = exr.a("options.entityShadows", true);
   private final exr<Boolean> bl = exr.a("options.forceUnicodeFont", false, $$0x -> {
      exo $$1x = exo.P();
      if ($$1x.aN() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final exr<Boolean> bm = exr.a("options.invertMouse", false);
   private final exr<Boolean> bn = exr.a("options.discrete_mouse_scroll", false);
   private final exr<Boolean> bo = exr.a("options.realmsNotifications", true);
   private static final vq bp = vq.c("options.allowServerListing.tooltip");
   private final exr<Boolean> bq = exr.a("options.allowServerListing", exr.a(bp), true, $$0x -> this.au());
   private final exr<Boolean> br = exr.a("options.reducedDebugInfo", false);
   private final Map<atm, exr<Double>> bs = ac.a(new EnumMap<>(atm.class), $$0x -> {
      for (atm $$1x : atm.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final exr<Boolean> bt = exr.a("options.showSubtitles", false);
   private static final vq bu = vq.c("options.directionalAudio.on.tooltip");
   private static final vq bv = vq.c("options.directionalAudio.off.tooltip");
   private final exr<Boolean> bw = exr.a("options.directionalAudio", $$0x -> $$0x ? faz.a(bu) : faz.a(bv), false, $$0x -> {
      gls $$1x = exo.P().aj();
      $$1x.k();
      $$1x.a(gkj.a(atl.zK, 1.0F));
   });
   private final exr<Boolean> bx = new exr<>(
      "options.accessibility.text_background",
      exr.a(),
      ($$0x, $$1x) -> $$1x ? vq.c("options.accessibility.text_background.chat") : vq.c("options.accessibility.text_background.everywhere"),
      exr.a,
      true,
      $$0x -> {
      }
   );
   private final exr<Boolean> by = exr.a("options.touchscreen", false);
   private final exr<Boolean> bz = exr.a("options.fullscreen", false, $$0x -> {
      exo $$1x = exo.P();
      if ($$1x.aN() != null && $$1x.aN().j() != $$0x) {
         $$1x.aN().h();
         this.X().a($$1x.aN().j());
      }
   });
   private final exr<Boolean> bA = exr.a("options.viewBobbing", true);
   private static final vq bB = vq.c("options.key.toggle");
   private static final vq bC = vq.c("options.key.hold");
   private final exr<Boolean> bD = new exr<>("key.sneak", exr.a(), ($$0x, $$1x) -> $$1x ? bB : bC, exr.a, false, $$0x -> {
   });
   private final exr<Boolean> bE = new exr<>("key.sprint", exr.a(), ($$0x, $$1x) -> $$1x ? bB : bC, exr.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final vq bF = vq.c("options.hideMatchedNames.tooltip");
   private final exr<Boolean> bG = exr.a("options.hideMatchedNames", exr.a(bF), true);
   private final exr<Boolean> bH = exr.a("options.autosaveIndicator", true);
   private static final vq bI = vq.c("options.onlyShowSecureChat.tooltip");
   private final exr<Boolean> bJ = exr.a("options.onlyShowSecureChat", exr.a(bI), false);
   public final exm x = new exm("key.forward", 87, "key.categories.movement");
   public final exm y = new exm("key.left", 65, "key.categories.movement");
   public final exm z = new exm("key.back", 83, "key.categories.movement");
   public final exm A = new exm("key.right", 68, "key.categories.movement");
   public final exm B = new exm("key.jump", 32, "key.categories.movement");
   public final exm C = new eyc("key.sneak", 340, "key.categories.movement", this.bD::c);
   public final exm D = new eyc("key.sprint", 341, "key.categories.movement", this.bE::c);
   public final exm E = new exm("key.inventory", 69, "key.categories.inventory");
   public final exm F = new exm("key.swapOffhand", 70, "key.categories.inventory");
   public final exm G = new exm("key.drop", 81, "key.categories.inventory");
   public final exm H = new exm("key.use", erc.b.c, 1, "key.categories.gameplay");
   public final exm I = new exm("key.attack", erc.b.c, 0, "key.categories.gameplay");
   public final exm J = new exm("key.pickItem", erc.b.c, 2, "key.categories.gameplay");
   public final exm K = new exm("key.chat", 84, "key.categories.multiplayer");
   public final exm L = new exm("key.playerlist", 258, "key.categories.multiplayer");
   public final exm M = new exm("key.command", 47, "key.categories.multiplayer");
   public final exm N = new exm("key.socialInteractions", 80, "key.categories.multiplayer");
   public final exm O = new exm("key.screenshot", 291, "key.categories.misc");
   public final exm P = new exm("key.togglePerspective", 294, "key.categories.misc");
   public final exm Q = new exm("key.smoothCamera", erc.bv.b(), "key.categories.misc");
   public final exm R = new exm("key.fullscreen", 300, "key.categories.misc");
   public final exm S = new exm("key.spectatorOutlines", erc.bv.b(), "key.categories.misc");
   public final exm T = new exm("key.advancements", 76, "key.categories.misc");
   public final exm[] U = new exm[]{
      new exm("key.hotbar.1", 49, "key.categories.inventory"),
      new exm("key.hotbar.2", 50, "key.categories.inventory"),
      new exm("key.hotbar.3", 51, "key.categories.inventory"),
      new exm("key.hotbar.4", 52, "key.categories.inventory"),
      new exm("key.hotbar.5", 53, "key.categories.inventory"),
      new exm("key.hotbar.6", 54, "key.categories.inventory"),
      new exm("key.hotbar.7", 55, "key.categories.inventory"),
      new exm("key.hotbar.8", 56, "key.categories.inventory"),
      new exm("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final exm V = new exm("key.saveToolbarActivator", 67, "key.categories.creative");
   public final exm W = new exm("key.loadToolbarActivator", 88, "key.categories.creative");
   public final exm[] X = (exm[])ArrayUtils.addAll(
      new exm[]{
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
   protected exo Y;
   private final File bK;
   public boolean Z;
   private exa bL = exa.a;
   public String aa = "";
   public boolean ab;
   private final exr<Integer> bM = new exr<>("options.fov", exr.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, vq.c("options.fov.min"));
         case 110 -> a($$0x, vq.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new exr.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> exo.P().f.r());
   private static final vq bN = vq.a("options.telemetry.button.tooltip", vq.c("options.telemetry.state.minimal"), vq.c("options.telemetry.state.all"));
   private final exr<Boolean> bO = exr.a("options.telemetry.button", exr.a(bN), ($$0x, $$1x) -> {
      exo $$2x = exo.P();
      if (!$$2x.D()) {
         return vq.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.C() ? vq.c("options.telemetry.state.all") : vq.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final vq bP = vq.c("options.screenEffectScale.tooltip");
   private final exr<Double> bQ = new exr<>(
      "options.screenEffectScale", exr.a(bP), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vp.c) : a($$0x, $$1x.doubleValue()), exr.m.a, 1.0, $$0x -> {
      }
   );
   private static final vq bR = vq.c("options.fovEffectScale.tooltip");
   private final exr<Double> bS = new exr<>(
      "options.fovEffectScale",
      exr.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vp.c) : a($$0x, $$1x.doubleValue()),
      exr.m.a.a(awi::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final vq bT = vq.c("options.darknessEffectScale.tooltip");
   private final exr<Double> bU = new exr<>(
      "options.darknessEffectScale",
      exr.a(bT),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vp.c) : a($$0x, $$1x.doubleValue()),
      exr.m.a.a(awi::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final vq bV = vq.c("options.glintSpeed.tooltip");
   private final exr<Double> bW = new exr<>(
      "options.glintSpeed", exr.a(bV), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vp.c) : a($$0x, $$1x.doubleValue()), exr.m.a, 0.5, $$0x -> {
      }
   );
   private static final vq bX = vq.c("options.glintStrength.tooltip");
   private final exr<Double> bY = new exr<>(
      "options.glintStrength",
      exr.a(bX),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vp.c) : a($$0x, $$1x.doubleValue()),
      exr.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final vq bZ = vq.c("options.damageTiltStrength.tooltip");
   private final exr<Double> ca = new exr<>(
      "options.damageTiltStrength", exr.a(bZ), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vp.c) : a($$0x, $$1x.doubleValue()), exr.m.a, 1.0, $$0x -> {
      }
   );
   private final exr<Double> cb = new exr<>("options.gamma", exr.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, vq.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, vq.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, vq.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, exr.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cc = 2147483646;
   private final exr<Integer> cd = new exr<>(
      "options.guiScale", exr.a(), ($$0x, $$1x) -> $$1x == 0 ? vq.c("options.guiScale.auto") : vq.b(Integer.toString($$1x)), new exr.c(0, () -> {
         exo $$0x = exo.P();
         return !$$0x.q() ? 2147483646 : $$0x.aN().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final exr<ext> ce = new exr<>(
      "options.particles", exr.a(), exr.b(), new exr.e<>(Arrays.asList(ext.values()), Codec.INT.xmap(ext::a, ext::a)), ext.a, $$0x -> {
      }
   );
   private final exr<exq> cf = new exr<>(
      "options.narrator",
      exr.a(),
      ($$0x, $$1x) -> (vq)(this.Y.aX().a() ? $$1x.b() : vq.c("options.narrator.notavailable")),
      new exr.e<>(Arrays.asList(exq.values()), Codec.INT.xmap(exq::a, exq::a)),
      exq.a,
      $$0x -> this.Y.aX().a($$0x)
   );
   public String ad = "en_us";
   private final exr<String> cg = new exr<>(
      "options.audioDevice",
      exr.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return vq.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? vq.b($$1x.substring(glp.c)) : vq.b($$1x);
         }
      },
      new exr.h<>(
         () -> Stream.concat(Stream.of(""), exo.P().aj().a().stream()).toList(),
         $$0x -> exo.P().q() && $$0x != "" && !exo.P().aj().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gls $$1x = exo.P().aj();
         $$1x.k();
         $$1x.a(gkj.a(atl.zK, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public exr<Boolean> a() {
      return this.am;
   }

   public exr<Boolean> b() {
      return this.ao;
   }

   public exr<Boolean> c() {
      return this.aq;
   }

   public exr<Double> d() {
      return this.ar;
   }

   public exr<Integer> e() {
      return this.as;
   }

   public exr<Integer> f() {
      return this.at;
   }

   public exr<Double> g() {
      return this.av;
   }

   public exr<Integer> h() {
      return this.aw;
   }

   public exr<exc> i() {
      return this.ax;
   }

   public exr<exh> j() {
      return this.aB;
   }

   public exr<Boolean> k() {
      return this.aC;
   }

   public exr<exv> l() {
      return this.aG;
   }

   public void a(arm $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (arj $$2 : $$0.f()) {
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

   public exr<chj> m() {
      return this.aH;
   }

   public exr<Double> n() {
      return this.aI;
   }

   public exr<Double> o() {
      return this.aJ;
   }

   public exr<Double> p() {
      return this.aK;
   }

   public exr<Double> q() {
      return this.aL;
   }

   public exr<Boolean> r() {
      return this.aN;
   }

   public exr<Boolean> s() {
      return this.aO;
   }

   public exr<boc> t() {
      return this.aQ;
   }

   public exr<Double> u() {
      return this.aR;
   }

   public exr<Double> v() {
      return this.aS;
   }

   public exr<Double> w() {
      return this.aT;
   }

   public exr<Double> x() {
      return this.aU;
   }

   public exr<Double> y() {
      return this.aV;
   }

   public exr<Double> z() {
      return this.aX;
   }

   public exr<Integer> A() {
      return this.aY;
   }

   public exr<ewy> B() {
      return this.aZ;
   }

   public exr<Integer> C() {
      return this.ba;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return awi.a(Math.log10($$0) * 100.0);
   }

   public exr<Double> D() {
      return this.bb;
   }

   public exr<Boolean> E() {
      return this.bc;
   }

   public exr<Boolean> F() {
      return this.bd;
   }

   public exr<Boolean> G() {
      return this.be;
   }

   public exr<Boolean> H() {
      return this.bf;
   }

   public exr<Boolean> I() {
      return this.bg;
   }

   public exr<Boolean> J() {
      return this.bh;
   }

   public exr<Boolean> K() {
      return this.bi;
   }

   public exr<Boolean> L() {
      return this.bj;
   }

   public exr<Boolean> M() {
      return this.bk;
   }

   public exr<Boolean> N() {
      return this.bl;
   }

   public exr<Boolean> O() {
      return this.bm;
   }

   public exr<Boolean> P() {
      return this.bn;
   }

   public exr<Boolean> Q() {
      return this.bo;
   }

   public exr<Boolean> R() {
      return this.bq;
   }

   public exr<Boolean> S() {
      return this.br;
   }

   public final float a(atm $$0) {
      return this.b($$0).c().floatValue();
   }

   public final exr<Double> b(atm $$0) {
      return Objects.requireNonNull(this.bs.get($$0));
   }

   private exr<Double> a(String $$0, atm $$1) {
      return new exr<>(
         $$0, exr.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vp.c) : a($$0x, $$1x.doubleValue()), exr.m.a, 1.0, $$1x -> exo.P().aj().a($$1, $$1x.floatValue())
      );
   }

   public exr<Boolean> T() {
      return this.bt;
   }

   public exr<Boolean> U() {
      return this.bw;
   }

   public exr<Boolean> V() {
      return this.bx;
   }

   public exr<Boolean> W() {
      return this.by;
   }

   public exr<Boolean> X() {
      return this.bz;
   }

   public exr<Boolean> Y() {
      return this.bA;
   }

   public exr<Boolean> Z() {
      return this.bD;
   }

   public exr<Boolean> aa() {
      return this.bE;
   }

   public exr<Boolean> ab() {
      return this.bG;
   }

   public exr<Boolean> ac() {
      return this.bH;
   }

   public exr<Boolean> ad() {
      return this.bJ;
   }

   public exr<Integer> ae() {
      return this.bM;
   }

   public exr<Boolean> af() {
      return this.bO;
   }

   public exr<Double> ag() {
      return this.bQ;
   }

   public exr<Double> ah() {
      return this.bS;
   }

   public exr<Double> ai() {
      return this.bU;
   }

   public exr<Double> aj() {
      return this.bW;
   }

   public exr<Double> ak() {
      return this.bY;
   }

   public exr<Double> al() {
      return this.ca;
   }

   public exr<Double> am() {
      return this.cb;
   }

   public exr<Integer> an() {
      return this.cd;
   }

   public exr<ext> ao() {
      return this.ce;
   }

   public exr<exq> ap() {
      return this.cf;
   }

   public exr<String> aq() {
      return this.cg;
   }

   public exs(exo $$0, File $$1) {
      this.Y = $$0;
      this.bK = new File($$1, "options.txt");
      boolean $$2 = $$0.ag();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.as = new exr<>(
         "options.renderDistance",
         exr.a(),
         ($$0x, $$1x) -> a($$0x, vq.a("options.chunks", $$1x)),
         new exr.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> exo.P().f.r()
      );
      this.at = new exr<>(
         "options.simulationDistance", exr.a(), ($$0x, $$1x) -> a($$0x, vq.a("options.chunks", $$1x)), new exr.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
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

   public void a(exm $$0, erc.a $$1) {
      $$0.b($$1);
      this.as();
   }

   private void a(exs.a $$0) {
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
      this.i = $$0.a("resourcePacks", this.i, exs::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, exs::c, ah::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, gmx::a, gmx::a);
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

      for (exm $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(erc.a($$3));
         }
      }

      for (atm $$4 : atm.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bs.get($$4));
      }

      for (chm $$5 : chm.values()) {
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

         sw $$0 = new sw();

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

         final sw $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(exh.b);
            } else {
               this.aB.a(exh.a);
            }
         }

         this.a(new exs.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, exr<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> exs.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     exs.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? exs.a($$2) : $$1;
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
               } else if (exs.a($$2)) {
                  return 1.0F;
               } else if (exs.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     exs.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         if (this.Y.aN() != null) {
            this.Y.aN().a(this.aw.c());
         }

         exm.d();
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

   private sw a(sw $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return axo.e.a(this.Y.as(), $$0, $$1);
   }

   public void as() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bK), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new exs.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, exr<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> exs.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(exs.ah.toJson($$2x));
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
         if (this.Y.aN().f().isPresent()) {
            $$0.println("fullscreenResolution:" + this.Y.aN().f().get().g());
         }
      } catch (Exception var6) {
         ag.error("Failed to save options", var6);
      }

      this.au();
   }

   public aol at() {
      int $$0 = 0;

      for (chm $$1 : this.aP) {
         $$0 |= $$1.a();
      }

      return new aol(this.ad, this.as.c(), this.aH.c(), this.bg.c(), $$0, this.aQ.c(), this.Y.aR(), this.bq.c());
   }

   public void au() {
      if (this.Y.s != null) {
         this.Y.s.cq.b(new yp(this.at()));
      }
   }

   private void b(chm $$0, boolean $$1) {
      if ($$1) {
         this.aP.add($$0);
      } else {
         this.aP.remove($$0);
      }
   }

   public boolean a(chm $$0) {
      return this.aP.contains($$0);
   }

   public void a(chm $$0, boolean $$1) {
      this.b($$0, $$1);
      this.au();
   }

   public exc av() {
      return this.aA() >= 4 ? this.ax.c() : exc.a;
   }

   public boolean aw() {
      return this.q;
   }

   public void b(arm $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         arj $$4 = $$0.c($$3);
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

   public exa ax() {
      return this.bL;
   }

   public void a(exa $$0) {
      this.bL = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = avy.a(ah, $$0, ai);
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

   private static vq b(vq $$0, int $$1) {
      return vq.a("options.pixel_value", $$0, $$1);
   }

   private static vq a(vq $$0, double $$1) {
      return vq.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static vq a(vq $$0, vq $$1) {
      return vq.a("options.generic_value", $$0, $$1);
   }

   public static vq a(vq $$0, int $$1) {
      return a($$0, vq.b(Integer.toString($$1)));
   }

   interface a {
      <T> void a(String var1, exr<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
