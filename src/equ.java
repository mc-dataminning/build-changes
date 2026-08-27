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

public class equ {
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
   private static final ti al = ti.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final eqt<Boolean> am = eqt.a("options.darkMojangStudiosBackgroundColor", eqt.a(al), false);
   private static final ti an = ti.c("options.hideLightningFlashes.tooltip");
   private final eqt<Boolean> ao = eqt.a("options.hideLightningFlashes", eqt.a(an), false);
   private final eqt<Double> ap = new eqt<>("options.sensitivity", eqt.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, ti.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, ti.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, eqt.m.a, 0.5, $$0x -> {
   });
   private final eqt<Integer> aq;
   private final eqt<Integer> ar;
   private int as = 0;
   private final eqt<Double> at = new eqt<>(
      "options.entityDistanceScaling",
      eqt.a(),
      equ::a,
      new eqt.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final eqt<Integer> au = new eqt<>(
      "options.framerateLimit",
      eqt.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, ti.c("options.framerateLimit.max")) : a($$0x, ti.a("options.framerate", $$1x)),
      new eqt.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> eqq.O().aM().a($$0x)
   );
   private final eqt<eqe> av = new eqt<>(
      "options.renderClouds",
      eqt.a(),
      eqt.b(),
      new eqt.e<>(Arrays.asList(eqe.values()), arb.a(eqe.d, Codec.BOOL, $$0x -> $$0x ? eqe.c : eqe.a)),
      eqe.c,
      $$0x -> {
         if (eqq.M()) {
            ejw $$1x = eqq.O().f.x();
            if ($$1x != null) {
               $$1x.b(eqq.a);
            }
         }
      }
   );
   private static final ti aw = ti.c("options.graphics.fast.tooltip");
   private static final ti ax = ti.a("options.graphics.fabulous.tooltip", ti.c("options.graphics.fabulous").a(n.u));
   private static final ti ay = ti.c("options.graphics.fancy.tooltip");
   private final eqt<eqj> az = new eqt<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> etv.a(ay);
            case a -> etv.a(aw);
            case c -> etv.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         tv $$2x = ti.c($$1x.b());
         return $$1x == eqj.c ? $$2x.a(n.u) : $$2x;
      },
      new eqt.a<>(
         Arrays.asList(eqj.values()),
         Stream.of(eqj.values()).filter($$0x -> $$0x != eqj.c).collect(Collectors.toList()),
         () -> eqq.O().r() && eqq.O().ah().h(),
         ($$0x, $$1x) -> {
            eqq $$2x = eqq.O();
            fnt $$3x = $$2x.ah();
            if ($$1x == eqj.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(eqj::a, eqj::a)
      ),
      eqj.b,
      $$0x -> {
      }
   );
   private final eqt<Boolean> aA = eqt.a("options.ao", true, $$0x -> eqq.O().f.f());
   private static final ti aB = ti.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final ti aC = ti.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final ti aD = ti.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final eqt<eqx> aE = new eqt<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> etv.a(aB);
         case b -> etv.a(aC);
         case c -> etv.a(aD);
      };
   }, eqt.b(), new eqt.e<>(Arrays.asList(eqx.values()), Codec.INT.xmap(eqx::a, eqx::a)), eqx.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final eqt<cbn> aF = new eqt<>(
      "options.chat.visibility", eqt.a(), eqt.b(), new eqt.e<>(Arrays.asList(cbn.values()), Codec.INT.xmap(cbn::a, cbn::a)), cbn.a, $$0x -> {
      }
   );
   private final eqt<Double> aG = new eqt<>("options.chat.opacity", eqt.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), eqt.m.a, 1.0, $$0x -> eqq.O().l.d().b());
   private final eqt<Double> aH = new eqt<>("options.chat.line_spacing", eqt.a(), equ::a, eqt.m.a, 0.0, $$0x -> {
   });
   private final eqt<Double> aI = new eqt<>("options.accessibility.text_background_opacity", eqt.a(), equ::a, eqt.m.a, 0.5, $$0x -> eqq.O().l.d().b());
   private final eqt<Double> aJ = new eqt<>("options.accessibility.panorama_speed", eqt.a(), equ::a, eqt.m.a, 1.0, $$0x -> {
   });
   private static final ti aK = ti.c("options.accessibility.high_contrast.tooltip");
   private final eqt<Boolean> aL = eqt.a("options.accessibility.high_contrast", eqt.a(aK), false, $$0x -> {
      ana $$1x = eqq.O().aa();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final eqt<Boolean> aM = eqt.a("options.accessibility.narrator_hotkey", eqt.a(ti.c("options.accessibility.narrator_hotkey.tooltip")), true);
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cbq> aN = EnumSet.allOf(cbq.class);
   private final eqt<biv> aO = new eqt<>("options.mainHand", eqt.a(), eqt.b(), new eqt.e<>(Arrays.asList(biv.values()), biv.c), biv.b, $$0x -> this.as());
   public int o;
   public int p;
   private final eqt<Double> aP = new eqt<>(
      "options.chat.scale",
      eqt.a(),
      ($$0x, $$1x) -> (ti)($$1x == 0.0 ? th.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      eqt.m.a,
      1.0,
      $$0x -> eqq.O().l.d().b()
   );
   private final eqt<Double> aQ = new eqt<>("options.chat.width", eqt.a(), ($$0x, $$1x) -> b($$0x, esm.a($$1x)), eqt.m.a, 1.0, $$0x -> eqq.O().l.d().b());
   private final eqt<Double> aR = new eqt<>(
      "options.chat.height.unfocused", eqt.a(), ($$0x, $$1x) -> b($$0x, esm.b($$1x)), eqt.m.a, esm.h(), $$0x -> eqq.O().l.d().b()
   );
   private final eqt<Double> aS = new eqt<>(
      "options.chat.height.focused", eqt.a(), ($$0x, $$1x) -> b($$0x, esm.b($$1x)), eqt.m.a, 1.0, $$0x -> eqq.O().l.d().b()
   );
   private final eqt<Double> aT = new eqt<>(
      "options.chat.delay_instant",
      eqt.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? ti.c("options.chat.delay_none") : ti.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new eqt.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> eqq.O().aW().a($$0x)
   );
   private static final ti aU = ti.c("options.notifications.display_time.tooltip");
   private final eqt<Double> aV = new eqt<>(
      "options.notifications.display_time",
      eqt.a(aU),
      ($$0x, $$1x) -> a($$0x, ti.a("options.multiplier", $$1x)),
      new eqt.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final eqt<Integer> aW = new eqt<>(
      "options.mipmapLevels", eqt.a(), ($$0x, $$1x) -> (ti)($$1x == 0 ? th.a($$0x, false) : a($$0x, $$1x.intValue())), new eqt.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final eqt<eqa> aX = new eqt<>(
      "options.attackIndicator", eqt.a(), eqt.b(), new eqt.e<>(Arrays.asList(eqa.values()), Codec.INT.xmap(eqa::a, eqa::a)), eqa.b, $$0x -> {
      }
   );
   public geq r = geq.a;
   public boolean s = false;
   public boolean t = false;
   private final eqt<Integer> aY = new eqt<>("options.biomeBlendRadius", eqt.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, ti.c("options.biomeBlendRadius." + $$2x));
   }, new eqt.f(0, 7), 2, $$0x -> eqq.O().f.f());
   private final eqt<Double> aZ = new eqt<>(
      "options.mouseWheelSensitivity",
      eqt.a(),
      ($$0x, $$1x) -> a($$0x, ti.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new eqt.f(-200, 100).a(equ::c, equ::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final eqt<Boolean> ba = eqt.a("options.rawMouseInput", true, $$0x -> {
      eko $$1x = eqq.O().aM();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final eqt<Boolean> bb = eqt.a("options.autoJump", false);
   private final eqt<Boolean> bc = eqt.a("options.operatorItemsTab", false);
   private final eqt<Boolean> bd = eqt.a("options.autoSuggestCommands", true);
   private final eqt<Boolean> be = eqt.a("options.chat.color", true);
   private final eqt<Boolean> bf = eqt.a("options.chat.links", true);
   private final eqt<Boolean> bg = eqt.a("options.chat.links.prompt", true);
   private final eqt<Boolean> bh = eqt.a("options.vsync", true, $$0x -> {
      if (eqq.O().aM() != null) {
         eqq.O().aM().a($$0x);
      }
   });
   private final eqt<Boolean> bi = eqt.a("options.entityShadows", true);
   private final eqt<Boolean> bj = eqt.a("options.forceUnicodeFont", false, $$0x -> {
      eqq $$1x = eqq.O();
      if ($$1x.aM() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final eqt<Boolean> bk = eqt.a("options.invertMouse", false);
   private final eqt<Boolean> bl = eqt.a("options.discrete_mouse_scroll", false);
   private final eqt<Boolean> bm = eqt.a("options.realmsNotifications", true);
   private static final ti bn = ti.c("options.allowServerListing.tooltip");
   private final eqt<Boolean> bo = eqt.a("options.allowServerListing", eqt.a(bn), true, $$0x -> this.as());
   private final eqt<Boolean> bp = eqt.a("options.reducedDebugInfo", false);
   private final Map<apa, eqt<Double>> bq = ac.a(new EnumMap<>(apa.class), $$0x -> {
      for (apa $$1x : apa.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final eqt<Boolean> br = eqt.a("options.showSubtitles", false);
   private static final ti bs = ti.c("options.directionalAudio.on.tooltip");
   private static final ti bt = ti.c("options.directionalAudio.off.tooltip");
   private final eqt<Boolean> bu = eqt.a("options.directionalAudio", $$0x -> $$0x ? etv.a(bs) : etv.a(bt), false, $$0x -> {
      gdl $$1x = eqq.O().ai();
      $$1x.i();
      $$1x.a(gcc.a(aoz.yu, 1.0F));
   });
   private final eqt<Boolean> bv = new eqt<>(
      "options.accessibility.text_background",
      eqt.a(),
      ($$0x, $$1x) -> $$1x ? ti.c("options.accessibility.text_background.chat") : ti.c("options.accessibility.text_background.everywhere"),
      eqt.a,
      true,
      $$0x -> {
      }
   );
   private final eqt<Boolean> bw = eqt.a("options.touchscreen", false);
   private final eqt<Boolean> bx = eqt.a("options.fullscreen", false, $$0x -> {
      eqq $$1x = eqq.O();
      if ($$1x.aM() != null && $$1x.aM().j() != $$0x) {
         $$1x.aM().h();
         this.W().a($$1x.aM().j());
      }
   });
   private final eqt<Boolean> by = eqt.a("options.viewBobbing", true);
   private static final ti bz = ti.c("options.key.toggle");
   private static final ti bA = ti.c("options.key.hold");
   private final eqt<Boolean> bB = new eqt<>("key.sneak", eqt.a(), ($$0x, $$1x) -> $$1x ? bz : bA, eqt.a, false, $$0x -> {
   });
   private final eqt<Boolean> bC = new eqt<>("key.sprint", eqt.a(), ($$0x, $$1x) -> $$1x ? bz : bA, eqt.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final ti bD = ti.c("options.hideMatchedNames.tooltip");
   private final eqt<Boolean> bE = eqt.a("options.hideMatchedNames", eqt.a(bD), true);
   private final eqt<Boolean> bF = eqt.a("options.autosaveIndicator", true);
   private static final ti bG = ti.c("options.onlyShowSecureChat.tooltip");
   private final eqt<Boolean> bH = eqt.a("options.onlyShowSecureChat", eqt.a(bG), false);
   public final eqo x = new eqo("key.forward", 87, "key.categories.movement");
   public final eqo y = new eqo("key.left", 65, "key.categories.movement");
   public final eqo z = new eqo("key.back", 83, "key.categories.movement");
   public final eqo A = new eqo("key.right", 68, "key.categories.movement");
   public final eqo B = new eqo("key.jump", 32, "key.categories.movement");
   public final eqo C = new ere("key.sneak", 340, "key.categories.movement", this.bB::c);
   public final eqo D = new ere("key.sprint", 341, "key.categories.movement", this.bC::c);
   public final eqo E = new eqo("key.inventory", 69, "key.categories.inventory");
   public final eqo F = new eqo("key.swapOffhand", 70, "key.categories.inventory");
   public final eqo G = new eqo("key.drop", 81, "key.categories.inventory");
   public final eqo H = new eqo("key.use", ekf.b.c, 1, "key.categories.gameplay");
   public final eqo I = new eqo("key.attack", ekf.b.c, 0, "key.categories.gameplay");
   public final eqo J = new eqo("key.pickItem", ekf.b.c, 2, "key.categories.gameplay");
   public final eqo K = new eqo("key.chat", 84, "key.categories.multiplayer");
   public final eqo L = new eqo("key.playerlist", 258, "key.categories.multiplayer");
   public final eqo M = new eqo("key.command", 47, "key.categories.multiplayer");
   public final eqo N = new eqo("key.socialInteractions", 80, "key.categories.multiplayer");
   public final eqo O = new eqo("key.screenshot", 291, "key.categories.misc");
   public final eqo P = new eqo("key.togglePerspective", 294, "key.categories.misc");
   public final eqo Q = new eqo("key.smoothCamera", ekf.bv.b(), "key.categories.misc");
   public final eqo R = new eqo("key.fullscreen", 300, "key.categories.misc");
   public final eqo S = new eqo("key.spectatorOutlines", ekf.bv.b(), "key.categories.misc");
   public final eqo T = new eqo("key.advancements", 76, "key.categories.misc");
   public final eqo[] U = new eqo[]{
      new eqo("key.hotbar.1", 49, "key.categories.inventory"),
      new eqo("key.hotbar.2", 50, "key.categories.inventory"),
      new eqo("key.hotbar.3", 51, "key.categories.inventory"),
      new eqo("key.hotbar.4", 52, "key.categories.inventory"),
      new eqo("key.hotbar.5", 53, "key.categories.inventory"),
      new eqo("key.hotbar.6", 54, "key.categories.inventory"),
      new eqo("key.hotbar.7", 55, "key.categories.inventory"),
      new eqo("key.hotbar.8", 56, "key.categories.inventory"),
      new eqo("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final eqo V = new eqo("key.saveToolbarActivator", 67, "key.categories.creative");
   public final eqo W = new eqo("key.loadToolbarActivator", 88, "key.categories.creative");
   public final eqo[] X = (eqo[])ArrayUtils.addAll(
      new eqo[]{
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
   protected eqq Y;
   private final File bI;
   public boolean Z;
   private eqc bJ = eqc.a;
   public String aa = "";
   public boolean ab;
   private final eqt<Integer> bK = new eqt<>("options.fov", eqt.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, ti.c("options.fov.min"));
         case 110 -> a($$0x, ti.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new eqt.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> eqq.O().f.r());
   private static final ti bL = ti.a("options.telemetry.button.tooltip", ti.c("options.telemetry.state.minimal"), ti.c("options.telemetry.state.all"));
   private final eqt<Boolean> bM = eqt.a("options.telemetry.button", eqt.a(bL), ($$0x, $$1x) -> {
      eqq $$2x = eqq.O();
      if (!$$2x.C()) {
         return ti.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.B() ? ti.c("options.telemetry.state.all") : ti.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final ti bN = ti.c("options.screenEffectScale.tooltip");
   private final eqt<Double> bO = new eqt<>(
      "options.screenEffectScale", eqt.a(bN), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, th.c) : a($$0x, $$1x.doubleValue()), eqt.m.a, 1.0, $$0x -> {
      }
   );
   private static final ti bP = ti.c("options.fovEffectScale.tooltip");
   private final eqt<Double> bQ = new eqt<>(
      "options.fovEffectScale",
      eqt.a(bP),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, th.c) : a($$0x, $$1x.doubleValue()),
      eqt.m.a.a(ars::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final ti bR = ti.c("options.darknessEffectScale.tooltip");
   private final eqt<Double> bS = new eqt<>(
      "options.darknessEffectScale",
      eqt.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, th.c) : a($$0x, $$1x.doubleValue()),
      eqt.m.a.a(ars::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final ti bT = ti.c("options.glintSpeed.tooltip");
   private final eqt<Double> bU = new eqt<>(
      "options.glintSpeed", eqt.a(bT), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, th.c) : a($$0x, $$1x.doubleValue()), eqt.m.a, 0.5, $$0x -> {
      }
   );
   private static final ti bV = ti.c("options.glintStrength.tooltip");
   private final eqt<Double> bW = new eqt<>(
      "options.glintStrength",
      eqt.a(bV),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, th.c) : a($$0x, $$1x.doubleValue()),
      eqt.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final ti bX = ti.c("options.damageTiltStrength.tooltip");
   private final eqt<Double> bY = new eqt<>(
      "options.damageTiltStrength", eqt.a(bX), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, th.c) : a($$0x, $$1x.doubleValue()), eqt.m.a, 1.0, $$0x -> {
      }
   );
   private final eqt<Double> bZ = new eqt<>("options.gamma", eqt.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, ti.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, ti.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, ti.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, eqt.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int ca = 2147483646;
   private final eqt<Integer> cb = new eqt<>(
      "options.guiScale", eqt.a(), ($$0x, $$1x) -> $$1x == 0 ? ti.c("options.guiScale.auto") : ti.b(Integer.toString($$1x)), new eqt.c(0, () -> {
         eqq $$0x = eqq.O();
         return !$$0x.r() ? 2147483646 : $$0x.aM().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final eqt<eqv> cc = new eqt<>(
      "options.particles", eqt.a(), eqt.b(), new eqt.e<>(Arrays.asList(eqv.values()), Codec.INT.xmap(eqv::a, eqv::a)), eqv.a, $$0x -> {
      }
   );
   private final eqt<eqs> cd = new eqt<>(
      "options.narrator",
      eqt.a(),
      ($$0x, $$1x) -> (ti)(this.Y.aV().a() ? $$1x.b() : ti.c("options.narrator.notavailable")),
      new eqt.e<>(Arrays.asList(eqs.values()), Codec.INT.xmap(eqs::a, eqs::a)),
      eqs.a,
      $$0x -> this.Y.aV().a($$0x)
   );
   public String ad = "en_us";
   private final eqt<String> ce = new eqt<>(
      "options.audioDevice",
      eqt.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return ti.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? ti.b($$1x.substring(gdi.c)) : ti.b($$1x);
         }
      },
      new eqt.h<>(
         () -> Stream.concat(Stream.of(""), eqq.O().ai().a().stream()).toList(),
         $$0x -> eqq.O().r() && $$0x != "" && !eqq.O().ai().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gdl $$1x = eqq.O().ai();
         $$1x.i();
         $$1x.a(gcc.a(aoz.yu, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public eqt<Boolean> a() {
      return this.am;
   }

   public eqt<Boolean> b() {
      return this.ao;
   }

   public eqt<Double> c() {
      return this.ap;
   }

   public eqt<Integer> d() {
      return this.aq;
   }

   public eqt<Integer> e() {
      return this.ar;
   }

   public eqt<Double> f() {
      return this.at;
   }

   public eqt<Integer> g() {
      return this.au;
   }

   public eqt<eqe> h() {
      return this.av;
   }

   public eqt<eqj> i() {
      return this.az;
   }

   public eqt<Boolean> j() {
      return this.aA;
   }

   public eqt<eqx> k() {
      return this.aE;
   }

   public void a(ana $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (amx $$2 : $$0.f()) {
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

   public eqt<cbn> l() {
      return this.aF;
   }

   public eqt<Double> m() {
      return this.aG;
   }

   public eqt<Double> n() {
      return this.aH;
   }

   public eqt<Double> o() {
      return this.aI;
   }

   public eqt<Double> p() {
      return this.aJ;
   }

   public eqt<Boolean> q() {
      return this.aL;
   }

   public eqt<Boolean> r() {
      return this.aM;
   }

   public eqt<biv> s() {
      return this.aO;
   }

   public eqt<Double> t() {
      return this.aP;
   }

   public eqt<Double> u() {
      return this.aQ;
   }

   public eqt<Double> v() {
      return this.aR;
   }

   public eqt<Double> w() {
      return this.aS;
   }

   public eqt<Double> x() {
      return this.aT;
   }

   public eqt<Double> y() {
      return this.aV;
   }

   public eqt<Integer> z() {
      return this.aW;
   }

   public eqt<eqa> A() {
      return this.aX;
   }

   public eqt<Integer> B() {
      return this.aY;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ars.a(Math.log10($$0) * 100.0);
   }

   public eqt<Double> C() {
      return this.aZ;
   }

   public eqt<Boolean> D() {
      return this.ba;
   }

   public eqt<Boolean> E() {
      return this.bb;
   }

   public eqt<Boolean> F() {
      return this.bc;
   }

   public eqt<Boolean> G() {
      return this.bd;
   }

   public eqt<Boolean> H() {
      return this.be;
   }

   public eqt<Boolean> I() {
      return this.bf;
   }

   public eqt<Boolean> J() {
      return this.bg;
   }

   public eqt<Boolean> K() {
      return this.bh;
   }

   public eqt<Boolean> L() {
      return this.bi;
   }

   public eqt<Boolean> M() {
      return this.bj;
   }

   public eqt<Boolean> N() {
      return this.bk;
   }

   public eqt<Boolean> O() {
      return this.bl;
   }

   public eqt<Boolean> P() {
      return this.bm;
   }

   public eqt<Boolean> Q() {
      return this.bo;
   }

   public eqt<Boolean> R() {
      return this.bp;
   }

   public final float a(apa $$0) {
      return this.b($$0).c().floatValue();
   }

   public final eqt<Double> b(apa $$0) {
      return Objects.requireNonNull(this.bq.get($$0));
   }

   private eqt<Double> a(String $$0, apa $$1) {
      return new eqt<>(
         $$0, eqt.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, th.c) : a($$0x, $$1x.doubleValue()), eqt.m.a, 1.0, $$1x -> eqq.O().ai().a($$1, $$1x.floatValue())
      );
   }

   public eqt<Boolean> S() {
      return this.br;
   }

   public eqt<Boolean> T() {
      return this.bu;
   }

   public eqt<Boolean> U() {
      return this.bv;
   }

   public eqt<Boolean> V() {
      return this.bw;
   }

   public eqt<Boolean> W() {
      return this.bx;
   }

   public eqt<Boolean> X() {
      return this.by;
   }

   public eqt<Boolean> Y() {
      return this.bB;
   }

   public eqt<Boolean> Z() {
      return this.bC;
   }

   public eqt<Boolean> aa() {
      return this.bE;
   }

   public eqt<Boolean> ab() {
      return this.bF;
   }

   public eqt<Boolean> ac() {
      return this.bH;
   }

   public eqt<Integer> ad() {
      return this.bK;
   }

   public eqt<Boolean> ae() {
      return this.bM;
   }

   public eqt<Double> af() {
      return this.bO;
   }

   public eqt<Double> ag() {
      return this.bQ;
   }

   public eqt<Double> ah() {
      return this.bS;
   }

   public eqt<Double> ai() {
      return this.bU;
   }

   public eqt<Double> aj() {
      return this.bW;
   }

   public eqt<Double> ak() {
      return this.bY;
   }

   public eqt<Double> al() {
      return this.bZ;
   }

   public eqt<Integer> am() {
      return this.cb;
   }

   public eqt<eqv> an() {
      return this.cc;
   }

   public eqt<eqs> ao() {
      return this.cd;
   }

   public eqt<String> ap() {
      return this.ce;
   }

   public equ(eqq $$0, File $$1) {
      this.Y = $$0;
      this.bI = new File($$1, "options.txt");
      boolean $$2 = $$0.af();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new eqt<>(
         "options.renderDistance",
         eqt.a(),
         ($$0x, $$1x) -> a($$0x, ti.a("options.chunks", $$1x)),
         new eqt.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> eqq.O().f.r()
      );
      this.ar = new eqt<>(
         "options.simulationDistance", eqt.a(), ($$0x, $$1x) -> a($$0x, ti.a("options.chunks", $$1x)), new eqt.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
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

   public void a(eqo $$0, ekf.a $$1) {
      $$0.b($$1);
      this.ar();
   }

   private void a(equ.a $$0) {
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
      this.i = $$0.a("resourcePacks", this.i, equ::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, equ::c, ah::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, geq::a, geq::a);
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

      for (eqo $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(ekf.a($$3));
         }
      }

      for (apa $$4 : apa.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bq.get($$4));
      }

      for (cbq $$5 : cbq.values()) {
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

         qu $$0 = new qu();

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

         final qu $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.az.a(eqj.b);
            } else {
               this.az.a(eqj.a);
            }
         }

         this.a(new equ.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, eqt<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> equ.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     equ.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? equ.a($$2) : $$1;
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
               } else if (equ.a($$2)) {
                  return 1.0F;
               } else if (equ.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     equ.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         eqo.d();
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

   private qu a(qu $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return asv.e.a(this.Y.ar(), $$0, $$1);
   }

   public void ar() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bI), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new equ.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, eqt<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> equ.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(equ.ah.toJson($$2x));
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

         for (cbq $$1 : this.aN) {
            $$0 |= $$1.a();
         }

         this.Y.s.cl.b(new abl(this.ad, this.aq.c(), this.aF.c(), this.be.c(), $$0, this.aO.c(), this.Y.aQ(), this.bo.c()));
      }
   }

   private void b(cbq $$0, boolean $$1) {
      if ($$1) {
         this.aN.add($$0);
      } else {
         this.aN.remove($$0);
      }
   }

   public boolean a(cbq $$0) {
      return this.aN.contains($$0);
   }

   public void a(cbq $$0, boolean $$1) {
      this.b($$0, $$1);
      this.as();
   }

   public eqe at() {
      return this.ay() >= 4 ? this.av.c() : eqe.a;
   }

   public boolean au() {
      return this.q;
   }

   public void b(ana $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         amx $$4 = $$0.c($$3);
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

   public eqc av() {
      return this.bJ;
   }

   public void a(eqc $$0) {
      this.bJ = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = arj.a(ah, $$0, ai);
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

   private static ti b(ti $$0, int $$1) {
      return ti.a("options.pixel_value", $$0, $$1);
   }

   private static ti a(ti $$0, double $$1) {
      return ti.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static ti a(ti $$0, ti $$1) {
      return ti.a("options.generic_value", $$0, $$1);
   }

   public static ti a(ti $$0, int $$1) {
      return a($$0, ti.b(Integer.toString($$1)));
   }

   interface a {
      <T> void a(String var1, eqt<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
