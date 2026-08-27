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

public class fsb implements AutoCloseable {
   private static final agt f = new agt("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   private static final int j = 3;
   final euk k;
   private final aps l;
   private final auf m = auf.a();
   private float n;
   public final fse b;
   private final evy o;
   private final fso p;
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
   private final fsh A;
   private final gdf B = new gdf();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int c = 40;
   @Nullable
   private cmh G;
   private int H;
   private float I;
   private float J;
   @Nullable
   fsl K;
   static final agt[] L = new agt[]{
      new agt("shaders/post/notch.json"),
      new agt("shaders/post/fxaa.json"),
      new agt("shaders/post/art.json"),
      new agt("shaders/post/bumpy.json"),
      new agt("shaders/post/blobs2.json"),
      new agt("shaders/post/pencil.json"),
      new agt("shaders/post/color_convolve.json"),
      new agt("shaders/post/deconverge.json"),
      new agt("shaders/post/flip.json"),
      new agt("shaders/post/invert.json"),
      new agt("shaders/post/ntsc.json"),
      new agt("shaders/post/outline.json"),
      new agt("shaders/post/phosphor.json"),
      new agt("shaders/post/scan_pincushion.json"),
      new agt("shaders/post/sobel.json"),
      new agt("shaders/post/bits.json"),
      new agt("shaders/post/desaturate.json"),
      new agt("shaders/post/green.json"),
      new agt("shaders/post/blur.json"),
      new agt("shaders/post/wobble.json"),
      new agt("shaders/post/blobs.json"),
      new agt("shaders/post/antialias.json"),
      new agt("shaders/post/creeper.json"),
      new agt("shaders/post/spider.json")
   };
   public static final int d = L.length;
   int M = d;
   private boolean N;
   private final etv O = new etv();
   public fsw e;
   private final Map<String, fsw> P = Maps.newHashMap();
   @Nullable
   private static fsw Q;
   @Nullable
   private static fsw R;
   @Nullable
   private static fsw S;
   @Nullable
   private static fsw T;
   @Nullable
   private static fsw U;
   @Nullable
   private static fsw V;
   @Nullable
   private static fsw W;
   @Nullable
   private static fsw X;
   @Nullable
   private static fsw Y;
   @Nullable
   private static fsw Z;
   @Nullable
   private static fsw aa;
   @Nullable
   private static fsw ab;
   @Nullable
   private static fsw ac;
   @Nullable
   private static fsw ad;
   @Nullable
   private static fsw ae;
   @Nullable
   private static fsw af;
   @Nullable
   private static fsw ag;
   @Nullable
   private static fsw ah;
   @Nullable
   private static fsw ai;
   @Nullable
   private static fsw aj;
   @Nullable
   private static fsw ak;
   @Nullable
   private static fsw al;
   @Nullable
   private static fsw am;
   @Nullable
   private static fsw an;
   @Nullable
   private static fsw ao;
   @Nullable
   private static fsw ap;
   @Nullable
   private static fsw aq;
   @Nullable
   private static fsw ar;
   @Nullable
   private static fsw as;
   @Nullable
   private static fsw at;
   @Nullable
   private static fsw au;
   @Nullable
   private static fsw av;
   @Nullable
   private static fsw aw;
   @Nullable
   private static fsw ax;
   @Nullable
   private static fsw ay;
   @Nullable
   private static fsw az;
   @Nullable
   private static fsw aA;
   @Nullable
   private static fsw aB;
   @Nullable
   private static fsw aC;
   @Nullable
   private static fsw aD;
   @Nullable
   private static fsw aE;
   @Nullable
   private static fsw aF;
   @Nullable
   private static fsw aG;
   @Nullable
   private static fsw aH;
   @Nullable
   private static fsw aI;
   @Nullable
   private static fsw aJ;
   @Nullable
   private static fsw aK;
   @Nullable
   private static fsw aL;
   @Nullable
   private static fsw aM;
   @Nullable
   private static fsw aN;
   @Nullable
   private static fsw aO;
   @Nullable
   private static fsw aP;
   @Nullable
   private static fsw aQ;
   @Nullable
   private static fsw aR;
   @Nullable
   private static fsw aS;
   @Nullable
   private static fsw aT;
   @Nullable
   private static fsw aU;
   @Nullable
   private static fsw aV;
   @Nullable
   private static fsw aW;

   public fsb(euk $$0, fse $$1, aps $$2, fso $$3) {
      this.k = $$0;
      this.l = $$2;
      this.b = $$1;
      this.o = new evy($$0.X());
      this.A = new fsh(this, $$0);
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

   public void a(@Nullable blf $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof cbl) {
         this.a(new agt("shaders/post/creeper.json"));
      } else if ($$0 instanceof cck) {
         this.a(new agt("shaders/post/spider.json"));
      } else if ($$0 instanceof cbp) {
         this.a(new agt("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.k.al() instanceof cer) {
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

   void a(agt $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new fsl(this.k.X(), this.l, this.k.g(), $$0);
         this.K.a(this.k.aL().k(), this.k.aL().l());
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

   public apm e() {
      return new apx<fsb.a>() {
         protected fsb.a a(aps $$0, bgc $$1) {
            Map<agt, apq> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(eor.a.b.b()) || $$1x.endsWith(eor.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<agt, apq> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new apq($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fsb.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fsb.a($$0, $$3);
         }

         protected void a(fsb.a $$0, aps $$1, bgc $$2) {
            fsb.this.b($$0);
            if (fsb.this.K != null) {
               fsb.this.K.close();
            }

            fsb.this.K = null;
            if (fsb.this.M == fsb.d) {
               fsb.this.a(fsb.this.k.al());
            } else {
               fsb.this.a(fsb.L[fsb.this.M]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(apv $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new fsw($$0, "blit_screen", epb.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aT = this.a($$0, "rendertype_gui", epb.n);
         aU = this.a($$0, "rendertype_gui_overlay", epb.n);
         Q = this.a($$0, "position", epb.m);
         R = this.a($$0, "position_color", epb.n);
         S = this.a($$0, "position_color_tex", epb.r);
         T = this.a($$0, "position_tex", epb.q);
         U = this.a($$0, "position_tex_color", epb.s);
         aH = this.a($$0, "rendertype_text", epb.t);
      }
   }

   private fsw a(apv $$0, String $$1, epi $$2) {
      try {
         fsw $$3 = new fsw($$0, $$1, $$2);
         this.P.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(apv $$0) {
      RenderSystem.assertOnRenderThread();
      List<eor> $$1 = Lists.newArrayList();
      $$1.addAll(eor.a.b.c().values());
      $$1.addAll(eor.a.a.c().values());
      $$1.forEach(eor::a);
      List<Pair<fsw, Consumer<fsw>>> $$2 = Lists.newArrayListWithCapacity(this.P.size());

      try {
         $$2.add(Pair.of(new fsw($$0, "particle", epb.l), (Consumer<fsw>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new fsw($$0, "position", epb.m), (Consumer<fsw>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new fsw($$0, "position_color", epb.n), (Consumer<fsw>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new fsw($$0, "position_color_lightmap", epb.p), (Consumer<fsw>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new fsw($$0, "position_color_tex", epb.r), (Consumer<fsw>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new fsw($$0, "position_color_tex_lightmap", epb.t), (Consumer<fsw>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new fsw($$0, "position_tex", epb.q), (Consumer<fsw>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new fsw($$0, "position_tex_color", epb.s), (Consumer<fsw>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new fsw($$0, "position_tex_color_normal", epb.v), (Consumer<fsw>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new fsw($$0, "position_tex_lightmap_color", epb.u), (Consumer<fsw>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_solid", epb.j), (Consumer<fsw>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_cutout_mipped", epb.j), (Consumer<fsw>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_cutout", epb.j), (Consumer<fsw>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_translucent", epb.j), (Consumer<fsw>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_translucent_moving_block", epb.j), (Consumer<fsw>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_armor_cutout_no_cull", epb.k), (Consumer<fsw>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_entity_solid", epb.k), (Consumer<fsw>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_entity_cutout", epb.k), (Consumer<fsw>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_entity_cutout_no_cull", epb.k), (Consumer<fsw>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_entity_cutout_no_cull_z_offset", epb.k), (Consumer<fsw>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_item_entity_translucent_cull", epb.k), (Consumer<fsw>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_entity_translucent_cull", epb.k), (Consumer<fsw>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_entity_translucent", epb.k), (Consumer<fsw>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_entity_translucent_emissive", epb.k), (Consumer<fsw>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_entity_smooth_cutout", epb.k), (Consumer<fsw>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_beacon_beam", epb.j), (Consumer<fsw>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_entity_decal", epb.k), (Consumer<fsw>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_entity_no_outline", epb.k), (Consumer<fsw>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_entity_shadow", epb.k), (Consumer<fsw>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_entity_alpha", epb.k), (Consumer<fsw>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_eyes", epb.k), (Consumer<fsw>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_energy_swirl", epb.k), (Consumer<fsw>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_leash", epb.p), (Consumer<fsw>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_water_mask", epb.m), (Consumer<fsw>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_outline", epb.r), (Consumer<fsw>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_armor_glint", epb.q), (Consumer<fsw>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_armor_entity_glint", epb.q), (Consumer<fsw>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_glint_translucent", epb.q), (Consumer<fsw>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_glint", epb.q), (Consumer<fsw>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_glint_direct", epb.q), (Consumer<fsw>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_entity_glint", epb.q), (Consumer<fsw>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_entity_glint_direct", epb.q), (Consumer<fsw>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_text", epb.t), (Consumer<fsw>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_text_background", epb.p), (Consumer<fsw>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_text_intensity", epb.t), (Consumer<fsw>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_text_see_through", epb.t), (Consumer<fsw>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_text_background_see_through", epb.p), (Consumer<fsw>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_text_intensity_see_through", epb.t), (Consumer<fsw>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_lightning", epb.n), (Consumer<fsw>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_tripwire", epb.j), (Consumer<fsw>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_end_portal", epb.m), (Consumer<fsw>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_end_gateway", epb.m), (Consumer<fsw>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_lines", epb.o), (Consumer<fsw>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_crumbling", epb.j), (Consumer<fsw>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_gui", epb.n), (Consumer<fsw>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_gui_overlay", epb.n), (Consumer<fsw>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_gui_text_highlight", epb.n), (Consumer<fsw>)$$0x -> aV = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_gui_ghost_recipe_overlay", epb.n), (Consumer<fsw>)$$0x -> aW = $$0x));
         $$2.add(Pair.of(new fsw($$0, "rendertype_breeze_wind", epb.k), (Consumer<fsw>)$$0x -> aw = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((fsw)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.aw();
      $$2.forEach($$0x -> {
         fsw $$1x = (fsw)$$0x.getFirst();
         this.P.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void aw() {
      RenderSystem.assertOnRenderThread();
      this.P.values().forEach(fsw::close);
      this.P.clear();
   }

   @Nullable
   public fsw a(@Nullable String $$0) {
      return $$0 == null ? null : this.P.get($$0);
   }

   public void f() {
      this.ax();
      this.A.a();
      if (this.k.al() == null) {
         this.k.a(this.k.s);
      }

      this.O.a();
      this.b.a();
      this.q++;
      if (this.k.r.r().i()) {
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
   public fsl g() {
      return this.K;
   }

   public void a(int $$0, int $$1) {
      if (this.K != null) {
         this.K.a($$0, $$1);
      }

      this.k.f.a($$0, $$1);
   }

   public void a(float $$0) {
      blf $$1 = this.k.al();
      if ($$1 != null) {
         if (this.k.r != null) {
            this.k.aF().a("pick");
            this.k.u = null;
            double $$2 = (double)this.k.q.c();
            this.k.v = $$1.a($$2, $$0, false);
            elb $$3 = $$1.j($$0);
            boolean $$4 = this.k.q.h();
            $$2 = $$4 ? 6.0 : $$2;
            boolean $$5 = !$$4;
            double $$6 = this.k.v != null ? this.k.v.e().g($$3) : $$2 * $$2;
            elb $$7 = $$1.f(1.0F);
            elb $$8 = $$3.b($$7.c * $$2, $$7.d * $$2, $$7.e * $$2);
            float $$9 = 1.0F;
            ekw $$10 = $$1.cH().b($$7.a($$2)).c(1.0, 1.0, 1.0);
            eky $$11 = cfk.a($$1, $$3, $$8, $$10, $$0x -> !$$0x.P_() && $$0x.bt(), $$6);
            if ($$11 != null) {
               elb $$12 = $$11.e();
               double $$13 = $$3.g($$12);
               if ($$5 && $$13 > 9.0) {
                  this.k.v = ekx.a($$12, ia.a($$7.c, $$7.d, $$7.e), hv.a($$12));
               } else if ($$13 < $$6 || this.k.v == null) {
                  this.k.v = $$11;
                  blf $$14 = $$11.a();
                  this.k.u = $$14;
               }
            }

            this.k.aF().c();
         }
      }
   }

   private void ax() {
      float $$0 = 1.0F;
      if (this.k.al() instanceof frh $$1) {
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

   private double a(etv $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ae().c().intValue();
            $$3 *= (double)aty.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof blv && ((blv)$$0.g()).ew()) {
            float $$4 = Math.min((float)((blv)$$0.g()).aM + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         eeb $$5 = $$0.k();
         if ($$5 == eeb.a || $$5 == eeb.b) {
            $$3 *= aty.d(this.k.m.ah().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(epd $$0, float $$1) {
      if (this.k.al() instanceof blv $$2) {
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.ew()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = aty.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eE();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.al().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(epd $$0, float $$1) {
      if (this.k.al() instanceof cer) {
         cer $$2 = (cer)this.k.al();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = aty.i($$1, $$2.bV, $$2.bW);
         $$0.a(aty.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(aty.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(aty.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(aty.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.D = $$0;
      this.E = $$1;
      this.F = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new epd());
      this.D = 1.0F;
   }

   private void a(epd $$0, etv $$1, float $$2) {
      if (!this.C) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.k.m.Y().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.k.al() instanceof blv && ((blv)this.k.al()).fD();
         if (this.k.m.ax().a() && !$$3 && !this.k.m.Z && this.k.q.l() != csv.d) {
            this.A.c();
            this.b.a($$2, $$0, this.p.c(), this.k.s, this.k.an().a(this.k.s, $$2));
            this.A.b();
         }

         $$0.b();
         if (this.k.m.ax().a() && !$$3) {
            fss.a(this.k, $$0);
            this.a($$0, $$2);
         }

         if (this.k.m.Y().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, epl.a);
   }

   public Matrix4f a(double $$0) {
      epd $$1 = new epd();
      $$1.c().a().identity();
      if (this.D != 1.0F) {
         $$1.a(this.E, -this.F, 0.0F);
         $$1.b(this.D, this.D, 1.0F);
      }

      $$1.c()
         .a()
         .mul(new Matrix4f().setPerspective((float)($$0 * (float) (Math.PI / 180.0)), (float)this.k.aL().k() / (float)this.k.aL().l(), 0.05F, this.h()));
      return $$1.c().a();
   }

   public float h() {
      return this.n * 4.0F;
   }

   public static float a(blv $$0, float $$1) {
      bks $$2 = $$0.b(bku.p);
      return !$$2.a(200) ? 1.0F : 0.7F + aty.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(float $$0, long $$1, boolean $$2) {
      if (!this.k.az() && this.k.m.n && (!this.k.m.W().c() || !this.k.n.d())) {
         if (ac.b() - this.z > 500L) {
            this.k.c(false);
         }
      } else {
         this.z = ac.b();
      }

      if (!this.k.x) {
         float $$3 = this.k.r != null && this.k.r.r().i() ? $$0 : 1.0F;
         boolean $$4 = this.k.c();
         int $$5 = (int)(this.k.n.e() * (double)this.k.aL().o() / (double)this.k.aL().m());
         int $$6 = (int)(this.k.n.f() * (double)this.k.aL().p() / (double)this.k.aL().n());
         RenderSystem.viewport(0, 0, this.k.aL().k(), this.k.aL().l());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aF().a("level");
            this.a($$0, $$1, new epd());
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

         eoh $$7 = this.k.aL();
         RenderSystem.clear(256, euk.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, epl.b);
         epd $$9 = RenderSystem.getModelViewStack();
         $$9.a();
         $$9.e();
         $$9.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         enz.b();
         evw $$10 = new evw(this.k, this.p.c());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aF().b("gui");
            if (this.k.s != null) {
               float $$11 = aty.i($$3, this.k.s.cw, this.k.s.cv);
               float $$12 = this.k.m.ag().c().floatValue();
               if ($$11 > 0.0F && this.k.s.a(bku.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.k.m.Z || this.k.y != null) {
               this.a(this.k.aL().o(), this.k.aL().p(), $$3);
               this.k.l.a($$10, $$3);
               RenderSystem.clear(256, euk.a);
            }

            this.k.aF().c();
         }

         if (this.k.aI() != null) {
            try {
               this.k.aI().a($$10, $$5, $$6, this.k.as());
            } catch (Throwable var18) {
               o $$14 = o.a(var18, "Rendering overlay");
               p $$15 = $$14.a("Overlay render details");
               $$15.a("Overlay name", () -> this.k.aI().getClass().getCanonicalName());
               throw new y($$14);
            }
         } else if ($$4 && this.k.y != null) {
            try {
               this.k.y.c($$10, $$5, $$6, this.k.as());
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
                        this.k.aL().o(),
                        this.k.aL().p(),
                        this.k.aL().k(),
                        this.k.aL().l(),
                        this.k.aL().s()
                     )
               );
               throw new y($$17);
            }

            try {
               if (this.k.y != null) {
                  this.k.y.y();
               }
            } catch (Throwable var16) {
               o $$20 = o.a(var16, "Narrating screen");
               p $$21 = $$20.a("Screen details");
               $$21.a("Screen name", () -> this.k.y.getClass().getCanonicalName());
               throw new y($$20);
            }
         }

         if ($$4) {
            this.k.aF().a("toasts");
            this.k.ax().a($$10);
            this.k.aF().c();
         }

         $$10.e();
         $$9.b();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void ay() {
      if (!this.y && this.k.Q()) {
         long $$0 = ac.b();
         if ($$0 - this.x >= 1000L) {
            this.x = $$0;
            ghn $$1 = this.k.S();
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
         eoe $$1 = euv.a(this.k.g());
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

            try (eoe $$6 = new eoe(64, 64, false)) {
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
         blf $$0 = this.k.al();
         boolean $$1 = $$0 instanceof cer && !this.k.m.Z;
         if ($$1 && !((cer)$$0).fT().e) {
            cmh $$2 = ((blv)$$0).eT();
            ekz $$3 = this.k.v;
            if ($$3 != null && $$3.c() == ekz.a.b) {
               hv $$4 = ((ekx)$$3).a();
               dip $$5 = this.k.r.a_($$4);
               if (this.k.q.l() == csv.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  dit $$6 = new dit(this.k.r, $$4, false);
                  ir<cvz> $$7 = this.k.r.I_().d(kc.f);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, epd $$2) {
      this.A.a($$0);
      if (this.k.al() == null) {
         this.k.a(this.k.s);
      }

      this.a($$0);
      this.k.aF().a("center");
      boolean $$3 = this.az();
      this.k.aF().b("camera");
      etv $$4 = this.O;
      this.n = (float)(this.k.m.aA() * 16);
      epd $$5 = new epd();
      double $$6 = this.a($$4, $$0, true);
      $$5.a(this.a($$6));
      this.a($$5, $$0);
      if (this.k.m.Y().c()) {
         this.b($$5, $$0);
      }

      float $$7 = this.k.m.ag().c().floatValue();
      float $$8 = aty.i($$0, this.k.s.cw, this.k.s.cv) * $$7 * $$7;
      if ($$8 > 0.0F) {
         int $$9 = this.k.s.a(bku.i) ? 7 : 20;
         float $$10 = 5.0F / ($$8 * $$8 + 5.0F) - $$8 * 0.04F;
         $$10 *= $$10;
         a $$11 = a.of(new Vector3f(0.0F, aty.g / 2.0F, aty.g / 2.0F));
         $$5.a($$11.rotationDegrees(((float)this.q + $$0) * (float)$$9));
         $$5.b(1.0F / $$10, 1.0F, 1.0F);
         float $$12 = -((float)this.q + $$0) * (float)$$9;
         $$5.a($$11.rotationDegrees($$12));
      }

      Matrix4f $$13 = $$5.c().a();
      this.a($$13);
      blf $$14 = (blf)(this.k.al() == null ? this.k.s : this.k.al());
      $$4.a(this.k.r, $$14, !this.k.m.ax().a(), this.k.m.ax().b(), this.k.r.r().a($$14) ? 1.0F : $$0);
      $$2.a(a.b.rotationDegrees($$4.d()));
      $$2.a(a.d.rotationDegrees($$4.e() + 180.0F));
      Matrix3f $$15 = new Matrix3f($$2.c().b()).invert();
      RenderSystem.setInverseViewRotationMatrix($$15);
      this.k.f.a($$2, $$4.b(), this.a(Math.max($$6, (double)this.k.m.ae().c().intValue())));
      this.k.f.a($$2, $$0, $$1, $$3, $$4, this, this.A, $$13);
      this.k.aF().b("hand");
      if (this.v) {
         RenderSystem.clear(256, euk.a);
         this.a($$2, $$4, $$0);
      }

      this.k.aF().c();
   }

   public void i() {
      this.G = null;
      this.o.a();
      this.O.o();
      this.y = false;
   }

   public evy j() {
      return this.o;
   }

   public void a(cmh $$0) {
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
         epd $$11 = new epd();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * aty.e(aty.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * aty.e(aty.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * aty.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * aty.e(aty.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * aty.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * aty.b($$4 * 8.0F)));
         fsi.a $$13 = this.p.c();
         this.k.ap().a(this.G, cme.i, 15728880, gdf.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(evw $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = aty.i($$1, 2.0F, 1.0F);
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

   public euk k() {
      return this.k;
   }

   public float b(float $$0) {
      return aty.i($$0, this.u, this.t);
   }

   public float l() {
      return this.n;
   }

   public etv m() {
      return this.O;
   }

   public fsh n() {
      return this.A;
   }

   public gdf o() {
      return this.B;
   }

   @Nullable
   public static fsw p() {
      return Q;
   }

   @Nullable
   public static fsw q() {
      return R;
   }

   @Nullable
   public static fsw r() {
      return S;
   }

   @Nullable
   public static fsw s() {
      return T;
   }

   @Nullable
   public static fsw t() {
      return U;
   }

   @Nullable
   public static fsw u() {
      return V;
   }

   @Nullable
   public static fsw v() {
      return W;
   }

   @Nullable
   public static fsw w() {
      return X;
   }

   @Nullable
   public static fsw x() {
      return Y;
   }

   @Nullable
   public static fsw y() {
      return Z;
   }

   @Nullable
   public static fsw z() {
      return aa;
   }

   @Nullable
   public static fsw A() {
      return ab;
   }

   @Nullable
   public static fsw B() {
      return ac;
   }

   @Nullable
   public static fsw C() {
      return ad;
   }

   @Nullable
   public static fsw D() {
      return ae;
   }

   @Nullable
   public static fsw E() {
      return af;
   }

   @Nullable
   public static fsw F() {
      return ag;
   }

   @Nullable
   public static fsw G() {
      return ah;
   }

   @Nullable
   public static fsw H() {
      return ai;
   }

   @Nullable
   public static fsw I() {
      return aj;
   }

   @Nullable
   public static fsw J() {
      return ak;
   }

   @Nullable
   public static fsw K() {
      return al;
   }

   @Nullable
   public static fsw L() {
      return am;
   }

   @Nullable
   public static fsw M() {
      return an;
   }

   @Nullable
   public static fsw N() {
      return ao;
   }

   @Nullable
   public static fsw O() {
      return ap;
   }

   @Nullable
   public static fsw P() {
      return aq;
   }

   @Nullable
   public static fsw Q() {
      return ar;
   }

   @Nullable
   public static fsw R() {
      return as;
   }

   @Nullable
   public static fsw S() {
      return at;
   }

   @Nullable
   public static fsw T() {
      return au;
   }

   @Nullable
   public static fsw U() {
      return av;
   }

   @Nullable
   public static fsw V() {
      return aw;
   }

   @Nullable
   public static fsw W() {
      return ax;
   }

   @Nullable
   public static fsw X() {
      return ay;
   }

   @Nullable
   public static fsw Y() {
      return az;
   }

   @Nullable
   public static fsw Z() {
      return aA;
   }

   @Nullable
   public static fsw aa() {
      return aB;
   }

   @Nullable
   public static fsw ab() {
      return aC;
   }

   @Nullable
   public static fsw ac() {
      return aD;
   }

   @Nullable
   public static fsw ad() {
      return aE;
   }

   @Nullable
   public static fsw ae() {
      return aF;
   }

   @Nullable
   public static fsw af() {
      return aG;
   }

   @Nullable
   public static fsw ag() {
      return aH;
   }

   @Nullable
   public static fsw ah() {
      return aI;
   }

   @Nullable
   public static fsw ai() {
      return aJ;
   }

   @Nullable
   public static fsw aj() {
      return aK;
   }

   @Nullable
   public static fsw ak() {
      return aL;
   }

   @Nullable
   public static fsw al() {
      return aM;
   }

   @Nullable
   public static fsw am() {
      return aN;
   }

   @Nullable
   public static fsw an() {
      return aO;
   }

   @Nullable
   public static fsw ao() {
      return aP;
   }

   @Nullable
   public static fsw ap() {
      return aQ;
   }

   @Nullable
   public static fsw aq() {
      return aR;
   }

   @Nullable
   public static fsw ar() {
      return aS;
   }

   @Nullable
   public static fsw as() {
      return aT;
   }

   @Nullable
   public static fsw at() {
      return aU;
   }

   @Nullable
   public static fsw au() {
      return aV;
   }

   @Nullable
   public static fsw av() {
      return aW;
   }

   public static record a(apv a, Map<agt, apq> b) implements apv {
      @Override
      public Optional<apq> getResource(agt $$0) {
         apq $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
