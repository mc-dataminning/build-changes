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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

public class ezm {
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
   private static final vu al = vu.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final ezl<Boolean> am = ezl.a("options.darkMojangStudiosBackgroundColor", ezl.a(al), false);
   private static final vu an = vu.c("options.hideLightningFlashes.tooltip");
   private final ezl<Boolean> ao = ezl.a("options.hideLightningFlashes", ezl.a(an), false);
   private static final vu ap = vu.c("options.hideSplashTexts.tooltip");
   private final ezl<Boolean> aq = ezl.a("options.hideSplashTexts", ezl.a(ap), false);
   private final ezl<Double> ar = new ezl<>("options.sensitivity", ezl.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, vu.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, vu.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, ezl.m.a, 0.5, $$0x -> {
   });
   private final ezl<Integer> as;
   private final ezl<Integer> at;
   private int au = 0;
   private final ezl<Double> av = new ezl<>(
      "options.entityDistanceScaling",
      ezl.a(),
      ezm::a,
      new ezl.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final ezl<Integer> aw = new ezl<>(
      "options.framerateLimit",
      ezl.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, vu.c("options.framerateLimit.max")) : a($$0x, vu.a("options.framerate", $$1x)),
      new ezl.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> ezi.Q().aO().a($$0x)
   );
   private final ezl<eyw> ax = new ezl<>(
      "options.renderClouds",
      ezl.a(),
      ezl.b(),
      new ezl.e<>(Arrays.asList(eyw.values()), awe.a(eyw.d, Codec.BOOL, $$0x -> $$0x ? eyw.c : eyw.a)),
      eyw.c,
      $$0x -> {
         if (ezi.O()) {
            esn $$1x = ezi.Q().f.x();
            if ($$1x != null) {
               $$1x.b(ezi.a);
            }
         }
      }
   );
   private static final vu ay = vu.c("options.graphics.fast.tooltip");
   private static final vu az = vu.a("options.graphics.fabulous.tooltip", vu.c("options.graphics.fabulous").a(n.u));
   private static final vu aA = vu.c("options.graphics.fancy.tooltip");
   private final ezl<ezb> aB = new ezl<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fct.a(aA);
            case a -> fct.a(ay);
            case c -> fct.a(az);
         };
      },
      ($$0x, $$1x) -> {
         wi $$2x = vu.c($$1x.b());
         return $$1x == ezb.c ? $$2x.a(n.u) : $$2x;
      },
      new ezl.a<>(
         Arrays.asList(ezb.values()),
         Stream.of(ezb.values()).filter($$0x -> $$0x != ezb.c).collect(Collectors.toList()),
         () -> ezi.Q().r() && ezi.Q().aj().h(),
         ($$0x, $$1x) -> {
            ezi $$2x = ezi.Q();
            fxm $$3x = $$2x.aj();
            if ($$1x == ezb.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(ezb::a, ezb::a)
      ),
      ezb.b,
      $$0x -> {
      }
   );
   private final ezl<Boolean> aC = ezl.a("options.ao", true, $$0x -> ezi.Q().f.f());
   private static final vu aD = vu.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final vu aE = vu.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final vu aF = vu.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final ezl<ezp> aG = new ezl<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fct.a(aD);
         case b -> fct.a(aE);
         case c -> fct.a(aF);
      };
   }, ezl.b(), new ezl.e<>(Arrays.asList(ezp.values()), Codec.INT.xmap(ezp::a, ezp::a)), ezp.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final ezl<cis> aH = new ezl<>(
      "options.chat.visibility", ezl.a(), ezl.b(), new ezl.e<>(Arrays.asList(cis.values()), Codec.INT.xmap(cis::a, cis::a)), cis.a, $$0x -> {
      }
   );
   private final ezl<Double> aI = new ezl<>("options.chat.opacity", ezl.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), ezl.m.a, 1.0, $$0x -> ezi.Q().l.d().b());
   private final ezl<Double> aJ = new ezl<>("options.chat.line_spacing", ezl.a(), ezm::a, ezl.m.a, 0.0, $$0x -> {
   });
   private final ezl<Double> aK = new ezl<>("options.accessibility.text_background_opacity", ezl.a(), ezm::a, ezl.m.a, 0.5, $$0x -> ezi.Q().l.d().b());
   private final ezl<Double> aL = new ezl<>("options.accessibility.panorama_speed", ezl.a(), ezm::a, ezl.m.a, 1.0, $$0x -> {
   });
   private static final vu aM = vu.c("options.accessibility.high_contrast.tooltip");
   private final ezl<Boolean> aN = ezl.a("options.accessibility.high_contrast", ezl.a(aM), false, $$0x -> {
      arz $$1x = ezi.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final ezl<Boolean> aO = ezl.a(
      "options.accessibility.narrator_hotkey",
      ezl.a(ezi.a ? vu.c("options.accessibility.narrator_hotkey.mac.tooltip") : vu.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<civ> aP = EnumSet.allOf(civ.class);
   private final ezl<bpj> aQ = new ezl<>("options.mainHand", ezl.a(), ezl.b(), new ezl.e<>(Arrays.asList(bpj.values()), bpj.c), bpj.b, $$0x -> this.av());
   public int o;
   public int p;
   private final ezl<Double> aR = new ezl<>(
      "options.chat.scale",
      ezl.a(),
      ($$0x, $$1x) -> (vu)($$1x == 0.0 ? vt.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      ezl.m.a,
      1.0,
      $$0x -> ezi.Q().l.d().b()
   );
   private final ezl<Double> aS = new ezl<>("options.chat.width", ezl.a(), ($$0x, $$1x) -> b($$0x, fbj.a($$1x)), ezl.m.a, 1.0, $$0x -> ezi.Q().l.d().b());
   private final ezl<Double> aT = new ezl<>(
      "options.chat.height.unfocused", ezl.a(), ($$0x, $$1x) -> b($$0x, fbj.b($$1x)), ezl.m.a, fbj.i(), $$0x -> ezi.Q().l.d().b()
   );
   private final ezl<Double> aU = new ezl<>(
      "options.chat.height.focused", ezl.a(), ($$0x, $$1x) -> b($$0x, fbj.b($$1x)), ezl.m.a, 1.0, $$0x -> ezi.Q().l.d().b()
   );
   private final ezl<Double> aV = new ezl<>(
      "options.chat.delay_instant",
      ezl.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? vu.c("options.chat.delay_none") : vu.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new ezl.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> ezi.Q().aZ().a($$0x)
   );
   private static final vu aW = vu.c("options.notifications.display_time.tooltip");
   private final ezl<Double> aX = new ezl<>(
      "options.notifications.display_time",
      ezl.a(aW),
      ($$0x, $$1x) -> a($$0x, vu.a("options.multiplier", $$1x)),
      new ezl.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final ezl<Integer> aY = new ezl<>(
      "options.mipmapLevels", ezl.a(), ($$0x, $$1x) -> (vu)($$1x == 0 ? vt.a($$0x, false) : a($$0x, $$1x.intValue())), new ezl.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final ezl<eys> aZ = new ezl<>(
      "options.attackIndicator", ezl.a(), ezl.b(), new ezl.e<>(Arrays.asList(eys.values()), Codec.INT.xmap(eys::a, eys::a)), eys.b, $$0x -> {
      }
   );
   public goy r = goy.a;
   public boolean s = false;
   public boolean t = false;
   private final ezl<Integer> ba = new ezl<>("options.biomeBlendRadius", ezl.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, vu.c("options.biomeBlendRadius." + $$2x));
   }, new ezl.f(0, 7), 2, $$0x -> ezi.Q().f.f());
   private final ezl<Double> bb = new ezl<>(
      "options.mouseWheelSensitivity",
      ezl.a(),
      ($$0x, $$1x) -> a($$0x, vu.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new ezl.f(-200, 100).a(ezm::c, ezm::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final ezl<Boolean> bc = ezl.a("options.rawMouseInput", true, $$0x -> {
      etf $$1x = ezi.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final ezl<Boolean> bd = ezl.a("options.autoJump", false);
   private final ezl<Boolean> be = ezl.a("options.operatorItemsTab", false);
   private final ezl<Boolean> bf = ezl.a("options.autoSuggestCommands", true);
   private final ezl<Boolean> bg = ezl.a("options.chat.color", true);
   private final ezl<Boolean> bh = ezl.a("options.chat.links", true);
   private final ezl<Boolean> bi = ezl.a("options.chat.links.prompt", true);
   private final ezl<Boolean> bj = ezl.a("options.vsync", true, $$0x -> {
      if (ezi.Q().aO() != null) {
         ezi.Q().aO().a($$0x);
      }
   });
   private final ezl<Boolean> bk = ezl.a("options.entityShadows", true);
   private final ezl<Boolean> bl = ezl.a("options.forceUnicodeFont", false, $$0x -> aC());
   private final ezl<Boolean> bm = ezl.a("options.japaneseGlyphVariants", ezl.a(vu.c("options.japaneseGlyphVariants.tooltip")), aD(), $$0x -> aC());
   private final ezl<Boolean> bn = ezl.a("options.invertMouse", false);
   private final ezl<Boolean> bo = ezl.a("options.discrete_mouse_scroll", false);
   private final ezl<Boolean> bp = ezl.a("options.realmsNotifications", true);
   private static final vu bq = vu.c("options.allowServerListing.tooltip");
   private final ezl<Boolean> br = ezl.a("options.allowServerListing", ezl.a(bq), true, $$0x -> this.av());
   private final ezl<Boolean> bs = ezl.a("options.reducedDebugInfo", false);
   private final Map<atz, ezl<Double>> bt = ac.a(new EnumMap<>(atz.class), $$0x -> {
      for (atz $$1x : atz.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final ezl<Boolean> bu = ezl.a("options.showSubtitles", false);
   private static final vu bv = vu.c("options.directionalAudio.on.tooltip");
   private static final vu bw = vu.c("options.directionalAudio.off.tooltip");
   private final ezl<Boolean> bx = ezl.a("options.directionalAudio", $$0x -> $$0x ? fct.a(bv) : fct.a(bw), false, $$0x -> {
      gnt $$1x = ezi.Q().ak();
      $$1x.k();
      $$1x.a(gmk.a(aty.zS, 1.0F));
   });
   private final ezl<Boolean> by = new ezl<>(
      "options.accessibility.text_background",
      ezl.a(),
      ($$0x, $$1x) -> $$1x ? vu.c("options.accessibility.text_background.chat") : vu.c("options.accessibility.text_background.everywhere"),
      ezl.a,
      true,
      $$0x -> {
      }
   );
   private final ezl<Boolean> bz = ezl.a("options.touchscreen", false);
   private final ezl<Boolean> bA = ezl.a("options.fullscreen", false, $$0x -> {
      ezi $$1x = ezi.Q();
      if ($$1x.aO() != null && $$1x.aO().j() != $$0x) {
         $$1x.aO().h();
         this.Y().a($$1x.aO().j());
      }
   });
   private final ezl<Boolean> bB = ezl.a("options.viewBobbing", true);
   private static final vu bC = vu.c("options.key.toggle");
   private static final vu bD = vu.c("options.key.hold");
   private final ezl<Boolean> bE = new ezl<>("key.sneak", ezl.a(), ($$0x, $$1x) -> $$1x ? bC : bD, ezl.a, false, $$0x -> {
   });
   private final ezl<Boolean> bF = new ezl<>("key.sprint", ezl.a(), ($$0x, $$1x) -> $$1x ? bC : bD, ezl.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final vu bG = vu.c("options.hideMatchedNames.tooltip");
   private final ezl<Boolean> bH = ezl.a("options.hideMatchedNames", ezl.a(bG), true);
   private final ezl<Boolean> bI = ezl.a("options.autosaveIndicator", true);
   private static final vu bJ = vu.c("options.onlyShowSecureChat.tooltip");
   private final ezl<Boolean> bK = ezl.a("options.onlyShowSecureChat", ezl.a(bJ), false);
   public final ezg x = new ezg("key.forward", 87, "key.categories.movement");
   public final ezg y = new ezg("key.left", 65, "key.categories.movement");
   public final ezg z = new ezg("key.back", 83, "key.categories.movement");
   public final ezg A = new ezg("key.right", 68, "key.categories.movement");
   public final ezg B = new ezg("key.jump", 32, "key.categories.movement");
   public final ezg C = new ezw("key.sneak", 340, "key.categories.movement", this.bE::c);
   public final ezg D = new ezw("key.sprint", 341, "key.categories.movement", this.bF::c);
   public final ezg E = new ezg("key.inventory", 69, "key.categories.inventory");
   public final ezg F = new ezg("key.swapOffhand", 70, "key.categories.inventory");
   public final ezg G = new ezg("key.drop", 81, "key.categories.inventory");
   public final ezg H = new ezg("key.use", esw.b.c, 1, "key.categories.gameplay");
   public final ezg I = new ezg("key.attack", esw.b.c, 0, "key.categories.gameplay");
   public final ezg J = new ezg("key.pickItem", esw.b.c, 2, "key.categories.gameplay");
   public final ezg K = new ezg("key.chat", 84, "key.categories.multiplayer");
   public final ezg L = new ezg("key.playerlist", 258, "key.categories.multiplayer");
   public final ezg M = new ezg("key.command", 47, "key.categories.multiplayer");
   public final ezg N = new ezg("key.socialInteractions", 80, "key.categories.multiplayer");
   public final ezg O = new ezg("key.screenshot", 291, "key.categories.misc");
   public final ezg P = new ezg("key.togglePerspective", 294, "key.categories.misc");
   public final ezg Q = new ezg("key.smoothCamera", esw.bv.b(), "key.categories.misc");
   public final ezg R = new ezg("key.fullscreen", 300, "key.categories.misc");
   public final ezg S = new ezg("key.spectatorOutlines", esw.bv.b(), "key.categories.misc");
   public final ezg T = new ezg("key.advancements", 76, "key.categories.misc");
   public final ezg[] U = new ezg[]{
      new ezg("key.hotbar.1", 49, "key.categories.inventory"),
      new ezg("key.hotbar.2", 50, "key.categories.inventory"),
      new ezg("key.hotbar.3", 51, "key.categories.inventory"),
      new ezg("key.hotbar.4", 52, "key.categories.inventory"),
      new ezg("key.hotbar.5", 53, "key.categories.inventory"),
      new ezg("key.hotbar.6", 54, "key.categories.inventory"),
      new ezg("key.hotbar.7", 55, "key.categories.inventory"),
      new ezg("key.hotbar.8", 56, "key.categories.inventory"),
      new ezg("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final ezg V = new ezg("key.saveToolbarActivator", 67, "key.categories.creative");
   public final ezg W = new ezg("key.loadToolbarActivator", 88, "key.categories.creative");
   public final ezg[] X = (ezg[])ArrayUtils.addAll(
      new ezg[]{
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
   protected ezi Y;
   private final File bL;
   public boolean Z;
   private eyu bM = eyu.a;
   public String aa = "";
   public boolean ab;
   private final ezl<Integer> bN = new ezl<>("options.fov", ezl.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, vu.c("options.fov.min"));
         case 110 -> a($$0x, vu.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new ezl.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> ezi.Q().f.r());
   private static final vu bO = vu.a("options.telemetry.button.tooltip", vu.c("options.telemetry.state.minimal"), vu.c("options.telemetry.state.all"));
   private final ezl<Boolean> bP = ezl.a("options.telemetry.button", ezl.a(bO), ($$0x, $$1x) -> {
      ezi $$2x = ezi.Q();
      if (!$$2x.E()) {
         return vu.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? vu.c("options.telemetry.state.all") : vu.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final vu bQ = vu.c("options.screenEffectScale.tooltip");
   private final ezl<Double> bR = new ezl<>(
      "options.screenEffectScale", ezl.a(bQ), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vt.c) : a($$0x, $$1x.doubleValue()), ezl.m.a, 1.0, $$0x -> {
      }
   );
   private static final vu bS = vu.c("options.fovEffectScale.tooltip");
   private final ezl<Double> bT = new ezl<>(
      "options.fovEffectScale",
      ezl.a(bS),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vt.c) : a($$0x, $$1x.doubleValue()),
      ezl.m.a.a(aww::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final vu bU = vu.c("options.darknessEffectScale.tooltip");
   private final ezl<Double> bV = new ezl<>(
      "options.darknessEffectScale",
      ezl.a(bU),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vt.c) : a($$0x, $$1x.doubleValue()),
      ezl.m.a.a(aww::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final vu bW = vu.c("options.glintSpeed.tooltip");
   private final ezl<Double> bX = new ezl<>(
      "options.glintSpeed", ezl.a(bW), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vt.c) : a($$0x, $$1x.doubleValue()), ezl.m.a, 0.5, $$0x -> {
      }
   );
   private static final vu bY = vu.c("options.glintStrength.tooltip");
   private final ezl<Double> bZ = new ezl<>(
      "options.glintStrength",
      ezl.a(bY),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vt.c) : a($$0x, $$1x.doubleValue()),
      ezl.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final vu ca = vu.c("options.damageTiltStrength.tooltip");
   private final ezl<Double> cb = new ezl<>(
      "options.damageTiltStrength", ezl.a(ca), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vt.c) : a($$0x, $$1x.doubleValue()), ezl.m.a, 1.0, $$0x -> {
      }
   );
   private final ezl<Double> cc = new ezl<>("options.gamma", ezl.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, vu.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, vu.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, vu.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, ezl.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cd = 2147483646;
   private final ezl<Integer> ce = new ezl<>(
      "options.guiScale", ezl.a(), ($$0x, $$1x) -> $$1x == 0 ? vu.c("options.guiScale.auto") : vu.b(Integer.toString($$1x)), new ezl.c(0, () -> {
         ezi $$0x = ezi.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final ezl<ezn> cf = new ezl<>(
      "options.particles", ezl.a(), ezl.b(), new ezl.e<>(Arrays.asList(ezn.values()), Codec.INT.xmap(ezn::a, ezn::a)), ezn.a, $$0x -> {
      }
   );
   private final ezl<ezk> cg = new ezl<>(
      "options.narrator",
      ezl.a(),
      ($$0x, $$1x) -> (vu)(this.Y.aY().a() ? $$1x.b() : vu.c("options.narrator.notavailable")),
      new ezl.e<>(Arrays.asList(ezk.values()), Codec.INT.xmap(ezk::a, ezk::a)),
      ezk.a,
      $$0x -> this.Y.aY().a($$0x)
   );
   public String ad = "en_us";
   private final ezl<String> ch = new ezl<>(
      "options.audioDevice",
      ezl.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return vu.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? vu.b($$1x.substring(gnq.c)) : vu.b($$1x);
         }
      },
      new ezl.h<>(
         () -> Stream.concat(Stream.of(""), ezi.Q().ak().a().stream()).toList(),
         $$0x -> ezi.Q().r() && $$0x != "" && !ezi.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gnt $$1x = ezi.Q().ak();
         $$1x.k();
         $$1x.a(gmk.a(aty.zS, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public ezl<Boolean> a() {
      return this.am;
   }

   public ezl<Boolean> b() {
      return this.ao;
   }

   public ezl<Boolean> c() {
      return this.aq;
   }

   public ezl<Double> d() {
      return this.ar;
   }

   public ezl<Integer> e() {
      return this.as;
   }

   public ezl<Integer> f() {
      return this.at;
   }

   public ezl<Double> g() {
      return this.av;
   }

   public ezl<Integer> h() {
      return this.aw;
   }

   public ezl<eyw> i() {
      return this.ax;
   }

   public ezl<ezb> j() {
      return this.aB;
   }

   public ezl<Boolean> k() {
      return this.aC;
   }

   public ezl<ezp> l() {
      return this.aG;
   }

   public void a(arz $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (arw $$2 : $$0.f()) {
         if (!$$2.j()) {
            this.i.add($$2.g());
            if (!$$2.d().a()) {
               this.j.add($$2.g());
            }
         }
      }

      this.at();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.Y.l();
      }
   }

   public ezl<cis> m() {
      return this.aH;
   }

   public ezl<Double> n() {
      return this.aI;
   }

   public ezl<Double> o() {
      return this.aJ;
   }

   public ezl<Double> p() {
      return this.aK;
   }

   public ezl<Double> q() {
      return this.aL;
   }

   public ezl<Boolean> r() {
      return this.aN;
   }

   public ezl<Boolean> s() {
      return this.aO;
   }

   public ezl<bpj> t() {
      return this.aQ;
   }

   public ezl<Double> u() {
      return this.aR;
   }

   public ezl<Double> v() {
      return this.aS;
   }

   public ezl<Double> w() {
      return this.aT;
   }

   public ezl<Double> x() {
      return this.aU;
   }

   public ezl<Double> y() {
      return this.aV;
   }

   public ezl<Double> z() {
      return this.aX;
   }

   public ezl<Integer> A() {
      return this.aY;
   }

   public ezl<eys> B() {
      return this.aZ;
   }

   public ezl<Integer> C() {
      return this.ba;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return aww.a(Math.log10($$0) * 100.0);
   }

   public ezl<Double> D() {
      return this.bb;
   }

   public ezl<Boolean> E() {
      return this.bc;
   }

   public ezl<Boolean> F() {
      return this.bd;
   }

   public ezl<Boolean> G() {
      return this.be;
   }

   public ezl<Boolean> H() {
      return this.bf;
   }

   public ezl<Boolean> I() {
      return this.bg;
   }

   public ezl<Boolean> J() {
      return this.bh;
   }

   public ezl<Boolean> K() {
      return this.bi;
   }

   public ezl<Boolean> L() {
      return this.bj;
   }

   public ezl<Boolean> M() {
      return this.bk;
   }

   private static void aC() {
      ezi $$0 = ezi.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public ezl<Boolean> N() {
      return this.bl;
   }

   private static boolean aD() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public ezl<Boolean> O() {
      return this.bm;
   }

   public ezl<Boolean> P() {
      return this.bn;
   }

   public ezl<Boolean> Q() {
      return this.bo;
   }

   public ezl<Boolean> R() {
      return this.bp;
   }

   public ezl<Boolean> S() {
      return this.br;
   }

   public ezl<Boolean> T() {
      return this.bs;
   }

   public final float a(atz $$0) {
      return this.b($$0).c().floatValue();
   }

   public final ezl<Double> b(atz $$0) {
      return Objects.requireNonNull(this.bt.get($$0));
   }

   private ezl<Double> a(String $$0, atz $$1) {
      return new ezl<>(
         $$0, ezl.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vt.c) : a($$0x, $$1x.doubleValue()), ezl.m.a, 1.0, $$1x -> ezi.Q().ak().a($$1, $$1x.floatValue())
      );
   }

   public ezl<Boolean> U() {
      return this.bu;
   }

   public ezl<Boolean> V() {
      return this.bx;
   }

   public ezl<Boolean> W() {
      return this.by;
   }

   public ezl<Boolean> X() {
      return this.bz;
   }

   public ezl<Boolean> Y() {
      return this.bA;
   }

   public ezl<Boolean> Z() {
      return this.bB;
   }

   public ezl<Boolean> aa() {
      return this.bE;
   }

   public ezl<Boolean> ab() {
      return this.bF;
   }

   public ezl<Boolean> ac() {
      return this.bH;
   }

   public ezl<Boolean> ad() {
      return this.bI;
   }

   public ezl<Boolean> ae() {
      return this.bK;
   }

   public ezl<Integer> af() {
      return this.bN;
   }

   public ezl<Boolean> ag() {
      return this.bP;
   }

   public ezl<Double> ah() {
      return this.bR;
   }

   public ezl<Double> ai() {
      return this.bT;
   }

   public ezl<Double> aj() {
      return this.bV;
   }

   public ezl<Double> ak() {
      return this.bX;
   }

   public ezl<Double> al() {
      return this.bZ;
   }

   public ezl<Double> am() {
      return this.cb;
   }

   public ezl<Double> an() {
      return this.cc;
   }

   public ezl<Integer> ao() {
      return this.ce;
   }

   public ezl<ezn> ap() {
      return this.cf;
   }

   public ezl<ezk> aq() {
      return this.cg;
   }

   public ezl<String> ar() {
      return this.ch;
   }

   public ezm(ezi $$0, File $$1) {
      this.Y = $$0;
      this.bL = new File($$1, "options.txt");
      boolean $$2 = $$0.ah();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.as = new ezl<>(
         "options.renderDistance",
         ezl.a(),
         ($$0x, $$1x) -> a($$0x, vu.a("options.chunks", $$1x)),
         new ezl.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> ezi.Q().f.r()
      );
      this.at = new ezl<>(
         "options.simulationDistance", ezl.a(), ($$0x, $$1x) -> a($$0x, vu.a("options.chunks", $$1x)), new ezl.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
         }
      );
      this.af = ac.j() == ac.a.c;
      this.as();
   }

   public float a(float $$0) {
      return this.by.c() ? $$0 : this.p().c().floatValue();
   }

   public int b(float $$0) {
      return (int)(this.a($$0) * 255.0F) << 24 & 0xFF000000;
   }

   public int a(int $$0) {
      return this.by.c() ? $$0 : (int)(this.aK.c() * 255.0) << 24 & 0xFF000000;
   }

   public void a(ezg $$0, esw.a $$1) {
      $$0.b($$1);
      this.at();
   }

   private void a(ezm.b $$0) {
      $$0.a("ao", this.aC);
      $$0.a("biomeBlendRadius", this.ba);
      $$0.a("enableVsync", this.bj);
      $$0.a("entityDistanceScaling", this.av);
      $$0.a("entityShadows", this.bk);
      $$0.a("forceUnicodeFont", this.bl);
      $$0.a("japaneseGlyphVariants", this.bm);
      $$0.a("fov", this.bN);
      $$0.a("fovEffectScale", this.bT);
      $$0.a("darknessEffectScale", this.bV);
      $$0.a("glintSpeed", this.bX);
      $$0.a("glintStrength", this.bZ);
      $$0.a("prioritizeChunkUpdates", this.aG);
      $$0.a("fullscreen", this.bA);
      $$0.a("gamma", this.cc);
      $$0.a("graphicsMode", this.aB);
      $$0.a("guiScale", this.ce);
      $$0.a("maxFps", this.aw);
      $$0.a("mipmapLevels", this.aY);
      $$0.a("narrator", this.cg);
      $$0.a("particles", this.cf);
      $$0.a("reducedDebugInfo", this.bs);
      $$0.a("renderClouds", this.ax);
      $$0.a("renderDistance", this.as);
      $$0.a("simulationDistance", this.at);
      $$0.a("screenEffectScale", this.bR);
      $$0.a("soundDevice", this.ch);
   }

   private void a(ezm.a $$0) {
      this.a((ezm.b)$$0);
      $$0.a("autoJump", this.bd);
      $$0.a("operatorItemsTab", this.be);
      $$0.a("autoSuggestions", this.bf);
      $$0.a("chatColors", this.bg);
      $$0.a("chatLinks", this.bh);
      $$0.a("chatLinksPrompt", this.bi);
      $$0.a("discrete_mouse_scroll", this.bo);
      $$0.a("invertYMouse", this.bn);
      $$0.a("realmsNotifications", this.bp);
      $$0.a("showSubtitles", this.bu);
      $$0.a("directionalAudio", this.bx);
      $$0.a("touchscreen", this.bz);
      $$0.a("bobView", this.bB);
      $$0.a("toggleCrouch", this.bE);
      $$0.a("toggleSprint", this.bF);
      $$0.a("darkMojangStudiosBackground", this.am);
      $$0.a("hideLightningFlashes", this.ao);
      $$0.a("hideSplashTexts", this.aq);
      $$0.a("mouseSensitivity", this.ar);
      $$0.a("damageTiltStrength", this.cb);
      $$0.a("highContrast", this.aN);
      $$0.a("narratorHotkey", this.aO);
      this.i = $$0.a("resourcePacks", this.i, ezm::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, ezm::c, ah::toJson);
      this.aa = $$0.a("lastServer", this.aa);
      this.ad = $$0.a("lang", this.ad);
      $$0.a("chatVisibility", this.aH);
      $$0.a("chatOpacity", this.aI);
      $$0.a("chatLineSpacing", this.aJ);
      $$0.a("textBackgroundOpacity", this.aK);
      $$0.a("backgroundForChatOnly", this.by);
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
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aQ);
      $$0.a("attackIndicator", this.aZ);
      this.r = $$0.a("tutorialStep", this.r, goy::a, goy::a);
      $$0.a("mouseWheelSensitivity", this.bb);
      $$0.a("rawMouseInput", this.bc);
      this.u = $$0.a("glDebugVerbosity", this.u);
      this.v = $$0.a("skipMultiplayerWarning", this.v);
      this.w = $$0.a("skipRealms32bitWarning", this.w);
      $$0.a("hideMatchedNames", this.bH);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.t = $$0.a("hideBundleTutorial", this.t);
      this.af = $$0.a("syncChunkWrites", this.af);
      $$0.a("showAutosaveIndicator", this.bI);
      $$0.a("allowServerListing", this.br);
      $$0.a("onlyShowSecureChat", this.bK);
      $$0.a("panoramaScrollSpeed", this.aL);
      $$0.a("telemetryOptInExtra", this.bP);
      this.ae = $$0.a("onboardAccessibility", this.ae);

      for (ezg $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(esw.a($$3));
         }
      }

      for (atz $$4 : atz.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bt.get($$4));
      }

      for (civ $$5 : civ.values()) {
         boolean $$6 = this.aP.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.b($$5, $$7);
         }
      }
   }

   public void as() {
      try {
         if (!this.bL.exists()) {
            return;
         }

         ta $$0 = new ta();

         try (BufferedReader $$1 = Files.newReader(this.bL, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = aj.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  ag.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final ta $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(ezb.b);
            } else {
               this.aB.a(ezb.a);
            }
         }

         this.a(new ezm.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, ezl<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> ezm.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     ezm.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? ezm.a($$2) : $$1;
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
               } else if (ezm.a($$2)) {
                  return 1.0F;
               } else if (ezm.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     ezm.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         if (this.Y.aO() != null) {
            this.Y.aO().a(this.aw.c());
         }

         ezg.d();
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

   private ta a(ta $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return ayc.e.a(this.Y.at(), $$0, $$1);
   }

   public void at() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bL), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new ezm.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, ezl<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> ezm.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(ezm.ah.toJson($$2x));
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
         if (this.Y.aO().f().isPresent()) {
            $$0.println("fullscreenResolution:" + this.Y.aO().f().get().g());
         }
      } catch (Exception var6) {
         ag.error("Failed to save options", var6);
      }

      this.av();
   }

   public aou au() {
      int $$0 = 0;

      for (civ $$1 : this.aP) {
         $$0 |= $$1.a();
      }

      return new aou(this.ad, this.as.c(), this.aH.c(), this.bg.c(), $$0, this.aQ.c(), this.Y.aS(), this.br.c());
   }

   public void av() {
      if (this.Y.s != null) {
         this.Y.s.cu.b(new yt(this.au()));
      }
   }

   private void b(civ $$0, boolean $$1) {
      if ($$1) {
         this.aP.add($$0);
      } else {
         this.aP.remove($$0);
      }
   }

   public boolean a(civ $$0) {
      return this.aP.contains($$0);
   }

   public void a(civ $$0, boolean $$1) {
      this.b($$0, $$1);
      this.av();
   }

   public eyw aw() {
      return this.aB() >= 4 ? this.ax.c() : eyw.a;
   }

   public boolean ax() {
      return this.q;
   }

   public void b(arz $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         arw $$4 = $$0.c($$3);
         if ($$4 == null && !$$3.startsWith("file/")) {
            $$4 = $$0.c("file/" + $$3);
         }

         if ($$4 == null) {
            ag.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", $$3);
            $$2.remove();
         } else if (!$$4.d().a() && !this.j.contains($$3)) {
            ag.warn("Removed resource pack {} from options because it is no longer compatible", $$3);
            $$2.remove();
         } else if ($$4.d().a() && this.j.contains($$3)) {
            ag.info("Removed resource pack {} from incompatibility list because it's now compatible", $$3);
            this.j.remove($$3);
         } else {
            $$1.add($$4.g());
         }
      }

      $$0.a($$1);
   }

   public eyu ay() {
      return this.bM;
   }

   public void a(eyu $$0) {
      this.bM = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = awm.a(ah, $$0, ai);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File az() {
      return this.bL;
   }

   public String aA() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new ezm.b() {
         @Override
         public <T> void a(String $$0x, ezl<T> $$1) {
            $$0.add(Pair.of($$0, $$1.c()));
         }
      });
      $$0.add(Pair.of("fullscreenResolution", String.valueOf(this.k)));
      $$0.add(Pair.of("glDebugVerbosity", this.u));
      $$0.add(Pair.of("overrideHeight", this.p));
      $$0.add(Pair.of("overrideWidth", this.o));
      $$0.add(Pair.of("syncChunkWrites", this.af));
      $$0.add(Pair.of("useNativeTransport", this.q));
      $$0.add(Pair.of("resourcePacks", this.i));
      return $$0.stream()
         .sorted(Comparator.comparing(Pair::getFirst))
         .map($$0x -> (String)$$0x.getFirst() + ": " + $$0x.getSecond())
         .collect(Collectors.joining(System.lineSeparator()));
   }

   public void b(int $$0) {
      this.au = $$0;
   }

   public int aB() {
      return this.au > 0 ? Math.min(this.as.c(), this.au) : this.as.c();
   }

   private static vu b(vu $$0, int $$1) {
      return vu.a("options.pixel_value", $$0, $$1);
   }

   private static vu a(vu $$0, double $$1) {
      return vu.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static vu a(vu $$0, vu $$1) {
      return vu.a("options.generic_value", $$0, $$1);
   }

   public static vu a(vu $$0, int $$1) {
      return a($$0, vu.b(Integer.toString($$1)));
   }

   interface a extends ezm.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, ezl<T> var2);
   }
}
