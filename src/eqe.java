import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eqe extends epz {
   public static final float e = 0.44444445F;

   @Override
   public eqa d() {
      return eqc.d;
   }

   @Override
   public eqa e() {
      return eqc.e;
   }

   @Override
   public cvg a() {
      return cvo.qB;
   }

   @Override
   public void a(dds $$0, je $$1, eqb $$2, azk $$3) {
      je $$4 = $$1.d();
      if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(ln.Y, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, awd.nS, awe.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awd.nQ, awe.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(dds $$0, je $$1, eqb $$2, azk $$3) {
      if ($$0.ac().b(ddo.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            je $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dua $$7 = $$0.a_($$5);
               if ($$7.l()) {
                  if (this.a((ddv)$$0, $$5)) {
                     $$0.b($$5, dgi.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               je $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.d()) && this.b($$0, $$9)) {
                  $$0.b($$9.d(), dgi.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(ddv $$0, je $$1) {
      for (jj $$2 : jj.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(ddv $$0, je $$1) {
      return $$1.v() >= $$0.G_() && $$1.v() < $$0.an() && !$$0.B($$1) ? false : $$0.a_($$1).m();
   }

   @Nullable
   @Override
   public ll h() {
      return ln.i;
   }

   @Override
   protected void a(ddt $$0, je $$1, dua $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(ddv $$0) {
      return $$0.B_().i() ? 4 : 2;
   }

   @Override
   public dua b(eqb $$0) {
      return dgx.H.o().b(dll.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eqa $$0) {
      return $$0 == eqc.e || $$0 == eqc.d;
   }

   @Override
   public int c(ddv $$0) {
      return $$0.B_().i() ? 1 : 2;
   }

   @Override
   public boolean a(eqb $$0, dcx $$1, je $$2, eqa $$3, jj $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(awy.a);
   }

   @Override
   public int a(ddv $$0) {
      return $$0.B_().i() ? 10 : 30;
   }

   @Override
   public int a(dds $$0, je $$1, eqb $$2, eqb $$3) {
      int $$4 = this.a((ddv)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a($$0, $$1) > $$2.a($$0, $$1) && $$0.C_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(ddt $$0, je $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(dds $$0) {
      return $$0.ac().b(ddo.V);
   }

   @Override
   protected void a(ddt $$0, je $$1, dua $$2, jj $$3, eqb $$4) {
      if ($$3 == jj.a) {
         eqb $$5 = $$0.b_($$1);
         if (this.a(awy.b) && $$5.a(awy.a)) {
            if ($$2.b() instanceof dll) {
               $$0.a($$1, dgx.b.o(), 3);
            }

            this.a($$0, $$1);
            return;
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean i() {
      return true;
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awc> j() {
      return Optional.of(awd.dl);
   }

   public static class a extends eqe {
      @Override
      protected void a(dub.a<eqa, eqb> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eqb $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eqb $$0) {
         return false;
      }
   }

   public static class b extends eqe {
      @Override
      public int d(eqb $$0) {
         return 8;
      }

      @Override
      public boolean c(eqb $$0) {
         return true;
      }
   }
}
