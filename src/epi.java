import java.util.Optional;
import javax.annotation.Nullable;

public abstract class epi extends epa {
   @Override
   public epb d() {
      return epd.b;
   }

   @Override
   public epb e() {
      return epd.c;
   }

   @Override
   public cul a() {
      return cut.qz;
   }

   @Override
   public void a(dcw $$0, jd $$1, epc $$2, ayw $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avp.Cc, avq.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(lm.al, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lk h() {
      return lm.l;
   }

   @Override
   protected boolean a(dcw $$0) {
      return $$0.ab().b(dcs.U);
   }

   @Override
   protected void a(dcx $$0, jd $$1, dtc $$2) {
      dqh $$3 = $$2.t() ? $$0.c_($$1) : null;
      dfy.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dcz $$0) {
      return 4;
   }

   @Override
   public dtc b(epc $$0) {
      return dga.G.o().a(dko.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(epb $$0) {
      return $$0 == epd.c || $$0 == epd.b;
   }

   @Override
   public int c(dcz $$0) {
      return 1;
   }

   @Override
   public int a(dcz $$0) {
      return 5;
   }

   @Override
   public boolean a(epc $$0, dcc $$1, jd $$2, epb $$3, ji $$4) {
      return $$4 == ji.a && !$$3.a(awk.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avo> j() {
      return Optional.of(avp.di);
   }

   public static class a extends epi {
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

   public static class b extends epi {
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
