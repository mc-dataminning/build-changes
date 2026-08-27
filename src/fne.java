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

public class fne implements AutoCloseable {
   private static final aer f = new aer("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   final eqm j;
   private final anm k;
   private final aru l = aru.a();
   private float m;
   public final fnh b;
   private final ery n;
   private final fnr o;
   private int p;
   private float q;
   private float r;
   private float s;
   private float t;
   private boolean u = true;
   private boolean v = true;
   private long w;
   private boolean x;
   private long y = ac.b();
   private final fnk z;
   private final fyc A = new fyc();
   private boolean B;
   private float C = 1.0F;
   private float D;
   private float E;
   public static final int c = 40;
   @Nullable
   private ciy F;
   private int G;
   private float H;
   private float I;
   @Nullable
   fno J;
   static final aer[] K = new aer[]{
      new aer("shaders/post/notch.json"),
      new aer("shaders/post/fxaa.json"),
      new aer("shaders/post/art.json"),
      new aer("shaders/post/bumpy.json"),
      new aer("shaders/post/blobs2.json"),
      new aer("shaders/post/pencil.json"),
      new aer("shaders/post/color_convolve.json"),
      new aer("shaders/post/deconverge.json"),
      new aer("shaders/post/flip.json"),
      new aer("shaders/post/invert.json"),
      new aer("shaders/post/ntsc.json"),
      new aer("shaders/post/outline.json"),
      new aer("shaders/post/phosphor.json"),
      new aer("shaders/post/scan_pincushion.json"),
      new aer("shaders/post/sobel.json"),
      new aer("shaders/post/bits.json"),
      new aer("shaders/post/desaturate.json"),
      new aer("shaders/post/green.json"),
      new aer("shaders/post/blur.json"),
      new aer("shaders/post/wobble.json"),
      new aer("shaders/post/blobs.json"),
      new aer("shaders/post/antialias.json"),
      new aer("shaders/post/creeper.json"),
      new aer("shaders/post/spider.json")
   };
   public static final int d = K.length;
   int L = d;
   private boolean M;
   private final epx N = new epx();
   public fny e;
   private final Map<String, fny> O = Maps.newHashMap();
   @Nullable
   private static fny P;
   @Nullable
   private static fny Q;
   @Nullable
   private static fny R;
   @Nullable
   private static fny S;
   @Nullable
   private static fny T;
   @Nullable
   private static fny U;
   @Nullable
   private static fny V;
   @Nullable
   private static fny W;
   @Nullable
   private static fny X;
   @Nullable
   private static fny Y;
   @Nullable
   private static fny Z;
   @Nullable
   private static fny aa;
   @Nullable
   private static fny ab;
   @Nullable
   private static fny ac;
   @Nullable
   private static fny ad;
   @Nullable
   private static fny ae;
   @Nullable
   private static fny af;
   @Nullable
   private static fny ag;
   @Nullable
   private static fny ah;
   @Nullable
   private static fny ai;
   @Nullable
   private static fny aj;
   @Nullable
   private static fny ak;
   @Nullable
   private static fny al;
   @Nullable
   private static fny am;
   @Nullable
   private static fny an;
   @Nullable
   private static fny ao;
   @Nullable
   private static fny ap;
   @Nullable
   private static fny aq;
   @Nullable
   private static fny ar;
   @Nullable
   private static fny as;
   @Nullable
   private static fny at;
   @Nullable
   private static fny au;
   @Nullable
   private static fny av;
   @Nullable
   private static fny aw;
   @Nullable
   private static fny ax;
   @Nullable
   private static fny ay;
   @Nullable
   private static fny az;
   @Nullable
   private static fny aA;
   @Nullable
   private static fny aB;
   @Nullable
   private static fny aC;
   @Nullable
   private static fny aD;
   @Nullable
   private static fny aE;
   @Nullable
   private static fny aF;
   @Nullable
   private static fny aG;
   @Nullable
   private static fny aH;
   @Nullable
   private static fny aI;
   @Nullable
   private static fny aJ;
   @Nullable
   private static fny aK;
   @Nullable
   private static fny aL;
   @Nullable
   private static fny aM;
   @Nullable
   private static fny aN;
   @Nullable
   private static fny aO;
   @Nullable
   private static fny aP;
   @Nullable
   private static fny aQ;
   @Nullable
   private static fny aR;
   @Nullable
   private static fny aS;
   @Nullable
   private static fny aT;
   @Nullable
   private static fny aU;
   @Nullable
   private static fny aV;

   public fne(eqm $$0, fnh $$1, anm $$2, fnr $$3) {
      this.j = $$0;
      this.k = $$2;
      this.b = $$1;
      this.n = new ery($$0.Y());
      this.z = new fnk(this, $$0);
      this.o = $$3;
      this.J = null;
   }

   @Override
   public void close() {
      this.z.close();
      this.n.close();
      this.A.close();
      this.b();
      this.aw();
      if (this.e != null) {
         this.e.close();
      }
   }

   public void a(boolean $$0) {
      this.u = $$0;
   }

   public void b(boolean $$0) {
      this.v = $$0;
   }

   public void c(boolean $$0) {
      this.B = $$0;
   }

   public boolean a() {
      return this.B;
   }

   public void b() {
      if (this.J != null) {
         this.J.close();
      }

      this.J = null;
      this.L = d;
   }

   public void c() {
      this.M = !this.M;
   }

   public void a(@Nullable bii $$0) {
      if (this.J != null) {
         this.J.close();
      }

      this.J = null;
      if ($$0 instanceof byn) {
         this.a(new aer("shaders/post/creeper.json"));
      } else if ($$0 instanceof bzm) {
         this.a(new aer("shaders/post/spider.json"));
      } else if ($$0 instanceof byr) {
         this.a(new aer("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.j.am() instanceof cbn) {
         if (this.J != null) {
            this.J.close();
         }

         this.L = (this.L + 1) % (K.length + 1);
         if (this.L == d) {
            this.J = null;
         } else {
            this.a(K[this.L]);
         }
      }
   }

   void a(aer $$0) {
      if (this.J != null) {
         this.J.close();
      }

      try {
         this.J = new fno(this.j.Y(), this.k, this.j.g(), $$0);
         this.J.a(this.j.aN().k(), this.j.aN().l());
         this.M = true;
      } catch (IOException var3) {
         g.warn("Failed to load shader: {}", $$0, var3);
         this.L = d;
         this.M = false;
      } catch (JsonSyntaxException var4) {
         g.warn("Failed to parse shader: {}", $$0, var4);
         this.L = d;
         this.M = false;
      }
   }

   public ang e() {
      return new anr<fne.a>() {
         protected fne.a a(anm $$0, bdh $$1) {
            Map<aer, ank> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(eku.a.b.b()) || $$1x.endsWith(eku.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<aer, ank> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new ank($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fne.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fne.a($$0, $$3);
         }

         protected void a(fne.a $$0, anm $$1, bdh $$2) {
            fne.this.b($$0);
            if (fne.this.J != null) {
               fne.this.J.close();
            }

            fne.this.J = null;
            if (fne.this.L == fne.d) {
               fne.this.a(fne.this.j.am());
            } else {
               fne.this.a(fne.K[fne.this.L]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(anp $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new fny($$0, "blit_screen", ele.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aS = this.a($$0, "rendertype_gui", ele.n);
         aT = this.a($$0, "rendertype_gui_overlay", ele.n);
         P = this.a($$0, "position", ele.m);
         Q = this.a($$0, "position_color", ele.n);
         R = this.a($$0, "position_color_tex", ele.r);
         S = this.a($$0, "position_tex", ele.q);
         T = this.a($$0, "position_tex_color", ele.s);
         aG = this.a($$0, "rendertype_text", ele.t);
      }
   }

   private fny a(anp $$0, String $$1, ell $$2) {
      try {
         fny $$3 = new fny($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(anp $$0) {
      RenderSystem.assertOnRenderThread();
      List<eku> $$1 = Lists.newArrayList();
      $$1.addAll(eku.a.b.c().values());
      $$1.addAll(eku.a.a.c().values());
      $$1.forEach(eku::a);
      List<Pair<fny, Consumer<fny>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new fny($$0, "particle", ele.l), (Consumer<fny>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new fny($$0, "position", ele.m), (Consumer<fny>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new fny($$0, "position_color", ele.n), (Consumer<fny>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new fny($$0, "position_color_lightmap", ele.p), (Consumer<fny>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new fny($$0, "position_color_tex", ele.r), (Consumer<fny>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new fny($$0, "position_color_tex_lightmap", ele.t), (Consumer<fny>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new fny($$0, "position_tex", ele.q), (Consumer<fny>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new fny($$0, "position_tex_color", ele.s), (Consumer<fny>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new fny($$0, "position_tex_color_normal", ele.v), (Consumer<fny>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new fny($$0, "position_tex_lightmap_color", ele.u), (Consumer<fny>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_solid", ele.j), (Consumer<fny>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_cutout_mipped", ele.j), (Consumer<fny>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_cutout", ele.j), (Consumer<fny>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_translucent", ele.j), (Consumer<fny>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_translucent_moving_block", ele.j), (Consumer<fny>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_translucent_no_crumbling", ele.j), (Consumer<fny>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_armor_cutout_no_cull", ele.k), (Consumer<fny>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_entity_solid", ele.k), (Consumer<fny>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_entity_cutout", ele.k), (Consumer<fny>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_entity_cutout_no_cull", ele.k), (Consumer<fny>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_entity_cutout_no_cull_z_offset", ele.k), (Consumer<fny>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_item_entity_translucent_cull", ele.k), (Consumer<fny>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_entity_translucent_cull", ele.k), (Consumer<fny>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_entity_translucent", ele.k), (Consumer<fny>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_entity_translucent_emissive", ele.k), (Consumer<fny>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_entity_smooth_cutout", ele.k), (Consumer<fny>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_beacon_beam", ele.j), (Consumer<fny>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_entity_decal", ele.k), (Consumer<fny>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_entity_no_outline", ele.k), (Consumer<fny>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_entity_shadow", ele.k), (Consumer<fny>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_entity_alpha", ele.k), (Consumer<fny>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_eyes", ele.k), (Consumer<fny>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_energy_swirl", ele.k), (Consumer<fny>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_leash", ele.p), (Consumer<fny>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_water_mask", ele.m), (Consumer<fny>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_outline", ele.r), (Consumer<fny>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_armor_glint", ele.q), (Consumer<fny>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_armor_entity_glint", ele.q), (Consumer<fny>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_glint_translucent", ele.q), (Consumer<fny>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_glint", ele.q), (Consumer<fny>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_glint_direct", ele.q), (Consumer<fny>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_entity_glint", ele.q), (Consumer<fny>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_entity_glint_direct", ele.q), (Consumer<fny>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_text", ele.t), (Consumer<fny>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_text_background", ele.p), (Consumer<fny>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_text_intensity", ele.t), (Consumer<fny>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_text_see_through", ele.t), (Consumer<fny>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_text_background_see_through", ele.p), (Consumer<fny>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_text_intensity_see_through", ele.t), (Consumer<fny>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_lightning", ele.n), (Consumer<fny>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_tripwire", ele.j), (Consumer<fny>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_end_portal", ele.m), (Consumer<fny>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_end_gateway", ele.m), (Consumer<fny>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_lines", ele.o), (Consumer<fny>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_crumbling", ele.j), (Consumer<fny>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_gui", ele.n), (Consumer<fny>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_gui_overlay", ele.n), (Consumer<fny>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_gui_text_highlight", ele.n), (Consumer<fny>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new fny($$0, "rendertype_gui_ghost_recipe_overlay", ele.n), (Consumer<fny>)$$0x -> aV = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((fny)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.aw();
      $$2.forEach($$0x -> {
         fny $$1x = (fny)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void aw() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(fny::close);
      this.O.clear();
   }

   @Nullable
   public fny a(@Nullable String $$0) {
      return $$0 == null ? null : this.O.get($$0);
   }

   public void f() {
      this.ax();
      this.z.a();
      if (this.j.am() == null) {
         this.j.a(this.j.v);
      }

      this.N.a();
      this.p++;
      this.b.a();
      this.j.f.a(this.N);
      this.t = this.s;
      if (this.j.l.j().c()) {
         this.s += 0.05F;
         if (this.s > 1.0F) {
            this.s = 1.0F;
         }
      } else if (this.s > 0.0F) {
         this.s -= 0.0125F;
      }

      if (this.G > 0) {
         this.G--;
         if (this.G == 0) {
            this.F = null;
         }
      }
   }

   @Nullable
   public fno g() {
      return this.J;
   }

   public void a(int $$0, int $$1) {
      if (this.J != null) {
         this.J.a($$0, $$1);
      }

      this.j.f.a($$0, $$1);
   }

   public void a(float $$0) {
      bii $$1 = this.j.am();
      if ($$1 != null) {
         if (this.j.u != null) {
            this.j.aH().a("pick");
            this.j.x = null;
            double $$2 = (double)this.j.t.c();
            this.j.y = $$1.a($$2, $$0, false);
            ehe $$3 = $$1.j($$0);
            boolean $$4 = false;
            int $$5 = 3;
            double $$6 = $$2;
            if (this.j.t.h()) {
               $$6 = 6.0;
               $$2 = $$6;
            } else {
               if ($$2 > 3.0) {
                  $$4 = true;
               }

               $$2 = $$2;
            }

            $$6 *= $$6;
            if (this.j.y != null) {
               $$6 = this.j.y.e().g($$3);
            }

            ehe $$7 = $$1.f(1.0F);
            ehe $$8 = $$3.b($$7.c * $$2, $$7.d * $$2, $$7.e * $$2);
            float $$9 = 1.0F;
            egz $$10 = $$1.cG().b($$7.a($$2)).c(1.0, 1.0, 1.0);
            ehb $$11 = ccg.a($$1, $$3, $$8, $$10, $$0x -> !$$0x.G_() && $$0x.br(), $$6);
            if ($$11 != null) {
               bii $$12 = $$11.a();
               ehe $$13 = $$11.e();
               double $$14 = $$3.g($$13);
               if ($$4 && $$14 > 9.0) {
                  this.j.y = eha.a($$13, ha.a($$7.c, $$7.d, $$7.e), gu.a($$13));
               } else if ($$14 < $$6 || this.j.y == null) {
                  this.j.y = $$11;
                  if ($$12 instanceof biy || $$12 instanceof bxz) {
                     this.j.x = $$12;
                  }
               }
            }

            this.j.aH().c();
         }
      }
   }

   private void ax() {
      float $$0 = 1.0F;
      if (this.j.am() instanceof fmk $$1) {
         $$0 = $$1.c();
      }

      this.r = this.q;
      this.q = this.q + ($$0 - this.q) * 0.5F;
      if (this.q > 1.5F) {
         this.q = 1.5F;
      }

      if (this.q < 0.1F) {
         this.q = 0.1F;
      }
   }

   private double a(epx $$0, float $$1, boolean $$2) {
      if (this.B) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.j.m.ac().c().intValue();
            $$3 *= (double)arp.i($$1, this.r, this.q);
         }

         if ($$0.g() instanceof biy && ((biy)$$0.g()).eu()) {
            float $$4 = Math.min((float)((biy)$$0.g()).aM + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         eaf $$5 = $$0.k();
         if ($$5 == eaf.a || $$5 == eaf.b) {
            $$3 *= arp.d(this.j.m.af().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(elg $$0, float $$1) {
      if (this.j.am() instanceof biy $$2) {
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.eu()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = arp.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eD();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.j.m.aj().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(elg $$0, float $$1) {
      if (this.j.am() instanceof cbn) {
         cbn $$2 = (cbn)this.j.am();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = arp.i($$1, $$2.bT, $$2.bU);
         $$0.a(arp.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(arp.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(arp.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(arp.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.C = $$0;
      this.D = $$1;
      this.E = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new elg());
      this.C = 1.0F;
   }

   private void a(elg $$0, epx $$1, float $$2) {
      if (!this.B) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.j.m.W().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.j.am() instanceof biy && ((biy)this.j.am()).fB();
         if (this.j.m.au().a() && !$$3 && !this.j.m.Z && this.j.t.l() != cpj.d) {
            this.z.c();
            this.b.a($$2, $$0, this.o.b(), this.j.v, this.j.ao().a(this.j.v, $$2));
            this.z.b();
         }

         $$0.b();
         if (this.j.m.au().a() && !$$3) {
            fnv.a(this.j, $$0);
            this.a($$0, $$2);
         }

         if (this.j.m.W().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, elo.a);
   }

   public Matrix4f a(double $$0) {
      elg $$1 = new elg();
      $$1.c().a().identity();
      if (this.C != 1.0F) {
         $$1.a(this.D, -this.E, 0.0F);
         $$1.b(this.C, this.C, 1.0F);
      }

      $$1.c()
         .a()
         .mul(new Matrix4f().setPerspective((float)($$0 * (float) (Math.PI / 180.0)), (float)this.j.aN().k() / (float)this.j.aN().l(), 0.05F, this.h()));
      return $$1.c().a();
   }

   public float h() {
      return this.m * 4.0F;
   }

   public static float a(biy $$0, float $$1) {
      bhv $$2 = $$0.b(bhx.p);
      return !$$2.a(200) ? 1.0F : 0.7F + arp.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(float $$0, long $$1, boolean $$2) {
      if (!this.j.aB() && this.j.m.n && (!this.j.m.U().c() || !this.j.n.d())) {
         if (ac.b() - this.y > 500L) {
            this.j.c(false);
         }
      } else {
         this.y = ac.b();
      }

      if (!this.j.A) {
         boolean $$3 = this.j.c();
         int $$4 = (int)(this.j.n.e() * (double)this.j.aN().o() / (double)this.j.aN().m());
         int $$5 = (int)(this.j.n.f() * (double)this.j.aN().p() / (double)this.j.aN().n());
         RenderSystem.viewport(0, 0, this.j.aN().k(), this.j.aN().l());
         if ($$3 && $$2 && this.j.u != null) {
            this.j.aH().a("level");
            this.a($$0, $$1, new elg());
            this.ay();
            this.j.f.b();
            if (this.J != null && this.M) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.J.a($$0);
            }

            this.j.g().a(true);
         }

         ekk $$6 = this.j.aN();
         RenderSystem.clear(256, eqm.a);
         Matrix4f $$7 = new Matrix4f().setOrtho(0.0F, (float)((double)$$6.k() / $$6.s()), (float)((double)$$6.l() / $$6.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$7, elo.b);
         elg $$8 = RenderSystem.getModelViewStack();
         $$8.a();
         $$8.e();
         $$8.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         ekc.b();
         erw $$9 = new erw(this.j, this.o.b());
         if ($$3 && $$2 && this.j.u != null) {
            this.j.aH().b("gui");
            if (this.j.v != null) {
               float $$10 = arp.i($$0, this.j.v.cu, this.j.v.ct);
               float $$11 = this.j.m.ae().c().floatValue();
               if ($$10 > 0.0F && this.j.v.a(bhx.i) && $$11 < 1.0F) {
                  this.a($$9, $$10 * (1.0F - $$11));
               }
            }

            if (!this.j.m.Z || this.j.B != null) {
               this.a(this.j.aN().o(), this.j.aN().p(), $$0);
               this.j.l.a($$9, $$0);
               RenderSystem.clear(256, eqm.a);
            }

            this.j.aH().c();
         }

         if (this.j.aK() != null) {
            try {
               this.j.aK().a($$9, $$4, $$5, this.j.aw());
            } catch (Throwable var17) {
               o $$13 = o.a(var17, "Rendering overlay");
               p $$14 = $$13.a("Overlay render details");
               $$14.a("Overlay name", () -> this.j.aK().getClass().getCanonicalName());
               throw new y($$13);
            }
         } else if ($$3 && this.j.B != null) {
            try {
               this.j.B.c($$9, $$4, $$5, this.j.aw());
            } catch (Throwable var16) {
               o $$16 = o.a(var16, "Rendering screen");
               p $$17 = $$16.a("Screen render details");
               $$17.a("Screen name", () -> this.j.B.getClass().getCanonicalName());
               $$17.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", $$4, $$5, this.j.n.e(), this.j.n.f()));
               $$17.a(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.j.aN().o(),
                        this.j.aN().p(),
                        this.j.aN().k(),
                        this.j.aN().l(),
                        this.j.aN().s()
                     )
               );
               throw new y($$16);
            }

            try {
               if (this.j.B != null) {
                  this.j.B.y();
               }
            } catch (Throwable var15) {
               o $$19 = o.a(var15, "Narrating screen");
               p $$20 = $$19.a("Screen details");
               $$20.a("Screen name", () -> this.j.B.getClass().getCanonicalName());
               throw new y($$19);
            }
         }

         if ($$3) {
            this.j.aH().a("toasts");
            this.j.az().a($$9);
            this.j.aH().c();
         }

         $$9.e();
         $$8.b();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void ay() {
      if (!this.x && this.j.R()) {
         long $$0 = ac.b();
         if ($$0 - this.w >= 1000L) {
            this.w = $$0;
            gck $$1 = this.j.T();
            if ($$1 != null && !$$1.ab()) {
               $$1.y().ifPresent($$0x -> {
                  if (Files.isRegularFile($$0x)) {
                     this.x = true;
                  } else {
                     this.a($$0x);
                  }
               });
            }
         }
      }
   }

   private void a(Path $$0) {
      if (this.j.f.k() > 10 && this.j.f.q()) {
         ekh $$1 = eqx.a(this.j.g());
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

            try (ekh $$6 = new ekh(64, 64, false)) {
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
      if (!this.v) {
         return false;
      } else {
         bii $$0 = this.j.am();
         boolean $$1 = $$0 instanceof cbn && !this.j.m.Z;
         if ($$1 && !((cbn)$$0).fR().e) {
            ciy $$2 = ((biy)$$0).eR();
            ehc $$3 = this.j.y;
            if ($$3 != null && $$3.c() == ehc.a.b) {
               gu $$4 = ((eha)$$3).a();
               dfa $$5 = this.j.u.a_($$4);
               if (this.j.t.l() == cpj.d) {
                  $$1 = $$5.b(this.j.u, $$4) != null;
               } else {
                  dfe $$6 = new dfe(this.j.u, $$4, false);
                  hr<csm> $$7 = this.j.u.B_().d(jc.e);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, elg $$2) {
      this.z.a($$0);
      if (this.j.am() == null) {
         this.j.a(this.j.v);
      }

      this.a($$0);
      this.j.aH().a("center");
      boolean $$3 = this.az();
      this.j.aH().b("camera");
      epx $$4 = this.N;
      this.m = (float)(this.j.m.ax() * 16);
      elg $$5 = new elg();
      double $$6 = this.a($$4, $$0, true);
      $$5.a(this.a($$6));
      this.a($$5, $$0);
      if (this.j.m.W().c()) {
         this.b($$5, $$0);
      }

      float $$7 = this.j.m.ae().c().floatValue();
      float $$8 = arp.i($$0, this.j.v.cu, this.j.v.ct) * $$7 * $$7;
      if ($$8 > 0.0F) {
         int $$9 = this.j.v.a(bhx.i) ? 7 : 20;
         float $$10 = 5.0F / ($$8 * $$8 + 5.0F) - $$8 * 0.04F;
         $$10 *= $$10;
         a $$11 = a.of(new Vector3f(0.0F, arp.g / 2.0F, arp.g / 2.0F));
         $$5.a($$11.rotationDegrees(((float)this.p + $$0) * (float)$$9));
         $$5.b(1.0F / $$10, 1.0F, 1.0F);
         float $$12 = -((float)this.p + $$0) * (float)$$9;
         $$5.a($$11.rotationDegrees($$12));
      }

      Matrix4f $$13 = $$5.c().a();
      this.a($$13);
      $$4.a(this.j.u, (bii)(this.j.am() == null ? this.j.v : this.j.am()), !this.j.m.au().a(), this.j.m.au().b(), $$0);
      $$2.a(a.b.rotationDegrees($$4.d()));
      $$2.a(a.d.rotationDegrees($$4.e() + 180.0F));
      Matrix3f $$14 = new Matrix3f($$2.c().b()).invert();
      RenderSystem.setInverseViewRotationMatrix($$14);
      this.j.f.a($$2, $$4.b(), this.a(Math.max($$6, (double)this.j.m.ac().c().intValue())));
      this.j.f.a($$2, $$0, $$1, $$3, $$4, this, this.z, $$13);
      this.j.aH().b("hand");
      if (this.u) {
         RenderSystem.clear(256, eqm.a);
         this.a($$2, $$4, $$0);
      }

      this.j.aH().c();
   }

   public void i() {
      this.F = null;
      this.n.a();
      this.N.o();
      this.x = false;
   }

   public ery j() {
      return this.n;
   }

   public void a(ciy $$0) {
      this.F = $$0;
      this.G = 40;
      this.H = this.l.i() * 2.0F - 1.0F;
      this.I = this.l.i() * 2.0F - 1.0F;
   }

   private void a(int $$0, int $$1, float $$2) {
      if (this.F != null && this.G > 0) {
         int $$3 = 40 - this.G;
         float $$4 = ((float)$$3 + $$2) / 40.0F;
         float $$5 = $$4 * $$4;
         float $$6 = $$4 * $$5;
         float $$7 = 10.25F * $$6 * $$5 - 24.95F * $$5 * $$5 + 25.5F * $$6 - 13.8F * $$5 + 4.0F * $$4;
         float $$8 = $$7 * (float) Math.PI;
         float $$9 = this.H * (float)($$0 / 4);
         float $$10 = this.I * (float)($$1 / 4);
         RenderSystem.enableDepthTest();
         RenderSystem.disableCull();
         elg $$11 = new elg();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * arp.e(arp.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * arp.e(arp.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * arp.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * arp.e(arp.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * arp.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * arp.b($$4 * 8.0F)));
         fnl.a $$13 = this.o.b();
         this.j.aq().a(this.F, civ.i, 15728880, fyc.d, $$11, $$13, this.j.u, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(erw $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = arp.i($$1, 2.0F, 1.0F);
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

   public eqm k() {
      return this.j;
   }

   public float b(float $$0) {
      return arp.i($$0, this.t, this.s);
   }

   public float l() {
      return this.m;
   }

   public epx m() {
      return this.N;
   }

   public fnk n() {
      return this.z;
   }

   public fyc o() {
      return this.A;
   }

   @Nullable
   public static fny p() {
      return P;
   }

   @Nullable
   public static fny q() {
      return Q;
   }

   @Nullable
   public static fny r() {
      return R;
   }

   @Nullable
   public static fny s() {
      return S;
   }

   @Nullable
   public static fny t() {
      return T;
   }

   @Nullable
   public static fny u() {
      return U;
   }

   @Nullable
   public static fny v() {
      return V;
   }

   @Nullable
   public static fny w() {
      return W;
   }

   @Nullable
   public static fny x() {
      return X;
   }

   @Nullable
   public static fny y() {
      return Y;
   }

   @Nullable
   public static fny z() {
      return Z;
   }

   @Nullable
   public static fny A() {
      return aa;
   }

   @Nullable
   public static fny B() {
      return ab;
   }

   @Nullable
   public static fny C() {
      return ac;
   }

   @Nullable
   public static fny D() {
      return ad;
   }

   @Nullable
   public static fny E() {
      return ae;
   }

   @Nullable
   public static fny F() {
      return af;
   }

   @Nullable
   public static fny G() {
      return ag;
   }

   @Nullable
   public static fny H() {
      return ah;
   }

   @Nullable
   public static fny I() {
      return ai;
   }

   @Nullable
   public static fny J() {
      return aj;
   }

   @Nullable
   public static fny K() {
      return ak;
   }

   @Nullable
   public static fny L() {
      return al;
   }

   @Nullable
   public static fny M() {
      return am;
   }

   @Nullable
   public static fny N() {
      return an;
   }

   @Nullable
   public static fny O() {
      return ao;
   }

   @Nullable
   public static fny P() {
      return ap;
   }

   @Nullable
   public static fny Q() {
      return aq;
   }

   @Nullable
   public static fny R() {
      return ar;
   }

   @Nullable
   public static fny S() {
      return as;
   }

   @Nullable
   public static fny T() {
      return at;
   }

   @Nullable
   public static fny U() {
      return au;
   }

   @Nullable
   public static fny V() {
      return av;
   }

   @Nullable
   public static fny W() {
      return aw;
   }

   @Nullable
   public static fny X() {
      return ax;
   }

   @Nullable
   public static fny Y() {
      return ay;
   }

   @Nullable
   public static fny Z() {
      return az;
   }

   @Nullable
   public static fny aa() {
      return aA;
   }

   @Nullable
   public static fny ab() {
      return aB;
   }

   @Nullable
   public static fny ac() {
      return aC;
   }

   @Nullable
   public static fny ad() {
      return aD;
   }

   @Nullable
   public static fny ae() {
      return aE;
   }

   @Nullable
   public static fny af() {
      return aF;
   }

   @Nullable
   public static fny ag() {
      return aG;
   }

   @Nullable
   public static fny ah() {
      return aH;
   }

   @Nullable
   public static fny ai() {
      return aI;
   }

   @Nullable
   public static fny aj() {
      return aJ;
   }

   @Nullable
   public static fny ak() {
      return aK;
   }

   @Nullable
   public static fny al() {
      return aL;
   }

   @Nullable
   public static fny am() {
      return aM;
   }

   @Nullable
   public static fny an() {
      return aN;
   }

   @Nullable
   public static fny ao() {
      return aO;
   }

   @Nullable
   public static fny ap() {
      return aP;
   }

   @Nullable
   public static fny aq() {
      return aQ;
   }

   @Nullable
   public static fny ar() {
      return aR;
   }

   @Nullable
   public static fny as() {
      return aS;
   }

   @Nullable
   public static fny at() {
      return aT;
   }

   @Nullable
   public static fny au() {
      return aU;
   }

   @Nullable
   public static fny av() {
      return aV;
   }

   public static record a(anp a, Map<aer, ank> b) implements anp {
      @Override
      public Optional<ank> getResource(aer $$0) {
         ank $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
