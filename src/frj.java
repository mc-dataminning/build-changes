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

public class frj {
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
   private static final xc aj = xc.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fri<Boolean> ak = fri.a("options.darkMojangStudiosBackgroundColor", fri.a(aj), false);
   private static final xc al = xc.c("options.hideLightningFlashes.tooltip");
   private final fri<Boolean> am = fri.a("options.hideLightningFlashes", fri.a(al), false);
   private static final xc an = xc.c("options.hideSplashTexts.tooltip");
   private final fri<Boolean> ao = fri.a("options.hideSplashTexts", fri.a(an), false);
   private final fri<Double> ap = new fri<>("options.sensitivity", fri.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xc.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xc.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fri.m.a, 0.5, $$0x -> {
   });
   private final fri<Integer> aq;
   private final fri<Integer> ar;
   private int as = 0;
   private final fri<Double> at = new fri<>(
      "options.entityDistanceScaling",
      fri.a(),
      frj::a,
      new fri.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fri<Integer> au = new fri<>(
      "options.framerateLimit",
      fri.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xc.c("options.framerateLimit.max")) : a($$0x, xc.a("options.framerate", $$1x)),
      new fri.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> frf.Q().aP().a($$0x)
   );
   private static final xc av = xc.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final xc aw = xc.c("options.inactivityFpsLimit.afk.tooltip");
   private final fri<frb> ax = new fri<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> fvy.a(av);
         case b -> fvy.a(aw);
      };
   }, fri.b(), new fri.e<>(Arrays.asList(frb.values()), frb.c), frb.b, $$0x -> {
   });
   private final fri<fqr> ay = new fri<>(
      "options.renderClouds",
      fri.a(),
      fri.b(),
      new fri.e<>(Arrays.asList(fqr.values()), Codec.withAlternative(fqr.d, Codec.BOOL, $$0x -> $$0x ? fqr.c : fqr.a)),
      fqr.c,
      $$0x -> {
      }
   );
   private static final xc az = xc.c("options.graphics.fast.tooltip");
   private static final xc aA = xc.a("options.graphics.fabulous.tooltip", xc.c("options.graphics.fabulous").a(o.u));
   private static final xc aB = xc.c("options.graphics.fancy.tooltip");
   private final fri<fqx> aC = new fri<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fvy.a(aB);
            case a -> fvy.a(az);
            case c -> fvy.a(aA);
         };
      },
      ($$0x, $$1x) -> {
         xq $$2x = xc.c($$1x.a());
         return $$1x == fqx.c ? $$2x.a(o.u) : $$2x;
      },
      new fri.a<>(
         Arrays.asList(fqx.values()),
         Stream.of(fqx.values()).filter($$0x -> $$0x != fqx.c).collect(Collectors.toList()),
         () -> frf.Q().r() && frf.Q().aj().g(),
         ($$0x, $$1x) -> {
            frf $$2x = frf.Q();
            grt $$3 = $$2x.aj();
            if ($$1x == fqx.c && $$3.b()) {
               $$3.c();
            } else {
               $$0x.a($$1x);
               $$2x.f.d();
            }
         },
         Codec.INT.xmap(fqx::a, fqx::b)
      ),
      fqx.b,
      $$0x -> {
      }
   );
   private final fri<Boolean> aD = fri.a("options.ao", true, $$0x -> frf.Q().f.d());
   private static final xc aE = xc.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xc aF = xc.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xc aG = xc.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fri<frl> aH = new fri<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fvy.a(aE);
         case b -> fvy.a(aF);
         case c -> fvy.a(aG);
      };
   }, fri.b(), new fri.e<>(Arrays.asList(frl.values()), Codec.INT.xmap(frl::a, frl::b)), frl.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fri<crw> aI = new fri<>(
      "options.chat.visibility", fri.a(), fri.b(), new fri.e<>(Arrays.asList(crw.values()), Codec.INT.xmap(crw::a, crw::b)), crw.a, $$0x -> {
      }
   );
   private final fri<Double> aJ = new fri<>("options.chat.opacity", fri.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fri.m.a, 1.0, $$0x -> frf.Q().m.d().b());
   private final fri<Double> aK = new fri<>("options.chat.line_spacing", fri.a(), frj::a, fri.m.a, 0.0, $$0x -> {
   });
   private static final xc aL = xc.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aM = 5;
   private final fri<Integer> aN = new fri<>("options.accessibility.menu_background_blurriness", fri.a(aL), frj::b, new fri.f(0, 10), 5, $$0x -> {
   });
   private final fri<Double> aO = new fri<>("options.accessibility.text_background_opacity", fri.a(), frj::a, fri.m.a, 0.5, $$0x -> frf.Q().m.d().b());
   private final fri<Double> aP = new fri<>("options.accessibility.panorama_speed", fri.a(), frj::a, fri.m.a, 1.0, $$0x -> {
   });
   private static final xc aQ = xc.c("options.accessibility.high_contrast.tooltip");
   private final fri<Boolean> aR = fri.a("options.accessibility.high_contrast", fri.a(aQ), false, $$0x -> {
      aur $$1x = frf.Q().ad();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private static final xc aS = xc.c("options.accessibility.high_contrast_block_outline.tooltip");
   private final fri<Boolean> aT = fri.a("options.accessibility.high_contrast_block_outline", fri.a(aS), false);
   private final fri<Boolean> aU = fri.a(
      "options.accessibility.narrator_hotkey",
      fri.a(frf.a ? xc.c("options.accessibility.narrator_hotkey.mac.tooltip") : xc.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<csb> aV = EnumSet.allOf(csb.class);
   private final fri<bxn> aW = new fri<>("options.mainHand", fri.a(), fri.b(), new fri.e<>(Arrays.asList(bxn.values()), bxn.c), bxn.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fri<Double> aX = new fri<>(
      "options.chat.scale",
      fri.a(),
      ($$0x, $$1x) -> (xc)($$1x == 0.0 ? xb.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fri.m.a,
      1.0,
      $$0x -> frf.Q().m.d().b()
   );
   private final fri<Double> aY = new fri<>("options.chat.width", fri.a(), ($$0x, $$1x) -> c($$0x, fuo.a($$1x)), fri.m.a, 1.0, $$0x -> frf.Q().m.d().b());
   private final fri<Double> aZ = new fri<>(
      "options.chat.height.unfocused", fri.a(), ($$0x, $$1x) -> c($$0x, fuo.b($$1x)), fri.m.a, fuo.i(), $$0x -> frf.Q().m.d().b()
   );
   private final fri<Double> ba = new fri<>(
      "options.chat.height.focused", fri.a(), ($$0x, $$1x) -> c($$0x, fuo.b($$1x)), fri.m.a, 1.0, $$0x -> frf.Q().m.d().b()
   );
   private final fri<Double> bb = new fri<>(
      "options.chat.delay_instant",
      fri.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xc.c("options.chat.delay_none") : xc.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fri.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> frf.Q().aZ().a($$0x)
   );
   private static final xc bc = xc.c("options.notifications.display_time.tooltip");
   private final fri<Double> bd = new fri<>(
      "options.notifications.display_time",
      fri.a(bc),
      ($$0x, $$1x) -> a($$0x, xc.a("options.multiplier", $$1x)),
      new fri.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fri<Integer> be = new fri<>(
      "options.mipmapLevels", fri.a(), ($$0x, $$1x) -> (xc)($$1x == 0 ? xb.a($$0x, false) : a($$0x, $$1x.intValue())), new fri.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fri<fqm> bf = new fri<>(
      "options.attackIndicator", fri.a(), fri.b(), new fri.e<>(Arrays.asList(fqm.values()), Codec.INT.xmap(fqm::a, fqm::b)), fqm.b, $$0x -> {
      }
   );
   public hrj r = hrj.a;
   public boolean s = false;
   private final fri<Integer> bg = new fri<>("options.biomeBlendRadius", fri.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xc.c("options.biomeBlendRadius." + $$2x));
   }, new fri.f(0, 7, false), 2, $$0x -> frf.Q().f.d());
   private final fri<Double> bh = new fri<>(
      "options.mouseWheelSensitivity",
      fri.a(),
      ($$0x, $$1x) -> a($$0x, xc.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fri.f(-200, 100).a(frj::c, frj::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fri<Boolean> bi = fri.a("options.rawMouseInput", true, $$0x -> {
      fkm $$1x = frf.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fri<Boolean> bj = fri.a("options.autoJump", false);
   private static final xc bk = xc.c("options.rotateWithMinecart.tooltip");
   private final fri<Boolean> bl = fri.a("options.rotateWithMinecart", fri.a(bk), false);
   private final fri<Boolean> bm = fri.a("options.operatorItemsTab", false);
   private final fri<Boolean> bn = fri.a("options.autoSuggestCommands", true);
   private final fri<Boolean> bo = fri.a("options.chat.color", true);
   private final fri<Boolean> bp = fri.a("options.chat.links", true);
   private final fri<Boolean> bq = fri.a("options.chat.links.prompt", true);
   private final fri<Boolean> br = fri.a("options.vsync", true, $$0x -> {
      if (frf.Q().aO() != null) {
         frf.Q().aO().a($$0x);
      }
   });
   private final fri<Boolean> bs = fri.a("options.entityShadows", true);
   private final fri<Boolean> bt = fri.a("options.forceUnicodeFont", false, $$0x -> aI());
   private final fri<Boolean> bu = fri.a("options.japaneseGlyphVariants", fri.a(xc.c("options.japaneseGlyphVariants.tooltip")), aJ(), $$0x -> aI());
   private final fri<Boolean> bv = fri.a("options.invertMouse", false);
   private final fri<Boolean> bw = fri.a("options.discrete_mouse_scroll", false);
   private static final xc bx = xc.c("options.realmsNotifications.tooltip");
   private final fri<Boolean> by = fri.a("options.realmsNotifications", fri.a(bx), true);
   private static final xc bz = xc.c("options.allowServerListing.tooltip");
   private final fri<Boolean> bA = fri.a("options.allowServerListing", fri.a(bz), true, $$0x -> {
   });
   private final fri<Boolean> bB = fri.a("options.reducedDebugInfo", false);
   private final Map<aws, fri<Double>> bC = ag.a(aws.class, $$0x -> this.a("soundCategory." + $$0x.a(), $$0x));
   private final fri<Boolean> bD = fri.a("options.showSubtitles", false);
   private static final xc bE = xc.c("options.directionalAudio.on.tooltip");
   private static final xc bF = xc.c("options.directionalAudio.off.tooltip");
   private final fri<Boolean> bG = fri.a("options.directionalAudio", $$0x -> $$0x ? fvy.a(bE) : fvy.a(bF), false, $$0x -> {
      hqf $$1x = frf.Q().ak();
      $$1x.j();
      $$1x.a(hou.a(awr.Bv, 1.0F));
   });
   private final fri<Boolean> bH = new fri<>(
      "options.accessibility.text_background",
      fri.a(),
      ($$0x, $$1x) -> $$1x ? xc.c("options.accessibility.text_background.chat") : xc.c("options.accessibility.text_background.everywhere"),
      fri.a,
      true,
      $$0x -> {
      }
   );
   private final fri<Boolean> bI = fri.a("options.touchscreen", false);
   private final fri<Boolean> bJ = fri.a("options.fullscreen", false, $$0x -> {
      frf $$1x = frf.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ad().a($$1x.aO().i());
      }
   });
   private final fri<Boolean> bK = fri.a("options.viewBobbing", true);
   private static final xc bL = xc.c("options.key.toggle");
   private static final xc bM = xc.c("options.key.hold");
   private final fri<Boolean> bN = new fri<>("key.sneak", fri.a(), ($$0x, $$1x) -> $$1x ? bL : bM, fri.a, false, $$0x -> {
   });
   private final fri<Boolean> bO = new fri<>("key.sprint", fri.a(), ($$0x, $$1x) -> $$1x ? bL : bM, fri.a, false, $$0x -> {
   });
   public boolean u;
   private static final xc bP = xc.c("options.hideMatchedNames.tooltip");
   private final fri<Boolean> bQ = fri.a("options.hideMatchedNames", fri.a(bP), true);
   private final fri<Boolean> bR = fri.a("options.autosaveIndicator", true);
   private static final xc bS = xc.c("options.onlyShowSecureChat.tooltip");
   private final fri<Boolean> bT = fri.a("options.onlyShowSecureChat", fri.a(bS), false);
   public final frd v = new frd("key.forward", 87, "key.categories.movement");
   public final frd w = new frd("key.left", 65, "key.categories.movement");
   public final frd x = new frd("key.back", 83, "key.categories.movement");
   public final frd y = new frd("key.right", 68, "key.categories.movement");
   public final frd z = new frd("key.jump", 32, "key.categories.movement");
   public final frd A = new frq("key.sneak", 340, "key.categories.movement", this.bN::c);
   public final frd B = new frq("key.sprint", 341, "key.categories.movement", this.bO::c);
   public final frd C = new frd("key.inventory", 69, "key.categories.inventory");
   public final frd D = new frd("key.swapOffhand", 70, "key.categories.inventory");
   public final frd E = new frd("key.drop", 81, "key.categories.inventory");
   public final frd F = new frd("key.use", fkc.b.c, 1, "key.categories.gameplay");
   public final frd G = new frd("key.attack", fkc.b.c, 0, "key.categories.gameplay");
   public final frd H = new frd("key.pickItem", fkc.b.c, 2, "key.categories.gameplay");
   public final frd I = new frd("key.chat", 84, "key.categories.multiplayer");
   public final frd J = new frd("key.playerlist", 258, "key.categories.multiplayer");
   public final frd K = new frd("key.command", 47, "key.categories.multiplayer");
   public final frd L = new frd("key.socialInteractions", 80, "key.categories.multiplayer");
   public final frd M = new frd("key.screenshot", 291, "key.categories.misc");
   public final frd N = new frd("key.togglePerspective", 294, "key.categories.misc");
   public final frd O = new frd("key.smoothCamera", fkc.bv.b(), "key.categories.misc");
   public final frd P = new frd("key.fullscreen", 300, "key.categories.misc");
   public final frd Q = new frd("key.spectatorOutlines", fkc.bv.b(), "key.categories.misc");
   public final frd R = new frd("key.advancements", 76, "key.categories.misc");
   public final frd[] S = new frd[]{
      new frd("key.hotbar.1", 49, "key.categories.inventory"),
      new frd("key.hotbar.2", 50, "key.categories.inventory"),
      new frd("key.hotbar.3", 51, "key.categories.inventory"),
      new frd("key.hotbar.4", 52, "key.categories.inventory"),
      new frd("key.hotbar.5", 53, "key.categories.inventory"),
      new frd("key.hotbar.6", 54, "key.categories.inventory"),
      new frd("key.hotbar.7", 55, "key.categories.inventory"),
      new frd("key.hotbar.8", 56, "key.categories.inventory"),
      new frd("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final frd T = new frd("key.saveToolbarActivator", 67, "key.categories.creative");
   public final frd U = new frd("key.loadToolbarActivator", 88, "key.categories.creative");
   public final frd[] V = (frd[])ArrayUtils.addAll(
      new frd[]{
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
   protected frf W;
   private final File bU;
   public boolean X;
   private fqo bV = fqo.a;
   public String Y = "";
   public boolean Z;
   private final fri<Integer> bW = new fri<>("options.fov", fri.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xc.c("options.fov.min"));
         case 110 -> a($$0x, xc.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fri.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> frf.Q().f.o());
   private static final xc bX = xc.a("options.telemetry.button.tooltip", xc.c("options.telemetry.state.minimal"), xc.c("options.telemetry.state.all"));
   private final fri<Boolean> bY = fri.a("options.telemetry.button", fri.a(bX), ($$0x, $$1x) -> {
      frf $$2x = frf.Q();
      if (!$$2x.E()) {
         return xc.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xc.c("options.telemetry.state.all") : xc.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xc bZ = xc.c("options.screenEffectScale.tooltip");
   private final fri<Double> ca = new fri<>("options.screenEffectScale", fri.a(bZ), frj::b, fri.m.a, 1.0, $$0x -> {
   });
   private static final xc cb = xc.c("options.fovEffectScale.tooltip");
   private final fri<Double> cc = new fri<>(
      "options.fovEffectScale", fri.a(cb), frj::b, fri.m.a.a(azq::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final xc cd = xc.c("options.darknessEffectScale.tooltip");
   private final fri<Double> ce = new fri<>("options.darknessEffectScale", fri.a(cd), frj::b, fri.m.a.a(azq::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final xc cf = xc.c("options.glintSpeed.tooltip");
   private final fri<Double> cg = new fri<>("options.glintSpeed", fri.a(cf), frj::b, fri.m.a, 0.5, $$0x -> {
   });
   private static final xc ch = xc.c("options.glintStrength.tooltip");
   private final fri<Double> ci = new fri<>("options.glintStrength", fri.a(ch), frj::b, fri.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final xc cj = xc.c("options.damageTiltStrength.tooltip");
   private final fri<Double> ck = new fri<>("options.damageTiltStrength", fri.a(cj), frj::b, fri.m.a, 1.0, $$0x -> {
   });
   private final fri<Double> cl = new fri<>("options.gamma", fri.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xc.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xc.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xc.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fri.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cm = 2147483646;
   private final fri<Integer> cn = new fri<>(
      "options.guiScale", fri.a(), ($$0x, $$1x) -> $$1x == 0 ? xc.c("options.guiScale.auto") : xc.b(Integer.toString($$1x)), new fri.c(0, () -> {
         frf $$0x = frf.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fri<arm> co = new fri<>(
      "options.particles", fri.a(), fri.b(), new fri.e<>(Arrays.asList(arm.values()), Codec.INT.xmap(arm::a, arm::b)), arm.a, $$0x -> {
      }
   );
   private final fri<frh> cp = new fri<>(
      "options.narrator",
      fri.a(),
      ($$0x, $$1x) -> (xc)(this.W.aY().a() ? $$1x.b() : xc.c("options.narrator.notavailable")),
      new fri.e<>(Arrays.asList(frh.values()), Codec.INT.xmap(frh::a, frh::a)),
      frh.a,
      $$0x -> this.W.aY().a($$0x)
   );
   public String ab = "en_us";
   private final fri<String> cq = new fri<>(
      "options.audioDevice",
      fri.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xc.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xc.b($$1x.substring(hqc.c)) : xc.b($$1x);
         }
      },
      new fri.h<>(
         () -> Stream.concat(Stream.of(""), frf.Q().ak().a().stream()).toList(),
         $$0x -> frf.Q().r() && $$0x != "" && !frf.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hqf $$1x = frf.Q().ak();
         $$1x.j();
         $$1x.a(hou.a(awr.Bv, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;
   public boolean ae = true;

   public fri<Boolean> a() {
      return this.ak;
   }

   public fri<Boolean> b() {
      return this.am;
   }

   public fri<Boolean> c() {
      return this.ao;
   }

   public fri<Double> d() {
      return this.ap;
   }

   public fri<Integer> e() {
      return this.aq;
   }

   public fri<Integer> f() {
      return this.ar;
   }

   public fri<Double> g() {
      return this.at;
   }

   public fri<Integer> h() {
      return this.au;
   }

   public fri<frb> i() {
      return this.ax;
   }

   public fri<fqr> j() {
      return this.ay;
   }

   public fri<fqx> k() {
      return this.aC;
   }

   public fri<Boolean> l() {
      return this.aD;
   }

   public fri<frl> m() {
      return this.aH;
   }

   public void a(aur $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (auo $$2 : $$0.g()) {
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

   public fri<crw> n() {
      return this.aI;
   }

   public fri<Double> o() {
      return this.aJ;
   }

   public fri<Double> p() {
      return this.aK;
   }

   public fri<Integer> q() {
      return this.aN;
   }

   public int r() {
      return this.q().c();
   }

   public fri<Double> s() {
      return this.aO;
   }

   public fri<Double> t() {
      return this.aP;
   }

   public fri<Boolean> u() {
      return this.aR;
   }

   public fri<Boolean> v() {
      return this.aT;
   }

   public fri<Boolean> w() {
      return this.aU;
   }

   public fri<bxn> x() {
      return this.aW;
   }

   public fri<Double> y() {
      return this.aX;
   }

   public fri<Double> z() {
      return this.aY;
   }

   public fri<Double> A() {
      return this.aZ;
   }

   public fri<Double> B() {
      return this.ba;
   }

   public fri<Double> C() {
      return this.bb;
   }

   public fri<Double> D() {
      return this.bd;
   }

   public fri<Integer> E() {
      return this.be;
   }

   public fri<fqm> F() {
      return this.bf;
   }

   public fri<Integer> G() {
      return this.bg;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return azq.a(Math.log10($$0) * 100.0);
   }

   public fri<Double> H() {
      return this.bh;
   }

   public fri<Boolean> I() {
      return this.bi;
   }

   public fri<Boolean> J() {
      return this.bj;
   }

   public fri<Boolean> K() {
      return this.bl;
   }

   public fri<Boolean> L() {
      return this.bm;
   }

   public fri<Boolean> M() {
      return this.bn;
   }

   public fri<Boolean> N() {
      return this.bo;
   }

   public fri<Boolean> O() {
      return this.bp;
   }

   public fri<Boolean> P() {
      return this.bq;
   }

   public fri<Boolean> Q() {
      return this.br;
   }

   public fri<Boolean> R() {
      return this.bs;
   }

   private static void aI() {
      frf $$0 = frf.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fri<Boolean> S() {
      return this.bt;
   }

   private static boolean aJ() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fri<Boolean> T() {
      return this.bu;
   }

   public fri<Boolean> U() {
      return this.bv;
   }

   public fri<Boolean> V() {
      return this.bw;
   }

   public fri<Boolean> W() {
      return this.by;
   }

   public fri<Boolean> X() {
      return this.bA;
   }

   public fri<Boolean> Y() {
      return this.bB;
   }

   public final float a(aws $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fri<Double> b(aws $$0) {
      return Objects.requireNonNull(this.bC.get($$0));
   }

   private fri<Double> a(String $$0, aws $$1) {
      return new fri<>($$0, fri.a(), frj::b, fri.m.a, 1.0, $$1x -> frf.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fri<Boolean> Z() {
      return this.bD;
   }

   public fri<Boolean> aa() {
      return this.bG;
   }

   public fri<Boolean> ab() {
      return this.bH;
   }

   public fri<Boolean> ac() {
      return this.bI;
   }

   public fri<Boolean> ad() {
      return this.bJ;
   }

   public fri<Boolean> ae() {
      return this.bK;
   }

   public fri<Boolean> af() {
      return this.bN;
   }

   public fri<Boolean> ag() {
      return this.bO;
   }

   public fri<Boolean> ah() {
      return this.bQ;
   }

   public fri<Boolean> ai() {
      return this.bR;
   }

   public fri<Boolean> aj() {
      return this.bT;
   }

   public fri<Integer> ak() {
      return this.bW;
   }

   public fri<Boolean> al() {
      return this.bY;
   }

   public fri<Double> am() {
      return this.ca;
   }

   public fri<Double> an() {
      return this.cc;
   }

   public fri<Double> ao() {
      return this.ce;
   }

   public fri<Double> ap() {
      return this.cg;
   }

   public fri<Double> aq() {
      return this.ci;
   }

   public fri<Double> ar() {
      return this.ck;
   }

   public fri<Double> as() {
      return this.cl;
   }

   public fri<Integer> at() {
      return this.cn;
   }

   public fri<arm> au() {
      return this.co;
   }

   public fri<frh> av() {
      return this.cp;
   }

   public fri<String> aw() {
      return this.cq;
   }

   public void ax() {
      this.ac = false;
      this.az();
   }

   public frj(frf $$0, File $$1) {
      this.W = $$0;
      this.bU = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new fri<>(
         "options.renderDistance",
         fri.a(),
         ($$0x, $$1x) -> a($$0x, xc.a("options.chunks", $$1x)),
         new fri.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> frf.Q().f.o()
      );
      this.ar = new fri<>(
         "options.simulationDistance", fri.a(), ($$0x, $$1x) -> a($$0x, xc.a("options.chunks", $$1x)), new fri.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = ag.n() == ag.a.c;
      this.ay();
   }

   public float a(float $$0) {
      return this.bH.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return aya.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bH.c() ? $$0 : aya.a(this.aO.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(frj.b $$0) {
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

   private void a(frj.a $$0) {
      this.a((frj.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, frj::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, frj::c, ag::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, hrj::a, hrj::a);
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

      for (frd $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fkc.a($$3));
         }
      }

      for (aws $$4 : aws.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bC.get($$4));
      }

      for (csb $$5 : csb.values()) {
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

         ua $$0 = new ua();

         try (BufferedReader $$1 = Files.newReader(this.bU, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = ai.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3x) {
                  af.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final ua $$2 = this.a($$0);
         Optional<String> $$3 = $$2.i("fancyGraphics");
         if ($$3.isPresent() && !$$2.b("graphicsMode")) {
            this.aC.a(a($$3.get()) ? fqx.b : fqx.a);
         }

         this.a(
            new frj.a() {
               @Nullable
               private String a(String $$0) {
                  va $$1 = $$2.a($$0);
                  if ($$1 == null) {
                     return null;
                  } else if ($$1 instanceof uy var3) {
                     uy var10000 = var3;

                     try {
                        var7 = var10000.k();
                     } catch (Throwable var6) {
                        throw new MatchException(var6.toString(), var6);
                     }

                     return var7;
                  } else {
                     throw new IllegalStateException("Cannot read field of wrong type, expected string: " + $$1);
                  }
               }

               @Override
               public <T> void a(String $$0, fri<T> $$1) {
                  String $$2 = this.a($$0);
                  if ($$2 != null) {
                     JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                     JsonElement $$4 = JsonParser.parseReader($$3);
                     $$1.d()
                        .parse(JsonOps.INSTANCE, $$4)
                        .ifError($$2xx -> frj.af.error("Error parsing option value {} for option {}: {}", new Object[]{$$2, $$1, $$2xx.message()}))
                        .ifSuccess($$1::a);
                  }
               }

               @Override
               public int a(String $$0, int $$1) {
                  String $$2 = this.a($$0);
                  if ($$2 != null) {
                     try {
                        return Integer.parseInt($$2);
                     } catch (NumberFormatException var5) {
                        frj.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                     }
                  }

                  return $$1;
               }

               @Override
               public boolean a(String $$0, boolean $$1) {
                  String $$2 = this.a($$0);
                  return $$2 != null ? frj.a($$2) : $$1;
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
                  } else if (frj.a($$2)) {
                     return 1.0F;
                  } else if (frj.b($$2)) {
                     return 0.0F;
                  } else {
                     try {
                        return Float.parseFloat($$2);
                     } catch (NumberFormatException var5) {
                        frj.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
                        return $$1;
                     }
                  }
               }

               @Override
               public <T> T a(String $$0, T $$1, Function<String, T> $$2, Function<T, String> $$3) {
                  String $$4 = this.a($$0);
                  return $$4 == null ? $$1 : $$2.apply($$4);
               }
            }
         );
         $$2.i("fullscreenResolution").ifPresent($$0x -> this.k = $$0x);
         frd.d();
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

   private ua a(ua $$0) {
      int $$1 = 0;

      try {
         $$1 = $$0.i("version").map(Integer::parseInt).orElse(0);
      } catch (RuntimeException var4) {
      }

      return bbf.e.a(this.W.au(), $$0, $$1);
   }

   public void az() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bU), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ac.b().d().c());
         this.a(new frj.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fri<T> $$1) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1x -> frj.af.error("Error saving option " + $$1 + ": " + $$1x)).ifSuccess($$2x -> {
                  this.a($$0);
                  $$0.println(frj.ag.toJson($$2x));
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
      fkm $$0 = this.W.aO();
      if ($$0 == null) {
         return this.k;
      } else {
         return $$0.e().isPresent() ? $$0.e().get().g() : null;
      }
   }

   public are aA() {
      int $$0 = 0;

      for (csb $$1 : this.aV) {
         $$0 |= $$1.a();
      }

      return new are(this.ab, this.aq.c(), this.aI.c(), this.bo.c(), $$0, this.aW.c(), this.W.aT(), this.bA.c(), this.co.c());
   }

   public void aB() {
      if (this.W.t != null) {
         this.W.t.j.a(this.aA());
      }
   }

   public void a(csb $$0, boolean $$1) {
      if ($$1) {
         this.aV.add($$0);
      } else {
         this.aV.remove($$0);
      }
   }

   public boolean a(csb $$0) {
      return this.aV.contains($$0);
   }

   public fqr aC() {
      return this.aH() >= 4 ? this.ay.c() : fqr.a;
   }

   public boolean aD() {
      return this.q;
   }

   public void b(aur $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         auo $$4 = $$0.c($$3);
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

   public fqo aE() {
      return this.bV;
   }

   public void a(fqo $$0) {
      this.bV = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = azg.a(ag, $$0, ah);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aF() {
      return this.bU;
   }

   public String aG() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new frj.b() {
         @Override
         public <T> void a(String $$0x, fri<T> $$1) {
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

   private static xc c(xc $$0, int $$1) {
      return xc.a("options.pixel_value", $$0, $$1);
   }

   private static xc a(xc $$0, double $$1) {
      return xc.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static xc a(xc $$0, xc $$1) {
      return xc.a("options.generic_value", $$0, $$1);
   }

   public static xc a(xc $$0, int $$1) {
      return a($$0, xc.b(Integer.toString($$1)));
   }

   public static xc b(xc $$0, int $$1) {
      return $$1 == 0 ? a($$0, xb.c) : a($$0, $$1);
   }

   private static xc b(xc $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, xb.c) : a($$0, $$1);
   }

   interface a extends frj.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fri<T> var2);
   }
}
