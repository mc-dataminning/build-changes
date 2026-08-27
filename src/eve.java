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

public class eve {
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
   private static final vd al = vd.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final evd<Boolean> am = evd.a("options.darkMojangStudiosBackgroundColor", evd.a(al), false);
   private static final vd an = vd.c("options.hideLightningFlashes.tooltip");
   private final evd<Boolean> ao = evd.a("options.hideLightningFlashes", evd.a(an), false);
   private static final vd ap = vd.c("options.hideSplashTexts.tooltip");
   private final evd<Boolean> aq = evd.a("options.hideSplashTexts", evd.a(ap), false);
   private final evd<Double> ar = new evd<>("options.sensitivity", evd.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, vd.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, vd.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, evd.m.a, 0.5, $$0x -> {
   });
   private final evd<Integer> as;
   private final evd<Integer> at;
   private int au = 0;
   private final evd<Double> av = new evd<>(
      "options.entityDistanceScaling",
      evd.a(),
      eve::a,
      new evd.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final evd<Integer> aw = new evd<>(
      "options.framerateLimit",
      evd.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, vd.c("options.framerateLimit.max")) : a($$0x, vd.a("options.framerate", $$1x)),
      new evd.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> eva.N().aL().a($$0x)
   );
   private final evd<euo> ax = new evd<>(
      "options.renderClouds",
      evd.a(),
      evd.b(),
      new evd.e<>(Arrays.asList(euo.values()), atq.a(euo.d, Codec.BOOL, $$0x -> $$0x ? euo.c : euo.a)),
      euo.c,
      $$0x -> {
         if (eva.L()) {
            eof $$1x = eva.N().f.x();
            if ($$1x != null) {
               $$1x.b(eva.a);
            }
         }
      }
   );
   private static final vd ay = vd.c("options.graphics.fast.tooltip");
   private static final vd az = vd.a("options.graphics.fabulous.tooltip", vd.c("options.graphics.fabulous").a(n.u));
   private static final vd aA = vd.c("options.graphics.fancy.tooltip");
   private final evd<eut> aB = new evd<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> eyj.a(aA);
            case a -> eyj.a(ay);
            case c -> eyj.a(az);
         };
      },
      ($$0x, $$1x) -> {
         vr $$2x = vd.c($$1x.b());
         return $$1x == eut.c ? $$2x.a(n.u) : $$2x;
      },
      new evd.a<>(
         Arrays.asList(eut.values()),
         Stream.of(eut.values()).filter($$0x -> $$0x != eut.c).collect(Collectors.toList()),
         () -> eva.N().q() && eva.N().ag().h(),
         ($$0x, $$1x) -> {
            eva $$2x = eva.N();
            fst $$3x = $$2x.ag();
            if ($$1x == eut.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(eut::a, eut::a)
      ),
      eut.b,
      $$0x -> {
      }
   );
   private final evd<Boolean> aC = evd.a("options.ao", true, $$0x -> eva.N().f.f());
   private static final vd aD = vd.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final vd aE = vd.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final vd aF = vd.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final evd<evh> aG = new evd<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> eyj.a(aD);
         case b -> eyj.a(aE);
         case c -> eyj.a(aF);
      };
   }, evd.b(), new evd.e<>(Arrays.asList(evh.values()), Codec.INT.xmap(evh::a, evh::a)), evh.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final evd<cez> aH = new evd<>(
      "options.chat.visibility", evd.a(), evd.b(), new evd.e<>(Arrays.asList(cez.values()), Codec.INT.xmap(cez::a, cez::a)), cez.a, $$0x -> {
      }
   );
   private final evd<Double> aI = new evd<>("options.chat.opacity", evd.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), evd.m.a, 1.0, $$0x -> eva.N().l.d().b());
   private final evd<Double> aJ = new evd<>("options.chat.line_spacing", evd.a(), eve::a, evd.m.a, 0.0, $$0x -> {
   });
   private final evd<Double> aK = new evd<>("options.accessibility.text_background_opacity", evd.a(), eve::a, evd.m.a, 0.5, $$0x -> eva.N().l.d().b());
   private final evd<Double> aL = new evd<>("options.accessibility.panorama_speed", evd.a(), eve::a, evd.m.a, 1.0, $$0x -> {
   });
   private static final vd aM = vd.c("options.accessibility.high_contrast.tooltip");
   private final evd<Boolean> aN = evd.a("options.accessibility.high_contrast", evd.a(aM), false, $$0x -> {
      apn $$1x = eva.N().Z();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final evd<Boolean> aO = evd.a(
      "options.accessibility.narrator_hotkey",
      evd.a(eva.a ? vd.c("options.accessibility.narrator_hotkey.mac.tooltip") : vd.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cfc> aP = EnumSet.allOf(cfc.class);
   private final evd<blz> aQ = new evd<>("options.mainHand", evd.a(), evd.b(), new evd.e<>(Arrays.asList(blz.values()), blz.c), blz.b, $$0x -> this.au());
   public int o;
   public int p;
   private final evd<Double> aR = new evd<>(
      "options.chat.scale",
      evd.a(),
      ($$0x, $$1x) -> (vd)($$1x == 0.0 ? vc.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      evd.m.a,
      1.0,
      $$0x -> eva.N().l.d().b()
   );
   private final evd<Double> aS = new evd<>("options.chat.width", evd.a(), ($$0x, $$1x) -> b($$0x, ewz.a($$1x)), evd.m.a, 1.0, $$0x -> eva.N().l.d().b());
   private final evd<Double> aT = new evd<>(
      "options.chat.height.unfocused", evd.a(), ($$0x, $$1x) -> b($$0x, ewz.b($$1x)), evd.m.a, ewz.h(), $$0x -> eva.N().l.d().b()
   );
   private final evd<Double> aU = new evd<>(
      "options.chat.height.focused", evd.a(), ($$0x, $$1x) -> b($$0x, ewz.b($$1x)), evd.m.a, 1.0, $$0x -> eva.N().l.d().b()
   );
   private final evd<Double> aV = new evd<>(
      "options.chat.delay_instant",
      evd.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? vd.c("options.chat.delay_none") : vd.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new evd.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> eva.N().aV().a($$0x)
   );
   private static final vd aW = vd.c("options.notifications.display_time.tooltip");
   private final evd<Double> aX = new evd<>(
      "options.notifications.display_time",
      evd.a(aW),
      ($$0x, $$1x) -> a($$0x, vd.a("options.multiplier", $$1x)),
      new evd.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final evd<Integer> aY = new evd<>(
      "options.mipmapLevels", evd.a(), ($$0x, $$1x) -> (vd)($$1x == 0 ? vc.a($$0x, false) : a($$0x, $$1x.intValue())), new evd.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final evd<euk> aZ = new evd<>(
      "options.attackIndicator", evd.a(), evd.b(), new evd.e<>(Arrays.asList(euk.values()), Codec.INT.xmap(euk::a, euk::a)), euk.b, $$0x -> {
      }
   );
   public gjw r = gjw.a;
   public boolean s = false;
   public boolean t = false;
   private final evd<Integer> ba = new evd<>("options.biomeBlendRadius", evd.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, vd.c("options.biomeBlendRadius." + $$2x));
   }, new evd.f(0, 7), 2, $$0x -> eva.N().f.f());
   private final evd<Double> bb = new evd<>(
      "options.mouseWheelSensitivity",
      evd.a(),
      ($$0x, $$1x) -> a($$0x, vd.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new evd.f(-200, 100).a(eve::c, eve::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final evd<Boolean> bc = evd.a("options.rawMouseInput", true, $$0x -> {
      eox $$1x = eva.N().aL();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final evd<Boolean> bd = evd.a("options.autoJump", false);
   private final evd<Boolean> be = evd.a("options.operatorItemsTab", false);
   private final evd<Boolean> bf = evd.a("options.autoSuggestCommands", true);
   private final evd<Boolean> bg = evd.a("options.chat.color", true);
   private final evd<Boolean> bh = evd.a("options.chat.links", true);
   private final evd<Boolean> bi = evd.a("options.chat.links.prompt", true);
   private final evd<Boolean> bj = evd.a("options.vsync", true, $$0x -> {
      if (eva.N().aL() != null) {
         eva.N().aL().a($$0x);
      }
   });
   private final evd<Boolean> bk = evd.a("options.entityShadows", true);
   private final evd<Boolean> bl = evd.a("options.forceUnicodeFont", false, $$0x -> {
      eva $$1x = eva.N();
      if ($$1x.aL() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final evd<Boolean> bm = evd.a("options.invertMouse", false);
   private final evd<Boolean> bn = evd.a("options.discrete_mouse_scroll", false);
   private final evd<Boolean> bo = evd.a("options.realmsNotifications", true);
   private static final vd bp = vd.c("options.allowServerListing.tooltip");
   private final evd<Boolean> bq = evd.a("options.allowServerListing", evd.a(bp), true, $$0x -> this.au());
   private final evd<Boolean> br = evd.a("options.reducedDebugInfo", false);
   private final Map<arn, evd<Double>> bs = ac.a(new EnumMap<>(arn.class), $$0x -> {
      for (arn $$1x : arn.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final evd<Boolean> bt = evd.a("options.showSubtitles", false);
   private static final vd bu = vd.c("options.directionalAudio.on.tooltip");
   private static final vd bv = vd.c("options.directionalAudio.off.tooltip");
   private final evd<Boolean> bw = evd.a("options.directionalAudio", $$0x -> $$0x ? eyj.a(bu) : eyj.a(bv), false, $$0x -> {
      gir $$1x = eva.N().ah();
      $$1x.j();
      $$1x.a(ghi.a(arm.zu, 1.0F));
   });
   private final evd<Boolean> bx = new evd<>(
      "options.accessibility.text_background",
      evd.a(),
      ($$0x, $$1x) -> $$1x ? vd.c("options.accessibility.text_background.chat") : vd.c("options.accessibility.text_background.everywhere"),
      evd.a,
      true,
      $$0x -> {
      }
   );
   private final evd<Boolean> by = evd.a("options.touchscreen", false);
   private final evd<Boolean> bz = evd.a("options.fullscreen", false, $$0x -> {
      eva $$1x = eva.N();
      if ($$1x.aL() != null && $$1x.aL().j() != $$0x) {
         $$1x.aL().h();
         this.X().a($$1x.aL().j());
      }
   });
   private final evd<Boolean> bA = evd.a("options.viewBobbing", true);
   private static final vd bB = vd.c("options.key.toggle");
   private static final vd bC = vd.c("options.key.hold");
   private final evd<Boolean> bD = new evd<>("key.sneak", evd.a(), ($$0x, $$1x) -> $$1x ? bB : bC, evd.a, false, $$0x -> {
   });
   private final evd<Boolean> bE = new evd<>("key.sprint", evd.a(), ($$0x, $$1x) -> $$1x ? bB : bC, evd.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final vd bF = vd.c("options.hideMatchedNames.tooltip");
   private final evd<Boolean> bG = evd.a("options.hideMatchedNames", evd.a(bF), true);
   private final evd<Boolean> bH = evd.a("options.autosaveIndicator", true);
   private static final vd bI = vd.c("options.onlyShowSecureChat.tooltip");
   private final evd<Boolean> bJ = evd.a("options.onlyShowSecureChat", evd.a(bI), false);
   public final euy x = new euy("key.forward", 87, "key.categories.movement");
   public final euy y = new euy("key.left", 65, "key.categories.movement");
   public final euy z = new euy("key.back", 83, "key.categories.movement");
   public final euy A = new euy("key.right", 68, "key.categories.movement");
   public final euy B = new euy("key.jump", 32, "key.categories.movement");
   public final euy C = new evo("key.sneak", 340, "key.categories.movement", this.bD::c);
   public final euy D = new evo("key.sprint", 341, "key.categories.movement", this.bE::c);
   public final euy E = new euy("key.inventory", 69, "key.categories.inventory");
   public final euy F = new euy("key.swapOffhand", 70, "key.categories.inventory");
   public final euy G = new euy("key.drop", 81, "key.categories.inventory");
   public final euy H = new euy("key.use", eoo.b.c, 1, "key.categories.gameplay");
   public final euy I = new euy("key.attack", eoo.b.c, 0, "key.categories.gameplay");
   public final euy J = new euy("key.pickItem", eoo.b.c, 2, "key.categories.gameplay");
   public final euy K = new euy("key.chat", 84, "key.categories.multiplayer");
   public final euy L = new euy("key.playerlist", 258, "key.categories.multiplayer");
   public final euy M = new euy("key.command", 47, "key.categories.multiplayer");
   public final euy N = new euy("key.socialInteractions", 80, "key.categories.multiplayer");
   public final euy O = new euy("key.screenshot", 291, "key.categories.misc");
   public final euy P = new euy("key.togglePerspective", 294, "key.categories.misc");
   public final euy Q = new euy("key.smoothCamera", eoo.bv.b(), "key.categories.misc");
   public final euy R = new euy("key.fullscreen", 300, "key.categories.misc");
   public final euy S = new euy("key.spectatorOutlines", eoo.bv.b(), "key.categories.misc");
   public final euy T = new euy("key.advancements", 76, "key.categories.misc");
   public final euy[] U = new euy[]{
      new euy("key.hotbar.1", 49, "key.categories.inventory"),
      new euy("key.hotbar.2", 50, "key.categories.inventory"),
      new euy("key.hotbar.3", 51, "key.categories.inventory"),
      new euy("key.hotbar.4", 52, "key.categories.inventory"),
      new euy("key.hotbar.5", 53, "key.categories.inventory"),
      new euy("key.hotbar.6", 54, "key.categories.inventory"),
      new euy("key.hotbar.7", 55, "key.categories.inventory"),
      new euy("key.hotbar.8", 56, "key.categories.inventory"),
      new euy("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final euy V = new euy("key.saveToolbarActivator", 67, "key.categories.creative");
   public final euy W = new euy("key.loadToolbarActivator", 88, "key.categories.creative");
   public final euy[] X = (euy[])ArrayUtils.addAll(
      new euy[]{
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
   protected eva Y;
   private final File bK;
   public boolean Z;
   private eum bL = eum.a;
   public String aa = "";
   public boolean ab;
   private final evd<Integer> bM = new evd<>("options.fov", evd.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, vd.c("options.fov.min"));
         case 110 -> a($$0x, vd.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new evd.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> eva.N().f.r());
   private static final vd bN = vd.a("options.telemetry.button.tooltip", vd.c("options.telemetry.state.minimal"), vd.c("options.telemetry.state.all"));
   private final evd<Boolean> bO = evd.a("options.telemetry.button", evd.a(bN), ($$0x, $$1x) -> {
      eva $$2x = eva.N();
      if (!$$2x.B()) {
         return vd.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.A() ? vd.c("options.telemetry.state.all") : vd.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final vd bP = vd.c("options.screenEffectScale.tooltip");
   private final evd<Double> bQ = new evd<>(
      "options.screenEffectScale", evd.a(bP), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vc.c) : a($$0x, $$1x.doubleValue()), evd.m.a, 1.0, $$0x -> {
      }
   );
   private static final vd bR = vd.c("options.fovEffectScale.tooltip");
   private final evd<Double> bS = new evd<>(
      "options.fovEffectScale",
      evd.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vc.c) : a($$0x, $$1x.doubleValue()),
      evd.m.a.a(aui::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final vd bT = vd.c("options.darknessEffectScale.tooltip");
   private final evd<Double> bU = new evd<>(
      "options.darknessEffectScale",
      evd.a(bT),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vc.c) : a($$0x, $$1x.doubleValue()),
      evd.m.a.a(aui::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final vd bV = vd.c("options.glintSpeed.tooltip");
   private final evd<Double> bW = new evd<>(
      "options.glintSpeed", evd.a(bV), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vc.c) : a($$0x, $$1x.doubleValue()), evd.m.a, 0.5, $$0x -> {
      }
   );
   private static final vd bX = vd.c("options.glintStrength.tooltip");
   private final evd<Double> bY = new evd<>(
      "options.glintStrength",
      evd.a(bX),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vc.c) : a($$0x, $$1x.doubleValue()),
      evd.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final vd bZ = vd.c("options.damageTiltStrength.tooltip");
   private final evd<Double> ca = new evd<>(
      "options.damageTiltStrength", evd.a(bZ), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vc.c) : a($$0x, $$1x.doubleValue()), evd.m.a, 1.0, $$0x -> {
      }
   );
   private final evd<Double> cb = new evd<>("options.gamma", evd.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, vd.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, vd.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, vd.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, evd.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cc = 2147483646;
   private final evd<Integer> cd = new evd<>(
      "options.guiScale", evd.a(), ($$0x, $$1x) -> $$1x == 0 ? vd.c("options.guiScale.auto") : vd.b(Integer.toString($$1x)), new evd.c(0, () -> {
         eva $$0x = eva.N();
         return !$$0x.q() ? 2147483646 : $$0x.aL().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final evd<evf> ce = new evd<>(
      "options.particles", evd.a(), evd.b(), new evd.e<>(Arrays.asList(evf.values()), Codec.INT.xmap(evf::a, evf::a)), evf.a, $$0x -> {
      }
   );
   private final evd<evc> cf = new evd<>(
      "options.narrator",
      evd.a(),
      ($$0x, $$1x) -> (vd)(this.Y.aU().a() ? $$1x.b() : vd.c("options.narrator.notavailable")),
      new evd.e<>(Arrays.asList(evc.values()), Codec.INT.xmap(evc::a, evc::a)),
      evc.a,
      $$0x -> this.Y.aU().a($$0x)
   );
   public String ad = "en_us";
   private final evd<String> cg = new evd<>(
      "options.audioDevice",
      evd.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return vd.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? vd.b($$1x.substring(gio.c)) : vd.b($$1x);
         }
      },
      new evd.h<>(
         () -> Stream.concat(Stream.of(""), eva.N().ah().a().stream()).toList(),
         $$0x -> eva.N().q() && $$0x != "" && !eva.N().ah().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gir $$1x = eva.N().ah();
         $$1x.j();
         $$1x.a(ghi.a(arm.zu, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public evd<Boolean> a() {
      return this.am;
   }

   public evd<Boolean> b() {
      return this.ao;
   }

   public evd<Boolean> c() {
      return this.aq;
   }

   public evd<Double> d() {
      return this.ar;
   }

   public evd<Integer> e() {
      return this.as;
   }

   public evd<Integer> f() {
      return this.at;
   }

   public evd<Double> g() {
      return this.av;
   }

   public evd<Integer> h() {
      return this.aw;
   }

   public evd<euo> i() {
      return this.ax;
   }

   public evd<eut> j() {
      return this.aB;
   }

   public evd<Boolean> k() {
      return this.aC;
   }

   public evd<evh> l() {
      return this.aG;
   }

   public void a(apn $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (apk $$2 : $$0.f()) {
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

   public evd<cez> m() {
      return this.aH;
   }

   public evd<Double> n() {
      return this.aI;
   }

   public evd<Double> o() {
      return this.aJ;
   }

   public evd<Double> p() {
      return this.aK;
   }

   public evd<Double> q() {
      return this.aL;
   }

   public evd<Boolean> r() {
      return this.aN;
   }

   public evd<Boolean> s() {
      return this.aO;
   }

   public evd<blz> t() {
      return this.aQ;
   }

   public evd<Double> u() {
      return this.aR;
   }

   public evd<Double> v() {
      return this.aS;
   }

   public evd<Double> w() {
      return this.aT;
   }

   public evd<Double> x() {
      return this.aU;
   }

   public evd<Double> y() {
      return this.aV;
   }

   public evd<Double> z() {
      return this.aX;
   }

   public evd<Integer> A() {
      return this.aY;
   }

   public evd<euk> B() {
      return this.aZ;
   }

   public evd<Integer> C() {
      return this.ba;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return aui.a(Math.log10($$0) * 100.0);
   }

   public evd<Double> D() {
      return this.bb;
   }

   public evd<Boolean> E() {
      return this.bc;
   }

   public evd<Boolean> F() {
      return this.bd;
   }

   public evd<Boolean> G() {
      return this.be;
   }

   public evd<Boolean> H() {
      return this.bf;
   }

   public evd<Boolean> I() {
      return this.bg;
   }

   public evd<Boolean> J() {
      return this.bh;
   }

   public evd<Boolean> K() {
      return this.bi;
   }

   public evd<Boolean> L() {
      return this.bj;
   }

   public evd<Boolean> M() {
      return this.bk;
   }

   public evd<Boolean> N() {
      return this.bl;
   }

   public evd<Boolean> O() {
      return this.bm;
   }

   public evd<Boolean> P() {
      return this.bn;
   }

   public evd<Boolean> Q() {
      return this.bo;
   }

   public evd<Boolean> R() {
      return this.bq;
   }

   public evd<Boolean> S() {
      return this.br;
   }

   public final float a(arn $$0) {
      return this.b($$0).c().floatValue();
   }

   public final evd<Double> b(arn $$0) {
      return Objects.requireNonNull(this.bs.get($$0));
   }

   private evd<Double> a(String $$0, arn $$1) {
      return new evd<>(
         $$0, evd.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vc.c) : a($$0x, $$1x.doubleValue()), evd.m.a, 1.0, $$1x -> eva.N().ah().a($$1, $$1x.floatValue())
      );
   }

   public evd<Boolean> T() {
      return this.bt;
   }

   public evd<Boolean> U() {
      return this.bw;
   }

   public evd<Boolean> V() {
      return this.bx;
   }

   public evd<Boolean> W() {
      return this.by;
   }

   public evd<Boolean> X() {
      return this.bz;
   }

   public evd<Boolean> Y() {
      return this.bA;
   }

   public evd<Boolean> Z() {
      return this.bD;
   }

   public evd<Boolean> aa() {
      return this.bE;
   }

   public evd<Boolean> ab() {
      return this.bG;
   }

   public evd<Boolean> ac() {
      return this.bH;
   }

   public evd<Boolean> ad() {
      return this.bJ;
   }

   public evd<Integer> ae() {
      return this.bM;
   }

   public evd<Boolean> af() {
      return this.bO;
   }

   public evd<Double> ag() {
      return this.bQ;
   }

   public evd<Double> ah() {
      return this.bS;
   }

   public evd<Double> ai() {
      return this.bU;
   }

   public evd<Double> aj() {
      return this.bW;
   }

   public evd<Double> ak() {
      return this.bY;
   }

   public evd<Double> al() {
      return this.ca;
   }

   public evd<Double> am() {
      return this.cb;
   }

   public evd<Integer> an() {
      return this.cd;
   }

   public evd<evf> ao() {
      return this.ce;
   }

   public evd<evc> ap() {
      return this.cf;
   }

   public evd<String> aq() {
      return this.cg;
   }

   public eve(eva $$0, File $$1) {
      this.Y = $$0;
      this.bK = new File($$1, "options.txt");
      boolean $$2 = $$0.ae();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.as = new evd<>(
         "options.renderDistance",
         evd.a(),
         ($$0x, $$1x) -> a($$0x, vd.a("options.chunks", $$1x)),
         new evd.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> eva.N().f.r()
      );
      this.at = new evd<>(
         "options.simulationDistance", evd.a(), ($$0x, $$1x) -> a($$0x, vd.a("options.chunks", $$1x)), new evd.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
         }
      );
      this.af = ac.i() == ac.a.c;
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

   public void a(euy $$0, eoo.a $$1) {
      $$0.b($$1);
      this.as();
   }

   private void a(eve.a $$0) {
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
      this.i = $$0.a("resourcePacks", this.i, eve::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, eve::c, ah::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, gjw::a, gjw::a);
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

      for (euy $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(eoo.a($$3));
         }
      }

      for (arn $$4 : arn.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bs.get($$4));
      }

      for (cfc $$5 : cfc.values()) {
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

         sl $$0 = new sl();

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

         final sl $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(eut.b);
            } else {
               this.aB.a(eut.a);
            }
         }

         this.a(new eve.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, evd<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> eve.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     eve.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? eve.a($$2) : $$1;
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
               } else if (eve.a($$2)) {
                  return 1.0F;
               } else if (eve.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     eve.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         if (this.Y.aL() != null) {
            this.Y.aL().a(this.aw.c());
         }

         euy.d();
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

   private sl a(sl $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return avq.e.a(this.Y.aq(), $$0, $$1);
   }

   public void as() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bK), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new eve.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, evd<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> eve.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(eve.ah.toJson($$2x));
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
         if (this.Y.aL().f().isPresent()) {
            $$0.println("fullscreenResolution:" + this.Y.aL().f().get().g());
         }
      } catch (Exception var6) {
         ag.error("Failed to save options", var6);
      }

      this.au();
   }

   public amo at() {
      int $$0 = 0;

      for (cfc $$1 : this.aP) {
         $$0 |= $$1.a();
      }

      return new amo(this.ad, this.as.c(), this.aH.c(), this.bg.c(), $$0, this.aQ.c(), this.Y.aP(), this.bq.c());
   }

   public void au() {
      if (this.Y.s != null) {
         this.Y.s.cn.b(new xo(this.at()));
      }
   }

   private void b(cfc $$0, boolean $$1) {
      if ($$1) {
         this.aP.add($$0);
      } else {
         this.aP.remove($$0);
      }
   }

   public boolean a(cfc $$0) {
      return this.aP.contains($$0);
   }

   public void a(cfc $$0, boolean $$1) {
      this.b($$0, $$1);
      this.au();
   }

   public euo av() {
      return this.aA() >= 4 ? this.ax.c() : euo.a;
   }

   public boolean aw() {
      return this.q;
   }

   public void b(apn $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         apk $$4 = $$0.c($$3);
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

   public eum ax() {
      return this.bL;
   }

   public void a(eum $$0) {
      this.bL = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = aty.a(ah, $$0, ai);
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

   private static vd b(vd $$0, int $$1) {
      return vd.a("options.pixel_value", $$0, $$1);
   }

   private static vd a(vd $$0, double $$1) {
      return vd.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static vd a(vd $$0, vd $$1) {
      return vd.a("options.generic_value", $$0, $$1);
   }

   public static vd a(vd $$0, int $$1) {
      return a($$0, vd.b(Integer.toString($$1)));
   }

   interface a {
      <T> void a(String var1, evd<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
