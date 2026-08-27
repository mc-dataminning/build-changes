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

public class evk {
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
   private final evj<Boolean> am = evj.a("options.darkMojangStudiosBackgroundColor", evj.a(al), false);
   private static final vf an = vf.c("options.hideLightningFlashes.tooltip");
   private final evj<Boolean> ao = evj.a("options.hideLightningFlashes", evj.a(an), false);
   private static final vf ap = vf.c("options.hideSplashTexts.tooltip");
   private final evj<Boolean> aq = evj.a("options.hideSplashTexts", evj.a(ap), false);
   private final evj<Double> ar = new evj<>("options.sensitivity", evj.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, vf.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, vf.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, evj.m.a, 0.5, $$0x -> {
   });
   private final evj<Integer> as;
   private final evj<Integer> at;
   private int au = 0;
   private final evj<Double> av = new evj<>(
      "options.entityDistanceScaling",
      evj.a(),
      evk::a,
      new evj.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final evj<Integer> aw = new evj<>(
      "options.framerateLimit",
      evj.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, vf.c("options.framerateLimit.max")) : a($$0x, vf.a("options.framerate", $$1x)),
      new evj.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> evg.O().aM().a($$0x)
   );
   private final evj<euu> ax = new evj<>(
      "options.renderClouds",
      evj.a(),
      evj.b(),
      new evj.e<>(Arrays.asList(euu.values()), atv.a(euu.d, Codec.BOOL, $$0x -> $$0x ? euu.c : euu.a)),
      euu.c,
      $$0x -> {
         if (evg.M()) {
            eol $$1x = evg.O().f.x();
            if ($$1x != null) {
               $$1x.b(evg.a);
            }
         }
      }
   );
   private static final vf ay = vf.c("options.graphics.fast.tooltip");
   private static final vf az = vf.a("options.graphics.fabulous.tooltip", vf.c("options.graphics.fabulous").a(n.u));
   private static final vf aA = vf.c("options.graphics.fancy.tooltip");
   private final evj<euz> aB = new evj<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> eyp.a(aA);
            case a -> eyp.a(ay);
            case c -> eyp.a(az);
         };
      },
      ($$0x, $$1x) -> {
         vt $$2x = vf.c($$1x.b());
         return $$1x == euz.c ? $$2x.a(n.u) : $$2x;
      },
      new evj.a<>(
         Arrays.asList(euz.values()),
         Stream.of(euz.values()).filter($$0x -> $$0x != euz.c).collect(Collectors.toList()),
         () -> evg.O().q() && evg.O().ah().h(),
         ($$0x, $$1x) -> {
            evg $$2x = evg.O();
            fsz $$3x = $$2x.ah();
            if ($$1x == euz.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(euz::a, euz::a)
      ),
      euz.b,
      $$0x -> {
      }
   );
   private final evj<Boolean> aC = evj.a("options.ao", true, $$0x -> evg.O().f.f());
   private static final vf aD = vf.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final vf aE = vf.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final vf aF = vf.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final evj<evn> aG = new evj<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> eyp.a(aD);
         case b -> eyp.a(aE);
         case c -> eyp.a(aF);
      };
   }, evj.b(), new evj.e<>(Arrays.asList(evn.values()), Codec.INT.xmap(evn::a, evn::a)), evn.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final evj<cff> aH = new evj<>(
      "options.chat.visibility", evj.a(), evj.b(), new evj.e<>(Arrays.asList(cff.values()), Codec.INT.xmap(cff::a, cff::a)), cff.a, $$0x -> {
      }
   );
   private final evj<Double> aI = new evj<>("options.chat.opacity", evj.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), evj.m.a, 1.0, $$0x -> evg.O().l.d().b());
   private final evj<Double> aJ = new evj<>("options.chat.line_spacing", evj.a(), evk::a, evj.m.a, 0.0, $$0x -> {
   });
   private final evj<Double> aK = new evj<>("options.accessibility.text_background_opacity", evj.a(), evk::a, evj.m.a, 0.5, $$0x -> evg.O().l.d().b());
   private final evj<Double> aL = new evj<>("options.accessibility.panorama_speed", evj.a(), evk::a, evj.m.a, 1.0, $$0x -> {
   });
   private static final vf aM = vf.c("options.accessibility.high_contrast.tooltip");
   private final evj<Boolean> aN = evj.a("options.accessibility.high_contrast", evj.a(aM), false, $$0x -> {
      aps $$1x = evg.O().aa();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final evj<Boolean> aO = evj.a(
      "options.accessibility.narrator_hotkey",
      evj.a(evg.a ? vf.c("options.accessibility.narrator_hotkey.mac.tooltip") : vf.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cfi> aP = EnumSet.allOf(cfi.class);
   private final evj<bme> aQ = new evj<>("options.mainHand", evj.a(), evj.b(), new evj.e<>(Arrays.asList(bme.values()), bme.c), bme.b, $$0x -> this.au());
   public int o;
   public int p;
   private final evj<Double> aR = new evj<>(
      "options.chat.scale",
      evj.a(),
      ($$0x, $$1x) -> (vf)($$1x == 0.0 ? ve.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      evj.m.a,
      1.0,
      $$0x -> evg.O().l.d().b()
   );
   private final evj<Double> aS = new evj<>("options.chat.width", evj.a(), ($$0x, $$1x) -> b($$0x, exf.a($$1x)), evj.m.a, 1.0, $$0x -> evg.O().l.d().b());
   private final evj<Double> aT = new evj<>(
      "options.chat.height.unfocused", evj.a(), ($$0x, $$1x) -> b($$0x, exf.b($$1x)), evj.m.a, exf.h(), $$0x -> evg.O().l.d().b()
   );
   private final evj<Double> aU = new evj<>(
      "options.chat.height.focused", evj.a(), ($$0x, $$1x) -> b($$0x, exf.b($$1x)), evj.m.a, 1.0, $$0x -> evg.O().l.d().b()
   );
   private final evj<Double> aV = new evj<>(
      "options.chat.delay_instant",
      evj.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? vf.c("options.chat.delay_none") : vf.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new evj.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> evg.O().aW().a($$0x)
   );
   private static final vf aW = vf.c("options.notifications.display_time.tooltip");
   private final evj<Double> aX = new evj<>(
      "options.notifications.display_time",
      evj.a(aW),
      ($$0x, $$1x) -> a($$0x, vf.a("options.multiplier", $$1x)),
      new evj.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final evj<Integer> aY = new evj<>(
      "options.mipmapLevels", evj.a(), ($$0x, $$1x) -> (vf)($$1x == 0 ? ve.a($$0x, false) : a($$0x, $$1x.intValue())), new evj.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final evj<euq> aZ = new evj<>(
      "options.attackIndicator", evj.a(), evj.b(), new evj.e<>(Arrays.asList(euq.values()), Codec.INT.xmap(euq::a, euq::a)), euq.b, $$0x -> {
      }
   );
   public gkh r = gkh.a;
   public boolean s = false;
   public boolean t = false;
   private final evj<Integer> ba = new evj<>("options.biomeBlendRadius", evj.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, vf.c("options.biomeBlendRadius." + $$2x));
   }, new evj.f(0, 7), 2, $$0x -> evg.O().f.f());
   private final evj<Double> bb = new evj<>(
      "options.mouseWheelSensitivity",
      evj.a(),
      ($$0x, $$1x) -> a($$0x, vf.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new evj.f(-200, 100).a(evk::c, evk::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final evj<Boolean> bc = evj.a("options.rawMouseInput", true, $$0x -> {
      epd $$1x = evg.O().aM();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final evj<Boolean> bd = evj.a("options.autoJump", false);
   private final evj<Boolean> be = evj.a("options.operatorItemsTab", false);
   private final evj<Boolean> bf = evj.a("options.autoSuggestCommands", true);
   private final evj<Boolean> bg = evj.a("options.chat.color", true);
   private final evj<Boolean> bh = evj.a("options.chat.links", true);
   private final evj<Boolean> bi = evj.a("options.chat.links.prompt", true);
   private final evj<Boolean> bj = evj.a("options.vsync", true, $$0x -> {
      if (evg.O().aM() != null) {
         evg.O().aM().a($$0x);
      }
   });
   private final evj<Boolean> bk = evj.a("options.entityShadows", true);
   private final evj<Boolean> bl = evj.a("options.forceUnicodeFont", false, $$0x -> {
      evg $$1x = evg.O();
      if ($$1x.aM() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final evj<Boolean> bm = evj.a("options.invertMouse", false);
   private final evj<Boolean> bn = evj.a("options.discrete_mouse_scroll", false);
   private final evj<Boolean> bo = evj.a("options.realmsNotifications", true);
   private static final vf bp = vf.c("options.allowServerListing.tooltip");
   private final evj<Boolean> bq = evj.a("options.allowServerListing", evj.a(bp), true, $$0x -> this.au());
   private final evj<Boolean> br = evj.a("options.reducedDebugInfo", false);
   private final Map<ars, evj<Double>> bs = ac.a(new EnumMap<>(ars.class), $$0x -> {
      for (ars $$1x : ars.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final evj<Boolean> bt = evj.a("options.showSubtitles", false);
   private static final vf bu = vf.c("options.directionalAudio.on.tooltip");
   private static final vf bv = vf.c("options.directionalAudio.off.tooltip");
   private final evj<Boolean> bw = evj.a("options.directionalAudio", $$0x -> $$0x ? eyp.a(bu) : eyp.a(bv), false, $$0x -> {
      gjc $$1x = evg.O().ai();
      $$1x.j();
      $$1x.a(ght.a(arr.zu, 1.0F));
   });
   private final evj<Boolean> bx = new evj<>(
      "options.accessibility.text_background",
      evj.a(),
      ($$0x, $$1x) -> $$1x ? vf.c("options.accessibility.text_background.chat") : vf.c("options.accessibility.text_background.everywhere"),
      evj.a,
      true,
      $$0x -> {
      }
   );
   private final evj<Boolean> by = evj.a("options.touchscreen", false);
   private final evj<Boolean> bz = evj.a("options.fullscreen", false, $$0x -> {
      evg $$1x = evg.O();
      if ($$1x.aM() != null && $$1x.aM().j() != $$0x) {
         $$1x.aM().h();
         this.X().a($$1x.aM().j());
      }
   });
   private final evj<Boolean> bA = evj.a("options.viewBobbing", true);
   private static final vf bB = vf.c("options.key.toggle");
   private static final vf bC = vf.c("options.key.hold");
   private final evj<Boolean> bD = new evj<>("key.sneak", evj.a(), ($$0x, $$1x) -> $$1x ? bB : bC, evj.a, false, $$0x -> {
   });
   private final evj<Boolean> bE = new evj<>("key.sprint", evj.a(), ($$0x, $$1x) -> $$1x ? bB : bC, evj.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final vf bF = vf.c("options.hideMatchedNames.tooltip");
   private final evj<Boolean> bG = evj.a("options.hideMatchedNames", evj.a(bF), true);
   private final evj<Boolean> bH = evj.a("options.autosaveIndicator", true);
   private static final vf bI = vf.c("options.onlyShowSecureChat.tooltip");
   private final evj<Boolean> bJ = evj.a("options.onlyShowSecureChat", evj.a(bI), false);
   public final eve x = new eve("key.forward", 87, "key.categories.movement");
   public final eve y = new eve("key.left", 65, "key.categories.movement");
   public final eve z = new eve("key.back", 83, "key.categories.movement");
   public final eve A = new eve("key.right", 68, "key.categories.movement");
   public final eve B = new eve("key.jump", 32, "key.categories.movement");
   public final eve C = new evu("key.sneak", 340, "key.categories.movement", this.bD::c);
   public final eve D = new evu("key.sprint", 341, "key.categories.movement", this.bE::c);
   public final eve E = new eve("key.inventory", 69, "key.categories.inventory");
   public final eve F = new eve("key.swapOffhand", 70, "key.categories.inventory");
   public final eve G = new eve("key.drop", 81, "key.categories.inventory");
   public final eve H = new eve("key.use", eou.b.c, 1, "key.categories.gameplay");
   public final eve I = new eve("key.attack", eou.b.c, 0, "key.categories.gameplay");
   public final eve J = new eve("key.pickItem", eou.b.c, 2, "key.categories.gameplay");
   public final eve K = new eve("key.chat", 84, "key.categories.multiplayer");
   public final eve L = new eve("key.playerlist", 258, "key.categories.multiplayer");
   public final eve M = new eve("key.command", 47, "key.categories.multiplayer");
   public final eve N = new eve("key.socialInteractions", 80, "key.categories.multiplayer");
   public final eve O = new eve("key.screenshot", 291, "key.categories.misc");
   public final eve P = new eve("key.togglePerspective", 294, "key.categories.misc");
   public final eve Q = new eve("key.smoothCamera", eou.bv.b(), "key.categories.misc");
   public final eve R = new eve("key.fullscreen", 300, "key.categories.misc");
   public final eve S = new eve("key.spectatorOutlines", eou.bv.b(), "key.categories.misc");
   public final eve T = new eve("key.advancements", 76, "key.categories.misc");
   public final eve[] U = new eve[]{
      new eve("key.hotbar.1", 49, "key.categories.inventory"),
      new eve("key.hotbar.2", 50, "key.categories.inventory"),
      new eve("key.hotbar.3", 51, "key.categories.inventory"),
      new eve("key.hotbar.4", 52, "key.categories.inventory"),
      new eve("key.hotbar.5", 53, "key.categories.inventory"),
      new eve("key.hotbar.6", 54, "key.categories.inventory"),
      new eve("key.hotbar.7", 55, "key.categories.inventory"),
      new eve("key.hotbar.8", 56, "key.categories.inventory"),
      new eve("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final eve V = new eve("key.saveToolbarActivator", 67, "key.categories.creative");
   public final eve W = new eve("key.loadToolbarActivator", 88, "key.categories.creative");
   public final eve[] X = (eve[])ArrayUtils.addAll(
      new eve[]{
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
   protected evg Y;
   private final File bK;
   public boolean Z;
   private eus bL = eus.a;
   public String aa = "";
   public boolean ab;
   private final evj<Integer> bM = new evj<>("options.fov", evj.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, vf.c("options.fov.min"));
         case 110 -> a($$0x, vf.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new evj.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> evg.O().f.r());
   private static final vf bN = vf.a("options.telemetry.button.tooltip", vf.c("options.telemetry.state.minimal"), vf.c("options.telemetry.state.all"));
   private final evj<Boolean> bO = evj.a("options.telemetry.button", evj.a(bN), ($$0x, $$1x) -> {
      evg $$2x = evg.O();
      if (!$$2x.C()) {
         return vf.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.B() ? vf.c("options.telemetry.state.all") : vf.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final vf bP = vf.c("options.screenEffectScale.tooltip");
   private final evj<Double> bQ = new evj<>(
      "options.screenEffectScale", evj.a(bP), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()), evj.m.a, 1.0, $$0x -> {
      }
   );
   private static final vf bR = vf.c("options.fovEffectScale.tooltip");
   private final evj<Double> bS = new evj<>(
      "options.fovEffectScale",
      evj.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()),
      evj.m.a.a(aun::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final vf bT = vf.c("options.darknessEffectScale.tooltip");
   private final evj<Double> bU = new evj<>(
      "options.darknessEffectScale",
      evj.a(bT),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()),
      evj.m.a.a(aun::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final vf bV = vf.c("options.glintSpeed.tooltip");
   private final evj<Double> bW = new evj<>(
      "options.glintSpeed", evj.a(bV), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()), evj.m.a, 0.5, $$0x -> {
      }
   );
   private static final vf bX = vf.c("options.glintStrength.tooltip");
   private final evj<Double> bY = new evj<>(
      "options.glintStrength",
      evj.a(bX),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()),
      evj.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final vf bZ = vf.c("options.damageTiltStrength.tooltip");
   private final evj<Double> ca = new evj<>(
      "options.damageTiltStrength", evj.a(bZ), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()), evj.m.a, 1.0, $$0x -> {
      }
   );
   private final evj<Double> cb = new evj<>("options.gamma", evj.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, vf.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, vf.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, vf.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, evj.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cc = 2147483646;
   private final evj<Integer> cd = new evj<>(
      "options.guiScale", evj.a(), ($$0x, $$1x) -> $$1x == 0 ? vf.c("options.guiScale.auto") : vf.b(Integer.toString($$1x)), new evj.c(0, () -> {
         evg $$0x = evg.O();
         return !$$0x.q() ? 2147483646 : $$0x.aM().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final evj<evl> ce = new evj<>(
      "options.particles", evj.a(), evj.b(), new evj.e<>(Arrays.asList(evl.values()), Codec.INT.xmap(evl::a, evl::a)), evl.a, $$0x -> {
      }
   );
   private final evj<evi> cf = new evj<>(
      "options.narrator",
      evj.a(),
      ($$0x, $$1x) -> (vf)(this.Y.aV().a() ? $$1x.b() : vf.c("options.narrator.notavailable")),
      new evj.e<>(Arrays.asList(evi.values()), Codec.INT.xmap(evi::a, evi::a)),
      evi.a,
      $$0x -> this.Y.aV().a($$0x)
   );
   public String ad = "en_us";
   private final evj<String> cg = new evj<>(
      "options.audioDevice",
      evj.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return vf.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? vf.b($$1x.substring(giz.c)) : vf.b($$1x);
         }
      },
      new evj.h<>(
         () -> Stream.concat(Stream.of(""), evg.O().ai().a().stream()).toList(),
         $$0x -> evg.O().q() && $$0x != "" && !evg.O().ai().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gjc $$1x = evg.O().ai();
         $$1x.j();
         $$1x.a(ght.a(arr.zu, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public evj<Boolean> a() {
      return this.am;
   }

   public evj<Boolean> b() {
      return this.ao;
   }

   public evj<Boolean> c() {
      return this.aq;
   }

   public evj<Double> d() {
      return this.ar;
   }

   public evj<Integer> e() {
      return this.as;
   }

   public evj<Integer> f() {
      return this.at;
   }

   public evj<Double> g() {
      return this.av;
   }

   public evj<Integer> h() {
      return this.aw;
   }

   public evj<euu> i() {
      return this.ax;
   }

   public evj<euz> j() {
      return this.aB;
   }

   public evj<Boolean> k() {
      return this.aC;
   }

   public evj<evn> l() {
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

   public evj<cff> m() {
      return this.aH;
   }

   public evj<Double> n() {
      return this.aI;
   }

   public evj<Double> o() {
      return this.aJ;
   }

   public evj<Double> p() {
      return this.aK;
   }

   public evj<Double> q() {
      return this.aL;
   }

   public evj<Boolean> r() {
      return this.aN;
   }

   public evj<Boolean> s() {
      return this.aO;
   }

   public evj<bme> t() {
      return this.aQ;
   }

   public evj<Double> u() {
      return this.aR;
   }

   public evj<Double> v() {
      return this.aS;
   }

   public evj<Double> w() {
      return this.aT;
   }

   public evj<Double> x() {
      return this.aU;
   }

   public evj<Double> y() {
      return this.aV;
   }

   public evj<Double> z() {
      return this.aX;
   }

   public evj<Integer> A() {
      return this.aY;
   }

   public evj<euq> B() {
      return this.aZ;
   }

   public evj<Integer> C() {
      return this.ba;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return aun.a(Math.log10($$0) * 100.0);
   }

   public evj<Double> D() {
      return this.bb;
   }

   public evj<Boolean> E() {
      return this.bc;
   }

   public evj<Boolean> F() {
      return this.bd;
   }

   public evj<Boolean> G() {
      return this.be;
   }

   public evj<Boolean> H() {
      return this.bf;
   }

   public evj<Boolean> I() {
      return this.bg;
   }

   public evj<Boolean> J() {
      return this.bh;
   }

   public evj<Boolean> K() {
      return this.bi;
   }

   public evj<Boolean> L() {
      return this.bj;
   }

   public evj<Boolean> M() {
      return this.bk;
   }

   public evj<Boolean> N() {
      return this.bl;
   }

   public evj<Boolean> O() {
      return this.bm;
   }

   public evj<Boolean> P() {
      return this.bn;
   }

   public evj<Boolean> Q() {
      return this.bo;
   }

   public evj<Boolean> R() {
      return this.bq;
   }

   public evj<Boolean> S() {
      return this.br;
   }

   public final float a(ars $$0) {
      return this.b($$0).c().floatValue();
   }

   public final evj<Double> b(ars $$0) {
      return Objects.requireNonNull(this.bs.get($$0));
   }

   private evj<Double> a(String $$0, ars $$1) {
      return new evj<>(
         $$0, evj.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ve.c) : a($$0x, $$1x.doubleValue()), evj.m.a, 1.0, $$1x -> evg.O().ai().a($$1, $$1x.floatValue())
      );
   }

   public evj<Boolean> T() {
      return this.bt;
   }

   public evj<Boolean> U() {
      return this.bw;
   }

   public evj<Boolean> V() {
      return this.bx;
   }

   public evj<Boolean> W() {
      return this.by;
   }

   public evj<Boolean> X() {
      return this.bz;
   }

   public evj<Boolean> Y() {
      return this.bA;
   }

   public evj<Boolean> Z() {
      return this.bD;
   }

   public evj<Boolean> aa() {
      return this.bE;
   }

   public evj<Boolean> ab() {
      return this.bG;
   }

   public evj<Boolean> ac() {
      return this.bH;
   }

   public evj<Boolean> ad() {
      return this.bJ;
   }

   public evj<Integer> ae() {
      return this.bM;
   }

   public evj<Boolean> af() {
      return this.bO;
   }

   public evj<Double> ag() {
      return this.bQ;
   }

   public evj<Double> ah() {
      return this.bS;
   }

   public evj<Double> ai() {
      return this.bU;
   }

   public evj<Double> aj() {
      return this.bW;
   }

   public evj<Double> ak() {
      return this.bY;
   }

   public evj<Double> al() {
      return this.ca;
   }

   public evj<Double> am() {
      return this.cb;
   }

   public evj<Integer> an() {
      return this.cd;
   }

   public evj<evl> ao() {
      return this.ce;
   }

   public evj<evi> ap() {
      return this.cf;
   }

   public evj<String> aq() {
      return this.cg;
   }

   public evk(evg $$0, File $$1) {
      this.Y = $$0;
      this.bK = new File($$1, "options.txt");
      boolean $$2 = $$0.af();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.as = new evj<>(
         "options.renderDistance",
         evj.a(),
         ($$0x, $$1x) -> a($$0x, vf.a("options.chunks", $$1x)),
         new evj.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> evg.O().f.r()
      );
      this.at = new evj<>(
         "options.simulationDistance", evj.a(), ($$0x, $$1x) -> a($$0x, vf.a("options.chunks", $$1x)), new evj.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
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

   public void a(eve $$0, eou.a $$1) {
      $$0.b($$1);
      this.as();
   }

   private void a(evk.a $$0) {
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
      this.i = $$0.a("resourcePacks", this.i, evk::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, evk::c, ah::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, gkh::a, gkh::a);
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

      for (eve $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(eou.a($$3));
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
               this.aB.a(euz.b);
            } else {
               this.aB.a(euz.a);
            }
         }

         this.a(new evk.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, evj<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> evk.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     evk.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? evk.a($$2) : $$1;
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
               } else if (evk.a($$2)) {
                  return 1.0F;
               } else if (evk.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     evk.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         eve.d();
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
         this.a(new evk.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, evj<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> evk.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(evk.ah.toJson($$2x));
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

   public euu av() {
      return this.aA() >= 4 ? this.ax.c() : euu.a;
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

   public eus ax() {
      return this.bL;
   }

   public void a(eus $$0) {
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
      <T> void a(String var1, evj<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
