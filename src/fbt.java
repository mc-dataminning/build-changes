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

public class fbt {
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
   private static final wg ak = wg.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fbs<Boolean> al = fbs.a("options.darkMojangStudiosBackgroundColor", fbs.a(ak), false);
   private static final wg am = wg.c("options.hideLightningFlashes.tooltip");
   private final fbs<Boolean> an = fbs.a("options.hideLightningFlashes", fbs.a(am), false);
   private static final wg ao = wg.c("options.hideSplashTexts.tooltip");
   private final fbs<Boolean> ap = fbs.a("options.hideSplashTexts", fbs.a(ao), false);
   private final fbs<Double> aq = new fbs<>("options.sensitivity", fbs.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wg.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wg.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fbs.m.a, 0.5, $$0x -> {
   });
   private final fbs<Integer> ar;
   private final fbs<Integer> as;
   private int at = 0;
   private final fbs<Double> au = new fbs<>(
      "options.entityDistanceScaling",
      fbs.a(),
      fbt::a,
      new fbs.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fbs<Integer> av = new fbs<>(
      "options.framerateLimit",
      fbs.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wg.c("options.framerateLimit.max")) : a($$0x, wg.a("options.framerate", $$1x)),
      new fbs.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fbp.Q().aO().a($$0x)
   );
   private final fbs<fbd> aw = new fbs<>(
      "options.renderClouds",
      fbs.a(),
      fbs.b(),
      new fbs.e<>(Arrays.asList(fbd.values()), aws.a(fbd.d, Codec.BOOL, $$0x -> $$0x ? fbd.c : fbd.a)),
      fbd.c,
      $$0x -> {
         if (fbp.O()) {
            euu $$1x = fbp.Q().f.x();
            if ($$1x != null) {
               $$1x.b(fbp.a);
            }
         }
      }
   );
   private static final wg ax = wg.c("options.graphics.fast.tooltip");
   private static final wg ay = wg.a("options.graphics.fabulous.tooltip", wg.c("options.graphics.fabulous").a(n.u));
   private static final wg az = wg.c("options.graphics.fancy.tooltip");
   private final fbs<fbi> aA = new fbs<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> ffa.a(az);
            case a -> ffa.a(ax);
            case c -> ffa.a(ay);
         };
      },
      ($$0x, $$1x) -> {
         wu $$2x = wg.c($$1x.b());
         return $$1x == fbi.c ? $$2x.a(n.u) : $$2x;
      },
      new fbs.a<>(
         Arrays.asList(fbi.values()),
         Stream.of(fbi.values()).filter($$0x -> $$0x != fbi.c).collect(Collectors.toList()),
         () -> fbp.Q().r() && fbp.Q().aj().h(),
         ($$0x, $$1x) -> {
            fbp $$2x = fbp.Q();
            fzt $$3x = $$2x.aj();
            if ($$1x == fbi.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(fbi::a, fbi::a)
      ),
      fbi.b,
      $$0x -> {
      }
   );
   private final fbs<Boolean> aB = fbs.a("options.ao", true, $$0x -> fbp.Q().f.f());
   private static final wg aC = wg.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wg aD = wg.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wg aE = wg.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fbs<fbw> aF = new fbs<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> ffa.a(aC);
         case b -> ffa.a(aD);
         case c -> ffa.a(aE);
      };
   }, fbs.b(), new fbs.e<>(Arrays.asList(fbw.values()), Codec.INT.xmap(fbw::a, fbw::a)), fbw.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fbs<cjr> aG = new fbs<>(
      "options.chat.visibility", fbs.a(), fbs.b(), new fbs.e<>(Arrays.asList(cjr.values()), Codec.INT.xmap(cjr::a, cjr::a)), cjr.a, $$0x -> {
      }
   );
   private final fbs<Double> aH = new fbs<>("options.chat.opacity", fbs.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fbs.m.a, 1.0, $$0x -> fbp.Q().l.d().b());
   private final fbs<Double> aI = new fbs<>("options.chat.line_spacing", fbs.a(), fbt::a, fbs.m.a, 0.0, $$0x -> {
   });
   private static final wg aJ = wg.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final double aK = 0.5;
   private final fbs<Double> aL = new fbs<>("options.accessibility.menu_background_blurriness", fbs.a(aJ), fbt::a, fbs.m.a, 0.5, $$0x -> {
   });
   private final fbs<Double> aM = new fbs<>("options.accessibility.text_background_opacity", fbs.a(), fbt::a, fbs.m.a, 0.5, $$0x -> fbp.Q().l.d().b());
   private final fbs<Double> aN = new fbs<>("options.accessibility.panorama_speed", fbs.a(), fbt::a, fbs.m.a, 1.0, $$0x -> {
   });
   private static final wg aO = wg.c("options.accessibility.high_contrast.tooltip");
   private final fbs<Boolean> aP = fbs.a("options.accessibility.high_contrast", fbs.a(aO), false, $$0x -> {
      asn $$1x = fbp.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final fbs<Boolean> aQ = fbs.a(
      "options.accessibility.narrator_hotkey",
      fbs.a(fbp.a ? wg.c("options.accessibility.narrator_hotkey.mac.tooltip") : wg.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cju> aR = EnumSet.allOf(cju.class);
   private final fbs<bqi> aS = new fbs<>("options.mainHand", fbs.a(), fbs.b(), new fbs.e<>(Arrays.asList(bqi.values()), bqi.c), bqi.b, $$0x -> this.ax());
   public int o;
   public int p;
   private final fbs<Double> aT = new fbs<>(
      "options.chat.scale",
      fbs.a(),
      ($$0x, $$1x) -> (wg)($$1x == 0.0 ? wf.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fbs.m.a,
      1.0,
      $$0x -> fbp.Q().l.d().b()
   );
   private final fbs<Double> aU = new fbs<>("options.chat.width", fbs.a(), ($$0x, $$1x) -> b($$0x, fdq.a($$1x)), fbs.m.a, 1.0, $$0x -> fbp.Q().l.d().b());
   private final fbs<Double> aV = new fbs<>(
      "options.chat.height.unfocused", fbs.a(), ($$0x, $$1x) -> b($$0x, fdq.b($$1x)), fbs.m.a, fdq.i(), $$0x -> fbp.Q().l.d().b()
   );
   private final fbs<Double> aW = new fbs<>(
      "options.chat.height.focused", fbs.a(), ($$0x, $$1x) -> b($$0x, fdq.b($$1x)), fbs.m.a, 1.0, $$0x -> fbp.Q().l.d().b()
   );
   private final fbs<Double> aX = new fbs<>(
      "options.chat.delay_instant",
      fbs.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wg.c("options.chat.delay_none") : wg.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fbs.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fbp.Q().aZ().a($$0x)
   );
   private static final wg aY = wg.c("options.notifications.display_time.tooltip");
   private final fbs<Double> aZ = new fbs<>(
      "options.notifications.display_time",
      fbs.a(aY),
      ($$0x, $$1x) -> a($$0x, wg.a("options.multiplier", $$1x)),
      new fbs.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fbs<Integer> ba = new fbs<>(
      "options.mipmapLevels", fbs.a(), ($$0x, $$1x) -> (wg)($$1x == 0 ? wf.a($$0x, false) : a($$0x, $$1x.intValue())), new fbs.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fbs<faz> bb = new fbs<>(
      "options.attackIndicator", fbs.a(), fbs.b(), new fbs.e<>(Arrays.asList(faz.values()), Codec.INT.xmap(faz::a, faz::a)), faz.b, $$0x -> {
      }
   );
   public grf r = grf.a;
   public boolean s = false;
   public boolean t = false;
   private final fbs<Integer> bc = new fbs<>("options.biomeBlendRadius", fbs.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wg.c("options.biomeBlendRadius." + $$2x));
   }, new fbs.f(0, 7), 2, $$0x -> fbp.Q().f.f());
   private final fbs<Double> bd = new fbs<>(
      "options.mouseWheelSensitivity",
      fbs.a(),
      ($$0x, $$1x) -> a($$0x, wg.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fbs.f(-200, 100).a(fbt::c, fbt::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fbs<Boolean> be = fbs.a("options.rawMouseInput", true, $$0x -> {
      evm $$1x = fbp.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final fbs<Boolean> bf = fbs.a("options.autoJump", false);
   private final fbs<Boolean> bg = fbs.a("options.operatorItemsTab", false);
   private final fbs<Boolean> bh = fbs.a("options.autoSuggestCommands", true);
   private final fbs<Boolean> bi = fbs.a("options.chat.color", true);
   private final fbs<Boolean> bj = fbs.a("options.chat.links", true);
   private final fbs<Boolean> bk = fbs.a("options.chat.links.prompt", true);
   private final fbs<Boolean> bl = fbs.a("options.vsync", true, $$0x -> {
      if (fbp.Q().aO() != null) {
         fbp.Q().aO().a($$0x);
      }
   });
   private final fbs<Boolean> bm = fbs.a("options.entityShadows", true);
   private final fbs<Boolean> bn = fbs.a("options.forceUnicodeFont", false, $$0x -> aE());
   private final fbs<Boolean> bo = fbs.a("options.japaneseGlyphVariants", fbs.a(wg.c("options.japaneseGlyphVariants.tooltip")), aF(), $$0x -> aE());
   private final fbs<Boolean> bp = fbs.a("options.invertMouse", false);
   private final fbs<Boolean> bq = fbs.a("options.discrete_mouse_scroll", false);
   private final fbs<Boolean> br = fbs.a("options.realmsNotifications", true);
   private static final wg bs = wg.c("options.allowServerListing.tooltip");
   private final fbs<Boolean> bt = fbs.a("options.allowServerListing", fbs.a(bs), true, $$0x -> this.ax());
   private final fbs<Boolean> bu = fbs.a("options.reducedDebugInfo", false);
   private final Map<aun, fbs<Double>> bv = ac.a(new EnumMap<>(aun.class), $$0x -> {
      for (aun $$1x : aun.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fbs<Boolean> bw = fbs.a("options.showSubtitles", false);
   private static final wg bx = wg.c("options.directionalAudio.on.tooltip");
   private static final wg by = wg.c("options.directionalAudio.off.tooltip");
   private final fbs<Boolean> bz = fbs.a("options.directionalAudio", $$0x -> $$0x ? ffa.a(bx) : ffa.a(by), false, $$0x -> {
      gqa $$1x = fbp.Q().ak();
      $$1x.k();
      $$1x.a(gor.a(aum.zV, 1.0F));
   });
   private final fbs<Boolean> bA = new fbs<>(
      "options.accessibility.text_background",
      fbs.a(),
      ($$0x, $$1x) -> $$1x ? wg.c("options.accessibility.text_background.chat") : wg.c("options.accessibility.text_background.everywhere"),
      fbs.a,
      true,
      $$0x -> {
      }
   );
   private final fbs<Boolean> bB = fbs.a("options.touchscreen", false);
   private final fbs<Boolean> bC = fbs.a("options.fullscreen", false, $$0x -> {
      fbp $$1x = fbp.Q();
      if ($$1x.aO() != null && $$1x.aO().j() != $$0x) {
         $$1x.aO().h();
         this.aa().a($$1x.aO().j());
      }
   });
   private final fbs<Boolean> bD = fbs.a("options.viewBobbing", true);
   private static final wg bE = wg.c("options.key.toggle");
   private static final wg bF = wg.c("options.key.hold");
   private final fbs<Boolean> bG = new fbs<>("key.sneak", fbs.a(), ($$0x, $$1x) -> $$1x ? bE : bF, fbs.a, false, $$0x -> {
   });
   private final fbs<Boolean> bH = new fbs<>("key.sprint", fbs.a(), ($$0x, $$1x) -> $$1x ? bE : bF, fbs.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final wg bI = wg.c("options.hideMatchedNames.tooltip");
   private final fbs<Boolean> bJ = fbs.a("options.hideMatchedNames", fbs.a(bI), true);
   private final fbs<Boolean> bK = fbs.a("options.autosaveIndicator", true);
   private static final wg bL = wg.c("options.onlyShowSecureChat.tooltip");
   private final fbs<Boolean> bM = fbs.a("options.onlyShowSecureChat", fbs.a(bL), false);
   public final fbn x = new fbn("key.forward", 87, "key.categories.movement");
   public final fbn y = new fbn("key.left", 65, "key.categories.movement");
   public final fbn z = new fbn("key.back", 83, "key.categories.movement");
   public final fbn A = new fbn("key.right", 68, "key.categories.movement");
   public final fbn B = new fbn("key.jump", 32, "key.categories.movement");
   public final fbn C = new fcd("key.sneak", 340, "key.categories.movement", this.bG::c);
   public final fbn D = new fcd("key.sprint", 341, "key.categories.movement", this.bH::c);
   public final fbn E = new fbn("key.inventory", 69, "key.categories.inventory");
   public final fbn F = new fbn("key.swapOffhand", 70, "key.categories.inventory");
   public final fbn G = new fbn("key.drop", 81, "key.categories.inventory");
   public final fbn H = new fbn("key.use", evd.b.c, 1, "key.categories.gameplay");
   public final fbn I = new fbn("key.attack", evd.b.c, 0, "key.categories.gameplay");
   public final fbn J = new fbn("key.pickItem", evd.b.c, 2, "key.categories.gameplay");
   public final fbn K = new fbn("key.chat", 84, "key.categories.multiplayer");
   public final fbn L = new fbn("key.playerlist", 258, "key.categories.multiplayer");
   public final fbn M = new fbn("key.command", 47, "key.categories.multiplayer");
   public final fbn N = new fbn("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fbn O = new fbn("key.screenshot", 291, "key.categories.misc");
   public final fbn P = new fbn("key.togglePerspective", 294, "key.categories.misc");
   public final fbn Q = new fbn("key.smoothCamera", evd.bv.b(), "key.categories.misc");
   public final fbn R = new fbn("key.fullscreen", 300, "key.categories.misc");
   public final fbn S = new fbn("key.spectatorOutlines", evd.bv.b(), "key.categories.misc");
   public final fbn T = new fbn("key.advancements", 76, "key.categories.misc");
   public final fbn[] U = new fbn[]{
      new fbn("key.hotbar.1", 49, "key.categories.inventory"),
      new fbn("key.hotbar.2", 50, "key.categories.inventory"),
      new fbn("key.hotbar.3", 51, "key.categories.inventory"),
      new fbn("key.hotbar.4", 52, "key.categories.inventory"),
      new fbn("key.hotbar.5", 53, "key.categories.inventory"),
      new fbn("key.hotbar.6", 54, "key.categories.inventory"),
      new fbn("key.hotbar.7", 55, "key.categories.inventory"),
      new fbn("key.hotbar.8", 56, "key.categories.inventory"),
      new fbn("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fbn V = new fbn("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fbn W = new fbn("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fbn[] X = (fbn[])ArrayUtils.addAll(
      new fbn[]{
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
   protected fbp Y;
   private final File bN;
   public boolean Z;
   private fbb bO = fbb.a;
   public String aa = "";
   public boolean ab;
   private final fbs<Integer> bP = new fbs<>("options.fov", fbs.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wg.c("options.fov.min"));
         case 110 -> a($$0x, wg.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fbs.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fbp.Q().f.r());
   private static final wg bQ = wg.a("options.telemetry.button.tooltip", wg.c("options.telemetry.state.minimal"), wg.c("options.telemetry.state.all"));
   private final fbs<Boolean> bR = fbs.a("options.telemetry.button", fbs.a(bQ), ($$0x, $$1x) -> {
      fbp $$2x = fbp.Q();
      if (!$$2x.E()) {
         return wg.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wg.c("options.telemetry.state.all") : wg.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wg bS = wg.c("options.screenEffectScale.tooltip");
   private final fbs<Double> bT = new fbs<>(
      "options.screenEffectScale", fbs.a(bS), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wf.c) : a($$0x, $$1x.doubleValue()), fbs.m.a, 1.0, $$0x -> {
      }
   );
   private static final wg bU = wg.c("options.fovEffectScale.tooltip");
   private final fbs<Double> bV = new fbs<>(
      "options.fovEffectScale",
      fbs.a(bU),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wf.c) : a($$0x, $$1x.doubleValue()),
      fbs.m.a.a(axk::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final wg bW = wg.c("options.darknessEffectScale.tooltip");
   private final fbs<Double> bX = new fbs<>(
      "options.darknessEffectScale",
      fbs.a(bW),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wf.c) : a($$0x, $$1x.doubleValue()),
      fbs.m.a.a(axk::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final wg bY = wg.c("options.glintSpeed.tooltip");
   private final fbs<Double> bZ = new fbs<>(
      "options.glintSpeed", fbs.a(bY), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wf.c) : a($$0x, $$1x.doubleValue()), fbs.m.a, 0.5, $$0x -> {
      }
   );
   private static final wg ca = wg.c("options.glintStrength.tooltip");
   private final fbs<Double> cb = new fbs<>(
      "options.glintStrength",
      fbs.a(ca),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wf.c) : a($$0x, $$1x.doubleValue()),
      fbs.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final wg cc = wg.c("options.damageTiltStrength.tooltip");
   private final fbs<Double> cd = new fbs<>(
      "options.damageTiltStrength", fbs.a(cc), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wf.c) : a($$0x, $$1x.doubleValue()), fbs.m.a, 1.0, $$0x -> {
      }
   );
   private final fbs<Double> ce = new fbs<>("options.gamma", fbs.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wg.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wg.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wg.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fbs.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cf = 2147483646;
   private final fbs<Integer> cg = new fbs<>(
      "options.guiScale", fbs.a(), ($$0x, $$1x) -> $$1x == 0 ? wg.c("options.guiScale.auto") : wg.b(Integer.toString($$1x)), new fbs.c(0, () -> {
         fbp $$0x = fbp.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final fbs<fbu> ch = new fbs<>(
      "options.particles", fbs.a(), fbs.b(), new fbs.e<>(Arrays.asList(fbu.values()), Codec.INT.xmap(fbu::a, fbu::a)), fbu.a, $$0x -> {
      }
   );
   private final fbs<fbr> ci = new fbs<>(
      "options.narrator",
      fbs.a(),
      ($$0x, $$1x) -> (wg)(this.Y.aY().a() ? $$1x.b() : wg.c("options.narrator.notavailable")),
      new fbs.e<>(Arrays.asList(fbr.values()), Codec.INT.xmap(fbr::a, fbr::a)),
      fbr.a,
      $$0x -> this.Y.aY().a($$0x)
   );
   public String ad = "en_us";
   private final fbs<String> cj = new fbs<>(
      "options.audioDevice",
      fbs.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wg.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wg.b($$1x.substring(gpx.c)) : wg.b($$1x);
         }
      },
      new fbs.h<>(
         () -> Stream.concat(Stream.of(""), fbp.Q().ak().a().stream()).toList(),
         $$0x -> fbp.Q().r() && $$0x != "" && !fbp.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gqa $$1x = fbp.Q().ak();
         $$1x.k();
         $$1x.a(gor.a(aum.zV, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public fbs<Boolean> a() {
      return this.al;
   }

   public fbs<Boolean> b() {
      return this.an;
   }

   public fbs<Boolean> c() {
      return this.ap;
   }

   public fbs<Double> d() {
      return this.aq;
   }

   public fbs<Integer> e() {
      return this.ar;
   }

   public fbs<Integer> f() {
      return this.as;
   }

   public fbs<Double> g() {
      return this.au;
   }

   public fbs<Integer> h() {
      return this.av;
   }

   public fbs<fbd> i() {
      return this.aw;
   }

   public fbs<fbi> j() {
      return this.aA;
   }

   public fbs<Boolean> k() {
      return this.aB;
   }

   public fbs<fbw> l() {
      return this.aF;
   }

   public void a(asn $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (ask $$2 : $$0.f()) {
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

   public fbs<cjr> m() {
      return this.aG;
   }

   public fbs<Double> n() {
      return this.aH;
   }

   public fbs<Double> o() {
      return this.aI;
   }

   public fbs<Double> p() {
      return this.aL;
   }

   public double q() {
      return this.p().c();
   }

   public fbs<Double> r() {
      return this.aM;
   }

   public fbs<Double> s() {
      return this.aN;
   }

   public fbs<Boolean> t() {
      return this.aP;
   }

   public fbs<Boolean> u() {
      return this.aQ;
   }

   public fbs<bqi> v() {
      return this.aS;
   }

   public fbs<Double> w() {
      return this.aT;
   }

   public fbs<Double> x() {
      return this.aU;
   }

   public fbs<Double> y() {
      return this.aV;
   }

   public fbs<Double> z() {
      return this.aW;
   }

   public fbs<Double> A() {
      return this.aX;
   }

   public fbs<Double> B() {
      return this.aZ;
   }

   public fbs<Integer> C() {
      return this.ba;
   }

   public fbs<faz> D() {
      return this.bb;
   }

   public fbs<Integer> E() {
      return this.bc;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return axk.a(Math.log10($$0) * 100.0);
   }

   public fbs<Double> F() {
      return this.bd;
   }

   public fbs<Boolean> G() {
      return this.be;
   }

   public fbs<Boolean> H() {
      return this.bf;
   }

   public fbs<Boolean> I() {
      return this.bg;
   }

   public fbs<Boolean> J() {
      return this.bh;
   }

   public fbs<Boolean> K() {
      return this.bi;
   }

   public fbs<Boolean> L() {
      return this.bj;
   }

   public fbs<Boolean> M() {
      return this.bk;
   }

   public fbs<Boolean> N() {
      return this.bl;
   }

   public fbs<Boolean> O() {
      return this.bm;
   }

   private static void aE() {
      fbp $$0 = fbp.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fbs<Boolean> P() {
      return this.bn;
   }

   private static boolean aF() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fbs<Boolean> Q() {
      return this.bo;
   }

   public fbs<Boolean> R() {
      return this.bp;
   }

   public fbs<Boolean> S() {
      return this.bq;
   }

   public fbs<Boolean> T() {
      return this.br;
   }

   public fbs<Boolean> U() {
      return this.bt;
   }

   public fbs<Boolean> V() {
      return this.bu;
   }

   public final float a(aun $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fbs<Double> b(aun $$0) {
      return Objects.requireNonNull(this.bv.get($$0));
   }

   private fbs<Double> a(String $$0, aun $$1) {
      return new fbs<>(
         $$0, fbs.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wf.c) : a($$0x, $$1x.doubleValue()), fbs.m.a, 1.0, $$1x -> fbp.Q().ak().a($$1, $$1x.floatValue())
      );
   }

   public fbs<Boolean> W() {
      return this.bw;
   }

   public fbs<Boolean> X() {
      return this.bz;
   }

   public fbs<Boolean> Y() {
      return this.bA;
   }

   public fbs<Boolean> Z() {
      return this.bB;
   }

   public fbs<Boolean> aa() {
      return this.bC;
   }

   public fbs<Boolean> ab() {
      return this.bD;
   }

   public fbs<Boolean> ac() {
      return this.bG;
   }

   public fbs<Boolean> ad() {
      return this.bH;
   }

   public fbs<Boolean> ae() {
      return this.bJ;
   }

   public fbs<Boolean> af() {
      return this.bK;
   }

   public fbs<Boolean> ag() {
      return this.bM;
   }

   public fbs<Integer> ah() {
      return this.bP;
   }

   public fbs<Boolean> ai() {
      return this.bR;
   }

   public fbs<Double> aj() {
      return this.bT;
   }

   public fbs<Double> ak() {
      return this.bV;
   }

   public fbs<Double> al() {
      return this.bX;
   }

   public fbs<Double> am() {
      return this.bZ;
   }

   public fbs<Double> an() {
      return this.cb;
   }

   public fbs<Double> ao() {
      return this.cd;
   }

   public fbs<Double> ap() {
      return this.ce;
   }

   public fbs<Integer> aq() {
      return this.cg;
   }

   public fbs<fbu> ar() {
      return this.ch;
   }

   public fbs<fbr> as() {
      return this.ci;
   }

   public fbs<String> at() {
      return this.cj;
   }

   public fbt(fbp $$0, File $$1) {
      this.Y = $$0;
      this.bN = new File($$1, "options.txt");
      boolean $$2 = $$0.ah();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ar = new fbs<>(
         "options.renderDistance",
         fbs.a(),
         ($$0x, $$1x) -> a($$0x, wg.a("options.chunks", $$1x)),
         new fbs.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> fbp.Q().f.r()
      );
      this.as = new fbs<>(
         "options.simulationDistance", fbs.a(), ($$0x, $$1x) -> a($$0x, wg.a("options.chunks", $$1x)), new fbs.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
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

   public void a(fbn $$0, evd.a $$1) {
      $$0.b($$1);
      this.av();
   }

   private void a(fbt.b $$0) {
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

   private void a(fbt.a $$0) {
      this.a((fbt.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, fbt::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fbt::c, ah::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, grf::a, grf::a);
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

      for (fbn $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(evd.a($$3));
         }
      }

      for (aun $$4 : aun.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bv.get($$4));
      }

      for (cju $$5 : cju.values()) {
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

         tm $$0 = new tm();

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

         final tm $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aA.a(fbi.b);
            } else {
               this.aA.a(fbi.a);
            }
         }

         this.a(new fbt.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, fbs<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fbt.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fbt.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fbt.a($$2) : $$1;
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
               } else if (fbt.a($$2)) {
                  return 1.0F;
               } else if (fbt.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fbt.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fbn.d();
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

   private tm a(tm $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return ayq.e.a(this.Y.at(), $$0, $$1);
   }

   public void av() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bN), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new fbt.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fbs<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> fbt.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(fbt.ah.toJson($$2x));
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

   public aph aw() {
      int $$0 = 0;

      for (cju $$1 : this.aR) {
         $$0 |= $$1.a();
      }

      return new aph(this.ad, this.ar.c(), this.aG.c(), this.bi.c(), $$0, this.aS.c(), this.Y.aS(), this.bt.c());
   }

   public void ax() {
      if (this.Y.s != null) {
         this.Y.s.ct.b(new zf(this.aw()));
      }
   }

   private void b(cju $$0, boolean $$1) {
      if ($$1) {
         this.aR.add($$0);
      } else {
         this.aR.remove($$0);
      }
   }

   public boolean a(cju $$0) {
      return this.aR.contains($$0);
   }

   public void a(cju $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ax();
   }

   public fbd ay() {
      return this.aD() >= 4 ? this.aw.c() : fbd.a;
   }

   public boolean az() {
      return this.q;
   }

   public void b(asn $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         ask $$4 = $$0.c($$3);
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

   public fbb aA() {
      return this.bO;
   }

   public void a(fbb $$0) {
      this.bO = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = axa.a(ah, $$0, ai);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aB() {
      return this.bN;
   }

   public String aC() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fbt.b() {
         @Override
         public <T> void a(String $$0x, fbs<T> $$1) {
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

   private static wg b(wg $$0, int $$1) {
      return wg.a("options.pixel_value", $$0, $$1);
   }

   private static wg a(wg $$0, double $$1) {
      return wg.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static wg a(wg $$0, wg $$1) {
      return wg.a("options.generic_value", $$0, $$1);
   }

   public static wg a(wg $$0, int $$1) {
      return a($$0, wg.b(Integer.toString($$1)));
   }

   interface a extends fbt.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fbs<T> var2);
   }
}
