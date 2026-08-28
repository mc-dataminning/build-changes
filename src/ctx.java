import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ctx implements cov, dce {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dfh, ctx> d = Maps.newHashMap();
   public static final UUID e = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID f = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int g = 64;
   public static final int h = 99;
   public static final int i = 13;
   private final jj.c<ctx> b = lq.g.f(this);
   private final kj c;
   @Nullable
   private final ctx j;
   @Nullable
   private String k;
   private final coy l;

   public static int a(ctx $$0) {
      return $$0 == null ? 0 : lq.g.a($$0);
   }

   public static ctx b(int $$0) {
      return lq.g.a($$0);
   }

   @Deprecated
   public static ctx a(dfh $$0) {
      return d.getOrDefault($$0, cuf.a);
   }

   public ctx(ctx.a $$0) {
      this.c = $$0.b();
      this.j = $$0.c;
      this.l = $$0.d;
      if (aa.aW) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public jj.c<ctx> o() {
      return this.b;
   }

   public kj p() {
      return this.c;
   }

   public int q() {
      return this.c.a(kn.c, 1);
   }

   public void a(dcf $$0, btb $$1, cuc $$2, int $$3) {
   }

   public void a(ciu $$0) {
   }

   public void m(cuc $$0) {
   }

   public boolean a(dsk $$0, dcf $$1, ja $$2, cmk $$3) {
      return true;
   }

   @Override
   public ctx r() {
      return this;
   }

   public bqg a(cxo $$0) {
      return bqg.e;
   }

   public float a(cuc $$0, dsk $$1) {
      cxg $$2 = $$0.a(kn.x);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      cuc $$3 = $$1.b($$2);
      cpe $$4 = $$3.a(kn.v);
      if ($$4 != null) {
         if ($$1.t($$4.d())) {
            $$1.c($$2);
            return bqh.b($$3);
         } else {
            return bqh.d($$3);
         }
      } else {
         return bqh.c($$1.b($$2));
      }
   }

   public cuc a(cuc $$0, dcf $$1, btb $$2) {
      cpe $$3 = $$0.a(kn.v);
      return $$3 != null ? $$2.a($$1, $$0, $$3) : $$0;
   }

   public boolean d(cuc $$0) {
      return $$0.m();
   }

   public int e(cuc $$0) {
      return ayg.a(Math.round(13.0F - (float)$$0.n() * 13.0F / (float)$$0.o()), 0, 13);
   }

   public int f(cuc $$0) {
      int $$1 = $$0.o();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.n()) / (float)$$1);
      return ayg.h($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cuc $$0, crd $$1, cpq $$2, cmk $$3) {
      return false;
   }

   public boolean a(cuc $$0, cuc $$1, crd $$2, cpq $$3, cmk $$4, btt $$5) {
      return false;
   }

   public float a(bsg $$0, float $$1, bqz $$2) {
      return 0.0F;
   }

   public boolean a(cuc $$0, btb $$1, btb $$2) {
      return false;
   }

   public void b(cuc $$0, btb $$1, btb $$2) {
   }

   public boolean a(cuc $$0, dcf $$1, dsk $$2, ja $$3, btb $$4) {
      cxg $$5 = $$0.a(kn.x);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.B && $$2.h($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bsn.a);
         }

         return true;
      }
   }

   public boolean b(cuc $$0, dsk $$1) {
      cxg $$2 = $$0.a(kn.x);
      return $$2 != null && $$2.b($$1);
   }

   public bqg a(cuc $$0, cmk $$1, btb $$2, bqf $$3) {
      return bqg.e;
   }

   public wu s() {
      return wu.c(this.a());
   }

   @Override
   public String toString() {
      return lq.g.b(this).a();
   }

   protected String t() {
      if (this.k == null) {
         this.k = ac.a("item", lq.g.b(this));
      }

      return this.k;
   }

   public String a() {
      return this.t();
   }

   public String h(cuc $$0) {
      return this.a();
   }

   @Nullable
   public final ctx u() {
      return this.j;
   }

   public boolean v() {
      return this.j != null;
   }

   public void a(cuc $$0, dcf $$1, bsg $$2, int $$3, boolean $$4) {
   }

   public void b(cuc $$0, dcf $$1, cmk $$2) {
      this.a($$0, $$1);
   }

   public void a(cuc $$0, dcf $$1) {
   }

   public boolean ak_() {
      return false;
   }

   public cvx b(cuc $$0) {
      return $$0.b(kn.v) ? cvx.b : cvx.a;
   }

   public int a(cuc $$0, btb $$1) {
      cpe $$2 = $$0.a(kn.v);
      return $$2 != null ? $$2.a() : 0;
   }

   public void a(cuc $$0, dcf $$1, btb $$2, int $$3) {
   }

   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
   }

   public Optional<crn> g(cuc $$0) {
      return Optional.empty();
   }

   public wu n(cuc $$0) {
      return wu.c(this.h($$0));
   }

   public boolean d_(cuc $$0) {
      return $$0.A();
   }

   public boolean a(cuc $$0) {
      return $$0.j() == 1 && $$0.b(kn.d);
   }

   protected static ewb a(dcf $$0, cmk $$1, dbo.b $$2) {
      ewf $$3 = $$1.by();
      ewf $$4 = $$3.e($$1.b($$1.dI(), $$1.dG()).a($$1.gz()));
      return $$0.a(new dbo($$3, $$4, dbo.a.b, $$2, $$1));
   }

   public int g() {
      return 0;
   }

   public boolean a(cuc $$0, cuc $$1) {
      return false;
   }

   @Deprecated
   public cww j() {
      return cww.a;
   }

   public boolean l(cuc $$0) {
      return false;
   }

   public cuc w() {
      return new cuc(this);
   }

   public avg al_() {
      return avh.kc;
   }

   public avg am_() {
      return avh.kd;
   }

   public avg e() {
      return avh.nB;
   }

   public boolean an_() {
      return true;
   }

   @Override
   public coy i() {
      return this.l;
   }

   public static class a {
      private static final Interner<kj> a = Interners.newStrongInterner();
      @Nullable
      private kj.a b;
      @Nullable
      ctx c;
      coy d = cpa.f;

      public ctx.a a(cpe $$0) {
         return this.a(kn.v, $$0);
      }

      public ctx.a a(int $$0) {
         return this.a(kn.c, $$0);
      }

      public ctx.a b(int $$0) {
         this.a(kn.d, $$0);
         this.a(kn.c, 1);
         this.a(kn.e, 0);
         return this;
      }

      public ctx.a a(ctx $$0) {
         this.c = $$0;
         return this;
      }

      public ctx.a a(cuw $$0) {
         return this.a(kn.j, $$0);
      }

      public ctx.a a() {
         return this.a(kn.w, azk.a);
      }

      public ctx.a a(cow... $$0) {
         this.d = cpa.d.a($$0);
         return this;
      }

      public <T> ctx.a a(km<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = kj.a().a(kn.af);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public ctx.a a(cww $$0) {
         return this.a(kn.n, $$0);
      }

      kj b() {
         kj $$0 = this.c();
         if ($$0.b(kn.e) && $$0.a(kn.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$0;
         }
      }

      private kj c() {
         return this.b == null ? kn.af : (kj)a.intern(this.b.a());
      }
   }

   public interface b {
      ctx.b a = new ctx.b() {
         @Nullable
         @Override
         public jl.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public epw a(epu $$0) {
            return null;
         }
      };

      @Nullable
      jl.a a();

      float b();

      @Nullable
      epw a(epu var1);

      static ctx.b a(@Nullable final dcf $$0) {
         return $$0 == null ? a : new ctx.b() {
            @Override
            public jl.a a() {
               return $$0.H_();
            }

            @Override
            public float b() {
               return $$0.s().f();
            }

            @Override
            public epw a(epu $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static ctx.b a(final jl.a $$0) {
         return new ctx.b() {
            @Override
            public jl.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public epw a(epu $$0x) {
               return null;
            }
         };
      }
   }
}
