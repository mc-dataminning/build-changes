import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dhn implements dgj {
   protected final int a;
   protected final int b;
   protected final dzi[][] c;
   protected boolean d;
   protected final dha e;
   private final Supplier<jq<dic>> f;

   public dhn(dha $$0, jh $$1, jh $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.K_().e(mb.aH).b(dij.b));
      this.a = kj.a($$1.u());
      this.b = kj.a($$1.w());
      int $$3 = kj.a($$2.u());
      int $$4 = kj.a($$2.w());
      this.c = new dzi[$$3 - this.a + 1][$$4 - this.b + 1];
      dzm $$5 = $$0.R();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kj.a($$1.u()); $$8 <= kj.a($$2.u()); $$8++) {
         for (int $$9 = kj.a($$1.w()); $$9 <= kj.a($$2.w()); $$9++) {
            dzi $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dzi d(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w()));
   }

   private dzi a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dzi $$4 = this.c[$$2][$$3];
         return (dzi)($$4 != null ? $$4 : new dzo(this.e, new dgg($$0, $$1), this.f.get()));
      } else {
         return new dzo(this.e, new dgg($$0, $$1), this.f.get());
      }
   }

   @Override
   public dzd F_() {
      return this.e.F_();
   }

   @Override
   public dgf c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<fcm> c(@Nullable bvf $$0, fbn $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dup c_(jh $$0) {
      dzi $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dxn a_(jh $$0) {
      if (this.s($$0)) {
         return dkg.a.m();
      } else {
         dzi $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public etp b_(jh $$0) {
      if (this.s($$0)) {
         return etq.a.g();
      } else {
         dzi $$1 = this.d($$0);
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
