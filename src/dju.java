import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dju implements dir {
   protected final int a;
   protected final int b;
   protected final ecl[][] c;
   protected boolean d;
   protected final djh e;
   private final Supplier<jf<dkk>> f;

   public dju(djh $$0, iv $$1, iv $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.F_().f(mh.aG).b(dkr.b));
      this.a = jy.a($$1.u());
      this.b = jy.a($$1.w());
      int $$3 = jy.a($$2.u());
      int $$4 = jy.a($$2.w());
      this.c = new ecl[$$3 - this.a + 1][$$4 - this.b + 1];
      ecp $$5 = $$0.S();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = jy.a($$1.u()); $$8 <= jy.a($$2.u()); $$8++) {
         for (int $$9 = jy.a($$1.w()); $$9 <= jy.a($$2.w()); $$9++) {
            ecl $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private ecl d(iv $$0) {
      return this.a(jy.a($$0.u()), jy.a($$0.w()));
   }

   private ecl a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         ecl $$4 = this.c[$$2][$$3];
         return (ecl)($$4 != null ? $$4 : new ecr(this.e, new dio($$0, $$1), this.f.get()));
      } else {
         return new ecr(this.e, new dio($$0, $$1), this.f.get());
      }
   }

   @Override
   public ecg A_() {
      return this.e.A_();
   }

   @Override
   public din c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<ffr> c(@Nullable bwi $$0, fes $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dxm c_(iv $$0) {
      ecl $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public eao a_(iv $$0) {
      if (this.t($$0)) {
         return dmo.a.m();
      } else {
         ecl $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public ewv b_(iv $$0) {
      if (this.t($$0)) {
         return eww.a.g();
      } else {
         ecl $$1 = this.d($$0);
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
