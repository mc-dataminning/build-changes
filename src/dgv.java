import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dgv implements dfr {
   protected final int a;
   protected final int b;
   protected final dys[][] c;
   protected boolean d;
   protected final dgi e;
   private final Supplier<jr<dhk>> f;

   public dgv(dgi $$0, ji $$1, ji $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.K_().e(mc.aI).b(dhr.b));
      this.a = kk.a($$1.u());
      this.b = kk.a($$1.w());
      int $$3 = kk.a($$2.u());
      int $$4 = kk.a($$2.w());
      this.c = new dys[$$3 - this.a + 1][$$4 - this.b + 1];
      dyw $$5 = $$0.S();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kk.a($$1.u()); $$8 <= kk.a($$2.u()); $$8++) {
         for (int $$9 = kk.a($$1.w()); $$9 <= kk.a($$2.w()); $$9++) {
            dys $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dys d(ji $$0) {
      return this.a(kk.a($$0.u()), kk.a($$0.w()));
   }

   private dys a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dys $$4 = this.c[$$2][$$3];
         return (dys)($$4 != null ? $$4 : new dyy(this.e, new dfo($$0, $$1), this.f.get()));
      } else {
         return new dyy(this.e, new dfo($$0, $$1), this.f.get());
      }
   }

   @Override
   public dyn F_() {
      return this.e.F_();
   }

   @Override
   public dfn c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<fbu> c(@Nullable buk $$0, fav $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dtz c_(ji $$0) {
      dys $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dwx a_(ji $$0) {
      if (this.s($$0)) {
         return djo.a.m();
      } else {
         dys $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public esz b_(ji $$0) {
      if (this.s($$0)) {
         return eta.a.g();
      } else {
         dys $$1 = this.d($$0);
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
