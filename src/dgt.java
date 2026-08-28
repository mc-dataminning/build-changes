import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dgt implements dfp {
   protected final int a;
   protected final int b;
   protected final dyq[][] c;
   protected boolean d;
   protected final dgg e;
   private final Supplier<jr<dhi>> f;

   public dgt(dgg $$0, ji $$1, ji $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.K_().e(mc.aI).b(dhp.b));
      this.a = kk.a($$1.u());
      this.b = kk.a($$1.w());
      int $$3 = kk.a($$2.u());
      int $$4 = kk.a($$2.w());
      this.c = new dyq[$$3 - this.a + 1][$$4 - this.b + 1];
      dyu $$5 = $$0.S();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kk.a($$1.u()); $$8 <= kk.a($$2.u()); $$8++) {
         for (int $$9 = kk.a($$1.w()); $$9 <= kk.a($$2.w()); $$9++) {
            dyq $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dyq d(ji $$0) {
      return this.a(kk.a($$0.u()), kk.a($$0.w()));
   }

   private dyq a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dyq $$4 = this.c[$$2][$$3];
         return (dyq)($$4 != null ? $$4 : new dyw(this.e, new dfm($$0, $$1), this.f.get()));
      } else {
         return new dyw(this.e, new dfm($$0, $$1), this.f.get());
      }
   }

   @Override
   public dyl F_() {
      return this.e.F_();
   }

   @Override
   public dfl c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<fbs> c(@Nullable buj $$0, fat $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dtx c_(ji $$0) {
      dyq $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dwv a_(ji $$0) {
      if (this.s($$0)) {
         return djm.a.m();
      } else {
         dyq $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public esx b_(ji $$0) {
      if (this.s($$0)) {
         return esy.a.g();
      } else {
         dyq $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int L_() {
      return this.e.L_();
   }

   @Override
   public int M_() {
      return this.e.M_();
   }
}
