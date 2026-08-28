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

public class fln {
   static final Logger ae = LogUtils.getLogger();
   static final Gson af = new Gson();
   private static final TypeToken<List<String>> ag = new TypeToken<List<String>>() {
   };
   public static final int a = 2;
   public static final int b = 4;
   public static final int c = 8;
   public static final int d = 12;
   public static final int e = 16;
   public static final int f = 32;
   private static final Splitter ah = Splitter.on(':').limit(2);
   public static final String g = "";
   private static final wp ai = wp.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final flm<Boolean> aj = flm.a("options.darkMojangStudiosBackgroundColor", flm.a(ai), false);
   private static final wp ak = wp.c("options.hideLightningFlashes.tooltip");
   private final flm<Boolean> al = flm.a("options.hideLightningFlashes", flm.a(ak), false);
   private static final wp am = wp.c("options.hideSplashTexts.tooltip");
   private final flm<Boolean> an = flm.a("options.hideSplashTexts", flm.a(am), false);
   private final flm<Double> ao = new flm<>("options.sensitivity", flm.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wp.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wp.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, flm.m.a, 0.5, $$0x -> {
   });
   private final flm<Integer> ap;
   private final flm<Integer> aq;
   private int ar = 0;
   private final flm<Double> as = new flm<>(
      "options.entityDistanceScaling",
      flm.a(),
      fln::a,
      new flm.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final flm<Integer> at = new flm<>(
      "options.framerateLimit",
      flm.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wp.c("options.framerateLimit.max")) : a($$0x, wp.a("options.framerate", $$1x)),
      new flm.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> flj.Q().aP().a($$0x)
   );
   private static final wp au = wp.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final wp av = wp.c("options.inactivityFpsLimit.afk.tooltip");
   private final flm<flf> aw = new flm<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> fqe.a(au);
         case b -> fqe.a(av);
      };
   }, flm.b(), new flm.e<>(Arrays.asList(flf.values()), flf.c), flf.b, $$0x -> {
   });
   private final flm<fkv> ax = new flm<>(
      "options.renderClouds",
      flm.a(),
      flm.b(),
      new flm.e<>(Arrays.asList(fkv.values()), Codec.withAlternative(fkv.d, Codec.BOOL, $$0x -> $$0x ? fkv.c : fkv.a)),
      fkv.c,
      $$0x -> {
      }
   );
   private static final wp ay = wp.c("options.graphics.fast.tooltip");
   private static final wp az = wp.a("options.graphics.fabulous.tooltip", wp.c("options.graphics.fabulous").a(n.u));
   private static final wp aA = wp.c("options.graphics.fancy.tooltip");
   private final flm<flb> aB = new flm<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fqe.a(aA);
            case a -> fqe.a(ay);
            case c -> fqe.a(az);
         };
      },
      ($$0x, $$1x) -> {
         xd $$2x = wp.c($$1x.a());
         return $$1x == flb.c ? $$2x.a(n.u) : $$2x;
      },
      new flm.a<>(
         Arrays.asList(flb.values()),
         Stream.of(flb.values()).filter($$0x -> $$0x != flb.c).collect(Collectors.toList()),
         () -> flj.Q().r() && flj.Q().aj().h(),
         ($$0x, $$1x) -> {
            flj $$2x = flj.Q();
            glq $$3 = $$2x.aj();
            if ($$1x == flb.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.e();
            }
         },
         Codec.INT.xmap(flb::a, flb::b)
      ),
      flb.b,
      $$0x -> {
      }
   );
   private final flm<Boolean> aC = flm.a("options.ao", true, $$0x -> flj.Q().f.e());
   private static final wp aD = wp.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wp aE = wp.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wp aF = wp.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final flm<flp> aG = new flm<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fqe.a(aD);
         case b -> fqe.a(aE);
         case c -> fqe.a(aF);
      };
   }, flm.b(), new flm.e<>(Arrays.asList(flp.values()), Codec.INT.xmap(flp::a, flp::b)), flp.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final flm<cou> aH = new flm<>(
      "options.chat.visibility", flm.a(), flm.b(), new flm.e<>(Arrays.asList(cou.values()), Codec.INT.xmap(cou::a, cou::b)), cou.a, $$0x -> {
      }
   );
   private final flm<Double> aI = new flm<>("options.chat.opacity", flm.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), flm.m.a, 1.0, $$0x -> flj.Q().m.d().b());
   private final flm<Double> aJ = new flm<>("options.chat.line_spacing", flm.a(), fln::a, flm.m.a, 0.0, $$0x -> {
   });
   private static final wp aK = wp.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aL = 5;
   private final flm<Integer> aM = new flm<>("options.accessibility.menu_background_blurriness", flm.a(aK), fln::b, new flm.f(0, 10), 5, $$0x -> {
   });
   private final flm<Double> aN = new flm<>("options.accessibility.text_background_opacity", flm.a(), fln::a, flm.m.a, 0.5, $$0x -> flj.Q().m.d().b());
   private final flm<Double> aO = new flm<>("options.accessibility.panorama_speed", flm.a(), fln::a, flm.m.a, 1.0, $$0x -> {
   });
   private static final wp aP = wp.c("options.accessibility.high_contrast.tooltip");
   private final flm<Boolean> aQ = flm.a("options.accessibility.high_contrast", flm.a(aP), false, $$0x -> {
      aua $$1x = flj.Q().ad();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private static final wp aR = wp.c("options.accessibility.high_contrast_block_outline.tooltip");
   private final flm<Boolean> aS = flm.a("options.accessibility.high_contrast_block_outline", flm.a(aR), false);
   private final flm<Boolean> aT = flm.a(
      "options.accessibility.narrator_hotkey",
      flm.a(flj.a ? wp.c("options.accessibility.narrator_hotkey.mac.tooltip") : wp.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<coy> aU = EnumSet.allOf(coy.class);
   private final flm<bvb> aV = new flm<>("options.mainHand", flm.a(), flm.b(), new flm.e<>(Arrays.asList(bvb.values()), bvb.c), bvb.b, $$0x -> {
   });
   public int o;
   public int p;
   private final flm<Double> aW = new flm<>(
      "options.chat.scale",
      flm.a(),
      ($$0x, $$1x) -> (wp)($$1x == 0.0 ? wo.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      flm.m.a,
      1.0,
      $$0x -> flj.Q().m.d().b()
   );
   private final flm<Double> aX = new flm<>("options.chat.width", flm.a(), ($$0x, $$1x) -> c($$0x, fou.a($$1x)), flm.m.a, 1.0, $$0x -> flj.Q().m.d().b());
   private final flm<Double> aY = new flm<>(
      "options.chat.height.unfocused", flm.a(), ($$0x, $$1x) -> c($$0x, fou.b($$1x)), flm.m.a, fou.i(), $$0x -> flj.Q().m.d().b()
   );
   private final flm<Double> aZ = new flm<>(
      "options.chat.height.focused", flm.a(), ($$0x, $$1x) -> c($$0x, fou.b($$1x)), flm.m.a, 1.0, $$0x -> flj.Q().m.d().b()
   );
   private final flm<Double> ba = new flm<>(
      "options.chat.delay_instant",
      flm.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wp.c("options.chat.delay_none") : wp.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new flm.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> flj.Q().aZ().a($$0x)
   );
   private static final wp bb = wp.c("options.notifications.display_time.tooltip");
   private final flm<Double> bc = new flm<>(
      "options.notifications.display_time",
      flm.a(bb),
      ($$0x, $$1x) -> a($$0x, wp.a("options.multiplier", $$1x)),
      new flm.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final flm<Integer> bd = new flm<>(
      "options.mipmapLevels", flm.a(), ($$0x, $$1x) -> (wp)($$1x == 0 ? wo.a($$0x, false) : a($$0x, $$1x.intValue())), new flm.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final flm<fkq> be = new flm<>(
      "options.attackIndicator", flm.a(), flm.b(), new flm.e<>(Arrays.asList(fkq.values()), Codec.INT.xmap(fkq::a, fkq::b)), fkq.b, $$0x -> {
      }
   );
   public hkz r = hkz.a;
   public boolean s = false;
   private final flm<Integer> bf = new flm<>("options.biomeBlendRadius", flm.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wp.c("options.biomeBlendRadius." + $$2x));
   }, new flm.f(0, 7, false), 2, $$0x -> flj.Q().f.e());
   private final flm<Double> bg = new flm<>(
      "options.mouseWheelSensitivity",
      flm.a(),
      ($$0x, $$1x) -> a($$0x, wp.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new flm.f(-200, 100).a(fln::c, fln::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final flm<Boolean> bh = flm.a("options.rawMouseInput", true, $$0x -> {
      fex $$1x = flj.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final flm<Boolean> bi = flm.a("options.autoJump", false);
   private static final wp bj = wp.c("options.rotateWithMinecart.tooltip");
   private final flm<Boolean> bk = flm.a("options.rotateWithMinecart", flm.a(bj), false);
   private final flm<Boolean> bl = flm.a("options.operatorItemsTab", false);
   private final flm<Boolean> bm = flm.a("options.autoSuggestCommands", true);
   private final flm<Boolean> bn = flm.a("options.chat.color", true);
   private final flm<Boolean> bo = flm.a("options.chat.links", true);
   private final flm<Boolean> bp = flm.a("options.chat.links.prompt", true);
   private final flm<Boolean> bq = flm.a("options.vsync", true, $$0x -> {
      if (flj.Q().aO() != null) {
         flj.Q().aO().a($$0x);
      }
   });
   private final flm<Boolean> br = flm.a("options.entityShadows", true);
   private final flm<Boolean> bs = flm.a("options.forceUnicodeFont", false, $$0x -> aI());
   private final flm<Boolean> bt = flm.a("options.japaneseGlyphVariants", flm.a(wp.c("options.japaneseGlyphVariants.tooltip")), aJ(), $$0x -> aI());
   private final flm<Boolean> bu = flm.a("options.invertMouse", false);
   private final flm<Boolean> bv = flm.a("options.discrete_mouse_scroll", false);
   private static final wp bw = wp.c("options.realmsNotifications.tooltip");
   private final flm<Boolean> bx = flm.a("options.realmsNotifications", flm.a(bw), true);
   private static final wp by = wp.c("options.allowServerListing.tooltip");
   private final flm<Boolean> bz = flm.a("options.allowServerListing", flm.a(by), true, $$0x -> {
   });
   private final flm<Boolean> bA = flm.a("options.reducedDebugInfo", false);
   private final Map<awb, flm<Double>> bB = af.a(new EnumMap<>(awb.class), $$0x -> {
      for (awb $$1x : awb.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final flm<Boolean> bC = flm.a("options.showSubtitles", false);
   private static final wp bD = wp.c("options.directionalAudio.on.tooltip");
   private static final wp bE = wp.c("options.directionalAudio.off.tooltip");
   private final flm<Boolean> bF = flm.a("options.directionalAudio", $$0x -> $$0x ? fqe.a(bD) : fqe.a(bE), false, $$0x -> {
      hjv $$1x = flj.Q().ak();
      $$1x.k();
      $$1x.a(hik.a(awa.Bf, 1.0F));
   });
   private final flm<Boolean> bG = new flm<>(
      "options.accessibility.text_background",
      flm.a(),
      ($$0x, $$1x) -> $$1x ? wp.c("options.accessibility.text_background.chat") : wp.c("options.accessibility.text_background.everywhere"),
      flm.a,
      true,
      $$0x -> {
      }
   );
   private final flm<Boolean> bH = flm.a("options.touchscreen", false);
   private final flm<Boolean> bI = flm.a("options.fullscreen", false, $$0x -> {
      flj $$1x = flj.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ad().a($$1x.aO().i());
      }
   });
   private final flm<Boolean> bJ = flm.a("options.viewBobbing", true);
   private static final wp bK = wp.c("options.key.toggle");
   private static final wp bL = wp.c("options.key.hold");
   private final flm<Boolean> bM = new flm<>("key.sneak", flm.a(), ($$0x, $$1x) -> $$1x ? bK : bL, flm.a, false, $$0x -> {
   });
   private final flm<Boolean> bN = new flm<>("key.sprint", flm.a(), ($$0x, $$1x) -> $$1x ? bK : bL, flm.a, false, $$0x -> {
   });
   public boolean u;
   private static final wp bO = wp.c("options.hideMatchedNames.tooltip");
   private final flm<Boolean> bP = flm.a("options.hideMatchedNames", flm.a(bO), true);
   private final flm<Boolean> bQ = flm.a("options.autosaveIndicator", true);
   private static final wp bR = wp.c("options.onlyShowSecureChat.tooltip");
   private final flm<Boolean> bS = flm.a("options.onlyShowSecureChat", flm.a(bR), false);
   public final flh v = new flh("key.forward", 87, "key.categories.movement");
   public final flh w = new flh("key.left", 65, "key.categories.movement");
   public final flh x = new flh("key.back", 83, "key.categories.movement");
   public final flh y = new flh("key.right", 68, "key.categories.movement");
   public final flh z = new flh("key.jump", 32, "key.categories.movement");
   public final flh A = new flu("key.sneak", 340, "key.categories.movement", this.bM::c);
   public final flh B = new flu("key.sprint", 341, "key.categories.movement", this.bN::c);
   public final flh C = new flh("key.inventory", 69, "key.categories.inventory");
   public final flh D = new flh("key.swapOffhand", 70, "key.categories.inventory");
   public final flh E = new flh("key.drop", 81, "key.categories.inventory");
   public final flh F = new flh("key.use", fep.b.c, 1, "key.categories.gameplay");
   public final flh G = new flh("key.attack", fep.b.c, 0, "key.categories.gameplay");
   public final flh H = new flh("key.pickItem", fep.b.c, 2, "key.categories.gameplay");
   public final flh I = new flh("key.chat", 84, "key.categories.multiplayer");
   public final flh J = new flh("key.playerlist", 258, "key.categories.multiplayer");
   public final flh K = new flh("key.command", 47, "key.categories.multiplayer");
   public final flh L = new flh("key.socialInteractions", 80, "key.categories.multiplayer");
   public final flh M = new flh("key.screenshot", 291, "key.categories.misc");
   public final flh N = new flh("key.togglePerspective", 294, "key.categories.misc");
   public final flh O = new flh("key.smoothCamera", fep.bv.b(), "key.categories.misc");
   public final flh P = new flh("key.fullscreen", 300, "key.categories.misc");
   public final flh Q = new flh("key.spectatorOutlines", fep.bv.b(), "key.categories.misc");
   public final flh R = new flh("key.advancements", 76, "key.categories.misc");
   public final flh[] S = new flh[]{
      new flh("key.hotbar.1", 49, "key.categories.inventory"),
      new flh("key.hotbar.2", 50, "key.categories.inventory"),
      new flh("key.hotbar.3", 51, "key.categories.inventory"),
      new flh("key.hotbar.4", 52, "key.categories.inventory"),
      new flh("key.hotbar.5", 53, "key.categories.inventory"),
      new flh("key.hotbar.6", 54, "key.categories.inventory"),
      new flh("key.hotbar.7", 55, "key.categories.inventory"),
      new flh("key.hotbar.8", 56, "key.categories.inventory"),
      new flh("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final flh T = new flh("key.saveToolbarActivator", 67, "key.categories.creative");
   public final flh U = new flh("key.loadToolbarActivator", 88, "key.categories.creative");
   public final flh[] V = (flh[])ArrayUtils.addAll(
      new flh[]{
         this.G,
         this.F,
         this.v,
         this.w,
         this.x,
         this.y,
         this.z,
         this.A,
         this.B,
         this.E,
         this.C,
         this.I,
         this.J,
         this.H,
         this.K,
         this.L,
         this.M,
         this.N,
         this.O,
         this.P,
         this.Q,
         this.D,
         this.T,
         this.U,
         this.R
      },
      this.S
   );
   protected flj W;
   private final File bT;
   public boolean X;
   private fks bU = fks.a;
   public String Y = "";
   public boolean Z;
   private final flm<Integer> bV = new flm<>("options.fov", flm.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wp.c("options.fov.min"));
         case 110 -> a($$0x, wp.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new flm.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> flj.Q().f.p());
   private static final wp bW = wp.a("options.telemetry.button.tooltip", wp.c("options.telemetry.state.minimal"), wp.c("options.telemetry.state.all"));
   private final flm<Boolean> bX = flm.a("options.telemetry.button", flm.a(bW), ($$0x, $$1x) -> {
      flj $$2x = flj.Q();
      if (!$$2x.E()) {
         return wp.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wp.c("options.telemetry.state.all") : wp.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wp bY = wp.c("options.screenEffectScale.tooltip");
   private final flm<Double> bZ = new flm<>("options.screenEffectScale", flm.a(bY), fln::b, flm.m.a, 1.0, $$0x -> {
   });
   private static final wp ca = wp.c("options.fovEffectScale.tooltip");
   private final flm<Double> cb = new flm<>(
      "options.fovEffectScale", flm.a(ca), fln::b, flm.m.a.a(ayz::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final wp cc = wp.c("options.darknessEffectScale.tooltip");
   private final flm<Double> cd = new flm<>("options.darknessEffectScale", flm.a(cc), fln::b, flm.m.a.a(ayz::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final wp ce = wp.c("options.glintSpeed.tooltip");
   private final flm<Double> cf = new flm<>("options.glintSpeed", flm.a(ce), fln::b, flm.m.a, 0.5, $$0x -> {
   });
   private static final wp cg = wp.c("options.glintStrength.tooltip");
   private final flm<Double> ch = new flm<>("options.glintStrength", flm.a(cg), fln::b, flm.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final wp ci = wp.c("options.damageTiltStrength.tooltip");
   private final flm<Double> cj = new flm<>("options.damageTiltStrength", flm.a(ci), fln::b, flm.m.a, 1.0, $$0x -> {
   });
   private final flm<Double> ck = new flm<>("options.gamma", flm.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wp.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wp.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wp.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, flm.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cl = 2147483646;
   private final flm<Integer> cm = new flm<>(
      "options.guiScale", flm.a(), ($$0x, $$1x) -> $$1x == 0 ? wp.c("options.guiScale.auto") : wp.b(Integer.toString($$1x)), new flm.c(0, () -> {
         flj $$0x = flj.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final flm<aqv> cn = new flm<>(
      "options.particles", flm.a(), flm.b(), new flm.e<>(Arrays.asList(aqv.values()), Codec.INT.xmap(aqv::a, aqv::b)), aqv.a, $$0x -> {
      }
   );
   private final flm<fll> co = new flm<>(
      "options.narrator",
      flm.a(),
      ($$0x, $$1x) -> (wp)(this.W.aY().a() ? $$1x.b() : wp.c("options.narrator.notavailable")),
      new flm.e<>(Arrays.asList(fll.values()), Codec.INT.xmap(fll::a, fll::a)),
      fll.a,
      $$0x -> this.W.aY().a($$0x)
   );
   public String ab = "en_us";
   private final flm<String> cp = new flm<>(
      "options.audioDevice",
      flm.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wp.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wp.b($$1x.substring(hjs.c)) : wp.b($$1x);
         }
      },
      new flm.h<>(
         () -> Stream.concat(Stream.of(""), flj.Q().ak().a().stream()).toList(),
         $$0x -> flj.Q().r() && $$0x != "" && !flj.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hjv $$1x = flj.Q().ak();
         $$1x.k();
         $$1x.a(hik.a(awa.Bf, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;

   public flm<Boolean> a() {
      return this.aj;
   }

   public flm<Boolean> b() {
      return this.al;
   }

   public flm<Boolean> c() {
      return this.an;
   }

   public flm<Double> d() {
      return this.ao;
   }

   public flm<Integer> e() {
      return this.ap;
   }

   public flm<Integer> f() {
      return this.aq;
   }

   public flm<Double> g() {
      return this.as;
   }

   public flm<Integer> h() {
      return this.at;
   }

   public flm<flf> i() {
      return this.aw;
   }

   public flm<fkv> j() {
      return this.ax;
   }

   public flm<flb> k() {
      return this.aB;
   }

   public flm<Boolean> l() {
      return this.aC;
   }

   public flm<flp> m() {
      return this.aG;
   }

   public void a(aua $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (atx $$2 : $$0.g()) {
         if (!$$2.j()) {
            this.i.add($$2.g());
            if (!$$2.d().a()) {
               this.j.add($$2.g());
            }
         }
      }

      this.az();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.W.l();
      }
   }

   public flm<cou> n() {
      return this.aH;
   }

   public flm<Double> o() {
      return this.aI;
   }

   public flm<Double> p() {
      return this.aJ;
   }

   public flm<Integer> q() {
      return this.aM;
   }

   public int r() {
      return this.q().c();
   }

   public flm<Double> s() {
      return this.aN;
   }

   public flm<Double> t() {
      return this.aO;
   }

   public flm<Boolean> u() {
      return this.aQ;
   }

   public flm<Boolean> v() {
      return this.aS;
   }

   public flm<Boolean> w() {
      return this.aT;
   }

   public flm<bvb> x() {
      return this.aV;
   }

   public flm<Double> y() {
      return this.aW;
   }

   public flm<Double> z() {
      return this.aX;
   }

   public flm<Double> A() {
      return this.aY;
   }

   public flm<Double> B() {
      return this.aZ;
   }

   public flm<Double> C() {
      return this.ba;
   }

   public flm<Double> D() {
      return this.bc;
   }

   public flm<Integer> E() {
      return this.bd;
   }

   public flm<fkq> F() {
      return this.be;
   }

   public flm<Integer> G() {
      return this.bf;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ayz.a(Math.log10($$0) * 100.0);
   }

   public flm<Double> H() {
      return this.bg;
   }

   public flm<Boolean> I() {
      return this.bh;
   }

   public flm<Boolean> J() {
      return this.bi;
   }

   public flm<Boolean> K() {
      return this.bk;
   }

   public flm<Boolean> L() {
      return this.bl;
   }

   public flm<Boolean> M() {
      return this.bm;
   }

   public flm<Boolean> N() {
      return this.bn;
   }

   public flm<Boolean> O() {
      return this.bo;
   }

   public flm<Boolean> P() {
      return this.bp;
   }

   public flm<Boolean> Q() {
      return this.bq;
   }

   public flm<Boolean> R() {
      return this.br;
   }

   private static void aI() {
      flj $$0 = flj.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public flm<Boolean> S() {
      return this.bs;
   }

   private static boolean aJ() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public flm<Boolean> T() {
      return this.bt;
   }

   public flm<Boolean> U() {
      return this.bu;
   }

   public flm<Boolean> V() {
      return this.bv;
   }

   public flm<Boolean> W() {
      return this.bx;
   }

   public flm<Boolean> X() {
      return this.bz;
   }

   public flm<Boolean> Y() {
      return this.bA;
   }

   public final float a(awb $$0) {
      return this.b($$0).c().floatValue();
   }

   public final flm<Double> b(awb $$0) {
      return Objects.requireNonNull(this.bB.get($$0));
   }

   private flm<Double> a(String $$0, awb $$1) {
      return new flm<>($$0, flm.a(), fln::b, flm.m.a, 1.0, $$1x -> flj.Q().ak().a($$1, $$1x.floatValue()));
   }

   public flm<Boolean> Z() {
      return this.bC;
   }

   public flm<Boolean> aa() {
      return this.bF;
   }

   public flm<Boolean> ab() {
      return this.bG;
   }

   public flm<Boolean> ac() {
      return this.bH;
   }

   public flm<Boolean> ad() {
      return this.bI;
   }

   public flm<Boolean> ae() {
      return this.bJ;
   }

   public flm<Boolean> af() {
      return this.bM;
   }

   public flm<Boolean> ag() {
      return this.bN;
   }

   public flm<Boolean> ah() {
      return this.bP;
   }

   public flm<Boolean> ai() {
      return this.bQ;
   }

   public flm<Boolean> aj() {
      return this.bS;
   }

   public flm<Integer> ak() {
      return this.bV;
   }

   public flm<Boolean> al() {
      return this.bX;
   }

   public flm<Double> am() {
      return this.bZ;
   }

   public flm<Double> an() {
      return this.cb;
   }

   public flm<Double> ao() {
      return this.cd;
   }

   public flm<Double> ap() {
      return this.cf;
   }

   public flm<Double> aq() {
      return this.ch;
   }

   public flm<Double> ar() {
      return this.cj;
   }

   public flm<Double> as() {
      return this.ck;
   }

   public flm<Integer> at() {
      return this.cm;
   }

   public flm<aqv> au() {
      return this.cn;
   }

   public flm<fll> av() {
      return this.co;
   }

   public flm<String> aw() {
      return this.cp;
   }

   public void ax() {
      this.ac = false;
      this.az();
   }

   public fln(flj $$0, File $$1) {
      this.W = $$0;
      this.bT = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ap = new flm<>(
         "options.renderDistance",
         flm.a(),
         ($$0x, $$1x) -> a($$0x, wp.a("options.chunks", $$1x)),
         new flm.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> flj.Q().f.p()
      );
      this.aq = new flm<>(
         "options.simulationDistance", flm.a(), ($$0x, $$1x) -> a($$0x, wp.a("options.chunks", $$1x)), new flm.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = af.m() == af.a.c;
      this.ay();
   }

   public float a(float $$0) {
      return this.bG.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return axk.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bG.c() ? $$0 : axk.a(this.aN.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(fln.b $$0) {
      $$0.a("ao", this.aC);
      $$0.a("biomeBlendRadius", this.bf);
      $$0.a("enableVsync", this.bq);
      $$0.a("entityDistanceScaling", this.as);
      $$0.a("entityShadows", this.br);
      $$0.a("forceUnicodeFont", this.bs);
      $$0.a("japaneseGlyphVariants", this.bt);
      $$0.a("fov", this.bV);
      $$0.a("fovEffectScale", this.cb);
      $$0.a("darknessEffectScale", this.cd);
      $$0.a("glintSpeed", this.cf);
      $$0.a("glintStrength", this.ch);
      $$0.a("prioritizeChunkUpdates", this.aG);
      $$0.a("fullscreen", this.bI);
      $$0.a("gamma", this.ck);
      $$0.a("graphicsMode", this.aB);
      $$0.a("guiScale", this.cm);
      $$0.a("maxFps", this.at);
      $$0.a("inactivityFpsLimit", this.aw);
      $$0.a("mipmapLevels", this.bd);
      $$0.a("narrator", this.co);
      $$0.a("particles", this.cn);
      $$0.a("reducedDebugInfo", this.bA);
      $$0.a("renderClouds", this.ax);
      $$0.a("renderDistance", this.ap);
      $$0.a("simulationDistance", this.aq);
      $$0.a("screenEffectScale", this.bZ);
      $$0.a("soundDevice", this.cp);
   }

   private void a(fln.a $$0) {
      this.a((fln.b)$$0);
      $$0.a("autoJump", this.bi);
      $$0.a("rotateWithMinecart", this.bk);
      $$0.a("operatorItemsTab", this.bl);
      $$0.a("autoSuggestions", this.bm);
      $$0.a("chatColors", this.bn);
      $$0.a("chatLinks", this.bo);
      $$0.a("chatLinksPrompt", this.bp);
      $$0.a("discrete_mouse_scroll", this.bv);
      $$0.a("invertYMouse", this.bu);
      $$0.a("realmsNotifications", this.bx);
      $$0.a("showSubtitles", this.bC);
      $$0.a("directionalAudio", this.bF);
      $$0.a("touchscreen", this.bH);
      $$0.a("bobView", this.bJ);
      $$0.a("toggleCrouch", this.bM);
      $$0.a("toggleSprint", this.bN);
      $$0.a("darkMojangStudiosBackground", this.aj);
      $$0.a("hideLightningFlashes", this.al);
      $$0.a("hideSplashTexts", this.an);
      $$0.a("mouseSensitivity", this.ao);
      $$0.a("damageTiltStrength", this.cj);
      $$0.a("highContrast", this.aQ);
      $$0.a("highContrastBlockOutline", this.aS);
      $$0.a("narratorHotkey", this.aT);
      this.i = $$0.a("resourcePacks", this.i, fln::c, af::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fln::c, af::toJson);
      this.Y = $$0.a("lastServer", this.Y);
      this.ab = $$0.a("lang", this.ab);
      $$0.a("chatVisibility", this.aH);
      $$0.a("chatOpacity", this.aI);
      $$0.a("chatLineSpacing", this.aJ);
      $$0.a("textBackgroundOpacity", this.aN);
      $$0.a("backgroundForChatOnly", this.bG);
      this.l = $$0.a("hideServerAddress", this.l);
      this.m = $$0.a("advancedItemTooltips", this.m);
      this.n = $$0.a("pauseOnLostFocus", this.n);
      this.o = $$0.a("overrideWidth", this.o);
      this.p = $$0.a("overrideHeight", this.p);
      $$0.a("chatHeightFocused", this.aZ);
      $$0.a("chatDelay", this.ba);
      $$0.a("chatHeightUnfocused", this.aY);
      $$0.a("chatScale", this.aW);
      $$0.a("chatWidth", this.aX);
      $$0.a("notificationDisplayTime", this.bc);
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aV);
      $$0.a("attackIndicator", this.be);
      this.r = $$0.a("tutorialStep", this.r, hkz::a, hkz::a);
      $$0.a("mouseWheelSensitivity", this.bg);
      $$0.a("rawMouseInput", this.bh);
      this.t = $$0.a("glDebugVerbosity", this.t);
      this.u = $$0.a("skipMultiplayerWarning", this.u);
      $$0.a("hideMatchedNames", this.bP);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.ad = $$0.a("syncChunkWrites", this.ad);
      $$0.a("showAutosaveIndicator", this.bQ);
      $$0.a("allowServerListing", this.bz);
      $$0.a("onlyShowSecureChat", this.bS);
      $$0.a("panoramaScrollSpeed", this.aO);
      $$0.a("telemetryOptInExtra", this.bX);
      this.ac = $$0.a("onboardAccessibility", this.ac);
      $$0.a("menuBackgroundBlurriness", this.aM);

      for (flh $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fep.a($$3));
         }
      }

      for (awb $$4 : awb.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bB.get($$4));
      }

      for (coy $$5 : coy.values()) {
         boolean $$6 = this.aU.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.a($$5, $$7);
         }
      }
   }

   public void ay() {
      try {
         if (!this.bT.exists()) {
            return;
         }

         tq $$0 = new tq();

         try (BufferedReader $$1 = Files.newReader(this.bT, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = ah.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  ae.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final tq $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(flb.b);
            } else {
               this.aB.a(flb.a);
            }
         }

         this.a(new fln.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).u_() : null;
            }

            @Override
            public <T> void a(String $$0, flm<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fln.ae.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fln.ae.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fln.a($$2) : $$1;
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
               } else if (fln.a($$2)) {
                  return 1.0F;
               } else if (fln.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fln.ae.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         flh.d();
      } catch (Exception var7) {
         ae.error("Failed to load options", var7);
      }
   }

   static boolean a(String $$0) {
      return "true".equals($$0);
   }

   static boolean b(String $$0) {
      return "false".equals($$0);
   }

   private tq a(tq $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return ban.e.a(this.W.au(), $$0, $$1);
   }

   public void az() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bT), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fln.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, flm<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> fln.ae.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(fln.af.toJson($$2));
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
         if (this.W.aO().e().isPresent()) {
            $$0.println("fullscreenResolution:" + this.W.aO().e().get().g());
         }
      } catch (Exception var6) {
         ae.error("Failed to save options", var6);
      }

      this.aB();
   }

   public aqo aA() {
      int $$0 = 0;

      for (coy $$1 : this.aU) {
         $$0 |= $$1.a();
      }

      return new aqo(this.ab, this.ap.c(), this.aH.c(), this.bn.c(), $$0, this.aV.c(), this.W.aT(), this.bz.c(), this.cn.c());
   }

   public void aB() {
      if (this.W.t != null) {
         this.W.t.j.a(this.aA());
      }
   }

   public void a(coy $$0, boolean $$1) {
      if ($$1) {
         this.aU.add($$0);
      } else {
         this.aU.remove($$0);
      }
   }

   public boolean a(coy $$0) {
      return this.aU.contains($$0);
   }

   public fkv aC() {
      return this.aH() >= 4 ? this.ax.c() : fkv.a;
   }

   public boolean aD() {
      return this.q;
   }

   public void b(aua $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         atx $$4 = $$0.c($$3);
         if ($$4 == null && !$$3.startsWith("file/")) {
            $$4 = $$0.c("file/" + $$3);
         }

         if ($$4 == null) {
            ae.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", $$3);
            $$2.remove();
         } else if (!$$4.d().a() && !this.j.contains($$3)) {
            ae.warn("Removed resource pack {} from options because it is no longer compatible", $$3);
            $$2.remove();
         } else if ($$4.d().a() && this.j.contains($$3)) {
            ae.info("Removed resource pack {} from incompatibility list because it's now compatible", $$3);
            this.j.remove($$3);
         } else {
            $$1.add($$4.g());
         }
      }

      $$0.b($$1);
   }

   public fks aE() {
      return this.bU;
   }

   public void a(fks $$0) {
      this.bU = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = ayp.a(af, $$0, ag);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aF() {
      return this.bT;
   }

   public String aG() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fln.b() {
         @Override
         public <T> void a(String $$0x, flm<T> $$1) {
            $$0.add(Pair.of($$0, $$1.c()));
         }
      });
      $$0.add(Pair.of("fullscreenResolution", String.valueOf(this.k)));
      $$0.add(Pair.of("glDebugVerbosity", this.t));
      $$0.add(Pair.of("overrideHeight", this.p));
      $$0.add(Pair.of("overrideWidth", this.o));
      $$0.add(Pair.of("syncChunkWrites", this.ad));
      $$0.add(Pair.of("useNativeTransport", this.q));
      $$0.add(Pair.of("resourcePacks", this.i));
      return $$0.stream()
         .sorted(Comparator.comparing(Pair::getFirst))
         .map($$0x -> (String)$$0x.getFirst() + ": " + $$0x.getSecond())
         .collect(Collectors.joining(System.lineSeparator()));
   }

   public void b(int $$0) {
      this.ar = $$0;
   }

   public int aH() {
      return this.ar > 0 ? Math.min(this.ap.c(), this.ar) : this.ap.c();
   }

   private static wp c(wp $$0, int $$1) {
      return wp.a("options.pixel_value", $$0, $$1);
   }

   private static wp a(wp $$0, double $$1) {
      return wp.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static wp a(wp $$0, wp $$1) {
      return wp.a("options.generic_value", $$0, $$1);
   }

   public static wp a(wp $$0, int $$1) {
      return a($$0, wp.b(Integer.toString($$1)));
   }

   public static wp b(wp $$0, int $$1) {
      return $$1 == 0 ? a($$0, wo.c) : a($$0, $$1);
   }

   private static wp b(wp $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, wo.c) : a($$0, $$1);
   }

   interface a extends fln.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, flm<T> var2);
   }
}
