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

public class evv {
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
   private static final vg al = vg.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final evu<Boolean> am = evu.a("options.darkMojangStudiosBackgroundColor", evu.a(al), false);
   private static final vg an = vg.c("options.hideLightningFlashes.tooltip");
   private final evu<Boolean> ao = evu.a("options.hideLightningFlashes", evu.a(an), false);
   private static final vg ap = vg.c("options.hideSplashTexts.tooltip");
   private final evu<Boolean> aq = evu.a("options.hideSplashTexts", evu.a(ap), false);
   private final evu<Double> ar = new evu<>("options.sensitivity", evu.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, vg.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, vg.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, evu.m.a, 0.5, $$0x -> {
   });
   private final evu<Integer> as;
   private final evu<Integer> at;
   private int au = 0;
   private final evu<Double> av = new evu<>(
      "options.entityDistanceScaling",
      evu.a(),
      evv::a,
      new evu.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final evu<Integer> aw = new evu<>(
      "options.framerateLimit",
      evu.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, vg.c("options.framerateLimit.max")) : a($$0x, vg.a("options.framerate", $$1x)),
      new evu.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> evr.O().aM().a($$0x)
   );
   private final evu<evf> ax = new evu<>(
      "options.renderClouds",
      evu.a(),
      evu.b(),
      new evu.e<>(Arrays.asList(evf.values()), atx.a(evf.d, Codec.BOOL, $$0x -> $$0x ? evf.c : evf.a)),
      evf.c,
      $$0x -> {
         if (evr.M()) {
            eow $$1x = evr.O().f.x();
            if ($$1x != null) {
               $$1x.b(evr.a);
            }
         }
      }
   );
   private static final vg ay = vg.c("options.graphics.fast.tooltip");
   private static final vg az = vg.a("options.graphics.fabulous.tooltip", vg.c("options.graphics.fabulous").a(n.u));
   private static final vg aA = vg.c("options.graphics.fancy.tooltip");
   private final evu<evk> aB = new evu<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> ezc.a(aA);
            case a -> ezc.a(ay);
            case c -> ezc.a(az);
         };
      },
      ($$0x, $$1x) -> {
         vu $$2x = vg.c($$1x.b());
         return $$1x == evk.c ? $$2x.a(n.u) : $$2x;
      },
      new evu.a<>(
         Arrays.asList(evk.values()),
         Stream.of(evk.values()).filter($$0x -> $$0x != evk.c).collect(Collectors.toList()),
         () -> evr.O().q() && evr.O().ah().h(),
         ($$0x, $$1x) -> {
            evr $$2x = evr.O();
            ftn $$3x = $$2x.ah();
            if ($$1x == evk.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(evk::a, evk::a)
      ),
      evk.b,
      $$0x -> {
      }
   );
   private final evu<Boolean> aC = evu.a("options.ao", true, $$0x -> evr.O().f.f());
   private static final vg aD = vg.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final vg aE = vg.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final vg aF = vg.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final evu<evy> aG = new evu<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> ezc.a(aD);
         case b -> ezc.a(aE);
         case c -> ezc.a(aF);
      };
   }, evu.b(), new evu.e<>(Arrays.asList(evy.values()), Codec.INT.xmap(evy::a, evy::a)), evy.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final evu<cfo> aH = new evu<>(
      "options.chat.visibility", evu.a(), evu.b(), new evu.e<>(Arrays.asList(cfo.values()), Codec.INT.xmap(cfo::a, cfo::a)), cfo.a, $$0x -> {
      }
   );
   private final evu<Double> aI = new evu<>("options.chat.opacity", evu.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), evu.m.a, 1.0, $$0x -> evr.O().l.d().b());
   private final evu<Double> aJ = new evu<>("options.chat.line_spacing", evu.a(), evv::a, evu.m.a, 0.0, $$0x -> {
   });
   private final evu<Double> aK = new evu<>("options.accessibility.text_background_opacity", evu.a(), evv::a, evu.m.a, 0.5, $$0x -> evr.O().l.d().b());
   private final evu<Double> aL = new evu<>("options.accessibility.panorama_speed", evu.a(), evv::a, evu.m.a, 1.0, $$0x -> {
   });
   private static final vg aM = vg.c("options.accessibility.high_contrast.tooltip");
   private final evu<Boolean> aN = evu.a("options.accessibility.high_contrast", evu.a(aM), false, $$0x -> {
      apu $$1x = evr.O().aa();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final evu<Boolean> aO = evu.a(
      "options.accessibility.narrator_hotkey",
      evu.a(evr.a ? vg.c("options.accessibility.narrator_hotkey.mac.tooltip") : vg.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cfr> aP = EnumSet.allOf(cfr.class);
   private final evu<bmi> aQ = new evu<>("options.mainHand", evu.a(), evu.b(), new evu.e<>(Arrays.asList(bmi.values()), bmi.c), bmi.b, $$0x -> this.au());
   public int o;
   public int p;
   private final evu<Double> aR = new evu<>(
      "options.chat.scale",
      evu.a(),
      ($$0x, $$1x) -> (vg)($$1x == 0.0 ? vf.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      evu.m.a,
      1.0,
      $$0x -> evr.O().l.d().b()
   );
   private final evu<Double> aS = new evu<>("options.chat.width", evu.a(), ($$0x, $$1x) -> b($$0x, exs.a($$1x)), evu.m.a, 1.0, $$0x -> evr.O().l.d().b());
   private final evu<Double> aT = new evu<>(
      "options.chat.height.unfocused", evu.a(), ($$0x, $$1x) -> b($$0x, exs.b($$1x)), evu.m.a, exs.i(), $$0x -> evr.O().l.d().b()
   );
   private final evu<Double> aU = new evu<>(
      "options.chat.height.focused", evu.a(), ($$0x, $$1x) -> b($$0x, exs.b($$1x)), evu.m.a, 1.0, $$0x -> evr.O().l.d().b()
   );
   private final evu<Double> aV = new evu<>(
      "options.chat.delay_instant",
      evu.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? vg.c("options.chat.delay_none") : vg.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new evu.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> evr.O().aX().a($$0x)
   );
   private static final vg aW = vg.c("options.notifications.display_time.tooltip");
   private final evu<Double> aX = new evu<>(
      "options.notifications.display_time",
      evu.a(aW),
      ($$0x, $$1x) -> a($$0x, vg.a("options.multiplier", $$1x)),
      new evu.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final evu<Integer> aY = new evu<>(
      "options.mipmapLevels", evu.a(), ($$0x, $$1x) -> (vg)($$1x == 0 ? vf.a($$0x, false) : a($$0x, $$1x.intValue())), new evu.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final evu<evb> aZ = new evu<>(
      "options.attackIndicator", evu.a(), evu.b(), new evu.e<>(Arrays.asList(evb.values()), Codec.INT.xmap(evb::a, evb::a)), evb.b, $$0x -> {
      }
   );
   public gkx r = gkx.a;
   public boolean s = false;
   public boolean t = false;
   private final evu<Integer> ba = new evu<>("options.biomeBlendRadius", evu.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, vg.c("options.biomeBlendRadius." + $$2x));
   }, new evu.f(0, 7), 2, $$0x -> evr.O().f.f());
   private final evu<Double> bb = new evu<>(
      "options.mouseWheelSensitivity",
      evu.a(),
      ($$0x, $$1x) -> a($$0x, vg.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new evu.f(-200, 100).a(evv::c, evv::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final evu<Boolean> bc = evu.a("options.rawMouseInput", true, $$0x -> {
      epo $$1x = evr.O().aM();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final evu<Boolean> bd = evu.a("options.autoJump", false);
   private final evu<Boolean> be = evu.a("options.operatorItemsTab", false);
   private final evu<Boolean> bf = evu.a("options.autoSuggestCommands", true);
   private final evu<Boolean> bg = evu.a("options.chat.color", true);
   private final evu<Boolean> bh = evu.a("options.chat.links", true);
   private final evu<Boolean> bi = evu.a("options.chat.links.prompt", true);
   private final evu<Boolean> bj = evu.a("options.vsync", true, $$0x -> {
      if (evr.O().aM() != null) {
         evr.O().aM().a($$0x);
      }
   });
   private final evu<Boolean> bk = evu.a("options.entityShadows", true);
   private final evu<Boolean> bl = evu.a("options.forceUnicodeFont", false, $$0x -> {
      evr $$1x = evr.O();
      if ($$1x.aM() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final evu<Boolean> bm = evu.a("options.invertMouse", false);
   private final evu<Boolean> bn = evu.a("options.discrete_mouse_scroll", false);
   private final evu<Boolean> bo = evu.a("options.realmsNotifications", true);
   private static final vg bp = vg.c("options.allowServerListing.tooltip");
   private final evu<Boolean> bq = evu.a("options.allowServerListing", evu.a(bp), true, $$0x -> this.au());
   private final evu<Boolean> br = evu.a("options.reducedDebugInfo", false);
   private final Map<aru, evu<Double>> bs = ac.a(new EnumMap<>(aru.class), $$0x -> {
      for (aru $$1x : aru.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final evu<Boolean> bt = evu.a("options.showSubtitles", false);
   private static final vg bu = vg.c("options.directionalAudio.on.tooltip");
   private static final vg bv = vg.c("options.directionalAudio.off.tooltip");
   private final evu<Boolean> bw = evu.a("options.directionalAudio", $$0x -> $$0x ? ezc.a(bu) : ezc.a(bv), false, $$0x -> {
      gjs $$1x = evr.O().ai();
      $$1x.k();
      $$1x.a(gij.a(art.zJ, 1.0F));
   });
   private final evu<Boolean> bx = new evu<>(
      "options.accessibility.text_background",
      evu.a(),
      ($$0x, $$1x) -> $$1x ? vg.c("options.accessibility.text_background.chat") : vg.c("options.accessibility.text_background.everywhere"),
      evu.a,
      true,
      $$0x -> {
      }
   );
   private final evu<Boolean> by = evu.a("options.touchscreen", false);
   private final evu<Boolean> bz = evu.a("options.fullscreen", false, $$0x -> {
      evr $$1x = evr.O();
      if ($$1x.aM() != null && $$1x.aM().j() != $$0x) {
         $$1x.aM().h();
         this.X().a($$1x.aM().j());
      }
   });
   private final evu<Boolean> bA = evu.a("options.viewBobbing", true);
   private static final vg bB = vg.c("options.key.toggle");
   private static final vg bC = vg.c("options.key.hold");
   private final evu<Boolean> bD = new evu<>("key.sneak", evu.a(), ($$0x, $$1x) -> $$1x ? bB : bC, evu.a, false, $$0x -> {
   });
   private final evu<Boolean> bE = new evu<>("key.sprint", evu.a(), ($$0x, $$1x) -> $$1x ? bB : bC, evu.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final vg bF = vg.c("options.hideMatchedNames.tooltip");
   private final evu<Boolean> bG = evu.a("options.hideMatchedNames", evu.a(bF), true);
   private final evu<Boolean> bH = evu.a("options.autosaveIndicator", true);
   private static final vg bI = vg.c("options.onlyShowSecureChat.tooltip");
   private final evu<Boolean> bJ = evu.a("options.onlyShowSecureChat", evu.a(bI), false);
   public final evp x = new evp("key.forward", 87, "key.categories.movement");
   public final evp y = new evp("key.left", 65, "key.categories.movement");
   public final evp z = new evp("key.back", 83, "key.categories.movement");
   public final evp A = new evp("key.right", 68, "key.categories.movement");
   public final evp B = new evp("key.jump", 32, "key.categories.movement");
   public final evp C = new ewf("key.sneak", 340, "key.categories.movement", this.bD::c);
   public final evp D = new ewf("key.sprint", 341, "key.categories.movement", this.bE::c);
   public final evp E = new evp("key.inventory", 69, "key.categories.inventory");
   public final evp F = new evp("key.swapOffhand", 70, "key.categories.inventory");
   public final evp G = new evp("key.drop", 81, "key.categories.inventory");
   public final evp H = new evp("key.use", epf.b.c, 1, "key.categories.gameplay");
   public final evp I = new evp("key.attack", epf.b.c, 0, "key.categories.gameplay");
   public final evp J = new evp("key.pickItem", epf.b.c, 2, "key.categories.gameplay");
   public final evp K = new evp("key.chat", 84, "key.categories.multiplayer");
   public final evp L = new evp("key.playerlist", 258, "key.categories.multiplayer");
   public final evp M = new evp("key.command", 47, "key.categories.multiplayer");
   public final evp N = new evp("key.socialInteractions", 80, "key.categories.multiplayer");
   public final evp O = new evp("key.screenshot", 291, "key.categories.misc");
   public final evp P = new evp("key.togglePerspective", 294, "key.categories.misc");
   public final evp Q = new evp("key.smoothCamera", epf.bv.b(), "key.categories.misc");
   public final evp R = new evp("key.fullscreen", 300, "key.categories.misc");
   public final evp S = new evp("key.spectatorOutlines", epf.bv.b(), "key.categories.misc");
   public final evp T = new evp("key.advancements", 76, "key.categories.misc");
   public final evp[] U = new evp[]{
      new evp("key.hotbar.1", 49, "key.categories.inventory"),
      new evp("key.hotbar.2", 50, "key.categories.inventory"),
      new evp("key.hotbar.3", 51, "key.categories.inventory"),
      new evp("key.hotbar.4", 52, "key.categories.inventory"),
      new evp("key.hotbar.5", 53, "key.categories.inventory"),
      new evp("key.hotbar.6", 54, "key.categories.inventory"),
      new evp("key.hotbar.7", 55, "key.categories.inventory"),
      new evp("key.hotbar.8", 56, "key.categories.inventory"),
      new evp("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final evp V = new evp("key.saveToolbarActivator", 67, "key.categories.creative");
   public final evp W = new evp("key.loadToolbarActivator", 88, "key.categories.creative");
   public final evp[] X = (evp[])ArrayUtils.addAll(
      new evp[]{
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
   protected evr Y;
   private final File bK;
   public boolean Z;
   private evd bL = evd.a;
   public String aa = "";
   public boolean ab;
   private final evu<Integer> bM = new evu<>("options.fov", evu.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, vg.c("options.fov.min"));
         case 110 -> a($$0x, vg.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new evu.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> evr.O().f.r());
   private static final vg bN = vg.a("options.telemetry.button.tooltip", vg.c("options.telemetry.state.minimal"), vg.c("options.telemetry.state.all"));
   private final evu<Boolean> bO = evu.a("options.telemetry.button", evu.a(bN), ($$0x, $$1x) -> {
      evr $$2x = evr.O();
      if (!$$2x.C()) {
         return vg.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.B() ? vg.c("options.telemetry.state.all") : vg.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final vg bP = vg.c("options.screenEffectScale.tooltip");
   private final evu<Double> bQ = new evu<>(
      "options.screenEffectScale", evu.a(bP), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vf.c) : a($$0x, $$1x.doubleValue()), evu.m.a, 1.0, $$0x -> {
      }
   );
   private static final vg bR = vg.c("options.fovEffectScale.tooltip");
   private final evu<Double> bS = new evu<>(
      "options.fovEffectScale",
      evu.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vf.c) : a($$0x, $$1x.doubleValue()),
      evu.m.a.a(aup::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final vg bT = vg.c("options.darknessEffectScale.tooltip");
   private final evu<Double> bU = new evu<>(
      "options.darknessEffectScale",
      evu.a(bT),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vf.c) : a($$0x, $$1x.doubleValue()),
      evu.m.a.a(aup::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final vg bV = vg.c("options.glintSpeed.tooltip");
   private final evu<Double> bW = new evu<>(
      "options.glintSpeed", evu.a(bV), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vf.c) : a($$0x, $$1x.doubleValue()), evu.m.a, 0.5, $$0x -> {
      }
   );
   private static final vg bX = vg.c("options.glintStrength.tooltip");
   private final evu<Double> bY = new evu<>(
      "options.glintStrength",
      evu.a(bX),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vf.c) : a($$0x, $$1x.doubleValue()),
      evu.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final vg bZ = vg.c("options.damageTiltStrength.tooltip");
   private final evu<Double> ca = new evu<>(
      "options.damageTiltStrength", evu.a(bZ), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vf.c) : a($$0x, $$1x.doubleValue()), evu.m.a, 1.0, $$0x -> {
      }
   );
   private final evu<Double> cb = new evu<>("options.gamma", evu.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, vg.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, vg.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, vg.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, evu.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cc = 2147483646;
   private final evu<Integer> cd = new evu<>(
      "options.guiScale", evu.a(), ($$0x, $$1x) -> $$1x == 0 ? vg.c("options.guiScale.auto") : vg.b(Integer.toString($$1x)), new evu.c(0, () -> {
         evr $$0x = evr.O();
         return !$$0x.q() ? 2147483646 : $$0x.aM().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final evu<evw> ce = new evu<>(
      "options.particles", evu.a(), evu.b(), new evu.e<>(Arrays.asList(evw.values()), Codec.INT.xmap(evw::a, evw::a)), evw.a, $$0x -> {
      }
   );
   private final evu<evt> cf = new evu<>(
      "options.narrator",
      evu.a(),
      ($$0x, $$1x) -> (vg)(this.Y.aW().a() ? $$1x.b() : vg.c("options.narrator.notavailable")),
      new evu.e<>(Arrays.asList(evt.values()), Codec.INT.xmap(evt::a, evt::a)),
      evt.a,
      $$0x -> this.Y.aW().a($$0x)
   );
   public String ad = "en_us";
   private final evu<String> cg = new evu<>(
      "options.audioDevice",
      evu.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return vg.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? vg.b($$1x.substring(gjp.c)) : vg.b($$1x);
         }
      },
      new evu.h<>(
         () -> Stream.concat(Stream.of(""), evr.O().ai().a().stream()).toList(),
         $$0x -> evr.O().q() && $$0x != "" && !evr.O().ai().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gjs $$1x = evr.O().ai();
         $$1x.k();
         $$1x.a(gij.a(art.zJ, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public evu<Boolean> a() {
      return this.am;
   }

   public evu<Boolean> b() {
      return this.ao;
   }

   public evu<Boolean> c() {
      return this.aq;
   }

   public evu<Double> d() {
      return this.ar;
   }

   public evu<Integer> e() {
      return this.as;
   }

   public evu<Integer> f() {
      return this.at;
   }

   public evu<Double> g() {
      return this.av;
   }

   public evu<Integer> h() {
      return this.aw;
   }

   public evu<evf> i() {
      return this.ax;
   }

   public evu<evk> j() {
      return this.aB;
   }

   public evu<Boolean> k() {
      return this.aC;
   }

   public evu<evy> l() {
      return this.aG;
   }

   public void a(apu $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (apr $$2 : $$0.f()) {
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

   public evu<cfo> m() {
      return this.aH;
   }

   public evu<Double> n() {
      return this.aI;
   }

   public evu<Double> o() {
      return this.aJ;
   }

   public evu<Double> p() {
      return this.aK;
   }

   public evu<Double> q() {
      return this.aL;
   }

   public evu<Boolean> r() {
      return this.aN;
   }

   public evu<Boolean> s() {
      return this.aO;
   }

   public evu<bmi> t() {
      return this.aQ;
   }

   public evu<Double> u() {
      return this.aR;
   }

   public evu<Double> v() {
      return this.aS;
   }

   public evu<Double> w() {
      return this.aT;
   }

   public evu<Double> x() {
      return this.aU;
   }

   public evu<Double> y() {
      return this.aV;
   }

   public evu<Double> z() {
      return this.aX;
   }

   public evu<Integer> A() {
      return this.aY;
   }

   public evu<evb> B() {
      return this.aZ;
   }

   public evu<Integer> C() {
      return this.ba;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return aup.a(Math.log10($$0) * 100.0);
   }

   public evu<Double> D() {
      return this.bb;
   }

   public evu<Boolean> E() {
      return this.bc;
   }

   public evu<Boolean> F() {
      return this.bd;
   }

   public evu<Boolean> G() {
      return this.be;
   }

   public evu<Boolean> H() {
      return this.bf;
   }

   public evu<Boolean> I() {
      return this.bg;
   }

   public evu<Boolean> J() {
      return this.bh;
   }

   public evu<Boolean> K() {
      return this.bi;
   }

   public evu<Boolean> L() {
      return this.bj;
   }

   public evu<Boolean> M() {
      return this.bk;
   }

   public evu<Boolean> N() {
      return this.bl;
   }

   public evu<Boolean> O() {
      return this.bm;
   }

   public evu<Boolean> P() {
      return this.bn;
   }

   public evu<Boolean> Q() {
      return this.bo;
   }

   public evu<Boolean> R() {
      return this.bq;
   }

   public evu<Boolean> S() {
      return this.br;
   }

   public final float a(aru $$0) {
      return this.b($$0).c().floatValue();
   }

   public final evu<Double> b(aru $$0) {
      return Objects.requireNonNull(this.bs.get($$0));
   }

   private evu<Double> a(String $$0, aru $$1) {
      return new evu<>(
         $$0, evu.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vf.c) : a($$0x, $$1x.doubleValue()), evu.m.a, 1.0, $$1x -> evr.O().ai().a($$1, $$1x.floatValue())
      );
   }

   public evu<Boolean> T() {
      return this.bt;
   }

   public evu<Boolean> U() {
      return this.bw;
   }

   public evu<Boolean> V() {
      return this.bx;
   }

   public evu<Boolean> W() {
      return this.by;
   }

   public evu<Boolean> X() {
      return this.bz;
   }

   public evu<Boolean> Y() {
      return this.bA;
   }

   public evu<Boolean> Z() {
      return this.bD;
   }

   public evu<Boolean> aa() {
      return this.bE;
   }

   public evu<Boolean> ab() {
      return this.bG;
   }

   public evu<Boolean> ac() {
      return this.bH;
   }

   public evu<Boolean> ad() {
      return this.bJ;
   }

   public evu<Integer> ae() {
      return this.bM;
   }

   public evu<Boolean> af() {
      return this.bO;
   }

   public evu<Double> ag() {
      return this.bQ;
   }

   public evu<Double> ah() {
      return this.bS;
   }

   public evu<Double> ai() {
      return this.bU;
   }

   public evu<Double> aj() {
      return this.bW;
   }

   public evu<Double> ak() {
      return this.bY;
   }

   public evu<Double> al() {
      return this.ca;
   }

   public evu<Double> am() {
      return this.cb;
   }

   public evu<Integer> an() {
      return this.cd;
   }

   public evu<evw> ao() {
      return this.ce;
   }

   public evu<evt> ap() {
      return this.cf;
   }

   public evu<String> aq() {
      return this.cg;
   }

   public evv(evr $$0, File $$1) {
      this.Y = $$0;
      this.bK = new File($$1, "options.txt");
      boolean $$2 = $$0.af();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.as = new evu<>(
         "options.renderDistance",
         evu.a(),
         ($$0x, $$1x) -> a($$0x, vg.a("options.chunks", $$1x)),
         new evu.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> evr.O().f.r()
      );
      this.at = new evu<>(
         "options.simulationDistance", evu.a(), ($$0x, $$1x) -> a($$0x, vg.a("options.chunks", $$1x)), new evu.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
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

   public void a(evp $$0, epf.a $$1) {
      $$0.b($$1);
      this.as();
   }

   private void a(evv.a $$0) {
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
      this.i = $$0.a("resourcePacks", this.i, evv::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, evv::c, ah::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, gkx::a, gkx::a);
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

      for (evp $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(epf.a($$3));
         }
      }

      for (aru $$4 : aru.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bs.get($$4));
      }

      for (cfr $$5 : cfr.values()) {
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

         so $$0 = new so();

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

         final so $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(evk.b);
            } else {
               this.aB.a(evk.a);
            }
         }

         this.a(new evv.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, evu<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> evv.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     evv.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? evv.a($$2) : $$1;
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
               } else if (evv.a($$2)) {
                  return 1.0F;
               } else if (evv.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     evv.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         evp.d();
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

   private so a(so $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return avx.e.a(this.Y.ar(), $$0, $$1);
   }

   public void as() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bK), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new evv.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, evu<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> evv.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(evv.ah.toJson($$2x));
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

   public amt at() {
      int $$0 = 0;

      for (cfr $$1 : this.aP) {
         $$0 |= $$1.a();
      }

      return new amt(this.ad, this.as.c(), this.aH.c(), this.bg.c(), $$0, this.aQ.c(), this.Y.aQ(), this.bq.c());
   }

   public void au() {
      if (this.Y.s != null) {
         this.Y.s.cr.b(new xs(this.at()));
      }
   }

   private void b(cfr $$0, boolean $$1) {
      if ($$1) {
         this.aP.add($$0);
      } else {
         this.aP.remove($$0);
      }
   }

   public boolean a(cfr $$0) {
      return this.aP.contains($$0);
   }

   public void a(cfr $$0, boolean $$1) {
      this.b($$0, $$1);
      this.au();
   }

   public evf av() {
      return this.aA() >= 4 ? this.ax.c() : evf.a;
   }

   public boolean aw() {
      return this.q;
   }

   public void b(apu $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         apr $$4 = $$0.c($$3);
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

   public evd ax() {
      return this.bL;
   }

   public void a(evd $$0) {
      this.bL = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = auf.a(ah, $$0, ai);
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

   private static vg b(vg $$0, int $$1) {
      return vg.a("options.pixel_value", $$0, $$1);
   }

   private static vg a(vg $$0, double $$1) {
      return vg.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static vg a(vg $$0, vg $$1) {
      return vg.a("options.generic_value", $$0, $$1);
   }

   public static vg a(vg $$0, int $$1) {
      return a($$0, vg.b(Integer.toString($$1)));
   }

   interface a {
      <T> void a(String var1, evu<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
