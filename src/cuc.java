import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cuc implements col, dbz {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dfc, cuc> d = Maps.newHashMap();
   public static final UUID e = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID f = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int g = 64;
   public static final int h = 99;
   public static final int i = 13;
   private final ja.c<cuc> b = lh.h.f(this);
   private final ka c;
   @Nullable
   private final cuc j;
   @Nullable
   private String k;
   private final cop l;

   public static int a(cuc $$0) {
      return $$0 == null ? 0 : lh.h.a($$0);
   }

   public static cuc b(int $$0) {
      return lh.h.a($$0);
   }

   @Deprecated
   public static cuc a(dfc $$0) {
      return d.getOrDefault($$0, cuk.a);
   }

   public cuc(cuc.a $$0) {
      this.c = $$0.b();
      this.j = $$0.c;
      this.l = $$0.d;
      if (ab.aX) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1.trim().isEmpty() ? this.getClass().getName() : $$1);
         }
      }
   }

   @Deprecated
   public ja.c<cuc> n() {
      return this.b;
   }

   public ka o() {
      return this.c;
   }

   public int p() {
      return this.c.a(ke.b, 1);
   }

   public void a(dca $$0, bso $$1, cuh $$2, int $$3) {
   }

   public void a(cig $$0) {
   }

   public void a(cuh $$0, dca $$1, ir $$2, bpt $$3) {
   }

   public void n(cuh $$0) {
   }

   public boolean a(dtc $$0, dca $$1, ir $$2, cly $$3) {
      return true;
   }

   @Override
   public cuc q() {
      return this;
   }

   public bqa a(cyf $$0) {
      return bqa.d;
   }

   public float a(cuh $$0, dtc $$1) {
      cxw $$2 = $$0.a(ke.v);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      cov $$4 = $$3.a(ke.t);
      if ($$4 != null) {
         if ($$1.t($$4.d())) {
            $$1.c($$2);
            return bqb.b($$3);
         } else {
            return bqb.d($$3);
         }
      } else {
         return bqb.c($$1.b($$2));
      }
   }

   public cuh a(cuh $$0, dca $$1, bso $$2) {
      return $$0.b(ke.t) ? $$2.a($$1, $$0) : $$0;
   }

   public boolean e(cuh $$0) {
      return $$0.l();
   }

   public int f(cuh $$0) {
      return aym.a(Math.round(13.0F - (float)$$0.m() * 13.0F / (float)$$0.n()), 0, 13);
   }

   public int g(cuh $$0) {
      int $$1 = $$0.n();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.m()) / (float)$$1);
      return aym.h($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cuh $$0, cre $$1, cpo $$2, cly $$3) {
      return false;
   }

   public boolean a(cuh $$0, cuh $$1, cre $$2, cpo $$3, cly $$4, btf $$5) {
      return false;
   }

   public float a(cly $$0, float $$1) {
      return 0.0F;
   }

   public boolean a(cuh $$0, bso $$1, bso $$2) {
      return false;
   }

   public boolean a(cuh $$0, dca $$1, dtc $$2, ir $$3, bso $$4) {
      cxw $$5 = $$0.a(ke.v);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.h($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bsc.a);
         }

         return true;
      }
   }

   public boolean b(cuh $$0, dtc $$1) {
      cxw $$2 = $$0.a(ke.v);
      return $$2 != null && $$2.b($$1);
   }

   public bqa a(cuh $$0, cly $$1, bso $$2, bpz $$3) {
      return bqa.d;
   }

   public xe r() {
      return xe.c(this.a());
   }

   @Override
   public String toString() {
      return lh.h.b(this).a();
   }

   public cuc a(String $$0) {
      this.k = $$0;
      return this;
   }

   protected String s() {
      if (this.k == null) {
         this.k = ad.a("item", lh.h.b(this));
      }

      return this.k;
   }

   public String a() {
      return this.s();
   }

   public String i(cuh $$0) {
      return this.a();
   }

   @Nullable
   public final cuc t() {
      return this.j;
   }

   public boolean u() {
      return this.j != null;
   }

   public void a(cuh $$0, dca $$1, brv $$2, int $$3, boolean $$4) {
   }

   public void b(cuh $$0, dca $$1, cly $$2) {
      this.a($$0, $$1);
   }

   public void a(cuh $$0, dca $$1) {
   }

   public boolean ak_() {
      return false;
   }

   public cwk c(cuh $$0) {
      return $$0.b(ke.t) ? cwk.b : cwk.a;
   }

   public int b(cuh $$0) {
      cov $$1 = $$0.a(ke.t);
      return $$1 != null ? $$1.a() : 0;
   }

   public void a(cuh $$0, dca $$1, bso $$2, int $$3) {
   }

   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
   }

   public Optional<cro> h(cuh $$0) {
      return Optional.empty();
   }

   public xe o(cuh $$0) {
      return xe.c(this.i($$0));
   }

   public boolean d_(cuh $$0) {
      Boolean $$1 = $$0.a(ke.an);
      return $$1 != null && $$1 ? true : $$0.A();
   }

   public boolean a(cuh $$0) {
      return $$0.i() == 1 && $$0.b(ke.c);
   }

   protected static ewq a(dca $$0, cly $$1, dbj.b $$2) {
      ewu $$3 = $$1.bC();
      ewu $$4 = $$3.e($$1.b($$1.dM(), $$1.dK()).a($$1.gN()));
      return $$0.a(new dbj($$3, $$4, dbj.a.b, $$2, $$1));
   }

   public int g() {
      return 0;
   }

   public boolean a(cuh $$0, cuh $$1) {
      return false;
   }

   @Deprecated
   public Multimap<ja<btq>, btt> a(bsc $$0) {
      return ImmutableMultimap.of();
   }

   public boolean m(cuh $$0) {
      return false;
   }

   public cuh v() {
      return new cuh(this);
   }

   public avn al_() {
      return avo.kp;
   }

   public avn e() {
      return avo.nR;
   }

   public boolean am_() {
      return true;
   }

   @Override
   public cop m() {
      return this.l;
   }

   public static class a {
      private static final Interner<ka> a = Interners.newStrongInterner();
      @Nullable
      private ka.a b;
      @Nullable
      cuc c;
      cop d = cor.g;

      public cuc.a a(cov $$0) {
         return this.a(ke.t, $$0);
      }

      public cuc.a a(int $$0) {
         return this.a(ke.b, $$0);
      }

      public cuc.a b(int $$0) {
         this.a(ke.c, $$0);
         this.a(ke.b, 1);
         this.a(ke.d, 0);
         return this;
      }

      public cuc.a a(cuc $$0) {
         this.c = $$0;
         return this;
      }

      public cuc.a a(cvj $$0) {
         return this.a(ke.h, $$0);
      }

      public cuc.a a() {
         return this.a(ke.u, azo.a);
      }

      public cuc.a a(com... $$0) {
         this.d = cor.e.a($$0);
         return this;
      }

      public <T> cuc.a a(kd<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = ka.a().a(ke.aq);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public cuc.a a(cxl $$0) {
         return this.a(ke.l, $$0);
      }

      ka b() {
         ka $$0 = this.c();
         if ($$0.b(ke.d) && $$0.a(ke.b, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$0;
         }
      }

      private ka c() {
         return this.b == null ? ke.aq : (ka)a.intern(this.b.a());
      }
   }
}
