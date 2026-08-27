import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dbm implements daf, daj {
   protected final int a;
   protected final int b;
   protected final dsz[][] c;
   protected boolean d;
   protected final daz e;
   private final Supplier<ix<dby>> f;

   public dbm(daz $$0, io $$1, io $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.H_().d(lf.az).g(dcf.b));
      this.a = jq.a($$1.u());
      this.b = jq.a($$1.w());
      int $$3 = jq.a($$2.u());
      int $$4 = jq.a($$2.w());
      this.c = new dsz[$$3 - this.a + 1][$$4 - this.b + 1];
      dtd $$5 = $$0.M();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = jq.a($$1.u()); $$8 <= jq.a($$2.u()); $$8++) {
         for (int $$9 = jq.a($$1.w()); $$9 <= jq.a($$2.w()); $$9++) {
            dsz $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dsz d(io $$0) {
      return this.a(jq.a($$0.u()), jq.a($$0.w()));
   }

   private dsz a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dsz $$4 = this.c[$$2][$$3];
         return (dsz)($$4 != null ? $$4 : new dtf(this.e, new dag($$0, $$1), this.f.get()));
      } else {
         return new dtf(this.e, new dag($$0, $$1), this.f.get());
      }
   }

   @Override
   public dsu C_() {
      return this.e.C_();
   }

   @Override
   public daf c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<evf> c(@Nullable brw $$0, euh $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public doi c_(io $$0) {
      dsz $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public drd a_(io $$0) {
      if (this.s($$0)) {
         return dec.a.n();
      } else {
         dsz $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public emw b_(io $$0) {
      if (this.s($$0)) {
         return emx.a.g();
      } else {
         dsz $$1 = this.d($$0);
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

   public bmk a() {
      return this.e.af();
   }
}
