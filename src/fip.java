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

public class fip {
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
   private static final xd ai = xd.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fio<Boolean> aj = fio.a("options.darkMojangStudiosBackgroundColor", fio.a(ai), false);
   private static final xd ak = xd.c("options.hideLightningFlashes.tooltip");
   private final fio<Boolean> al = fio.a("options.hideLightningFlashes", fio.a(ak), false);
   private static final xd am = xd.c("options.hideSplashTexts.tooltip");
   private final fio<Boolean> an = fio.a("options.hideSplashTexts", fio.a(am), false);
   private final fio<Double> ao = new fio<>("options.sensitivity", fio.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xd.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xd.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fio.m.a, 0.5, $$0x -> {
   });
   private final fio<Integer> ap;
   private final fio<Integer> aq;
   private int ar = 0;
   private final fio<Double> as = new fio<>(
      "options.entityDistanceScaling",
      fio.a(),
      fip::a,
      new fio.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fio<Integer> at = new fio<>(
      "options.framerateLimit",
      fio.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xd.c("options.framerateLimit.max")) : a($$0x, xd.a("options.framerate", $$1x)),
      new fio.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fil.Q().aQ().a($$0x)
   );
   private static final xd au = xd.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final xd av = xd.c("options.inactivityFpsLimit.afk.tooltip");
   private final fio<fih> aw = new fio<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> flv.a(au);
         case b -> flv.a(av);
      };
   }, fio.b(), new fio.e<>(Arrays.asList(fih.values()), fih.c), fih.b, $$0x -> {
   });
   private final fio<fhx> ax = new fio<>(
      "options.renderClouds",
      fio.a(),
      fio.b(),
      new fio.e<>(Arrays.asList(fhx.values()), Codec.withAlternative(fhx.d, Codec.BOOL, $$0x -> $$0x ? fhx.c : fhx.a)),
      fhx.c,
      $$0x -> {
      }
   );
   private static final xd ay = xd.c("options.graphics.fast.tooltip");
   private static final xd az = xd.a("options.graphics.fabulous.tooltip", xd.c("options.graphics.fabulous").a(n.u));
   private static final xd aA = xd.c("options.graphics.fancy.tooltip");
   private final fio<fid> aB = new fio<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> flv.a(aA);
            case a -> flv.a(ay);
            case c -> flv.a(az);
         };
      },
      ($$0x, $$1x) -> {
         xr $$2x = xd.c($$1x.a());
         return $$1x == fid.c ? $$2x.a(n.u) : $$2x;
      },
      new fio.a<>(
         Arrays.asList(fid.values()),
         Stream.of(fid.values()).filter($$0x -> $$0x != fid.c).collect(Collectors.toList()),
         () -> fil.Q().r() && fil.Q().aj().h(),
         ($$0x, $$1x) -> {
            fil $$2x = fil.Q();
            ggx $$3 = $$2x.aj();
            if ($$1x == fid.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.e();
            }
         },
         Codec.INT.xmap(fid::a, fid::b)
      ),
      fid.b,
      $$0x -> {
      }
   );
   private final fio<Boolean> aC = fio.a("options.ao", true, $$0x -> fil.Q().f.e());
   private static final xd aD = xd.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xd aE = xd.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xd aF = xd.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fio<fir> aG = new fio<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> flv.a(aD);
         case b -> flv.a(aE);
         case c -> flv.a(aF);
      };
   }, fio.b(), new fio.e<>(Arrays.asList(fir.values()), Codec.INT.xmap(fir::a, fir::b)), fir.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fio<cns> aH = new fio<>(
      "options.chat.visibility", fio.a(), fio.b(), new fio.e<>(Arrays.asList(cns.values()), Codec.INT.xmap(cns::a, cns::b)), cns.a, $$0x -> {
      }
   );
   private final fio<Double> aI = new fio<>("options.chat.opacity", fio.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fio.m.a, 1.0, $$0x -> fil.Q().m.d().b());
   private final fio<Double> aJ = new fio<>("options.chat.line_spacing", fio.a(), fip::a, fio.m.a, 0.0, $$0x -> {
   });
   private static final xd aK = xd.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aL = 5;
   private final fio<Integer> aM = new fio<>("options.accessibility.menu_background_blurriness", fio.a(aK), fip::b, new fio.f(0, 10), 5, $$0x -> {
   });
   private final fio<Double> aN = new fio<>("options.accessibility.text_background_opacity", fio.a(), fip::a, fio.m.a, 0.5, $$0x -> fil.Q().m.d().b());
   private final fio<Double> aO = new fio<>("options.accessibility.panorama_speed", fio.a(), fip::a, fio.m.a, 1.0, $$0x -> {
   });
   private static final xd aP = xd.c("options.accessibility.high_contrast.tooltip");
   private final fio<Boolean> aQ = fio.a("options.accessibility.high_contrast", fio.a(aP), false, $$0x -> {
      aue $$1x = fil.Q().ad();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final fio<Boolean> aR = fio.a(
      "options.accessibility.narrator_hotkey",
      fio.a(fil.a ? xd.c("options.accessibility.narrator_hotkey.mac.tooltip") : xd.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cnv> aS = EnumSet.allOf(cnv.class);
   private final fio<bue> aT = new fio<>("options.mainHand", fio.a(), fio.b(), new fio.e<>(Arrays.asList(bue.values()), bue.c), bue.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fio<Double> aU = new fio<>(
      "options.chat.scale",
      fio.a(),
      ($$0x, $$1x) -> (xd)($$1x == 0.0 ? xc.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fio.m.a,
      1.0,
      $$0x -> fil.Q().m.d().b()
   );
   private final fio<Double> aV = new fio<>("options.chat.width", fio.a(), ($$0x, $$1x) -> c($$0x, fkl.a($$1x)), fio.m.a, 1.0, $$0x -> fil.Q().m.d().b());
   private final fio<Double> aW = new fio<>(
      "options.chat.height.unfocused", fio.a(), ($$0x, $$1x) -> c($$0x, fkl.b($$1x)), fio.m.a, fkl.i(), $$0x -> fil.Q().m.d().b()
   );
   private final fio<Double> aX = new fio<>(
      "options.chat.height.focused", fio.a(), ($$0x, $$1x) -> c($$0x, fkl.b($$1x)), fio.m.a, 1.0, $$0x -> fil.Q().m.d().b()
   );
   private final fio<Double> aY = new fio<>(
      "options.chat.delay_instant",
      fio.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xd.c("options.chat.delay_none") : xd.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fio.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fil.Q().ba().a($$0x)
   );
   private static final xd aZ = xd.c("options.notifications.display_time.tooltip");
   private final fio<Double> ba = new fio<>(
      "options.notifications.display_time",
      fio.a(aZ),
      ($$0x, $$1x) -> a($$0x, xd.a("options.multiplier", $$1x)),
      new fio.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fio<Integer> bb = new fio<>(
      "options.mipmapLevels", fio.a(), ($$0x, $$1x) -> (xd)($$1x == 0 ? xc.a($$0x, false) : a($$0x, $$1x.intValue())), new fio.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fio<fht> bc = new fio<>(
      "options.attackIndicator", fio.a(), fio.b(), new fio.e<>(Arrays.asList(fht.values()), Codec.INT.xmap(fht::a, fht::b)), fht.b, $$0x -> {
      }
   );
   public hde r = hde.a;
   public boolean s = false;
   private final fio<Integer> bd = new fio<>("options.biomeBlendRadius", fio.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xd.c("options.biomeBlendRadius." + $$2x));
   }, new fio.f(0, 7, false), 2, $$0x -> fil.Q().f.e());
   private final fio<Double> be = new fio<>(
      "options.mouseWheelSensitivity",
      fio.a(),
      ($$0x, $$1x) -> a($$0x, xd.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fio.f(-200, 100).a(fip::c, fip::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fio<Boolean> bf = fio.a("options.rawMouseInput", true, $$0x -> {
      fch $$1x = fil.Q().aP();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fio<Boolean> bg = fio.a("options.autoJump", false);
   private static final xd bh = xd.c("options.rotateWithMinecart.tooltip");
   private final fio<Boolean> bi = fio.a("options.rotateWithMinecart", fio.a(bh), false);
   private final fio<Boolean> bj = fio.a("options.operatorItemsTab", false);
   private final fio<Boolean> bk = fio.a("options.autoSuggestCommands", true);
   private final fio<Boolean> bl = fio.a("options.chat.color", true);
   private final fio<Boolean> bm = fio.a("options.chat.links", true);
   private final fio<Boolean> bn = fio.a("options.chat.links.prompt", true);
   private final fio<Boolean> bo = fio.a("options.vsync", true, $$0x -> {
      if (fil.Q().aP() != null) {
         fil.Q().aP().a($$0x);
      }
   });
   private final fio<Boolean> bp = fio.a("options.entityShadows", true);
   private final fio<Boolean> bq = fio.a("options.forceUnicodeFont", false, $$0x -> aH());
   private final fio<Boolean> br = fio.a("options.japaneseGlyphVariants", fio.a(xd.c("options.japaneseGlyphVariants.tooltip")), aI(), $$0x -> aH());
   private final fio<Boolean> bs = fio.a("options.invertMouse", false);
   private final fio<Boolean> bt = fio.a("options.discrete_mouse_scroll", false);
   private static final xd bu = xd.c("options.realmsNotifications.tooltip");
   private final fio<Boolean> bv = fio.a("options.realmsNotifications", fio.a(bu), true);
   private static final xd bw = xd.c("options.allowServerListing.tooltip");
   private final fio<Boolean> bx = fio.a("options.allowServerListing", fio.a(bw), true, $$0x -> {
   });
   private final fio<Boolean> by = fio.a("options.reducedDebugInfo", false);
   private final Map<awf, fio<Double>> bz = ad.a(new EnumMap<>(awf.class), $$0x -> {
      for (awf $$1x : awf.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fio<Boolean> bA = fio.a("options.showSubtitles", false);
   private static final xd bB = xd.c("options.directionalAudio.on.tooltip");
   private static final xd bC = xd.c("options.directionalAudio.off.tooltip");
   private final fio<Boolean> bD = fio.a("options.directionalAudio", $$0x -> $$0x ? flv.a(bB) : flv.a(bC), false, $$0x -> {
      hca $$1x = fil.Q().ak();
      $$1x.k();
      $$1x.a(haq.a(awe.Ax, 1.0F));
   });
   private final fio<Boolean> bE = new fio<>(
      "options.accessibility.text_background",
      fio.a(),
      ($$0x, $$1x) -> $$1x ? xd.c("options.accessibility.text_background.chat") : xd.c("options.accessibility.text_background.everywhere"),
      fio.a,
      true,
      $$0x -> {
      }
   );
   private final fio<Boolean> bF = fio.a("options.touchscreen", false);
   private final fio<Boolean> bG = fio.a("options.fullscreen", false, $$0x -> {
      fil $$1x = fil.Q();
      if ($$1x.aP() != null && $$1x.aP().j() != $$0x) {
         $$1x.aP().h();
         this.ac().a($$1x.aP().j());
      }
   });
   private final fio<Boolean> bH = fio.a("options.viewBobbing", true);
   private static final xd bI = xd.c("options.key.toggle");
   private static final xd bJ = xd.c("options.key.hold");
   private final fio<Boolean> bK = new fio<>("key.sneak", fio.a(), ($$0x, $$1x) -> $$1x ? bI : bJ, fio.a, false, $$0x -> {
   });
   private final fio<Boolean> bL = new fio<>("key.sprint", fio.a(), ($$0x, $$1x) -> $$1x ? bI : bJ, fio.a, false, $$0x -> {
   });
   public boolean u;
   private static final xd bM = xd.c("options.hideMatchedNames.tooltip");
   private final fio<Boolean> bN = fio.a("options.hideMatchedNames", fio.a(bM), true);
   private final fio<Boolean> bO = fio.a("options.autosaveIndicator", true);
   private static final xd bP = xd.c("options.onlyShowSecureChat.tooltip");
   private final fio<Boolean> bQ = fio.a("options.onlyShowSecureChat", fio.a(bP), false);
   public final fij v = new fij("key.forward", 87, "key.categories.movement");
   public final fij w = new fij("key.left", 65, "key.categories.movement");
   public final fij x = new fij("key.back", 83, "key.categories.movement");
   public final fij y = new fij("key.right", 68, "key.categories.movement");
   public final fij z = new fij("key.jump", 32, "key.categories.movement");
   public final fij A = new fix("key.sneak", 340, "key.categories.movement", this.bK::c);
   public final fij B = new fix("key.sprint", 341, "key.categories.movement", this.bL::c);
   public final fij C = new fij("key.inventory", 69, "key.categories.inventory");
   public final fij D = new fij("key.swapOffhand", 70, "key.categories.inventory");
   public final fij E = new fij("key.drop", 81, "key.categories.inventory");
   public final fij F = new fij("key.use", fbz.b.c, 1, "key.categories.gameplay");
   public final fij G = new fij("key.attack", fbz.b.c, 0, "key.categories.gameplay");
   public final fij H = new fij("key.pickItem", fbz.b.c, 2, "key.categories.gameplay");
   public final fij I = new fij("key.chat", 84, "key.categories.multiplayer");
   public final fij J = new fij("key.playerlist", 258, "key.categories.multiplayer");
   public final fij K = new fij("key.command", 47, "key.categories.multiplayer");
   public final fij L = new fij("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fij M = new fij("key.screenshot", 291, "key.categories.misc");
   public final fij N = new fij("key.togglePerspective", 294, "key.categories.misc");
   public final fij O = new fij("key.smoothCamera", fbz.bv.b(), "key.categories.misc");
   public final fij P = new fij("key.fullscreen", 300, "key.categories.misc");
   public final fij Q = new fij("key.spectatorOutlines", fbz.bv.b(), "key.categories.misc");
   public final fij R = new fij("key.advancements", 76, "key.categories.misc");
   public final fij[] S = new fij[]{
      new fij("key.hotbar.1", 49, "key.categories.inventory"),
      new fij("key.hotbar.2", 50, "key.categories.inventory"),
      new fij("key.hotbar.3", 51, "key.categories.inventory"),
      new fij("key.hotbar.4", 52, "key.categories.inventory"),
      new fij("key.hotbar.5", 53, "key.categories.inventory"),
      new fij("key.hotbar.6", 54, "key.categories.inventory"),
      new fij("key.hotbar.7", 55, "key.categories.inventory"),
      new fij("key.hotbar.8", 56, "key.categories.inventory"),
      new fij("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fij T = new fij("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fij U = new fij("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fij[] V = (fij[])ArrayUtils.addAll(
      new fij[]{
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
   protected fil W;
   private final File bR;
   public boolean X;
   private fhv bS = fhv.a;
   public String Y = "";
   public boolean Z;
   private final fio<Integer> bT = new fio<>("options.fov", fio.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xd.c("options.fov.min"));
         case 110 -> a($$0x, xd.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fio.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fil.Q().f.p());
   private static final xd bU = xd.a("options.telemetry.button.tooltip", xd.c("options.telemetry.state.minimal"), xd.c("options.telemetry.state.all"));
   private final fio<Boolean> bV = fio.a("options.telemetry.button", fio.a(bU), ($$0x, $$1x) -> {
      fil $$2x = fil.Q();
      if (!$$2x.E()) {
         return xd.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xd.c("options.telemetry.state.all") : xd.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xd bW = xd.c("options.screenEffectScale.tooltip");
   private final fio<Double> bX = new fio<>("options.screenEffectScale", fio.a(bW), fip::b, fio.m.a, 1.0, $$0x -> {
   });
   private static final xd bY = xd.c("options.fovEffectScale.tooltip");
   private final fio<Double> bZ = new fio<>(
      "options.fovEffectScale", fio.a(bY), fip::b, fio.m.a.a(azd::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final xd ca = xd.c("options.darknessEffectScale.tooltip");
   private final fio<Double> cb = new fio<>("options.darknessEffectScale", fio.a(ca), fip::b, fio.m.a.a(azd::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final xd cc = xd.c("options.glintSpeed.tooltip");
   private final fio<Double> cd = new fio<>("options.glintSpeed", fio.a(cc), fip::b, fio.m.a, 0.5, $$0x -> {
   });
   private static final xd ce = xd.c("options.glintStrength.tooltip");
   private final fio<Double> cf = new fio<>("options.glintStrength", fio.a(ce), fip::b, fio.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final xd cg = xd.c("options.damageTiltStrength.tooltip");
   private final fio<Double> ch = new fio<>("options.damageTiltStrength", fio.a(cg), fip::b, fio.m.a, 1.0, $$0x -> {
   });
   private final fio<Double> ci = new fio<>("options.gamma", fio.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xd.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xd.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xd.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fio.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cj = 2147483646;
   private final fio<Integer> ck = new fio<>(
      "options.guiScale", fio.a(), ($$0x, $$1x) -> $$1x == 0 ? xd.c("options.guiScale.auto") : xd.b(Integer.toString($$1x)), new fio.c(0, () -> {
         fil $$0x = fil.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aP().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fio<ara> cl = new fio<>(
      "options.particles", fio.a(), fio.b(), new fio.e<>(Arrays.asList(ara.values()), Codec.INT.xmap(ara::a, ara::b)), ara.a, $$0x -> {
      }
   );
   private final fio<fin> cm = new fio<>(
      "options.narrator",
      fio.a(),
      ($$0x, $$1x) -> (xd)(this.W.aZ().a() ? $$1x.b() : xd.c("options.narrator.notavailable")),
      new fio.e<>(Arrays.asList(fin.values()), Codec.INT.xmap(fin::a, fin::a)),
      fin.a,
      $$0x -> this.W.aZ().a($$0x)
   );
   public String ab = "en_us";
   private final fio<String> cn = new fio<>(
      "options.audioDevice",
      fio.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xd.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xd.b($$1x.substring(hbx.c)) : xd.b($$1x);
         }
      },
      new fio.h<>(
         () -> Stream.concat(Stream.of(""), fil.Q().ak().a().stream()).toList(),
         $$0x -> fil.Q().r() && $$0x != "" && !fil.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hca $$1x = fil.Q().ak();
         $$1x.k();
         $$1x.a(haq.a(awe.Ax, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;

   public fio<Boolean> a() {
      return this.aj;
   }

   public fio<Boolean> b() {
      return this.al;
   }

   public fio<Boolean> c() {
      return this.an;
   }

   public fio<Double> d() {
      return this.ao;
   }

   public fio<Integer> e() {
      return this.ap;
   }

   public fio<Integer> f() {
      return this.aq;
   }

   public fio<Double> g() {
      return this.as;
   }

   public fio<Integer> h() {
      return this.at;
   }

   public fio<fih> i() {
      return this.aw;
   }

   public fio<fhx> j() {
      return this.ax;
   }

   public fio<fid> k() {
      return this.aB;
   }

   public fio<Boolean> l() {
      return this.aC;
   }

   public fio<fir> m() {
      return this.aG;
   }

   public void a(aue $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (aub $$2 : $$0.f()) {
         if (!$$2.j()) {
            this.i.add($$2.g());
            if (!$$2.d().a()) {
               this.j.add($$2.g());
            }
         }
      }

      this.ay();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.W.l();
      }
   }

   public fio<cns> n() {
      return this.aH;
   }

   public fio<Double> o() {
      return this.aI;
   }

   public fio<Double> p() {
      return this.aJ;
   }

   public fio<Integer> q() {
      return this.aM;
   }

   public int r() {
      return this.q().c();
   }

   public fio<Double> s() {
      return this.aN;
   }

   public fio<Double> t() {
      return this.aO;
   }

   public fio<Boolean> u() {
      return this.aQ;
   }

   public fio<Boolean> v() {
      return this.aR;
   }

   public fio<bue> w() {
      return this.aT;
   }

   public fio<Double> x() {
      return this.aU;
   }

   public fio<Double> y() {
      return this.aV;
   }

   public fio<Double> z() {
      return this.aW;
   }

   public fio<Double> A() {
      return this.aX;
   }

   public fio<Double> B() {
      return this.aY;
   }

   public fio<Double> C() {
      return this.ba;
   }

   public fio<Integer> D() {
      return this.bb;
   }

   public fio<fht> E() {
      return this.bc;
   }

   public fio<Integer> F() {
      return this.bd;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return azd.a(Math.log10($$0) * 100.0);
   }

   public fio<Double> G() {
      return this.be;
   }

   public fio<Boolean> H() {
      return this.bf;
   }

   public fio<Boolean> I() {
      return this.bg;
   }

   public fio<Boolean> J() {
      return this.bi;
   }

   public fio<Boolean> K() {
      return this.bj;
   }

   public fio<Boolean> L() {
      return this.bk;
   }

   public fio<Boolean> M() {
      return this.bl;
   }

   public fio<Boolean> N() {
      return this.bm;
   }

   public fio<Boolean> O() {
      return this.bn;
   }

   public fio<Boolean> P() {
      return this.bo;
   }

   public fio<Boolean> Q() {
      return this.bp;
   }

   private static void aH() {
      fil $$0 = fil.Q();
      if ($$0.aP() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fio<Boolean> R() {
      return this.bq;
   }

   private static boolean aI() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fio<Boolean> S() {
      return this.br;
   }

   public fio<Boolean> T() {
      return this.bs;
   }

   public fio<Boolean> U() {
      return this.bt;
   }

   public fio<Boolean> V() {
      return this.bv;
   }

   public fio<Boolean> W() {
      return this.bx;
   }

   public fio<Boolean> X() {
      return this.by;
   }

   public final float a(awf $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fio<Double> b(awf $$0) {
      return Objects.requireNonNull(this.bz.get($$0));
   }

   private fio<Double> a(String $$0, awf $$1) {
      return new fio<>($$0, fio.a(), fip::b, fio.m.a, 1.0, $$1x -> fil.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fio<Boolean> Y() {
      return this.bA;
   }

   public fio<Boolean> Z() {
      return this.bD;
   }

   public fio<Boolean> aa() {
      return this.bE;
   }

   public fio<Boolean> ab() {
      return this.bF;
   }

   public fio<Boolean> ac() {
      return this.bG;
   }

   public fio<Boolean> ad() {
      return this.bH;
   }

   public fio<Boolean> ae() {
      return this.bK;
   }

   public fio<Boolean> af() {
      return this.bL;
   }

   public fio<Boolean> ag() {
      return this.bN;
   }

   public fio<Boolean> ah() {
      return this.bO;
   }

   public fio<Boolean> ai() {
      return this.bQ;
   }

   public fio<Integer> aj() {
      return this.bT;
   }

   public fio<Boolean> ak() {
      return this.bV;
   }

   public fio<Double> al() {
      return this.bX;
   }

   public fio<Double> am() {
      return this.bZ;
   }

   public fio<Double> an() {
      return this.cb;
   }

   public fio<Double> ao() {
      return this.cd;
   }

   public fio<Double> ap() {
      return this.cf;
   }

   public fio<Double> aq() {
      return this.ch;
   }

   public fio<Double> ar() {
      return this.ci;
   }

   public fio<Integer> as() {
      return this.ck;
   }

   public fio<ara> at() {
      return this.cl;
   }

   public fio<fin> au() {
      return this.cm;
   }

   public fio<String> av() {
      return this.cn;
   }

   public void aw() {
      this.ac = false;
      this.ay();
   }

   public fip(fil $$0, File $$1) {
      this.W = $$0;
      this.bR = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ap = new fio<>(
         "options.renderDistance",
         fio.a(),
         ($$0x, $$1x) -> a($$0x, xd.a("options.chunks", $$1x)),
         new fio.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fil.Q().f.p()
      );
      this.aq = new fio<>(
         "options.simulationDistance", fio.a(), ($$0x, $$1x) -> a($$0x, xd.a("options.chunks", $$1x)), new fio.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = ad.m() == ad.a.c;
      this.ax();
   }

   public float a(float $$0) {
      return this.bE.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return axo.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bE.c() ? $$0 : axo.a(this.aN.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(fip.b $$0) {
      $$0.a("ao", this.aC);
      $$0.a("biomeBlendRadius", this.bd);
      $$0.a("enableVsync", this.bo);
      $$0.a("entityDistanceScaling", this.as);
      $$0.a("entityShadows", this.bp);
      $$0.a("forceUnicodeFont", this.bq);
      $$0.a("japaneseGlyphVariants", this.br);
      $$0.a("fov", this.bT);
      $$0.a("fovEffectScale", this.bZ);
      $$0.a("darknessEffectScale", this.cb);
      $$0.a("glintSpeed", this.cd);
      $$0.a("glintStrength", this.cf);
      $$0.a("prioritizeChunkUpdates", this.aG);
      $$0.a("fullscreen", this.bG);
      $$0.a("gamma", this.ci);
      $$0.a("graphicsMode", this.aB);
      $$0.a("guiScale", this.ck);
      $$0.a("maxFps", this.at);
      $$0.a("inactivityFpsLimit", this.aw);
      $$0.a("mipmapLevels", this.bb);
      $$0.a("narrator", this.cm);
      $$0.a("particles", this.cl);
      $$0.a("reducedDebugInfo", this.by);
      $$0.a("renderClouds", this.ax);
      $$0.a("renderDistance", this.ap);
      $$0.a("simulationDistance", this.aq);
      $$0.a("screenEffectScale", this.bX);
      $$0.a("soundDevice", this.cn);
   }

   private void a(fip.a $$0) {
      this.a((fip.b)$$0);
      $$0.a("autoJump", this.bg);
      $$0.a("rotateWithMinecart", this.bi);
      $$0.a("operatorItemsTab", this.bj);
      $$0.a("autoSuggestions", this.bk);
      $$0.a("chatColors", this.bl);
      $$0.a("chatLinks", this.bm);
      $$0.a("chatLinksPrompt", this.bn);
      $$0.a("discrete_mouse_scroll", this.bt);
      $$0.a("invertYMouse", this.bs);
      $$0.a("realmsNotifications", this.bv);
      $$0.a("showSubtitles", this.bA);
      $$0.a("directionalAudio", this.bD);
      $$0.a("touchscreen", this.bF);
      $$0.a("bobView", this.bH);
      $$0.a("toggleCrouch", this.bK);
      $$0.a("toggleSprint", this.bL);
      $$0.a("darkMojangStudiosBackground", this.aj);
      $$0.a("hideLightningFlashes", this.al);
      $$0.a("hideSplashTexts", this.an);
      $$0.a("mouseSensitivity", this.ao);
      $$0.a("damageTiltStrength", this.ch);
      $$0.a("highContrast", this.aQ);
      $$0.a("narratorHotkey", this.aR);
      this.i = $$0.a("resourcePacks", this.i, fip::c, af::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fip::c, af::toJson);
      this.Y = $$0.a("lastServer", this.Y);
      this.ab = $$0.a("lang", this.ab);
      $$0.a("chatVisibility", this.aH);
      $$0.a("chatOpacity", this.aI);
      $$0.a("chatLineSpacing", this.aJ);
      $$0.a("textBackgroundOpacity", this.aN);
      $$0.a("backgroundForChatOnly", this.bE);
      this.l = $$0.a("hideServerAddress", this.l);
      this.m = $$0.a("advancedItemTooltips", this.m);
      this.n = $$0.a("pauseOnLostFocus", this.n);
      this.o = $$0.a("overrideWidth", this.o);
      this.p = $$0.a("overrideHeight", this.p);
      $$0.a("chatHeightFocused", this.aX);
      $$0.a("chatDelay", this.aY);
      $$0.a("chatHeightUnfocused", this.aW);
      $$0.a("chatScale", this.aU);
      $$0.a("chatWidth", this.aV);
      $$0.a("notificationDisplayTime", this.ba);
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aT);
      $$0.a("attackIndicator", this.bc);
      this.r = $$0.a("tutorialStep", this.r, hde::a, hde::a);
      $$0.a("mouseWheelSensitivity", this.be);
      $$0.a("rawMouseInput", this.bf);
      this.t = $$0.a("glDebugVerbosity", this.t);
      this.u = $$0.a("skipMultiplayerWarning", this.u);
      $$0.a("hideMatchedNames", this.bN);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.ad = $$0.a("syncChunkWrites", this.ad);
      $$0.a("showAutosaveIndicator", this.bO);
      $$0.a("allowServerListing", this.bx);
      $$0.a("onlyShowSecureChat", this.bQ);
      $$0.a("panoramaScrollSpeed", this.aO);
      $$0.a("telemetryOptInExtra", this.bV);
      this.ac = $$0.a("onboardAccessibility", this.ac);
      $$0.a("menuBackgroundBlurriness", this.aM);

      for (fij $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fbz.a($$3));
         }
      }

      for (awf $$4 : awf.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bz.get($$4));
      }

      for (cnv $$5 : cnv.values()) {
         boolean $$6 = this.aS.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.a($$5, $$7);
         }
      }
   }

   public void ax() {
      try {
         if (!this.bR.exists()) {
            return;
         }

         uf $$0 = new uf();

         try (BufferedReader $$1 = Files.newReader(this.bR, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = ah.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  ae.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final uf $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(fid.b);
            } else {
               this.aB.a(fid.a);
            }
         }

         this.a(new fip.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).r_() : null;
            }

            @Override
            public <T> void a(String $$0, fio<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fip.ae.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fip.ae.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fip.a($$2) : $$1;
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
               } else if (fip.a($$2)) {
                  return 1.0F;
               } else if (fip.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fip.ae.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fij.d();
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

   private uf a(uf $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return bam.e.a(this.W.au(), $$0, $$1);
   }

   public void ay() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bR), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fip.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fio<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> fip.ae.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(fip.af.toJson($$2));
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
         if (this.W.aP().f().isPresent()) {
            $$0.println("fullscreenResolution:" + this.W.aP().f().get().g());
         }
      } catch (Exception var6) {
         ae.error("Failed to save options", var6);
      }

      this.aA();
   }

   public aqt az() {
      int $$0 = 0;

      for (cnv $$1 : this.aS) {
         $$0 |= $$1.a();
      }

      return new aqt(this.ab, this.ap.c(), this.aH.c(), this.bl.c(), $$0, this.aT.c(), this.W.aU(), this.bx.c(), this.cl.c());
   }

   public void aA() {
      if (this.W.t != null) {
         this.W.t.cw.a(this.az());
      }
   }

   public void a(cnv $$0, boolean $$1) {
      if ($$1) {
         this.aS.add($$0);
      } else {
         this.aS.remove($$0);
      }
   }

   public boolean a(cnv $$0) {
      return this.aS.contains($$0);
   }

   public fhx aB() {
      return this.aG() >= 4 ? this.ax.c() : fhx.a;
   }

   public boolean aC() {
      return this.q;
   }

   public void b(aue $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         aub $$4 = $$0.c($$3);
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

   public fhv aD() {
      return this.bS;
   }

   public void a(fhv $$0) {
      this.bS = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = ayt.a(af, $$0, ag);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aE() {
      return this.bR;
   }

   public String aF() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fip.b() {
         @Override
         public <T> void a(String $$0x, fio<T> $$1) {
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

   public int aG() {
      return this.ar > 0 ? Math.min(this.ap.c(), this.ar) : this.ap.c();
   }

   private static xd c(xd $$0, int $$1) {
      return xd.a("options.pixel_value", $$0, $$1);
   }

   private static xd a(xd $$0, double $$1) {
      return xd.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static xd a(xd $$0, xd $$1) {
      return xd.a("options.generic_value", $$0, $$1);
   }

   public static xd a(xd $$0, int $$1) {
      return a($$0, xd.b(Integer.toString($$1)));
   }

   public static xd b(xd $$0, int $$1) {
      return $$1 == 0 ? a($$0, xc.c) : a($$0, $$1);
   }

   private static xd b(xd $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, xc.c) : a($$0, $$1);
   }

   interface a extends fip.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fio<T> var2);
   }
}
