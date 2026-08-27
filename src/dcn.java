import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dcn implements dbg, dbk {
   protected final int a;
   protected final int b;
   protected final duy[][] c;
   protected boolean d;
   protected final dca e;
   private final Supplier<ja<dcz>> f;

   public dcn(dca $$0, ir $$1, ir $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.I_().d(li.az).g(ddg.b));
      this.a = jt.a($$1.u());
      this.b = jt.a($$1.w());
      int $$3 = jt.a($$2.u());
      int $$4 = jt.a($$2.w());
      this.c = new duy[$$3 - this.a + 1][$$4 - this.b + 1];
      dvc $$5 = $$0.N();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = jt.a($$1.u()); $$8 <= jt.a($$2.u()); $$8++) {
         for (int $$9 = jt.a($$1.w()); $$9 <= jt.a($$2.w()); $$9++) {
            duy $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private duy d(ir $$0) {
      return this.b(jt.a($$0.u()), jt.a($$0.w()));
   }

   private duy b(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         duy $$4 = this.c[$$2][$$3];
         return (duy)($$4 != null ? $$4 : new dve(this.e, new dbh($$0, $$1), this.f.get()));
      } else {
         return new dve(this.e, new dbh($$0, $$1), this.f.get());
      }
   }

   @Override
   public dut D_() {
      return this.e.D_();
   }

   @Override
   public dbg a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public List<exn> a(@Nullable brv $$0, ewp $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dqc c_(ir $$0) {
      duy $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dtc a_(ir $$0) {
      if (this.s($$0)) {
         return dfe.a.n();
      } else {
         duy $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public epe b_(ir $$0) {
      if (this.s($$0)) {
         return epf.a.g();
      } else {
         duy $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int J_() {
      return this.e.J_();
   }

   @Override
   public int K_() {
      return this.e.K_();
   }

   public bmo a() {
      return this.e.ag();
   }

   @Override
   public boolean z_() {
      return this.e.z_();
   }
}
