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

public class eqr {
   static final Logger aj = LogUtils.getLogger();
   static final Gson ak = new Gson();
   private static final TypeToken<List<String>> al = new TypeToken<List<String>>() {
   };
   public static final int a = 2;
   public static final int b = 4;
   public static final int c = 8;
   public static final int d = 12;
   public static final int e = 16;
   public static final int f = 32;
   private static final Splitter am = Splitter.on(':').limit(2);
   private static final float an = 1.0F;
   public static final String g = "";
   private static final te ao = te.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final eqq<Boolean> ap = eqq.a("options.darkMojangStudiosBackgroundColor", eqq.a(ao), false);
   private static final te aq = te.c("options.hideLightningFlashes.tooltip");
   private final eqq<Boolean> ar = eqq.a("options.hideLightningFlashes", eqq.a(aq), false);
   private final eqq<Double> as = new eqq<>("options.sensitivity", eqq.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, te.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, te.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, eqq.m.a, 0.5, $$0x -> {
   });
   private final eqq<Integer> at;
   private final eqq<Integer> au;
   private int av = 0;
   private final eqq<Double> aw = new eqq<>(
      "options.entityDistanceScaling",
      eqq.a(),
      eqr::a,
      new eqq.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final eqq<Integer> ax = new eqq<>(
      "options.framerateLimit",
      eqq.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, te.c("options.framerateLimit.max")) : a($$0x, te.a("options.framerate", $$1x)),
      new eqq.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> eqn.N().aM().a($$0x)
   );
   private final eqq<eqb> ay = new eqq<>(
      "options.renderClouds",
      eqq.a(),
      eqq.b(),
      new eqq.e<>(Arrays.asList(eqb.values()), aqw.a(eqb.d, Codec.BOOL, $$0x -> $$0x ? eqb.c : eqb.a)),
      eqb.c,
      $$0x -> {
         if (eqn.L()) {
            ejt $$1x = eqn.N().f.x();
            if ($$1x != null) {
               $$1x.b(eqn.a);
            }
         }
      }
   );
   private static final te az = te.c("options.graphics.fast.tooltip");
   private static final te aA = te.a("options.graphics.fabulous.tooltip", te.c("options.graphics.fabulous").a(n.u));
   private static final te aB = te.c("options.graphics.fancy.tooltip");
   private final eqq<eqg> aC = new eqq<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> etr.a(aB);
            case a -> etr.a(az);
            case c -> etr.a(aA);
         };
      },
      ($$0x, $$1x) -> {
         tr $$2x = te.c($$1x.b());
         return $$1x == eqg.c ? $$2x.a(n.u) : $$2x;
      },
      new eqq.a<>(
         Arrays.asList(eqg.values()),
         Stream.of(eqg.values()).filter($$0x -> $$0x != eqg.c).collect(Collectors.toList()),
         () -> eqn.N().q() && eqn.N().ag().h(),
         ($$0x, $$1x) -> {
            eqn $$2x = eqn.N();
            fna $$3x = $$2x.ag();
            if ($$1x == eqg.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(eqg::a, eqg::a)
      ),
      eqg.b,
      $$0x -> {
      }
   );
   private final eqq<Boolean> aD = eqq.a("options.ao", true, $$0x -> eqn.N().f.f());
   private static final te aE = te.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final te aF = te.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final te aG = te.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final eqq<equ> aH = new eqq<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> etr.a(aE);
         case b -> etr.a(aF);
         case c -> etr.a(aG);
      };
   }, eqq.b(), new eqq.e<>(Arrays.asList(equ.values()), Codec.INT.xmap(equ::a, equ::a)), equ.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final eqq<cbj> aI = new eqq<>(
      "options.chat.visibility", eqq.a(), eqq.b(), new eqq.e<>(Arrays.asList(cbj.values()), Codec.INT.xmap(cbj::a, cbj::a)), cbj.a, $$0x -> {
      }
   );
   private final eqq<Double> aJ = new eqq<>("options.chat.opacity", eqq.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), eqq.m.a, 1.0, $$0x -> eqn.N().l.d().b());
   private final eqq<Double> aK = new eqq<>("options.chat.line_spacing", eqq.a(), eqr::a, eqq.m.a, 0.0, $$0x -> {
   });
   private final eqq<Double> aL = new eqq<>("options.accessibility.text_background_opacity", eqq.a(), eqr::a, eqq.m.a, 0.5, $$0x -> eqn.N().l.d().b());
   private final eqq<Double> aM = new eqq<>("options.accessibility.panorama_speed", eqq.a(), eqr::a, eqq.m.a, 1.0, $$0x -> {
   });
   private static final te aN = te.c("options.accessibility.high_contrast.tooltip");
   private final eqq<Boolean> aO = eqq.a("options.accessibility.high_contrast", eqq.a(aN), false, $$0x -> {
      amv $$1x = eqn.N().Z();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cbm> aP = EnumSet.allOf(cbm.class);
   private final eqq<biq> aQ = new eqq<>("options.mainHand", eqq.a(), eqq.b(), new eqq.e<>(Arrays.asList(biq.values()), biq.c), biq.b, $$0x -> this.ar());
   public int o;
   public int p;
   private final eqq<Double> aR = new eqq<>(
      "options.chat.scale",
      eqq.a(),
      ($$0x, $$1x) -> (te)($$1x == 0.0 ? td.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      eqq.m.a,
      1.0,
      $$0x -> eqn.N().l.d().b()
   );
   private final eqq<Double> aS = new eqq<>("options.chat.width", eqq.a(), ($$0x, $$1x) -> b($$0x, esj.a($$1x)), eqq.m.a, 1.0, $$0x -> eqn.N().l.d().b());
   private final eqq<Double> aT = new eqq<>(
      "options.chat.height.unfocused", eqq.a(), ($$0x, $$1x) -> b($$0x, esj.b($$1x)), eqq.m.a, esj.h(), $$0x -> eqn.N().l.d().b()
   );
   private final eqq<Double> aU = new eqq<>(
      "options.chat.height.focused", eqq.a(), ($$0x, $$1x) -> b($$0x, esj.b($$1x)), eqq.m.a, 1.0, $$0x -> eqn.N().l.d().b()
   );
   private final eqq<Double> aV = new eqq<>(
      "options.chat.delay_instant",
      eqq.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? te.c("options.chat.delay_none") : te.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new eqq.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> eqn.N().aV().a($$0x)
   );
   private static final te aW = te.c("options.notifications.display_time.tooltip");
   private final eqq<Double> aX = new eqq<>(
      "options.notifications.display_time",
      eqq.a(aW),
      ($$0x, $$1x) -> a($$0x, te.a("options.multiplier", $$1x)),
      new eqq.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final eqq<Integer> aY = new eqq<>(
      "options.mipmapLevels", eqq.a(), ($$0x, $$1x) -> (te)($$1x == 0 ? td.a($$0x, false) : a($$0x, $$1x.intValue())), new eqq.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final eqq<epx> aZ = new eqq<>(
      "options.attackIndicator", eqq.a(), eqq.b(), new eqq.e<>(Arrays.asList(epx.values()), Codec.INT.xmap(epx::a, epx::a)), epx.b, $$0x -> {
      }
   );
   public gdx r = gdx.a;
   public boolean s = false;
   public boolean t = false;
   private final eqq<Integer> ba = new eqq<>("options.biomeBlendRadius", eqq.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, te.c("options.biomeBlendRadius." + $$2x));
   }, new eqq.f(0, 7), 2, $$0x -> eqn.N().f.f());
   private final eqq<Double> bb = new eqq<>(
      "options.mouseWheelSensitivity",
      eqq.a(),
      ($$0x, $$1x) -> a($$0x, te.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new eqq.f(-200, 100).a(eqr::c, eqr::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final eqq<Boolean> bc = eqq.a("options.rawMouseInput", true, $$0x -> {
      ekl $$1x = eqn.N().aM();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final eqq<Boolean> bd = eqq.a("options.autoJump", false);
   private final eqq<Boolean> be = eqq.a("options.operatorItemsTab", false);
   private final eqq<Boolean> bf = eqq.a("options.autoSuggestCommands", true);
   private final eqq<Boolean> bg = eqq.a("options.chat.color", true);
   private final eqq<Boolean> bh = eqq.a("options.chat.links", true);
   private final eqq<Boolean> bi = eqq.a("options.chat.links.prompt", true);
   private final eqq<Boolean> bj = eqq.a("options.vsync", true, $$0x -> {
      if (eqn.N().aM() != null) {
         eqn.N().aM().a($$0x);
      }
   });
   private final eqq<Boolean> bk = eqq.a("options.entityShadows", true);
   private final eqq<Boolean> bl = eqq.a("options.forceUnicodeFont", false, $$0x -> {
      eqn $$1x = eqn.N();
      if ($$1x.aM() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final eqq<Boolean> bm = eqq.a("options.invertMouse", false);
   private final eqq<Boolean> bn = eqq.a("options.discrete_mouse_scroll", false);
   private final eqq<Boolean> bo = eqq.a("options.realmsNotifications", true);
   private static final te bp = te.c("options.allowServerListing.tooltip");
   private final eqq<Boolean> bq = eqq.a("options.allowServerListing", eqq.a(bp), true, $$0x -> this.ar());
   private final eqq<Boolean> br = eqq.a("options.reducedDebugInfo", false);
   private final Map<aov, eqq<Double>> bs = ac.a(new EnumMap<>(aov.class), $$0x -> {
      for (aov $$1x : aov.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final eqq<Boolean> bt = eqq.a("options.showSubtitles", false);
   private static final te bu = te.c("options.directionalAudio.on.tooltip");
   private static final te bv = te.c("options.directionalAudio.off.tooltip");
   private final eqq<Boolean> bw = eqq.a("options.directionalAudio", $$0x -> $$0x ? etr.a(bu) : etr.a(bv), false, $$0x -> {
      gcs $$1x = eqn.N().ah();
      $$1x.i();
      $$1x.a(gbj.a(aou.yp, 1.0F));
   });
   private final eqq<Boolean> bx = new eqq<>(
      "options.accessibility.text_background",
      eqq.a(),
      ($$0x, $$1x) -> $$1x ? te.c("options.accessibility.text_background.chat") : te.c("options.accessibility.text_background.everywhere"),
      eqq.a,
      true,
      $$0x -> {
      }
   );
   private final eqq<Boolean> by = eqq.a("options.touchscreen", false);
   private final eqq<Boolean> bz = eqq.a("options.fullscreen", false, $$0x -> {
      eqn $$1x = eqn.N();
      if ($$1x.aM() != null && $$1x.aM().j() != $$0x) {
         $$1x.aM().h();
         this.V().a($$1x.aM().j());
      }
   });
   private final eqq<Boolean> bA = eqq.a("options.viewBobbing", true);
   private static final te bB = te.c("options.key.toggle");
   private static final te bC = te.c("options.key.hold");
   private final eqq<Boolean> bD = new eqq<>("key.sneak", eqq.a(), ($$0x, $$1x) -> $$1x ? bB : bC, eqq.a, false, $$0x -> {
   });
   private final eqq<Boolean> bE = new eqq<>("key.sprint", eqq.a(), ($$0x, $$1x) -> $$1x ? bB : bC, eqq.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final te bF = te.c("options.hideMatchedNames.tooltip");
   private final eqq<Boolean> bG = eqq.a("options.hideMatchedNames", eqq.a(bF), true);
   private final eqq<Boolean> bH = eqq.a("options.autosaveIndicator", true);
   private static final te bI = te.c("options.onlyShowSecureChat.tooltip");
   private final eqq<Boolean> bJ = eqq.a("options.onlyShowSecureChat", eqq.a(bI), false);
   public final eql x = new eql("key.forward", 87, "key.categories.movement");
   public final eql y = new eql("key.left", 65, "key.categories.movement");
   public final eql z = new eql("key.back", 83, "key.categories.movement");
   public final eql A = new eql("key.right", 68, "key.categories.movement");
   public final eql B = new eql("key.jump", 32, "key.categories.movement");
   public final eql C = new erb("key.sneak", 340, "key.categories.movement", this.bD::c);
   public final eql D = new erb("key.sprint", 341, "key.categories.movement", this.bE::c);
   public final eql E = new eql("key.inventory", 69, "key.categories.inventory");
   public final eql F = new eql("key.swapOffhand", 70, "key.categories.inventory");
   public final eql G = new eql("key.drop", 81, "key.categories.inventory");
   public final eql H = new eql("key.use", ekc.b.c, 1, "key.categories.gameplay");
   public final eql I = new eql("key.attack", ekc.b.c, 0, "key.categories.gameplay");
   public final eql J = new eql("key.pickItem", ekc.b.c, 2, "key.categories.gameplay");
   public final eql K = new eql("key.chat", 84, "key.categories.multiplayer");
   public final eql L = new eql("key.playerlist", 258, "key.categories.multiplayer");
   public final eql M = new eql("key.command", 47, "key.categories.multiplayer");
   public final eql N = new eql("key.socialInteractions", 80, "key.categories.multiplayer");
   public final eql O = new eql("key.screenshot", 291, "key.categories.misc");
   public final eql P = new eql("key.togglePerspective", 294, "key.categories.misc");
   public final eql Q = new eql("key.smoothCamera", ekc.bv.b(), "key.categories.misc");
   public final eql R = new eql("key.fullscreen", 300, "key.categories.misc");
   public final eql S = new eql("key.spectatorOutlines", ekc.bv.b(), "key.categories.misc");
   public final eql T = new eql("key.advancements", 76, "key.categories.misc");
   public final eql[] U = new eql[]{
      new eql("key.hotbar.1", 49, "key.categories.inventory"),
      new eql("key.hotbar.2", 50, "key.categories.inventory"),
      new eql("key.hotbar.3", 51, "key.categories.inventory"),
      new eql("key.hotbar.4", 52, "key.categories.inventory"),
      new eql("key.hotbar.5", 53, "key.categories.inventory"),
      new eql("key.hotbar.6", 54, "key.categories.inventory"),
      new eql("key.hotbar.7", 55, "key.categories.inventory"),
      new eql("key.hotbar.8", 56, "key.categories.inventory"),
      new eql("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final eql V = new eql("key.saveToolbarActivator", 67, "key.categories.creative");
   public final eql W = new eql("key.loadToolbarActivator", 88, "key.categories.creative");
   public final eql[] X = (eql[])ArrayUtils.addAll(
      new eql[]{
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
   protected eqn Y;
   private final File bK;
   public boolean Z;
   private epz bL = epz.a;
   public boolean aa;
   public boolean ab;
   public boolean ac;
   public String ad = "";
   public boolean ae;
   private final eqq<Integer> bM = new eqq<>("options.fov", eqq.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, te.c("options.fov.min"));
         case 110 -> a($$0x, te.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new eqq.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> eqn.N().f.r());
   private static final te bN = te.a("options.telemetry.button.tooltip", te.c("options.telemetry.state.minimal"), te.c("options.telemetry.state.all"));
   private final eqq<Boolean> bO = eqq.a("options.telemetry.button", eqq.a(bN), ($$0x, $$1x) -> {
      eqn $$2x = eqn.N();
      if (!$$2x.B()) {
         return te.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.A() ? te.c("options.telemetry.state.all") : te.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final te bP = te.c("options.screenEffectScale.tooltip");
   private final eqq<Double> bQ = new eqq<>(
      "options.screenEffectScale", eqq.a(bP), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, td.c) : a($$0x, $$1x.doubleValue()), eqq.m.a, 1.0, $$0x -> {
      }
   );
   private static final te bR = te.c("options.fovEffectScale.tooltip");
   private final eqq<Double> bS = new eqq<>(
      "options.fovEffectScale",
      eqq.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, td.c) : a($$0x, $$1x.doubleValue()),
      eqq.m.a.a(aro::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final te bT = te.c("options.darknessEffectScale.tooltip");
   private final eqq<Double> bU = new eqq<>(
      "options.darknessEffectScale",
      eqq.a(bT),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, td.c) : a($$0x, $$1x.doubleValue()),
      eqq.m.a.a(aro::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final te bV = te.c("options.glintSpeed.tooltip");
   private final eqq<Double> bW = new eqq<>(
      "options.glintSpeed", eqq.a(bV), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, td.c) : a($$0x, $$1x.doubleValue()), eqq.m.a, 0.5, $$0x -> {
      }
   );
   private static final te bX = te.c("options.glintStrength.tooltip");
   private final eqq<Double> bY = new eqq<>(
      "options.glintStrength",
      eqq.a(bX),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, td.c) : a($$0x, $$1x.doubleValue()),
      eqq.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final te bZ = te.c("options.damageTiltStrength.tooltip");
   private final eqq<Double> ca = new eqq<>(
      "options.damageTiltStrength", eqq.a(bZ), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, td.c) : a($$0x, $$1x.doubleValue()), eqq.m.a, 1.0, $$0x -> {
      }
   );
   private final eqq<Double> cb = new eqq<>("options.gamma", eqq.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, te.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, te.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, te.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, eqq.m.a, 0.5, $$0x -> {
   });
   public static final int af = 0;
   private static final int cc = 2147483646;
   private final eqq<Integer> cd = new eqq<>(
      "options.guiScale", eqq.a(), ($$0x, $$1x) -> $$1x == 0 ? te.c("options.guiScale.auto") : te.b(Integer.toString($$1x)), new eqq.c(0, () -> {
         eqn $$0x = eqn.N();
         return !$$0x.q() ? 2147483646 : $$0x.aM().a(0, $$0x.i());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final eqq<eqs> ce = new eqq<>(
      "options.particles", eqq.a(), eqq.b(), new eqq.e<>(Arrays.asList(eqs.values()), Codec.INT.xmap(eqs::a, eqs::a)), eqs.a, $$0x -> {
      }
   );
   private final eqq<eqp> cf = new eqq<>(
      "options.narrator",
      eqq.a(),
      ($$0x, $$1x) -> (te)(this.Y.aU().a() ? $$1x.b() : te.c("options.narrator.notavailable")),
      new eqq.e<>(Arrays.asList(eqp.values()), Codec.INT.xmap(eqp::a, eqp::a)),
      eqp.a,
      $$0x -> this.Y.aU().a($$0x)
   );
   public String ag = "en_us";
   private final eqq<String> cg = new eqq<>(
      "options.audioDevice",
      eqq.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return te.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? te.b($$1x.substring(gcp.c)) : te.b($$1x);
         }
      },
      new eqq.h<>(
         () -> Stream.concat(Stream.of(""), eqn.N().ah().a().stream()).toList(),
         $$0x -> eqn.N().q() && $$0x != "" && !eqn.N().ah().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gcs $$1x = eqn.N().ah();
         $$1x.i();
         $$1x.a(gbj.a(aou.yp, 1.0F));
      }
   );
   public boolean ah = true;
   public boolean ai;

   public eqq<Boolean> a() {
      return this.ap;
   }

   public eqq<Boolean> b() {
      return this.ar;
   }

   public eqq<Double> c() {
      return this.as;
   }

   public eqq<Integer> d() {
      return this.at;
   }

   public eqq<Integer> e() {
      return this.au;
   }

   public eqq<Double> f() {
      return this.aw;
   }

   public eqq<Integer> g() {
      return this.ax;
   }

   public eqq<eqb> h() {
      return this.ay;
   }

   public eqq<eqg> i() {
      return this.aC;
   }

   public eqq<Boolean> j() {
      return this.aD;
   }

   public eqq<equ> k() {
      return this.aH;
   }

   public void a(amv $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (ams $$2 : $$0.f()) {
         if (!$$2.h()) {
            this.i.add($$2.f());
            if (!$$2.c().a()) {
               this.j.add($$2.f());
            }
         }
      }

      this.aq();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.Y.j();
      }
   }

   public eqq<cbj> l() {
      return this.aI;
   }

   public eqq<Double> m() {
      return this.aJ;
   }

   public eqq<Double> n() {
      return this.aK;
   }

   public eqq<Double> o() {
      return this.aL;
   }

   public eqq<Double> p() {
      return this.aM;
   }

   public eqq<Boolean> q() {
      return this.aO;
   }

   public eqq<biq> r() {
      return this.aQ;
   }

   public eqq<Double> s() {
      return this.aR;
   }

   public eqq<Double> t() {
      return this.aS;
   }

   public eqq<Double> u() {
      return this.aT;
   }

   public eqq<Double> v() {
      return this.aU;
   }

   public eqq<Double> w() {
      return this.aV;
   }

   public eqq<Double> x() {
      return this.aX;
   }

   public eqq<Integer> y() {
      return this.aY;
   }

   public eqq<epx> z() {
      return this.aZ;
   }

   public eqq<Integer> A() {
      return this.ba;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return aro.a(Math.log10($$0) * 100.0);
   }

   public eqq<Double> B() {
      return this.bb;
   }

   public eqq<Boolean> C() {
      return this.bc;
   }

   public eqq<Boolean> D() {
      return this.bd;
   }

   public eqq<Boolean> E() {
      return this.be;
   }

   public eqq<Boolean> F() {
      return this.bf;
   }

   public eqq<Boolean> G() {
      return this.bg;
   }

   public eqq<Boolean> H() {
      return this.bh;
   }

   public eqq<Boolean> I() {
      return this.bi;
   }

   public eqq<Boolean> J() {
      return this.bj;
   }

   public eqq<Boolean> K() {
      return this.bk;
   }

   public eqq<Boolean> L() {
      return this.bl;
   }

   public eqq<Boolean> M() {
      return this.bm;
   }

   public eqq<Boolean> N() {
      return this.bn;
   }

   public eqq<Boolean> O() {
      return this.bo;
   }

   public eqq<Boolean> P() {
      return this.bq;
   }

   public eqq<Boolean> Q() {
      return this.br;
   }

   public final float a(aov $$0) {
      return this.b($$0).c().floatValue();
   }

   public final eqq<Double> b(aov $$0) {
      return Objects.requireNonNull(this.bs.get($$0));
   }

   private eqq<Double> a(String $$0, aov $$1) {
      return new eqq<>(
         $$0, eqq.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, td.c) : a($$0x, $$1x.doubleValue()), eqq.m.a, 1.0, $$1x -> eqn.N().ah().a($$1, $$1x.floatValue())
      );
   }

   public eqq<Boolean> R() {
      return this.bt;
   }

   public eqq<Boolean> S() {
      return this.bw;
   }

   public eqq<Boolean> T() {
      return this.bx;
   }

   public eqq<Boolean> U() {
      return this.by;
   }

   public eqq<Boolean> V() {
      return this.bz;
   }

   public eqq<Boolean> W() {
      return this.bA;
   }

   public eqq<Boolean> X() {
      return this.bD;
   }

   public eqq<Boolean> Y() {
      return this.bE;
   }

   public eqq<Boolean> Z() {
      return this.bG;
   }

   public eqq<Boolean> aa() {
      return this.bH;
   }

   public eqq<Boolean> ab() {
      return this.bJ;
   }

   public eqq<Integer> ac() {
      return this.bM;
   }

   public eqq<Boolean> ad() {
      return this.bO;
   }

   public eqq<Double> ae() {
      return this.bQ;
   }

   public eqq<Double> af() {
      return this.bS;
   }

   public eqq<Double> ag() {
      return this.bU;
   }

   public eqq<Double> ah() {
      return this.bW;
   }

   public eqq<Double> ai() {
      return this.bY;
   }

   public eqq<Double> aj() {
      return this.ca;
   }

   public eqq<Double> ak() {
      return this.cb;
   }

   public eqq<Integer> al() {
      return this.cd;
   }

   public eqq<eqs> am() {
      return this.ce;
   }

   public eqq<eqp> an() {
      return this.cf;
   }

   public eqq<String> ao() {
      return this.cg;
   }

   public eqr(eqn $$0, File $$1) {
      this.Y = $$0;
      this.bK = new File($$1, "options.txt");
      boolean $$2 = $$0.ae();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.at = new eqq<>(
         "options.renderDistance",
         eqq.a(),
         ($$0x, $$1x) -> a($$0x, te.a("options.chunks", $$1x)),
         new eqq.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> eqn.N().f.r()
      );
      this.au = new eqq<>(
         "options.simulationDistance", eqq.a(), ($$0x, $$1x) -> a($$0x, te.a("options.chunks", $$1x)), new eqq.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
         }
      );
      this.ai = ac.i() == ac.b.c;
      this.ap();
   }

   public float a(float $$0) {
      return this.bx.c() ? $$0 : this.o().c().floatValue();
   }

   public int b(float $$0) {
      return (int)(this.a($$0) * 255.0F) << 24 & 0xFF000000;
   }

   public int a(int $$0) {
      return this.bx.c() ? $$0 : (int)(this.aL.c() * 255.0) << 24 & 0xFF000000;
   }

   public void a(eql $$0, ekc.a $$1) {
      $$0.b($$1);
      this.aq();
   }

   private void a(eqr.a $$0) {
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
      $$0.a("darkMojangStudiosBackground", this.ap);
      $$0.a("hideLightningFlashes", this.ar);
      $$0.a("mouseSensitivity", this.as);
      $$0.a("fov", this.bM);
      $$0.a("screenEffectScale", this.bQ);
      $$0.a("fovEffectScale", this.bS);
      $$0.a("darknessEffectScale", this.bU);
      $$0.a("glintSpeed", this.bW);
      $$0.a("glintStrength", this.bY);
      $$0.a("damageTiltStrength", this.ca);
      $$0.a("highContrast", this.aO);
      $$0.a("gamma", this.cb);
      $$0.a("renderDistance", this.at);
      $$0.a("simulationDistance", this.au);
      $$0.a("entityDistanceScaling", this.aw);
      $$0.a("guiScale", this.cd);
      $$0.a("particles", this.ce);
      $$0.a("maxFps", this.ax);
      $$0.a("graphicsMode", this.aC);
      $$0.a("ao", this.aD);
      $$0.a("prioritizeChunkUpdates", this.aH);
      $$0.a("biomeBlendRadius", this.ba);
      $$0.a("renderClouds", this.ay);
      this.i = $$0.a("resourcePacks", this.i, eqr::c, ak::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, eqr::c, ak::toJson);
      this.ad = $$0.a("lastServer", this.ad);
      this.ag = $$0.a("lang", this.ag);
      $$0.a("soundDevice", this.cg);
      $$0.a("chatVisibility", this.aI);
      $$0.a("chatOpacity", this.aJ);
      $$0.a("chatLineSpacing", this.aK);
      $$0.a("textBackgroundOpacity", this.aL);
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
      this.r = $$0.a("tutorialStep", this.r, gdx::a, gdx::a);
      $$0.a("mouseWheelSensitivity", this.bb);
      $$0.a("rawMouseInput", this.bc);
      this.u = $$0.a("glDebugVerbosity", this.u);
      this.v = $$0.a("skipMultiplayerWarning", this.v);
      this.w = $$0.a("skipRealms32bitWarning", this.w);
      $$0.a("hideMatchedNames", this.bG);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.t = $$0.a("hideBundleTutorial", this.t);
      this.ai = $$0.a("syncChunkWrites", this.ai);
      $$0.a("showAutosaveIndicator", this.bH);
      $$0.a("allowServerListing", this.bq);
      $$0.a("onlyShowSecureChat", this.bJ);
      $$0.a("panoramaScrollSpeed", this.aM);
      $$0.a("telemetryOptInExtra", this.bO);
      this.ah = $$0.a("onboardAccessibility", this.ah);

      for (eql $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(ekc.a($$3));
         }
      }

      for (aov $$4 : aov.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bs.get($$4));
      }

      for (cbm $$5 : cbm.values()) {
         boolean $$6 = this.aP.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.b($$5, $$7);
         }
      }
   }

   public void ap() {
      try {
         if (!this.bK.exists()) {
            return;
         }

         qs $$0 = new qs();

         try (BufferedReader $$1 = Files.newReader(this.bK, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = am.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  aj.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final qs $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aC.a(eqg.b);
            } else {
               this.aC.a(eqg.a);
            }
         }

         this.a(new eqr.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, eqq<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> eqr.aj.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     eqr.aj.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? eqr.a($$2) : $$1;
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
               } else if (eqr.a($$2)) {
                  return 1.0F;
               } else if (eqr.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     eqr.aj.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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
            this.Y.aM().a(this.ax.c());
         }

         eql.d();
      } catch (Exception var7) {
         aj.error("Failed to load options", var7);
      }
   }

   static boolean a(String $$0) {
      return "true".equals($$0);
   }

   static boolean b(String $$0) {
      return "false".equals($$0);
   }

   private qs a(qs $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return asq.e.a(this.Y.ar(), $$0, $$1);
   }

   public void aq() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bK), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new eqr.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, eqq<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> eqr.aj.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(eqr.ak.toJson($$2x));
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
         aj.error("Failed to save options", var6);
      }

      this.ar();
   }

   public void ar() {
      if (this.Y.t != null) {
         int $$0 = 0;

         for (cbm $$1 : this.aP) {
            $$0 |= $$1.a();
         }

         this.Y.t.cl.b(new abg(this.ag, this.at.c(), this.aI.c(), this.bg.c(), $$0, this.aQ.c(), this.Y.aP(), this.bq.c()));
      }
   }

   private void b(cbm $$0, boolean $$1) {
      if ($$1) {
         this.aP.add($$0);
      } else {
         this.aP.remove($$0);
      }
   }

   public boolean a(cbm $$0) {
      return this.aP.contains($$0);
   }

   public void a(cbm $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ar();
   }

   public eqb as() {
      return this.ax() >= 4 ? this.ay.c() : eqb.a;
   }

   public boolean at() {
      return this.q;
   }

   public void b(amv $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         ams $$4 = $$0.c($$3);
         if ($$4 == null && !$$3.startsWith("file/")) {
            $$4 = $$0.c("file/" + $$3);
         }

         if ($$4 == null) {
            aj.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", $$3);
            $$2.remove();
         } else if (!$$4.c().a() && !this.j.contains($$3)) {
            aj.warn("Removed resource pack {} from options because it is no longer compatible", $$3);
            $$2.remove();
         } else if ($$4.c().a() && this.j.contains($$3)) {
            aj.info("Removed resource pack {} from incompatibility list because it's now compatible", $$3);
            this.j.remove($$3);
         } else {
            $$1.add($$4.f());
         }
      }

      $$0.a($$1);
   }

   public epz au() {
      return this.bL;
   }

   public void a(epz $$0) {
      this.bL = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = arf.a(ak, $$0, al);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File av() {
      return this.bK;
   }

   public String aw() {
      Stream<Pair<String, Object>> $$0 = Stream.<Pair<String, Object>>builder()
         .add(Pair.of("ao", this.aD.c()))
         .add(Pair.of("biomeBlendRadius", this.ba.c()))
         .add(Pair.of("enableVsync", this.bj.c()))
         .add(Pair.of("entityDistanceScaling", this.aw.c()))
         .add(Pair.of("entityShadows", this.bk.c()))
         .add(Pair.of("forceUnicodeFont", this.bl.c()))
         .add(Pair.of("fov", this.bM.c()))
         .add(Pair.of("fovEffectScale", this.bS.c()))
         .add(Pair.of("darknessEffectScale", this.bU.c()))
         .add(Pair.of("glintSpeed", this.bW.c()))
         .add(Pair.of("glintStrength", this.bY.c()))
         .add(Pair.of("prioritizeChunkUpdates", this.aH.c()))
         .add(Pair.of("fullscreen", this.bz.c()))
         .add(Pair.of("fullscreenResolution", String.valueOf(this.k)))
         .add(Pair.of("gamma", this.cb.c()))
         .add(Pair.of("glDebugVerbosity", this.u))
         .add(Pair.of("graphicsMode", this.aC.c()))
         .add(Pair.of("guiScale", this.cd.c()))
         .add(Pair.of("maxFps", this.ax.c()))
         .add(Pair.of("mipmapLevels", this.aY.c()))
         .add(Pair.of("narrator", this.cf.c()))
         .add(Pair.of("overrideHeight", this.p))
         .add(Pair.of("overrideWidth", this.o))
         .add(Pair.of("particles", this.ce.c()))
         .add(Pair.of("reducedDebugInfo", this.br.c()))
         .add(Pair.of("renderClouds", this.ay.c()))
         .add(Pair.of("renderDistance", this.at.c()))
         .add(Pair.of("simulationDistance", this.au.c()))
         .add(Pair.of("resourcePacks", this.i))
         .add(Pair.of("screenEffectScale", this.bQ.c()))
         .add(Pair.of("syncChunkWrites", this.ai))
         .add(Pair.of("useNativeTransport", this.q))
         .add(Pair.of("soundDevice", this.cg.c()))
         .build();
      return $$0.<CharSequence>map($$0x -> (String)$$0x.getFirst() + ": " + $$0x.getSecond()).collect(Collectors.joining(System.lineSeparator()));
   }

   public void b(int $$0) {
      this.av = $$0;
   }

   public int ax() {
      return this.av > 0 ? Math.min(this.at.c(), this.av) : this.at.c();
   }

   private static te b(te $$0, int $$1) {
      return te.a("options.pixel_value", $$0, $$1);
   }

   private static te a(te $$0, double $$1) {
      return te.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static te a(te $$0, te $$1) {
      return te.a("options.generic_value", $$0, $$1);
   }

   public static te a(te $$0, int $$1) {
      return a($$0, te.b(Integer.toString($$1)));
   }

   interface a {
      <T> void a(String var1, eqq<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
