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

public class fnt implements AutoCloseable {
   private static final aez f = new aez("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   final eqp j;
   private final anw k;
   private final ash l = ash.a();
   private float m;
   public final fnw b;
   private final esb n;
   private final fog o;
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
   private final fnz z;
   private final fyr A = new fyr();
   private boolean B;
   private float C = 1.0F;
   private float D;
   private float E;
   public static final int c = 40;
   @Nullable
   private cjl F;
   private int G;
   private float H;
   private float I;
   @Nullable
   fod J;
   static final aez[] K = new aez[]{
      new aez("shaders/post/notch.json"),
      new aez("shaders/post/fxaa.json"),
      new aez("shaders/post/art.json"),
      new aez("shaders/post/bumpy.json"),
      new aez("shaders/post/blobs2.json"),
      new aez("shaders/post/pencil.json"),
      new aez("shaders/post/color_convolve.json"),
      new aez("shaders/post/deconverge.json"),
      new aez("shaders/post/flip.json"),
      new aez("shaders/post/invert.json"),
      new aez("shaders/post/ntsc.json"),
      new aez("shaders/post/outline.json"),
      new aez("shaders/post/phosphor.json"),
      new aez("shaders/post/scan_pincushion.json"),
      new aez("shaders/post/sobel.json"),
      new aez("shaders/post/bits.json"),
      new aez("shaders/post/desaturate.json"),
      new aez("shaders/post/green.json"),
      new aez("shaders/post/blur.json"),
      new aez("shaders/post/wobble.json"),
      new aez("shaders/post/blobs.json"),
      new aez("shaders/post/antialias.json"),
      new aez("shaders/post/creeper.json"),
      new aez("shaders/post/spider.json")
   };
   public static final int d = K.length;
   int L = d;
   private boolean M;
   private final eqa N = new eqa();
   public fon e;
   private final Map<String, fon> O = Maps.newHashMap();
   @Nullable
   private static fon P;
   @Nullable
   private static fon Q;
   @Nullable
   private static fon R;
   @Nullable
   private static fon S;
   @Nullable
   private static fon T;
   @Nullable
   private static fon U;
   @Nullable
   private static fon V;
   @Nullable
   private static fon W;
   @Nullable
   private static fon X;
   @Nullable
   private static fon Y;
   @Nullable
   private static fon Z;
   @Nullable
   private static fon aa;
   @Nullable
   private static fon ab;
   @Nullable
   private static fon ac;
   @Nullable
   private static fon ad;
   @Nullable
   private static fon ae;
   @Nullable
   private static fon af;
   @Nullable
   private static fon ag;
   @Nullable
   private static fon ah;
   @Nullable
   private static fon ai;
   @Nullable
   private static fon aj;
   @Nullable
   private static fon ak;
   @Nullable
   private static fon al;
   @Nullable
   private static fon am;
   @Nullable
   private static fon an;
   @Nullable
   private static fon ao;
   @Nullable
   private static fon ap;
   @Nullable
   private static fon aq;
   @Nullable
   private static fon ar;
   @Nullable
   private static fon as;
   @Nullable
   private static fon at;
   @Nullable
   private static fon au;
   @Nullable
   private static fon av;
   @Nullable
   private static fon aw;
   @Nullable
   private static fon ax;
   @Nullable
   private static fon ay;
   @Nullable
   private static fon az;
   @Nullable
   private static fon aA;
   @Nullable
   private static fon aB;
   @Nullable
   private static fon aC;
   @Nullable
   private static fon aD;
   @Nullable
   private static fon aE;
   @Nullable
   private static fon aF;
   @Nullable
   private static fon aG;
   @Nullable
   private static fon aH;
   @Nullable
   private static fon aI;
   @Nullable
   private static fon aJ;
   @Nullable
   private static fon aK;
   @Nullable
   private static fon aL;
   @Nullable
   private static fon aM;
   @Nullable
   private static fon aN;
   @Nullable
   private static fon aO;
   @Nullable
   private static fon aP;
   @Nullable
   private static fon aQ;
   @Nullable
   private static fon aR;
   @Nullable
   private static fon aS;
   @Nullable
   private static fon aT;
   @Nullable
   private static fon aU;
   @Nullable
   private static fon aV;

   public fnt(eqp $$0, fnw $$1, anw $$2, fog $$3) {
      this.j = $$0;
      this.k = $$2;
      this.b = $$1;
      this.n = new esb($$0.Y());
      this.z = new fnz(this, $$0);
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

   public void a(@Nullable biw $$0) {
      if (this.J != null) {
         this.J.close();
      }

      this.J = null;
      if ($$0 instanceof bza) {
         this.a(new aez("shaders/post/creeper.json"));
      } else if ($$0 instanceof bzz) {
         this.a(new aez("shaders/post/spider.json"));
      } else if ($$0 instanceof bze) {
         this.a(new aez("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.j.am() instanceof cca) {
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

   void a(aez $$0) {
      if (this.J != null) {
         this.J.close();
      }

      try {
         this.J = new fod(this.j.Y(), this.k, this.j.g(), $$0);
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

   public anq e() {
      return new aob<fnt.a>() {
         protected fnt.a a(anw $$0, bdv $$1) {
            Map<aez, anu> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(ekx.a.b.b()) || $$1x.endsWith(ekx.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<aez, anu> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new anu($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fnt.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fnt.a($$0, $$3);
         }

         protected void a(fnt.a $$0, anw $$1, bdv $$2) {
            fnt.this.b($$0);
            if (fnt.this.J != null) {
               fnt.this.J.close();
            }

            fnt.this.J = null;
            if (fnt.this.L == fnt.d) {
               fnt.this.a(fnt.this.j.am());
            } else {
               fnt.this.a(fnt.K[fnt.this.L]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(anz $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new fon($$0, "blit_screen", elh.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aS = this.a($$0, "rendertype_gui", elh.n);
         aT = this.a($$0, "rendertype_gui_overlay", elh.n);
         P = this.a($$0, "position", elh.m);
         Q = this.a($$0, "position_color", elh.n);
         R = this.a($$0, "position_color_tex", elh.r);
         S = this.a($$0, "position_tex", elh.q);
         T = this.a($$0, "position_tex_color", elh.s);
         aG = this.a($$0, "rendertype_text", elh.t);
      }
   }

   private fon a(anz $$0, String $$1, elo $$2) {
      try {
         fon $$3 = new fon($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(anz $$0) {
      RenderSystem.assertOnRenderThread();
      List<ekx> $$1 = Lists.newArrayList();
      $$1.addAll(ekx.a.b.c().values());
      $$1.addAll(ekx.a.a.c().values());
      $$1.forEach(ekx::a);
      List<Pair<fon, Consumer<fon>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new fon($$0, "particle", elh.l), (Consumer<fon>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new fon($$0, "position", elh.m), (Consumer<fon>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new fon($$0, "position_color", elh.n), (Consumer<fon>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new fon($$0, "position_color_lightmap", elh.p), (Consumer<fon>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new fon($$0, "position_color_tex", elh.r), (Consumer<fon>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new fon($$0, "position_color_tex_lightmap", elh.t), (Consumer<fon>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new fon($$0, "position_tex", elh.q), (Consumer<fon>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new fon($$0, "position_tex_color", elh.s), (Consumer<fon>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new fon($$0, "position_tex_color_normal", elh.v), (Consumer<fon>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new fon($$0, "position_tex_lightmap_color", elh.u), (Consumer<fon>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_solid", elh.j), (Consumer<fon>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_cutout_mipped", elh.j), (Consumer<fon>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_cutout", elh.j), (Consumer<fon>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_translucent", elh.j), (Consumer<fon>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_translucent_moving_block", elh.j), (Consumer<fon>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_translucent_no_crumbling", elh.j), (Consumer<fon>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_armor_cutout_no_cull", elh.k), (Consumer<fon>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_entity_solid", elh.k), (Consumer<fon>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_entity_cutout", elh.k), (Consumer<fon>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_entity_cutout_no_cull", elh.k), (Consumer<fon>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_entity_cutout_no_cull_z_offset", elh.k), (Consumer<fon>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_item_entity_translucent_cull", elh.k), (Consumer<fon>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_entity_translucent_cull", elh.k), (Consumer<fon>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_entity_translucent", elh.k), (Consumer<fon>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_entity_translucent_emissive", elh.k), (Consumer<fon>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_entity_smooth_cutout", elh.k), (Consumer<fon>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_beacon_beam", elh.j), (Consumer<fon>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_entity_decal", elh.k), (Consumer<fon>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_entity_no_outline", elh.k), (Consumer<fon>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_entity_shadow", elh.k), (Consumer<fon>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_entity_alpha", elh.k), (Consumer<fon>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_eyes", elh.k), (Consumer<fon>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_energy_swirl", elh.k), (Consumer<fon>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_leash", elh.p), (Consumer<fon>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_water_mask", elh.m), (Consumer<fon>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_outline", elh.r), (Consumer<fon>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_armor_glint", elh.q), (Consumer<fon>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_armor_entity_glint", elh.q), (Consumer<fon>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_glint_translucent", elh.q), (Consumer<fon>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_glint", elh.q), (Consumer<fon>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_glint_direct", elh.q), (Consumer<fon>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_entity_glint", elh.q), (Consumer<fon>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_entity_glint_direct", elh.q), (Consumer<fon>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_text", elh.t), (Consumer<fon>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_text_background", elh.p), (Consumer<fon>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_text_intensity", elh.t), (Consumer<fon>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_text_see_through", elh.t), (Consumer<fon>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_text_background_see_through", elh.p), (Consumer<fon>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_text_intensity_see_through", elh.t), (Consumer<fon>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_lightning", elh.n), (Consumer<fon>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_tripwire", elh.j), (Consumer<fon>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_end_portal", elh.m), (Consumer<fon>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_end_gateway", elh.m), (Consumer<fon>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_lines", elh.o), (Consumer<fon>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_crumbling", elh.j), (Consumer<fon>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_gui", elh.n), (Consumer<fon>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_gui_overlay", elh.n), (Consumer<fon>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_gui_text_highlight", elh.n), (Consumer<fon>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new fon($$0, "rendertype_gui_ghost_recipe_overlay", elh.n), (Consumer<fon>)$$0x -> aV = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((fon)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.aw();
      $$2.forEach($$0x -> {
         fon $$1x = (fon)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void aw() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(fon::close);
      this.O.clear();
   }

   @Nullable
   public fon a(@Nullable String $$0) {
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
   public fod g() {
      return this.J;
   }

   public void a(int $$0, int $$1) {
      if (this.J != null) {
         this.J.a($$0, $$1);
      }

      this.j.f.a($$0, $$1);
   }

   public void a(float $$0) {
      biw $$1 = this.j.am();
      if ($$1 != null) {
         if (this.j.r != null) {
            this.j.aG().a("pick");
            this.j.u = null;
            double $$2 = (double)this.j.q.c();
            this.j.v = $$1.a($$2, $$0, false);
            ehh $$3 = $$1.j($$0);
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

            ehh $$7 = $$1.f(1.0F);
            ehh $$8 = $$3.b($$7.c * $$2, $$7.d * $$2, $$7.e * $$2);
            float $$9 = 1.0F;
            ehc $$10 = $$1.cG().b($$7.a($$2)).c(1.0, 1.0, 1.0);
            ehe $$11 = cct.a($$1, $$3, $$8, $$10, $$0x -> !$$0x.M_() && $$0x.br(), $$6);
            if ($$11 != null) {
               biw $$12 = $$11.a();
               ehh $$13 = $$11.e();
               double $$14 = $$3.g($$13);
               if ($$4 && $$14 > 9.0) {
                  this.j.v = ehd.a($$13, ha.a($$7.c, $$7.d, $$7.e), gw.a($$13));
               } else if ($$14 < $$6 || this.j.v == null) {
                  this.j.v = $$11;
                  if ($$12 instanceof bjm || $$12 instanceof bym) {
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
      if (this.j.am() instanceof fmz $$1) {
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

   private double a(eqa $$0, float $$1, boolean $$2) {
      if (this.B) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.j.m.ad().c().intValue();
            $$3 *= (double)asb.i($$1, this.r, this.q);
         }

         if ($$0.g() instanceof bjm && ((bjm)$$0.g()).ev()) {
            float $$4 = Math.min((float)((bjm)$$0.g()).aM + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         eai $$5 = $$0.k();
         if ($$5 == eai.a || $$5 == eai.b) {
            $$3 *= asb.d(this.j.m.ag().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(elj $$0, float $$1) {
      if (this.j.am() instanceof bjm $$2) {
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.ev()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = asb.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eD();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.j.m.ak().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(elj $$0, float $$1) {
      if (this.j.am() instanceof cca) {
         cca $$2 = (cca)this.j.am();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = asb.i($$1, $$2.bV, $$2.bW);
         $$0.a(asb.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(asb.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(asb.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(asb.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.C = $$0;
      this.D = $$1;
      this.E = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new elj());
      this.C = 1.0F;
   }

   private void a(elj $$0, eqa $$1, float $$2) {
      if (!this.B) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.j.m.X().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.j.am() instanceof bjm && ((bjm)this.j.am()).fD();
         if (this.j.m.aw().a() && !$$3 && !this.j.m.Z && this.j.q.l() != cpy.d) {
            this.z.c();
            this.b.a($$2, $$0, this.o.b(), this.j.s, this.j.ao().a(this.j.s, $$2));
            this.z.b();
         }

         $$0.b();
         if (this.j.m.aw().a() && !$$3) {
            fok.a(this.j, $$0);
            this.a($$0, $$2);
         }

         if (this.j.m.X().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, elr.a);
   }

   public Matrix4f a(double $$0) {
      elj $$1 = new elj();
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

   public static float a(bjm $$0, float $$1) {
      bij $$2 = $$0.b(bil.p);
      return !$$2.a(200) ? 1.0F : 0.7F + asb.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
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
            this.a($$0, $$1, new elj());
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

         ekn $$6 = this.j.aM();
         RenderSystem.clear(256, eqp.a);
         Matrix4f $$7 = new Matrix4f().setOrtho(0.0F, (float)((double)$$6.k() / $$6.s()), (float)((double)$$6.l() / $$6.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$7, elr.b);
         elj $$8 = RenderSystem.getModelViewStack();
         $$8.a();
         $$8.e();
         $$8.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         ekf.b();
         erz $$9 = new erz(this.j, this.o.b());
         if ($$3 && $$2 && this.j.r != null) {
            this.j.aG().b("gui");
            if (this.j.s != null) {
               float $$10 = asb.i($$0, this.j.s.cw, this.j.s.cv);
               float $$11 = this.j.m.af().c().floatValue();
               if ($$10 > 0.0F && this.j.s.a(bil.i) && $$11 < 1.0F) {
                  this.a($$9, $$10 * (1.0F - $$11));
               }
            }

            if (!this.j.m.Z || this.j.y != null) {
               this.a(this.j.aM().o(), this.j.aM().p(), $$0);
               this.j.l.a($$9, $$0);
               RenderSystem.clear(256, eqp.a);
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
            gcz $$1 = this.j.T();
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
         ekk $$1 = era.a(this.j.g());
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

            try (ekk $$6 = new ekk(64, 64, false)) {
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
         biw $$0 = this.j.am();
         boolean $$1 = $$0 instanceof cca && !this.j.m.Z;
         if ($$1 && !((cca)$$0).fT().e) {
            cjl $$2 = ((bjm)$$0).eS();
            ehf $$3 = this.j.v;
            if ($$3 != null && $$3.c() == ehf.a.b) {
               gw $$4 = ((ehd)$$3).a();
               dfd $$5 = this.j.r.a_($$4);
               if (this.j.q.l() == cpy.d) {
                  $$1 = $$5.b(this.j.r, $$4) != null;
               } else {
                  dfh $$6 = new dfh(this.j.r, $$4, false);
                  hq<ctc> $$7 = this.j.r.G_().d(jc.e);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, elj $$2) {
      this.z.a($$0);
      if (this.j.am() == null) {
         this.j.a(this.j.s);
      }

      this.a($$0);
      this.j.aG().a("center");
      boolean $$3 = this.az();
      this.j.aG().b("camera");
      eqa $$4 = this.N;
      this.m = (float)(this.j.m.az() * 16);
      elj $$5 = new elj();
      double $$6 = this.a($$4, $$0, true);
      $$5.a(this.a($$6));
      this.a($$5, $$0);
      if (this.j.m.X().c()) {
         this.b($$5, $$0);
      }

      float $$7 = this.j.m.af().c().floatValue();
      float $$8 = asb.i($$0, this.j.s.cw, this.j.s.cv) * $$7 * $$7;
      if ($$8 > 0.0F) {
         int $$9 = this.j.s.a(bil.i) ? 7 : 20;
         float $$10 = 5.0F / ($$8 * $$8 + 5.0F) - $$8 * 0.04F;
         $$10 *= $$10;
         a $$11 = a.of(new Vector3f(0.0F, asb.g / 2.0F, asb.g / 2.0F));
         $$5.a($$11.rotationDegrees(((float)this.p + $$0) * (float)$$9));
         $$5.b(1.0F / $$10, 1.0F, 1.0F);
         float $$12 = -((float)this.p + $$0) * (float)$$9;
         $$5.a($$11.rotationDegrees($$12));
      }

      Matrix4f $$13 = $$5.c().a();
      this.a($$13);
      $$4.a(this.j.r, (biw)(this.j.am() == null ? this.j.s : this.j.am()), !this.j.m.aw().a(), this.j.m.aw().b(), $$0);
      $$2.a(a.b.rotationDegrees($$4.d()));
      $$2.a(a.d.rotationDegrees($$4.e() + 180.0F));
      Matrix3f $$14 = new Matrix3f($$2.c().b()).invert();
      RenderSystem.setInverseViewRotationMatrix($$14);
      this.j.f.a($$2, $$4.b(), this.a(Math.max($$6, (double)this.j.m.ad().c().intValue())));
      this.j.f.a($$2, $$0, $$1, $$3, $$4, this, this.z, $$13);
      this.j.aG().b("hand");
      if (this.u) {
         RenderSystem.clear(256, eqp.a);
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

   public esb j() {
      return this.n;
   }

   public void a(cjl $$0) {
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
         elj $$11 = new elj();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * asb.e(asb.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * asb.e(asb.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * asb.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * asb.e(asb.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * asb.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * asb.b($$4 * 8.0F)));
         foa.a $$13 = this.o.b();
         this.j.aq().a(this.F, cji.i, 15728880, fyr.d, $$11, $$13, this.j.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(erz $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = asb.i($$1, 2.0F, 1.0F);
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

   public eqp k() {
      return this.j;
   }

   public float b(float $$0) {
      return asb.i($$0, this.t, this.s);
   }

   public float l() {
      return this.m;
   }

   public eqa m() {
      return this.N;
   }

   public fnz n() {
      return this.z;
   }

   public fyr o() {
      return this.A;
   }

   @Nullable
   public static fon p() {
      return P;
   }

   @Nullable
   public static fon q() {
      return Q;
   }

   @Nullable
   public static fon r() {
      return R;
   }

   @Nullable
   public static fon s() {
      return S;
   }

   @Nullable
   public static fon t() {
      return T;
   }

   @Nullable
   public static fon u() {
      return U;
   }

   @Nullable
   public static fon v() {
      return V;
   }

   @Nullable
   public static fon w() {
      return W;
   }

   @Nullable
   public static fon x() {
      return X;
   }

   @Nullable
   public static fon y() {
      return Y;
   }

   @Nullable
   public static fon z() {
      return Z;
   }

   @Nullable
   public static fon A() {
      return aa;
   }

   @Nullable
   public static fon B() {
      return ab;
   }

   @Nullable
   public static fon C() {
      return ac;
   }

   @Nullable
   public static fon D() {
      return ad;
   }

   @Nullable
   public static fon E() {
      return ae;
   }

   @Nullable
   public static fon F() {
      return af;
   }

   @Nullable
   public static fon G() {
      return ag;
   }

   @Nullable
   public static fon H() {
      return ah;
   }

   @Nullable
   public static fon I() {
      return ai;
   }

   @Nullable
   public static fon J() {
      return aj;
   }

   @Nullable
   public static fon K() {
      return ak;
   }

   @Nullable
   public static fon L() {
      return al;
   }

   @Nullable
   public static fon M() {
      return am;
   }

   @Nullable
   public static fon N() {
      return an;
   }

   @Nullable
   public static fon O() {
      return ao;
   }

   @Nullable
   public static fon P() {
      return ap;
   }

   @Nullable
   public static fon Q() {
      return aq;
   }

   @Nullable
   public static fon R() {
      return ar;
   }

   @Nullable
   public static fon S() {
      return as;
   }

   @Nullable
   public static fon T() {
      return at;
   }

   @Nullable
   public static fon U() {
      return au;
   }

   @Nullable
   public static fon V() {
      return av;
   }

   @Nullable
   public static fon W() {
      return aw;
   }

   @Nullable
   public static fon X() {
      return ax;
   }

   @Nullable
   public static fon Y() {
      return ay;
   }

   @Nullable
   public static fon Z() {
      return az;
   }

   @Nullable
   public static fon aa() {
      return aA;
   }

   @Nullable
   public static fon ab() {
      return aB;
   }

   @Nullable
   public static fon ac() {
      return aC;
   }

   @Nullable
   public static fon ad() {
      return aD;
   }

   @Nullable
   public static fon ae() {
      return aE;
   }

   @Nullable
   public static fon af() {
      return aF;
   }

   @Nullable
   public static fon ag() {
      return aG;
   }

   @Nullable
   public static fon ah() {
      return aH;
   }

   @Nullable
   public static fon ai() {
      return aI;
   }

   @Nullable
   public static fon aj() {
      return aJ;
   }

   @Nullable
   public static fon ak() {
      return aK;
   }

   @Nullable
   public static fon al() {
      return aL;
   }

   @Nullable
   public static fon am() {
      return aM;
   }

   @Nullable
   public static fon an() {
      return aN;
   }

   @Nullable
   public static fon ao() {
      return aO;
   }

   @Nullable
   public static fon ap() {
      return aP;
   }

   @Nullable
   public static fon aq() {
      return aQ;
   }

   @Nullable
   public static fon ar() {
      return aR;
   }

   @Nullable
   public static fon as() {
      return aS;
   }

   @Nullable
   public static fon at() {
      return aT;
   }

   @Nullable
   public static fon au() {
      return aU;
   }

   @Nullable
   public static fon av() {
      return aV;
   }

   public static record a(anz a, Map<aez, anu> b) implements anz {
      @Override
      public Optional<anu> getResource(aez $$0) {
         anu $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
