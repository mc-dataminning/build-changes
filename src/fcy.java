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

public class fcy {
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
   private static final ws ak = ws.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fcx<Boolean> al = fcx.a("options.darkMojangStudiosBackgroundColor", fcx.a(ak), false);
   private static final ws am = ws.c("options.hideLightningFlashes.tooltip");
   private final fcx<Boolean> an = fcx.a("options.hideLightningFlashes", fcx.a(am), false);
   private static final ws ao = ws.c("options.hideSplashTexts.tooltip");
   private final fcx<Boolean> ap = fcx.a("options.hideSplashTexts", fcx.a(ao), false);
   private final fcx<Double> aq = new fcx<>("options.sensitivity", fcx.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, ws.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, ws.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fcx.m.a, 0.5, $$0x -> {
   });
   private final fcx<Integer> ar;
   private final fcx<Integer> as;
   private int at = 0;
   private final fcx<Double> au = new fcx<>(
      "options.entityDistanceScaling",
      fcx.a(),
      fcy::a,
      new fcx.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fcx<Integer> av = new fcx<>(
      "options.framerateLimit",
      fcx.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, ws.c("options.framerateLimit.max")) : a($$0x, ws.a("options.framerate", $$1x)),
      new fcx.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fcu.Q().aO().a($$0x)
   );
   private final fcx<fci> aw = new fcx<>(
      "options.renderClouds",
      fcx.a(),
      fcx.b(),
      new fcx.e<>(Arrays.asList(fci.values()), axe.a(fci.d, Codec.BOOL, $$0x -> $$0x ? fci.c : fci.a)),
      fci.c,
      $$0x -> {
         if (fcu.O()) {
            evz $$1x = fcu.Q().f.x();
            if ($$1x != null) {
               $$1x.b(fcu.a);
            }
         }
      }
   );
   private static final ws ax = ws.c("options.graphics.fast.tooltip");
   private static final ws ay = ws.a("options.graphics.fabulous.tooltip", ws.c("options.graphics.fabulous").a(n.u));
   private static final ws az = ws.c("options.graphics.fancy.tooltip");
   private final fcx<fcn> aA = new fcx<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fgf.a(az);
            case a -> fgf.a(ax);
            case c -> fgf.a(ay);
         };
      },
      ($$0x, $$1x) -> {
         xg $$2x = ws.c($$1x.b());
         return $$1x == fcn.c ? $$2x.a(n.u) : $$2x;
      },
      new fcx.a<>(
         Arrays.asList(fcn.values()),
         Stream.of(fcn.values()).filter($$0x -> $$0x != fcn.c).collect(Collectors.toList()),
         () -> fcu.Q().r() && fcu.Q().aj().h(),
         ($$0x, $$1x) -> {
            fcu $$2x = fcu.Q();
            gay $$3x = $$2x.aj();
            if ($$1x == fcn.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(fcn::a, fcn::a)
      ),
      fcn.b,
      $$0x -> {
      }
   );
   private final fcx<Boolean> aB = fcx.a("options.ao", true, $$0x -> fcu.Q().f.f());
   private static final ws aC = ws.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final ws aD = ws.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final ws aE = ws.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fcx<fdb> aF = new fcx<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fgf.a(aC);
         case b -> fgf.a(aD);
         case c -> fgf.a(aE);
      };
   }, fcx.b(), new fcx.e<>(Arrays.asList(fdb.values()), Codec.INT.xmap(fdb::a, fdb::a)), fdb.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fcx<ckj> aG = new fcx<>(
      "options.chat.visibility", fcx.a(), fcx.b(), new fcx.e<>(Arrays.asList(ckj.values()), Codec.INT.xmap(ckj::a, ckj::a)), ckj.a, $$0x -> {
      }
   );
   private final fcx<Double> aH = new fcx<>("options.chat.opacity", fcx.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fcx.m.a, 1.0, $$0x -> fcu.Q().l.d().b());
   private final fcx<Double> aI = new fcx<>("options.chat.line_spacing", fcx.a(), fcy::a, fcx.m.a, 0.0, $$0x -> {
   });
   private static final ws aJ = ws.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final double aK = 0.5;
   private final fcx<Double> aL = new fcx<>("options.accessibility.menu_background_blurriness", fcx.a(aJ), fcy::a, fcx.m.a, 0.5, $$0x -> {
   });
   private final fcx<Double> aM = new fcx<>("options.accessibility.text_background_opacity", fcx.a(), fcy::a, fcx.m.a, 0.5, $$0x -> fcu.Q().l.d().b());
   private final fcx<Double> aN = new fcx<>("options.accessibility.panorama_speed", fcx.a(), fcy::a, fcx.m.a, 1.0, $$0x -> {
   });
   private static final ws aO = ws.c("options.accessibility.high_contrast.tooltip");
   private final fcx<Boolean> aP = fcx.a("options.accessibility.high_contrast", fcx.a(aO), false, $$0x -> {
      asz $$1x = fcu.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final fcx<Boolean> aQ = fcx.a(
      "options.accessibility.narrator_hotkey",
      fcx.a(fcu.a ? ws.c("options.accessibility.narrator_hotkey.mac.tooltip") : ws.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<ckm> aR = EnumSet.allOf(ckm.class);
   private final fcx<bqy> aS = new fcx<>("options.mainHand", fcx.a(), fcx.b(), new fcx.e<>(Arrays.asList(bqy.values()), bqy.c), bqy.b, $$0x -> this.ax());
   public int o;
   public int p;
   private final fcx<Double> aT = new fcx<>(
      "options.chat.scale",
      fcx.a(),
      ($$0x, $$1x) -> (ws)($$1x == 0.0 ? wr.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fcx.m.a,
      1.0,
      $$0x -> fcu.Q().l.d().b()
   );
   private final fcx<Double> aU = new fcx<>("options.chat.width", fcx.a(), ($$0x, $$1x) -> b($$0x, fev.a($$1x)), fcx.m.a, 1.0, $$0x -> fcu.Q().l.d().b());
   private final fcx<Double> aV = new fcx<>(
      "options.chat.height.unfocused", fcx.a(), ($$0x, $$1x) -> b($$0x, fev.b($$1x)), fcx.m.a, fev.i(), $$0x -> fcu.Q().l.d().b()
   );
   private final fcx<Double> aW = new fcx<>(
      "options.chat.height.focused", fcx.a(), ($$0x, $$1x) -> b($$0x, fev.b($$1x)), fcx.m.a, 1.0, $$0x -> fcu.Q().l.d().b()
   );
   private final fcx<Double> aX = new fcx<>(
      "options.chat.delay_instant",
      fcx.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? ws.c("options.chat.delay_none") : ws.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fcx.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fcu.Q().aZ().a($$0x)
   );
   private static final ws aY = ws.c("options.notifications.display_time.tooltip");
   private final fcx<Double> aZ = new fcx<>(
      "options.notifications.display_time",
      fcx.a(aY),
      ($$0x, $$1x) -> a($$0x, ws.a("options.multiplier", $$1x)),
      new fcx.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fcx<Integer> ba = new fcx<>(
      "options.mipmapLevels", fcx.a(), ($$0x, $$1x) -> (ws)($$1x == 0 ? wr.a($$0x, false) : a($$0x, $$1x.intValue())), new fcx.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fcx<fce> bb = new fcx<>(
      "options.attackIndicator", fcx.a(), fcx.b(), new fcx.e<>(Arrays.asList(fce.values()), Codec.INT.xmap(fce::a, fce::a)), fce.b, $$0x -> {
      }
   );
   public gsk r = gsk.a;
   public boolean s = false;
   public boolean t = false;
   private final fcx<Integer> bc = new fcx<>("options.biomeBlendRadius", fcx.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, ws.c("options.biomeBlendRadius." + $$2x));
   }, new fcx.f(0, 7), 2, $$0x -> fcu.Q().f.f());
   private final fcx<Double> bd = new fcx<>(
      "options.mouseWheelSensitivity",
      fcx.a(),
      ($$0x, $$1x) -> a($$0x, ws.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fcx.f(-200, 100).a(fcy::c, fcy::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fcx<Boolean> be = fcx.a("options.rawMouseInput", true, $$0x -> {
      ewr $$1x = fcu.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final fcx<Boolean> bf = fcx.a("options.autoJump", false);
   private final fcx<Boolean> bg = fcx.a("options.operatorItemsTab", false);
   private final fcx<Boolean> bh = fcx.a("options.autoSuggestCommands", true);
   private final fcx<Boolean> bi = fcx.a("options.chat.color", true);
   private final fcx<Boolean> bj = fcx.a("options.chat.links", true);
   private final fcx<Boolean> bk = fcx.a("options.chat.links.prompt", true);
   private final fcx<Boolean> bl = fcx.a("options.vsync", true, $$0x -> {
      if (fcu.Q().aO() != null) {
         fcu.Q().aO().a($$0x);
      }
   });
   private final fcx<Boolean> bm = fcx.a("options.entityShadows", true);
   private final fcx<Boolean> bn = fcx.a("options.forceUnicodeFont", false, $$0x -> aE());
   private final fcx<Boolean> bo = fcx.a("options.japaneseGlyphVariants", fcx.a(ws.c("options.japaneseGlyphVariants.tooltip")), aF(), $$0x -> aE());
   private final fcx<Boolean> bp = fcx.a("options.invertMouse", false);
   private final fcx<Boolean> bq = fcx.a("options.discrete_mouse_scroll", false);
   private final fcx<Boolean> br = fcx.a("options.realmsNotifications", true);
   private static final ws bs = ws.c("options.allowServerListing.tooltip");
   private final fcx<Boolean> bt = fcx.a("options.allowServerListing", fcx.a(bs), true, $$0x -> this.ax());
   private final fcx<Boolean> bu = fcx.a("options.reducedDebugInfo", false);
   private final Map<ava, fcx<Double>> bv = ac.a(new EnumMap<>(ava.class), $$0x -> {
      for (ava $$1x : ava.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fcx<Boolean> bw = fcx.a("options.showSubtitles", false);
   private static final ws bx = ws.c("options.directionalAudio.on.tooltip");
   private static final ws by = ws.c("options.directionalAudio.off.tooltip");
   private final fcx<Boolean> bz = fcx.a("options.directionalAudio", $$0x -> $$0x ? fgf.a(bx) : fgf.a(by), false, $$0x -> {
      grf $$1x = fcu.Q().ak();
      $$1x.k();
      $$1x.a(gpw.a(auz.Ac, 1.0F));
   });
   private final fcx<Boolean> bA = new fcx<>(
      "options.accessibility.text_background",
      fcx.a(),
      ($$0x, $$1x) -> $$1x ? ws.c("options.accessibility.text_background.chat") : ws.c("options.accessibility.text_background.everywhere"),
      fcx.a,
      true,
      $$0x -> {
      }
   );
   private final fcx<Boolean> bB = fcx.a("options.touchscreen", false);
   private final fcx<Boolean> bC = fcx.a("options.fullscreen", false, $$0x -> {
      fcu $$1x = fcu.Q();
      if ($$1x.aO() != null && $$1x.aO().j() != $$0x) {
         $$1x.aO().h();
         this.aa().a($$1x.aO().j());
      }
   });
   private final fcx<Boolean> bD = fcx.a("options.viewBobbing", true);
   private static final ws bE = ws.c("options.key.toggle");
   private static final ws bF = ws.c("options.key.hold");
   private final fcx<Boolean> bG = new fcx<>("key.sneak", fcx.a(), ($$0x, $$1x) -> $$1x ? bE : bF, fcx.a, false, $$0x -> {
   });
   private final fcx<Boolean> bH = new fcx<>("key.sprint", fcx.a(), ($$0x, $$1x) -> $$1x ? bE : bF, fcx.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final ws bI = ws.c("options.hideMatchedNames.tooltip");
   private final fcx<Boolean> bJ = fcx.a("options.hideMatchedNames", fcx.a(bI), true);
   private final fcx<Boolean> bK = fcx.a("options.autosaveIndicator", true);
   private static final ws bL = ws.c("options.onlyShowSecureChat.tooltip");
   private final fcx<Boolean> bM = fcx.a("options.onlyShowSecureChat", fcx.a(bL), false);
   public final fcs x = new fcs("key.forward", 87, "key.categories.movement");
   public final fcs y = new fcs("key.left", 65, "key.categories.movement");
   public final fcs z = new fcs("key.back", 83, "key.categories.movement");
   public final fcs A = new fcs("key.right", 68, "key.categories.movement");
   public final fcs B = new fcs("key.jump", 32, "key.categories.movement");
   public final fcs C = new fdi("key.sneak", 340, "key.categories.movement", this.bG::c);
   public final fcs D = new fdi("key.sprint", 341, "key.categories.movement", this.bH::c);
   public final fcs E = new fcs("key.inventory", 69, "key.categories.inventory");
   public final fcs F = new fcs("key.swapOffhand", 70, "key.categories.inventory");
   public final fcs G = new fcs("key.drop", 81, "key.categories.inventory");
   public final fcs H = new fcs("key.use", ewi.b.c, 1, "key.categories.gameplay");
   public final fcs I = new fcs("key.attack", ewi.b.c, 0, "key.categories.gameplay");
   public final fcs J = new fcs("key.pickItem", ewi.b.c, 2, "key.categories.gameplay");
   public final fcs K = new fcs("key.chat", 84, "key.categories.multiplayer");
   public final fcs L = new fcs("key.playerlist", 258, "key.categories.multiplayer");
   public final fcs M = new fcs("key.command", 47, "key.categories.multiplayer");
   public final fcs N = new fcs("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fcs O = new fcs("key.screenshot", 291, "key.categories.misc");
   public final fcs P = new fcs("key.togglePerspective", 294, "key.categories.misc");
   public final fcs Q = new fcs("key.smoothCamera", ewi.bv.b(), "key.categories.misc");
   public final fcs R = new fcs("key.fullscreen", 300, "key.categories.misc");
   public final fcs S = new fcs("key.spectatorOutlines", ewi.bv.b(), "key.categories.misc");
   public final fcs T = new fcs("key.advancements", 76, "key.categories.misc");
   public final fcs[] U = new fcs[]{
      new fcs("key.hotbar.1", 49, "key.categories.inventory"),
      new fcs("key.hotbar.2", 50, "key.categories.inventory"),
      new fcs("key.hotbar.3", 51, "key.categories.inventory"),
      new fcs("key.hotbar.4", 52, "key.categories.inventory"),
      new fcs("key.hotbar.5", 53, "key.categories.inventory"),
      new fcs("key.hotbar.6", 54, "key.categories.inventory"),
      new fcs("key.hotbar.7", 55, "key.categories.inventory"),
      new fcs("key.hotbar.8", 56, "key.categories.inventory"),
      new fcs("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fcs V = new fcs("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fcs W = new fcs("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fcs[] X = (fcs[])ArrayUtils.addAll(
      new fcs[]{
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
   protected fcu Y;
   private final File bN;
   public boolean Z;
   private fcg bO = fcg.a;
   public String aa = "";
   public boolean ab;
   private final fcx<Integer> bP = new fcx<>("options.fov", fcx.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, ws.c("options.fov.min"));
         case 110 -> a($$0x, ws.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fcx.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fcu.Q().f.r());
   private static final ws bQ = ws.a("options.telemetry.button.tooltip", ws.c("options.telemetry.state.minimal"), ws.c("options.telemetry.state.all"));
   private final fcx<Boolean> bR = fcx.a("options.telemetry.button", fcx.a(bQ), ($$0x, $$1x) -> {
      fcu $$2x = fcu.Q();
      if (!$$2x.E()) {
         return ws.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? ws.c("options.telemetry.state.all") : ws.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final ws bS = ws.c("options.screenEffectScale.tooltip");
   private final fcx<Double> bT = new fcx<>(
      "options.screenEffectScale", fcx.a(bS), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wr.c) : a($$0x, $$1x.doubleValue()), fcx.m.a, 1.0, $$0x -> {
      }
   );
   private static final ws bU = ws.c("options.fovEffectScale.tooltip");
   private final fcx<Double> bV = new fcx<>(
      "options.fovEffectScale",
      fcx.a(bU),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wr.c) : a($$0x, $$1x.doubleValue()),
      fcx.m.a.a(axw::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final ws bW = ws.c("options.darknessEffectScale.tooltip");
   private final fcx<Double> bX = new fcx<>(
      "options.darknessEffectScale",
      fcx.a(bW),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wr.c) : a($$0x, $$1x.doubleValue()),
      fcx.m.a.a(axw::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final ws bY = ws.c("options.glintSpeed.tooltip");
   private final fcx<Double> bZ = new fcx<>(
      "options.glintSpeed", fcx.a(bY), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wr.c) : a($$0x, $$1x.doubleValue()), fcx.m.a, 0.5, $$0x -> {
      }
   );
   private static final ws ca = ws.c("options.glintStrength.tooltip");
   private final fcx<Double> cb = new fcx<>(
      "options.glintStrength",
      fcx.a(ca),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wr.c) : a($$0x, $$1x.doubleValue()),
      fcx.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final ws cc = ws.c("options.damageTiltStrength.tooltip");
   private final fcx<Double> cd = new fcx<>(
      "options.damageTiltStrength", fcx.a(cc), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wr.c) : a($$0x, $$1x.doubleValue()), fcx.m.a, 1.0, $$0x -> {
      }
   );
   private final fcx<Double> ce = new fcx<>("options.gamma", fcx.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, ws.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, ws.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, ws.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fcx.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cf = 2147483646;
   private final fcx<Integer> cg = new fcx<>(
      "options.guiScale", fcx.a(), ($$0x, $$1x) -> $$1x == 0 ? ws.c("options.guiScale.auto") : ws.b(Integer.toString($$1x)), new fcx.c(0, () -> {
         fcu $$0x = fcu.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final fcx<fcz> ch = new fcx<>(
      "options.particles", fcx.a(), fcx.b(), new fcx.e<>(Arrays.asList(fcz.values()), Codec.INT.xmap(fcz::a, fcz::a)), fcz.a, $$0x -> {
      }
   );
   private final fcx<fcw> ci = new fcx<>(
      "options.narrator",
      fcx.a(),
      ($$0x, $$1x) -> (ws)(this.Y.aY().a() ? $$1x.b() : ws.c("options.narrator.notavailable")),
      new fcx.e<>(Arrays.asList(fcw.values()), Codec.INT.xmap(fcw::a, fcw::a)),
      fcw.a,
      $$0x -> this.Y.aY().a($$0x)
   );
   public String ad = "en_us";
   private final fcx<String> cj = new fcx<>(
      "options.audioDevice",
      fcx.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return ws.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? ws.b($$1x.substring(grc.c)) : ws.b($$1x);
         }
      },
      new fcx.h<>(
         () -> Stream.concat(Stream.of(""), fcu.Q().ak().a().stream()).toList(),
         $$0x -> fcu.Q().r() && $$0x != "" && !fcu.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         grf $$1x = fcu.Q().ak();
         $$1x.k();
         $$1x.a(gpw.a(auz.Ac, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public fcx<Boolean> a() {
      return this.al;
   }

   public fcx<Boolean> b() {
      return this.an;
   }

   public fcx<Boolean> c() {
      return this.ap;
   }

   public fcx<Double> d() {
      return this.aq;
   }

   public fcx<Integer> e() {
      return this.ar;
   }

   public fcx<Integer> f() {
      return this.as;
   }

   public fcx<Double> g() {
      return this.au;
   }

   public fcx<Integer> h() {
      return this.av;
   }

   public fcx<fci> i() {
      return this.aw;
   }

   public fcx<fcn> j() {
      return this.aA;
   }

   public fcx<Boolean> k() {
      return this.aB;
   }

   public fcx<fdb> l() {
      return this.aF;
   }

   public void a(asz $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (asw $$2 : $$0.f()) {
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

   public fcx<ckj> m() {
      return this.aG;
   }

   public fcx<Double> n() {
      return this.aH;
   }

   public fcx<Double> o() {
      return this.aI;
   }

   public fcx<Double> p() {
      return this.aL;
   }

   public double q() {
      return this.p().c();
   }

   public fcx<Double> r() {
      return this.aM;
   }

   public fcx<Double> s() {
      return this.aN;
   }

   public fcx<Boolean> t() {
      return this.aP;
   }

   public fcx<Boolean> u() {
      return this.aQ;
   }

   public fcx<bqy> v() {
      return this.aS;
   }

   public fcx<Double> w() {
      return this.aT;
   }

   public fcx<Double> x() {
      return this.aU;
   }

   public fcx<Double> y() {
      return this.aV;
   }

   public fcx<Double> z() {
      return this.aW;
   }

   public fcx<Double> A() {
      return this.aX;
   }

   public fcx<Double> B() {
      return this.aZ;
   }

   public fcx<Integer> C() {
      return this.ba;
   }

   public fcx<fce> D() {
      return this.bb;
   }

   public fcx<Integer> E() {
      return this.bc;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return axw.a(Math.log10($$0) * 100.0);
   }

   public fcx<Double> F() {
      return this.bd;
   }

   public fcx<Boolean> G() {
      return this.be;
   }

   public fcx<Boolean> H() {
      return this.bf;
   }

   public fcx<Boolean> I() {
      return this.bg;
   }

   public fcx<Boolean> J() {
      return this.bh;
   }

   public fcx<Boolean> K() {
      return this.bi;
   }

   public fcx<Boolean> L() {
      return this.bj;
   }

   public fcx<Boolean> M() {
      return this.bk;
   }

   public fcx<Boolean> N() {
      return this.bl;
   }

   public fcx<Boolean> O() {
      return this.bm;
   }

   private static void aE() {
      fcu $$0 = fcu.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fcx<Boolean> P() {
      return this.bn;
   }

   private static boolean aF() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fcx<Boolean> Q() {
      return this.bo;
   }

   public fcx<Boolean> R() {
      return this.bp;
   }

   public fcx<Boolean> S() {
      return this.bq;
   }

   public fcx<Boolean> T() {
      return this.br;
   }

   public fcx<Boolean> U() {
      return this.bt;
   }

   public fcx<Boolean> V() {
      return this.bu;
   }

   public final float a(ava $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fcx<Double> b(ava $$0) {
      return Objects.requireNonNull(this.bv.get($$0));
   }

   private fcx<Double> a(String $$0, ava $$1) {
      return new fcx<>(
         $$0, fcx.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, wr.c) : a($$0x, $$1x.doubleValue()), fcx.m.a, 1.0, $$1x -> fcu.Q().ak().a($$1, $$1x.floatValue())
      );
   }

   public fcx<Boolean> W() {
      return this.bw;
   }

   public fcx<Boolean> X() {
      return this.bz;
   }

   public fcx<Boolean> Y() {
      return this.bA;
   }

   public fcx<Boolean> Z() {
      return this.bB;
   }

   public fcx<Boolean> aa() {
      return this.bC;
   }

   public fcx<Boolean> ab() {
      return this.bD;
   }

   public fcx<Boolean> ac() {
      return this.bG;
   }

   public fcx<Boolean> ad() {
      return this.bH;
   }

   public fcx<Boolean> ae() {
      return this.bJ;
   }

   public fcx<Boolean> af() {
      return this.bK;
   }

   public fcx<Boolean> ag() {
      return this.bM;
   }

   public fcx<Integer> ah() {
      return this.bP;
   }

   public fcx<Boolean> ai() {
      return this.bR;
   }

   public fcx<Double> aj() {
      return this.bT;
   }

   public fcx<Double> ak() {
      return this.bV;
   }

   public fcx<Double> al() {
      return this.bX;
   }

   public fcx<Double> am() {
      return this.bZ;
   }

   public fcx<Double> an() {
      return this.cb;
   }

   public fcx<Double> ao() {
      return this.cd;
   }

   public fcx<Double> ap() {
      return this.ce;
   }

   public fcx<Integer> aq() {
      return this.cg;
   }

   public fcx<fcz> ar() {
      return this.ch;
   }

   public fcx<fcw> as() {
      return this.ci;
   }

   public fcx<String> at() {
      return this.cj;
   }

   public fcy(fcu $$0, File $$1) {
      this.Y = $$0;
      this.bN = new File($$1, "options.txt");
      boolean $$2 = $$0.ah();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ar = new fcx<>(
         "options.renderDistance",
         fcx.a(),
         ($$0x, $$1x) -> a($$0x, ws.a("options.chunks", $$1x)),
         new fcx.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> fcu.Q().f.r()
      );
      this.as = new fcx<>(
         "options.simulationDistance", fcx.a(), ($$0x, $$1x) -> a($$0x, ws.a("options.chunks", $$1x)), new fcx.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
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

   public void a(fcs $$0, ewi.a $$1) {
      $$0.b($$1);
      this.av();
   }

   private void a(fcy.b $$0) {
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

   private void a(fcy.a $$0) {
      this.a((fcy.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, fcy::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fcy::c, ah::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, gsk::a, gsk::a);
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

      for (fcs $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(ewi.a($$3));
         }
      }

      for (ava $$4 : ava.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bv.get($$4));
      }

      for (ckm $$5 : ckm.values()) {
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

         ty $$0 = new ty();

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

         final ty $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aA.a(fcn.b);
            } else {
               this.aA.a(fcn.a);
            }
         }

         this.a(new fcy.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, fcx<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fcy.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fcy.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fcy.a($$2) : $$1;
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
               } else if (fcy.a($$2)) {
                  return 1.0F;
               } else if (fcy.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fcy.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fcs.d();
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

   private ty a(ty $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return azc.e.a(this.Y.at(), $$0, $$1);
   }

   public void av() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bN), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new fcy.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fcx<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> fcy.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(fcy.ah.toJson($$2x));
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

   public apt aw() {
      int $$0 = 0;

      for (ckm $$1 : this.aR) {
         $$0 |= $$1.a();
      }

      return new apt(this.ad, this.ar.c(), this.aG.c(), this.bi.c(), $$0, this.aS.c(), this.Y.aS(), this.bt.c());
   }

   public void ax() {
      if (this.Y.s != null) {
         this.Y.s.h.b(new zr(this.aw()));
      }
   }

   private void b(ckm $$0, boolean $$1) {
      if ($$1) {
         this.aR.add($$0);
      } else {
         this.aR.remove($$0);
      }
   }

   public boolean a(ckm $$0) {
      return this.aR.contains($$0);
   }

   public void a(ckm $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ax();
   }

   public fci ay() {
      return this.aD() >= 4 ? this.aw.c() : fci.a;
   }

   public boolean az() {
      return this.q;
   }

   public void b(asz $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         asw $$4 = $$0.c($$3);
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

   public fcg aA() {
      return this.bO;
   }

   public void a(fcg $$0) {
      this.bO = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = axm.a(ah, $$0, ai);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aB() {
      return this.bN;
   }

   public String aC() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fcy.b() {
         @Override
         public <T> void a(String $$0x, fcx<T> $$1) {
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

   private static ws b(ws $$0, int $$1) {
      return ws.a("options.pixel_value", $$0, $$1);
   }

   private static ws a(ws $$0, double $$1) {
      return ws.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static ws a(ws $$0, ws $$1) {
      return ws.a("options.generic_value", $$0, $$1);
   }

   public static ws a(ws $$0, int $$1) {
      return a($$0, ws.b(Integer.toString($$1)));
   }

   interface a extends fcy.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fcx<T> var2);
   }
}
