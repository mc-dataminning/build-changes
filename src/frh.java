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

public class frh {
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
   private static final xa aj = xa.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final frg<Boolean> ak = frg.a("options.darkMojangStudiosBackgroundColor", frg.a(aj), false);
   private static final xa al = xa.c("options.hideLightningFlashes.tooltip");
   private final frg<Boolean> am = frg.a("options.hideLightningFlashes", frg.a(al), false);
   private static final xa an = xa.c("options.hideSplashTexts.tooltip");
   private final frg<Boolean> ao = frg.a("options.hideSplashTexts", frg.a(an), false);
   private final frg<Double> ap = new frg<>("options.sensitivity", frg.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xa.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xa.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, frg.m.a, 0.5, $$0x -> {
   });
   private final frg<Integer> aq;
   private final frg<Integer> ar;
   private int as = 0;
   private final frg<Double> at = new frg<>(
      "options.entityDistanceScaling",
      frg.a(),
      frh::a,
      new frg.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final frg<Integer> au = new frg<>(
      "options.framerateLimit",
      frg.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xa.c("options.framerateLimit.max")) : a($$0x, xa.a("options.framerate", $$1x)),
      new frg.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> frd.Q().aP().a($$0x)
   );
   private static final xa av = xa.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final xa aw = xa.c("options.inactivityFpsLimit.afk.tooltip");
   private final frg<fqz> ax = new frg<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> fvw.a(av);
         case b -> fvw.a(aw);
      };
   }, frg.b(), new frg.e<>(Arrays.asList(fqz.values()), fqz.c), fqz.b, $$0x -> {
   });
   private final frg<fqp> ay = new frg<>(
      "options.renderClouds",
      frg.a(),
      frg.b(),
      new frg.e<>(Arrays.asList(fqp.values()), Codec.withAlternative(fqp.d, Codec.BOOL, $$0x -> $$0x ? fqp.c : fqp.a)),
      fqp.c,
      $$0x -> {
      }
   );
   private static final xa az = xa.c("options.graphics.fast.tooltip");
   private static final xa aA = xa.a("options.graphics.fabulous.tooltip", xa.c("options.graphics.fabulous").a(o.u));
   private static final xa aB = xa.c("options.graphics.fancy.tooltip");
   private final frg<fqv> aC = new frg<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fvw.a(aB);
            case a -> fvw.a(az);
            case c -> fvw.a(aA);
         };
      },
      ($$0x, $$1x) -> {
         xo $$2x = xa.c($$1x.a());
         return $$1x == fqv.c ? $$2x.a(o.u) : $$2x;
      },
      new frg.a<>(
         Arrays.asList(fqv.values()),
         Stream.of(fqv.values()).filter($$0x -> $$0x != fqv.c).collect(Collectors.toList()),
         () -> frd.Q().r() && frd.Q().aj().g(),
         ($$0x, $$1x) -> {
            frd $$2x = frd.Q();
            grr $$3 = $$2x.aj();
            if ($$1x == fqv.c && $$3.b()) {
               $$3.c();
            } else {
               $$0x.a($$1x);
               $$2x.f.d();
            }
         },
         Codec.INT.xmap(fqv::a, fqv::b)
      ),
      fqv.b,
      $$0x -> {
      }
   );
   private final frg<Boolean> aD = frg.a("options.ao", true, $$0x -> frd.Q().f.d());
   private static final xa aE = xa.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xa aF = xa.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xa aG = xa.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final frg<frj> aH = new frg<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fvw.a(aE);
         case b -> fvw.a(aF);
         case c -> fvw.a(aG);
      };
   }, frg.b(), new frg.e<>(Arrays.asList(frj.values()), Codec.INT.xmap(frj::a, frj::b)), frj.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final frg<cru> aI = new frg<>(
      "options.chat.visibility", frg.a(), frg.b(), new frg.e<>(Arrays.asList(cru.values()), Codec.INT.xmap(cru::a, cru::b)), cru.a, $$0x -> {
      }
   );
   private final frg<Double> aJ = new frg<>("options.chat.opacity", frg.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), frg.m.a, 1.0, $$0x -> frd.Q().m.d().b());
   private final frg<Double> aK = new frg<>("options.chat.line_spacing", frg.a(), frh::a, frg.m.a, 0.0, $$0x -> {
   });
   private static final xa aL = xa.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aM = 5;
   private final frg<Integer> aN = new frg<>("options.accessibility.menu_background_blurriness", frg.a(aL), frh::b, new frg.f(0, 10), 5, $$0x -> {
   });
   private final frg<Double> aO = new frg<>("options.accessibility.text_background_opacity", frg.a(), frh::a, frg.m.a, 0.5, $$0x -> frd.Q().m.d().b());
   private final frg<Double> aP = new frg<>("options.accessibility.panorama_speed", frg.a(), frh::a, frg.m.a, 1.0, $$0x -> {
   });
   private static final xa aQ = xa.c("options.accessibility.high_contrast.tooltip");
   private final frg<Boolean> aR = frg.a("options.accessibility.high_contrast", frg.a(aQ), false, $$0x -> {
      aup $$1x = frd.Q().ad();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private static final xa aS = xa.c("options.accessibility.high_contrast_block_outline.tooltip");
   private final frg<Boolean> aT = frg.a("options.accessibility.high_contrast_block_outline", frg.a(aS), false);
   private final frg<Boolean> aU = frg.a(
      "options.accessibility.narrator_hotkey",
      frg.a(frd.a ? xa.c("options.accessibility.narrator_hotkey.mac.tooltip") : xa.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<crz> aV = EnumSet.allOf(crz.class);
   private final frg<bxl> aW = new frg<>("options.mainHand", frg.a(), frg.b(), new frg.e<>(Arrays.asList(bxl.values()), bxl.c), bxl.b, $$0x -> {
   });
   public int o;
   public int p;
   private final frg<Double> aX = new frg<>(
      "options.chat.scale",
      frg.a(),
      ($$0x, $$1x) -> (xa)($$1x == 0.0 ? wz.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      frg.m.a,
      1.0,
      $$0x -> frd.Q().m.d().b()
   );
   private final frg<Double> aY = new frg<>("options.chat.width", frg.a(), ($$0x, $$1x) -> c($$0x, fum.a($$1x)), frg.m.a, 1.0, $$0x -> frd.Q().m.d().b());
   private final frg<Double> aZ = new frg<>(
      "options.chat.height.unfocused", frg.a(), ($$0x, $$1x) -> c($$0x, fum.b($$1x)), frg.m.a, fum.i(), $$0x -> frd.Q().m.d().b()
   );
   private final frg<Double> ba = new frg<>(
      "options.chat.height.focused", frg.a(), ($$0x, $$1x) -> c($$0x, fum.b($$1x)), frg.m.a, 1.0, $$0x -> frd.Q().m.d().b()
   );
   private final frg<Double> bb = new frg<>(
      "options.chat.delay_instant",
      frg.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xa.c("options.chat.delay_none") : xa.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new frg.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> frd.Q().aZ().a($$0x)
   );
   private static final xa bc = xa.c("options.notifications.display_time.tooltip");
   private final frg<Double> bd = new frg<>(
      "options.notifications.display_time",
      frg.a(bc),
      ($$0x, $$1x) -> a($$0x, xa.a("options.multiplier", $$1x)),
      new frg.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final frg<Integer> be = new frg<>(
      "options.mipmapLevels", frg.a(), ($$0x, $$1x) -> (xa)($$1x == 0 ? wz.a($$0x, false) : a($$0x, $$1x.intValue())), new frg.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final frg<fqk> bf = new frg<>(
      "options.attackIndicator", frg.a(), frg.b(), new frg.e<>(Arrays.asList(fqk.values()), Codec.INT.xmap(fqk::a, fqk::b)), fqk.b, $$0x -> {
      }
   );
   public hrh r = hrh.a;
   public boolean s = false;
   private final frg<Integer> bg = new frg<>("options.biomeBlendRadius", frg.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xa.c("options.biomeBlendRadius." + $$2x));
   }, new frg.f(0, 7, false), 2, $$0x -> frd.Q().f.d());
   private final frg<Double> bh = new frg<>(
      "options.mouseWheelSensitivity",
      frg.a(),
      ($$0x, $$1x) -> a($$0x, xa.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new frg.f(-200, 100).a(frh::c, frh::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final frg<Boolean> bi = frg.a("options.rawMouseInput", true, $$0x -> {
      fkk $$1x = frd.Q().aO();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final frg<Boolean> bj = frg.a("options.autoJump", false);
   private static final xa bk = xa.c("options.rotateWithMinecart.tooltip");
   private final frg<Boolean> bl = frg.a("options.rotateWithMinecart", frg.a(bk), false);
   private final frg<Boolean> bm = frg.a("options.operatorItemsTab", false);
   private final frg<Boolean> bn = frg.a("options.autoSuggestCommands", true);
   private final frg<Boolean> bo = frg.a("options.chat.color", true);
   private final frg<Boolean> bp = frg.a("options.chat.links", true);
   private final frg<Boolean> bq = frg.a("options.chat.links.prompt", true);
   private final frg<Boolean> br = frg.a("options.vsync", true, $$0x -> {
      if (frd.Q().aO() != null) {
         frd.Q().aO().a($$0x);
      }
   });
   private final frg<Boolean> bs = frg.a("options.entityShadows", true);
   private final frg<Boolean> bt = frg.a("options.forceUnicodeFont", false, $$0x -> aI());
   private final frg<Boolean> bu = frg.a("options.japaneseGlyphVariants", frg.a(xa.c("options.japaneseGlyphVariants.tooltip")), aJ(), $$0x -> aI());
   private final frg<Boolean> bv = frg.a("options.invertMouse", false);
   private final frg<Boolean> bw = frg.a("options.discrete_mouse_scroll", false);
   private static final xa bx = xa.c("options.realmsNotifications.tooltip");
   private final frg<Boolean> by = frg.a("options.realmsNotifications", frg.a(bx), true);
   private static final xa bz = xa.c("options.allowServerListing.tooltip");
   private final frg<Boolean> bA = frg.a("options.allowServerListing", frg.a(bz), true, $$0x -> {
   });
   private final frg<Boolean> bB = frg.a("options.reducedDebugInfo", false);
   private final Map<awq, frg<Double>> bC = ag.a(awq.class, $$0x -> this.a("soundCategory." + $$0x.a(), $$0x));
   private final frg<Boolean> bD = frg.a("options.showSubtitles", false);
   private static final xa bE = xa.c("options.directionalAudio.on.tooltip");
   private static final xa bF = xa.c("options.directionalAudio.off.tooltip");
   private final frg<Boolean> bG = frg.a("options.directionalAudio", $$0x -> $$0x ? fvw.a(bE) : fvw.a(bF), false, $$0x -> {
      hqd $$1x = frd.Q().ak();
      $$1x.j();
      $$1x.a(hos.a(awp.Bv, 1.0F));
   });
   private final frg<Boolean> bH = new frg<>(
      "options.accessibility.text_background",
      frg.a(),
      ($$0x, $$1x) -> $$1x ? xa.c("options.accessibility.text_background.chat") : xa.c("options.accessibility.text_background.everywhere"),
      frg.a,
      true,
      $$0x -> {
      }
   );
   private final frg<Boolean> bI = frg.a("options.touchscreen", false);
   private final frg<Boolean> bJ = frg.a("options.fullscreen", false, $$0x -> {
      frd $$1x = frd.Q();
      if ($$1x.aO() != null && $$1x.aO().i() != $$0x) {
         $$1x.aO().g();
         this.ad().a($$1x.aO().i());
      }
   });
   private final frg<Boolean> bK = frg.a("options.viewBobbing", true);
   private static final xa bL = xa.c("options.key.toggle");
   private static final xa bM = xa.c("options.key.hold");
   private final frg<Boolean> bN = new frg<>("key.sneak", frg.a(), ($$0x, $$1x) -> $$1x ? bL : bM, frg.a, false, $$0x -> {
   });
   private final frg<Boolean> bO = new frg<>("key.sprint", frg.a(), ($$0x, $$1x) -> $$1x ? bL : bM, frg.a, false, $$0x -> {
   });
   public boolean u;
   private static final xa bP = xa.c("options.hideMatchedNames.tooltip");
   private final frg<Boolean> bQ = frg.a("options.hideMatchedNames", frg.a(bP), true);
   private final frg<Boolean> bR = frg.a("options.autosaveIndicator", true);
   private static final xa bS = xa.c("options.onlyShowSecureChat.tooltip");
   private final frg<Boolean> bT = frg.a("options.onlyShowSecureChat", frg.a(bS), false);
   public final frb v = new frb("key.forward", 87, "key.categories.movement");
   public final frb w = new frb("key.left", 65, "key.categories.movement");
   public final frb x = new frb("key.back", 83, "key.categories.movement");
   public final frb y = new frb("key.right", 68, "key.categories.movement");
   public final frb z = new frb("key.jump", 32, "key.categories.movement");
   public final frb A = new fro("key.sneak", 340, "key.categories.movement", this.bN::c);
   public final frb B = new fro("key.sprint", 341, "key.categories.movement", this.bO::c);
   public final frb C = new frb("key.inventory", 69, "key.categories.inventory");
   public final frb D = new frb("key.swapOffhand", 70, "key.categories.inventory");
   public final frb E = new frb("key.drop", 81, "key.categories.inventory");
   public final frb F = new frb("key.use", fka.b.c, 1, "key.categories.gameplay");
   public final frb G = new frb("key.attack", fka.b.c, 0, "key.categories.gameplay");
   public final frb H = new frb("key.pickItem", fka.b.c, 2, "key.categories.gameplay");
   public final frb I = new frb("key.chat", 84, "key.categories.multiplayer");
   public final frb J = new frb("key.playerlist", 258, "key.categories.multiplayer");
   public final frb K = new frb("key.command", 47, "key.categories.multiplayer");
   public final frb L = new frb("key.socialInteractions", 80, "key.categories.multiplayer");
   public final frb M = new frb("key.screenshot", 291, "key.categories.misc");
   public final frb N = new frb("key.togglePerspective", 294, "key.categories.misc");
   public final frb O = new frb("key.smoothCamera", fka.bv.b(), "key.categories.misc");
   public final frb P = new frb("key.fullscreen", 300, "key.categories.misc");
   public final frb Q = new frb("key.spectatorOutlines", fka.bv.b(), "key.categories.misc");
   public final frb R = new frb("key.advancements", 76, "key.categories.misc");
   public final frb[] S = new frb[]{
      new frb("key.hotbar.1", 49, "key.categories.inventory"),
      new frb("key.hotbar.2", 50, "key.categories.inventory"),
      new frb("key.hotbar.3", 51, "key.categories.inventory"),
      new frb("key.hotbar.4", 52, "key.categories.inventory"),
      new frb("key.hotbar.5", 53, "key.categories.inventory"),
      new frb("key.hotbar.6", 54, "key.categories.inventory"),
      new frb("key.hotbar.7", 55, "key.categories.inventory"),
      new frb("key.hotbar.8", 56, "key.categories.inventory"),
      new frb("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final frb T = new frb("key.saveToolbarActivator", 67, "key.categories.creative");
   public final frb U = new frb("key.loadToolbarActivator", 88, "key.categories.creative");
   public final frb[] V = (frb[])ArrayUtils.addAll(
      new frb[]{
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
   protected frd W;
   private final File bU;
   public boolean X;
   private fqm bV = fqm.a;
   public String Y = "";
   public boolean Z;
   private final frg<Integer> bW = new frg<>("options.fov", frg.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xa.c("options.fov.min"));
         case 110 -> a($$0x, xa.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new frg.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> frd.Q().f.o());
   private static final xa bX = xa.a("options.telemetry.button.tooltip", xa.c("options.telemetry.state.minimal"), xa.c("options.telemetry.state.all"));
   private final frg<Boolean> bY = frg.a("options.telemetry.button", frg.a(bX), ($$0x, $$1x) -> {
      frd $$2x = frd.Q();
      if (!$$2x.E()) {
         return xa.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.D() ? xa.c("options.telemetry.state.all") : xa.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final xa bZ = xa.c("options.screenEffectScale.tooltip");
   private final frg<Double> ca = new frg<>("options.screenEffectScale", frg.a(bZ), frh::b, frg.m.a, 1.0, $$0x -> {
   });
   private static final xa cb = xa.c("options.fovEffectScale.tooltip");
   private final frg<Double> cc = new frg<>(
      "options.fovEffectScale", frg.a(cb), frh::b, frg.m.a.a(azo::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {
      }
   );
   private static final xa cd = xa.c("options.darknessEffectScale.tooltip");
   private final frg<Double> ce = new frg<>("options.darknessEffectScale", frg.a(cd), frh::b, frg.m.a.a(azo::k, Math::sqrt), 1.0, $$0x -> {
   });
   private static final xa cf = xa.c("options.glintSpeed.tooltip");
   private final frg<Double> cg = new frg<>("options.glintSpeed", frg.a(cf), frh::b, frg.m.a, 0.5, $$0x -> {
   });
   private static final xa ch = xa.c("options.glintStrength.tooltip");
   private final frg<Double> ci = new frg<>("options.glintStrength", frg.a(ch), frh::b, frg.m.a, 0.75, RenderSystem::setShaderGlintAlpha);
   private static final xa cj = xa.c("options.damageTiltStrength.tooltip");
   private final frg<Double> ck = new frg<>("options.damageTiltStrength", frg.a(cj), frh::b, frg.m.a, 1.0, $$0x -> {
   });
   private final frg<Double> cl = new frg<>("options.gamma", frg.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xa.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xa.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xa.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, frg.m.a, 0.5, $$0x -> {
   });
   public static final int aa = 0;
   private static final int cm = 2147483646;
   private final frg<Integer> cn = new frg<>(
      "options.guiScale", frg.a(), ($$0x, $$1x) -> $$1x == 0 ? xa.c("options.guiScale.auto") : xa.b(Integer.toString($$1x)), new frg.c(0, () -> {
         frd $$0x = frd.Q();
         return !$$0x.r() ? 2147483646 : $$0x.aO().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.W.a()
   );
   private final frg<ark> co = new frg<>(
      "options.particles", frg.a(), frg.b(), new frg.e<>(Arrays.asList(ark.values()), Codec.INT.xmap(ark::a, ark::b)), ark.a, $$0x -> {
      }
   );
   private final frg<frf> cp = new frg<>(
      "options.narrator",
      frg.a(),
      ($$0x, $$1x) -> (xa)(this.W.aY().a() ? $$1x.b() : xa.c("options.narrator.notavailable")),
      new frg.e<>(Arrays.asList(frf.values()), Codec.INT.xmap(frf::a, frf::a)),
      frf.a,
      $$0x -> this.W.aY().a($$0x)
   );
   public String ab = "en_us";
   private final frg<String> cq = new frg<>(
      "options.audioDevice",
      frg.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xa.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xa.b($$1x.substring(hqa.c)) : xa.b($$1x);
         }
      },
      new frg.h<>(
         () -> Stream.concat(Stream.of(""), frd.Q().ak().a().stream()).toList(),
         $$0x -> frd.Q().r() && $$0x != "" && !frd.Q().ak().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hqd $$1x = frd.Q().ak();
         $$1x.j();
         $$1x.a(hos.a(awp.Bv, 1.0F));
      }
   );
   public boolean ac = true;
   public boolean ad;
   public boolean ae = true;

   public frg<Boolean> a() {
      return this.ak;
   }

   public frg<Boolean> b() {
      return this.am;
   }

   public frg<Boolean> c() {
      return this.ao;
   }

   public frg<Double> d() {
      return this.ap;
   }

   public frg<Integer> e() {
      return this.aq;
   }

   public frg<Integer> f() {
      return this.ar;
   }

   public frg<Double> g() {
      return this.at;
   }

   public frg<Integer> h() {
      return this.au;
   }

   public frg<fqz> i() {
      return this.ax;
   }

   public frg<fqp> j() {
      return this.ay;
   }

   public frg<fqv> k() {
      return this.aC;
   }

   public frg<Boolean> l() {
      return this.aD;
   }

   public frg<frj> m() {
      return this.aH;
   }

   public void a(aup $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (aum $$2 : $$0.g()) {
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

   public frg<cru> n() {
      return this.aI;
   }

   public frg<Double> o() {
      return this.aJ;
   }

   public frg<Double> p() {
      return this.aK;
   }

   public frg<Integer> q() {
      return this.aN;
   }

   public int r() {
      return this.q().c();
   }

   public frg<Double> s() {
      return this.aO;
   }

   public frg<Double> t() {
      return this.aP;
   }

   public frg<Boolean> u() {
      return this.aR;
   }

   public frg<Boolean> v() {
      return this.aT;
   }

   public frg<Boolean> w() {
      return this.aU;
   }

   public frg<bxl> x() {
      return this.aW;
   }

   public frg<Double> y() {
      return this.aX;
   }

   public frg<Double> z() {
      return this.aY;
   }

   public frg<Double> A() {
      return this.aZ;
   }

   public frg<Double> B() {
      return this.ba;
   }

   public frg<Double> C() {
      return this.bb;
   }

   public frg<Double> D() {
      return this.bd;
   }

   public frg<Integer> E() {
      return this.be;
   }

   public frg<fqk> F() {
      return this.bf;
   }

   public frg<Integer> G() {
      return this.bg;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return azo.a(Math.log10($$0) * 100.0);
   }

   public frg<Double> H() {
      return this.bh;
   }

   public frg<Boolean> I() {
      return this.bi;
   }

   public frg<Boolean> J() {
      return this.bj;
   }

   public frg<Boolean> K() {
      return this.bl;
   }

   public frg<Boolean> L() {
      return this.bm;
   }

   public frg<Boolean> M() {
      return this.bn;
   }

   public frg<Boolean> N() {
      return this.bo;
   }

   public frg<Boolean> O() {
      return this.bp;
   }

   public frg<Boolean> P() {
      return this.bq;
   }

   public frg<Boolean> Q() {
      return this.br;
   }

   public frg<Boolean> R() {
      return this.bs;
   }

   private static void aI() {
      frd $$0 = frd.Q();
      if ($$0.aO() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public frg<Boolean> S() {
      return this.bt;
   }

   private static boolean aJ() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public frg<Boolean> T() {
      return this.bu;
   }

   public frg<Boolean> U() {
      return this.bv;
   }

   public frg<Boolean> V() {
      return this.bw;
   }

   public frg<Boolean> W() {
      return this.by;
   }

   public frg<Boolean> X() {
      return this.bA;
   }

   public frg<Boolean> Y() {
      return this.bB;
   }

   public final float a(awq $$0) {
      return this.b($$0).c().floatValue();
   }

   public final frg<Double> b(awq $$0) {
      return Objects.requireNonNull(this.bC.get($$0));
   }

   private frg<Double> a(String $$0, awq $$1) {
      return new frg<>($$0, frg.a(), frh::b, frg.m.a, 1.0, $$1x -> frd.Q().ak().a($$1, $$1x.floatValue()));
   }

   public frg<Boolean> Z() {
      return this.bD;
   }

   public frg<Boolean> aa() {
      return this.bG;
   }

   public frg<Boolean> ab() {
      return this.bH;
   }

   public frg<Boolean> ac() {
      return this.bI;
   }

   public frg<Boolean> ad() {
      return this.bJ;
   }

   public frg<Boolean> ae() {
      return this.bK;
   }

   public frg<Boolean> af() {
      return this.bN;
   }

   public frg<Boolean> ag() {
      return this.bO;
   }

   public frg<Boolean> ah() {
      return this.bQ;
   }

   public frg<Boolean> ai() {
      return this.bR;
   }

   public frg<Boolean> aj() {
      return this.bT;
   }

   public frg<Integer> ak() {
      return this.bW;
   }

   public frg<Boolean> al() {
      return this.bY;
   }

   public frg<Double> am() {
      return this.ca;
   }

   public frg<Double> an() {
      return this.cc;
   }

   public frg<Double> ao() {
      return this.ce;
   }

   public frg<Double> ap() {
      return this.cg;
   }

   public frg<Double> aq() {
      return this.ci;
   }

   public frg<Double> ar() {
      return this.ck;
   }

   public frg<Double> as() {
      return this.cl;
   }

   public frg<Integer> at() {
      return this.cn;
   }

   public frg<ark> au() {
      return this.co;
   }

   public frg<frf> av() {
      return this.cp;
   }

   public frg<String> aw() {
      return this.cq;
   }

   public void ax() {
      this.ac = false;
      this.az();
   }

   public frh(frd $$0, File $$1) {
      this.W = $$0;
      this.bU = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.aq = new frg<>(
         "options.renderDistance",
         frg.a(),
         ($$0x, $$1x) -> a($$0x, xa.a("options.chunks", $$1x)),
         new frg.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> frd.Q().f.o()
      );
      this.ar = new frg<>(
         "options.simulationDistance", frg.a(), ($$0x, $$1x) -> a($$0x, xa.a("options.chunks", $$1x)), new frg.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {
         }
      );
      this.ad = ag.n() == ag.a.c;
      this.ay();
   }

   public float a(float $$0) {
      return this.bH.c() ? $$0 : this.s().c().floatValue();
   }

   public int b(float $$0) {
      return axy.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bH.c() ? $$0 : axy.a(this.aO.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(frh.b $$0) {
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

   private void a(frh.a $$0) {
      this.a((frh.b)$$0);
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
      this.i = $$0.a("resourcePacks", this.i, frh::c, ag::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, frh::c, ag::toJson);
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
      this.r = $$0.a("tutorialStep", this.r, hrh::a, hrh::a);
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

      for (frb $$1 : this.V) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fka.a($$3));
         }
      }

      for (awq $$4 : awq.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bC.get($$4));
      }

      for (crz $$5 : crz.values()) {
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
               } catch (Exception var3x) {
                  af.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final tz $$2 = this.a($$0);
         Optional<String> $$3 = $$2.i("fancyGraphics");
         if ($$3.isPresent() && !$$2.b("graphicsMode")) {
            this.aC.a(a($$3.get()) ? fqv.b : fqv.a);
         }

         this.a(
            new frh.a() {
               @Nullable
               private String a(String $$0) {
                  uy $$1 = $$2.a($$0);
                  if ($$1 == null) {
                     return null;
                  } else if ($$1 instanceof uw var3) {
                     uw var10000 = var3;

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
               public <T> void a(String $$0, frg<T> $$1) {
                  String $$2 = this.a($$0);
                  if ($$2 != null) {
                     JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                     JsonElement $$4 = JsonParser.parseReader($$3);
                     $$1.d()
                        .parse(JsonOps.INSTANCE, $$4)
                        .ifError($$2xx -> frh.af.error("Error parsing option value {} for option {}: {}", new Object[]{$$2, $$1, $$2xx.message()}))
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
                        frh.af.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                     }
                  }

                  return $$1;
               }

               @Override
               public boolean a(String $$0, boolean $$1) {
                  String $$2 = this.a($$0);
                  return $$2 != null ? frh.a($$2) : $$1;
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
                  } else if (frh.a($$2)) {
                     return 1.0F;
                  } else if (frh.b($$2)) {
                     return 0.0F;
                  } else {
                     try {
                        return Float.parseFloat($$2);
                     } catch (NumberFormatException var5) {
                        frh.af.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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
         frb.d();
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
         $$1 = $$0.i("version").map(Integer::parseInt).orElse(0);
      } catch (RuntimeException var4) {
      }

      return bbd.e.a(this.W.au(), $$0, $$1);
   }

   public void az() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bU), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ac.b().d().c());
         this.a(new frh.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, frg<T> $$1) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1x -> frh.af.error("Error saving option " + $$1 + ": " + $$1x)).ifSuccess($$2x -> {
                  this.a($$0);
                  $$0.println(frh.ag.toJson($$2x));
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
      fkk $$0 = this.W.aO();
      if ($$0 == null) {
         return this.k;
      } else {
         return $$0.e().isPresent() ? $$0.e().get().g() : null;
      }
   }

   public arc aA() {
      int $$0 = 0;

      for (crz $$1 : this.aV) {
         $$0 |= $$1.a();
      }

      return new arc(this.ab, this.aq.c(), this.aI.c(), this.bo.c(), $$0, this.aW.c(), this.W.aT(), this.bA.c(), this.co.c());
   }

   public void aB() {
      if (this.W.t != null) {
         this.W.t.j.a(this.aA());
      }
   }

   public void a(crz $$0, boolean $$1) {
      if ($$1) {
         this.aV.add($$0);
      } else {
         this.aV.remove($$0);
      }
   }

   public boolean a(crz $$0) {
      return this.aV.contains($$0);
   }

   public fqp aC() {
      return this.aH() >= 4 ? this.ay.c() : fqp.a;
   }

   public boolean aD() {
      return this.q;
   }

   public void b(aup $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         aum $$4 = $$0.c($$3);
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

   public fqm aE() {
      return this.bV;
   }

   public void a(fqm $$0) {
      this.bV = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = aze.a(ag, $$0, ah);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aF() {
      return this.bU;
   }

   public String aG() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new frh.b() {
         @Override
         public <T> void a(String $$0x, frg<T> $$1) {
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

   private static xa c(xa $$0, int $$1) {
      return xa.a("options.pixel_value", $$0, $$1);
   }

   private static xa a(xa $$0, double $$1) {
      return xa.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static xa a(xa $$0, xa $$1) {
      return xa.a("options.generic_value", $$0, $$1);
   }

   public static xa a(xa $$0, int $$1) {
      return a($$0, xa.b(Integer.toString($$1)));
   }

   public static xa b(xa $$0, int $$1) {
      return $$1 == 0 ? a($$0, wz.c) : a($$0, $$1);
   }

   private static xa b(xa $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, wz.c) : a($$0, $$1);
   }

   interface a extends frh.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, frg<T> var2);
   }
}
