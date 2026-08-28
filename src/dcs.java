import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dcs implements dbl, dbp {
   protected final int a;
   protected final int b;
   protected final dug[][] c;
   protected boolean d;
   protected final dcf e;
   private final Supplier<jj<ddf>> f;

   public dcs(dcf $$0, ja $$1, ja $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.H_().d(lr.aE).g(ddm.b));
      this.a = kc.a($$1.u());
      this.b = kc.a($$1.w());
      int $$3 = kc.a($$2.u());
      int $$4 = kc.a($$2.w());
      this.c = new dug[$$3 - this.a + 1][$$4 - this.b + 1];
      duk $$5 = $$0.N();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kc.a($$1.u()); $$8 <= kc.a($$2.u()); $$8++) {
         for (int $$9 = kc.a($$1.w()); $$9 <= kc.a($$2.w()); $$9++) {
            dug $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dug d(ja $$0) {
      return this.a(kc.a($$0.u()), kc.a($$0.w()));
   }

   private dug a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dug $$4 = this.c[$$2][$$3];
         return (dug)($$4 != null ? $$4 : new dum(this.e, new dbm($$0, $$1), this.f.get()));
      } else {
         return new dum(this.e, new dbm($$0, $$1), this.f.get());
      }
   }

   @Override
   public dub C_() {
      return this.e.C_();
   }

   @Override
   public dbl c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<ewy> c(@Nullable bsg $$0, ewa $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dpp c_(ja $$0) {
      dug $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dsk a_(ja $$0) {
      if (this.s($$0)) {
         return dfj.a.o();
      } else {
         dug $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public eoh b_(ja $$0) {
      if (this.s($$0)) {
         return eoi.a.g();
      } else {
         dug $$1 = this.d($$0);
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

   public bmu a() {
      return this.e.ag();
   }
}
