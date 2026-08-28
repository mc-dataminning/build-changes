import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dhv implements dgr {
   protected final int a;
   protected final int b;
   protected final dzq[][] c;
   protected boolean d;
   protected final dhi e;
   private final Supplier<jq<dik>> f;

   public dhv(dhi $$0, jh $$1, jh $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.K_().e(mb.aI).b(dir.b));
      this.a = kj.a($$1.u());
      this.b = kj.a($$1.w());
      int $$3 = kj.a($$2.u());
      int $$4 = kj.a($$2.w());
      this.c = new dzq[$$3 - this.a + 1][$$4 - this.b + 1];
      dzu $$5 = $$0.R();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kj.a($$1.u()); $$8 <= kj.a($$2.u()); $$8++) {
         for (int $$9 = kj.a($$1.w()); $$9 <= kj.a($$2.w()); $$9++) {
            dzq $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dzq d(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w()));
   }

   private dzq a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dzq $$4 = this.c[$$2][$$3];
         return (dzq)($$4 != null ? $$4 : new dzw(this.e, new dgo($$0, $$1), this.f.get()));
      } else {
         return new dzw(this.e, new dgo($$0, $$1), this.f.get());
      }
   }

   @Override
   public dzl F_() {
      return this.e.F_();
   }

   @Override
   public dgn c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<fcs> c(@Nullable bvk $$0, fbt $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dux c_(jh $$0) {
      dzq $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dxv a_(jh $$0) {
      if (this.s($$0)) {
         return dko.a.m();
      } else {
         dzq $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public etx b_(jh $$0) {
      if (this.s($$0)) {
         return ety.a.g();
      } else {
         dzq $$1 = this.d($$0);
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
