import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class djz implements diu {
   protected final int a;
   protected final int b;
   protected final ecq[][] c;
   protected boolean d;
   protected final djm e;
   private final Supplier<jf<dkp>> f;

   public djz(djm $$0, iv $$1, iv $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.F_().f(mh.aG).b(dkw.b));
      this.a = jy.a($$1.u());
      this.b = jy.a($$1.w());
      int $$3 = jy.a($$2.u());
      int $$4 = jy.a($$2.w());
      this.c = new ecq[$$3 - this.a + 1][$$4 - this.b + 1];
      ecu $$5 = $$0.S();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = jy.a($$1.u()); $$8 <= jy.a($$2.u()); $$8++) {
         for (int $$9 = jy.a($$1.w()); $$9 <= jy.a($$2.w()); $$9++) {
            ecq $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private ecq d(iv $$0) {
      return this.a(jy.a($$0.u()), jy.a($$0.w()));
   }

   private ecq a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         ecq $$4 = this.c[$$2][$$3];
         return (ecq)($$4 != null ? $$4 : new ecw(this.e, new dir($$0, $$1), this.f.get()));
      } else {
         return new ecw(this.e, new dir($$0, $$1), this.f.get());
      }
   }

   @Override
   public ecl A_() {
      return this.e.A_();
   }

   @Override
   public diq c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<ffw> c(@Nullable bwi $$0, fex $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dxr c_(iv $$0) {
      ecq $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public eat a_(iv $$0) {
      if (this.t($$0)) {
         return dmt.a.m();
      } else {
         ecq $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public exa b_(iv $$0) {
      if (this.t($$0)) {
         return exb.a.g();
      } else {
         ecq $$1 = this.d($$0);
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
