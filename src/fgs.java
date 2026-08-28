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

public class fgs {
   static final Logger af = LogUtils.getLogger();
   static final Gson ag = new Gson();
   private static final TypeToken<List<String>> ah = new TypeToken<List<String>>() {
   };
   public static final int a = 2;
   public static final int b = 4;
   public static final int c = 8;
   public static final int d = 12;
   public static final int e = 16;
   public static final int f = 32;
   private static final Splitter ai = Splitter.on(':').limit(2);
   public static final String g = "";
   private static final wz aj = wz.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fgr<Boolean> ak = fgr.a("options.darkMojangStudiosBackgroundColor", fgr.a(aj), false);
   private static final wz al = wz.c("options.hideLightningFlashes.tooltip");
   private final fgr<Boolean> am = fgr.a("options.hideLightningFlashes", fgr.a(al), false);
   private static final wz an = wz.c("options.hideSplashTexts.tooltip");
   private final fgr<Boolean> ao = fgr.a("options.hideSplashTexts", fgr.a(an), false);
   private final fgr<Double> ap = new fgr<>("options.sensitivity", fgr.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wz.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wz.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fgr.m.a, 0.5, $$0x -> {
   });
   private final fgr<Integer> aq;
   private final fgr<Integer> ar;
   private int as = 0;
   private final fgr<Double> at = new fgr<>(
      "options.entityDistanceScaling",
      fgr.a(),
      fgs::a,
      new fgr.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fgr<Integer> au = new fgr<>(
      "options.framerateLimit",
      fgr.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wz.c("options.framerateLimit.max")) : a($$0x, wz.a("options.framerate", $$1x)),
      new fgr.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fgo.Q().aM().a($$0x)
   );
   private final fgr<fgb> av = new fgr<>(
      "options.renderClouds",
      fgr.a(),
      fgr.b(),
      new fgr.e<>(Arrays.asList(fgb.values()), Codec.withAlternative(fgb.d, Codec.BOOL, $$0x -> $$0x ? fgb.c : fgb.a)),
      fgb.c,
      $$0x -> {
         if (fgo.O()) {
            ezv $$1x = fgo.Q().f.x();
            if ($$1x != null) {
               $$1x.b(fgo.a);
            }
         }
      }
   );
   private static final wz aw = wz.c("options.graphics.fast.tooltip");
   private static final wz ax = wz.a("options.graphics.fabulous.tooltip", wz.c("options.graphics.fabulous").a(n.u));
   private static final wz ay = wz.c("options.graphics.fancy.tooltip");
   private final fgr<fgh> az = new fgr<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fjx.a(ay);
            case a -> fjx.a(aw);
            case c -> fjx.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         xn $$2x = wz.c($$1x.b());
         return $$1x == fgh.c ? $$2x.a(n.u) : $$2x;
      },
      new fgr.a<>(
         Arrays.asList(fgh.values()),
         Stream.of(fgh.values()).filter($$0x -> $$0x != fgh.c).collect(Collectors.toList()),
         () -> fgo.Q().r() && fgo.Q().ai().h(),
         ($$0x, $$1x) -> {
            fgo $$2x = fgo.Q();
            get $$3 = $$2x.ai();
            if ($$1x == fgh.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(fgh::a, fgh::a)
      ),
      fgh.b,
      $$0x -> {
      }
   );
   private final fgr<Boolean> aA = fgr.a("options.ao", true, $$0x -> fgo.Q().f.f());
   private static final wz aB = wz.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wz aC = wz.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wz aD = wz.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fgr<fgv> aE = new fgr<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fjx.a(aB);
         case b -> fjx.a(aC);
         case c -> fjx.a(aD);
      };
   }, fgr.b(), new fgr.e<>(Arrays.asList(fgv.values()), Codec.INT.xmap(fgv::a, fgv::a)), fgv.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fgr<cmv> aF = new fgr<>(
      "options.chat.visibility", fgr.a(), fgr.b(), new fgr.e<>(Arrays.asList(cmv.values()), Codec.INT.xmap(cmv::a, cmv::a)), cmv.a, $$0x -> {
      }
   );
   private final fgr<Double> aG = new fgr<>("options.chat.opacity", fgr.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fgr.m.a, 1.0, $$0x -> fgo.Q().l.d().b());
   private final fgr<Double> aH = new fgr<>("options.chat.line_spacing", fgr.a(), fgs::a, fgr.m.a, 0.0, $$0x -> {
   });
   private static final wz aI = wz.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aJ = 5;
   private final fgr<Integer> aK = new fgr<>("options.accessibility.menu_background_blurriness", fgr.a(aI), fgs::b, new fgr.f(0, 10), 5, $$0x -> {
   });
   private final fgr<Double> aL = new fgr<>("options.accessibility.text_background_opacity", fgr.a(), fgs::a, fgr.m.a, 0.5, $$0x -> fgo.Q().l.d().b());
   private final fgr<Double> aM = new fgr<>("options.accessibility.panorama_speed", fgr.a(), fgs::a, fgr.m.a, 1.0, $$0x -> {
   });
   private static final wz aN = wz.c("options.accessibility.high_contrast.tooltip");
   private final fgr<Boolean> aO = fgr.a("options.accessibility.high_contrast", fgr.a(aN), false, $$0x -> {
      atp $$1x = fgo.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final fgr<Boolean> aP = fgr.a(
      "options.accessibility.narrator_hotkey",
      fgr.a(fgo.a ? wz.c("options.accessibility.narrator_hotkey.mac.tooltip") : wz.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cmy> aQ = EnumSet.allOf(cmy.class);
   private final fgr<btg> aR = new fgr<>("options.mainHand", fgr.a(), fgr.b(), new fgr.e<>(Arrays.asList(btg.values()), btg.c), btg.b, $$0x -> this.ay());
   public int o;
   public int p;
   private final fgr<Double> aS = new fgr<>(
      "options.chat.scale",
      fgr.a(),
      ($$0x, $$1x) -> (wz)($$1x == 0.0 ? wy.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fgr.m.a,
      1.0,
      $$0x -> fgo.Q().l.d().b()
   );
   private final fgr<Double> aT = new fgr<>("options.chat.width", fgr.a(), ($$0x, $$1x) -> c($$0x, fin.a($$1x)), fgr.m.a, 1.0, $$0x -> fgo.Q().l.d().b());
   private final fgr<Double> aU = new fgr<>(
      "options.chat.height.unfocused", fgr.a(), ($$0x, $$1x) -> c($$0x, fin.b($$1x)), fgr.m.a, fin.i(), $$0x -> fgo.Q().l.d().b()
   );
   private final fgr<Double> aV = new fgr<>(
      "options.chat.height.focused", fgr.a(), ($$0x, $$1x) -> c($$0x, fin.b($$1x)), fgr.m.a, 1.0, $$0x -> fgo.Q().l.d().b()
   );
   private final fgr<Double> aW = new fgr<>(
      "options.chat.delay_instant",
      fgr.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wz.c("options.chat.delay_none") : wz.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fgr.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fgo.Q().aW().a($$0x)
   );
   private static final wz aX = wz.c("options.notifications.display_time.tooltip");
   private final fgr<Double> aY = new fgr<>(
      "options.notifications.display_time",
      fgr.a(aX),
      ($$0x, $$1x) -> a($$0x, wz.a("options.multiplier", $$1x)),
      new fgr.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fgr<Integer> aZ = new fgr<>(
      "options.mipmapLevels", fgr.a(), ($$0x, $$1x) -> (wz)($$1x == 0 ? wy.a($$0x, false) : a($$0x, $$1x.intValue())), new fgr.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fgr<ffx> ba = new fgr<>(
      "options.attackIndicator", fgr.a(), fgr.b(), new fgr.e<>(Arrays.asList(ffx.values()), Codec.INT.xmap(ffx::a, ffx::a)), ffx.b, $$0x -> {
      }
   );
   public gwk r = gwk.a;
   public boolean s = false;
   public boolean t = false;
   private final fgr<Integer> bb = new fgr<>("options.biomeBlendRadius", fgr.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wz.c("options.biomeBlendRadius." + $$2x));
   }, new fgr.f(0, 7, false), 2, $$0x -> fgo.Q().f.f());
   private final fgr<Double> bc = new fgr<>(
      "options.mouseWheelSensitivity",
      fgr.a(),
      ($$0x, $$1x) -> a($$0x, wz.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fgr.f(-200, 100).a(fgs::c, fgs::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fgr<Boolean> bd = fgr.a("options.rawMouseInput", true, $$0x -> {
      fam $$1x = fgo.Q().aM();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final fgr<Boolean> be = fgr.a("options.autoJump", false);
   private final fgr<Boolean> bf = fgr.a("options.operatorItemsTab", false);
   private final fgr<Boolean> bg = fgr.a("options.autoSuggestCommands", true);
   private final fgr<Boolean> bh = fgr.a("options.chat.color", true);
   private final fgr<Boolean> bi = fgr.a("options.chat.links", true);
   private final fgr<Boolean> bj = fgr.a("options.chat.links.prompt", true);
   private final fgr<Boolean> bk = fgr.a("options.vsync", true, $$0x -> {
      if (fgo.Q().aM() != null) {
         fgo.Q().aM().a($$0x);
      }
   });
   private final fgr<Boolean> bl = fgr.a("options.entityShadows", true);
   private final fgr<Boolean> bm = fgr.a("options.forceUnicodeFont", false, $$0x -> aF());
   private final fgr<Boolean> bn = fgr.a("options.japaneseGlyphVariants", fgr.a(wz.c("options.japaneseGlyphVariants.tooltip")), aG(), $$0x -> aF());
   private final fgr<Boolean> bo = fgr.a("options.invertMouse", false);
   private final fgr<Boolean> bp = fgr.a("options.discrete_mouse_scroll", false);
   private static final wz bq = wz.c("options.realmsNotifications.tooltip");
   private final fgr<Boolean> br = fgr.a("options.realmsNotifications", fgr.a(bq), true);
   private static final wz bs = wz.c("options.allowServerListing.tooltip");
   private final fgr<Boolean> bt = fgr.a("options.allowServerListing", fgr.a(bs), true, $$0x -> this.ay());
   private final fgr<Boolean> bu = fgr.a("options.reducedDebugInfo", false);
   private final Map<avq, fgr<Double>> bv = ad.a(new EnumMap<>(avq.class), $$0x -> {
      for (avq $$1x : avq.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fgr<Boolean> bw = fgr.a("options.showSubtitles", false);
   private static final wz bx = wz.c("options.directionalAudio.on.tooltip");
   private static final wz by = wz.c("options.directionalAudio.off.tooltip");
   private final fgr<Boolean> bz = fgr.a("options.directionalAudio", $$0x -> $$0x ? fjx.a(bx) : fjx.a(by), false, $$0x -> {
      gvf $$1x = fgo.Q().aj();
      $$1x.k();
      $$1x.a(gtv.a(avp.Ar, 1.0F));
   });
   private final fgr<Boolean> bA = new fgr<>(
      "options.accessibility.text_background",
      fgr.a(),
      ($$0x, $$1x) -> $$1x ? wz.c("options.accessibility.text_background.chat") : wz.c("options.accessibility.text_background.everywhere"),
      fgr.a,
      true,
      $$0x -> {
      }
   );
   private final fgr<Boolean> bB = fgr.a("options.touchscreen", false);
   private final fgr<Boolean> bC = fgr.a("options.fullscreen", false, $$0x -> {
      fgo $$1x = fgo.Q();
      if ($$1x.aM() != null && $$1x.aM().k() != $$0x) {
         $$1x.aM().i();
         this.aa().a($$1x.aM().k());
      }
   });
   private final fgr<Boolean> bD = fgr.a("options.viewBobbing", true);
   private static final wz bE = wz.c("options.key.toggle");
   private static final wz bF = wz.c("options.key.hold");
   private final fgr<Boolean> bG = new fgr<>("key.sneak", fgr.a(), ($$0x, $$1x) -> $$1x ? bE : bF, fgr.a, false, $$0x -> {
   });
   private final fgr<Boolean> bH = new fgr<>("key.sprint", fgr.a(), ($$0x, $$1x) -> $$1x ? bE : bF, fgr.a, false, $$0x -> {
   });
   public boolean v;
   private static final wz bI = wz.c("options.hideMatchedNames.tooltip");
   private final fgr<Boolean> bJ = fgr.a("options.hideMatchedNames", fgr.a(bI), true);
   private final fgr<Boolean> bK = fgr.a("options.autosaveIndicator", true);
   private static final wz bL = wz.c("options.onlyShowSecureChat.tooltip");
   private final fgr<Boolean> bM = fgr.a("options.onlyShowSecureChat", fgr.a(bL), false);
   public final fgm w = new fgm("key.forward", 87, "key.categories.movement");
   public final fgm x = new fgm("key.left", 65, "key.categories.movement");
   public final fgm y = new fgm("key.back", 83, "key.categories.movement");
   public final fgm z = new fgm("key.right", 68, "key.categories.movement");
   public final fgm A = new fgm("key.jump", 32, "key.categories.movement");
   public final fgm B = new fha("key.sneak", 340, "key.categories.movement", this.bG::c);
   public final fgm C = new fha("key.sprint", 341, "key.categories.movement", this.bH::c);
   public final fgm D = new fgm("key.inventory", 69, "key.categories.inventory");
   public final fgm E = new fgm("key.swapOffhand", 70, "key.categories.inventory");
   public final fgm F = new fgm("key.drop", 81, "key.categories.inventory");
   public final fgm G = new fgm("key.use", fae.b.c, 1, "key.categories.gameplay");
   public final fgm H = new fgm("key.attack", fae.b.c, 0, "key.categories.gameplay");
   public final fgm I = new fgm("key.pickItem", fae.b.c, 2, "key.categories.gameplay");
   public final fgm J = new fgm("key.chat", 84, "key.categories.multiplayer");
   public final fgm K = new fgm("key.playerlist", 258, "key.categories.multiplayer");
   public final fgm L = new fgm("key.command", 47, "key.categories.multiplayer");
   public final fgm M = new fgm("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fgm N = new fgm("key.screenshot", 291, "key.categories.misc");
   public final fgm O = new fgm("key.togglePerspective", 294, "key.categories.misc");
   public final fgm P = new fgm("key.smoothCamera", fae.bv.b(), "key.categories.misc");
   public final fgm Q = new fgm("key.fullscreen", 300, "key.categories.misc");
   public final fgm R = new fgm("key.spectatorOutlines", fae.bv.b(), "key.categories.misc");
   public final fgm S = new fgm("key.advancements", 76, "key.categories.misc");
   public final fgm[] T = new fgm[]{
      new fgm("key.hotbar.1", 49, "key.categories.inventory"),
      new fgm("key.hotbar.2", 50, "key.categories.inventory"),
      new fgm("key.hotbar.3", 51, "key.categories.inventory"),
      new fgm("key.hotbar.4", 52, "key.categories.inventory"),
      new fgm("key.hotbar.5", 53, "key.categories.inventory"),
      new fgm("key.hotbar.6", 54, "key.categories.inventory"),
      new fgm("key.hotbar.7", 55, "key.categories.inventory"),
      new fgm("key.hotbar.8", 56, "key.categories.inventory"),
      new fgm("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fgm U = new fgm("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fgm V = new fgm("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fgm[] W = (fgm[])ArrayUtils.addAll(
      new fgm[]{
         this.H,
         this.G,
         this.w,
         this.x,
         this.y,
         this.z,
         this.A,
         this.B,
         this.C,
         this.F,
         this.D,
         this.J,
         this.K,
         this.I,
         this.L,
         this.M,
         this.N,
         this.O,
         this.P,
         this.Q,
         this.R,
         this.E,
         this.U,
         this.V,
         this.S
      },
      this.T
   );
   protected fgo X;
   private final File bN;
   public boolean Y;
   private ffz bO = ffz.a;
   public String Z = "";
   public boolean aa;
   private final fgr<Integer> bP = new fgr<>("options.fov", fgr.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wz.c("options.fov.min"));
         case 110 -> a($$0x, wz.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fgr.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fgo.Q().f.r());
   private static final wz bQ = wz.a("options.telemetry.button.tooltip", wz.c("options.telemetry.state.minimal"), wz.c("options.telemetry.state.all"));
   private final fgr<Boolean> bR = fgr.a("options.telemetry.button", fgr.a(bQ), ($$0x, $$1x) -> {
      fgo $$2x = fgo.Q();
      if (!$$2x.E()) {
         return wz.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wz.c("options.telemetry.state.all") : wz.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wz bS = wz.c("options.screenEffectScale.tooltip");
   private final fgr<Double> bT = new fgr<>("options.screenEffectScale", fgr.a(bS), fgs::b, fgr.m.a, 1.0, $$0x -> {
   });
   private static final wz bU = wz.c("options.fovEffectScale.tooltip");
   private final fgr<Double> bV = new fgr<>(
      "options.fovEffectScale", fgr.a(bU), fgs::b, fgr.m.a.a(ayo::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final wz bW = wz.c("options.darknessEffectScale.tooltip");
   private final fgr<Double> bX = new fgr<>("options.darknessEffectScale", fgr.a(bW), fgs::b, fgr.m.a.a(ayo::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final wz bY = wz.c("options.glintSpeed.tooltip");
   private final fgr<Double> bZ = new fgr<>("options.glintSpeed", fgr.a(bY), fgs::b, fgr.m.a, 0.5, $$0x -> {
   });
   private static final wz ca = wz.c("options.glintStrength.tooltip");
   private final fgr<Double> cb = new fgr<>("options.glintStrength", fgr.a(ca), fgs::b, fgr.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final wz cc = wz.c("options.damageTiltStrength.tooltip");
   private final fgr<Double> cd = new fgr<>("options.damageTiltStrength", fgr.a(cc), fgs::b, fgr.m.a, 1.0, $$0x -> {
   });
   private final fgr<Double> ce = new fgr<>("options.gamma", fgr.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wz.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wz.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wz.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fgr.m.a, 0.5, $$0x -> {
   });
   public static final int ab = 0;
   private static final int cf = 2147483646;
   private final fgr<Integer> cg = new fgr<>(
      "options.guiScale", fgr.a(), ($$0x, $$1x) -> $$1x == 0 ? wz.c("options.guiScale.auto") : wz.b(Integer.toString($$1x)), new fgr.c(0, () -> {
         fgo $$0x = fgo.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aM().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.X.a()
   );
   private final fgr<fgt> ch = new fgr<>(
      "options.particles", fgr.a(), fgr.b(), new fgr.e<>(Arrays.asList(fgt.values()), Codec.INT.xmap(fgt::a, fgt::a)), fgt.a, $$0x -> {
      }
   );
   private final fgr<fgq> ci = new fgr<>(
      "options.narrator",
      fgr.a(),
      ($$0x, $$1x) -> (wz)(this.X.aV().a() ? $$1x.b() : wz.c("options.narrator.notavailable")),
      new fgr.e<>(Arrays.asList(fgq.values()), Codec.INT.xmap(fgq::a, fgq::a)),
      fgq.a,
      $$0x -> this.X.aV().a($$0x)
   );
   public String ac = "en_us";
   private final fgr<String> cj = new fgr<>(
      "options.audioDevice",
      fgr.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wz.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wz.b($$1x.substring(gvc.c)) : wz.b($$1x);
         }
      },
      new fgr.h<>(
         () -> Stream.concat(Stream.of(""), fgo.Q().aj().a().stream()).toList(),
         $$0x -> fgo.Q().r() && $$0x != "" && !fgo.Q().aj().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gvf $$1x = fgo.Q().aj();
         $$1x.k();
         $$1x.a(gtv.a(avp.Ar, 1.0F));
      }
   );
   public boolean ad = true;
   public boolean ae;

   public fgr<Boolean> a() {
      return this.ak;
   }

   public fgr<Boolean> b() {
      return this.am;
   }

   public fgr<Boolean> c() {
      return this.ao;
   }

   public fgr<Double> d() {
      return this.ap;
   }

   public fgr<Integer> e() {
      return this.aq;
   }

   public fgr<Integer> f() {
      return this.ar;
   }

   public fgr<Double> g() {
      return this.at;
   }

   public fgr<Integer> h() {
      return this.au;
   }

   public fgr<fgb> i() {
      return this.av;
   }

   public fgr<fgh> j() {
      return this.az;
   }

   public fgr<Boolean> k() {
      return this.aA;
   }

   public fgr<fgv> l() {
      return this.aE;
   }

   public void a(atp $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (atm $$2 : $$0.f()) {
         if (!$$2.j()) {
            this.i.add($$2.g());
            if (!$$2.d().a()) {
               this.j.add($$2.g());
            }
         }
      }

      this.aw();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.X.l();
      }
   }

   public fgr<cmv> m() {
      return this.aF;
   }

   public fgr<Double> n() {
      return this.aG;
   }

   public fgr<Double> o() {
      return this.aH;
   }

   public fgr<Integer> p() {
      return this.aK;
   }

   public int q() {
      return this.p().c();
   }

   public fgr<Double> r() {
      return this.aL;
   }

   public fgr<Double> s() {
      return this.aM;
   }

   public fgr<Boolean> t() {
      return this.aO;
   }

   public fgr<Boolean> u() {
      return this.aP;
   }

   public fgr<btg> v() {
      return this.aR;
   }

   public fgr<Double> w() {
      return this.aS;
   }

   public fgr<Double> x() {
      return this.aT;
   }

   public fgr<Double> y() {
      return this.aU;
   }

   public fgr<Double> z() {
      return this.aV;
   }

   public fgr<Double> A() {
      return this.aW;
   }

   public fgr<Double> B() {
      return this.aY;
   }

   public fgr<Integer> C() {
      return this.aZ;
   }

   public fgr<ffx> D() {
      return this.ba;
   }

   public fgr<Integer> E() {
      return this.bb;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ayo.a(Math.log10($$0) * 100.0);
   }

   public fgr<Double> F() {
      return this.bc;
   }

   public fgr<Boolean> G() {
      return this.bd;
   }

   public fgr<Boolean> H() {
      return this.be;
   }

   public fgr<Boolean> I() {
      return this.bf;
   }

   public fgr<Boolean> J() {
      return this.bg;
   }

   public fgr<Boolean> K() {
      return this.bh;
   }

   public fgr<Boolean> L() {
      return this.bi;
   }

   public fgr<Boolean> M() {
      return this.bj;
   }

   public fgr<Boolean> N() {
      return this.bk;
   }

   public fgr<Boolean> O() {
      return this.bl;
   }

   private static void aF() {
      fgo $$0 = fgo.Q();
      if ($$0.aM() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fgr<Boolean> P() {
      return this.bm;
   }

   private static boolean aG() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fgr<Boolean> Q() {
      return this.bn;
   }

   public fgr<Boolean> R() {
      return this.bo;
   }

   public fgr<Boolean> S() {
      return this.bp;
   }

   public fgr<Boolean> T() {
      return this.br;
   }

   public fgr<Boolean> U() {
      return this.bt;
   }

   public fgr<Boolean> V() {
      return this.bu;
   }

   public final float a(avq $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fgr<Double> b(avq $$0) {
      return Objects.requireNonNull(this.bv.get($$0));
   }

   private fgr<Double> a(String $$0, avq $$1) {
      return new fgr<>($$0, fgr.a(), fgs::b, fgr.m.a, 1.0, $$1x -> fgo.Q().aj().a($$1, $$1x.floatValue()));
   }

   public fgr<Boolean> W() {
      return this.bw;
   }

   public fgr<Boolean> X() {
      return this.bz;
   }

   public fgr<Boolean> Y() {
      return this.bA;
   }

   public fgr<Boolean> Z() {
      return this.bB;
   }

   public fgr<Boolean> aa() {
      return this.bC;
   }

   public fgr<Boolean> ab() {
      return this.bD;
   }

   public fgr<Boolean> ac() {
      return this.bG;
   }

   public fgr<Boolean> ad() {
      return this.bH;
   }

   public fgr<Boolean> ae() {
      return this.bJ;
   }

   public fgr<Boolean> af() {
      return this.bK;
   }

   public fgr<Boolean> ag() {
      return this.bM;
   }

   public fgr<Integer> ah() {
      return this.bP;
   }

   public fgr<Boolean> ai() {
      return this.bR;
   }

   public fgr<Double> aj() {
      return this.bT;
   }

   public fgr<Double> ak() {
      return this.bV;
   }

   public fgr<Double> al() {
      return this.bX;
   }

   public fgr<Double> am() {
      return this.bZ;
   }

   public fgr<Double> an() {
      return this.cb;
   }

   public fgr<Double> ao() {
      return this.cd;
   }

   public fgr<Double> ap() {
      return this.ce;
   }

   public fgr<Integer> aq() {
      return this.cg;
   }

   public fgr<fgt> ar() {
      return this.ch;
   }

   public fgr<fgq> as() {
      return this.ci;
   }

   public fgr<String> at() {
      return this.cj;
   }

   public void au() {
      this.ad = false;
      this.aw();
   }

   public fgs(fgo $$0, File $$1) {
      this.X = $$0;
      this.bN = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new fgr<>(
         "options.renderDistance",
         fgr.a(),
         ($$0x, $$1x) -> a($$0x, wz.a("options.chunks", $$1x)),
         new fgr.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fgo.Q().f.r()
      );
      this.ar = new fgr<>(
         "options.simulationDistance", fgr.a(), ($$0x, $$1x) -> a($$0x, wz.a("options.chunks", $$1x)), new fgr.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ae = ad.k() == ad.a.c;
      this.av();
   }

   public float a(float $$0) {
      return this.bA.c() ? $$0 : this.r().c().floatValue();
   }

   public int b(float $$0) {
      return (int)(this.a($$0) * 255.0F) << 24 & 0xFF000000;
   }

   public int a(int $$0) {
      return this.bA.c() ? $$0 : (int)(this.aL.c() * 255.0) << 24 & 0xFF000000;
   }

   public void a(fgm $$0, fae.a $$1) {
      $$0.b($$1);
      this.aw();
   }

   private void a(fgs.b $$0) {
      $$0.a("ao", this.aA);
      $$0.a("biomeBlendRadius", this.bb);
      $$0.a("enableVsync", this.bk);
      $$0.a("entityDistanceScaling", this.at);
      $$0.a("entityShadows", this.bl);
      $$0.a("forceUnicodeFont", this.bm);
      $$0.a("japaneseGlyphVariants", this.bn);
      $$0.a("fov", this.bP);
      $$0.a("fovEffectScale", this.bV);
      $$0.a("darknessEffectScale", this.bX);
      $$0.a("glintSpeed", this.bZ);
      $$0.a("glintStrength", this.cb);
      $$0.a("prioritizeChunkUpdates", this.aE);
      $$0.a("fullscreen", this.bC);
      $$0.a("gamma", this.ce);
      $$0.a("graphicsMode", this.az);
      $$0.a("guiScale", this.cg);
      $$0.a("maxFps", this.au);
      $$0.a("mipmapLevels", this.aZ);
      $$0.a("narrator", this.ci);
      $$0.a("particles", this.ch);
      $$0.a("reducedDebugInfo", this.bu);
      $$0.a("renderClouds", this.av);
      $$0.a("renderDistance", this.aq);
      $$0.a("simulationDistance", this.ar);
      $$0.a("screenEffectScale", this.bT);
      $$0.a("soundDevice", this.cj);
   }

   private void a(fgs.a $$0) {
      this.a((fgs.b)$$0);
      $$0.a("autoJump", this.be);
      $$0.a("operatorItemsTab", this.bf);
      $$0.a("autoSuggestions", this.bg);
      $$0.a("chatColors", this.bh);
      $$0.a("chatLinks", this.bi);
      $$0.a("chatLinksPrompt", this.bj);
      $$0.a("discrete_mouse_scroll", this.bp);
      $$0.a("invertYMouse", this.bo);
      $$0.a("realmsNotifications", this.br);
      $$0.a("showSubtitles", this.bw);
      $$0.a("directionalAudio", this.bz);
      $$0.a("touchscreen", this.bB);
      $$0.a("bobView", this.bD);
      $$0.a("toggleCrouch", this.bG);
      $$0.a("toggleSprint", this.bH);
      $$0.a("darkMojangStudiosBackground", this.ak);
      $$0.a("hideLightningFlashes", this.am);
      $$0.a("hideSplashTexts", this.ao);
      $$0.a("mouseSensitivity", this.ap);
      $$0.a("damageTiltStrength", this.cd);
      $$0.a("highContrast", this.aO);
      $$0.a("narratorHotkey", this.aP);
      this.i = $$0.a("resourcePacks", this.i, fgs::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fgs::c, ag::toJson);
      this.Z = $$0.a("lastServer", this.Z);
      this.ac = $$0.a("lang", this.ac);
      $$0.a("chatVisibility", this.aF);
      $$0.a("chatOpacity", this.aG);
      $$0.a("chatLineSpacing", this.aH);
      $$0.a("textBackgroundOpacity", this.aL);
      $$0.a("backgroundForChatOnly", this.bA);
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
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aR);
      $$0.a("attackIndicator", this.ba);
      this.r = $$0.a("tutorialStep", this.r, gwk::a, gwk::a);
      $$0.a("mouseWheelSensitivity", this.bc);
      $$0.a("rawMouseInput", this.bd);
      this.u = $$0.a("glDebugVerbosity", this.u);
      this.v = $$0.a("skipMultiplayerWarning", this.v);
      $$0.a("hideMatchedNames", this.bJ);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.t = $$0.a("hideBundleTutorial", this.t);
      this.ae = $$0.a("syncChunkWrites", this.ae);
      $$0.a("showAutosaveIndicator", this.bK);
      $$0.a("allowServerListing", this.bt);
      $$0.a("onlyShowSecureChat", this.bM);
      $$0.a("panoramaScrollSpeed", this.aM);
      $$0.a("telemetryOptInExtra", this.bR);
      this.ad = $$0.a("onboardAccessibility", this.ad);
      $$0.a("menuBackgroundBlurriness", this.aK);

      for (fgm $$1 : this.W) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fae.a($$3));
         }
      }

      for (avq $$4 : avq.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bv.get($$4));
      }

      for (cmy $$5 : cmy.values()) {
         boolean $$6 = this.aQ.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.b($$5, $$7);
         }
      }
   }

   public void av() {
      try {
         if (!this.bN.exists()) {
            return;
         }

         ub $$0 = new ub();

         try (BufferedReader $$1 = Files.newReader(this.bN, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = ai.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  af.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final ub $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.az.a(fgh.b);
            } else {
               this.az.a(fgh.a);
            }
         }

         this.a(new fgs.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).s_() : null;
            }

            @Override
            public <T> void a(String $$0, fgr<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fgs.af.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
                  $$5.ifSuccess($$1::a);
               }
            }

            @Override
            public int a(String $$0, int $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  try {
                     return Integer.parseInt($$2);
                  } catch (NumberFormatException var5) {
                     fgs.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fgs.a($$2) : $$1;
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
               } else if (fgs.a($$2)) {
                  return 1.0F;
               } else if (fgs.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fgs.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         if (this.X.aM() != null) {
            this.X.aM().a(this.au.c());
         }

         fgm.d();
      } catch (Exception var7) {
         af.error("Failed to load options", var7);
      }
   }

   static boolean a(String $$0) {
      return "true".equals($$0);
   }

   static boolean b(String $$0) {
      return "false".equals($$0);
   }

   private ub a(ub $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return azw.e.a(this.X.as(), $$0, $$1);
   }

   public void aw() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bN), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fgs.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fgr<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> fgs.af.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(fgs.ag.toJson($$2));
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
         if (this.X.aM().g().isPresent()) {
            $$0.println("fullscreenResolution:" + this.X.aM().g().get().g());
         }
      } catch (Exception var6) {
         af.error("Failed to save options", var6);
      }

      this.ay();
   }

   public aqh ax() {
      int $$0 = 0;

      for (cmy $$1 : this.aQ) {
         $$0 |= $$1.a();
      }

      return new aqh(this.ac, this.aq.c(), this.aF.c(), this.bh.c(), $$0, this.aR.c(), this.X.aQ(), this.bt.c());
   }

   public void ay() {
      if (this.X.s != null) {
         this.X.s.h.b(new aaa(this.ax()));
      }
   }

   private void b(cmy $$0, boolean $$1) {
      if ($$1) {
         this.aQ.add($$0);
      } else {
         this.aQ.remove($$0);
      }
   }

   public boolean a(cmy $$0) {
      return this.aQ.contains($$0);
   }

   public void a(cmy $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ay();
   }

   public fgb az() {
      return this.aE() >= 4 ? this.av.c() : fgb.a;
   }

   public boolean aA() {
      return this.q;
   }

   public void b(atp $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         atm $$4 = $$0.c($$3);
         if ($$4 == null && !$$3.startsWith("file/")) {
            $$4 = $$0.c("file/" + $$3);
         }

         if ($$4 == null) {
            af.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", $$3);
            $$2.remove();
         } else if (!$$4.d().a() && !this.j.contains($$3)) {
            af.warn("Removed resource pack {} from options because it is no longer compatible", $$3);
            $$2.remove();
         } else if ($$4.d().a() && this.j.contains($$3)) {
            af.info("Removed resource pack {} from incompatibility list because it's now compatible", $$3);
            this.j.remove($$3);
         } else {
            $$1.add($$4.g());
         }
      }

      $$0.b($$1);
   }

   public ffz aB() {
      return this.bO;
   }

   public void a(ffz $$0) {
      this.bO = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = aye.a(ag, $$0, ah);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aC() {
      return this.bN;
   }

   public String aD() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fgs.b() {
         @Override
         public <T> void a(String $$0x, fgr<T> $$1) {
            $$0.add(Pair.of($$0, $$1.c()));
         }
      });
      $$0.add(Pair.of("fullscreenResolution", String.valueOf(this.k)));
      $$0.add(Pair.of("glDebugVerbosity", this.u));
      $$0.add(Pair.of("overrideHeight", this.p));
      $$0.add(Pair.of("overrideWidth", this.o));
      $$0.add(Pair.of("syncChunkWrites", this.ae));
      $$0.add(Pair.of("useNativeTransport", this.q));
      $$0.add(Pair.of("resourcePacks", this.i));
      return $$0.stream()
         .sorted(Comparator.comparing(Pair::getFirst))
         .map($$0x -> (String)$$0x.getFirst() + ": " + $$0x.getSecond())
         .collect(Collectors.joining(System.lineSeparator()));
   }

   public void b(int $$0) {
      this.as = $$0;
   }

   public int aE() {
      return this.as > 0 ? Math.min(this.aq.c(), this.as) : this.aq.c();
   }

   private static wz c(wz $$0, int $$1) {
      return wz.a("options.pixel_value", $$0, $$1);
   }

   private static wz a(wz $$0, double $$1) {
      return wz.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static wz a(wz $$0, wz $$1) {
      return wz.a("options.generic_value", $$0, $$1);
   }

   public static wz a(wz $$0, int $$1) {
      return a($$0, wz.b(Integer.toString($$1)));
   }

   public static wz b(wz $$0, int $$1) {
      return $$1 == 0 ? a($$0, wy.c) : a($$0, $$1);
   }

   private static wz b(wz $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, wy.c) : a($$0, $$1);
   }

   interface a extends fgs.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fgr<T> var2);
   }
}
