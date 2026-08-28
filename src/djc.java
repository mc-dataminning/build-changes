import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class djc implements dhz {
   protected final int a;
   protected final int b;
   protected final ebl[][] c;
   protected boolean d;
   protected final dip e;
   private final Supplier<je<djs>> f;

   public djc(dip $$0, iu $$1, iu $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.F_().f(mg.aG).b(djz.b));
      this.a = jx.a($$1.u());
      this.b = jx.a($$1.w());
      int $$3 = jx.a($$2.u());
      int $$4 = jx.a($$2.w());
      this.c = new ebl[$$3 - this.a + 1][$$4 - this.b + 1];
      ebp $$5 = $$0.S();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = jx.a($$1.u()); $$8 <= jx.a($$2.u()); $$8++) {
         for (int $$9 = jx.a($$1.w()); $$9 <= jx.a($$2.w()); $$9++) {
            ebl $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private ebl d(iu $$0) {
      return this.a(jx.a($$0.u()), jx.a($$0.w()));
   }

   private ebl a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         ebl $$4 = this.c[$$2][$$3];
         return (ebl)($$4 != null ? $$4 : new ebr(this.e, new dhw($$0, $$1), this.f.get()));
      } else {
         return new ebr(this.e, new dhw($$0, $$1), this.f.get());
      }
   }

   @Override
   public ebg A_() {
      return this.e.A_();
   }

   @Override
   public dhv c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<feq> c(@Nullable bwa $$0, fdr $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dwn c_(iu $$0) {
      ebl $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dzo a_(iu $$0) {
      if (this.t($$0)) {
         return dlw.a.m();
      } else {
         ebl $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public evv b_(iu $$0) {
      if (this.t($$0)) {
         return evw.a.g();
      } else {
         ebl $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int G_() {
      return this.e.G_();
   }

   @Override
   public int H_() {
      return this.e.H_();
   }
}
