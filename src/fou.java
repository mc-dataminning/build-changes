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

public class fou implements AutoCloseable {
   private static final afw f = new afw("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   private static final int j = 3;
   final ero k;
   private final aot l;
   private final ate m = ate.a();
   private float n;
   public final fox b;
   private final eta o;
   private final fph p;
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
   private final fpa A;
   private final fzr B = new fzr();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int c = 40;
   @Nullable
   private ckj G;
   private int H;
   private float I;
   private float J;
   @Nullable
   fpe K;
   static final afw[] L = new afw[]{
      new afw("shaders/post/notch.json"),
      new afw("shaders/post/fxaa.json"),
      new afw("shaders/post/art.json"),
      new afw("shaders/post/bumpy.json"),
      new afw("shaders/post/blobs2.json"),
      new afw("shaders/post/pencil.json"),
      new afw("shaders/post/color_convolve.json"),
      new afw("shaders/post/deconverge.json"),
      new afw("shaders/post/flip.json"),
      new afw("shaders/post/invert.json"),
      new afw("shaders/post/ntsc.json"),
      new afw("shaders/post/outline.json"),
      new afw("shaders/post/phosphor.json"),
      new afw("shaders/post/scan_pincushion.json"),
      new afw("shaders/post/sobel.json"),
      new afw("shaders/post/bits.json"),
      new afw("shaders/post/desaturate.json"),
      new afw("shaders/post/green.json"),
      new afw("shaders/post/blur.json"),
      new afw("shaders/post/wobble.json"),
      new afw("shaders/post/blobs.json"),
      new afw("shaders/post/antialias.json"),
      new afw("shaders/post/creeper.json"),
      new afw("shaders/post/spider.json")
   };
   public static final int d = L.length;
   int M = d;
   private boolean N;
   private final eqz O = new eqz();
   public fpo e;
   private final Map<String, fpo> P = Maps.newHashMap();
   @Nullable
   private static fpo Q;
   @Nullable
   private static fpo R;
   @Nullable
   private static fpo S;
   @Nullable
   private static fpo T;
   @Nullable
   private static fpo U;
   @Nullable
   private static fpo V;
   @Nullable
   private static fpo W;
   @Nullable
   private static fpo X;
   @Nullable
   private static fpo Y;
   @Nullable
   private static fpo Z;
   @Nullable
   private static fpo aa;
   @Nullable
   private static fpo ab;
   @Nullable
   private static fpo ac;
   @Nullable
   private static fpo ad;
   @Nullable
   private static fpo ae;
   @Nullable
   private static fpo af;
   @Nullable
   private static fpo ag;
   @Nullable
   private static fpo ah;
   @Nullable
   private static fpo ai;
   @Nullable
   private static fpo aj;
   @Nullable
   private static fpo ak;
   @Nullable
   private static fpo al;
   @Nullable
   private static fpo am;
   @Nullable
   private static fpo an;
   @Nullable
   private static fpo ao;
   @Nullable
   private static fpo ap;
   @Nullable
   private static fpo aq;
   @Nullable
   private static fpo ar;
   @Nullable
   private static fpo as;
   @Nullable
   private static fpo at;
   @Nullable
   private static fpo au;
   @Nullable
   private static fpo av;
   @Nullable
   private static fpo aw;
   @Nullable
   private static fpo ax;
   @Nullable
   private static fpo ay;
   @Nullable
   private static fpo az;
   @Nullable
   private static fpo aA;
   @Nullable
   private static fpo aB;
   @Nullable
   private static fpo aC;
   @Nullable
   private static fpo aD;
   @Nullable
   private static fpo aE;
   @Nullable
   private static fpo aF;
   @Nullable
   private static fpo aG;
   @Nullable
   private static fpo aH;
   @Nullable
   private static fpo aI;
   @Nullable
   private static fpo aJ;
   @Nullable
   private static fpo aK;
   @Nullable
   private static fpo aL;
   @Nullable
   private static fpo aM;
   @Nullable
   private static fpo aN;
   @Nullable
   private static fpo aO;
   @Nullable
   private static fpo aP;
   @Nullable
   private static fpo aQ;
   @Nullable
   private static fpo aR;
   @Nullable
   private static fpo aS;
   @Nullable
   private static fpo aT;
   @Nullable
   private static fpo aU;
   @Nullable
   private static fpo aV;
   @Nullable
   private static fpo aW;

   public fou(ero $$0, fox $$1, aot $$2, fph $$3) {
      this.k = $$0;
      this.l = $$2;
      this.b = $$1;
      this.o = new eta($$0.Y());
      this.A = new fpa(this, $$0);
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

   public void a(@Nullable bjt $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof bzx) {
         this.a(new afw("shaders/post/creeper.json"));
      } else if ($$0 instanceof caw) {
         this.a(new afw("shaders/post/spider.json"));
      } else if ($$0 instanceof cab) {
         this.a(new afw("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.k.am() instanceof ccx) {
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

   void a(afw $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new fpe(this.k.Y(), this.l, this.k.g(), $$0);
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

   public aon e() {
      return new aoy<fou.a>() {
         protected fou.a a(aot $$0, bes $$1) {
            Map<afw, aor> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(elv.a.b.b()) || $$1x.endsWith(elv.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<afw, aor> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new aor($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fou.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fou.a($$0, $$3);
         }

         protected void a(fou.a $$0, aot $$1, bes $$2) {
            fou.this.b($$0);
            if (fou.this.K != null) {
               fou.this.K.close();
            }

            fou.this.K = null;
            if (fou.this.M == fou.d) {
               fou.this.a(fou.this.k.am());
            } else {
               fou.this.a(fou.L[fou.this.M]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(aow $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new fpo($$0, "blit_screen", emf.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aT = this.a($$0, "rendertype_gui", emf.n);
         aU = this.a($$0, "rendertype_gui_overlay", emf.n);
         Q = this.a($$0, "position", emf.m);
         R = this.a($$0, "position_color", emf.n);
         S = this.a($$0, "position_color_tex", emf.r);
         T = this.a($$0, "position_tex", emf.q);
         U = this.a($$0, "position_tex_color", emf.s);
         aH = this.a($$0, "rendertype_text", emf.t);
      }
   }

   private fpo a(aow $$0, String $$1, emm $$2) {
      try {
         fpo $$3 = new fpo($$0, $$1, $$2);
         this.P.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(aow $$0) {
      RenderSystem.assertOnRenderThread();
      List<elv> $$1 = Lists.newArrayList();
      $$1.addAll(elv.a.b.c().values());
      $$1.addAll(elv.a.a.c().values());
      $$1.forEach(elv::a);
      List<Pair<fpo, Consumer<fpo>>> $$2 = Lists.newArrayListWithCapacity(this.P.size());

      try {
         $$2.add(Pair.of(new fpo($$0, "particle", emf.l), (Consumer<fpo>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new fpo($$0, "position", emf.m), (Consumer<fpo>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new fpo($$0, "position_color", emf.n), (Consumer<fpo>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new fpo($$0, "position_color_lightmap", emf.p), (Consumer<fpo>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new fpo($$0, "position_color_tex", emf.r), (Consumer<fpo>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new fpo($$0, "position_color_tex_lightmap", emf.t), (Consumer<fpo>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new fpo($$0, "position_tex", emf.q), (Consumer<fpo>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new fpo($$0, "position_tex_color", emf.s), (Consumer<fpo>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new fpo($$0, "position_tex_color_normal", emf.v), (Consumer<fpo>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new fpo($$0, "position_tex_lightmap_color", emf.u), (Consumer<fpo>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_solid", emf.j), (Consumer<fpo>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_cutout_mipped", emf.j), (Consumer<fpo>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_cutout", emf.j), (Consumer<fpo>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_translucent", emf.j), (Consumer<fpo>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_translucent_moving_block", emf.j), (Consumer<fpo>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_translucent_no_crumbling", emf.j), (Consumer<fpo>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_armor_cutout_no_cull", emf.k), (Consumer<fpo>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_entity_solid", emf.k), (Consumer<fpo>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_entity_cutout", emf.k), (Consumer<fpo>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_entity_cutout_no_cull", emf.k), (Consumer<fpo>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_entity_cutout_no_cull_z_offset", emf.k), (Consumer<fpo>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_item_entity_translucent_cull", emf.k), (Consumer<fpo>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_entity_translucent_cull", emf.k), (Consumer<fpo>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_entity_translucent", emf.k), (Consumer<fpo>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_entity_translucent_emissive", emf.k), (Consumer<fpo>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_entity_smooth_cutout", emf.k), (Consumer<fpo>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_beacon_beam", emf.j), (Consumer<fpo>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_entity_decal", emf.k), (Consumer<fpo>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_entity_no_outline", emf.k), (Consumer<fpo>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_entity_shadow", emf.k), (Consumer<fpo>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_entity_alpha", emf.k), (Consumer<fpo>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_eyes", emf.k), (Consumer<fpo>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_energy_swirl", emf.k), (Consumer<fpo>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_leash", emf.p), (Consumer<fpo>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_water_mask", emf.m), (Consumer<fpo>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_outline", emf.r), (Consumer<fpo>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_armor_glint", emf.q), (Consumer<fpo>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_armor_entity_glint", emf.q), (Consumer<fpo>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_glint_translucent", emf.q), (Consumer<fpo>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_glint", emf.q), (Consumer<fpo>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_glint_direct", emf.q), (Consumer<fpo>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_entity_glint", emf.q), (Consumer<fpo>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_entity_glint_direct", emf.q), (Consumer<fpo>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_text", emf.t), (Consumer<fpo>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_text_background", emf.p), (Consumer<fpo>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_text_intensity", emf.t), (Consumer<fpo>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_text_see_through", emf.t), (Consumer<fpo>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_text_background_see_through", emf.p), (Consumer<fpo>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_text_intensity_see_through", emf.t), (Consumer<fpo>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_lightning", emf.n), (Consumer<fpo>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_tripwire", emf.j), (Consumer<fpo>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_end_portal", emf.m), (Consumer<fpo>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_end_gateway", emf.m), (Consumer<fpo>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_lines", emf.o), (Consumer<fpo>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_crumbling", emf.j), (Consumer<fpo>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_gui", emf.n), (Consumer<fpo>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_gui_overlay", emf.n), (Consumer<fpo>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_gui_text_highlight", emf.n), (Consumer<fpo>)$$0x -> aV = $$0x));
         $$2.add(Pair.of(new fpo($$0, "rendertype_gui_ghost_recipe_overlay", emf.n), (Consumer<fpo>)$$0x -> aW = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((fpo)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.aw();
      $$2.forEach($$0x -> {
         fpo $$1x = (fpo)$$0x.getFirst();
         this.P.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void aw() {
      RenderSystem.assertOnRenderThread();
      this.P.values().forEach(fpo::close);
      this.P.clear();
   }

   @Nullable
   public fpo a(@Nullable String $$0) {
      return $$0 == null ? null : this.P.get($$0);
   }

   public void f() {
      this.ax();
      this.A.a();
      if (this.k.am() == null) {
         this.k.a(this.k.s);
      }

      this.O.a();
      this.q++;
      this.b.a();
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

   @Nullable
   public fpe g() {
      return this.K;
   }

   public void a(int $$0, int $$1) {
      if (this.K != null) {
         this.K.a($$0, $$1);
      }

      this.k.f.a($$0, $$1);
   }

   public void a(float $$0) {
      bjt $$1 = this.k.am();
      if ($$1 != null) {
         if (this.k.r != null) {
            this.k.aG().a("pick");
            this.k.u = null;
            double $$2 = (double)this.k.q.c();
            this.k.v = $$1.a($$2, $$0, false);
            eif $$3 = $$1.j($$0);
            boolean $$4 = this.k.q.h();
            $$2 = $$4 ? 6.0 : $$2;
            boolean $$5 = !$$4;
            double $$6 = this.k.v != null ? this.k.v.e().g($$3) : $$2 * $$2;
            eif $$7 = $$1.f(1.0F);
            eif $$8 = $$3.b($$7.c * $$2, $$7.d * $$2, $$7.e * $$2);
            float $$9 = 1.0F;
            eia $$10 = $$1.cG().b($$7.a($$2)).c(1.0, 1.0, 1.0);
            eic $$11 = cdq.a($$1, $$3, $$8, $$10, $$0x -> !$$0x.N_() && $$0x.br(), $$6);
            if ($$11 != null) {
               eif $$12 = $$11.e();
               double $$13 = $$3.g($$12);
               if ($$5 && $$13 > 9.0) {
                  this.k.v = eib.a($$12, hx.a($$7.c, $$7.d, $$7.e), ht.a($$12));
               } else if ($$13 < $$6 || this.k.v == null) {
                  this.k.v = $$11;
                  bjt $$14 = $$11.a();
                  this.k.u = $$14;
               }
            }

            this.k.aG().c();
         }
      }
   }

   private void ax() {
      float $$0 = 1.0F;
      if (this.k.am() instanceof fnz $$1) {
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

   private double a(eqz $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ad().c().intValue();
            $$3 *= (double)asy.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof bkj && ((bkj)$$0.g()).ev()) {
            float $$4 = Math.min((float)((bkj)$$0.g()).aM + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         ebg $$5 = $$0.k();
         if ($$5 == ebg.a || $$5 == ebg.b) {
            $$3 *= asy.d(this.k.m.ag().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(emh $$0, float $$1) {
      if (this.k.am() instanceof bkj $$2) {
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.ev()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = asy.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eD();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.ak().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(emh $$0, float $$1) {
      if (this.k.am() instanceof ccx) {
         ccx $$2 = (ccx)this.k.am();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = asy.i($$1, $$2.bV, $$2.bW);
         $$0.a(asy.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(asy.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(asy.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(asy.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.D = $$0;
      this.E = $$1;
      this.F = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new emh());
      this.D = 1.0F;
   }

   private void a(emh $$0, eqz $$1, float $$2) {
      if (!this.C) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.k.m.X().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.k.am() instanceof bkj && ((bkj)this.k.am()).fD();
         if (this.k.m.aw().a() && !$$3 && !this.k.m.Z && this.k.q.l() != cqw.d) {
            this.A.c();
            this.b.a($$2, $$0, this.p.b(), this.k.s, this.k.ao().a(this.k.s, $$2));
            this.A.b();
         }

         $$0.b();
         if (this.k.m.aw().a() && !$$3) {
            fpl.a(this.k, $$0);
            this.a($$0, $$2);
         }

         if (this.k.m.X().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, emp.a);
   }

   public Matrix4f a(double $$0) {
      emh $$1 = new emh();
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

   public static float a(bkj $$0, float $$1) {
      bjg $$2 = $$0.b(bji.p);
      return !$$2.a(200) ? 1.0F : 0.7F + asy.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(float $$0, long $$1, boolean $$2) {
      if (!this.k.aA() && this.k.m.n && (!this.k.m.V().c() || !this.k.n.d())) {
         if (ac.b() - this.z > 500L) {
            this.k.c(false);
         }
      } else {
         this.z = ac.b();
      }

      if (!this.k.x) {
         boolean $$3 = this.k.c();
         int $$4 = (int)(this.k.n.e() * (double)this.k.aM().o() / (double)this.k.aM().m());
         int $$5 = (int)(this.k.n.f() * (double)this.k.aM().p() / (double)this.k.aM().n());
         RenderSystem.viewport(0, 0, this.k.aM().k(), this.k.aM().l());
         if ($$3 && $$2 && this.k.r != null) {
            this.k.aG().a("level");
            this.a($$0, $$1, new emh());
            this.ay();
            this.k.f.b();
            if (this.K != null && this.N) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.K.a($$0);
            }

            this.k.g().a(true);
         }

         ell $$6 = this.k.aM();
         RenderSystem.clear(256, ero.a);
         Matrix4f $$7 = new Matrix4f().setOrtho(0.0F, (float)((double)$$6.k() / $$6.s()), (float)((double)$$6.l() / $$6.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$7, emp.b);
         emh $$8 = RenderSystem.getModelViewStack();
         $$8.a();
         $$8.e();
         $$8.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         eld.b();
         esy $$9 = new esy(this.k, this.p.b());
         if ($$3 && $$2 && this.k.r != null) {
            this.k.aG().b("gui");
            if (this.k.s != null) {
               float $$10 = asy.i($$0, this.k.s.cw, this.k.s.cv);
               float $$11 = this.k.m.af().c().floatValue();
               if ($$10 > 0.0F && this.k.s.a(bji.i) && $$11 < 1.0F) {
                  this.a($$9, $$10 * (1.0F - $$11));
               }
            }

            if (!this.k.m.Z || this.k.y != null) {
               this.a(this.k.aM().o(), this.k.aM().p(), $$0);
               this.k.l.a($$9, $$0);
               RenderSystem.clear(256, ero.a);
            }

            this.k.aG().c();
         }

         if (this.k.aJ() != null) {
            try {
               this.k.aJ().a($$9, $$4, $$5, this.k.av());
            } catch (Throwable var17) {
               o $$13 = o.a(var17, "Rendering overlay");
               p $$14 = $$13.a("Overlay render details");
               $$14.a("Overlay name", () -> this.k.aJ().getClass().getCanonicalName());
               throw new y($$13);
            }
         } else if ($$3 && this.k.y != null) {
            try {
               this.k.y.c($$9, $$4, $$5, this.k.av());
            } catch (Throwable var16) {
               o $$16 = o.a(var16, "Rendering screen");
               p $$17 = $$16.a("Screen render details");
               $$17.a("Screen name", () -> this.k.y.getClass().getCanonicalName());
               $$17.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", $$4, $$5, this.k.n.e(), this.k.n.f()));
               $$17.a(
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
               throw new y($$16);
            }

            try {
               if (this.k.y != null) {
                  this.k.y.y();
               }
            } catch (Throwable var15) {
               o $$19 = o.a(var15, "Narrating screen");
               p $$20 = $$19.a("Screen details");
               $$20.a("Screen name", () -> this.k.y.getClass().getCanonicalName());
               throw new y($$19);
            }
         }

         if ($$3) {
            this.k.aG().a("toasts");
            this.k.ay().a($$9);
            this.k.aG().c();
         }

         $$9.e();
         $$8.b();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void ay() {
      if (!this.y && this.k.R()) {
         long $$0 = ac.b();
         if ($$0 - this.x >= 1000L) {
            this.x = $$0;
            gdz $$1 = this.k.T();
            if ($$1 != null && !$$1.ab()) {
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
         eli $$1 = erz.a(this.k.g());
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

            try (eli $$6 = new eli(64, 64, false)) {
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
         bjt $$0 = this.k.am();
         boolean $$1 = $$0 instanceof ccx && !this.k.m.Z;
         if ($$1 && !((ccx)$$0).fT().e) {
            ckj $$2 = ((bkj)$$0).eS();
            eid $$3 = this.k.v;
            if ($$3 != null && $$3.c() == eid.a.b) {
               ht $$4 = ((eib)$$3).a();
               dgb $$5 = this.k.r.a_($$4);
               if (this.k.q.l() == cqw.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  dgf $$6 = new dgf(this.k.r, $$4, false);
                  io<cua> $$7 = this.k.r.H_().d(jz.e);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, emh $$2) {
      this.A.a($$0);
      if (this.k.am() == null) {
         this.k.a(this.k.s);
      }

      this.a($$0);
      this.k.aG().a("center");
      boolean $$3 = this.az();
      this.k.aG().b("camera");
      eqz $$4 = this.O;
      this.n = (float)(this.k.m.az() * 16);
      emh $$5 = new emh();
      double $$6 = this.a($$4, $$0, true);
      $$5.a(this.a($$6));
      this.a($$5, $$0);
      if (this.k.m.X().c()) {
         this.b($$5, $$0);
      }

      float $$7 = this.k.m.af().c().floatValue();
      float $$8 = asy.i($$0, this.k.s.cw, this.k.s.cv) * $$7 * $$7;
      if ($$8 > 0.0F) {
         int $$9 = this.k.s.a(bji.i) ? 7 : 20;
         float $$10 = 5.0F / ($$8 * $$8 + 5.0F) - $$8 * 0.04F;
         $$10 *= $$10;
         a $$11 = a.of(new Vector3f(0.0F, asy.g / 2.0F, asy.g / 2.0F));
         $$5.a($$11.rotationDegrees(((float)this.q + $$0) * (float)$$9));
         $$5.b(1.0F / $$10, 1.0F, 1.0F);
         float $$12 = -((float)this.q + $$0) * (float)$$9;
         $$5.a($$11.rotationDegrees($$12));
      }

      Matrix4f $$13 = $$5.c().a();
      this.a($$13);
      $$4.a(this.k.r, (bjt)(this.k.am() == null ? this.k.s : this.k.am()), !this.k.m.aw().a(), this.k.m.aw().b(), $$0);
      $$2.a(a.b.rotationDegrees($$4.d()));
      $$2.a(a.d.rotationDegrees($$4.e() + 180.0F));
      Matrix3f $$14 = new Matrix3f($$2.c().b()).invert();
      RenderSystem.setInverseViewRotationMatrix($$14);
      this.k.f.a($$2, $$4.b(), this.a(Math.max($$6, (double)this.k.m.ad().c().intValue())));
      this.k.f.a($$2, $$0, $$1, $$3, $$4, this, this.A, $$13);
      this.k.aG().b("hand");
      if (this.v) {
         RenderSystem.clear(256, ero.a);
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

   public eta j() {
      return this.o;
   }

   public void a(ckj $$0) {
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
         emh $$11 = new emh();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * asy.e(asy.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * asy.e(asy.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * asy.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * asy.e(asy.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * asy.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * asy.b($$4 * 8.0F)));
         fpb.a $$13 = this.p.b();
         this.k.aq().a(this.G, ckg.i, 15728880, fzr.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(esy $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = asy.i($$1, 2.0F, 1.0F);
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

   public ero k() {
      return this.k;
   }

   public float b(float $$0) {
      return asy.i($$0, this.u, this.t);
   }

   public float l() {
      return this.n;
   }

   public eqz m() {
      return this.O;
   }

   public fpa n() {
      return this.A;
   }

   public fzr o() {
      return this.B;
   }

   @Nullable
   public static fpo p() {
      return Q;
   }

   @Nullable
   public static fpo q() {
      return R;
   }

   @Nullable
   public static fpo r() {
      return S;
   }

   @Nullable
   public static fpo s() {
      return T;
   }

   @Nullable
   public static fpo t() {
      return U;
   }

   @Nullable
   public static fpo u() {
      return V;
   }

   @Nullable
   public static fpo v() {
      return W;
   }

   @Nullable
   public static fpo w() {
      return X;
   }

   @Nullable
   public static fpo x() {
      return Y;
   }

   @Nullable
   public static fpo y() {
      return Z;
   }

   @Nullable
   public static fpo z() {
      return aa;
   }

   @Nullable
   public static fpo A() {
      return ab;
   }

   @Nullable
   public static fpo B() {
      return ac;
   }

   @Nullable
   public static fpo C() {
      return ad;
   }

   @Nullable
   public static fpo D() {
      return ae;
   }

   @Nullable
   public static fpo E() {
      return af;
   }

   @Nullable
   public static fpo F() {
      return ag;
   }

   @Nullable
   public static fpo G() {
      return ah;
   }

   @Nullable
   public static fpo H() {
      return ai;
   }

   @Nullable
   public static fpo I() {
      return aj;
   }

   @Nullable
   public static fpo J() {
      return ak;
   }

   @Nullable
   public static fpo K() {
      return al;
   }

   @Nullable
   public static fpo L() {
      return am;
   }

   @Nullable
   public static fpo M() {
      return an;
   }

   @Nullable
   public static fpo N() {
      return ao;
   }

   @Nullable
   public static fpo O() {
      return ap;
   }

   @Nullable
   public static fpo P() {
      return aq;
   }

   @Nullable
   public static fpo Q() {
      return ar;
   }

   @Nullable
   public static fpo R() {
      return as;
   }

   @Nullable
   public static fpo S() {
      return at;
   }

   @Nullable
   public static fpo T() {
      return au;
   }

   @Nullable
   public static fpo U() {
      return av;
   }

   @Nullable
   public static fpo V() {
      return aw;
   }

   @Nullable
   public static fpo W() {
      return ax;
   }

   @Nullable
   public static fpo X() {
      return ay;
   }

   @Nullable
   public static fpo Y() {
      return az;
   }

   @Nullable
   public static fpo Z() {
      return aA;
   }

   @Nullable
   public static fpo aa() {
      return aB;
   }

   @Nullable
   public static fpo ab() {
      return aC;
   }

   @Nullable
   public static fpo ac() {
      return aD;
   }

   @Nullable
   public static fpo ad() {
      return aE;
   }

   @Nullable
   public static fpo ae() {
      return aF;
   }

   @Nullable
   public static fpo af() {
      return aG;
   }

   @Nullable
   public static fpo ag() {
      return aH;
   }

   @Nullable
   public static fpo ah() {
      return aI;
   }

   @Nullable
   public static fpo ai() {
      return aJ;
   }

   @Nullable
   public static fpo aj() {
      return aK;
   }

   @Nullable
   public static fpo ak() {
      return aL;
   }

   @Nullable
   public static fpo al() {
      return aM;
   }

   @Nullable
   public static fpo am() {
      return aN;
   }

   @Nullable
   public static fpo an() {
      return aO;
   }

   @Nullable
   public static fpo ao() {
      return aP;
   }

   @Nullable
   public static fpo ap() {
      return aQ;
   }

   @Nullable
   public static fpo aq() {
      return aR;
   }

   @Nullable
   public static fpo ar() {
      return aS;
   }

   @Nullable
   public static fpo as() {
      return aT;
   }

   @Nullable
   public static fpo at() {
      return aU;
   }

   @Nullable
   public static fpo au() {
      return aV;
   }

   @Nullable
   public static fpo av() {
      return aW;
   }

   public static record a(aow a, Map<afw, aor> b) implements aow {
      @Override
      public Optional<aor> getResource(afw $$0) {
         aor $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
