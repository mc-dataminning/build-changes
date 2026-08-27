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

public class fsz implements AutoCloseable {
   private static final ahg f = new ahg("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   private static final int j = 3;
   final evh k;
   private final aqh l;
   private final auu m = auu.a();
   private float n;
   public final ftc b;
   private final ewv o;
   private final ftm p;
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
   private final ftf A;
   private final ged B = new ged();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int c = 40;
   @Nullable
   private cmx G;
   private int H;
   private float I;
   private float J;
   @Nullable
   ftj K;
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
   private final eus O = new eus();
   public ftu e;
   private final Map<String, ftu> P = Maps.newHashMap();
   @Nullable
   private static ftu Q;
   @Nullable
   private static ftu R;
   @Nullable
   private static ftu S;
   @Nullable
   private static ftu T;
   @Nullable
   private static ftu U;
   @Nullable
   private static ftu V;
   @Nullable
   private static ftu W;
   @Nullable
   private static ftu X;
   @Nullable
   private static ftu Y;
   @Nullable
   private static ftu Z;
   @Nullable
   private static ftu aa;
   @Nullable
   private static ftu ab;
   @Nullable
   private static ftu ac;
   @Nullable
   private static ftu ad;
   @Nullable
   private static ftu ae;
   @Nullable
   private static ftu af;
   @Nullable
   private static ftu ag;
   @Nullable
   private static ftu ah;
   @Nullable
   private static ftu ai;
   @Nullable
   private static ftu aj;
   @Nullable
   private static ftu ak;
   @Nullable
   private static ftu al;
   @Nullable
   private static ftu am;
   @Nullable
   private static ftu an;
   @Nullable
   private static ftu ao;
   @Nullable
   private static ftu ap;
   @Nullable
   private static ftu aq;
   @Nullable
   private static ftu ar;
   @Nullable
   private static ftu as;
   @Nullable
   private static ftu at;
   @Nullable
   private static ftu au;
   @Nullable
   private static ftu av;
   @Nullable
   private static ftu aw;
   @Nullable
   private static ftu ax;
   @Nullable
   private static ftu ay;
   @Nullable
   private static ftu az;
   @Nullable
   private static ftu aA;
   @Nullable
   private static ftu aB;
   @Nullable
   private static ftu aC;
   @Nullable
   private static ftu aD;
   @Nullable
   private static ftu aE;
   @Nullable
   private static ftu aF;
   @Nullable
   private static ftu aG;
   @Nullable
   private static ftu aH;
   @Nullable
   private static ftu aI;
   @Nullable
   private static ftu aJ;
   @Nullable
   private static ftu aK;
   @Nullable
   private static ftu aL;
   @Nullable
   private static ftu aM;
   @Nullable
   private static ftu aN;
   @Nullable
   private static ftu aO;
   @Nullable
   private static ftu aP;
   @Nullable
   private static ftu aQ;
   @Nullable
   private static ftu aR;
   @Nullable
   private static ftu aS;
   @Nullable
   private static ftu aT;
   @Nullable
   private static ftu aU;
   @Nullable
   private static ftu aV;
   @Nullable
   private static ftu aW;

   public fsz(evh $$0, ftc $$1, aqh $$2, ftm $$3) {
      this.k = $$0;
      this.l = $$2;
      this.b = $$1;
      this.o = new ewv($$0.Y());
      this.A = new ftf(this, $$0);
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

   public void a(@Nullable blu $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof cca) {
         this.a(new ahg("shaders/post/creeper.json"));
      } else if ($$0 instanceof ccz) {
         this.a(new ahg("shaders/post/spider.json"));
      } else if ($$0 instanceof cce) {
         this.a(new ahg("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.k.am() instanceof cfh) {
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
         this.K = new ftj(this.k.Y(), this.l, this.k.g(), $$0);
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

   public aqb e() {
      return new aqm<fsz.a>() {
         protected fsz.a a(aqh $$0, bgr $$1) {
            Map<ahg, aqf> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(epo.a.b.b()) || $$1x.endsWith(epo.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<ahg, aqf> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new aqf($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fsz.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fsz.a($$0, $$3);
         }

         protected void a(fsz.a $$0, aqh $$1, bgr $$2) {
            fsz.this.b($$0);
            if (fsz.this.K != null) {
               fsz.this.K.close();
            }

            fsz.this.K = null;
            if (fsz.this.M == fsz.d) {
               fsz.this.a(fsz.this.k.am());
            } else {
               fsz.this.a(fsz.L[fsz.this.M]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(aqk $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new ftu($$0, "blit_screen", epy.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aT = this.a($$0, "rendertype_gui", epy.n);
         aU = this.a($$0, "rendertype_gui_overlay", epy.n);
         Q = this.a($$0, "position", epy.m);
         R = this.a($$0, "position_color", epy.n);
         S = this.a($$0, "position_color_tex", epy.r);
         T = this.a($$0, "position_tex", epy.q);
         U = this.a($$0, "position_tex_color", epy.s);
         aH = this.a($$0, "rendertype_text", epy.t);
      }
   }

   private ftu a(aqk $$0, String $$1, eqf $$2) {
      try {
         ftu $$3 = new ftu($$0, $$1, $$2);
         this.P.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(aqk $$0) {
      RenderSystem.assertOnRenderThread();
      List<epo> $$1 = Lists.newArrayList();
      $$1.addAll(epo.a.b.c().values());
      $$1.addAll(epo.a.a.c().values());
      $$1.forEach(epo::a);
      List<Pair<ftu, Consumer<ftu>>> $$2 = Lists.newArrayListWithCapacity(this.P.size());

      try {
         $$2.add(Pair.of(new ftu($$0, "particle", epy.l), (Consumer<ftu>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new ftu($$0, "position", epy.m), (Consumer<ftu>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new ftu($$0, "position_color", epy.n), (Consumer<ftu>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new ftu($$0, "position_color_lightmap", epy.p), (Consumer<ftu>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new ftu($$0, "position_color_tex", epy.r), (Consumer<ftu>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new ftu($$0, "position_color_tex_lightmap", epy.t), (Consumer<ftu>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new ftu($$0, "position_tex", epy.q), (Consumer<ftu>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new ftu($$0, "position_tex_color", epy.s), (Consumer<ftu>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new ftu($$0, "position_tex_color_normal", epy.v), (Consumer<ftu>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new ftu($$0, "position_tex_lightmap_color", epy.u), (Consumer<ftu>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_solid", epy.j), (Consumer<ftu>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_cutout_mipped", epy.j), (Consumer<ftu>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_cutout", epy.j), (Consumer<ftu>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_translucent", epy.j), (Consumer<ftu>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_translucent_moving_block", epy.j), (Consumer<ftu>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_armor_cutout_no_cull", epy.k), (Consumer<ftu>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_entity_solid", epy.k), (Consumer<ftu>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_entity_cutout", epy.k), (Consumer<ftu>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_entity_cutout_no_cull", epy.k), (Consumer<ftu>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_entity_cutout_no_cull_z_offset", epy.k), (Consumer<ftu>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_item_entity_translucent_cull", epy.k), (Consumer<ftu>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_entity_translucent_cull", epy.k), (Consumer<ftu>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_entity_translucent", epy.k), (Consumer<ftu>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_entity_translucent_emissive", epy.k), (Consumer<ftu>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_entity_smooth_cutout", epy.k), (Consumer<ftu>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_beacon_beam", epy.j), (Consumer<ftu>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_entity_decal", epy.k), (Consumer<ftu>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_entity_no_outline", epy.k), (Consumer<ftu>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_entity_shadow", epy.k), (Consumer<ftu>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_entity_alpha", epy.k), (Consumer<ftu>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_eyes", epy.k), (Consumer<ftu>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_energy_swirl", epy.k), (Consumer<ftu>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_leash", epy.p), (Consumer<ftu>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_water_mask", epy.m), (Consumer<ftu>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_outline", epy.r), (Consumer<ftu>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_armor_glint", epy.q), (Consumer<ftu>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_armor_entity_glint", epy.q), (Consumer<ftu>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_glint_translucent", epy.q), (Consumer<ftu>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_glint", epy.q), (Consumer<ftu>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_glint_direct", epy.q), (Consumer<ftu>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_entity_glint", epy.q), (Consumer<ftu>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_entity_glint_direct", epy.q), (Consumer<ftu>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_text", epy.t), (Consumer<ftu>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_text_background", epy.p), (Consumer<ftu>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_text_intensity", epy.t), (Consumer<ftu>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_text_see_through", epy.t), (Consumer<ftu>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_text_background_see_through", epy.p), (Consumer<ftu>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_text_intensity_see_through", epy.t), (Consumer<ftu>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_lightning", epy.n), (Consumer<ftu>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_tripwire", epy.j), (Consumer<ftu>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_end_portal", epy.m), (Consumer<ftu>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_end_gateway", epy.m), (Consumer<ftu>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_lines", epy.o), (Consumer<ftu>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_crumbling", epy.j), (Consumer<ftu>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_gui", epy.n), (Consumer<ftu>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_gui_overlay", epy.n), (Consumer<ftu>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_gui_text_highlight", epy.n), (Consumer<ftu>)$$0x -> aV = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_gui_ghost_recipe_overlay", epy.n), (Consumer<ftu>)$$0x -> aW = $$0x));
         $$2.add(Pair.of(new ftu($$0, "rendertype_breeze_wind", epy.k), (Consumer<ftu>)$$0x -> aw = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((ftu)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.aw();
      $$2.forEach($$0x -> {
         ftu $$1x = (ftu)$$0x.getFirst();
         this.P.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void aw() {
      RenderSystem.assertOnRenderThread();
      this.P.values().forEach(ftu::close);
      this.P.clear();
   }

   @Nullable
   public ftu a(@Nullable String $$0) {
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
   public ftj g() {
      return this.K;
   }

   public void a(int $$0, int $$1) {
      if (this.K != null) {
         this.K.a($$0, $$1);
      }

      this.k.f.a($$0, $$1);
   }

   public void a(float $$0) {
      blu $$1 = this.k.am();
      if ($$1 != null) {
         if (this.k.r != null) {
            this.k.aG().a("pick");
            this.k.u = null;
            double $$2 = (double)this.k.q.c();
            this.k.v = $$1.a($$2, $$0, false);
            els $$3 = $$1.j($$0);
            boolean $$4 = this.k.q.h();
            $$2 = $$4 ? 6.0 : $$2;
            boolean $$5 = !$$4;
            double $$6 = this.k.v != null ? this.k.v.e().g($$3) : $$2 * $$2;
            els $$7 = $$1.f(1.0F);
            els $$8 = $$3.b($$7.c * $$2, $$7.d * $$2, $$7.e * $$2);
            float $$9 = 1.0F;
            eln $$10 = $$1.cH().b($$7.a($$2)).c(1.0, 1.0, 1.0);
            elp $$11 = cga.a($$1, $$3, $$8, $$10, $$0x -> !$$0x.P_() && $$0x.bt(), $$6);
            if ($$11 != null) {
               els $$12 = $$11.e();
               double $$13 = $$3.g($$12);
               if ($$5 && $$13 > 9.0) {
                  this.k.v = elo.a($$12, ic.a($$7.c, $$7.d, $$7.e), hx.a($$12));
               } else if ($$13 < $$6 || this.k.v == null) {
                  this.k.v = $$11;
                  blu $$14 = $$11.a();
                  this.k.u = $$14;
               }
            }

            this.k.aG().c();
         }
      }
   }

   private void ax() {
      float $$0 = 1.0F;
      if (this.k.am() instanceof fsf $$1) {
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

   private double a(eus $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ae().c().intValue();
            $$3 *= (double)aun.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof bmk && ((bmk)$$0.g()).ew()) {
            float $$4 = Math.min((float)((bmk)$$0.g()).aM + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         ees $$5 = $$0.k();
         if ($$5 == ees.a || $$5 == ees.b) {
            $$3 *= aun.d(this.k.m.ah().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(eqa $$0, float $$1) {
      if (this.k.am() instanceof bmk $$2) {
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.ew()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = aun.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eE();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.al().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(eqa $$0, float $$1) {
      if (this.k.am() instanceof cfh) {
         cfh $$2 = (cfh)this.k.am();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = aun.i($$1, $$2.bV, $$2.bW);
         $$0.a(aun.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(aun.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(aun.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(aun.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.D = $$0;
      this.E = $$1;
      this.F = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new eqa());
      this.D = 1.0F;
   }

   private void a(eqa $$0, eus $$1, float $$2) {
      if (!this.C) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.k.m.Y().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.k.am() instanceof bmk && ((bmk)this.k.am()).fD();
         if (this.k.m.ax().a() && !$$3 && !this.k.m.Z && this.k.q.l() != ctl.d) {
            this.A.c();
            this.b.a($$2, $$0, this.p.c(), this.k.s, this.k.ao().a(this.k.s, $$2));
            this.A.b();
         }

         $$0.b();
         if (this.k.m.ax().a() && !$$3) {
            ftq.a(this.k, $$0);
            this.a($$0, $$2);
         }

         if (this.k.m.Y().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, eqi.a);
   }

   public Matrix4f a(double $$0) {
      eqa $$1 = new eqa();
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

   public static float a(bmk $$0, float $$1) {
      blh $$2 = $$0.b(blj.p);
      return !$$2.a(200) ? 1.0F : 0.7F + aun.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
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
            this.a($$0, $$1, new eqa());
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

         epe $$7 = this.k.aM();
         RenderSystem.clear(256, evh.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, eqi.b);
         eqa $$9 = RenderSystem.getModelViewStack();
         $$9.a();
         $$9.e();
         $$9.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         eow.b();
         ewt $$10 = new ewt(this.k, this.p.c());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aG().b("gui");
            if (this.k.s != null) {
               float $$11 = aun.i($$3, this.k.s.cx, this.k.s.cw);
               float $$12 = this.k.m.ag().c().floatValue();
               if ($$11 > 0.0F && this.k.s.a(blj.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.k.m.Z || this.k.y != null) {
               this.a(this.k.aM().o(), this.k.aM().p(), $$3);
               this.k.l.a($$10, $$3);
               RenderSystem.clear(256, evh.a);
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
            giq $$1 = this.k.T();
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
         epb $$1 = evs.a(this.k.g());
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

            try (epb $$6 = new epb(64, 64, false)) {
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
         blu $$0 = this.k.am();
         boolean $$1 = $$0 instanceof cfh && !this.k.m.Z;
         if ($$1 && !((cfh)$$0).fT().e) {
            cmx $$2 = ((bmk)$$0).eT();
            elq $$3 = this.k.v;
            if ($$3 != null && $$3.c() == elq.a.b) {
               hx $$4 = ((elo)$$3).a();
               djg $$5 = this.k.r.a_($$4);
               if (this.k.q.l() == ctl.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  djk $$6 = new djk(this.k.r, $$4, false);
                  it<cwp> $$7 = this.k.r.I_().d(ke.f);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, eqa $$2) {
      this.A.a($$0);
      if (this.k.am() == null) {
         this.k.a(this.k.s);
      }

      this.a($$0);
      this.k.aG().a("center");
      boolean $$3 = this.az();
      this.k.aG().b("camera");
      eus $$4 = this.O;
      blu $$5 = (blu)(this.k.am() == null ? this.k.s : this.k.am());
      $$4.a(this.k.r, $$5, !this.k.m.ax().a(), this.k.m.ax().b(), this.k.r.s().a($$5) ? 1.0F : $$0);
      this.n = (float)(this.k.m.aA() * 16);
      eqa $$6 = new eqa();
      double $$7 = this.a($$4, $$0, true);
      $$6.a(this.a($$7));
      this.a($$6, $$4.p());
      if (this.k.m.Y().c()) {
         this.b($$6, $$4.p());
      }

      float $$8 = this.k.m.ag().c().floatValue();
      float $$9 = aun.i($$0, this.k.s.cx, this.k.s.cw) * $$8 * $$8;
      if ($$9 > 0.0F) {
         int $$10 = this.k.s.a(blj.i) ? 7 : 20;
         float $$11 = 5.0F / ($$9 * $$9 + 5.0F) - $$9 * 0.04F;
         $$11 *= $$11;
         a $$12 = a.of(new Vector3f(0.0F, aun.g / 2.0F, aun.g / 2.0F));
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
         RenderSystem.clear(256, evh.a);
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

   public ewv j() {
      return this.o;
   }

   public void a(cmx $$0) {
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
         eqa $$11 = new eqa();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * aun.e(aun.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * aun.e(aun.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * aun.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * aun.e(aun.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * aun.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * aun.b($$4 * 8.0F)));
         ftg.a $$13 = this.p.c();
         this.k.aq().a(this.G, cmu.i, 15728880, ged.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(ewt $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = aun.i($$1, 2.0F, 1.0F);
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

   public evh k() {
      return this.k;
   }

   public float b(float $$0) {
      return aun.i($$0, this.u, this.t);
   }

   public float l() {
      return this.n;
   }

   public eus m() {
      return this.O;
   }

   public ftf n() {
      return this.A;
   }

   public ged o() {
      return this.B;
   }

   @Nullable
   public static ftu p() {
      return Q;
   }

   @Nullable
   public static ftu q() {
      return R;
   }

   @Nullable
   public static ftu r() {
      return S;
   }

   @Nullable
   public static ftu s() {
      return T;
   }

   @Nullable
   public static ftu t() {
      return U;
   }

   @Nullable
   public static ftu u() {
      return V;
   }

   @Nullable
   public static ftu v() {
      return W;
   }

   @Nullable
   public static ftu w() {
      return X;
   }

   @Nullable
   public static ftu x() {
      return Y;
   }

   @Nullable
   public static ftu y() {
      return Z;
   }

   @Nullable
   public static ftu z() {
      return aa;
   }

   @Nullable
   public static ftu A() {
      return ab;
   }

   @Nullable
   public static ftu B() {
      return ac;
   }

   @Nullable
   public static ftu C() {
      return ad;
   }

   @Nullable
   public static ftu D() {
      return ae;
   }

   @Nullable
   public static ftu E() {
      return af;
   }

   @Nullable
   public static ftu F() {
      return ag;
   }

   @Nullable
   public static ftu G() {
      return ah;
   }

   @Nullable
   public static ftu H() {
      return ai;
   }

   @Nullable
   public static ftu I() {
      return aj;
   }

   @Nullable
   public static ftu J() {
      return ak;
   }

   @Nullable
   public static ftu K() {
      return al;
   }

   @Nullable
   public static ftu L() {
      return am;
   }

   @Nullable
   public static ftu M() {
      return an;
   }

   @Nullable
   public static ftu N() {
      return ao;
   }

   @Nullable
   public static ftu O() {
      return ap;
   }

   @Nullable
   public static ftu P() {
      return aq;
   }

   @Nullable
   public static ftu Q() {
      return ar;
   }

   @Nullable
   public static ftu R() {
      return as;
   }

   @Nullable
   public static ftu S() {
      return at;
   }

   @Nullable
   public static ftu T() {
      return au;
   }

   @Nullable
   public static ftu U() {
      return av;
   }

   @Nullable
   public static ftu V() {
      return aw;
   }

   @Nullable
   public static ftu W() {
      return ax;
   }

   @Nullable
   public static ftu X() {
      return ay;
   }

   @Nullable
   public static ftu Y() {
      return az;
   }

   @Nullable
   public static ftu Z() {
      return aA;
   }

   @Nullable
   public static ftu aa() {
      return aB;
   }

   @Nullable
   public static ftu ab() {
      return aC;
   }

   @Nullable
   public static ftu ac() {
      return aD;
   }

   @Nullable
   public static ftu ad() {
      return aE;
   }

   @Nullable
   public static ftu ae() {
      return aF;
   }

   @Nullable
   public static ftu af() {
      return aG;
   }

   @Nullable
   public static ftu ag() {
      return aH;
   }

   @Nullable
   public static ftu ah() {
      return aI;
   }

   @Nullable
   public static ftu ai() {
      return aJ;
   }

   @Nullable
   public static ftu aj() {
      return aK;
   }

   @Nullable
   public static ftu ak() {
      return aL;
   }

   @Nullable
   public static ftu al() {
      return aM;
   }

   @Nullable
   public static ftu am() {
      return aN;
   }

   @Nullable
   public static ftu an() {
      return aO;
   }

   @Nullable
   public static ftu ao() {
      return aP;
   }

   @Nullable
   public static ftu ap() {
      return aQ;
   }

   @Nullable
   public static ftu aq() {
      return aR;
   }

   @Nullable
   public static ftu ar() {
      return aS;
   }

   @Nullable
   public static ftu as() {
      return aT;
   }

   @Nullable
   public static ftu at() {
      return aU;
   }

   @Nullable
   public static ftu au() {
      return aV;
   }

   @Nullable
   public static ftu av() {
      return aW;
   }

   public static record a(aqk a, Map<ahg, aqf> b) implements aqk {
      @Override
      public Optional<aqf> getResource(ahg $$0) {
         aqf $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
