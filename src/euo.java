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

public class euo {
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
   private static final vb al = vb.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final eun<Boolean> am = eun.a("options.darkMojangStudiosBackgroundColor", eun.a(al), false);
   private static final vb an = vb.c("options.hideLightningFlashes.tooltip");
   private final eun<Boolean> ao = eun.a("options.hideLightningFlashes", eun.a(an), false);
   private static final vb ap = vb.c("options.hideSplashTexts.tooltip");
   private final eun<Boolean> aq = eun.a("options.hideSplashTexts", eun.a(ap), false);
   private final eun<Double> ar = new eun<>("options.sensitivity", eun.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, vb.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, vb.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, eun.m.a, 0.5, $$0x -> {
   });
   private final eun<Integer> as;
   private final eun<Integer> at;
   private int au = 0;
   private final eun<Double> av = new eun<>(
      "options.entityDistanceScaling",
      eun.a(),
      euo::a,
      new eun.f(2, 20).a($$0x -> (double)$$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {
      }
   );
   public static final int h = 260;
   private final eun<Integer> aw = new eun<>(
      "options.framerateLimit",
      eun.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, vb.c("options.framerateLimit.max")) : a($$0x, vb.a("options.framerate", $$1x)),
      new eun.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> euk.N().aL().a($$0x)
   );
   private final eun<ety> ax = new eun<>(
      "options.renderClouds",
      eun.a(),
      eun.b(),
      new eun.e<>(Arrays.asList(ety.values()), atg.a(ety.d, Codec.BOOL, $$0x -> $$0x ? ety.c : ety.a)),
      ety.c,
      $$0x -> {
         if (euk.L()) {
            enp $$1x = euk.N().f.x();
            if ($$1x != null) {
               $$1x.b(euk.a);
            }
         }
      }
   );
   private static final vb ay = vb.c("options.graphics.fast.tooltip");
   private static final vb az = vb.a("options.graphics.fabulous.tooltip", vb.c("options.graphics.fabulous").a(n.u));
   private static final vb aA = vb.c("options.graphics.fancy.tooltip");
   private final eun<eud> aB = new eun<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> exs.a(aA);
            case a -> exs.a(ay);
            case c -> exs.a(az);
         };
      },
      ($$0x, $$1x) -> {
         vp $$2x = vb.c($$1x.b());
         return $$1x == eud.c ? $$2x.a(n.u) : $$2x;
      },
      new eun.a<>(
         Arrays.asList(eud.values()),
         Stream.of(eud.values()).filter($$0x -> $$0x != eud.c).collect(Collectors.toList()),
         () -> euk.N().q() && euk.N().ag().h(),
         ($$0x, $$1x) -> {
            euk $$2x = euk.N();
            fsc $$3x = $$2x.ag();
            if ($$1x == eud.c && $$3x.b()) {
               $$3x.d();
            } else {
               $$0x.a($$1x);
               $$2x.f.f();
            }
         },
         Codec.INT.xmap(eud::a, eud::a)
      ),
      eud.b,
      $$0x -> {
      }
   );
   private final eun<Boolean> aC = eun.a("options.ao", true, $$0x -> euk.N().f.f());
   private static final vb aD = vb.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final vb aE = vb.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final vb aF = vb.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final eun<eur> aG = new eun<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> exs.a(aD);
         case b -> exs.a(aE);
         case c -> exs.a(aF);
      };
   }, eun.b(), new eun.e<>(Arrays.asList(eur.values()), Codec.INT.xmap(eur::a, eur::a)), eur.a, $$0x -> {
   });
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final eun<cep> aH = new eun<>(
      "options.chat.visibility", eun.a(), eun.b(), new eun.e<>(Arrays.asList(cep.values()), Codec.INT.xmap(cep::a, cep::a)), cep.a, $$0x -> {
      }
   );
   private final eun<Double> aI = new eun<>("options.chat.opacity", eun.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), eun.m.a, 1.0, $$0x -> euk.N().l.d().b());
   private final eun<Double> aJ = new eun<>("options.chat.line_spacing", eun.a(), euo::a, eun.m.a, 0.0, $$0x -> {
   });
   private final eun<Double> aK = new eun<>("options.accessibility.text_background_opacity", eun.a(), euo::a, eun.m.a, 0.5, $$0x -> euk.N().l.d().b());
   private final eun<Double> aL = new eun<>("options.accessibility.panorama_speed", eun.a(), euo::a, eun.m.a, 1.0, $$0x -> {
   });
   private static final vb aM = vb.c("options.accessibility.high_contrast.tooltip");
   private final eun<Boolean> aN = eun.a("options.accessibility.high_contrast", eun.a(aM), false, $$0x -> {
      apd $$1x = euk.N().Z();
      boolean $$2x = $$1x.d().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private final eun<Boolean> aO = eun.a("options.accessibility.narrator_hotkey", eun.a(vb.c("options.accessibility.narrator_hotkey.tooltip")), true);
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<ces> aP = EnumSet.allOf(ces.class);
   private final eun<blp> aQ = new eun<>("options.mainHand", eun.a(), eun.b(), new eun.e<>(Arrays.asList(blp.values()), blp.c), blp.b, $$0x -> this.au());
   public int o;
   public int p;
   private final eun<Double> aR = new eun<>(
      "options.chat.scale",
      eun.a(),
      ($$0x, $$1x) -> (vb)($$1x == 0.0 ? va.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      eun.m.a,
      1.0,
      $$0x -> euk.N().l.d().b()
   );
   private final eun<Double> aS = new eun<>("options.chat.width", eun.a(), ($$0x, $$1x) -> b($$0x, ewi.a($$1x)), eun.m.a, 1.0, $$0x -> euk.N().l.d().b());
   private final eun<Double> aT = new eun<>(
      "options.chat.height.unfocused", eun.a(), ($$0x, $$1x) -> b($$0x, ewi.b($$1x)), eun.m.a, ewi.h(), $$0x -> euk.N().l.d().b()
   );
   private final eun<Double> aU = new eun<>(
      "options.chat.height.focused", eun.a(), ($$0x, $$1x) -> b($$0x, ewi.b($$1x)), eun.m.a, 1.0, $$0x -> euk.N().l.d().b()
   );
   private final eun<Double> aV = new eun<>(
      "options.chat.delay_instant",
      eun.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? vb.c("options.chat.delay_none") : vb.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new eun.f(0, 60).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> euk.N().aV().a($$0x)
   );
   private static final vb aW = vb.c("options.notifications.display_time.tooltip");
   private final eun<Double> aX = new eun<>(
      "options.notifications.display_time",
      eun.a(aW),
      ($$0x, $$1x) -> a($$0x, vb.a("options.multiplier", $$1x)),
      new eun.f(5, 100).a($$0x -> (double)$$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {
      }
   );
   private final eun<Integer> aY = new eun<>(
      "options.mipmapLevels", eun.a(), ($$0x, $$1x) -> (vb)($$1x == 0 ? va.a($$0x, false) : a($$0x, $$1x.intValue())), new eun.f(0, 4), 4, $$0x -> {
      }
   );
   public boolean q = true;
   private final eun<etu> aZ = new eun<>(
      "options.attackIndicator", eun.a(), eun.b(), new eun.e<>(Arrays.asList(etu.values()), Codec.INT.xmap(etu::a, etu::a)), etu.b, $$0x -> {
      }
   );
   public gjf r = gjf.a;
   public boolean s = false;
   public boolean t = false;
   private final eun<Integer> ba = new eun<>("options.biomeBlendRadius", eun.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, vb.c("options.biomeBlendRadius." + $$2x));
   }, new eun.f(0, 7), 2, $$0x -> euk.N().f.f());
   private final eun<Double> bb = new eun<>(
      "options.mouseWheelSensitivity",
      eun.a(),
      ($$0x, $$1x) -> a($$0x, vb.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new eun.f(-200, 100).a(euo::c, euo::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {
      }
   );
   private final eun<Boolean> bc = eun.a("options.rawMouseInput", true, $$0x -> {
      eoh $$1x = euk.N().aL();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int u = 1;
   private final eun<Boolean> bd = eun.a("options.autoJump", false);
   private final eun<Boolean> be = eun.a("options.operatorItemsTab", false);
   private final eun<Boolean> bf = eun.a("options.autoSuggestCommands", true);
   private final eun<Boolean> bg = eun.a("options.chat.color", true);
   private final eun<Boolean> bh = eun.a("options.chat.links", true);
   private final eun<Boolean> bi = eun.a("options.chat.links.prompt", true);
   private final eun<Boolean> bj = eun.a("options.vsync", true, $$0x -> {
      if (euk.N().aL() != null) {
         euk.N().aL().a($$0x);
      }
   });
   private final eun<Boolean> bk = eun.a("options.entityShadows", true);
   private final eun<Boolean> bl = eun.a("options.forceUnicodeFont", false, $$0x -> {
      euk $$1x = euk.N();
      if ($$1x.aL() != null) {
         $$1x.b($$0x);
         $$1x.a();
      }
   });
   private final eun<Boolean> bm = eun.a("options.invertMouse", false);
   private final eun<Boolean> bn = eun.a("options.discrete_mouse_scroll", false);
   private final eun<Boolean> bo = eun.a("options.realmsNotifications", true);
   private static final vb bp = vb.c("options.allowServerListing.tooltip");
   private final eun<Boolean> bq = eun.a("options.allowServerListing", eun.a(bp), true, $$0x -> this.au());
   private final eun<Boolean> br = eun.a("options.reducedDebugInfo", false);
   private final Map<ard, eun<Double>> bs = ac.a(new EnumMap<>(ard.class), $$0x -> {
      for (ard $$1x : ard.values()) {
         $$0x.put($$1x, this.a("soundCategory." + $$1x.a(), $$1x));
      }
   });
   private final eun<Boolean> bt = eun.a("options.showSubtitles", false);
   private static final vb bu = vb.c("options.directionalAudio.on.tooltip");
   private static final vb bv = vb.c("options.directionalAudio.off.tooltip");
   private final eun<Boolean> bw = eun.a("options.directionalAudio", $$0x -> $$0x ? exs.a(bu) : exs.a(bv), false, $$0x -> {
      gia $$1x = euk.N().ah();
      $$1x.j();
      $$1x.a(ggr.a(arc.zu, 1.0F));
   });
   private final eun<Boolean> bx = new eun<>(
      "options.accessibility.text_background",
      eun.a(),
      ($$0x, $$1x) -> $$1x ? vb.c("options.accessibility.text_background.chat") : vb.c("options.accessibility.text_background.everywhere"),
      eun.a,
      true,
      $$0x -> {
      }
   );
   private final eun<Boolean> by = eun.a("options.touchscreen", false);
   private final eun<Boolean> bz = eun.a("options.fullscreen", false, $$0x -> {
      euk $$1x = euk.N();
      if ($$1x.aL() != null && $$1x.aL().j() != $$0x) {
         $$1x.aL().h();
         this.X().a($$1x.aL().j());
      }
   });
   private final eun<Boolean> bA = eun.a("options.viewBobbing", true);
   private static final vb bB = vb.c("options.key.toggle");
   private static final vb bC = vb.c("options.key.hold");
   private final eun<Boolean> bD = new eun<>("key.sneak", eun.a(), ($$0x, $$1x) -> $$1x ? bB : bC, eun.a, false, $$0x -> {
   });
   private final eun<Boolean> bE = new eun<>("key.sprint", eun.a(), ($$0x, $$1x) -> $$1x ? bB : bC, eun.a, false, $$0x -> {
   });
   public boolean v;
   public boolean w;
   private static final vb bF = vb.c("options.hideMatchedNames.tooltip");
   private final eun<Boolean> bG = eun.a("options.hideMatchedNames", eun.a(bF), true);
   private final eun<Boolean> bH = eun.a("options.autosaveIndicator", true);
   private static final vb bI = vb.c("options.onlyShowSecureChat.tooltip");
   private final eun<Boolean> bJ = eun.a("options.onlyShowSecureChat", eun.a(bI), false);
   public final eui x = new eui("key.forward", 87, "key.categories.movement");
   public final eui y = new eui("key.left", 65, "key.categories.movement");
   public final eui z = new eui("key.back", 83, "key.categories.movement");
   public final eui A = new eui("key.right", 68, "key.categories.movement");
   public final eui B = new eui("key.jump", 32, "key.categories.movement");
   public final eui C = new euy("key.sneak", 340, "key.categories.movement", this.bD::c);
   public final eui D = new euy("key.sprint", 341, "key.categories.movement", this.bE::c);
   public final eui E = new eui("key.inventory", 69, "key.categories.inventory");
   public final eui F = new eui("key.swapOffhand", 70, "key.categories.inventory");
   public final eui G = new eui("key.drop", 81, "key.categories.inventory");
   public final eui H = new eui("key.use", eny.b.c, 1, "key.categories.gameplay");
   public final eui I = new eui("key.attack", eny.b.c, 0, "key.categories.gameplay");
   public final eui J = new eui("key.pickItem", eny.b.c, 2, "key.categories.gameplay");
   public final eui K = new eui("key.chat", 84, "key.categories.multiplayer");
   public final eui L = new eui("key.playerlist", 258, "key.categories.multiplayer");
   public final eui M = new eui("key.command", 47, "key.categories.multiplayer");
   public final eui N = new eui("key.socialInteractions", 80, "key.categories.multiplayer");
   public final eui O = new eui("key.screenshot", 291, "key.categories.misc");
   public final eui P = new eui("key.togglePerspective", 294, "key.categories.misc");
   public final eui Q = new eui("key.smoothCamera", eny.bv.b(), "key.categories.misc");
   public final eui R = new eui("key.fullscreen", 300, "key.categories.misc");
   public final eui S = new eui("key.spectatorOutlines", eny.bv.b(), "key.categories.misc");
   public final eui T = new eui("key.advancements", 76, "key.categories.misc");
   public final eui[] U = new eui[]{
      new eui("key.hotbar.1", 49, "key.categories.inventory"),
      new eui("key.hotbar.2", 50, "key.categories.inventory"),
      new eui("key.hotbar.3", 51, "key.categories.inventory"),
      new eui("key.hotbar.4", 52, "key.categories.inventory"),
      new eui("key.hotbar.5", 53, "key.categories.inventory"),
      new eui("key.hotbar.6", 54, "key.categories.inventory"),
      new eui("key.hotbar.7", 55, "key.categories.inventory"),
      new eui("key.hotbar.8", 56, "key.categories.inventory"),
      new eui("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final eui V = new eui("key.saveToolbarActivator", 67, "key.categories.creative");
   public final eui W = new eui("key.loadToolbarActivator", 88, "key.categories.creative");
   public final eui[] X = (eui[])ArrayUtils.addAll(
      new eui[]{
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
   protected euk Y;
   private final File bK;
   public boolean Z;
   private etw bL = etw.a;
   public String aa = "";
   public boolean ab;
   private final eun<Integer> bM = new eun<>("options.fov", eun.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, vb.c("options.fov.min"));
         case 110 -> a($$0x, vb.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new eun.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ((double)$$0x.intValue() - 70.0) / 40.0), 70, $$0x -> euk.N().f.r());
   private static final vb bN = vb.a("options.telemetry.button.tooltip", vb.c("options.telemetry.state.minimal"), vb.c("options.telemetry.state.all"));
   private final eun<Boolean> bO = eun.a("options.telemetry.button", eun.a(bN), ($$0x, $$1x) -> {
      euk $$2x = euk.N();
      if (!$$2x.B()) {
         return vb.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.A() ? vb.c("options.telemetry.state.all") : vb.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {
   });
   private static final vb bP = vb.c("options.screenEffectScale.tooltip");
   private final eun<Double> bQ = new eun<>(
      "options.screenEffectScale", eun.a(bP), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, va.c) : a($$0x, $$1x.doubleValue()), eun.m.a, 1.0, $$0x -> {
      }
   );
   private static final vb bR = vb.c("options.fovEffectScale.tooltip");
   private final eun<Double> bS = new eun<>(
      "options.fovEffectScale",
      eun.a(bR),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, va.c) : a($$0x, $$1x.doubleValue()),
      eun.m.a.a(aty::k, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      $$0x -> {
      }
   );
   private static final vb bT = vb.c("options.darknessEffectScale.tooltip");
   private final eun<Double> bU = new eun<>(
      "options.darknessEffectScale",
      eun.a(bT),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, va.c) : a($$0x, $$1x.doubleValue()),
      eun.m.a.a(aty::k, Math::sqrt),
      1.0,
      $$0x -> {
      }
   );
   private static final vb bV = vb.c("options.glintSpeed.tooltip");
   private final eun<Double> bW = new eun<>(
      "options.glintSpeed", eun.a(bV), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, va.c) : a($$0x, $$1x.doubleValue()), eun.m.a, 0.5, $$0x -> {
      }
   );
   private static final vb bX = vb.c("options.glintStrength.tooltip");
   private final eun<Double> bY = new eun<>(
      "options.glintStrength",
      eun.a(bX),
      ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, va.c) : a($$0x, $$1x.doubleValue()),
      eun.m.a,
      0.75,
      RenderSystem::setShaderGlintAlpha
   );
   private static final vb bZ = vb.c("options.damageTiltStrength.tooltip");
   private final eun<Double> ca = new eun<>(
      "options.damageTiltStrength", eun.a(bZ), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, va.c) : a($$0x, $$1x.doubleValue()), eun.m.a, 1.0, $$0x -> {
      }
   );
   private final eun<Double> cb = new eun<>("options.gamma", eun.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, vb.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, vb.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, vb.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, eun.m.a, 0.5, $$0x -> {
   });
   public static final int ac = 0;
   private static final int cc = 2147483646;
   private final eun<Integer> cd = new eun<>(
      "options.guiScale", eun.a(), ($$0x, $$1x) -> $$1x == 0 ? vb.c("options.guiScale.auto") : vb.b(Integer.toString($$1x)), new eun.c(0, () -> {
         euk $$0x = euk.N();
         return !$$0x.q() ? 2147483646 : $$0x.aL().a(0, $$0x.j());
      }, 2147483646), 0, $$0x -> {
      }
   );
   private final eun<eup> ce = new eun<>(
      "options.particles", eun.a(), eun.b(), new eun.e<>(Arrays.asList(eup.values()), Codec.INT.xmap(eup::a, eup::a)), eup.a, $$0x -> {
      }
   );
   private final eun<eum> cf = new eun<>(
      "options.narrator",
      eun.a(),
      ($$0x, $$1x) -> (vb)(this.Y.aU().a() ? $$1x.b() : vb.c("options.narrator.notavailable")),
      new eun.e<>(Arrays.asList(eum.values()), Codec.INT.xmap(eum::a, eum::a)),
      eum.a,
      $$0x -> this.Y.aU().a($$0x)
   );
   public String ad = "en_us";
   private final eun<String> cg = new eun<>(
      "options.audioDevice",
      eun.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return vb.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? vb.b($$1x.substring(ghx.c)) : vb.b($$1x);
         }
      },
      new eun.h<>(
         () -> Stream.concat(Stream.of(""), euk.N().ah().a().stream()).toList(),
         $$0x -> euk.N().q() && $$0x != "" && !euk.N().ah().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         gia $$1x = euk.N().ah();
         $$1x.j();
         $$1x.a(ggr.a(arc.zu, 1.0F));
      }
   );
   public boolean ae = true;
   public boolean af;

   public eun<Boolean> a() {
      return this.am;
   }

   public eun<Boolean> b() {
      return this.ao;
   }

   public eun<Boolean> c() {
      return this.aq;
   }

   public eun<Double> d() {
      return this.ar;
   }

   public eun<Integer> e() {
      return this.as;
   }

   public eun<Integer> f() {
      return this.at;
   }

   public eun<Double> g() {
      return this.av;
   }

   public eun<Integer> h() {
      return this.aw;
   }

   public eun<ety> i() {
      return this.ax;
   }

   public eun<eud> j() {
      return this.aB;
   }

   public eun<Boolean> k() {
      return this.aC;
   }

   public eun<eur> l() {
      return this.aG;
   }

   public void a(apd $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (apa $$2 : $$0.f()) {
         if (!$$2.h()) {
            this.i.add($$2.f());
            if (!$$2.c().a()) {
               this.j.add($$2.f());
            }
         }
      }

      this.as();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.Y.k();
      }
   }

   public eun<cep> m() {
      return this.aH;
   }

   public eun<Double> n() {
      return this.aI;
   }

   public eun<Double> o() {
      return this.aJ;
   }

   public eun<Double> p() {
      return this.aK;
   }

   public eun<Double> q() {
      return this.aL;
   }

   public eun<Boolean> r() {
      return this.aN;
   }

   public eun<Boolean> s() {
      return this.aO;
   }

   public eun<blp> t() {
      return this.aQ;
   }

   public eun<Double> u() {
      return this.aR;
   }

   public eun<Double> v() {
      return this.aS;
   }

   public eun<Double> w() {
      return this.aT;
   }

   public eun<Double> x() {
      return this.aU;
   }

   public eun<Double> y() {
      return this.aV;
   }

   public eun<Double> z() {
      return this.aX;
   }

   public eun<Integer> A() {
      return this.aY;
   }

   public eun<etu> B() {
      return this.aZ;
   }

   public eun<Integer> C() {
      return this.ba;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, (double)$$0 / 100.0);
   }

   private static int a(double $$0) {
      return aty.a(Math.log10($$0) * 100.0);
   }

   public eun<Double> D() {
      return this.bb;
   }

   public eun<Boolean> E() {
      return this.bc;
   }

   public eun<Boolean> F() {
      return this.bd;
   }

   public eun<Boolean> G() {
      return this.be;
   }

   public eun<Boolean> H() {
      return this.bf;
   }

   public eun<Boolean> I() {
      return this.bg;
   }

   public eun<Boolean> J() {
      return this.bh;
   }

   public eun<Boolean> K() {
      return this.bi;
   }

   public eun<Boolean> L() {
      return this.bj;
   }

   public eun<Boolean> M() {
      return this.bk;
   }

   public eun<Boolean> N() {
      return this.bl;
   }

   public eun<Boolean> O() {
      return this.bm;
   }

   public eun<Boolean> P() {
      return this.bn;
   }

   public eun<Boolean> Q() {
      return this.bo;
   }

   public eun<Boolean> R() {
      return this.bq;
   }

   public eun<Boolean> S() {
      return this.br;
   }

   public final float a(ard $$0) {
      return this.b($$0).c().floatValue();
   }

   public final eun<Double> b(ard $$0) {
      return Objects.requireNonNull(this.bs.get($$0));
   }

   private eun<Double> a(String $$0, ard $$1) {
      return new eun<>(
         $$0, eun.a(), ($$0x, $$1x) -> $$1x == 0.0 ? a($$0x, va.c) : a($$0x, $$1x.doubleValue()), eun.m.a, 1.0, $$1x -> euk.N().ah().a($$1, $$1x.floatValue())
      );
   }

   public eun<Boolean> T() {
      return this.bt;
   }

   public eun<Boolean> U() {
      return this.bw;
   }

   public eun<Boolean> V() {
      return this.bx;
   }

   public eun<Boolean> W() {
      return this.by;
   }

   public eun<Boolean> X() {
      return this.bz;
   }

   public eun<Boolean> Y() {
      return this.bA;
   }

   public eun<Boolean> Z() {
      return this.bD;
   }

   public eun<Boolean> aa() {
      return this.bE;
   }

   public eun<Boolean> ab() {
      return this.bG;
   }

   public eun<Boolean> ac() {
      return this.bH;
   }

   public eun<Boolean> ad() {
      return this.bJ;
   }

   public eun<Integer> ae() {
      return this.bM;
   }

   public eun<Boolean> af() {
      return this.bO;
   }

   public eun<Double> ag() {
      return this.bQ;
   }

   public eun<Double> ah() {
      return this.bS;
   }

   public eun<Double> ai() {
      return this.bU;
   }

   public eun<Double> aj() {
      return this.bW;
   }

   public eun<Double> ak() {
      return this.bY;
   }

   public eun<Double> al() {
      return this.ca;
   }

   public eun<Double> am() {
      return this.cb;
   }

   public eun<Integer> an() {
      return this.cd;
   }

   public eun<eup> ao() {
      return this.ce;
   }

   public eun<eum> ap() {
      return this.cf;
   }

   public eun<String> aq() {
      return this.cg;
   }

   public euo(euk $$0, File $$1) {
      this.Y = $$0;
      this.bK = new File($$1, "options.txt");
      boolean $$2 = $$0.ae();
      boolean $$3 = $$2 && Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.as = new eun<>(
         "options.renderDistance",
         eun.a(),
         ($$0x, $$1x) -> a($$0x, vb.a("options.chunks", $$1x)),
         new eun.f(2, $$3 ? 32 : 16),
         $$2 ? 12 : 8,
         $$0x -> euk.N().f.r()
      );
      this.at = new eun<>(
         "options.simulationDistance", eun.a(), ($$0x, $$1x) -> a($$0x, vb.a("options.chunks", $$1x)), new eun.f(5, $$3 ? 32 : 16), $$2 ? 12 : 8, $$0x -> {
         }
      );
      this.af = ac.i() == ac.a.c;
      this.ar();
   }

   public float a(float $$0) {
      return this.bx.c() ? $$0 : this.p().c().floatValue();
   }

   public int b(float $$0) {
      return (int)(this.a($$0) * 255.0F) << 24 & 0xFF000000;
   }

   public int a(int $$0) {
      return this.bx.c() ? $$0 : (int)(this.aK.c() * 255.0) << 24 & 0xFF000000;
   }

   public void a(eui $$0, eny.a $$1) {
      $$0.b($$1);
      this.as();
   }

   private void a(euo.a $$0) {
      $$0.a("autoJump", this.bd);
      $$0.a("operatorItemsTab", this.be);
      $$0.a("autoSuggestions", this.bf);
      $$0.a("chatColors", this.bg);
      $$0.a("chatLinks", this.bh);
      $$0.a("chatLinksPrompt", this.bi);
      $$0.a("enableVsync", this.bj);
      $$0.a("entityShadows", this.bk);
      $$0.a("forceUnicodeFont", this.bl);
      $$0.a("discrete_mouse_scroll", this.bn);
      $$0.a("invertYMouse", this.bm);
      $$0.a("realmsNotifications", this.bo);
      $$0.a("reducedDebugInfo", this.br);
      $$0.a("showSubtitles", this.bt);
      $$0.a("directionalAudio", this.bw);
      $$0.a("touchscreen", this.by);
      $$0.a("fullscreen", this.bz);
      $$0.a("bobView", this.bA);
      $$0.a("toggleCrouch", this.bD);
      $$0.a("toggleSprint", this.bE);
      $$0.a("darkMojangStudiosBackground", this.am);
      $$0.a("hideLightningFlashes", this.ao);
      $$0.a("hideSplashTexts", this.aq);
      $$0.a("mouseSensitivity", this.ar);
      $$0.a("fov", this.bM);
      $$0.a("screenEffectScale", this.bQ);
      $$0.a("fovEffectScale", this.bS);
      $$0.a("darknessEffectScale", this.bU);
      $$0.a("glintSpeed", this.bW);
      $$0.a("glintStrength", this.bY);
      $$0.a("damageTiltStrength", this.ca);
      $$0.a("highContrast", this.aN);
      $$0.a("narratorHotkey", this.aO);
      $$0.a("gamma", this.cb);
      $$0.a("renderDistance", this.as);
      $$0.a("simulationDistance", this.at);
      $$0.a("entityDistanceScaling", this.av);
      $$0.a("guiScale", this.cd);
      $$0.a("particles", this.ce);
      $$0.a("maxFps", this.aw);
      $$0.a("graphicsMode", this.aB);
      $$0.a("ao", this.aC);
      $$0.a("prioritizeChunkUpdates", this.aG);
      $$0.a("biomeBlendRadius", this.ba);
      $$0.a("renderClouds", this.ax);
      this.i = $$0.a("resourcePacks", this.i, euo::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, euo::c, ah::toJson);
      this.aa = $$0.a("lastServer", this.aa);
      this.ad = $$0.a("lang", this.ad);
      $$0.a("soundDevice", this.cg);
      $$0.a("chatVisibility", this.aH);
      $$0.a("chatOpacity", this.aI);
      $$0.a("chatLineSpacing", this.aJ);
      $$0.a("textBackgroundOpacity", this.aK);
      $$0.a("backgroundForChatOnly", this.bx);
      this.l = $$0.a("hideServerAddress", this.l);
      this.m = $$0.a("advancedItemTooltips", this.m);
      this.n = $$0.a("pauseOnLostFocus", this.n);
      this.o = $$0.a("overrideWidth", this.o);
      this.p = $$0.a("overrideHeight", this.p);
      $$0.a("chatHeightFocused", this.aU);
      $$0.a("chatDelay", this.aV);
      $$0.a("chatHeightUnfocused", this.aT);
      $$0.a("chatScale", this.aR);
      $$0.a("chatWidth", this.aS);
      $$0.a("notificationDisplayTime", this.aX);
      $$0.a("mipmapLevels", this.aY);
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aQ);
      $$0.a("attackIndicator", this.aZ);
      $$0.a("narrator", this.cf);
      this.r = $$0.a("tutorialStep", this.r, gjf::a, gjf::a);
      $$0.a("mouseWheelSensitivity", this.bb);
      $$0.a("rawMouseInput", this.bc);
      this.u = $$0.a("glDebugVerbosity", this.u);
      this.v = $$0.a("skipMultiplayerWarning", this.v);
      this.w = $$0.a("skipRealms32bitWarning", this.w);
      $$0.a("hideMatchedNames", this.bG);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.t = $$0.a("hideBundleTutorial", this.t);
      this.af = $$0.a("syncChunkWrites", this.af);
      $$0.a("showAutosaveIndicator", this.bH);
      $$0.a("allowServerListing", this.bq);
      $$0.a("onlyShowSecureChat", this.bJ);
      $$0.a("panoramaScrollSpeed", this.aL);
      $$0.a("telemetryOptInExtra", this.bO);
      this.ae = $$0.a("onboardAccessibility", this.ae);

      for (eui $$1 : this.X) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(eny.a($$3));
         }
      }

      for (ard $$4 : ard.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bs.get($$4));
      }

      for (ces $$5 : ces.values()) {
         boolean $$6 = this.aP.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.b($$5, $$7);
         }
      }
   }

   public void ar() {
      try {
         if (!this.bK.exists()) {
            return;
         }

         sj $$0 = new sj();

         try (BufferedReader $$1 = Files.newReader(this.bK, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = aj.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3) {
                  ag.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final sj $$2 = this.a($$0);
         if (!$$2.e("graphicsMode") && $$2.e("fancyGraphics")) {
            if (a($$2.l("fancyGraphics"))) {
               this.aB.a(eud.b);
            } else {
               this.aB.a(eud.a);
            }
         }

         this.a(new euo.a() {
            @Nullable
            private String a(String $$0) {
               return $$2.e($$0) ? $$2.l($$0) : null;
            }

            @Override
            public <T> void a(String $$0, eun<T> $$1) {
               String $$2 = this.a($$0);
               if ($$2 != null) {
                  JsonReader $$3 = new JsonReader(new StringReader($$2.isEmpty() ? "\"\"" : $$2));
                  JsonElement $$4 = JsonParser.parseReader($$3);
                  DataResult<T> $$5 = $$1.d().parse(JsonOps.INSTANCE, $$4);
                  $$5.error().ifPresent($$2xx -> euo.ag.error("Error parsing option value " + $$2 + " for option " + $$1 + ": " + $$2xx.message()));
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
                     euo.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2, var5});
                  }
               }

               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               String $$2 = this.a($$0);
               return $$2 != null ? euo.a($$2) : $$1;
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
               } else if (euo.a($$2)) {
                  return 1.0F;
               } else if (euo.b($$2)) {
                  return 0.0F;
               } else {
                  try {
                     return Float.parseFloat($$2);
                  } catch (NumberFormatException var5) {
                     euo.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2, var5});
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

         if (this.Y.aL() != null) {
            this.Y.aL().a(this.aw.c());
         }

         eui.d();
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

   private sj a(sj $$0) {
      int $$1 = 0;

      try {
         $$1 = Integer.parseInt($$0.l("version"));
      } catch (RuntimeException var4) {
      }

      return avg.e.a(this.Y.aq(), $$0, $$1);
   }

   public void as() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bK), StandardCharsets.UTF_8))) {
         $$0.println("version:" + aa.b().d().c());
         this.a(new euo.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, eun<T> $$1x) {
               DataResult<JsonElement> $$2 = $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c());
               $$2.error().ifPresent($$1xx -> euo.ag.error("Error saving option " + $$1 + ": " + $$1xx));
               $$2.result().ifPresent($$2x -> {
                  this.a($$0);
                  $$0.println(euo.ah.toJson($$2x));
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
         if (this.Y.aL().f().isPresent()) {
            $$0.println("fullscreenResolution:" + this.Y.aL().f().get().g());
         }
      } catch (Exception var6) {
         ag.error("Failed to save options", var6);
      }

      this.au();
   }

   public ame at() {
      int $$0 = 0;

      for (ces $$1 : this.aP) {
         $$0 |= $$1.a();
      }

      return new ame(this.ad, this.as.c(), this.aH.c(), this.bg.c(), $$0, this.aQ.c(), this.Y.aP(), this.bq.c());
   }

   public void au() {
      if (this.Y.s != null) {
         this.Y.s.cn.b(new xf(this.at()));
      }
   }

   private void b(ces $$0, boolean $$1) {
      if ($$1) {
         this.aP.add($$0);
      } else {
         this.aP.remove($$0);
      }
   }

   public boolean a(ces $$0) {
      return this.aP.contains($$0);
   }

   public void a(ces $$0, boolean $$1) {
      this.b($$0, $$1);
      this.au();
   }

   public ety av() {
      return this.aA() >= 4 ? this.ax.c() : ety.a;
   }

   public boolean aw() {
      return this.q;
   }

   public void b(apd $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         apa $$4 = $$0.c($$3);
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

   public etw ax() {
      return this.bL;
   }

   public void a(etw $$0) {
      this.bL = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = ato.a(ah, $$0, ai);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File ay() {
      return this.bK;
   }

   public String az() {
      Stream<Pair<String, Object>> $$0 = Stream.<Pair<String, Object>>builder()
         .add(Pair.of("ao", this.aC.c()))
         .add(Pair.of("biomeBlendRadius", this.ba.c()))
         .add(Pair.of("enableVsync", this.bj.c()))
         .add(Pair.of("entityDistanceScaling", this.av.c()))
         .add(Pair.of("entityShadows", this.bk.c()))
         .add(Pair.of("forceUnicodeFont", this.bl.c()))
         .add(Pair.of("fov", this.bM.c()))
         .add(Pair.of("fovEffectScale", this.bS.c()))
         .add(Pair.of("darknessEffectScale", this.bU.c()))
         .add(Pair.of("glintSpeed", this.bW.c()))
         .add(Pair.of("glintStrength", this.bY.c()))
         .add(Pair.of("prioritizeChunkUpdates", this.aG.c()))
         .add(Pair.of("fullscreen", this.bz.c()))
         .add(Pair.of("fullscreenResolution", String.valueOf(this.k)))
         .add(Pair.of("gamma", this.cb.c()))
         .add(Pair.of("glDebugVerbosity", this.u))
         .add(Pair.of("graphicsMode", this.aB.c()))
         .add(Pair.of("guiScale", this.cd.c()))
         .add(Pair.of("maxFps", this.aw.c()))
         .add(Pair.of("mipmapLevels", this.aY.c()))
         .add(Pair.of("narrator", this.cf.c()))
         .add(Pair.of("overrideHeight", this.p))
         .add(Pair.of("overrideWidth", this.o))
         .add(Pair.of("particles", this.ce.c()))
         .add(Pair.of("reducedDebugInfo", this.br.c()))
         .add(Pair.of("renderClouds", this.ax.c()))
         .add(Pair.of("renderDistance", this.as.c()))
         .add(Pair.of("simulationDistance", this.at.c()))
         .add(Pair.of("resourcePacks", this.i))
         .add(Pair.of("screenEffectScale", this.bQ.c()))
         .add(Pair.of("syncChunkWrites", this.af))
         .add(Pair.of("useNativeTransport", this.q))
         .add(Pair.of("soundDevice", this.cg.c()))
         .build();
      return $$0.<CharSequence>map($$0x -> (String)$$0x.getFirst() + ": " + $$0x.getSecond()).collect(Collectors.joining(System.lineSeparator()));
   }

   public void b(int $$0) {
      this.au = $$0;
   }

   public int aA() {
      return this.au > 0 ? Math.min(this.as.c(), this.au) : this.as.c();
   }

   private static vb b(vb $$0, int $$1) {
      return vb.a("options.pixel_value", $$0, $$1);
   }

   private static vb a(vb $$0, double $$1) {
      return vb.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static vb a(vb $$0, vb $$1) {
      return vb.a("options.generic_value", $$0, $$1);
   }

   public static vb a(vb $$0, int $$1) {
      return a($$0, vb.b(Integer.toString($$1)));
   }

   interface a {
      <T> void a(String var1, eun<T> var2);

      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }
}
