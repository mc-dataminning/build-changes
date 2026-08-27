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

public class fcc {
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
   public static final String g = "";
   private static final wi ak = wi.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fcb<Boolean> al = fcb.a("options.darkMojangStudiosBackgroundColor", fcb.a(ak), false);
   private static final wi am = wi.c("options.hideLightningFlashes.tooltip");
   private final fcb<Boolean> an = fcb.a("options.hideLightningFlashes", fcb.a(am), false);
   private static final wi ao = wi.c("options.hideSplashTexts.tooltip");
   private final fcb<Boolean> ap = fcb.a("options.hideSplashTexts", fcb.a(ao), false);
   private final fcb<Double> aq = new fcb<>("options.sensitivity", fcb.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wi.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wi.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fcb.m.a, 0.5, $$0x -> {
   });
   private final fcb<Integer> ar;
   private final fcb<Integer> as;
   private int at = 0;
   private final fcb<Double> au = new fcb<>(
      "options.entityDistanceScaling",
      fcb.a(),
      fcc::a,
      new fcb.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fcb<Integer> av = new fcb<>(
      "options.framerateLimit",
      fcb.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wi.c("options.framerateLimit.max")) : a($$0x, wi.a("options.framerate", $$1x)),
      new fcb.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fby.Q().aO().a($$0x)
   );
   private final fcb<fbm> aw = new fcb<>(
      "options.renderClouds",
      fcb.a(),
      fcb.b(),
      new fcb.e<>(Arrays.asList(fbm.values()), awu.a(fbm.d, Codec.BOOL, $$0x -> $$0x ? fbm.c : fbm.a)),
      fbm.c,
      $$0x -> {
         if (fby.O()) {
            evd $$1x = fby.Q().f.x();
            if ($$1x != null) {
               $$1x.b(fby.a);
            }
         }
      }
   );
   private static final wi ax = wi.c("options.graphics.fast.tooltip");
   private static final wi ay = wi.a("options.graphics.fabulous.tooltip", wi.c("options.graphics.fabulous").a(n.u));
   private static final wi az = wi.c("options.graphics.fancy.tooltip");
   private final fcb<fbr> aA = new fcb<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> ffj.a(az);
            case a -> ffj.a(ax);
            case c -> ffj.a(ay);
         };
      },
      ($$0x, $$1x) -> {
         ww $$2x = wi.c($$1x.b());
         return $$1x == fbr.c ? $$2x.a(n.u) : $$2x;
      },
      new fcb.a<>(
         Arrays.asList(fbr.values()),
         Stream.of(fbr.values()).filter($$0x -> $$0x != fbr.c).collect(Collectors.toList()),
         () -> fby.Q().r() && fby.Q().aj().h(),
         ($$0x, $$1x) -> {
            fby $$2x = fby.Q();
            gac $$3x = $$2x.aj();
            if ($$1x == fbr.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(fbr::a, fbr::a)
      ),
      fbr.b,
      $$0x -> {
      }
   );
   private final fcb<Boolean> aB = fcb.a("options.ao", true, $$0x -> fby.Q().f.f());
   private static final wi aC = wi.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wi aD = wi.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wi aE = wi.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fcb<fcf> aF = new fcb<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> ffj.a(aC);
         case b -> ffj.a(aD);
         case c -> ffj.a(aE);
      };
   }, fcb.b(), new fcb.e<>(Arrays.asList(fcf.values()), Codec.INT.xmap(fcf::a, fcf::a)), fcf.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fcb<cjy> aG = new fcb<>(
      "options.chat.visibility", fcb.a(), fcb.b(), new fcb.e<>(Arrays.asList(cjy.values()), Codec.INT.xmap(cjy::a, cjy::a)), cjy.a, $$0x -> {
      }
   );
   private final fcb<Double> aH = new fcb<>("options.chat.opacity", fcb.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fcb.m.a, 1.0, $$0x -> fby.Q().l.d().b());
   private final fcb<Double> aI = new fcb<>("options.chat.line_spacing", fcb.a(), fcc::a, fcb.m.a, 0.0, $$0x -> {
   });
   private static final wi aJ = wi.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final double aK = 0.5;
   private final fcb<Double> aL = new fcb<>("options.accessibility.menu_background_blurriness", fcb.a(aJ), fcc::a, fcb.m.a, 0.5, $$0x -> {
   });
   private final fcb<Double> aM = new fcb<>("options.accessibility.text_background_opacity", fcb.a(), fcc::a, fcb.m.a, 0.5, $$0x -> fby.Q().l.d().b());
   private final fcb<Double> aN = new fcb<>("options.accessibility.panorama_speed", fcb.a(), fcc::a, fcb.m.a, 1.0, $$0x -> {
   });
   private static final wi aO = wi.c("options.accessibility.high_contrast.tooltip");
   private final fcb<Boolean> aP = fcb.a("options.accessibility.high_contrast", fcb.a(aO), false, $$0x -> {
      asp $$1x = fby.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final fcb<Boolean> aQ = fcb.a(
      "options.accessibility.narrator_hotkey",
      fcb.a(fby.a ? wi.c("options.accessibility.narrator_hotkey.mac.tooltip") : wi.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<ckb> aR = EnumSet.allOf(ckb.class);
   private final fcb<bqn> aS = new fcb<>("options.mainHand", fcb.a(), fcb.b(), new fcb.e<>(Arrays.asList(bqn.values()), bqn.c), bqn.b, $$0x -> this.ax());
   public int o;
   public int p;
   private final fcb<Double> aT = new fcb<>(
      "options.chat.scale",
      fcb.a(),
      ($$0x, $$1x) -> (wi)($$1x == 0.0 ? wh.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fcb.m.a,
      1.0,
      $$0x -> fby.Q().l.d().b()
   );
   private final fcb<Double> aU = new fcb<>("options.chat.width", fcb.a(), ($$0x, $$1x) -> b($$0x, fdz.a($$1x)), fcb.m.a, 1.0, $$0x -> fby.Q().l.d().b());
   private final fcb<Double> aV = new fcb<>(
      "options.chat.height.unfocused", fcb.a(), ($$0x, $$1x) -> b($$0x, fdz.b($$1x)), fcb.m.a, fdz.i(), $$0x -> fby.Q().l.d().b()
   );
   private final fcb<Double> aW = new fcb<>(
      "options.chat.height.focused", fcb.a(), ($$0x, $$1x) -> b($$0x, fdz.b($$1x)), fcb.m.a, 1.0, $$0x -> fby.Q().l.d().b()
   );
   private final fcb<Double> aX = new fcb<>(
      "options.chat.delay_instant",
      fcb.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wi.c("options.chat.delay_none") : wi.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fcb.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fby.Q().aZ().a($$0x)
   );
   private static final wi aY = wi.c("options.notifications.display_time.tooltip");
   private final fcb<Double> aZ = new fcb<>(
      "options.notifications.display_time",
      fcb.a(aY),
      ($$0x, $$1x) -> a($$0x, wi.a("options.multiplier", $$1x)),
      new fcb.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fcb<Integer> ba = new fcb<>(
      "options.mipmapLevels", fcb.a(), ($$0x, $$1x) -> (wi)($$1x == 0 ? wh.a($$0x, false) : a($$0x, $$1x.intValue())), new fcb.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fcb<fbi> bb = new fcb<>(
      "options.attackIndicator", fcb.a(), fcb.b(), new fcb.e<>(Arrays.asList(fbi.values()), Codec.INT.xmap(fbi::a, fbi::a)), fbi.b, $$0x -> {
      }
   );
   public gro r = gro.a;
   public boolean s = false;
   public boolean t = false;
   private final fcb<Integer> bc = new fcb<>("options.biomeBlendRadius", fcb.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wi.c("options.biomeBlendRadius." + $$2x));
   }, new fcb.f(0, 7), 2, $$0x -> fby.Q().f.f());
   private final fcb<Double> bd = new fcb<>(
      "options.mouseWheelSensitivity",
      fcb.a(),
      ($$0x, $$1x) -> a($$0x, wi.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fcb.f(-200, 100).a(fcc::c, fcc::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fcb<Boolean> be = fcb.a("options.rawMouseInput", true, $$0x -> {
      evv $$1x = fby.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final fcb<Boolean> bf = fcb.a("options.autoJump", false);
   private final fcb<Boolean> bg = fcb.a("options.operatorItemsTab", false);
   private final fcb<Boolean> bh = fcb.a("options.autoSuggestCommands", true);
   private final fcb<Boolean> bi = fcb.a("options.chat.color", true);
   private final fcb<Boolean> bj = fcb.a("options.chat.links", true);
   private final fcb<Boolean> bk = fcb.a("options.chat.links.prompt", true);
   private final fcb<Boolean> bl = fcb.a("options.vsync", true, $$0x -> {
      if (fby.Q().aO() != null) {
         fby.Q().aO().a($$0x);
      }
   });
   private final fcb<Boolean> bm = fcb.a("options.entityShadows", true);
   private final fcb<Boolean> bn = fcb.a("options.forceUnicodeFont", false, $$0x -> aE());
   private final fcb<Boolean> bo = fcb.a("options.japaneseGlyphVariants", fcb.a(wi.c("options.japaneseGlyphVariants.tooltip")), aF(), $$0x -> aE());
   private final fcb<Boolean> bp = fcb.a("options.invertMouse", false);
   private final fcb<Boolean> bq = fcb.a("options.discrete_mouse_scroll", false);
   private final fcb<Boolean> br = fcb.a("options.realmsNotifications", true);
   private static final wi bs = wi.c("options.allowServerListing.tooltip");
   private final fcb<Boolean> bt = fcb.a("options.allowServerListing", fcb.a(bs), true, $$0x -> this.ax());
   private final fcb<Boolean> bu = fcb.a("options.reducedDebugInfo", false);
   private final Map<aup, fcb<Double>> bv = ac.a(new EnumMap<>(aup.class), $$0x -> {
      for (aup $$1x : aup.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fcb<Boolean> bw = fcb.a("options.showSubtitles", false);
   private static final wi bx = wi.c("options.directionalAudio.on.tooltip");
   private static final wi by = wi.c("options.directionalAudio.off.tooltip");
   private final fcb<Boolean> bz = fcb.a("options.directionalAudio", $$0x -> $$0x ? ffj.a(bx) : ffj.a(by), false, $$0x -> {
      gqj $$1x = fby.Q().ak();
      $$1x.k();
      $$1x.a(gpa.a(auo.zV, 1.0F));
   });
   private final fcb<Boolean> bA = new fcb<>(
      "options.accessibility.text_background",
      fcb.a(),
      ($$0x, $$1x) -> $$1x ? wi.c("options.accessibility.text_background.chat") : wi.c("options.accessibility.text_background.everywhere"),
      fcb.a,
      true,
      $$0x -> {
      }
   );
   private final fcb<Boolean> bB = fcb.a("options.touchscreen", false);
   private final fcb<Boolean> bC = fcb.a("options.fullscreen", false, $$0x -> {
      fby $$1x = fby.Q();
      if ($$1x.aO() != null && $$1x.aO().j() != $$0x) {
         $$1x.aO().h();
         this.aa().a($$1x.aO().j());
      }
   });
   private final fcb<Boolean> bD = fcb.a("options.viewBobbing", true);
   private static final wi bE = wi.c("options.key.toggle");
   private static final wi bF = wi.c("options.key.hold");
   private final fcb<Boolean> bG = new fcb<>("key.sneak", fcb.a(), ($$0x, $$1x) -> $$1x ? bE : bF, fcb.a, false, $$0x -> {
   });
   private final fcb<Boolean> bH = new fcb<>("key.sprint", fcb.a(), ($$0x, $$1x) -> $$1x ? bE : bF, fcb.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final wi bI = wi.c("options.hideMatchedNames.tooltip");
   private final fcb<Boolean> bJ = fcb.a("options.hideMatchedNames", fcb.a(bI), true);
   private final fcb<Boolean> bK = fcb.a("options.autosaveIndicator", true);
   private static final wi bL = wi.c("options.onlyShowSecureChat.tooltip");
   private final fcb<Boolean> bM = fcb.a("options.onlyShowSecureChat", fcb.a(bL), false);
   public final fbw x = new fbw("key.forward", 87, "key.categories.movement");
   public final fbw y = new fbw("key.left", 65, "key.categories.movement");
   public final fbw z = new fbw("key.back", 83, "key.categories.movement");
   public final fbw A = new fbw("key.right", 68, "key.categories.movement");
   public final fbw B = new fbw("key.jump", 32, "key.categories.movement");
   public final fbw C = new fcm("key.sneak", 340, "key.categories.movement", this.bG::c);
   public final fbw D = new fcm("key.sprint", 341, "key.categories.movement", this.bH::c);
   public final fbw E = new fbw("key.inventory", 69, "key.categories.inventory");
   public final fbw F = new fbw("key.swapOffhand", 70, "key.categories.inventory");
   public final fbw G = new fbw("key.drop", 81, "key.categories.inventory");
   public final fbw H = new fbw("key.use", evm.b.c, 1, "key.categories.gameplay");
   public final fbw I = new fbw("key.attack", evm.b.c, 0, "key.categories.gameplay");
   public final fbw J = new fbw("key.pickItem", evm.b.c, 2, "key.categories.gameplay");
   public final fbw K = new fbw("key.chat", 84, "key.categories.multiplayer");
   public final fbw L = new fbw("key.playerlist", 258, "key.categories.multiplayer");
   public final fbw M = new fbw("key.command", 47, "key.categories.multiplayer");
   public final fbw N = new fbw("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fbw O = new fbw("key.screenshot", 291, "key.categories.misc");
   public final fbw P = new fbw("key.togglePerspective", 294, "key.categories.misc");
   public final fbw Q = new fbw("key.smoothCamera", evm.bv.b(), "key.categories.misc");
   public final fbw R = new fbw("key.fullscreen", 300, "key.categories.misc");
   public final fbw S = new fbw("key.spectatorOutlines", evm.bv.b(), "key.categories.misc");
   public final fbw T = new fbw("key.advancements", 76, "key.categories.misc");
   public final fbw[] U = new fbw[]{
      new fbw("key.hotbar.1", 49, "key.categories.inventory"),
      new fbw("key.hotbar.2", 50, "key.categories.inventory"),
      new fbw("key.hotbar.3", 51, "key.categories.inventory"),
      new fbw("key.hotbar.4", 52, "key.categories.inventory"),
      new fbw("key.hotbar.5", 53, "key.categories.inventory"),
      new fbw("key.hotbar.6", 54, "key.categories.inventory"),
      new fbw("key.hotbar.7", 55, "key.categories.inventory"),
      new fbw("key.hotbar.8", 56, "key.categories.inventory"),
      new fbw("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fbw V = new fbw("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fbw W = new fbw("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fbw[] X = (fbw[])ArrayUtils.addAll(
      new fbw[]{
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
   protected fby Y;
   private final File bN;
   public boolean Z;
   private fbk bO = fbk.a;
   public String aa = "";
   public boolean ab;
   private final fcb<Integer> bP = new fcb<>("options.fov", fcb.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wi.c("options.fov.min"));
         case 110 -> a($$0x, wi.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fcb.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fby.Q().f.r());
   private static final wi bQ = wi.a("options.telemetry.button.tooltip", wi.c("options.telemetry.state.minimal"), wi.c("options.telemetry.state.all"));
   private final fcb<Boolean> bR = fcb.a("options.telemetry.button", fcb.a(bQ), ($$0x, $$1x) -> {
      fby $$2x = fby.Q();
      if (!$$2x.E()) {
         return wi.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wi.c("options.telemetry.state.all") : wi.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wi bS = wi.c("options.screenEffectScale.tooltip");
   private final fcb<Double> bT = new fcb<>(
      "options.screenEffectScale", fcb.a(bS), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wh.c) : a($$0x, $$1x.doubleValue()), fcb.m.a, 1.0, $$0x -> {
      }
   );
   private static final wi bU = wi.c("options.fovEffectScale.tooltip");
   private final fcb<Double> bV = new fcb<>(
      "options.fovEffectScale",
      fcb.a(bU),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wh.c) : a($$0x, $$1x.doubleValue()),
      fcb.m.a.a(axm::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final wi bW = wi.c("options.darknessEffectScale.tooltip");
   private final fcb<Double> bX = new fcb<>(
      "options.darknessEffectScale",
      fcb.a(bW),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wh.c) : a($$0x, $$1x.doubleValue()),
      fcb.m.a.a(axm::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final wi bY = wi.c("options.glintSpeed.tooltip");
   private final fcb<Double> bZ = new fcb<>(
      "options.glintSpeed", fcb.a(bY), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wh.c) : a($$0x, $$1x.doubleValue()), fcb.m.a, 0.5, $$0x -> {
      }
   );
   private static final wi ca = wi.c("options.glintStrength.tooltip");
   private final fcb<Double> cb = new fcb<>(
      "options.glintStrength",
      fcb.a(ca),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wh.c) : a($$0x, $$1x.doubleValue()),
      fcb.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final wi cc = wi.c("options.damageTiltStrength.tooltip");
   private final fcb<Double> cd = new fcb<>(
      "options.damageTiltStrength", fcb.a(cc), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wh.c) : a($$0x, $$1x.doubleValue()), fcb.m.a, 1.0, $$0x -> {
      }
   );
   private final fcb<Double> ce = new fcb<>("options.gamma", fcb.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wi.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wi.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wi.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fcb.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cf = 2147483646;
   private final fcb<Integer> cg = new fcb<>(
      "options.guiScale", fcb.a(), ($$0x, $$1x) -> $$1x == 0 ? wi.c("options.guiScale.auto") : wi.b(Integer.toString($$1x)), new fcb.c(0, () -> {
         fby $$0x = fby.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final fcb<fcd> ch = new fcb<>(
      "options.particles", fcb.a(), fcb.b(), new fcb.e<>(Arrays.asList(fcd.values()), Codec.INT.xmap(fcd::a, fcd::a)), fcd.a, $$0x -> {
      }
   );
   private final fcb<fca> ci = new fcb<>(
      "options.narrator",
      fcb.a(),
      ($$0x, $$1x) -> (wi)(this.Y.aY().a() ? $$1x.b() : wi.c("options.narrator.notavailable")),
      new fcb.e<>(Arrays.asList(fca.values()), Codec.INT.xmap(fca::a, fca::a)),
      fca.a,
      $$0x -> this.Y.aY().a($$0x)
   );
   public String ad = "en_us";
   private final fcb<String> cj = new fcb<>(
      "options.audioDevice",
      fcb.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wi.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wi.b($$1x.substring(gqg.c)) : wi.b($$1x);
         }
      },
      new fcb.h<>(
         () -> Stream.concat(Stream.of(""), fby.Q().ak().a().stream()).toList(),
         $$0x -> fby.Q().r() && $$0x != "" && !fby.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gqj $$1x = fby.Q().ak();
         $$1x.k();
         $$1x.a(gpa.a(auo.zV, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public fcb<Boolean> a() {
      return this.al;
   }

   public fcb<Boolean> b() {
      return this.an;
   }

   public fcb<Boolean> c() {
      return this.ap;
   }

   public fcb<Double> d() {
      return this.aq;
   }

   public fcb<Integer> e() {
      return this.ar;
   }

   public fcb<Integer> f() {
      return this.as;
   }

   public fcb<Double> g() {
      return this.au;
   }

   public fcb<Integer> h() {
      return this.av;
   }

   public fcb<fbm> i() {
      return this.aw;
   }

   public fcb<fbr> j() {
      return this.aA;
   }

   public fcb<Boolean> k() {
      return this.aB;
   }

   public fcb<fcf> l() {
      return this.aF;
   }

   public void a(asp $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (asm $$2 : $$0.f()) {
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
         this.Y.l();
      }
   }

   public fcb<cjy> m() {
      return this.aG;
   }

   public fcb<Double> n() {
      return this.aH;
   }

   public fcb<Double> o() {
      return this.aI;
   }

   public fcb<Double> p() {
      return this.aL;
   }

   public double q() {
      return this.p().c();
   }

   public fcb<Double> r() {
      return this.aM;
   }

   public fcb<Double> s() {
      return this.aN;
   }

   public fcb<Boolean> t() {
      return this.aP;
   }

   public fcb<Boolean> u() {
      return this.aQ;
   }

   public fcb<bqn> v() {
      return this.aS;
   }

   public fcb<Double> w() {
      return this.aT;
   }

   public fcb<Double> x() {
      return this.aU;
   }

   public fcb<Double> y() {
      return this.aV;
   }

   public fcb<Double> z() {
      return this.aW;
   }

   public fcb<Double> A() {
      return this.aX;
   }

   public fcb<Double> B() {
      return this.aZ;
   }

   public fcb<Integer> C() {
      return this.ba;
   }

   public fcb<fbi> D() {
      return this.bb;
   }

   public fcb<Integer> E() {
      return this.bc;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return axm.a(Math.log10($$0) * 100.0);
   }

   public fcb<Double> F() {
      return this.bd;
   }

   public fcb<Boolean> G() {
      return this.be;
   }

   public fcb<Boolean> H() {
      return this.bf;
   }

   public fcb<Boolean> I() {
      return this.bg;
   }

   public fcb<Boolean> J() {
      return this.bh;
   }

   public fcb<Boolean> K() {
      return this.bi;
   }

   public fcb<Boolean> L() {
      return this.bj;
   }

   public fcb<Boolean> M() {
      return this.bk;
   }

   public fcb<Boolean> N() {
      return this.bl;
   }

   public fcb<Boolean> O() {
      return this.bm;
   }

   private static void aE() {
      fby $$0 = fby.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fcb<Boolean> P() {
      return this.bn;
   }

   private static boolean aF() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fcb<Boolean> Q() {
      return this.bo;
   }

   public fcb<Boolean> R() {
      return this.bp;
   }

   public fcb<Boolean> S() {
      return this.bq;
   }

   public fcb<Boolean> T() {
      return this.br;
   }

   public fcb<Boolean> U() {
      return this.bt;
   }

   public fcb<Boolean> V() {
      return this.bu;
   }

   public final float a(aup $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fcb<Double> b(aup $$0) {
      return Objects.requireNonNull(this.bv.get($$0));
   }

   private fcb<Double> a(String $$0, aup $$1) {
      return new fcb<>(
         $$0, fcb.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wh.c) : a($$0x, $$1x.doubleValue()), fcb.m.a, 1.0, $$1x -> fby.Q().ak().a($$1, $$1x.floatValue())
      );
   }

   public fcb<Boolean> W() {
      return this.bw;
   }

   public fcb<Boolean> X() {
      return this.bz;
   }

   public fcb<Boolean> Y() {
      return this.bA;
   }

   public fcb<Boolean> Z() {
      return this.bB;
   }

   public fcb<Boolean> aa() {
      return this.bC;
   }

   public fcb<Boolean> ab() {
      return this.bD;
   }

   public fcb<Boolean> ac() {
      return this.bG;
   }

   public fcb<Boolean> ad() {
      return this.bH;
   }

   public fcb<Boolean> ae() {
      return this.bJ;
   }

   public fcb<Boolean> af() {
      return this.bK;
   }

   public fcb<Boolean> ag() {
      return this.bM;
   }

   public fcb<Integer> ah() {
      return this.bP;
   }

   public fcb<Boolean> ai() {
      return this.bR;
   }

   public fcb<Double> aj() {
      return this.bT;
   }

   public fcb<Double> ak() {
      return this.bV;
   }

   public fcb<Double> al() {
      return this.bX;
   }

   public fcb<Double> am() {
      return this.bZ;
   }

   public fcb<Double> an() {
      return this.cb;
   }

   public fcb<Double> ao() {
      return this.cd;
   }

   public fcb<Double> ap() {
      return this.ce;
   }

   public fcb<Integer> aq() {
      return this.cg;
   }

   public fcb<fcd> ar() {
      return this.ch;
   }

   public fcb<fca> as() {
      return this.ci;
   }

   public fcb<String> at() {
      return this.cj;
   }

   public fcc(fby $$0, File $$1) {
      this.Y = $$0;
      this.bN = new File($$1, "options.txt");
      boolean $$2 = $$0.ah();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ar = new fcb<>(
         "options.renderDistance",
         fcb.a(),
         ($$0x, $$1x) -> a($$0x, wi.a("options.chunks", $$1x)),
         new fcb.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> fby.Q().f.r()
      );
      this.as = new fcb<>(
         "options.simulationDistance", fcb.a(), ($$0x, $$1x) -> a($$0x, wi.a("options.chunks", $$1x)), new fcb.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
         }
      );
      this.af = ac.j() == ac.a.c;
      this.au();
   }

   public float a(float $$0) {
      return this.bA.c() ? $$0 : this.r().c().floatValue();
   }

   public int b(float $$0) {
      return (int)(this.a($$0) * 255.0F) << 24 & 0xFF000000;
   }

   public int a(int $$0) {
      return this.bA.c() ? $$0 : (int)(this.aM.c() * 255.0) << 24 & 0xFF000000;
   }

   public void a(fbw $$0, evm.a $$1) {
      $$0.b($$1);
      this.av();
   }

   private void a(fcc.b $$0) {
      $$0.a("ao", this.aB);
      $$0.a("biomeBlendRadius", this.bc);
      $$0.a("enableVsync", this.bl);
      $$0.a("entityDistanceScaling", this.au);
      $$0.a("entityShadows", this.bm);
      $$0.a("forceUnicodeFont", this.bn);
      $$0.a("japaneseGlyphVariants", this.bo);
      $$0.a("fov", this.bP);
      $$0.a("fovEffectScale", this.bV);
      $$0.a("darknessEffectScale", this.bX);
      $$0.a("glintSpeed", this.bZ);
      $$0.a("glintStrength", this.cb);
      $$0.a("prioritizeChunkUpdates", this.aF);
      $$0.a("fullscreen", this.bC);
      $$0.a("gamma", this.ce);
      $$0.a("graphicsMode", this.aA);
      $$0.a("guiScale", this.cg);
      $$0.a("maxFps", this.av);
      $$0.a("mipmapLevels", this.ba);
      $$0.a("narrator", this.ci);
      $$0.a("particles", this.ch);
      $$0.a("reducedDebugInfo", this.bu);
      $$0.a("renderClouds", this.aw);
      $$0.a("renderDistance", this.ar);
      $$0.a("simulationDistance", this.as);
      $$0.a("screenEffectScale", this.bT);
      $$0.a("soundDevice", this.cj);
   }

   private void a(fcc.a $$0) {
      this.a((fcc.b)$$0);
      $$0.a("autoJump", this.bf);
      $$0.a("operatorItemsTab", this.bg);
      $$0.a("autoSuggestions", this.bh);
      $$0.a("chatColors", this.bi);
      $$0.a("chatLinks", this.bj);
      $$0.a("chatLinksPrompt", this.bk);
      $$0.a("discrete_mouse_scroll", this.bq);
      $$0.a("invertYMouse", this.bp);
      $$0.a("realmsNotifications", this.br);
      $$0.a("showSubtitles", this.bw);
      $$0.a("directionalAudio", this.bz);
      $$0.a("touchscreen", this.bB);
      $$0.a("bobView", this.bD);
      $$0.a("toggleCrouch", this.bG);
      $$0.a("toggleSprint", this.bH);
      $$0.a("darkMojangStudiosBackground", this.al);
      $$0.a("hideLightningFlashes", this.an);
      $$0.a("hideSplashTexts", this.ap);
      $$0.a("mouseSensitivity", this.aq);
      $$0.a("damageTiltStrength", this.cd);
      $$0.a("highContrast", this.aP);
      $$0.a("narratorHotkey", this.aQ);
      this.i = $$0.a("resourcePacks", this.i, fcc::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fcc::c, ah::toJson);
      this.aa = $$0.a("lastServer", this.aa);
      this.ad = $$0.a("lang", this.ad);
      $$0.a("chatVisibility", this.aG);
      $$0.a("chatOpacity", this.aH);
      $$0.a("chatLineSpacing", this.aI);
      $$0.a("textBackgroundOpacity", this.aM);
      $$0.a("backgroundForChatOnly", this.bA);
      this.l = $$0.a("hideServerAddress", this.l);
      this.m = $$0.a("advancedItemTooltips", this.m);
      this.n = $$0.a("pauseOnLostFocus", this.n);
      this.o = $$0.a("overrideWidth", this.o);
      this.p = $$0.a("overrideHeight", this.p);
      $$0.a("chatHeightFocused", this.aW);
      $$0.a("chatDelay", this.aX);
      $$0.a("chatHeightUnfocused", this.aV);
      $$0.a("chatScale", this.aT);
      $$0.a("chatWidth", this.aU);
      $$0.a("notificationDisplayTime", this.aZ);
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aS);
      $$0.a("attackIndicator", this.bb);
      this.r = $$0.a("tutorialStep", this.r, gro::a, gro::a);
      $$0.a("mouseWheelSensitivity", this.bd);
      $$0.a("rawMouseInput", this.be);
      this.u = $$0.a("glDebugVerbosity", this.u);
      this.v = $$0.a("skipMultiplayerWarning", this.v);
      this.w = $$0.a("skipRealms32bitWarning", this.w);
      $$0.a("hideMatchedNames", this.bJ);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.t = $$0.a("hideBundleTutorial", this.t);
      this.af = $$0.a("syncChunkWrites", this.af);
      $$0.a("showAutosaveIndicator", this.bK);
      $$0.a("allowServerListing", this.bt);
      $$0.a("onlyShowSecureChat", this.bM);
      $$0.a("panoramaScrollSpeed", this.aN);
      $$0.a("telemetryOptInExtra", this.bR);
      this.ae = $$0.a("onboardAccessibility", this.ae);
      $$0.a("menuBackgroundBlurriness", this.aL);

      for (fbw $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(evm.a($$3));
         }
      }

      for (aup $$4 : aup.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bv.get($$4));
      }

      for (ckb $$5 : ckb.values()) {
         boolean $$6 = this.aR.contains($$5);
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

         to $$0 = new to();

         try (BufferedReader $$1 = Files.newReader(this.bN, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = aj.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  ag.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final to $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aA.a(fbr.b);
            } else {
               this.aA.a(fbr.a);
            }
         }

         this.a(new fcc.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, fcb<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fcc.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fcc.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fcc.a($$2) : $$1;
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
               } else if (fcc.a($$2)) {
                  return 1.0F;
               } else if (fcc.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fcc.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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
            this.Y.aO().a(this.av.c());
         }

         fbw.d();
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

   private to a(to $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return ays.e.a(this.Y.at(), $$0, $$1);
   }

   public void av() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bN), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new fcc.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fcb<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> fcc.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(fcc.ah.toJson($$2x));
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

      this.ax();
   }

   public apj aw() {
      int $$0 = 0;

      for (ckb $$1 : this.aR) {
         $$0 |= $$1.a();
      }

      return new apj(this.ad, this.ar.c(), this.aG.c(), this.bi.c(), $$0, this.aS.c(), this.Y.aS(), this.bt.c());
   }

   public void ax() {
      if (this.Y.s != null) {
         this.Y.s.cv.b(new zh(this.aw()));
      }
   }

   private void b(ckb $$0, boolean $$1) {
      if ($$1) {
         this.aR.add($$0);
      } else {
         this.aR.remove($$0);
      }
   }

   public boolean a(ckb $$0) {
      return this.aR.contains($$0);
   }

   public void a(ckb $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ax();
   }

   public fbm ay() {
      return this.aD() >= 4 ? this.aw.c() : fbm.a;
   }

   public boolean az() {
      return this.q;
   }

   public void b(asp $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         asm $$4 = $$0.c($$3);
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

   public fbk aA() {
      return this.bO;
   }

   public void a(fbk $$0) {
      this.bO = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = axc.a(ah, $$0, ai);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aB() {
      return this.bN;
   }

   public String aC() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fcc.b() {
         @Override
         public <T> void a(String $$0x, fcb<T> $$1) {
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
      this.at = $$0;
   }

   public int aD() {
      return this.at > 0 ? Math.min(this.ar.c(), this.at) : this.ar.c();
   }

   private static wi b(wi $$0, int $$1) {
      return wi.a("options.pixel_value", $$0, $$1);
   }

   private static wi a(wi $$0, double $$1) {
      return wi.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static wi a(wi $$0, wi $$1) {
      return wi.a("options.generic_value", $$0, $$1);
   }

   public static wi a(wi $$0, int $$1) {
      return a($$0, wi.b(Integer.toString($$1)));
   }

   interface a extends fcc.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fcb<T> var2);
   }
}
