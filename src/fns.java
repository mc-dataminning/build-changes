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

public class fns implements AutoCloseable {
   private static final aeu f = new aeu("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   final eqq j;
   private final anp k;
   private final arx l = arx.a();
   private float m;
   public final fnv b;
   private final esc n;
   private final fof o;
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
   private final fny z;
   private final fyq A = new fyq();
   private boolean B;
   private float C = 1.0F;
   private float D;
   private float E;
   public static final int c = 40;
   @Nullable
   private cja F;
   private int G;
   private float H;
   private float I;
   @Nullable
   foc J;
   static final aeu[] K = new aeu[]{
      new aeu("shaders/post/notch.json"),
      new aeu("shaders/post/fxaa.json"),
      new aeu("shaders/post/art.json"),
      new aeu("shaders/post/bumpy.json"),
      new aeu("shaders/post/blobs2.json"),
      new aeu("shaders/post/pencil.json"),
      new aeu("shaders/post/color_convolve.json"),
      new aeu("shaders/post/deconverge.json"),
      new aeu("shaders/post/flip.json"),
      new aeu("shaders/post/invert.json"),
      new aeu("shaders/post/ntsc.json"),
      new aeu("shaders/post/outline.json"),
      new aeu("shaders/post/phosphor.json"),
      new aeu("shaders/post/scan_pincushion.json"),
      new aeu("shaders/post/sobel.json"),
      new aeu("shaders/post/bits.json"),
      new aeu("shaders/post/desaturate.json"),
      new aeu("shaders/post/green.json"),
      new aeu("shaders/post/blur.json"),
      new aeu("shaders/post/wobble.json"),
      new aeu("shaders/post/blobs.json"),
      new aeu("shaders/post/antialias.json"),
      new aeu("shaders/post/creeper.json"),
      new aeu("shaders/post/spider.json")
   };
   public static final int d = K.length;
   int L = d;
   private boolean M;
   private final eqb N = new eqb();
   public fom e;
   private final Map<String, fom> O = Maps.newHashMap();
   @Nullable
   private static fom P;
   @Nullable
   private static fom Q;
   @Nullable
   private static fom R;
   @Nullable
   private static fom S;
   @Nullable
   private static fom T;
   @Nullable
   private static fom U;
   @Nullable
   private static fom V;
   @Nullable
   private static fom W;
   @Nullable
   private static fom X;
   @Nullable
   private static fom Y;
   @Nullable
   private static fom Z;
   @Nullable
   private static fom aa;
   @Nullable
   private static fom ab;
   @Nullable
   private static fom ac;
   @Nullable
   private static fom ad;
   @Nullable
   private static fom ae;
   @Nullable
   private static fom af;
   @Nullable
   private static fom ag;
   @Nullable
   private static fom ah;
   @Nullable
   private static fom ai;
   @Nullable
   private static fom aj;
   @Nullable
   private static fom ak;
   @Nullable
   private static fom al;
   @Nullable
   private static fom am;
   @Nullable
   private static fom an;
   @Nullable
   private static fom ao;
   @Nullable
   private static fom ap;
   @Nullable
   private static fom aq;
   @Nullable
   private static fom ar;
   @Nullable
   private static fom as;
   @Nullable
   private static fom at;
   @Nullable
   private static fom au;
   @Nullable
   private static fom av;
   @Nullable
   private static fom aw;
   @Nullable
   private static fom ax;
   @Nullable
   private static fom ay;
   @Nullable
   private static fom az;
   @Nullable
   private static fom aA;
   @Nullable
   private static fom aB;
   @Nullable
   private static fom aC;
   @Nullable
   private static fom aD;
   @Nullable
   private static fom aE;
   @Nullable
   private static fom aF;
   @Nullable
   private static fom aG;
   @Nullable
   private static fom aH;
   @Nullable
   private static fom aI;
   @Nullable
   private static fom aJ;
   @Nullable
   private static fom aK;
   @Nullable
   private static fom aL;
   @Nullable
   private static fom aM;
   @Nullable
   private static fom aN;
   @Nullable
   private static fom aO;
   @Nullable
   private static fom aP;
   @Nullable
   private static fom aQ;
   @Nullable
   private static fom aR;
   @Nullable
   private static fom aS;
   @Nullable
   private static fom aT;
   @Nullable
   private static fom aU;
   @Nullable
   private static fom aV;

   public fns(eqq $$0, fnv $$1, anp $$2, fof $$3) {
      this.j = $$0;
      this.k = $$2;
      this.b = $$1;
      this.n = new esc($$0.Y());
      this.z = new fny(this, $$0);
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

   public void a(@Nullable bil $$0) {
      if (this.J != null) {
         this.J.close();
      }

      this.J = null;
      if ($$0 instanceof byp) {
         this.a(new aeu("shaders/post/creeper.json"));
      } else if ($$0 instanceof bzo) {
         this.a(new aeu("shaders/post/spider.json"));
      } else if ($$0 instanceof byt) {
         this.a(new aeu("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.j.am() instanceof cbp) {
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

   void a(aeu $$0) {
      if (this.J != null) {
         this.J.close();
      }

      try {
         this.J = new foc(this.j.Y(), this.k, this.j.g(), $$0);
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

   public anj e() {
      return new anu<fns.a>() {
         protected fns.a a(anp $$0, bdk $$1) {
            Map<aeu, ann> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(eky.a.b.b()) || $$1x.endsWith(eky.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<aeu, ann> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new ann($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fns.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fns.a($$0, $$3);
         }

         protected void a(fns.a $$0, anp $$1, bdk $$2) {
            fns.this.b($$0);
            if (fns.this.J != null) {
               fns.this.J.close();
            }

            fns.this.J = null;
            if (fns.this.L == fns.d) {
               fns.this.a(fns.this.j.am());
            } else {
               fns.this.a(fns.K[fns.this.L]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(ans $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new fom($$0, "blit_screen", eli.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aS = this.a($$0, "rendertype_gui", eli.n);
         aT = this.a($$0, "rendertype_gui_overlay", eli.n);
         P = this.a($$0, "position", eli.m);
         Q = this.a($$0, "position_color", eli.n);
         R = this.a($$0, "position_color_tex", eli.r);
         S = this.a($$0, "position_tex", eli.q);
         T = this.a($$0, "position_tex_color", eli.s);
         aG = this.a($$0, "rendertype_text", eli.t);
      }
   }

   private fom a(ans $$0, String $$1, elp $$2) {
      try {
         fom $$3 = new fom($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(ans $$0) {
      RenderSystem.assertOnRenderThread();
      List<eky> $$1 = Lists.newArrayList();
      $$1.addAll(eky.a.b.c().values());
      $$1.addAll(eky.a.a.c().values());
      $$1.forEach(eky::a);
      List<Pair<fom, Consumer<fom>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new fom($$0, "particle", eli.l), (Consumer<fom>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new fom($$0, "position", eli.m), (Consumer<fom>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new fom($$0, "position_color", eli.n), (Consumer<fom>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new fom($$0, "position_color_lightmap", eli.p), (Consumer<fom>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new fom($$0, "position_color_tex", eli.r), (Consumer<fom>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new fom($$0, "position_color_tex_lightmap", eli.t), (Consumer<fom>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new fom($$0, "position_tex", eli.q), (Consumer<fom>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new fom($$0, "position_tex_color", eli.s), (Consumer<fom>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new fom($$0, "position_tex_color_normal", eli.v), (Consumer<fom>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new fom($$0, "position_tex_lightmap_color", eli.u), (Consumer<fom>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_solid", eli.j), (Consumer<fom>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_cutout_mipped", eli.j), (Consumer<fom>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_cutout", eli.j), (Consumer<fom>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_translucent", eli.j), (Consumer<fom>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_translucent_moving_block", eli.j), (Consumer<fom>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_translucent_no_crumbling", eli.j), (Consumer<fom>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_armor_cutout_no_cull", eli.k), (Consumer<fom>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_entity_solid", eli.k), (Consumer<fom>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_entity_cutout", eli.k), (Consumer<fom>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_entity_cutout_no_cull", eli.k), (Consumer<fom>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_entity_cutout_no_cull_z_offset", eli.k), (Consumer<fom>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_item_entity_translucent_cull", eli.k), (Consumer<fom>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_entity_translucent_cull", eli.k), (Consumer<fom>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_entity_translucent", eli.k), (Consumer<fom>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_entity_translucent_emissive", eli.k), (Consumer<fom>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_entity_smooth_cutout", eli.k), (Consumer<fom>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_beacon_beam", eli.j), (Consumer<fom>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_entity_decal", eli.k), (Consumer<fom>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_entity_no_outline", eli.k), (Consumer<fom>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_entity_shadow", eli.k), (Consumer<fom>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_entity_alpha", eli.k), (Consumer<fom>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_eyes", eli.k), (Consumer<fom>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_energy_swirl", eli.k), (Consumer<fom>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_leash", eli.p), (Consumer<fom>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_water_mask", eli.m), (Consumer<fom>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_outline", eli.r), (Consumer<fom>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_armor_glint", eli.q), (Consumer<fom>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_armor_entity_glint", eli.q), (Consumer<fom>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_glint_translucent", eli.q), (Consumer<fom>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_glint", eli.q), (Consumer<fom>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_glint_direct", eli.q), (Consumer<fom>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_entity_glint", eli.q), (Consumer<fom>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_entity_glint_direct", eli.q), (Consumer<fom>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_text", eli.t), (Consumer<fom>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_text_background", eli.p), (Consumer<fom>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_text_intensity", eli.t), (Consumer<fom>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_text_see_through", eli.t), (Consumer<fom>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_text_background_see_through", eli.p), (Consumer<fom>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_text_intensity_see_through", eli.t), (Consumer<fom>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_lightning", eli.n), (Consumer<fom>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_tripwire", eli.j), (Consumer<fom>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_end_portal", eli.m), (Consumer<fom>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_end_gateway", eli.m), (Consumer<fom>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_lines", eli.o), (Consumer<fom>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_crumbling", eli.j), (Consumer<fom>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_gui", eli.n), (Consumer<fom>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_gui_overlay", eli.n), (Consumer<fom>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_gui_text_highlight", eli.n), (Consumer<fom>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new fom($$0, "rendertype_gui_ghost_recipe_overlay", eli.n), (Consumer<fom>)$$0x -> aV = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((fom)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.aw();
      $$2.forEach($$0x -> {
         fom $$1x = (fom)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void aw() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(fom::close);
      this.O.clear();
   }

   @Nullable
   public fom a(@Nullable String $$0) {
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
   public foc g() {
      return this.J;
   }

   public void a(int $$0, int $$1) {
      if (this.J != null) {
         this.J.a($$0, $$1);
      }

      this.j.f.a($$0, $$1);
   }

   public void a(float $$0) {
      bil $$1 = this.j.am();
      if ($$1 != null) {
         if (this.j.r != null) {
            this.j.aG().a("pick");
            this.j.u = null;
            double $$2 = (double)this.j.q.c();
            this.j.v = $$1.a($$2, $$0, false);
            ehi $$3 = $$1.j($$0);
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

            ehi $$7 = $$1.f(1.0F);
            ehi $$8 = $$3.b($$7.c * $$2, $$7.d * $$2, $$7.e * $$2);
            float $$9 = 1.0F;
            ehd $$10 = $$1.cG().b($$7.a($$2)).c(1.0, 1.0, 1.0);
            ehf $$11 = cci.a($$1, $$3, $$8, $$10, $$0x -> !$$0x.G_() && $$0x.br(), $$6);
            if ($$11 != null) {
               bil $$12 = $$11.a();
               ehi $$13 = $$11.e();
               double $$14 = $$3.g($$13);
               if ($$4 && $$14 > 9.0) {
                  this.j.v = ehe.a($$13, hc.a($$7.c, $$7.d, $$7.e), gw.a($$13));
               } else if ($$14 < $$6 || this.j.v == null) {
                  this.j.v = $$11;
                  if ($$12 instanceof bjb || $$12 instanceof byb) {
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
      if (this.j.am() instanceof fmy $$1) {
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

   private double a(eqb $$0, float $$1, boolean $$2) {
      if (this.B) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.j.m.ad().c().intValue();
            $$3 *= (double)ars.i($$1, this.r, this.q);
         }

         if ($$0.g() instanceof bjb && ((bjb)$$0.g()).eu()) {
            float $$4 = Math.min((float)((bjb)$$0.g()).aM + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         eaj $$5 = $$0.k();
         if ($$5 == eaj.a || $$5 == eaj.b) {
            $$3 *= ars.d(this.j.m.ag().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(elk $$0, float $$1) {
      if (this.j.am() instanceof bjb $$2) {
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.eu()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = ars.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eC();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.j.m.ak().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(elk $$0, float $$1) {
      if (this.j.am() instanceof cbp) {
         cbp $$2 = (cbp)this.j.am();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = ars.i($$1, $$2.bT, $$2.bU);
         $$0.a(ars.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(ars.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(ars.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(ars.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.C = $$0;
      this.D = $$1;
      this.E = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new elk());
      this.C = 1.0F;
   }

   private void a(elk $$0, eqb $$1, float $$2) {
      if (!this.B) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.j.m.X().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.j.am() instanceof bjb && ((bjb)this.j.am()).fB();
         if (this.j.m.av().a() && !$$3 && !this.j.m.Z && this.j.q.l() != cpn.d) {
            this.z.c();
            this.b.a($$2, $$0, this.o.b(), this.j.s, this.j.ao().a(this.j.s, $$2));
            this.z.b();
         }

         $$0.b();
         if (this.j.m.av().a() && !$$3) {
            foj.a(this.j, $$0);
            this.a($$0, $$2);
         }

         if (this.j.m.X().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, els.a);
   }

   public Matrix4f a(double $$0) {
      elk $$1 = new elk();
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

   public static float a(bjb $$0, float $$1) {
      bhy $$2 = $$0.b(bia.p);
      return !$$2.a(200) ? 1.0F : 0.7F + ars.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
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
            this.a($$0, $$1, new elk());
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

         eko $$6 = this.j.aM();
         RenderSystem.clear(256, eqq.a);
         Matrix4f $$7 = new Matrix4f().setOrtho(0.0F, (float)((double)$$6.k() / $$6.s()), (float)((double)$$6.l() / $$6.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$7, els.b);
         elk $$8 = RenderSystem.getModelViewStack();
         $$8.a();
         $$8.e();
         $$8.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         ekg.b();
         esa $$9 = new esa(this.j, this.o.b());
         if ($$3 && $$2 && this.j.r != null) {
            this.j.aG().b("gui");
            if (this.j.s != null) {
               float $$10 = ars.i($$0, this.j.s.cu, this.j.s.ct);
               float $$11 = this.j.m.af().c().floatValue();
               if ($$10 > 0.0F && this.j.s.a(bia.i) && $$11 < 1.0F) {
                  this.a($$9, $$10 * (1.0F - $$11));
               }
            }

            if (!this.j.m.Z || this.j.y != null) {
               this.a(this.j.aM().o(), this.j.aM().p(), $$0);
               this.j.l.a($$9, $$0);
               RenderSystem.clear(256, eqq.a);
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
            gcy $$1 = this.j.T();
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
         ekl $$1 = erb.a(this.j.g());
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

            try (ekl $$6 = new ekl(64, 64, false)) {
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
         bil $$0 = this.j.am();
         boolean $$1 = $$0 instanceof cbp && !this.j.m.Z;
         if ($$1 && !((cbp)$$0).fR().e) {
            cja $$2 = ((bjb)$$0).eR();
            ehg $$3 = this.j.v;
            if ($$3 != null && $$3.c() == ehg.a.b) {
               gw $$4 = ((ehe)$$3).a();
               dfe $$5 = this.j.r.a_($$4);
               if (this.j.q.l() == cpn.d) {
                  $$1 = $$5.b(this.j.r, $$4) != null;
               } else {
                  dfi $$6 = new dfi(this.j.r, $$4, false);
                  ht<csq> $$7 = this.j.r.B_().d(je.e);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, elk $$2) {
      this.z.a($$0);
      if (this.j.am() == null) {
         this.j.a(this.j.s);
      }

      this.a($$0);
      this.j.aG().a("center");
      boolean $$3 = this.az();
      this.j.aG().b("camera");
      eqb $$4 = this.N;
      this.m = (float)(this.j.m.ay() * 16);
      elk $$5 = new elk();
      double $$6 = this.a($$4, $$0, true);
      $$5.a(this.a($$6));
      this.a($$5, $$0);
      if (this.j.m.X().c()) {
         this.b($$5, $$0);
      }

      float $$7 = this.j.m.af().c().floatValue();
      float $$8 = ars.i($$0, this.j.s.cu, this.j.s.ct) * $$7 * $$7;
      if ($$8 > 0.0F) {
         int $$9 = this.j.s.a(bia.i) ? 7 : 20;
         float $$10 = 5.0F / ($$8 * $$8 + 5.0F) - $$8 * 0.04F;
         $$10 *= $$10;
         a $$11 = a.of(new Vector3f(0.0F, ars.g / 2.0F, ars.g / 2.0F));
         $$5.a($$11.rotationDegrees(((float)this.p + $$0) * (float)$$9));
         $$5.b(1.0F / $$10, 1.0F, 1.0F);
         float $$12 = -((float)this.p + $$0) * (float)$$9;
         $$5.a($$11.rotationDegrees($$12));
      }

      Matrix4f $$13 = $$5.c().a();
      this.a($$13);
      $$4.a(this.j.r, (bil)(this.j.am() == null ? this.j.s : this.j.am()), !this.j.m.av().a(), this.j.m.av().b(), $$0);
      $$2.a(a.b.rotationDegrees($$4.d()));
      $$2.a(a.d.rotationDegrees($$4.e() + 180.0F));
      Matrix3f $$14 = new Matrix3f($$2.c().b()).invert();
      RenderSystem.setInverseViewRotationMatrix($$14);
      this.j.f.a($$2, $$4.b(), this.a(Math.max($$6, (double)this.j.m.ad().c().intValue())));
      this.j.f.a($$2, $$0, $$1, $$3, $$4, this, this.z, $$13);
      this.j.aG().b("hand");
      if (this.u) {
         RenderSystem.clear(256, eqq.a);
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

   public esc j() {
      return this.n;
   }

   public void a(cja $$0) {
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
         elk $$11 = new elk();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * ars.e(ars.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * ars.e(ars.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * ars.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * ars.e(ars.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * ars.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * ars.b($$4 * 8.0F)));
         fnz.a $$13 = this.o.b();
         this.j.aq().a(this.F, cix.i, 15728880, fyq.d, $$11, $$13, this.j.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(esa $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = ars.i($$1, 2.0F, 1.0F);
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

   public eqq k() {
      return this.j;
   }

   public float b(float $$0) {
      return ars.i($$0, this.t, this.s);
   }

   public float l() {
      return this.m;
   }

   public eqb m() {
      return this.N;
   }

   public fny n() {
      return this.z;
   }

   public fyq o() {
      return this.A;
   }

   @Nullable
   public static fom p() {
      return P;
   }

   @Nullable
   public static fom q() {
      return Q;
   }

   @Nullable
   public static fom r() {
      return R;
   }

   @Nullable
   public static fom s() {
      return S;
   }

   @Nullable
   public static fom t() {
      return T;
   }

   @Nullable
   public static fom u() {
      return U;
   }

   @Nullable
   public static fom v() {
      return V;
   }

   @Nullable
   public static fom w() {
      return W;
   }

   @Nullable
   public static fom x() {
      return X;
   }

   @Nullable
   public static fom y() {
      return Y;
   }

   @Nullable
   public static fom z() {
      return Z;
   }

   @Nullable
   public static fom A() {
      return aa;
   }

   @Nullable
   public static fom B() {
      return ab;
   }

   @Nullable
   public static fom C() {
      return ac;
   }

   @Nullable
   public static fom D() {
      return ad;
   }

   @Nullable
   public static fom E() {
      return ae;
   }

   @Nullable
   public static fom F() {
      return af;
   }

   @Nullable
   public static fom G() {
      return ag;
   }

   @Nullable
   public static fom H() {
      return ah;
   }

   @Nullable
   public static fom I() {
      return ai;
   }

   @Nullable
   public static fom J() {
      return aj;
   }

   @Nullable
   public static fom K() {
      return ak;
   }

   @Nullable
   public static fom L() {
      return al;
   }

   @Nullable
   public static fom M() {
      return am;
   }

   @Nullable
   public static fom N() {
      return an;
   }

   @Nullable
   public static fom O() {
      return ao;
   }

   @Nullable
   public static fom P() {
      return ap;
   }

   @Nullable
   public static fom Q() {
      return aq;
   }

   @Nullable
   public static fom R() {
      return ar;
   }

   @Nullable
   public static fom S() {
      return as;
   }

   @Nullable
   public static fom T() {
      return at;
   }

   @Nullable
   public static fom U() {
      return au;
   }

   @Nullable
   public static fom V() {
      return av;
   }

   @Nullable
   public static fom W() {
      return aw;
   }

   @Nullable
   public static fom X() {
      return ax;
   }

   @Nullable
   public static fom Y() {
      return ay;
   }

   @Nullable
   public static fom Z() {
      return az;
   }

   @Nullable
   public static fom aa() {
      return aA;
   }

   @Nullable
   public static fom ab() {
      return aB;
   }

   @Nullable
   public static fom ac() {
      return aC;
   }

   @Nullable
   public static fom ad() {
      return aD;
   }

   @Nullable
   public static fom ae() {
      return aE;
   }

   @Nullable
   public static fom af() {
      return aF;
   }

   @Nullable
   public static fom ag() {
      return aG;
   }

   @Nullable
   public static fom ah() {
      return aH;
   }

   @Nullable
   public static fom ai() {
      return aI;
   }

   @Nullable
   public static fom aj() {
      return aJ;
   }

   @Nullable
   public static fom ak() {
      return aK;
   }

   @Nullable
   public static fom al() {
      return aL;
   }

   @Nullable
   public static fom am() {
      return aM;
   }

   @Nullable
   public static fom an() {
      return aN;
   }

   @Nullable
   public static fom ao() {
      return aO;
   }

   @Nullable
   public static fom ap() {
      return aP;
   }

   @Nullable
   public static fom aq() {
      return aQ;
   }

   @Nullable
   public static fom ar() {
      return aR;
   }

   @Nullable
   public static fom as() {
      return aS;
   }

   @Nullable
   public static fom at() {
      return aT;
   }

   @Nullable
   public static fom au() {
      return aU;
   }

   @Nullable
   public static fom av() {
      return aV;
   }

   public static record a(ans a, Map<aeu, ann> b) implements ans {
      @Override
      public Optional<ann> getResource(aeu $$0) {
         ann $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
