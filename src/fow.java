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

public class fow {
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
   private final fov<Boolean> ak = fov.a("options.darkMojangStudiosBackgroundColor", fov.a(aj), false);
   private static final wy al = wy.c("options.hideLightningFlashes.tooltip");
   private final fov<Boolean> am = fov.a("options.hideLightningFlashes", fov.a(al), false);
   private static final wy an = wy.c("options.hideSplashTexts.tooltip");
   private final fov<Boolean> ao = fov.a("options.hideSplashTexts", fov.a(an), false);
   private final fov<Double> ap = new fov<>("options.sensitivity", fov.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, wy.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, wy.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fov.m.a, 0.5, $$0x -> {
   });
   private final fov<Integer> aq;
   private final fov<Integer> ar;
   private int as = 0;
   private final fov<Double> at = new fov<>(
      "options.entityDistanceScaling",
      fov.a(),
      fow::a,
      new fov.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final fov<Integer> au = new fov<>(
      "options.framerateLimit",
      fov.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, wy.c("options.framerateLimit.max")) : a($$0x, wy.a("options.framerate", $$1x)),
      new fov.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fos.Q().aP().a($$0x)
   );
   private static final wy av = wy.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final wy aw = wy.c("options.inactivityFpsLimit.afk.tooltip");
   private final fov<fon> ax = new fov<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> ftn.a(av);
         case b -> ftn.a(aw);
      };
   }, fov.b(), new fov.e<>(Arrays.asList(fon.values()), fon.c), fon.b, $$0x -> {
   });
   private final fov<fod> ay = new fov<>(
      "options.renderClouds",
      fov.a(),
      fov.b(),
      new fov.e<>(Arrays.asList(fod.values()), Codec.withAlternative(fod.d, Codec.BOOL, $$0x -> $$0x ? fod.c : fod.a)),
      fod.c,
      $$0x -> {
      }
   );
   private static final wy az = wy.c("options.graphics.fast.tooltip");
   private static final wy aA = wy.a("options.graphics.fabulous.tooltip", wy.c("options.graphics.fabulous").a(n.u));
   private static final wy aB = wy.c("options.graphics.fancy.tooltip");
   private final fov<foj> aC = new fov<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> ftn.a(aB);
            case a -> ftn.a(az);
            case c -> ftn.a(aA);
         };
      },
      ($$0x, $$1x) -> {
         xm $$2x = wy.c($$1x.a());
         return $$1x == foj.c ? $$2x.a(n.u) : $$2x;
      },
      new fov.a<>(
         Arrays.asList(foj.values()),
         Stream.of(foj.values()).filter($$0x -> $$0x != foj.c).collect(Collectors.toList()),
         () -> fos.Q().r() && fos.Q().aj().h(),
         ($$0x, $$1x) -> {
            fos $$2x = fos.Q();
            gpj $$3 = $$2x.aj();
            if ($$1x == foj.c && $$3.b()) {
               $$3.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.e();
            }
         },
         Codec.INT.xmap(foj::a, foj::b)
      ),
      foj.b,
      $$0x -> {
      }
   );
   private final fov<Boolean> aD = fov.a("options.ao", true, $$0x -> fos.Q().f.e());
   private static final wy aE = wy.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final wy aF = wy.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final wy aG = wy.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fov<foy> aH = new fov<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> ftn.a(aE);
         case b -> ftn.a(aF);
         case c -> ftn.a(aG);
      };
   }, fov.b(), new fov.e<>(Arrays.asList(foy.values()), Codec.INT.xmap(foy::a, foy::b)), foy.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fov<cqv> aI = new fov<>(
      "options.chat.visibility", fov.a(), fov.b(), new fov.e<>(Arrays.asList(cqv.values()), Codec.INT.xmap(cqv::a, cqv::b)), cqv.a, $$0x -> {
      }
   );
   private final fov<Double> aJ = new fov<>("options.chat.opacity", fov.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fov.m.a, 1.0, $$0x -> fos.Q().m.d().b());
   private final fov<Double> aK = new fov<>("options.chat.line_spacing", fov.a(), fow::a, fov.m.a, 0.0, $$0x -> {
   });
   private static final wy aL = wy.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aM = 5;
   private final fov<Integer> aN = new fov<>("options.accessibility.menu_background_blurriness", fov.a(aL), fow::b, new fov.f(0, 10), 5, $$0x -> {
   });
   private final fov<Double> aO = new fov<>("options.accessibility.text_background_opacity", fov.a(), fow::a, fov.m.a, 0.5, $$0x -> fos.Q().m.d().b());
   private final fov<Double> aP = new fov<>("options.accessibility.panorama_speed", fov.a(), fow::a, fov.m.a, 1.0, $$0x -> {
   });
   private static final wy aQ = wy.c("options.accessibility.high_contrast.tooltip");
   private final fov<Boolean> aR = fov.a("options.accessibility.high_contrast", fov.a(aQ), false, $$0x -> {
      aun $$1x = fos.Q().ad();
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
   private final fov<Boolean> aT = fov.a("options.accessibility.high_contrast_block_outline", fov.a(aS), false);
   private final fov<Boolean> aU = fov.a(
      "options.accessibility.narrator_hotkey",
      fov.a(fos.a ? wy.c("options.accessibility.narrator_hotkey.mac.tooltip") : wy.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cqz> aV = EnumSet.allOf(cqz.class);
   private final fov<bwv> aW = new fov<>("options.mainHand", fov.a(), fov.b(), new fov.e<>(Arrays.asList(bwv.values()), bwv.c), bwv.b, $$0x -> {
   });
   public int o;
   public int p;
   private final fov<Double> aX = new fov<>(
      "options.chat.scale",
      fov.a(),
      ($$0x, $$1x) -> (wy)($$1x == 0.0 ? wx.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fov.m.a,
      1.0,
      $$0x -> fos.Q().m.d().b()
   );
   private final fov<Double> aY = new fov<>("options.chat.width", fov.a(), ($$0x, $$1x) -> c($$0x, fsd.a($$1x)), fov.m.a, 1.0, $$0x -> fos.Q().m.d().b());
   private final fov<Double> aZ = new fov<>(
      "options.chat.height.unfocused", fov.a(), ($$0x, $$1x) -> c($$0x, fsd.b($$1x)), fov.m.a, fsd.i(), $$0x -> fos.Q().m.d().b()
   );
   private final fov<Double> ba = new fov<>(
      "options.chat.height.focused", fov.a(), ($$0x, $$1x) -> c($$0x, fsd.b($$1x)), fov.m.a, 1.0, $$0x -> fos.Q().m.d().b()
   );
   private final fov<Double> bb = new fov<>(
      "options.chat.delay_instant",
      fov.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? wy.c("options.chat.delay_none") : wy.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fov.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fos.Q().aZ().a($$0x)
   );
   private static final wy bc = wy.c("options.notifications.display_time.tooltip");
   private final fov<Double> bd = new fov<>(
      "options.notifications.display_time",
      fov.a(bc),
      ($$0x, $$1x) -> a($$0x, wy.a("options.multiplier", $$1x)),
      new fov.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final fov<Integer> be = new fov<>(
      "options.mipmapLevels", fov.a(), ($$0x, $$1x) -> (wy)($$1x == 0 ? wx.a($$0x, false) : a($$0x, $$1x.intValue())), new fov.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final fov<fny> bf = new fov<>(
      "options.attackIndicator", fov.a(), fov.b(), new fov.e<>(Arrays.asList(fny.values()), Codec.INT.xmap(fny::a, fny::b)), fny.b, $$0x -> {
      }
   );
   public how r = how.a;
   public boolean s = false;
   private final fov<Integer> bg = new fov<>("options.biomeBlendRadius", fov.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, wy.c("options.biomeBlendRadius." + $$2x));
   }, new fov.f(0, 7, false), 2, $$0x -> fos.Q().f.e());
   private final fov<Double> bh = new fov<>(
      "options.mouseWheelSensitivity",
      fov.a(),
      ($$0x, $$1x) -> a($$0x, wy.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fov.f(-200, 100).a(fow::c, fow::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final fov<Boolean> bi = fov.a("options.rawMouseInput", true, $$0x -> {
      fif $$1x = fos.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fov<Boolean> bj = fov.a("options.autoJump", false);
   private static final wy bk = wy.c("options.rotateWithMinecart.tooltip");
   private final fov<Boolean> bl = fov.a("options.rotateWithMinecart", fov.a(bk), false);
   private final fov<Boolean> bm = fov.a("options.operatorItemsTab", false);
   private final fov<Boolean> bn = fov.a("options.autoSuggestCommands", true);
   private final fov<Boolean> bo = fov.a("options.chat.color", true);
   private final fov<Boolean> bp = fov.a("options.chat.links", true);
   private final fov<Boolean> bq = fov.a("options.chat.links.prompt", true);
   private final fov<Boolean> br = fov.a("options.vsync", true, $$0x -> {
      if (fos.Q().aO() != null) {
         fos.Q().aO().a($$0x);
      }
   });
   private final fov<Boolean> bs = fov.a("options.entityShadows", true);
   private final fov<Boolean> bt = fov.a("options.forceUnicodeFont", false, $$0x -> aI());
   private final fov<Boolean> bu = fov.a("options.japaneseGlyphVariants", fov.a(wy.c("options.japaneseGlyphVariants.tooltip")), aJ(), $$0x -> aI());
   private final fov<Boolean> bv = fov.a("options.invertMouse", false);
   private final fov<Boolean> bw = fov.a("options.discrete_mouse_scroll", false);
   private static final wy bx = wy.c("options.realmsNotifications.tooltip");
   private final fov<Boolean> by = fov.a("options.realmsNotifications", fov.a(bx), true);
   private static final wy bz = wy.c("options.allowServerListing.tooltip");
   private final fov<Boolean> bA = fov.a("options.allowServerListing", fov.a(bz), true, $$0x -> {
   });
   private final fov<Boolean> bB = fov.a("options.reducedDebugInfo", false);
   private final Map<awo, fov<Double>> bC = af.a(awo.class, $$0x -> this.a("soundCategory." + $$0x.a(), $$0x));
   private final fov<Boolean> bD = fov.a("options.showSubtitles", false);
   private static final wy bE = wy.c("options.directionalAudio.on.tooltip");
   private static final wy bF = wy.c("options.directionalAudio.off.tooltip");
   private final fov<Boolean> bG = fov.a("options.directionalAudio", $$0x -> $$0x ? ftn.a(bE) : ftn.a(bF), false, $$0x -> {
      hns $$1x = fos.Q().ak();
      $$1x.k();
      $$1x.a(hmh.a(awn.Bs, 1.0F));
   });
   private final fov<Boolean> bH = new fov<>(
      "options.accessibility.text_background",
      fov.a(),
      ($$0x, $$1x) -> $$1x ? wy.c("options.accessibility.text_background.chat") : wy.c("options.accessibility.text_background.everywhere"),
      fov.a,
      true,
      $$0x -> {
      }
   );
   private final fov<Boolean> bI = fov.a("options.touchscreen", false);
   private final fov<Boolean> bJ = fov.a("options.fullscreen", false, $$0x -> {
      fos $$1x = fos.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ad().a($$1x.aO().i());
      }
   });
   private final fov<Boolean> bK = fov.a("options.viewBobbing", true);
   private static final wy bL = wy.c("options.key.toggle");
   private static final wy bM = wy.c("options.key.hold");
   private final fov<Boolean> bN = new fov<>("key.sneak", fov.a(), ($$0x, $$1x) -> $$1x ? bL : bM, fov.a, false, $$0x -> {
   });
   private final fov<Boolean> bO = new fov<>("key.sprint", fov.a(), ($$0x, $$1x) -> $$1x ? bL : bM, fov.a, false, $$0x -> {
   });
   public boolean u;
   private static final wy bP = wy.c("options.hideMatchedNames.tooltip");
   private final fov<Boolean> bQ = fov.a("options.hideMatchedNames", fov.a(bP), true);
   private final fov<Boolean> bR = fov.a("options.autosaveIndicator", true);
   private static final wy bS = wy.c("options.onlyShowSecureChat.tooltip");
   private final fov<Boolean> bT = fov.a("options.onlyShowSecureChat", fov.a(bS), false);
   public final fop v = new fop("key.forward", 87, "key.categories.movement");
   public final fop w = new fop("key.left", 65, "key.categories.movement");
   public final fop x = new fop("key.back", 83, "key.categories.movement");
   public final fop y = new fop("key.right", 68, "key.categories.movement");
   public final fop z = new fop("key.jump", 32, "key.categories.movement");
   public final fop A = new fpd("key.sneak", 340, "key.categories.movement", this.bN::c);
   public final fop B = new fpd("key.sprint", 341, "key.categories.movement", this.bO::c);
   public final fop C = new fop("key.inventory", 69, "key.categories.inventory");
   public final fop D = new fop("key.swapOffhand", 70, "key.categories.inventory");
   public final fop E = new fop("key.drop", 81, "key.categories.inventory");
   public final fop F = new fop("key.use", fhx.b.c, 1, "key.categories.gameplay");
   public final fop G = new fop("key.attack", fhx.b.c, 0, "key.categories.gameplay");
   public final fop H = new fop("key.pickItem", fhx.b.c, 2, "key.categories.gameplay");
   public final fop I = new fop("key.chat", 84, "key.categories.multiplayer");
   public final fop J = new fop("key.playerlist", 258, "key.categories.multiplayer");
   public final fop K = new fop("key.command", 47, "key.categories.multiplayer");
   public final fop L = new fop("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fop M = new fop("key.screenshot", 291, "key.categories.misc");
   public final fop N = new fop("key.togglePerspective", 294, "key.categories.misc");
   public final fop O = new fop("key.smoothCamera", fhx.bv.b(), "key.categories.misc");
   public final fop P = new fop("key.fullscreen", 300, "key.categories.misc");
   public final fop Q = new fop("key.spectatorOutlines", fhx.bv.b(), "key.categories.misc");
   public final fop R = new fop("key.advancements", 76, "key.categories.misc");
   public final fop[] S = new fop[]{
      new fop("key.hotbar.1", 49, "key.categories.inventory"),
      new fop("key.hotbar.2", 50, "key.categories.inventory"),
      new fop("key.hotbar.3", 51, "key.categories.inventory"),
      new fop("key.hotbar.4", 52, "key.categories.inventory"),
      new fop("key.hotbar.5", 53, "key.categories.inventory"),
      new fop("key.hotbar.6", 54, "key.categories.inventory"),
      new fop("key.hotbar.7", 55, "key.categories.inventory"),
      new fop("key.hotbar.8", 56, "key.categories.inventory"),
      new fop("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fop T = new fop("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fop U = new fop("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fop[] V = (fop[])ArrayUtils.addAll(
      new fop[]{
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
   protected fos W;
   private final File bU;
   public boolean X;
   private foa bV = foa.a;
   public String Y = "";
   public boolean Z;
   private final fov<Integer> bW = new fov<>("options.fov", fov.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, wy.c("options.fov.min"));
         case 110 -> a($$0x, wy.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fov.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fos.Q().f.p());
   private static final wy bX = wy.a("options.telemetry.button.tooltip", wy.c("options.telemetry.state.minimal"), wy.c("options.telemetry.state.all"));
   private final fov<Boolean> bY = fov.a("options.telemetry.button", fov.a(bX), ($$0x, $$1x) -> {
      fos $$2x = fos.Q();
      if (!$$2x.E()) {
         return wy.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? wy.c("options.telemetry.state.all") : wy.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final wy bZ = wy.c("options.screenEffectScale.tooltip");
   private final fov<Double> ca = new fov<>("options.screenEffectScale", fov.a(bZ), fow::b, fov.m.a, 1.0, $$0x -> {
   });
   private static final wy cb = wy.c("options.fovEffectScale.tooltip");
   private final fov<Double> cc = new fov<>(
      "options.fovEffectScale", fov.a(cb), fow::b, fov.m.a.a(azm::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final wy cd = wy.c("options.darknessEffectScale.tooltip");
   private final fov<Double> ce = new fov<>("options.darknessEffectScale", fov.a(cd), fow::b, fov.m.a.a(azm::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final wy cf = wy.c("options.glintSpeed.tooltip");
   private final fov<Double> cg = new fov<>("options.glintSpeed", fov.a(cf), fow::b, fov.m.a, 0.5, $$0x -> {
   });
   private static final wy ch = wy.c("options.glintStrength.tooltip");
   private final fov<Double> ci = new fov<>("options.glintStrength", fov.a(ch), fow::b, fov.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final wy cj = wy.c("options.damageTiltStrength.tooltip");
   private final fov<Double> ck = new fov<>("options.damageTiltStrength", fov.a(cj), fow::b, fov.m.a, 1.0, $$0x -> {
   });
   private final fov<Double> cl = new fov<>("options.gamma", fov.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, wy.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, wy.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, wy.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fov.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cm = 2147483646;
   private final fov<Integer> cn = new fov<>(
      "options.guiScale", fov.a(), ($$0x, $$1x) -> $$1x == 0 ? wy.c("options.guiScale.auto") : wy.b(Integer.toString($$1x)), new fov.c(0, () -> {
         fos $$0x = fos.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final fov<ari> co = new fov<>(
      "options.particles", fov.a(), fov.b(), new fov.e<>(Arrays.asList(ari.values()), Codec.INT.xmap(ari::a, ari::b)), ari.a, $$0x -> {
      }
   );
   private final fov<fou> cp = new fov<>(
      "options.narrator",
      fov.a(),
      ($$0x, $$1x) -> (wy)(this.W.aY().a() ? $$1x.b() : wy.c("options.narrator.notavailable")),
      new fov.e<>(Arrays.asList(fou.values()), Codec.INT.xmap(fou::a, fou::a)),
      fou.a,
      $$0x -> this.W.aY().a($$0x)
   );
   public String ab = "en_us";
   private final fov<String> cq = new fov<>(
      "options.audioDevice",
      fov.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return wy.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? wy.b($$1x.substring(hnp.c)) : wy.b($$1x);
         }
      },
      new fov.h<>(
         () -> Stream.concat(Stream.of(""), fos.Q().ak().a().stream()).toList(),
         $$0x -> fos.Q().r() && $$0x != "" && !fos.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hns $$1x = fos.Q().ak();
         $$1x.k();
         $$1x.a(hmh.a(awn.Bs, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;
   public boolean ae = true;

   public fov<Boolean> a() {
      return this.ak;
   }

   public fov<Boolean> b() {
      return this.am;
   }

   public fov<Boolean> c() {
      return this.ao;
   }

   public fov<Double> d() {
      return this.ap;
   }

   public fov<Integer> e() {
      return this.aq;
   }

   public fov<Integer> f() {
      return this.ar;
   }

   public fov<Double> g() {
      return this.at;
   }

   public fov<Integer> h() {
      return this.au;
   }

   public fov<fon> i() {
      return this.ax;
   }

   public fov<fod> j() {
      return this.ay;
   }

   public fov<foj> k() {
      return this.aC;
   }

   public fov<Boolean> l() {
      return this.aD;
   }

   public fov<foy> m() {
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

   public fov<cqv> n() {
      return this.aI;
   }

   public fov<Double> o() {
      return this.aJ;
   }

   public fov<Double> p() {
      return this.aK;
   }

   public fov<Integer> q() {
      return this.aN;
   }

   public int r() {
      return this.q().c();
   }

   public fov<Double> s() {
      return this.aO;
   }

   public fov<Double> t() {
      return this.aP;
   }

   public fov<Boolean> u() {
      return this.aR;
   }

   public fov<Boolean> v() {
      return this.aT;
   }

   public fov<Boolean> w() {
      return this.aU;
   }

   public fov<bwv> x() {
      return this.aW;
   }

   public fov<Double> y() {
      return this.aX;
   }

   public fov<Double> z() {
      return this.aY;
   }

   public fov<Double> A() {
      return this.aZ;
   }

   public fov<Double> B() {
      return this.ba;
   }

   public fov<Double> C() {
      return this.bb;
   }

   public fov<Double> D() {
      return this.bd;
   }

   public fov<Integer> E() {
      return this.be;
   }

   public fov<fny> F() {
      return this.bf;
   }

   public fov<Integer> G() {
      return this.bg;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return azm.a(Math.log10($$0) * 100.0);
   }

   public fov<Double> H() {
      return this.bh;
   }

   public fov<Boolean> I() {
      return this.bi;
   }

   public fov<Boolean> J() {
      return this.bj;
   }

   public fov<Boolean> K() {
      return this.bl;
   }

   public fov<Boolean> L() {
      return this.bm;
   }

   public fov<Boolean> M() {
      return this.bn;
   }

   public fov<Boolean> N() {
      return this.bo;
   }

   public fov<Boolean> O() {
      return this.bp;
   }

   public fov<Boolean> P() {
      return this.bq;
   }

   public fov<Boolean> Q() {
      return this.br;
   }

   public fov<Boolean> R() {
      return this.bs;
   }

   private static void aI() {
      fos $$0 = fos.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fov<Boolean> S() {
      return this.bt;
   }

   private static boolean aJ() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fov<Boolean> T() {
      return this.bu;
   }

   public fov<Boolean> U() {
      return this.bv;
   }

   public fov<Boolean> V() {
      return this.bw;
   }

   public fov<Boolean> W() {
      return this.by;
   }

   public fov<Boolean> X() {
      return this.bA;
   }

   public fov<Boolean> Y() {
      return this.bB;
   }

   public final float a(awo $$0) {
      return this.b($$0).c().floatValue();
   }

   public final fov<Double> b(awo $$0) {
      return Objects.requireNonNull(this.bC.get($$0));
   }

   private fov<Double> a(String $$0, awo $$1) {
      return new fov<>($$0, fov.a(), fow::b, fov.m.a, 1.0, $$1x -> fos.Q().ak().a($$1, $$1x.floatValue()));
   }

   public fov<Boolean> Z() {
      return this.bD;
   }

   public fov<Boolean> aa() {
      return this.bG;
   }

   public fov<Boolean> ab() {
      return this.bH;
   }

   public fov<Boolean> ac() {
      return this.bI;
   }

   public fov<Boolean> ad() {
      return this.bJ;
   }

   public fov<Boolean> ae() {
      return this.bK;
   }

   public fov<Boolean> af() {
      return this.bN;
   }

   public fov<Boolean> ag() {
      return this.bO;
   }

   public fov<Boolean> ah() {
      return this.bQ;
   }

   public fov<Boolean> ai() {
      return this.bR;
   }

   public fov<Boolean> aj() {
      return this.bT;
   }

   public fov<Integer> ak() {
      return this.bW;
   }

   public fov<Boolean> al() {
      return this.bY;
   }

   public fov<Double> am() {
      return this.ca;
   }

   public fov<Double> an() {
      return this.cc;
   }

   public fov<Double> ao() {
      return this.ce;
   }

   public fov<Double> ap() {
      return this.cg;
   }

   public fov<Double> aq() {
      return this.ci;
   }

   public fov<Double> ar() {
      return this.ck;
   }

   public fov<Double> as() {
      return this.cl;
   }

   public fov<Integer> at() {
      return this.cn;
   }

   public fov<ari> au() {
      return this.co;
   }

   public fov<fou> av() {
      return this.cp;
   }

   public fov<String> aw() {
      return this.cq;
   }

   public void ax() {
      this.ac = false;
      this.az();
   }

   public fow(fos $$0, File $$1) {
      this.W = $$0;
      this.bU = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new fov<>(
         "options.renderDistance",
         fov.a(),
         ($$0x, $$1x) -> a($$0x, wy.a("options.chunks", $$1x)),
         new fov.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fos.Q().f.p()
      );
      this.ar = new fov<>(
         "options.simulationDistance", fov.a(), ($$0x, $$1x) -> a($$0x, wy.a("options.chunks", $$1x)), new fov.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
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

   private void a(fow.b $$0) {
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

   private void a(fow.a $$0) {
      this.a((fow.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, fow::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fow::c, ag::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, how::a, how::a);
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

      for (fop $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fhx.a($$3));
         }
      }

      for (awo $$4 : awo.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bC.get($$4));
      }

      for (cqz $$5 : cqz.values()) {
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
               this.aC.a(foj.b);
            } else {
               this.aC.a(foj.a);
            }
         }

         this.a(new fow.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.c($$0).p_() : null;
            }

            @Override
            public <T> void a(String $$0, fov<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> fow.af.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     fow.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? fow.a($$2) : $$1;
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
               } else if (fow.a($$2)) {
                  return 1.0F;
               } else if (fow.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     fow.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         fop.d();
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
         this.a(new fow.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fov<T> $$1) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1x -> fow.af.error("Error saving option " + $$1 + ": " + $$1x)).ifSuccess($$2x -> {
                  this.a($$0);
                  $$0.println(fow.ag.toJson($$2x));
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
      fif $$0 = this.W.aO();
      if ($$0 == null) {
         return this.k;
      } else {
         return $$0.e().isPresent() ? $$0.e().get().g() : null;
      }
   }

   public ara aA() {
      int $$0 = 0;

      for (cqz $$1 : this.aV) {
         $$0 |= $$1.a();
      }

      return new ara(this.ab, this.aq.c(), this.aI.c(), this.bo.c(), $$0, this.aW.c(), this.W.aT(), this.bA.c(), this.co.c());
   }

   public void aB() {
      if (this.W.t != null) {
         this.W.t.j.a(this.aA());
      }
   }

   public void a(cqz $$0, boolean $$1) {
      if ($$1) {
         this.aV.add($$0);
      } else {
         this.aV.remove($$0);
      }
   }

   public boolean a(cqz $$0) {
      return this.aV.contains($$0);
   }

   public fod aC() {
      return this.aH() >= 4 ? this.ay.c() : fod.a;
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

   public foa aE() {
      return this.bV;
   }

   public void a(foa $$0) {
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
      this.a(new fow.b() {
         @Override
         public <T> void a(String $$0x, fov<T> $$1) {
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

   interface a extends fow.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fov<T> var2);
   }
}
