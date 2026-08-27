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

public class fnn implements AutoCloseable {
   private static final aer f = new aer("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   final eql j;
   private final anm k;
   private final aru l = aru.a();
   private float m;
   public final fnq b;
   private final erx n;
   private final foa o;
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
   private final fnt z;
   private final fyl A = new fyl();
   private boolean B;
   private float C = 1.0F;
   private float D;
   private float E;
   public static final int c = 40;
   @Nullable
   private cix F;
   private int G;
   private float H;
   private float I;
   @Nullable
   fnx J;
   static final aer[] K = new aer[]{
      new aer("shaders/post/notch.json"),
      new aer("shaders/post/fxaa.json"),
      new aer("shaders/post/art.json"),
      new aer("shaders/post/bumpy.json"),
      new aer("shaders/post/blobs2.json"),
      new aer("shaders/post/pencil.json"),
      new aer("shaders/post/color_convolve.json"),
      new aer("shaders/post/deconverge.json"),
      new aer("shaders/post/flip.json"),
      new aer("shaders/post/invert.json"),
      new aer("shaders/post/ntsc.json"),
      new aer("shaders/post/outline.json"),
      new aer("shaders/post/phosphor.json"),
      new aer("shaders/post/scan_pincushion.json"),
      new aer("shaders/post/sobel.json"),
      new aer("shaders/post/bits.json"),
      new aer("shaders/post/desaturate.json"),
      new aer("shaders/post/green.json"),
      new aer("shaders/post/blur.json"),
      new aer("shaders/post/wobble.json"),
      new aer("shaders/post/blobs.json"),
      new aer("shaders/post/antialias.json"),
      new aer("shaders/post/creeper.json"),
      new aer("shaders/post/spider.json")
   };
   public static final int d = K.length;
   int L = d;
   private boolean M;
   private final epw N = new epw();
   public foh e;
   private final Map<String, foh> O = Maps.newHashMap();
   @Nullable
   private static foh P;
   @Nullable
   private static foh Q;
   @Nullable
   private static foh R;
   @Nullable
   private static foh S;
   @Nullable
   private static foh T;
   @Nullable
   private static foh U;
   @Nullable
   private static foh V;
   @Nullable
   private static foh W;
   @Nullable
   private static foh X;
   @Nullable
   private static foh Y;
   @Nullable
   private static foh Z;
   @Nullable
   private static foh aa;
   @Nullable
   private static foh ab;
   @Nullable
   private static foh ac;
   @Nullable
   private static foh ad;
   @Nullable
   private static foh ae;
   @Nullable
   private static foh af;
   @Nullable
   private static foh ag;
   @Nullable
   private static foh ah;
   @Nullable
   private static foh ai;
   @Nullable
   private static foh aj;
   @Nullable
   private static foh ak;
   @Nullable
   private static foh al;
   @Nullable
   private static foh am;
   @Nullable
   private static foh an;
   @Nullable
   private static foh ao;
   @Nullable
   private static foh ap;
   @Nullable
   private static foh aq;
   @Nullable
   private static foh ar;
   @Nullable
   private static foh as;
   @Nullable
   private static foh at;
   @Nullable
   private static foh au;
   @Nullable
   private static foh av;
   @Nullable
   private static foh aw;
   @Nullable
   private static foh ax;
   @Nullable
   private static foh ay;
   @Nullable
   private static foh az;
   @Nullable
   private static foh aA;
   @Nullable
   private static foh aB;
   @Nullable
   private static foh aC;
   @Nullable
   private static foh aD;
   @Nullable
   private static foh aE;
   @Nullable
   private static foh aF;
   @Nullable
   private static foh aG;
   @Nullable
   private static foh aH;
   @Nullable
   private static foh aI;
   @Nullable
   private static foh aJ;
   @Nullable
   private static foh aK;
   @Nullable
   private static foh aL;
   @Nullable
   private static foh aM;
   @Nullable
   private static foh aN;
   @Nullable
   private static foh aO;
   @Nullable
   private static foh aP;
   @Nullable
   private static foh aQ;
   @Nullable
   private static foh aR;
   @Nullable
   private static foh aS;
   @Nullable
   private static foh aT;
   @Nullable
   private static foh aU;
   @Nullable
   private static foh aV;

   public fnn(eql $$0, fnq $$1, anm $$2, foa $$3) {
      this.j = $$0;
      this.k = $$2;
      this.b = $$1;
      this.n = new erx($$0.Y());
      this.z = new fnt(this, $$0);
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

   public void a(@Nullable bii $$0) {
      if (this.J != null) {
         this.J.close();
      }

      this.J = null;
      if ($$0 instanceof bym) {
         this.a(new aer("shaders/post/creeper.json"));
      } else if ($$0 instanceof bzl) {
         this.a(new aer("shaders/post/spider.json"));
      } else if ($$0 instanceof byq) {
         this.a(new aer("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.j.am() instanceof cbm) {
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

   void a(aer $$0) {
      if (this.J != null) {
         this.J.close();
      }

      try {
         this.J = new fnx(this.j.Y(), this.k, this.j.g(), $$0);
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

   public ang e() {
      return new anr<fnn.a>() {
         protected fnn.a a(anm $$0, bdh $$1) {
            Map<aer, ank> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(ekt.a.b.b()) || $$1x.endsWith(ekt.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<aer, ank> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new ank($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fnn.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fnn.a($$0, $$3);
         }

         protected void a(fnn.a $$0, anm $$1, bdh $$2) {
            fnn.this.b($$0);
            if (fnn.this.J != null) {
               fnn.this.J.close();
            }

            fnn.this.J = null;
            if (fnn.this.L == fnn.d) {
               fnn.this.a(fnn.this.j.am());
            } else {
               fnn.this.a(fnn.K[fnn.this.L]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(anp $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new foh($$0, "blit_screen", eld.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aS = this.a($$0, "rendertype_gui", eld.n);
         aT = this.a($$0, "rendertype_gui_overlay", eld.n);
         P = this.a($$0, "position", eld.m);
         Q = this.a($$0, "position_color", eld.n);
         R = this.a($$0, "position_color_tex", eld.r);
         S = this.a($$0, "position_tex", eld.q);
         T = this.a($$0, "position_tex_color", eld.s);
         aG = this.a($$0, "rendertype_text", eld.t);
      }
   }

   private foh a(anp $$0, String $$1, elk $$2) {
      try {
         foh $$3 = new foh($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(anp $$0) {
      RenderSystem.assertOnRenderThread();
      List<ekt> $$1 = Lists.newArrayList();
      $$1.addAll(ekt.a.b.c().values());
      $$1.addAll(ekt.a.a.c().values());
      $$1.forEach(ekt::a);
      List<Pair<foh, Consumer<foh>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new foh($$0, "particle", eld.l), (Consumer<foh>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new foh($$0, "position", eld.m), (Consumer<foh>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new foh($$0, "position_color", eld.n), (Consumer<foh>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new foh($$0, "position_color_lightmap", eld.p), (Consumer<foh>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new foh($$0, "position_color_tex", eld.r), (Consumer<foh>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new foh($$0, "position_color_tex_lightmap", eld.t), (Consumer<foh>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new foh($$0, "position_tex", eld.q), (Consumer<foh>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new foh($$0, "position_tex_color", eld.s), (Consumer<foh>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new foh($$0, "position_tex_color_normal", eld.v), (Consumer<foh>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new foh($$0, "position_tex_lightmap_color", eld.u), (Consumer<foh>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_solid", eld.j), (Consumer<foh>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_cutout_mipped", eld.j), (Consumer<foh>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_cutout", eld.j), (Consumer<foh>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_translucent", eld.j), (Consumer<foh>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_translucent_moving_block", eld.j), (Consumer<foh>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_translucent_no_crumbling", eld.j), (Consumer<foh>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_armor_cutout_no_cull", eld.k), (Consumer<foh>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_entity_solid", eld.k), (Consumer<foh>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_entity_cutout", eld.k), (Consumer<foh>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_entity_cutout_no_cull", eld.k), (Consumer<foh>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_entity_cutout_no_cull_z_offset", eld.k), (Consumer<foh>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_item_entity_translucent_cull", eld.k), (Consumer<foh>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_entity_translucent_cull", eld.k), (Consumer<foh>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_entity_translucent", eld.k), (Consumer<foh>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_entity_translucent_emissive", eld.k), (Consumer<foh>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_entity_smooth_cutout", eld.k), (Consumer<foh>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_beacon_beam", eld.j), (Consumer<foh>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_entity_decal", eld.k), (Consumer<foh>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_entity_no_outline", eld.k), (Consumer<foh>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_entity_shadow", eld.k), (Consumer<foh>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_entity_alpha", eld.k), (Consumer<foh>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_eyes", eld.k), (Consumer<foh>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_energy_swirl", eld.k), (Consumer<foh>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_leash", eld.p), (Consumer<foh>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_water_mask", eld.m), (Consumer<foh>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_outline", eld.r), (Consumer<foh>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_armor_glint", eld.q), (Consumer<foh>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_armor_entity_glint", eld.q), (Consumer<foh>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_glint_translucent", eld.q), (Consumer<foh>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_glint", eld.q), (Consumer<foh>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_glint_direct", eld.q), (Consumer<foh>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_entity_glint", eld.q), (Consumer<foh>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_entity_glint_direct", eld.q), (Consumer<foh>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_text", eld.t), (Consumer<foh>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_text_background", eld.p), (Consumer<foh>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_text_intensity", eld.t), (Consumer<foh>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_text_see_through", eld.t), (Consumer<foh>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_text_background_see_through", eld.p), (Consumer<foh>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_text_intensity_see_through", eld.t), (Consumer<foh>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_lightning", eld.n), (Consumer<foh>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_tripwire", eld.j), (Consumer<foh>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_end_portal", eld.m), (Consumer<foh>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_end_gateway", eld.m), (Consumer<foh>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_lines", eld.o), (Consumer<foh>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_crumbling", eld.j), (Consumer<foh>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_gui", eld.n), (Consumer<foh>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_gui_overlay", eld.n), (Consumer<foh>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_gui_text_highlight", eld.n), (Consumer<foh>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new foh($$0, "rendertype_gui_ghost_recipe_overlay", eld.n), (Consumer<foh>)$$0x -> aV = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((foh)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.aw();
      $$2.forEach($$0x -> {
         foh $$1x = (foh)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void aw() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(foh::close);
      this.O.clear();
   }

   @Nullable
   public foh a(@Nullable String $$0) {
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
   public fnx g() {
      return this.J;
   }

   public void a(int $$0, int $$1) {
      if (this.J != null) {
         this.J.a($$0, $$1);
      }

      this.j.f.a($$0, $$1);
   }

   public void a(float $$0) {
      bii $$1 = this.j.am();
      if ($$1 != null) {
         if (this.j.r != null) {
            this.j.aG().a("pick");
            this.j.u = null;
            double $$2 = (double)this.j.q.c();
            this.j.v = $$1.a($$2, $$0, false);
            ehd $$3 = $$1.j($$0);
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

            ehd $$7 = $$1.f(1.0F);
            ehd $$8 = $$3.b($$7.c * $$2, $$7.d * $$2, $$7.e * $$2);
            float $$9 = 1.0F;
            egy $$10 = $$1.cG().b($$7.a($$2)).c(1.0, 1.0, 1.0);
            eha $$11 = ccf.a($$1, $$3, $$8, $$10, $$0x -> !$$0x.G_() && $$0x.br(), $$6);
            if ($$11 != null) {
               bii $$12 = $$11.a();
               ehd $$13 = $$11.e();
               double $$14 = $$3.g($$13);
               if ($$4 && $$14 > 9.0) {
                  this.j.v = egz.a($$13, ha.a($$7.c, $$7.d, $$7.e), gu.a($$13));
               } else if ($$14 < $$6 || this.j.v == null) {
                  this.j.v = $$11;
                  if ($$12 instanceof biy || $$12 instanceof bxy) {
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
      if (this.j.am() instanceof fmt $$1) {
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

   private double a(epw $$0, float $$1, boolean $$2) {
      if (this.B) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.j.m.ad().c().intValue();
            $$3 *= (double)arp.i($$1, this.r, this.q);
         }

         if ($$0.g() instanceof biy && ((biy)$$0.g()).eu()) {
            float $$4 = Math.min((float)((biy)$$0.g()).aM + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         eae $$5 = $$0.k();
         if ($$5 == eae.a || $$5 == eae.b) {
            $$3 *= arp.d(this.j.m.ag().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(elf $$0, float $$1) {
      if (this.j.am() instanceof biy $$2) {
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.eu()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = arp.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eC();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.j.m.ak().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(elf $$0, float $$1) {
      if (this.j.am() instanceof cbm) {
         cbm $$2 = (cbm)this.j.am();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = arp.i($$1, $$2.bT, $$2.bU);
         $$0.a(arp.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(arp.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(arp.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(arp.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.C = $$0;
      this.D = $$1;
      this.E = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new elf());
      this.C = 1.0F;
   }

   private void a(elf $$0, epw $$1, float $$2) {
      if (!this.B) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.j.m.X().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.j.am() instanceof biy && ((biy)this.j.am()).fB();
         if (this.j.m.av().a() && !$$3 && !this.j.m.Z && this.j.q.l() != cpi.d) {
            this.z.c();
            this.b.a($$2, $$0, this.o.b(), this.j.s, this.j.ao().a(this.j.s, $$2));
            this.z.b();
         }

         $$0.b();
         if (this.j.m.av().a() && !$$3) {
            foe.a(this.j, $$0);
            this.a($$0, $$2);
         }

         if (this.j.m.X().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, eln.a);
   }

   public Matrix4f a(double $$0) {
      elf $$1 = new elf();
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

   public static float a(biy $$0, float $$1) {
      bhv $$2 = $$0.b(bhx.p);
      return !$$2.a(200) ? 1.0F : 0.7F + arp.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
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
            this.a($$0, $$1, new elf());
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

         ekj $$6 = this.j.aM();
         RenderSystem.clear(256, eql.a);
         Matrix4f $$7 = new Matrix4f().setOrtho(0.0F, (float)((double)$$6.k() / $$6.s()), (float)((double)$$6.l() / $$6.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$7, eln.b);
         elf $$8 = RenderSystem.getModelViewStack();
         $$8.a();
         $$8.e();
         $$8.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         ekb.b();
         erv $$9 = new erv(this.j, this.o.b());
         if ($$3 && $$2 && this.j.r != null) {
            this.j.aG().b("gui");
            if (this.j.s != null) {
               float $$10 = arp.i($$0, this.j.s.cu, this.j.s.ct);
               float $$11 = this.j.m.af().c().floatValue();
               if ($$10 > 0.0F && this.j.s.a(bhx.i) && $$11 < 1.0F) {
                  this.a($$9, $$10 * (1.0F - $$11));
               }
            }

            if (!this.j.m.Z || this.j.y != null) {
               this.a(this.j.aM().o(), this.j.aM().p(), $$0);
               this.j.l.a($$9, $$0);
               RenderSystem.clear(256, eql.a);
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
            gct $$1 = this.j.T();
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
         ekg $$1 = eqw.a(this.j.g());
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

            try (ekg $$6 = new ekg(64, 64, false)) {
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
         bii $$0 = this.j.am();
         boolean $$1 = $$0 instanceof cbm && !this.j.m.Z;
         if ($$1 && !((cbm)$$0).fR().e) {
            cix $$2 = ((biy)$$0).eR();
            ehb $$3 = this.j.v;
            if ($$3 != null && $$3.c() == ehb.a.b) {
               gu $$4 = ((egz)$$3).a();
               dez $$5 = this.j.r.a_($$4);
               if (this.j.q.l() == cpi.d) {
                  $$1 = $$5.b(this.j.r, $$4) != null;
               } else {
                  dfd $$6 = new dfd(this.j.r, $$4, false);
                  hr<csl> $$7 = this.j.r.B_().d(jc.e);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, elf $$2) {
      this.z.a($$0);
      if (this.j.am() == null) {
         this.j.a(this.j.s);
      }

      this.a($$0);
      this.j.aG().a("center");
      boolean $$3 = this.az();
      this.j.aG().b("camera");
      epw $$4 = this.N;
      this.m = (float)(this.j.m.ay() * 16);
      elf $$5 = new elf();
      double $$6 = this.a($$4, $$0, true);
      $$5.a(this.a($$6));
      this.a($$5, $$0);
      if (this.j.m.X().c()) {
         this.b($$5, $$0);
      }

      float $$7 = this.j.m.af().c().floatValue();
      float $$8 = arp.i($$0, this.j.s.cu, this.j.s.ct) * $$7 * $$7;
      if ($$8 > 0.0F) {
         int $$9 = this.j.s.a(bhx.i) ? 7 : 20;
         float $$10 = 5.0F / ($$8 * $$8 + 5.0F) - $$8 * 0.04F;
         $$10 *= $$10;
         a $$11 = a.of(new Vector3f(0.0F, arp.g / 2.0F, arp.g / 2.0F));
         $$5.a($$11.rotationDegrees(((float)this.p + $$0) * (float)$$9));
         $$5.b(1.0F / $$10, 1.0F, 1.0F);
         float $$12 = -((float)this.p + $$0) * (float)$$9;
         $$5.a($$11.rotationDegrees($$12));
      }

      Matrix4f $$13 = $$5.c().a();
      this.a($$13);
      $$4.a(this.j.r, (bii)(this.j.am() == null ? this.j.s : this.j.am()), !this.j.m.av().a(), this.j.m.av().b(), $$0);
      $$2.a(a.b.rotationDegrees($$4.d()));
      $$2.a(a.d.rotationDegrees($$4.e() + 180.0F));
      Matrix3f $$14 = new Matrix3f($$2.c().b()).invert();
      RenderSystem.setInverseViewRotationMatrix($$14);
      this.j.f.a($$2, $$4.b(), this.a(Math.max($$6, (double)this.j.m.ad().c().intValue())));
      this.j.f.a($$2, $$0, $$1, $$3, $$4, this, this.z, $$13);
      this.j.aG().b("hand");
      if (this.u) {
         RenderSystem.clear(256, eql.a);
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

   public erx j() {
      return this.n;
   }

   public void a(cix $$0) {
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
         elf $$11 = new elf();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * arp.e(arp.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * arp.e(arp.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * arp.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * arp.e(arp.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * arp.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * arp.b($$4 * 8.0F)));
         fnu.a $$13 = this.o.b();
         this.j.aq().a(this.F, ciu.i, 15728880, fyl.d, $$11, $$13, this.j.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(erv $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = arp.i($$1, 2.0F, 1.0F);
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

   public eql k() {
      return this.j;
   }

   public float b(float $$0) {
      return arp.i($$0, this.t, this.s);
   }

   public float l() {
      return this.m;
   }

   public epw m() {
      return this.N;
   }

   public fnt n() {
      return this.z;
   }

   public fyl o() {
      return this.A;
   }

   @Nullable
   public static foh p() {
      return P;
   }

   @Nullable
   public static foh q() {
      return Q;
   }

   @Nullable
   public static foh r() {
      return R;
   }

   @Nullable
   public static foh s() {
      return S;
   }

   @Nullable
   public static foh t() {
      return T;
   }

   @Nullable
   public static foh u() {
      return U;
   }

   @Nullable
   public static foh v() {
      return V;
   }

   @Nullable
   public static foh w() {
      return W;
   }

   @Nullable
   public static foh x() {
      return X;
   }

   @Nullable
   public static foh y() {
      return Y;
   }

   @Nullable
   public static foh z() {
      return Z;
   }

   @Nullable
   public static foh A() {
      return aa;
   }

   @Nullable
   public static foh B() {
      return ab;
   }

   @Nullable
   public static foh C() {
      return ac;
   }

   @Nullable
   public static foh D() {
      return ad;
   }

   @Nullable
   public static foh E() {
      return ae;
   }

   @Nullable
   public static foh F() {
      return af;
   }

   @Nullable
   public static foh G() {
      return ag;
   }

   @Nullable
   public static foh H() {
      return ah;
   }

   @Nullable
   public static foh I() {
      return ai;
   }

   @Nullable
   public static foh J() {
      return aj;
   }

   @Nullable
   public static foh K() {
      return ak;
   }

   @Nullable
   public static foh L() {
      return al;
   }

   @Nullable
   public static foh M() {
      return am;
   }

   @Nullable
   public static foh N() {
      return an;
   }

   @Nullable
   public static foh O() {
      return ao;
   }

   @Nullable
   public static foh P() {
      return ap;
   }

   @Nullable
   public static foh Q() {
      return aq;
   }

   @Nullable
   public static foh R() {
      return ar;
   }

   @Nullable
   public static foh S() {
      return as;
   }

   @Nullable
   public static foh T() {
      return at;
   }

   @Nullable
   public static foh U() {
      return au;
   }

   @Nullable
   public static foh V() {
      return av;
   }

   @Nullable
   public static foh W() {
      return aw;
   }

   @Nullable
   public static foh X() {
      return ax;
   }

   @Nullable
   public static foh Y() {
      return ay;
   }

   @Nullable
   public static foh Z() {
      return az;
   }

   @Nullable
   public static foh aa() {
      return aA;
   }

   @Nullable
   public static foh ab() {
      return aB;
   }

   @Nullable
   public static foh ac() {
      return aC;
   }

   @Nullable
   public static foh ad() {
      return aD;
   }

   @Nullable
   public static foh ae() {
      return aE;
   }

   @Nullable
   public static foh af() {
      return aF;
   }

   @Nullable
   public static foh ag() {
      return aG;
   }

   @Nullable
   public static foh ah() {
      return aH;
   }

   @Nullable
   public static foh ai() {
      return aI;
   }

   @Nullable
   public static foh aj() {
      return aJ;
   }

   @Nullable
   public static foh ak() {
      return aK;
   }

   @Nullable
   public static foh al() {
      return aL;
   }

   @Nullable
   public static foh am() {
      return aM;
   }

   @Nullable
   public static foh an() {
      return aN;
   }

   @Nullable
   public static foh ao() {
      return aO;
   }

   @Nullable
   public static foh ap() {
      return aP;
   }

   @Nullable
   public static foh aq() {
      return aQ;
   }

   @Nullable
   public static foh ar() {
      return aR;
   }

   @Nullable
   public static foh as() {
      return aS;
   }

   @Nullable
   public static foh at() {
      return aT;
   }

   @Nullable
   public static foh au() {
      return aU;
   }

   @Nullable
   public static foh av() {
      return aV;
   }

   public static record a(anp a, Map<aer, ank> b) implements anp {
      @Override
      public Optional<ank> getResource(aer $$0) {
         ank $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
