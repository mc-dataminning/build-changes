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

public class fgq {
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
   private final fgp<Boolean> ak = fgp.a("options.darkMojangStudiosBackgroundColor", fgp.a(aj), false);
   private static final wz al = wz.c("options.hideLightningFlashes.tooltip");
   private final fgp<Boolean> am = fgp.a("options.hideLightningFlashes", fgp.a(al), false);
   private static final wz an = wz.c("options.hideSplashTexts.tooltip");
   private final fgp<Boolean> ao = fgp.a("options.hideSplashTexts", fgp.a(an), false);
   private final fgp<Double> ap = new fgp<>("options.sensitivity", fgp.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wz.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wz.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fgp.m.a, 0.5, $$0x -> {
   });
   private final fgp<Integer> aq;
   private final fgp<Integer> ar;
   private int as = 0;
   private final fgp<Double> at = new fgp<>(
      "options.entityDistanceScaling",
      fgp.a(),
      fgq::a,
      new fgp.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fgp<Integer> au = new fgp<>(
      "options.framerateLimit",
      fgp.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wz.c("options.framerateLimit.max")) : a($$0x, wz.a("options.framerate", $$1x)),
      new fgp.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fgm.Q().aM().a($$0x)
   );
   private final fgp<ffz> av = new fgp<>(
      "options.renderClouds",
      fgp.a(),
      fgp.b(),
      new fgp.e<>(Arrays.asList(ffz.values()), Codec.withAlternative(ffz.d, Codec.BOOL, $$0x -> $$0x ? ffz.c : ffz.a)),
      ffz.c,
      $$0x -> {
         if (fgm.O()) {
            ezt $$1x = fgm.Q().f.x();
            if ($$1x != null) {
               $$1x.b(fgm.a);
            }
         }
      }
   );
   private static final wz aw = wz.c("options.graphics.fast.tooltip");
   private static final wz ax = wz.a("options.graphics.fabulous.tooltip", wz.c("options.graphics.fabulous").a(n.u));
   private static final wz ay = wz.c("options.graphics.fancy.tooltip");
   private final fgp<fgf> az = new fgp<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fjv.a(ay);
            case a -> fjv.a(aw);
            case c -> fjv.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         xn $$2x = wz.c($$1x.b());
         return $$1x == fgf.c ? $$2x.a(n.u) : $$2x;
      },
      new fgp.a<>(
         Arrays.asList(fgf.values()),
         Stream.of(fgf.values()).filter($$0x -> $$0x != fgf.c).collect(Collectors.toList()),
         () -> fgm.Q().r() && fgm.Q().ai().h(),
         ($$0x, $$1x) -> {
            fgm $$2x = fgm.Q();
            ger $$3 = $$2x.ai();
            if ($$1x == fgf.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(fgf::a, fgf::a)
      ),
      fgf.b,
      $$0x -> {
      }
   );
   private final fgp<Boolean> aA = fgp.a("options.ao", true, $$0x -> fgm.Q().f.f());
   private static final wz aB = wz.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wz aC = wz.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wz aD = wz.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fgp<fgt> aE = new fgp<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fjv.a(aB);
         case b -> fjv.a(aC);
         case c -> fjv.a(aD);
      };
   }, fgp.b(), new fgp.e<>(Arrays.asList(fgt.values()), Codec.INT.xmap(fgt::a, fgt::a)), fgt.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fgp<cmv> aF = new fgp<>(
      "options.chat.visibility", fgp.a(), fgp.b(), new fgp.e<>(Arrays.asList(cmv.values()), Codec.INT.xmap(cmv::a, cmv::a)), cmv.a, $$0x -> {
      }
   );
   private final fgp<Double> aG = new fgp<>("options.chat.opacity", fgp.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fgp.m.a, 1.0, $$0x -> fgm.Q().l.d().b());
   private final fgp<Double> aH = new fgp<>("options.chat.line_spacing", fgp.a(), fgq::a, fgp.m.a, 0.0, $$0x -> {
   });
   private static final wz aI = wz.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aJ = 5;
   private final fgp<Integer> aK = new fgp<>("options.accessibility.menu_background_blurriness", fgp.a(aI), fgq::b, new fgp.f(0, 10), 5, $$0x -> {
   });
   private final fgp<Double> aL = new fgp<>("options.accessibility.text_background_opacity", fgp.a(), fgq::a, fgp.m.a, 0.5, $$0x -> fgm.Q().l.d().b());
   private final fgp<Double> aM = new fgp<>("options.accessibility.panorama_speed", fgp.a(), fgq::a, fgp.m.a, 1.0, $$0x -> {
   });
   private static final wz aN = wz.c("options.accessibility.high_contrast.tooltip");
   private final fgp<Boolean> aO = fgp.a("options.accessibility.high_contrast", fgp.a(aN), false, $$0x -> {
      atp $$1x = fgm.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final fgp<Boolean> aP = fgp.a(
      "options.accessibility.narrator_hotkey",
      fgp.a(fgm.a ? wz.c("options.accessibility.narrator_hotkey.mac.tooltip") : wz.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cmy> aQ = EnumSet.allOf(cmy.class);
   private final fgp<btg> aR = new fgp<>("options.mainHand", fgp.a(), fgp.b(), new fgp.e<>(Arrays.asList(btg.values()), btg.c), btg.b, $$0x -> this.ax());
   public int o;
   public int p;
   private final fgp<Double> aS = new fgp<>(
      "options.chat.scale",
      fgp.a(),
      ($$0x, $$1x) -> (wz)($$1x == 0.0 ? wy.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fgp.m.a,
      1.0,
      $$0x -> fgm.Q().l.d().b()
   );
   private final fgp<Double> aT = new fgp<>("options.chat.width", fgp.a(), ($$0x, $$1x) -> c($$0x, fil.a($$1x)), fgp.m.a, 1.0, $$0x -> fgm.Q().l.d().b());
   private final fgp<Double> aU = new fgp<>(
      "options.chat.height.unfocused", fgp.a(), ($$0x, $$1x) -> c($$0x, fil.b($$1x)), fgp.m.a, fil.i(), $$0x -> fgm.Q().l.d().b()
   );
   private final fgp<Double> aV = new fgp<>(
      "options.chat.height.focused", fgp.a(), ($$0x, $$1x) -> c($$0x, fil.b($$1x)), fgp.m.a, 1.0, $$0x -> fgm.Q().l.d().b()
   );
   private final fgp<Double> aW = new fgp<>(
      "options.chat.delay_instant",
      fgp.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wz.c("options.chat.delay_none") : wz.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fgp.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fgm.Q().aW().a($$0x)
   );
   private static final wz aX = wz.c("options.notifications.display_time.tooltip");
   private final fgp<Double> aY = new fgp<>(
      "options.notifications.display_time",
      fgp.a(aX),
      ($$0x, $$1x) -> a($$0x, wz.a("options.multiplier", $$1x)),
      new fgp.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fgp<Integer> aZ = new fgp<>(
      "options.mipmapLevels", fgp.a(), ($$0x, $$1x) -> (wz)($$1x == 0 ? wy.a($$0x, false) : a($$0x, $$1x.intValue())), new fgp.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fgp<ffv> ba = new fgp<>(
      "options.attackIndicator", fgp.a(), fgp.b(), new fgp.e<>(Arrays.asList(ffv.values()), Codec.INT.xmap(ffv::a, ffv::a)), ffv.b, $$0x -> {
      }
   );
   public gwi r = gwi.a;
   public boolean s = false;
   public boolean t = false;
   private final fgp<Integer> bb = new fgp<>("options.biomeBlendRadius", fgp.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wz.c("options.biomeBlendRadius." + $$2x));
   }, new fgp.f(0, 7, false), 2, $$0x -> fgm.Q().f.f());
   private final fgp<Double> bc = new fgp<>(
      "options.mouseWheelSensitivity",
      fgp.a(),
      ($$0x, $$1x) -> a($$0x, wz.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fgp.f(-200, 100).a(fgq::c, fgq::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fgp<Boolean> bd = fgp.a("options.rawMouseInput", true, $$0x -> {
      fak $$1x = fgm.Q().aM();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final fgp<Boolean> be = fgp.a("options.autoJump", false);
   private final fgp<Boolean> bf = fgp.a("options.operatorItemsTab", false);
   private final fgp<Boolean> bg = fgp.a("options.autoSuggestCommands", true);
   private final fgp<Boolean> bh = fgp.a("options.chat.color", true);
   private final fgp<Boolean> bi = fgp.a("options.chat.links", true);
   private final fgp<Boolean> bj = fgp.a("options.chat.links.prompt", true);
   private final fgp<Boolean> bk = fgp.a("options.vsync", true, $$0x -> {
      if (fgm.Q().aM() != null) {
         fgm.Q().aM().a($$0x);
      }
   });
   private final fgp<Boolean> bl = fgp.a("options.entityShadows", true);
   private final fgp<Boolean> bm = fgp.a("options.forceUnicodeFont", false, $$0x -> aE());
   private final fgp<Boolean> bn = fgp.a("options.japaneseGlyphVariants", fgp.a(wz.c("options.japaneseGlyphVariants.tooltip")), aF(), $$0x -> aE());
   private final fgp<Boolean> bo = fgp.a("options.invertMouse", false);
   private final fgp<Boolean> bp = fgp.a("options.discrete_mouse_scroll", false);
   private static final wz bq = wz.c("options.realmsNotifications.tooltip");
   private final fgp<Boolean> br = fgp.a("options.realmsNotifications", fgp.a(bq), true);
   private static final wz bs = wz.c("options.allowServerListing.tooltip");
   private final fgp<Boolean> bt = fgp.a("options.allowServerListing", fgp.a(bs), true, $$0x -> this.ax());
   private final fgp<Boolean> bu = fgp.a("options.reducedDebugInfo", false);
   private final Map<avq, fgp<Double>> bv = ad.a(new EnumMap<>(avq.class), $$0x -> {
      for (avq $$1x : avq.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fgp<Boolean> bw = fgp.a("options.showSubtitles", false);
   private static final wz bx = wz.c("options.directionalAudio.on.tooltip");
   private static final wz by = wz.c("options.directionalAudio.off.tooltip");
   private final fgp<Boolean> bz = fgp.a("options.directionalAudio", $$0x -> $$0x ? fjv.a(bx) : fjv.a(by), false, $$0x -> {
      gvd $$1x = fgm.Q().aj();
      $$1x.k();
      $$1x.a(gtt.a(avp.Ar, 1.0F));
   });
   private final fgp<Boolean> bA = new fgp<>(
      "options.accessibility.text_background",
      fgp.a(),
      ($$0x, $$1x) -> $$1x ? wz.c("options.accessibility.text_background.chat") : wz.c("options.accessibility.text_background.everywhere"),
      fgp.a,
      true,
      $$0x -> {
      }
   );
   private final fgp<Boolean> bB = fgp.a("options.touchscreen", false);
   private final fgp<Boolean> bC = fgp.a("options.fullscreen", false, $$0x -> {
      fgm $$1x = fgm.Q();
      if ($$1x.aM() != null && $$1x.aM().k() != $$0x) {
         $$1x.aM().i();
         this.aa().a($$1x.aM().k());
      }
   });
   private final fgp<Boolean> bD = fgp.a("options.viewBobbing", true);
   private static final wz bE = wz.c("options.key.toggle");
   private static final wz bF = wz.c("options.key.hold");
   private final fgp<Boolean> bG = new fgp<>("key.sneak", fgp.a(), ($$0x, $$1x) -> $$1x ? bE : bF, fgp.a, false, $$0x -> {
   });
   private final fgp<Boolean> bH = new fgp<>("key.sprint", fgp.a(), ($$0x, $$1x) -> $$1x ? bE : bF, fgp.a, false, $$0x -> {
   });
   public boolean v;
   private static final wz bI = wz.c("options.hideMatchedNames.tooltip");
   private final fgp<Boolean> bJ = fgp.a("options.hideMatchedNames", fgp.a(bI), true);
   private final fgp<Boolean> bK = fgp.a("options.autosaveIndicator", true);
   private static final wz bL = wz.c("options.onlyShowSecureChat.tooltip");
   private final fgp<Boolean> bM = fgp.a("options.onlyShowSecureChat", fgp.a(bL), false);
   public final fgk w = new fgk("key.forward", 87, "key.categories.movement");
   public final fgk x = new fgk("key.left", 65, "key.categories.movement");
   public final fgk y = new fgk("key.back", 83, "key.categories.movement");
   public final fgk z = new fgk("key.right", 68, "key.categories.movement");
   public final fgk A = new fgk("key.jump", 32, "key.categories.movement");
   public final fgk B = new fgy("key.sneak", 340, "key.categories.movement", this.bG::c);
   public final fgk C = new fgy("key.sprint", 341, "key.categories.movement", this.bH::c);
   public final fgk D = new fgk("key.inventory", 69, "key.categories.inventory");
   public final fgk E = new fgk("key.swapOffhand", 70, "key.categories.inventory");
   public final fgk F = new fgk("key.drop", 81, "key.categories.inventory");
   public final fgk G = new fgk("key.use", fac.b.c, 1, "key.categories.gameplay");
   public final fgk H = new fgk("key.attack", fac.b.c, 0, "key.categories.gameplay");
   public final fgk I = new fgk("key.pickItem", fac.b.c, 2, "key.categories.gameplay");
   public final fgk J = new fgk("key.chat", 84, "key.categories.multiplayer");
   public final fgk K = new fgk("key.playerlist", 258, "key.categories.multiplayer");
   public final fgk L = new fgk("key.command", 47, "key.categories.multiplayer");
   public final fgk M = new fgk("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fgk N = new fgk("key.screenshot", 291, "key.categories.misc");
   public final fgk O = new fgk("key.togglePerspective", 294, "key.categories.misc");
   public final fgk P = new fgk("key.smoothCamera", fac.bv.b(), "key.categories.misc");
   public final fgk Q = new fgk("key.fullscreen", 300, "key.categories.misc");
   public final fgk R = new fgk("key.spectatorOutlines", fac.bv.b(), "key.categories.misc");
   public final fgk S = new fgk("key.advancements", 76, "key.categories.misc");
   public final fgk[] T = new fgk[]{
      new fgk("key.hotbar.1", 49, "key.categories.inventory"),
      new fgk("key.hotbar.2", 50, "key.categories.inventory"),
      new fgk("key.hotbar.3", 51, "key.categories.inventory"),
      new fgk("key.hotbar.4", 52, "key.categories.inventory"),
      new fgk("key.hotbar.5", 53, "key.categories.inventory"),
      new fgk("key.hotbar.6", 54, "key.categories.inventory"),
      new fgk("key.hotbar.7", 55, "key.categories.inventory"),
      new fgk("key.hotbar.8", 56, "key.categories.inventory"),
      new fgk("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fgk U = new fgk("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fgk V = new fgk("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fgk[] W = (fgk[])ArrayUtils.addAll(
      new fgk[]{
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
   protected fgm X;
   private final File bN;
   public boolean Y;
   private ffx bO = ffx.a;
   public String Z = "";
   public boolean aa;
   private final fgp<Integer> bP = new fgp<>("options.fov", fgp.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wz.c("options.fov.min"));
         case 110 -> a($$0x, wz.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fgp.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fgm.Q().f.r());
   private static final wz bQ = wz.a("options.telemetry.button.tooltip", wz.c("options.telemetry.state.minimal"), wz.c("options.telemetry.state.all"));
   private final fgp<Boolean> bR = fgp.a("options.telemetry.button", fgp.a(bQ), ($$0x, $$1x) -> {
      fgm $$2x = fgm.Q();
      if (!$$2x.E()) {
         return wz.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wz.c("options.telemetry.state.all") : wz.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wz bS = wz.c("options.screenEffectScale.tooltip");
   private final fgp<Double> bT = new fgp<>("options.screenEffectScale", fgp.a(bS), fgq::b, fgp.m.a, 1.0, $$0x -> {
   });
   private static final wz bU = wz.c("options.fovEffectScale.tooltip");
   private final fgp<Double> bV = new fgp<>(
      "options.fovEffectScale", fgp.a(bU), fgq::b, fgp.m.a.a(ayo::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final wz bW = wz.c("options.darknessEffectScale.tooltip");
   private final fgp<Double> bX = new fgp<>("options.darknessEffectScale", fgp.a(bW), fgq::b, fgp.m.a.a(ayo::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final wz bY = wz.c("options.glintSpeed.tooltip");
   private final fgp<Double> bZ = new fgp<>("options.glintSpeed", fgp.a(bY), fgq::b, fgp.m.a, 0.5, $$0x -> {
   });
   private static final wz ca = wz.c("options.glintStrength.tooltip");
   private final fgp<Double> cb = new fgp<>("options.glintStrength", fgp.a(ca), fgq::b, fgp.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final wz cc = wz.c("options.damageTiltStrength.tooltip");
   private final fgp<Double> cd = new fgp<>("options.damageTiltStrength", fgp.a(cc), fgq::b, fgp.m.a, 1.0, $$0x -> {
   });
   private final fgp<Double> ce = new fgp<>("options.gamma", fgp.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wz.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wz.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wz.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fgp.m.a, 0.5, $$0x -> {
   });
   public static final int ab = 0;
   private static final int cf = 2147483646;
   private final fgp<Integer> cg = new fgp<>(
      "options.guiScale", fgp.a(), ($$0x, $$1x) -> $$1x == 0 ? wz.c("options.guiScale.auto") : wz.b(Integer.toString($$1x)), new fgp.c(0, () -> {
         fgm $$0x = fgm.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aM().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.X.a()
   );
   private final fgp<fgr> ch = new fgp<>(
      "options.particles", fgp.a(), fgp.b(), new fgp.e<>(Arrays.asList(fgr.values()), Codec.INT.xmap(fgr::a, fgr::a)), fgr.a, $$0x -> {
      }
   );
   private final fgp<fgo> ci = new fgp<>(
      "options.narrator",
      fgp.a(),
      ($$0x, $$1x) -> (wz)(this.X.aV().a() ? $$1x.b() : wz.c("options.narrator.notavailable")),
      new fgp.e<>(Arrays.asList(fgo.values()), Codec.INT.xmap(fgo::a, fgo::a)),
      fgo.a,
      $$0x -> this.X.aV().a($$0x)
   );
   public String ac = "en_us";
   private final fgp<String> cj = new fgp<>(
      "options.audioDevice",
      fgp.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wz.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wz.b($$1x.substring(gva.c)) : wz.b($$1x);
         }
      },
      new fgp.h<>(
         () -> Stream.concat(Stream.of(""), fgm.Q().aj().a().stream()).toList(),
         $$0x -> fgm.Q().r() && $$0x != "" && !fgm.Q().aj().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gvd $$1x = fgm.Q().aj();
         $$1x.k();
         $$1x.a(gtt.a(avp.Ar, 1.0F));
      }
   );
   public boolean ad = true;
   public boolean ae;

   public fgp<Boolean> a() {
      return this.ak;
   }

   public fgp<Boolean> b() {
      return this.am;
   }

   public fgp<Boolean> c() {
      return this.ao;
   }

   public fgp<Double> d() {
      return this.ap;
   }

   public fgp<Integer> e() {
      return this.aq;
   }

   public fgp<Integer> f() {
      return this.ar;
   }

   public fgp<Double> g() {
      return this.at;
   }

   public fgp<Integer> h() {
      return this.au;
   }

   public fgp<ffz> i() {
      return this.av;
   }

   public fgp<fgf> j() {
      return this.az;
   }

   public fgp<Boolean> k() {
      return this.aA;
   }

   public fgp<fgt> l() {
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

      this.av();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.X.l();
      }
   }

   public fgp<cmv> m() {
      return this.aF;
   }

   public fgp<Double> n() {
      return this.aG;
   }

   public fgp<Double> o() {
      return this.aH;
   }

   public fgp<Integer> p() {
      return this.aK;
   }

   public int q() {
      return this.p().c();
   }

   public fgp<Double> r() {
      return this.aL;
   }

   public fgp<Double> s() {
      return this.aM;
   }

   public fgp<Boolean> t() {
      return this.aO;
   }

   public fgp<Boolean> u() {
      return this.aP;
   }

   public fgp<btg> v() {
      return this.aR;
   }

   public fgp<Double> w() {
      return this.aS;
   }

   public fgp<Double> x() {
      return this.aT;
   }

   public fgp<Double> y() {
      return this.aU;
   }

   public fgp<Double> z() {
      return this.aV;
   }

   public fgp<Double> A() {
      return this.aW;
   }

   public fgp<Double> B() {
      return this.aY;
   }

   public fgp<Integer> C() {
      return this.aZ;
   }

   public fgp<ffv> D() {
      return this.ba;
   }

   public fgp<Integer> E() {
      return this.bb;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ayo.a(Math.log10($$0) * 100.0);
   }

   public fgp<Double> F() {
      return this.bc;
   }

   public fgp<Boolean> G() {
      return this.bd;
   }

   public fgp<Boolean> H() {
      return this.be;
   }

   public fgp<Boolean> I() {
      return this.bf;
   }

   public fgp<Boolean> J() {
      return this.bg;
   }

   public fgp<Boolean> K() {
      return this.bh;
   }

   public fgp<Boolean> L() {
      return this.bi;
   }

   public fgp<Boolean> M() {
      return this.bj;
   }

   public fgp<Boolean> N() {
      return this.bk;
   }

   public fgp<Boolean> O() {
      return this.bl;
   }

   private static void aE() {
      fgm $$0 = fgm.Q();
      if ($$0.aM() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fgp<Boolean> P() {
      return this.bm;
   }

   private static boolean aF() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fgp<Boolean> Q() {
      return this.bn;
   }

   public fgp<Boolean> R() {
      return this.bo;
   }

   public fgp<Boolean> S() {
      return this.bp;
   }

   public fgp<Boolean> T() {
      return this.br;
   }

   public fgp<Boolean> U() {
      return this.bt;
   }

   public fgp<Boolean> V() {
      return this.bu;
   }

   public final float a(avq $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fgp<Double> b(avq $$0) {
      return Objects.requireNonNull(this.bv.get($$0));
   }

   private fgp<Double> a(String $$0, avq $$1) {
      return new fgp<>($$0, fgp.a(), fgq::b, fgp.m.a, 1.0, $$1x -> fgm.Q().aj().a($$1, $$1x.floatValue()));
   }

   public fgp<Boolean> W() {
      return this.bw;
   }

   public fgp<Boolean> X() {
      return this.bz;
   }

   public fgp<Boolean> Y() {
      return this.bA;
   }

   public fgp<Boolean> Z() {
      return this.bB;
   }

   public fgp<Boolean> aa() {
      return this.bC;
   }

   public fgp<Boolean> ab() {
      return this.bD;
   }

   public fgp<Boolean> ac() {
      return this.bG;
   }

   public fgp<Boolean> ad() {
      return this.bH;
   }

   public fgp<Boolean> ae() {
      return this.bJ;
   }

   public fgp<Boolean> af() {
      return this.bK;
   }

   public fgp<Boolean> ag() {
      return this.bM;
   }

   public fgp<Integer> ah() {
      return this.bP;
   }

   public fgp<Boolean> ai() {
      return this.bR;
   }

   public fgp<Double> aj() {
      return this.bT;
   }

   public fgp<Double> ak() {
      return this.bV;
   }

   public fgp<Double> al() {
      return this.bX;
   }

   public fgp<Double> am() {
      return this.bZ;
   }

   public fgp<Double> an() {
      return this.cb;
   }

   public fgp<Double> ao() {
      return this.cd;
   }

   public fgp<Double> ap() {
      return this.ce;
   }

   public fgp<Integer> aq() {
      return this.cg;
   }

   public fgp<fgr> ar() {
      return this.ch;
   }

   public fgp<fgo> as() {
      return this.ci;
   }

   public fgp<String> at() {
      return this.cj;
   }

   public fgq(fgm $$0, File $$1) {
      this.X = $$0;
      this.bN = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new fgp<>(
         "options.renderDistance",
         fgp.a(),
         ($$0x, $$1x) -> a($$0x, wz.a("options.chunks", $$1x)),
         new fgp.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fgm.Q().f.r()
      );
      this.ar = new fgp<>(
         "options.simulationDistance", fgp.a(), ($$0x, $$1x) -> a($$0x, wz.a("options.chunks", $$1x)), new fgp.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ae = ad.k() == ad.a.c;
      this.au();
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

   public void a(fgk $$0, fac.a $$1) {
      $$0.b($$1);
      this.av();
   }

   private void a(fgq.b $$0) {
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

   private void a(fgq.a $$0) {
      this.a((fgq.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, fgq::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fgq::c, ag::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, gwi::a, gwi::a);
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

      for (fgk $$1 : this.W) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fac.a($$3));
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

   public void au() {
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
               this.az.a(fgf.b);
            } else {
               this.az.a(fgf.a);
            }
         }

         this.a(new fgq.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).s_() : null;
            }

            @Override
            public <T> void a(String $$0, fgp<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fgq.af.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fgq.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fgq.a($$2) : $$1;
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
               } else if (fgq.a($$2)) {
                  return 1.0F;
               } else if (fgq.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fgq.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fgk.d();
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

   public void av() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bN), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fgq.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fgp<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> fgq.af.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(fgq.ag.toJson($$2));
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

      this.ax();
   }

   public aqh aw() {
      int $$0 = 0;

      for (cmy $$1 : this.aQ) {
         $$0 |= $$1.a();
      }

      return new aqh(this.ac, this.aq.c(), this.aF.c(), this.bh.c(), $$0, this.aR.c(), this.X.aQ(), this.bt.c());
   }

   public void ax() {
      if (this.X.s != null) {
         this.X.s.h.b(new aaa(this.aw()));
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
      this.ax();
   }

   public ffz ay() {
      return this.aD() >= 4 ? this.av.c() : ffz.a;
   }

   public boolean az() {
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

   public ffx aA() {
      return this.bO;
   }

   public void a(ffx $$0) {
      this.bO = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = aye.a(ag, $$0, ah);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aB() {
      return this.bN;
   }

   public String aC() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fgq.b() {
         @Override
         public <T> void a(String $$0x, fgp<T> $$1) {
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

   public int aD() {
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

   interface a extends fgq.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fgp<T> var2);
   }
}
