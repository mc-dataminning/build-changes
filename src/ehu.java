import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ehu extends ehp {
   public static final float e = 0.44444445F;

   @Override
   public ehq d() {
      return ehs.d;
   }

   @Override
   public ehq e() {
      return ehs.e;
   }

   @Override
   public cpl a() {
      return cpt.qz;
   }

   @Override
   public void a(cwe $$0, ib $$1, ehr $$2, awt $$3) {
      ib $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(kb.V, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, atp.nt, atq.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), atp.nr, atq.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(cwe $$0, ib $$1, ehr $$2, awt $$3) {
      if ($$0.Z().b(cwa.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            ib $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dme $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((cwh)$$0, $$5)) {
                     $$0.b($$5, cys.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               ib $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), cys.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(cwh $$0, ib $$1) {
      for (ih $$2 : ih.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(cwh $$0, ib $$1) {
      return $$1.v() >= $$0.J_() && $$1.v() < $$0.ak() && !$$0.B($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public jz h() {
      return kb.j;
   }

   @Override
   protected void a(cwf $$0, ib $$1, dme $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(cwh $$0) {
      return $$0.E_().i() ? 4 : 2;
   }

   @Override
   public dme b(ehr $$0) {
      return czh.H.o().a(ddu.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ehq $$0) {
      return $$0 == ehs.e || $$0 == ehs.d;
   }

   @Override
   public int c(cwh $$0) {
      return $$0.E_().i() ? 1 : 2;
   }

   @Override
   public boolean a(ehr $$0, cvk $$1, ib $$2, ehq $$3, ih $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(auj.a);
   }

   @Override
   public int a(cwh $$0) {
      return $$0.E_().i() ? 10 : 30;
   }

   @Override
   public int a(cwe $$0, ib $$1, ehr $$2, ehr $$3) {
      int $$4 = this.a((cwh)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((cvk)$$0, $$1) > $$2.a((cvk)$$0, $$1) && $$0.F_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(cwf $$0, ib $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(cwe $$0) {
      return $$0.Z().b(cwa.V);
   }

   @Override
   protected void a(cwf $$0, ib $$1, dme $$2, ih $$3, ehr $$4) {
      if ($$3 == ih.a) {
         ehr $$5 = $$0.b_($$1);
         if (this.a(auj.b) && $$5.a(auj.a)) {
            if ($$2.b() instanceof ddu) {
               $$0.a($$1, czh.b.o(), 3);
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
   public Optional<ato> j() {
      return Optional.of(atp.dd);
   }

   public static class a extends ehu {
      @Override
      protected void a(dmf.a<ehq, ehr> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ehr $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ehr $$0) {
         return false;
      }
   }

   public static class b extends ehu {
      @Override
      public int d(ehr $$0) {
         return 8;
      }

      @Override
      public boolean c(ehr $$0) {
         return true;
      }
   }
}
