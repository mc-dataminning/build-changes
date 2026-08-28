import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class crj extends cqr {
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
   private final crd y;
   private final cnp z;
   private boolean A;

   public crj(int $$0, cno $$1) {
      this($$0, $$1, crd.a);
   }

   public crj(int $$0, cno $$1, crd $$2) {
      super(crz.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.k;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(cqq $$0, dds $$1, cnp $$2, cri $$3, csi $$4, @Nullable czv<czj> $$5) {
      if (!$$1.B) {
         czi $$6 = $$3.aE_();
         arh $$7 = (arh)$$2;
         cvl $$8 = cvl.k;
         Optional<czv<czj>> $$9 = $$1.o().aI().a(czz.a, $$6, $$1, $$5);
         if ($$9.isPresent()) {
            czv<czj> $$10 = $$9.get();
            czj $$11 = $$10.b();
            if ($$4.a($$1, $$7, $$10)) {
               cvl $$12 = $$11.a($$6, $$1.F_());
               if ($$12.a($$1.J())) {
                  $$8 = $$12;
               }
            }
         }

         $$4.a(0, $$8);
         $$0.a(0, $$8);
         $$7.c.b(new acw($$0.l, $$0.k(), 0, $$8));
      }
   }

   @Override
   public void a(brd $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> a(this, $$0x, this.z, this.m, this.n, null));
      }
   }

   @Override
   public void l() {
      this.A = true;
   }

   @Override
   public void a(czv<czj> $$0) {
      this.A = false;
      this.y.a(($$1, $$2) -> a(this, $$1, this.z, this.m, this.n, $$0));
   }

   @Override
   public void a(cnp $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(cnp $$0) {
      return a(this.y, $$0, dgx.cA);
   }

   @Override
   public cvl b(cnp $$0, int $$1) {
      cvl $$2 = cvl.k;
      csn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvl $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cvl.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cvl.k;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cvl.k;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cvl.k;
         }

         if ($$4.f()) {
            $$3.e(cvl.k);
         } else {
            $$3.c();
         }

         if ($$4.J() == $$2.J()) {
            return cvl.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cvl $$0, csn $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public csn m() {
      return this.k.get(0);
   }

   @Override
   public List<csn> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public csg am_() {
      return csg.a;
   }

   @Override
   protected cnp q() {
      return this.z;
   }
}
