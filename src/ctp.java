import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctp extends csx {
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
   private final ctj y;
   private final cpr z;
   private boolean A;

   public ctp(int $$0, cpq $$1) {
      this($$0, $$1, ctj.a);
   }

   public ctp(int $$0, cpq $$1, ctj $$2) {
      super(cuf.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.k;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(csw $$0, ard $$1, cpr $$2, cto $$3, cuo $$4, @Nullable dca<dbk> $$5) {
      dbj $$6 = $$3.aB_();
      are $$7 = (are)$$2;
      cxh $$8 = cxh.k;
      Optional<dca<dbk>> $$9 = $$1.p().aI().a(dcg.a, $$6, $$1, $$5);
      if ($$9.isPresent()) {
         dca<dbk> $$10 = $$9.get();
         dbk $$11 = $$10.b();
         if ($$4.a($$7, $$10)) {
            cxh $$12 = $$11.a($$6, $$1.F_());
            if ($$12.a($$1.K())) {
               $$8 = $$12;
            }
         }
      }

      $$4.a(0, $$8);
      $$0.a(0, $$8);
      $$7.f.b(new ach($$0.l, $$0.k(), 0, $$8));
   }

   @Override
   public void a(bsr $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> {
            if ($$0x instanceof ard $$2) {
               a(this, $$2, this.z, this.m, this.n, null);
            }
         });
      }
   }

   @Override
   public void l() {
      this.A = true;
   }

   @Override
   public void a(ard $$0, dca<dbk> $$1) {
      this.A = false;
      a(this, $$0, this.z, this.m, this.n, $$1);
   }

   @Override
   public void a(cpr $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(cpr $$0) {
      return a(this.y, $$0, dkg.cI);
   }

   @Override
   public cxh b(cpr $$0, int $$1) {
      cxh $$2 = cxh.k;
      cut $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxh $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().a($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cxh.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cxh.k;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cxh.k;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cxh.k;
         }

         if ($$4.f()) {
            $$3.e(cxh.k);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cxh.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cxh $$0, cut $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cut m() {
      return this.k.get(0);
   }

   @Override
   public List<cut> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public cum am_() {
      return cum.a;
   }

   @Override
   protected cpr q() {
      return this.z;
   }
}
