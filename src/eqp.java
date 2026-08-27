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

public class eqp {
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
   private static final tf al = tf.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final eqo<Boolean> am = eqo.a("options.darkMojangStudiosBackgroundColor", eqo.a(al), false);
   private static final tf an = tf.c("options.hideLightningFlashes.tooltip");
   private final eqo<Boolean> ao = eqo.a("options.hideLightningFlashes", eqo.a(an), false);
   private final eqo<Double> ap = new eqo<>("options.sensitivity", eqo.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, tf.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, tf.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, eqo.m.a, 0.5, $$0x -> {
   });
   private final eqo<Integer> aq;
   private final eqo<Integer> ar;
   private int as = 0;
   private final eqo<Double> at = new eqo<>(
      "options.entityDistanceScaling",
      eqo.a(),
      eqp::a,
      new eqo.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final eqo<Integer> au = new eqo<>(
      "options.framerateLimit",
      eqo.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, tf.c("options.framerateLimit.max")) : a($$0x, tf.a("options.framerate", $$1x)),
      new eqo.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> eql.O().aM().a($$0x)
   );
   private final eqo<epz> av = new eqo<>(
      "options.renderClouds",
      eqo.a(),
      eqo.b(),
      new eqo.e<>(Arrays.asList(epz.values()), aqy.a(epz.d, Codec.BOOL, $$0x -> $$0x ? epz.c : epz.a)),
      epz.c,
      $$0x -> {
         if (eql.M()) {
            ejr $$1x = eql.O().f.x();
            if ($$1x != null) {
               $$1x.b(eql.a);
            }
         }
      }
   );
   private static final tf aw = tf.c("options.graphics.fast.tooltip");
   private static final tf ax = tf.a("options.graphics.fabulous.tooltip", tf.c("options.graphics.fabulous").a(n.u));
   private static final tf ay = tf.c("options.graphics.fancy.tooltip");
   private final eqo<eqe> az = new eqo<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> etq.a(ay);
            case a -> etq.a(aw);
            case c -> etq.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         ts $$2x = tf.c($$1x.b());
         return $$1x == eqe.c ? $$2x.a(n.u) : $$2x;
      },
      new eqo.a<>(
         Arrays.asList(eqe.values()),
         Stream.of(eqe.values()).filter($$0x -> $$0x != eqe.c).collect(Collectors.toList()),
         () -> eql.O().r() && eql.O().ah().h(),
         ($$0x, $$1x) -> {
            eql $$2x = eql.O();
            fno $$3x = $$2x.ah();
            if ($$1x == eqe.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(eqe::a, eqe::a)
      ),
      eqe.b,
      $$0x -> {
      }
   );
   private final eqo<Boolean> aA = eqo.a("options.ao", true, $$0x -> eql.O().f.f());
   private static final tf aB = tf.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final tf aC = tf.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final tf aD = tf.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final eqo<eqs> aE = new eqo<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> etq.a(aB);
         case b -> etq.a(aC);
         case c -> etq.a(aD);
      };
   }, eqo.b(), new eqo.e<>(Arrays.asList(eqs.values()), Codec.INT.xmap(eqs::a, eqs::a)), eqs.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final eqo<cbk> aF = new eqo<>(
      "options.chat.visibility", eqo.a(), eqo.b(), new eqo.e<>(Arrays.asList(cbk.values()), Codec.INT.xmap(cbk::a, cbk::a)), cbk.a, $$0x -> {
      }
   );
   private final eqo<Double> aG = new eqo<>("options.chat.opacity", eqo.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), eqo.m.a, 1.0, $$0x -> eql.O().l.d().b());
   private final eqo<Double> aH = new eqo<>("options.chat.line_spacing", eqo.a(), eqp::a, eqo.m.a, 0.0, $$0x -> {
   });
   private final eqo<Double> aI = new eqo<>("options.accessibility.text_background_opacity", eqo.a(), eqp::a, eqo.m.a, 0.5, $$0x -> eql.O().l.d().b());
   private final eqo<Double> aJ = new eqo<>("options.accessibility.panorama_speed", eqo.a(), eqp::a, eqo.m.a, 1.0, $$0x -> {
   });
   private static final tf aK = tf.c("options.accessibility.high_contrast.tooltip");
   private final eqo<Boolean> aL = eqo.a("options.accessibility.high_contrast", eqo.a(aK), false, $$0x -> {
      amx $$1x = eql.O().aa();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final eqo<Boolean> aM = eqo.a("options.accessibility.narrator_hotkey", eqo.a(tf.c("options.accessibility.narrator_hotkey.tooltip")), true);
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cbn> aN = EnumSet.allOf(cbn.class);
   private final eqo<bis> aO = new eqo<>("options.mainHand", eqo.a(), eqo.b(), new eqo.e<>(Arrays.asList(bis.values()), bis.c), bis.b, $$0x -> this.as());
   public int o;
   public int p;
   private final eqo<Double> aP = new eqo<>(
      "options.chat.scale",
      eqo.a(),
      ($$0x, $$1x) -> (tf)($$1x == 0.0 ? te.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      eqo.m.a,
      1.0,
      $$0x -> eql.O().l.d().b()
   );
   private final eqo<Double> aQ = new eqo<>("options.chat.width", eqo.a(), ($$0x, $$1x) -> b($$0x, esh.a($$1x)), eqo.m.a, 1.0, $$0x -> eql.O().l.d().b());
   private final eqo<Double> aR = new eqo<>(
      "options.chat.height.unfocused", eqo.a(), ($$0x, $$1x) -> b($$0x, esh.b($$1x)), eqo.m.a, esh.h(), $$0x -> eql.O().l.d().b()
   );
   private final eqo<Double> aS = new eqo<>(
      "options.chat.height.focused", eqo.a(), ($$0x, $$1x) -> b($$0x, esh.b($$1x)), eqo.m.a, 1.0, $$0x -> eql.O().l.d().b()
   );
   private final eqo<Double> aT = new eqo<>(
      "options.chat.delay_instant",
      eqo.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? tf.c("options.chat.delay_none") : tf.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new eqo.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> eql.O().aW().a($$0x)
   );
   private static final tf aU = tf.c("options.notifications.display_time.tooltip");
   private final eqo<Double> aV = new eqo<>(
      "options.notifications.display_time",
      eqo.a(aU),
      ($$0x, $$1x) -> a($$0x, tf.a("options.multiplier", $$1x)),
      new eqo.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final eqo<Integer> aW = new eqo<>(
      "options.mipmapLevels", eqo.a(), ($$0x, $$1x) -> (tf)($$1x == 0 ? te.a($$0x, false) : a($$0x, $$1x.intValue())), new eqo.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final eqo<epv> aX = new eqo<>(
      "options.attackIndicator", eqo.a(), eqo.b(), new eqo.e<>(Arrays.asList(epv.values()), Codec.INT.xmap(epv::a, epv::a)), epv.b, $$0x -> {
      }
   );
   public gel r = gel.a;
   public boolean s = false;
   public boolean t = false;
   private final eqo<Integer> aY = new eqo<>("options.biomeBlendRadius", eqo.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, tf.c("options.biomeBlendRadius." + $$2x));
   }, new eqo.f(0, 7), 2, $$0x -> eql.O().f.f());
   private final eqo<Double> aZ = new eqo<>(
      "options.mouseWheelSensitivity",
      eqo.a(),
      ($$0x, $$1x) -> a($$0x, tf.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new eqo.f(-200, 100).a(eqp::c, eqp::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final eqo<Boolean> ba = eqo.a("options.rawMouseInput", true, $$0x -> {
      ekj $$1x = eql.O().aM();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final eqo<Boolean> bb = eqo.a("options.autoJump", false);
   private final eqo<Boolean> bc = eqo.a("options.operatorItemsTab", false);
   private final eqo<Boolean> bd = eqo.a("options.autoSuggestCommands", true);
   private final eqo<Boolean> be = eqo.a("options.chat.color", true);
   private final eqo<Boolean> bf = eqo.a("options.chat.links", true);
   private final eqo<Boolean> bg = eqo.a("options.chat.links.prompt", true);
   private final eqo<Boolean> bh = eqo.a("options.vsync", true, $$0x -> {
      if (eql.O().aM() != null) {
         eql.O().aM().a($$0x);
      }
   });
   private final eqo<Boolean> bi = eqo.a("options.entityShadows", true);
   private final eqo<Boolean> bj = eqo.a("options.forceUnicodeFont", false, $$0x -> {
      eql $$1x = eql.O();
      if ($$1x.aM() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final eqo<Boolean> bk = eqo.a("options.invertMouse", false);
   private final eqo<Boolean> bl = eqo.a("options.discrete_mouse_scroll", false);
   private final eqo<Boolean> bm = eqo.a("options.realmsNotifications", true);
   private static final tf bn = tf.c("options.allowServerListing.tooltip");
   private final eqo<Boolean> bo = eqo.a("options.allowServerListing", eqo.a(bn), true, $$0x -> this.as());
   private final eqo<Boolean> bp = eqo.a("options.reducedDebugInfo", false);
   private final Map<aox, eqo<Double>> bq = ac.a(new EnumMap<>(aox.class), $$0x -> {
      for (aox $$1x : aox.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final eqo<Boolean> br = eqo.a("options.showSubtitles", false);
   private static final tf bs = tf.c("options.directionalAudio.on.tooltip");
   private static final tf bt = tf.c("options.directionalAudio.off.tooltip");
   private final eqo<Boolean> bu = eqo.a("options.directionalAudio", $$0x -> $$0x ? etq.a(bs) : etq.a(bt), false, $$0x -> {
      gdg $$1x = eql.O().ai();
      $$1x.i();
      $$1x.a(gbx.a(aow.yu, 1.0F));
   });
   private final eqo<Boolean> bv = new eqo<>(
      "options.accessibility.text_background",
      eqo.a(),
      ($$0x, $$1x) -> $$1x ? tf.c("options.accessibility.text_background.chat") : tf.c("options.accessibility.text_background.everywhere"),
      eqo.a,
      true,
      $$0x -> {
      }
   );
   private final eqo<Boolean> bw = eqo.a("options.touchscreen", false);
   private final eqo<Boolean> bx = eqo.a("options.fullscreen", false, $$0x -> {
      eql $$1x = eql.O();
      if ($$1x.aM() != null && $$1x.aM().j() != $$0x) {
         $$1x.aM().h();
         this.W().a($$1x.aM().j());
      }
   });
   private final eqo<Boolean> by = eqo.a("options.viewBobbing", true);
   private static final tf bz = tf.c("options.key.toggle");
   private static final tf bA = tf.c("options.key.hold");
   private final eqo<Boolean> bB = new eqo<>("key.sneak", eqo.a(), ($$0x, $$1x) -> $$1x ? bz : bA, eqo.a, false, $$0x -> {
   });
   private final eqo<Boolean> bC = new eqo<>("key.sprint", eqo.a(), ($$0x, $$1x) -> $$1x ? bz : bA, eqo.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final tf bD = tf.c("options.hideMatchedNames.tooltip");
   private final eqo<Boolean> bE = eqo.a("options.hideMatchedNames", eqo.a(bD), true);
   private final eqo<Boolean> bF = eqo.a("options.autosaveIndicator", true);
   private static final tf bG = tf.c("options.onlyShowSecureChat.tooltip");
   private final eqo<Boolean> bH = eqo.a("options.onlyShowSecureChat", eqo.a(bG), false);
   public final eqj x = new eqj("key.forward", 87, "key.categories.movement");
   public final eqj y = new eqj("key.left", 65, "key.categories.movement");
   public final eqj z = new eqj("key.back", 83, "key.categories.movement");
   public final eqj A = new eqj("key.right", 68, "key.categories.movement");
   public final eqj B = new eqj("key.jump", 32, "key.categories.movement");
   public final eqj C = new eqz("key.sneak", 340, "key.categories.movement", this.bB::c);
   public final eqj D = new eqz("key.sprint", 341, "key.categories.movement", this.bC::c);
   public final eqj E = new eqj("key.inventory", 69, "key.categories.inventory");
   public final eqj F = new eqj("key.swapOffhand", 70, "key.categories.inventory");
   public final eqj G = new eqj("key.drop", 81, "key.categories.inventory");
   public final eqj H = new eqj("key.use", eka.b.c, 1, "key.categories.gameplay");
   public final eqj I = new eqj("key.attack", eka.b.c, 0, "key.categories.gameplay");
   public final eqj J = new eqj("key.pickItem", eka.b.c, 2, "key.categories.gameplay");
   public final eqj K = new eqj("key.chat", 84, "key.categories.multiplayer");
   public final eqj L = new eqj("key.playerlist", 258, "key.categories.multiplayer");
   public final eqj M = new eqj("key.command", 47, "key.categories.multiplayer");
   public final eqj N = new eqj("key.socialInteractions", 80, "key.categories.multiplayer");
   public final eqj O = new eqj("key.screenshot", 291, "key.categories.misc");
   public final eqj P = new eqj("key.togglePerspective", 294, "key.categories.misc");
   public final eqj Q = new eqj("key.smoothCamera", eka.bv.b(), "key.categories.misc");
   public final eqj R = new eqj("key.fullscreen", 300, "key.categories.misc");
   public final eqj S = new eqj("key.spectatorOutlines", eka.bv.b(), "key.categories.misc");
   public final eqj T = new eqj("key.advancements", 76, "key.categories.misc");
   public final eqj[] U = new eqj[]{
      new eqj("key.hotbar.1", 49, "key.categories.inventory"),
      new eqj("key.hotbar.2", 50, "key.categories.inventory"),
      new eqj("key.hotbar.3", 51, "key.categories.inventory"),
      new eqj("key.hotbar.4", 52, "key.categories.inventory"),
      new eqj("key.hotbar.5", 53, "key.categories.inventory"),
      new eqj("key.hotbar.6", 54, "key.categories.inventory"),
      new eqj("key.hotbar.7", 55, "key.categories.inventory"),
      new eqj("key.hotbar.8", 56, "key.categories.inventory"),
      new eqj("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final eqj V = new eqj("key.saveToolbarActivator", 67, "key.categories.creative");
   public final eqj W = new eqj("key.loadToolbarActivator", 88, "key.categories.creative");
   public final eqj[] X = (eqj[])ArrayUtils.addAll(
      new eqj[]{
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
   protected eql Y;
   private final File bI;
   public boolean Z;
   private epx bJ = epx.a;
   public String aa = "";
   public boolean ab;
   private final eqo<Integer> bK = new eqo<>("options.fov", eqo.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, tf.c("options.fov.min"));
         case 110 -> a($$0x, tf.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new eqo.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> eql.O().f.r());
   private static final tf bL = tf.a("options.telemetry.button.tooltip", tf.c("options.telemetry.state.minimal"), tf.c("options.telemetry.state.all"));
   private final eqo<Boolean> bM = eqo.a("options.telemetry.button", eqo.a(bL), ($$0x, $$1x) -> {
      eql $$2x = eql.O();
      if (!$$2x.C()) {
         return tf.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.B() ? tf.c("options.telemetry.state.all") : tf.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final tf bN = tf.c("options.screenEffectScale.tooltip");
   private final eqo<Double> bO = new eqo<>(
      "options.screenEffectScale", eqo.a(bN), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, te.c) : a($$0x, $$1x.doubleValue()), eqo.m.a, 1.0, $$0x -> {
      }
   );
   private static final tf bP = tf.c("options.fovEffectScale.tooltip");
   private final eqo<Double> bQ = new eqo<>(
      "options.fovEffectScale",
      eqo.a(bP),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, te.c) : a($$0x, $$1x.doubleValue()),
      eqo.m.a.a(arp::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final tf bR = tf.c("options.darknessEffectScale.tooltip");
   private final eqo<Double> bS = new eqo<>(
      "options.darknessEffectScale",
      eqo.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, te.c) : a($$0x, $$1x.doubleValue()),
      eqo.m.a.a(arp::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final tf bT = tf.c("options.glintSpeed.tooltip");
   private final eqo<Double> bU = new eqo<>(
      "options.glintSpeed", eqo.a(bT), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, te.c) : a($$0x, $$1x.doubleValue()), eqo.m.a, 0.5, $$0x -> {
      }
   );
   private static final tf bV = tf.c("options.glintStrength.tooltip");
   private final eqo<Double> bW = new eqo<>(
      "options.glintStrength",
      eqo.a(bV),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, te.c) : a($$0x, $$1x.doubleValue()),
      eqo.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final tf bX = tf.c("options.damageTiltStrength.tooltip");
   private final eqo<Double> bY = new eqo<>(
      "options.damageTiltStrength", eqo.a(bX), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, te.c) : a($$0x, $$1x.doubleValue()), eqo.m.a, 1.0, $$0x -> {
      }
   );
   private final eqo<Double> bZ = new eqo<>("options.gamma", eqo.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, tf.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, tf.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, tf.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, eqo.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int ca = 2147483646;
   private final eqo<Integer> cb = new eqo<>(
      "options.guiScale", eqo.a(), ($$0x, $$1x) -> $$1x == 0 ? tf.c("options.guiScale.auto") : tf.b(Integer.toString($$1x)), new eqo.c(0, () -> {
         eql $$0x = eql.O();
         return !$$0x.r() ? 2147483646 : $$0x.aM().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final eqo<eqq> cc = new eqo<>(
      "options.particles", eqo.a(), eqo.b(), new eqo.e<>(Arrays.asList(eqq.values()), Codec.INT.xmap(eqq::a, eqq::a)), eqq.a, $$0x -> {
      }
   );
   private final eqo<eqn> cd = new eqo<>(
      "options.narrator",
      eqo.a(),
      ($$0x, $$1x) -> (tf)(this.Y.aV().a() ? $$1x.b() : tf.c("options.narrator.notavailable")),
      new eqo.e<>(Arrays.asList(eqn.values()), Codec.INT.xmap(eqn::a, eqn::a)),
      eqn.a,
      $$0x -> this.Y.aV().a($$0x)
   );
   public String ad = "en_us";
   private final eqo<String> ce = new eqo<>(
      "options.audioDevice",
      eqo.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return tf.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? tf.b($$1x.substring(gdd.c)) : tf.b($$1x);
         }
      },
      new eqo.h<>(
         () -> Stream.concat(Stream.of(""), eql.O().ai().a().stream()).toList(),
         $$0x -> eql.O().r() && $$0x != "" && !eql.O().ai().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gdg $$1x = eql.O().ai();
         $$1x.i();
         $$1x.a(gbx.a(aow.yu, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public eqo<Boolean> a() {
      return this.am;
   }

   public eqo<Boolean> b() {
      return this.ao;
   }

   public eqo<Double> c() {
      return this.ap;
   }

   public eqo<Integer> d() {
      return this.aq;
   }

   public eqo<Integer> e() {
      return this.ar;
   }

   public eqo<Double> f() {
      return this.at;
   }

   public eqo<Integer> g() {
      return this.au;
   }

   public eqo<epz> h() {
      return this.av;
   }

   public eqo<eqe> i() {
      return this.az;
   }

   public eqo<Boolean> j() {
      return this.aA;
   }

   public eqo<eqs> k() {
      return this.aE;
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

      this.ar();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.Y.k();
      }
   }

   public eqo<cbk> l() {
      return this.aF;
   }

   public eqo<Double> m() {
      return this.aG;
   }

   public eqo<Double> n() {
      return this.aH;
   }

   public eqo<Double> o() {
      return this.aI;
   }

   public eqo<Double> p() {
      return this.aJ;
   }

   public eqo<Boolean> q() {
      return this.aL;
   }

   public eqo<Boolean> r() {
      return this.aM;
   }

   public eqo<bis> s() {
      return this.aO;
   }

   public eqo<Double> t() {
      return this.aP;
   }

   public eqo<Double> u() {
      return this.aQ;
   }

   public eqo<Double> v() {
      return this.aR;
   }

   public eqo<Double> w() {
      return this.aS;
   }

   public eqo<Double> x() {
      return this.aT;
   }

   public eqo<Double> y() {
      return this.aV;
   }

   public eqo<Integer> z() {
      return this.aW;
   }

   public eqo<epv> A() {
      return this.aX;
   }

   public eqo<Integer> B() {
      return this.aY;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return arp.a(Math.log10($$0) * 100.0);
   }

   public eqo<Double> C() {
      return this.aZ;
   }

   public eqo<Boolean> D() {
      return this.ba;
   }

   public eqo<Boolean> E() {
      return this.bb;
   }

   public eqo<Boolean> F() {
      return this.bc;
   }

   public eqo<Boolean> G() {
      return this.bd;
   }

   public eqo<Boolean> H() {
      return this.be;
   }

   public eqo<Boolean> I() {
      return this.bf;
   }

   public eqo<Boolean> J() {
      return this.bg;
   }

   public eqo<Boolean> K() {
      return this.bh;
   }

   public eqo<Boolean> L() {
      return this.bi;
   }

   public eqo<Boolean> M() {
      return this.bj;
   }

   public eqo<Boolean> N() {
      return this.bk;
   }

   public eqo<Boolean> O() {
      return this.bl;
   }

   public eqo<Boolean> P() {
      return this.bm;
   }

   public eqo<Boolean> Q() {
      return this.bo;
   }

   public eqo<Boolean> R() {
      return this.bp;
   }

   public final float a(aox $$0) {
      return this.b($$0).c().floatValue();
   }

   public final eqo<Double> b(aox $$0) {
      return Objects.requireNonNull(this.bq.get($$0));
   }

   private eqo<Double> a(String $$0, aox $$1) {
      return new eqo<>(
         $$0, eqo.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, te.c) : a($$0x, $$1x.doubleValue()), eqo.m.a, 1.0, $$1x -> eql.O().ai().a($$1, $$1x.floatValue())
      );
   }

   public eqo<Boolean> S() {
      return this.br;
   }

   public eqo<Boolean> T() {
      return this.bu;
   }

   public eqo<Boolean> U() {
      return this.bv;
   }

   public eqo<Boolean> V() {
      return this.bw;
   }

   public eqo<Boolean> W() {
      return this.bx;
   }

   public eqo<Boolean> X() {
      return this.by;
   }

   public eqo<Boolean> Y() {
      return this.bB;
   }

   public eqo<Boolean> Z() {
      return this.bC;
   }

   public eqo<Boolean> aa() {
      return this.bE;
   }

   public eqo<Boolean> ab() {
      return this.bF;
   }

   public eqo<Boolean> ac() {
      return this.bH;
   }

   public eqo<Integer> ad() {
      return this.bK;
   }

   public eqo<Boolean> ae() {
      return this.bM;
   }

   public eqo<Double> af() {
      return this.bO;
   }

   public eqo<Double> ag() {
      return this.bQ;
   }

   public eqo<Double> ah() {
      return this.bS;
   }

   public eqo<Double> ai() {
      return this.bU;
   }

   public eqo<Double> aj() {
      return this.bW;
   }

   public eqo<Double> ak() {
      return this.bY;
   }

   public eqo<Double> al() {
      return this.bZ;
   }

   public eqo<Integer> am() {
      return this.cb;
   }

   public eqo<eqq> an() {
      return this.cc;
   }

   public eqo<eqn> ao() {
      return this.cd;
   }

   public eqo<String> ap() {
      return this.ce;
   }

   public eqp(eql $$0, File $$1) {
      this.Y = $$0;
      this.bI = new File($$1, "options.txt");
      boolean $$2 = $$0.af();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new eqo<>(
         "options.renderDistance",
         eqo.a(),
         ($$0x, $$1x) -> a($$0x, tf.a("options.chunks", $$1x)),
         new eqo.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> eql.O().f.r()
      );
      this.ar = new eqo<>(
         "options.simulationDistance", eqo.a(), ($$0x, $$1x) -> a($$0x, tf.a("options.chunks", $$1x)), new eqo.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
         }
      );
      this.af = ac.i() == ac.b.c;
      this.aq();
   }

   public float a(float $$0) {
      return this.bv.c() ? $$0 : this.o().c().floatValue();
   }

   public int b(float $$0) {
      return (int)(this.a($$0) * 255.0F) << 24 & 0xFF000000;
   }

   public int a(int $$0) {
      return this.bv.c() ? $$0 : (int)(this.aI.c() * 255.0) << 24 & 0xFF000000;
   }

   public void a(eqj $$0, eka.a $$1) {
      $$0.b($$1);
      this.ar();
   }

   private void a(eqp.a $$0) {
      $$0.a("autoJump", this.bb);
      $$0.a("operatorItemsTab", this.bc);
      $$0.a("autoSuggestions", this.bd);
      $$0.a("chatColors", this.be);
      $$0.a("chatLinks", this.bf);
      $$0.a("chatLinksPrompt", this.bg);
      $$0.a("enableVsync", this.bh);
      $$0.a("entityShadows", this.bi);
      $$0.a("forceUnicodeFont", this.bj);
      $$0.a("discrete_mouse_scroll", this.bl);
      $$0.a("invertYMouse", this.bk);
      $$0.a("realmsNotifications", this.bm);
      $$0.a("reducedDebugInfo", this.bp);
      $$0.a("showSubtitles", this.br);
      $$0.a("directionalAudio", this.bu);
      $$0.a("touchscreen", this.bw);
      $$0.a("fullscreen", this.bx);
      $$0.a("bobView", this.by);
      $$0.a("toggleCrouch", this.bB);
      $$0.a("toggleSprint", this.bC);
      $$0.a("darkMojangStudiosBackground", this.am);
      $$0.a("hideLightningFlashes", this.ao);
      $$0.a("mouseSensitivity", this.ap);
      $$0.a("fov", this.bK);
      $$0.a("screenEffectScale", this.bO);
      $$0.a("fovEffectScale", this.bQ);
      $$0.a("darknessEffectScale", this.bS);
      $$0.a("glintSpeed", this.bU);
      $$0.a("glintStrength", this.bW);
      $$0.a("damageTiltStrength", this.bY);
      $$0.a("highContrast", this.aL);
      $$0.a("narratorHotkey", this.aM);
      $$0.a("gamma", this.bZ);
      $$0.a("renderDistance", this.aq);
      $$0.a("simulationDistance", this.ar);
      $$0.a("entityDistanceScaling", this.at);
      $$0.a("guiScale", this.cb);
      $$0.a("particles", this.cc);
      $$0.a("maxFps", this.au);
      $$0.a("graphicsMode", this.az);
      $$0.a("ao", this.aA);
      $$0.a("prioritizeChunkUpdates", this.aE);
      $$0.a("biomeBlendRadius", this.aY);
      $$0.a("renderClouds", this.av);
      this.i = $$0.a("resourcePacks", this.i, eqp::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, eqp::c, ah::toJson);
      this.aa = $$0.a("lastServer", this.aa);
      this.ad = $$0.a("lang", this.ad);
      $$0.a("soundDevice", this.ce);
      $$0.a("chatVisibility", this.aF);
      $$0.a("chatOpacity", this.aG);
      $$0.a("chatLineSpacing", this.aH);
      $$0.a("textBackgroundOpacity", this.aI);
      $$0.a("backgroundForChatOnly", this.bv);
      this.l = $$0.a("hideServerAddress", this.l);
      this.m = $$0.a("advancedItemTooltips", this.m);
      this.n = $$0.a("pauseOnLostFocus", this.n);
      this.o = $$0.a("overrideWidth", this.o);
      this.p = $$0.a("overrideHeight", this.p);
      $$0.a("chatHeightFocused", this.aS);
      $$0.a("chatDelay", this.aT);
      $$0.a("chatHeightUnfocused", this.aR);
      $$0.a("chatScale", this.aP);
      $$0.a("chatWidth", this.aQ);
      $$0.a("notificationDisplayTime", this.aV);
      $$0.a("mipmapLevels", this.aW);
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aO);
      $$0.a("attackIndicator", this.aX);
      $$0.a("narrator", this.cd);
      this.r = $$0.a("tutorialStep", this.r, gel::a, gel::a);
      $$0.a("mouseWheelSensitivity", this.aZ);
      $$0.a("rawMouseInput", this.ba);
      this.u = $$0.a("glDebugVerbosity", this.u);
      this.v = $$0.a("skipMultiplayerWarning", this.v);
      this.w = $$0.a("skipRealms32bitWarning", this.w);
      $$0.a("hideMatchedNames", this.bE);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.t = $$0.a("hideBundleTutorial", this.t);
      this.af = $$0.a("syncChunkWrites", this.af);
      $$0.a("showAutosaveIndicator", this.bF);
      $$0.a("allowServerListing", this.bo);
      $$0.a("onlyShowSecureChat", this.bH);
      $$0.a("panoramaScrollSpeed", this.aJ);
      $$0.a("telemetryOptInExtra", this.bM);
      this.ae = $$0.a("onboardAccessibility", this.ae);

      for (eqj $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(eka.a($$3));
         }
      }

      for (aox $$4 : aox.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bq.get($$4));
      }

      for (cbn $$5 : cbn.values()) {
         boolean $$6 = this.aN.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.b($$5, $$7);
         }
      }
   }

   public void aq() {
      try {
         if (!this.bI.exists()) {
            return;
         }

         qr $$0 = new qr();

         try (BufferedReader $$1 = Files.newReader(this.bI, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = aj.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  ag.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final qr $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.az.a(eqe.b);
            } else {
               this.az.a(eqe.a);
            }
         }

         this.a(new eqp.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, eqo<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> eqp.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     eqp.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? eqp.a($$2) : $$1;
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
               } else if (eqp.a($$2)) {
                  return 1.0F;
               } else if (eqp.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     eqp.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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
            this.Y.aM().a(this.au.c());
         }

         eqj.d();
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

   private qr a(qr $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return ass.e.a(this.Y.ar(), $$0, $$1);
   }

   public void ar() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bI), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new eqp.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, eqo<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> eqp.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(eqp.ah.toJson($$2x));
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

      this.as();
   }

   public void as() {
      if (this.Y.s != null) {
         int $$0 = 0;

         for (cbn $$1 : this.aN) {
            $$0 |= $$1.a();
         }

         this.Y.s.cl.b(new abi(this.ad, this.aq.c(), this.aF.c(), this.be.c(), $$0, this.aO.c(), this.Y.aQ(), this.bo.c()));
      }
   }

   private void b(cbn $$0, boolean $$1) {
      if ($$1) {
         this.aN.add($$0);
      } else {
         this.aN.remove($$0);
      }
   }

   public boolean a(cbn $$0) {
      return this.aN.contains($$0);
   }

   public void a(cbn $$0, boolean $$1) {
      this.b($$0, $$1);
      this.as();
   }

   public epz at() {
      return this.ay() >= 4 ? this.av.c() : epz.a;
   }

   public boolean au() {
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

   public epx av() {
      return this.bJ;
   }

   public void a(epx $$0) {
      this.bJ = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = arg.a(ah, $$0, ai);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aw() {
      return this.bI;
   }

   public String ax() {
      Stream<Pair<String, Object>> $$0 = Stream.<Pair<String, Object>>builder()
         .add(Pair.of("ao", this.aA.c()))
         .add(Pair.of("biomeBlendRadius", this.aY.c()))
         .add(Pair.of("enableVsync", this.bh.c()))
         .add(Pair.of("entityDistanceScaling", this.at.c()))
         .add(Pair.of("entityShadows", this.bi.c()))
         .add(Pair.of("forceUnicodeFont", this.bj.c()))
         .add(Pair.of("fov", this.bK.c()))
         .add(Pair.of("fovEffectScale", this.bQ.c()))
         .add(Pair.of("darknessEffectScale", this.bS.c()))
         .add(Pair.of("glintSpeed", this.bU.c()))
         .add(Pair.of("glintStrength", this.bW.c()))
         .add(Pair.of("prioritizeChunkUpdates", this.aE.c()))
         .add(Pair.of("fullscreen", this.bx.c()))
         .add(Pair.of("fullscreenResolution", String.valueOf(this.k)))
         .add(Pair.of("gamma", this.bZ.c()))
         .add(Pair.of("glDebugVerbosity", this.u))
         .add(Pair.of("graphicsMode", this.az.c()))
         .add(Pair.of("guiScale", this.cb.c()))
         .add(Pair.of("maxFps", this.au.c()))
         .add(Pair.of("mipmapLevels", this.aW.c()))
         .add(Pair.of("narrator", this.cd.c()))
         .add(Pair.of("overrideHeight", this.p))
         .add(Pair.of("overrideWidth", this.o))
         .add(Pair.of("particles", this.cc.c()))
         .add(Pair.of("reducedDebugInfo", this.bp.c()))
         .add(Pair.of("renderClouds", this.av.c()))
         .add(Pair.of("renderDistance", this.aq.c()))
         .add(Pair.of("simulationDistance", this.ar.c()))
         .add(Pair.of("resourcePacks", this.i))
         .add(Pair.of("screenEffectScale", this.bO.c()))
         .add(Pair.of("syncChunkWrites", this.af))
         .add(Pair.of("useNativeTransport", this.q))
         .add(Pair.of("soundDevice", this.ce.c()))
         .build();
      return $$0.<CharSequence>map($$0x -> (String)$$0x.getFirst() + ": " + $$0x.getSecond()).collect(Collectors.joining(System.lineSeparator()));
   }

   public void b(int $$0) {
      this.as = $$0;
   }

   public int ay() {
      return this.as > 0 ? Math.min(this.aq.c(), this.as) : this.aq.c();
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
      <T> void a(String var1, eqo<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
