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

public class fpd {
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
   private static final wy aj = wy.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fpc<Boolean> ak = fpc.a("options.darkMojangStudiosBackgroundColor", fpc.a(aj), false);
   private static final wy al = wy.c("options.hideLightningFlashes.tooltip");
   private final fpc<Boolean> am = fpc.a("options.hideLightningFlashes", fpc.a(al), false);
   private static final wy an = wy.c("options.hideSplashTexts.tooltip");
   private final fpc<Boolean> ao = fpc.a("options.hideSplashTexts", fpc.a(an), false);
   private final fpc<Double> ap = new fpc<>("options.sensitivity", fpc.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wy.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wy.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fpc.m.a, 0.5, $$0x -> {
   });
   private final fpc<Integer> aq;
   private final fpc<Integer> ar;
   private int as = 0;
   private final fpc<Double> at = new fpc<>(
      "options.entityDistanceScaling",
      fpc.a(),
      fpd::a,
      new fpc.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fpc<Integer> au = new fpc<>(
      "options.framerateLimit",
      fpc.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wy.c("options.framerateLimit.max")) : a($$0x, wy.a("options.framerate", $$1x)),
      new fpc.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> foz.Q().aP().a($$0x)
   );
   private static final wy av = wy.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final wy aw = wy.c("options.inactivityFpsLimit.afk.tooltip");
   private final fpc<fov> ax = new fpc<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> ftu.a(av);
         case b -> ftu.a(aw);
      };
   }, fpc.b(), new fpc.e<>(Arrays.asList(fov.values()), fov.c), fov.b, $$0x -> {
   });
   private final fpc<fok> ay = new fpc<>(
      "options.renderClouds",
      fpc.a(),
      fpc.b(),
      new fpc.e<>(Arrays.asList(fok.values()), Codec.withAlternative(fok.d, Codec.BOOL, $$0x -> $$0x ? fok.c : fok.a)),
      fok.c,
      $$0x -> {
      }
   );
   private static final wy az = wy.c("options.graphics.fast.tooltip");
   private static final wy aA = wy.a("options.graphics.fabulous.tooltip", wy.c("options.graphics.fabulous").a(n.u));
   private static final wy aB = wy.c("options.graphics.fancy.tooltip");
   private final fpc<foq> aC = new fpc<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> ftu.a(aB);
            case a -> ftu.a(az);
            case c -> ftu.a(aA);
         };
      },
      ($$0x, $$1x) -> {
         xm $$2x = wy.c($$1x.a());
         return $$1x == foq.c ? $$2x.a(n.u) : $$2x;
      },
      new fpc.a<>(
         Arrays.asList(foq.values()),
         Stream.of(foq.values()).filter($$0x -> $$0x != foq.c).collect(Collectors.toList()),
         () -> foz.Q().r() && foz.Q().aj().h(),
         ($$0x, $$1x) -> {
            foz $$2x = foz.Q();
            gpr $$3 = $$2x.aj();
            if ($$1x == foq.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.e();
            }
         },
         Codec.INT.xmap(foq::a, foq::b)
      ),
      foq.b,
      $$0x -> {
      }
   );
   private final fpc<Boolean> aD = fpc.a("options.ao", true, $$0x -> foz.Q().f.e());
   private static final wy aE = wy.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wy aF = wy.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wy aG = wy.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fpc<fpf> aH = new fpc<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> ftu.a(aE);
         case b -> ftu.a(aF);
         case c -> ftu.a(aG);
      };
   }, fpc.b(), new fpc.e<>(Arrays.asList(fpf.values()), Codec.INT.xmap(fpf::a, fpf::b)), fpf.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fpc<cqz> aI = new fpc<>(
      "options.chat.visibility", fpc.a(), fpc.b(), new fpc.e<>(Arrays.asList(cqz.values()), Codec.INT.xmap(cqz::a, cqz::b)), cqz.a, $$0x -> {
      }
   );
   private final fpc<Double> aJ = new fpc<>("options.chat.opacity", fpc.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fpc.m.a, 1.0, $$0x -> foz.Q().m.d().b());
   private final fpc<Double> aK = new fpc<>("options.chat.line_spacing", fpc.a(), fpd::a, fpc.m.a, 0.0, $$0x -> {
   });
   private static final wy aL = wy.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aM = 5;
   private final fpc<Integer> aN = new fpc<>("options.accessibility.menu_background_blurriness", fpc.a(aL), fpd::b, new fpc.f(0, 10), 5, $$0x -> {
   });
   private final fpc<Double> aO = new fpc<>("options.accessibility.text_background_opacity", fpc.a(), fpd::a, fpc.m.a, 0.5, $$0x -> foz.Q().m.d().b());
   private final fpc<Double> aP = new fpc<>("options.accessibility.panorama_speed", fpc.a(), fpd::a, fpc.m.a, 1.0, $$0x -> {
   });
   private static final wy aQ = wy.c("options.accessibility.high_contrast.tooltip");
   private final fpc<Boolean> aR = fpc.a("options.accessibility.high_contrast", fpc.a(aQ), false, $$0x -> {
      aun $$1x = foz.Q().ad();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private static final wy aS = wy.c("options.accessibility.high_contrast_block_outline.tooltip");
   private final fpc<Boolean> aT = fpc.a("options.accessibility.high_contrast_block_outline", fpc.a(aS), false);
   private final fpc<Boolean> aU = fpc.a(
      "options.accessibility.narrator_hotkey",
      fpc.a(foz.a ? wy.c("options.accessibility.narrator_hotkey.mac.tooltip") : wy.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cre> aV = EnumSet.allOf(cre.class);
   private final fpc<bwx> aW = new fpc<>("options.mainHand", fpc.a(), fpc.b(), new fpc.e<>(Arrays.asList(bwx.values()), bwx.c), bwx.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fpc<Double> aX = new fpc<>(
      "options.chat.scale",
      fpc.a(),
      ($$0x, $$1x) -> (wy)($$1x == 0.0 ? wx.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fpc.m.a,
      1.0,
      $$0x -> foz.Q().m.d().b()
   );
   private final fpc<Double> aY = new fpc<>("options.chat.width", fpc.a(), ($$0x, $$1x) -> c($$0x, fsk.a($$1x)), fpc.m.a, 1.0, $$0x -> foz.Q().m.d().b());
   private final fpc<Double> aZ = new fpc<>(
      "options.chat.height.unfocused", fpc.a(), ($$0x, $$1x) -> c($$0x, fsk.b($$1x)), fpc.m.a, fsk.i(), $$0x -> foz.Q().m.d().b()
   );
   private final fpc<Double> ba = new fpc<>(
      "options.chat.height.focused", fpc.a(), ($$0x, $$1x) -> c($$0x, fsk.b($$1x)), fpc.m.a, 1.0, $$0x -> foz.Q().m.d().b()
   );
   private final fpc<Double> bb = new fpc<>(
      "options.chat.delay_instant",
      fpc.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wy.c("options.chat.delay_none") : wy.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fpc.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> foz.Q().aZ().a($$0x)
   );
   private static final wy bc = wy.c("options.notifications.display_time.tooltip");
   private final fpc<Double> bd = new fpc<>(
      "options.notifications.display_time",
      fpc.a(bc),
      ($$0x, $$1x) -> a($$0x, wy.a("options.multiplier", $$1x)),
      new fpc.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fpc<Integer> be = new fpc<>(
      "options.mipmapLevels", fpc.a(), ($$0x, $$1x) -> (wy)($$1x == 0 ? wx.a($$0x, false) : a($$0x, $$1x.intValue())), new fpc.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fpc<fof> bf = new fpc<>(
      "options.attackIndicator", fpc.a(), fpc.b(), new fpc.e<>(Arrays.asList(fof.values()), Codec.INT.xmap(fof::a, fof::b)), fof.b, $$0x -> {
      }
   );
   public hpe r = hpe.a;
   public boolean s = false;
   private final fpc<Integer> bg = new fpc<>("options.biomeBlendRadius", fpc.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wy.c("options.biomeBlendRadius." + $$2x));
   }, new fpc.f(0, 7, false), 2, $$0x -> foz.Q().f.e());
   private final fpc<Double> bh = new fpc<>(
      "options.mouseWheelSensitivity",
      fpc.a(),
      ($$0x, $$1x) -> a($$0x, wy.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fpc.f(-200, 100).a(fpd::c, fpd::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fpc<Boolean> bi = fpc.a("options.rawMouseInput", true, $$0x -> {
      fin $$1x = foz.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fpc<Boolean> bj = fpc.a("options.autoJump", false);
   private static final wy bk = wy.c("options.rotateWithMinecart.tooltip");
   private final fpc<Boolean> bl = fpc.a("options.rotateWithMinecart", fpc.a(bk), false);
   private final fpc<Boolean> bm = fpc.a("options.operatorItemsTab", false);
   private final fpc<Boolean> bn = fpc.a("options.autoSuggestCommands", true);
   private final fpc<Boolean> bo = fpc.a("options.chat.color", true);
   private final fpc<Boolean> bp = fpc.a("options.chat.links", true);
   private final fpc<Boolean> bq = fpc.a("options.chat.links.prompt", true);
   private final fpc<Boolean> br = fpc.a("options.vsync", true, $$0x -> {
      if (foz.Q().aO() != null) {
         foz.Q().aO().a($$0x);
      }
   });
   private final fpc<Boolean> bs = fpc.a("options.entityShadows", true);
   private final fpc<Boolean> bt = fpc.a("options.forceUnicodeFont", false, $$0x -> aI());
   private final fpc<Boolean> bu = fpc.a("options.japaneseGlyphVariants", fpc.a(wy.c("options.japaneseGlyphVariants.tooltip")), aJ(), $$0x -> aI());
   private final fpc<Boolean> bv = fpc.a("options.invertMouse", false);
   private final fpc<Boolean> bw = fpc.a("options.discrete_mouse_scroll", false);
   private static final wy bx = wy.c("options.realmsNotifications.tooltip");
   private final fpc<Boolean> by = fpc.a("options.realmsNotifications", fpc.a(bx), true);
   private static final wy bz = wy.c("options.allowServerListing.tooltip");
   private final fpc<Boolean> bA = fpc.a("options.allowServerListing", fpc.a(bz), true, $$0x -> {
   });
   private final fpc<Boolean> bB = fpc.a("options.reducedDebugInfo", false);
   private final Map<awo, fpc<Double>> bC = af.a(awo.class, $$0x -> this.a("soundCategory." + $$0x.a(), $$0x));
   private final fpc<Boolean> bD = fpc.a("options.showSubtitles", false);
   private static final wy bE = wy.c("options.directionalAudio.on.tooltip");
   private static final wy bF = wy.c("options.directionalAudio.off.tooltip");
   private final fpc<Boolean> bG = fpc.a("options.directionalAudio", $$0x -> $$0x ? ftu.a(bE) : ftu.a(bF), false, $$0x -> {
      hoa $$1x = foz.Q().ak();
      $$1x.k();
      $$1x.a(hmp.a(awn.Bv, 1.0F));
   });
   private final fpc<Boolean> bH = new fpc<>(
      "options.accessibility.text_background",
      fpc.a(),
      ($$0x, $$1x) -> $$1x ? wy.c("options.accessibility.text_background.chat") : wy.c("options.accessibility.text_background.everywhere"),
      fpc.a,
      true,
      $$0x -> {
      }
   );
   private final fpc<Boolean> bI = fpc.a("options.touchscreen", false);
   private final fpc<Boolean> bJ = fpc.a("options.fullscreen", false, $$0x -> {
      foz $$1x = foz.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ad().a($$1x.aO().i());
      }
   });
   private final fpc<Boolean> bK = fpc.a("options.viewBobbing", true);
   private static final wy bL = wy.c("options.key.toggle");
   private static final wy bM = wy.c("options.key.hold");
   private final fpc<Boolean> bN = new fpc<>("key.sneak", fpc.a(), ($$0x, $$1x) -> $$1x ? bL : bM, fpc.a, false, $$0x -> {
   });
   private final fpc<Boolean> bO = new fpc<>("key.sprint", fpc.a(), ($$0x, $$1x) -> $$1x ? bL : bM, fpc.a, false, $$0x -> {
   });
   public boolean u;
   private static final wy bP = wy.c("options.hideMatchedNames.tooltip");
   private final fpc<Boolean> bQ = fpc.a("options.hideMatchedNames", fpc.a(bP), true);
   private final fpc<Boolean> bR = fpc.a("options.autosaveIndicator", true);
   private static final wy bS = wy.c("options.onlyShowSecureChat.tooltip");
   private final fpc<Boolean> bT = fpc.a("options.onlyShowSecureChat", fpc.a(bS), false);
   public final fox v = new fox("key.forward", 87, "key.categories.movement");
   public final fox w = new fox("key.left", 65, "key.categories.movement");
   public final fox x = new fox("key.back", 83, "key.categories.movement");
   public final fox y = new fox("key.right", 68, "key.categories.movement");
   public final fox z = new fox("key.jump", 32, "key.categories.movement");
   public final fox A = new fpk("key.sneak", 340, "key.categories.movement", this.bN::c);
   public final fox B = new fpk("key.sprint", 341, "key.categories.movement", this.bO::c);
   public final fox C = new fox("key.inventory", 69, "key.categories.inventory");
   public final fox D = new fox("key.swapOffhand", 70, "key.categories.inventory");
   public final fox E = new fox("key.drop", 81, "key.categories.inventory");
   public final fox F = new fox("key.use", fif.b.c, 1, "key.categories.gameplay");
   public final fox G = new fox("key.attack", fif.b.c, 0, "key.categories.gameplay");
   public final fox H = new fox("key.pickItem", fif.b.c, 2, "key.categories.gameplay");
   public final fox I = new fox("key.chat", 84, "key.categories.multiplayer");
   public final fox J = new fox("key.playerlist", 258, "key.categories.multiplayer");
   public final fox K = new fox("key.command", 47, "key.categories.multiplayer");
   public final fox L = new fox("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fox M = new fox("key.screenshot", 291, "key.categories.misc");
   public final fox N = new fox("key.togglePerspective", 294, "key.categories.misc");
   public final fox O = new fox("key.smoothCamera", fif.bv.b(), "key.categories.misc");
   public final fox P = new fox("key.fullscreen", 300, "key.categories.misc");
   public final fox Q = new fox("key.spectatorOutlines", fif.bv.b(), "key.categories.misc");
   public final fox R = new fox("key.advancements", 76, "key.categories.misc");
   public final fox[] S = new fox[]{
      new fox("key.hotbar.1", 49, "key.categories.inventory"),
      new fox("key.hotbar.2", 50, "key.categories.inventory"),
      new fox("key.hotbar.3", 51, "key.categories.inventory"),
      new fox("key.hotbar.4", 52, "key.categories.inventory"),
      new fox("key.hotbar.5", 53, "key.categories.inventory"),
      new fox("key.hotbar.6", 54, "key.categories.inventory"),
      new fox("key.hotbar.7", 55, "key.categories.inventory"),
      new fox("key.hotbar.8", 56, "key.categories.inventory"),
      new fox("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fox T = new fox("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fox U = new fox("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fox[] V = (fox[])ArrayUtils.addAll(
      new fox[]{
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
   protected foz W;
   private final File bU;
   public boolean X;
   private foh bV = foh.a;
   public String Y = "";
   public boolean Z;
   private final fpc<Integer> bW = new fpc<>("options.fov", fpc.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wy.c("options.fov.min"));
         case 110 -> a($$0x, wy.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fpc.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> foz.Q().f.p());
   private static final wy bX = wy.a("options.telemetry.button.tooltip", wy.c("options.telemetry.state.minimal"), wy.c("options.telemetry.state.all"));
   private final fpc<Boolean> bY = fpc.a("options.telemetry.button", fpc.a(bX), ($$0x, $$1x) -> {
      foz $$2x = foz.Q();
      if (!$$2x.E()) {
         return wy.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wy.c("options.telemetry.state.all") : wy.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wy bZ = wy.c("options.screenEffectScale.tooltip");
   private final fpc<Double> ca = new fpc<>("options.screenEffectScale", fpc.a(bZ), fpd::b, fpc.m.a, 1.0, $$0x -> {
   });
   private static final wy cb = wy.c("options.fovEffectScale.tooltip");
   private final fpc<Double> cc = new fpc<>(
      "options.fovEffectScale", fpc.a(cb), fpd::b, fpc.m.a.a(azm::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final wy cd = wy.c("options.darknessEffectScale.tooltip");
   private final fpc<Double> ce = new fpc<>("options.darknessEffectScale", fpc.a(cd), fpd::b, fpc.m.a.a(azm::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final wy cf = wy.c("options.glintSpeed.tooltip");
   private final fpc<Double> cg = new fpc<>("options.glintSpeed", fpc.a(cf), fpd::b, fpc.m.a, 0.5, $$0x -> {
   });
   private static final wy ch = wy.c("options.glintStrength.tooltip");
   private final fpc<Double> ci = new fpc<>("options.glintStrength", fpc.a(ch), fpd::b, fpc.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final wy cj = wy.c("options.damageTiltStrength.tooltip");
   private final fpc<Double> ck = new fpc<>("options.damageTiltStrength", fpc.a(cj), fpd::b, fpc.m.a, 1.0, $$0x -> {
   });
   private final fpc<Double> cl = new fpc<>("options.gamma", fpc.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wy.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wy.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wy.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fpc.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cm = 2147483646;
   private final fpc<Integer> cn = new fpc<>(
      "options.guiScale", fpc.a(), ($$0x, $$1x) -> $$1x == 0 ? wy.c("options.guiScale.auto") : wy.b(Integer.toString($$1x)), new fpc.c(0, () -> {
         foz $$0x = foz.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fpc<ari> co = new fpc<>(
      "options.particles", fpc.a(), fpc.b(), new fpc.e<>(Arrays.asList(ari.values()), Codec.INT.xmap(ari::a, ari::b)), ari.a, $$0x -> {
      }
   );
   private final fpc<fpb> cp = new fpc<>(
      "options.narrator",
      fpc.a(),
      ($$0x, $$1x) -> (wy)(this.W.aY().a() ? $$1x.b() : wy.c("options.narrator.notavailable")),
      new fpc.e<>(Arrays.asList(fpb.values()), Codec.INT.xmap(fpb::a, fpb::a)),
      fpb.a,
      $$0x -> this.W.aY().a($$0x)
   );
   public String ab = "en_us";
   private final fpc<String> cq = new fpc<>(
      "options.audioDevice",
      fpc.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wy.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wy.b($$1x.substring(hnx.c)) : wy.b($$1x);
         }
      },
      new fpc.h<>(
         () -> Stream.concat(Stream.of(""), foz.Q().ak().a().stream()).toList(),
         $$0x -> foz.Q().r() && $$0x != "" && !foz.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hoa $$1x = foz.Q().ak();
         $$1x.k();
         $$1x.a(hmp.a(awn.Bv, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;
   public boolean ae = true;

   public fpc<Boolean> a() {
      return this.ak;
   }

   public fpc<Boolean> b() {
      return this.am;
   }

   public fpc<Boolean> c() {
      return this.ao;
   }

   public fpc<Double> d() {
      return this.ap;
   }

   public fpc<Integer> e() {
      return this.aq;
   }

   public fpc<Integer> f() {
      return this.ar;
   }

   public fpc<Double> g() {
      return this.at;
   }

   public fpc<Integer> h() {
      return this.au;
   }

   public fpc<fov> i() {
      return this.ax;
   }

   public fpc<fok> j() {
      return this.ay;
   }

   public fpc<foq> k() {
      return this.aC;
   }

   public fpc<Boolean> l() {
      return this.aD;
   }

   public fpc<fpf> m() {
      return this.aH;
   }

   public void a(aun $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (auk $$2 : $$0.g()) {
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

   public fpc<cqz> n() {
      return this.aI;
   }

   public fpc<Double> o() {
      return this.aJ;
   }

   public fpc<Double> p() {
      return this.aK;
   }

   public fpc<Integer> q() {
      return this.aN;
   }

   public int r() {
      return this.q().c();
   }

   public fpc<Double> s() {
      return this.aO;
   }

   public fpc<Double> t() {
      return this.aP;
   }

   public fpc<Boolean> u() {
      return this.aR;
   }

   public fpc<Boolean> v() {
      return this.aT;
   }

   public fpc<Boolean> w() {
      return this.aU;
   }

   public fpc<bwx> x() {
      return this.aW;
   }

   public fpc<Double> y() {
      return this.aX;
   }

   public fpc<Double> z() {
      return this.aY;
   }

   public fpc<Double> A() {
      return this.aZ;
   }

   public fpc<Double> B() {
      return this.ba;
   }

   public fpc<Double> C() {
      return this.bb;
   }

   public fpc<Double> D() {
      return this.bd;
   }

   public fpc<Integer> E() {
      return this.be;
   }

   public fpc<fof> F() {
      return this.bf;
   }

   public fpc<Integer> G() {
      return this.bg;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return azm.a(Math.log10($$0) * 100.0);
   }

   public fpc<Double> H() {
      return this.bh;
   }

   public fpc<Boolean> I() {
      return this.bi;
   }

   public fpc<Boolean> J() {
      return this.bj;
   }

   public fpc<Boolean> K() {
      return this.bl;
   }

   public fpc<Boolean> L() {
      return this.bm;
   }

   public fpc<Boolean> M() {
      return this.bn;
   }

   public fpc<Boolean> N() {
      return this.bo;
   }

   public fpc<Boolean> O() {
      return this.bp;
   }

   public fpc<Boolean> P() {
      return this.bq;
   }

   public fpc<Boolean> Q() {
      return this.br;
   }

   public fpc<Boolean> R() {
      return this.bs;
   }

   private static void aI() {
      foz $$0 = foz.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fpc<Boolean> S() {
      return this.bt;
   }

   private static boolean aJ() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fpc<Boolean> T() {
      return this.bu;
   }

   public fpc<Boolean> U() {
      return this.bv;
   }

   public fpc<Boolean> V() {
      return this.bw;
   }

   public fpc<Boolean> W() {
      return this.by;
   }

   public fpc<Boolean> X() {
      return this.bA;
   }

   public fpc<Boolean> Y() {
      return this.bB;
   }

   public final float a(awo $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fpc<Double> b(awo $$0) {
      return Objects.requireNonNull(this.bC.get($$0));
   }

   private fpc<Double> a(String $$0, awo $$1) {
      return new fpc<>($$0, fpc.a(), fpd::b, fpc.m.a, 1.0, $$1x -> foz.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fpc<Boolean> Z() {
      return this.bD;
   }

   public fpc<Boolean> aa() {
      return this.bG;
   }

   public fpc<Boolean> ab() {
      return this.bH;
   }

   public fpc<Boolean> ac() {
      return this.bI;
   }

   public fpc<Boolean> ad() {
      return this.bJ;
   }

   public fpc<Boolean> ae() {
      return this.bK;
   }

   public fpc<Boolean> af() {
      return this.bN;
   }

   public fpc<Boolean> ag() {
      return this.bO;
   }

   public fpc<Boolean> ah() {
      return this.bQ;
   }

   public fpc<Boolean> ai() {
      return this.bR;
   }

   public fpc<Boolean> aj() {
      return this.bT;
   }

   public fpc<Integer> ak() {
      return this.bW;
   }

   public fpc<Boolean> al() {
      return this.bY;
   }

   public fpc<Double> am() {
      return this.ca;
   }

   public fpc<Double> an() {
      return this.cc;
   }

   public fpc<Double> ao() {
      return this.ce;
   }

   public fpc<Double> ap() {
      return this.cg;
   }

   public fpc<Double> aq() {
      return this.ci;
   }

   public fpc<Double> ar() {
      return this.ck;
   }

   public fpc<Double> as() {
      return this.cl;
   }

   public fpc<Integer> at() {
      return this.cn;
   }

   public fpc<ari> au() {
      return this.co;
   }

   public fpc<fpb> av() {
      return this.cp;
   }

   public fpc<String> aw() {
      return this.cq;
   }

   public void ax() {
      this.ac = false;
      this.az();
   }

   public fpd(foz $$0, File $$1) {
      this.W = $$0;
      this.bU = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new fpc<>(
         "options.renderDistance",
         fpc.a(),
         ($$0x, $$1x) -> a($$0x, wy.a("options.chunks", $$1x)),
         new fpc.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> foz.Q().f.p()
      );
      this.ar = new fpc<>(
         "options.simulationDistance", fpc.a(), ($$0x, $$1x) -> a($$0x, wy.a("options.chunks", $$1x)), new fpc.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = af.n() == af.a.c;
      this.ay();
   }

   public float a(float $$0) {
      return this.bH.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return axw.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bH.c() ? $$0 : axw.a(this.aO.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(fpd.b $$0) {
      $$0.a("ao", this.aD);
      $$0.a("biomeBlendRadius", this.bg);
      $$0.a("enableVsync", this.br);
      $$0.a("entityDistanceScaling", this.at);
      $$0.a("entityShadows", this.bs);
      $$0.a("forceUnicodeFont", this.bt);
      $$0.a("japaneseGlyphVariants", this.bu);
      $$0.a("fov", this.bW);
      $$0.a("fovEffectScale", this.cc);
      $$0.a("darknessEffectScale", this.ce);
      $$0.a("glintSpeed", this.cg);
      $$0.a("glintStrength", this.ci);
      $$0.a("prioritizeChunkUpdates", this.aH);
      $$0.a("fullscreen", this.bJ);
      $$0.a("gamma", this.cl);
      $$0.a("graphicsMode", this.aC);
      $$0.a("guiScale", this.cn);
      $$0.a("maxFps", this.au);
      $$0.a("inactivityFpsLimit", this.ax);
      $$0.a("mipmapLevels", this.be);
      $$0.a("narrator", this.cp);
      $$0.a("particles", this.co);
      $$0.a("reducedDebugInfo", this.bB);
      $$0.a("renderClouds", this.ay);
      $$0.a("renderDistance", this.aq);
      $$0.a("simulationDistance", this.ar);
      $$0.a("screenEffectScale", this.ca);
      $$0.a("soundDevice", this.cq);
   }

   private void a(fpd.a $$0) {
      this.a((fpd.b)$$0);
      $$0.a("autoJump", this.bj);
      $$0.a("rotateWithMinecart", this.bl);
      $$0.a("operatorItemsTab", this.bm);
      $$0.a("autoSuggestions", this.bn);
      $$0.a("chatColors", this.bo);
      $$0.a("chatLinks", this.bp);
      $$0.a("chatLinksPrompt", this.bq);
      $$0.a("discrete_mouse_scroll", this.bw);
      $$0.a("invertYMouse", this.bv);
      $$0.a("realmsNotifications", this.by);
      $$0.a("showSubtitles", this.bD);
      $$0.a("directionalAudio", this.bG);
      $$0.a("touchscreen", this.bI);
      $$0.a("bobView", this.bK);
      $$0.a("toggleCrouch", this.bN);
      $$0.a("toggleSprint", this.bO);
      $$0.a("darkMojangStudiosBackground", this.ak);
      $$0.a("hideLightningFlashes", this.am);
      $$0.a("hideSplashTexts", this.ao);
      $$0.a("mouseSensitivity", this.ap);
      $$0.a("damageTiltStrength", this.ck);
      $$0.a("highContrast", this.aR);
      $$0.a("highContrastBlockOutline", this.aT);
      $$0.a("narratorHotkey", this.aU);
      this.i = $$0.a("resourcePacks", this.i, fpd::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fpd::c, ag::toJson);
      this.Y = $$0.a("lastServer", this.Y);
      this.ab = $$0.a("lang", this.ab);
      $$0.a("chatVisibility", this.aI);
      $$0.a("chatOpacity", this.aJ);
      $$0.a("chatLineSpacing", this.aK);
      $$0.a("textBackgroundOpacity", this.aO);
      $$0.a("backgroundForChatOnly", this.bH);
      this.l = $$0.a("hideServerAddress", this.l);
      this.m = $$0.a("advancedItemTooltips", this.m);
      this.n = $$0.a("pauseOnLostFocus", this.n);
      this.o = $$0.a("overrideWidth", this.o);
      this.p = $$0.a("overrideHeight", this.p);
      $$0.a("chatHeightFocused", this.ba);
      $$0.a("chatDelay", this.bb);
      $$0.a("chatHeightUnfocused", this.aZ);
      $$0.a("chatScale", this.aX);
      $$0.a("chatWidth", this.aY);
      $$0.a("notificationDisplayTime", this.bd);
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aW);
      $$0.a("attackIndicator", this.bf);
      this.r = $$0.a("tutorialStep", this.r, hpe::a, hpe::a);
      $$0.a("mouseWheelSensitivity", this.bh);
      $$0.a("rawMouseInput", this.bi);
      this.t = $$0.a("glDebugVerbosity", this.t);
      this.u = $$0.a("skipMultiplayerWarning", this.u);
      $$0.a("hideMatchedNames", this.bQ);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.ad = $$0.a("syncChunkWrites", this.ad);
      $$0.a("showAutosaveIndicator", this.bR);
      $$0.a("allowServerListing", this.bA);
      $$0.a("onlyShowSecureChat", this.bT);
      $$0.a("panoramaScrollSpeed", this.aP);
      $$0.a("telemetryOptInExtra", this.bY);
      this.ac = $$0.a("onboardAccessibility", this.ac);
      $$0.a("menuBackgroundBlurriness", this.aN);
      this.ae = $$0.a("startedCleanly", this.ae);

      for (fox $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fif.a($$3));
         }
      }

      for (awo $$4 : awo.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bC.get($$4));
      }

      for (cre $$5 : cre.values()) {
         boolean $$6 = this.aV.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.a($$5, $$7);
         }
      }
   }

   public void ay() {
      try {
         if (!this.bU.exists()) {
            return;
         }

         tz $$0 = new tz();

         try (BufferedReader $$1 = Files.newReader(this.bU, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = ai.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  af.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final tz $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aC.a(foq.b);
            } else {
               this.aC.a(foq.a);
            }
         }

         this.a(new fpd.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).p_() : null;
            }

            @Override
            public <T> void a(String $$0, fpc<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fpd.af.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fpd.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fpd.a($$2) : $$1;
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
               } else if (fpd.a($$2)) {
                  return 1.0F;
               } else if (fpd.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fpd.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fox.d();
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

   private tz a(tz $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return bbb.e.a(this.W.au(), $$0, $$1);
   }

   public void az() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bU), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fpd.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fpc<T> $$1) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1x -> fpd.af.error("Error saving option " + $$1 + ": " + $$1x)).ifSuccess($$2x -> {
                  this.a($$0);
                  $$0.println(fpd.ag.toJson($$2x));
               });
            }

            @Override
            public int a(String $$0, int $$1) {
               this.a($$0);
               $$0.println($$1);
               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               this.a($$0);
               $$0.println($$1);
               return $$1;
            }

            @Override
            public String a(String $$0, String $$1) {
               this.a($$0);
               $$0.println($$1);
               return $$1;
            }

            @Override
            public float a(String $$0, float $$1) {
               this.a($$0);
               $$0.println($$1);
               return $$1;
            }

            @Override
            public <T> T a(String $$0, T $$1, Function<String, T> $$2x, Function<T, String> $$3) {
               this.a($$0);
               $$0.println($$3.apply($$1));
               return $$1;
            }
         });
         String $$1 = this.aK();
         if ($$1 != null) {
            $$0.println("fullscreenResolution:" + $$1);
         }
      } catch (Exception var6) {
         af.error("Failed to save options", var6);
      }

      this.aB();
   }

   @Nullable
   private String aK() {
      fin $$0 = this.W.aO();
      if ($$0 == null) {
         return this.k;
      } else {
         return $$0.e().isPresent() ? $$0.e().get().g() : null;
      }
   }

   public ara aA() {
      int $$0 = 0;

      for (cre $$1 : this.aV) {
         $$0 |= $$1.a();
      }

      return new ara(this.ab, this.aq.c(), this.aI.c(), this.bo.c(), $$0, this.aW.c(), this.W.aT(), this.bA.c(), this.co.c());
   }

   public void aB() {
      if (this.W.t != null) {
         this.W.t.j.a(this.aA());
      }
   }

   public void a(cre $$0, boolean $$1) {
      if ($$1) {
         this.aV.add($$0);
      } else {
         this.aV.remove($$0);
      }
   }

   public boolean a(cre $$0) {
      return this.aV.contains($$0);
   }

   public fok aC() {
      return this.aH() >= 4 ? this.ay.c() : fok.a;
   }

   public boolean aD() {
      return this.q;
   }

   public void b(aun $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         auk $$4 = $$0.c($$3);
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

   public foh aE() {
      return this.bV;
   }

   public void a(foh $$0) {
      this.bV = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = azc.a(ag, $$0, ah);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aF() {
      return this.bU;
   }

   public String aG() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fpd.b() {
         @Override
         public <T> void a(String $$0x, fpc<T> $$1) {
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
      this.as = $$0;
   }

   public int aH() {
      return this.as > 0 ? Math.min(this.aq.c(), this.as) : this.aq.c();
   }

   private static wy c(wy $$0, int $$1) {
      return wy.a("options.pixel_value", $$0, $$1);
   }

   private static wy a(wy $$0, double $$1) {
      return wy.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static wy a(wy $$0, wy $$1) {
      return wy.a("options.generic_value", $$0, $$1);
   }

   public static wy a(wy $$0, int $$1) {
      return a($$0, wy.b(Integer.toString($$1)));
   }

   public static wy b(wy $$0, int $$1) {
      return $$1 == 0 ? a($$0, wx.c) : a($$0, $$1);
   }

   private static wy b(wy $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, wx.c) : a($$0, $$1);
   }

   interface a extends fpd.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fpc<T> var2);
   }
}
