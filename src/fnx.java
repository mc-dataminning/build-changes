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

public class fnx implements AutoCloseable {
   private static final aex f = new aex("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   final eqv j;
   private final anu k;
   private final asc l = asc.a();
   private float m;
   public final foa b;
   private final esh n;
   private final fok o;
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
   private final fod z;
   private final fyv A = new fyv();
   private boolean B;
   private float C = 1.0F;
   private float D;
   private float E;
   public static final int c = 40;
   @Nullable
   private cjf F;
   private int G;
   private float H;
   private float I;
   @Nullable
   foh J;
   static final aex[] K = new aex[]{
      new aex("shaders/post/notch.json"),
      new aex("shaders/post/fxaa.json"),
      new aex("shaders/post/art.json"),
      new aex("shaders/post/bumpy.json"),
      new aex("shaders/post/blobs2.json"),
      new aex("shaders/post/pencil.json"),
      new aex("shaders/post/color_convolve.json"),
      new aex("shaders/post/deconverge.json"),
      new aex("shaders/post/flip.json"),
      new aex("shaders/post/invert.json"),
      new aex("shaders/post/ntsc.json"),
      new aex("shaders/post/outline.json"),
      new aex("shaders/post/phosphor.json"),
      new aex("shaders/post/scan_pincushion.json"),
      new aex("shaders/post/sobel.json"),
      new aex("shaders/post/bits.json"),
      new aex("shaders/post/desaturate.json"),
      new aex("shaders/post/green.json"),
      new aex("shaders/post/blur.json"),
      new aex("shaders/post/wobble.json"),
      new aex("shaders/post/blobs.json"),
      new aex("shaders/post/antialias.json"),
      new aex("shaders/post/creeper.json"),
      new aex("shaders/post/spider.json")
   };
   public static final int d = K.length;
   int L = d;
   private boolean M;
   private final eqg N = new eqg();
   public fos e;
   private final Map<String, fos> O = Maps.newHashMap();
   @Nullable
   private static fos P;
   @Nullable
   private static fos Q;
   @Nullable
   private static fos R;
   @Nullable
   private static fos S;
   @Nullable
   private static fos T;
   @Nullable
   private static fos U;
   @Nullable
   private static fos V;
   @Nullable
   private static fos W;
   @Nullable
   private static fos X;
   @Nullable
   private static fos Y;
   @Nullable
   private static fos Z;
   @Nullable
   private static fos aa;
   @Nullable
   private static fos ab;
   @Nullable
   private static fos ac;
   @Nullable
   private static fos ad;
   @Nullable
   private static fos ae;
   @Nullable
   private static fos af;
   @Nullable
   private static fos ag;
   @Nullable
   private static fos ah;
   @Nullable
   private static fos ai;
   @Nullable
   private static fos aj;
   @Nullable
   private static fos ak;
   @Nullable
   private static fos al;
   @Nullable
   private static fos am;
   @Nullable
   private static fos an;
   @Nullable
   private static fos ao;
   @Nullable
   private static fos ap;
   @Nullable
   private static fos aq;
   @Nullable
   private static fos ar;
   @Nullable
   private static fos as;
   @Nullable
   private static fos at;
   @Nullable
   private static fos au;
   @Nullable
   private static fos av;
   @Nullable
   private static fos aw;
   @Nullable
   private static fos ax;
   @Nullable
   private static fos ay;
   @Nullable
   private static fos az;
   @Nullable
   private static fos aA;
   @Nullable
   private static fos aB;
   @Nullable
   private static fos aC;
   @Nullable
   private static fos aD;
   @Nullable
   private static fos aE;
   @Nullable
   private static fos aF;
   @Nullable
   private static fos aG;
   @Nullable
   private static fos aH;
   @Nullable
   private static fos aI;
   @Nullable
   private static fos aJ;
   @Nullable
   private static fos aK;
   @Nullable
   private static fos aL;
   @Nullable
   private static fos aM;
   @Nullable
   private static fos aN;
   @Nullable
   private static fos aO;
   @Nullable
   private static fos aP;
   @Nullable
   private static fos aQ;
   @Nullable
   private static fos aR;
   @Nullable
   private static fos aS;
   @Nullable
   private static fos aT;
   @Nullable
   private static fos aU;
   @Nullable
   private static fos aV;

   public fnx(eqv $$0, foa $$1, anu $$2, fok $$3) {
      this.j = $$0;
      this.k = $$2;
      this.b = $$1;
      this.n = new esh($$0.Y());
      this.z = new fod(this, $$0);
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

   public void a(@Nullable biq $$0) {
      if (this.J != null) {
         this.J.close();
      }

      this.J = null;
      if ($$0 instanceof byu) {
         this.a(new aex("shaders/post/creeper.json"));
      } else if ($$0 instanceof bzt) {
         this.a(new aex("shaders/post/spider.json"));
      } else if ($$0 instanceof byy) {
         this.a(new aex("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.j.am() instanceof cbu) {
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

   void a(aex $$0) {
      if (this.J != null) {
         this.J.close();
      }

      try {
         this.J = new foh(this.j.Y(), this.k, this.j.g(), $$0);
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

   public ano e() {
      return new anz<fnx.a>() {
         protected fnx.a a(anu $$0, bdp $$1) {
            Map<aex, ans> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(eld.a.b.b()) || $$1x.endsWith(eld.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<aex, ans> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new ans($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fnx.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fnx.a($$0, $$3);
         }

         protected void a(fnx.a $$0, anu $$1, bdp $$2) {
            fnx.this.b($$0);
            if (fnx.this.J != null) {
               fnx.this.J.close();
            }

            fnx.this.J = null;
            if (fnx.this.L == fnx.d) {
               fnx.this.a(fnx.this.j.am());
            } else {
               fnx.this.a(fnx.K[fnx.this.L]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(anx $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new fos($$0, "blit_screen", eln.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aS = this.a($$0, "rendertype_gui", eln.n);
         aT = this.a($$0, "rendertype_gui_overlay", eln.n);
         P = this.a($$0, "position", eln.m);
         Q = this.a($$0, "position_color", eln.n);
         R = this.a($$0, "position_color_tex", eln.r);
         S = this.a($$0, "position_tex", eln.q);
         T = this.a($$0, "position_tex_color", eln.s);
         aG = this.a($$0, "rendertype_text", eln.t);
      }
   }

   private fos a(anx $$0, String $$1, elu $$2) {
      try {
         fos $$3 = new fos($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(anx $$0) {
      RenderSystem.assertOnRenderThread();
      List<eld> $$1 = Lists.newArrayList();
      $$1.addAll(eld.a.b.c().values());
      $$1.addAll(eld.a.a.c().values());
      $$1.forEach(eld::a);
      List<Pair<fos, Consumer<fos>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new fos($$0, "particle", eln.l), (Consumer<fos>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new fos($$0, "position", eln.m), (Consumer<fos>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new fos($$0, "position_color", eln.n), (Consumer<fos>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new fos($$0, "position_color_lightmap", eln.p), (Consumer<fos>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new fos($$0, "position_color_tex", eln.r), (Consumer<fos>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new fos($$0, "position_color_tex_lightmap", eln.t), (Consumer<fos>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new fos($$0, "position_tex", eln.q), (Consumer<fos>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new fos($$0, "position_tex_color", eln.s), (Consumer<fos>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new fos($$0, "position_tex_color_normal", eln.v), (Consumer<fos>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new fos($$0, "position_tex_lightmap_color", eln.u), (Consumer<fos>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_solid", eln.j), (Consumer<fos>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_cutout_mipped", eln.j), (Consumer<fos>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_cutout", eln.j), (Consumer<fos>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_translucent", eln.j), (Consumer<fos>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_translucent_moving_block", eln.j), (Consumer<fos>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_translucent_no_crumbling", eln.j), (Consumer<fos>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_armor_cutout_no_cull", eln.k), (Consumer<fos>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_entity_solid", eln.k), (Consumer<fos>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_entity_cutout", eln.k), (Consumer<fos>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_entity_cutout_no_cull", eln.k), (Consumer<fos>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_entity_cutout_no_cull_z_offset", eln.k), (Consumer<fos>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_item_entity_translucent_cull", eln.k), (Consumer<fos>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_entity_translucent_cull", eln.k), (Consumer<fos>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_entity_translucent", eln.k), (Consumer<fos>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_entity_translucent_emissive", eln.k), (Consumer<fos>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_entity_smooth_cutout", eln.k), (Consumer<fos>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_beacon_beam", eln.j), (Consumer<fos>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_entity_decal", eln.k), (Consumer<fos>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_entity_no_outline", eln.k), (Consumer<fos>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_entity_shadow", eln.k), (Consumer<fos>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_entity_alpha", eln.k), (Consumer<fos>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_eyes", eln.k), (Consumer<fos>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_energy_swirl", eln.k), (Consumer<fos>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_leash", eln.p), (Consumer<fos>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_water_mask", eln.m), (Consumer<fos>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_outline", eln.r), (Consumer<fos>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_armor_glint", eln.q), (Consumer<fos>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_armor_entity_glint", eln.q), (Consumer<fos>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_glint_translucent", eln.q), (Consumer<fos>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_glint", eln.q), (Consumer<fos>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_glint_direct", eln.q), (Consumer<fos>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_entity_glint", eln.q), (Consumer<fos>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_entity_glint_direct", eln.q), (Consumer<fos>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_text", eln.t), (Consumer<fos>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_text_background", eln.p), (Consumer<fos>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_text_intensity", eln.t), (Consumer<fos>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_text_see_through", eln.t), (Consumer<fos>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_text_background_see_through", eln.p), (Consumer<fos>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_text_intensity_see_through", eln.t), (Consumer<fos>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_lightning", eln.n), (Consumer<fos>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_tripwire", eln.j), (Consumer<fos>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_end_portal", eln.m), (Consumer<fos>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_end_gateway", eln.m), (Consumer<fos>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_lines", eln.o), (Consumer<fos>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_crumbling", eln.j), (Consumer<fos>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_gui", eln.n), (Consumer<fos>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_gui_overlay", eln.n), (Consumer<fos>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_gui_text_highlight", eln.n), (Consumer<fos>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new fos($$0, "rendertype_gui_ghost_recipe_overlay", eln.n), (Consumer<fos>)$$0x -> aV = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((fos)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.aw();
      $$2.forEach($$0x -> {
         fos $$1x = (fos)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void aw() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(fos::close);
      this.O.clear();
   }

   @Nullable
   public fos a(@Nullable String $$0) {
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
   public foh g() {
      return this.J;
   }

   public void a(int $$0, int $$1) {
      if (this.J != null) {
         this.J.a($$0, $$1);
      }

      this.j.f.a($$0, $$1);
   }

   public void a(float $$0) {
      biq $$1 = this.j.am();
      if ($$1 != null) {
         if (this.j.r != null) {
            this.j.aG().a("pick");
            this.j.u = null;
            double $$2 = (double)this.j.q.c();
            this.j.v = $$1.a($$2, $$0, false);
            ehn $$3 = $$1.j($$0);
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

            ehn $$7 = $$1.f(1.0F);
            ehn $$8 = $$3.b($$7.c * $$2, $$7.d * $$2, $$7.e * $$2);
            float $$9 = 1.0F;
            ehi $$10 = $$1.cG().b($$7.a($$2)).c(1.0, 1.0, 1.0);
            ehk $$11 = ccn.a($$1, $$3, $$8, $$10, $$0x -> !$$0x.M_() && $$0x.br(), $$6);
            if ($$11 != null) {
               biq $$12 = $$11.a();
               ehn $$13 = $$11.e();
               double $$14 = $$3.g($$13);
               if ($$4 && $$14 > 9.0) {
                  this.j.v = ehj.a($$13, hc.a($$7.c, $$7.d, $$7.e), gw.a($$13));
               } else if ($$14 < $$6 || this.j.v == null) {
                  this.j.v = $$11;
                  if ($$12 instanceof bjg || $$12 instanceof byg) {
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
      if (this.j.am() instanceof fnd $$1) {
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

   private double a(eqg $$0, float $$1, boolean $$2) {
      if (this.B) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.j.m.ad().c().intValue();
            $$3 *= (double)arx.i($$1, this.r, this.q);
         }

         if ($$0.g() instanceof bjg && ((bjg)$$0.g()).ev()) {
            float $$4 = Math.min((float)((bjg)$$0.g()).aM + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         eao $$5 = $$0.k();
         if ($$5 == eao.a || $$5 == eao.b) {
            $$3 *= arx.d(this.j.m.ag().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(elp $$0, float $$1) {
      if (this.j.am() instanceof bjg $$2) {
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.ev()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = arx.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eD();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.j.m.ak().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(elp $$0, float $$1) {
      if (this.j.am() instanceof cbu) {
         cbu $$2 = (cbu)this.j.am();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = arx.i($$1, $$2.bV, $$2.bW);
         $$0.a(arx.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(arx.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(arx.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(arx.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.C = $$0;
      this.D = $$1;
      this.E = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new elp());
      this.C = 1.0F;
   }

   private void a(elp $$0, eqg $$1, float $$2) {
      if (!this.B) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.j.m.X().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.j.am() instanceof bjg && ((bjg)this.j.am()).fC();
         if (this.j.m.aw().a() && !$$3 && !this.j.m.Z && this.j.q.l() != cps.d) {
            this.z.c();
            this.b.a($$2, $$0, this.o.b(), this.j.s, this.j.ao().a(this.j.s, $$2));
            this.z.b();
         }

         $$0.b();
         if (this.j.m.aw().a() && !$$3) {
            foo.a(this.j, $$0);
            this.a($$0, $$2);
         }

         if (this.j.m.X().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, elx.a);
   }

   public Matrix4f a(double $$0) {
      elp $$1 = new elp();
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

   public static float a(bjg $$0, float $$1) {
      bid $$2 = $$0.b(bif.p);
      return !$$2.a(200) ? 1.0F : 0.7F + arx.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
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
            this.a($$0, $$1, new elp());
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

         ekt $$6 = this.j.aM();
         RenderSystem.clear(256, eqv.a);
         Matrix4f $$7 = new Matrix4f().setOrtho(0.0F, (float)((double)$$6.k() / $$6.s()), (float)((double)$$6.l() / $$6.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$7, elx.b);
         elp $$8 = RenderSystem.getModelViewStack();
         $$8.a();
         $$8.e();
         $$8.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         ekl.b();
         esf $$9 = new esf(this.j, this.o.b());
         if ($$3 && $$2 && this.j.r != null) {
            this.j.aG().b("gui");
            if (this.j.s != null) {
               float $$10 = arx.i($$0, this.j.s.cw, this.j.s.cv);
               float $$11 = this.j.m.af().c().floatValue();
               if ($$10 > 0.0F && this.j.s.a(bif.i) && $$11 < 1.0F) {
                  this.a($$9, $$10 * (1.0F - $$11));
               }
            }

            if (!this.j.m.Z || this.j.y != null) {
               this.a(this.j.aM().o(), this.j.aM().p(), $$0);
               this.j.l.a($$9, $$0);
               RenderSystem.clear(256, eqv.a);
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
            gdd $$1 = this.j.T();
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
         ekq $$1 = erg.a(this.j.g());
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

            try (ekq $$6 = new ekq(64, 64, false)) {
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
         biq $$0 = this.j.am();
         boolean $$1 = $$0 instanceof cbu && !this.j.m.Z;
         if ($$1 && !((cbu)$$0).fS().e) {
            cjf $$2 = ((bjg)$$0).eS();
            ehl $$3 = this.j.v;
            if ($$3 != null && $$3.c() == ehl.a.b) {
               gw $$4 = ((ehj)$$3).a();
               dfj $$5 = this.j.r.a_($$4);
               if (this.j.q.l() == cps.d) {
                  $$1 = $$5.b(this.j.r, $$4) != null;
               } else {
                  dfn $$6 = new dfn(this.j.r, $$4, false);
                  ht<csv> $$7 = this.j.r.G_().d(je.e);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, elp $$2) {
      this.z.a($$0);
      if (this.j.am() == null) {
         this.j.a(this.j.s);
      }

      this.a($$0);
      this.j.aG().a("center");
      boolean $$3 = this.az();
      this.j.aG().b("camera");
      eqg $$4 = this.N;
      this.m = (float)(this.j.m.az() * 16);
      elp $$5 = new elp();
      double $$6 = this.a($$4, $$0, true);
      $$5.a(this.a($$6));
      this.a($$5, $$0);
      if (this.j.m.X().c()) {
         this.b($$5, $$0);
      }

      float $$7 = this.j.m.af().c().floatValue();
      float $$8 = arx.i($$0, this.j.s.cw, this.j.s.cv) * $$7 * $$7;
      if ($$8 > 0.0F) {
         int $$9 = this.j.s.a(bif.i) ? 7 : 20;
         float $$10 = 5.0F / ($$8 * $$8 + 5.0F) - $$8 * 0.04F;
         $$10 *= $$10;
         a $$11 = a.of(new Vector3f(0.0F, arx.g / 2.0F, arx.g / 2.0F));
         $$5.a($$11.rotationDegrees(((float)this.p + $$0) * (float)$$9));
         $$5.b(1.0F / $$10, 1.0F, 1.0F);
         float $$12 = -((float)this.p + $$0) * (float)$$9;
         $$5.a($$11.rotationDegrees($$12));
      }

      Matrix4f $$13 = $$5.c().a();
      this.a($$13);
      $$4.a(this.j.r, (biq)(this.j.am() == null ? this.j.s : this.j.am()), !this.j.m.aw().a(), this.j.m.aw().b(), $$0);
      $$2.a(a.b.rotationDegrees($$4.d()));
      $$2.a(a.d.rotationDegrees($$4.e() + 180.0F));
      Matrix3f $$14 = new Matrix3f($$2.c().b()).invert();
      RenderSystem.setInverseViewRotationMatrix($$14);
      this.j.f.a($$2, $$4.b(), this.a(Math.max($$6, (double)this.j.m.ad().c().intValue())));
      this.j.f.a($$2, $$0, $$1, $$3, $$4, this, this.z, $$13);
      this.j.aG().b("hand");
      if (this.u) {
         RenderSystem.clear(256, eqv.a);
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

   public esh j() {
      return this.n;
   }

   public void a(cjf $$0) {
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
         elp $$11 = new elp();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * arx.e(arx.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * arx.e(arx.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * arx.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * arx.e(arx.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * arx.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * arx.b($$4 * 8.0F)));
         foe.a $$13 = this.o.b();
         this.j.aq().a(this.F, cjc.i, 15728880, fyv.d, $$11, $$13, this.j.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(esf $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = arx.i($$1, 2.0F, 1.0F);
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

   public eqv k() {
      return this.j;
   }

   public float b(float $$0) {
      return arx.i($$0, this.t, this.s);
   }

   public float l() {
      return this.m;
   }

   public eqg m() {
      return this.N;
   }

   public fod n() {
      return this.z;
   }

   public fyv o() {
      return this.A;
   }

   @Nullable
   public static fos p() {
      return P;
   }

   @Nullable
   public static fos q() {
      return Q;
   }

   @Nullable
   public static fos r() {
      return R;
   }

   @Nullable
   public static fos s() {
      return S;
   }

   @Nullable
   public static fos t() {
      return T;
   }

   @Nullable
   public static fos u() {
      return U;
   }

   @Nullable
   public static fos v() {
      return V;
   }

   @Nullable
   public static fos w() {
      return W;
   }

   @Nullable
   public static fos x() {
      return X;
   }

   @Nullable
   public static fos y() {
      return Y;
   }

   @Nullable
   public static fos z() {
      return Z;
   }

   @Nullable
   public static fos A() {
      return aa;
   }

   @Nullable
   public static fos B() {
      return ab;
   }

   @Nullable
   public static fos C() {
      return ac;
   }

   @Nullable
   public static fos D() {
      return ad;
   }

   @Nullable
   public static fos E() {
      return ae;
   }

   @Nullable
   public static fos F() {
      return af;
   }

   @Nullable
   public static fos G() {
      return ag;
   }

   @Nullable
   public static fos H() {
      return ah;
   }

   @Nullable
   public static fos I() {
      return ai;
   }

   @Nullable
   public static fos J() {
      return aj;
   }

   @Nullable
   public static fos K() {
      return ak;
   }

   @Nullable
   public static fos L() {
      return al;
   }

   @Nullable
   public static fos M() {
      return am;
   }

   @Nullable
   public static fos N() {
      return an;
   }

   @Nullable
   public static fos O() {
      return ao;
   }

   @Nullable
   public static fos P() {
      return ap;
   }

   @Nullable
   public static fos Q() {
      return aq;
   }

   @Nullable
   public static fos R() {
      return ar;
   }

   @Nullable
   public static fos S() {
      return as;
   }

   @Nullable
   public static fos T() {
      return at;
   }

   @Nullable
   public static fos U() {
      return au;
   }

   @Nullable
   public static fos V() {
      return av;
   }

   @Nullable
   public static fos W() {
      return aw;
   }

   @Nullable
   public static fos X() {
      return ax;
   }

   @Nullable
   public static fos Y() {
      return ay;
   }

   @Nullable
   public static fos Z() {
      return az;
   }

   @Nullable
   public static fos aa() {
      return aA;
   }

   @Nullable
   public static fos ab() {
      return aB;
   }

   @Nullable
   public static fos ac() {
      return aC;
   }

   @Nullable
   public static fos ad() {
      return aD;
   }

   @Nullable
   public static fos ae() {
      return aE;
   }

   @Nullable
   public static fos af() {
      return aF;
   }

   @Nullable
   public static fos ag() {
      return aG;
   }

   @Nullable
   public static fos ah() {
      return aH;
   }

   @Nullable
   public static fos ai() {
      return aI;
   }

   @Nullable
   public static fos aj() {
      return aJ;
   }

   @Nullable
   public static fos ak() {
      return aK;
   }

   @Nullable
   public static fos al() {
      return aL;
   }

   @Nullable
   public static fos am() {
      return aM;
   }

   @Nullable
   public static fos an() {
      return aN;
   }

   @Nullable
   public static fos ao() {
      return aO;
   }

   @Nullable
   public static fos ap() {
      return aP;
   }

   @Nullable
   public static fos aq() {
      return aQ;
   }

   @Nullable
   public static fos ar() {
      return aR;
   }

   @Nullable
   public static fos as() {
      return aS;
   }

   @Nullable
   public static fos at() {
      return aT;
   }

   @Nullable
   public static fos au() {
      return aU;
   }

   @Nullable
   public static fos av() {
      return aV;
   }

   public static record a(anx a, Map<aex, ans> b) implements anx {
      @Override
      public Optional<ans> getResource(aex $$0) {
         ans $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
