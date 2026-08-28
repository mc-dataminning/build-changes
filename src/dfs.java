import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dfs implements deo {
   protected final int a;
   protected final int b;
   protected final dxj[][] c;
   protected boolean d;
   protected final dff e;
   private final Supplier<jq<dgh>> f;

   public dfs(dff $$0, jh $$1, jh $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.H_().e(ma.aG).b(dgo.b));
      this.a = kj.a($$1.u());
      this.b = kj.a($$1.w());
      int $$3 = kj.a($$2.u());
      int $$4 = kj.a($$2.w());
      this.c = new dxj[$$3 - this.a + 1][$$4 - this.b + 1];
      dxn $$5 = $$0.P();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kj.a($$1.u()); $$8 <= kj.a($$2.u()); $$8++) {
         for (int $$9 = kj.a($$1.w()); $$9 <= kj.a($$2.w()); $$9++) {
            dxj $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dxj d(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w()));
   }

   private dxj a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dxj $$4 = this.c[$$2][$$3];
         return (dxj)($$4 != null ? $$4 : new dxp(this.e, new del($$0, $$1), this.f.get()));
      } else {
         return new dxp(this.e, new del($$0, $$1), this.f.get());
      }
   }

   @Override
   public dxe C_() {
      return this.e.C_();
   }

   @Override
   public dek c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<fal> c(@Nullable bui $$0, ezm $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dsr c_(jh $$0) {
      dxj $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dvo a_(jh $$0) {
      if (this.s($$0)) {
         return dil.a.m();
      } else {
         dxj $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public ero b_(jh $$0) {
      if (this.s($$0)) {
         return erp.a.g();
      } else {
         dxj $$1 = this.d($$0);
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
}
