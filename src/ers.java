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
import java.util.Arrays;
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

public class ers {
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
   private static final float ak = 1.0F;
   public static final String g = "";
   private static final ui al = ui.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final err<Boolean> am = err.a("options.darkMojangStudiosBackgroundColor", err.a(al), false);
   private static final ui an = ui.c("options.hideLightningFlashes.tooltip");
   private final err<Boolean> ao = err.a("options.hideLightningFlashes", err.a(an), false);
   private final err<Double> ap = new err<>("options.sensitivity", err.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, ui.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, ui.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, err.m.a, 0.5, $$0x -> {
   });
   private final err<Integer> aq;
   private final err<Integer> ar;
   private int as = 0;
   private final err<Double> at = new err<>(
      "options.entityDistanceScaling",
      err.a(),
      ers::a,
      new err.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final err<Integer> au = new err<>(
      "options.framerateLimit",
      err.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, ui.c("options.framerateLimit.max")) : a($$0x, ui.a("options.framerate", $$1x)),
      new err.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> ero.O().aM().a($$0x)
   );
   private final err<erc> av = new err<>(
      "options.renderClouds",
      err.a(),
      err.b(),
      new err.e<>(Arrays.asList(erc.values()), asg.a(erc.d, Codec.BOOL, $$0x -> $$0x ? erc.c : erc.a)),
      erc.c,
      $$0x -> {
         if (ero.M()) {
            ekt $$1x = ero.O().f.x();
            if ($$1x != null) {
               $$1x.b(ero.a);
            }
         }
      }
   );
   private static final ui aw = ui.c("options.graphics.fast.tooltip");
   private static final ui ax = ui.a("options.graphics.fabulous.tooltip", ui.c("options.graphics.fabulous").a(n.u));
   private static final ui ay = ui.c("options.graphics.fancy.tooltip");
   private final err<erh> az = new err<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> euu.a(ay);
            case a -> euu.a(aw);
            case c -> euu.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         uw $$2x = ui.c($$1x.b());
         return $$1x == erh.c ? $$2x.a(n.u) : $$2x;
      },
      new err.a<>(
         Arrays.asList(erh.values()),
         Stream.of(erh.values()).filter($$0x -> $$0x != erh.c).collect(Collectors.toList()),
         () -> ero.O().r() && ero.O().ah().h(),
         ($$0x, $$1x) -> {
            ero $$2x = ero.O();
            fov $$3x = $$2x.ah();
            if ($$1x == erh.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(erh::a, erh::a)
      ),
      erh.b,
      $$0x -> {
      }
   );
   private final err<Boolean> aA = err.a("options.ao", true, $$0x -> ero.O().f.f());
   private static final ui aB = ui.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final ui aC = ui.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final ui aD = ui.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final err<erv> aE = new err<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> euu.a(aB);
         case b -> euu.a(aC);
         case c -> euu.a(aD);
      };
   }, err.b(), new err.e<>(Arrays.asList(erv.values()), Codec.INT.xmap(erv::a, erv::a)), erv.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final err<ccv> aF = new err<>(
      "options.chat.visibility", err.a(), err.b(), new err.e<>(Arrays.asList(ccv.values()), Codec.INT.xmap(ccv::a, ccv::a)), ccv.a, $$0x -> {
      }
   );
   private final err<Double> aG = new err<>("options.chat.opacity", err.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), err.m.a, 1.0, $$0x -> ero.O().l.d().b());
   private final err<Double> aH = new err<>("options.chat.line_spacing", err.a(), ers::a, err.m.a, 0.0, $$0x -> {
   });
   private final err<Double> aI = new err<>("options.accessibility.text_background_opacity", err.a(), ers::a, err.m.a, 0.5, $$0x -> ero.O().l.d().b());
   private final err<Double> aJ = new err<>("options.accessibility.panorama_speed", err.a(), ers::a, err.m.a, 1.0, $$0x -> {
   });
   private static final ui aK = ui.c("options.accessibility.high_contrast.tooltip");
   private final err<Boolean> aL = err.a("options.accessibility.high_contrast", err.a(aK), false, $$0x -> {
      aoe $$1x = ero.O().aa();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final err<Boolean> aM = err.a("options.accessibility.narrator_hotkey", err.a(ui.c("options.accessibility.narrator_hotkey.tooltip")), true);
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<ccy> aN = EnumSet.allOf(ccy.class);
   private final err<bkd> aO = new err<>("options.mainHand", err.a(), err.b(), new err.e<>(Arrays.asList(bkd.values()), bkd.c), bkd.b, $$0x -> this.at());
   public int o;
   public int p;
   private final err<Double> aP = new err<>(
      "options.chat.scale",
      err.a(),
      ($$0x, $$1x) -> (ui)($$1x == 0.0 ? uh.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      err.m.a,
      1.0,
      $$0x -> ero.O().l.d().b()
   );
   private final err<Double> aQ = new err<>("options.chat.width", err.a(), ($$0x, $$1x) -> b($$0x, etk.a($$1x)), err.m.a, 1.0, $$0x -> ero.O().l.d().b());
   private final err<Double> aR = new err<>(
      "options.chat.height.unfocused", err.a(), ($$0x, $$1x) -> b($$0x, etk.b($$1x)), err.m.a, etk.h(), $$0x -> ero.O().l.d().b()
   );
   private final err<Double> aS = new err<>(
      "options.chat.height.focused", err.a(), ($$0x, $$1x) -> b($$0x, etk.b($$1x)), err.m.a, 1.0, $$0x -> ero.O().l.d().b()
   );
   private final err<Double> aT = new err<>(
      "options.chat.delay_instant",
      err.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? ui.c("options.chat.delay_none") : ui.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new err.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> ero.O().aW().a($$0x)
   );
   private static final ui aU = ui.c("options.notifications.display_time.tooltip");
   private final err<Double> aV = new err<>(
      "options.notifications.display_time",
      err.a(aU),
      ($$0x, $$1x) -> a($$0x, ui.a("options.multiplier", $$1x)),
      new err.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final err<Integer> aW = new err<>(
      "options.mipmapLevels", err.a(), ($$0x, $$1x) -> (ui)($$1x == 0 ? uh.a($$0x, false) : a($$0x, $$1x.intValue())), new err.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final err<eqy> aX = new err<>(
      "options.attackIndicator", err.a(), err.b(), new err.e<>(Arrays.asList(eqy.values()), Codec.INT.xmap(eqy::a, eqy::a)), eqy.b, $$0x -> {
      }
   );
   public gfr r = gfr.a;
   public boolean s = false;
   public boolean t = false;
   private final err<Integer> aY = new err<>("options.biomeBlendRadius", err.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, ui.c("options.biomeBlendRadius." + $$2x));
   }, new err.f(0, 7), 2, $$0x -> ero.O().f.f());
   private final err<Double> aZ = new err<>(
      "options.mouseWheelSensitivity",
      err.a(),
      ($$0x, $$1x) -> a($$0x, ui.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new err.f(-200, 100).a(ers::c, ers::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final err<Boolean> ba = err.a("options.rawMouseInput", true, $$0x -> {
      ell $$1x = ero.O().aM();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final err<Boolean> bb = err.a("options.autoJump", false);
   private final err<Boolean> bc = err.a("options.operatorItemsTab", false);
   private final err<Boolean> bd = err.a("options.autoSuggestCommands", true);
   private final err<Boolean> be = err.a("options.chat.color", true);
   private final err<Boolean> bf = err.a("options.chat.links", true);
   private final err<Boolean> bg = err.a("options.chat.links.prompt", true);
   private final err<Boolean> bh = err.a("options.vsync", true, $$0x -> {
      if (ero.O().aM() != null) {
         ero.O().aM().a($$0x);
      }
   });
   private final err<Boolean> bi = err.a("options.entityShadows", true);
   private final err<Boolean> bj = err.a("options.forceUnicodeFont", false, $$0x -> {
      ero $$1x = ero.O();
      if ($$1x.aM() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final err<Boolean> bk = err.a("options.invertMouse", false);
   private final err<Boolean> bl = err.a("options.discrete_mouse_scroll", false);
   private final err<Boolean> bm = err.a("options.realmsNotifications", true);
   private static final ui bn = ui.c("options.allowServerListing.tooltip");
   private final err<Boolean> bo = err.a("options.allowServerListing", err.a(bn), true, $$0x -> this.at());
   private final err<Boolean> bp = err.a("options.reducedDebugInfo", false);
   private final Map<aqe, err<Double>> bq = ac.a(new EnumMap<>(aqe.class), $$0x -> {
      for (aqe $$1x : aqe.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final err<Boolean> br = err.a("options.showSubtitles", false);
   private static final ui bs = ui.c("options.directionalAudio.on.tooltip");
   private static final ui bt = ui.c("options.directionalAudio.off.tooltip");
   private final err<Boolean> bu = err.a("options.directionalAudio", $$0x -> $$0x ? euu.a(bs) : euu.a(bt), false, $$0x -> {
      gem $$1x = ero.O().ai();
      $$1x.i();
      $$1x.a(gdd.a(aqd.yw, 1.0F));
   });
   private final err<Boolean> bv = new err<>(
      "options.accessibility.text_background",
      err.a(),
      ($$0x, $$1x) -> $$1x ? ui.c("options.accessibility.text_background.chat") : ui.c("options.accessibility.text_background.everywhere"),
      err.a,
      true,
      $$0x -> {
      }
   );
   private final err<Boolean> bw = err.a("options.touchscreen", false);
   private final err<Boolean> bx = err.a("options.fullscreen", false, $$0x -> {
      ero $$1x = ero.O();
      if ($$1x.aM() != null && $$1x.aM().j() != $$0x) {
         $$1x.aM().h();
         this.W().a($$1x.aM().j());
      }
   });
   private final err<Boolean> by = err.a("options.viewBobbing", true);
   private static final ui bz = ui.c("options.key.toggle");
   private static final ui bA = ui.c("options.key.hold");
   private final err<Boolean> bB = new err<>("key.sneak", err.a(), ($$0x, $$1x) -> $$1x ? bz : bA, err.a, false, $$0x -> {
   });
   private final err<Boolean> bC = new err<>("key.sprint", err.a(), ($$0x, $$1x) -> $$1x ? bz : bA, err.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final ui bD = ui.c("options.hideMatchedNames.tooltip");
   private final err<Boolean> bE = err.a("options.hideMatchedNames", err.a(bD), true);
   private final err<Boolean> bF = err.a("options.autosaveIndicator", true);
   private static final ui bG = ui.c("options.onlyShowSecureChat.tooltip");
   private final err<Boolean> bH = err.a("options.onlyShowSecureChat", err.a(bG), false);
   public final erm x = new erm("key.forward", 87, "key.categories.movement");
   public final erm y = new erm("key.left", 65, "key.categories.movement");
   public final erm z = new erm("key.back", 83, "key.categories.movement");
   public final erm A = new erm("key.right", 68, "key.categories.movement");
   public final erm B = new erm("key.jump", 32, "key.categories.movement");
   public final erm C = new esc("key.sneak", 340, "key.categories.movement", this.bB::c);
   public final erm D = new esc("key.sprint", 341, "key.categories.movement", this.bC::c);
   public final erm E = new erm("key.inventory", 69, "key.categories.inventory");
   public final erm F = new erm("key.swapOffhand", 70, "key.categories.inventory");
   public final erm G = new erm("key.drop", 81, "key.categories.inventory");
   public final erm H = new erm("key.use", elc.b.c, 1, "key.categories.gameplay");
   public final erm I = new erm("key.attack", elc.b.c, 0, "key.categories.gameplay");
   public final erm J = new erm("key.pickItem", elc.b.c, 2, "key.categories.gameplay");
   public final erm K = new erm("key.chat", 84, "key.categories.multiplayer");
   public final erm L = new erm("key.playerlist", 258, "key.categories.multiplayer");
   public final erm M = new erm("key.command", 47, "key.categories.multiplayer");
   public final erm N = new erm("key.socialInteractions", 80, "key.categories.multiplayer");
   public final erm O = new erm("key.screenshot", 291, "key.categories.misc");
   public final erm P = new erm("key.togglePerspective", 294, "key.categories.misc");
   public final erm Q = new erm("key.smoothCamera", elc.bv.b(), "key.categories.misc");
   public final erm R = new erm("key.fullscreen", 300, "key.categories.misc");
   public final erm S = new erm("key.spectatorOutlines", elc.bv.b(), "key.categories.misc");
   public final erm T = new erm("key.advancements", 76, "key.categories.misc");
   public final erm[] U = new erm[]{
      new erm("key.hotbar.1", 49, "key.categories.inventory"),
      new erm("key.hotbar.2", 50, "key.categories.inventory"),
      new erm("key.hotbar.3", 51, "key.categories.inventory"),
      new erm("key.hotbar.4", 52, "key.categories.inventory"),
      new erm("key.hotbar.5", 53, "key.categories.inventory"),
      new erm("key.hotbar.6", 54, "key.categories.inventory"),
      new erm("key.hotbar.7", 55, "key.categories.inventory"),
      new erm("key.hotbar.8", 56, "key.categories.inventory"),
      new erm("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final erm V = new erm("key.saveToolbarActivator", 67, "key.categories.creative");
   public final erm W = new erm("key.loadToolbarActivator", 88, "key.categories.creative");
   public final erm[] X = (erm[])ArrayUtils.addAll(
      new erm[]{
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
   protected ero Y;
   private final File bI;
   public boolean Z;
   private era bJ = era.a;
   public String aa = "";
   public boolean ab;
   private final err<Integer> bK = new err<>("options.fov", err.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, ui.c("options.fov.min"));
         case 110 -> a($$0x, ui.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new err.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> ero.O().f.r());
   private static final ui bL = ui.a("options.telemetry.button.tooltip", ui.c("options.telemetry.state.minimal"), ui.c("options.telemetry.state.all"));
   private final err<Boolean> bM = err.a("options.telemetry.button", err.a(bL), ($$0x, $$1x) -> {
      ero $$2x = ero.O();
      if (!$$2x.C()) {
         return ui.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.B() ? ui.c("options.telemetry.state.all") : ui.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final ui bN = ui.c("options.screenEffectScale.tooltip");
   private final err<Double> bO = new err<>(
      "options.screenEffectScale", err.a(bN), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uh.c) : a($$0x, $$1x.doubleValue()), err.m.a, 1.0, $$0x -> {
      }
   );
   private static final ui bP = ui.c("options.fovEffectScale.tooltip");
   private final err<Double> bQ = new err<>(
      "options.fovEffectScale",
      err.a(bP),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uh.c) : a($$0x, $$1x.doubleValue()),
      err.m.a.a(asy::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final ui bR = ui.c("options.darknessEffectScale.tooltip");
   private final err<Double> bS = new err<>(
      "options.darknessEffectScale",
      err.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uh.c) : a($$0x, $$1x.doubleValue()),
      err.m.a.a(asy::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final ui bT = ui.c("options.glintSpeed.tooltip");
   private final err<Double> bU = new err<>(
      "options.glintSpeed", err.a(bT), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uh.c) : a($$0x, $$1x.doubleValue()), err.m.a, 0.5, $$0x -> {
      }
   );
   private static final ui bV = ui.c("options.glintStrength.tooltip");
   private final err<Double> bW = new err<>(
      "options.glintStrength",
      err.a(bV),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uh.c) : a($$0x, $$1x.doubleValue()),
      err.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final ui bX = ui.c("options.damageTiltStrength.tooltip");
   private final err<Double> bY = new err<>(
      "options.damageTiltStrength", err.a(bX), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uh.c) : a($$0x, $$1x.doubleValue()), err.m.a, 1.0, $$0x -> {
      }
   );
   private final err<Double> bZ = new err<>("options.gamma", err.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, ui.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, ui.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, ui.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, err.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int ca = 2147483646;
   private final err<Integer> cb = new err<>(
      "options.guiScale", err.a(), ($$0x, $$1x) -> $$1x == 0 ? ui.c("options.guiScale.auto") : ui.b(Integer.toString($$1x)), new err.c(0, () -> {
         ero $$0x = ero.O();
         return !$$0x.r() ? 2147483646 : $$0x.aM().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final err<ert> cc = new err<>(
      "options.particles", err.a(), err.b(), new err.e<>(Arrays.asList(ert.values()), Codec.INT.xmap(ert::a, ert::a)), ert.a, $$0x -> {
      }
   );
   private final err<erq> cd = new err<>(
      "options.narrator",
      err.a(),
      ($$0x, $$1x) -> (ui)(this.Y.aV().a() ? $$1x.b() : ui.c("options.narrator.notavailable")),
      new err.e<>(Arrays.asList(erq.values()), Codec.INT.xmap(erq::a, erq::a)),
      erq.a,
      $$0x -> this.Y.aV().a($$0x)
   );
   public String ad = "en_us";
   private final err<String> ce = new err<>(
      "options.audioDevice",
      err.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return ui.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? ui.b($$1x.substring(gej.c)) : ui.b($$1x);
         }
      },
      new err.h<>(
         () -> Stream.concat(Stream.of(""), ero.O().ai().a().stream()).toList(),
         $$0x -> ero.O().r() && $$0x != "" && !ero.O().ai().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gem $$1x = ero.O().ai();
         $$1x.i();
         $$1x.a(gdd.a(aqd.yw, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public err<Boolean> a() {
      return this.am;
   }

   public err<Boolean> b() {
      return this.ao;
   }

   public err<Double> c() {
      return this.ap;
   }

   public err<Integer> d() {
      return this.aq;
   }

   public err<Integer> e() {
      return this.ar;
   }

   public err<Double> f() {
      return this.at;
   }

   public err<Integer> g() {
      return this.au;
   }

   public err<erc> h() {
      return this.av;
   }

   public err<erh> i() {
      return this.az;
   }

   public err<Boolean> j() {
      return this.aA;
   }

   public err<erv> k() {
      return this.aE;
   }

   public void a(aoe $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (aob $$2 : $$0.f()) {
         if (!$$2.h()) {
            this.i.add($$2.f());
            if (!$$2.c().a()) {
               this.j.add($$2.f());
            }
         }
      }

      this.ar();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.Y.k();
      }
   }

   public err<ccv> l() {
      return this.aF;
   }

   public err<Double> m() {
      return this.aG;
   }

   public err<Double> n() {
      return this.aH;
   }

   public err<Double> o() {
      return this.aI;
   }

   public err<Double> p() {
      return this.aJ;
   }

   public err<Boolean> q() {
      return this.aL;
   }

   public err<Boolean> r() {
      return this.aM;
   }

   public err<bkd> s() {
      return this.aO;
   }

   public err<Double> t() {
      return this.aP;
   }

   public err<Double> u() {
      return this.aQ;
   }

   public err<Double> v() {
      return this.aR;
   }

   public err<Double> w() {
      return this.aS;
   }

   public err<Double> x() {
      return this.aT;
   }

   public err<Double> y() {
      return this.aV;
   }

   public err<Integer> z() {
      return this.aW;
   }

   public err<eqy> A() {
      return this.aX;
   }

   public err<Integer> B() {
      return this.aY;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return asy.a(Math.log10($$0) * 100.0);
   }

   public err<Double> C() {
      return this.aZ;
   }

   public err<Boolean> D() {
      return this.ba;
   }

   public err<Boolean> E() {
      return this.bb;
   }

   public err<Boolean> F() {
      return this.bc;
   }

   public err<Boolean> G() {
      return this.bd;
   }

   public err<Boolean> H() {
      return this.be;
   }

   public err<Boolean> I() {
      return this.bf;
   }

   public err<Boolean> J() {
      return this.bg;
   }

   public err<Boolean> K() {
      return this.bh;
   }

   public err<Boolean> L() {
      return this.bi;
   }

   public err<Boolean> M() {
      return this.bj;
   }

   public err<Boolean> N() {
      return this.bk;
   }

   public err<Boolean> O() {
      return this.bl;
   }

   public err<Boolean> P() {
      return this.bm;
   }

   public err<Boolean> Q() {
      return this.bo;
   }

   public err<Boolean> R() {
      return this.bp;
   }

   public final float a(aqe $$0) {
      return this.b($$0).c().floatValue();
   }

   public final err<Double> b(aqe $$0) {
      return Objects.requireNonNull(this.bq.get($$0));
   }

   private err<Double> a(String $$0, aqe $$1) {
      return new err<>(
         $$0, err.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, uh.c) : a($$0x, $$1x.doubleValue()), err.m.a, 1.0, $$1x -> ero.O().ai().a($$1, $$1x.floatValue())
      );
   }

   public err<Boolean> S() {
      return this.br;
   }

   public err<Boolean> T() {
      return this.bu;
   }

   public err<Boolean> U() {
      return this.bv;
   }

   public err<Boolean> V() {
      return this.bw;
   }

   public err<Boolean> W() {
      return this.bx;
   }

   public err<Boolean> X() {
      return this.by;
   }

   public err<Boolean> Y() {
      return this.bB;
   }

   public err<Boolean> Z() {
      return this.bC;
   }

   public err<Boolean> aa() {
      return this.bE;
   }

   public err<Boolean> ab() {
      return this.bF;
   }

   public err<Boolean> ac() {
      return this.bH;
   }

   public err<Integer> ad() {
      return this.bK;
   }

   public err<Boolean> ae() {
      return this.bM;
   }

   public err<Double> af() {
      return this.bO;
   }

   public err<Double> ag() {
      return this.bQ;
   }

   public err<Double> ah() {
      return this.bS;
   }

   public err<Double> ai() {
      return this.bU;
   }

   public err<Double> aj() {
      return this.bW;
   }

   public err<Double> ak() {
      return this.bY;
   }

   public err<Double> al() {
      return this.bZ;
   }

   public err<Integer> am() {
      return this.cb;
   }

   public err<ert> an() {
      return this.cc;
   }

   public err<erq> ao() {
      return this.cd;
   }

   public err<String> ap() {
      return this.ce;
   }

   public ers(ero $$0, File $$1) {
      this.Y = $$0;
      this.bI = new File($$1, "options.txt");
      boolean $$2 = $$0.af();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new err<>(
         "options.renderDistance",
         err.a(),
         ($$0x, $$1x) -> a($$0x, ui.a("options.chunks", $$1x)),
         new err.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> ero.O().f.r()
      );
      this.ar = new err<>(
         "options.simulationDistance", err.a(), ($$0x, $$1x) -> a($$0x, ui.a("options.chunks", $$1x)), new err.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
         }
      );
      this.af = ac.i() == ac.a.c;
      this.aq();
   }

   public float a(float $$0) {
      return this.bv.c() ? $$0 : this.o().c().floatValue();
   }

   public int b(float $$0) {
      return (int)(this.a($$0) * 255.0F) << 24 & 0xFF000000;
   }

   public int a(int $$0) {
      return this.bv.c() ? $$0 : (int)(this.aI.c() * 255.0) << 24 & 0xFF000000;
   }

   public void a(erm $$0, elc.a $$1) {
      $$0.b($$1);
      this.ar();
   }

   private void a(ers.a $$0) {
      $$0.a("autoJump", this.bb);
      $$0.a("operatorItemsTab", this.bc);
      $$0.a("autoSuggestions", this.bd);
      $$0.a("chatColors", this.be);
      $$0.a("chatLinks", this.bf);
      $$0.a("chatLinksPrompt", this.bg);
      $$0.a("enableVsync", this.bh);
      $$0.a("entityShadows", this.bi);
      $$0.a("forceUnicodeFont", this.bj);
      $$0.a("discrete_mouse_scroll", this.bl);
      $$0.a("invertYMouse", this.bk);
      $$0.a("realmsNotifications", this.bm);
      $$0.a("reducedDebugInfo", this.bp);
      $$0.a("showSubtitles", this.br);
      $$0.a("directionalAudio", this.bu);
      $$0.a("touchscreen", this.bw);
      $$0.a("fullscreen", this.bx);
      $$0.a("bobView", this.by);
      $$0.a("toggleCrouch", this.bB);
      $$0.a("toggleSprint", this.bC);
      $$0.a("darkMojangStudiosBackground", this.am);
      $$0.a("hideLightningFlashes", this.ao);
      $$0.a("mouseSensitivity", this.ap);
      $$0.a("fov", this.bK);
      $$0.a("screenEffectScale", this.bO);
      $$0.a("fovEffectScale", this.bQ);
      $$0.a("darknessEffectScale", this.bS);
      $$0.a("glintSpeed", this.bU);
      $$0.a("glintStrength", this.bW);
      $$0.a("damageTiltStrength", this.bY);
      $$0.a("highContrast", this.aL);
      $$0.a("narratorHotkey", this.aM);
      $$0.a("gamma", this.bZ);
      $$0.a("renderDistance", this.aq);
      $$0.a("simulationDistance", this.ar);
      $$0.a("entityDistanceScaling", this.at);
      $$0.a("guiScale", this.cb);
      $$0.a("particles", this.cc);
      $$0.a("maxFps", this.au);
      $$0.a("graphicsMode", this.az);
      $$0.a("ao", this.aA);
      $$0.a("prioritizeChunkUpdates", this.aE);
      $$0.a("biomeBlendRadius", this.aY);
      $$0.a("renderClouds", this.av);
      this.i = $$0.a("resourcePacks", this.i, ers::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, ers::c, ah::toJson);
      this.aa = $$0.a("lastServer", this.aa);
      this.ad = $$0.a("lang", this.ad);
      $$0.a("soundDevice", this.ce);
      $$0.a("chatVisibility", this.aF);
      $$0.a("chatOpacity", this.aG);
      $$0.a("chatLineSpacing", this.aH);
      $$0.a("textBackgroundOpacity", this.aI);
      $$0.a("backgroundForChatOnly", this.bv);
      this.l = $$0.a("hideServerAddress", this.l);
      this.m = $$0.a("advancedItemTooltips", this.m);
      this.n = $$0.a("pauseOnLostFocus", this.n);
      this.o = $$0.a("overrideWidth", this.o);
      this.p = $$0.a("overrideHeight", this.p);
      $$0.a("chatHeightFocused", this.aS);
      $$0.a("chatDelay", this.aT);
      $$0.a("chatHeightUnfocused", this.aR);
      $$0.a("chatScale", this.aP);
      $$0.a("chatWidth", this.aQ);
      $$0.a("notificationDisplayTime", this.aV);
      $$0.a("mipmapLevels", this.aW);
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aO);
      $$0.a("attackIndicator", this.aX);
      $$0.a("narrator", this.cd);
      this.r = $$0.a("tutorialStep", this.r, gfr::a, gfr::a);
      $$0.a("mouseWheelSensitivity", this.aZ);
      $$0.a("rawMouseInput", this.ba);
      this.u = $$0.a("glDebugVerbosity", this.u);
      this.v = $$0.a("skipMultiplayerWarning", this.v);
      this.w = $$0.a("skipRealms32bitWarning", this.w);
      $$0.a("hideMatchedNames", this.bE);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.t = $$0.a("hideBundleTutorial", this.t);
      this.af = $$0.a("syncChunkWrites", this.af);
      $$0.a("showAutosaveIndicator", this.bF);
      $$0.a("allowServerListing", this.bo);
      $$0.a("onlyShowSecureChat", this.bH);
      $$0.a("panoramaScrollSpeed", this.aJ);
      $$0.a("telemetryOptInExtra", this.bM);
      this.ae = $$0.a("onboardAccessibility", this.ae);

      for (erm $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(elc.a($$3));
         }
      }

      for (aqe $$4 : aqe.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bq.get($$4));
      }

      for (ccy $$5 : ccy.values()) {
         boolean $$6 = this.aN.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.b($$5, $$7);
         }
      }
   }

   public void aq() {
      try {
         if (!this.bI.exists()) {
            return;
         }

         rt $$0 = new rt();

         try (BufferedReader $$1 = Files.newReader(this.bI, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = aj.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  ag.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final rt $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.az.a(erh.b);
            } else {
               this.az.a(erh.a);
            }
         }

         this.a(new ers.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, err<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> ers.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     ers.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? ers.a($$2) : $$1;
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
               } else if (ers.a($$2)) {
                  return 1.0F;
               } else if (ers.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     ers.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         if (this.Y.aM() != null) {
            this.Y.aM().a(this.au.c());
         }

         erm.d();
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

   private rt a(rt $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return aud.e.a(this.Y.ar(), $$0, $$1);
   }

   public void ar() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bI), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new ers.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, err<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> ers.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(ers.ah.toJson($$2x));
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
         if (this.Y.aM().f().isPresent()) {
            $$0.println("fullscreenResolution:" + this.Y.aM().f().get().g());
         }
      } catch (Exception var6) {
         ag.error("Failed to save options", var6);
      }

      this.at();
   }

   public alf as() {
      int $$0 = 0;

      for (ccy $$1 : this.aN) {
         $$0 |= $$1.a();
      }

      return new alf(this.ad, this.aq.c(), this.aF.c(), this.be.c(), $$0, this.aO.c(), this.Y.aQ(), this.bo.c());
   }

   public void at() {
      if (this.Y.s != null) {
         this.Y.s.cn.b(new wm(this.as()));
      }
   }

   private void b(ccy $$0, boolean $$1) {
      if ($$1) {
         this.aN.add($$0);
      } else {
         this.aN.remove($$0);
      }
   }

   public boolean a(ccy $$0) {
      return this.aN.contains($$0);
   }

   public void a(ccy $$0, boolean $$1) {
      this.b($$0, $$1);
      this.at();
   }

   public erc au() {
      return this.az() >= 4 ? this.av.c() : erc.a;
   }

   public boolean av() {
      return this.q;
   }

   public void b(aoe $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         aob $$4 = $$0.c($$3);
         if ($$4 == null && !$$3.startsWith("file/")) {
            $$4 = $$0.c("file/" + $$3);
         }

         if ($$4 == null) {
            ag.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", $$3);
            $$2.remove();
         } else if (!$$4.c().a() && !this.j.contains($$3)) {
            ag.warn("Removed resource pack {} from options because it is no longer compatible", $$3);
            $$2.remove();
         } else if ($$4.c().a() && this.j.contains($$3)) {
            ag.info("Removed resource pack {} from incompatibility list because it's now compatible", $$3);
            this.j.remove($$3);
         } else {
            $$1.add($$4.f());
         }
      }

      $$0.a($$1);
   }

   public era aw() {
      return this.bJ;
   }

   public void a(era $$0) {
      this.bJ = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = aso.a(ah, $$0, ai);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File ax() {
      return this.bI;
   }

   public String ay() {
      Stream<Pair<String, Object>> $$0 = Stream.<Pair<String, Object>>builder()
         .add(Pair.of("ao", this.aA.c()))
         .add(Pair.of("biomeBlendRadius", this.aY.c()))
         .add(Pair.of("enableVsync", this.bh.c()))
         .add(Pair.of("entityDistanceScaling", this.at.c()))
         .add(Pair.of("entityShadows", this.bi.c()))
         .add(Pair.of("forceUnicodeFont", this.bj.c()))
         .add(Pair.of("fov", this.bK.c()))
         .add(Pair.of("fovEffectScale", this.bQ.c()))
         .add(Pair.of("darknessEffectScale", this.bS.c()))
         .add(Pair.of("glintSpeed", this.bU.c()))
         .add(Pair.of("glintStrength", this.bW.c()))
         .add(Pair.of("prioritizeChunkUpdates", this.aE.c()))
         .add(Pair.of("fullscreen", this.bx.c()))
         .add(Pair.of("fullscreenResolution", String.valueOf(this.k)))
         .add(Pair.of("gamma", this.bZ.c()))
         .add(Pair.of("glDebugVerbosity", this.u))
         .add(Pair.of("graphicsMode", this.az.c()))
         .add(Pair.of("guiScale", this.cb.c()))
         .add(Pair.of("maxFps", this.au.c()))
         .add(Pair.of("mipmapLevels", this.aW.c()))
         .add(Pair.of("narrator", this.cd.c()))
         .add(Pair.of("overrideHeight", this.p))
         .add(Pair.of("overrideWidth", this.o))
         .add(Pair.of("particles", this.cc.c()))
         .add(Pair.of("reducedDebugInfo", this.bp.c()))
         .add(Pair.of("renderClouds", this.av.c()))
         .add(Pair.of("renderDistance", this.aq.c()))
         .add(Pair.of("simulationDistance", this.ar.c()))
         .add(Pair.of("resourcePacks", this.i))
         .add(Pair.of("screenEffectScale", this.bO.c()))
         .add(Pair.of("syncChunkWrites", this.af))
         .add(Pair.of("useNativeTransport", this.q))
         .add(Pair.of("soundDevice", this.ce.c()))
         .build();
      return $$0.<CharSequence>map($$0x -> (String)$$0x.getFirst() + ": " + $$0x.getSecond()).collect(Collectors.joining(System.lineSeparator()));
   }

   public void b(int $$0) {
      this.as = $$0;
   }

   public int az() {
      return this.as > 0 ? Math.min(this.aq.c(), this.as) : this.aq.c();
   }

   private static ui b(ui $$0, int $$1) {
      return ui.a("options.pixel_value", $$0, $$1);
   }

   private static ui a(ui $$0, double $$1) {
      return ui.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static ui a(ui $$0, ui $$1) {
      return ui.a("options.generic_value", $$0, $$1);
   }

   public static ui a(ui $$0, int $$1) {
      return a($$0, ui.b(Integer.toString($$1)));
   }

   interface a {
      <T> void a(String var1, err<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
