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

public class eqq {
   static final Logger ak = LogUtils.getLogger();
   static final Gson al = new Gson();
   private static final TypeToken<List<String>> am = new TypeToken<List<String>>() {
   };
   public static final int a = 2;
   public static final int b = 4;
   public static final int c = 8;
   public static final int d = 12;
   public static final int e = 16;
   public static final int f = 32;
   private static final Splitter an = Splitter.on(':').limit(2);
   private static final float ao = 1.0F;
   public static final String g = "";
   private static final tf ap = tf.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final eqp<Boolean> aq = eqp.a("options.darkMojangStudiosBackgroundColor", eqp.a(ap), false);
   private static final tf ar = tf.c("options.hideLightningFlashes.tooltip");
   private final eqp<Boolean> as = eqp.a("options.hideLightningFlashes", eqp.a(ar), false);
   private final eqp<Double> at = new eqp<>("options.sensitivity", eqp.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, tf.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, tf.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, eqp.m.a, 0.5, $$0x -> {
   });
   private final eqp<Integer> au;
   private final eqp<Integer> av;
   private int aw = 0;
   private final eqp<Double> ax = new eqp<>(
      "options.entityDistanceScaling",
      eqp.a(),
      eqq::a,
      new eqp.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final eqp<Integer> ay = new eqp<>(
      "options.framerateLimit",
      eqp.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, tf.c("options.framerateLimit.max")) : a($$0x, tf.a("options.framerate", $$1x)),
      new eqp.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> eqm.O().aN().a($$0x)
   );
   private final eqp<eqa> az = new eqp<>(
      "options.renderClouds",
      eqp.a(),
      eqp.b(),
      new eqp.e<>(Arrays.asList(eqa.values()), aqy.a(eqa.d, Codec.BOOL, $$0x -> $$0x ? eqa.c : eqa.a)),
      eqa.c,
      $$0x -> {
         if (eqm.M()) {
            ejs $$1x = eqm.O().f.x();
            if ($$1x != null) {
               $$1x.b(eqm.a);
            }
         }
      }
   );
   private static final tf aA = tf.c("options.graphics.fast.tooltip");
   private static final tf aB = tf.a("options.graphics.fabulous.tooltip", tf.c("options.graphics.fabulous").a(n.u));
   private static final tf aC = tf.c("options.graphics.fancy.tooltip");
   private final eqp<eqf> aD = new eqp<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> etq.a(aC);
            case a -> etq.a(aA);
            case c -> etq.a(aB);
         };
      },
      ($$0x, $$1x) -> {
         ts $$2x = tf.c($$1x.b());
         return $$1x == eqf.c ? $$2x.a(n.u) : $$2x;
      },
      new eqp.a<>(
         Arrays.asList(eqf.values()),
         Stream.of(eqf.values()).filter($$0x -> $$0x != eqf.c).collect(Collectors.toList()),
         () -> eqm.O().r() && eqm.O().ah().h(),
         ($$0x, $$1x) -> {
            eqm $$2x = eqm.O();
            fnf $$3x = $$2x.ah();
            if ($$1x == eqf.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(eqf::a, eqf::a)
      ),
      eqf.b,
      $$0x -> {
      }
   );
   private final eqp<Boolean> aE = eqp.a("options.ao", true, $$0x -> eqm.O().f.f());
   private static final tf aF = tf.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final tf aG = tf.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final tf aH = tf.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final eqp<eqt> aI = new eqp<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> etq.a(aF);
         case b -> etq.a(aG);
         case c -> etq.a(aH);
      };
   }, eqp.b(), new eqp.e<>(Arrays.asList(eqt.values()), Codec.INT.xmap(eqt::a, eqt::a)), eqt.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final eqp<cbl> aJ = new eqp<>(
      "options.chat.visibility", eqp.a(), eqp.b(), new eqp.e<>(Arrays.asList(cbl.values()), Codec.INT.xmap(cbl::a, cbl::a)), cbl.a, $$0x -> {
      }
   );
   private final eqp<Double> aK = new eqp<>("options.chat.opacity", eqp.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), eqp.m.a, 1.0, $$0x -> eqm.O().l.d().b());
   private final eqp<Double> aL = new eqp<>("options.chat.line_spacing", eqp.a(), eqq::a, eqp.m.a, 0.0, $$0x -> {
   });
   private final eqp<Double> aM = new eqp<>("options.accessibility.text_background_opacity", eqp.a(), eqq::a, eqp.m.a, 0.5, $$0x -> eqm.O().l.d().b());
   private final eqp<Double> aN = new eqp<>("options.accessibility.panorama_speed", eqp.a(), eqq::a, eqp.m.a, 1.0, $$0x -> {
   });
   private static final tf aO = tf.c("options.accessibility.high_contrast.tooltip");
   private final eqp<Boolean> aP = eqp.a("options.accessibility.high_contrast", eqp.a(aO), false, $$0x -> {
      amx $$1x = eqm.O().aa();
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
   private final Set<cbo> aQ = EnumSet.allOf(cbo.class);
   private final eqp<bis> aR = new eqp<>("options.mainHand", eqp.a(), eqp.b(), new eqp.e<>(Arrays.asList(bis.values()), bis.c), bis.b, $$0x -> this.ar());
   public int o;
   public int p;
   private final eqp<Double> aS = new eqp<>(
      "options.chat.scale",
      eqp.a(),
      ($$0x, $$1x) -> (tf)($$1x == 0.0 ? te.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      eqp.m.a,
      1.0,
      $$0x -> eqm.O().l.d().b()
   );
   private final eqp<Double> aT = new eqp<>("options.chat.width", eqp.a(), ($$0x, $$1x) -> b($$0x, esi.a($$1x)), eqp.m.a, 1.0, $$0x -> eqm.O().l.d().b());
   private final eqp<Double> aU = new eqp<>(
      "options.chat.height.unfocused", eqp.a(), ($$0x, $$1x) -> b($$0x, esi.b($$1x)), eqp.m.a, esi.h(), $$0x -> eqm.O().l.d().b()
   );
   private final eqp<Double> aV = new eqp<>(
      "options.chat.height.focused", eqp.a(), ($$0x, $$1x) -> b($$0x, esi.b($$1x)), eqp.m.a, 1.0, $$0x -> eqm.O().l.d().b()
   );
   private final eqp<Double> aW = new eqp<>(
      "options.chat.delay_instant",
      eqp.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? tf.c("options.chat.delay_none") : tf.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new eqp.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> eqm.O().aW().a($$0x)
   );
   private static final tf aX = tf.c("options.notifications.display_time.tooltip");
   private final eqp<Double> aY = new eqp<>(
      "options.notifications.display_time",
      eqp.a(aX),
      ($$0x, $$1x) -> a($$0x, tf.a("options.multiplier", $$1x)),
      new eqp.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final eqp<Integer> aZ = new eqp<>(
      "options.mipmapLevels", eqp.a(), ($$0x, $$1x) -> (tf)($$1x == 0 ? te.a($$0x, false) : a($$0x, $$1x.intValue())), new eqp.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final eqp<epw> ba = new eqp<>(
      "options.attackIndicator", eqp.a(), eqp.b(), new eqp.e<>(Arrays.asList(epw.values()), Codec.INT.xmap(epw::a, epw::a)), epw.b, $$0x -> {
      }
   );
   public gec r = gec.a;
   public boolean s = false;
   public boolean t = false;
   private final eqp<Integer> bb = new eqp<>("options.biomeBlendRadius", eqp.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, tf.c("options.biomeBlendRadius." + $$2x));
   }, new eqp.f(0, 7), 2, $$0x -> eqm.O().f.f());
   private final eqp<Double> bc = new eqp<>(
      "options.mouseWheelSensitivity",
      eqp.a(),
      ($$0x, $$1x) -> a($$0x, tf.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new eqp.f(-200, 100).a(eqq::c, eqq::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final eqp<Boolean> bd = eqp.a("options.rawMouseInput", true, $$0x -> {
      ekk $$1x = eqm.O().aN();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final eqp<Boolean> be = eqp.a("options.autoJump", false);
   private final eqp<Boolean> bf = eqp.a("options.operatorItemsTab", false);
   private final eqp<Boolean> bg = eqp.a("options.autoSuggestCommands", true);
   private final eqp<Boolean> bh = eqp.a("options.chat.color", true);
   private final eqp<Boolean> bi = eqp.a("options.chat.links", true);
   private final eqp<Boolean> bj = eqp.a("options.chat.links.prompt", true);
   private final eqp<Boolean> bk = eqp.a("options.vsync", true, $$0x -> {
      if (eqm.O().aN() != null) {
         eqm.O().aN().a($$0x);
      }
   });
   private final eqp<Boolean> bl = eqp.a("options.entityShadows", true);
   private final eqp<Boolean> bm = eqp.a("options.forceUnicodeFont", false, $$0x -> {
      eqm $$1x = eqm.O();
      if ($$1x.aN() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final eqp<Boolean> bn = eqp.a("options.invertMouse", false);
   private final eqp<Boolean> bo = eqp.a("options.discrete_mouse_scroll", false);
   private final eqp<Boolean> bp = eqp.a("options.realmsNotifications", true);
   private static final tf bq = tf.c("options.allowServerListing.tooltip");
   private final eqp<Boolean> br = eqp.a("options.allowServerListing", eqp.a(bq), true, $$0x -> this.ar());
   private final eqp<Boolean> bs = eqp.a("options.reducedDebugInfo", false);
   private final Map<aox, eqp<Double>> bt = ac.a(new EnumMap<>(aox.class), $$0x -> {
      for (aox $$1x : aox.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final eqp<Boolean> bu = eqp.a("options.showSubtitles", false);
   private static final tf bv = tf.c("options.directionalAudio.on.tooltip");
   private static final tf bw = tf.c("options.directionalAudio.off.tooltip");
   private final eqp<Boolean> bx = eqp.a("options.directionalAudio", $$0x -> $$0x ? etq.a(bv) : etq.a(bw), false, $$0x -> {
      gcx $$1x = eqm.O().ai();
      $$1x.i();
      $$1x.a(gbo.a(aow.yp, 1.0F));
   });
   private final eqp<Boolean> by = new eqp<>(
      "options.accessibility.text_background",
      eqp.a(),
      ($$0x, $$1x) -> $$1x ? tf.c("options.accessibility.text_background.chat") : tf.c("options.accessibility.text_background.everywhere"),
      eqp.a,
      true,
      $$0x -> {
      }
   );
   private final eqp<Boolean> bz = eqp.a("options.touchscreen", false);
   private final eqp<Boolean> bA = eqp.a("options.fullscreen", false, $$0x -> {
      eqm $$1x = eqm.O();
      if ($$1x.aN() != null && $$1x.aN().j() != $$0x) {
         $$1x.aN().h();
         this.V().a($$1x.aN().j());
      }
   });
   private final eqp<Boolean> bB = eqp.a("options.viewBobbing", true);
   private static final tf bC = tf.c("options.key.toggle");
   private static final tf bD = tf.c("options.key.hold");
   private final eqp<Boolean> bE = new eqp<>("key.sneak", eqp.a(), ($$0x, $$1x) -> $$1x ? bC : bD, eqp.a, false, $$0x -> {
   });
   private final eqp<Boolean> bF = new eqp<>("key.sprint", eqp.a(), ($$0x, $$1x) -> $$1x ? bC : bD, eqp.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final tf bG = tf.c("options.hideMatchedNames.tooltip");
   private final eqp<Boolean> bH = eqp.a("options.hideMatchedNames", eqp.a(bG), true);
   private final eqp<Boolean> bI = eqp.a("options.autosaveIndicator", true);
   private static final tf bJ = tf.c("options.onlyShowSecureChat.tooltip");
   private final eqp<Boolean> bK = eqp.a("options.onlyShowSecureChat", eqp.a(bJ), false);
   public final eqk x = new eqk("key.forward", 87, "key.categories.movement");
   public final eqk y = new eqk("key.left", 65, "key.categories.movement");
   public final eqk z = new eqk("key.back", 83, "key.categories.movement");
   public final eqk A = new eqk("key.right", 68, "key.categories.movement");
   public final eqk B = new eqk("key.jump", 32, "key.categories.movement");
   public final eqk C = new era("key.sneak", 340, "key.categories.movement", this.bE::c);
   public final eqk D = new era("key.sprint", 341, "key.categories.movement", this.bF::c);
   public final eqk E = new eqk("key.inventory", 69, "key.categories.inventory");
   public final eqk F = new eqk("key.swapOffhand", 70, "key.categories.inventory");
   public final eqk G = new eqk("key.drop", 81, "key.categories.inventory");
   public final eqk H = new eqk("key.use", ekb.b.c, 1, "key.categories.gameplay");
   public final eqk I = new eqk("key.attack", ekb.b.c, 0, "key.categories.gameplay");
   public final eqk J = new eqk("key.pickItem", ekb.b.c, 2, "key.categories.gameplay");
   public final eqk K = new eqk("key.chat", 84, "key.categories.multiplayer");
   public final eqk L = new eqk("key.playerlist", 258, "key.categories.multiplayer");
   public final eqk M = new eqk("key.command", 47, "key.categories.multiplayer");
   public final eqk N = new eqk("key.socialInteractions", 80, "key.categories.multiplayer");
   public final eqk O = new eqk("key.screenshot", 291, "key.categories.misc");
   public final eqk P = new eqk("key.togglePerspective", 294, "key.categories.misc");
   public final eqk Q = new eqk("key.smoothCamera", ekb.bv.b(), "key.categories.misc");
   public final eqk R = new eqk("key.fullscreen", 300, "key.categories.misc");
   public final eqk S = new eqk("key.spectatorOutlines", ekb.bv.b(), "key.categories.misc");
   public final eqk T = new eqk("key.advancements", 76, "key.categories.misc");
   public final eqk[] U = new eqk[]{
      new eqk("key.hotbar.1", 49, "key.categories.inventory"),
      new eqk("key.hotbar.2", 50, "key.categories.inventory"),
      new eqk("key.hotbar.3", 51, "key.categories.inventory"),
      new eqk("key.hotbar.4", 52, "key.categories.inventory"),
      new eqk("key.hotbar.5", 53, "key.categories.inventory"),
      new eqk("key.hotbar.6", 54, "key.categories.inventory"),
      new eqk("key.hotbar.7", 55, "key.categories.inventory"),
      new eqk("key.hotbar.8", 56, "key.categories.inventory"),
      new eqk("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final eqk V = new eqk("key.saveToolbarActivator", 67, "key.categories.creative");
   public final eqk W = new eqk("key.loadToolbarActivator", 88, "key.categories.creative");
   public final eqk[] X = (eqk[])ArrayUtils.addAll(
      new eqk[]{
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
   protected eqm Y;
   private final File bL;
   public boolean Z;
   private epy bM = epy.a;
   public boolean aa;
   public boolean ab;
   public boolean ac;
   public boolean ad;
   public String ae = "";
   public boolean af;
   private final eqp<Integer> bN = new eqp<>("options.fov", eqp.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, tf.c("options.fov.min"));
         case 110 -> a($$0x, tf.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new eqp.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> eqm.O().f.r());
   private static final tf bO = tf.a("options.telemetry.button.tooltip", tf.c("options.telemetry.state.minimal"), tf.c("options.telemetry.state.all"));
   private final eqp<Boolean> bP = eqp.a("options.telemetry.button", eqp.a(bO), ($$0x, $$1x) -> {
      eqm $$2x = eqm.O();
      if (!$$2x.C()) {
         return tf.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.B() ? tf.c("options.telemetry.state.all") : tf.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final tf bQ = tf.c("options.screenEffectScale.tooltip");
   private final eqp<Double> bR = new eqp<>(
      "options.screenEffectScale", eqp.a(bQ), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, te.c) : a($$0x, $$1x.doubleValue()), eqp.m.a, 1.0, $$0x -> {
      }
   );
   private static final tf bS = tf.c("options.fovEffectScale.tooltip");
   private final eqp<Double> bT = new eqp<>(
      "options.fovEffectScale",
      eqp.a(bS),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, te.c) : a($$0x, $$1x.doubleValue()),
      eqp.m.a.a(arp::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final tf bU = tf.c("options.darknessEffectScale.tooltip");
   private final eqp<Double> bV = new eqp<>(
      "options.darknessEffectScale",
      eqp.a(bU),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, te.c) : a($$0x, $$1x.doubleValue()),
      eqp.m.a.a(arp::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final tf bW = tf.c("options.glintSpeed.tooltip");
   private final eqp<Double> bX = new eqp<>(
      "options.glintSpeed", eqp.a(bW), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, te.c) : a($$0x, $$1x.doubleValue()), eqp.m.a, 0.5, $$0x -> {
      }
   );
   private static final tf bY = tf.c("options.glintStrength.tooltip");
   private final eqp<Double> bZ = new eqp<>(
      "options.glintStrength",
      eqp.a(bY),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, te.c) : a($$0x, $$1x.doubleValue()),
      eqp.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final tf ca = tf.c("options.damageTiltStrength.tooltip");
   private final eqp<Double> cb = new eqp<>(
      "options.damageTiltStrength", eqp.a(ca), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, te.c) : a($$0x, $$1x.doubleValue()), eqp.m.a, 1.0, $$0x -> {
      }
   );
   private final eqp<Double> cc = new eqp<>("options.gamma", eqp.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, tf.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, tf.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, tf.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, eqp.m.a, 0.5, $$0x -> {
   });
   public static final int ag = 0;
   private static final int cd = 2147483646;
   private final eqp<Integer> ce = new eqp<>(
      "options.guiScale", eqp.a(), ($$0x, $$1x) -> $$1x == 0 ? tf.c("options.guiScale.auto") : tf.b(Integer.toString($$1x)), new eqp.c(0, () -> {
         eqm $$0x = eqm.O();
         return !$$0x.r() ? 2147483646 : $$0x.aN().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final eqp<eqr> cf = new eqp<>(
      "options.particles", eqp.a(), eqp.b(), new eqp.e<>(Arrays.asList(eqr.values()), Codec.INT.xmap(eqr::a, eqr::a)), eqr.a, $$0x -> {
      }
   );
   private final eqp<eqo> cg = new eqp<>(
      "options.narrator",
      eqp.a(),
      ($$0x, $$1x) -> (tf)(this.Y.aV().a() ? $$1x.b() : tf.c("options.narrator.notavailable")),
      new eqp.e<>(Arrays.asList(eqo.values()), Codec.INT.xmap(eqo::a, eqo::a)),
      eqo.a,
      $$0x -> this.Y.aV().a($$0x)
   );
   public String ah = "en_us";
   private final eqp<String> ch = new eqp<>(
      "options.audioDevice",
      eqp.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return tf.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? tf.b($$1x.substring(gcu.c)) : tf.b($$1x);
         }
      },
      new eqp.h<>(
         () -> Stream.concat(Stream.of(""), eqm.O().ai().a().stream()).toList(),
         $$0x -> eqm.O().r() && $$0x != "" && !eqm.O().ai().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gcx $$1x = eqm.O().ai();
         $$1x.i();
         $$1x.a(gbo.a(aow.yp, 1.0F));
      }
   );
   public boolean ai = true;
   public boolean aj;

   public eqp<Boolean> a() {
      return this.aq;
   }

   public eqp<Boolean> b() {
      return this.as;
   }

   public eqp<Double> c() {
      return this.at;
   }

   public eqp<Integer> d() {
      return this.au;
   }

   public eqp<Integer> e() {
      return this.av;
   }

   public eqp<Double> f() {
      return this.ax;
   }

   public eqp<Integer> g() {
      return this.ay;
   }

   public eqp<eqa> h() {
      return this.az;
   }

   public eqp<eqf> i() {
      return this.aD;
   }

   public eqp<Boolean> j() {
      return this.aE;
   }

   public eqp<eqt> k() {
      return this.aI;
   }

   public void a(amx $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (amu $$2 : $$0.f()) {
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
         this.Y.k();
      }
   }

   public eqp<cbl> l() {
      return this.aJ;
   }

   public eqp<Double> m() {
      return this.aK;
   }

   public eqp<Double> n() {
      return this.aL;
   }

   public eqp<Double> o() {
      return this.aM;
   }

   public eqp<Double> p() {
      return this.aN;
   }

   public eqp<Boolean> q() {
      return this.aP;
   }

   public eqp<bis> r() {
      return this.aR;
   }

   public eqp<Double> s() {
      return this.aS;
   }

   public eqp<Double> t() {
      return this.aT;
   }

   public eqp<Double> u() {
      return this.aU;
   }

   public eqp<Double> v() {
      return this.aV;
   }

   public eqp<Double> w() {
      return this.aW;
   }

   public eqp<Double> x() {
      return this.aY;
   }

   public eqp<Integer> y() {
      return this.aZ;
   }

   public eqp<epw> z() {
      return this.ba;
   }

   public eqp<Integer> A() {
      return this.bb;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return arp.a(Math.log10($$0) * 100.0);
   }

   public eqp<Double> B() {
      return this.bc;
   }

   public eqp<Boolean> C() {
      return this.bd;
   }

   public eqp<Boolean> D() {
      return this.be;
   }

   public eqp<Boolean> E() {
      return this.bf;
   }

   public eqp<Boolean> F() {
      return this.bg;
   }

   public eqp<Boolean> G() {
      return this.bh;
   }

   public eqp<Boolean> H() {
      return this.bi;
   }

   public eqp<Boolean> I() {
      return this.bj;
   }

   public eqp<Boolean> J() {
      return this.bk;
   }

   public eqp<Boolean> K() {
      return this.bl;
   }

   public eqp<Boolean> L() {
      return this.bm;
   }

   public eqp<Boolean> M() {
      return this.bn;
   }

   public eqp<Boolean> N() {
      return this.bo;
   }

   public eqp<Boolean> O() {
      return this.bp;
   }

   public eqp<Boolean> P() {
      return this.br;
   }

   public eqp<Boolean> Q() {
      return this.bs;
   }

   public final float a(aox $$0) {
      return this.b($$0).c().floatValue();
   }

   public final eqp<Double> b(aox $$0) {
      return Objects.requireNonNull(this.bt.get($$0));
   }

   private eqp<Double> a(String $$0, aox $$1) {
      return new eqp<>(
         $$0, eqp.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, te.c) : a($$0x, $$1x.doubleValue()), eqp.m.a, 1.0, $$1x -> eqm.O().ai().a($$1, $$1x.floatValue())
      );
   }

   public eqp<Boolean> R() {
      return this.bu;
   }

   public eqp<Boolean> S() {
      return this.bx;
   }

   public eqp<Boolean> T() {
      return this.by;
   }

   public eqp<Boolean> U() {
      return this.bz;
   }

   public eqp<Boolean> V() {
      return this.bA;
   }

   public eqp<Boolean> W() {
      return this.bB;
   }

   public eqp<Boolean> X() {
      return this.bE;
   }

   public eqp<Boolean> Y() {
      return this.bF;
   }

   public eqp<Boolean> Z() {
      return this.bH;
   }

   public eqp<Boolean> aa() {
      return this.bI;
   }

   public eqp<Boolean> ab() {
      return this.bK;
   }

   public eqp<Integer> ac() {
      return this.bN;
   }

   public eqp<Boolean> ad() {
      return this.bP;
   }

   public eqp<Double> ae() {
      return this.bR;
   }

   public eqp<Double> af() {
      return this.bT;
   }

   public eqp<Double> ag() {
      return this.bV;
   }

   public eqp<Double> ah() {
      return this.bX;
   }

   public eqp<Double> ai() {
      return this.bZ;
   }

   public eqp<Double> aj() {
      return this.cb;
   }

   public eqp<Double> ak() {
      return this.cc;
   }

   public eqp<Integer> al() {
      return this.ce;
   }

   public eqp<eqr> am() {
      return this.cf;
   }

   public eqp<eqo> an() {
      return this.cg;
   }

   public eqp<String> ao() {
      return this.ch;
   }

   public eqq(eqm $$0, File $$1) {
      this.Y = $$0;
      this.bL = new File($$1, "options.txt");
      boolean $$2 = $$0.af();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.au = new eqp<>(
         "options.renderDistance",
         eqp.a(),
         ($$0x, $$1x) -> a($$0x, tf.a("options.chunks", $$1x)),
         new eqp.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> eqm.O().f.r()
      );
      this.av = new eqp<>(
         "options.simulationDistance", eqp.a(), ($$0x, $$1x) -> a($$0x, tf.a("options.chunks", $$1x)), new eqp.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
         }
      );
      this.aj = ac.i() == ac.b.c;
      this.ap();
   }

   public float a(float $$0) {
      return this.by.c() ? $$0 : this.o().c().floatValue();
   }

   public int b(float $$0) {
      return (int)(this.a($$0) * 255.0F) << 24 & 0xFF000000;
   }

   public int a(int $$0) {
      return this.by.c() ? $$0 : (int)(this.aM.c() * 255.0) << 24 & 0xFF000000;
   }

   public void a(eqk $$0, ekb.a $$1) {
      $$0.b($$1);
      this.aq();
   }

   private void a(eqq.a $$0) {
      $$0.a("autoJump", this.be);
      $$0.a("operatorItemsTab", this.bf);
      $$0.a("autoSuggestions", this.bg);
      $$0.a("chatColors", this.bh);
      $$0.a("chatLinks", this.bi);
      $$0.a("chatLinksPrompt", this.bj);
      $$0.a("enableVsync", this.bk);
      $$0.a("entityShadows", this.bl);
      $$0.a("forceUnicodeFont", this.bm);
      $$0.a("discrete_mouse_scroll", this.bo);
      $$0.a("invertYMouse", this.bn);
      $$0.a("realmsNotifications", this.bp);
      $$0.a("reducedDebugInfo", this.bs);
      $$0.a("showSubtitles", this.bu);
      $$0.a("directionalAudio", this.bx);
      $$0.a("touchscreen", this.bz);
      $$0.a("fullscreen", this.bA);
      $$0.a("bobView", this.bB);
      $$0.a("toggleCrouch", this.bE);
      $$0.a("toggleSprint", this.bF);
      $$0.a("darkMojangStudiosBackground", this.aq);
      $$0.a("hideLightningFlashes", this.as);
      $$0.a("mouseSensitivity", this.at);
      $$0.a("fov", this.bN);
      $$0.a("screenEffectScale", this.bR);
      $$0.a("fovEffectScale", this.bT);
      $$0.a("darknessEffectScale", this.bV);
      $$0.a("glintSpeed", this.bX);
      $$0.a("glintStrength", this.bZ);
      $$0.a("damageTiltStrength", this.cb);
      $$0.a("highContrast", this.aP);
      $$0.a("gamma", this.cc);
      $$0.a("renderDistance", this.au);
      $$0.a("simulationDistance", this.av);
      $$0.a("entityDistanceScaling", this.ax);
      $$0.a("guiScale", this.ce);
      $$0.a("particles", this.cf);
      $$0.a("maxFps", this.ay);
      $$0.a("graphicsMode", this.aD);
      $$0.a("ao", this.aE);
      $$0.a("prioritizeChunkUpdates", this.aI);
      $$0.a("biomeBlendRadius", this.bb);
      $$0.a("renderClouds", this.az);
      this.i = $$0.a("resourcePacks", this.i, eqq::c, al::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, eqq::c, al::toJson);
      this.ae = $$0.a("lastServer", this.ae);
      this.ah = $$0.a("lang", this.ah);
      $$0.a("soundDevice", this.ch);
      $$0.a("chatVisibility", this.aJ);
      $$0.a("chatOpacity", this.aK);
      $$0.a("chatLineSpacing", this.aL);
      $$0.a("textBackgroundOpacity", this.aM);
      $$0.a("backgroundForChatOnly", this.by);
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
      $$0.a("mipmapLevels", this.aZ);
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aR);
      $$0.a("attackIndicator", this.ba);
      $$0.a("narrator", this.cg);
      this.r = $$0.a("tutorialStep", this.r, gec::a, gec::a);
      $$0.a("mouseWheelSensitivity", this.bc);
      $$0.a("rawMouseInput", this.bd);
      this.u = $$0.a("glDebugVerbosity", this.u);
      this.v = $$0.a("skipMultiplayerWarning", this.v);
      this.w = $$0.a("skipRealms32bitWarning", this.w);
      $$0.a("hideMatchedNames", this.bH);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.t = $$0.a("hideBundleTutorial", this.t);
      this.aj = $$0.a("syncChunkWrites", this.aj);
      $$0.a("showAutosaveIndicator", this.bI);
      $$0.a("allowServerListing", this.br);
      $$0.a("onlyShowSecureChat", this.bK);
      $$0.a("panoramaScrollSpeed", this.aN);
      $$0.a("telemetryOptInExtra", this.bP);
      this.ai = $$0.a("onboardAccessibility", this.ai);

      for (eqk $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(ekb.a($$3));
         }
      }

      for (aox $$4 : aox.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bt.get($$4));
      }

      for (cbo $$5 : cbo.values()) {
         boolean $$6 = this.aQ.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.b($$5, $$7);
         }
      }
   }

   public void ap() {
      try {
         if (!this.bL.exists()) {
            return;
         }

         qr $$0 = new qr();

         try (BufferedReader $$1 = Files.newReader(this.bL, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = an.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  ak.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final qr $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aD.a(eqf.b);
            } else {
               this.aD.a(eqf.a);
            }
         }

         this.a(new eqq.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, eqp<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> eqq.ak.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     eqq.ak.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? eqq.a($$2) : $$1;
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
               } else if (eqq.a($$2)) {
                  return 1.0F;
               } else if (eqq.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     eqq.ak.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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
            this.Y.aN().a(this.ay.c());
         }

         eqk.d();
      } catch (Exception var7) {
         ak.error("Failed to load options", var7);
      }
   }

   static boolean a(String $$0) {
      return "true".equals($$0);
   }

   static boolean b(String $$0) {
      return "false".equals($$0);
   }

   private qr a(qr $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return ass.e.a(this.Y.as(), $$0, $$1);
   }

   public void aq() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bL), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new eqq.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, eqp<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> eqq.ak.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(eqq.al.toJson($$2x));
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
         ak.error("Failed to save options", var6);
      }

      this.ar();
   }

   public void ar() {
      if (this.Y.v != null) {
         int $$0 = 0;

         for (cbo $$1 : this.aQ) {
            $$0 |= $$1.a();
         }

         this.Y.v.cl.b(new abi(this.ah, this.au.c(), this.aJ.c(), this.bh.c(), $$0, this.aR.c(), this.Y.aQ(), this.br.c()));
      }
   }

   private void b(cbo $$0, boolean $$1) {
      if ($$1) {
         this.aQ.add($$0);
      } else {
         this.aQ.remove($$0);
      }
   }

   public boolean a(cbo $$0) {
      return this.aQ.contains($$0);
   }

   public void a(cbo $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ar();
   }

   public eqa as() {
      return this.ax() >= 4 ? this.az.c() : eqa.a;
   }

   public boolean at() {
      return this.q;
   }

   public void b(amx $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         amu $$4 = $$0.c($$3);
         if ($$4 == null && !$$3.startsWith("file/")) {
            $$4 = $$0.c("file/" + $$3);
         }

         if ($$4 == null) {
            ak.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", $$3);
            $$2.remove();
         } else if (!$$4.c().a() && !this.j.contains($$3)) {
            ak.warn("Removed resource pack {} from options because it is no longer compatible", $$3);
            $$2.remove();
         } else if ($$4.c().a() && this.j.contains($$3)) {
            ak.info("Removed resource pack {} from incompatibility list because it's now compatible", $$3);
            this.j.remove($$3);
         } else {
            $$1.add($$4.f());
         }
      }

      $$0.a($$1);
   }

   public epy au() {
      return this.bM;
   }

   public void a(epy $$0) {
      this.bM = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = arg.a(al, $$0, am);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File av() {
      return this.bL;
   }

   public String aw() {
      Stream<Pair<String, Object>> $$0 = Stream.<Pair<String, Object>>builder()
         .add(Pair.of("ao", this.aE.c()))
         .add(Pair.of("biomeBlendRadius", this.bb.c()))
         .add(Pair.of("enableVsync", this.bk.c()))
         .add(Pair.of("entityDistanceScaling", this.ax.c()))
         .add(Pair.of("entityShadows", this.bl.c()))
         .add(Pair.of("forceUnicodeFont", this.bm.c()))
         .add(Pair.of("fov", this.bN.c()))
         .add(Pair.of("fovEffectScale", this.bT.c()))
         .add(Pair.of("darknessEffectScale", this.bV.c()))
         .add(Pair.of("glintSpeed", this.bX.c()))
         .add(Pair.of("glintStrength", this.bZ.c()))
         .add(Pair.of("prioritizeChunkUpdates", this.aI.c()))
         .add(Pair.of("fullscreen", this.bA.c()))
         .add(Pair.of("fullscreenResolution", String.valueOf(this.k)))
         .add(Pair.of("gamma", this.cc.c()))
         .add(Pair.of("glDebugVerbosity", this.u))
         .add(Pair.of("graphicsMode", this.aD.c()))
         .add(Pair.of("guiScale", this.ce.c()))
         .add(Pair.of("maxFps", this.ay.c()))
         .add(Pair.of("mipmapLevels", this.aZ.c()))
         .add(Pair.of("narrator", this.cg.c()))
         .add(Pair.of("overrideHeight", this.p))
         .add(Pair.of("overrideWidth", this.o))
         .add(Pair.of("particles", this.cf.c()))
         .add(Pair.of("reducedDebugInfo", this.bs.c()))
         .add(Pair.of("renderClouds", this.az.c()))
         .add(Pair.of("renderDistance", this.au.c()))
         .add(Pair.of("simulationDistance", this.av.c()))
         .add(Pair.of("resourcePacks", this.i))
         .add(Pair.of("screenEffectScale", this.bR.c()))
         .add(Pair.of("syncChunkWrites", this.aj))
         .add(Pair.of("useNativeTransport", this.q))
         .add(Pair.of("soundDevice", this.ch.c()))
         .build();
      return $$0.<CharSequence>map($$0x -> (String)$$0x.getFirst() + ": " + $$0x.getSecond()).collect(Collectors.joining(System.lineSeparator()));
   }

   public void b(int $$0) {
      this.aw = $$0;
   }

   public int ax() {
      return this.aw > 0 ? Math.min(this.au.c(), this.aw) : this.au.c();
   }

   private static tf b(tf $$0, int $$1) {
      return tf.a("options.pixel_value", $$0, $$1);
   }

   private static tf a(tf $$0, double $$1) {
      return tf.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static tf a(tf $$0, tf $$1) {
      return tf.a("options.generic_value", $$0, $$1);
   }

   public static tf a(tf $$0, int $$1) {
      return a($$0, tf.b(Integer.toString($$1)));
   }

   interface a {
      <T> void a(String var1, eqp<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
