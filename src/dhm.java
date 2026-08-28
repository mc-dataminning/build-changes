import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dhm implements dgj {
   protected final int a;
   protected final int b;
   protected final dzm[][] c;
   protected boolean d;
   protected final dgz e;
   private final Supplier<jr<dic>> f;

   public dhm(dgz $$0, ji $$1, ji $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.F_().e(mc.aJ).b(dij.b));
      this.a = kk.a($$1.u());
      this.b = kk.a($$1.w());
      int $$3 = kk.a($$2.u());
      int $$4 = kk.a($$2.w());
      this.c = new dzm[$$3 - this.a + 1][$$4 - this.b + 1];
      dzq $$5 = $$0.S();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kk.a($$1.u()); $$8 <= kk.a($$2.u()); $$8++) {
         for (int $$9 = kk.a($$1.w()); $$9 <= kk.a($$2.w()); $$9++) {
            dzm $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dzm d(ji $$0) {
      return this.a(kk.a($$0.u()), kk.a($$0.w()));
   }

   private dzm a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dzm $$4 = this.c[$$2][$$3];
         return (dzm)($$4 != null ? $$4 : new dzs(this.e, new dgg($$0, $$1), this.f.get()));
      } else {
         return new dzs(this.e, new dgg($$0, $$1), this.f.get());
      }
   }

   @Override
   public dzh A_() {
      return this.e.A_();
   }

   @Override
   public dgf c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<fcr> c(@Nullable bva $$0, fbs $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dus c_(ji $$0) {
      dzm $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dxq a_(ji $$0) {
      if (this.s($$0)) {
         return dkg.a.m();
      } else {
         dzm $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public etw b_(ji $$0) {
      if (this.s($$0)) {
         return etx.a.g();
      } else {
         dzm $$1 = this.d($$0);
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
