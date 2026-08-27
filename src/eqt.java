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

public class eqt {
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
   private static final tl al = tl.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final eqs<Boolean> am = eqs.a("options.darkMojangStudiosBackgroundColor", eqs.a(al), false);
   private static final tl an = tl.c("options.hideLightningFlashes.tooltip");
   private final eqs<Boolean> ao = eqs.a("options.hideLightningFlashes", eqs.a(an), false);
   private final eqs<Double> ap = new eqs<>("options.sensitivity", eqs.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, tl.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, tl.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, eqs.m.a, 0.5, $$0x -> {
   });
   private final eqs<Integer> aq;
   private final eqs<Integer> ar;
   private int as = 0;
   private final eqs<Double> at = new eqs<>(
      "options.entityDistanceScaling",
      eqs.a(),
      eqt::a,
      new eqs.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final eqs<Integer> au = new eqs<>(
      "options.framerateLimit",
      eqs.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, tl.c("options.framerateLimit.max")) : a($$0x, tl.a("options.framerate", $$1x)),
      new eqs.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> eqp.O().aM().a($$0x)
   );
   private final eqs<eqd> av = new eqs<>(
      "options.renderClouds",
      eqs.a(),
      eqs.b(),
      new eqs.e<>(Arrays.asList(eqd.values()), arj.a(eqd.d, Codec.BOOL, $$0x -> $$0x ? eqd.c : eqd.a)),
      eqd.c,
      $$0x -> {
         if (eqp.M()) {
            ejv $$1x = eqp.O().f.x();
            if ($$1x != null) {
               $$1x.b(eqp.a);
            }
         }
      }
   );
   private static final tl aw = tl.c("options.graphics.fast.tooltip");
   private static final tl ax = tl.a("options.graphics.fabulous.tooltip", tl.c("options.graphics.fabulous").a(n.u));
   private static final tl ay = tl.c("options.graphics.fancy.tooltip");
   private final eqs<eqi> az = new eqs<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> etv.a(ay);
            case a -> etv.a(aw);
            case c -> etv.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         tz $$2x = tl.c($$1x.b());
         return $$1x == eqi.c ? $$2x.a(n.u) : $$2x;
      },
      new eqs.a<>(
         Arrays.asList(eqi.values()),
         Stream.of(eqi.values()).filter($$0x -> $$0x != eqi.c).collect(Collectors.toList()),
         () -> eqp.O().r() && eqp.O().ah().h(),
         ($$0x, $$1x) -> {
            eqp $$2x = eqp.O();
            fnu $$3x = $$2x.ah();
            if ($$1x == eqi.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(eqi::a, eqi::a)
      ),
      eqi.b,
      $$0x -> {
      }
   );
   private final eqs<Boolean> aA = eqs.a("options.ao", true, $$0x -> eqp.O().f.f());
   private static final tl aB = tl.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final tl aC = tl.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final tl aD = tl.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final eqs<eqw> aE = new eqs<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> etv.a(aB);
         case b -> etv.a(aC);
         case c -> etv.a(aD);
      };
   }, eqs.b(), new eqs.e<>(Arrays.asList(eqw.values()), Codec.INT.xmap(eqw::a, eqw::a)), eqw.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final eqs<cby> aF = new eqs<>(
      "options.chat.visibility", eqs.a(), eqs.b(), new eqs.e<>(Arrays.asList(cby.values()), Codec.INT.xmap(cby::a, cby::a)), cby.a, $$0x -> {
      }
   );
   private final eqs<Double> aG = new eqs<>("options.chat.opacity", eqs.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), eqs.m.a, 1.0, $$0x -> eqp.O().l.d().b());
   private final eqs<Double> aH = new eqs<>("options.chat.line_spacing", eqs.a(), eqt::a, eqs.m.a, 0.0, $$0x -> {
   });
   private final eqs<Double> aI = new eqs<>("options.accessibility.text_background_opacity", eqs.a(), eqt::a, eqs.m.a, 0.5, $$0x -> eqp.O().l.d().b());
   private final eqs<Double> aJ = new eqs<>("options.accessibility.panorama_speed", eqs.a(), eqt::a, eqs.m.a, 1.0, $$0x -> {
   });
   private static final tl aK = tl.c("options.accessibility.high_contrast.tooltip");
   private final eqs<Boolean> aL = eqs.a("options.accessibility.high_contrast", eqs.a(aK), false, $$0x -> {
      anh $$1x = eqp.O().aa();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final eqs<Boolean> aM = eqs.a("options.accessibility.narrator_hotkey", eqs.a(tl.c("options.accessibility.narrator_hotkey.tooltip")), true);
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<ccb> aN = EnumSet.allOf(ccb.class);
   private final eqs<bjg> aO = new eqs<>("options.mainHand", eqs.a(), eqs.b(), new eqs.e<>(Arrays.asList(bjg.values()), bjg.c), bjg.b, $$0x -> this.at());
   public int o;
   public int p;
   private final eqs<Double> aP = new eqs<>(
      "options.chat.scale",
      eqs.a(),
      ($$0x, $$1x) -> (tl)($$1x == 0.0 ? tk.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      eqs.m.a,
      1.0,
      $$0x -> eqp.O().l.d().b()
   );
   private final eqs<Double> aQ = new eqs<>("options.chat.width", eqs.a(), ($$0x, $$1x) -> b($$0x, esl.a($$1x)), eqs.m.a, 1.0, $$0x -> eqp.O().l.d().b());
   private final eqs<Double> aR = new eqs<>(
      "options.chat.height.unfocused", eqs.a(), ($$0x, $$1x) -> b($$0x, esl.b($$1x)), eqs.m.a, esl.h(), $$0x -> eqp.O().l.d().b()
   );
   private final eqs<Double> aS = new eqs<>(
      "options.chat.height.focused", eqs.a(), ($$0x, $$1x) -> b($$0x, esl.b($$1x)), eqs.m.a, 1.0, $$0x -> eqp.O().l.d().b()
   );
   private final eqs<Double> aT = new eqs<>(
      "options.chat.delay_instant",
      eqs.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? tl.c("options.chat.delay_none") : tl.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new eqs.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> eqp.O().aW().a($$0x)
   );
   private static final tl aU = tl.c("options.notifications.display_time.tooltip");
   private final eqs<Double> aV = new eqs<>(
      "options.notifications.display_time",
      eqs.a(aU),
      ($$0x, $$1x) -> a($$0x, tl.a("options.multiplier", $$1x)),
      new eqs.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final eqs<Integer> aW = new eqs<>(
      "options.mipmapLevels", eqs.a(), ($$0x, $$1x) -> (tl)($$1x == 0 ? tk.a($$0x, false) : a($$0x, $$1x.intValue())), new eqs.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final eqs<epz> aX = new eqs<>(
      "options.attackIndicator", eqs.a(), eqs.b(), new eqs.e<>(Arrays.asList(epz.values()), Codec.INT.xmap(epz::a, epz::a)), epz.b, $$0x -> {
      }
   );
   public ger r = ger.a;
   public boolean s = false;
   public boolean t = false;
   private final eqs<Integer> aY = new eqs<>("options.biomeBlendRadius", eqs.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, tl.c("options.biomeBlendRadius." + $$2x));
   }, new eqs.f(0, 7), 2, $$0x -> eqp.O().f.f());
   private final eqs<Double> aZ = new eqs<>(
      "options.mouseWheelSensitivity",
      eqs.a(),
      ($$0x, $$1x) -> a($$0x, tl.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new eqs.f(-200, 100).a(eqt::c, eqt::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final eqs<Boolean> ba = eqs.a("options.rawMouseInput", true, $$0x -> {
      ekn $$1x = eqp.O().aM();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final eqs<Boolean> bb = eqs.a("options.autoJump", false);
   private final eqs<Boolean> bc = eqs.a("options.operatorItemsTab", false);
   private final eqs<Boolean> bd = eqs.a("options.autoSuggestCommands", true);
   private final eqs<Boolean> be = eqs.a("options.chat.color", true);
   private final eqs<Boolean> bf = eqs.a("options.chat.links", true);
   private final eqs<Boolean> bg = eqs.a("options.chat.links.prompt", true);
   private final eqs<Boolean> bh = eqs.a("options.vsync", true, $$0x -> {
      if (eqp.O().aM() != null) {
         eqp.O().aM().a($$0x);
      }
   });
   private final eqs<Boolean> bi = eqs.a("options.entityShadows", true);
   private final eqs<Boolean> bj = eqs.a("options.forceUnicodeFont", false, $$0x -> {
      eqp $$1x = eqp.O();
      if ($$1x.aM() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final eqs<Boolean> bk = eqs.a("options.invertMouse", false);
   private final eqs<Boolean> bl = eqs.a("options.discrete_mouse_scroll", false);
   private final eqs<Boolean> bm = eqs.a("options.realmsNotifications", true);
   private static final tl bn = tl.c("options.allowServerListing.tooltip");
   private final eqs<Boolean> bo = eqs.a("options.allowServerListing", eqs.a(bn), true, $$0x -> this.at());
   private final eqs<Boolean> bp = eqs.a("options.reducedDebugInfo", false);
   private final Map<aph, eqs<Double>> bq = ac.a(new EnumMap<>(aph.class), $$0x -> {
      for (aph $$1x : aph.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final eqs<Boolean> br = eqs.a("options.showSubtitles", false);
   private static final tl bs = tl.c("options.directionalAudio.on.tooltip");
   private static final tl bt = tl.c("options.directionalAudio.off.tooltip");
   private final eqs<Boolean> bu = eqs.a("options.directionalAudio", $$0x -> $$0x ? etv.a(bs) : etv.a(bt), false, $$0x -> {
      gdm $$1x = eqp.O().ai();
      $$1x.i();
      $$1x.a(gcd.a(apg.yu, 1.0F));
   });
   private final eqs<Boolean> bv = new eqs<>(
      "options.accessibility.text_background",
      eqs.a(),
      ($$0x, $$1x) -> $$1x ? tl.c("options.accessibility.text_background.chat") : tl.c("options.accessibility.text_background.everywhere"),
      eqs.a,
      true,
      $$0x -> {
      }
   );
   private final eqs<Boolean> bw = eqs.a("options.touchscreen", false);
   private final eqs<Boolean> bx = eqs.a("options.fullscreen", false, $$0x -> {
      eqp $$1x = eqp.O();
      if ($$1x.aM() != null && $$1x.aM().j() != $$0x) {
         $$1x.aM().h();
         this.W().a($$1x.aM().j());
      }
   });
   private final eqs<Boolean> by = eqs.a("options.viewBobbing", true);
   private static final tl bz = tl.c("options.key.toggle");
   private static final tl bA = tl.c("options.key.hold");
   private final eqs<Boolean> bB = new eqs<>("key.sneak", eqs.a(), ($$0x, $$1x) -> $$1x ? bz : bA, eqs.a, false, $$0x -> {
   });
   private final eqs<Boolean> bC = new eqs<>("key.sprint", eqs.a(), ($$0x, $$1x) -> $$1x ? bz : bA, eqs.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final tl bD = tl.c("options.hideMatchedNames.tooltip");
   private final eqs<Boolean> bE = eqs.a("options.hideMatchedNames", eqs.a(bD), true);
   private final eqs<Boolean> bF = eqs.a("options.autosaveIndicator", true);
   private static final tl bG = tl.c("options.onlyShowSecureChat.tooltip");
   private final eqs<Boolean> bH = eqs.a("options.onlyShowSecureChat", eqs.a(bG), false);
   public final eqn x = new eqn("key.forward", 87, "key.categories.movement");
   public final eqn y = new eqn("key.left", 65, "key.categories.movement");
   public final eqn z = new eqn("key.back", 83, "key.categories.movement");
   public final eqn A = new eqn("key.right", 68, "key.categories.movement");
   public final eqn B = new eqn("key.jump", 32, "key.categories.movement");
   public final eqn C = new erd("key.sneak", 340, "key.categories.movement", this.bB::c);
   public final eqn D = new erd("key.sprint", 341, "key.categories.movement", this.bC::c);
   public final eqn E = new eqn("key.inventory", 69, "key.categories.inventory");
   public final eqn F = new eqn("key.swapOffhand", 70, "key.categories.inventory");
   public final eqn G = new eqn("key.drop", 81, "key.categories.inventory");
   public final eqn H = new eqn("key.use", eke.b.c, 1, "key.categories.gameplay");
   public final eqn I = new eqn("key.attack", eke.b.c, 0, "key.categories.gameplay");
   public final eqn J = new eqn("key.pickItem", eke.b.c, 2, "key.categories.gameplay");
   public final eqn K = new eqn("key.chat", 84, "key.categories.multiplayer");
   public final eqn L = new eqn("key.playerlist", 258, "key.categories.multiplayer");
   public final eqn M = new eqn("key.command", 47, "key.categories.multiplayer");
   public final eqn N = new eqn("key.socialInteractions", 80, "key.categories.multiplayer");
   public final eqn O = new eqn("key.screenshot", 291, "key.categories.misc");
   public final eqn P = new eqn("key.togglePerspective", 294, "key.categories.misc");
   public final eqn Q = new eqn("key.smoothCamera", eke.bv.b(), "key.categories.misc");
   public final eqn R = new eqn("key.fullscreen", 300, "key.categories.misc");
   public final eqn S = new eqn("key.spectatorOutlines", eke.bv.b(), "key.categories.misc");
   public final eqn T = new eqn("key.advancements", 76, "key.categories.misc");
   public final eqn[] U = new eqn[]{
      new eqn("key.hotbar.1", 49, "key.categories.inventory"),
      new eqn("key.hotbar.2", 50, "key.categories.inventory"),
      new eqn("key.hotbar.3", 51, "key.categories.inventory"),
      new eqn("key.hotbar.4", 52, "key.categories.inventory"),
      new eqn("key.hotbar.5", 53, "key.categories.inventory"),
      new eqn("key.hotbar.6", 54, "key.categories.inventory"),
      new eqn("key.hotbar.7", 55, "key.categories.inventory"),
      new eqn("key.hotbar.8", 56, "key.categories.inventory"),
      new eqn("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final eqn V = new eqn("key.saveToolbarActivator", 67, "key.categories.creative");
   public final eqn W = new eqn("key.loadToolbarActivator", 88, "key.categories.creative");
   public final eqn[] X = (eqn[])ArrayUtils.addAll(
      new eqn[]{
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
   protected eqp Y;
   private final File bI;
   public boolean Z;
   private eqb bJ = eqb.a;
   public String aa = "";
   public boolean ab;
   private final eqs<Integer> bK = new eqs<>("options.fov", eqs.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, tl.c("options.fov.min"));
         case 110 -> a($$0x, tl.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new eqs.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> eqp.O().f.r());
   private static final tl bL = tl.a("options.telemetry.button.tooltip", tl.c("options.telemetry.state.minimal"), tl.c("options.telemetry.state.all"));
   private final eqs<Boolean> bM = eqs.a("options.telemetry.button", eqs.a(bL), ($$0x, $$1x) -> {
      eqp $$2x = eqp.O();
      if (!$$2x.C()) {
         return tl.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.B() ? tl.c("options.telemetry.state.all") : tl.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final tl bN = tl.c("options.screenEffectScale.tooltip");
   private final eqs<Double> bO = new eqs<>(
      "options.screenEffectScale", eqs.a(bN), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tk.c) : a($$0x, $$1x.doubleValue()), eqs.m.a, 1.0, $$0x -> {
      }
   );
   private static final tl bP = tl.c("options.fovEffectScale.tooltip");
   private final eqs<Double> bQ = new eqs<>(
      "options.fovEffectScale",
      eqs.a(bP),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tk.c) : a($$0x, $$1x.doubleValue()),
      eqs.m.a.a(asb::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final tl bR = tl.c("options.darknessEffectScale.tooltip");
   private final eqs<Double> bS = new eqs<>(
      "options.darknessEffectScale",
      eqs.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tk.c) : a($$0x, $$1x.doubleValue()),
      eqs.m.a.a(asb::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final tl bT = tl.c("options.glintSpeed.tooltip");
   private final eqs<Double> bU = new eqs<>(
      "options.glintSpeed", eqs.a(bT), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tk.c) : a($$0x, $$1x.doubleValue()), eqs.m.a, 0.5, $$0x -> {
      }
   );
   private static final tl bV = tl.c("options.glintStrength.tooltip");
   private final eqs<Double> bW = new eqs<>(
      "options.glintStrength",
      eqs.a(bV),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tk.c) : a($$0x, $$1x.doubleValue()),
      eqs.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final tl bX = tl.c("options.damageTiltStrength.tooltip");
   private final eqs<Double> bY = new eqs<>(
      "options.damageTiltStrength", eqs.a(bX), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tk.c) : a($$0x, $$1x.doubleValue()), eqs.m.a, 1.0, $$0x -> {
      }
   );
   private final eqs<Double> bZ = new eqs<>("options.gamma", eqs.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, tl.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, tl.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, tl.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, eqs.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int ca = 2147483646;
   private final eqs<Integer> cb = new eqs<>(
      "options.guiScale", eqs.a(), ($$0x, $$1x) -> $$1x == 0 ? tl.c("options.guiScale.auto") : tl.b(Integer.toString($$1x)), new eqs.c(0, () -> {
         eqp $$0x = eqp.O();
         return !$$0x.r() ? 2147483646 : $$0x.aM().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final eqs<equ> cc = new eqs<>(
      "options.particles", eqs.a(), eqs.b(), new eqs.e<>(Arrays.asList(equ.values()), Codec.INT.xmap(equ::a, equ::a)), equ.a, $$0x -> {
      }
   );
   private final eqs<eqr> cd = new eqs<>(
      "options.narrator",
      eqs.a(),
      ($$0x, $$1x) -> (tl)(this.Y.aV().a() ? $$1x.b() : tl.c("options.narrator.notavailable")),
      new eqs.e<>(Arrays.asList(eqr.values()), Codec.INT.xmap(eqr::a, eqr::a)),
      eqr.a,
      $$0x -> this.Y.aV().a($$0x)
   );
   public String ad = "en_us";
   private final eqs<String> ce = new eqs<>(
      "options.audioDevice",
      eqs.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return tl.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? tl.b($$1x.substring(gdj.c)) : tl.b($$1x);
         }
      },
      new eqs.h<>(
         () -> Stream.concat(Stream.of(""), eqp.O().ai().a().stream()).toList(),
         $$0x -> eqp.O().r() && $$0x != "" && !eqp.O().ai().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gdm $$1x = eqp.O().ai();
         $$1x.i();
         $$1x.a(gcd.a(apg.yu, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public eqs<Boolean> a() {
      return this.am;
   }

   public eqs<Boolean> b() {
      return this.ao;
   }

   public eqs<Double> c() {
      return this.ap;
   }

   public eqs<Integer> d() {
      return this.aq;
   }

   public eqs<Integer> e() {
      return this.ar;
   }

   public eqs<Double> f() {
      return this.at;
   }

   public eqs<Integer> g() {
      return this.au;
   }

   public eqs<eqd> h() {
      return this.av;
   }

   public eqs<eqi> i() {
      return this.az;
   }

   public eqs<Boolean> j() {
      return this.aA;
   }

   public eqs<eqw> k() {
      return this.aE;
   }

   public void a(anh $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (ane $$2 : $$0.f()) {
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

   public eqs<cby> l() {
      return this.aF;
   }

   public eqs<Double> m() {
      return this.aG;
   }

   public eqs<Double> n() {
      return this.aH;
   }

   public eqs<Double> o() {
      return this.aI;
   }

   public eqs<Double> p() {
      return this.aJ;
   }

   public eqs<Boolean> q() {
      return this.aL;
   }

   public eqs<Boolean> r() {
      return this.aM;
   }

   public eqs<bjg> s() {
      return this.aO;
   }

   public eqs<Double> t() {
      return this.aP;
   }

   public eqs<Double> u() {
      return this.aQ;
   }

   public eqs<Double> v() {
      return this.aR;
   }

   public eqs<Double> w() {
      return this.aS;
   }

   public eqs<Double> x() {
      return this.aT;
   }

   public eqs<Double> y() {
      return this.aV;
   }

   public eqs<Integer> z() {
      return this.aW;
   }

   public eqs<epz> A() {
      return this.aX;
   }

   public eqs<Integer> B() {
      return this.aY;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return asb.a(Math.log10($$0) * 100.0);
   }

   public eqs<Double> C() {
      return this.aZ;
   }

   public eqs<Boolean> D() {
      return this.ba;
   }

   public eqs<Boolean> E() {
      return this.bb;
   }

   public eqs<Boolean> F() {
      return this.bc;
   }

   public eqs<Boolean> G() {
      return this.bd;
   }

   public eqs<Boolean> H() {
      return this.be;
   }

   public eqs<Boolean> I() {
      return this.bf;
   }

   public eqs<Boolean> J() {
      return this.bg;
   }

   public eqs<Boolean> K() {
      return this.bh;
   }

   public eqs<Boolean> L() {
      return this.bi;
   }

   public eqs<Boolean> M() {
      return this.bj;
   }

   public eqs<Boolean> N() {
      return this.bk;
   }

   public eqs<Boolean> O() {
      return this.bl;
   }

   public eqs<Boolean> P() {
      return this.bm;
   }

   public eqs<Boolean> Q() {
      return this.bo;
   }

   public eqs<Boolean> R() {
      return this.bp;
   }

   public final float a(aph $$0) {
      return this.b($$0).c().floatValue();
   }

   public final eqs<Double> b(aph $$0) {
      return Objects.requireNonNull(this.bq.get($$0));
   }

   private eqs<Double> a(String $$0, aph $$1) {
      return new eqs<>(
         $$0, eqs.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tk.c) : a($$0x, $$1x.doubleValue()), eqs.m.a, 1.0, $$1x -> eqp.O().ai().a($$1, $$1x.floatValue())
      );
   }

   public eqs<Boolean> S() {
      return this.br;
   }

   public eqs<Boolean> T() {
      return this.bu;
   }

   public eqs<Boolean> U() {
      return this.bv;
   }

   public eqs<Boolean> V() {
      return this.bw;
   }

   public eqs<Boolean> W() {
      return this.bx;
   }

   public eqs<Boolean> X() {
      return this.by;
   }

   public eqs<Boolean> Y() {
      return this.bB;
   }

   public eqs<Boolean> Z() {
      return this.bC;
   }

   public eqs<Boolean> aa() {
      return this.bE;
   }

   public eqs<Boolean> ab() {
      return this.bF;
   }

   public eqs<Boolean> ac() {
      return this.bH;
   }

   public eqs<Integer> ad() {
      return this.bK;
   }

   public eqs<Boolean> ae() {
      return this.bM;
   }

   public eqs<Double> af() {
      return this.bO;
   }

   public eqs<Double> ag() {
      return this.bQ;
   }

   public eqs<Double> ah() {
      return this.bS;
   }

   public eqs<Double> ai() {
      return this.bU;
   }

   public eqs<Double> aj() {
      return this.bW;
   }

   public eqs<Double> ak() {
      return this.bY;
   }

   public eqs<Double> al() {
      return this.bZ;
   }

   public eqs<Integer> am() {
      return this.cb;
   }

   public eqs<equ> an() {
      return this.cc;
   }

   public eqs<eqr> ao() {
      return this.cd;
   }

   public eqs<String> ap() {
      return this.ce;
   }

   public eqt(eqp $$0, File $$1) {
      this.Y = $$0;
      this.bI = new File($$1, "options.txt");
      boolean $$2 = $$0.af();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new eqs<>(
         "options.renderDistance",
         eqs.a(),
         ($$0x, $$1x) -> a($$0x, tl.a("options.chunks", $$1x)),
         new eqs.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> eqp.O().f.r()
      );
      this.ar = new eqs<>(
         "options.simulationDistance", eqs.a(), ($$0x, $$1x) -> a($$0x, tl.a("options.chunks", $$1x)), new eqs.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
         }
      );
      this.af = ac.i() == ac.a.c;
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

   public void a(eqn $$0, eke.a $$1) {
      $$0.b($$1);
      this.ar();
   }

   private void a(eqt.a $$0) {
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
      this.i = $$0.a("resourcePacks", this.i, eqt::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, eqt::c, ah::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, ger::a, ger::a);
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

      for (eqn $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(eke.a($$3));
         }
      }

      for (aph $$4 : aph.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bq.get($$4));
      }

      for (ccb $$5 : ccb.values()) {
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

         qw $$0 = new qw();

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

         final qw $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.az.a(eqi.b);
            } else {
               this.az.a(eqi.a);
            }
         }

         this.a(new eqt.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, eqs<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> eqt.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     eqt.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? eqt.a($$2) : $$1;
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
               } else if (eqt.a($$2)) {
                  return 1.0F;
               } else if (eqt.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     eqt.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         eqn.d();
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

   private qw a(qw $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return atg.e.a(this.Y.ar(), $$0, $$1);
   }

   public void ar() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bI), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new eqt.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, eqs<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> eqt.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(eqt.ah.toJson($$2x));
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

   public aki as() {
      int $$0 = 0;

      for (ccb $$1 : this.aN) {
         $$0 |= $$1.a();
      }

      return new aki(this.ad, this.aq.c(), this.aF.c(), this.be.c(), $$0, this.aO.c(), this.Y.aQ(), this.bo.c());
   }

   public void at() {
      if (this.Y.s != null) {
         this.Y.s.cn.b(new vp(this.as()));
      }
   }

   private void b(ccb $$0, boolean $$1) {
      if ($$1) {
         this.aN.add($$0);
      } else {
         this.aN.remove($$0);
      }
   }

   public boolean a(ccb $$0) {
      return this.aN.contains($$0);
   }

   public void a(ccb $$0, boolean $$1) {
      this.b($$0, $$1);
      this.at();
   }

   public eqd au() {
      return this.az() >= 4 ? this.av.c() : eqd.a;
   }

   public boolean av() {
      return this.q;
   }

   public void b(anh $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         ane $$4 = $$0.c($$3);
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

   public eqb aw() {
      return this.bJ;
   }

   public void a(eqb $$0) {
      this.bJ = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = arr.a(ah, $$0, ai);
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

   private static tl b(tl $$0, int $$1) {
      return tl.a("options.pixel_value", $$0, $$1);
   }

   private static tl a(tl $$0, double $$1) {
      return tl.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static tl a(tl $$0, tl $$1) {
      return tl.a("options.generic_value", $$0, $$1);
   }

   public static tl a(tl $$0, int $$1) {
      return a($$0, tl.b(Integer.toString($$1)));
   }

   interface a {
      <T> void a(String var1, eqs<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
