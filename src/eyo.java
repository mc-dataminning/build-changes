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

public class eyo {
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
   private static final vs al = vs.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final eyn<Boolean> am = eyn.a("options.darkMojangStudiosBackgroundColor", eyn.a(al), false);
   private static final vs an = vs.c("options.hideLightningFlashes.tooltip");
   private final eyn<Boolean> ao = eyn.a("options.hideLightningFlashes", eyn.a(an), false);
   private static final vs ap = vs.c("options.hideSplashTexts.tooltip");
   private final eyn<Boolean> aq = eyn.a("options.hideSplashTexts", eyn.a(ap), false);
   private final eyn<Double> ar = new eyn<>("options.sensitivity", eyn.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, vs.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, vs.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, eyn.m.a, 0.5, $$0x -> {
   });
   private final eyn<Integer> as;
   private final eyn<Integer> at;
   private int au = 0;
   private final eyn<Double> av = new eyn<>(
      "options.entityDistanceScaling",
      eyn.a(),
      eyo::a,
      new eyn.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final eyn<Integer> aw = new eyn<>(
      "options.framerateLimit",
      eyn.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, vs.c("options.framerateLimit.max")) : a($$0x, vs.a("options.framerate", $$1x)),
      new eyn.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> eyk.P().aN().a($$0x)
   );
   private final eyn<exy> ax = new eyn<>(
      "options.renderClouds",
      eyn.a(),
      eyn.b(),
      new eyn.e<>(Arrays.asList(exy.values()), avu.a(exy.d, Codec.BOOL, $$0x -> $$0x ? exy.c : exy.a)),
      exy.c,
      $$0x -> {
         if (eyk.N()) {
            erp $$1x = eyk.P().f.x();
            if ($$1x != null) {
               $$1x.b(eyk.a);
            }
         }
      }
   );
   private static final vs ay = vs.c("options.graphics.fast.tooltip");
   private static final vs az = vs.a("options.graphics.fabulous.tooltip", vs.c("options.graphics.fabulous").a(n.u));
   private static final vs aA = vs.c("options.graphics.fancy.tooltip");
   private final eyn<eyd> aB = new eyn<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fbv.a(aA);
            case a -> fbv.a(ay);
            case c -> fbv.a(az);
         };
      },
      ($$0x, $$1x) -> {
         wg $$2x = vs.c($$1x.b());
         return $$1x == eyd.c ? $$2x.a(n.u) : $$2x;
      },
      new eyn.a<>(
         Arrays.asList(eyd.values()),
         Stream.of(eyd.values()).filter($$0x -> $$0x != eyd.c).collect(Collectors.toList()),
         () -> eyk.P().q() && eyk.P().ai().h(),
         ($$0x, $$1x) -> {
            eyk $$2x = eyk.P();
            fwk $$3x = $$2x.ai();
            if ($$1x == eyd.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(eyd::a, eyd::a)
      ),
      eyd.b,
      $$0x -> {
      }
   );
   private final eyn<Boolean> aC = eyn.a("options.ao", true, $$0x -> eyk.P().f.f());
   private static final vs aD = vs.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final vs aE = vs.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final vs aF = vs.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final eyn<eyr> aG = new eyn<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fbv.a(aD);
         case b -> fbv.a(aE);
         case c -> fbv.a(aF);
      };
   }, eyn.b(), new eyn.e<>(Arrays.asList(eyr.values()), Codec.INT.xmap(eyr::a, eyr::a)), eyr.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final eyn<chy> aH = new eyn<>(
      "options.chat.visibility", eyn.a(), eyn.b(), new eyn.e<>(Arrays.asList(chy.values()), Codec.INT.xmap(chy::a, chy::a)), chy.a, $$0x -> {
      }
   );
   private final eyn<Double> aI = new eyn<>("options.chat.opacity", eyn.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), eyn.m.a, 1.0, $$0x -> eyk.P().l.d().b());
   private final eyn<Double> aJ = new eyn<>("options.chat.line_spacing", eyn.a(), eyo::a, eyn.m.a, 0.0, $$0x -> {
   });
   private final eyn<Double> aK = new eyn<>("options.accessibility.text_background_opacity", eyn.a(), eyo::a, eyn.m.a, 0.5, $$0x -> eyk.P().l.d().b());
   private final eyn<Double> aL = new eyn<>("options.accessibility.panorama_speed", eyn.a(), eyo::a, eyn.m.a, 1.0, $$0x -> {
   });
   private static final vs aM = vs.c("options.accessibility.high_contrast.tooltip");
   private final eyn<Boolean> aN = eyn.a("options.accessibility.high_contrast", eyn.a(aM), false, $$0x -> {
      arq $$1x = eyk.P().ab();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final eyn<Boolean> aO = eyn.a(
      "options.accessibility.narrator_hotkey",
      eyn.a(eyk.a ? vs.c("options.accessibility.narrator_hotkey.mac.tooltip") : vs.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cib> aP = EnumSet.allOf(cib.class);
   private final eyn<bor> aQ = new eyn<>("options.mainHand", eyn.a(), eyn.b(), new eyn.e<>(Arrays.asList(bor.values()), bor.c), bor.b, $$0x -> this.au());
   public int o;
   public int p;
   private final eyn<Double> aR = new eyn<>(
      "options.chat.scale",
      eyn.a(),
      ($$0x, $$1x) -> (vs)($$1x == 0.0 ? vr.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      eyn.m.a,
      1.0,
      $$0x -> eyk.P().l.d().b()
   );
   private final eyn<Double> aS = new eyn<>("options.chat.width", eyn.a(), ($$0x, $$1x) -> b($$0x, fal.a($$1x)), eyn.m.a, 1.0, $$0x -> eyk.P().l.d().b());
   private final eyn<Double> aT = new eyn<>(
      "options.chat.height.unfocused", eyn.a(), ($$0x, $$1x) -> b($$0x, fal.b($$1x)), eyn.m.a, fal.i(), $$0x -> eyk.P().l.d().b()
   );
   private final eyn<Double> aU = new eyn<>(
      "options.chat.height.focused", eyn.a(), ($$0x, $$1x) -> b($$0x, fal.b($$1x)), eyn.m.a, 1.0, $$0x -> eyk.P().l.d().b()
   );
   private final eyn<Double> aV = new eyn<>(
      "options.chat.delay_instant",
      eyn.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? vs.c("options.chat.delay_none") : vs.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new eyn.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> eyk.P().aY().a($$0x)
   );
   private static final vs aW = vs.c("options.notifications.display_time.tooltip");
   private final eyn<Double> aX = new eyn<>(
      "options.notifications.display_time",
      eyn.a(aW),
      ($$0x, $$1x) -> a($$0x, vs.a("options.multiplier", $$1x)),
      new eyn.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final eyn<Integer> aY = new eyn<>(
      "options.mipmapLevels", eyn.a(), ($$0x, $$1x) -> (vs)($$1x == 0 ? vr.a($$0x, false) : a($$0x, $$1x.intValue())), new eyn.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final eyn<exu> aZ = new eyn<>(
      "options.attackIndicator", eyn.a(), eyn.b(), new eyn.e<>(Arrays.asList(exu.values()), Codec.INT.xmap(exu::a, exu::a)), exu.b, $$0x -> {
      }
   );
   public gnv r = gnv.a;
   public boolean s = false;
   public boolean t = false;
   private final eyn<Integer> ba = new eyn<>("options.biomeBlendRadius", eyn.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, vs.c("options.biomeBlendRadius." + $$2x));
   }, new eyn.f(0, 7), 2, $$0x -> eyk.P().f.f());
   private final eyn<Double> bb = new eyn<>(
      "options.mouseWheelSensitivity",
      eyn.a(),
      ($$0x, $$1x) -> a($$0x, vs.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new eyn.f(-200, 100).a(eyo::c, eyo::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final eyn<Boolean> bc = eyn.a("options.rawMouseInput", true, $$0x -> {
      esh $$1x = eyk.P().aN();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final eyn<Boolean> bd = eyn.a("options.autoJump", false);
   private final eyn<Boolean> be = eyn.a("options.operatorItemsTab", false);
   private final eyn<Boolean> bf = eyn.a("options.autoSuggestCommands", true);
   private final eyn<Boolean> bg = eyn.a("options.chat.color", true);
   private final eyn<Boolean> bh = eyn.a("options.chat.links", true);
   private final eyn<Boolean> bi = eyn.a("options.chat.links.prompt", true);
   private final eyn<Boolean> bj = eyn.a("options.vsync", true, $$0x -> {
      if (eyk.P().aN() != null) {
         eyk.P().aN().a($$0x);
      }
   });
   private final eyn<Boolean> bk = eyn.a("options.entityShadows", true);
   private final eyn<Boolean> bl = eyn.a("options.forceUnicodeFont", false, $$0x -> {
      eyk $$1x = eyk.P();
      if ($$1x.aN() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final eyn<Boolean> bm = eyn.a("options.invertMouse", false);
   private final eyn<Boolean> bn = eyn.a("options.discrete_mouse_scroll", false);
   private final eyn<Boolean> bo = eyn.a("options.realmsNotifications", true);
   private static final vs bp = vs.c("options.allowServerListing.tooltip");
   private final eyn<Boolean> bq = eyn.a("options.allowServerListing", eyn.a(bp), true, $$0x -> this.au());
   private final eyn<Boolean> br = eyn.a("options.reducedDebugInfo", false);
   private final Map<atq, eyn<Double>> bs = ac.a(new EnumMap<>(atq.class), $$0x -> {
      for (atq $$1x : atq.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final eyn<Boolean> bt = eyn.a("options.showSubtitles", false);
   private static final vs bu = vs.c("options.directionalAudio.on.tooltip");
   private static final vs bv = vs.c("options.directionalAudio.off.tooltip");
   private final eyn<Boolean> bw = eyn.a("options.directionalAudio", $$0x -> $$0x ? fbv.a(bu) : fbv.a(bv), false, $$0x -> {
      gmq $$1x = eyk.P().aj();
      $$1x.k();
      $$1x.a(glh.a(atp.zK, 1.0F));
   });
   private final eyn<Boolean> bx = new eyn<>(
      "options.accessibility.text_background",
      eyn.a(),
      ($$0x, $$1x) -> $$1x ? vs.c("options.accessibility.text_background.chat") : vs.c("options.accessibility.text_background.everywhere"),
      eyn.a,
      true,
      $$0x -> {
      }
   );
   private final eyn<Boolean> by = eyn.a("options.touchscreen", false);
   private final eyn<Boolean> bz = eyn.a("options.fullscreen", false, $$0x -> {
      eyk $$1x = eyk.P();
      if ($$1x.aN() != null && $$1x.aN().j() != $$0x) {
         $$1x.aN().h();
         this.X().a($$1x.aN().j());
      }
   });
   private final eyn<Boolean> bA = eyn.a("options.viewBobbing", true);
   private static final vs bB = vs.c("options.key.toggle");
   private static final vs bC = vs.c("options.key.hold");
   private final eyn<Boolean> bD = new eyn<>("key.sneak", eyn.a(), ($$0x, $$1x) -> $$1x ? bB : bC, eyn.a, false, $$0x -> {
   });
   private final eyn<Boolean> bE = new eyn<>("key.sprint", eyn.a(), ($$0x, $$1x) -> $$1x ? bB : bC, eyn.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final vs bF = vs.c("options.hideMatchedNames.tooltip");
   private final eyn<Boolean> bG = eyn.a("options.hideMatchedNames", eyn.a(bF), true);
   private final eyn<Boolean> bH = eyn.a("options.autosaveIndicator", true);
   private static final vs bI = vs.c("options.onlyShowSecureChat.tooltip");
   private final eyn<Boolean> bJ = eyn.a("options.onlyShowSecureChat", eyn.a(bI), false);
   public final eyi x = new eyi("key.forward", 87, "key.categories.movement");
   public final eyi y = new eyi("key.left", 65, "key.categories.movement");
   public final eyi z = new eyi("key.back", 83, "key.categories.movement");
   public final eyi A = new eyi("key.right", 68, "key.categories.movement");
   public final eyi B = new eyi("key.jump", 32, "key.categories.movement");
   public final eyi C = new eyy("key.sneak", 340, "key.categories.movement", this.bD::c);
   public final eyi D = new eyy("key.sprint", 341, "key.categories.movement", this.bE::c);
   public final eyi E = new eyi("key.inventory", 69, "key.categories.inventory");
   public final eyi F = new eyi("key.swapOffhand", 70, "key.categories.inventory");
   public final eyi G = new eyi("key.drop", 81, "key.categories.inventory");
   public final eyi H = new eyi("key.use", ery.b.c, 1, "key.categories.gameplay");
   public final eyi I = new eyi("key.attack", ery.b.c, 0, "key.categories.gameplay");
   public final eyi J = new eyi("key.pickItem", ery.b.c, 2, "key.categories.gameplay");
   public final eyi K = new eyi("key.chat", 84, "key.categories.multiplayer");
   public final eyi L = new eyi("key.playerlist", 258, "key.categories.multiplayer");
   public final eyi M = new eyi("key.command", 47, "key.categories.multiplayer");
   public final eyi N = new eyi("key.socialInteractions", 80, "key.categories.multiplayer");
   public final eyi O = new eyi("key.screenshot", 291, "key.categories.misc");
   public final eyi P = new eyi("key.togglePerspective", 294, "key.categories.misc");
   public final eyi Q = new eyi("key.smoothCamera", ery.bv.b(), "key.categories.misc");
   public final eyi R = new eyi("key.fullscreen", 300, "key.categories.misc");
   public final eyi S = new eyi("key.spectatorOutlines", ery.bv.b(), "key.categories.misc");
   public final eyi T = new eyi("key.advancements", 76, "key.categories.misc");
   public final eyi[] U = new eyi[]{
      new eyi("key.hotbar.1", 49, "key.categories.inventory"),
      new eyi("key.hotbar.2", 50, "key.categories.inventory"),
      new eyi("key.hotbar.3", 51, "key.categories.inventory"),
      new eyi("key.hotbar.4", 52, "key.categories.inventory"),
      new eyi("key.hotbar.5", 53, "key.categories.inventory"),
      new eyi("key.hotbar.6", 54, "key.categories.inventory"),
      new eyi("key.hotbar.7", 55, "key.categories.inventory"),
      new eyi("key.hotbar.8", 56, "key.categories.inventory"),
      new eyi("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final eyi V = new eyi("key.saveToolbarActivator", 67, "key.categories.creative");
   public final eyi W = new eyi("key.loadToolbarActivator", 88, "key.categories.creative");
   public final eyi[] X = (eyi[])ArrayUtils.addAll(
      new eyi[]{
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
   protected eyk Y;
   private final File bK;
   public boolean Z;
   private exw bL = exw.a;
   public String aa = "";
   public boolean ab;
   private final eyn<Integer> bM = new eyn<>("options.fov", eyn.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, vs.c("options.fov.min"));
         case 110 -> a($$0x, vs.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new eyn.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> eyk.P().f.r());
   private static final vs bN = vs.a("options.telemetry.button.tooltip", vs.c("options.telemetry.state.minimal"), vs.c("options.telemetry.state.all"));
   private final eyn<Boolean> bO = eyn.a("options.telemetry.button", eyn.a(bN), ($$0x, $$1x) -> {
      eyk $$2x = eyk.P();
      if (!$$2x.D()) {
         return vs.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.C() ? vs.c("options.telemetry.state.all") : vs.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final vs bP = vs.c("options.screenEffectScale.tooltip");
   private final eyn<Double> bQ = new eyn<>(
      "options.screenEffectScale", eyn.a(bP), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vr.c) : a($$0x, $$1x.doubleValue()), eyn.m.a, 1.0, $$0x -> {
      }
   );
   private static final vs bR = vs.c("options.fovEffectScale.tooltip");
   private final eyn<Double> bS = new eyn<>(
      "options.fovEffectScale",
      eyn.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vr.c) : a($$0x, $$1x.doubleValue()),
      eyn.m.a.a(awm::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final vs bT = vs.c("options.darknessEffectScale.tooltip");
   private final eyn<Double> bU = new eyn<>(
      "options.darknessEffectScale",
      eyn.a(bT),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vr.c) : a($$0x, $$1x.doubleValue()),
      eyn.m.a.a(awm::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final vs bV = vs.c("options.glintSpeed.tooltip");
   private final eyn<Double> bW = new eyn<>(
      "options.glintSpeed", eyn.a(bV), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vr.c) : a($$0x, $$1x.doubleValue()), eyn.m.a, 0.5, $$0x -> {
      }
   );
   private static final vs bX = vs.c("options.glintStrength.tooltip");
   private final eyn<Double> bY = new eyn<>(
      "options.glintStrength",
      eyn.a(bX),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vr.c) : a($$0x, $$1x.doubleValue()),
      eyn.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final vs bZ = vs.c("options.damageTiltStrength.tooltip");
   private final eyn<Double> ca = new eyn<>(
      "options.damageTiltStrength", eyn.a(bZ), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vr.c) : a($$0x, $$1x.doubleValue()), eyn.m.a, 1.0, $$0x -> {
      }
   );
   private final eyn<Double> cb = new eyn<>("options.gamma", eyn.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, vs.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, vs.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, vs.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, eyn.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cc = 2147483646;
   private final eyn<Integer> cd = new eyn<>(
      "options.guiScale", eyn.a(), ($$0x, $$1x) -> $$1x == 0 ? vs.c("options.guiScale.auto") : vs.b(Integer.toString($$1x)), new eyn.c(0, () -> {
         eyk $$0x = eyk.P();
         return !$$0x.q() ? 2147483646 : $$0x.aN().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final eyn<eyp> ce = new eyn<>(
      "options.particles", eyn.a(), eyn.b(), new eyn.e<>(Arrays.asList(eyp.values()), Codec.INT.xmap(eyp::a, eyp::a)), eyp.a, $$0x -> {
      }
   );
   private final eyn<eym> cf = new eyn<>(
      "options.narrator",
      eyn.a(),
      ($$0x, $$1x) -> (vs)(this.Y.aX().a() ? $$1x.b() : vs.c("options.narrator.notavailable")),
      new eyn.e<>(Arrays.asList(eym.values()), Codec.INT.xmap(eym::a, eym::a)),
      eym.a,
      $$0x -> this.Y.aX().a($$0x)
   );
   public String ad = "en_us";
   private final eyn<String> cg = new eyn<>(
      "options.audioDevice",
      eyn.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return vs.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? vs.b($$1x.substring(gmn.c)) : vs.b($$1x);
         }
      },
      new eyn.h<>(
         () -> Stream.concat(Stream.of(""), eyk.P().aj().a().stream()).toList(),
         $$0x -> eyk.P().q() && $$0x != "" && !eyk.P().aj().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gmq $$1x = eyk.P().aj();
         $$1x.k();
         $$1x.a(glh.a(atp.zK, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public eyn<Boolean> a() {
      return this.am;
   }

   public eyn<Boolean> b() {
      return this.ao;
   }

   public eyn<Boolean> c() {
      return this.aq;
   }

   public eyn<Double> d() {
      return this.ar;
   }

   public eyn<Integer> e() {
      return this.as;
   }

   public eyn<Integer> f() {
      return this.at;
   }

   public eyn<Double> g() {
      return this.av;
   }

   public eyn<Integer> h() {
      return this.aw;
   }

   public eyn<exy> i() {
      return this.ax;
   }

   public eyn<eyd> j() {
      return this.aB;
   }

   public eyn<Boolean> k() {
      return this.aC;
   }

   public eyn<eyr> l() {
      return this.aG;
   }

   public void a(arq $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (arn $$2 : $$0.f()) {
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

   public eyn<chy> m() {
      return this.aH;
   }

   public eyn<Double> n() {
      return this.aI;
   }

   public eyn<Double> o() {
      return this.aJ;
   }

   public eyn<Double> p() {
      return this.aK;
   }

   public eyn<Double> q() {
      return this.aL;
   }

   public eyn<Boolean> r() {
      return this.aN;
   }

   public eyn<Boolean> s() {
      return this.aO;
   }

   public eyn<bor> t() {
      return this.aQ;
   }

   public eyn<Double> u() {
      return this.aR;
   }

   public eyn<Double> v() {
      return this.aS;
   }

   public eyn<Double> w() {
      return this.aT;
   }

   public eyn<Double> x() {
      return this.aU;
   }

   public eyn<Double> y() {
      return this.aV;
   }

   public eyn<Double> z() {
      return this.aX;
   }

   public eyn<Integer> A() {
      return this.aY;
   }

   public eyn<exu> B() {
      return this.aZ;
   }

   public eyn<Integer> C() {
      return this.ba;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return awm.a(Math.log10($$0) * 100.0);
   }

   public eyn<Double> D() {
      return this.bb;
   }

   public eyn<Boolean> E() {
      return this.bc;
   }

   public eyn<Boolean> F() {
      return this.bd;
   }

   public eyn<Boolean> G() {
      return this.be;
   }

   public eyn<Boolean> H() {
      return this.bf;
   }

   public eyn<Boolean> I() {
      return this.bg;
   }

   public eyn<Boolean> J() {
      return this.bh;
   }

   public eyn<Boolean> K() {
      return this.bi;
   }

   public eyn<Boolean> L() {
      return this.bj;
   }

   public eyn<Boolean> M() {
      return this.bk;
   }

   public eyn<Boolean> N() {
      return this.bl;
   }

   public eyn<Boolean> O() {
      return this.bm;
   }

   public eyn<Boolean> P() {
      return this.bn;
   }

   public eyn<Boolean> Q() {
      return this.bo;
   }

   public eyn<Boolean> R() {
      return this.bq;
   }

   public eyn<Boolean> S() {
      return this.br;
   }

   public final float a(atq $$0) {
      return this.b($$0).c().floatValue();
   }

   public final eyn<Double> b(atq $$0) {
      return Objects.requireNonNull(this.bs.get($$0));
   }

   private eyn<Double> a(String $$0, atq $$1) {
      return new eyn<>(
         $$0, eyn.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vr.c) : a($$0x, $$1x.doubleValue()), eyn.m.a, 1.0, $$1x -> eyk.P().aj().a($$1, $$1x.floatValue())
      );
   }

   public eyn<Boolean> T() {
      return this.bt;
   }

   public eyn<Boolean> U() {
      return this.bw;
   }

   public eyn<Boolean> V() {
      return this.bx;
   }

   public eyn<Boolean> W() {
      return this.by;
   }

   public eyn<Boolean> X() {
      return this.bz;
   }

   public eyn<Boolean> Y() {
      return this.bA;
   }

   public eyn<Boolean> Z() {
      return this.bD;
   }

   public eyn<Boolean> aa() {
      return this.bE;
   }

   public eyn<Boolean> ab() {
      return this.bG;
   }

   public eyn<Boolean> ac() {
      return this.bH;
   }

   public eyn<Boolean> ad() {
      return this.bJ;
   }

   public eyn<Integer> ae() {
      return this.bM;
   }

   public eyn<Boolean> af() {
      return this.bO;
   }

   public eyn<Double> ag() {
      return this.bQ;
   }

   public eyn<Double> ah() {
      return this.bS;
   }

   public eyn<Double> ai() {
      return this.bU;
   }

   public eyn<Double> aj() {
      return this.bW;
   }

   public eyn<Double> ak() {
      return this.bY;
   }

   public eyn<Double> al() {
      return this.ca;
   }

   public eyn<Double> am() {
      return this.cb;
   }

   public eyn<Integer> an() {
      return this.cd;
   }

   public eyn<eyp> ao() {
      return this.ce;
   }

   public eyn<eym> ap() {
      return this.cf;
   }

   public eyn<String> aq() {
      return this.cg;
   }

   public eyo(eyk $$0, File $$1) {
      this.Y = $$0;
      this.bK = new File($$1, "options.txt");
      boolean $$2 = $$0.ag();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.as = new eyn<>(
         "options.renderDistance",
         eyn.a(),
         ($$0x, $$1x) -> a($$0x, vs.a("options.chunks", $$1x)),
         new eyn.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> eyk.P().f.r()
      );
      this.at = new eyn<>(
         "options.simulationDistance", eyn.a(), ($$0x, $$1x) -> a($$0x, vs.a("options.chunks", $$1x)), new eyn.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
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

   public void a(eyi $$0, ery.a $$1) {
      $$0.b($$1);
      this.as();
   }

   private void a(eyo.a $$0) {
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
      this.i = $$0.a("resourcePacks", this.i, eyo::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, eyo::c, ah::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, gnv::a, gnv::a);
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

      for (eyi $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(ery.a($$3));
         }
      }

      for (atq $$4 : atq.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bs.get($$4));
      }

      for (cib $$5 : cib.values()) {
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

         sy $$0 = new sy();

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

         final sy $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(eyd.b);
            } else {
               this.aB.a(eyd.a);
            }
         }

         this.a(new eyo.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, eyn<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> eyo.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     eyo.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? eyo.a($$2) : $$1;
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
               } else if (eyo.a($$2)) {
                  return 1.0F;
               } else if (eyo.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     eyo.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         eyi.d();
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

   private sy a(sy $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return axs.e.a(this.Y.as(), $$0, $$1);
   }

   public void as() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bK), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new eyo.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, eyn<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> eyo.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(eyo.ah.toJson($$2x));
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

   public aop at() {
      int $$0 = 0;

      for (cib $$1 : this.aP) {
         $$0 |= $$1.a();
      }

      return new aop(this.ad, this.as.c(), this.aH.c(), this.bg.c(), $$0, this.aQ.c(), this.Y.aR(), this.bq.c());
   }

   public void au() {
      if (this.Y.s != null) {
         this.Y.s.cr.b(new yr(this.at()));
      }
   }

   private void b(cib $$0, boolean $$1) {
      if ($$1) {
         this.aP.add($$0);
      } else {
         this.aP.remove($$0);
      }
   }

   public boolean a(cib $$0) {
      return this.aP.contains($$0);
   }

   public void a(cib $$0, boolean $$1) {
      this.b($$0, $$1);
      this.au();
   }

   public exy av() {
      return this.aA() >= 4 ? this.ax.c() : exy.a;
   }

   public boolean aw() {
      return this.q;
   }

   public void b(arq $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         arn $$4 = $$0.c($$3);
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

   public exw ax() {
      return this.bL;
   }

   public void a(exw $$0) {
      this.bL = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = awc.a(ah, $$0, ai);
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

   private static vs b(vs $$0, int $$1) {
      return vs.a("options.pixel_value", $$0, $$1);
   }

   private static vs a(vs $$0, double $$1) {
      return vs.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static vs a(vs $$0, vs $$1) {
      return vs.a("options.generic_value", $$0, $$1);
   }

   public static vs a(vs $$0, int $$1) {
      return a($$0, vs.b(Integer.toString($$1)));
   }

   interface a {
      <T> void a(String var1, eyn<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
