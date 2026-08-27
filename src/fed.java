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

public class fed {
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
   private static final wx ak = wx.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fec<Boolean> al = fec.a("options.darkMojangStudiosBackgroundColor", fec.a(ak), false);
   private static final wx am = wx.c("options.hideLightningFlashes.tooltip");
   private final fec<Boolean> an = fec.a("options.hideLightningFlashes", fec.a(am), false);
   private static final wx ao = wx.c("options.hideSplashTexts.tooltip");
   private final fec<Boolean> ap = fec.a("options.hideSplashTexts", fec.a(ao), false);
   private final fec<Double> aq = new fec<>("options.sensitivity", fec.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wx.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wx.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fec.m.a, 0.5, $$0x -> {
   });
   private final fec<Integer> ar;
   private final fec<Integer> as;
   private int at = 0;
   private final fec<Double> au = new fec<>(
      "options.entityDistanceScaling",
      fec.a(),
      fed::a,
      new fec.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fec<Integer> av = new fec<>(
      "options.framerateLimit",
      fec.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wx.c("options.framerateLimit.max")) : a($$0x, wx.a("options.framerate", $$1x)),
      new fec.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fdz.Q().aP().a($$0x)
   );
   private final fec<fdn> aw = new fec<>(
      "options.renderClouds",
      fec.a(),
      fec.b(),
      new fec.e<>(Arrays.asList(fdn.values()), Codec.withAlternative(fdn.d, Codec.BOOL, $$0x -> $$0x ? fdn.c : fdn.a)),
      fdn.c,
      $$0x -> {
         if (fdz.O()) {
            exe $$1x = fdz.Q().f.x();
            if ($$1x != null) {
               $$1x.b(fdz.a);
            }
         }
      }
   );
   private static final wx ax = wx.c("options.graphics.fast.tooltip");
   private static final wx ay = wx.a("options.graphics.fabulous.tooltip", wx.c("options.graphics.fabulous").a(n.u));
   private static final wx az = wx.c("options.graphics.fancy.tooltip");
   private final fec<fds> aA = new fec<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fhk.a(az);
            case a -> fhk.a(ax);
            case c -> fhk.a(ay);
         };
      },
      ($$0x, $$1x) -> {
         xl $$2x = wx.c($$1x.b());
         return $$1x == fds.c ? $$2x.a(n.u) : $$2x;
      },
      new fec.a<>(
         Arrays.asList(fds.values()),
         Stream.of(fds.values()).filter($$0x -> $$0x != fds.c).collect(Collectors.toList()),
         () -> fdz.Q().r() && fdz.Q().aj().h(),
         ($$0x, $$1x) -> {
            fdz $$2x = fdz.Q();
            gce $$3x = $$2x.aj();
            if ($$1x == fds.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(fds::a, fds::a)
      ),
      fds.b,
      $$0x -> {
      }
   );
   private final fec<Boolean> aB = fec.a("options.ao", true, $$0x -> fdz.Q().f.f());
   private static final wx aC = wx.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wx aD = wx.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wx aE = wx.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fec<feg> aF = new fec<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fhk.a(aC);
         case b -> fhk.a(aD);
         case c -> fhk.a(aE);
      };
   }, fec.b(), new fec.e<>(Arrays.asList(feg.values()), Codec.INT.xmap(feg::a, feg::a)), feg.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fec<clu> aG = new fec<>(
      "options.chat.visibility", fec.a(), fec.b(), new fec.e<>(Arrays.asList(clu.values()), Codec.INT.xmap(clu::a, clu::a)), clu.a, $$0x -> {
      }
   );
   private final fec<Double> aH = new fec<>("options.chat.opacity", fec.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fec.m.a, 1.0, $$0x -> fdz.Q().l.d().b());
   private final fec<Double> aI = new fec<>("options.chat.line_spacing", fec.a(), fed::a, fec.m.a, 0.0, $$0x -> {
   });
   private static final wx aJ = wx.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final double aK = 0.5;
   private final fec<Double> aL = new fec<>("options.accessibility.menu_background_blurriness", fec.a(aJ), fed::a, fec.m.a, 0.5, $$0x -> {
   });
   private final fec<Double> aM = new fec<>("options.accessibility.text_background_opacity", fec.a(), fed::a, fec.m.a, 0.5, $$0x -> fdz.Q().l.d().b());
   private final fec<Double> aN = new fec<>("options.accessibility.panorama_speed", fec.a(), fed::a, fec.m.a, 1.0, $$0x -> {
   });
   private static final wx aO = wx.c("options.accessibility.high_contrast.tooltip");
   private final fec<Boolean> aP = fec.a("options.accessibility.high_contrast", fec.a(aO), false, $$0x -> {
      ath $$1x = fdz.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final fec<Boolean> aQ = fec.a(
      "options.accessibility.narrator_hotkey",
      fec.a(fdz.a ? wx.c("options.accessibility.narrator_hotkey.mac.tooltip") : wx.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<clx> aR = EnumSet.allOf(clx.class);
   private final fec<bsi> aS = new fec<>("options.mainHand", fec.a(), fec.b(), new fec.e<>(Arrays.asList(bsi.values()), bsi.c), bsi.b, $$0x -> this.ax());
   public int o;
   public int p;
   private final fec<Double> aT = new fec<>(
      "options.chat.scale",
      fec.a(),
      ($$0x, $$1x) -> (wx)($$1x == 0.0 ? ww.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fec.m.a,
      1.0,
      $$0x -> fdz.Q().l.d().b()
   );
   private final fec<Double> aU = new fec<>("options.chat.width", fec.a(), ($$0x, $$1x) -> b($$0x, fga.a($$1x)), fec.m.a, 1.0, $$0x -> fdz.Q().l.d().b());
   private final fec<Double> aV = new fec<>(
      "options.chat.height.unfocused", fec.a(), ($$0x, $$1x) -> b($$0x, fga.b($$1x)), fec.m.a, fga.i(), $$0x -> fdz.Q().l.d().b()
   );
   private final fec<Double> aW = new fec<>(
      "options.chat.height.focused", fec.a(), ($$0x, $$1x) -> b($$0x, fga.b($$1x)), fec.m.a, 1.0, $$0x -> fdz.Q().l.d().b()
   );
   private final fec<Double> aX = new fec<>(
      "options.chat.delay_instant",
      fec.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wx.c("options.chat.delay_none") : wx.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fec.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fdz.Q().ba().a($$0x)
   );
   private static final wx aY = wx.c("options.notifications.display_time.tooltip");
   private final fec<Double> aZ = new fec<>(
      "options.notifications.display_time",
      fec.a(aY),
      ($$0x, $$1x) -> a($$0x, wx.a("options.multiplier", $$1x)),
      new fec.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fec<Integer> ba = new fec<>(
      "options.mipmapLevels", fec.a(), ($$0x, $$1x) -> (wx)($$1x == 0 ? ww.a($$0x, false) : a($$0x, $$1x.intValue())), new fec.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fec<fdj> bb = new fec<>(
      "options.attackIndicator", fec.a(), fec.b(), new fec.e<>(Arrays.asList(fdj.values()), Codec.INT.xmap(fdj::a, fdj::a)), fdj.b, $$0x -> {
      }
   );
   public gts r = gts.a;
   public boolean s = false;
   public boolean t = false;
   private final fec<Integer> bc = new fec<>("options.biomeBlendRadius", fec.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wx.c("options.biomeBlendRadius." + $$2x));
   }, new fec.f(0, 7), 2, $$0x -> fdz.Q().f.f());
   private final fec<Double> bd = new fec<>(
      "options.mouseWheelSensitivity",
      fec.a(),
      ($$0x, $$1x) -> a($$0x, wx.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fec.f(-200, 100).a(fed::c, fed::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fec<Boolean> be = fec.a("options.rawMouseInput", true, $$0x -> {
      exw $$1x = fdz.Q().aP();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final fec<Boolean> bf = fec.a("options.autoJump", false);
   private final fec<Boolean> bg = fec.a("options.operatorItemsTab", false);
   private final fec<Boolean> bh = fec.a("options.autoSuggestCommands", true);
   private final fec<Boolean> bi = fec.a("options.chat.color", true);
   private final fec<Boolean> bj = fec.a("options.chat.links", true);
   private final fec<Boolean> bk = fec.a("options.chat.links.prompt", true);
   private final fec<Boolean> bl = fec.a("options.vsync", true, $$0x -> {
      if (fdz.Q().aP() != null) {
         fdz.Q().aP().a($$0x);
      }
   });
   private final fec<Boolean> bm = fec.a("options.entityShadows", true);
   private final fec<Boolean> bn = fec.a("options.forceUnicodeFont", false, $$0x -> aE());
   private final fec<Boolean> bo = fec.a("options.japaneseGlyphVariants", fec.a(wx.c("options.japaneseGlyphVariants.tooltip")), aF(), $$0x -> aE());
   private final fec<Boolean> bp = fec.a("options.invertMouse", false);
   private final fec<Boolean> bq = fec.a("options.discrete_mouse_scroll", false);
   private final fec<Boolean> br = fec.a("options.realmsNotifications", true);
   private static final wx bs = wx.c("options.allowServerListing.tooltip");
   private final fec<Boolean> bt = fec.a("options.allowServerListing", fec.a(bs), true, $$0x -> this.ax());
   private final fec<Boolean> bu = fec.a("options.reducedDebugInfo", false);
   private final Map<avi, fec<Double>> bv = ac.a(new EnumMap<>(avi.class), $$0x -> {
      for (avi $$1x : avi.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fec<Boolean> bw = fec.a("options.showSubtitles", false);
   private static final wx bx = wx.c("options.directionalAudio.on.tooltip");
   private static final wx by = wx.c("options.directionalAudio.off.tooltip");
   private final fec<Boolean> bz = fec.a("options.directionalAudio", $$0x -> $$0x ? fhk.a(bx) : fhk.a(by), false, $$0x -> {
      gsn $$1x = fdz.Q().ak();
      $$1x.k();
      $$1x.a(gre.a(avh.Ao, 1.0F));
   });
   private final fec<Boolean> bA = new fec<>(
      "options.accessibility.text_background",
      fec.a(),
      ($$0x, $$1x) -> $$1x ? wx.c("options.accessibility.text_background.chat") : wx.c("options.accessibility.text_background.everywhere"),
      fec.a,
      true,
      $$0x -> {
      }
   );
   private final fec<Boolean> bB = fec.a("options.touchscreen", false);
   private final fec<Boolean> bC = fec.a("options.fullscreen", false, $$0x -> {
      fdz $$1x = fdz.Q();
      if ($$1x.aP() != null && $$1x.aP().j() != $$0x) {
         $$1x.aP().h();
         this.aa().a($$1x.aP().j());
      }
   });
   private final fec<Boolean> bD = fec.a("options.viewBobbing", true);
   private static final wx bE = wx.c("options.key.toggle");
   private static final wx bF = wx.c("options.key.hold");
   private final fec<Boolean> bG = new fec<>("key.sneak", fec.a(), ($$0x, $$1x) -> $$1x ? bE : bF, fec.a, false, $$0x -> {
   });
   private final fec<Boolean> bH = new fec<>("key.sprint", fec.a(), ($$0x, $$1x) -> $$1x ? bE : bF, fec.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final wx bI = wx.c("options.hideMatchedNames.tooltip");
   private final fec<Boolean> bJ = fec.a("options.hideMatchedNames", fec.a(bI), true);
   private final fec<Boolean> bK = fec.a("options.autosaveIndicator", true);
   private static final wx bL = wx.c("options.onlyShowSecureChat.tooltip");
   private final fec<Boolean> bM = fec.a("options.onlyShowSecureChat", fec.a(bL), false);
   public final fdx x = new fdx("key.forward", 87, "key.categories.movement");
   public final fdx y = new fdx("key.left", 65, "key.categories.movement");
   public final fdx z = new fdx("key.back", 83, "key.categories.movement");
   public final fdx A = new fdx("key.right", 68, "key.categories.movement");
   public final fdx B = new fdx("key.jump", 32, "key.categories.movement");
   public final fdx C = new fen("key.sneak", 340, "key.categories.movement", this.bG::c);
   public final fdx D = new fen("key.sprint", 341, "key.categories.movement", this.bH::c);
   public final fdx E = new fdx("key.inventory", 69, "key.categories.inventory");
   public final fdx F = new fdx("key.swapOffhand", 70, "key.categories.inventory");
   public final fdx G = new fdx("key.drop", 81, "key.categories.inventory");
   public final fdx H = new fdx("key.use", exn.b.c, 1, "key.categories.gameplay");
   public final fdx I = new fdx("key.attack", exn.b.c, 0, "key.categories.gameplay");
   public final fdx J = new fdx("key.pickItem", exn.b.c, 2, "key.categories.gameplay");
   public final fdx K = new fdx("key.chat", 84, "key.categories.multiplayer");
   public final fdx L = new fdx("key.playerlist", 258, "key.categories.multiplayer");
   public final fdx M = new fdx("key.command", 47, "key.categories.multiplayer");
   public final fdx N = new fdx("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fdx O = new fdx("key.screenshot", 291, "key.categories.misc");
   public final fdx P = new fdx("key.togglePerspective", 294, "key.categories.misc");
   public final fdx Q = new fdx("key.smoothCamera", exn.bv.b(), "key.categories.misc");
   public final fdx R = new fdx("key.fullscreen", 300, "key.categories.misc");
   public final fdx S = new fdx("key.spectatorOutlines", exn.bv.b(), "key.categories.misc");
   public final fdx T = new fdx("key.advancements", 76, "key.categories.misc");
   public final fdx[] U = new fdx[]{
      new fdx("key.hotbar.1", 49, "key.categories.inventory"),
      new fdx("key.hotbar.2", 50, "key.categories.inventory"),
      new fdx("key.hotbar.3", 51, "key.categories.inventory"),
      new fdx("key.hotbar.4", 52, "key.categories.inventory"),
      new fdx("key.hotbar.5", 53, "key.categories.inventory"),
      new fdx("key.hotbar.6", 54, "key.categories.inventory"),
      new fdx("key.hotbar.7", 55, "key.categories.inventory"),
      new fdx("key.hotbar.8", 56, "key.categories.inventory"),
      new fdx("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fdx V = new fdx("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fdx W = new fdx("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fdx[] X = (fdx[])ArrayUtils.addAll(
      new fdx[]{
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
   protected fdz Y;
   private final File bN;
   public boolean Z;
   private fdl bO = fdl.a;
   public String aa = "";
   public boolean ab;
   private final fec<Integer> bP = new fec<>("options.fov", fec.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wx.c("options.fov.min"));
         case 110 -> a($$0x, wx.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fec.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fdz.Q().f.r());
   private static final wx bQ = wx.a("options.telemetry.button.tooltip", wx.c("options.telemetry.state.minimal"), wx.c("options.telemetry.state.all"));
   private final fec<Boolean> bR = fec.a("options.telemetry.button", fec.a(bQ), ($$0x, $$1x) -> {
      fdz $$2x = fdz.Q();
      if (!$$2x.E()) {
         return wx.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wx.c("options.telemetry.state.all") : wx.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wx bS = wx.c("options.screenEffectScale.tooltip");
   private final fec<Double> bT = new fec<>(
      "options.screenEffectScale", fec.a(bS), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ww.c) : a($$0x, $$1x.doubleValue()), fec.m.a, 1.0, $$0x -> {
      }
   );
   private static final wx bU = wx.c("options.fovEffectScale.tooltip");
   private final fec<Double> bV = new fec<>(
      "options.fovEffectScale",
      fec.a(bU),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ww.c) : a($$0x, $$1x.doubleValue()),
      fec.m.a.a(ayd::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final wx bW = wx.c("options.darknessEffectScale.tooltip");
   private final fec<Double> bX = new fec<>(
      "options.darknessEffectScale",
      fec.a(bW),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ww.c) : a($$0x, $$1x.doubleValue()),
      fec.m.a.a(ayd::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final wx bY = wx.c("options.glintSpeed.tooltip");
   private final fec<Double> bZ = new fec<>(
      "options.glintSpeed", fec.a(bY), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ww.c) : a($$0x, $$1x.doubleValue()), fec.m.a, 0.5, $$0x -> {
      }
   );
   private static final wx ca = wx.c("options.glintStrength.tooltip");
   private final fec<Double> cb = new fec<>(
      "options.glintStrength",
      fec.a(ca),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ww.c) : a($$0x, $$1x.doubleValue()),
      fec.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final wx cc = wx.c("options.damageTiltStrength.tooltip");
   private final fec<Double> cd = new fec<>(
      "options.damageTiltStrength", fec.a(cc), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ww.c) : a($$0x, $$1x.doubleValue()), fec.m.a, 1.0, $$0x -> {
      }
   );
   private final fec<Double> ce = new fec<>("options.gamma", fec.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wx.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wx.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wx.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fec.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cf = 2147483646;
   private final fec<Integer> cg = new fec<>(
      "options.guiScale", fec.a(), ($$0x, $$1x) -> $$1x == 0 ? wx.c("options.guiScale.auto") : wx.b(Integer.toString($$1x)), new fec.c(0, () -> {
         fdz $$0x = fdz.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aP().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.Y.a()
   );
   private final fec<fee> ch = new fec<>(
      "options.particles", fec.a(), fec.b(), new fec.e<>(Arrays.asList(fee.values()), Codec.INT.xmap(fee::a, fee::a)), fee.a, $$0x -> {
      }
   );
   private final fec<feb> ci = new fec<>(
      "options.narrator",
      fec.a(),
      ($$0x, $$1x) -> (wx)(this.Y.aZ().a() ? $$1x.b() : wx.c("options.narrator.notavailable")),
      new fec.e<>(Arrays.asList(feb.values()), Codec.INT.xmap(feb::a, feb::a)),
      feb.a,
      $$0x -> this.Y.aZ().a($$0x)
   );
   public String ad = "en_us";
   private final fec<String> cj = new fec<>(
      "options.audioDevice",
      fec.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wx.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wx.b($$1x.substring(gsk.c)) : wx.b($$1x);
         }
      },
      new fec.h<>(
         () -> Stream.concat(Stream.of(""), fdz.Q().ak().a().stream()).toList(),
         $$0x -> fdz.Q().r() && $$0x != "" && !fdz.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gsn $$1x = fdz.Q().ak();
         $$1x.k();
         $$1x.a(gre.a(avh.Ao, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public fec<Boolean> a() {
      return this.al;
   }

   public fec<Boolean> b() {
      return this.an;
   }

   public fec<Boolean> c() {
      return this.ap;
   }

   public fec<Double> d() {
      return this.aq;
   }

   public fec<Integer> e() {
      return this.ar;
   }

   public fec<Integer> f() {
      return this.as;
   }

   public fec<Double> g() {
      return this.au;
   }

   public fec<Integer> h() {
      return this.av;
   }

   public fec<fdn> i() {
      return this.aw;
   }

   public fec<fds> j() {
      return this.aA;
   }

   public fec<Boolean> k() {
      return this.aB;
   }

   public fec<feg> l() {
      return this.aF;
   }

   public void a(ath $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (ate $$2 : $$0.f()) {
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

   public fec<clu> m() {
      return this.aG;
   }

   public fec<Double> n() {
      return this.aH;
   }

   public fec<Double> o() {
      return this.aI;
   }

   public fec<Double> p() {
      return this.aL;
   }

   public double q() {
      return this.p().c();
   }

   public fec<Double> r() {
      return this.aM;
   }

   public fec<Double> s() {
      return this.aN;
   }

   public fec<Boolean> t() {
      return this.aP;
   }

   public fec<Boolean> u() {
      return this.aQ;
   }

   public fec<bsi> v() {
      return this.aS;
   }

   public fec<Double> w() {
      return this.aT;
   }

   public fec<Double> x() {
      return this.aU;
   }

   public fec<Double> y() {
      return this.aV;
   }

   public fec<Double> z() {
      return this.aW;
   }

   public fec<Double> A() {
      return this.aX;
   }

   public fec<Double> B() {
      return this.aZ;
   }

   public fec<Integer> C() {
      return this.ba;
   }

   public fec<fdj> D() {
      return this.bb;
   }

   public fec<Integer> E() {
      return this.bc;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ayd.a(Math.log10($$0) * 100.0);
   }

   public fec<Double> F() {
      return this.bd;
   }

   public fec<Boolean> G() {
      return this.be;
   }

   public fec<Boolean> H() {
      return this.bf;
   }

   public fec<Boolean> I() {
      return this.bg;
   }

   public fec<Boolean> J() {
      return this.bh;
   }

   public fec<Boolean> K() {
      return this.bi;
   }

   public fec<Boolean> L() {
      return this.bj;
   }

   public fec<Boolean> M() {
      return this.bk;
   }

   public fec<Boolean> N() {
      return this.bl;
   }

   public fec<Boolean> O() {
      return this.bm;
   }

   private static void aE() {
      fdz $$0 = fdz.Q();
      if ($$0.aP() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fec<Boolean> P() {
      return this.bn;
   }

   private static boolean aF() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fec<Boolean> Q() {
      return this.bo;
   }

   public fec<Boolean> R() {
      return this.bp;
   }

   public fec<Boolean> S() {
      return this.bq;
   }

   public fec<Boolean> T() {
      return this.br;
   }

   public fec<Boolean> U() {
      return this.bt;
   }

   public fec<Boolean> V() {
      return this.bu;
   }

   public final float a(avi $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fec<Double> b(avi $$0) {
      return Objects.requireNonNull(this.bv.get($$0));
   }

   private fec<Double> a(String $$0, avi $$1) {
      return new fec<>(
         $$0, fec.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ww.c) : a($$0x, $$1x.doubleValue()), fec.m.a, 1.0, $$1x -> fdz.Q().ak().a($$1, $$1x.floatValue())
      );
   }

   public fec<Boolean> W() {
      return this.bw;
   }

   public fec<Boolean> X() {
      return this.bz;
   }

   public fec<Boolean> Y() {
      return this.bA;
   }

   public fec<Boolean> Z() {
      return this.bB;
   }

   public fec<Boolean> aa() {
      return this.bC;
   }

   public fec<Boolean> ab() {
      return this.bD;
   }

   public fec<Boolean> ac() {
      return this.bG;
   }

   public fec<Boolean> ad() {
      return this.bH;
   }

   public fec<Boolean> ae() {
      return this.bJ;
   }

   public fec<Boolean> af() {
      return this.bK;
   }

   public fec<Boolean> ag() {
      return this.bM;
   }

   public fec<Integer> ah() {
      return this.bP;
   }

   public fec<Boolean> ai() {
      return this.bR;
   }

   public fec<Double> aj() {
      return this.bT;
   }

   public fec<Double> ak() {
      return this.bV;
   }

   public fec<Double> al() {
      return this.bX;
   }

   public fec<Double> am() {
      return this.bZ;
   }

   public fec<Double> an() {
      return this.cb;
   }

   public fec<Double> ao() {
      return this.cd;
   }

   public fec<Double> ap() {
      return this.ce;
   }

   public fec<Integer> aq() {
      return this.cg;
   }

   public fec<fee> ar() {
      return this.ch;
   }

   public fec<feb> as() {
      return this.ci;
   }

   public fec<String> at() {
      return this.cj;
   }

   public fed(fdz $$0, File $$1) {
      this.Y = $$0;
      this.bN = new File($$1, "options.txt");
      boolean $$2 = $$0.ah();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ar = new fec<>(
         "options.renderDistance",
         fec.a(),
         ($$0x, $$1x) -> a($$0x, wx.a("options.chunks", $$1x)),
         new fec.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> fdz.Q().f.r()
      );
      this.as = new fec<>(
         "options.simulationDistance", fec.a(), ($$0x, $$1x) -> a($$0x, wx.a("options.chunks", $$1x)), new fec.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
         }
      );
      this.af = ac.k() == ac.a.c;
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

   public void a(fdx $$0, exn.a $$1) {
      $$0.b($$1);
      this.av();
   }

   private void a(fed.b $$0) {
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

   private void a(fed.a $$0) {
      this.a((fed.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, fed::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fed::c, ah::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, gts::a, gts::a);
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

      for (fdx $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(exn.a($$3));
         }
      }

      for (avi $$4 : avi.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bv.get($$4));
      }

      for (clx $$5 : clx.values()) {
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

         ud $$0 = new ud();

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

         final ud $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aA.a(fds.b);
            } else {
               this.aA.a(fds.a);
            }
         }

         this.a(new fed.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, fec<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fed.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fed.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fed.a($$2) : $$1;
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
               } else if (fed.a($$2)) {
                  return 1.0F;
               } else if (fed.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fed.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         if (this.Y.aP() != null) {
            this.Y.aP().a(this.av.c());
         }

         fdx.d();
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

   private ud a(ud $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return azj.e.a(this.Y.at(), $$0, $$1);
   }

   public void av() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bN), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new fed.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fec<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> fed.ag.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(fed.ah.toJson($$2));
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
         if (this.Y.aP().f().isPresent()) {
            $$0.println("fullscreenResolution:" + this.Y.aP().f().get().g());
         }
      } catch (Exception var6) {
         ag.error("Failed to save options", var6);
      }

      this.ax();
   }

   public aqb aw() {
      int $$0 = 0;

      for (clx $$1 : this.aR) {
         $$0 |= $$1.a();
      }

      return new aqb(this.ad, this.ar.c(), this.aG.c(), this.bi.c(), $$0, this.aS.c(), this.Y.aT(), this.bt.c());
   }

   public void ax() {
      if (this.Y.s != null) {
         this.Y.s.h.b(new zw(this.aw()));
      }
   }

   private void b(clx $$0, boolean $$1) {
      if ($$1) {
         this.aR.add($$0);
      } else {
         this.aR.remove($$0);
      }
   }

   public boolean a(clx $$0) {
      return this.aR.contains($$0);
   }

   public void a(clx $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ax();
   }

   public fdn ay() {
      return this.aD() >= 4 ? this.aw.c() : fdn.a;
   }

   public boolean az() {
      return this.q;
   }

   public void b(ath $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         ate $$4 = $$0.c($$3);
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

   public fdl aA() {
      return this.bO;
   }

   public void a(fdl $$0) {
      this.bO = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = axu.a(ah, $$0, ai);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aB() {
      return this.bN;
   }

   public String aC() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fed.b() {
         @Override
         public <T> void a(String $$0x, fec<T> $$1) {
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

   private static wx b(wx $$0, int $$1) {
      return wx.a("options.pixel_value", $$0, $$1);
   }

   private static wx a(wx $$0, double $$1) {
      return wx.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static wx a(wx $$0, wx $$1) {
      return wx.a("options.generic_value", $$0, $$1);
   }

   public static wx a(wx $$0, int $$1) {
      return a($$0, wx.b(Integer.toString($$1)));
   }

   interface a extends fed.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fec<T> var2);
   }
}
