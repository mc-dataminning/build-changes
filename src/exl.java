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

public class exl {
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
   private final exk<Boolean> am = exk.a("options.darkMojangStudiosBackgroundColor", exk.a(al), false);
   private static final vq an = vq.c("options.hideLightningFlashes.tooltip");
   private final exk<Boolean> ao = exk.a("options.hideLightningFlashes", exk.a(an), false);
   private static final vq ap = vq.c("options.hideSplashTexts.tooltip");
   private final exk<Boolean> aq = exk.a("options.hideSplashTexts", exk.a(ap), false);
   private final exk<Double> ar = new exk<>("options.sensitivity", exk.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, vq.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, vq.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, exk.m.a, 0.5, $$0x -> {
   });
   private final exk<Integer> as;
   private final exk<Integer> at;
   private int au = 0;
   private final exk<Double> av = new exk<>(
      "options.entityDistanceScaling",
      exk.a(),
      exl::a,
      new exk.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final exk<Integer> aw = new exk<>(
      "options.framerateLimit",
      exk.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, vq.c("options.framerateLimit.max")) : a($$0x, vq.a("options.framerate", $$1x)),
      new exk.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> exh.O().aM().a($$0x)
   );
   private final exk<ewv> ax = new exk<>(
      "options.renderClouds",
      exk.a(),
      exk.b(),
      new exk.e<>(Arrays.asList(ewv.values()), avp.a(ewv.d, Codec.BOOL, $$0x -> $$0x ? ewv.c : ewv.a)),
      ewv.c,
      $$0x -> {
         if (exh.M()) {
            eqm $$1x = exh.O().f.x();
            if ($$1x != null) {
               $$1x.b(exh.a);
            }
         }
      }
   );
   private static final vq ay = vq.c("options.graphics.fast.tooltip");
   private static final vq az = vq.a("options.graphics.fabulous.tooltip", vq.c("options.graphics.fabulous").a(n.u));
   private static final vq aA = vq.c("options.graphics.fancy.tooltip");
   private final exk<exa> aB = new exk<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fas.a(aA);
            case a -> fas.a(ay);
            case c -> fas.a(az);
         };
      },
      ($$0x, $$1x) -> {
         we $$2x = vq.c($$1x.b());
         return $$1x == exa.c ? $$2x.a(n.u) : $$2x;
      },
      new exk.a<>(
         Arrays.asList(exa.values()),
         Stream.of(exa.values()).filter($$0x -> $$0x != exa.c).collect(Collectors.toList()),
         () -> exh.O().q() && exh.O().ah().h(),
         ($$0x, $$1x) -> {
            exh $$2x = exh.O();
            fvg $$3x = $$2x.ah();
            if ($$1x == exa.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(exa::a, exa::a)
      ),
      exa.b,
      $$0x -> {
      }
   );
   private final exk<Boolean> aC = exk.a("options.ao", true, $$0x -> exh.O().f.f());
   private static final vq aD = vq.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final vq aE = vq.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final vq aF = vq.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final exk<exo> aG = new exk<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fas.a(aD);
         case b -> fas.a(aE);
         case c -> fas.a(aF);
      };
   }, exk.b(), new exk.e<>(Arrays.asList(exo.values()), Codec.INT.xmap(exo::a, exo::a)), exo.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final exk<chf> aH = new exk<>(
      "options.chat.visibility", exk.a(), exk.b(), new exk.e<>(Arrays.asList(chf.values()), Codec.INT.xmap(chf::a, chf::a)), chf.a, $$0x -> {
      }
   );
   private final exk<Double> aI = new exk<>("options.chat.opacity", exk.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), exk.m.a, 1.0, $$0x -> exh.O().l.d().b());
   private final exk<Double> aJ = new exk<>("options.chat.line_spacing", exk.a(), exl::a, exk.m.a, 0.0, $$0x -> {
   });
   private final exk<Double> aK = new exk<>("options.accessibility.text_background_opacity", exk.a(), exl::a, exk.m.a, 0.5, $$0x -> exh.O().l.d().b());
   private final exk<Double> aL = new exk<>("options.accessibility.panorama_speed", exk.a(), exl::a, exk.m.a, 1.0, $$0x -> {
   });
   private static final vq aM = vq.c("options.accessibility.high_contrast.tooltip");
   private final exk<Boolean> aN = exk.a("options.accessibility.high_contrast", exk.a(aM), false, $$0x -> {
      arl $$1x = exh.O().aa();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final exk<Boolean> aO = exk.a(
      "options.accessibility.narrator_hotkey",
      exk.a(exh.a ? vq.c("options.accessibility.narrator_hotkey.mac.tooltip") : vq.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<chi> aP = EnumSet.allOf(chi.class);
   private final exk<boa> aQ = new exk<>("options.mainHand", exk.a(), exk.b(), new exk.e<>(Arrays.asList(boa.values()), boa.c), boa.b, $$0x -> this.au());
   public int o;
   public int p;
   private final exk<Double> aR = new exk<>(
      "options.chat.scale",
      exk.a(),
      ($$0x, $$1x) -> (vq)($$1x == 0.0 ? vp.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      exk.m.a,
      1.0,
      $$0x -> exh.O().l.d().b()
   );
   private final exk<Double> aS = new exk<>("options.chat.width", exk.a(), ($$0x, $$1x) -> b($$0x, ezi.a($$1x)), exk.m.a, 1.0, $$0x -> exh.O().l.d().b());
   private final exk<Double> aT = new exk<>(
      "options.chat.height.unfocused", exk.a(), ($$0x, $$1x) -> b($$0x, ezi.b($$1x)), exk.m.a, ezi.i(), $$0x -> exh.O().l.d().b()
   );
   private final exk<Double> aU = new exk<>(
      "options.chat.height.focused", exk.a(), ($$0x, $$1x) -> b($$0x, ezi.b($$1x)), exk.m.a, 1.0, $$0x -> exh.O().l.d().b()
   );
   private final exk<Double> aV = new exk<>(
      "options.chat.delay_instant",
      exk.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? vq.c("options.chat.delay_none") : vq.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new exk.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> exh.O().aX().a($$0x)
   );
   private static final vq aW = vq.c("options.notifications.display_time.tooltip");
   private final exk<Double> aX = new exk<>(
      "options.notifications.display_time",
      exk.a(aW),
      ($$0x, $$1x) -> a($$0x, vq.a("options.multiplier", $$1x)),
      new exk.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final exk<Integer> aY = new exk<>(
      "options.mipmapLevels", exk.a(), ($$0x, $$1x) -> (vq)($$1x == 0 ? vp.a($$0x, false) : a($$0x, $$1x.intValue())), new exk.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final exk<ewr> aZ = new exk<>(
      "options.attackIndicator", exk.a(), exk.b(), new exk.e<>(Arrays.asList(ewr.values()), Codec.INT.xmap(ewr::a, ewr::a)), ewr.b, $$0x -> {
      }
   );
   public gmq r = gmq.a;
   public boolean s = false;
   public boolean t = false;
   private final exk<Integer> ba = new exk<>("options.biomeBlendRadius", exk.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, vq.c("options.biomeBlendRadius." + $$2x));
   }, new exk.f(0, 7), 2, $$0x -> exh.O().f.f());
   private final exk<Double> bb = new exk<>(
      "options.mouseWheelSensitivity",
      exk.a(),
      ($$0x, $$1x) -> a($$0x, vq.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new exk.f(-200, 100).a(exl::c, exl::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final exk<Boolean> bc = exk.a("options.rawMouseInput", true, $$0x -> {
      ere $$1x = exh.O().aM();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final exk<Boolean> bd = exk.a("options.autoJump", false);
   private final exk<Boolean> be = exk.a("options.operatorItemsTab", false);
   private final exk<Boolean> bf = exk.a("options.autoSuggestCommands", true);
   private final exk<Boolean> bg = exk.a("options.chat.color", true);
   private final exk<Boolean> bh = exk.a("options.chat.links", true);
   private final exk<Boolean> bi = exk.a("options.chat.links.prompt", true);
   private final exk<Boolean> bj = exk.a("options.vsync", true, $$0x -> {
      if (exh.O().aM() != null) {
         exh.O().aM().a($$0x);
      }
   });
   private final exk<Boolean> bk = exk.a("options.entityShadows", true);
   private final exk<Boolean> bl = exk.a("options.forceUnicodeFont", false, $$0x -> {
      exh $$1x = exh.O();
      if ($$1x.aM() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final exk<Boolean> bm = exk.a("options.invertMouse", false);
   private final exk<Boolean> bn = exk.a("options.discrete_mouse_scroll", false);
   private final exk<Boolean> bo = exk.a("options.realmsNotifications", true);
   private static final vq bp = vq.c("options.allowServerListing.tooltip");
   private final exk<Boolean> bq = exk.a("options.allowServerListing", exk.a(bp), true, $$0x -> this.au());
   private final exk<Boolean> br = exk.a("options.reducedDebugInfo", false);
   private final Map<atl, exk<Double>> bs = ac.a(new EnumMap<>(atl.class), $$0x -> {
      for (atl $$1x : atl.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final exk<Boolean> bt = exk.a("options.showSubtitles", false);
   private static final vq bu = vq.c("options.directionalAudio.on.tooltip");
   private static final vq bv = vq.c("options.directionalAudio.off.tooltip");
   private final exk<Boolean> bw = exk.a("options.directionalAudio", $$0x -> $$0x ? fas.a(bu) : fas.a(bv), false, $$0x -> {
      gll $$1x = exh.O().ai();
      $$1x.k();
      $$1x.a(gkc.a(atk.zJ, 1.0F));
   });
   private final exk<Boolean> bx = new exk<>(
      "options.accessibility.text_background",
      exk.a(),
      ($$0x, $$1x) -> $$1x ? vq.c("options.accessibility.text_background.chat") : vq.c("options.accessibility.text_background.everywhere"),
      exk.a,
      true,
      $$0x -> {
      }
   );
   private final exk<Boolean> by = exk.a("options.touchscreen", false);
   private final exk<Boolean> bz = exk.a("options.fullscreen", false, $$0x -> {
      exh $$1x = exh.O();
      if ($$1x.aM() != null && $$1x.aM().j() != $$0x) {
         $$1x.aM().h();
         this.X().a($$1x.aM().j());
      }
   });
   private final exk<Boolean> bA = exk.a("options.viewBobbing", true);
   private static final vq bB = vq.c("options.key.toggle");
   private static final vq bC = vq.c("options.key.hold");
   private final exk<Boolean> bD = new exk<>("key.sneak", exk.a(), ($$0x, $$1x) -> $$1x ? bB : bC, exk.a, false, $$0x -> {
   });
   private final exk<Boolean> bE = new exk<>("key.sprint", exk.a(), ($$0x, $$1x) -> $$1x ? bB : bC, exk.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final vq bF = vq.c("options.hideMatchedNames.tooltip");
   private final exk<Boolean> bG = exk.a("options.hideMatchedNames", exk.a(bF), true);
   private final exk<Boolean> bH = exk.a("options.autosaveIndicator", true);
   private static final vq bI = vq.c("options.onlyShowSecureChat.tooltip");
   private final exk<Boolean> bJ = exk.a("options.onlyShowSecureChat", exk.a(bI), false);
   public final exf x = new exf("key.forward", 87, "key.categories.movement");
   public final exf y = new exf("key.left", 65, "key.categories.movement");
   public final exf z = new exf("key.back", 83, "key.categories.movement");
   public final exf A = new exf("key.right", 68, "key.categories.movement");
   public final exf B = new exf("key.jump", 32, "key.categories.movement");
   public final exf C = new exv("key.sneak", 340, "key.categories.movement", this.bD::c);
   public final exf D = new exv("key.sprint", 341, "key.categories.movement", this.bE::c);
   public final exf E = new exf("key.inventory", 69, "key.categories.inventory");
   public final exf F = new exf("key.swapOffhand", 70, "key.categories.inventory");
   public final exf G = new exf("key.drop", 81, "key.categories.inventory");
   public final exf H = new exf("key.use", eqv.b.c, 1, "key.categories.gameplay");
   public final exf I = new exf("key.attack", eqv.b.c, 0, "key.categories.gameplay");
   public final exf J = new exf("key.pickItem", eqv.b.c, 2, "key.categories.gameplay");
   public final exf K = new exf("key.chat", 84, "key.categories.multiplayer");
   public final exf L = new exf("key.playerlist", 258, "key.categories.multiplayer");
   public final exf M = new exf("key.command", 47, "key.categories.multiplayer");
   public final exf N = new exf("key.socialInteractions", 80, "key.categories.multiplayer");
   public final exf O = new exf("key.screenshot", 291, "key.categories.misc");
   public final exf P = new exf("key.togglePerspective", 294, "key.categories.misc");
   public final exf Q = new exf("key.smoothCamera", eqv.bv.b(), "key.categories.misc");
   public final exf R = new exf("key.fullscreen", 300, "key.categories.misc");
   public final exf S = new exf("key.spectatorOutlines", eqv.bv.b(), "key.categories.misc");
   public final exf T = new exf("key.advancements", 76, "key.categories.misc");
   public final exf[] U = new exf[]{
      new exf("key.hotbar.1", 49, "key.categories.inventory"),
      new exf("key.hotbar.2", 50, "key.categories.inventory"),
      new exf("key.hotbar.3", 51, "key.categories.inventory"),
      new exf("key.hotbar.4", 52, "key.categories.inventory"),
      new exf("key.hotbar.5", 53, "key.categories.inventory"),
      new exf("key.hotbar.6", 54, "key.categories.inventory"),
      new exf("key.hotbar.7", 55, "key.categories.inventory"),
      new exf("key.hotbar.8", 56, "key.categories.inventory"),
      new exf("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final exf V = new exf("key.saveToolbarActivator", 67, "key.categories.creative");
   public final exf W = new exf("key.loadToolbarActivator", 88, "key.categories.creative");
   public final exf[] X = (exf[])ArrayUtils.addAll(
      new exf[]{
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
   protected exh Y;
   private final File bK;
   public boolean Z;
   private ewt bL = ewt.a;
   public String aa = "";
   public boolean ab;
   private final exk<Integer> bM = new exk<>("options.fov", exk.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, vq.c("options.fov.min"));
         case 110 -> a($$0x, vq.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new exk.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> exh.O().f.r());
   private static final vq bN = vq.a("options.telemetry.button.tooltip", vq.c("options.telemetry.state.minimal"), vq.c("options.telemetry.state.all"));
   private final exk<Boolean> bO = exk.a("options.telemetry.button", exk.a(bN), ($$0x, $$1x) -> {
      exh $$2x = exh.O();
      if (!$$2x.C()) {
         return vq.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.B() ? vq.c("options.telemetry.state.all") : vq.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final vq bP = vq.c("options.screenEffectScale.tooltip");
   private final exk<Double> bQ = new exk<>(
      "options.screenEffectScale", exk.a(bP), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vp.c) : a($$0x, $$1x.doubleValue()), exk.m.a, 1.0, $$0x -> {
      }
   );
   private static final vq bR = vq.c("options.fovEffectScale.tooltip");
   private final exk<Double> bS = new exk<>(
      "options.fovEffectScale",
      exk.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vp.c) : a($$0x, $$1x.doubleValue()),
      exk.m.a.a(awh::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final vq bT = vq.c("options.darknessEffectScale.tooltip");
   private final exk<Double> bU = new exk<>(
      "options.darknessEffectScale",
      exk.a(bT),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vp.c) : a($$0x, $$1x.doubleValue()),
      exk.m.a.a(awh::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final vq bV = vq.c("options.glintSpeed.tooltip");
   private final exk<Double> bW = new exk<>(
      "options.glintSpeed", exk.a(bV), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vp.c) : a($$0x, $$1x.doubleValue()), exk.m.a, 0.5, $$0x -> {
      }
   );
   private static final vq bX = vq.c("options.glintStrength.tooltip");
   private final exk<Double> bY = new exk<>(
      "options.glintStrength",
      exk.a(bX),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vp.c) : a($$0x, $$1x.doubleValue()),
      exk.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final vq bZ = vq.c("options.damageTiltStrength.tooltip");
   private final exk<Double> ca = new exk<>(
      "options.damageTiltStrength", exk.a(bZ), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vp.c) : a($$0x, $$1x.doubleValue()), exk.m.a, 1.0, $$0x -> {
      }
   );
   private final exk<Double> cb = new exk<>("options.gamma", exk.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, vq.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, vq.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, vq.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, exk.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cc = 2147483646;
   private final exk<Integer> cd = new exk<>(
      "options.guiScale", exk.a(), ($$0x, $$1x) -> $$1x == 0 ? vq.c("options.guiScale.auto") : vq.b(Integer.toString($$1x)), new exk.c(0, () -> {
         exh $$0x = exh.O();
         return !$$0x.q() ? 2147483646 : $$0x.aM().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final exk<exm> ce = new exk<>(
      "options.particles", exk.a(), exk.b(), new exk.e<>(Arrays.asList(exm.values()), Codec.INT.xmap(exm::a, exm::a)), exm.a, $$0x -> {
      }
   );
   private final exk<exj> cf = new exk<>(
      "options.narrator",
      exk.a(),
      ($$0x, $$1x) -> (vq)(this.Y.aW().a() ? $$1x.b() : vq.c("options.narrator.notavailable")),
      new exk.e<>(Arrays.asList(exj.values()), Codec.INT.xmap(exj::a, exj::a)),
      exj.a,
      $$0x -> this.Y.aW().a($$0x)
   );
   public String ad = "en_us";
   private final exk<String> cg = new exk<>(
      "options.audioDevice",
      exk.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return vq.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? vq.b($$1x.substring(gli.c)) : vq.b($$1x);
         }
      },
      new exk.h<>(
         () -> Stream.concat(Stream.of(""), exh.O().ai().a().stream()).toList(),
         $$0x -> exh.O().q() && $$0x != "" && !exh.O().ai().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gll $$1x = exh.O().ai();
         $$1x.k();
         $$1x.a(gkc.a(atk.zJ, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public exk<Boolean> a() {
      return this.am;
   }

   public exk<Boolean> b() {
      return this.ao;
   }

   public exk<Boolean> c() {
      return this.aq;
   }

   public exk<Double> d() {
      return this.ar;
   }

   public exk<Integer> e() {
      return this.as;
   }

   public exk<Integer> f() {
      return this.at;
   }

   public exk<Double> g() {
      return this.av;
   }

   public exk<Integer> h() {
      return this.aw;
   }

   public exk<ewv> i() {
      return this.ax;
   }

   public exk<exa> j() {
      return this.aB;
   }

   public exk<Boolean> k() {
      return this.aC;
   }

   public exk<exo> l() {
      return this.aG;
   }

   public void a(arl $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (ari $$2 : $$0.f()) {
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

   public exk<chf> m() {
      return this.aH;
   }

   public exk<Double> n() {
      return this.aI;
   }

   public exk<Double> o() {
      return this.aJ;
   }

   public exk<Double> p() {
      return this.aK;
   }

   public exk<Double> q() {
      return this.aL;
   }

   public exk<Boolean> r() {
      return this.aN;
   }

   public exk<Boolean> s() {
      return this.aO;
   }

   public exk<boa> t() {
      return this.aQ;
   }

   public exk<Double> u() {
      return this.aR;
   }

   public exk<Double> v() {
      return this.aS;
   }

   public exk<Double> w() {
      return this.aT;
   }

   public exk<Double> x() {
      return this.aU;
   }

   public exk<Double> y() {
      return this.aV;
   }

   public exk<Double> z() {
      return this.aX;
   }

   public exk<Integer> A() {
      return this.aY;
   }

   public exk<ewr> B() {
      return this.aZ;
   }

   public exk<Integer> C() {
      return this.ba;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return awh.a(Math.log10($$0) * 100.0);
   }

   public exk<Double> D() {
      return this.bb;
   }

   public exk<Boolean> E() {
      return this.bc;
   }

   public exk<Boolean> F() {
      return this.bd;
   }

   public exk<Boolean> G() {
      return this.be;
   }

   public exk<Boolean> H() {
      return this.bf;
   }

   public exk<Boolean> I() {
      return this.bg;
   }

   public exk<Boolean> J() {
      return this.bh;
   }

   public exk<Boolean> K() {
      return this.bi;
   }

   public exk<Boolean> L() {
      return this.bj;
   }

   public exk<Boolean> M() {
      return this.bk;
   }

   public exk<Boolean> N() {
      return this.bl;
   }

   public exk<Boolean> O() {
      return this.bm;
   }

   public exk<Boolean> P() {
      return this.bn;
   }

   public exk<Boolean> Q() {
      return this.bo;
   }

   public exk<Boolean> R() {
      return this.bq;
   }

   public exk<Boolean> S() {
      return this.br;
   }

   public final float a(atl $$0) {
      return this.b($$0).c().floatValue();
   }

   public final exk<Double> b(atl $$0) {
      return Objects.requireNonNull(this.bs.get($$0));
   }

   private exk<Double> a(String $$0, atl $$1) {
      return new exk<>(
         $$0, exk.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vp.c) : a($$0x, $$1x.doubleValue()), exk.m.a, 1.0, $$1x -> exh.O().ai().a($$1, $$1x.floatValue())
      );
   }

   public exk<Boolean> T() {
      return this.bt;
   }

   public exk<Boolean> U() {
      return this.bw;
   }

   public exk<Boolean> V() {
      return this.bx;
   }

   public exk<Boolean> W() {
      return this.by;
   }

   public exk<Boolean> X() {
      return this.bz;
   }

   public exk<Boolean> Y() {
      return this.bA;
   }

   public exk<Boolean> Z() {
      return this.bD;
   }

   public exk<Boolean> aa() {
      return this.bE;
   }

   public exk<Boolean> ab() {
      return this.bG;
   }

   public exk<Boolean> ac() {
      return this.bH;
   }

   public exk<Boolean> ad() {
      return this.bJ;
   }

   public exk<Integer> ae() {
      return this.bM;
   }

   public exk<Boolean> af() {
      return this.bO;
   }

   public exk<Double> ag() {
      return this.bQ;
   }

   public exk<Double> ah() {
      return this.bS;
   }

   public exk<Double> ai() {
      return this.bU;
   }

   public exk<Double> aj() {
      return this.bW;
   }

   public exk<Double> ak() {
      return this.bY;
   }

   public exk<Double> al() {
      return this.ca;
   }

   public exk<Double> am() {
      return this.cb;
   }

   public exk<Integer> an() {
      return this.cd;
   }

   public exk<exm> ao() {
      return this.ce;
   }

   public exk<exj> ap() {
      return this.cf;
   }

   public exk<String> aq() {
      return this.cg;
   }

   public exl(exh $$0, File $$1) {
      this.Y = $$0;
      this.bK = new File($$1, "options.txt");
      boolean $$2 = $$0.af();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.as = new exk<>(
         "options.renderDistance",
         exk.a(),
         ($$0x, $$1x) -> a($$0x, vq.a("options.chunks", $$1x)),
         new exk.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> exh.O().f.r()
      );
      this.at = new exk<>(
         "options.simulationDistance", exk.a(), ($$0x, $$1x) -> a($$0x, vq.a("options.chunks", $$1x)), new exk.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
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

   public void a(exf $$0, eqv.a $$1) {
      $$0.b($$1);
      this.as();
   }

   private void a(exl.a $$0) {
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
      this.i = $$0.a("resourcePacks", this.i, exl::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, exl::c, ah::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, gmq::a, gmq::a);
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

      for (exf $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(eqv.a($$3));
         }
      }

      for (atl $$4 : atl.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bs.get($$4));
      }

      for (chi $$5 : chi.values()) {
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
               this.aB.a(exa.b);
            } else {
               this.aB.a(exa.a);
            }
         }

         this.a(new exl.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, exk<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> exl.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     exl.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? exl.a($$2) : $$1;
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
               } else if (exl.a($$2)) {
                  return 1.0F;
               } else if (exl.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     exl.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         exf.d();
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

      return axo.e.a(this.Y.ar(), $$0, $$1);
   }

   public void as() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bK), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new exl.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, exk<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> exl.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(exl.ah.toJson($$2x));
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

   public aok at() {
      int $$0 = 0;

      for (chi $$1 : this.aP) {
         $$0 |= $$1.a();
      }

      return new aok(this.ad, this.as.c(), this.aH.c(), this.bg.c(), $$0, this.aQ.c(), this.Y.aQ(), this.bq.c());
   }

   public void au() {
      if (this.Y.s != null) {
         this.Y.s.cq.b(new yp(this.at()));
      }
   }

   private void b(chi $$0, boolean $$1) {
      if ($$1) {
         this.aP.add($$0);
      } else {
         this.aP.remove($$0);
      }
   }

   public boolean a(chi $$0) {
      return this.aP.contains($$0);
   }

   public void a(chi $$0, boolean $$1) {
      this.b($$0, $$1);
      this.au();
   }

   public ewv av() {
      return this.aA() >= 4 ? this.ax.c() : ewv.a;
   }

   public boolean aw() {
      return this.q;
   }

   public void b(arl $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         ari $$4 = $$0.c($$3);
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

   public ewt ax() {
      return this.bL;
   }

   public void a(ewt $$0) {
      this.bL = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = avx.a(ah, $$0, ai);
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
      <T> void a(String var1, exk<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
