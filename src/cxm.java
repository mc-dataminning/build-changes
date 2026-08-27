import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cxm implements cwf, cwj {
   protected final int a;
   protected final int b;
   protected final dov[][] c;
   protected boolean d;
   protected final cwz e;
   private final Supplier<il<cxy>> f;

   public cxm(cwz $$0, ib $$1, ib $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.H_().d(kj.au).g(cyf.b));
      this.a = je.a($$1.u());
      this.b = je.a($$1.w());
      int $$3 = je.a($$2.u());
      int $$4 = je.a($$2.w());
      this.c = new dov[$$3 - this.a + 1][$$4 - this.b + 1];
      doz $$5 = $$0.L();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = je.a($$1.u()); $$8 <= je.a($$2.u()); $$8++) {
         for (int $$9 = je.a($$1.w()); $$9 <= je.a($$2.w()); $$9++) {
            dov $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dov d(ib $$0) {
      return this.a(je.a($$0.u()), je.a($$0.w()));
   }

   private dov a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dov $$4 = this.c[$$2][$$3];
         return (dov)($$4 != null ? $$4 : new dpc(this.e, new cwg($$0, $$1), this.f.get()));
      } else {
         return new dpc(this.e, new cwg($$0, $$1), this.f.get());
      }
   }

   @Override
   public doq C_() {
      return this.e.C_();
   }

   @Override
   public cwf c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<eqk> c(@Nullable bow $$0, epm $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dkg c_(ib $$0) {
      dov $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dmz a_(ib $$0) {
      if (this.s($$0)) {
         return dac.a.o();
      } else {
         dov $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public ein b_(ib $$0) {
      if (this.s($$0)) {
         return eio.a.g();
      } else {
         dov $$1 = this.d($$0);
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

   public bjq a() {
      return this.e.ae();
   }
}
