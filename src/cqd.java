import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cqd implements cow, cpa {
   protected final int a;
   protected final int b;
   protected final dha[][] c;
   protected boolean d;
   protected final cpq e;
   private final Supplier<hg<cqo>> f;

   public cqd(cpq $$0, gw $$1, gw $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.B_().d(je.ap).f(cqv.b));
      this.a = hz.a($$1.u());
      this.b = hz.a($$1.w());
      int $$3 = hz.a($$2.u());
      int $$4 = hz.a($$2.w());
      this.c = new dha[$$3 - this.a + 1][$$4 - this.b + 1];
      dhe $$5 = $$0.J();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = hz.a($$1.u()); $$8 <= hz.a($$2.u()); $$8++) {
         for (int $$9 = hz.a($$1.w()); $$9 <= hz.a($$2.w()); $$9++) {
            dha $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dha d(gw $$0) {
      return this.a(hz.a($$0.u()), hz.a($$0.w()));
   }

   private dha a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dha $$4 = this.c[$$2][$$3];
         return (dha)($$4 != null ? $$4 : new dhh(this.e, new cox($$0, $$1), this.f.get()));
      } else {
         return new dhh(this.e, new cox($$0, $$1), this.f.get());
      }
   }

   @Override
   public dgv w_() {
      return this.e.w_();
   }

   @Override
   public cow c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<eib> c(@Nullable bil $$0, ehd $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dcq c_(gw $$0) {
      dha $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dfe a_(gw $$0) {
      if (this.r($$0)) {
         return csr.a.n();
      } else {
         dha $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public eah b_(gw $$0) {
      if (this.r($$0)) {
         return eai.a.g();
      } else {
         dha $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int C_() {
      return this.e.C_();
   }

   @Override
   public int D_() {
      return this.e.D_();
   }

   public bdk a() {
      return this.e.ad();
   }
}
