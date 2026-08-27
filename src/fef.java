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

public class fef {
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
   private static final wx aj = wx.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fee<Boolean> ak = fee.a("options.darkMojangStudiosBackgroundColor", fee.a(aj), false);
   private static final wx al = wx.c("options.hideLightningFlashes.tooltip");
   private final fee<Boolean> am = fee.a("options.hideLightningFlashes", fee.a(al), false);
   private static final wx an = wx.c("options.hideSplashTexts.tooltip");
   private final fee<Boolean> ao = fee.a("options.hideSplashTexts", fee.a(an), false);
   private final fee<Double> ap = new fee<>("options.sensitivity", fee.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wx.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wx.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fee.m.a, 0.5, $$0x -> {
   });
   private final fee<Integer> aq;
   private final fee<Integer> ar;
   private int as = 0;
   private final fee<Double> at = new fee<>(
      "options.entityDistanceScaling",
      fee.a(),
      fef::a,
      new fee.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fee<Integer> au = new fee<>(
      "options.framerateLimit",
      fee.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wx.c("options.framerateLimit.max")) : a($$0x, wx.a("options.framerate", $$1x)),
      new fee.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> feb.Q().aO().a($$0x)
   );
   private final fee<fdp> av = new fee<>(
      "options.renderClouds",
      fee.a(),
      fee.b(),
      new fee.e<>(Arrays.asList(fdp.values()), Codec.withAlternative(fdp.d, Codec.BOOL, $$0x -> $$0x ? fdp.c : fdp.a)),
      fdp.c,
      $$0x -> {
         if (feb.O()) {
            exg $$1x = feb.Q().f.x();
            if ($$1x != null) {
               $$1x.b(feb.a);
            }
         }
      }
   );
   private static final wx aw = wx.c("options.graphics.fast.tooltip");
   private static final wx ax = wx.a("options.graphics.fabulous.tooltip", wx.c("options.graphics.fabulous").a(n.u));
   private static final wx ay = wx.c("options.graphics.fancy.tooltip");
   private final fee<fdu> az = new fee<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fhl.a(ay);
            case a -> fhl.a(aw);
            case c -> fhl.a(ax);
         };
      },
      ($$0x, $$1x) -> {
         xl $$2x = wx.c($$1x.b());
         return $$1x == fdu.c ? $$2x.a(n.u) : $$2x;
      },
      new fee.a<>(
         Arrays.asList(fdu.values()),
         Stream.of(fdu.values()).filter($$0x -> $$0x != fdu.c).collect(Collectors.toList()),
         () -> feb.Q().r() && feb.Q().ai().h(),
         ($$0x, $$1x) -> {
            feb $$2x = feb.Q();
            gce $$3 = $$2x.ai();
            if ($$1x == fdu.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(fdu::a, fdu::a)
      ),
      fdu.b,
      $$0x -> {
      }
   );
   private final fee<Boolean> aA = fee.a("options.ao", true, $$0x -> feb.Q().f.f());
   private static final wx aB = wx.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wx aC = wx.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wx aD = wx.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fee<fei> aE = new fee<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fhl.a(aB);
         case b -> fhl.a(aC);
         case c -> fhl.a(aD);
      };
   }, fee.b(), new fee.e<>(Arrays.asList(fei.values()), Codec.INT.xmap(fei::a, fei::a)), fei.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fee<clw> aF = new fee<>(
      "options.chat.visibility", fee.a(), fee.b(), new fee.e<>(Arrays.asList(clw.values()), Codec.INT.xmap(clw::a, clw::a)), clw.a, $$0x -> {
      }
   );
   private final fee<Double> aG = new fee<>("options.chat.opacity", fee.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fee.m.a, 1.0, $$0x -> feb.Q().l.d().b());
   private final fee<Double> aH = new fee<>("options.chat.line_spacing", fee.a(), fef::a, fee.m.a, 0.0, $$0x -> {
   });
   private static final wx aI = wx.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final double aJ = 0.5;
   private final fee<Double> aK = new fee<>("options.accessibility.menu_background_blurriness", fee.a(aI), fef::a, fee.m.a, 0.5, $$0x -> {
   });
   private final fee<Double> aL = new fee<>("options.accessibility.text_background_opacity", fee.a(), fef::a, fee.m.a, 0.5, $$0x -> feb.Q().l.d().b());
   private final fee<Double> aM = new fee<>("options.accessibility.panorama_speed", fee.a(), fef::a, fee.m.a, 1.0, $$0x -> {
   });
   private static final wx aN = wx.c("options.accessibility.high_contrast.tooltip");
   private final fee<Boolean> aO = fee.a("options.accessibility.high_contrast", fee.a(aN), false, $$0x -> {
      ati $$1x = feb.Q().ac();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final fee<Boolean> aP = fee.a(
      "options.accessibility.narrator_hotkey",
      fee.a(feb.a ? wx.c("options.accessibility.narrator_hotkey.mac.tooltip") : wx.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<clz> aQ = EnumSet.allOf(clz.class);
   private final fee<bsk> aR = new fee<>("options.mainHand", fee.a(), fee.b(), new fee.e<>(Arrays.asList(bsk.values()), bsk.c), bsk.b, $$0x -> this.ax());
   public int o;
   public int p;
   private final fee<Double> aS = new fee<>(
      "options.chat.scale",
      fee.a(),
      ($$0x, $$1x) -> (wx)($$1x == 0.0 ? ww.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fee.m.a,
      1.0,
      $$0x -> feb.Q().l.d().b()
   );
   private final fee<Double> aT = new fee<>("options.chat.width", fee.a(), ($$0x, $$1x) -> b($$0x, fgb.a($$1x)), fee.m.a, 1.0, $$0x -> feb.Q().l.d().b());
   private final fee<Double> aU = new fee<>(
      "options.chat.height.unfocused", fee.a(), ($$0x, $$1x) -> b($$0x, fgb.b($$1x)), fee.m.a, fgb.i(), $$0x -> feb.Q().l.d().b()
   );
   private final fee<Double> aV = new fee<>(
      "options.chat.height.focused", fee.a(), ($$0x, $$1x) -> b($$0x, fgb.b($$1x)), fee.m.a, 1.0, $$0x -> feb.Q().l.d().b()
   );
   private final fee<Double> aW = new fee<>(
      "options.chat.delay_instant",
      fee.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wx.c("options.chat.delay_none") : wx.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fee.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> feb.Q().aY().a($$0x)
   );
   private static final wx aX = wx.c("options.notifications.display_time.tooltip");
   private final fee<Double> aY = new fee<>(
      "options.notifications.display_time",
      fee.a(aX),
      ($$0x, $$1x) -> a($$0x, wx.a("options.multiplier", $$1x)),
      new fee.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fee<Integer> aZ = new fee<>(
      "options.mipmapLevels", fee.a(), ($$0x, $$1x) -> (wx)($$1x == 0 ? ww.a($$0x, false) : a($$0x, $$1x.intValue())), new fee.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fee<fdl> ba = new fee<>(
      "options.attackIndicator", fee.a(), fee.b(), new fee.e<>(Arrays.asList(fdl.values()), Codec.INT.xmap(fdl::a, fdl::a)), fdl.b, $$0x -> {
      }
   );
   public gts r = gts.a;
   public boolean s = false;
   public boolean t = false;
   private final fee<Integer> bb = new fee<>("options.biomeBlendRadius", fee.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wx.c("options.biomeBlendRadius." + $$2x));
   }, new fee.f(0, 7), 2, $$0x -> feb.Q().f.f());
   private final fee<Double> bc = new fee<>(
      "options.mouseWheelSensitivity",
      fee.a(),
      ($$0x, $$1x) -> a($$0x, wx.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fee.f(-200, 100).a(fef::c, fef::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fee<Boolean> bd = fee.a("options.rawMouseInput", true, $$0x -> {
      exy $$1x = feb.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final fee<Boolean> be = fee.a("options.autoJump", false);
   private final fee<Boolean> bf = fee.a("options.operatorItemsTab", false);
   private final fee<Boolean> bg = fee.a("options.autoSuggestCommands", true);
   private final fee<Boolean> bh = fee.a("options.chat.color", true);
   private final fee<Boolean> bi = fee.a("options.chat.links", true);
   private final fee<Boolean> bj = fee.a("options.chat.links.prompt", true);
   private final fee<Boolean> bk = fee.a("options.vsync", true, $$0x -> {
      if (feb.Q().aO() != null) {
         feb.Q().aO().a($$0x);
      }
   });
   private final fee<Boolean> bl = fee.a("options.entityShadows", true);
   private final fee<Boolean> bm = fee.a("options.forceUnicodeFont", false, $$0x -> aE());
   private final fee<Boolean> bn = fee.a("options.japaneseGlyphVariants", fee.a(wx.c("options.japaneseGlyphVariants.tooltip")), aF(), $$0x -> aE());
   private final fee<Boolean> bo = fee.a("options.invertMouse", false);
   private final fee<Boolean> bp = fee.a("options.discrete_mouse_scroll", false);
   private final fee<Boolean> bq = fee.a("options.realmsNotifications", true);
   private static final wx br = wx.c("options.allowServerListing.tooltip");
   private final fee<Boolean> bs = fee.a("options.allowServerListing", fee.a(br), true, $$0x -> this.ax());
   private final fee<Boolean> bt = fee.a("options.reducedDebugInfo", false);
   private final Map<avj, fee<Double>> bu = ac.a(new EnumMap<>(avj.class), $$0x -> {
      for (avj $$1x : avj.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final fee<Boolean> bv = fee.a("options.showSubtitles", false);
   private static final wx bw = wx.c("options.directionalAudio.on.tooltip");
   private static final wx bx = wx.c("options.directionalAudio.off.tooltip");
   private final fee<Boolean> by = fee.a("options.directionalAudio", $$0x -> $$0x ? fhl.a(bw) : fhl.a(bx), false, $$0x -> {
      gsn $$1x = feb.Q().aj();
      $$1x.k();
      $$1x.a(gre.a(avi.Ao, 1.0F));
   });
   private final fee<Boolean> bz = new fee<>(
      "options.accessibility.text_background",
      fee.a(),
      ($$0x, $$1x) -> $$1x ? wx.c("options.accessibility.text_background.chat") : wx.c("options.accessibility.text_background.everywhere"),
      fee.a,
      true,
      $$0x -> {
      }
   );
   private final fee<Boolean> bA = fee.a("options.touchscreen", false);
   private final fee<Boolean> bB = fee.a("options.fullscreen", false, $$0x -> {
      feb $$1x = feb.Q();
      if ($$1x.aO() != null && $$1x.aO().j() != $$0x) {
         $$1x.aO().h();
         this.aa().a($$1x.aO().j());
      }
   });
   private final fee<Boolean> bC = fee.a("options.viewBobbing", true);
   private static final wx bD = wx.c("options.key.toggle");
   private static final wx bE = wx.c("options.key.hold");
   private final fee<Boolean> bF = new fee<>("key.sneak", fee.a(), ($$0x, $$1x) -> $$1x ? bD : bE, fee.a, false, $$0x -> {
   });
   private final fee<Boolean> bG = new fee<>("key.sprint", fee.a(), ($$0x, $$1x) -> $$1x ? bD : bE, fee.a, false, $$0x -> {
   });
   public boolean v;
   private static final wx bH = wx.c("options.hideMatchedNames.tooltip");
   private final fee<Boolean> bI = fee.a("options.hideMatchedNames", fee.a(bH), true);
   private final fee<Boolean> bJ = fee.a("options.autosaveIndicator", true);
   private static final wx bK = wx.c("options.onlyShowSecureChat.tooltip");
   private final fee<Boolean> bL = fee.a("options.onlyShowSecureChat", fee.a(bK), false);
   public final fdz w = new fdz("key.forward", 87, "key.categories.movement");
   public final fdz x = new fdz("key.left", 65, "key.categories.movement");
   public final fdz y = new fdz("key.back", 83, "key.categories.movement");
   public final fdz z = new fdz("key.right", 68, "key.categories.movement");
   public final fdz A = new fdz("key.jump", 32, "key.categories.movement");
   public final fdz B = new feo("key.sneak", 340, "key.categories.movement", this.bF::c);
   public final fdz C = new feo("key.sprint", 341, "key.categories.movement", this.bG::c);
   public final fdz D = new fdz("key.inventory", 69, "key.categories.inventory");
   public final fdz E = new fdz("key.swapOffhand", 70, "key.categories.inventory");
   public final fdz F = new fdz("key.drop", 81, "key.categories.inventory");
   public final fdz G = new fdz("key.use", exp.b.c, 1, "key.categories.gameplay");
   public final fdz H = new fdz("key.attack", exp.b.c, 0, "key.categories.gameplay");
   public final fdz I = new fdz("key.pickItem", exp.b.c, 2, "key.categories.gameplay");
   public final fdz J = new fdz("key.chat", 84, "key.categories.multiplayer");
   public final fdz K = new fdz("key.playerlist", 258, "key.categories.multiplayer");
   public final fdz L = new fdz("key.command", 47, "key.categories.multiplayer");
   public final fdz M = new fdz("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fdz N = new fdz("key.screenshot", 291, "key.categories.misc");
   public final fdz O = new fdz("key.togglePerspective", 294, "key.categories.misc");
   public final fdz P = new fdz("key.smoothCamera", exp.bv.b(), "key.categories.misc");
   public final fdz Q = new fdz("key.fullscreen", 300, "key.categories.misc");
   public final fdz R = new fdz("key.spectatorOutlines", exp.bv.b(), "key.categories.misc");
   public final fdz S = new fdz("key.advancements", 76, "key.categories.misc");
   public final fdz[] T = new fdz[]{
      new fdz("key.hotbar.1", 49, "key.categories.inventory"),
      new fdz("key.hotbar.2", 50, "key.categories.inventory"),
      new fdz("key.hotbar.3", 51, "key.categories.inventory"),
      new fdz("key.hotbar.4", 52, "key.categories.inventory"),
      new fdz("key.hotbar.5", 53, "key.categories.inventory"),
      new fdz("key.hotbar.6", 54, "key.categories.inventory"),
      new fdz("key.hotbar.7", 55, "key.categories.inventory"),
      new fdz("key.hotbar.8", 56, "key.categories.inventory"),
      new fdz("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fdz U = new fdz("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fdz V = new fdz("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fdz[] W = (fdz[])ArrayUtils.addAll(
      new fdz[]{
         this.H,
         this.G,
         this.w,
         this.x,
         this.y,
         this.z,
         this.A,
         this.B,
         this.C,
         this.F,
         this.D,
         this.J,
         this.K,
         this.I,
         this.L,
         this.M,
         this.N,
         this.O,
         this.P,
         this.Q,
         this.R,
         this.E,
         this.U,
         this.V,
         this.S
      },
      this.T
   );
   protected feb X;
   private final File bM;
   public boolean Y;
   private fdn bN = fdn.a;
   public String Z = "";
   public boolean aa;
   private final fee<Integer> bO = new fee<>("options.fov", fee.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wx.c("options.fov.min"));
         case 110 -> a($$0x, wx.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fee.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> feb.Q().f.r());
   private static final wx bP = wx.a("options.telemetry.button.tooltip", wx.c("options.telemetry.state.minimal"), wx.c("options.telemetry.state.all"));
   private final fee<Boolean> bQ = fee.a("options.telemetry.button", fee.a(bP), ($$0x, $$1x) -> {
      feb $$2x = feb.Q();
      if (!$$2x.E()) {
         return wx.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wx.c("options.telemetry.state.all") : wx.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wx bR = wx.c("options.screenEffectScale.tooltip");
   private final fee<Double> bS = new fee<>(
      "options.screenEffectScale", fee.a(bR), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ww.c) : a($$0x, $$1x.doubleValue()), fee.m.a, 1.0, $$0x -> {
      }
   );
   private static final wx bT = wx.c("options.fovEffectScale.tooltip");
   private final fee<Double> bU = new fee<>(
      "options.fovEffectScale",
      fee.a(bT),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ww.c) : a($$0x, $$1x.doubleValue()),
      fee.m.a.a(ayf::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final wx bV = wx.c("options.darknessEffectScale.tooltip");
   private final fee<Double> bW = new fee<>(
      "options.darknessEffectScale",
      fee.a(bV),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ww.c) : a($$0x, $$1x.doubleValue()),
      fee.m.a.a(ayf::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final wx bX = wx.c("options.glintSpeed.tooltip");
   private final fee<Double> bY = new fee<>(
      "options.glintSpeed", fee.a(bX), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ww.c) : a($$0x, $$1x.doubleValue()), fee.m.a, 0.5, $$0x -> {
      }
   );
   private static final wx bZ = wx.c("options.glintStrength.tooltip");
   private final fee<Double> ca = new fee<>(
      "options.glintStrength",
      fee.a(bZ),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ww.c) : a($$0x, $$1x.doubleValue()),
      fee.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final wx cb = wx.c("options.damageTiltStrength.tooltip");
   private final fee<Double> cc = new fee<>(
      "options.damageTiltStrength", fee.a(cb), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ww.c) : a($$0x, $$1x.doubleValue()), fee.m.a, 1.0, $$0x -> {
      }
   );
   private final fee<Double> cd = new fee<>("options.gamma", fee.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wx.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wx.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wx.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fee.m.a, 0.5, $$0x -> {
   });
   public static final int ab = 0;
   private static final int ce = 2147483646;
   private final fee<Integer> cf = new fee<>(
      "options.guiScale", fee.a(), ($$0x, $$1x) -> $$1x == 0 ? wx.c("options.guiScale.auto") : wx.b(Integer.toString($$1x)), new fee.c(0, () -> {
         feb $$0x = feb.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.X.a()
   );
   private final fee<feg> cg = new fee<>(
      "options.particles", fee.a(), fee.b(), new fee.e<>(Arrays.asList(feg.values()), Codec.INT.xmap(feg::a, feg::a)), feg.a, $$0x -> {
      }
   );
   private final fee<fed> ch = new fee<>(
      "options.narrator",
      fee.a(),
      ($$0x, $$1x) -> (wx)(this.X.aX().a() ? $$1x.b() : wx.c("options.narrator.notavailable")),
      new fee.e<>(Arrays.asList(fed.values()), Codec.INT.xmap(fed::a, fed::a)),
      fed.a,
      $$0x -> this.X.aX().a($$0x)
   );
   public String ac = "en_us";
   private final fee<String> ci = new fee<>(
      "options.audioDevice",
      fee.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wx.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wx.b($$1x.substring(gsk.c)) : wx.b($$1x);
         }
      },
      new fee.h<>(
         () -> Stream.concat(Stream.of(""), feb.Q().aj().a().stream()).toList(),
         $$0x -> feb.Q().r() && $$0x != "" && !feb.Q().aj().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gsn $$1x = feb.Q().aj();
         $$1x.k();
         $$1x.a(gre.a(avi.Ao, 1.0F));
      }
   );
   public boolean ad = true;
   public boolean ae;

   public fee<Boolean> a() {
      return this.ak;
   }

   public fee<Boolean> b() {
      return this.am;
   }

   public fee<Boolean> c() {
      return this.ao;
   }

   public fee<Double> d() {
      return this.ap;
   }

   public fee<Integer> e() {
      return this.aq;
   }

   public fee<Integer> f() {
      return this.ar;
   }

   public fee<Double> g() {
      return this.at;
   }

   public fee<Integer> h() {
      return this.au;
   }

   public fee<fdp> i() {
      return this.av;
   }

   public fee<fdu> j() {
      return this.az;
   }

   public fee<Boolean> k() {
      return this.aA;
   }

   public fee<fei> l() {
      return this.aE;
   }

   public void a(ati $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (atf $$2 : $$0.f()) {
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
         this.X.l();
      }
   }

   public fee<clw> m() {
      return this.aF;
   }

   public fee<Double> n() {
      return this.aG;
   }

   public fee<Double> o() {
      return this.aH;
   }

   public fee<Double> p() {
      return this.aK;
   }

   public double q() {
      return this.p().c();
   }

   public fee<Double> r() {
      return this.aL;
   }

   public fee<Double> s() {
      return this.aM;
   }

   public fee<Boolean> t() {
      return this.aO;
   }

   public fee<Boolean> u() {
      return this.aP;
   }

   public fee<bsk> v() {
      return this.aR;
   }

   public fee<Double> w() {
      return this.aS;
   }

   public fee<Double> x() {
      return this.aT;
   }

   public fee<Double> y() {
      return this.aU;
   }

   public fee<Double> z() {
      return this.aV;
   }

   public fee<Double> A() {
      return this.aW;
   }

   public fee<Double> B() {
      return this.aY;
   }

   public fee<Integer> C() {
      return this.aZ;
   }

   public fee<fdl> D() {
      return this.ba;
   }

   public fee<Integer> E() {
      return this.bb;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return ayf.a(Math.log10($$0) * 100.0);
   }

   public fee<Double> F() {
      return this.bc;
   }

   public fee<Boolean> G() {
      return this.bd;
   }

   public fee<Boolean> H() {
      return this.be;
   }

   public fee<Boolean> I() {
      return this.bf;
   }

   public fee<Boolean> J() {
      return this.bg;
   }

   public fee<Boolean> K() {
      return this.bh;
   }

   public fee<Boolean> L() {
      return this.bi;
   }

   public fee<Boolean> M() {
      return this.bj;
   }

   public fee<Boolean> N() {
      return this.bk;
   }

   public fee<Boolean> O() {
      return this.bl;
   }

   private static void aE() {
      feb $$0 = feb.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fee<Boolean> P() {
      return this.bm;
   }

   private static boolean aF() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fee<Boolean> Q() {
      return this.bn;
   }

   public fee<Boolean> R() {
      return this.bo;
   }

   public fee<Boolean> S() {
      return this.bp;
   }

   public fee<Boolean> T() {
      return this.bq;
   }

   public fee<Boolean> U() {
      return this.bs;
   }

   public fee<Boolean> V() {
      return this.bt;
   }

   public final float a(avj $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fee<Double> b(avj $$0) {
      return Objects.requireNonNull(this.bu.get($$0));
   }

   private fee<Double> a(String $$0, avj $$1) {
      return new fee<>(
         $$0, fee.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, ww.c) : a($$0x, $$1x.doubleValue()), fee.m.a, 1.0, $$1x -> feb.Q().aj().a($$1, $$1x.floatValue())
      );
   }

   public fee<Boolean> W() {
      return this.bv;
   }

   public fee<Boolean> X() {
      return this.by;
   }

   public fee<Boolean> Y() {
      return this.bz;
   }

   public fee<Boolean> Z() {
      return this.bA;
   }

   public fee<Boolean> aa() {
      return this.bB;
   }

   public fee<Boolean> ab() {
      return this.bC;
   }

   public fee<Boolean> ac() {
      return this.bF;
   }

   public fee<Boolean> ad() {
      return this.bG;
   }

   public fee<Boolean> ae() {
      return this.bI;
   }

   public fee<Boolean> af() {
      return this.bJ;
   }

   public fee<Boolean> ag() {
      return this.bL;
   }

   public fee<Integer> ah() {
      return this.bO;
   }

   public fee<Boolean> ai() {
      return this.bQ;
   }

   public fee<Double> aj() {
      return this.bS;
   }

   public fee<Double> ak() {
      return this.bU;
   }

   public fee<Double> al() {
      return this.bW;
   }

   public fee<Double> am() {
      return this.bY;
   }

   public fee<Double> an() {
      return this.ca;
   }

   public fee<Double> ao() {
      return this.cc;
   }

   public fee<Double> ap() {
      return this.cd;
   }

   public fee<Integer> aq() {
      return this.cf;
   }

   public fee<feg> ar() {
      return this.cg;
   }

   public fee<fed> as() {
      return this.ch;
   }

   public fee<String> at() {
      return this.ci;
   }

   public fef(feb $$0, File $$1) {
      this.X = $$0;
      this.bM = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new fee<>(
         "options.renderDistance", fee.a(), ($$0x, $$1x) -> a($$0x, wx.a("options.chunks", $$1x)), new fee.f(2, $$2 ? 32 : 16), 12, $$0x -> feb.Q().f.r()
      );
      this.ar = new fee<>(
         "options.simulationDistance", fee.a(), ($$0x, $$1x) -> a($$0x, wx.a("options.chunks", $$1x)), new fee.f(5, $$2 ? 32 : 16), 12, $$0x -> {
         }
      );
      this.ae = ac.k() == ac.a.c;
      this.au();
   }

   public float a(float $$0) {
      return this.bz.c() ? $$0 : this.r().c().floatValue();
   }

   public int b(float $$0) {
      return (int)(this.a($$0) * 255.0F) << 24 & 0xFF000000;
   }

   public int a(int $$0) {
      return this.bz.c() ? $$0 : (int)(this.aL.c() * 255.0) << 24 & 0xFF000000;
   }

   public void a(fdz $$0, exp.a $$1) {
      $$0.b($$1);
      this.av();
   }

   private void a(fef.b $$0) {
      $$0.a("ao", this.aA);
      $$0.a("biomeBlendRadius", this.bb);
      $$0.a("enableVsync", this.bk);
      $$0.a("entityDistanceScaling", this.at);
      $$0.a("entityShadows", this.bl);
      $$0.a("forceUnicodeFont", this.bm);
      $$0.a("japaneseGlyphVariants", this.bn);
      $$0.a("fov", this.bO);
      $$0.a("fovEffectScale", this.bU);
      $$0.a("darknessEffectScale", this.bW);
      $$0.a("glintSpeed", this.bY);
      $$0.a("glintStrength", this.ca);
      $$0.a("prioritizeChunkUpdates", this.aE);
      $$0.a("fullscreen", this.bB);
      $$0.a("gamma", this.cd);
      $$0.a("graphicsMode", this.az);
      $$0.a("guiScale", this.cf);
      $$0.a("maxFps", this.au);
      $$0.a("mipmapLevels", this.aZ);
      $$0.a("narrator", this.ch);
      $$0.a("particles", this.cg);
      $$0.a("reducedDebugInfo", this.bt);
      $$0.a("renderClouds", this.av);
      $$0.a("renderDistance", this.aq);
      $$0.a("simulationDistance", this.ar);
      $$0.a("screenEffectScale", this.bS);
      $$0.a("soundDevice", this.ci);
   }

   private void a(fef.a $$0) {
      this.a((fef.b)$$0);
      $$0.a("autoJump", this.be);
      $$0.a("operatorItemsTab", this.bf);
      $$0.a("autoSuggestions", this.bg);
      $$0.a("chatColors", this.bh);
      $$0.a("chatLinks", this.bi);
      $$0.a("chatLinksPrompt", this.bj);
      $$0.a("discrete_mouse_scroll", this.bp);
      $$0.a("invertYMouse", this.bo);
      $$0.a("realmsNotifications", this.bq);
      $$0.a("showSubtitles", this.bv);
      $$0.a("directionalAudio", this.by);
      $$0.a("touchscreen", this.bA);
      $$0.a("bobView", this.bC);
      $$0.a("toggleCrouch", this.bF);
      $$0.a("toggleSprint", this.bG);
      $$0.a("darkMojangStudiosBackground", this.ak);
      $$0.a("hideLightningFlashes", this.am);
      $$0.a("hideSplashTexts", this.ao);
      $$0.a("mouseSensitivity", this.ap);
      $$0.a("damageTiltStrength", this.cc);
      $$0.a("highContrast", this.aO);
      $$0.a("narratorHotkey", this.aP);
      this.i = $$0.a("resourcePacks", this.i, fef::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fef::c, ag::toJson);
      this.Z = $$0.a("lastServer", this.Z);
      this.ac = $$0.a("lang", this.ac);
      $$0.a("chatVisibility", this.aF);
      $$0.a("chatOpacity", this.aG);
      $$0.a("chatLineSpacing", this.aH);
      $$0.a("textBackgroundOpacity", this.aL);
      $$0.a("backgroundForChatOnly", this.bz);
      this.l = $$0.a("hideServerAddress", this.l);
      this.m = $$0.a("advancedItemTooltips", this.m);
      this.n = $$0.a("pauseOnLostFocus", this.n);
      this.o = $$0.a("overrideWidth", this.o);
      this.p = $$0.a("overrideHeight", this.p);
      $$0.a("chatHeightFocused", this.aV);
      $$0.a("chatDelay", this.aW);
      $$0.a("chatHeightUnfocused", this.aU);
      $$0.a("chatScale", this.aS);
      $$0.a("chatWidth", this.aT);
      $$0.a("notificationDisplayTime", this.aY);
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aR);
      $$0.a("attackIndicator", this.ba);
      this.r = $$0.a("tutorialStep", this.r, gts::a, gts::a);
      $$0.a("mouseWheelSensitivity", this.bc);
      $$0.a("rawMouseInput", this.bd);
      this.u = $$0.a("glDebugVerbosity", this.u);
      this.v = $$0.a("skipMultiplayerWarning", this.v);
      $$0.a("hideMatchedNames", this.bI);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.t = $$0.a("hideBundleTutorial", this.t);
      this.ae = $$0.a("syncChunkWrites", this.ae);
      $$0.a("showAutosaveIndicator", this.bJ);
      $$0.a("allowServerListing", this.bs);
      $$0.a("onlyShowSecureChat", this.bL);
      $$0.a("panoramaScrollSpeed", this.aM);
      $$0.a("telemetryOptInExtra", this.bQ);
      this.ad = $$0.a("onboardAccessibility", this.ad);
      $$0.a("menuBackgroundBlurriness", this.aK);

      for (fdz $$1 : this.W) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(exp.a($$3));
         }
      }

      for (avj $$4 : avj.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bu.get($$4));
      }

      for (clz $$5 : clz.values()) {
         boolean $$6 = this.aQ.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.b($$5, $$7);
         }
      }
   }

   public void au() {
      try {
         if (!this.bM.exists()) {
            return;
         }

         ud $$0 = new ud();

         try (BufferedReader $$1 = Files.newReader(this.bM, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = ai.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  af.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final ud $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.az.a(fdu.b);
            } else {
               this.az.a(fdu.a);
            }
         }

         this.a(new fef.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, fee<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fef.af.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fef.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fef.a($$2) : $$1;
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
               } else if (fef.a($$2)) {
                  return 1.0F;
               } else if (fef.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fef.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         if (this.X.aO() != null) {
            this.X.aO().a(this.au.c());
         }

         fdz.d();
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

   private ud a(ud $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return azl.e.a(this.X.as(), $$0, $$1);
   }

   public void av() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bM), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new fef.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fee<T> $$1x) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1xx -> fef.af.error("Error saving option " + $$1 + ": " + $$1xx)).ifSuccess($$2 -> {
                  this.a($$0);
                  $$0.println(fef.ag.toJson($$2));
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
         if (this.X.aO().f().isPresent()) {
            $$0.println("fullscreenResolution:" + this.X.aO().f().get().g());
         }
      } catch (Exception var6) {
         af.error("Failed to save options", var6);
      }

      this.ax();
   }

   public aqc aw() {
      int $$0 = 0;

      for (clz $$1 : this.aQ) {
         $$0 |= $$1.a();
      }

      return new aqc(this.ac, this.aq.c(), this.aF.c(), this.bh.c(), $$0, this.aR.c(), this.X.aS(), this.bs.c());
   }

   public void ax() {
      if (this.X.s != null) {
         this.X.s.cz.b(new zw(this.aw()));
      }
   }

   private void b(clz $$0, boolean $$1) {
      if ($$1) {
         this.aQ.add($$0);
      } else {
         this.aQ.remove($$0);
      }
   }

   public boolean a(clz $$0) {
      return this.aQ.contains($$0);
   }

   public void a(clz $$0, boolean $$1) {
      this.b($$0, $$1);
      this.ax();
   }

   public fdp ay() {
      return this.aD() >= 4 ? this.av.c() : fdp.a;
   }

   public boolean az() {
      return this.q;
   }

   public void b(ati $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         atf $$4 = $$0.c($$3);
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

      $$0.a($$1);
   }

   public fdn aA() {
      return this.bN;
   }

   public void a(fdn $$0) {
      this.bN = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = axv.a(ag, $$0, ah);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aB() {
      return this.bM;
   }

   public String aC() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fef.b() {
         @Override
         public <T> void a(String $$0x, fee<T> $$1) {
            $$0.add(Pair.of($$0, $$1.c()));
         }
      });
      $$0.add(Pair.of("fullscreenResolution", String.valueOf(this.k)));
      $$0.add(Pair.of("glDebugVerbosity", this.u));
      $$0.add(Pair.of("overrideHeight", this.p));
      $$0.add(Pair.of("overrideWidth", this.o));
      $$0.add(Pair.of("syncChunkWrites", this.ae));
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

   public int aD() {
      return this.as > 0 ? Math.min(this.aq.c(), this.as) : this.aq.c();
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

   interface a extends fef.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fee<T> var2);
   }
}
