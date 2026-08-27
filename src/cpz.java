import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cpz implements cos, cow {
   protected final int a;
   protected final int b;
   protected final dgw[][] c;
   protected boolean d;
   protected final cpm e;
   private final Supplier<he<cqk>> f;

   public cpz(cpm $$0, gu $$1, gu $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.B_().d(jc.ap).f(cqr.b));
      this.a = hx.a($$1.u());
      this.b = hx.a($$1.w());
      int $$3 = hx.a($$2.u());
      int $$4 = hx.a($$2.w());
      this.c = new dgw[$$3 - this.a + 1][$$4 - this.b + 1];
      dha $$5 = $$0.J();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = hx.a($$1.u()); $$8 <= hx.a($$2.u()); $$8++) {
         for (int $$9 = hx.a($$1.w()); $$9 <= hx.a($$2.w()); $$9++) {
            dgw $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dgw d(gu $$0) {
      return this.a(hx.a($$0.u()), hx.a($$0.w()));
   }

   private dgw a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dgw $$4 = this.c[$$2][$$3];
         return (dgw)($$4 != null ? $$4 : new dhd(this.e, new cot($$0, $$1), this.f.get()));
      } else {
         return new dhd(this.e, new cot($$0, $$1), this.f.get());
      }
   }

   @Override
   public dgr w_() {
      return this.e.w_();
   }

   @Override
   public cos c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<ehx> c(@Nullable bii $$0, egz $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dcm c_(gu $$0) {
      dgw $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dfa a_(gu $$0) {
      if (this.r($$0)) {
         return csn.a.n();
      } else {
         dgw $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public ead b_(gu $$0) {
      if (this.r($$0)) {
         return eae.a.g();
      } else {
         dgw $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int C_() {
      return this.e.C_();
   }

   @Override
   public int D_() {
      return this.e.D_();
   }

   public bdh a() {
      return this.e.ad();
   }
}
