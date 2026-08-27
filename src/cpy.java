import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cpy implements cor, cov {
   protected final int a;
   protected final int b;
   protected final dgv[][] c;
   protected boolean d;
   protected final cpl e;
   private final Supplier<he<cqj>> f;

   public cpy(cpl $$0, gu $$1, gu $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.B_().d(jc.ap).f(cqq.b));
      this.a = hx.a($$1.u());
      this.b = hx.a($$1.w());
      int $$3 = hx.a($$2.u());
      int $$4 = hx.a($$2.w());
      this.c = new dgv[$$3 - this.a + 1][$$4 - this.b + 1];
      dgz $$5 = $$0.J();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = hx.a($$1.u()); $$8 <= hx.a($$2.u()); $$8++) {
         for (int $$9 = hx.a($$1.w()); $$9 <= hx.a($$2.w()); $$9++) {
            dgv $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dgv d(gu $$0) {
      return this.a(hx.a($$0.u()), hx.a($$0.w()));
   }

   private dgv a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dgv $$4 = this.c[$$2][$$3];
         return (dgv)($$4 != null ? $$4 : new dhc(this.e, new cos($$0, $$1), this.f.get()));
      } else {
         return new dhc(this.e, new cos($$0, $$1), this.f.get());
      }
   }

   @Override
   public dgq w_() {
      return this.e.w_();
   }

   @Override
   public cor c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<ehw> c(@Nullable bii $$0, egy $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dcl c_(gu $$0) {
      dgv $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dez a_(gu $$0) {
      if (this.r($$0)) {
         return csm.a.n();
      } else {
         dgv $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public eac b_(gu $$0) {
      if (this.r($$0)) {
         return ead.a.g();
      } else {
         dgv $$1 = this.d($$0);
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

   public bdh a() {
      return this.e.ad();
   }
}
