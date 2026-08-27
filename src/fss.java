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

public class fss implements AutoCloseable {
   private static final ahd f = new ahd("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   private static final int j = 3;
   final eva k;
   private final aqc l;
   private final aup m = aup.a();
   private float n;
   public final fsv b;
   private final ewo o;
   private final ftf p;
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
   private final fsy A;
   private final gdw B = new gdw();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int c = 40;
   @Nullable
   private cmr G;
   private int H;
   private float I;
   private float J;
   @Nullable
   ftc K;
   static final ahd[] L = new ahd[]{
      new ahd("shaders/post/notch.json"),
      new ahd("shaders/post/fxaa.json"),
      new ahd("shaders/post/art.json"),
      new ahd("shaders/post/bumpy.json"),
      new ahd("shaders/post/blobs2.json"),
      new ahd("shaders/post/pencil.json"),
      new ahd("shaders/post/color_convolve.json"),
      new ahd("shaders/post/deconverge.json"),
      new ahd("shaders/post/flip.json"),
      new ahd("shaders/post/invert.json"),
      new ahd("shaders/post/ntsc.json"),
      new ahd("shaders/post/outline.json"),
      new ahd("shaders/post/phosphor.json"),
      new ahd("shaders/post/scan_pincushion.json"),
      new ahd("shaders/post/sobel.json"),
      new ahd("shaders/post/bits.json"),
      new ahd("shaders/post/desaturate.json"),
      new ahd("shaders/post/green.json"),
      new ahd("shaders/post/blur.json"),
      new ahd("shaders/post/wobble.json"),
      new ahd("shaders/post/blobs.json"),
      new ahd("shaders/post/antialias.json"),
      new ahd("shaders/post/creeper.json"),
      new ahd("shaders/post/spider.json")
   };
   public static final int d = L.length;
   int M = d;
   private boolean N;
   private final eul O = new eul();
   public ftn e;
   private final Map<String, ftn> P = Maps.newHashMap();
   @Nullable
   private static ftn Q;
   @Nullable
   private static ftn R;
   @Nullable
   private static ftn S;
   @Nullable
   private static ftn T;
   @Nullable
   private static ftn U;
   @Nullable
   private static ftn V;
   @Nullable
   private static ftn W;
   @Nullable
   private static ftn X;
   @Nullable
   private static ftn Y;
   @Nullable
   private static ftn Z;
   @Nullable
   private static ftn aa;
   @Nullable
   private static ftn ab;
   @Nullable
   private static ftn ac;
   @Nullable
   private static ftn ad;
   @Nullable
   private static ftn ae;
   @Nullable
   private static ftn af;
   @Nullable
   private static ftn ag;
   @Nullable
   private static ftn ah;
   @Nullable
   private static ftn ai;
   @Nullable
   private static ftn aj;
   @Nullable
   private static ftn ak;
   @Nullable
   private static ftn al;
   @Nullable
   private static ftn am;
   @Nullable
   private static ftn an;
   @Nullable
   private static ftn ao;
   @Nullable
   private static ftn ap;
   @Nullable
   private static ftn aq;
   @Nullable
   private static ftn ar;
   @Nullable
   private static ftn as;
   @Nullable
   private static ftn at;
   @Nullable
   private static ftn au;
   @Nullable
   private static ftn av;
   @Nullable
   private static ftn aw;
   @Nullable
   private static ftn ax;
   @Nullable
   private static ftn ay;
   @Nullable
   private static ftn az;
   @Nullable
   private static ftn aA;
   @Nullable
   private static ftn aB;
   @Nullable
   private static ftn aC;
   @Nullable
   private static ftn aD;
   @Nullable
   private static ftn aE;
   @Nullable
   private static ftn aF;
   @Nullable
   private static ftn aG;
   @Nullable
   private static ftn aH;
   @Nullable
   private static ftn aI;
   @Nullable
   private static ftn aJ;
   @Nullable
   private static ftn aK;
   @Nullable
   private static ftn aL;
   @Nullable
   private static ftn aM;
   @Nullable
   private static ftn aN;
   @Nullable
   private static ftn aO;
   @Nullable
   private static ftn aP;
   @Nullable
   private static ftn aQ;
   @Nullable
   private static ftn aR;
   @Nullable
   private static ftn aS;
   @Nullable
   private static ftn aT;
   @Nullable
   private static ftn aU;
   @Nullable
   private static ftn aV;
   @Nullable
   private static ftn aW;

   public fss(eva $$0, fsv $$1, aqc $$2, ftf $$3) {
      this.k = $$0;
      this.l = $$2;
      this.b = $$1;
      this.o = new ewo($$0.X());
      this.A = new fsy(this, $$0);
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

   public void a(@Nullable blp $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof cbv) {
         this.a(new ahd("shaders/post/creeper.json"));
      } else if ($$0 instanceof ccu) {
         this.a(new ahd("shaders/post/spider.json"));
      } else if ($$0 instanceof cbz) {
         this.a(new ahd("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.k.al() instanceof cfb) {
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

   void a(ahd $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new ftc(this.k.X(), this.l, this.k.g(), $$0);
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

   public apw e() {
      return new aqh<fss.a>() {
         protected fss.a a(aqc $$0, bgm $$1) {
            Map<ahd, aqa> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(eph.a.b.b()) || $$1x.endsWith(eph.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<ahd, aqa> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new aqa($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fss.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fss.a($$0, $$3);
         }

         protected void a(fss.a $$0, aqc $$1, bgm $$2) {
            fss.this.b($$0);
            if (fss.this.K != null) {
               fss.this.K.close();
            }

            fss.this.K = null;
            if (fss.this.M == fss.d) {
               fss.this.a(fss.this.k.al());
            } else {
               fss.this.a(fss.L[fss.this.M]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(aqf $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new ftn($$0, "blit_screen", epr.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aT = this.a($$0, "rendertype_gui", epr.n);
         aU = this.a($$0, "rendertype_gui_overlay", epr.n);
         Q = this.a($$0, "position", epr.m);
         R = this.a($$0, "position_color", epr.n);
         S = this.a($$0, "position_color_tex", epr.r);
         T = this.a($$0, "position_tex", epr.q);
         U = this.a($$0, "position_tex_color", epr.s);
         aH = this.a($$0, "rendertype_text", epr.t);
      }
   }

   private ftn a(aqf $$0, String $$1, epy $$2) {
      try {
         ftn $$3 = new ftn($$0, $$1, $$2);
         this.P.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(aqf $$0) {
      RenderSystem.assertOnRenderThread();
      List<eph> $$1 = Lists.newArrayList();
      $$1.addAll(eph.a.b.c().values());
      $$1.addAll(eph.a.a.c().values());
      $$1.forEach(eph::a);
      List<Pair<ftn, Consumer<ftn>>> $$2 = Lists.newArrayListWithCapacity(this.P.size());

      try {
         $$2.add(Pair.of(new ftn($$0, "particle", epr.l), (Consumer<ftn>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new ftn($$0, "position", epr.m), (Consumer<ftn>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new ftn($$0, "position_color", epr.n), (Consumer<ftn>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new ftn($$0, "position_color_lightmap", epr.p), (Consumer<ftn>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new ftn($$0, "position_color_tex", epr.r), (Consumer<ftn>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new ftn($$0, "position_color_tex_lightmap", epr.t), (Consumer<ftn>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new ftn($$0, "position_tex", epr.q), (Consumer<ftn>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new ftn($$0, "position_tex_color", epr.s), (Consumer<ftn>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new ftn($$0, "position_tex_color_normal", epr.v), (Consumer<ftn>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new ftn($$0, "position_tex_lightmap_color", epr.u), (Consumer<ftn>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_solid", epr.j), (Consumer<ftn>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_cutout_mipped", epr.j), (Consumer<ftn>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_cutout", epr.j), (Consumer<ftn>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_translucent", epr.j), (Consumer<ftn>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_translucent_moving_block", epr.j), (Consumer<ftn>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_armor_cutout_no_cull", epr.k), (Consumer<ftn>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_entity_solid", epr.k), (Consumer<ftn>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_entity_cutout", epr.k), (Consumer<ftn>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_entity_cutout_no_cull", epr.k), (Consumer<ftn>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_entity_cutout_no_cull_z_offset", epr.k), (Consumer<ftn>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_item_entity_translucent_cull", epr.k), (Consumer<ftn>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_entity_translucent_cull", epr.k), (Consumer<ftn>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_entity_translucent", epr.k), (Consumer<ftn>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_entity_translucent_emissive", epr.k), (Consumer<ftn>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_entity_smooth_cutout", epr.k), (Consumer<ftn>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_beacon_beam", epr.j), (Consumer<ftn>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_entity_decal", epr.k), (Consumer<ftn>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_entity_no_outline", epr.k), (Consumer<ftn>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_entity_shadow", epr.k), (Consumer<ftn>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_entity_alpha", epr.k), (Consumer<ftn>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_eyes", epr.k), (Consumer<ftn>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_energy_swirl", epr.k), (Consumer<ftn>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_leash", epr.p), (Consumer<ftn>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_water_mask", epr.m), (Consumer<ftn>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_outline", epr.r), (Consumer<ftn>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_armor_glint", epr.q), (Consumer<ftn>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_armor_entity_glint", epr.q), (Consumer<ftn>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_glint_translucent", epr.q), (Consumer<ftn>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_glint", epr.q), (Consumer<ftn>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_glint_direct", epr.q), (Consumer<ftn>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_entity_glint", epr.q), (Consumer<ftn>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_entity_glint_direct", epr.q), (Consumer<ftn>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_text", epr.t), (Consumer<ftn>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_text_background", epr.p), (Consumer<ftn>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_text_intensity", epr.t), (Consumer<ftn>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_text_see_through", epr.t), (Consumer<ftn>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_text_background_see_through", epr.p), (Consumer<ftn>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_text_intensity_see_through", epr.t), (Consumer<ftn>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_lightning", epr.n), (Consumer<ftn>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_tripwire", epr.j), (Consumer<ftn>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_end_portal", epr.m), (Consumer<ftn>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_end_gateway", epr.m), (Consumer<ftn>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_lines", epr.o), (Consumer<ftn>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_crumbling", epr.j), (Consumer<ftn>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_gui", epr.n), (Consumer<ftn>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_gui_overlay", epr.n), (Consumer<ftn>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_gui_text_highlight", epr.n), (Consumer<ftn>)$$0x -> aV = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_gui_ghost_recipe_overlay", epr.n), (Consumer<ftn>)$$0x -> aW = $$0x));
         $$2.add(Pair.of(new ftn($$0, "rendertype_breeze_wind", epr.k), (Consumer<ftn>)$$0x -> aw = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((ftn)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.aw();
      $$2.forEach($$0x -> {
         ftn $$1x = (ftn)$$0x.getFirst();
         this.P.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void aw() {
      RenderSystem.assertOnRenderThread();
      this.P.values().forEach(ftn::close);
      this.P.clear();
   }

   @Nullable
   public ftn a(@Nullable String $$0) {
      return $$0 == null ? null : this.P.get($$0);
   }

   public void f() {
      this.ax();
      this.A.a();
      if (this.k.al() == null) {
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
   public ftc g() {
      return this.K;
   }

   public void a(int $$0, int $$1) {
      if (this.K != null) {
         this.K.a($$0, $$1);
      }

      this.k.f.a($$0, $$1);
   }

   public void a(float $$0) {
      blp $$1 = this.k.al();
      if ($$1 != null) {
         if (this.k.r != null) {
            this.k.aF().a("pick");
            this.k.u = null;
            double $$2 = (double)this.k.q.c();
            this.k.v = $$1.a($$2, $$0, false);
            elm $$3 = $$1.j($$0);
            boolean $$4 = this.k.q.h();
            $$2 = $$4 ? 6.0 : $$2;
            boolean $$5 = !$$4;
            double $$6 = this.k.v != null ? this.k.v.e().g($$3) : $$2 * $$2;
            elm $$7 = $$1.f(1.0F);
            elm $$8 = $$3.b($$7.c * $$2, $$7.d * $$2, $$7.e * $$2);
            float $$9 = 1.0F;
            elh $$10 = $$1.cH().b($$7.a($$2)).c(1.0, 1.0, 1.0);
            elj $$11 = cfu.a($$1, $$3, $$8, $$10, $$0x -> !$$0x.P_() && $$0x.bt(), $$6);
            if ($$11 != null) {
               elm $$12 = $$11.e();
               double $$13 = $$3.g($$12);
               if ($$5 && $$13 > 9.0) {
                  this.k.v = eli.a($$12, ic.a($$7.c, $$7.d, $$7.e), hx.a($$12));
               } else if ($$13 < $$6 || this.k.v == null) {
                  this.k.v = $$11;
                  blp $$14 = $$11.a();
                  this.k.u = $$14;
               }
            }

            this.k.aF().c();
         }
      }
   }

   private void ax() {
      float $$0 = 1.0F;
      if (this.k.al() instanceof fry $$1) {
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

   private double a(eul $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ae().c().intValue();
            $$3 *= (double)aui.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof bmf && ((bmf)$$0.g()).ew()) {
            float $$4 = Math.min((float)((bmf)$$0.g()).aM + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         eem $$5 = $$0.k();
         if ($$5 == eem.a || $$5 == eem.b) {
            $$3 *= aui.d(this.k.m.ah().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(ept $$0, float $$1) {
      if (this.k.al() instanceof bmf $$2) {
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.ew()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = aui.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eE();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.al().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(ept $$0, float $$1) {
      if (this.k.al() instanceof cfb) {
         cfb $$2 = (cfb)this.k.al();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = aui.i($$1, $$2.bV, $$2.bW);
         $$0.a(aui.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(aui.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(aui.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(aui.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.D = $$0;
      this.E = $$1;
      this.F = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new ept());
      this.D = 1.0F;
   }

   private void a(ept $$0, eul $$1, float $$2) {
      if (!this.C) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.k.m.Y().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.k.al() instanceof bmf && ((bmf)this.k.al()).fD();
         if (this.k.m.ax().a() && !$$3 && !this.k.m.Z && this.k.q.l() != ctf.d) {
            this.A.c();
            this.b.a($$2, $$0, this.p.c(), this.k.s, this.k.an().a(this.k.s, $$2));
            this.A.b();
         }

         $$0.b();
         if (this.k.m.ax().a() && !$$3) {
            ftj.a(this.k, $$0);
            this.a($$0, $$2);
         }

         if (this.k.m.Y().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, eqb.a);
   }

   public Matrix4f a(double $$0) {
      ept $$1 = new ept();
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

   public static float a(bmf $$0, float $$1) {
      blc $$2 = $$0.b(ble.p);
      return !$$2.a(200) ? 1.0F : 0.7F + aui.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
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
         float $$3 = this.k.r != null && this.k.r.s().i() ? $$0 : 1.0F;
         boolean $$4 = this.k.c();
         int $$5 = (int)(this.k.n.e() * (double)this.k.aL().o() / (double)this.k.aL().m());
         int $$6 = (int)(this.k.n.f() * (double)this.k.aL().p() / (double)this.k.aL().n());
         RenderSystem.viewport(0, 0, this.k.aL().k(), this.k.aL().l());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aF().a("level");
            this.a($$0, $$1, new ept());
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

         eox $$7 = this.k.aL();
         RenderSystem.clear(256, eva.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, eqb.b);
         ept $$9 = RenderSystem.getModelViewStack();
         $$9.a();
         $$9.e();
         $$9.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         eop.b();
         ewm $$10 = new ewm(this.k, this.p.c());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aF().b("gui");
            if (this.k.s != null) {
               float $$11 = aui.i($$3, this.k.s.cx, this.k.s.cw);
               float $$12 = this.k.m.ag().c().floatValue();
               if ($$11 > 0.0F && this.k.s.a(ble.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.k.m.Z || this.k.y != null) {
               this.a(this.k.aL().o(), this.k.aL().p(), $$3);
               this.k.l.a($$10, $$3);
               RenderSystem.clear(256, eva.a);
            }

            this.k.aF().c();
         }

         if (this.k.aI() != null) {
            try {
               this.k.aI().a($$10, $$5, $$6, this.k.as());
            } catch (Throwable var18) {
               o $$14 = o.a(var18, "Rendering overlay");
               p $$15 = $$14.a("Overlay render details");
               $$15.a("Overlay name", () -> this.k.aI().getClass().getCanonicalName());
               throw new y($$14);
            }
         } else if ($$4 && this.k.y != null) {
            try {
               this.k.y.c($$10, $$5, $$6, this.k.as());
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
                        this.k.aL().o(),
                        this.k.aL().p(),
                        this.k.aL().k(),
                        this.k.aL().l(),
                        this.k.aL().s()
                     )
               );
               throw new y($$17);
            }

            try {
               if (this.k.y != null) {
                  this.k.y.y();
               }
            } catch (Throwable var16) {
               o $$20 = o.a(var16, "Narrating screen");
               p $$21 = $$20.a("Screen details");
               $$21.a("Screen name", () -> this.k.y.getClass().getCanonicalName());
               throw new y($$20);
            }
         }

         if ($$4) {
            this.k.aF().a("toasts");
            this.k.ax().a($$10);
            this.k.aF().c();
         }

         $$10.e();
         $$9.b();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void ay() {
      if (!this.y && this.k.Q()) {
         long $$0 = ac.b();
         if ($$0 - this.x >= 1000L) {
            this.x = $$0;
            gie $$1 = this.k.S();
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
         eou $$1 = evl.a(this.k.g());
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

            try (eou $$6 = new eou(64, 64, false)) {
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
         blp $$0 = this.k.al();
         boolean $$1 = $$0 instanceof cfb && !this.k.m.Z;
         if ($$1 && !((cfb)$$0).fT().e) {
            cmr $$2 = ((bmf)$$0).eT();
            elk $$3 = this.k.v;
            if ($$3 != null && $$3.c() == elk.a.b) {
               hx $$4 = ((eli)$$3).a();
               dja $$5 = this.k.r.a_($$4);
               if (this.k.q.l() == ctf.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  dje $$6 = new dje(this.k.r, $$4, false);
                  it<cwj> $$7 = this.k.r.I_().d(ke.f);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, ept $$2) {
      this.A.a($$0);
      if (this.k.al() == null) {
         this.k.a(this.k.s);
      }

      this.a($$0);
      this.k.aF().a("center");
      boolean $$3 = this.az();
      this.k.aF().b("camera");
      eul $$4 = this.O;
      blp $$5 = (blp)(this.k.al() == null ? this.k.s : this.k.al());
      $$4.a(this.k.r, $$5, !this.k.m.ax().a(), this.k.m.ax().b(), this.k.r.s().a($$5) ? 1.0F : $$0);
      this.n = (float)(this.k.m.aA() * 16);
      ept $$6 = new ept();
      double $$7 = this.a($$4, $$0, true);
      $$6.a(this.a($$7));
      this.a($$6, $$4.p());
      if (this.k.m.Y().c()) {
         this.b($$6, $$4.p());
      }

      float $$8 = this.k.m.ag().c().floatValue();
      float $$9 = aui.i($$0, this.k.s.cx, this.k.s.cw) * $$8 * $$8;
      if ($$9 > 0.0F) {
         int $$10 = this.k.s.a(ble.i) ? 7 : 20;
         float $$11 = 5.0F / ($$9 * $$9 + 5.0F) - $$9 * 0.04F;
         $$11 *= $$11;
         a $$12 = a.of(new Vector3f(0.0F, aui.g / 2.0F, aui.g / 2.0F));
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
      this.k.aF().b("hand");
      if (this.v) {
         RenderSystem.clear(256, eva.a);
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

   public ewo j() {
      return this.o;
   }

   public void a(cmr $$0) {
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
         ept $$11 = new ept();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * aui.e(aui.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * aui.e(aui.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * aui.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * aui.e(aui.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * aui.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * aui.b($$4 * 8.0F)));
         fsz.a $$13 = this.p.c();
         this.k.ap().a(this.G, cmo.i, 15728880, gdw.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(ewm $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = aui.i($$1, 2.0F, 1.0F);
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

   public eva k() {
      return this.k;
   }

   public float b(float $$0) {
      return aui.i($$0, this.u, this.t);
   }

   public float l() {
      return this.n;
   }

   public eul m() {
      return this.O;
   }

   public fsy n() {
      return this.A;
   }

   public gdw o() {
      return this.B;
   }

   @Nullable
   public static ftn p() {
      return Q;
   }

   @Nullable
   public static ftn q() {
      return R;
   }

   @Nullable
   public static ftn r() {
      return S;
   }

   @Nullable
   public static ftn s() {
      return T;
   }

   @Nullable
   public static ftn t() {
      return U;
   }

   @Nullable
   public static ftn u() {
      return V;
   }

   @Nullable
   public static ftn v() {
      return W;
   }

   @Nullable
   public static ftn w() {
      return X;
   }

   @Nullable
   public static ftn x() {
      return Y;
   }

   @Nullable
   public static ftn y() {
      return Z;
   }

   @Nullable
   public static ftn z() {
      return aa;
   }

   @Nullable
   public static ftn A() {
      return ab;
   }

   @Nullable
   public static ftn B() {
      return ac;
   }

   @Nullable
   public static ftn C() {
      return ad;
   }

   @Nullable
   public static ftn D() {
      return ae;
   }

   @Nullable
   public static ftn E() {
      return af;
   }

   @Nullable
   public static ftn F() {
      return ag;
   }

   @Nullable
   public static ftn G() {
      return ah;
   }

   @Nullable
   public static ftn H() {
      return ai;
   }

   @Nullable
   public static ftn I() {
      return aj;
   }

   @Nullable
   public static ftn J() {
      return ak;
   }

   @Nullable
   public static ftn K() {
      return al;
   }

   @Nullable
   public static ftn L() {
      return am;
   }

   @Nullable
   public static ftn M() {
      return an;
   }

   @Nullable
   public static ftn N() {
      return ao;
   }

   @Nullable
   public static ftn O() {
      return ap;
   }

   @Nullable
   public static ftn P() {
      return aq;
   }

   @Nullable
   public static ftn Q() {
      return ar;
   }

   @Nullable
   public static ftn R() {
      return as;
   }

   @Nullable
   public static ftn S() {
      return at;
   }

   @Nullable
   public static ftn T() {
      return au;
   }

   @Nullable
   public static ftn U() {
      return av;
   }

   @Nullable
   public static ftn V() {
      return aw;
   }

   @Nullable
   public static ftn W() {
      return ax;
   }

   @Nullable
   public static ftn X() {
      return ay;
   }

   @Nullable
   public static ftn Y() {
      return az;
   }

   @Nullable
   public static ftn Z() {
      return aA;
   }

   @Nullable
   public static ftn aa() {
      return aB;
   }

   @Nullable
   public static ftn ab() {
      return aC;
   }

   @Nullable
   public static ftn ac() {
      return aD;
   }

   @Nullable
   public static ftn ad() {
      return aE;
   }

   @Nullable
   public static ftn ae() {
      return aF;
   }

   @Nullable
   public static ftn af() {
      return aG;
   }

   @Nullable
   public static ftn ag() {
      return aH;
   }

   @Nullable
   public static ftn ah() {
      return aI;
   }

   @Nullable
   public static ftn ai() {
      return aJ;
   }

   @Nullable
   public static ftn aj() {
      return aK;
   }

   @Nullable
   public static ftn ak() {
      return aL;
   }

   @Nullable
   public static ftn al() {
      return aM;
   }

   @Nullable
   public static ftn am() {
      return aN;
   }

   @Nullable
   public static ftn an() {
      return aO;
   }

   @Nullable
   public static ftn ao() {
      return aP;
   }

   @Nullable
   public static ftn ap() {
      return aQ;
   }

   @Nullable
   public static ftn aq() {
      return aR;
   }

   @Nullable
   public static ftn ar() {
      return aS;
   }

   @Nullable
   public static ftn as() {
      return aT;
   }

   @Nullable
   public static ftn at() {
      return aU;
   }

   @Nullable
   public static ftn au() {
      return aV;
   }

   @Nullable
   public static ftn av() {
      return aW;
   }

   public static record a(aqf a, Map<ahd, aqa> b) implements aqf {
      @Override
      public Optional<aqa> getResource(ahd $$0) {
         aqa $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
