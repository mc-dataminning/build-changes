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

public class fki {
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
   private static final xj ai = xj.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fkh<Boolean> aj = fkh.a("options.darkMojangStudiosBackgroundColor", fkh.a(ai), false);
   private static final xj ak = xj.c("options.hideLightningFlashes.tooltip");
   private final fkh<Boolean> al = fkh.a("options.hideLightningFlashes", fkh.a(ak), false);
   private static final xj am = xj.c("options.hideSplashTexts.tooltip");
   private final fkh<Boolean> an = fkh.a("options.hideSplashTexts", fkh.a(am), false);
   private final fkh<Double> ao = new fkh<>("options.sensitivity", fkh.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xj.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xj.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fkh.m.a, 0.5, $$0x -> {
   });
   private final fkh<Integer> ap;
   private final fkh<Integer> aq;
   private int ar = 0;
   private final fkh<Double> as = new fkh<>(
      "options.entityDistanceScaling",
      fkh.a(),
      fki::a,
      new fkh.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fkh<Integer> at = new fkh<>(
      "options.framerateLimit",
      fkh.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xj.c("options.framerateLimit.max")) : a($$0x, xj.a("options.framerate", $$1x)),
      new fkh.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fke.Q().aP().a($$0x)
   );
   private static final xj au = xj.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final xj av = xj.c("options.inactivityFpsLimit.afk.tooltip");
   private final fkh<fka> aw = new fkh<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> fno.a(au);
         case b -> fno.a(av);
      };
   }, fkh.b(), new fkh.e<>(Arrays.asList(fka.values()), fka.c), fka.b, $$0x -> {
   });
   private final fkh<fjq> ax = new fkh<>(
      "options.renderClouds",
      fkh.a(),
      fkh.b(),
      new fkh.e<>(Arrays.asList(fjq.values()), Codec.withAlternative(fjq.d, Codec.BOOL, $$0x -> $$0x ? fjq.c : fjq.a)),
      fjq.c,
      $$0x -> {
      }
   );
   private static final xj ay = xj.c("options.graphics.fast.tooltip");
   private static final xj az = xj.a("options.graphics.fabulous.tooltip", xj.c("options.graphics.fabulous").a(n.u));
   private static final xj aA = xj.c("options.graphics.fancy.tooltip");
   private final fkh<fjw> aB = new fkh<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fno.a(aA);
            case a -> fno.a(ay);
            case c -> fno.a(az);
         };
      },
      ($$0x, $$1x) -> {
         xx $$2x = xj.c($$1x.a());
         return $$1x == fjw.c ? $$2x.a(n.u) : $$2x;
      },
      new fkh.a<>(
         Arrays.asList(fjw.values()),
         Stream.of(fjw.values()).filter($$0x -> $$0x != fjw.c).collect(Collectors.toList()),
         () -> fke.Q().r() && fke.Q().aj().h(),
         ($$0x, $$1x) -> {
            fke $$2x = fke.Q();
            gix $$3 = $$2x.aj();
            if ($$1x == fjw.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.e();
            }
         },
         Codec.INT.xmap(fjw::a, fjw::b)
      ),
      fjw.b,
      $$0x -> {
      }
   );
   private final fkh<Boolean> aC = fkh.a("options.ao", true, $$0x -> fke.Q().f.e());
   private static final xj aD = xj.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xj aE = xj.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xj aF = xj.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fkh<fkk> aG = new fkh<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fno.a(aD);
         case b -> fno.a(aE);
         case c -> fno.a(aF);
      };
   }, fkh.b(), new fkh.e<>(Arrays.asList(fkk.values()), Codec.INT.xmap(fkk::a, fkk::b)), fkk.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fkh<cor> aH = new fkh<>(
      "options.chat.visibility", fkh.a(), fkh.b(), new fkh.e<>(Arrays.asList(cor.values()), Codec.INT.xmap(cor::a, cor::b)), cor.a, $$0x -> {
      }
   );
   private final fkh<Double> aI = new fkh<>("options.chat.opacity", fkh.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fkh.m.a, 1.0, $$0x -> fke.Q().m.d().b());
   private final fkh<Double> aJ = new fkh<>("options.chat.line_spacing", fkh.a(), fki::a, fkh.m.a, 0.0, $$0x -> {
   });
   private static final xj aK = xj.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aL = 5;
   private final fkh<Integer> aM = new fkh<>("options.accessibility.menu_background_blurriness", fkh.a(aK), fki::b, new fkh.f(0, 10), 5, $$0x -> {
   });
   private final fkh<Double> aN = new fkh<>("options.accessibility.text_background_opacity", fkh.a(), fki::a, fkh.m.a, 0.5, $$0x -> fke.Q().m.d().b());
   private final fkh<Double> aO = new fkh<>("options.accessibility.panorama_speed", fkh.a(), fki::a, fkh.m.a, 1.0, $$0x -> {
   });
   private static final xj aP = xj.c("options.accessibility.high_contrast.tooltip");
   private final fkh<Boolean> aQ = fkh.a("options.accessibility.high_contrast", fkh.a(aP), false, $$0x -> {
      aun $$1x = fke.Q().ad();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final fkh<Boolean> aR = fkh.a(
      "options.accessibility.narrator_hotkey",
      fkh.a(fke.a ? xj.c("options.accessibility.narrator_hotkey.mac.tooltip") : xj.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cov> aS = EnumSet.allOf(cov.class);
   private final fkh<bvb> aT = new fkh<>("options.mainHand", fkh.a(), fkh.b(), new fkh.e<>(Arrays.asList(bvb.values()), bvb.c), bvb.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fkh<Double> aU = new fkh<>(
      "options.chat.scale",
      fkh.a(),
      ($$0x, $$1x) -> (xj)($$1x == 0.0 ? xi.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fkh.m.a,
      1.0,
      $$0x -> fke.Q().m.d().b()
   );
   private final fkh<Double> aV = new fkh<>("options.chat.width", fkh.a(), ($$0x, $$1x) -> c($$0x, fme.a($$1x)), fkh.m.a, 1.0, $$0x -> fke.Q().m.d().b());
   private final fkh<Double> aW = new fkh<>(
      "options.chat.height.unfocused", fkh.a(), ($$0x, $$1x) -> c($$0x, fme.b($$1x)), fkh.m.a, fme.i(), $$0x -> fke.Q().m.d().b()
   );
   private final fkh<Double> aX = new fkh<>(
      "options.chat.height.focused", fkh.a(), ($$0x, $$1x) -> c($$0x, fme.b($$1x)), fkh.m.a, 1.0, $$0x -> fke.Q().m.d().b()
   );
   private final fkh<Double> aY = new fkh<>(
      "options.chat.delay_instant",
      fkh.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xj.c("options.chat.delay_none") : xj.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fkh.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fke.Q().ba().a($$0x)
   );
   private static final xj aZ = xj.c("options.notifications.display_time.tooltip");
   private final fkh<Double> ba = new fkh<>(
      "options.notifications.display_time",
      fkh.a(aZ),
      ($$0x, $$1x) -> a($$0x, xj.a("options.multiplier", $$1x)),
      new fkh.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fkh<Integer> bb = new fkh<>(
      "options.mipmapLevels", fkh.a(), ($$0x, $$1x) -> (xj)($$1x == 0 ? xi.a($$0x, false) : a($$0x, $$1x.intValue())), new fkh.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fkh<fjm> bc = new fkh<>(
      "options.attackIndicator", fkh.a(), fkh.b(), new fkh.e<>(Arrays.asList(fjm.values()), Codec.INT.xmap(fjm::a, fjm::b)), fjm.b, $$0x -> {
      }
   );
   public hfk r = hfk.a;
   public boolean s = false;
   private final fkh<Integer> bd = new fkh<>("options.biomeBlendRadius", fkh.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xj.c("options.biomeBlendRadius." + $$2x));
   }, new fkh.f(0, 7, false), 2, $$0x -> fke.Q().f.e());
   private final fkh<Double> be = new fkh<>(
      "options.mouseWheelSensitivity",
      fkh.a(),
      ($$0x, $$1x) -> a($$0x, xj.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fkh.f(-200, 100).a(fki::c, fki::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fkh<Boolean> bf = fkh.a("options.rawMouseInput", true, $$0x -> {
      fdu $$1x = fke.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fkh<Boolean> bg = fkh.a("options.autoJump", false);
   private static final xj bh = xj.c("options.rotateWithMinecart.tooltip");
   private final fkh<Boolean> bi = fkh.a("options.rotateWithMinecart", fkh.a(bh), false);
   private final fkh<Boolean> bj = fkh.a("options.operatorItemsTab", false);
   private final fkh<Boolean> bk = fkh.a("options.autoSuggestCommands", true);
   private final fkh<Boolean> bl = fkh.a("options.chat.color", true);
   private final fkh<Boolean> bm = fkh.a("options.chat.links", true);
   private final fkh<Boolean> bn = fkh.a("options.chat.links.prompt", true);
   private final fkh<Boolean> bo = fkh.a("options.vsync", true, $$0x -> {
      if (fke.Q().aO() != null) {
         fke.Q().aO().a($$0x);
      }
   });
   private final fkh<Boolean> bp = fkh.a("options.entityShadows", true);
   private final fkh<Boolean> bq = fkh.a("options.forceUnicodeFont", false, $$0x -> aH());
   private final fkh<Boolean> br = fkh.a("options.japaneseGlyphVariants", fkh.a(xj.c("options.japaneseGlyphVariants.tooltip")), aI(), $$0x -> aH());
   private final fkh<Boolean> bs = fkh.a("options.invertMouse", false);
   private final fkh<Boolean> bt = fkh.a("options.discrete_mouse_scroll", false);
   private static final xj bu = xj.c("options.realmsNotifications.tooltip");
   private final fkh<Boolean> bv = fkh.a("options.realmsNotifications", fkh.a(bu), true);
   private static final xj bw = xj.c("options.allowServerListing.tooltip");
   private final fkh<Boolean> bx = fkh.a("options.allowServerListing", fkh.a(bw), true, $$0x -> {
   });
   private final fkh<Boolean> by = fkh.a("options.reducedDebugInfo", false);
   private final Map<awo, fkh<Double>> bz = ae.a(new EnumMap<>(awo.class), $$0x -> {
      for (awo $$1x : awo.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fkh<Boolean> bA = fkh.a("options.showSubtitles", false);
   private static final xj bB = xj.c("options.directionalAudio.on.tooltip");
   private static final xj bC = xj.c("options.directionalAudio.off.tooltip");
   private final fkh<Boolean> bD = fkh.a("options.directionalAudio", $$0x -> $$0x ? fno.a(bB) : fno.a(bC), false, $$0x -> {
      heg $$1x = fke.Q().ak();
      $$1x.k();
      $$1x.a(hcw.a(awn.Av, 1.0F));
   });
   private final fkh<Boolean> bE = new fkh<>(
      "options.accessibility.text_background",
      fkh.a(),
      ($$0x, $$1x) -> $$1x ? xj.c("options.accessibility.text_background.chat") : xj.c("options.accessibility.text_background.everywhere"),
      fkh.a,
      true,
      $$0x -> {
      }
   );
   private final fkh<Boolean> bF = fkh.a("options.touchscreen", false);
   private final fkh<Boolean> bG = fkh.a("options.fullscreen", false, $$0x -> {
      fke $$1x = fke.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ac().a($$1x.aO().i());
      }
   });
   private final fkh<Boolean> bH = fkh.a("options.viewBobbing", true);
   private static final xj bI = xj.c("options.key.toggle");
   private static final xj bJ = xj.c("options.key.hold");
   private final fkh<Boolean> bK = new fkh<>("key.sneak", fkh.a(), ($$0x, $$1x) -> $$1x ? bI : bJ, fkh.a, false, $$0x -> {
   });
   private final fkh<Boolean> bL = new fkh<>("key.sprint", fkh.a(), ($$0x, $$1x) -> $$1x ? bI : bJ, fkh.a, false, $$0x -> {
   });
   public boolean u;
   private static final xj bM = xj.c("options.hideMatchedNames.tooltip");
   private final fkh<Boolean> bN = fkh.a("options.hideMatchedNames", fkh.a(bM), true);
   private final fkh<Boolean> bO = fkh.a("options.autosaveIndicator", true);
   private static final xj bP = xj.c("options.onlyShowSecureChat.tooltip");
   private final fkh<Boolean> bQ = fkh.a("options.onlyShowSecureChat", fkh.a(bP), false);
   public final fkc v = new fkc("key.forward", 87, "key.categories.movement");
   public final fkc w = new fkc("key.left", 65, "key.categories.movement");
   public final fkc x = new fkc("key.back", 83, "key.categories.movement");
   public final fkc y = new fkc("key.right", 68, "key.categories.movement");
   public final fkc z = new fkc("key.jump", 32, "key.categories.movement");
   public final fkc A = new fkq("key.sneak", 340, "key.categories.movement", this.bK::c);
   public final fkc B = new fkq("key.sprint", 341, "key.categories.movement", this.bL::c);
   public final fkc C = new fkc("key.inventory", 69, "key.categories.inventory");
   public final fkc D = new fkc("key.swapOffhand", 70, "key.categories.inventory");
   public final fkc E = new fkc("key.drop", 81, "key.categories.inventory");
   public final fkc F = new fkc("key.use", fdm.b.c, 1, "key.categories.gameplay");
   public final fkc G = new fkc("key.attack", fdm.b.c, 0, "key.categories.gameplay");
   public final fkc H = new fkc("key.pickItem", fdm.b.c, 2, "key.categories.gameplay");
   public final fkc I = new fkc("key.chat", 84, "key.categories.multiplayer");
   public final fkc J = new fkc("key.playerlist", 258, "key.categories.multiplayer");
   public final fkc K = new fkc("key.command", 47, "key.categories.multiplayer");
   public final fkc L = new fkc("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fkc M = new fkc("key.screenshot", 291, "key.categories.misc");
   public final fkc N = new fkc("key.togglePerspective", 294, "key.categories.misc");
   public final fkc O = new fkc("key.smoothCamera", fdm.bv.b(), "key.categories.misc");
   public final fkc P = new fkc("key.fullscreen", 300, "key.categories.misc");
   public final fkc Q = new fkc("key.spectatorOutlines", fdm.bv.b(), "key.categories.misc");
   public final fkc R = new fkc("key.advancements", 76, "key.categories.misc");
   public final fkc[] S = new fkc[]{
      new fkc("key.hotbar.1", 49, "key.categories.inventory"),
      new fkc("key.hotbar.2", 50, "key.categories.inventory"),
      new fkc("key.hotbar.3", 51, "key.categories.inventory"),
      new fkc("key.hotbar.4", 52, "key.categories.inventory"),
      new fkc("key.hotbar.5", 53, "key.categories.inventory"),
      new fkc("key.hotbar.6", 54, "key.categories.inventory"),
      new fkc("key.hotbar.7", 55, "key.categories.inventory"),
      new fkc("key.hotbar.8", 56, "key.categories.inventory"),
      new fkc("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fkc T = new fkc("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fkc U = new fkc("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fkc[] V = (fkc[])ArrayUtils.addAll(
      new fkc[]{
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
   protected fke W;
   private final File bR;
   public boolean X;
   private fjo bS = fjo.a;
   public String Y = "";
   public boolean Z;
   private final fkh<Integer> bT = new fkh<>("options.fov", fkh.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xj.c("options.fov.min"));
         case 110 -> a($$0x, xj.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fkh.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fke.Q().f.p());
   private static final xj bU = xj.a("options.telemetry.button.tooltip", xj.c("options.telemetry.state.minimal"), xj.c("options.telemetry.state.all"));
   private final fkh<Boolean> bV = fkh.a("options.telemetry.button", fkh.a(bU), ($$0x, $$1x) -> {
      fke $$2x = fke.Q();
      if (!$$2x.E()) {
         return xj.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xj.c("options.telemetry.state.all") : xj.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xj bW = xj.c("options.screenEffectScale.tooltip");
   private final fkh<Double> bX = new fkh<>("options.screenEffectScale", fkh.a(bW), fki::b, fkh.m.a, 1.0, $$0x -> {
   });
   private static final xj bY = xj.c("options.fovEffectScale.tooltip");
   private final fkh<Double> bZ = new fkh<>(
      "options.fovEffectScale", fkh.a(bY), fki::b, fkh.m.a.a(azm::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final xj ca = xj.c("options.darknessEffectScale.tooltip");
   private final fkh<Double> cb = new fkh<>("options.darknessEffectScale", fkh.a(ca), fki::b, fkh.m.a.a(azm::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final xj cc = xj.c("options.glintSpeed.tooltip");
   private final fkh<Double> cd = new fkh<>("options.glintSpeed", fkh.a(cc), fki::b, fkh.m.a, 0.5, $$0x -> {
   });
   private static final xj ce = xj.c("options.glintStrength.tooltip");
   private final fkh<Double> cf = new fkh<>("options.glintStrength", fkh.a(ce), fki::b, fkh.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final xj cg = xj.c("options.damageTiltStrength.tooltip");
   private final fkh<Double> ch = new fkh<>("options.damageTiltStrength", fkh.a(cg), fki::b, fkh.m.a, 1.0, $$0x -> {
   });
   private final fkh<Double> ci = new fkh<>("options.gamma", fkh.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xj.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xj.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xj.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fkh.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cj = 2147483646;
   private final fkh<Integer> ck = new fkh<>(
      "options.guiScale", fkh.a(), ($$0x, $$1x) -> $$1x == 0 ? xj.c("options.guiScale.auto") : xj.b(Integer.toString($$1x)), new fkh.c(0, () -> {
         fke $$0x = fke.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fkh<arh> cl = new fkh<>(
      "options.particles", fkh.a(), fkh.b(), new fkh.e<>(Arrays.asList(arh.values()), Codec.INT.xmap(arh::a, arh::b)), arh.a, $$0x -> {
      }
   );
   private final fkh<fkg> cm = new fkh<>(
      "options.narrator",
      fkh.a(),
      ($$0x, $$1x) -> (xj)(this.W.aZ().a() ? $$1x.b() : xj.c("options.narrator.notavailable")),
      new fkh.e<>(Arrays.asList(fkg.values()), Codec.INT.xmap(fkg::a, fkg::a)),
      fkg.a,
      $$0x -> this.W.aZ().a($$0x)
   );
   public String ab = "en_us";
   private final fkh<String> cn = new fkh<>(
      "options.audioDevice",
      fkh.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xj.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xj.b($$1x.substring(hed.c)) : xj.b($$1x);
         }
      },
      new fkh.h<>(
         () -> Stream.concat(Stream.of(""), fke.Q().ak().a().stream()).toList(),
         $$0x -> fke.Q().r() && $$0x != "" && !fke.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         heg $$1x = fke.Q().ak();
         $$1x.k();
         $$1x.a(hcw.a(awn.Av, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;

   public fkh<Boolean> a() {
      return this.aj;
   }

   public fkh<Boolean> b() {
      return this.al;
   }

   public fkh<Boolean> c() {
      return this.an;
   }

   public fkh<Double> d() {
      return this.ao;
   }

   public fkh<Integer> e() {
      return this.ap;
   }

   public fkh<Integer> f() {
      return this.aq;
   }

   public fkh<Double> g() {
      return this.as;
   }

   public fkh<Integer> h() {
      return this.at;
   }

   public fkh<fka> i() {
      return this.aw;
   }

   public fkh<fjq> j() {
      return this.ax;
   }

   public fkh<fjw> k() {
      return this.aB;
   }

   public fkh<Boolean> l() {
      return this.aC;
   }

   public fkh<fkk> m() {
      return this.aG;
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

      this.ay();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.W.l();
      }
   }

   public fkh<cor> n() {
      return this.aH;
   }

   public fkh<Double> o() {
      return this.aI;
   }

   public fkh<Double> p() {
      return this.aJ;
   }

   public fkh<Integer> q() {
      return this.aM;
   }

   public int r() {
      return this.q().c();
   }

   public fkh<Double> s() {
      return this.aN;
   }

   public fkh<Double> t() {
      return this.aO;
   }

   public fkh<Boolean> u() {
      return this.aQ;
   }

   public fkh<Boolean> v() {
      return this.aR;
   }

   public fkh<bvb> w() {
      return this.aT;
   }

   public fkh<Double> x() {
      return this.aU;
   }

   public fkh<Double> y() {
      return this.aV;
   }

   public fkh<Double> z() {
      return this.aW;
   }

   public fkh<Double> A() {
      return this.aX;
   }

   public fkh<Double> B() {
      return this.aY;
   }

   public fkh<Double> C() {
      return this.ba;
   }

   public fkh<Integer> D() {
      return this.bb;
   }

   public fkh<fjm> E() {
      return this.bc;
   }

   public fkh<Integer> F() {
      return this.bd;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return azm.a(Math.log10($$0) * 100.0);
   }

   public fkh<Double> G() {
      return this.be;
   }

   public fkh<Boolean> H() {
      return this.bf;
   }

   public fkh<Boolean> I() {
      return this.bg;
   }

   public fkh<Boolean> J() {
      return this.bi;
   }

   public fkh<Boolean> K() {
      return this.bj;
   }

   public fkh<Boolean> L() {
      return this.bk;
   }

   public fkh<Boolean> M() {
      return this.bl;
   }

   public fkh<Boolean> N() {
      return this.bm;
   }

   public fkh<Boolean> O() {
      return this.bn;
   }

   public fkh<Boolean> P() {
      return this.bo;
   }

   public fkh<Boolean> Q() {
      return this.bp;
   }

   private static void aH() {
      fke $$0 = fke.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fkh<Boolean> R() {
      return this.bq;
   }

   private static boolean aI() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fkh<Boolean> S() {
      return this.br;
   }

   public fkh<Boolean> T() {
      return this.bs;
   }

   public fkh<Boolean> U() {
      return this.bt;
   }

   public fkh<Boolean> V() {
      return this.bv;
   }

   public fkh<Boolean> W() {
      return this.bx;
   }

   public fkh<Boolean> X() {
      return this.by;
   }

   public final float a(awo $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fkh<Double> b(awo $$0) {
      return Objects.requireNonNull(this.bz.get($$0));
   }

   private fkh<Double> a(String $$0, awo $$1) {
      return new fkh<>($$0, fkh.a(), fki::b, fkh.m.a, 1.0, $$1x -> fke.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fkh<Boolean> Y() {
      return this.bA;
   }

   public fkh<Boolean> Z() {
      return this.bD;
   }

   public fkh<Boolean> aa() {
      return this.bE;
   }

   public fkh<Boolean> ab() {
      return this.bF;
   }

   public fkh<Boolean> ac() {
      return this.bG;
   }

   public fkh<Boolean> ad() {
      return this.bH;
   }

   public fkh<Boolean> ae() {
      return this.bK;
   }

   public fkh<Boolean> af() {
      return this.bL;
   }

   public fkh<Boolean> ag() {
      return this.bN;
   }

   public fkh<Boolean> ah() {
      return this.bO;
   }

   public fkh<Boolean> ai() {
      return this.bQ;
   }

   public fkh<Integer> aj() {
      return this.bT;
   }

   public fkh<Boolean> ak() {
      return this.bV;
   }

   public fkh<Double> al() {
      return this.bX;
   }

   public fkh<Double> am() {
      return this.bZ;
   }

   public fkh<Double> an() {
      return this.cb;
   }

   public fkh<Double> ao() {
      return this.cd;
   }

   public fkh<Double> ap() {
      return this.cf;
   }

   public fkh<Double> aq() {
      return this.ch;
   }

   public fkh<Double> ar() {
      return this.ci;
   }

   public fkh<Integer> as() {
      return this.ck;
   }

   public fkh<arh> at() {
      return this.cl;
   }

   public fkh<fkg> au() {
      return this.cm;
   }

   public fkh<String> av() {
      return this.cn;
   }

   public void aw() {
      this.ac = false;
      this.ay();
   }

   public fki(fke $$0, File $$1) {
      this.W = $$0;
      this.bR = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ap = new fkh<>(
         "options.renderDistance",
         fkh.a(),
         ($$0x, $$1x) -> a($$0x, xj.a("options.chunks", $$1x)),
         new fkh.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fke.Q().f.p()
      );
      this.aq = new fkh<>(
         "options.simulationDistance", fkh.a(), ($$0x, $$1x) -> a($$0x, xj.a("options.chunks", $$1x)), new fkh.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = ae.m() == ae.a.c;
      this.ax();
   }

   public float a(float $$0) {
      return this.bE.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return axx.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bE.c() ? $$0 : axx.a(this.aN.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(fki.b $$0) {
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

   private void a(fki.a $$0) {
      this.a((fki.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, fki::c, af::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fki::c, af::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, hfk::a, hfk::a);
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

      for (fkc $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fdm.a($$3));
         }
      }

      for (awo $$4 : awo.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bz.get($$4));
      }

      for (cov $$5 : cov.values()) {
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

         ul $$0 = new ul();

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

         final ul $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(fjw.b);
            } else {
               this.aB.a(fjw.a);
            }
         }

         this.a(new fki.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).t_() : null;
            }

            @Override
            public <T> void a(String $$0, fkh<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fki.ae.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fki.ae.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fki.a($$2) : $$1;
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
               } else if (fki.a($$2)) {
                  return 1.0F;
               } else if (fki.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fki.ae.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fkc.d();
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

   private ul a(ul $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return baw.e.a(this.W.au(), $$0, $$1);
   }

   public void ay() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bR), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ab.b().d().c());
         this.a(new fki.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fkh<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> fki.ae.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(fki.af.toJson($$2));
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

      this.aA();
   }

   public ara az() {
      int $$0 = 0;

      for (cov $$1 : this.aS) {
         $$0 |= $$1.a();
      }

      return new ara(this.ab, this.ap.c(), this.aH.c(), this.bl.c(), $$0, this.aT.c(), this.W.aU(), this.bx.c(), this.cl.c());
   }

   public void aA() {
      if (this.W.t != null) {
         this.W.t.i.a(this.az());
      }
   }

   public void a(cov $$0, boolean $$1) {
      if ($$1) {
         this.aS.add($$0);
      } else {
         this.aS.remove($$0);
      }
   }

   public boolean a(cov $$0) {
      return this.aS.contains($$0);
   }

   public fjq aB() {
      return this.aG() >= 4 ? this.ax.c() : fjq.a;
   }

   public boolean aC() {
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

   public fjo aD() {
      return this.bS;
   }

   public void a(fjo $$0) {
      this.bS = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = azc.a(af, $$0, ag);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aE() {
      return this.bR;
   }

   public String aF() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fki.b() {
         @Override
         public <T> void a(String $$0x, fkh<T> $$1) {
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

   private static xj c(xj $$0, int $$1) {
      return xj.a("options.pixel_value", $$0, $$1);
   }

   private static xj a(xj $$0, double $$1) {
      return xj.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static xj a(xj $$0, xj $$1) {
      return xj.a("options.generic_value", $$0, $$1);
   }

   public static xj a(xj $$0, int $$1) {
      return a($$0, xj.b(Integer.toString($$1)));
   }

   public static xj b(xj $$0, int $$1) {
      return $$1 == 0 ? a($$0, xi.c) : a($$0, $$1);
   }

   private static xj b(xj $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, xi.c) : a($$0, $$1);
   }

   interface a extends fki.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fkh<T> var2);
   }
}
