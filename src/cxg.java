import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cxg implements csl, dgz {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dke, cxg> e = Maps.newHashMap();
   public static final alz f = alz.b("base_attack_damage");
   public static final alz g = alz.b("base_attack_speed");
   public static final int h = 64;
   public static final int i = 99;
   public static final int j = 13;
   private final jq.c<cxg> b = ma.g.f(this);
   private final kq c;
   @Nullable
   private final cxg d;
   protected final String k;
   private final cso l;

   public static int a(cxg $$0) {
      return $$0 == null ? 0 : ma.g.a($$0);
   }

   public static cxg b(int $$0) {
      return ma.g.a($$0);
   }

   @Deprecated
   public static cxg a(dke $$0) {
      return e.getOrDefault($$0, cxo.a);
   }

   public cxg(cxg.a $$0) {
      this.k = $$0.d();
      this.c = $$0.a(xv.c(this.k), $$0.e());
      this.d = $$0.d;
      this.l = $$0.e;
      if (ab.aU) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public jq.c<cxg> f() {
      return this.b;
   }

   public kq g() {
      return this.c;
   }

   public int h() {
      return this.c.a(ku.c, 1);
   }

   public void a(dha $$0, bwb $$1, cxk $$2, int $$3) {
   }

   public void a(clw $$0) {
   }

   public void l(cxk $$0) {
   }

   public boolean a(dxn $$0, dha $$1, jh $$2, cps $$3) {
      return true;
   }

   @Override
   public cxg j() {
      return this;
   }

   public bte a(dbd $$0) {
      return bte.e;
   }

   public float a(cxk $$0, dxn $$1) {
      dam $$2 = $$0.a(ku.B);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bte a(dha $$0, cps $$1, btd $$2) {
      cxk $$3 = $$1.b($$2);
      czq $$4 = $$3.a(ku.x);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         dfm $$5 = $$3.a(ku.D);
         return (bte)($$5 != null && $$5.f() ? $$5.a($$3, $$1) : bte.e);
      }
   }

   public cxk a(cxk $$0, dha $$1, bwb $$2) {
      czq $$3 = $$0.a(ku.x);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(cxk $$0) {
      return $$0.n();
   }

   public int e(cxk $$0) {
      return bae.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(cxk $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return bae.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cxk $$0, cuu $$1, cth $$2, cps $$3) {
      return false;
   }

   public boolean a(cxk $$0, cxk $$1, cuu $$2, cth $$3, cps $$4, bwt $$5) {
      return false;
   }

   public float a(bvf $$0, float $$1, btv $$2) {
      return 0.0F;
   }

   @Nullable
   public btv a(bwb $$0) {
      return null;
   }

   public boolean a(cxk $$0, bwb $$1, bwb $$2) {
      return false;
   }

   public void b(cxk $$0, bwb $$1, bwb $$2) {
   }

   public boolean a(cxk $$0, dha $$1, dxn $$2, jh $$3, bwb $$4) {
      dam $$5 = $$0.a(ku.B);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bvn.a);
         }

         return true;
      }
   }

   public boolean b(cxk $$0, dxn $$1) {
      dam $$2 = $$0.a(ku.B);
      return $$2 != null && $$2.b($$1);
   }

   public bte a(cxk $$0, cps $$1, bwb $$2, btd $$3) {
      return bte.e;
   }

   @Override
   public String toString() {
      return ma.g.e(this).g();
   }

   public final cxk k() {
      return this.d == null ? cxk.k : new cxk(this.d);
   }

   public void a(cxk $$0, dha $$1, bvf $$2, int $$3, boolean $$4) {
   }

   public void a(cxk $$0, dha $$1, cps $$2) {
      this.a($$0, $$1);
   }

   public void a(cxk $$0, dha $$1) {
   }

   public cxm b(cxk $$0) {
      czq $$1 = $$0.a(ku.x);
      return $$1 != null ? $$1.d() : cxm.a;
   }

   public int a(cxk $$0, bwb $$1) {
      czq $$2 = $$0.a(ku.x);
      return $$2 != null ? $$2.a() : 0;
   }

   public boolean a(cxk $$0, dha $$1, bwb $$2, int $$3) {
      return false;
   }

   public void a(cxk $$0, cxg.b $$1, List<xv> $$2, czc $$3) {
   }

   public Optional<cve> k(cxk $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String l() {
      return this.k;
   }

   public final xv m() {
      return this.c.a(ku.h, xu.a);
   }

   public xv a(cxk $$0) {
      return $$0.a().a(ku.h, xu.a);
   }

   public boolean c_(cxk $$0) {
      return $$0.E();
   }

   protected static fbo a(dha $$0, cps $$1, dgi.b $$2) {
      fbs $$3 = $$1.bF();
      fbs $$4 = $$3.e($$1.d($$1.dN(), $$1.dL()).c($$1.gH()));
      return $$0.a(new dgi($$3, $$4, dgi.a.b, $$2, $$1));
   }

   public boolean d_(cxk $$0) {
      return false;
   }

   public cxk n() {
      return new cxk(this);
   }

   public axe a() {
      return axf.nS;
   }

   public boolean e() {
      return true;
   }

   @Override
   public cso i() {
      return this.l;
   }

   public static class a {
      private static final alr<cxg, String> a = $$0 -> ae.a("block", $$0.a());
      private static final alr<cxg, String> b = $$0 -> ae.a("item", $$0.a());
      private final kq.a c = kq.a().a(ku.aq);
      @Nullable
      cxg d;
      cso e = csq.h;
      @Nullable
      private aly<cxg> f;
      private alr<cxg, String> g = b;
      private alr<cxg, alz> h = aly::a;

      public cxg.a a(csu $$0) {
         return this.a($$0, czs.a);
      }

      public cxg.a a(csu $$0, czq $$1) {
         return this.a(ku.w, $$0).a(ku.x, $$1);
      }

      public cxg.a a(cxg $$0) {
         return this.a(ku.y, new daq(new cxk($$0)));
      }

      public cxg.a a(float $$0) {
         return this.a(ku.z, new dap($$0));
      }

      public cxg.a a(int $$0) {
         return this.a(ku.c, $$0);
      }

      public cxg.a b(int $$0) {
         this.a(ku.d, $$0);
         this.a(ku.c, 1);
         this.a(ku.e, 0);
         return this;
      }

      public cxg.a b(cxg $$0) {
         this.d = $$0;
         return this;
      }

      public cxg.a a(cyh $$0) {
         return this.a(ku.k, $$0);
      }

      public cxg.a a() {
         return this.a(ku.A, new czv(axw.i));
      }

      public cxg.a a(aly<cxq> $$0) {
         return this.a(ku.ab, new cxp(new cwk<>($$0), true));
      }

      public cxg.a c(int $$0) {
         return this.a(ku.C, new ddp($$0));
      }

      public cxg.a c(cxg $$0) {
         return this.a(ku.E, new ddz(ju.a($$0.f())));
      }

      public cxg.a a(ayk<cxg> $$0) {
         jr<cxg> $$1 = ma.a(ma.g);
         return this.a(ku.E, new ddz($$1.b($$0)));
      }

      public cxg.a a(bvn $$0) {
         return this.a(ku.D, dfm.a($$0).a());
      }

      public cxg.a b(bvn $$0) {
         return this.a(ku.D, dfm.a($$0).b(false).a());
      }

      public cxg.a a(csm... $$0) {
         this.e = csq.f.a($$0);
         return this;
      }

      public cxg.a b(aly<cxg> $$0) {
         this.f = $$0;
         return this;
      }

      public cxg.a a(String $$0) {
         this.g = alr.fixed($$0);
         return this;
      }

      public cxg.a b() {
         this.g = a;
         return this;
      }

      public cxg.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public cxg.a a(alz $$0) {
         this.h = alr.fixed($$0);
         return this;
      }

      public alz e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> cxg.a a(kt<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public cxg.a a(dab $$0) {
         return this.a(ku.o, $$0);
      }

      kq a(xv $$0, alz $$1) {
         kq $$2 = this.c.a(ku.h, $$0).a(ku.i, $$1).a();
         if ($$2.b(ku.e) && $$2.a(ku.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$2;
         }
      }
   }

   public interface b {
      cxg.b a = new cxg.b() {
         @Nullable
         @Override
         public js.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public evj a(evh $$0) {
            return null;
         }
      };

      @Nullable
      js.a a();

      float b();

      @Nullable
      evj a(evh var1);

      static cxg.b a(@Nullable final dha $$0) {
         return $$0 == null ? a : new cxg.b() {
            @Override
            public js.a a() {
               return $$0.K_();
            }

            @Override
            public float b() {
               return $$0.t().f();
            }

            @Override
            public evj a(evh $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cxg.b a(final js.a $$0) {
         return new cxg.b() {
            @Override
            public js.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public evj a(evh $$0x) {
               return null;
            }
         };
      }
   }
}
