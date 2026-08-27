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

public class erb {
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
   private static final tn al = tn.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final era<Boolean> am = era.a("options.darkMojangStudiosBackgroundColor", era.a(al), false);
   private static final tn an = tn.c("options.hideLightningFlashes.tooltip");
   private final era<Boolean> ao = era.a("options.hideLightningFlashes", era.a(an), false);
   private final era<Double> ap = new era<>("options.sensitivity", era.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, tn.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, tn.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, era.m.a, 0.5, $$0x -> {
   });
   private final era<Integer> aq;
   private final era<Integer> ar;
   private int as = 0;
   private final era<Double> at = new era<>(
      "options.entityDistanceScaling",
      era.a(),
      erb::a,
      new era.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final era<Integer> au = new era<>(
      "options.framerateLimit",
      era.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, tn.c("options.framerateLimit.max")) : a($$0x, tn.a("options.framerate", $$1x)),
      new era.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> eqx.O().aM().a($$0x)
   );
   private final era<eql> av = new era<>(
      "options.renderClouds",
      era.a(),
      era.b(),
      new era.e<>(Arrays.asList(eql.values()), arh.a(eql.d, Codec.BOOL, $$0x -> $$0x ? eql.c : eql.a)),
      eql.c,
      $$0x -> {
         if (eqx.M()) {
            ekd $$1x = eqx.O().f.x();
            if ($$1x != null) {
               $$1x.b(eqx.a);
            }
         }
      }
   );
   private static final tn aw = tn.c("options.graphics.fast.tooltip");
   private static final tn ax = tn.a("options.graphics.fabulous.tooltip", tn.c("options.graphics.fabulous").a(n.u));
   private static final tn ay = tn.c("options.graphics.fancy.tooltip");
   private final era<eqq> az = new era<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> euc.a(ay);
            case a -> euc.a(aw);
            case c -> euc.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         ua $$2x = tn.c($$1x.b());
         return $$1x == eqq.c ? $$2x.a(n.u) : $$2x;
      },
      new era.a<>(
         Arrays.asList(eqq.values()),
         Stream.of(eqq.values()).filter($$0x -> $$0x != eqq.c).collect(Collectors.toList()),
         () -> eqx.O().r() && eqx.O().ah().h(),
         ($$0x, $$1x) -> {
            eqx $$2x = eqx.O();
            foa $$3x = $$2x.ah();
            if ($$1x == eqq.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(eqq::a, eqq::a)
      ),
      eqq.b,
      $$0x -> {
      }
   );
   private final era<Boolean> aA = era.a("options.ao", true, $$0x -> eqx.O().f.f());
   private static final tn aB = tn.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final tn aC = tn.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final tn aD = tn.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final era<ere> aE = new era<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> euc.a(aB);
         case b -> euc.a(aC);
         case c -> euc.a(aD);
      };
   }, era.b(), new era.e<>(Arrays.asList(ere.values()), Codec.INT.xmap(ere::a, ere::a)), ere.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final era<cbu> aF = new era<>(
      "options.chat.visibility", era.a(), era.b(), new era.e<>(Arrays.asList(cbu.values()), Codec.INT.xmap(cbu::a, cbu::a)), cbu.a, $$0x -> {
      }
   );
   private final era<Double> aG = new era<>("options.chat.opacity", era.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), era.m.a, 1.0, $$0x -> eqx.O().l.d().b());
   private final era<Double> aH = new era<>("options.chat.line_spacing", era.a(), erb::a, era.m.a, 0.0, $$0x -> {
   });
   private final era<Double> aI = new era<>("options.accessibility.text_background_opacity", era.a(), erb::a, era.m.a, 0.5, $$0x -> eqx.O().l.d().b());
   private final era<Double> aJ = new era<>("options.accessibility.panorama_speed", era.a(), erb::a, era.m.a, 1.0, $$0x -> {
   });
   private static final tn aK = tn.c("options.accessibility.high_contrast.tooltip");
   private final era<Boolean> aL = era.a("options.accessibility.high_contrast", era.a(aK), false, $$0x -> {
      ang $$1x = eqx.O().aa();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final era<Boolean> aM = era.a("options.accessibility.narrator_hotkey", era.a(tn.c("options.accessibility.narrator_hotkey.tooltip")), true);
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cbx> aN = EnumSet.allOf(cbx.class);
   private final era<bjc> aO = new era<>("options.mainHand", era.a(), era.b(), new era.e<>(Arrays.asList(bjc.values()), bjc.c), bjc.b, $$0x -> this.at());
   public int o;
   public int p;
   private final era<Double> aP = new era<>(
      "options.chat.scale",
      era.a(),
      ($$0x, $$1x) -> (tn)($$1x == 0.0 ? tm.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      era.m.a,
      1.0,
      $$0x -> eqx.O().l.d().b()
   );
   private final era<Double> aQ = new era<>("options.chat.width", era.a(), ($$0x, $$1x) -> b($$0x, est.a($$1x)), era.m.a, 1.0, $$0x -> eqx.O().l.d().b());
   private final era<Double> aR = new era<>(
      "options.chat.height.unfocused", era.a(), ($$0x, $$1x) -> b($$0x, est.b($$1x)), era.m.a, est.h(), $$0x -> eqx.O().l.d().b()
   );
   private final era<Double> aS = new era<>(
      "options.chat.height.focused", era.a(), ($$0x, $$1x) -> b($$0x, est.b($$1x)), era.m.a, 1.0, $$0x -> eqx.O().l.d().b()
   );
   private final era<Double> aT = new era<>(
      "options.chat.delay_instant",
      era.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? tn.c("options.chat.delay_none") : tn.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new era.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> eqx.O().aW().a($$0x)
   );
   private static final tn aU = tn.c("options.notifications.display_time.tooltip");
   private final era<Double> aV = new era<>(
      "options.notifications.display_time",
      era.a(aU),
      ($$0x, $$1x) -> a($$0x, tn.a("options.multiplier", $$1x)),
      new era.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final era<Integer> aW = new era<>(
      "options.mipmapLevels", era.a(), ($$0x, $$1x) -> (tn)($$1x == 0 ? tm.a($$0x, false) : a($$0x, $$1x.intValue())), new era.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final era<eqh> aX = new era<>(
      "options.attackIndicator", era.a(), era.b(), new era.e<>(Arrays.asList(eqh.values()), Codec.INT.xmap(eqh::a, eqh::a)), eqh.b, $$0x -> {
      }
   );
   public gex r = gex.a;
   public boolean s = false;
   public boolean t = false;
   private final era<Integer> aY = new era<>("options.biomeBlendRadius", era.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, tn.c("options.biomeBlendRadius." + $$2x));
   }, new era.f(0, 7), 2, $$0x -> eqx.O().f.f());
   private final era<Double> aZ = new era<>(
      "options.mouseWheelSensitivity",
      era.a(),
      ($$0x, $$1x) -> a($$0x, tn.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new era.f(-200, 100).a(erb::c, erb::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final era<Boolean> ba = era.a("options.rawMouseInput", true, $$0x -> {
      ekv $$1x = eqx.O().aM();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final era<Boolean> bb = era.a("options.autoJump", false);
   private final era<Boolean> bc = era.a("options.operatorItemsTab", false);
   private final era<Boolean> bd = era.a("options.autoSuggestCommands", true);
   private final era<Boolean> be = era.a("options.chat.color", true);
   private final era<Boolean> bf = era.a("options.chat.links", true);
   private final era<Boolean> bg = era.a("options.chat.links.prompt", true);
   private final era<Boolean> bh = era.a("options.vsync", true, $$0x -> {
      if (eqx.O().aM() != null) {
         eqx.O().aM().a($$0x);
      }
   });
   private final era<Boolean> bi = era.a("options.entityShadows", true);
   private final era<Boolean> bj = era.a("options.forceUnicodeFont", false, $$0x -> {
      eqx $$1x = eqx.O();
      if ($$1x.aM() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final era<Boolean> bk = era.a("options.invertMouse", false);
   private final era<Boolean> bl = era.a("options.discrete_mouse_scroll", false);
   private final era<Boolean> bm = era.a("options.realmsNotifications", true);
   private static final tn bn = tn.c("options.allowServerListing.tooltip");
   private final era<Boolean> bo = era.a("options.allowServerListing", era.a(bn), true, $$0x -> this.at());
   private final era<Boolean> bp = era.a("options.reducedDebugInfo", false);
   private final Map<apg, era<Double>> bq = ac.a(new EnumMap<>(apg.class), $$0x -> {
      for (apg $$1x : apg.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final era<Boolean> br = era.a("options.showSubtitles", false);
   private static final tn bs = tn.c("options.directionalAudio.on.tooltip");
   private static final tn bt = tn.c("options.directionalAudio.off.tooltip");
   private final era<Boolean> bu = era.a("options.directionalAudio", $$0x -> $$0x ? euc.a(bs) : euc.a(bt), false, $$0x -> {
      gds $$1x = eqx.O().ai();
      $$1x.i();
      $$1x.a(gcj.a(apf.yu, 1.0F));
   });
   private final era<Boolean> bv = new era<>(
      "options.accessibility.text_background",
      era.a(),
      ($$0x, $$1x) -> $$1x ? tn.c("options.accessibility.text_background.chat") : tn.c("options.accessibility.text_background.everywhere"),
      era.a,
      true,
      $$0x -> {
      }
   );
   private final era<Boolean> bw = era.a("options.touchscreen", false);
   private final era<Boolean> bx = era.a("options.fullscreen", false, $$0x -> {
      eqx $$1x = eqx.O();
      if ($$1x.aM() != null && $$1x.aM().j() != $$0x) {
         $$1x.aM().h();
         this.W().a($$1x.aM().j());
      }
   });
   private final era<Boolean> by = era.a("options.viewBobbing", true);
   private static final tn bz = tn.c("options.key.toggle");
   private static final tn bA = tn.c("options.key.hold");
   private final era<Boolean> bB = new era<>("key.sneak", era.a(), ($$0x, $$1x) -> $$1x ? bz : bA, era.a, false, $$0x -> {
   });
   private final era<Boolean> bC = new era<>("key.sprint", era.a(), ($$0x, $$1x) -> $$1x ? bz : bA, era.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final tn bD = tn.c("options.hideMatchedNames.tooltip");
   private final era<Boolean> bE = era.a("options.hideMatchedNames", era.a(bD), true);
   private final era<Boolean> bF = era.a("options.autosaveIndicator", true);
   private static final tn bG = tn.c("options.onlyShowSecureChat.tooltip");
   private final era<Boolean> bH = era.a("options.onlyShowSecureChat", era.a(bG), false);
   public final eqv x = new eqv("key.forward", 87, "key.categories.movement");
   public final eqv y = new eqv("key.left", 65, "key.categories.movement");
   public final eqv z = new eqv("key.back", 83, "key.categories.movement");
   public final eqv A = new eqv("key.right", 68, "key.categories.movement");
   public final eqv B = new eqv("key.jump", 32, "key.categories.movement");
   public final eqv C = new erl("key.sneak", 340, "key.categories.movement", this.bB::c);
   public final eqv D = new erl("key.sprint", 341, "key.categories.movement", this.bC::c);
   public final eqv E = new eqv("key.inventory", 69, "key.categories.inventory");
   public final eqv F = new eqv("key.swapOffhand", 70, "key.categories.inventory");
   public final eqv G = new eqv("key.drop", 81, "key.categories.inventory");
   public final eqv H = new eqv("key.use", ekm.b.c, 1, "key.categories.gameplay");
   public final eqv I = new eqv("key.attack", ekm.b.c, 0, "key.categories.gameplay");
   public final eqv J = new eqv("key.pickItem", ekm.b.c, 2, "key.categories.gameplay");
   public final eqv K = new eqv("key.chat", 84, "key.categories.multiplayer");
   public final eqv L = new eqv("key.playerlist", 258, "key.categories.multiplayer");
   public final eqv M = new eqv("key.command", 47, "key.categories.multiplayer");
   public final eqv N = new eqv("key.socialInteractions", 80, "key.categories.multiplayer");
   public final eqv O = new eqv("key.screenshot", 291, "key.categories.misc");
   public final eqv P = new eqv("key.togglePerspective", 294, "key.categories.misc");
   public final eqv Q = new eqv("key.smoothCamera", ekm.bv.b(), "key.categories.misc");
   public final eqv R = new eqv("key.fullscreen", 300, "key.categories.misc");
   public final eqv S = new eqv("key.spectatorOutlines", ekm.bv.b(), "key.categories.misc");
   public final eqv T = new eqv("key.advancements", 76, "key.categories.misc");
   public final eqv[] U = new eqv[]{
      new eqv("key.hotbar.1", 49, "key.categories.inventory"),
      new eqv("key.hotbar.2", 50, "key.categories.inventory"),
      new eqv("key.hotbar.3", 51, "key.categories.inventory"),
      new eqv("key.hotbar.4", 52, "key.categories.inventory"),
      new eqv("key.hotbar.5", 53, "key.categories.inventory"),
      new eqv("key.hotbar.6", 54, "key.categories.inventory"),
      new eqv("key.hotbar.7", 55, "key.categories.inventory"),
      new eqv("key.hotbar.8", 56, "key.categories.inventory"),
      new eqv("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final eqv V = new eqv("key.saveToolbarActivator", 67, "key.categories.creative");
   public final eqv W = new eqv("key.loadToolbarActivator", 88, "key.categories.creative");
   public final eqv[] X = (eqv[])ArrayUtils.addAll(
      new eqv[]{
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
   protected eqx Y;
   private final File bI;
   public boolean Z;
   private eqj bJ = eqj.a;
   public String aa = "";
   public boolean ab;
   private final era<Integer> bK = new era<>("options.fov", era.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, tn.c("options.fov.min"));
         case 110 -> a($$0x, tn.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new era.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> eqx.O().f.r());
   private static final tn bL = tn.a("options.telemetry.button.tooltip", tn.c("options.telemetry.state.minimal"), tn.c("options.telemetry.state.all"));
   private final era<Boolean> bM = era.a("options.telemetry.button", era.a(bL), ($$0x, $$1x) -> {
      eqx $$2x = eqx.O();
      if (!$$2x.C()) {
         return tn.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.B() ? tn.c("options.telemetry.state.all") : tn.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final tn bN = tn.c("options.screenEffectScale.tooltip");
   private final era<Double> bO = new era<>(
      "options.screenEffectScale", era.a(bN), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tm.c) : a($$0x, $$1x.doubleValue()), era.m.a, 1.0, $$0x -> {
      }
   );
   private static final tn bP = tn.c("options.fovEffectScale.tooltip");
   private final era<Double> bQ = new era<>(
      "options.fovEffectScale",
      era.a(bP),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tm.c) : a($$0x, $$1x.doubleValue()),
      era.m.a.a(ary::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final tn bR = tn.c("options.darknessEffectScale.tooltip");
   private final era<Double> bS = new era<>(
      "options.darknessEffectScale",
      era.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tm.c) : a($$0x, $$1x.doubleValue()),
      era.m.a.a(ary::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final tn bT = tn.c("options.glintSpeed.tooltip");
   private final era<Double> bU = new era<>(
      "options.glintSpeed", era.a(bT), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tm.c) : a($$0x, $$1x.doubleValue()), era.m.a, 0.5, $$0x -> {
      }
   );
   private static final tn bV = tn.c("options.glintStrength.tooltip");
   private final era<Double> bW = new era<>(
      "options.glintStrength",
      era.a(bV),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tm.c) : a($$0x, $$1x.doubleValue()),
      era.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final tn bX = tn.c("options.damageTiltStrength.tooltip");
   private final era<Double> bY = new era<>(
      "options.damageTiltStrength", era.a(bX), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tm.c) : a($$0x, $$1x.doubleValue()), era.m.a, 1.0, $$0x -> {
      }
   );
   private final era<Double> bZ = new era<>("options.gamma", era.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, tn.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, tn.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, tn.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, era.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int ca = 2147483646;
   private final era<Integer> cb = new era<>(
      "options.guiScale", era.a(), ($$0x, $$1x) -> $$1x == 0 ? tn.c("options.guiScale.auto") : tn.b(Integer.toString($$1x)), new era.c(0, () -> {
         eqx $$0x = eqx.O();
         return !$$0x.r() ? 2147483646 : $$0x.aM().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final era<erc> cc = new era<>(
      "options.particles", era.a(), era.b(), new era.e<>(Arrays.asList(erc.values()), Codec.INT.xmap(erc::a, erc::a)), erc.a, $$0x -> {
      }
   );
   private final era<eqz> cd = new era<>(
      "options.narrator",
      era.a(),
      ($$0x, $$1x) -> (tn)(this.Y.aV().a() ? $$1x.b() : tn.c("options.narrator.notavailable")),
      new era.e<>(Arrays.asList(eqz.values()), Codec.INT.xmap(eqz::a, eqz::a)),
      eqz.a,
      $$0x -> this.Y.aV().a($$0x)
   );
   public String ad = "en_us";
   private final era<String> ce = new era<>(
      "options.audioDevice",
      era.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return tn.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? tn.b($$1x.substring(gdp.c)) : tn.b($$1x);
         }
      },
      new era.h<>(
         () -> Stream.concat(Stream.of(""), eqx.O().ai().a().stream()).toList(),
         $$0x -> eqx.O().r() && $$0x != "" && !eqx.O().ai().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gds $$1x = eqx.O().ai();
         $$1x.i();
         $$1x.a(gcj.a(apf.yu, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public era<Boolean> a() {
      return this.am;
   }

   public era<Boolean> b() {
      return this.ao;
   }

   public era<Double> c() {
      return this.ap;
   }

   public era<Integer> d() {
      return this.aq;
   }

   public era<Integer> e() {
      return this.ar;
   }

   public era<Double> f() {
      return this.at;
   }

   public era<Integer> g() {
      return this.au;
   }

   public era<eql> h() {
      return this.av;
   }

   public era<eqq> i() {
      return this.az;
   }

   public era<Boolean> j() {
      return this.aA;
   }

   public era<ere> k() {
      return this.aE;
   }

   public void a(ang $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (and $$2 : $$0.f()) {
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

   public era<cbu> l() {
      return this.aF;
   }

   public era<Double> m() {
      return this.aG;
   }

   public era<Double> n() {
      return this.aH;
   }

   public era<Double> o() {
      return this.aI;
   }

   public era<Double> p() {
      return this.aJ;
   }

   public era<Boolean> q() {
      return this.aL;
   }

   public era<Boolean> r() {
      return this.aM;
   }

   public era<bjc> s() {
      return this.aO;
   }

   public era<Double> t() {
      return this.aP;
   }

   public era<Double> u() {
      return this.aQ;
   }

   public era<Double> v() {
      return this.aR;
   }

   public era<Double> w() {
      return this.aS;
   }

   public era<Double> x() {
      return this.aT;
   }

   public era<Double> y() {
      return this.aV;
   }

   public era<Integer> z() {
      return this.aW;
   }

   public era<eqh> A() {
      return this.aX;
   }

   public era<Integer> B() {
      return this.aY;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ary.a(Math.log10($$0) * 100.0);
   }

   public era<Double> C() {
      return this.aZ;
   }

   public era<Boolean> D() {
      return this.ba;
   }

   public era<Boolean> E() {
      return this.bb;
   }

   public era<Boolean> F() {
      return this.bc;
   }

   public era<Boolean> G() {
      return this.bd;
   }

   public era<Boolean> H() {
      return this.be;
   }

   public era<Boolean> I() {
      return this.bf;
   }

   public era<Boolean> J() {
      return this.bg;
   }

   public era<Boolean> K() {
      return this.bh;
   }

   public era<Boolean> L() {
      return this.bi;
   }

   public era<Boolean> M() {
      return this.bj;
   }

   public era<Boolean> N() {
      return this.bk;
   }

   public era<Boolean> O() {
      return this.bl;
   }

   public era<Boolean> P() {
      return this.bm;
   }

   public era<Boolean> Q() {
      return this.bo;
   }

   public era<Boolean> R() {
      return this.bp;
   }

   public final float a(apg $$0) {
      return this.b($$0).c().floatValue();
   }

   public final era<Double> b(apg $$0) {
      return Objects.requireNonNull(this.bq.get($$0));
   }

   private era<Double> a(String $$0, apg $$1) {
      return new era<>(
         $$0, era.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tm.c) : a($$0x, $$1x.doubleValue()), era.m.a, 1.0, $$1x -> eqx.O().ai().a($$1, $$1x.floatValue())
      );
   }

   public era<Boolean> S() {
      return this.br;
   }

   public era<Boolean> T() {
      return this.bu;
   }

   public era<Boolean> U() {
      return this.bv;
   }

   public era<Boolean> V() {
      return this.bw;
   }

   public era<Boolean> W() {
      return this.bx;
   }

   public era<Boolean> X() {
      return this.by;
   }

   public era<Boolean> Y() {
      return this.bB;
   }

   public era<Boolean> Z() {
      return this.bC;
   }

   public era<Boolean> aa() {
      return this.bE;
   }

   public era<Boolean> ab() {
      return this.bF;
   }

   public era<Boolean> ac() {
      return this.bH;
   }

   public era<Integer> ad() {
      return this.bK;
   }

   public era<Boolean> ae() {
      return this.bM;
   }

   public era<Double> af() {
      return this.bO;
   }

   public era<Double> ag() {
      return this.bQ;
   }

   public era<Double> ah() {
      return this.bS;
   }

   public era<Double> ai() {
      return this.bU;
   }

   public era<Double> aj() {
      return this.bW;
   }

   public era<Double> ak() {
      return this.bY;
   }

   public era<Double> al() {
      return this.bZ;
   }

   public era<Integer> am() {
      return this.cb;
   }

   public era<erc> an() {
      return this.cc;
   }

   public era<eqz> ao() {
      return this.cd;
   }

   public era<String> ap() {
      return this.ce;
   }

   public erb(eqx $$0, File $$1) {
      this.Y = $$0;
      this.bI = new File($$1, "options.txt");
      boolean $$2 = $$0.af();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new era<>(
         "options.renderDistance",
         era.a(),
         ($$0x, $$1x) -> a($$0x, tn.a("options.chunks", $$1x)),
         new era.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> eqx.O().f.r()
      );
      this.ar = new era<>(
         "options.simulationDistance", era.a(), ($$0x, $$1x) -> a($$0x, tn.a("options.chunks", $$1x)), new era.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
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

   public void a(eqv $$0, ekm.a $$1) {
      $$0.b($$1);
      this.ar();
   }

   private void a(erb.a $$0) {
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
      this.i = $$0.a("resourcePacks", this.i, erb::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, erb::c, ah::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, gex::a, gex::a);
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

      for (eqv $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(ekm.a($$3));
         }
      }

      for (apg $$4 : apg.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bq.get($$4));
      }

      for (cbx $$5 : cbx.values()) {
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

         qy $$0 = new qy();

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

         final qy $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.az.a(eqq.b);
            } else {
               this.az.a(eqq.a);
            }
         }

         this.a(new erb.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, era<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> erb.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     erb.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? erb.a($$2) : $$1;
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
               } else if (erb.a($$2)) {
                  return 1.0F;
               } else if (erb.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     erb.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         eqv.d();
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

   private qy a(qy $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return atc.e.a(this.Y.ar(), $$0, $$1);
   }

   public void ar() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bI), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new erb.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, era<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> erb.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(erb.ah.toJson($$2x));
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

      this.at();
   }

   public akh as() {
      int $$0 = 0;

      for (cbx $$1 : this.aN) {
         $$0 |= $$1.a();
      }

      return new akh(this.ad, this.aq.c(), this.aF.c(), this.be.c(), $$0, this.aO.c(), this.Y.aQ(), this.bo.c());
   }

   public void at() {
      if (this.Y.s != null) {
         this.Y.s.cn.b(new vq(this.as()));
      }
   }

   private void b(cbx $$0, boolean $$1) {
      if ($$1) {
         this.aN.add($$0);
      } else {
         this.aN.remove($$0);
      }
   }

   public boolean a(cbx $$0) {
      return this.aN.contains($$0);
   }

   public void a(cbx $$0, boolean $$1) {
      this.b($$0, $$1);
      this.at();
   }

   public eql au() {
      return this.az() >= 4 ? this.av.c() : eql.a;
   }

   public boolean av() {
      return this.q;
   }

   public void b(ang $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         and $$4 = $$0.c($$3);
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

   public eqj aw() {
      return this.bJ;
   }

   public void a(eqj $$0) {
      this.bJ = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = arp.a(ah, $$0, ai);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File ax() {
      return this.bI;
   }

   public String ay() {
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

   public int az() {
      return this.as > 0 ? Math.min(this.aq.c(), this.as) : this.aq.c();
   }

   private static tn b(tn $$0, int $$1) {
      return tn.a("options.pixel_value", $$0, $$1);
   }

   private static tn a(tn $$0, double $$1) {
      return tn.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static tn a(tn $$0, tn $$1) {
      return tn.a("options.generic_value", $$0, $$1);
   }

   public static tn a(tn $$0, int $$1) {
      return a($$0, tn.b(Integer.toString($$1)));
   }

   interface a {
      <T> void a(String var1, era<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
