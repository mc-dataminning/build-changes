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

public class fqa implements AutoCloseable {
   private static final agg f = new agg("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   private static final int j = 3;
   final esr k;
   private final apd l;
   private final ato m = ato.a();
   private float n;
   public final fqd b;
   private final eud o;
   private final fqn p;
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
   private final fqg A;
   private final gay B = new gay();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int c = 40;
   @Nullable
   private clb G;
   private int H;
   private float I;
   private float J;
   @Nullable
   fqk K;
   static final agg[] L = new agg[]{
      new agg("shaders/post/notch.json"),
      new agg("shaders/post/fxaa.json"),
      new agg("shaders/post/art.json"),
      new agg("shaders/post/bumpy.json"),
      new agg("shaders/post/blobs2.json"),
      new agg("shaders/post/pencil.json"),
      new agg("shaders/post/color_convolve.json"),
      new agg("shaders/post/deconverge.json"),
      new agg("shaders/post/flip.json"),
      new agg("shaders/post/invert.json"),
      new agg("shaders/post/ntsc.json"),
      new agg("shaders/post/outline.json"),
      new agg("shaders/post/phosphor.json"),
      new agg("shaders/post/scan_pincushion.json"),
      new agg("shaders/post/sobel.json"),
      new agg("shaders/post/bits.json"),
      new agg("shaders/post/desaturate.json"),
      new agg("shaders/post/green.json"),
      new agg("shaders/post/blur.json"),
      new agg("shaders/post/wobble.json"),
      new agg("shaders/post/blobs.json"),
      new agg("shaders/post/antialias.json"),
      new agg("shaders/post/creeper.json"),
      new agg("shaders/post/spider.json")
   };
   public static final int d = L.length;
   int M = d;
   private boolean N;
   private final esc O = new esc();
   public fqv e;
   private final Map<String, fqv> P = Maps.newHashMap();
   @Nullable
   private static fqv Q;
   @Nullable
   private static fqv R;
   @Nullable
   private static fqv S;
   @Nullable
   private static fqv T;
   @Nullable
   private static fqv U;
   @Nullable
   private static fqv V;
   @Nullable
   private static fqv W;
   @Nullable
   private static fqv X;
   @Nullable
   private static fqv Y;
   @Nullable
   private static fqv Z;
   @Nullable
   private static fqv aa;
   @Nullable
   private static fqv ab;
   @Nullable
   private static fqv ac;
   @Nullable
   private static fqv ad;
   @Nullable
   private static fqv ae;
   @Nullable
   private static fqv af;
   @Nullable
   private static fqv ag;
   @Nullable
   private static fqv ah;
   @Nullable
   private static fqv ai;
   @Nullable
   private static fqv aj;
   @Nullable
   private static fqv ak;
   @Nullable
   private static fqv al;
   @Nullable
   private static fqv am;
   @Nullable
   private static fqv an;
   @Nullable
   private static fqv ao;
   @Nullable
   private static fqv ap;
   @Nullable
   private static fqv aq;
   @Nullable
   private static fqv ar;
   @Nullable
   private static fqv as;
   @Nullable
   private static fqv at;
   @Nullable
   private static fqv au;
   @Nullable
   private static fqv av;
   @Nullable
   private static fqv aw;
   @Nullable
   private static fqv ax;
   @Nullable
   private static fqv ay;
   @Nullable
   private static fqv az;
   @Nullable
   private static fqv aA;
   @Nullable
   private static fqv aB;
   @Nullable
   private static fqv aC;
   @Nullable
   private static fqv aD;
   @Nullable
   private static fqv aE;
   @Nullable
   private static fqv aF;
   @Nullable
   private static fqv aG;
   @Nullable
   private static fqv aH;
   @Nullable
   private static fqv aI;
   @Nullable
   private static fqv aJ;
   @Nullable
   private static fqv aK;
   @Nullable
   private static fqv aL;
   @Nullable
   private static fqv aM;
   @Nullable
   private static fqv aN;
   @Nullable
   private static fqv aO;
   @Nullable
   private static fqv aP;
   @Nullable
   private static fqv aQ;
   @Nullable
   private static fqv aR;
   @Nullable
   private static fqv aS;
   @Nullable
   private static fqv aT;
   @Nullable
   private static fqv aU;
   @Nullable
   private static fqv aV;

   public fqa(esr $$0, fqd $$1, apd $$2, fqn $$3) {
      this.k = $$0;
      this.l = $$2;
      this.b = $$1;
      this.o = new eud($$0.X());
      this.A = new fqg(this, $$0);
      this.p = $$3;
      this.K = null;
   }

   @Override
   public void close() {
      this.A.close();
      this.o.close();
      this.B.close();
      this.b();
      this.av();
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

   public void a(@Nullable bki $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof cam) {
         this.a(new agg("shaders/post/creeper.json"));
      } else if ($$0 instanceof cbl) {
         this.a(new agg("shaders/post/spider.json"));
      } else if ($$0 instanceof caq) {
         this.a(new agg("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.k.al() instanceof cdm) {
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

   void a(agg $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new fqk(this.k.X(), this.l, this.k.g(), $$0);
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

   public aox e() {
      return new api<fqa.a>() {
         protected fqa.a a(apd $$0, bfh $$1) {
            Map<agg, apb> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(emy.a.b.b()) || $$1x.endsWith(emy.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<agg, apb> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new apb($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fqa.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fqa.a($$0, $$3);
         }

         protected void a(fqa.a $$0, apd $$1, bfh $$2) {
            fqa.this.b($$0);
            if (fqa.this.K != null) {
               fqa.this.K.close();
            }

            fqa.this.K = null;
            if (fqa.this.M == fqa.d) {
               fqa.this.a(fqa.this.k.al());
            } else {
               fqa.this.a(fqa.L[fqa.this.M]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(apg $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new fqv($$0, "blit_screen", eni.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aS = this.a($$0, "rendertype_gui", eni.n);
         aT = this.a($$0, "rendertype_gui_overlay", eni.n);
         Q = this.a($$0, "position", eni.m);
         R = this.a($$0, "position_color", eni.n);
         S = this.a($$0, "position_color_tex", eni.r);
         T = this.a($$0, "position_tex", eni.q);
         U = this.a($$0, "position_tex_color", eni.s);
         aG = this.a($$0, "rendertype_text", eni.t);
      }
   }

   private fqv a(apg $$0, String $$1, enp $$2) {
      try {
         fqv $$3 = new fqv($$0, $$1, $$2);
         this.P.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(apg $$0) {
      RenderSystem.assertOnRenderThread();
      List<emy> $$1 = Lists.newArrayList();
      $$1.addAll(emy.a.b.c().values());
      $$1.addAll(emy.a.a.c().values());
      $$1.forEach(emy::a);
      List<Pair<fqv, Consumer<fqv>>> $$2 = Lists.newArrayListWithCapacity(this.P.size());

      try {
         $$2.add(Pair.of(new fqv($$0, "particle", eni.l), (Consumer<fqv>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new fqv($$0, "position", eni.m), (Consumer<fqv>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new fqv($$0, "position_color", eni.n), (Consumer<fqv>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new fqv($$0, "position_color_lightmap", eni.p), (Consumer<fqv>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new fqv($$0, "position_color_tex", eni.r), (Consumer<fqv>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new fqv($$0, "position_color_tex_lightmap", eni.t), (Consumer<fqv>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new fqv($$0, "position_tex", eni.q), (Consumer<fqv>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new fqv($$0, "position_tex_color", eni.s), (Consumer<fqv>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new fqv($$0, "position_tex_color_normal", eni.v), (Consumer<fqv>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new fqv($$0, "position_tex_lightmap_color", eni.u), (Consumer<fqv>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_solid", eni.j), (Consumer<fqv>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_cutout_mipped", eni.j), (Consumer<fqv>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_cutout", eni.j), (Consumer<fqv>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_translucent", eni.j), (Consumer<fqv>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_translucent_moving_block", eni.j), (Consumer<fqv>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_armor_cutout_no_cull", eni.k), (Consumer<fqv>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_entity_solid", eni.k), (Consumer<fqv>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_entity_cutout", eni.k), (Consumer<fqv>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_entity_cutout_no_cull", eni.k), (Consumer<fqv>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_entity_cutout_no_cull_z_offset", eni.k), (Consumer<fqv>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_item_entity_translucent_cull", eni.k), (Consumer<fqv>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_entity_translucent_cull", eni.k), (Consumer<fqv>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_entity_translucent", eni.k), (Consumer<fqv>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_entity_translucent_emissive", eni.k), (Consumer<fqv>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_entity_smooth_cutout", eni.k), (Consumer<fqv>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_beacon_beam", eni.j), (Consumer<fqv>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_entity_decal", eni.k), (Consumer<fqv>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_entity_no_outline", eni.k), (Consumer<fqv>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_entity_shadow", eni.k), (Consumer<fqv>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_entity_alpha", eni.k), (Consumer<fqv>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_eyes", eni.k), (Consumer<fqv>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_energy_swirl", eni.k), (Consumer<fqv>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_leash", eni.p), (Consumer<fqv>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_water_mask", eni.m), (Consumer<fqv>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_outline", eni.r), (Consumer<fqv>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_armor_glint", eni.q), (Consumer<fqv>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_armor_entity_glint", eni.q), (Consumer<fqv>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_glint_translucent", eni.q), (Consumer<fqv>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_glint", eni.q), (Consumer<fqv>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_glint_direct", eni.q), (Consumer<fqv>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_entity_glint", eni.q), (Consumer<fqv>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_entity_glint_direct", eni.q), (Consumer<fqv>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_text", eni.t), (Consumer<fqv>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_text_background", eni.p), (Consumer<fqv>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_text_intensity", eni.t), (Consumer<fqv>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_text_see_through", eni.t), (Consumer<fqv>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_text_background_see_through", eni.p), (Consumer<fqv>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_text_intensity_see_through", eni.t), (Consumer<fqv>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_lightning", eni.n), (Consumer<fqv>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_tripwire", eni.j), (Consumer<fqv>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_end_portal", eni.m), (Consumer<fqv>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_end_gateway", eni.m), (Consumer<fqv>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_lines", eni.o), (Consumer<fqv>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_crumbling", eni.j), (Consumer<fqv>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_gui", eni.n), (Consumer<fqv>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_gui_overlay", eni.n), (Consumer<fqv>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_gui_text_highlight", eni.n), (Consumer<fqv>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new fqv($$0, "rendertype_gui_ghost_recipe_overlay", eni.n), (Consumer<fqv>)$$0x -> aV = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((fqv)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.av();
      $$2.forEach($$0x -> {
         fqv $$1x = (fqv)$$0x.getFirst();
         this.P.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void av() {
      RenderSystem.assertOnRenderThread();
      this.P.values().forEach(fqv::close);
      this.P.clear();
   }

   @Nullable
   public fqv a(@Nullable String $$0) {
      return $$0 == null ? null : this.P.get($$0);
   }

   public void f() {
      this.aw();
      this.A.a();
      if (this.k.al() == null) {
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
   public fqk g() {
      return this.K;
   }

   public void a(int $$0, int $$1) {
      if (this.K != null) {
         this.K.a($$0, $$1);
      }

      this.k.f.a($$0, $$1);
   }

   public void a(float $$0) {
      bki $$1 = this.k.al();
      if ($$1 != null) {
         if (this.k.r != null) {
            this.k.aF().a("pick");
            this.k.u = null;
            double $$2 = (double)this.k.q.c();
            this.k.v = $$1.a($$2, $$0, false);
            eji $$3 = $$1.j($$0);
            boolean $$4 = this.k.q.h();
            $$2 = $$4 ? 6.0 : $$2;
            boolean $$5 = !$$4;
            double $$6 = this.k.v != null ? this.k.v.e().g($$3) : $$2 * $$2;
            eji $$7 = $$1.f(1.0F);
            eji $$8 = $$3.b($$7.c * $$2, $$7.d * $$2, $$7.e * $$2);
            float $$9 = 1.0F;
            ejd $$10 = $$1.cG().b($$7.a($$2)).c(1.0, 1.0, 1.0);
            ejf $$11 = cef.a($$1, $$3, $$8, $$10, $$0x -> !$$0x.N_() && $$0x.br(), $$6);
            if ($$11 != null) {
               eji $$12 = $$11.e();
               double $$13 = $$3.g($$12);
               if ($$5 && $$13 > 9.0) {
                  this.k.v = eje.a($$12, hx.a($$7.c, $$7.d, $$7.e), ht.a($$12));
               } else if ($$13 < $$6 || this.k.v == null) {
                  this.k.v = $$11;
                  bki $$14 = $$11.a();
                  this.k.u = $$14;
               }
            }

            this.k.aF().c();
         }
      }
   }

   private void aw() {
      float $$0 = 1.0F;
      if (this.k.al() instanceof fpg $$1) {
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

   private double a(esc $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ae().c().intValue();
            $$3 *= (double)ati.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof bky && ((bky)$$0.g()).ev()) {
            float $$4 = Math.min((float)((bky)$$0.g()).aM + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         eci $$5 = $$0.k();
         if ($$5 == eci.a || $$5 == eci.b) {
            $$3 *= ati.d(this.k.m.ah().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(enk $$0, float $$1) {
      if (this.k.al() instanceof bky $$2) {
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.ev()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = ati.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eD();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.al().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(enk $$0, float $$1) {
      if (this.k.al() instanceof cdm) {
         cdm $$2 = (cdm)this.k.al();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = ati.i($$1, $$2.bV, $$2.bW);
         $$0.a(ati.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(ati.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(ati.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(ati.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.D = $$0;
      this.E = $$1;
      this.F = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new enk());
      this.D = 1.0F;
   }

   private void a(enk $$0, esc $$1, float $$2) {
      if (!this.C) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.k.m.Y().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.k.al() instanceof bky && ((bky)this.k.al()).fD();
         if (this.k.m.ax().a() && !$$3 && !this.k.m.Z && this.k.q.l() != crp.d) {
            this.A.c();
            this.b.a($$2, $$0, this.p.c(), this.k.s, this.k.an().a(this.k.s, $$2));
            this.A.b();
         }

         $$0.b();
         if (this.k.m.ax().a() && !$$3) {
            fqr.a(this.k, $$0);
            this.a($$0, $$2);
         }

         if (this.k.m.Y().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, ens.a);
   }

   public Matrix4f a(double $$0) {
      enk $$1 = new enk();
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

   public static float a(bky $$0, float $$1) {
      bjv $$2 = $$0.b(bjx.p);
      return !$$2.a(200) ? 1.0F : 0.7F + ati.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
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
         boolean $$3 = this.k.c();
         int $$4 = (int)(this.k.n.e() * (double)this.k.aL().o() / (double)this.k.aL().m());
         int $$5 = (int)(this.k.n.f() * (double)this.k.aL().p() / (double)this.k.aL().n());
         RenderSystem.viewport(0, 0, this.k.aL().k(), this.k.aL().l());
         if ($$3 && $$2 && this.k.r != null) {
            this.k.aF().a("level");
            this.a($$0, $$1, new enk());
            this.ax();
            this.k.f.b();
            if (this.K != null && this.N) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.K.a($$0);
            }

            this.k.g().a(true);
         }

         emo $$6 = this.k.aL();
         RenderSystem.clear(256, esr.a);
         Matrix4f $$7 = new Matrix4f().setOrtho(0.0F, (float)((double)$$6.k() / $$6.s()), (float)((double)$$6.l() / $$6.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$7, ens.b);
         enk $$8 = RenderSystem.getModelViewStack();
         $$8.a();
         $$8.e();
         $$8.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         emg.b();
         eub $$9 = new eub(this.k, this.p.c());
         if ($$3 && $$2 && this.k.r != null) {
            this.k.aF().b("gui");
            if (this.k.s != null) {
               float $$10 = ati.i($$0, this.k.s.cw, this.k.s.cv);
               float $$11 = this.k.m.ag().c().floatValue();
               if ($$10 > 0.0F && this.k.s.a(bjx.i) && $$11 < 1.0F) {
                  this.a($$9, $$10 * (1.0F - $$11));
               }
            }

            if (!this.k.m.Z || this.k.y != null) {
               this.a(this.k.aL().o(), this.k.aL().p(), $$0);
               this.k.l.a($$9, $$0);
               RenderSystem.clear(256, esr.a);
            }

            this.k.aF().c();
         }

         if (this.k.aI() != null) {
            try {
               this.k.aI().a($$9, $$4, $$5, this.k.as());
            } catch (Throwable var17) {
               o $$13 = o.a(var17, "Rendering overlay");
               p $$14 = $$13.a("Overlay render details");
               $$14.a("Overlay name", () -> this.k.aI().getClass().getCanonicalName());
               throw new y($$13);
            }
         } else if ($$3 && this.k.y != null) {
            try {
               this.k.y.c($$9, $$4, $$5, this.k.as());
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
                        this.k.aL().o(),
                        this.k.aL().p(),
                        this.k.aL().k(),
                        this.k.aL().l(),
                        this.k.aL().s()
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
            this.k.aF().a("toasts");
            this.k.ax().a($$9);
            this.k.aF().c();
         }

         $$9.e();
         $$8.b();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void ax() {
      if (!this.y && this.k.Q()) {
         long $$0 = ac.b();
         if ($$0 - this.x >= 1000L) {
            this.x = $$0;
            gfg $$1 = this.k.S();
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
         eml $$1 = etc.a(this.k.g());
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

            try (eml $$6 = new eml(64, 64, false)) {
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

   private boolean ay() {
      if (!this.w) {
         return false;
      } else {
         bki $$0 = this.k.al();
         boolean $$1 = $$0 instanceof cdm && !this.k.m.Z;
         if ($$1 && !((cdm)$$0).fT().e) {
            clb $$2 = ((bky)$$0).eS();
            ejg $$3 = this.k.v;
            if ($$3 != null && $$3.c() == ejg.a.b) {
               ht $$4 = ((eje)$$3).a();
               dgw $$5 = this.k.r.a_($$4);
               if (this.k.q.l() == crp.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  dha $$6 = new dha(this.k.r, $$4, false);
                  io<cut> $$7 = this.k.r.H_().d(jz.e);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, enk $$2) {
      this.A.a($$0);
      if (this.k.al() == null) {
         this.k.a(this.k.s);
      }

      this.a($$0);
      this.k.aF().a("center");
      boolean $$3 = this.ay();
      this.k.aF().b("camera");
      esc $$4 = this.O;
      this.n = (float)(this.k.m.aA() * 16);
      enk $$5 = new enk();
      double $$6 = this.a($$4, $$0, true);
      $$5.a(this.a($$6));
      this.a($$5, $$0);
      if (this.k.m.Y().c()) {
         this.b($$5, $$0);
      }

      float $$7 = this.k.m.ag().c().floatValue();
      float $$8 = ati.i($$0, this.k.s.cw, this.k.s.cv) * $$7 * $$7;
      if ($$8 > 0.0F) {
         int $$9 = this.k.s.a(bjx.i) ? 7 : 20;
         float $$10 = 5.0F / ($$8 * $$8 + 5.0F) - $$8 * 0.04F;
         $$10 *= $$10;
         a $$11 = a.of(new Vector3f(0.0F, ati.g / 2.0F, ati.g / 2.0F));
         $$5.a($$11.rotationDegrees(((float)this.q + $$0) * (float)$$9));
         $$5.b(1.0F / $$10, 1.0F, 1.0F);
         float $$12 = -((float)this.q + $$0) * (float)$$9;
         $$5.a($$11.rotationDegrees($$12));
      }

      Matrix4f $$13 = $$5.c().a();
      this.a($$13);
      $$4.a(this.k.r, (bki)(this.k.al() == null ? this.k.s : this.k.al()), !this.k.m.ax().a(), this.k.m.ax().b(), $$0);
      $$2.a(a.b.rotationDegrees($$4.d()));
      $$2.a(a.d.rotationDegrees($$4.e() + 180.0F));
      Matrix3f $$14 = new Matrix3f($$2.c().b()).invert();
      RenderSystem.setInverseViewRotationMatrix($$14);
      this.k.f.a($$2, $$4.b(), this.a(Math.max($$6, (double)this.k.m.ae().c().intValue())));
      this.k.f.a($$2, $$0, $$1, $$3, $$4, this, this.A, $$13);
      this.k.aF().b("hand");
      if (this.v) {
         RenderSystem.clear(256, esr.a);
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

   public eud j() {
      return this.o;
   }

   public void a(clb $$0) {
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
         enk $$11 = new enk();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * ati.e(ati.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * ati.e(ati.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * ati.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * ati.e(ati.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * ati.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * ati.b($$4 * 8.0F)));
         fqh.a $$13 = this.p.c();
         this.k.ap().a(this.G, cky.i, 15728880, gay.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(eub $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = ati.i($$1, 2.0F, 1.0F);
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

   public esr k() {
      return this.k;
   }

   public float b(float $$0) {
      return ati.i($$0, this.u, this.t);
   }

   public float l() {
      return this.n;
   }

   public esc m() {
      return this.O;
   }

   public fqg n() {
      return this.A;
   }

   public gay o() {
      return this.B;
   }

   @Nullable
   public static fqv p() {
      return Q;
   }

   @Nullable
   public static fqv q() {
      return R;
   }

   @Nullable
   public static fqv r() {
      return S;
   }

   @Nullable
   public static fqv s() {
      return T;
   }

   @Nullable
   public static fqv t() {
      return U;
   }

   @Nullable
   public static fqv u() {
      return V;
   }

   @Nullable
   public static fqv v() {
      return W;
   }

   @Nullable
   public static fqv w() {
      return X;
   }

   @Nullable
   public static fqv x() {
      return Y;
   }

   @Nullable
   public static fqv y() {
      return Z;
   }

   @Nullable
   public static fqv z() {
      return aa;
   }

   @Nullable
   public static fqv A() {
      return ab;
   }

   @Nullable
   public static fqv B() {
      return ac;
   }

   @Nullable
   public static fqv C() {
      return ad;
   }

   @Nullable
   public static fqv D() {
      return ae;
   }

   @Nullable
   public static fqv E() {
      return af;
   }

   @Nullable
   public static fqv F() {
      return ag;
   }

   @Nullable
   public static fqv G() {
      return ah;
   }

   @Nullable
   public static fqv H() {
      return ai;
   }

   @Nullable
   public static fqv I() {
      return aj;
   }

   @Nullable
   public static fqv J() {
      return ak;
   }

   @Nullable
   public static fqv K() {
      return al;
   }

   @Nullable
   public static fqv L() {
      return am;
   }

   @Nullable
   public static fqv M() {
      return an;
   }

   @Nullable
   public static fqv N() {
      return ao;
   }

   @Nullable
   public static fqv O() {
      return ap;
   }

   @Nullable
   public static fqv P() {
      return aq;
   }

   @Nullable
   public static fqv Q() {
      return ar;
   }

   @Nullable
   public static fqv R() {
      return as;
   }

   @Nullable
   public static fqv S() {
      return at;
   }

   @Nullable
   public static fqv T() {
      return au;
   }

   @Nullable
   public static fqv U() {
      return av;
   }

   @Nullable
   public static fqv V() {
      return aw;
   }

   @Nullable
   public static fqv W() {
      return ax;
   }

   @Nullable
   public static fqv X() {
      return ay;
   }

   @Nullable
   public static fqv Y() {
      return az;
   }

   @Nullable
   public static fqv Z() {
      return aA;
   }

   @Nullable
   public static fqv aa() {
      return aB;
   }

   @Nullable
   public static fqv ab() {
      return aC;
   }

   @Nullable
   public static fqv ac() {
      return aD;
   }

   @Nullable
   public static fqv ad() {
      return aE;
   }

   @Nullable
   public static fqv ae() {
      return aF;
   }

   @Nullable
   public static fqv af() {
      return aG;
   }

   @Nullable
   public static fqv ag() {
      return aH;
   }

   @Nullable
   public static fqv ah() {
      return aI;
   }

   @Nullable
   public static fqv ai() {
      return aJ;
   }

   @Nullable
   public static fqv aj() {
      return aK;
   }

   @Nullable
   public static fqv ak() {
      return aL;
   }

   @Nullable
   public static fqv al() {
      return aM;
   }

   @Nullable
   public static fqv am() {
      return aN;
   }

   @Nullable
   public static fqv an() {
      return aO;
   }

   @Nullable
   public static fqv ao() {
      return aP;
   }

   @Nullable
   public static fqv ap() {
      return aQ;
   }

   @Nullable
   public static fqv aq() {
      return aR;
   }

   @Nullable
   public static fqv ar() {
      return aS;
   }

   @Nullable
   public static fqv as() {
      return aT;
   }

   @Nullable
   public static fqv at() {
      return aU;
   }

   @Nullable
   public static fqv au() {
      return aV;
   }

   public static record a(apg a, Map<agg, apb> b) implements apg {
      @Override
      public Optional<apb> getResource(agg $$0) {
         apb $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
