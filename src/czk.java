import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class czk implements cyd, cyh {
   protected final int a;
   protected final int b;
   protected final dqv[][] c;
   protected boolean d;
   protected final cyx e;
   private final Supplier<il<czw>> f;

   public czk(cyx $$0, ib $$1, ib $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.H_().d(ks.av).g(dad.b));
      this.a = je.a($$1.u());
      this.b = je.a($$1.w());
      int $$3 = je.a($$2.u());
      int $$4 = je.a($$2.w());
      this.c = new dqv[$$3 - this.a + 1][$$4 - this.b + 1];
      dqz $$5 = $$0.M();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = je.a($$1.u()); $$8 <= je.a($$2.u()); $$8++) {
         for (int $$9 = je.a($$1.w()); $$9 <= je.a($$2.w()); $$9++) {
            dqv $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dqv d(ib $$0) {
      return this.a(je.a($$0.u()), je.a($$0.w()));
   }

   private dqv a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dqv $$4 = this.c[$$2][$$3];
         return (dqv)($$4 != null ? $$4 : new drb(this.e, new cye($$0, $$1), this.f.get()));
      } else {
         return new drb(this.e, new cye($$0, $$1), this.f.get());
      }
   }

   @Override
   public dqq C_() {
      return this.e.C_();
   }

   @Override
   public cyd c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<est> c(@Nullable bpv $$0, erv $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dmf c_(ib $$0) {
      dqv $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public doz a_(ib $$0) {
      if (this.s($$0)) {
         return dca.a.n();
      } else {
         dqv $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public eks b_(ib $$0) {
      if (this.s($$0)) {
         return ekt.a.g();
      } else {
         dqv $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int I_() {
      return this.e.I_();
   }

   @Override
   public int J_() {
      return this.e.J_();
   }

   public bko a() {
      return this.e.af();
   }
}
