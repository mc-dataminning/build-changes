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

public class fjq implements AutoCloseable {
   private static final acq f = new acq("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   final enn j;
   private final akx k;
   private final apf l = apf.a();
   private float m;
   public final fjt b;
   private final eoy n;
   private final fkd o;
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
   private final fjw z;
   private final fum A = new fum();
   private boolean B;
   private float C = 1.0F;
   private float D;
   private float E;
   public static final int c = 40;
   @Nullable
   private cfz F;
   private int G;
   private float H;
   private float I;
   @Nullable
   fka J;
   static final acq[] K = new acq[]{
      new acq("shaders/post/notch.json"),
      new acq("shaders/post/fxaa.json"),
      new acq("shaders/post/art.json"),
      new acq("shaders/post/bumpy.json"),
      new acq("shaders/post/blobs2.json"),
      new acq("shaders/post/pencil.json"),
      new acq("shaders/post/color_convolve.json"),
      new acq("shaders/post/deconverge.json"),
      new acq("shaders/post/flip.json"),
      new acq("shaders/post/invert.json"),
      new acq("shaders/post/ntsc.json"),
      new acq("shaders/post/outline.json"),
      new acq("shaders/post/phosphor.json"),
      new acq("shaders/post/scan_pincushion.json"),
      new acq("shaders/post/sobel.json"),
      new acq("shaders/post/bits.json"),
      new acq("shaders/post/desaturate.json"),
      new acq("shaders/post/green.json"),
      new acq("shaders/post/blur.json"),
      new acq("shaders/post/wobble.json"),
      new acq("shaders/post/blobs.json"),
      new acq("shaders/post/antialias.json"),
      new acq("shaders/post/creeper.json"),
      new acq("shaders/post/spider.json")
   };
   public static final int d = K.length;
   int L = d;
   private boolean M;
   private final emz N = new emz();
   public fki e;
   private final Map<String, fki> O = Maps.newHashMap();
   @Nullable
   private static fki P;
   @Nullable
   private static fki Q;
   @Nullable
   private static fki R;
   @Nullable
   private static fki S;
   @Nullable
   private static fki T;
   @Nullable
   private static fki U;
   @Nullable
   private static fki V;
   @Nullable
   private static fki W;
   @Nullable
   private static fki X;
   @Nullable
   private static fki Y;
   @Nullable
   private static fki Z;
   @Nullable
   private static fki aa;
   @Nullable
   private static fki ab;
   @Nullable
   private static fki ac;
   @Nullable
   private static fki ad;
   @Nullable
   private static fki ae;
   @Nullable
   private static fki af;
   @Nullable
   private static fki ag;
   @Nullable
   private static fki ah;
   @Nullable
   private static fki ai;
   @Nullable
   private static fki aj;
   @Nullable
   private static fki ak;
   @Nullable
   private static fki al;
   @Nullable
   private static fki am;
   @Nullable
   private static fki an;
   @Nullable
   private static fki ao;
   @Nullable
   private static fki ap;
   @Nullable
   private static fki aq;
   @Nullable
   private static fki ar;
   @Nullable
   private static fki as;
   @Nullable
   private static fki at;
   @Nullable
   private static fki au;
   @Nullable
   private static fki av;
   @Nullable
   private static fki aw;
   @Nullable
   private static fki ax;
   @Nullable
   private static fki ay;
   @Nullable
   private static fki az;
   @Nullable
   private static fki aA;
   @Nullable
   private static fki aB;
   @Nullable
   private static fki aC;
   @Nullable
   private static fki aD;
   @Nullable
   private static fki aE;
   @Nullable
   private static fki aF;
   @Nullable
   private static fki aG;
   @Nullable
   private static fki aH;
   @Nullable
   private static fki aI;
   @Nullable
   private static fki aJ;
   @Nullable
   private static fki aK;
   @Nullable
   private static fki aL;
   @Nullable
   private static fki aM;
   @Nullable
   private static fki aN;
   @Nullable
   private static fki aO;
   @Nullable
   private static fki aP;
   @Nullable
   private static fki aQ;
   @Nullable
   private static fki aR;
   @Nullable
   private static fki aS;
   @Nullable
   private static fki aT;
   @Nullable
   private static fki aU;
   @Nullable
   private static fki aV;

   public fjq(enn $$0, fjt $$1, akx $$2, fkd $$3) {
      this.j = $$0;
      this.k = $$2;
      this.b = $$1;
      this.n = new eoy($$0.X());
      this.z = new fjw(this, $$0);
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

   public void a(@Nullable bfj $$0) {
      if (this.J != null) {
         this.J.close();
      }

      this.J = null;
      if ($$0 instanceof bvo) {
         this.a(new acq("shaders/post/creeper.json"));
      } else if ($$0 instanceof bwn) {
         this.a(new acq("shaders/post/spider.json"));
      } else if ($$0 instanceof bvs) {
         this.a(new acq("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.j.al() instanceof byo) {
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

   void a(acq $$0) {
      if (this.J != null) {
         this.J.close();
      }

      try {
         this.J = new fka(this.j.X(), this.k, this.j.f(), $$0);
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

   public akr e() {
      return new alc<fjq.a>() {
         protected fjq.a a(akx $$0, ban $$1) {
            Map<acq, akv> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(ehx.a.b.b()) || $$1x.endsWith(ehx.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<acq, akv> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new akv($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fjq.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fjq.a($$0, $$3);
         }

         protected void a(fjq.a $$0, akx $$1, ban $$2) {
            fjq.this.b($$0);
            if (fjq.this.J != null) {
               fjq.this.J.close();
            }

            fjq.this.J = null;
            if (fjq.this.L == fjq.d) {
               fjq.this.a(fjq.this.j.al());
            } else {
               fjq.this.a(fjq.K[fjq.this.L]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(ala $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new fki($$0, "blit_screen", eih.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aS = this.a($$0, "rendertype_gui", eih.n);
         aT = this.a($$0, "rendertype_gui_overlay", eih.n);
         P = this.a($$0, "position", eih.m);
         Q = this.a($$0, "position_color", eih.n);
         R = this.a($$0, "position_color_tex", eih.r);
         S = this.a($$0, "position_tex", eih.q);
         T = this.a($$0, "position_tex_color", eih.s);
         aG = this.a($$0, "rendertype_text", eih.t);
      }
   }

   private fki a(ala $$0, String $$1, eio $$2) {
      try {
         fki $$3 = new fki($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(ala $$0) {
      RenderSystem.assertOnRenderThread();
      List<ehx> $$1 = Lists.newArrayList();
      $$1.addAll(ehx.a.b.c().values());
      $$1.addAll(ehx.a.a.c().values());
      $$1.forEach(ehx::a);
      List<Pair<fki, Consumer<fki>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new fki($$0, "particle", eih.l), (Consumer<fki>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new fki($$0, "position", eih.m), (Consumer<fki>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new fki($$0, "position_color", eih.n), (Consumer<fki>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new fki($$0, "position_color_lightmap", eih.p), (Consumer<fki>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new fki($$0, "position_color_tex", eih.r), (Consumer<fki>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new fki($$0, "position_color_tex_lightmap", eih.t), (Consumer<fki>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new fki($$0, "position_tex", eih.q), (Consumer<fki>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new fki($$0, "position_tex_color", eih.s), (Consumer<fki>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new fki($$0, "position_tex_color_normal", eih.v), (Consumer<fki>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new fki($$0, "position_tex_lightmap_color", eih.u), (Consumer<fki>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_solid", eih.j), (Consumer<fki>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_cutout_mipped", eih.j), (Consumer<fki>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_cutout", eih.j), (Consumer<fki>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_translucent", eih.j), (Consumer<fki>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_translucent_moving_block", eih.j), (Consumer<fki>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_translucent_no_crumbling", eih.j), (Consumer<fki>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_armor_cutout_no_cull", eih.k), (Consumer<fki>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_entity_solid", eih.k), (Consumer<fki>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_entity_cutout", eih.k), (Consumer<fki>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_entity_cutout_no_cull", eih.k), (Consumer<fki>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_entity_cutout_no_cull_z_offset", eih.k), (Consumer<fki>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_item_entity_translucent_cull", eih.k), (Consumer<fki>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_entity_translucent_cull", eih.k), (Consumer<fki>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_entity_translucent", eih.k), (Consumer<fki>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_entity_translucent_emissive", eih.k), (Consumer<fki>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_entity_smooth_cutout", eih.k), (Consumer<fki>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_beacon_beam", eih.j), (Consumer<fki>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_entity_decal", eih.k), (Consumer<fki>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_entity_no_outline", eih.k), (Consumer<fki>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_entity_shadow", eih.k), (Consumer<fki>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_entity_alpha", eih.k), (Consumer<fki>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_eyes", eih.k), (Consumer<fki>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_energy_swirl", eih.k), (Consumer<fki>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_leash", eih.p), (Consumer<fki>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_water_mask", eih.m), (Consumer<fki>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_outline", eih.r), (Consumer<fki>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_armor_glint", eih.q), (Consumer<fki>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_armor_entity_glint", eih.q), (Consumer<fki>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_glint_translucent", eih.q), (Consumer<fki>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_glint", eih.q), (Consumer<fki>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_glint_direct", eih.q), (Consumer<fki>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_entity_glint", eih.q), (Consumer<fki>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_entity_glint_direct", eih.q), (Consumer<fki>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_text", eih.t), (Consumer<fki>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_text_background", eih.p), (Consumer<fki>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_text_intensity", eih.t), (Consumer<fki>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_text_see_through", eih.t), (Consumer<fki>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_text_background_see_through", eih.p), (Consumer<fki>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_text_intensity_see_through", eih.t), (Consumer<fki>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_lightning", eih.n), (Consumer<fki>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_tripwire", eih.j), (Consumer<fki>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_end_portal", eih.m), (Consumer<fki>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_end_gateway", eih.m), (Consumer<fki>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_lines", eih.o), (Consumer<fki>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_crumbling", eih.j), (Consumer<fki>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_gui", eih.n), (Consumer<fki>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_gui_overlay", eih.n), (Consumer<fki>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_gui_text_highlight", eih.n), (Consumer<fki>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new fki($$0, "rendertype_gui_ghost_recipe_overlay", eih.n), (Consumer<fki>)$$0x -> aV = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((fki)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.aw();
      $$2.forEach($$0x -> {
         fki $$1x = (fki)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void aw() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(fki::close);
      this.O.clear();
   }

   @Nullable
   public fki a(@Nullable String $$0) {
      return $$0 == null ? null : this.O.get($$0);
   }

   public void f() {
      this.ax();
      this.z.a();
      if (this.j.al() == null) {
         this.j.a(this.j.t);
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
   public fka g() {
      return this.J;
   }

   public void a(int $$0, int $$1) {
      if (this.J != null) {
         this.J.a($$0, $$1);
      }

      this.j.f.a($$0, $$1);
   }

   public void a(float $$0) {
      bfj $$1 = this.j.al();
      if ($$1 != null) {
         if (this.j.s != null) {
            this.j.aG().a("pick");
            this.j.v = null;
            double $$2 = (double)this.j.r.c();
            this.j.w = $$1.a($$2, $$0, false);
            eei $$3 = $$1.j($$0);
            boolean $$4 = false;
            int $$5 = 3;
            double $$6 = $$2;
            if (this.j.r.h()) {
               $$6 = 6.0;
               $$2 = $$6;
            } else {
               if ($$2 > 3.0) {
                  $$4 = true;
               }

               $$2 = $$2;
            }

            $$6 *= $$6;
            if (this.j.w != null) {
               $$6 = this.j.w.e().g($$3);
            }

            eei $$7 = $$1.f(1.0F);
            eei $$8 = $$3.b($$7.c * $$2, $$7.d * $$2, $$7.e * $$2);
            float $$9 = 1.0F;
            eed $$10 = $$1.cE().b($$7.a($$2)).c(1.0, 1.0, 1.0);
            eef $$11 = bzh.a($$1, $$3, $$8, $$10, $$0x -> !$$0x.G_() && $$0x.bo(), $$6);
            if ($$11 != null) {
               bfj $$12 = $$11.a();
               eei $$13 = $$11.e();
               double $$14 = $$3.g($$13);
               if ($$4 && $$14 > 9.0) {
                  this.j.w = eee.a($$13, ha.a($$7.c, $$7.d, $$7.e), gu.a($$13));
               } else if ($$14 < $$6 || this.j.w == null) {
                  this.j.w = $$11;
                  if ($$12 instanceof bfz || $$12 instanceof bva) {
                     this.j.v = $$12;
                  }
               }
            }

            this.j.aG().c();
         }
      }
   }

   private void ax() {
      float $$0 = 1.0F;
      if (this.j.al() instanceof fiv) {
         fiv $$1 = (fiv)this.j.al();
         $$0 = $$1.m();
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

   private double a(emz $$0, float $$1, boolean $$2) {
      if (this.B) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.j.m.ac().c().intValue();
            $$3 *= (double)apa.i($$1, this.r, this.q);
         }

         if ($$0.g() instanceof bfz && ((bfz)$$0.g()).es()) {
            float $$4 = Math.min((float)((bfz)$$0.g()).aN + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         dxg $$5 = $$0.k();
         if ($$5 == dxg.a || $$5 == dxg.b) {
            $$3 *= apa.d(this.j.m.af().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(eij $$0, float $$1) {
      if (this.j.al() instanceof bfz) {
         bfz $$2 = (bfz)this.j.al();
         float $$3 = (float)$$2.aL - $$1;
         if ($$2.es()) {
            float $$4 = Math.min((float)$$2.aN + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aM;
         $$3 = apa.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eB();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.j.m.aj().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(eij $$0, float $$1) {
      if (this.j.al() instanceof byo) {
         byo $$2 = (byo)this.j.al();
         float $$3 = $$2.X - $$2.W;
         float $$4 = -($$2.X + $$3 * $$1);
         float $$5 = apa.i($$1, $$2.bU, $$2.bV);
         $$0.a(apa.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(apa.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(apa.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(apa.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.C = $$0;
      this.D = $$1;
      this.E = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new eij());
      this.C = 1.0F;
   }

   private void a(eij $$0, emz $$1, float $$2) {
      if (!this.B) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.j.m.W().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.j.al() instanceof bfz && ((bfz)this.j.al()).fy();
         if (this.j.m.au().a() && !$$3 && !this.j.m.Z && this.j.r.l() != cmj.d) {
            this.z.c();
            this.b.a($$2, $$0, this.o.b(), this.j.t, this.j.an().a(this.j.t, $$2));
            this.z.b();
         }

         $$0.b();
         if (this.j.m.au().a() && !$$3) {
            fkh.a(this.j, $$0);
            this.a($$0, $$2);
         }

         if (this.j.m.W().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, eir.a);
   }

   public Matrix4f a(double $$0) {
      eij $$1 = new eij();
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

   public static float a(bfz $$0, float $$1) {
      bfa $$2 = $$0.b(bfc.p);
      return !$$2.a(200) ? 1.0F : 0.7F + apa.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(float $$0, long $$1, boolean $$2) {
      if (!this.j.aB() && this.j.m.n && (!this.j.m.U().c() || !this.j.n.d())) {
         if (ac.b() - this.y > 500L) {
            this.j.c(false);
         }
      } else {
         this.y = ac.b();
      }

      if (!this.j.y) {
         int $$3 = (int)(this.j.n.e() * (double)this.j.aM().o() / (double)this.j.aM().m());
         int $$4 = (int)(this.j.n.f() * (double)this.j.aM().p() / (double)this.j.aM().n());
         RenderSystem.viewport(0, 0, this.j.aM().k(), this.j.aM().l());
         if ($$2 && this.j.s != null) {
            this.j.aG().a("level");
            this.a($$0, $$1, new eij());
            this.ay();
            this.j.f.b();
            if (this.J != null && this.M) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.J.a($$0);
            }

            this.j.f().a(true);
         }

         ehn $$5 = this.j.aM();
         RenderSystem.clear(256, enn.a);
         Matrix4f $$6 = new Matrix4f().setOrtho(0.0F, (float)((double)$$5.k() / $$5.s()), (float)((double)$$5.l() / $$5.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$6, eir.b);
         eij $$7 = RenderSystem.getModelViewStack();
         $$7.a();
         $$7.e();
         $$7.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         ehf.b();
         eox $$8 = new eox(this.j, this.o.b());
         if ($$2 && this.j.s != null) {
            this.j.aG().b("gui");
            if (this.j.t != null) {
               float $$9 = apa.i($$0, this.j.t.cu, this.j.t.ct);
               float $$10 = this.j.m.ae().c().floatValue();
               if ($$9 > 0.0F && this.j.t.a(bfc.i) && $$10 < 1.0F) {
                  this.a($$8, $$9 * (1.0F - $$10));
               }
            }

            if (!this.j.m.Z || this.j.z != null) {
               this.a(this.j.aM().o(), this.j.aM().p(), $$0);
               this.j.l.a($$8, $$0);
               RenderSystem.clear(256, enn.a);
            }

            this.j.aG().c();
         }

         if (this.j.aJ() != null) {
            try {
               this.j.aJ().a($$8, $$3, $$4, this.j.aw());
            } catch (Throwable var16) {
               o $$12 = o.a(var16, "Rendering overlay");
               p $$13 = $$12.a("Overlay render details");
               $$13.a("Overlay name", () -> this.j.aJ().getClass().getCanonicalName());
               throw new y($$12);
            }
         } else if (this.j.z != null) {
            try {
               this.j.z.b($$8, $$3, $$4, this.j.aw());
            } catch (Throwable var15) {
               o $$15 = o.a(var15, "Rendering screen");
               p $$16 = $$15.a("Screen render details");
               $$16.a("Screen name", () -> this.j.z.getClass().getCanonicalName());
               $$16.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", $$3, $$4, this.j.n.e(), this.j.n.f()));
               $$16.a(
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
               throw new y($$15);
            }

            try {
               if (this.j.z != null) {
                  this.j.z.y();
               }
            } catch (Throwable var14) {
               o $$18 = o.a(var14, "Narrating screen");
               p $$19 = $$18.a("Screen details");
               $$19.a("Screen name", () -> this.j.z.getClass().getCanonicalName());
               throw new y($$18);
            }
         }

         this.j.aG().a("toasts");
         this.j.az().a($$8);
         this.j.aG().c();
         $$8.e();
         $$7.b();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void ay() {
      if (!this.x && this.j.Q()) {
         long $$0 = ac.b();
         if ($$0 - this.w >= 1000L) {
            this.w = $$0;
            fyp $$1 = this.j.S();
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
         ehk $$1 = eny.a(this.j.f());
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

            try (ehk $$6 = new ehk(64, 64, false)) {
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
         bfj $$0 = this.j.al();
         boolean $$1 = $$0 instanceof byo && !this.j.m.Z;
         if ($$1 && !((byo)$$0).fO().e) {
            cfz $$2 = ((bfz)$$0).eO();
            eeg $$3 = this.j.w;
            if ($$3 != null && $$3.c() == eeg.a.b) {
               gu $$4 = ((eee)$$3).a();
               dcb $$5 = this.j.s.a_($$4);
               if (this.j.r.l() == cmj.d) {
                  $$1 = $$5.b(this.j.s, $$4) != null;
               } else {
                  dcf $$6 = new dcf(this.j.s, $$4, false);
                  hr<cpn> $$7 = this.j.s.B_().d(jc.e);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, eij $$2) {
      this.z.a($$0);
      if (this.j.al() == null) {
         this.j.a(this.j.t);
      }

      this.a($$0);
      this.j.aG().a("center");
      boolean $$3 = this.az();
      this.j.aG().b("camera");
      emz $$4 = this.N;
      this.m = (float)(this.j.m.ax() * 16);
      eij $$5 = new eij();
      double $$6 = this.a($$4, $$0, true);
      $$5.a(this.a($$6));
      this.a($$5, $$0);
      if (this.j.m.W().c()) {
         this.b($$5, $$0);
      }

      float $$7 = this.j.m.ae().c().floatValue();
      float $$8 = apa.i($$0, this.j.t.cu, this.j.t.ct) * $$7 * $$7;
      if ($$8 > 0.0F) {
         int $$9 = this.j.t.a(bfc.i) ? 7 : 20;
         float $$10 = 5.0F / ($$8 * $$8 + 5.0F) - $$8 * 0.04F;
         $$10 *= $$10;
         a $$11 = a.of(new Vector3f(0.0F, apa.g / 2.0F, apa.g / 2.0F));
         $$5.a($$11.rotationDegrees(((float)this.p + $$0) * (float)$$9));
         $$5.b(1.0F / $$10, 1.0F, 1.0F);
         float $$12 = -((float)this.p + $$0) * (float)$$9;
         $$5.a($$11.rotationDegrees($$12));
      }

      Matrix4f $$13 = $$5.c().a();
      this.a($$13);
      $$4.a(this.j.s, (bfj)(this.j.al() == null ? this.j.t : this.j.al()), !this.j.m.au().a(), this.j.m.au().b(), $$0);
      $$2.a(a.b.rotationDegrees($$4.d()));
      $$2.a(a.d.rotationDegrees($$4.e() + 180.0F));
      Matrix3f $$14 = new Matrix3f($$2.c().b()).invert();
      RenderSystem.setInverseViewRotationMatrix($$14);
      this.j.f.a($$2, $$4.b(), this.a(Math.max($$6, (double)this.j.m.ac().c().intValue())));
      this.j.f.a($$2, $$0, $$1, $$3, $$4, this, this.z, $$13);
      this.j.aG().b("hand");
      if (this.u) {
         RenderSystem.clear(256, enn.a);
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

   public eoy j() {
      return this.n;
   }

   public void a(cfz $$0) {
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
         eij $$11 = new eij();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * apa.e(apa.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * apa.e(apa.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * apa.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * apa.e(apa.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * apa.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * apa.b($$4 * 8.0F)));
         fjx.a $$13 = this.o.b();
         this.j.ap().a(this.F, cfw.i, 15728880, fum.d, $$11, $$13, this.j.s, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(eox $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = apa.i($$1, 2.0F, 1.0F);
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

   public enn k() {
      return this.j;
   }

   public float b(float $$0) {
      return apa.i($$0, this.t, this.s);
   }

   public float l() {
      return this.m;
   }

   public emz m() {
      return this.N;
   }

   public fjw n() {
      return this.z;
   }

   public fum o() {
      return this.A;
   }

   @Nullable
   public static fki p() {
      return P;
   }

   @Nullable
   public static fki q() {
      return Q;
   }

   @Nullable
   public static fki r() {
      return R;
   }

   @Nullable
   public static fki s() {
      return S;
   }

   @Nullable
   public static fki t() {
      return T;
   }

   @Nullable
   public static fki u() {
      return U;
   }

   @Nullable
   public static fki v() {
      return V;
   }

   @Nullable
   public static fki w() {
      return W;
   }

   @Nullable
   public static fki x() {
      return X;
   }

   @Nullable
   public static fki y() {
      return Y;
   }

   @Nullable
   public static fki z() {
      return Z;
   }

   @Nullable
   public static fki A() {
      return aa;
   }

   @Nullable
   public static fki B() {
      return ab;
   }

   @Nullable
   public static fki C() {
      return ac;
   }

   @Nullable
   public static fki D() {
      return ad;
   }

   @Nullable
   public static fki E() {
      return ae;
   }

   @Nullable
   public static fki F() {
      return af;
   }

   @Nullable
   public static fki G() {
      return ag;
   }

   @Nullable
   public static fki H() {
      return ah;
   }

   @Nullable
   public static fki I() {
      return ai;
   }

   @Nullable
   public static fki J() {
      return aj;
   }

   @Nullable
   public static fki K() {
      return ak;
   }

   @Nullable
   public static fki L() {
      return al;
   }

   @Nullable
   public static fki M() {
      return am;
   }

   @Nullable
   public static fki N() {
      return an;
   }

   @Nullable
   public static fki O() {
      return ao;
   }

   @Nullable
   public static fki P() {
      return ap;
   }

   @Nullable
   public static fki Q() {
      return aq;
   }

   @Nullable
   public static fki R() {
      return ar;
   }

   @Nullable
   public static fki S() {
      return as;
   }

   @Nullable
   public static fki T() {
      return at;
   }

   @Nullable
   public static fki U() {
      return au;
   }

   @Nullable
   public static fki V() {
      return av;
   }

   @Nullable
   public static fki W() {
      return aw;
   }

   @Nullable
   public static fki X() {
      return ax;
   }

   @Nullable
   public static fki Y() {
      return ay;
   }

   @Nullable
   public static fki Z() {
      return az;
   }

   @Nullable
   public static fki aa() {
      return aA;
   }

   @Nullable
   public static fki ab() {
      return aB;
   }

   @Nullable
   public static fki ac() {
      return aC;
   }

   @Nullable
   public static fki ad() {
      return aD;
   }

   @Nullable
   public static fki ae() {
      return aE;
   }

   @Nullable
   public static fki af() {
      return aF;
   }

   @Nullable
   public static fki ag() {
      return aG;
   }

   @Nullable
   public static fki ah() {
      return aH;
   }

   @Nullable
   public static fki ai() {
      return aI;
   }

   @Nullable
   public static fki aj() {
      return aJ;
   }

   @Nullable
   public static fki ak() {
      return aK;
   }

   @Nullable
   public static fki al() {
      return aL;
   }

   @Nullable
   public static fki am() {
      return aM;
   }

   @Nullable
   public static fki an() {
      return aN;
   }

   @Nullable
   public static fki ao() {
      return aO;
   }

   @Nullable
   public static fki ap() {
      return aP;
   }

   @Nullable
   public static fki aq() {
      return aQ;
   }

   @Nullable
   public static fki ar() {
      return aR;
   }

   @Nullable
   public static fki as() {
      return aS;
   }

   @Nullable
   public static fki at() {
      return aT;
   }

   @Nullable
   public static fki au() {
      return aU;
   }

   @Nullable
   public static fki av() {
      return aV;
   }

   public static record a(ala a, Map<acq, akv> b) implements ala {
      @Override
      public Optional<akv> getResource(acq $$0) {
         akv $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
