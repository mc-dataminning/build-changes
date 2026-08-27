import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eec extends edx {
   public static final float e = 0.44444445F;

   @Override
   public edy d() {
      return eea.d;
   }

   @Override
   public edy e() {
      return eea.e;
   }

   @Override
   public cmc a() {
      return cmk.qx;
   }

   @Override
   public void a(csy $$0, hv $$1, edz $$2, auf $$3) {
      hv $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(jv.V, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, arc.nd, ard.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), arc.nb, ard.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(csy $$0, hv $$1, edz $$2, auf $$3) {
      if ($$0.Y().b(csu.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            hv $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.o($$5)) {
                  return;
               }

               dip $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((ctb)$$0, $$5)) {
                     $$0.b($$5, cvm.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               hv $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.o($$9)) {
                  return;
               }

               if ($$0.t($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), cvm.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(ctb $$0, hv $$1) {
      for (ia $$2 : ia.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(ctb $$0, hv $$1) {
      return $$1.v() >= $$0.J_() && $$1.v() < $$0.ak() && !$$0.A($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public jt h() {
      return jv.j;
   }

   @Override
   protected void a(csz $$0, hv $$1, dip $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(ctb $$0) {
      return $$0.E_().i() ? 4 : 2;
   }

   @Override
   public dip b(edz $$0) {
      return cwb.H.o().a(dao.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(edy $$0) {
      return $$0 == eea.e || $$0 == eea.d;
   }

   @Override
   public int c(ctb $$0) {
      return $$0.E_().i() ? 1 : 2;
   }

   @Override
   public boolean a(edz $$0, cse $$1, hv $$2, edy $$3, ia $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(arw.a);
   }

   @Override
   public int a(ctb $$0) {
      return $$0.E_().i() ? 10 : 30;
   }

   @Override
   public int a(csy $$0, hv $$1, edz $$2, edz $$3) {
      int $$4 = this.a((ctb)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((cse)$$0, $$1) > $$2.a((cse)$$0, $$1) && $$0.F_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(csz $$0, hv $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(csy $$0) {
      return $$0.Y().b(csu.V);
   }

   @Override
   protected void a(csz $$0, hv $$1, dip $$2, ia $$3, edz $$4) {
      if ($$3 == ia.a) {
         edz $$5 = $$0.b_($$1);
         if (this.a(arw.b) && $$5.a(arw.a)) {
            if ($$2.b() instanceof dao) {
               $$0.a($$1, cwb.b.o(), 3);
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
   public Optional<arb> j() {
      return Optional.of(arc.cN);
   }

   public static class a extends eec {
      @Override
      protected void a(diq.a<edy, edz> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(edz $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(edz $$0) {
         return false;
      }
   }

   public static class b extends eec {
      @Override
      public int d(edz $$0) {
         return 8;
      }

      @Override
      public boolean c(edz $$0) {
         return true;
      }
   }
}
