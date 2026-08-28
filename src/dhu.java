import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dhu implements dgq {
   protected final int a;
   protected final int b;
   protected final dzp[][] c;
   protected boolean d;
   protected final dhh e;
   private final Supplier<jq<dij>> f;

   public dhu(dhh $$0, jh $$1, jh $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.K_().e(mb.aI).b(diq.b));
      this.a = kj.a($$1.u());
      this.b = kj.a($$1.w());
      int $$3 = kj.a($$2.u());
      int $$4 = kj.a($$2.w());
      this.c = new dzp[$$3 - this.a + 1][$$4 - this.b + 1];
      dzt $$5 = $$0.R();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kj.a($$1.u()); $$8 <= kj.a($$2.u()); $$8++) {
         for (int $$9 = kj.a($$1.w()); $$9 <= kj.a($$2.w()); $$9++) {
            dzp $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dzp d(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w()));
   }

   private dzp a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dzp $$4 = this.c[$$2][$$3];
         return (dzp)($$4 != null ? $$4 : new dzv(this.e, new dgn($$0, $$1), this.f.get()));
      } else {
         return new dzv(this.e, new dgn($$0, $$1), this.f.get());
      }
   }

   @Override
   public dzk F_() {
      return this.e.F_();
   }

   @Override
   public dgm c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<fcr> c(@Nullable bvj $$0, fbs $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public duw c_(jh $$0) {
      dzp $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dxu a_(jh $$0) {
      if (this.s($$0)) {
         return dkn.a.m();
      } else {
         dzp $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public etw b_(jh $$0) {
      if (this.s($$0)) {
         return etx.a.g();
      } else {
         dzp $$1 = this.d($$0);
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
