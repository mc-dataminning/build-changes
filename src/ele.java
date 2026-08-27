import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ele extends ekz {
   public static final float e = 0.44444445F;

   @Override
   public ela d() {
      return elc.d;
   }

   @Override
   public ela e() {
      return elc.e;
   }

   @Override
   public crn a() {
      return crv.qz;
   }

   @Override
   public void a(czg $$0, id $$1, elb $$2, axt $$3) {
      id $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(kn.W, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, auo.nC, aup.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), auo.nA, aup.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(czg $$0, id $$1, elb $$2, axt $$3) {
      if ($$0.aa().b(czc.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            id $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dpi $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((czj)$$0, $$5)) {
                     $$0.b($$5, dbu.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               id $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), dbu.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(czj $$0, id $$1) {
      for (ij $$2 : ij.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(czj $$0, id $$1) {
      return $$1.v() >= $$0.I_() && $$1.v() < $$0.al() && !$$0.B($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public kl h() {
      return kn.j;
   }

   @Override
   protected void a(czh $$0, id $$1, dpi $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(czj $$0) {
      return $$0.D_().i() ? 4 : 2;
   }

   @Override
   public dpi b(elb $$0) {
      return dcj.H.n().a(dgw.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ela $$0) {
      return $$0 == elc.e || $$0 == elc.d;
   }

   @Override
   public int c(czj $$0) {
      return $$0.D_().i() ? 1 : 2;
   }

   @Override
   public boolean a(elb $$0, cym $$1, id $$2, ela $$3, ij $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(avj.a);
   }

   @Override
   public int a(czj $$0) {
      return $$0.D_().i() ? 10 : 30;
   }

   @Override
   public int a(czg $$0, id $$1, elb $$2, elb $$3) {
      int $$4 = this.a((czj)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((cym)$$0, $$1) > $$2.a((cym)$$0, $$1) && $$0.E_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(czh $$0, id $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(czg $$0) {
      return $$0.aa().b(czc.V);
   }

   @Override
   protected void a(czh $$0, id $$1, dpi $$2, ij $$3, elb $$4) {
      if ($$3 == ij.a) {
         elb $$5 = $$0.b_($$1);
         if (this.a(avj.b) && $$5.a(avj.a)) {
            if ($$2.b() instanceof dgw) {
               $$0.a($$1, dcj.b.n(), 3);
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
   public Optional<aun> j() {
      return Optional.of(auo.dl);
   }

   public static class a extends ele {
      @Override
      protected void a(dpj.a<ela, elb> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(elb $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(elb $$0) {
         return false;
      }
   }

   public static class b extends ele {
      @Override
      public int d(elb $$0) {
         return 8;
      }

      @Override
      public boolean c(elb $$0) {
         return true;
      }
   }
}
