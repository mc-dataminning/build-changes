import java.util.Optional;
import javax.annotation.Nullable;

public abstract class euz extends eur {
   @Override
   public eus d() {
      return euu.b;
   }

   @Override
   public eus e() {
      return euu.c;
   }

   @Override
   public cxu a() {
      return cyc.rk;
   }

   @Override
   public void a(dhp $$0, jj $$1, eut $$2, azs $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awk.Da, awl.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(lv.ao, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lt h() {
      return lv.l;
   }

   @Override
   protected boolean a(arn $$0) {
      return $$0.O().c(dhl.V);
   }

   @Override
   protected void a(dhq $$0, jj $$1, dym $$2) {
      dvl $$3 = $$2.x() ? $$0.c_($$1) : null;
      dku.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dhs $$0) {
      return 4;
   }

   @Override
   public dym b(eut $$0) {
      return dkw.J.m().b(dpo.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eus $$0) {
      return $$0 == euu.c || $$0 == euu.b;
   }

   @Override
   public int c(dhs $$0) {
      return 1;
   }

   @Override
   public int a(dhs $$0) {
      return 5;
   }

   @Override
   public boolean a(eut $$0, dgv $$1, jj $$2, eus $$3, jo $$4) {
      return $$4 == jo.a && !$$3.a(axf.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awj> j() {
      return Optional.of(awk.dj);
   }

   public static class a extends euz {
      @Override
      protected void a(dyn.a<eus, eut> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eut $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eut $$0) {
         return false;
      }
   }

   public static class b extends euz {
      @Override
      public int d(eut $$0) {
         return 8;
      }

      @Override
      public boolean c(eut $$0) {
         return true;
      }
   }
}
