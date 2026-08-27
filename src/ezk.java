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

public class ezk {
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
   private final ezj<Boolean> am = ezj.a("options.darkMojangStudiosBackgroundColor", ezj.a(al), false);
   private static final vu an = vu.c("options.hideLightningFlashes.tooltip");
   private final ezj<Boolean> ao = ezj.a("options.hideLightningFlashes", ezj.a(an), false);
   private static final vu ap = vu.c("options.hideSplashTexts.tooltip");
   private final ezj<Boolean> aq = ezj.a("options.hideSplashTexts", ezj.a(ap), false);
   private final ezj<Double> ar = new ezj<>("options.sensitivity", ezj.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, vu.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, vu.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, ezj.m.a, 0.5, $$0x -> {
   });
   private final ezj<Integer> as;
   private final ezj<Integer> at;
   private int au = 0;
   private final ezj<Double> av = new ezj<>(
      "options.entityDistanceScaling",
      ezj.a(),
      ezk::a,
      new ezj.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final ezj<Integer> aw = new ezj<>(
      "options.framerateLimit",
      ezj.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, vu.c("options.framerateLimit.max")) : a($$0x, vu.a("options.framerate", $$1x)),
      new ezj.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> ezg.Q().aO().a($$0x)
   );
   private final ezj<eyu> ax = new ezj<>(
      "options.renderClouds",
      ezj.a(),
      ezj.b(),
      new ezj.e<>(Arrays.asList(eyu.values()), awe.a(eyu.d, Codec.BOOL, $$0x -> $$0x ? eyu.c : eyu.a)),
      eyu.c,
      $$0x -> {
         if (ezg.O()) {
            esl $$1x = ezg.Q().f.x();
            if ($$1x != null) {
               $$1x.b(ezg.a);
            }
         }
      }
   );
   private static final vu ay = vu.c("options.graphics.fast.tooltip");
   private static final vu az = vu.a("options.graphics.fabulous.tooltip", vu.c("options.graphics.fabulous").a(n.u));
   private static final vu aA = vu.c("options.graphics.fancy.tooltip");
   private final ezj<eyz> aB = new ezj<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fcr.a(aA);
            case a -> fcr.a(ay);
            case c -> fcr.a(az);
         };
      },
      ($$0x, $$1x) -> {
         wi $$2x = vu.c($$1x.b());
         return $$1x == eyz.c ? $$2x.a(n.u) : $$2x;
      },
      new ezj.a<>(
         Arrays.asList(eyz.values()),
         Stream.of(eyz.values()).filter($$0x -> $$0x != eyz.c).collect(Collectors.toList()),
         () -> ezg.Q().r() && ezg.Q().aj().h(),
         ($$0x, $$1x) -> {
            ezg $$2x = ezg.Q();
            fxk $$3x = $$2x.aj();
            if ($$1x == eyz.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(eyz::a, eyz::a)
      ),
      eyz.b,
      $$0x -> {
      }
   );
   private final ezj<Boolean> aC = ezj.a("options.ao", true, $$0x -> ezg.Q().f.f());
   private static final vu aD = vu.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final vu aE = vu.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final vu aF = vu.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final ezj<ezn> aG = new ezj<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fcr.a(aD);
         case b -> fcr.a(aE);
         case c -> fcr.a(aF);
      };
   }, ezj.b(), new ezj.e<>(Arrays.asList(ezn.values()), Codec.INT.xmap(ezn::a, ezn::a)), ezn.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final ezj<ciq> aH = new ezj<>(
      "options.chat.visibility", ezj.a(), ezj.b(), new ezj.e<>(Arrays.asList(ciq.values()), Codec.INT.xmap(ciq::a, ciq::a)), ciq.a, $$0x -> {
      }
   );
   private final ezj<Double> aI = new ezj<>("options.chat.opacity", ezj.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), ezj.m.a, 1.0, $$0x -> ezg.Q().l.d().b());
   private final ezj<Double> aJ = new ezj<>("options.chat.line_spacing", ezj.a(), ezk::a, ezj.m.a, 0.0, $$0x -> {
   });
   private final ezj<Double> aK = new ezj<>("options.accessibility.text_background_opacity", ezj.a(), ezk::a, ezj.m.a, 0.5, $$0x -> ezg.Q().l.d().b());
   private final ezj<Double> aL = new ezj<>("options.accessibility.panorama_speed", ezj.a(), ezk::a, ezj.m.a, 1.0, $$0x -> {
   });
   private static final vu aM = vu.c("options.accessibility.high_contrast.tooltip");
   private final ezj<Boolean> aN = ezj.a("options.accessibility.high_contrast", ezj.a(aM), false, $$0x -> {
      arz $$1x = ezg.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final ezj<Boolean> aO = ezj.a(
      "options.accessibility.narrator_hotkey",
      ezj.a(ezg.a ? vu.c("options.accessibility.narrator_hotkey.mac.tooltip") : vu.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cit> aP = EnumSet.allOf(cit.class);
   private final ezj<bpi> aQ = new ezj<>("options.mainHand", ezj.a(), ezj.b(), new ezj.e<>(Arrays.asList(bpi.values()), bpi.c), bpi.b, $$0x -> this.av());
   public int o;
   public int p;
   private final ezj<Double> aR = new ezj<>(
      "options.chat.scale",
      ezj.a(),
      ($$0x, $$1x) -> (vu)($$1x == 0.0 ? vt.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      ezj.m.a,
      1.0,
      $$0x -> ezg.Q().l.d().b()
   );
   private final ezj<Double> aS = new ezj<>("options.chat.width", ezj.a(), ($$0x, $$1x) -> b($$0x, fbh.a($$1x)), ezj.m.a, 1.0, $$0x -> ezg.Q().l.d().b());
   private final ezj<Double> aT = new ezj<>(
      "options.chat.height.unfocused", ezj.a(), ($$0x, $$1x) -> b($$0x, fbh.b($$1x)), ezj.m.a, fbh.i(), $$0x -> ezg.Q().l.d().b()
   );
   private final ezj<Double> aU = new ezj<>(
      "options.chat.height.focused", ezj.a(), ($$0x, $$1x) -> b($$0x, fbh.b($$1x)), ezj.m.a, 1.0, $$0x -> ezg.Q().l.d().b()
   );
   private final ezj<Double> aV = new ezj<>(
      "options.chat.delay_instant",
      ezj.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? vu.c("options.chat.delay_none") : vu.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new ezj.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> ezg.Q().aZ().a($$0x)
   );
   private static final vu aW = vu.c("options.notifications.display_time.tooltip");
   private final ezj<Double> aX = new ezj<>(
      "options.notifications.display_time",
      ezj.a(aW),
      ($$0x, $$1x) -> a($$0x, vu.a("options.multiplier", $$1x)),
      new ezj.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final ezj<Integer> aY = new ezj<>(
      "options.mipmapLevels", ezj.a(), ($$0x, $$1x) -> (vu)($$1x == 0 ? vt.a($$0x, false) : a($$0x, $$1x.intValue())), new ezj.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final ezj<eyq> aZ = new ezj<>(
      "options.attackIndicator", ezj.a(), ezj.b(), new ezj.e<>(Arrays.asList(eyq.values()), Codec.INT.xmap(eyq::a, eyq::a)), eyq.b, $$0x -> {
      }
   );
   public gov r = gov.a;
   public boolean s = false;
   public boolean t = false;
   private final ezj<Integer> ba = new ezj<>("options.biomeBlendRadius", ezj.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, vu.c("options.biomeBlendRadius." + $$2x));
   }, new ezj.f(0, 7), 2, $$0x -> ezg.Q().f.f());
   private final ezj<Double> bb = new ezj<>(
      "options.mouseWheelSensitivity",
      ezj.a(),
      ($$0x, $$1x) -> a($$0x, vu.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new ezj.f(-200, 100).a(ezk::c, ezk::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final ezj<Boolean> bc = ezj.a("options.rawMouseInput", true, $$0x -> {
      etd $$1x = ezg.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final ezj<Boolean> bd = ezj.a("options.autoJump", false);
   private final ezj<Boolean> be = ezj.a("options.operatorItemsTab", false);
   private final ezj<Boolean> bf = ezj.a("options.autoSuggestCommands", true);
   private final ezj<Boolean> bg = ezj.a("options.chat.color", true);
   private final ezj<Boolean> bh = ezj.a("options.chat.links", true);
   private final ezj<Boolean> bi = ezj.a("options.chat.links.prompt", true);
   private final ezj<Boolean> bj = ezj.a("options.vsync", true, $$0x -> {
      if (ezg.Q().aO() != null) {
         ezg.Q().aO().a($$0x);
      }
   });
   private final ezj<Boolean> bk = ezj.a("options.entityShadows", true);
   private final ezj<Boolean> bl = ezj.a("options.forceUnicodeFont", false, $$0x -> aC());
   private final ezj<Boolean> bm = ezj.a("options.japaneseGlyphVariants", ezj.a(vu.c("options.japaneseGlyphVariants.tooltip")), aD(), $$0x -> aC());
   private final ezj<Boolean> bn = ezj.a("options.invertMouse", false);
   private final ezj<Boolean> bo = ezj.a("options.discrete_mouse_scroll", false);
   private final ezj<Boolean> bp = ezj.a("options.realmsNotifications", true);
   private static final vu bq = vu.c("options.allowServerListing.tooltip");
   private final ezj<Boolean> br = ezj.a("options.allowServerListing", ezj.a(bq), true, $$0x -> this.av());
   private final ezj<Boolean> bs = ezj.a("options.reducedDebugInfo", false);
   private final Map<atz, ezj<Double>> bt = ac.a(new EnumMap<>(atz.class), $$0x -> {
      for (atz $$1x : atz.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final ezj<Boolean> bu = ezj.a("options.showSubtitles", false);
   private static final vu bv = vu.c("options.directionalAudio.on.tooltip");
   private static final vu bw = vu.c("options.directionalAudio.off.tooltip");
   private final ezj<Boolean> bx = ezj.a("options.directionalAudio", $$0x -> $$0x ? fcr.a(bv) : fcr.a(bw), false, $$0x -> {
      gnq $$1x = ezg.Q().ak();
      $$1x.k();
      $$1x.a(gmh.a(aty.zN, 1.0F));
   });
   private final ezj<Boolean> by = new ezj<>(
      "options.accessibility.text_background",
      ezj.a(),
      ($$0x, $$1x) -> $$1x ? vu.c("options.accessibility.text_background.chat") : vu.c("options.accessibility.text_background.everywhere"),
      ezj.a,
      true,
      $$0x -> {
      }
   );
   private final ezj<Boolean> bz = ezj.a("options.touchscreen", false);
   private final ezj<Boolean> bA = ezj.a("options.fullscreen", false, $$0x -> {
      ezg $$1x = ezg.Q();
      if ($$1x.aO() != null && $$1x.aO().j() != $$0x) {
         $$1x.aO().h();
         this.Y().a($$1x.aO().j());
      }
   });
   private final ezj<Boolean> bB = ezj.a("options.viewBobbing", true);
   private static final vu bC = vu.c("options.key.toggle");
   private static final vu bD = vu.c("options.key.hold");
   private final ezj<Boolean> bE = new ezj<>("key.sneak", ezj.a(), ($$0x, $$1x) -> $$1x ? bC : bD, ezj.a, false, $$0x -> {
   });
   private final ezj<Boolean> bF = new ezj<>("key.sprint", ezj.a(), ($$0x, $$1x) -> $$1x ? bC : bD, ezj.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final vu bG = vu.c("options.hideMatchedNames.tooltip");
   private final ezj<Boolean> bH = ezj.a("options.hideMatchedNames", ezj.a(bG), true);
   private final ezj<Boolean> bI = ezj.a("options.autosaveIndicator", true);
   private static final vu bJ = vu.c("options.onlyShowSecureChat.tooltip");
   private final ezj<Boolean> bK = ezj.a("options.onlyShowSecureChat", ezj.a(bJ), false);
   public final eze x = new eze("key.forward", 87, "key.categories.movement");
   public final eze y = new eze("key.left", 65, "key.categories.movement");
   public final eze z = new eze("key.back", 83, "key.categories.movement");
   public final eze A = new eze("key.right", 68, "key.categories.movement");
   public final eze B = new eze("key.jump", 32, "key.categories.movement");
   public final eze C = new ezu("key.sneak", 340, "key.categories.movement", this.bE::c);
   public final eze D = new ezu("key.sprint", 341, "key.categories.movement", this.bF::c);
   public final eze E = new eze("key.inventory", 69, "key.categories.inventory");
   public final eze F = new eze("key.swapOffhand", 70, "key.categories.inventory");
   public final eze G = new eze("key.drop", 81, "key.categories.inventory");
   public final eze H = new eze("key.use", esu.b.c, 1, "key.categories.gameplay");
   public final eze I = new eze("key.attack", esu.b.c, 0, "key.categories.gameplay");
   public final eze J = new eze("key.pickItem", esu.b.c, 2, "key.categories.gameplay");
   public final eze K = new eze("key.chat", 84, "key.categories.multiplayer");
   public final eze L = new eze("key.playerlist", 258, "key.categories.multiplayer");
   public final eze M = new eze("key.command", 47, "key.categories.multiplayer");
   public final eze N = new eze("key.socialInteractions", 80, "key.categories.multiplayer");
   public final eze O = new eze("key.screenshot", 291, "key.categories.misc");
   public final eze P = new eze("key.togglePerspective", 294, "key.categories.misc");
   public final eze Q = new eze("key.smoothCamera", esu.bv.b(), "key.categories.misc");
   public final eze R = new eze("key.fullscreen", 300, "key.categories.misc");
   public final eze S = new eze("key.spectatorOutlines", esu.bv.b(), "key.categories.misc");
   public final eze T = new eze("key.advancements", 76, "key.categories.misc");
   public final eze[] U = new eze[]{
      new eze("key.hotbar.1", 49, "key.categories.inventory"),
      new eze("key.hotbar.2", 50, "key.categories.inventory"),
      new eze("key.hotbar.3", 51, "key.categories.inventory"),
      new eze("key.hotbar.4", 52, "key.categories.inventory"),
      new eze("key.hotbar.5", 53, "key.categories.inventory"),
      new eze("key.hotbar.6", 54, "key.categories.inventory"),
      new eze("key.hotbar.7", 55, "key.categories.inventory"),
      new eze("key.hotbar.8", 56, "key.categories.inventory"),
      new eze("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final eze V = new eze("key.saveToolbarActivator", 67, "key.categories.creative");
   public final eze W = new eze("key.loadToolbarActivator", 88, "key.categories.creative");
   public final eze[] X = (eze[])ArrayUtils.addAll(
      new eze[]{
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
   protected ezg Y;
   private final File bL;
   public boolean Z;
   private eys bM = eys.a;
   public String aa = "";
   public boolean ab;
   private final ezj<Integer> bN = new ezj<>("options.fov", ezj.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, vu.c("options.fov.min"));
         case 110 -> a($$0x, vu.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new ezj.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> ezg.Q().f.r());
   private static final vu bO = vu.a("options.telemetry.button.tooltip", vu.c("options.telemetry.state.minimal"), vu.c("options.telemetry.state.all"));
   private final ezj<Boolean> bP = ezj.a("options.telemetry.button", ezj.a(bO), ($$0x, $$1x) -> {
      ezg $$2x = ezg.Q();
      if (!$$2x.E()) {
         return vu.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? vu.c("options.telemetry.state.all") : vu.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final vu bQ = vu.c("options.screenEffectScale.tooltip");
   private final ezj<Double> bR = new ezj<>(
      "options.screenEffectScale", ezj.a(bQ), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vt.c) : a($$0x, $$1x.doubleValue()), ezj.m.a, 1.0, $$0x -> {
      }
   );
   private static final vu bS = vu.c("options.fovEffectScale.tooltip");
   private final ezj<Double> bT = new ezj<>(
      "options.fovEffectScale",
      ezj.a(bS),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vt.c) : a($$0x, $$1x.doubleValue()),
      ezj.m.a.a(aww::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final vu bU = vu.c("options.darknessEffectScale.tooltip");
   private final ezj<Double> bV = new ezj<>(
      "options.darknessEffectScale",
      ezj.a(bU),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vt.c) : a($$0x, $$1x.doubleValue()),
      ezj.m.a.a(aww::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final vu bW = vu.c("options.glintSpeed.tooltip");
   private final ezj<Double> bX = new ezj<>(
      "options.glintSpeed", ezj.a(bW), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vt.c) : a($$0x, $$1x.doubleValue()), ezj.m.a, 0.5, $$0x -> {
      }
   );
   private static final vu bY = vu.c("options.glintStrength.tooltip");
   private final ezj<Double> bZ = new ezj<>(
      "options.glintStrength",
      ezj.a(bY),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vt.c) : a($$0x, $$1x.doubleValue()),
      ezj.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final vu ca = vu.c("options.damageTiltStrength.tooltip");
   private final ezj<Double> cb = new ezj<>(
      "options.damageTiltStrength", ezj.a(ca), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vt.c) : a($$0x, $$1x.doubleValue()), ezj.m.a, 1.0, $$0x -> {
      }
   );
   private final ezj<Double> cc = new ezj<>("options.gamma", ezj.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, vu.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, vu.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, vu.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, ezj.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cd = 2147483646;
   private final ezj<Integer> ce = new ezj<>(
      "options.guiScale", ezj.a(), ($$0x, $$1x) -> $$1x == 0 ? vu.c("options.guiScale.auto") : vu.b(Integer.toString($$1x)), new ezj.c(0, () -> {
         ezg $$0x = ezg.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final ezj<ezl> cf = new ezj<>(
      "options.particles", ezj.a(), ezj.b(), new ezj.e<>(Arrays.asList(ezl.values()), Codec.INT.xmap(ezl::a, ezl::a)), ezl.a, $$0x -> {
      }
   );
   private final ezj<ezi> cg = new ezj<>(
      "options.narrator",
      ezj.a(),
      ($$0x, $$1x) -> (vu)(this.Y.aY().a() ? $$1x.b() : vu.c("options.narrator.notavailable")),
      new ezj.e<>(Arrays.asList(ezi.values()), Codec.INT.xmap(ezi::a, ezi::a)),
      ezi.a,
      $$0x -> this.Y.aY().a($$0x)
   );
   public String ad = "en_us";
   private final ezj<String> ch = new ezj<>(
      "options.audioDevice",
      ezj.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return vu.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? vu.b($$1x.substring(gnn.c)) : vu.b($$1x);
         }
      },
      new ezj.h<>(
         () -> Stream.concat(Stream.of(""), ezg.Q().ak().a().stream()).toList(),
         $$0x -> ezg.Q().r() && $$0x != "" && !ezg.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gnq $$1x = ezg.Q().ak();
         $$1x.k();
         $$1x.a(gmh.a(aty.zN, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public ezj<Boolean> a() {
      return this.am;
   }

   public ezj<Boolean> b() {
      return this.ao;
   }

   public ezj<Boolean> c() {
      return this.aq;
   }

   public ezj<Double> d() {
      return this.ar;
   }

   public ezj<Integer> e() {
      return this.as;
   }

   public ezj<Integer> f() {
      return this.at;
   }

   public ezj<Double> g() {
      return this.av;
   }

   public ezj<Integer> h() {
      return this.aw;
   }

   public ezj<eyu> i() {
      return this.ax;
   }

   public ezj<eyz> j() {
      return this.aB;
   }

   public ezj<Boolean> k() {
      return this.aC;
   }

   public ezj<ezn> l() {
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

   public ezj<ciq> m() {
      return this.aH;
   }

   public ezj<Double> n() {
      return this.aI;
   }

   public ezj<Double> o() {
      return this.aJ;
   }

   public ezj<Double> p() {
      return this.aK;
   }

   public ezj<Double> q() {
      return this.aL;
   }

   public ezj<Boolean> r() {
      return this.aN;
   }

   public ezj<Boolean> s() {
      return this.aO;
   }

   public ezj<bpi> t() {
      return this.aQ;
   }

   public ezj<Double> u() {
      return this.aR;
   }

   public ezj<Double> v() {
      return this.aS;
   }

   public ezj<Double> w() {
      return this.aT;
   }

   public ezj<Double> x() {
      return this.aU;
   }

   public ezj<Double> y() {
      return this.aV;
   }

   public ezj<Double> z() {
      return this.aX;
   }

   public ezj<Integer> A() {
      return this.aY;
   }

   public ezj<eyq> B() {
      return this.aZ;
   }

   public ezj<Integer> C() {
      return this.ba;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return aww.a(Math.log10($$0) * 100.0);
   }

   public ezj<Double> D() {
      return this.bb;
   }

   public ezj<Boolean> E() {
      return this.bc;
   }

   public ezj<Boolean> F() {
      return this.bd;
   }

   public ezj<Boolean> G() {
      return this.be;
   }

   public ezj<Boolean> H() {
      return this.bf;
   }

   public ezj<Boolean> I() {
      return this.bg;
   }

   public ezj<Boolean> J() {
      return this.bh;
   }

   public ezj<Boolean> K() {
      return this.bi;
   }

   public ezj<Boolean> L() {
      return this.bj;
   }

   public ezj<Boolean> M() {
      return this.bk;
   }

   private static void aC() {
      ezg $$0 = ezg.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public ezj<Boolean> N() {
      return this.bl;
   }

   private static boolean aD() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public ezj<Boolean> O() {
      return this.bm;
   }

   public ezj<Boolean> P() {
      return this.bn;
   }

   public ezj<Boolean> Q() {
      return this.bo;
   }

   public ezj<Boolean> R() {
      return this.bp;
   }

   public ezj<Boolean> S() {
      return this.br;
   }

   public ezj<Boolean> T() {
      return this.bs;
   }

   public final float a(atz $$0) {
      return this.b($$0).c().floatValue();
   }

   public final ezj<Double> b(atz $$0) {
      return Objects.requireNonNull(this.bt.get($$0));
   }

   private ezj<Double> a(String $$0, atz $$1) {
      return new ezj<>(
         $$0, ezj.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, vt.c) : a($$0x, $$1x.doubleValue()), ezj.m.a, 1.0, $$1x -> ezg.Q().ak().a($$1, $$1x.floatValue())
      );
   }

   public ezj<Boolean> U() {
      return this.bu;
   }

   public ezj<Boolean> V() {
      return this.bx;
   }

   public ezj<Boolean> W() {
      return this.by;
   }

   public ezj<Boolean> X() {
      return this.bz;
   }

   public ezj<Boolean> Y() {
      return this.bA;
   }

   public ezj<Boolean> Z() {
      return this.bB;
   }

   public ezj<Boolean> aa() {
      return this.bE;
   }

   public ezj<Boolean> ab() {
      return this.bF;
   }

   public ezj<Boolean> ac() {
      return this.bH;
   }

   public ezj<Boolean> ad() {
      return this.bI;
   }

   public ezj<Boolean> ae() {
      return this.bK;
   }

   public ezj<Integer> af() {
      return this.bN;
   }

   public ezj<Boolean> ag() {
      return this.bP;
   }

   public ezj<Double> ah() {
      return this.bR;
   }

   public ezj<Double> ai() {
      return this.bT;
   }

   public ezj<Double> aj() {
      return this.bV;
   }

   public ezj<Double> ak() {
      return this.bX;
   }

   public ezj<Double> al() {
      return this.bZ;
   }

   public ezj<Double> am() {
      return this.cb;
   }

   public ezj<Double> an() {
      return this.cc;
   }

   public ezj<Integer> ao() {
      return this.ce;
   }

   public ezj<ezl> ap() {
      return this.cf;
   }

   public ezj<ezi> aq() {
      return this.cg;
   }

   public ezj<String> ar() {
      return this.ch;
   }

   public ezk(ezg $$0, File $$1) {
      this.Y = $$0;
      this.bL = new File($$1, "options.txt");
      boolean $$2 = $$0.ah();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.as = new ezj<>(
         "options.renderDistance",
         ezj.a(),
         ($$0x, $$1x) -> a($$0x, vu.a("options.chunks", $$1x)),
         new ezj.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> ezg.Q().f.r()
      );
      this.at = new ezj<>(
         "options.simulationDistance", ezj.a(), ($$0x, $$1x) -> a($$0x, vu.a("options.chunks", $$1x)), new ezj.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
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

   public void a(eze $$0, esu.a $$1) {
      $$0.b($$1);
      this.at();
   }

   private void a(ezk.b $$0) {
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

   private void a(ezk.a $$0) {
      this.a((ezk.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, ezk::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, ezk::c, ah::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, gov::a, gov::a);
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

      for (eze $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(esu.a($$3));
         }
      }

      for (atz $$4 : atz.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bt.get($$4));
      }

      for (cit $$5 : cit.values()) {
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
               this.aB.a(eyz.b);
            } else {
               this.aB.a(eyz.a);
            }
         }

         this.a(new ezk.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, ezj<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> ezk.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     ezk.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? ezk.a($$2) : $$1;
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
               } else if (ezk.a($$2)) {
                  return 1.0F;
               } else if (ezk.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     ezk.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         eze.d();
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
         this.a(new ezk.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, ezj<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> ezk.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(ezk.ah.toJson($$2x));
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

      for (cit $$1 : this.aP) {
         $$0 |= $$1.a();
      }

      return new aou(this.ad, this.as.c(), this.aH.c(), this.bg.c(), $$0, this.aQ.c(), this.Y.aS(), this.br.c());
   }

   public void av() {
      if (this.Y.s != null) {
         this.Y.s.cu.b(new yt(this.au()));
      }
   }

   private void b(cit $$0, boolean $$1) {
      if ($$1) {
         this.aP.add($$0);
      } else {
         this.aP.remove($$0);
      }
   }

   public boolean a(cit $$0) {
      return this.aP.contains($$0);
   }

   public void a(cit $$0, boolean $$1) {
      this.b($$0, $$1);
      this.av();
   }

   public eyu aw() {
      return this.aB() >= 4 ? this.ax.c() : eyu.a;
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

   public eys ay() {
      return this.bM;
   }

   public void a(eys $$0) {
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
      this.a(new ezk.b() {
         @Override
         public <T> void a(String $$0x, ezj<T> $$1) {
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

   interface a extends ezk.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, ezj<T> var2);
   }
}
