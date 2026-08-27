import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cpx implements coq, cou {
   protected final int a;
   protected final int b;
   protected final dgu[][] c;
   protected boolean d;
   protected final cpk e;
   private final Supplier<hf<cqi>> f;

   public cpx(cpk $$0, gv $$1, gv $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.B_().d(jd.ap).f(cqp.b));
      this.a = hy.a($$1.u());
      this.b = hy.a($$1.w());
      int $$3 = hy.a($$2.u());
      int $$4 = hy.a($$2.w());
      this.c = new dgu[$$3 - this.a + 1][$$4 - this.b + 1];
      dgy $$5 = $$0.J();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = hy.a($$1.u()); $$8 <= hy.a($$2.u()); $$8++) {
         for (int $$9 = hy.a($$1.w()); $$9 <= hy.a($$2.w()); $$9++) {
            dgu $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dgu d(gv $$0) {
      return this.a(hy.a($$0.u()), hy.a($$0.w()));
   }

   private dgu a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dgu $$4 = this.c[$$2][$$3];
         return (dgu)($$4 != null ? $$4 : new dhb(this.e, new cor($$0, $$1), this.f.get()));
      } else {
         return new dhb(this.e, new cor($$0, $$1), this.f.get());
      }
   }

   @Override
   public dgp w_() {
      return this.e.w_();
   }

   @Override
   public coq c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<ehy> c(@Nullable big $$0, eha $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dck c_(gv $$0) {
      dgu $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dey a_(gv $$0) {
      if (this.r($$0)) {
         return csl.a.n();
      } else {
         dgu $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public eab b_(gv $$0) {
      if (this.r($$0)) {
         return eac.a.g();
      } else {
         dgu $$1 = this.d($$0);
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

   public bde a() {
      return this.e.ad();
   }
}
