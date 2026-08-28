import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ddj implements dcc, dcg {
   protected final int a;
   protected final int b;
   protected final duy[][] c;
   protected boolean d;
   protected final dcw e;
   private final Supplier<jm<ddw>> f;

   public ddj(dcw $$0, jd $$1, jd $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.H_().d(lu.aF).g(ded.b));
      this.a = kf.a($$1.u());
      this.b = kf.a($$1.w());
      int $$3 = kf.a($$2.u());
      int $$4 = kf.a($$2.w());
      this.c = new duy[$$3 - this.a + 1][$$4 - this.b + 1];
      dvc $$5 = $$0.N();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kf.a($$1.u()); $$8 <= kf.a($$2.u()); $$8++) {
         for (int $$9 = kf.a($$1.w()); $$9 <= kf.a($$2.w()); $$9++) {
            duy $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private duy d(jd $$0) {
      return this.a(kf.a($$0.u()), kf.a($$0.w()));
   }

   private duy a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         duy $$4 = this.c[$$2][$$3];
         return (duy)($$4 != null ? $$4 : new dve(this.e, new dcd($$0, $$1), this.f.get()));
      } else {
         return new dve(this.e, new dcd($$0, $$1), this.f.get());
      }
   }

   @Override
   public dut C_() {
      return this.e.C_();
   }

   @Override
   public dcc c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<exv> c(@Nullable bsr $$0, ewx $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dqh c_(jd $$0) {
      duy $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dtc a_(jd $$0) {
      if (this.s($$0)) {
         return dga.a.o();
      } else {
         duy $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public epe b_(jd $$0) {
      if (this.s($$0)) {
         return epf.a.g();
      } else {
         duy $$1 = this.d($$0);
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

   public bnf a() {
      return this.e.ag();
   }
}
