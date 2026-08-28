import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dfz implements dev {
   protected final int a;
   protected final int b;
   protected final dxq[][] c;
   protected boolean d;
   protected final dfm e;
   private final Supplier<jq<dgo>> f;

   public dfz(dfm $$0, jh $$1, jh $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.J_().e(ma.aG).b(dgv.b));
      this.a = kj.a($$1.u());
      this.b = kj.a($$1.w());
      int $$3 = kj.a($$2.u());
      int $$4 = kj.a($$2.w());
      this.c = new dxq[$$3 - this.a + 1][$$4 - this.b + 1];
      dxu $$5 = $$0.Q();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kj.a($$1.u()); $$8 <= kj.a($$2.u()); $$8++) {
         for (int $$9 = kj.a($$1.w()); $$9 <= kj.a($$2.w()); $$9++) {
            dxq $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dxq d(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w()));
   }

   private dxq a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dxq $$4 = this.c[$$2][$$3];
         return (dxq)($$4 != null ? $$4 : new dxw(this.e, new des($$0, $$1), this.f.get()));
      } else {
         return new dxw(this.e, new des($$0, $$1), this.f.get());
      }
   }

   @Override
   public dxl E_() {
      return this.e.E_();
   }

   @Override
   public der c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<fas> c(@Nullable bul $$0, ezt $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dsy c_(jh $$0) {
      dxq $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dvv a_(jh $$0) {
      if (this.s($$0)) {
         return dis.a.m();
      } else {
         dxq $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public erv b_(jh $$0) {
      if (this.s($$0)) {
         return erw.a.g();
      } else {
         dxq $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int K_() {
      return this.e.K_();
   }

   @Override
   public int L_() {
      return this.e.L_();
   }
}
