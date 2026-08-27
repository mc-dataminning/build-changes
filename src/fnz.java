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

public class fnz implements AutoCloseable {
   private static final aey f = new aey("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   final eqx j;
   private final anv k;
   private final ase l = ase.a();
   private float m;
   public final foc b;
   private final esj n;
   private final fom o;
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
   private final fof z;
   private final fyx A = new fyx();
   private boolean B;
   private float C = 1.0F;
   private float D;
   private float E;
   public static final int c = 40;
   @Nullable
   private cjh F;
   private int G;
   private float H;
   private float I;
   @Nullable
   foj J;
   static final aey[] K = new aey[]{
      new aey("shaders/post/notch.json"),
      new aey("shaders/post/fxaa.json"),
      new aey("shaders/post/art.json"),
      new aey("shaders/post/bumpy.json"),
      new aey("shaders/post/blobs2.json"),
      new aey("shaders/post/pencil.json"),
      new aey("shaders/post/color_convolve.json"),
      new aey("shaders/post/deconverge.json"),
      new aey("shaders/post/flip.json"),
      new aey("shaders/post/invert.json"),
      new aey("shaders/post/ntsc.json"),
      new aey("shaders/post/outline.json"),
      new aey("shaders/post/phosphor.json"),
      new aey("shaders/post/scan_pincushion.json"),
      new aey("shaders/post/sobel.json"),
      new aey("shaders/post/bits.json"),
      new aey("shaders/post/desaturate.json"),
      new aey("shaders/post/green.json"),
      new aey("shaders/post/blur.json"),
      new aey("shaders/post/wobble.json"),
      new aey("shaders/post/blobs.json"),
      new aey("shaders/post/antialias.json"),
      new aey("shaders/post/creeper.json"),
      new aey("shaders/post/spider.json")
   };
   public static final int d = K.length;
   int L = d;
   private boolean M;
   private final eqi N = new eqi();
   public fou e;
   private final Map<String, fou> O = Maps.newHashMap();
   @Nullable
   private static fou P;
   @Nullable
   private static fou Q;
   @Nullable
   private static fou R;
   @Nullable
   private static fou S;
   @Nullable
   private static fou T;
   @Nullable
   private static fou U;
   @Nullable
   private static fou V;
   @Nullable
   private static fou W;
   @Nullable
   private static fou X;
   @Nullable
   private static fou Y;
   @Nullable
   private static fou Z;
   @Nullable
   private static fou aa;
   @Nullable
   private static fou ab;
   @Nullable
   private static fou ac;
   @Nullable
   private static fou ad;
   @Nullable
   private static fou ae;
   @Nullable
   private static fou af;
   @Nullable
   private static fou ag;
   @Nullable
   private static fou ah;
   @Nullable
   private static fou ai;
   @Nullable
   private static fou aj;
   @Nullable
   private static fou ak;
   @Nullable
   private static fou al;
   @Nullable
   private static fou am;
   @Nullable
   private static fou an;
   @Nullable
   private static fou ao;
   @Nullable
   private static fou ap;
   @Nullable
   private static fou aq;
   @Nullable
   private static fou ar;
   @Nullable
   private static fou as;
   @Nullable
   private static fou at;
   @Nullable
   private static fou au;
   @Nullable
   private static fou av;
   @Nullable
   private static fou aw;
   @Nullable
   private static fou ax;
   @Nullable
   private static fou ay;
   @Nullable
   private static fou az;
   @Nullable
   private static fou aA;
   @Nullable
   private static fou aB;
   @Nullable
   private static fou aC;
   @Nullable
   private static fou aD;
   @Nullable
   private static fou aE;
   @Nullable
   private static fou aF;
   @Nullable
   private static fou aG;
   @Nullable
   private static fou aH;
   @Nullable
   private static fou aI;
   @Nullable
   private static fou aJ;
   @Nullable
   private static fou aK;
   @Nullable
   private static fou aL;
   @Nullable
   private static fou aM;
   @Nullable
   private static fou aN;
   @Nullable
   private static fou aO;
   @Nullable
   private static fou aP;
   @Nullable
   private static fou aQ;
   @Nullable
   private static fou aR;
   @Nullable
   private static fou aS;
   @Nullable
   private static fou aT;
   @Nullable
   private static fou aU;
   @Nullable
   private static fou aV;

   public fnz(eqx $$0, foc $$1, anv $$2, fom $$3) {
      this.j = $$0;
      this.k = $$2;
      this.b = $$1;
      this.n = new esj($$0.Y());
      this.z = new fof(this, $$0);
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

   public void a(@Nullable bis $$0) {
      if (this.J != null) {
         this.J.close();
      }

      this.J = null;
      if ($$0 instanceof byw) {
         this.a(new aey("shaders/post/creeper.json"));
      } else if ($$0 instanceof bzv) {
         this.a(new aey("shaders/post/spider.json"));
      } else if ($$0 instanceof bza) {
         this.a(new aey("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.j.am() instanceof cbw) {
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

   void a(aey $$0) {
      if (this.J != null) {
         this.J.close();
      }

      try {
         this.J = new foj(this.j.Y(), this.k, this.j.g(), $$0);
         this.J.a(this.j.aM().k(), this.j.aM().l());
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

   public anp e() {
      return new aoa<fnz.a>() {
         protected fnz.a a(anv $$0, bdr $$1) {
            Map<aey, ant> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(elf.a.b.b()) || $$1x.endsWith(elf.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<aey, ant> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new ant($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fnz.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fnz.a($$0, $$3);
         }

         protected void a(fnz.a $$0, anv $$1, bdr $$2) {
            fnz.this.b($$0);
            if (fnz.this.J != null) {
               fnz.this.J.close();
            }

            fnz.this.J = null;
            if (fnz.this.L == fnz.d) {
               fnz.this.a(fnz.this.j.am());
            } else {
               fnz.this.a(fnz.K[fnz.this.L]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(any $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new fou($$0, "blit_screen", elp.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aS = this.a($$0, "rendertype_gui", elp.n);
         aT = this.a($$0, "rendertype_gui_overlay", elp.n);
         P = this.a($$0, "position", elp.m);
         Q = this.a($$0, "position_color", elp.n);
         R = this.a($$0, "position_color_tex", elp.r);
         S = this.a($$0, "position_tex", elp.q);
         T = this.a($$0, "position_tex_color", elp.s);
         aG = this.a($$0, "rendertype_text", elp.t);
      }
   }

   private fou a(any $$0, String $$1, elw $$2) {
      try {
         fou $$3 = new fou($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(any $$0) {
      RenderSystem.assertOnRenderThread();
      List<elf> $$1 = Lists.newArrayList();
      $$1.addAll(elf.a.b.c().values());
      $$1.addAll(elf.a.a.c().values());
      $$1.forEach(elf::a);
      List<Pair<fou, Consumer<fou>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new fou($$0, "particle", elp.l), (Consumer<fou>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new fou($$0, "position", elp.m), (Consumer<fou>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new fou($$0, "position_color", elp.n), (Consumer<fou>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new fou($$0, "position_color_lightmap", elp.p), (Consumer<fou>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new fou($$0, "position_color_tex", elp.r), (Consumer<fou>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new fou($$0, "position_color_tex_lightmap", elp.t), (Consumer<fou>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new fou($$0, "position_tex", elp.q), (Consumer<fou>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new fou($$0, "position_tex_color", elp.s), (Consumer<fou>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new fou($$0, "position_tex_color_normal", elp.v), (Consumer<fou>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new fou($$0, "position_tex_lightmap_color", elp.u), (Consumer<fou>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_solid", elp.j), (Consumer<fou>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_cutout_mipped", elp.j), (Consumer<fou>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_cutout", elp.j), (Consumer<fou>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_translucent", elp.j), (Consumer<fou>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_translucent_moving_block", elp.j), (Consumer<fou>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_translucent_no_crumbling", elp.j), (Consumer<fou>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_armor_cutout_no_cull", elp.k), (Consumer<fou>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_entity_solid", elp.k), (Consumer<fou>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_entity_cutout", elp.k), (Consumer<fou>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_entity_cutout_no_cull", elp.k), (Consumer<fou>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_entity_cutout_no_cull_z_offset", elp.k), (Consumer<fou>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_item_entity_translucent_cull", elp.k), (Consumer<fou>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_entity_translucent_cull", elp.k), (Consumer<fou>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_entity_translucent", elp.k), (Consumer<fou>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_entity_translucent_emissive", elp.k), (Consumer<fou>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_entity_smooth_cutout", elp.k), (Consumer<fou>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_beacon_beam", elp.j), (Consumer<fou>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_entity_decal", elp.k), (Consumer<fou>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_entity_no_outline", elp.k), (Consumer<fou>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_entity_shadow", elp.k), (Consumer<fou>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_entity_alpha", elp.k), (Consumer<fou>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_eyes", elp.k), (Consumer<fou>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_energy_swirl", elp.k), (Consumer<fou>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_leash", elp.p), (Consumer<fou>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_water_mask", elp.m), (Consumer<fou>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_outline", elp.r), (Consumer<fou>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_armor_glint", elp.q), (Consumer<fou>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_armor_entity_glint", elp.q), (Consumer<fou>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_glint_translucent", elp.q), (Consumer<fou>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_glint", elp.q), (Consumer<fou>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_glint_direct", elp.q), (Consumer<fou>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_entity_glint", elp.q), (Consumer<fou>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_entity_glint_direct", elp.q), (Consumer<fou>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_text", elp.t), (Consumer<fou>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_text_background", elp.p), (Consumer<fou>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_text_intensity", elp.t), (Consumer<fou>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_text_see_through", elp.t), (Consumer<fou>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_text_background_see_through", elp.p), (Consumer<fou>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_text_intensity_see_through", elp.t), (Consumer<fou>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_lightning", elp.n), (Consumer<fou>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_tripwire", elp.j), (Consumer<fou>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_end_portal", elp.m), (Consumer<fou>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_end_gateway", elp.m), (Consumer<fou>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_lines", elp.o), (Consumer<fou>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_crumbling", elp.j), (Consumer<fou>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_gui", elp.n), (Consumer<fou>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_gui_overlay", elp.n), (Consumer<fou>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_gui_text_highlight", elp.n), (Consumer<fou>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new fou($$0, "rendertype_gui_ghost_recipe_overlay", elp.n), (Consumer<fou>)$$0x -> aV = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((fou)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.aw();
      $$2.forEach($$0x -> {
         fou $$1x = (fou)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void aw() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(fou::close);
      this.O.clear();
   }

   @Nullable
   public fou a(@Nullable String $$0) {
      return $$0 == null ? null : this.O.get($$0);
   }

   public void f() {
      this.ax();
      this.z.a();
      if (this.j.am() == null) {
         this.j.a(this.j.s);
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
   public foj g() {
      return this.J;
   }

   public void a(int $$0, int $$1) {
      if (this.J != null) {
         this.J.a($$0, $$1);
      }

      this.j.f.a($$0, $$1);
   }

   public void a(float $$0) {
      bis $$1 = this.j.am();
      if ($$1 != null) {
         if (this.j.r != null) {
            this.j.aG().a("pick");
            this.j.u = null;
            double $$2 = (double)this.j.q.c();
            this.j.v = $$1.a($$2, $$0, false);
            ehp $$3 = $$1.j($$0);
            boolean $$4 = false;
            int $$5 = 3;
            double $$6 = $$2;
            if (this.j.q.h()) {
               $$6 = 6.0;
               $$2 = $$6;
            } else {
               if ($$2 > 3.0) {
                  $$4 = true;
               }

               $$2 = $$2;
            }

            $$6 *= $$6;
            if (this.j.v != null) {
               $$6 = this.j.v.e().g($$3);
            }

            ehp $$7 = $$1.f(1.0F);
            ehp $$8 = $$3.b($$7.c * $$2, $$7.d * $$2, $$7.e * $$2);
            float $$9 = 1.0F;
            ehk $$10 = $$1.cG().b($$7.a($$2)).c(1.0, 1.0, 1.0);
            ehm $$11 = ccp.a($$1, $$3, $$8, $$10, $$0x -> !$$0x.M_() && $$0x.br(), $$6);
            if ($$11 != null) {
               bis $$12 = $$11.a();
               ehp $$13 = $$11.e();
               double $$14 = $$3.g($$13);
               if ($$4 && $$14 > 9.0) {
                  this.j.v = ehl.a($$13, hc.a($$7.c, $$7.d, $$7.e), gw.a($$13));
               } else if ($$14 < $$6 || this.j.v == null) {
                  this.j.v = $$11;
                  if ($$12 instanceof bji || $$12 instanceof byi) {
                     this.j.u = $$12;
                  }
               }
            }

            this.j.aG().c();
         }
      }
   }

   private void ax() {
      float $$0 = 1.0F;
      if (this.j.am() instanceof fnf $$1) {
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

   private double a(eqi $$0, float $$1, boolean $$2) {
      if (this.B) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.j.m.ad().c().intValue();
            $$3 *= (double)ary.i($$1, this.r, this.q);
         }

         if ($$0.g() instanceof bji && ((bji)$$0.g()).ev()) {
            float $$4 = Math.min((float)((bji)$$0.g()).aM + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         eaq $$5 = $$0.k();
         if ($$5 == eaq.a || $$5 == eaq.b) {
            $$3 *= ary.d(this.j.m.ag().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(elr $$0, float $$1) {
      if (this.j.am() instanceof bji $$2) {
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.ev()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = ary.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eD();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.j.m.ak().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(elr $$0, float $$1) {
      if (this.j.am() instanceof cbw) {
         cbw $$2 = (cbw)this.j.am();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = ary.i($$1, $$2.bV, $$2.bW);
         $$0.a(ary.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(ary.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(ary.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(ary.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.C = $$0;
      this.D = $$1;
      this.E = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new elr());
      this.C = 1.0F;
   }

   private void a(elr $$0, eqi $$1, float $$2) {
      if (!this.B) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.j.m.X().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.j.am() instanceof bji && ((bji)this.j.am()).fC();
         if (this.j.m.aw().a() && !$$3 && !this.j.m.Z && this.j.q.l() != cpu.d) {
            this.z.c();
            this.b.a($$2, $$0, this.o.b(), this.j.s, this.j.ao().a(this.j.s, $$2));
            this.z.b();
         }

         $$0.b();
         if (this.j.m.aw().a() && !$$3) {
            foq.a(this.j, $$0);
            this.a($$0, $$2);
         }

         if (this.j.m.X().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, elz.a);
   }

   public Matrix4f a(double $$0) {
      elr $$1 = new elr();
      $$1.c().a().identity();
      if (this.C != 1.0F) {
         $$1.a(this.D, -this.E, 0.0F);
         $$1.b(this.C, this.C, 1.0F);
      }

      $$1.c()
         .a()
         .mul(new Matrix4f().setPerspective((float)($$0 * (float) (Math.PI / 180.0)), (float)this.j.aM().k() / (float)this.j.aM().l(), 0.05F, this.h()));
      return $$1.c().a();
   }

   public float h() {
      return this.m * 4.0F;
   }

   public static float a(bji $$0, float $$1) {
      bif $$2 = $$0.b(bih.p);
      return !$$2.a(200) ? 1.0F : 0.7F + ary.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(float $$0, long $$1, boolean $$2) {
      if (!this.j.aA() && this.j.m.n && (!this.j.m.V().c() || !this.j.n.d())) {
         if (ac.b() - this.y > 500L) {
            this.j.c(false);
         }
      } else {
         this.y = ac.b();
      }

      if (!this.j.x) {
         boolean $$3 = this.j.c();
         int $$4 = (int)(this.j.n.e() * (double)this.j.aM().o() / (double)this.j.aM().m());
         int $$5 = (int)(this.j.n.f() * (double)this.j.aM().p() / (double)this.j.aM().n());
         RenderSystem.viewport(0, 0, this.j.aM().k(), this.j.aM().l());
         if ($$3 && $$2 && this.j.r != null) {
            this.j.aG().a("level");
            this.a($$0, $$1, new elr());
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

         ekv $$6 = this.j.aM();
         RenderSystem.clear(256, eqx.a);
         Matrix4f $$7 = new Matrix4f().setOrtho(0.0F, (float)((double)$$6.k() / $$6.s()), (float)((double)$$6.l() / $$6.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$7, elz.b);
         elr $$8 = RenderSystem.getModelViewStack();
         $$8.a();
         $$8.e();
         $$8.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         ekn.b();
         esh $$9 = new esh(this.j, this.o.b());
         if ($$3 && $$2 && this.j.r != null) {
            this.j.aG().b("gui");
            if (this.j.s != null) {
               float $$10 = ary.i($$0, this.j.s.cw, this.j.s.cv);
               float $$11 = this.j.m.af().c().floatValue();
               if ($$10 > 0.0F && this.j.s.a(bih.i) && $$11 < 1.0F) {
                  this.a($$9, $$10 * (1.0F - $$11));
               }
            }

            if (!this.j.m.Z || this.j.y != null) {
               this.a(this.j.aM().o(), this.j.aM().p(), $$0);
               this.j.l.a($$9, $$0);
               RenderSystem.clear(256, eqx.a);
            }

            this.j.aG().c();
         }

         if (this.j.aJ() != null) {
            try {
               this.j.aJ().a($$9, $$4, $$5, this.j.av());
            } catch (Throwable var17) {
               o $$13 = o.a(var17, "Rendering overlay");
               p $$14 = $$13.a("Overlay render details");
               $$14.a("Overlay name", () -> this.j.aJ().getClass().getCanonicalName());
               throw new y($$13);
            }
         } else if ($$3 && this.j.y != null) {
            try {
               this.j.y.c($$9, $$4, $$5, this.j.av());
            } catch (Throwable var16) {
               o $$16 = o.a(var16, "Rendering screen");
               p $$17 = $$16.a("Screen render details");
               $$17.a("Screen name", () -> this.j.y.getClass().getCanonicalName());
               $$17.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", $$4, $$5, this.j.n.e(), this.j.n.f()));
               $$17.a(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.j.aM().o(),
                        this.j.aM().p(),
                        this.j.aM().k(),
                        this.j.aM().l(),
                        this.j.aM().s()
                     )
               );
               throw new y($$16);
            }

            try {
               if (this.j.y != null) {
                  this.j.y.z();
               }
            } catch (Throwable var15) {
               o $$19 = o.a(var15, "Narrating screen");
               p $$20 = $$19.a("Screen details");
               $$20.a("Screen name", () -> this.j.y.getClass().getCanonicalName());
               throw new y($$19);
            }
         }

         if ($$3) {
            this.j.aG().a("toasts");
            this.j.ay().a($$9);
            this.j.aG().c();
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
            gdf $$1 = this.j.T();
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
         eks $$1 = eri.a(this.j.g());
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

            try (eks $$6 = new eks(64, 64, false)) {
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
         bis $$0 = this.j.am();
         boolean $$1 = $$0 instanceof cbw && !this.j.m.Z;
         if ($$1 && !((cbw)$$0).fS().e) {
            cjh $$2 = ((bji)$$0).eS();
            ehn $$3 = this.j.v;
            if ($$3 != null && $$3.c() == ehn.a.b) {
               gw $$4 = ((ehl)$$3).a();
               dfl $$5 = this.j.r.a_($$4);
               if (this.j.q.l() == cpu.d) {
                  $$1 = $$5.b(this.j.r, $$4) != null;
               } else {
                  dfp $$6 = new dfp(this.j.r, $$4, false);
                  ht<csx> $$7 = this.j.r.G_().d(je.e);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, elr $$2) {
      this.z.a($$0);
      if (this.j.am() == null) {
         this.j.a(this.j.s);
      }

      this.a($$0);
      this.j.aG().a("center");
      boolean $$3 = this.az();
      this.j.aG().b("camera");
      eqi $$4 = this.N;
      this.m = (float)(this.j.m.az() * 16);
      elr $$5 = new elr();
      double $$6 = this.a($$4, $$0, true);
      $$5.a(this.a($$6));
      this.a($$5, $$0);
      if (this.j.m.X().c()) {
         this.b($$5, $$0);
      }

      float $$7 = this.j.m.af().c().floatValue();
      float $$8 = ary.i($$0, this.j.s.cw, this.j.s.cv) * $$7 * $$7;
      if ($$8 > 0.0F) {
         int $$9 = this.j.s.a(bih.i) ? 7 : 20;
         float $$10 = 5.0F / ($$8 * $$8 + 5.0F) - $$8 * 0.04F;
         $$10 *= $$10;
         a $$11 = a.of(new Vector3f(0.0F, ary.g / 2.0F, ary.g / 2.0F));
         $$5.a($$11.rotationDegrees(((float)this.p + $$0) * (float)$$9));
         $$5.b(1.0F / $$10, 1.0F, 1.0F);
         float $$12 = -((float)this.p + $$0) * (float)$$9;
         $$5.a($$11.rotationDegrees($$12));
      }

      Matrix4f $$13 = $$5.c().a();
      this.a($$13);
      $$4.a(this.j.r, (bis)(this.j.am() == null ? this.j.s : this.j.am()), !this.j.m.aw().a(), this.j.m.aw().b(), $$0);
      $$2.a(a.b.rotationDegrees($$4.d()));
      $$2.a(a.d.rotationDegrees($$4.e() + 180.0F));
      Matrix3f $$14 = new Matrix3f($$2.c().b()).invert();
      RenderSystem.setInverseViewRotationMatrix($$14);
      this.j.f.a($$2, $$4.b(), this.a(Math.max($$6, (double)this.j.m.ad().c().intValue())));
      this.j.f.a($$2, $$0, $$1, $$3, $$4, this, this.z, $$13);
      this.j.aG().b("hand");
      if (this.u) {
         RenderSystem.clear(256, eqx.a);
         this.a($$2, $$4, $$0);
      }

      this.j.aG().c();
   }

   public void i() {
      this.F = null;
      this.n.a();
      this.N.o();
      this.x = false;
   }

   public esj j() {
      return this.n;
   }

   public void a(cjh $$0) {
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
         elr $$11 = new elr();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * ary.e(ary.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * ary.e(ary.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * ary.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * ary.e(ary.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * ary.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * ary.b($$4 * 8.0F)));
         fog.a $$13 = this.o.b();
         this.j.aq().a(this.F, cje.i, 15728880, fyx.d, $$11, $$13, this.j.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(esh $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = ary.i($$1, 2.0F, 1.0F);
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

   public eqx k() {
      return this.j;
   }

   public float b(float $$0) {
      return ary.i($$0, this.t, this.s);
   }

   public float l() {
      return this.m;
   }

   public eqi m() {
      return this.N;
   }

   public fof n() {
      return this.z;
   }

   public fyx o() {
      return this.A;
   }

   @Nullable
   public static fou p() {
      return P;
   }

   @Nullable
   public static fou q() {
      return Q;
   }

   @Nullable
   public static fou r() {
      return R;
   }

   @Nullable
   public static fou s() {
      return S;
   }

   @Nullable
   public static fou t() {
      return T;
   }

   @Nullable
   public static fou u() {
      return U;
   }

   @Nullable
   public static fou v() {
      return V;
   }

   @Nullable
   public static fou w() {
      return W;
   }

   @Nullable
   public static fou x() {
      return X;
   }

   @Nullable
   public static fou y() {
      return Y;
   }

   @Nullable
   public static fou z() {
      return Z;
   }

   @Nullable
   public static fou A() {
      return aa;
   }

   @Nullable
   public static fou B() {
      return ab;
   }

   @Nullable
   public static fou C() {
      return ac;
   }

   @Nullable
   public static fou D() {
      return ad;
   }

   @Nullable
   public static fou E() {
      return ae;
   }

   @Nullable
   public static fou F() {
      return af;
   }

   @Nullable
   public static fou G() {
      return ag;
   }

   @Nullable
   public static fou H() {
      return ah;
   }

   @Nullable
   public static fou I() {
      return ai;
   }

   @Nullable
   public static fou J() {
      return aj;
   }

   @Nullable
   public static fou K() {
      return ak;
   }

   @Nullable
   public static fou L() {
      return al;
   }

   @Nullable
   public static fou M() {
      return am;
   }

   @Nullable
   public static fou N() {
      return an;
   }

   @Nullable
   public static fou O() {
      return ao;
   }

   @Nullable
   public static fou P() {
      return ap;
   }

   @Nullable
   public static fou Q() {
      return aq;
   }

   @Nullable
   public static fou R() {
      return ar;
   }

   @Nullable
   public static fou S() {
      return as;
   }

   @Nullable
   public static fou T() {
      return at;
   }

   @Nullable
   public static fou U() {
      return au;
   }

   @Nullable
   public static fou V() {
      return av;
   }

   @Nullable
   public static fou W() {
      return aw;
   }

   @Nullable
   public static fou X() {
      return ax;
   }

   @Nullable
   public static fou Y() {
      return ay;
   }

   @Nullable
   public static fou Z() {
      return az;
   }

   @Nullable
   public static fou aa() {
      return aA;
   }

   @Nullable
   public static fou ab() {
      return aB;
   }

   @Nullable
   public static fou ac() {
      return aC;
   }

   @Nullable
   public static fou ad() {
      return aD;
   }

   @Nullable
   public static fou ae() {
      return aE;
   }

   @Nullable
   public static fou af() {
      return aF;
   }

   @Nullable
   public static fou ag() {
      return aG;
   }

   @Nullable
   public static fou ah() {
      return aH;
   }

   @Nullable
   public static fou ai() {
      return aI;
   }

   @Nullable
   public static fou aj() {
      return aJ;
   }

   @Nullable
   public static fou ak() {
      return aK;
   }

   @Nullable
   public static fou al() {
      return aL;
   }

   @Nullable
   public static fou am() {
      return aM;
   }

   @Nullable
   public static fou an() {
      return aN;
   }

   @Nullable
   public static fou ao() {
      return aO;
   }

   @Nullable
   public static fou ap() {
      return aP;
   }

   @Nullable
   public static fou aq() {
      return aQ;
   }

   @Nullable
   public static fou ar() {
      return aR;
   }

   @Nullable
   public static fou as() {
      return aS;
   }

   @Nullable
   public static fou at() {
      return aT;
   }

   @Nullable
   public static fou au() {
      return aU;
   }

   @Nullable
   public static fou av() {
      return aV;
   }

   public static record a(any a, Map<aey, ant> b) implements any {
      @Override
      public Optional<ant> getResource(aey $$0) {
         ant $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
