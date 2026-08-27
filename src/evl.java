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

public class evl {
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
   private final evk<Boolean> am = evk.a("options.darkMojangStudiosBackgroundColor", evk.a(al), false);
   private static final vf an = vf.c("options.hideLightningFlashes.tooltip");
   private final evk<Boolean> ao = evk.a("options.hideLightningFlashes", evk.a(an), false);
   private static final vf ap = vf.c("options.hideSplashTexts.tooltip");
   private final evk<Boolean> aq = evk.a("options.hideSplashTexts", evk.a(ap), false);
   private final evk<Double> ar = new evk<>("options.sensitivity", evk.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, vf.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, vf.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, evk.m.a, 0.5, $$0x -> {
   });
   private final evk<Integer> as;
   private final evk<Integer> at;
   private int au = 0;
   private final evk<Double> av = new evk<>(
      "options.entityDistanceScaling",
      evk.a(),
      evl::a,
      new evk.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final evk<Integer> aw = new evk<>(
      "options.framerateLimit",
      evk.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, vf.c("options.framerateLimit.max")) : a($$0x, vf.a("options.framerate", $$1x)),
      new evk.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> evh.O().aM().a($$0x)
   );
   private final evk<euv> ax = new evk<>(
      "options.renderClouds",
      evk.a(),
      evk.b(),
      new evk.e<>(Arrays.asList(euv.values()), atv.a(euv.d, Codec.BOOL, $$0x -> $$0x ? euv.c : euv.a)),
      euv.c,
      $$0x -> {
         if (evh.M()) {
            eom $$1x = evh.O().f.x();
            if ($$1x != null) {
               $$1x.b(evh.a);
            }
         }
      }
   );
   private static final vf ay = vf.c("options.graphics.fast.tooltip");
   private static final vf az = vf.a("options.graphics.fabulous.tooltip", vf.c("options.graphics.fabulous").a(n.u));
   private static final vf aA = vf.c("options.graphics.fancy.tooltip");
   private final evk<eva> aB = new evk<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> eyq.a(aA);
            case a -> eyq.a(ay);
            case c -> eyq.a(az);
         };
      },
      ($$0x, $$1x) -> {
         vt $$2x = vf.c($$1x.b());
         return $$1x == eva.c ? $$2x.a(n.u) : $$2x;
      },
      new evk.a<>(
         Arrays.asList(eva.values()),
         Stream.of(eva.values()).filter($$0x -> $$0x != eva.c).collect(Collectors.toList()),
         () -> evh.O().q() && evh.O().ah().h(),
         ($$0x, $$1x) -> {
            evh $$2x = evh.O();
            fta $$3x = $$2x.ah();
            if ($$1x == eva.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(eva::a, eva::a)
      ),
      eva.b,
      $$0x -> {
      }
   );
   private final evk<Boolean> aC = evk.a("options.ao", true, $$0x -> evh.O().f.f());
   private static final vf aD = vf.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final vf aE = vf.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final vf aF = vf.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final evk<evo> aG = new evk<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> eyq.a(aD);
         case b -> eyq.a(aE);
         case c -> eyq.a(aF);
      };
   }, evk.b(), new evk.e<>(Arrays.asList(evo.values()), Codec.INT.xmap(evo::a, evo::a)), evo.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final evk<cff> aH = new evk<>(
      "options.chat.visibility", evk.a(), evk.b(), new evk.e<>(Arrays.asList(cff.values()), Codec.INT.xmap(cff::a, cff::a)), cff.a, $$0x -> {
      }
   );
   private final evk<Double> aI = new evk<>("options.chat.opacity", evk.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), evk.m.a, 1.0, $$0x -> evh.O().l.d().b());
   private final evk<Double> aJ = new evk<>("options.chat.line_spacing", evk.a(), evl::a, evk.m.a, 0.0, $$0x -> {
   });
   private final evk<Double> aK = new evk<>("options.accessibility.text_background_opacity", evk.a(), evl::a, evk.m.a, 0.5, $$0x -> evh.O().l.d().b());
   private final evk<Double> aL = new evk<>("options.accessibility.panorama_speed", evk.a(), evl::a, evk.m.a, 1.0, $$0x -> {
   });
   private static final vf aM = vf.c("options.accessibility.high_contrast.tooltip");
   private final evk<Boolean> aN = evk.a("options.accessibility.high_contrast", evk.a(aM), false, $$0x -> {
      aps $$1x = evh.O().aa();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final evk<Boolean> aO = evk.a(
      "options.accessibility.narrator_hotkey",
      evk.a(evh.a ? vf.c("options.accessibility.narrator_hotkey.mac.tooltip") : vf.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cfi> aP = EnumSet.allOf(cfi.class);
   private final evk<bme> aQ = new evk<>("options.mainHand", evk.a(), evk.b(), new evk.e<>(Arrays.asList(bme.values()), bme.c), bme.b, $$0x -> this.au());
   public int o;
   public int p;
   private final evk<Double> aR = new evk<>(
      "options.chat.scale",
      evk.a(),
      ($$0x, $$1x) -> (vf)($$1x == 0.0 ? ve.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      evk.m.a,
      1.0,
      $$0x -> evh.O().l.d().b()
   );
   private final evk<Double> aS = new evk<>("options.chat.width", evk.a(), ($$0x, $$1x) -> b($$0x, exg.a($$1x)), evk.m.a, 1.0, $$0x -> evh.O().l.d().b());
   private final evk<Double> aT = new evk<>(
      "options.chat.height.unfocused", evk.a(), ($$0x, $$1x) -> b($$0x, exg.b($$1x)), evk.m.a, exg.h(), $$0x -> evh.O().l.d().b()
   );
   private final evk<Double> aU = new evk<>(
      "options.chat.height.focused", evk.a(), ($$0x, $$1x) -> b($$0x, exg.b($$1x)), evk.m.a, 1.0, $$0x -> evh.O().l.d().b()
   );
   private final evk<Double> aV = new evk<>(
      "options.chat.delay_instant",
      evk.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? vf.c("options.chat.delay_none") : vf.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new evk.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> evh.O().aW().a($$0x)
   );
   private static final vf aW = vf.c("options.notifications.display_time.tooltip");
   private final evk<Double> aX = new evk<>(
      "options.notifications.display_time",
      evk.a(aW),
      ($$0x, $$1x) -> a($$0x, vf.a("options.multiplier", $$1x)),
      new evk.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final evk<Integer> aY = new evk<>(
      "options.mipmapLevels", evk.a(), ($$0x, $$1x) -> (vf)($$1x == 0 ? ve.a($$0x, false) : a($$0x, $$1x.intValue())), new evk.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final evk<eur> aZ = new evk<>(
      "options.attackIndicator", evk.a(), evk.b(), new evk.e<>(Arrays.asList(eur.values()), Codec.INT.xmap(eur::a, eur::a)), eur.b, $$0x -> {
      }
   );
   public gki r = gki.a;
   public boolean s = false;
   public boolean t = false;
   private final evk<Integer> ba = new evk<>("options.biomeBlendRadius", evk.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, vf.c("options.biomeBlendRadius." + $$2x));
   }, new evk.f(0, 7), 2, $$0x -> evh.O().f.f());
   private final evk<Double> bb = new evk<>(
      "options.mouseWheelSensitivity",
      evk.a(),
      ($$0x, $$1x) -> a($$0x, vf.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new evk.f(-200, 100).a(evl::c, evl::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final evk<Boolean> bc = evk.a("options.rawMouseInput", true, $$0x -> {
      epe $$1x = evh.O().aM();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final evk<Boolean> bd = evk.a("options.autoJump", false);
   private final evk<Boolean> be = evk.a("options.operatorItemsTab", false);
   private final evk<Boolean> bf = evk.a("options.autoSuggestCommands", true);
   private final evk<Boolean> bg = evk.a("options.chat.color", true);
   private final evk<Boolean> bh = evk.a("options.chat.links", true);
   private final evk<Boolean> bi = evk.a("options.chat.links.prompt", true);
   private final evk<Boolean> bj = evk.a("options.vsync", true, $$0x -> {
      if (evh.O().aM() != null) {
         evh.O().aM().a($$0x);
      }
   });
   private final evk<Boolean> bk = evk.a("options.entityShadows", true);
   private final evk<Boolean> bl = evk.a("options.forceUnicodeFont", false, $$0x -> {
      evh $$1x = evh.O();
      if ($$1x.aM() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final evk<Boolean> bm = evk.a("options.invertMouse", false);
   private final evk<Boolean> bn = evk.a("options.discrete_mouse_scroll", false);
   private final evk<Boolean> bo = evk.a("options.realmsNotifications", true);
   private static final vf bp = vf.c("options.allowServerListing.tooltip");
   private final evk<Boolean> bq = evk.a("options.allowServerListing", evk.a(bp), true, $$0x -> this.au());
   private final evk<Boolean> br = evk.a("options.reducedDebugInfo", false);
   private final Map<ars, evk<Double>> bs = ac.a(new EnumMap<>(ars.class), $$0x -> {
      for (ars $$1x : ars.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final evk<Boolean> bt = evk.a("options.showSubtitles", false);
   private static final vf bu = vf.c("options.directionalAudio.on.tooltip");
   private static final vf bv = vf.c("options.directionalAudio.off.tooltip");
   private final evk<Boolean> bw = evk.a("options.directionalAudio", $$0x -> $$0x ? eyq.a(bu) : eyq.a(bv), false, $$0x -> {
      gjd $$1x = evh.O().ai();
      $$1x.k();
      $$1x.a(ghu.a(arr.zu, 1.0F));
   });
   private final evk<Boolean> bx = new evk<>(
      "options.accessibility.text_background",
      evk.a(),
      ($$0x, $$1x) -> $$1x ? vf.c("options.accessibility.text_background.chat") : vf.c("options.accessibility.text_background.everywhere"),
      evk.a,
      true,
      $$0x -> {
      }
   );
   private final evk<Boolean> by = evk.a("options.touchscreen", false);
   private final evk<Boolean> bz = evk.a("options.fullscreen", false, $$0x -> {
      evh $$1x = evh.O();
      if ($$1x.aM() != null && $$1x.aM().j() != $$0x) {
         $$1x.aM().h();
         this.X().a($$1x.aM().j());
      }
   });
   private final evk<Boolean> bA = evk.a("options.viewBobbing", true);
   private static final vf bB = vf.c("options.key.toggle");
   private static final vf bC = vf.c("options.key.hold");
   private final evk<Boolean> bD = new evk<>("key.sneak", evk.a(), ($$0x, $$1x) -> $$1x ? bB : bC, evk.a, false, $$0x -> {
   });
   private final evk<Boolean> bE = new evk<>("key.sprint", evk.a(), ($$0x, $$1x) -> $$1x ? bB : bC, evk.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final vf bF = vf.c("options.hideMatchedNames.tooltip");
   private final evk<Boolean> bG = evk.a("options.hideMatchedNames", evk.a(bF), true);
   private final evk<Boolean> bH = evk.a("options.autosaveIndicator", true);
   private static final vf bI = vf.c("options.onlyShowSecureChat.tooltip");
   private final evk<Boolean> bJ = evk.a("options.onlyShowSecureChat", evk.a(bI), false);
   public final evf x = new evf("key.forward", 87, "key.categories.movement");
   public final evf y = new evf("key.left", 65, "key.categories.movement");
   public final evf z = new evf("key.back", 83, "key.categories.movement");
   public final evf A = new evf("key.right", 68, "key.categories.movement");
   public final evf B = new evf("key.jump", 32, "key.categories.movement");
   public final evf C = new evv("key.sneak", 340, "key.categories.movement", this.bD::c);
   public final evf D = new evv("key.sprint", 341, "key.categories.movement", this.bE::c);
   public final evf E = new evf("key.inventory", 69, "key.categories.inventory");
   public final evf F = new evf("key.swapOffhand", 70, "key.categories.inventory");
   public final evf G = new evf("key.drop", 81, "key.categories.inventory");
   public final evf H = new evf("key.use", eov.b.c, 1, "key.categories.gameplay");
   public final evf I = new evf("key.attack", eov.b.c, 0, "key.categories.gameplay");
   public final evf J = new evf("key.pickItem", eov.b.c, 2, "key.categories.gameplay");
   public final evf K = new evf("key.chat", 84, "key.categories.multiplayer");
   public final evf L = new evf("key.playerlist", 258, "key.categories.multiplayer");
   public final evf M = new evf("key.command", 47, "key.categories.multiplayer");
   public final evf N = new evf("key.socialInteractions", 80, "key.categories.multiplayer");
   public final evf O = new evf("key.screenshot", 291, "key.categories.misc");
   public final evf P = new evf("key.togglePerspective", 294, "key.categories.misc");
   public final evf Q = new evf("key.smoothCamera", eov.bv.b(), "key.categories.misc");
   public final evf R = new evf("key.fullscreen", 300, "key.categories.misc");
   public final evf S = new evf("key.spectatorOutlines", eov.bv.b(), "key.categories.misc");
   public final evf T = new evf("key.advancements", 76, "key.categories.misc");
   public final evf[] U = new evf[]{
      new evf("key.hotbar.1", 49, "key.categories.inventory"),
      new evf("key.hotbar.2", 50, "key.categories.inventory"),
      new evf("key.hotbar.3", 51, "key.categories.inventory"),
      new evf("key.hotbar.4", 52, "key.categories.inventory"),
      new evf("key.hotbar.5", 53, "key.categories.inventory"),
      new evf("key.hotbar.6", 54, "key.categories.inventory"),
      new evf("key.hotbar.7", 55, "key.categories.inventory"),
      new evf("key.hotbar.8", 56, "key.categories.inventory"),
      new evf("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final evf V = new evf("key.saveToolbarActivator", 67, "key.categories.creative");
   public final evf W = new evf("key.loadToolbarActivator", 88, "key.categories.creative");
   public final evf[] X = (evf[])ArrayUtils.addAll(
      new evf[]{
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
   protected evh Y;
   private final File bK;
   public boolean Z;
   private eut bL = eut.a;
   public String aa = "";
   public boolean ab;
   private final evk<Integer> bM = new evk<>("options.fov", evk.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, vf.c("options.fov.min"));
         case 110 -> a($$0x, vf.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new evk.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> evh.O().f.r());
   private static final vf bN = vf.a("options.telemetry.button.tooltip", vf.c("options.telemetry.state.minimal"), vf.c("options.telemetry.state.all"));
   private final evk<Boolean> bO = evk.a("options.telemetry.button", evk.a(bN), ($$0x, $$1x) -> {
      evh $$2x = evh.O();
      if (!$$2x.C()) {
         return vf.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.B() ? vf.c("options.telemetry.state.all") : vf.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final vf bP = vf.c("options.screenEffectScale.tooltip");
   private final evk<Double> bQ = new evk<>(
      "options.screenEffectScale", evk.a(bP), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()), evk.m.a, 1.0, $$0x -> {
      }
   );
   private static final vf bR = vf.c("options.fovEffectScale.tooltip");
   private final evk<Double> bS = new evk<>(
      "options.fovEffectScale",
      evk.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()),
      evk.m.a.a(aun::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final vf bT = vf.c("options.darknessEffectScale.tooltip");
   private final evk<Double> bU = new evk<>(
      "options.darknessEffectScale",
      evk.a(bT),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()),
      evk.m.a.a(aun::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final vf bV = vf.c("options.glintSpeed.tooltip");
   private final evk<Double> bW = new evk<>(
      "options.glintSpeed", evk.a(bV), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()), evk.m.a, 0.5, $$0x -> {
      }
   );
   private static final vf bX = vf.c("options.glintStrength.tooltip");
   private final evk<Double> bY = new evk<>(
      "options.glintStrength",
      evk.a(bX),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()),
      evk.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final vf bZ = vf.c("options.damageTiltStrength.tooltip");
   private final evk<Double> ca = new evk<>(
      "options.damageTiltStrength", evk.a(bZ), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()), evk.m.a, 1.0, $$0x -> {
      }
   );
   private final evk<Double> cb = new evk<>("options.gamma", evk.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, vf.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, vf.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, vf.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, evk.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cc = 2147483646;
   private final evk<Integer> cd = new evk<>(
      "options.guiScale", evk.a(), ($$0x, $$1x) -> $$1x == 0 ? vf.c("options.guiScale.auto") : vf.b(Integer.toString($$1x)), new evk.c(0, () -> {
         evh $$0x = evh.O();
         return !$$0x.q() ? 2147483646 : $$0x.aM().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final evk<evm> ce = new evk<>(
      "options.particles", evk.a(), evk.b(), new evk.e<>(Arrays.asList(evm.values()), Codec.INT.xmap(evm::a, evm::a)), evm.a, $$0x -> {
      }
   );
   private final evk<evj> cf = new evk<>(
      "options.narrator",
      evk.a(),
      ($$0x, $$1x) -> (vf)(this.Y.aV().a() ? $$1x.b() : vf.c("options.narrator.notavailable")),
      new evk.e<>(Arrays.asList(evj.values()), Codec.INT.xmap(evj::a, evj::a)),
      evj.a,
      $$0x -> this.Y.aV().a($$0x)
   );
   public String ad = "en_us";
   private final evk<String> cg = new evk<>(
      "options.audioDevice",
      evk.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return vf.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? vf.b($$1x.substring(gja.c)) : vf.b($$1x);
         }
      },
      new evk.h<>(
         () -> Stream.concat(Stream.of(""), evh.O().ai().a().stream()).toList(),
         $$0x -> evh.O().q() && $$0x != "" && !evh.O().ai().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gjd $$1x = evh.O().ai();
         $$1x.k();
         $$1x.a(ghu.a(arr.zu, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public evk<Boolean> a() {
      return this.am;
   }

   public evk<Boolean> b() {
      return this.ao;
   }

   public evk<Boolean> c() {
      return this.aq;
   }

   public evk<Double> d() {
      return this.ar;
   }

   public evk<Integer> e() {
      return this.as;
   }

   public evk<Integer> f() {
      return this.at;
   }

   public evk<Double> g() {
      return this.av;
   }

   public evk<Integer> h() {
      return this.aw;
   }

   public evk<euv> i() {
      return this.ax;
   }

   public evk<eva> j() {
      return this.aB;
   }

   public evk<Boolean> k() {
      return this.aC;
   }

   public evk<evo> l() {
      return this.aG;
   }

   public void a(aps $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (app $$2 : $$0.f()) {
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

   public evk<cff> m() {
      return this.aH;
   }

   public evk<Double> n() {
      return this.aI;
   }

   public evk<Double> o() {
      return this.aJ;
   }

   public evk<Double> p() {
      return this.aK;
   }

   public evk<Double> q() {
      return this.aL;
   }

   public evk<Boolean> r() {
      return this.aN;
   }

   public evk<Boolean> s() {
      return this.aO;
   }

   public evk<bme> t() {
      return this.aQ;
   }

   public evk<Double> u() {
      return this.aR;
   }

   public evk<Double> v() {
      return this.aS;
   }

   public evk<Double> w() {
      return this.aT;
   }

   public evk<Double> x() {
      return this.aU;
   }

   public evk<Double> y() {
      return this.aV;
   }

   public evk<Double> z() {
      return this.aX;
   }

   public evk<Integer> A() {
      return this.aY;
   }

   public evk<eur> B() {
      return this.aZ;
   }

   public evk<Integer> C() {
      return this.ba;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return aun.a(Math.log10($$0) * 100.0);
   }

   public evk<Double> D() {
      return this.bb;
   }

   public evk<Boolean> E() {
      return this.bc;
   }

   public evk<Boolean> F() {
      return this.bd;
   }

   public evk<Boolean> G() {
      return this.be;
   }

   public evk<Boolean> H() {
      return this.bf;
   }

   public evk<Boolean> I() {
      return this.bg;
   }

   public evk<Boolean> J() {
      return this.bh;
   }

   public evk<Boolean> K() {
      return this.bi;
   }

   public evk<Boolean> L() {
      return this.bj;
   }

   public evk<Boolean> M() {
      return this.bk;
   }

   public evk<Boolean> N() {
      return this.bl;
   }

   public evk<Boolean> O() {
      return this.bm;
   }

   public evk<Boolean> P() {
      return this.bn;
   }

   public evk<Boolean> Q() {
      return this.bo;
   }

   public evk<Boolean> R() {
      return this.bq;
   }

   public evk<Boolean> S() {
      return this.br;
   }

   public final float a(ars $$0) {
      return this.b($$0).c().floatValue();
   }

   public final evk<Double> b(ars $$0) {
      return Objects.requireNonNull(this.bs.get($$0));
   }

   private evk<Double> a(String $$0, ars $$1) {
      return new evk<>(
         $$0, evk.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()), evk.m.a, 1.0, $$1x -> evh.O().ai().a($$1, $$1x.floatValue())
      );
   }

   public evk<Boolean> T() {
      return this.bt;
   }

   public evk<Boolean> U() {
      return this.bw;
   }

   public evk<Boolean> V() {
      return this.bx;
   }

   public evk<Boolean> W() {
      return this.by;
   }

   public evk<Boolean> X() {
      return this.bz;
   }

   public evk<Boolean> Y() {
      return this.bA;
   }

   public evk<Boolean> Z() {
      return this.bD;
   }

   public evk<Boolean> aa() {
      return this.bE;
   }

   public evk<Boolean> ab() {
      return this.bG;
   }

   public evk<Boolean> ac() {
      return this.bH;
   }

   public evk<Boolean> ad() {
      return this.bJ;
   }

   public evk<Integer> ae() {
      return this.bM;
   }

   public evk<Boolean> af() {
      return this.bO;
   }

   public evk<Double> ag() {
      return this.bQ;
   }

   public evk<Double> ah() {
      return this.bS;
   }

   public evk<Double> ai() {
      return this.bU;
   }

   public evk<Double> aj() {
      return this.bW;
   }

   public evk<Double> ak() {
      return this.bY;
   }

   public evk<Double> al() {
      return this.ca;
   }

   public evk<Double> am() {
      return this.cb;
   }

   public evk<Integer> an() {
      return this.cd;
   }

   public evk<evm> ao() {
      return this.ce;
   }

   public evk<evj> ap() {
      return this.cf;
   }

   public evk<String> aq() {
      return this.cg;
   }

   public evl(evh $$0, File $$1) {
      this.Y = $$0;
      this.bK = new File($$1, "options.txt");
      boolean $$2 = $$0.af();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.as = new evk<>(
         "options.renderDistance",
         evk.a(),
         ($$0x, $$1x) -> a($$0x, vf.a("options.chunks", $$1x)),
         new evk.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> evh.O().f.r()
      );
      this.at = new evk<>(
         "options.simulationDistance", evk.a(), ($$0x, $$1x) -> a($$0x, vf.a("options.chunks", $$1x)), new evk.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
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

   public void a(evf $$0, eov.a $$1) {
      $$0.b($$1);
      this.as();
   }

   private void a(evl.a $$0) {
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
      this.i = $$0.a("resourcePacks", this.i, evl::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, evl::c, ah::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, gki::a, gki::a);
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

      for (evf $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(eov.a($$3));
         }
      }

      for (ars $$4 : ars.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bs.get($$4));
      }

      for (cfi $$5 : cfi.values()) {
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
               this.aB.a(eva.b);
            } else {
               this.aB.a(eva.a);
            }
         }

         this.a(new evl.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, evk<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> evl.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     evl.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? evl.a($$2) : $$1;
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
               } else if (evl.a($$2)) {
                  return 1.0F;
               } else if (evl.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     evl.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         evf.d();
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

      return avv.e.a(this.Y.ar(), $$0, $$1);
   }

   public void as() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bK), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new evl.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, evk<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> evl.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(evl.ah.toJson($$2x));
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

      for (cfi $$1 : this.aP) {
         $$0 |= $$1.a();
      }

      return new ams(this.ad, this.as.c(), this.aH.c(), this.bg.c(), $$0, this.aQ.c(), this.Y.aQ(), this.bq.c());
   }

   public void au() {
      if (this.Y.s != null) {
         this.Y.s.cn.b(new xr(this.at()));
      }
   }

   private void b(cfi $$0, boolean $$1) {
      if ($$1) {
         this.aP.add($$0);
      } else {
         this.aP.remove($$0);
      }
   }

   public boolean a(cfi $$0) {
      return this.aP.contains($$0);
   }

   public void a(cfi $$0, boolean $$1) {
      this.b($$0, $$1);
      this.au();
   }

   public euv av() {
      return this.aA() >= 4 ? this.ax.c() : euv.a;
   }

   public boolean aw() {
      return this.q;
   }

   public void b(aps $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         app $$4 = $$0.c($$3);
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

   public eut ax() {
      return this.bL;
   }

   public void a(eut $$0) {
      this.bL = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = aud.a(ah, $$0, ai);
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
      <T> void a(String var1, evk<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
