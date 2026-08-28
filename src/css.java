import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class css extends csa {
   private static final int p = 3;
   private static final int q = 3;
   public static final int o = 0;
   private static final int r = 1;
   private static final int s = 9;
   private static final int t = 10;
   private static final int u = 10;
   private static final int v = 37;
   private static final int w = 37;
   private static final int x = 46;
   private final csm y;
   private final cou z;
   private boolean A;

   public css(int $$0, cot $$1) {
      this($$0, $$1, csm.a);
   }

   public css(int $$0, cot $$1, csm $$2) {
      super(cti.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.k;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(crz $$0, dfm $$1, cou $$2, csr $$3, ctr $$4, @Nullable dbc<daq> $$5) {
      if (!$$1.C) {
         dap $$6 = $$3.aB_();
         arq $$7 = (arq)$$2;
         cwm $$8 = cwm.k;
         Optional<dbc<daq>> $$9 = $$1.p().aI().a(dbg.a, $$6, $$1, $$5);
         if ($$9.isPresent()) {
            dbc<daq> $$10 = $$9.get();
            daq $$11 = $$10.b();
            if ($$4.a($$7, $$10)) {
               cwm $$12 = $$11.a($$6, $$1.J_());
               if ($$12.a($$1.J())) {
                  $$8 = $$12;
               }
            }
         }

         $$4.a(0, $$8);
         $$0.a(0, $$8);
         $$7.f.b(new adc($$0.l, $$0.k(), 0, $$8));
      }
   }

   @Override
   public void a(bsd $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> a(this, $$0x, this.z, this.m, this.n, null));
      }
   }

   @Override
   public void l() {
      this.A = true;
   }

   @Override
   public void a(dbc<daq> $$0) {
      this.A = false;
      this.y.a(($$1, $$2) -> a(this, $$1, this.z, this.m, this.n, $$0));
   }

   @Override
   public void a(cou $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(cou $$0) {
      return a(this.y, $$0, dis.cA);
   }

   @Override
   public cwm b(cou $$0, int $$1) {
      cwm $$2 = cwm.k;
      ctw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwm $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().a($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cwm.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cwm.k;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cwm.k;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cwm.k;
         }

         if ($$4.f()) {
            $$3.e(cwm.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwm.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cwm $$0, ctw $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public ctw m() {
      return this.k.get(0);
   }

   @Override
   public List<ctw> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public ctp am_() {
      return ctp.a;
   }

   @Override
   protected cou q() {
      return this.z;
   }
}
