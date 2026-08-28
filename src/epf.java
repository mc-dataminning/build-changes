import java.util.Optional;
import javax.annotation.Nullable;

public abstract class epf extends epa {
   public static final float e = 0.44444445F;

   @Override
   public epb d() {
      return epd.d;
   }

   @Override
   public epb e() {
      return epd.e;
   }

   @Override
   public cul a() {
      return cut.qA;
   }

   @Override
   public void a(dcw $$0, jd $$1, epc $$2, ayw $$3) {
      jd $$4 = $$1.d();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(lm.Y, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, avp.nR, avq.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), avp.nP, avq.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(dcw $$0, jd $$1, epc $$2, ayw $$3) {
      if ($$0.ab().b(dcs.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            jd $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dtc $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((dcz)$$0, $$5)) {
                     $$0.b($$5, dfl.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               jd $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.d()) && this.b($$0, $$9)) {
                  $$0.b($$9.d(), dfl.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dcz $$0, jd $$1) {
      for (ji $$2 : ji.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dcz $$0, jd $$1) {
      return $$1.v() >= $$0.I_() && $$1.v() < $$0.am() && !$$0.B($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public lk h() {
      return lm.i;
   }

   @Override
   protected void a(dcx $$0, jd $$1, dtc $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dcz $$0) {
      return $$0.D_().i() ? 4 : 2;
   }

   @Override
   public dtc b(epc $$0) {
      return dga.H.o().a(dko.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(epb $$0) {
      return $$0 == epd.e || $$0 == epd.d;
   }

   @Override
   public int c(dcz $$0) {
      return $$0.D_().i() ? 1 : 2;
   }

   @Override
   public boolean a(epc $$0, dcc $$1, jd $$2, epb $$3, ji $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(awk.a);
   }

   @Override
   public int a(dcz $$0) {
      return $$0.D_().i() ? 10 : 30;
   }

   @Override
   public int a(dcw $$0, jd $$1, epc $$2, epc $$3) {
      int $$4 = this.a((dcz)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((dcc)$$0, $$1) > $$2.a((dcc)$$0, $$1) && $$0.E_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dcx $$0, jd $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(dcw $$0) {
      return $$0.ab().b(dcs.V);
   }

   @Override
   protected void a(dcx $$0, jd $$1, dtc $$2, ji $$3, epc $$4) {
      if ($$3 == ji.a) {
         epc $$5 = $$0.b_($$1);
         if (this.a(awk.b) && $$5.a(awk.a)) {
            if ($$2.b() instanceof dko) {
               $$0.a($$1, dga.b.o(), 3);
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
   public Optional<avo> j() {
      return Optional.of(avp.dl);
   }

   public static class a extends epf {
      @Override
      protected void a(dtd.a<epb, epc> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(epc $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(epc $$0) {
         return false;
      }
   }

   public static class b extends epf {
      @Override
      public int d(epc $$0) {
         return 8;
      }

      @Override
      public boolean c(epc $$0) {
         return true;
      }
   }
}
