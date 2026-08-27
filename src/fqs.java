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

public class fqs implements AutoCloseable {
   private static final agm f = new agm("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   private static final int j = 3;
   final eti k;
   private final apl l;
   private final atw m = atw.a();
   private float n;
   public final fqv b;
   private final euv o;
   private final frf p;
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
   private final fqy A;
   private final gbq B = new gbq();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int c = 40;
   @Nullable
   private clo G;
   private int H;
   private float I;
   private float J;
   @Nullable
   frc K;
   static final agm[] L = new agm[]{
      new agm("shaders/post/notch.json"),
      new agm("shaders/post/fxaa.json"),
      new agm("shaders/post/art.json"),
      new agm("shaders/post/bumpy.json"),
      new agm("shaders/post/blobs2.json"),
      new agm("shaders/post/pencil.json"),
      new agm("shaders/post/color_convolve.json"),
      new agm("shaders/post/deconverge.json"),
      new agm("shaders/post/flip.json"),
      new agm("shaders/post/invert.json"),
      new agm("shaders/post/ntsc.json"),
      new agm("shaders/post/outline.json"),
      new agm("shaders/post/phosphor.json"),
      new agm("shaders/post/scan_pincushion.json"),
      new agm("shaders/post/sobel.json"),
      new agm("shaders/post/bits.json"),
      new agm("shaders/post/desaturate.json"),
      new agm("shaders/post/green.json"),
      new agm("shaders/post/blur.json"),
      new agm("shaders/post/wobble.json"),
      new agm("shaders/post/blobs.json"),
      new agm("shaders/post/antialias.json"),
      new agm("shaders/post/creeper.json"),
      new agm("shaders/post/spider.json")
   };
   public static final int d = L.length;
   int M = d;
   private boolean N;
   private final est O = new est();
   public frn e;
   private final Map<String, frn> P = Maps.newHashMap();
   @Nullable
   private static frn Q;
   @Nullable
   private static frn R;
   @Nullable
   private static frn S;
   @Nullable
   private static frn T;
   @Nullable
   private static frn U;
   @Nullable
   private static frn V;
   @Nullable
   private static frn W;
   @Nullable
   private static frn X;
   @Nullable
   private static frn Y;
   @Nullable
   private static frn Z;
   @Nullable
   private static frn aa;
   @Nullable
   private static frn ab;
   @Nullable
   private static frn ac;
   @Nullable
   private static frn ad;
   @Nullable
   private static frn ae;
   @Nullable
   private static frn af;
   @Nullable
   private static frn ag;
   @Nullable
   private static frn ah;
   @Nullable
   private static frn ai;
   @Nullable
   private static frn aj;
   @Nullable
   private static frn ak;
   @Nullable
   private static frn al;
   @Nullable
   private static frn am;
   @Nullable
   private static frn an;
   @Nullable
   private static frn ao;
   @Nullable
   private static frn ap;
   @Nullable
   private static frn aq;
   @Nullable
   private static frn ar;
   @Nullable
   private static frn as;
   @Nullable
   private static frn at;
   @Nullable
   private static frn au;
   @Nullable
   private static frn av;
   @Nullable
   private static frn aw;
   @Nullable
   private static frn ax;
   @Nullable
   private static frn ay;
   @Nullable
   private static frn az;
   @Nullable
   private static frn aA;
   @Nullable
   private static frn aB;
   @Nullable
   private static frn aC;
   @Nullable
   private static frn aD;
   @Nullable
   private static frn aE;
   @Nullable
   private static frn aF;
   @Nullable
   private static frn aG;
   @Nullable
   private static frn aH;
   @Nullable
   private static frn aI;
   @Nullable
   private static frn aJ;
   @Nullable
   private static frn aK;
   @Nullable
   private static frn aL;
   @Nullable
   private static frn aM;
   @Nullable
   private static frn aN;
   @Nullable
   private static frn aO;
   @Nullable
   private static frn aP;
   @Nullable
   private static frn aQ;
   @Nullable
   private static frn aR;
   @Nullable
   private static frn aS;
   @Nullable
   private static frn aT;
   @Nullable
   private static frn aU;
   @Nullable
   private static frn aV;

   public fqs(eti $$0, fqv $$1, apl $$2, frf $$3) {
      this.k = $$0;
      this.l = $$2;
      this.b = $$1;
      this.o = new euv($$0.X());
      this.A = new fqy(this, $$0);
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

   public void a(@Nullable bkv $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof caz) {
         this.a(new agm("shaders/post/creeper.json"));
      } else if ($$0 instanceof cby) {
         this.a(new agm("shaders/post/spider.json"));
      } else if ($$0 instanceof cbd) {
         this.a(new agm("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.k.al() instanceof cdz) {
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

   void a(agm $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new frc(this.k.X(), this.l, this.k.g(), $$0);
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

   public apf e() {
      return new apq<fqs.a>() {
         protected fqs.a a(apl $$0, bfs $$1) {
            Map<agm, apj> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(enp.a.b.b()) || $$1x.endsWith(enp.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<agm, apj> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new apj($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fqs.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fqs.a($$0, $$3);
         }

         protected void a(fqs.a $$0, apl $$1, bfs $$2) {
            fqs.this.b($$0);
            if (fqs.this.K != null) {
               fqs.this.K.close();
            }

            fqs.this.K = null;
            if (fqs.this.M == fqs.d) {
               fqs.this.a(fqs.this.k.al());
            } else {
               fqs.this.a(fqs.L[fqs.this.M]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(apo $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new frn($$0, "blit_screen", enz.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aS = this.a($$0, "rendertype_gui", enz.n);
         aT = this.a($$0, "rendertype_gui_overlay", enz.n);
         Q = this.a($$0, "position", enz.m);
         R = this.a($$0, "position_color", enz.n);
         S = this.a($$0, "position_color_tex", enz.r);
         T = this.a($$0, "position_tex", enz.q);
         U = this.a($$0, "position_tex_color", enz.s);
         aG = this.a($$0, "rendertype_text", enz.t);
      }
   }

   private frn a(apo $$0, String $$1, eog $$2) {
      try {
         frn $$3 = new frn($$0, $$1, $$2);
         this.P.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(apo $$0) {
      RenderSystem.assertOnRenderThread();
      List<enp> $$1 = Lists.newArrayList();
      $$1.addAll(enp.a.b.c().values());
      $$1.addAll(enp.a.a.c().values());
      $$1.forEach(enp::a);
      List<Pair<frn, Consumer<frn>>> $$2 = Lists.newArrayListWithCapacity(this.P.size());

      try {
         $$2.add(Pair.of(new frn($$0, "particle", enz.l), (Consumer<frn>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new frn($$0, "position", enz.m), (Consumer<frn>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new frn($$0, "position_color", enz.n), (Consumer<frn>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new frn($$0, "position_color_lightmap", enz.p), (Consumer<frn>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new frn($$0, "position_color_tex", enz.r), (Consumer<frn>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new frn($$0, "position_color_tex_lightmap", enz.t), (Consumer<frn>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new frn($$0, "position_tex", enz.q), (Consumer<frn>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new frn($$0, "position_tex_color", enz.s), (Consumer<frn>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new frn($$0, "position_tex_color_normal", enz.v), (Consumer<frn>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new frn($$0, "position_tex_lightmap_color", enz.u), (Consumer<frn>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_solid", enz.j), (Consumer<frn>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_cutout_mipped", enz.j), (Consumer<frn>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_cutout", enz.j), (Consumer<frn>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_translucent", enz.j), (Consumer<frn>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_translucent_moving_block", enz.j), (Consumer<frn>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_armor_cutout_no_cull", enz.k), (Consumer<frn>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_entity_solid", enz.k), (Consumer<frn>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_entity_cutout", enz.k), (Consumer<frn>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_entity_cutout_no_cull", enz.k), (Consumer<frn>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_entity_cutout_no_cull_z_offset", enz.k), (Consumer<frn>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_item_entity_translucent_cull", enz.k), (Consumer<frn>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_entity_translucent_cull", enz.k), (Consumer<frn>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_entity_translucent", enz.k), (Consumer<frn>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_entity_translucent_emissive", enz.k), (Consumer<frn>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_entity_smooth_cutout", enz.k), (Consumer<frn>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_beacon_beam", enz.j), (Consumer<frn>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_entity_decal", enz.k), (Consumer<frn>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_entity_no_outline", enz.k), (Consumer<frn>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_entity_shadow", enz.k), (Consumer<frn>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_entity_alpha", enz.k), (Consumer<frn>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_eyes", enz.k), (Consumer<frn>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_energy_swirl", enz.k), (Consumer<frn>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_leash", enz.p), (Consumer<frn>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_water_mask", enz.m), (Consumer<frn>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_outline", enz.r), (Consumer<frn>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_armor_glint", enz.q), (Consumer<frn>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_armor_entity_glint", enz.q), (Consumer<frn>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_glint_translucent", enz.q), (Consumer<frn>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_glint", enz.q), (Consumer<frn>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_glint_direct", enz.q), (Consumer<frn>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_entity_glint", enz.q), (Consumer<frn>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_entity_glint_direct", enz.q), (Consumer<frn>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_text", enz.t), (Consumer<frn>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_text_background", enz.p), (Consumer<frn>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_text_intensity", enz.t), (Consumer<frn>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_text_see_through", enz.t), (Consumer<frn>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_text_background_see_through", enz.p), (Consumer<frn>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_text_intensity_see_through", enz.t), (Consumer<frn>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_lightning", enz.n), (Consumer<frn>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_tripwire", enz.j), (Consumer<frn>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_end_portal", enz.m), (Consumer<frn>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_end_gateway", enz.m), (Consumer<frn>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_lines", enz.o), (Consumer<frn>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_crumbling", enz.j), (Consumer<frn>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_gui", enz.n), (Consumer<frn>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_gui_overlay", enz.n), (Consumer<frn>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_gui_text_highlight", enz.n), (Consumer<frn>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new frn($$0, "rendertype_gui_ghost_recipe_overlay", enz.n), (Consumer<frn>)$$0x -> aV = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((frn)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.av();
      $$2.forEach($$0x -> {
         frn $$1x = (frn)$$0x.getFirst();
         this.P.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void av() {
      RenderSystem.assertOnRenderThread();
      this.P.values().forEach(frn::close);
      this.P.clear();
   }

   @Nullable
   public frn a(@Nullable String $$0) {
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
   public frc g() {
      return this.K;
   }

   public void a(int $$0, int $$1) {
      if (this.K != null) {
         this.K.a($$0, $$1);
      }

      this.k.f.a($$0, $$1);
   }

   public void a(float $$0) {
      bkv $$1 = this.k.al();
      if ($$1 != null) {
         if (this.k.r != null) {
            this.k.aF().a("pick");
            this.k.u = null;
            double $$2 = (double)this.k.q.c();
            this.k.v = $$1.a($$2, $$0, false);
            ejz $$3 = $$1.j($$0);
            boolean $$4 = this.k.q.h();
            $$2 = $$4 ? 6.0 : $$2;
            boolean $$5 = !$$4;
            double $$6 = this.k.v != null ? this.k.v.e().g($$3) : $$2 * $$2;
            ejz $$7 = $$1.f(1.0F);
            ejz $$8 = $$3.b($$7.c * $$2, $$7.d * $$2, $$7.e * $$2);
            float $$9 = 1.0F;
            eju $$10 = $$1.cH().b($$7.a($$2)).c(1.0, 1.0, 1.0);
            ejw $$11 = ces.a($$1, $$3, $$8, $$10, $$0x -> !$$0x.P_() && $$0x.bt(), $$6);
            if ($$11 != null) {
               ejz $$12 = $$11.e();
               double $$13 = $$3.g($$12);
               if ($$5 && $$13 > 9.0) {
                  this.k.v = ejv.a($$12, ib.a($$7.c, $$7.d, $$7.e), hx.a($$12));
               } else if ($$13 < $$6 || this.k.v == null) {
                  this.k.v = $$11;
                  bkv $$14 = $$11.a();
                  this.k.u = $$14;
               }
            }

            this.k.aF().c();
         }
      }
   }

   private void aw() {
      float $$0 = 1.0F;
      if (this.k.al() instanceof fpy $$1) {
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

   private double a(est $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ae().c().intValue();
            $$3 *= (double)atq.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof bll && ((bll)$$0.g()).ex()) {
            float $$4 = Math.min((float)((bll)$$0.g()).aM + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         ecz $$5 = $$0.k();
         if ($$5 == ecz.a || $$5 == ecz.b) {
            $$3 *= atq.d(this.k.m.ah().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(eob $$0, float $$1) {
      if (this.k.al() instanceof bll $$2) {
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.ex()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = atq.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eF();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.al().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(eob $$0, float $$1) {
      if (this.k.al() instanceof cdz) {
         cdz $$2 = (cdz)this.k.al();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = atq.i($$1, $$2.bV, $$2.bW);
         $$0.a(atq.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(atq.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(atq.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(atq.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.D = $$0;
      this.E = $$1;
      this.F = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new eob());
      this.D = 1.0F;
   }

   private void a(eob $$0, est $$1, float $$2) {
      if (!this.C) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.k.m.Y().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.k.al() instanceof bll && ((bll)this.k.al()).fE();
         if (this.k.m.ax().a() && !$$3 && !this.k.m.Z && this.k.q.l() != csc.d) {
            this.A.c();
            this.b.a($$2, $$0, this.p.c(), this.k.s, this.k.an().a(this.k.s, $$2));
            this.A.b();
         }

         $$0.b();
         if (this.k.m.ax().a() && !$$3) {
            frj.a(this.k, $$0);
            this.a($$0, $$2);
         }

         if (this.k.m.Y().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, eoj.a);
   }

   public Matrix4f a(double $$0) {
      eob $$1 = new eob();
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

   public static float a(bll $$0, float $$1) {
      bki $$2 = $$0.b(bkk.p);
      return !$$2.a(200) ? 1.0F : 0.7F + atq.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
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
            this.a($$0, $$1, new eob());
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

         enf $$7 = this.k.aL();
         RenderSystem.clear(256, eti.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, eoj.b);
         eob $$9 = RenderSystem.getModelViewStack();
         $$9.a();
         $$9.e();
         $$9.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         emx.b();
         eut $$10 = new eut(this.k, this.p.c());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aF().b("gui");
            if (this.k.s != null) {
               float $$11 = atq.i($$3, this.k.s.cw, this.k.s.cv);
               float $$12 = this.k.m.ag().c().floatValue();
               if ($$11 > 0.0F && this.k.s.a(bkk.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.k.m.Z || this.k.y != null) {
               this.a(this.k.aL().o(), this.k.aL().p(), $$3);
               this.k.l.a($$10, $$3);
               RenderSystem.clear(256, eti.a);
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
            gfy $$1 = this.k.S();
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
         enc $$1 = ett.a(this.k.g());
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

            try (enc $$6 = new enc(64, 64, false)) {
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
         bkv $$0 = this.k.al();
         boolean $$1 = $$0 instanceof cdz && !this.k.m.Z;
         if ($$1 && !((cdz)$$0).fU().e) {
            clo $$2 = ((bll)$$0).eU();
            ejx $$3 = this.k.v;
            if ($$3 != null && $$3.c() == ejx.a.b) {
               hx $$4 = ((ejv)$$3).a();
               dhn $$5 = this.k.r.a_($$4);
               if (this.k.q.l() == csc.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  dhr $$6 = new dhr(this.k.r, $$4, false);
                  is<cvf> $$7 = this.k.r.I_().d(kd.e);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, eob $$2) {
      this.A.a($$0);
      if (this.k.al() == null) {
         this.k.a(this.k.s);
      }

      this.a($$0);
      this.k.aF().a("center");
      boolean $$3 = this.ay();
      this.k.aF().b("camera");
      est $$4 = this.O;
      this.n = (float)(this.k.m.aA() * 16);
      eob $$5 = new eob();
      double $$6 = this.a($$4, $$0, true);
      $$5.a(this.a($$6));
      this.a($$5, $$0);
      if (this.k.m.Y().c()) {
         this.b($$5, $$0);
      }

      float $$7 = this.k.m.ag().c().floatValue();
      float $$8 = atq.i($$0, this.k.s.cw, this.k.s.cv) * $$7 * $$7;
      if ($$8 > 0.0F) {
         int $$9 = this.k.s.a(bkk.i) ? 7 : 20;
         float $$10 = 5.0F / ($$8 * $$8 + 5.0F) - $$8 * 0.04F;
         $$10 *= $$10;
         a $$11 = a.of(new Vector3f(0.0F, atq.g / 2.0F, atq.g / 2.0F));
         $$5.a($$11.rotationDegrees(((float)this.q + $$0) * (float)$$9));
         $$5.b(1.0F / $$10, 1.0F, 1.0F);
         float $$12 = -((float)this.q + $$0) * (float)$$9;
         $$5.a($$11.rotationDegrees($$12));
      }

      Matrix4f $$13 = $$5.c().a();
      this.a($$13);
      bkv $$14 = (bkv)(this.k.al() == null ? this.k.s : this.k.al());
      $$4.a(this.k.r, $$14, !this.k.m.ax().a(), this.k.m.ax().b(), this.k.r.r().a($$14) ? 1.0F : $$0);
      $$2.a(a.b.rotationDegrees($$4.d()));
      $$2.a(a.d.rotationDegrees($$4.e() + 180.0F));
      Matrix3f $$15 = new Matrix3f($$2.c().b()).invert();
      RenderSystem.setInverseViewRotationMatrix($$15);
      this.k.f.a($$2, $$4.b(), this.a(Math.max($$6, (double)this.k.m.ae().c().intValue())));
      this.k.f.a($$2, $$0, $$1, $$3, $$4, this, this.A, $$13);
      this.k.aF().b("hand");
      if (this.v) {
         RenderSystem.clear(256, eti.a);
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

   public euv j() {
      return this.o;
   }

   public void a(clo $$0) {
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
         eob $$11 = new eob();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * atq.e(atq.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * atq.e(atq.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * atq.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * atq.e(atq.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * atq.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * atq.b($$4 * 8.0F)));
         fqz.a $$13 = this.p.c();
         this.k.ap().a(this.G, cll.i, 15728880, gbq.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(eut $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = atq.i($$1, 2.0F, 1.0F);
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

   public eti k() {
      return this.k;
   }

   public float b(float $$0) {
      return atq.i($$0, this.u, this.t);
   }

   public float l() {
      return this.n;
   }

   public est m() {
      return this.O;
   }

   public fqy n() {
      return this.A;
   }

   public gbq o() {
      return this.B;
   }

   @Nullable
   public static frn p() {
      return Q;
   }

   @Nullable
   public static frn q() {
      return R;
   }

   @Nullable
   public static frn r() {
      return S;
   }

   @Nullable
   public static frn s() {
      return T;
   }

   @Nullable
   public static frn t() {
      return U;
   }

   @Nullable
   public static frn u() {
      return V;
   }

   @Nullable
   public static frn v() {
      return W;
   }

   @Nullable
   public static frn w() {
      return X;
   }

   @Nullable
   public static frn x() {
      return Y;
   }

   @Nullable
   public static frn y() {
      return Z;
   }

   @Nullable
   public static frn z() {
      return aa;
   }

   @Nullable
   public static frn A() {
      return ab;
   }

   @Nullable
   public static frn B() {
      return ac;
   }

   @Nullable
   public static frn C() {
      return ad;
   }

   @Nullable
   public static frn D() {
      return ae;
   }

   @Nullable
   public static frn E() {
      return af;
   }

   @Nullable
   public static frn F() {
      return ag;
   }

   @Nullable
   public static frn G() {
      return ah;
   }

   @Nullable
   public static frn H() {
      return ai;
   }

   @Nullable
   public static frn I() {
      return aj;
   }

   @Nullable
   public static frn J() {
      return ak;
   }

   @Nullable
   public static frn K() {
      return al;
   }

   @Nullable
   public static frn L() {
      return am;
   }

   @Nullable
   public static frn M() {
      return an;
   }

   @Nullable
   public static frn N() {
      return ao;
   }

   @Nullable
   public static frn O() {
      return ap;
   }

   @Nullable
   public static frn P() {
      return aq;
   }

   @Nullable
   public static frn Q() {
      return ar;
   }

   @Nullable
   public static frn R() {
      return as;
   }

   @Nullable
   public static frn S() {
      return at;
   }

   @Nullable
   public static frn T() {
      return au;
   }

   @Nullable
   public static frn U() {
      return av;
   }

   @Nullable
   public static frn V() {
      return aw;
   }

   @Nullable
   public static frn W() {
      return ax;
   }

   @Nullable
   public static frn X() {
      return ay;
   }

   @Nullable
   public static frn Y() {
      return az;
   }

   @Nullable
   public static frn Z() {
      return aA;
   }

   @Nullable
   public static frn aa() {
      return aB;
   }

   @Nullable
   public static frn ab() {
      return aC;
   }

   @Nullable
   public static frn ac() {
      return aD;
   }

   @Nullable
   public static frn ad() {
      return aE;
   }

   @Nullable
   public static frn ae() {
      return aF;
   }

   @Nullable
   public static frn af() {
      return aG;
   }

   @Nullable
   public static frn ag() {
      return aH;
   }

   @Nullable
   public static frn ah() {
      return aI;
   }

   @Nullable
   public static frn ai() {
      return aJ;
   }

   @Nullable
   public static frn aj() {
      return aK;
   }

   @Nullable
   public static frn ak() {
      return aL;
   }

   @Nullable
   public static frn al() {
      return aM;
   }

   @Nullable
   public static frn am() {
      return aN;
   }

   @Nullable
   public static frn an() {
      return aO;
   }

   @Nullable
   public static frn ao() {
      return aP;
   }

   @Nullable
   public static frn ap() {
      return aQ;
   }

   @Nullable
   public static frn aq() {
      return aR;
   }

   @Nullable
   public static frn ar() {
      return aS;
   }

   @Nullable
   public static frn as() {
      return aT;
   }

   @Nullable
   public static frn at() {
      return aU;
   }

   @Nullable
   public static frn au() {
      return aV;
   }

   public static record a(apo a, Map<agm, apj> b) implements apo {
      @Override
      public Optional<apj> getResource(agm $$0) {
         apj $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
