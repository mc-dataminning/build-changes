import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dct implements dbm, dbq {
   protected final int a;
   protected final int b;
   protected final duh[][] c;
   protected boolean d;
   protected final dcg e;
   private final Supplier<jj<ddg>> f;

   public dct(dcg $$0, ja $$1, ja $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.H_().d(lr.aE).g(ddn.b));
      this.a = kc.a($$1.u());
      this.b = kc.a($$1.w());
      int $$3 = kc.a($$2.u());
      int $$4 = kc.a($$2.w());
      this.c = new duh[$$3 - this.a + 1][$$4 - this.b + 1];
      dul $$5 = $$0.N();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kc.a($$1.u()); $$8 <= kc.a($$2.u()); $$8++) {
         for (int $$9 = kc.a($$1.w()); $$9 <= kc.a($$2.w()); $$9++) {
            duh $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private duh d(ja $$0) {
      return this.a(kc.a($$0.u()), kc.a($$0.w()));
   }

   private duh a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         duh $$4 = this.c[$$2][$$3];
         return (duh)($$4 != null ? $$4 : new dun(this.e, new dbn($$0, $$1), this.f.get()));
      } else {
         return new dun(this.e, new dbn($$0, $$1), this.f.get());
      }
   }

   @Override
   public duc C_() {
      return this.e.C_();
   }

   @Override
   public dbm c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<exa> c(@Nullable bsh $$0, ewc $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dpq c_(ja $$0) {
      duh $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dsl a_(ja $$0) {
      if (this.s($$0)) {
         return dfk.a.o();
      } else {
         duh $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public eoj b_(ja $$0) {
      if (this.s($$0)) {
         return eok.a.g();
      } else {
         duh $$1 = this.d($$0);
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

   public bmv a() {
      return this.e.ag();
   }
}
