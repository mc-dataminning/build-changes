import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dgu implements dfq {
   protected final int a;
   protected final int b;
   protected final dyr[][] c;
   protected boolean d;
   protected final dgh e;
   private final Supplier<jr<dhj>> f;

   public dgu(dgh $$0, ji $$1, ji $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.K_().e(mc.aI).b(dhq.b));
      this.a = kk.a($$1.u());
      this.b = kk.a($$1.w());
      int $$3 = kk.a($$2.u());
      int $$4 = kk.a($$2.w());
      this.c = new dyr[$$3 - this.a + 1][$$4 - this.b + 1];
      dyv $$5 = $$0.S();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kk.a($$1.u()); $$8 <= kk.a($$2.u()); $$8++) {
         for (int $$9 = kk.a($$1.w()); $$9 <= kk.a($$2.w()); $$9++) {
            dyr $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dyr d(ji $$0) {
      return this.a(kk.a($$0.u()), kk.a($$0.w()));
   }

   private dyr a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dyr $$4 = this.c[$$2][$$3];
         return (dyr)($$4 != null ? $$4 : new dyx(this.e, new dfn($$0, $$1), this.f.get()));
      } else {
         return new dyx(this.e, new dfn($$0, $$1), this.f.get());
      }
   }

   @Override
   public dym F_() {
      return this.e.F_();
   }

   @Override
   public dfm c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<fbt> c(@Nullable buk $$0, fau $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dty c_(ji $$0) {
      dyr $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dww a_(ji $$0) {
      if (this.s($$0)) {
         return djn.a.m();
      } else {
         dyr $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public esy b_(ji $$0) {
      if (this.s($$0)) {
         return esz.a.g();
      } else {
         dyr $$1 = this.d($$0);
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
