import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cqo implements cph, cpl {
   protected final int a;
   protected final int b;
   protected final dgz[][] c;
   protected boolean d;
   protected final cqb e;
   private final Supplier<he<cqz>> f;

   public cqo(cqb $$0, gw $$1, gw $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.G_().d(jc.aq).f(crg.b));
      this.a = hw.a($$1.u());
      this.b = hw.a($$1.w());
      int $$3 = hw.a($$2.u());
      int $$4 = hw.a($$2.w());
      this.c = new dgz[$$3 - this.a + 1][$$4 - this.b + 1];
      dhd $$5 = $$0.J();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = hw.a($$1.u()); $$8 <= hw.a($$2.u()); $$8++) {
         for (int $$9 = hw.a($$1.w()); $$9 <= hw.a($$2.w()); $$9++) {
            dgz $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dgz d(gw $$0) {
      return this.a(hw.a($$0.u()), hw.a($$0.w()));
   }

   private dgz a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dgz $$4 = this.c[$$2][$$3];
         return (dgz)($$4 != null ? $$4 : new dhg(this.e, new cpi($$0, $$1), this.f.get()));
      } else {
         return new dhg(this.e, new cpi($$0, $$1), this.f.get());
      }
   }

   @Override
   public dgu B_() {
      return this.e.B_();
   }

   @Override
   public cph c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<eia> c(@Nullable biw $$0, ehc $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dcz c_(gw $$0) {
      dgz $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dfd a_(gw $$0) {
      if (this.r($$0)) {
         return cte.a.o();
      } else {
         dgz $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public eag b_(gw $$0) {
      if (this.r($$0)) {
         return eah.a.g();
      } else {
         dgz $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int H_() {
      return this.e.H_();
   }

   @Override
   public int I_() {
      return this.e.I_();
   }

   public bdv a() {
      return this.e.ad();
   }
}
