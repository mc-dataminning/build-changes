import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dbk implements dad, dah {
   protected final int a;
   protected final int b;
   protected final dsx[][] c;
   protected boolean d;
   protected final dax e;
   private final Supplier<ix<dbw>> f;

   public dbk(dax $$0, io $$1, io $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.H_().d(lf.az).g(dcd.b));
      this.a = jq.a($$1.u());
      this.b = jq.a($$1.w());
      int $$3 = jq.a($$2.u());
      int $$4 = jq.a($$2.w());
      this.c = new dsx[$$3 - this.a + 1][$$4 - this.b + 1];
      dtb $$5 = $$0.M();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = jq.a($$1.u()); $$8 <= jq.a($$2.u()); $$8++) {
         for (int $$9 = jq.a($$1.w()); $$9 <= jq.a($$2.w()); $$9++) {
            dsx $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dsx d(io $$0) {
      return this.a(jq.a($$0.u()), jq.a($$0.w()));
   }

   private dsx a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dsx $$4 = this.c[$$2][$$3];
         return (dsx)($$4 != null ? $$4 : new dtd(this.e, new dae($$0, $$1), this.f.get()));
      } else {
         return new dtd(this.e, new dae($$0, $$1), this.f.get());
      }
   }

   @Override
   public dss C_() {
      return this.e.C_();
   }

   @Override
   public dad c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<evd> c(@Nullable bru $$0, euf $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dog c_(io $$0) {
      dsx $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public drb a_(io $$0) {
      if (this.s($$0)) {
         return dea.a.n();
      } else {
         dsx $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public emu b_(io $$0) {
      if (this.s($$0)) {
         return emv.a.g();
      } else {
         dsx $$1 = this.d($$0);
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

   public bmi a() {
      return this.e.af();
   }
}
