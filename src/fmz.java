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

public class fmz implements AutoCloseable {
   private static final aep f = new aep("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   final eqn j;
   private final ank k;
   private final art l = art.a();
   private float m;
   public final fnc b;
   private final erz n;
   private final fnm o;
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
   private final fnf z;
   private final fxx A = new fxx();
   private boolean B;
   private float C = 1.0F;
   private float D;
   private float E;
   public static final int c = 40;
   @Nullable
   private ciw F;
   private int G;
   private float H;
   private float I;
   @Nullable
   fnj J;
   static final aep[] K = new aep[]{
      new aep("shaders/post/notch.json"),
      new aep("shaders/post/fxaa.json"),
      new aep("shaders/post/art.json"),
      new aep("shaders/post/bumpy.json"),
      new aep("shaders/post/blobs2.json"),
      new aep("shaders/post/pencil.json"),
      new aep("shaders/post/color_convolve.json"),
      new aep("shaders/post/deconverge.json"),
      new aep("shaders/post/flip.json"),
      new aep("shaders/post/invert.json"),
      new aep("shaders/post/ntsc.json"),
      new aep("shaders/post/outline.json"),
      new aep("shaders/post/phosphor.json"),
      new aep("shaders/post/scan_pincushion.json"),
      new aep("shaders/post/sobel.json"),
      new aep("shaders/post/bits.json"),
      new aep("shaders/post/desaturate.json"),
      new aep("shaders/post/green.json"),
      new aep("shaders/post/blur.json"),
      new aep("shaders/post/wobble.json"),
      new aep("shaders/post/blobs.json"),
      new aep("shaders/post/antialias.json"),
      new aep("shaders/post/creeper.json"),
      new aep("shaders/post/spider.json")
   };
   public static final int d = K.length;
   int L = d;
   private boolean M;
   private final epy N = new epy();
   public fnt e;
   private final Map<String, fnt> O = Maps.newHashMap();
   @Nullable
   private static fnt P;
   @Nullable
   private static fnt Q;
   @Nullable
   private static fnt R;
   @Nullable
   private static fnt S;
   @Nullable
   private static fnt T;
   @Nullable
   private static fnt U;
   @Nullable
   private static fnt V;
   @Nullable
   private static fnt W;
   @Nullable
   private static fnt X;
   @Nullable
   private static fnt Y;
   @Nullable
   private static fnt Z;
   @Nullable
   private static fnt aa;
   @Nullable
   private static fnt ab;
   @Nullable
   private static fnt ac;
   @Nullable
   private static fnt ad;
   @Nullable
   private static fnt ae;
   @Nullable
   private static fnt af;
   @Nullable
   private static fnt ag;
   @Nullable
   private static fnt ah;
   @Nullable
   private static fnt ai;
   @Nullable
   private static fnt aj;
   @Nullable
   private static fnt ak;
   @Nullable
   private static fnt al;
   @Nullable
   private static fnt am;
   @Nullable
   private static fnt an;
   @Nullable
   private static fnt ao;
   @Nullable
   private static fnt ap;
   @Nullable
   private static fnt aq;
   @Nullable
   private static fnt ar;
   @Nullable
   private static fnt as;
   @Nullable
   private static fnt at;
   @Nullable
   private static fnt au;
   @Nullable
   private static fnt av;
   @Nullable
   private static fnt aw;
   @Nullable
   private static fnt ax;
   @Nullable
   private static fnt ay;
   @Nullable
   private static fnt az;
   @Nullable
   private static fnt aA;
   @Nullable
   private static fnt aB;
   @Nullable
   private static fnt aC;
   @Nullable
   private static fnt aD;
   @Nullable
   private static fnt aE;
   @Nullable
   private static fnt aF;
   @Nullable
   private static fnt aG;
   @Nullable
   private static fnt aH;
   @Nullable
   private static fnt aI;
   @Nullable
   private static fnt aJ;
   @Nullable
   private static fnt aK;
   @Nullable
   private static fnt aL;
   @Nullable
   private static fnt aM;
   @Nullable
   private static fnt aN;
   @Nullable
   private static fnt aO;
   @Nullable
   private static fnt aP;
   @Nullable
   private static fnt aQ;
   @Nullable
   private static fnt aR;
   @Nullable
   private static fnt aS;
   @Nullable
   private static fnt aT;
   @Nullable
   private static fnt aU;
   @Nullable
   private static fnt aV;

   public fmz(eqn $$0, fnc $$1, ank $$2, fnm $$3) {
      this.j = $$0;
      this.k = $$2;
      this.b = $$1;
      this.n = new erz($$0.X());
      this.z = new fnf(this, $$0);
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

   public void a(@Nullable big $$0) {
      if (this.J != null) {
         this.J.close();
      }

      this.J = null;
      if ($$0 instanceof byl) {
         this.a(new aep("shaders/post/creeper.json"));
      } else if ($$0 instanceof bzk) {
         this.a(new aep("shaders/post/spider.json"));
      } else if ($$0 instanceof byp) {
         this.a(new aep("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.j.al() instanceof cbl) {
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

   void a(aep $$0) {
      if (this.J != null) {
         this.J.close();
      }

      try {
         this.J = new fnj(this.j.X(), this.k, this.j.f(), $$0);
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

   public ane e() {
      return new anp<fmz.a>() {
         protected fmz.a a(ank $$0, bde $$1) {
            Map<aep, ani> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(ekv.a.b.b()) || $$1x.endsWith(ekv.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<aep, ani> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new ani($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fmz.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fmz.a($$0, $$3);
         }

         protected void a(fmz.a $$0, ank $$1, bde $$2) {
            fmz.this.b($$0);
            if (fmz.this.J != null) {
               fmz.this.J.close();
            }

            fmz.this.J = null;
            if (fmz.this.L == fmz.d) {
               fmz.this.a(fmz.this.j.al());
            } else {
               fmz.this.a(fmz.K[fmz.this.L]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(ann $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new fnt($$0, "blit_screen", elf.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aS = this.a($$0, "rendertype_gui", elf.n);
         aT = this.a($$0, "rendertype_gui_overlay", elf.n);
         P = this.a($$0, "position", elf.m);
         Q = this.a($$0, "position_color", elf.n);
         R = this.a($$0, "position_color_tex", elf.r);
         S = this.a($$0, "position_tex", elf.q);
         T = this.a($$0, "position_tex_color", elf.s);
         aG = this.a($$0, "rendertype_text", elf.t);
      }
   }

   private fnt a(ann $$0, String $$1, elm $$2) {
      try {
         fnt $$3 = new fnt($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(ann $$0) {
      RenderSystem.assertOnRenderThread();
      List<ekv> $$1 = Lists.newArrayList();
      $$1.addAll(ekv.a.b.c().values());
      $$1.addAll(ekv.a.a.c().values());
      $$1.forEach(ekv::a);
      List<Pair<fnt, Consumer<fnt>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new fnt($$0, "particle", elf.l), (Consumer<fnt>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new fnt($$0, "position", elf.m), (Consumer<fnt>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new fnt($$0, "position_color", elf.n), (Consumer<fnt>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new fnt($$0, "position_color_lightmap", elf.p), (Consumer<fnt>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new fnt($$0, "position_color_tex", elf.r), (Consumer<fnt>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new fnt($$0, "position_color_tex_lightmap", elf.t), (Consumer<fnt>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new fnt($$0, "position_tex", elf.q), (Consumer<fnt>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new fnt($$0, "position_tex_color", elf.s), (Consumer<fnt>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new fnt($$0, "position_tex_color_normal", elf.v), (Consumer<fnt>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new fnt($$0, "position_tex_lightmap_color", elf.u), (Consumer<fnt>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_solid", elf.j), (Consumer<fnt>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_cutout_mipped", elf.j), (Consumer<fnt>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_cutout", elf.j), (Consumer<fnt>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_translucent", elf.j), (Consumer<fnt>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_translucent_moving_block", elf.j), (Consumer<fnt>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_translucent_no_crumbling", elf.j), (Consumer<fnt>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_armor_cutout_no_cull", elf.k), (Consumer<fnt>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_entity_solid", elf.k), (Consumer<fnt>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_entity_cutout", elf.k), (Consumer<fnt>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_entity_cutout_no_cull", elf.k), (Consumer<fnt>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_entity_cutout_no_cull_z_offset", elf.k), (Consumer<fnt>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_item_entity_translucent_cull", elf.k), (Consumer<fnt>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_entity_translucent_cull", elf.k), (Consumer<fnt>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_entity_translucent", elf.k), (Consumer<fnt>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_entity_translucent_emissive", elf.k), (Consumer<fnt>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_entity_smooth_cutout", elf.k), (Consumer<fnt>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_beacon_beam", elf.j), (Consumer<fnt>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_entity_decal", elf.k), (Consumer<fnt>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_entity_no_outline", elf.k), (Consumer<fnt>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_entity_shadow", elf.k), (Consumer<fnt>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_entity_alpha", elf.k), (Consumer<fnt>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_eyes", elf.k), (Consumer<fnt>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_energy_swirl", elf.k), (Consumer<fnt>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_leash", elf.p), (Consumer<fnt>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_water_mask", elf.m), (Consumer<fnt>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_outline", elf.r), (Consumer<fnt>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_armor_glint", elf.q), (Consumer<fnt>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_armor_entity_glint", elf.q), (Consumer<fnt>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_glint_translucent", elf.q), (Consumer<fnt>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_glint", elf.q), (Consumer<fnt>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_glint_direct", elf.q), (Consumer<fnt>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_entity_glint", elf.q), (Consumer<fnt>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_entity_glint_direct", elf.q), (Consumer<fnt>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_text", elf.t), (Consumer<fnt>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_text_background", elf.p), (Consumer<fnt>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_text_intensity", elf.t), (Consumer<fnt>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_text_see_through", elf.t), (Consumer<fnt>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_text_background_see_through", elf.p), (Consumer<fnt>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_text_intensity_see_through", elf.t), (Consumer<fnt>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_lightning", elf.n), (Consumer<fnt>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_tripwire", elf.j), (Consumer<fnt>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_end_portal", elf.m), (Consumer<fnt>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_end_gateway", elf.m), (Consumer<fnt>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_lines", elf.o), (Consumer<fnt>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_crumbling", elf.j), (Consumer<fnt>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_gui", elf.n), (Consumer<fnt>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_gui_overlay", elf.n), (Consumer<fnt>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_gui_text_highlight", elf.n), (Consumer<fnt>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new fnt($$0, "rendertype_gui_ghost_recipe_overlay", elf.n), (Consumer<fnt>)$$0x -> aV = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((fnt)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.aw();
      $$2.forEach($$0x -> {
         fnt $$1x = (fnt)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void aw() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(fnt::close);
      this.O.clear();
   }

   @Nullable
   public fnt a(@Nullable String $$0) {
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
   public fnj g() {
      return this.J;
   }

   public void a(int $$0, int $$1) {
      if (this.J != null) {
         this.J.a($$0, $$1);
      }

      this.j.f.a($$0, $$1);
   }

   public void a(float $$0) {
      big $$1 = this.j.al();
      if ($$1 != null) {
         if (this.j.s != null) {
            this.j.aG().a("pick");
            this.j.v = null;
            double $$2 = (double)this.j.r.c();
            this.j.w = $$1.a($$2, $$0, false);
            ehf $$3 = $$1.j($$0);
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

            ehf $$7 = $$1.f(1.0F);
            ehf $$8 = $$3.b($$7.c * $$2, $$7.d * $$2, $$7.e * $$2);
            float $$9 = 1.0F;
            eha $$10 = $$1.cG().b($$7.a($$2)).c(1.0, 1.0, 1.0);
            ehc $$11 = cce.a($$1, $$3, $$8, $$10, $$0x -> !$$0x.G_() && $$0x.br(), $$6);
            if ($$11 != null) {
               big $$12 = $$11.a();
               ehf $$13 = $$11.e();
               double $$14 = $$3.g($$13);
               if ($$4 && $$14 > 9.0) {
                  this.j.w = ehb.a($$13, hb.a($$7.c, $$7.d, $$7.e), gv.a($$13));
               } else if ($$14 < $$6 || this.j.w == null) {
                  this.j.w = $$11;
                  if ($$12 instanceof biw || $$12 instanceof bxx) {
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
      if (this.j.al() instanceof fmf) {
         fmf $$1 = (fmf)this.j.al();
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

   private double a(epy $$0, float $$1, boolean $$2) {
      if (this.B) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.j.m.ac().c().intValue();
            $$3 *= (double)aro.i($$1, this.r, this.q);
         }

         if ($$0.g() instanceof biw && ((biw)$$0.g()).eu()) {
            float $$4 = Math.min((float)((biw)$$0.g()).aM + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         ead $$5 = $$0.k();
         if ($$5 == ead.a || $$5 == ead.b) {
            $$3 *= aro.d(this.j.m.af().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(elh $$0, float $$1) {
      if (this.j.al() instanceof biw) {
         biw $$2 = (biw)this.j.al();
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.eu()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = aro.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eD();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.j.m.aj().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(elh $$0, float $$1) {
      if (this.j.al() instanceof cbl) {
         cbl $$2 = (cbl)this.j.al();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = aro.i($$1, $$2.bT, $$2.bU);
         $$0.a(aro.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(aro.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(aro.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(aro.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.C = $$0;
      this.D = $$1;
      this.E = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new elh());
      this.C = 1.0F;
   }

   private void a(elh $$0, epy $$1, float $$2) {
      if (!this.B) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.j.m.W().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.j.al() instanceof biw && ((biw)this.j.al()).fB();
         if (this.j.m.au().a() && !$$3 && !this.j.m.Z && this.j.r.l() != cph.d) {
            this.z.c();
            this.b.a($$2, $$0, this.o.b(), this.j.t, this.j.an().a(this.j.t, $$2));
            this.z.b();
         }

         $$0.b();
         if (this.j.m.au().a() && !$$3) {
            fnq.a(this.j, $$0);
            this.a($$0, $$2);
         }

         if (this.j.m.W().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, elp.a);
   }

   public Matrix4f a(double $$0) {
      elh $$1 = new elh();
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

   public static float a(biw $$0, float $$1) {
      bht $$2 = $$0.b(bhv.p);
      return !$$2.a(200) ? 1.0F : 0.7F + aro.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(float $$0, long $$1, boolean $$2) {
      if (!this.j.aA() && this.j.m.n && (!this.j.m.U().c() || !this.j.n.d())) {
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
            this.a($$0, $$1, new elh());
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

         ekl $$5 = this.j.aM();
         RenderSystem.clear(256, eqn.a);
         Matrix4f $$6 = new Matrix4f().setOrtho(0.0F, (float)((double)$$5.k() / $$5.s()), (float)((double)$$5.l() / $$5.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$6, elp.b);
         elh $$7 = RenderSystem.getModelViewStack();
         $$7.a();
         $$7.e();
         $$7.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         ekd.b();
         erx $$8 = new erx(this.j, this.o.b());
         if ($$2 && this.j.s != null) {
            this.j.aG().b("gui");
            if (this.j.t != null) {
               float $$9 = aro.i($$0, this.j.t.cu, this.j.t.ct);
               float $$10 = this.j.m.ae().c().floatValue();
               if ($$9 > 0.0F && this.j.t.a(bhv.i) && $$10 < 1.0F) {
                  this.a($$8, $$9 * (1.0F - $$10));
               }
            }

            if (!this.j.m.Z || this.j.z != null) {
               this.a(this.j.aM().o(), this.j.aM().p(), $$0);
               this.j.l.a($$8, $$0);
               RenderSystem.clear(256, eqn.a);
            }

            this.j.aG().c();
         }

         if (this.j.aJ() != null) {
            try {
               this.j.aJ().a($$8, $$3, $$4, this.j.av());
            } catch (Throwable var16) {
               o $$12 = o.a(var16, "Rendering overlay");
               p $$13 = $$12.a("Overlay render details");
               $$13.a("Overlay name", () -> this.j.aJ().getClass().getCanonicalName());
               throw new y($$12);
            }
         } else if (this.j.z != null) {
            try {
               this.j.z.c($$8, $$3, $$4, this.j.av());
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
         this.j.ay().a($$8);
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
            gcf $$1 = this.j.S();
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
         eki $$1 = eqy.a(this.j.f());
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

            try (eki $$6 = new eki(64, 64, false)) {
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
         big $$0 = this.j.al();
         boolean $$1 = $$0 instanceof cbl && !this.j.m.Z;
         if ($$1 && !((cbl)$$0).fR().e) {
            ciw $$2 = ((biw)$$0).eR();
            ehd $$3 = this.j.w;
            if ($$3 != null && $$3.c() == ehd.a.b) {
               gv $$4 = ((ehb)$$3).a();
               dey $$5 = this.j.s.a_($$4);
               if (this.j.r.l() == cph.d) {
                  $$1 = $$5.b(this.j.s, $$4) != null;
               } else {
                  dfc $$6 = new dfc(this.j.s, $$4, false);
                  hs<csk> $$7 = this.j.s.B_().d(jd.e);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, elh $$2) {
      this.z.a($$0);
      if (this.j.al() == null) {
         this.j.a(this.j.t);
      }

      this.a($$0);
      this.j.aG().a("center");
      boolean $$3 = this.az();
      this.j.aG().b("camera");
      epy $$4 = this.N;
      this.m = (float)(this.j.m.ax() * 16);
      elh $$5 = new elh();
      double $$6 = this.a($$4, $$0, true);
      $$5.a(this.a($$6));
      this.a($$5, $$0);
      if (this.j.m.W().c()) {
         this.b($$5, $$0);
      }

      float $$7 = this.j.m.ae().c().floatValue();
      float $$8 = aro.i($$0, this.j.t.cu, this.j.t.ct) * $$7 * $$7;
      if ($$8 > 0.0F) {
         int $$9 = this.j.t.a(bhv.i) ? 7 : 20;
         float $$10 = 5.0F / ($$8 * $$8 + 5.0F) - $$8 * 0.04F;
         $$10 *= $$10;
         a $$11 = a.of(new Vector3f(0.0F, aro.g / 2.0F, aro.g / 2.0F));
         $$5.a($$11.rotationDegrees(((float)this.p + $$0) * (float)$$9));
         $$5.b(1.0F / $$10, 1.0F, 1.0F);
         float $$12 = -((float)this.p + $$0) * (float)$$9;
         $$5.a($$11.rotationDegrees($$12));
      }

      Matrix4f $$13 = $$5.c().a();
      this.a($$13);
      $$4.a(this.j.s, (big)(this.j.al() == null ? this.j.t : this.j.al()), !this.j.m.au().a(), this.j.m.au().b(), $$0);
      $$2.a(a.b.rotationDegrees($$4.d()));
      $$2.a(a.d.rotationDegrees($$4.e() + 180.0F));
      Matrix3f $$14 = new Matrix3f($$2.c().b()).invert();
      RenderSystem.setInverseViewRotationMatrix($$14);
      this.j.f.a($$2, $$4.b(), this.a(Math.max($$6, (double)this.j.m.ac().c().intValue())));
      this.j.f.a($$2, $$0, $$1, $$3, $$4, this, this.z, $$13);
      this.j.aG().b("hand");
      if (this.u) {
         RenderSystem.clear(256, eqn.a);
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

   public erz j() {
      return this.n;
   }

   public void a(ciw $$0) {
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
         elh $$11 = new elh();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * aro.e(aro.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * aro.e(aro.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * aro.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * aro.e(aro.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * aro.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * aro.b($$4 * 8.0F)));
         fng.a $$13 = this.o.b();
         this.j.ap().a(this.F, cit.i, 15728880, fxx.d, $$11, $$13, this.j.s, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(erx $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = aro.i($$1, 2.0F, 1.0F);
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

   public eqn k() {
      return this.j;
   }

   public float b(float $$0) {
      return aro.i($$0, this.t, this.s);
   }

   public float l() {
      return this.m;
   }

   public epy m() {
      return this.N;
   }

   public fnf n() {
      return this.z;
   }

   public fxx o() {
      return this.A;
   }

   @Nullable
   public static fnt p() {
      return P;
   }

   @Nullable
   public static fnt q() {
      return Q;
   }

   @Nullable
   public static fnt r() {
      return R;
   }

   @Nullable
   public static fnt s() {
      return S;
   }

   @Nullable
   public static fnt t() {
      return T;
   }

   @Nullable
   public static fnt u() {
      return U;
   }

   @Nullable
   public static fnt v() {
      return V;
   }

   @Nullable
   public static fnt w() {
      return W;
   }

   @Nullable
   public static fnt x() {
      return X;
   }

   @Nullable
   public static fnt y() {
      return Y;
   }

   @Nullable
   public static fnt z() {
      return Z;
   }

   @Nullable
   public static fnt A() {
      return aa;
   }

   @Nullable
   public static fnt B() {
      return ab;
   }

   @Nullable
   public static fnt C() {
      return ac;
   }

   @Nullable
   public static fnt D() {
      return ad;
   }

   @Nullable
   public static fnt E() {
      return ae;
   }

   @Nullable
   public static fnt F() {
      return af;
   }

   @Nullable
   public static fnt G() {
      return ag;
   }

   @Nullable
   public static fnt H() {
      return ah;
   }

   @Nullable
   public static fnt I() {
      return ai;
   }

   @Nullable
   public static fnt J() {
      return aj;
   }

   @Nullable
   public static fnt K() {
      return ak;
   }

   @Nullable
   public static fnt L() {
      return al;
   }

   @Nullable
   public static fnt M() {
      return am;
   }

   @Nullable
   public static fnt N() {
      return an;
   }

   @Nullable
   public static fnt O() {
      return ao;
   }

   @Nullable
   public static fnt P() {
      return ap;
   }

   @Nullable
   public static fnt Q() {
      return aq;
   }

   @Nullable
   public static fnt R() {
      return ar;
   }

   @Nullable
   public static fnt S() {
      return as;
   }

   @Nullable
   public static fnt T() {
      return at;
   }

   @Nullable
   public static fnt U() {
      return au;
   }

   @Nullable
   public static fnt V() {
      return av;
   }

   @Nullable
   public static fnt W() {
      return aw;
   }

   @Nullable
   public static fnt X() {
      return ax;
   }

   @Nullable
   public static fnt Y() {
      return ay;
   }

   @Nullable
   public static fnt Z() {
      return az;
   }

   @Nullable
   public static fnt aa() {
      return aA;
   }

   @Nullable
   public static fnt ab() {
      return aB;
   }

   @Nullable
   public static fnt ac() {
      return aC;
   }

   @Nullable
   public static fnt ad() {
      return aD;
   }

   @Nullable
   public static fnt ae() {
      return aE;
   }

   @Nullable
   public static fnt af() {
      return aF;
   }

   @Nullable
   public static fnt ag() {
      return aG;
   }

   @Nullable
   public static fnt ah() {
      return aH;
   }

   @Nullable
   public static fnt ai() {
      return aI;
   }

   @Nullable
   public static fnt aj() {
      return aJ;
   }

   @Nullable
   public static fnt ak() {
      return aK;
   }

   @Nullable
   public static fnt al() {
      return aL;
   }

   @Nullable
   public static fnt am() {
      return aM;
   }

   @Nullable
   public static fnt an() {
      return aN;
   }

   @Nullable
   public static fnt ao() {
      return aO;
   }

   @Nullable
   public static fnt ap() {
      return aP;
   }

   @Nullable
   public static fnt aq() {
      return aQ;
   }

   @Nullable
   public static fnt ar() {
      return aR;
   }

   @Nullable
   public static fnt as() {
      return aS;
   }

   @Nullable
   public static fnt at() {
      return aT;
   }

   @Nullable
   public static fnt au() {
      return aU;
   }

   @Nullable
   public static fnt av() {
      return aV;
   }

   public static record a(ann a, Map<aep, ani> b) implements ann {
      @Override
      public Optional<ani> getResource(aep $$0) {
         ani $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
