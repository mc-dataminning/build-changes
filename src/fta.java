import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class fta implements AutoCloseable {
   private static final ahg f = new ahg("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   private static final int j = 3;
   final evi k;
   private final aqi l;
   private final auv m = auv.a();
   private float n;
   public final ftd b;
   private final eww o;
   private final ftn p;
   private int q;
   private float r;
   private float s;
   private float t;
   private float u;
   private boolean v = true;
   private boolean w = true;
   private long x;
   private boolean y;
   private long z = ac.b();
   private final ftg A;
   private final gee B = new gee();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int c = 40;
   @Nullable
   private cmy G;
   private int H;
   private float I;
   private float J;
   @Nullable
   ftk K;
   static final ahg[] L = new ahg[]{
      new ahg("shaders/post/notch.json"),
      new ahg("shaders/post/fxaa.json"),
      new ahg("shaders/post/art.json"),
      new ahg("shaders/post/bumpy.json"),
      new ahg("shaders/post/blobs2.json"),
      new ahg("shaders/post/pencil.json"),
      new ahg("shaders/post/color_convolve.json"),
      new ahg("shaders/post/deconverge.json"),
      new ahg("shaders/post/flip.json"),
      new ahg("shaders/post/invert.json"),
      new ahg("shaders/post/ntsc.json"),
      new ahg("shaders/post/outline.json"),
      new ahg("shaders/post/phosphor.json"),
      new ahg("shaders/post/scan_pincushion.json"),
      new ahg("shaders/post/sobel.json"),
      new ahg("shaders/post/bits.json"),
      new ahg("shaders/post/desaturate.json"),
      new ahg("shaders/post/green.json"),
      new ahg("shaders/post/blur.json"),
      new ahg("shaders/post/wobble.json"),
      new ahg("shaders/post/blobs.json"),
      new ahg("shaders/post/antialias.json"),
      new ahg("shaders/post/creeper.json"),
      new ahg("shaders/post/spider.json")
   };
   public static final int d = L.length;
   int M = d;
   private boolean N;
   private final eut O = new eut();
   public ftv e;
   private final Map<String, ftv> P = Maps.newHashMap();
   @Nullable
   private static ftv Q;
   @Nullable
   private static ftv R;
   @Nullable
   private static ftv S;
   @Nullable
   private static ftv T;
   @Nullable
   private static ftv U;
   @Nullable
   private static ftv V;
   @Nullable
   private static ftv W;
   @Nullable
   private static ftv X;
   @Nullable
   private static ftv Y;
   @Nullable
   private static ftv Z;
   @Nullable
   private static ftv aa;
   @Nullable
   private static ftv ab;
   @Nullable
   private static ftv ac;
   @Nullable
   private static ftv ad;
   @Nullable
   private static ftv ae;
   @Nullable
   private static ftv af;
   @Nullable
   private static ftv ag;
   @Nullable
   private static ftv ah;
   @Nullable
   private static ftv ai;
   @Nullable
   private static ftv aj;
   @Nullable
   private static ftv ak;
   @Nullable
   private static ftv al;
   @Nullable
   private static ftv am;
   @Nullable
   private static ftv an;
   @Nullable
   private static ftv ao;
   @Nullable
   private static ftv ap;
   @Nullable
   private static ftv aq;
   @Nullable
   private static ftv ar;
   @Nullable
   private static ftv as;
   @Nullable
   private static ftv at;
   @Nullable
   private static ftv au;
   @Nullable
   private static ftv av;
   @Nullable
   private static ftv aw;
   @Nullable
   private static ftv ax;
   @Nullable
   private static ftv ay;
   @Nullable
   private static ftv az;
   @Nullable
   private static ftv aA;
   @Nullable
   private static ftv aB;
   @Nullable
   private static ftv aC;
   @Nullable
   private static ftv aD;
   @Nullable
   private static ftv aE;
   @Nullable
   private static ftv aF;
   @Nullable
   private static ftv aG;
   @Nullable
   private static ftv aH;
   @Nullable
   private static ftv aI;
   @Nullable
   private static ftv aJ;
   @Nullable
   private static ftv aK;
   @Nullable
   private static ftv aL;
   @Nullable
   private static ftv aM;
   @Nullable
   private static ftv aN;
   @Nullable
   private static ftv aO;
   @Nullable
   private static ftv aP;
   @Nullable
   private static ftv aQ;
   @Nullable
   private static ftv aR;
   @Nullable
   private static ftv aS;
   @Nullable
   private static ftv aT;
   @Nullable
   private static ftv aU;
   @Nullable
   private static ftv aV;
   @Nullable
   private static ftv aW;

   public fta(evi $$0, ftd $$1, aqi $$2, ftn $$3) {
      this.k = $$0;
      this.l = $$2;
      this.b = $$1;
      this.o = new eww($$0.Y());
      this.A = new ftg(this, $$0);
      this.p = $$3;
      this.K = null;
   }

   @Override
   public void close() {
      this.A.close();
      this.o.close();
      this.B.close();
      this.b();
      this.aw();
      if (this.e != null) {
         this.e.close();
      }
   }

   public void a(boolean $$0) {
      this.v = $$0;
   }

   public void b(boolean $$0) {
      this.w = $$0;
   }

   public void c(boolean $$0) {
      this.C = $$0;
   }

   public boolean a() {
      return this.C;
   }

   public void b() {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      this.M = d;
   }

   public void c() {
      this.N = !this.N;
   }

   public void a(@Nullable blv $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof ccb) {
         this.a(new ahg("shaders/post/creeper.json"));
      } else if ($$0 instanceof cda) {
         this.a(new ahg("shaders/post/spider.json"));
      } else if ($$0 instanceof ccf) {
         this.a(new ahg("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.k.am() instanceof cfi) {
         if (this.K != null) {
            this.K.close();
         }

         this.M = (this.M + 1) % (L.length + 1);
         if (this.M == d) {
            this.K = null;
         } else {
            this.a(L[this.M]);
         }
      }
   }

   void a(ahg $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new ftk(this.k.Y(), this.l, this.k.g(), $$0);
         this.K.a(this.k.aM().k(), this.k.aM().l());
         this.N = true;
      } catch (IOException var3) {
         g.warn("Failed to load shader: {}", $$0, var3);
         this.M = d;
         this.N = false;
      } catch (JsonSyntaxException var4) {
         g.warn("Failed to parse shader: {}", $$0, var4);
         this.M = d;
         this.N = false;
      }
   }

   public aqc e() {
      return new aqn<fta.a>() {
         protected fta.a a(aqi $$0, bgs $$1) {
            Map<ahg, aqg> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(epp.a.b.b()) || $$1x.endsWith(epp.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<ahg, aqg> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new aqg($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fta.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fta.a($$0, $$3);
         }

         protected void a(fta.a $$0, aqi $$1, bgs $$2) {
            fta.this.b($$0);
            if (fta.this.K != null) {
               fta.this.K.close();
            }

            fta.this.K = null;
            if (fta.this.M == fta.d) {
               fta.this.a(fta.this.k.am());
            } else {
               fta.this.a(fta.L[fta.this.M]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(aql $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new ftv($$0, "blit_screen", epz.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aT = this.a($$0, "rendertype_gui", epz.n);
         aU = this.a($$0, "rendertype_gui_overlay", epz.n);
         Q = this.a($$0, "position", epz.m);
         R = this.a($$0, "position_color", epz.n);
         S = this.a($$0, "position_color_tex", epz.r);
         T = this.a($$0, "position_tex", epz.q);
         U = this.a($$0, "position_tex_color", epz.s);
         aH = this.a($$0, "rendertype_text", epz.t);
      }
   }

   private ftv a(aql $$0, String $$1, eqg $$2) {
      try {
         ftv $$3 = new ftv($$0, $$1, $$2);
         this.P.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(aql $$0) {
      RenderSystem.assertOnRenderThread();
      List<epp> $$1 = Lists.newArrayList();
      $$1.addAll(epp.a.b.c().values());
      $$1.addAll(epp.a.a.c().values());
      $$1.forEach(epp::a);
      List<Pair<ftv, Consumer<ftv>>> $$2 = Lists.newArrayListWithCapacity(this.P.size());

      try {
         $$2.add(Pair.of(new ftv($$0, "particle", epz.l), (Consumer<ftv>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new ftv($$0, "position", epz.m), (Consumer<ftv>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new ftv($$0, "position_color", epz.n), (Consumer<ftv>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new ftv($$0, "position_color_lightmap", epz.p), (Consumer<ftv>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new ftv($$0, "position_color_tex", epz.r), (Consumer<ftv>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new ftv($$0, "position_color_tex_lightmap", epz.t), (Consumer<ftv>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new ftv($$0, "position_tex", epz.q), (Consumer<ftv>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new ftv($$0, "position_tex_color", epz.s), (Consumer<ftv>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new ftv($$0, "position_tex_color_normal", epz.v), (Consumer<ftv>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new ftv($$0, "position_tex_lightmap_color", epz.u), (Consumer<ftv>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_solid", epz.j), (Consumer<ftv>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_cutout_mipped", epz.j), (Consumer<ftv>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_cutout", epz.j), (Consumer<ftv>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_translucent", epz.j), (Consumer<ftv>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_translucent_moving_block", epz.j), (Consumer<ftv>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_armor_cutout_no_cull", epz.k), (Consumer<ftv>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_entity_solid", epz.k), (Consumer<ftv>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_entity_cutout", epz.k), (Consumer<ftv>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_entity_cutout_no_cull", epz.k), (Consumer<ftv>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_entity_cutout_no_cull_z_offset", epz.k), (Consumer<ftv>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_item_entity_translucent_cull", epz.k), (Consumer<ftv>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_entity_translucent_cull", epz.k), (Consumer<ftv>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_entity_translucent", epz.k), (Consumer<ftv>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_entity_translucent_emissive", epz.k), (Consumer<ftv>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_entity_smooth_cutout", epz.k), (Consumer<ftv>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_beacon_beam", epz.j), (Consumer<ftv>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_entity_decal", epz.k), (Consumer<ftv>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_entity_no_outline", epz.k), (Consumer<ftv>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_entity_shadow", epz.k), (Consumer<ftv>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_entity_alpha", epz.k), (Consumer<ftv>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_eyes", epz.k), (Consumer<ftv>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_energy_swirl", epz.k), (Consumer<ftv>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_leash", epz.p), (Consumer<ftv>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_water_mask", epz.m), (Consumer<ftv>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_outline", epz.r), (Consumer<ftv>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_armor_glint", epz.q), (Consumer<ftv>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_armor_entity_glint", epz.q), (Consumer<ftv>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_glint_translucent", epz.q), (Consumer<ftv>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_glint", epz.q), (Consumer<ftv>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_glint_direct", epz.q), (Consumer<ftv>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_entity_glint", epz.q), (Consumer<ftv>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_entity_glint_direct", epz.q), (Consumer<ftv>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_text", epz.t), (Consumer<ftv>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_text_background", epz.p), (Consumer<ftv>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_text_intensity", epz.t), (Consumer<ftv>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_text_see_through", epz.t), (Consumer<ftv>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_text_background_see_through", epz.p), (Consumer<ftv>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_text_intensity_see_through", epz.t), (Consumer<ftv>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_lightning", epz.n), (Consumer<ftv>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_tripwire", epz.j), (Consumer<ftv>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_end_portal", epz.m), (Consumer<ftv>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_end_gateway", epz.m), (Consumer<ftv>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_lines", epz.o), (Consumer<ftv>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_crumbling", epz.j), (Consumer<ftv>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_gui", epz.n), (Consumer<ftv>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_gui_overlay", epz.n), (Consumer<ftv>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_gui_text_highlight", epz.n), (Consumer<ftv>)$$0x -> aV = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_gui_ghost_recipe_overlay", epz.n), (Consumer<ftv>)$$0x -> aW = $$0x));
         $$2.add(Pair.of(new ftv($$0, "rendertype_breeze_wind", epz.k), (Consumer<ftv>)$$0x -> aw = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((ftv)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.aw();
      $$2.forEach($$0x -> {
         ftv $$1x = (ftv)$$0x.getFirst();
         this.P.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void aw() {
      RenderSystem.assertOnRenderThread();
      this.P.values().forEach(ftv::close);
      this.P.clear();
   }

   @Nullable
   public ftv a(@Nullable String $$0) {
      return $$0 == null ? null : this.P.get($$0);
   }

   public void f() {
      this.ax();
      this.A.a();
      if (this.k.am() == null) {
         this.k.a(this.k.s);
      }

      this.O.a();
      this.b.a();
      this.q++;
      if (this.k.r.s().i()) {
         this.k.f.a(this.O);
         this.u = this.t;
         if (this.k.l.j().c()) {
            this.t += 0.05F;
            if (this.t > 1.0F) {
               this.t = 1.0F;
            }
         } else if (this.t > 0.0F) {
            this.t -= 0.0125F;
         }

         if (this.H > 0) {
            this.H--;
            if (this.H == 0) {
               this.G = null;
            }
         }
      }
   }

   @Nullable
   public ftk g() {
      return this.K;
   }

   public void a(int $$0, int $$1) {
      if (this.K != null) {
         this.K.a($$0, $$1);
      }

      this.k.f.a($$0, $$1);
   }

   public void a(float $$0) {
      blv $$1 = this.k.am();
      if ($$1 != null) {
         if (this.k.r != null) {
            this.k.aG().a("pick");
            this.k.u = null;
            double $$2 = (double)this.k.q.c();
            this.k.v = $$1.a($$2, $$0, false);
            elt $$3 = $$1.j($$0);
            boolean $$4 = this.k.q.h();
            $$2 = $$4 ? 6.0 : $$2;
            boolean $$5 = !$$4;
            double $$6 = this.k.v != null ? this.k.v.e().g($$3) : $$2 * $$2;
            elt $$7 = $$1.f(1.0F);
            elt $$8 = $$3.b($$7.c * $$2, $$7.d * $$2, $$7.e * $$2);
            float $$9 = 1.0F;
            elo $$10 = $$1.cH().b($$7.a($$2)).c(1.0, 1.0, 1.0);
            elq $$11 = cgb.a($$1, $$3, $$8, $$10, $$0x -> !$$0x.P_() && $$0x.bt(), $$6);
            if ($$11 != null) {
               elt $$12 = $$11.e();
               double $$13 = $$3.g($$12);
               if ($$5 && $$13 > 9.0) {
                  this.k.v = elp.a($$12, ic.a($$7.c, $$7.d, $$7.e), hx.a($$12));
               } else if ($$13 < $$6 || this.k.v == null) {
                  this.k.v = $$11;
                  blv $$14 = $$11.a();
                  this.k.u = $$14;
               }
            }

            this.k.aG().c();
         }
      }
   }

   private void ax() {
      float $$0 = 1.0F;
      if (this.k.am() instanceof fsg $$1) {
         $$0 = $$1.c();
      }

      this.s = this.r;
      this.r = this.r + ($$0 - this.r) * 0.5F;
      if (this.r > 1.5F) {
         this.r = 1.5F;
      }

      if (this.r < 0.1F) {
         this.r = 0.1F;
      }
   }

   private double a(eut $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ae().c().intValue();
            $$3 *= (double)auo.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof bml && ((bml)$$0.g()).ew()) {
            float $$4 = Math.min((float)((bml)$$0.g()).aM + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         eet $$5 = $$0.k();
         if ($$5 == eet.a || $$5 == eet.b) {
            $$3 *= auo.d(this.k.m.ah().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(eqb $$0, float $$1) {
      if (this.k.am() instanceof bml $$2) {
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.ew()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = auo.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eE();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.al().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(eqb $$0, float $$1) {
      if (this.k.am() instanceof cfi) {
         cfi $$2 = (cfi)this.k.am();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = auo.i($$1, $$2.bV, $$2.bW);
         $$0.a(auo.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(auo.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(auo.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(auo.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.D = $$0;
      this.E = $$1;
      this.F = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new eqb());
      this.D = 1.0F;
   }

   private void a(eqb $$0, eut $$1, float $$2) {
      if (!this.C) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.k.m.Y().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.k.am() instanceof bml && ((bml)this.k.am()).fD();
         if (this.k.m.ax().a() && !$$3 && !this.k.m.Z && this.k.q.l() != ctm.d) {
            this.A.c();
            this.b.a($$2, $$0, this.p.c(), this.k.s, this.k.ao().a(this.k.s, $$2));
            this.A.b();
         }

         $$0.b();
         if (this.k.m.ax().a() && !$$3) {
            ftr.a(this.k, $$0);
            this.a($$0, $$2);
         }

         if (this.k.m.Y().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, eqj.a);
   }

   public Matrix4f a(double $$0) {
      eqb $$1 = new eqb();
      $$1.c().a().identity();
      if (this.D != 1.0F) {
         $$1.a(this.E, -this.F, 0.0F);
         $$1.b(this.D, this.D, 1.0F);
      }

      $$1.c()
         .a()
         .mul(new Matrix4f().setPerspective((float)($$0 * (float) (Math.PI / 180.0)), (float)this.k.aM().k() / (float)this.k.aM().l(), 0.05F, this.h()));
      return $$1.c().a();
   }

   public float h() {
      return this.n * 4.0F;
   }

   public static float a(bml $$0, float $$1) {
      bli $$2 = $$0.b(blk.p);
      return !$$2.a(200) ? 1.0F : 0.7F + auo.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(float $$0, long $$1, boolean $$2) {
      if (!this.k.aA() && this.k.m.n && (!this.k.m.W().c() || !this.k.n.d())) {
         if (ac.b() - this.z > 500L) {
            this.k.c(false);
         }
      } else {
         this.z = ac.b();
      }

      if (!this.k.x) {
         float $$3 = this.k.r != null && this.k.r.s().i() ? $$0 : 1.0F;
         boolean $$4 = this.k.c();
         int $$5 = (int)(this.k.n.e() * (double)this.k.aM().o() / (double)this.k.aM().m());
         int $$6 = (int)(this.k.n.f() * (double)this.k.aM().p() / (double)this.k.aM().n());
         RenderSystem.viewport(0, 0, this.k.aM().k(), this.k.aM().l());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aG().a("level");
            this.a($$0, $$1, new eqb());
            this.ay();
            this.k.f.b();
            if (this.K != null && this.N) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.K.a($$3);
            }

            this.k.g().a(true);
         }

         epf $$7 = this.k.aM();
         RenderSystem.clear(256, evi.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, eqj.b);
         eqb $$9 = RenderSystem.getModelViewStack();
         $$9.a();
         $$9.e();
         $$9.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         eox.b();
         ewu $$10 = new ewu(this.k, this.p.c());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aG().b("gui");
            if (this.k.s != null) {
               float $$11 = auo.i($$3, this.k.s.cx, this.k.s.cw);
               float $$12 = this.k.m.ag().c().floatValue();
               if ($$11 > 0.0F && this.k.s.a(blk.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.k.m.Z || this.k.y != null) {
               this.a(this.k.aM().o(), this.k.aM().p(), $$3);
               this.k.l.a($$10, $$3);
               RenderSystem.clear(256, evi.a);
            }

            this.k.aG().c();
         }

         if (this.k.aJ() != null) {
            try {
               this.k.aJ().a($$10, $$5, $$6, this.k.at());
            } catch (Throwable var18) {
               o $$14 = o.a(var18, "Rendering overlay");
               p $$15 = $$14.a("Overlay render details");
               $$15.a("Overlay name", () -> this.k.aJ().getClass().getCanonicalName());
               throw new y($$14);
            }
         } else if ($$4 && this.k.y != null) {
            try {
               this.k.y.c($$10, $$5, $$6, this.k.at());
            } catch (Throwable var17) {
               o $$17 = o.a(var17, "Rendering screen");
               p $$18 = $$17.a("Screen render details");
               $$18.a("Screen name", () -> this.k.y.getClass().getCanonicalName());
               $$18.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", $$5, $$6, this.k.n.e(), this.k.n.f()));
               $$18.a(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.k.aM().o(),
                        this.k.aM().p(),
                        this.k.aM().k(),
                        this.k.aM().l(),
                        this.k.aM().s()
                     )
               );
               throw new y($$17);
            }

            try {
               if (this.k.y != null) {
                  this.k.y.z();
               }
            } catch (Throwable var16) {
               o $$20 = o.a(var16, "Narrating screen");
               p $$21 = $$20.a("Screen details");
               $$21.a("Screen name", () -> this.k.y.getClass().getCanonicalName());
               throw new y($$20);
            }
         }

         if ($$4) {
            this.k.aG().a("toasts");
            this.k.ay().a($$10);
            this.k.aG().c();
         }

         $$10.e();
         $$9.b();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void ay() {
      if (!this.y && this.k.R()) {
         long $$0 = ac.b();
         if ($$0 - this.x >= 1000L) {
            this.x = $$0;
            gir $$1 = this.k.T();
            if ($$1 != null && !$$1.ad()) {
               $$1.y().ifPresent($$0x -> {
                  if (Files.isRegularFile($$0x)) {
                     this.y = true;
                  } else {
                     this.a($$0x);
                  }
               });
            }
         }
      }
   }

   private void a(Path $$0) {
      if (this.k.f.k() > 10 && this.k.f.q()) {
         epc $$1 = evt.a(this.k.g());
         ac.g().execute(() -> {
            int $$2 = $$1.a();
            int $$3 = $$1.b();
            int $$4 = 0;
            int $$5 = 0;
            if ($$2 > $$3) {
               $$4 = ($$2 - $$3) / 2;
               $$2 = $$3;
            } else {
               $$5 = ($$3 - $$2) / 2;
               $$3 = $$2;
            }

            try (epc $$6 = new epc(64, 64, false)) {
               $$1.a($$4, $$5, $$2, $$3, $$6);
               $$6.a($$0);
            } catch (IOException var16) {
               g.warn("Couldn't save auto screenshot", var16);
            } finally {
               $$1.close();
            }
         });
      }
   }

   private boolean az() {
      if (!this.w) {
         return false;
      } else {
         blv $$0 = this.k.am();
         boolean $$1 = $$0 instanceof cfi && !this.k.m.Z;
         if ($$1 && !((cfi)$$0).fT().e) {
            cmy $$2 = ((bml)$$0).eT();
            elr $$3 = this.k.v;
            if ($$3 != null && $$3.c() == elr.a.b) {
               hx $$4 = ((elp)$$3).a();
               djh $$5 = this.k.r.a_($$4);
               if (this.k.q.l() == ctm.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  djl $$6 = new djl(this.k.r, $$4, false);
                  it<cwq> $$7 = this.k.r.I_().d(ke.f);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, eqb $$2) {
      this.A.a($$0);
      if (this.k.am() == null) {
         this.k.a(this.k.s);
      }

      this.a($$0);
      this.k.aG().a("center");
      boolean $$3 = this.az();
      this.k.aG().b("camera");
      eut $$4 = this.O;
      blv $$5 = (blv)(this.k.am() == null ? this.k.s : this.k.am());
      $$4.a(this.k.r, $$5, !this.k.m.ax().a(), this.k.m.ax().b(), this.k.r.s().a($$5) ? 1.0F : $$0);
      this.n = (float)(this.k.m.aA() * 16);
      eqb $$6 = new eqb();
      double $$7 = this.a($$4, $$0, true);
      $$6.a(this.a($$7));
      this.a($$6, $$4.p());
      if (this.k.m.Y().c()) {
         this.b($$6, $$4.p());
      }

      float $$8 = this.k.m.ag().c().floatValue();
      float $$9 = auo.i($$0, this.k.s.cx, this.k.s.cw) * $$8 * $$8;
      if ($$9 > 0.0F) {
         int $$10 = this.k.s.a(blk.i) ? 7 : 20;
         float $$11 = 5.0F / ($$9 * $$9 + 5.0F) - $$9 * 0.04F;
         $$11 *= $$11;
         a $$12 = a.of(new Vector3f(0.0F, auo.g / 2.0F, auo.g / 2.0F));
         $$6.a($$12.rotationDegrees(((float)this.q + $$0) * (float)$$10));
         $$6.b(1.0F / $$11, 1.0F, 1.0F);
         float $$13 = -((float)this.q + $$0) * (float)$$10;
         $$6.a($$12.rotationDegrees($$13));
      }

      Matrix4f $$14 = $$6.c().a();
      this.a($$14);
      $$2.a(a.b.rotationDegrees($$4.d()));
      $$2.a(a.d.rotationDegrees($$4.e() + 180.0F));
      Matrix3f $$15 = new Matrix3f($$2.c().b()).invert();
      RenderSystem.setInverseViewRotationMatrix($$15);
      this.k.f.a($$2, $$4.b(), this.a(Math.max($$7, (double)this.k.m.ae().c().intValue())));
      this.k.f.a($$2, $$0, $$1, $$3, $$4, this, this.A, $$14);
      this.k.aG().b("hand");
      if (this.v) {
         RenderSystem.clear(256, evi.a);
         this.a($$2, $$4, $$0);
      }

      this.k.aG().c();
   }

   public void i() {
      this.G = null;
      this.o.a();
      this.O.o();
      this.y = false;
   }

   public eww j() {
      return this.o;
   }

   public void a(cmy $$0) {
      this.G = $$0;
      this.H = 40;
      this.I = this.m.i() * 2.0F - 1.0F;
      this.J = this.m.i() * 2.0F - 1.0F;
   }

   private void a(int $$0, int $$1, float $$2) {
      if (this.G != null && this.H > 0) {
         int $$3 = 40 - this.H;
         float $$4 = ((float)$$3 + $$2) / 40.0F;
         float $$5 = $$4 * $$4;
         float $$6 = $$4 * $$5;
         float $$7 = 10.25F * $$6 * $$5 - 24.95F * $$5 * $$5 + 25.5F * $$6 - 13.8F * $$5 + 4.0F * $$4;
         float $$8 = $$7 * (float) Math.PI;
         float $$9 = this.I * (float)($$0 / 4);
         float $$10 = this.J * (float)($$1 / 4);
         RenderSystem.enableDepthTest();
         RenderSystem.disableCull();
         eqb $$11 = new eqb();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * auo.e(auo.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * auo.e(auo.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * auo.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * auo.e(auo.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * auo.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * auo.b($$4 * 8.0F)));
         fth.a $$13 = this.p.c();
         this.k.aq().a(this.G, cmv.i, 15728880, gee.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(ewu $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = auo.i($$1, 2.0F, 1.0F);
      $$0.c().a((float)$$2 / 2.0F, (float)$$3 / 2.0F, 0.0F);
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a((float)(-$$2) / 2.0F, (float)(-$$3) / 2.0F, 0.0F);
      float $$5 = 0.2F * $$1;
      float $$6 = 0.4F * $$1;
      float $$7 = 0.2F * $$1;
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(
         GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE
      );
      $$0.a($$5, $$6, $$7, 1.0F);
      $$0.a(f, 0, 0, -90, 0.0F, 0.0F, $$2, $$3, $$2, $$3);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.c().b();
   }

   public evi k() {
      return this.k;
   }

   public float b(float $$0) {
      return auo.i($$0, this.u, this.t);
   }

   public float l() {
      return this.n;
   }

   public eut m() {
      return this.O;
   }

   public ftg n() {
      return this.A;
   }

   public gee o() {
      return this.B;
   }

   @Nullable
   public static ftv p() {
      return Q;
   }

   @Nullable
   public static ftv q() {
      return R;
   }

   @Nullable
   public static ftv r() {
      return S;
   }

   @Nullable
   public static ftv s() {
      return T;
   }

   @Nullable
   public static ftv t() {
      return U;
   }

   @Nullable
   public static ftv u() {
      return V;
   }

   @Nullable
   public static ftv v() {
      return W;
   }

   @Nullable
   public static ftv w() {
      return X;
   }

   @Nullable
   public static ftv x() {
      return Y;
   }

   @Nullable
   public static ftv y() {
      return Z;
   }

   @Nullable
   public static ftv z() {
      return aa;
   }

   @Nullable
   public static ftv A() {
      return ab;
   }

   @Nullable
   public static ftv B() {
      return ac;
   }

   @Nullable
   public static ftv C() {
      return ad;
   }

   @Nullable
   public static ftv D() {
      return ae;
   }

   @Nullable
   public static ftv E() {
      return af;
   }

   @Nullable
   public static ftv F() {
      return ag;
   }

   @Nullable
   public static ftv G() {
      return ah;
   }

   @Nullable
   public static ftv H() {
      return ai;
   }

   @Nullable
   public static ftv I() {
      return aj;
   }

   @Nullable
   public static ftv J() {
      return ak;
   }

   @Nullable
   public static ftv K() {
      return al;
   }

   @Nullable
   public static ftv L() {
      return am;
   }

   @Nullable
   public static ftv M() {
      return an;
   }

   @Nullable
   public static ftv N() {
      return ao;
   }

   @Nullable
   public static ftv O() {
      return ap;
   }

   @Nullable
   public static ftv P() {
      return aq;
   }

   @Nullable
   public static ftv Q() {
      return ar;
   }

   @Nullable
   public static ftv R() {
      return as;
   }

   @Nullable
   public static ftv S() {
      return at;
   }

   @Nullable
   public static ftv T() {
      return au;
   }

   @Nullable
   public static ftv U() {
      return av;
   }

   @Nullable
   public static ftv V() {
      return aw;
   }

   @Nullable
   public static ftv W() {
      return ax;
   }

   @Nullable
   public static ftv X() {
      return ay;
   }

   @Nullable
   public static ftv Y() {
      return az;
   }

   @Nullable
   public static ftv Z() {
      return aA;
   }

   @Nullable
   public static ftv aa() {
      return aB;
   }

   @Nullable
   public static ftv ab() {
      return aC;
   }

   @Nullable
   public static ftv ac() {
      return aD;
   }

   @Nullable
   public static ftv ad() {
      return aE;
   }

   @Nullable
   public static ftv ae() {
      return aF;
   }

   @Nullable
   public static ftv af() {
      return aG;
   }

   @Nullable
   public static ftv ag() {
      return aH;
   }

   @Nullable
   public static ftv ah() {
      return aI;
   }

   @Nullable
   public static ftv ai() {
      return aJ;
   }

   @Nullable
   public static ftv aj() {
      return aK;
   }

   @Nullable
   public static ftv ak() {
      return aL;
   }

   @Nullable
   public static ftv al() {
      return aM;
   }

   @Nullable
   public static ftv am() {
      return aN;
   }

   @Nullable
   public static ftv an() {
      return aO;
   }

   @Nullable
   public static ftv ao() {
      return aP;
   }

   @Nullable
   public static ftv ap() {
      return aQ;
   }

   @Nullable
   public static ftv aq() {
      return aR;
   }

   @Nullable
   public static ftv ar() {
      return aS;
   }

   @Nullable
   public static ftv as() {
      return aT;
   }

   @Nullable
   public static ftv at() {
      return aU;
   }

   @Nullable
   public static ftv au() {
      return aV;
   }

   @Nullable
   public static ftv av() {
      return aW;
   }

   public static record a(aql a, Map<ahg, aqg> b) implements aql {
      @Override
      public Optional<aqg> getResource(ahg $$0) {
         aqg $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
