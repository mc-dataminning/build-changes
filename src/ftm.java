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

public class ftm implements AutoCloseable {
   private static final ahh f = new ahh("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   final evr j;
   private final aqj k;
   private final auw l = auw.a();
   private float m;
   public final ftp b;
   private final exh n;
   private final ftz o;
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
   private final fts z;
   private final ges A = new ges();
   private boolean B;
   private float C = 1.0F;
   private float D;
   private float E;
   public static final int c = 40;
   @Nullable
   private cng F;
   private int G;
   private float H;
   private float I;
   @Nullable
   ftw J;
   static final ahh[] K = new ahh[]{
      new ahh("shaders/post/notch.json"),
      new ahh("shaders/post/fxaa.json"),
      new ahh("shaders/post/art.json"),
      new ahh("shaders/post/bumpy.json"),
      new ahh("shaders/post/blobs2.json"),
      new ahh("shaders/post/pencil.json"),
      new ahh("shaders/post/color_convolve.json"),
      new ahh("shaders/post/deconverge.json"),
      new ahh("shaders/post/flip.json"),
      new ahh("shaders/post/invert.json"),
      new ahh("shaders/post/ntsc.json"),
      new ahh("shaders/post/outline.json"),
      new ahh("shaders/post/phosphor.json"),
      new ahh("shaders/post/scan_pincushion.json"),
      new ahh("shaders/post/sobel.json"),
      new ahh("shaders/post/bits.json"),
      new ahh("shaders/post/desaturate.json"),
      new ahh("shaders/post/green.json"),
      new ahh("shaders/post/blur.json"),
      new ahh("shaders/post/wobble.json"),
      new ahh("shaders/post/blobs.json"),
      new ahh("shaders/post/antialias.json"),
      new ahh("shaders/post/creeper.json"),
      new ahh("shaders/post/spider.json")
   };
   public static final int d = K.length;
   int L = d;
   private boolean M;
   private final evc N = new evc();
   public fuh e;
   private final Map<String, fuh> O = Maps.newHashMap();
   @Nullable
   private static fuh P;
   @Nullable
   private static fuh Q;
   @Nullable
   private static fuh R;
   @Nullable
   private static fuh S;
   @Nullable
   private static fuh T;
   @Nullable
   private static fuh U;
   @Nullable
   private static fuh V;
   @Nullable
   private static fuh W;
   @Nullable
   private static fuh X;
   @Nullable
   private static fuh Y;
   @Nullable
   private static fuh Z;
   @Nullable
   private static fuh aa;
   @Nullable
   private static fuh ab;
   @Nullable
   private static fuh ac;
   @Nullable
   private static fuh ad;
   @Nullable
   private static fuh ae;
   @Nullable
   private static fuh af;
   @Nullable
   private static fuh ag;
   @Nullable
   private static fuh ah;
   @Nullable
   private static fuh ai;
   @Nullable
   private static fuh aj;
   @Nullable
   private static fuh ak;
   @Nullable
   private static fuh al;
   @Nullable
   private static fuh am;
   @Nullable
   private static fuh an;
   @Nullable
   private static fuh ao;
   @Nullable
   private static fuh ap;
   @Nullable
   private static fuh aq;
   @Nullable
   private static fuh ar;
   @Nullable
   private static fuh as;
   @Nullable
   private static fuh at;
   @Nullable
   private static fuh au;
   @Nullable
   private static fuh av;
   @Nullable
   private static fuh aw;
   @Nullable
   private static fuh ax;
   @Nullable
   private static fuh ay;
   @Nullable
   private static fuh az;
   @Nullable
   private static fuh aA;
   @Nullable
   private static fuh aB;
   @Nullable
   private static fuh aC;
   @Nullable
   private static fuh aD;
   @Nullable
   private static fuh aE;
   @Nullable
   private static fuh aF;
   @Nullable
   private static fuh aG;
   @Nullable
   private static fuh aH;
   @Nullable
   private static fuh aI;
   @Nullable
   private static fuh aJ;
   @Nullable
   private static fuh aK;
   @Nullable
   private static fuh aL;
   @Nullable
   private static fuh aM;
   @Nullable
   private static fuh aN;
   @Nullable
   private static fuh aO;
   @Nullable
   private static fuh aP;
   @Nullable
   private static fuh aQ;
   @Nullable
   private static fuh aR;
   @Nullable
   private static fuh aS;
   @Nullable
   private static fuh aT;
   @Nullable
   private static fuh aU;
   @Nullable
   private static fuh aV;

   public ftm(evr $$0, ftp $$1, aqj $$2, ftz $$3) {
      this.j = $$0;
      this.k = $$2;
      this.b = $$1;
      this.n = new exh($$0.Y());
      this.z = new fts(this, $$0);
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

   public void a(@Nullable blw $$0) {
      if (this.J != null) {
         this.J.close();
      }

      this.J = null;
      if ($$0 instanceof cci) {
         this.a(new ahh("shaders/post/creeper.json"));
      } else if ($$0 instanceof cdh) {
         this.a(new ahh("shaders/post/spider.json"));
      } else if ($$0 instanceof ccm) {
         this.a(new ahh("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.j.am() instanceof cfq) {
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

   void a(ahh $$0) {
      if (this.J != null) {
         this.J.close();
      }

      try {
         this.J = new ftw(this.j.Y(), this.k, this.j.g(), $$0);
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

   public aqd e() {
      return new aqo<ftm.a>() {
         protected ftm.a a(aqj $$0, bgt $$1) {
            Map<ahh, aqh> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(epy.a.b.b()) || $$1x.endsWith(epy.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<ahh, aqh> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new aqh($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  ftm.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new ftm.a($$0, $$3);
         }

         protected void a(ftm.a $$0, aqj $$1, bgt $$2) {
            ftm.this.b($$0);
            if (ftm.this.J != null) {
               ftm.this.J.close();
            }

            ftm.this.J = null;
            if (ftm.this.L == ftm.d) {
               ftm.this.a(ftm.this.j.am());
            } else {
               ftm.this.a(ftm.K[ftm.this.L]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(aqm $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new fuh($$0, "blit_screen", eqi.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aS = this.a($$0, "rendertype_gui", eqi.n);
         aT = this.a($$0, "rendertype_gui_overlay", eqi.n);
         P = this.a($$0, "position", eqi.m);
         Q = this.a($$0, "position_color", eqi.n);
         R = this.a($$0, "position_color_tex", eqi.r);
         S = this.a($$0, "position_tex", eqi.q);
         T = this.a($$0, "position_tex_color", eqi.s);
         aG = this.a($$0, "rendertype_text", eqi.t);
      }
   }

   private fuh a(aqm $$0, String $$1, eqp $$2) {
      try {
         fuh $$3 = new fuh($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(aqm $$0) {
      RenderSystem.assertOnRenderThread();
      List<epy> $$1 = Lists.newArrayList();
      $$1.addAll(epy.a.b.c().values());
      $$1.addAll(epy.a.a.c().values());
      $$1.forEach(epy::a);
      List<Pair<fuh, Consumer<fuh>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new fuh($$0, "particle", eqi.l), (Consumer<fuh>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new fuh($$0, "position", eqi.m), (Consumer<fuh>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new fuh($$0, "position_color", eqi.n), (Consumer<fuh>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new fuh($$0, "position_color_lightmap", eqi.p), (Consumer<fuh>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new fuh($$0, "position_color_tex", eqi.r), (Consumer<fuh>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new fuh($$0, "position_color_tex_lightmap", eqi.t), (Consumer<fuh>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new fuh($$0, "position_tex", eqi.q), (Consumer<fuh>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new fuh($$0, "position_tex_color", eqi.s), (Consumer<fuh>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new fuh($$0, "position_tex_color_normal", eqi.v), (Consumer<fuh>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new fuh($$0, "position_tex_lightmap_color", eqi.u), (Consumer<fuh>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_solid", eqi.j), (Consumer<fuh>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_cutout_mipped", eqi.j), (Consumer<fuh>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_cutout", eqi.j), (Consumer<fuh>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_translucent", eqi.j), (Consumer<fuh>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_translucent_moving_block", eqi.j), (Consumer<fuh>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_armor_cutout_no_cull", eqi.k), (Consumer<fuh>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_entity_solid", eqi.k), (Consumer<fuh>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_entity_cutout", eqi.k), (Consumer<fuh>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_entity_cutout_no_cull", eqi.k), (Consumer<fuh>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_entity_cutout_no_cull_z_offset", eqi.k), (Consumer<fuh>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_item_entity_translucent_cull", eqi.k), (Consumer<fuh>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_entity_translucent_cull", eqi.k), (Consumer<fuh>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_entity_translucent", eqi.k), (Consumer<fuh>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_entity_translucent_emissive", eqi.k), (Consumer<fuh>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_entity_smooth_cutout", eqi.k), (Consumer<fuh>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_beacon_beam", eqi.j), (Consumer<fuh>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_entity_decal", eqi.k), (Consumer<fuh>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_entity_no_outline", eqi.k), (Consumer<fuh>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_entity_shadow", eqi.k), (Consumer<fuh>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_entity_alpha", eqi.k), (Consumer<fuh>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_eyes", eqi.k), (Consumer<fuh>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_energy_swirl", eqi.k), (Consumer<fuh>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_leash", eqi.p), (Consumer<fuh>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_water_mask", eqi.m), (Consumer<fuh>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_outline", eqi.r), (Consumer<fuh>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_armor_glint", eqi.q), (Consumer<fuh>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_armor_entity_glint", eqi.q), (Consumer<fuh>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_glint_translucent", eqi.q), (Consumer<fuh>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_glint", eqi.q), (Consumer<fuh>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_glint_direct", eqi.q), (Consumer<fuh>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_entity_glint", eqi.q), (Consumer<fuh>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_entity_glint_direct", eqi.q), (Consumer<fuh>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_text", eqi.t), (Consumer<fuh>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_text_background", eqi.p), (Consumer<fuh>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_text_intensity", eqi.t), (Consumer<fuh>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_text_see_through", eqi.t), (Consumer<fuh>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_text_background_see_through", eqi.p), (Consumer<fuh>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_text_intensity_see_through", eqi.t), (Consumer<fuh>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_lightning", eqi.n), (Consumer<fuh>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_tripwire", eqi.j), (Consumer<fuh>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_end_portal", eqi.m), (Consumer<fuh>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_end_gateway", eqi.m), (Consumer<fuh>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_lines", eqi.o), (Consumer<fuh>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_crumbling", eqi.j), (Consumer<fuh>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_gui", eqi.n), (Consumer<fuh>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_gui_overlay", eqi.n), (Consumer<fuh>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_gui_text_highlight", eqi.n), (Consumer<fuh>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_gui_ghost_recipe_overlay", eqi.n), (Consumer<fuh>)$$0x -> aV = $$0x));
         $$2.add(Pair.of(new fuh($$0, "rendertype_breeze_wind", eqi.k), (Consumer<fuh>)$$0x -> av = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((fuh)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.aw();
      $$2.forEach($$0x -> {
         fuh $$1x = (fuh)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void aw() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(fuh::close);
      this.O.clear();
   }

   @Nullable
   public fuh a(@Nullable String $$0) {
      return $$0 == null ? null : this.O.get($$0);
   }

   public void f() {
      this.ax();
      this.z.a();
      if (this.j.am() == null) {
         this.j.a(this.j.s);
      }

      this.N.a();
      this.b.a();
      this.p++;
      if (this.j.r.s().i()) {
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
   }

   @Nullable
   public ftw g() {
      return this.J;
   }

   public void a(int $$0, int $$1) {
      if (this.J != null) {
         this.J.a($$0, $$1);
      }

      this.j.f.a($$0, $$1);
   }

   public void a(float $$0) {
      blw $$1 = this.j.am();
      if ($$1 != null) {
         if (this.j.r != null && this.j.s != null) {
            this.j.aG().a("pick");
            this.j.u = null;
            double $$2 = this.j.s.gs();
            double $$3 = this.j.s.gt();
            double $$4 = Math.max($$2, $$3);
            this.j.v = $$1.a($$2, $$0, false);
            emc $$5 = $$1.j($$0);
            double $$6 = $$4;
            double $$7 = aup.k($$4);
            if (this.j.v != null) {
               $$7 = this.j.v.e().g($$5);
               $$6 = Math.sqrt($$7);
            }

            emc $$8 = $$1.f(1.0F);
            emc $$9 = $$5.b($$8.c * $$4, $$8.d * $$4, $$8.e * $$4);
            float $$10 = 1.0F;
            elx $$11 = $$1.cH().b($$8.a($$6)).c(1.0, 1.0, 1.0);
            elz $$12 = cgj.a($$1, $$5, $$9, $$11, $$0x -> !$$0x.P_() && $$0x.bt(), $$7);
            if ($$12 != null) {
               emc $$13 = $$12.e();
               if ($$5.a((ir)$$13, $$3)) {
                  this.j.v = $$12;
                  this.j.u = $$12.a();
               } else {
                  this.j.v = ely.a($$13, ic.a($$8.c, $$8.d, $$8.e), hx.a($$13));
               }
            }

            this.j.aG().c();
         }
      }
   }

   private void ax() {
      float $$0 = 1.0F;
      if (this.j.am() instanceof fss $$1) {
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

   private double a(evc $$0, float $$1, boolean $$2) {
      if (this.B) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.j.m.ae().c().intValue();
            $$3 *= (double)aup.i($$1, this.r, this.q);
         }

         if ($$0.g() instanceof bmo && ((bmo)$$0.g()).ew()) {
            float $$4 = Math.min((float)((bmo)$$0.g()).aM + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         efb $$5 = $$0.k();
         if ($$5 == efb.a || $$5 == efb.b) {
            $$3 *= aup.d(this.j.m.ah().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(eqk $$0, float $$1) {
      if (this.j.am() instanceof bmo $$2) {
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.ew()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = aup.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eE();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.j.m.al().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(eqk $$0, float $$1) {
      if (this.j.am() instanceof cfq) {
         cfq $$2 = (cfq)this.j.am();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = aup.i($$1, $$2.bZ, $$2.ca);
         $$0.a(aup.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(aup.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(aup.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(aup.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.C = $$0;
      this.D = $$1;
      this.E = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new eqk());
      this.C = 1.0F;
   }

   private void a(eqk $$0, evc $$1, float $$2) {
      if (!this.B) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.j.m.Y().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.j.am() instanceof bmo && ((bmo)this.j.am()).fD();
         if (this.j.m.ax().a() && !$$3 && !this.j.m.Z && this.j.q.j() != ctu.d) {
            this.z.c();
            this.b.a($$2, $$0, this.o.c(), this.j.s, this.j.ao().a(this.j.s, $$2));
            this.z.b();
         }

         $$0.b();
         if (this.j.m.ax().a() && !$$3) {
            fud.a(this.j, $$0);
            this.a($$0, $$2);
         }

         if (this.j.m.Y().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, eqs.a);
   }

   public Matrix4f a(double $$0) {
      eqk $$1 = new eqk();
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

   public static float a(bmo $$0, float $$1) {
      blj $$2 = $$0.c(bll.p);
      return !$$2.a(200) ? 1.0F : 0.7F + aup.a(((float)$$2.c() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(float $$0, long $$1, boolean $$2) {
      if (!this.j.aA() && this.j.m.n && (!this.j.m.W().c() || !this.j.n.d())) {
         if (ac.b() - this.y > 500L) {
            this.j.c(false);
         }
      } else {
         this.y = ac.b();
      }

      if (!this.j.x) {
         float $$3 = this.j.r != null && this.j.r.s().i() ? $$0 : 1.0F;
         boolean $$4 = this.j.c();
         int $$5 = (int)(this.j.n.e() * (double)this.j.aM().o() / (double)this.j.aM().m());
         int $$6 = (int)(this.j.n.f() * (double)this.j.aM().p() / (double)this.j.aM().n());
         RenderSystem.viewport(0, 0, this.j.aM().k(), this.j.aM().l());
         if ($$4 && $$2 && this.j.r != null) {
            this.j.aG().a("level");
            this.a($$0, $$1, new eqk());
            this.ay();
            this.j.f.b();
            if (this.J != null && this.M) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.J.a($$3);
            }

            this.j.g().a(true);
         }

         epo $$7 = this.j.aM();
         RenderSystem.clear(256, evr.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, eqs.b);
         eqk $$9 = RenderSystem.getModelViewStack();
         $$9.a();
         $$9.e();
         $$9.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         epg.b();
         exe $$10 = new exe(this.j, this.o.c());
         if ($$4 && $$2 && this.j.r != null) {
            this.j.aG().b("gui");
            if (this.j.s != null) {
               float $$11 = aup.i($$3, this.j.s.cB, this.j.s.cA);
               float $$12 = this.j.m.ag().c().floatValue();
               if ($$11 > 0.0F && this.j.s.a(bll.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.j.m.Z) {
               this.a(this.j.aM().o(), this.j.aM().p(), $$3);
            }

            this.j.l.a($$10, $$3);
            RenderSystem.clear(256, evr.a);
            this.j.aG().c();
         }

         if (this.j.aJ() != null) {
            try {
               this.j.aJ().a($$10, $$5, $$6, this.j.at());
            } catch (Throwable var18) {
               o $$14 = o.a(var18, "Rendering overlay");
               p $$15 = $$14.a("Overlay render details");
               $$15.a("Overlay name", () -> this.j.aJ().getClass().getCanonicalName());
               throw new y($$14);
            }
         } else if ($$4 && this.j.y != null) {
            try {
               this.j.y.c($$10, $$5, $$6, this.j.at());
            } catch (Throwable var17) {
               o $$17 = o.a(var17, "Rendering screen");
               p $$18 = $$17.a("Screen render details");
               $$18.a("Screen name", () -> this.j.y.getClass().getCanonicalName());
               $$18.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", $$5, $$6, this.j.n.e(), this.j.n.f()));
               $$18.a(
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
               throw new y($$17);
            }

            try {
               if (this.j.y != null) {
                  this.j.y.A();
               }
            } catch (Throwable var16) {
               o $$20 = o.a(var16, "Narrating screen");
               p $$21 = $$20.a("Screen details");
               $$21.a("Screen name", () -> this.j.y.getClass().getCanonicalName());
               throw new y($$20);
            }
         }

         if ($$4) {
            this.j.aG().a("toasts");
            this.j.ay().a($$10);
            this.j.aG().c();
         }

         $$10.e();
         $$9.b();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void ay() {
      if (!this.x && this.j.R()) {
         long $$0 = ac.b();
         if ($$0 - this.w >= 1000L) {
            this.w = $$0;
            gjf $$1 = this.j.T();
            if ($$1 != null && !$$1.ad()) {
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
         epl $$1 = ewc.a(this.j.g());
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

            try (epl $$6 = new epl(64, 64, false)) {
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
         blw $$0 = this.j.am();
         boolean $$1 = $$0 instanceof cfq && !this.j.m.Z;
         if ($$1 && !((cfq)$$0).fT().e) {
            cng $$2 = ((bmo)$$0).eT();
            ema $$3 = this.j.v;
            if ($$3 != null && $$3.c() == ema.a.b) {
               hx $$4 = ((ely)$$3).a();
               djp $$5 = this.j.r.a_($$4);
               if (this.j.q.j() == ctu.d) {
                  $$1 = $$5.b(this.j.r, $$4) != null;
               } else {
                  djt $$6 = new djt(this.j.r, $$4, false);
                  it<cwy> $$7 = this.j.r.I_().d(ke.f);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, eqk $$2) {
      this.z.a($$0);
      if (this.j.am() == null) {
         this.j.a(this.j.s);
      }

      this.a($$0);
      this.j.aG().a("center");
      boolean $$3 = this.az();
      this.j.aG().b("camera");
      evc $$4 = this.N;
      blw $$5 = (blw)(this.j.am() == null ? this.j.s : this.j.am());
      $$4.a(this.j.r, $$5, !this.j.m.ax().a(), this.j.m.ax().b(), this.j.r.s().a($$5) ? 1.0F : $$0);
      this.m = (float)(this.j.m.aA() * 16);
      eqk $$6 = new eqk();
      double $$7 = this.a($$4, $$0, true);
      $$6.a(this.a($$7));
      this.a($$6, $$4.p());
      if (this.j.m.Y().c()) {
         this.b($$6, $$4.p());
      }

      float $$8 = this.j.m.ag().c().floatValue();
      float $$9 = aup.i($$0, this.j.s.cB, this.j.s.cA) * $$8 * $$8;
      if ($$9 > 0.0F) {
         int $$10 = this.j.s.a(bll.i) ? 7 : 20;
         float $$11 = 5.0F / ($$9 * $$9 + 5.0F) - $$9 * 0.04F;
         $$11 *= $$11;
         a $$12 = a.of(new Vector3f(0.0F, aup.g / 2.0F, aup.g / 2.0F));
         $$6.a($$12.rotationDegrees(((float)this.p + $$0) * (float)$$10));
         $$6.b(1.0F / $$11, 1.0F, 1.0F);
         float $$13 = -((float)this.p + $$0) * (float)$$10;
         $$6.a($$12.rotationDegrees($$13));
      }

      Matrix4f $$14 = $$6.c().a();
      this.a($$14);
      $$2.a(a.b.rotationDegrees($$4.d()));
      $$2.a(a.d.rotationDegrees($$4.e() + 180.0F));
      Matrix3f $$15 = new Matrix3f($$2.c().b()).invert();
      RenderSystem.setInverseViewRotationMatrix($$15);
      this.j.f.a($$2, $$4.b(), this.a(Math.max($$7, (double)this.j.m.ae().c().intValue())));
      this.j.f.a($$2, $$0, $$1, $$3, $$4, this, this.z, $$14);
      this.j.aG().b("hand");
      if (this.u) {
         RenderSystem.clear(256, evr.a);
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

   public exh j() {
      return this.n;
   }

   public void a(cng $$0) {
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
         eqk $$11 = new eqk();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * aup.e(aup.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * aup.e(aup.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * aup.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * aup.e(aup.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * aup.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * aup.b($$4 * 8.0F)));
         ftt.a $$13 = this.o.c();
         this.j.aq().a(this.F, cnd.i, 15728880, ges.d, $$11, $$13, this.j.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(exe $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = aup.i($$1, 2.0F, 1.0F);
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

   public evr k() {
      return this.j;
   }

   public float b(float $$0) {
      return aup.i($$0, this.t, this.s);
   }

   public float l() {
      return this.m;
   }

   public evc m() {
      return this.N;
   }

   public fts n() {
      return this.z;
   }

   public ges o() {
      return this.A;
   }

   @Nullable
   public static fuh p() {
      return P;
   }

   @Nullable
   public static fuh q() {
      return Q;
   }

   @Nullable
   public static fuh r() {
      return R;
   }

   @Nullable
   public static fuh s() {
      return S;
   }

   @Nullable
   public static fuh t() {
      return T;
   }

   @Nullable
   public static fuh u() {
      return U;
   }

   @Nullable
   public static fuh v() {
      return V;
   }

   @Nullable
   public static fuh w() {
      return W;
   }

   @Nullable
   public static fuh x() {
      return X;
   }

   @Nullable
   public static fuh y() {
      return Y;
   }

   @Nullable
   public static fuh z() {
      return Z;
   }

   @Nullable
   public static fuh A() {
      return aa;
   }

   @Nullable
   public static fuh B() {
      return ab;
   }

   @Nullable
   public static fuh C() {
      return ac;
   }

   @Nullable
   public static fuh D() {
      return ad;
   }

   @Nullable
   public static fuh E() {
      return ae;
   }

   @Nullable
   public static fuh F() {
      return af;
   }

   @Nullable
   public static fuh G() {
      return ag;
   }

   @Nullable
   public static fuh H() {
      return ah;
   }

   @Nullable
   public static fuh I() {
      return ai;
   }

   @Nullable
   public static fuh J() {
      return aj;
   }

   @Nullable
   public static fuh K() {
      return ak;
   }

   @Nullable
   public static fuh L() {
      return al;
   }

   @Nullable
   public static fuh M() {
      return am;
   }

   @Nullable
   public static fuh N() {
      return an;
   }

   @Nullable
   public static fuh O() {
      return ao;
   }

   @Nullable
   public static fuh P() {
      return ap;
   }

   @Nullable
   public static fuh Q() {
      return aq;
   }

   @Nullable
   public static fuh R() {
      return ar;
   }

   @Nullable
   public static fuh S() {
      return as;
   }

   @Nullable
   public static fuh T() {
      return at;
   }

   @Nullable
   public static fuh U() {
      return au;
   }

   @Nullable
   public static fuh V() {
      return av;
   }

   @Nullable
   public static fuh W() {
      return aw;
   }

   @Nullable
   public static fuh X() {
      return ax;
   }

   @Nullable
   public static fuh Y() {
      return ay;
   }

   @Nullable
   public static fuh Z() {
      return az;
   }

   @Nullable
   public static fuh aa() {
      return aA;
   }

   @Nullable
   public static fuh ab() {
      return aB;
   }

   @Nullable
   public static fuh ac() {
      return aC;
   }

   @Nullable
   public static fuh ad() {
      return aD;
   }

   @Nullable
   public static fuh ae() {
      return aE;
   }

   @Nullable
   public static fuh af() {
      return aF;
   }

   @Nullable
   public static fuh ag() {
      return aG;
   }

   @Nullable
   public static fuh ah() {
      return aH;
   }

   @Nullable
   public static fuh ai() {
      return aI;
   }

   @Nullable
   public static fuh aj() {
      return aJ;
   }

   @Nullable
   public static fuh ak() {
      return aK;
   }

   @Nullable
   public static fuh al() {
      return aL;
   }

   @Nullable
   public static fuh am() {
      return aM;
   }

   @Nullable
   public static fuh an() {
      return aN;
   }

   @Nullable
   public static fuh ao() {
      return aO;
   }

   @Nullable
   public static fuh ap() {
      return aP;
   }

   @Nullable
   public static fuh aq() {
      return aQ;
   }

   @Nullable
   public static fuh ar() {
      return aR;
   }

   @Nullable
   public static fuh as() {
      return aS;
   }

   @Nullable
   public static fuh at() {
      return aT;
   }

   @Nullable
   public static fuh au() {
      return aU;
   }

   @Nullable
   public static fuh av() {
      return aV;
   }

   public static record a(aqm a, Map<ahh, aqh> b) implements aqm {
      @Override
      public Optional<aqh> getResource(ahh $$0) {
         aqh $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
