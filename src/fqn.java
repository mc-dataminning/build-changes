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

public class fqn implements AutoCloseable {
   private static final agi f = new agi("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   private static final int j = 3;
   final etd k;
   private final aph l;
   private final ats m = ats.a();
   private float n;
   public final fqq b;
   private final euq o;
   private final fra p;
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
   private final fqt A;
   private final gbl B = new gbl();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int c = 40;
   @Nullable
   private clj G;
   private int H;
   private float I;
   private float J;
   @Nullable
   fqx K;
   static final agi[] L = new agi[]{
      new agi("shaders/post/notch.json"),
      new agi("shaders/post/fxaa.json"),
      new agi("shaders/post/art.json"),
      new agi("shaders/post/bumpy.json"),
      new agi("shaders/post/blobs2.json"),
      new agi("shaders/post/pencil.json"),
      new agi("shaders/post/color_convolve.json"),
      new agi("shaders/post/deconverge.json"),
      new agi("shaders/post/flip.json"),
      new agi("shaders/post/invert.json"),
      new agi("shaders/post/ntsc.json"),
      new agi("shaders/post/outline.json"),
      new agi("shaders/post/phosphor.json"),
      new agi("shaders/post/scan_pincushion.json"),
      new agi("shaders/post/sobel.json"),
      new agi("shaders/post/bits.json"),
      new agi("shaders/post/desaturate.json"),
      new agi("shaders/post/green.json"),
      new agi("shaders/post/blur.json"),
      new agi("shaders/post/wobble.json"),
      new agi("shaders/post/blobs.json"),
      new agi("shaders/post/antialias.json"),
      new agi("shaders/post/creeper.json"),
      new agi("shaders/post/spider.json")
   };
   public static final int d = L.length;
   int M = d;
   private boolean N;
   private final eso O = new eso();
   public fri e;
   private final Map<String, fri> P = Maps.newHashMap();
   @Nullable
   private static fri Q;
   @Nullable
   private static fri R;
   @Nullable
   private static fri S;
   @Nullable
   private static fri T;
   @Nullable
   private static fri U;
   @Nullable
   private static fri V;
   @Nullable
   private static fri W;
   @Nullable
   private static fri X;
   @Nullable
   private static fri Y;
   @Nullable
   private static fri Z;
   @Nullable
   private static fri aa;
   @Nullable
   private static fri ab;
   @Nullable
   private static fri ac;
   @Nullable
   private static fri ad;
   @Nullable
   private static fri ae;
   @Nullable
   private static fri af;
   @Nullable
   private static fri ag;
   @Nullable
   private static fri ah;
   @Nullable
   private static fri ai;
   @Nullable
   private static fri aj;
   @Nullable
   private static fri ak;
   @Nullable
   private static fri al;
   @Nullable
   private static fri am;
   @Nullable
   private static fri an;
   @Nullable
   private static fri ao;
   @Nullable
   private static fri ap;
   @Nullable
   private static fri aq;
   @Nullable
   private static fri ar;
   @Nullable
   private static fri as;
   @Nullable
   private static fri at;
   @Nullable
   private static fri au;
   @Nullable
   private static fri av;
   @Nullable
   private static fri aw;
   @Nullable
   private static fri ax;
   @Nullable
   private static fri ay;
   @Nullable
   private static fri az;
   @Nullable
   private static fri aA;
   @Nullable
   private static fri aB;
   @Nullable
   private static fri aC;
   @Nullable
   private static fri aD;
   @Nullable
   private static fri aE;
   @Nullable
   private static fri aF;
   @Nullable
   private static fri aG;
   @Nullable
   private static fri aH;
   @Nullable
   private static fri aI;
   @Nullable
   private static fri aJ;
   @Nullable
   private static fri aK;
   @Nullable
   private static fri aL;
   @Nullable
   private static fri aM;
   @Nullable
   private static fri aN;
   @Nullable
   private static fri aO;
   @Nullable
   private static fri aP;
   @Nullable
   private static fri aQ;
   @Nullable
   private static fri aR;
   @Nullable
   private static fri aS;
   @Nullable
   private static fri aT;
   @Nullable
   private static fri aU;
   @Nullable
   private static fri aV;

   public fqn(etd $$0, fqq $$1, aph $$2, fra $$3) {
      this.k = $$0;
      this.l = $$2;
      this.b = $$1;
      this.o = new euq($$0.X());
      this.A = new fqt(this, $$0);
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

   public void a(@Nullable bkq $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof cau) {
         this.a(new agi("shaders/post/creeper.json"));
      } else if ($$0 instanceof cbt) {
         this.a(new agi("shaders/post/spider.json"));
      } else if ($$0 instanceof cay) {
         this.a(new agi("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.k.al() instanceof cdu) {
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

   void a(agi $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new fqx(this.k.X(), this.l, this.k.g(), $$0);
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

   public apb e() {
      return new apm<fqn.a>() {
         protected fqn.a a(aph $$0, bfo $$1) {
            Map<agi, apf> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(enk.a.b.b()) || $$1x.endsWith(enk.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<agi, apf> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new apf($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fqn.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fqn.a($$0, $$3);
         }

         protected void a(fqn.a $$0, aph $$1, bfo $$2) {
            fqn.this.b($$0);
            if (fqn.this.K != null) {
               fqn.this.K.close();
            }

            fqn.this.K = null;
            if (fqn.this.M == fqn.d) {
               fqn.this.a(fqn.this.k.al());
            } else {
               fqn.this.a(fqn.L[fqn.this.M]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(apk $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new fri($$0, "blit_screen", enu.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aS = this.a($$0, "rendertype_gui", enu.n);
         aT = this.a($$0, "rendertype_gui_overlay", enu.n);
         Q = this.a($$0, "position", enu.m);
         R = this.a($$0, "position_color", enu.n);
         S = this.a($$0, "position_color_tex", enu.r);
         T = this.a($$0, "position_tex", enu.q);
         U = this.a($$0, "position_tex_color", enu.s);
         aG = this.a($$0, "rendertype_text", enu.t);
      }
   }

   private fri a(apk $$0, String $$1, eob $$2) {
      try {
         fri $$3 = new fri($$0, $$1, $$2);
         this.P.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(apk $$0) {
      RenderSystem.assertOnRenderThread();
      List<enk> $$1 = Lists.newArrayList();
      $$1.addAll(enk.a.b.c().values());
      $$1.addAll(enk.a.a.c().values());
      $$1.forEach(enk::a);
      List<Pair<fri, Consumer<fri>>> $$2 = Lists.newArrayListWithCapacity(this.P.size());

      try {
         $$2.add(Pair.of(new fri($$0, "particle", enu.l), (Consumer<fri>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new fri($$0, "position", enu.m), (Consumer<fri>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new fri($$0, "position_color", enu.n), (Consumer<fri>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new fri($$0, "position_color_lightmap", enu.p), (Consumer<fri>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new fri($$0, "position_color_tex", enu.r), (Consumer<fri>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new fri($$0, "position_color_tex_lightmap", enu.t), (Consumer<fri>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new fri($$0, "position_tex", enu.q), (Consumer<fri>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new fri($$0, "position_tex_color", enu.s), (Consumer<fri>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new fri($$0, "position_tex_color_normal", enu.v), (Consumer<fri>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new fri($$0, "position_tex_lightmap_color", enu.u), (Consumer<fri>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_solid", enu.j), (Consumer<fri>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_cutout_mipped", enu.j), (Consumer<fri>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_cutout", enu.j), (Consumer<fri>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_translucent", enu.j), (Consumer<fri>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_translucent_moving_block", enu.j), (Consumer<fri>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_armor_cutout_no_cull", enu.k), (Consumer<fri>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_entity_solid", enu.k), (Consumer<fri>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_entity_cutout", enu.k), (Consumer<fri>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_entity_cutout_no_cull", enu.k), (Consumer<fri>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_entity_cutout_no_cull_z_offset", enu.k), (Consumer<fri>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_item_entity_translucent_cull", enu.k), (Consumer<fri>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_entity_translucent_cull", enu.k), (Consumer<fri>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_entity_translucent", enu.k), (Consumer<fri>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_entity_translucent_emissive", enu.k), (Consumer<fri>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_entity_smooth_cutout", enu.k), (Consumer<fri>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_beacon_beam", enu.j), (Consumer<fri>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_entity_decal", enu.k), (Consumer<fri>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_entity_no_outline", enu.k), (Consumer<fri>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_entity_shadow", enu.k), (Consumer<fri>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_entity_alpha", enu.k), (Consumer<fri>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_eyes", enu.k), (Consumer<fri>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_energy_swirl", enu.k), (Consumer<fri>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_leash", enu.p), (Consumer<fri>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_water_mask", enu.m), (Consumer<fri>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_outline", enu.r), (Consumer<fri>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_armor_glint", enu.q), (Consumer<fri>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_armor_entity_glint", enu.q), (Consumer<fri>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_glint_translucent", enu.q), (Consumer<fri>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_glint", enu.q), (Consumer<fri>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_glint_direct", enu.q), (Consumer<fri>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_entity_glint", enu.q), (Consumer<fri>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_entity_glint_direct", enu.q), (Consumer<fri>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_text", enu.t), (Consumer<fri>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_text_background", enu.p), (Consumer<fri>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_text_intensity", enu.t), (Consumer<fri>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_text_see_through", enu.t), (Consumer<fri>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_text_background_see_through", enu.p), (Consumer<fri>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_text_intensity_see_through", enu.t), (Consumer<fri>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_lightning", enu.n), (Consumer<fri>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_tripwire", enu.j), (Consumer<fri>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_end_portal", enu.m), (Consumer<fri>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_end_gateway", enu.m), (Consumer<fri>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_lines", enu.o), (Consumer<fri>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_crumbling", enu.j), (Consumer<fri>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_gui", enu.n), (Consumer<fri>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_gui_overlay", enu.n), (Consumer<fri>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_gui_text_highlight", enu.n), (Consumer<fri>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new fri($$0, "rendertype_gui_ghost_recipe_overlay", enu.n), (Consumer<fri>)$$0x -> aV = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((fri)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.av();
      $$2.forEach($$0x -> {
         fri $$1x = (fri)$$0x.getFirst();
         this.P.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void av() {
      RenderSystem.assertOnRenderThread();
      this.P.values().forEach(fri::close);
      this.P.clear();
   }

   @Nullable
   public fri a(@Nullable String $$0) {
      return $$0 == null ? null : this.P.get($$0);
   }

   public void f() {
      this.aw();
      this.A.a();
      if (this.k.al() == null) {
         this.k.a(this.k.s);
      }

      this.O.a();
      this.b.a();
      this.q++;
      if (this.k.r.r().i()) {
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
   public fqx g() {
      return this.K;
   }

   public void a(int $$0, int $$1) {
      if (this.K != null) {
         this.K.a($$0, $$1);
      }

      this.k.f.a($$0, $$1);
   }

   public void a(float $$0) {
      bkq $$1 = this.k.al();
      if ($$1 != null) {
         if (this.k.r != null) {
            this.k.aF().a("pick");
            this.k.u = null;
            double $$2 = (double)this.k.q.c();
            this.k.v = $$1.a($$2, $$0, false);
            eju $$3 = $$1.j($$0);
            boolean $$4 = this.k.q.h();
            $$2 = $$4 ? 6.0 : $$2;
            boolean $$5 = !$$4;
            double $$6 = this.k.v != null ? this.k.v.e().g($$3) : $$2 * $$2;
            eju $$7 = $$1.f(1.0F);
            eju $$8 = $$3.b($$7.c * $$2, $$7.d * $$2, $$7.e * $$2);
            float $$9 = 1.0F;
            ejp $$10 = $$1.cH().b($$7.a($$2)).c(1.0, 1.0, 1.0);
            ejr $$11 = cen.a($$1, $$3, $$8, $$10, $$0x -> !$$0x.O_() && $$0x.bt(), $$6);
            if ($$11 != null) {
               eju $$12 = $$11.e();
               double $$13 = $$3.g($$12);
               if ($$5 && $$13 > 9.0) {
                  this.k.v = ejq.a($$12, hx.a($$7.c, $$7.d, $$7.e), ht.a($$12));
               } else if ($$13 < $$6 || this.k.v == null) {
                  this.k.v = $$11;
                  bkq $$14 = $$11.a();
                  this.k.u = $$14;
               }
            }

            this.k.aF().c();
         }
      }
   }

   private void aw() {
      float $$0 = 1.0F;
      if (this.k.al() instanceof fpt $$1) {
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

   private double a(eso $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ae().c().intValue();
            $$3 *= (double)atm.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof blg && ((blg)$$0.g()).ex()) {
            float $$4 = Math.min((float)((blg)$$0.g()).aM + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         ecu $$5 = $$0.k();
         if ($$5 == ecu.a || $$5 == ecu.b) {
            $$3 *= atm.d(this.k.m.ah().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(enw $$0, float $$1) {
      if (this.k.al() instanceof blg $$2) {
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.ex()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = atm.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eF();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.al().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(enw $$0, float $$1) {
      if (this.k.al() instanceof cdu) {
         cdu $$2 = (cdu)this.k.al();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = atm.i($$1, $$2.bV, $$2.bW);
         $$0.a(atm.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(atm.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(atm.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(atm.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.D = $$0;
      this.E = $$1;
      this.F = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new enw());
      this.D = 1.0F;
   }

   private void a(enw $$0, eso $$1, float $$2) {
      if (!this.C) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.k.m.Y().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.k.al() instanceof blg && ((blg)this.k.al()).fE();
         if (this.k.m.ax().a() && !$$3 && !this.k.m.Z && this.k.q.l() != crx.d) {
            this.A.c();
            this.b.a($$2, $$0, this.p.c(), this.k.s, this.k.an().a(this.k.s, $$2));
            this.A.b();
         }

         $$0.b();
         if (this.k.m.ax().a() && !$$3) {
            fre.a(this.k, $$0);
            this.a($$0, $$2);
         }

         if (this.k.m.Y().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, eoe.a);
   }

   public Matrix4f a(double $$0) {
      enw $$1 = new enw();
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

   public static float a(blg $$0, float $$1) {
      bkd $$2 = $$0.b(bkf.p);
      return !$$2.a(200) ? 1.0F : 0.7F + atm.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
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
         float $$3 = this.k.r != null && this.k.r.r().i() ? $$0 : 1.0F;
         boolean $$4 = this.k.c();
         int $$5 = (int)(this.k.n.e() * (double)this.k.aL().o() / (double)this.k.aL().m());
         int $$6 = (int)(this.k.n.f() * (double)this.k.aL().p() / (double)this.k.aL().n());
         RenderSystem.viewport(0, 0, this.k.aL().k(), this.k.aL().l());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aF().a("level");
            this.a($$0, $$1, new enw());
            this.ax();
            this.k.f.b();
            if (this.K != null && this.N) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.K.a($$3);
            }

            this.k.g().a(true);
         }

         ena $$7 = this.k.aL();
         RenderSystem.clear(256, etd.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, eoe.b);
         enw $$9 = RenderSystem.getModelViewStack();
         $$9.a();
         $$9.e();
         $$9.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         ems.b();
         euo $$10 = new euo(this.k, this.p.c());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aF().b("gui");
            if (this.k.s != null) {
               float $$11 = atm.i($$3, this.k.s.cw, this.k.s.cv);
               float $$12 = this.k.m.ag().c().floatValue();
               if ($$11 > 0.0F && this.k.s.a(bkf.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.k.m.Z || this.k.y != null) {
               this.a(this.k.aL().o(), this.k.aL().p(), $$3);
               this.k.l.a($$10, $$3);
               RenderSystem.clear(256, etd.a);
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

   private void ax() {
      if (!this.y && this.k.Q()) {
         long $$0 = ac.b();
         if ($$0 - this.x >= 1000L) {
            this.x = $$0;
            gft $$1 = this.k.S();
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
         emx $$1 = eto.a(this.k.g());
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

            try (emx $$6 = new emx(64, 64, false)) {
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
         bkq $$0 = this.k.al();
         boolean $$1 = $$0 instanceof cdu && !this.k.m.Z;
         if ($$1 && !((cdu)$$0).fU().e) {
            clj $$2 = ((blg)$$0).eU();
            ejs $$3 = this.k.v;
            if ($$3 != null && $$3.c() == ejs.a.b) {
               ht $$4 = ((ejq)$$3).a();
               dhi $$5 = this.k.r.a_($$4);
               if (this.k.q.l() == crx.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  dhm $$6 = new dhm(this.k.r, $$4, false);
                  io<cva> $$7 = this.k.r.H_().d(jz.e);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, enw $$2) {
      this.A.a($$0);
      if (this.k.al() == null) {
         this.k.a(this.k.s);
      }

      this.a($$0);
      this.k.aF().a("center");
      boolean $$3 = this.ay();
      this.k.aF().b("camera");
      eso $$4 = this.O;
      this.n = (float)(this.k.m.aA() * 16);
      enw $$5 = new enw();
      double $$6 = this.a($$4, $$0, true);
      $$5.a(this.a($$6));
      this.a($$5, $$0);
      if (this.k.m.Y().c()) {
         this.b($$5, $$0);
      }

      float $$7 = this.k.m.ag().c().floatValue();
      float $$8 = atm.i($$0, this.k.s.cw, this.k.s.cv) * $$7 * $$7;
      if ($$8 > 0.0F) {
         int $$9 = this.k.s.a(bkf.i) ? 7 : 20;
         float $$10 = 5.0F / ($$8 * $$8 + 5.0F) - $$8 * 0.04F;
         $$10 *= $$10;
         a $$11 = a.of(new Vector3f(0.0F, atm.g / 2.0F, atm.g / 2.0F));
         $$5.a($$11.rotationDegrees(((float)this.q + $$0) * (float)$$9));
         $$5.b(1.0F / $$10, 1.0F, 1.0F);
         float $$12 = -((float)this.q + $$0) * (float)$$9;
         $$5.a($$11.rotationDegrees($$12));
      }

      Matrix4f $$13 = $$5.c().a();
      this.a($$13);
      bkq $$14 = (bkq)(this.k.al() == null ? this.k.s : this.k.al());
      $$4.a(this.k.r, $$14, !this.k.m.ax().a(), this.k.m.ax().b(), this.k.r.r().a($$14) ? 1.0F : $$0);
      $$2.a(a.b.rotationDegrees($$4.d()));
      $$2.a(a.d.rotationDegrees($$4.e() + 180.0F));
      Matrix3f $$15 = new Matrix3f($$2.c().b()).invert();
      RenderSystem.setInverseViewRotationMatrix($$15);
      this.k.f.a($$2, $$4.b(), this.a(Math.max($$6, (double)this.k.m.ae().c().intValue())));
      this.k.f.a($$2, $$0, $$1, $$3, $$4, this, this.A, $$13);
      this.k.aF().b("hand");
      if (this.v) {
         RenderSystem.clear(256, etd.a);
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

   public euq j() {
      return this.o;
   }

   public void a(clj $$0) {
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
         enw $$11 = new enw();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * atm.e(atm.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * atm.e(atm.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * atm.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * atm.e(atm.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * atm.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * atm.b($$4 * 8.0F)));
         fqu.a $$13 = this.p.c();
         this.k.ap().a(this.G, clg.i, 15728880, gbl.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(euo $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = atm.i($$1, 2.0F, 1.0F);
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

   public etd k() {
      return this.k;
   }

   public float b(float $$0) {
      return atm.i($$0, this.u, this.t);
   }

   public float l() {
      return this.n;
   }

   public eso m() {
      return this.O;
   }

   public fqt n() {
      return this.A;
   }

   public gbl o() {
      return this.B;
   }

   @Nullable
   public static fri p() {
      return Q;
   }

   @Nullable
   public static fri q() {
      return R;
   }

   @Nullable
   public static fri r() {
      return S;
   }

   @Nullable
   public static fri s() {
      return T;
   }

   @Nullable
   public static fri t() {
      return U;
   }

   @Nullable
   public static fri u() {
      return V;
   }

   @Nullable
   public static fri v() {
      return W;
   }

   @Nullable
   public static fri w() {
      return X;
   }

   @Nullable
   public static fri x() {
      return Y;
   }

   @Nullable
   public static fri y() {
      return Z;
   }

   @Nullable
   public static fri z() {
      return aa;
   }

   @Nullable
   public static fri A() {
      return ab;
   }

   @Nullable
   public static fri B() {
      return ac;
   }

   @Nullable
   public static fri C() {
      return ad;
   }

   @Nullable
   public static fri D() {
      return ae;
   }

   @Nullable
   public static fri E() {
      return af;
   }

   @Nullable
   public static fri F() {
      return ag;
   }

   @Nullable
   public static fri G() {
      return ah;
   }

   @Nullable
   public static fri H() {
      return ai;
   }

   @Nullable
   public static fri I() {
      return aj;
   }

   @Nullable
   public static fri J() {
      return ak;
   }

   @Nullable
   public static fri K() {
      return al;
   }

   @Nullable
   public static fri L() {
      return am;
   }

   @Nullable
   public static fri M() {
      return an;
   }

   @Nullable
   public static fri N() {
      return ao;
   }

   @Nullable
   public static fri O() {
      return ap;
   }

   @Nullable
   public static fri P() {
      return aq;
   }

   @Nullable
   public static fri Q() {
      return ar;
   }

   @Nullable
   public static fri R() {
      return as;
   }

   @Nullable
   public static fri S() {
      return at;
   }

   @Nullable
   public static fri T() {
      return au;
   }

   @Nullable
   public static fri U() {
      return av;
   }

   @Nullable
   public static fri V() {
      return aw;
   }

   @Nullable
   public static fri W() {
      return ax;
   }

   @Nullable
   public static fri X() {
      return ay;
   }

   @Nullable
   public static fri Y() {
      return az;
   }

   @Nullable
   public static fri Z() {
      return aA;
   }

   @Nullable
   public static fri aa() {
      return aB;
   }

   @Nullable
   public static fri ab() {
      return aC;
   }

   @Nullable
   public static fri ac() {
      return aD;
   }

   @Nullable
   public static fri ad() {
      return aE;
   }

   @Nullable
   public static fri ae() {
      return aF;
   }

   @Nullable
   public static fri af() {
      return aG;
   }

   @Nullable
   public static fri ag() {
      return aH;
   }

   @Nullable
   public static fri ah() {
      return aI;
   }

   @Nullable
   public static fri ai() {
      return aJ;
   }

   @Nullable
   public static fri aj() {
      return aK;
   }

   @Nullable
   public static fri ak() {
      return aL;
   }

   @Nullable
   public static fri al() {
      return aM;
   }

   @Nullable
   public static fri am() {
      return aN;
   }

   @Nullable
   public static fri an() {
      return aO;
   }

   @Nullable
   public static fri ao() {
      return aP;
   }

   @Nullable
   public static fri ap() {
      return aQ;
   }

   @Nullable
   public static fri aq() {
      return aR;
   }

   @Nullable
   public static fri ar() {
      return aS;
   }

   @Nullable
   public static fri as() {
      return aT;
   }

   @Nullable
   public static fri at() {
      return aU;
   }

   @Nullable
   public static fri au() {
      return aV;
   }

   public static record a(apk a, Map<agi, apf> b) implements apk {
      @Override
      public Optional<apf> getResource(agi $$0) {
         apf $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
