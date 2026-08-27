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

public class eqz {
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
   private static final tm al = tm.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final eqy<Boolean> am = eqy.a("options.darkMojangStudiosBackgroundColor", eqy.a(al), false);
   private static final tm an = tm.c("options.hideLightningFlashes.tooltip");
   private final eqy<Boolean> ao = eqy.a("options.hideLightningFlashes", eqy.a(an), false);
   private final eqy<Double> ap = new eqy<>("options.sensitivity", eqy.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, tm.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, tm.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, eqy.m.a, 0.5, $$0x -> {
   });
   private final eqy<Integer> aq;
   private final eqy<Integer> ar;
   private int as = 0;
   private final eqy<Double> at = new eqy<>(
      "options.entityDistanceScaling",
      eqy.a(),
      eqz::a,
      new eqy.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final eqy<Integer> au = new eqy<>(
      "options.framerateLimit",
      eqy.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, tm.c("options.framerateLimit.max")) : a($$0x, tm.a("options.framerate", $$1x)),
      new eqy.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> eqv.O().aM().a($$0x)
   );
   private final eqy<eqj> av = new eqy<>(
      "options.renderClouds",
      eqy.a(),
      eqy.b(),
      new eqy.e<>(Arrays.asList(eqj.values()), arg.a(eqj.d, Codec.BOOL, $$0x -> $$0x ? eqj.c : eqj.a)),
      eqj.c,
      $$0x -> {
         if (eqv.M()) {
            ekb $$1x = eqv.O().f.x();
            if ($$1x != null) {
               $$1x.b(eqv.a);
            }
         }
      }
   );
   private static final tm aw = tm.c("options.graphics.fast.tooltip");
   private static final tm ax = tm.a("options.graphics.fabulous.tooltip", tm.c("options.graphics.fabulous").a(n.u));
   private static final tm ay = tm.c("options.graphics.fancy.tooltip");
   private final eqy<eqo> az = new eqy<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> eua.a(ay);
            case a -> eua.a(aw);
            case c -> eua.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         tz $$2x = tm.c($$1x.b());
         return $$1x == eqo.c ? $$2x.a(n.u) : $$2x;
      },
      new eqy.a<>(
         Arrays.asList(eqo.values()),
         Stream.of(eqo.values()).filter($$0x -> $$0x != eqo.c).collect(Collectors.toList()),
         () -> eqv.O().r() && eqv.O().ah().h(),
         ($$0x, $$1x) -> {
            eqv $$2x = eqv.O();
            fny $$3x = $$2x.ah();
            if ($$1x == eqo.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(eqo::a, eqo::a)
      ),
      eqo.b,
      $$0x -> {
      }
   );
   private final eqy<Boolean> aA = eqy.a("options.ao", true, $$0x -> eqv.O().f.f());
   private static final tm aB = tm.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final tm aC = tm.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final tm aD = tm.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final eqy<erc> aE = new eqy<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> eua.a(aB);
         case b -> eua.a(aC);
         case c -> eua.a(aD);
      };
   }, eqy.b(), new eqy.e<>(Arrays.asList(erc.values()), Codec.INT.xmap(erc::a, erc::a)), erc.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final eqy<cbs> aF = new eqy<>(
      "options.chat.visibility", eqy.a(), eqy.b(), new eqy.e<>(Arrays.asList(cbs.values()), Codec.INT.xmap(cbs::a, cbs::a)), cbs.a, $$0x -> {
      }
   );
   private final eqy<Double> aG = new eqy<>("options.chat.opacity", eqy.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), eqy.m.a, 1.0, $$0x -> eqv.O().l.d().b());
   private final eqy<Double> aH = new eqy<>("options.chat.line_spacing", eqy.a(), eqz::a, eqy.m.a, 0.0, $$0x -> {
   });
   private final eqy<Double> aI = new eqy<>("options.accessibility.text_background_opacity", eqy.a(), eqz::a, eqy.m.a, 0.5, $$0x -> eqv.O().l.d().b());
   private final eqy<Double> aJ = new eqy<>("options.accessibility.panorama_speed", eqy.a(), eqz::a, eqy.m.a, 1.0, $$0x -> {
   });
   private static final tm aK = tm.c("options.accessibility.high_contrast.tooltip");
   private final eqy<Boolean> aL = eqy.a("options.accessibility.high_contrast", eqy.a(aK), false, $$0x -> {
      anf $$1x = eqv.O().aa();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final eqy<Boolean> aM = eqy.a("options.accessibility.narrator_hotkey", eqy.a(tm.c("options.accessibility.narrator_hotkey.tooltip")), true);
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cbv> aN = EnumSet.allOf(cbv.class);
   private final eqy<bja> aO = new eqy<>("options.mainHand", eqy.a(), eqy.b(), new eqy.e<>(Arrays.asList(bja.values()), bja.c), bja.b, $$0x -> this.at());
   public int o;
   public int p;
   private final eqy<Double> aP = new eqy<>(
      "options.chat.scale",
      eqy.a(),
      ($$0x, $$1x) -> (tm)($$1x == 0.0 ? tl.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      eqy.m.a,
      1.0,
      $$0x -> eqv.O().l.d().b()
   );
   private final eqy<Double> aQ = new eqy<>("options.chat.width", eqy.a(), ($$0x, $$1x) -> b($$0x, esr.a($$1x)), eqy.m.a, 1.0, $$0x -> eqv.O().l.d().b());
   private final eqy<Double> aR = new eqy<>(
      "options.chat.height.unfocused", eqy.a(), ($$0x, $$1x) -> b($$0x, esr.b($$1x)), eqy.m.a, esr.h(), $$0x -> eqv.O().l.d().b()
   );
   private final eqy<Double> aS = new eqy<>(
      "options.chat.height.focused", eqy.a(), ($$0x, $$1x) -> b($$0x, esr.b($$1x)), eqy.m.a, 1.0, $$0x -> eqv.O().l.d().b()
   );
   private final eqy<Double> aT = new eqy<>(
      "options.chat.delay_instant",
      eqy.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? tm.c("options.chat.delay_none") : tm.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new eqy.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> eqv.O().aW().a($$0x)
   );
   private static final tm aU = tm.c("options.notifications.display_time.tooltip");
   private final eqy<Double> aV = new eqy<>(
      "options.notifications.display_time",
      eqy.a(aU),
      ($$0x, $$1x) -> a($$0x, tm.a("options.multiplier", $$1x)),
      new eqy.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final eqy<Integer> aW = new eqy<>(
      "options.mipmapLevels", eqy.a(), ($$0x, $$1x) -> (tm)($$1x == 0 ? tl.a($$0x, false) : a($$0x, $$1x.intValue())), new eqy.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final eqy<eqf> aX = new eqy<>(
      "options.attackIndicator", eqy.a(), eqy.b(), new eqy.e<>(Arrays.asList(eqf.values()), Codec.INT.xmap(eqf::a, eqf::a)), eqf.b, $$0x -> {
      }
   );
   public gev r = gev.a;
   public boolean s = false;
   public boolean t = false;
   private final eqy<Integer> aY = new eqy<>("options.biomeBlendRadius", eqy.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, tm.c("options.biomeBlendRadius." + $$2x));
   }, new eqy.f(0, 7), 2, $$0x -> eqv.O().f.f());
   private final eqy<Double> aZ = new eqy<>(
      "options.mouseWheelSensitivity",
      eqy.a(),
      ($$0x, $$1x) -> a($$0x, tm.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new eqy.f(-200, 100).a(eqz::c, eqz::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final eqy<Boolean> ba = eqy.a("options.rawMouseInput", true, $$0x -> {
      ekt $$1x = eqv.O().aM();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final eqy<Boolean> bb = eqy.a("options.autoJump", false);
   private final eqy<Boolean> bc = eqy.a("options.operatorItemsTab", false);
   private final eqy<Boolean> bd = eqy.a("options.autoSuggestCommands", true);
   private final eqy<Boolean> be = eqy.a("options.chat.color", true);
   private final eqy<Boolean> bf = eqy.a("options.chat.links", true);
   private final eqy<Boolean> bg = eqy.a("options.chat.links.prompt", true);
   private final eqy<Boolean> bh = eqy.a("options.vsync", true, $$0x -> {
      if (eqv.O().aM() != null) {
         eqv.O().aM().a($$0x);
      }
   });
   private final eqy<Boolean> bi = eqy.a("options.entityShadows", true);
   private final eqy<Boolean> bj = eqy.a("options.forceUnicodeFont", false, $$0x -> {
      eqv $$1x = eqv.O();
      if ($$1x.aM() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final eqy<Boolean> bk = eqy.a("options.invertMouse", false);
   private final eqy<Boolean> bl = eqy.a("options.discrete_mouse_scroll", false);
   private final eqy<Boolean> bm = eqy.a("options.realmsNotifications", true);
   private static final tm bn = tm.c("options.allowServerListing.tooltip");
   private final eqy<Boolean> bo = eqy.a("options.allowServerListing", eqy.a(bn), true, $$0x -> this.at());
   private final eqy<Boolean> bp = eqy.a("options.reducedDebugInfo", false);
   private final Map<apf, eqy<Double>> bq = ac.a(new EnumMap<>(apf.class), $$0x -> {
      for (apf $$1x : apf.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final eqy<Boolean> br = eqy.a("options.showSubtitles", false);
   private static final tm bs = tm.c("options.directionalAudio.on.tooltip");
   private static final tm bt = tm.c("options.directionalAudio.off.tooltip");
   private final eqy<Boolean> bu = eqy.a("options.directionalAudio", $$0x -> $$0x ? eua.a(bs) : eua.a(bt), false, $$0x -> {
      gdq $$1x = eqv.O().ai();
      $$1x.i();
      $$1x.a(gch.a(ape.yu, 1.0F));
   });
   private final eqy<Boolean> bv = new eqy<>(
      "options.accessibility.text_background",
      eqy.a(),
      ($$0x, $$1x) -> $$1x ? tm.c("options.accessibility.text_background.chat") : tm.c("options.accessibility.text_background.everywhere"),
      eqy.a,
      true,
      $$0x -> {
      }
   );
   private final eqy<Boolean> bw = eqy.a("options.touchscreen", false);
   private final eqy<Boolean> bx = eqy.a("options.fullscreen", false, $$0x -> {
      eqv $$1x = eqv.O();
      if ($$1x.aM() != null && $$1x.aM().j() != $$0x) {
         $$1x.aM().h();
         this.W().a($$1x.aM().j());
      }
   });
   private final eqy<Boolean> by = eqy.a("options.viewBobbing", true);
   private static final tm bz = tm.c("options.key.toggle");
   private static final tm bA = tm.c("options.key.hold");
   private final eqy<Boolean> bB = new eqy<>("key.sneak", eqy.a(), ($$0x, $$1x) -> $$1x ? bz : bA, eqy.a, false, $$0x -> {
   });
   private final eqy<Boolean> bC = new eqy<>("key.sprint", eqy.a(), ($$0x, $$1x) -> $$1x ? bz : bA, eqy.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final tm bD = tm.c("options.hideMatchedNames.tooltip");
   private final eqy<Boolean> bE = eqy.a("options.hideMatchedNames", eqy.a(bD), true);
   private final eqy<Boolean> bF = eqy.a("options.autosaveIndicator", true);
   private static final tm bG = tm.c("options.onlyShowSecureChat.tooltip");
   private final eqy<Boolean> bH = eqy.a("options.onlyShowSecureChat", eqy.a(bG), false);
   public final eqt x = new eqt("key.forward", 87, "key.categories.movement");
   public final eqt y = new eqt("key.left", 65, "key.categories.movement");
   public final eqt z = new eqt("key.back", 83, "key.categories.movement");
   public final eqt A = new eqt("key.right", 68, "key.categories.movement");
   public final eqt B = new eqt("key.jump", 32, "key.categories.movement");
   public final eqt C = new erj("key.sneak", 340, "key.categories.movement", this.bB::c);
   public final eqt D = new erj("key.sprint", 341, "key.categories.movement", this.bC::c);
   public final eqt E = new eqt("key.inventory", 69, "key.categories.inventory");
   public final eqt F = new eqt("key.swapOffhand", 70, "key.categories.inventory");
   public final eqt G = new eqt("key.drop", 81, "key.categories.inventory");
   public final eqt H = new eqt("key.use", ekk.b.c, 1, "key.categories.gameplay");
   public final eqt I = new eqt("key.attack", ekk.b.c, 0, "key.categories.gameplay");
   public final eqt J = new eqt("key.pickItem", ekk.b.c, 2, "key.categories.gameplay");
   public final eqt K = new eqt("key.chat", 84, "key.categories.multiplayer");
   public final eqt L = new eqt("key.playerlist", 258, "key.categories.multiplayer");
   public final eqt M = new eqt("key.command", 47, "key.categories.multiplayer");
   public final eqt N = new eqt("key.socialInteractions", 80, "key.categories.multiplayer");
   public final eqt O = new eqt("key.screenshot", 291, "key.categories.misc");
   public final eqt P = new eqt("key.togglePerspective", 294, "key.categories.misc");
   public final eqt Q = new eqt("key.smoothCamera", ekk.bv.b(), "key.categories.misc");
   public final eqt R = new eqt("key.fullscreen", 300, "key.categories.misc");
   public final eqt S = new eqt("key.spectatorOutlines", ekk.bv.b(), "key.categories.misc");
   public final eqt T = new eqt("key.advancements", 76, "key.categories.misc");
   public final eqt[] U = new eqt[]{
      new eqt("key.hotbar.1", 49, "key.categories.inventory"),
      new eqt("key.hotbar.2", 50, "key.categories.inventory"),
      new eqt("key.hotbar.3", 51, "key.categories.inventory"),
      new eqt("key.hotbar.4", 52, "key.categories.inventory"),
      new eqt("key.hotbar.5", 53, "key.categories.inventory"),
      new eqt("key.hotbar.6", 54, "key.categories.inventory"),
      new eqt("key.hotbar.7", 55, "key.categories.inventory"),
      new eqt("key.hotbar.8", 56, "key.categories.inventory"),
      new eqt("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final eqt V = new eqt("key.saveToolbarActivator", 67, "key.categories.creative");
   public final eqt W = new eqt("key.loadToolbarActivator", 88, "key.categories.creative");
   public final eqt[] X = (eqt[])ArrayUtils.addAll(
      new eqt[]{
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
   protected eqv Y;
   private final File bI;
   public boolean Z;
   private eqh bJ = eqh.a;
   public String aa = "";
   public boolean ab;
   private final eqy<Integer> bK = new eqy<>("options.fov", eqy.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, tm.c("options.fov.min"));
         case 110 -> a($$0x, tm.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new eqy.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> eqv.O().f.r());
   private static final tm bL = tm.a("options.telemetry.button.tooltip", tm.c("options.telemetry.state.minimal"), tm.c("options.telemetry.state.all"));
   private final eqy<Boolean> bM = eqy.a("options.telemetry.button", eqy.a(bL), ($$0x, $$1x) -> {
      eqv $$2x = eqv.O();
      if (!$$2x.C()) {
         return tm.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.B() ? tm.c("options.telemetry.state.all") : tm.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final tm bN = tm.c("options.screenEffectScale.tooltip");
   private final eqy<Double> bO = new eqy<>(
      "options.screenEffectScale", eqy.a(bN), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tl.c) : a($$0x, $$1x.doubleValue()), eqy.m.a, 1.0, $$0x -> {
      }
   );
   private static final tm bP = tm.c("options.fovEffectScale.tooltip");
   private final eqy<Double> bQ = new eqy<>(
      "options.fovEffectScale",
      eqy.a(bP),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tl.c) : a($$0x, $$1x.doubleValue()),
      eqy.m.a.a(arx::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final tm bR = tm.c("options.darknessEffectScale.tooltip");
   private final eqy<Double> bS = new eqy<>(
      "options.darknessEffectScale",
      eqy.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tl.c) : a($$0x, $$1x.doubleValue()),
      eqy.m.a.a(arx::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final tm bT = tm.c("options.glintSpeed.tooltip");
   private final eqy<Double> bU = new eqy<>(
      "options.glintSpeed", eqy.a(bT), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tl.c) : a($$0x, $$1x.doubleValue()), eqy.m.a, 0.5, $$0x -> {
      }
   );
   private static final tm bV = tm.c("options.glintStrength.tooltip");
   private final eqy<Double> bW = new eqy<>(
      "options.glintStrength",
      eqy.a(bV),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tl.c) : a($$0x, $$1x.doubleValue()),
      eqy.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final tm bX = tm.c("options.damageTiltStrength.tooltip");
   private final eqy<Double> bY = new eqy<>(
      "options.damageTiltStrength", eqy.a(bX), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tl.c) : a($$0x, $$1x.doubleValue()), eqy.m.a, 1.0, $$0x -> {
      }
   );
   private final eqy<Double> bZ = new eqy<>("options.gamma", eqy.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, tm.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, tm.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, tm.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, eqy.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int ca = 2147483646;
   private final eqy<Integer> cb = new eqy<>(
      "options.guiScale", eqy.a(), ($$0x, $$1x) -> $$1x == 0 ? tm.c("options.guiScale.auto") : tm.b(Integer.toString($$1x)), new eqy.c(0, () -> {
         eqv $$0x = eqv.O();
         return !$$0x.r() ? 2147483646 : $$0x.aM().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final eqy<era> cc = new eqy<>(
      "options.particles", eqy.a(), eqy.b(), new eqy.e<>(Arrays.asList(era.values()), Codec.INT.xmap(era::a, era::a)), era.a, $$0x -> {
      }
   );
   private final eqy<eqx> cd = new eqy<>(
      "options.narrator",
      eqy.a(),
      ($$0x, $$1x) -> (tm)(this.Y.aV().a() ? $$1x.b() : tm.c("options.narrator.notavailable")),
      new eqy.e<>(Arrays.asList(eqx.values()), Codec.INT.xmap(eqx::a, eqx::a)),
      eqx.a,
      $$0x -> this.Y.aV().a($$0x)
   );
   public String ad = "en_us";
   private final eqy<String> ce = new eqy<>(
      "options.audioDevice",
      eqy.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return tm.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? tm.b($$1x.substring(gdn.c)) : tm.b($$1x);
         }
      },
      new eqy.h<>(
         () -> Stream.concat(Stream.of(""), eqv.O().ai().a().stream()).toList(),
         $$0x -> eqv.O().r() && $$0x != "" && !eqv.O().ai().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gdq $$1x = eqv.O().ai();
         $$1x.i();
         $$1x.a(gch.a(ape.yu, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public eqy<Boolean> a() {
      return this.am;
   }

   public eqy<Boolean> b() {
      return this.ao;
   }

   public eqy<Double> c() {
      return this.ap;
   }

   public eqy<Integer> d() {
      return this.aq;
   }

   public eqy<Integer> e() {
      return this.ar;
   }

   public eqy<Double> f() {
      return this.at;
   }

   public eqy<Integer> g() {
      return this.au;
   }

   public eqy<eqj> h() {
      return this.av;
   }

   public eqy<eqo> i() {
      return this.az;
   }

   public eqy<Boolean> j() {
      return this.aA;
   }

   public eqy<erc> k() {
      return this.aE;
   }

   public void a(anf $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (anc $$2 : $$0.f()) {
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

   public eqy<cbs> l() {
      return this.aF;
   }

   public eqy<Double> m() {
      return this.aG;
   }

   public eqy<Double> n() {
      return this.aH;
   }

   public eqy<Double> o() {
      return this.aI;
   }

   public eqy<Double> p() {
      return this.aJ;
   }

   public eqy<Boolean> q() {
      return this.aL;
   }

   public eqy<Boolean> r() {
      return this.aM;
   }

   public eqy<bja> s() {
      return this.aO;
   }

   public eqy<Double> t() {
      return this.aP;
   }

   public eqy<Double> u() {
      return this.aQ;
   }

   public eqy<Double> v() {
      return this.aR;
   }

   public eqy<Double> w() {
      return this.aS;
   }

   public eqy<Double> x() {
      return this.aT;
   }

   public eqy<Double> y() {
      return this.aV;
   }

   public eqy<Integer> z() {
      return this.aW;
   }

   public eqy<eqf> A() {
      return this.aX;
   }

   public eqy<Integer> B() {
      return this.aY;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return arx.a(Math.log10($$0) * 100.0);
   }

   public eqy<Double> C() {
      return this.aZ;
   }

   public eqy<Boolean> D() {
      return this.ba;
   }

   public eqy<Boolean> E() {
      return this.bb;
   }

   public eqy<Boolean> F() {
      return this.bc;
   }

   public eqy<Boolean> G() {
      return this.bd;
   }

   public eqy<Boolean> H() {
      return this.be;
   }

   public eqy<Boolean> I() {
      return this.bf;
   }

   public eqy<Boolean> J() {
      return this.bg;
   }

   public eqy<Boolean> K() {
      return this.bh;
   }

   public eqy<Boolean> L() {
      return this.bi;
   }

   public eqy<Boolean> M() {
      return this.bj;
   }

   public eqy<Boolean> N() {
      return this.bk;
   }

   public eqy<Boolean> O() {
      return this.bl;
   }

   public eqy<Boolean> P() {
      return this.bm;
   }

   public eqy<Boolean> Q() {
      return this.bo;
   }

   public eqy<Boolean> R() {
      return this.bp;
   }

   public final float a(apf $$0) {
      return this.b($$0).c().floatValue();
   }

   public final eqy<Double> b(apf $$0) {
      return Objects.requireNonNull(this.bq.get($$0));
   }

   private eqy<Double> a(String $$0, apf $$1) {
      return new eqy<>(
         $$0, eqy.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, tl.c) : a($$0x, $$1x.doubleValue()), eqy.m.a, 1.0, $$1x -> eqv.O().ai().a($$1, $$1x.floatValue())
      );
   }

   public eqy<Boolean> S() {
      return this.br;
   }

   public eqy<Boolean> T() {
      return this.bu;
   }

   public eqy<Boolean> U() {
      return this.bv;
   }

   public eqy<Boolean> V() {
      return this.bw;
   }

   public eqy<Boolean> W() {
      return this.bx;
   }

   public eqy<Boolean> X() {
      return this.by;
   }

   public eqy<Boolean> Y() {
      return this.bB;
   }

   public eqy<Boolean> Z() {
      return this.bC;
   }

   public eqy<Boolean> aa() {
      return this.bE;
   }

   public eqy<Boolean> ab() {
      return this.bF;
   }

   public eqy<Boolean> ac() {
      return this.bH;
   }

   public eqy<Integer> ad() {
      return this.bK;
   }

   public eqy<Boolean> ae() {
      return this.bM;
   }

   public eqy<Double> af() {
      return this.bO;
   }

   public eqy<Double> ag() {
      return this.bQ;
   }

   public eqy<Double> ah() {
      return this.bS;
   }

   public eqy<Double> ai() {
      return this.bU;
   }

   public eqy<Double> aj() {
      return this.bW;
   }

   public eqy<Double> ak() {
      return this.bY;
   }

   public eqy<Double> al() {
      return this.bZ;
   }

   public eqy<Integer> am() {
      return this.cb;
   }

   public eqy<era> an() {
      return this.cc;
   }

   public eqy<eqx> ao() {
      return this.cd;
   }

   public eqy<String> ap() {
      return this.ce;
   }

   public eqz(eqv $$0, File $$1) {
      this.Y = $$0;
      this.bI = new File($$1, "options.txt");
      boolean $$2 = $$0.af();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new eqy<>(
         "options.renderDistance",
         eqy.a(),
         ($$0x, $$1x) -> a($$0x, tm.a("options.chunks", $$1x)),
         new eqy.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> eqv.O().f.r()
      );
      this.ar = new eqy<>(
         "options.simulationDistance", eqy.a(), ($$0x, $$1x) -> a($$0x, tm.a("options.chunks", $$1x)), new eqy.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
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

   public void a(eqt $$0, ekk.a $$1) {
      $$0.b($$1);
      this.ar();
   }

   private void a(eqz.a $$0) {
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
      this.i = $$0.a("resourcePacks", this.i, eqz::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, eqz::c, ah::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, gev::a, gev::a);
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

      for (eqt $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(ekk.a($$3));
         }
      }

      for (apf $$4 : apf.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bq.get($$4));
      }

      for (cbv $$5 : cbv.values()) {
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
               this.az.a(eqo.b);
            } else {
               this.az.a(eqo.a);
            }
         }

         this.a(new eqz.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, eqy<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> eqz.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     eqz.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? eqz.a($$2) : $$1;
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
               } else if (eqz.a($$2)) {
                  return 1.0F;
               } else if (eqz.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     eqz.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         eqt.d();
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

      return ata.e.a(this.Y.ar(), $$0, $$1);
   }

   public void ar() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bI), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new eqz.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, eqy<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> eqz.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(eqz.ah.toJson($$2x));
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

   public akg as() {
      int $$0 = 0;

      for (cbv $$1 : this.aN) {
         $$0 |= $$1.a();
      }

      return new akg(this.ad, this.aq.c(), this.aF.c(), this.be.c(), $$0, this.aO.c(), this.Y.aQ(), this.bo.c());
   }

   public void at() {
      if (this.Y.s != null) {
         this.Y.s.cn.b(new vp(this.as()));
      }
   }

   private void b(cbv $$0, boolean $$1) {
      if ($$1) {
         this.aN.add($$0);
      } else {
         this.aN.remove($$0);
      }
   }

   public boolean a(cbv $$0) {
      return this.aN.contains($$0);
   }

   public void a(cbv $$0, boolean $$1) {
      this.b($$0, $$1);
      this.at();
   }

   public eqj au() {
      return this.az() >= 4 ? this.av.c() : eqj.a;
   }

   public boolean av() {
      return this.q;
   }

   public void b(anf $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         anc $$4 = $$0.c($$3);
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

   public eqh aw() {
      return this.bJ;
   }

   public void a(eqh $$0) {
      this.bJ = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = aro.a(ah, $$0, ai);
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

   private static tm b(tm $$0, int $$1) {
      return tm.a("options.pixel_value", $$0, $$1);
   }

   private static tm a(tm $$0, double $$1) {
      return tm.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static tm a(tm $$0, tm $$1) {
      return tm.a("options.generic_value", $$0, $$1);
   }

   public static tm a(tm $$0, int $$1) {
      return a($$0, tm.b(Integer.toString($$1)));
   }

   interface a {
      <T> void a(String var1, eqy<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
