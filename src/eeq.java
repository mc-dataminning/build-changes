import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eeq extends eei {
   @Override
   public eej d() {
      return eel.b;
   }

   @Override
   public eej e() {
      return eel.c;
   }

   @Override
   public cmm a() {
      return cmu.qw;
   }

   @Override
   public void a(cti $$0, hx $$1, eek $$2, aup $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, arm.AR, arn.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(jx.ai, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public jv h() {
      return jx.m;
   }

   @Override
   protected boolean a(cti $$0) {
      return $$0.Z().b(cte.U);
   }

   @Override
   protected void a(ctj $$0, hx $$1, dja $$2) {
      dgo $$3 = $$2.t() ? $$0.c_($$1) : null;
      cwj.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(ctl $$0) {
      return 4;
   }

   @Override
   public dja b(eek $$0) {
      return cwl.G.o().a(day.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eej $$0) {
      return $$0 == eel.c || $$0 == eel.b;
   }

   @Override
   public int c(ctl $$0) {
      return 1;
   }

   @Override
   public int a(ctl $$0) {
      return 5;
   }

   @Override
   public boolean a(eek $$0, cso $$1, hx $$2, eej $$3, ic $$4) {
      return $$4 == ic.a && !$$3.a(asg.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<arl> j() {
      return Optional.of(arm.cK);
   }

   public static class a extends eeq {
      @Override
      protected void a(djb.a<eej, eek> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eek $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eek $$0) {
         return false;
      }
   }

   public static class b extends eeq {
      @Override
      public int d(eek $$0) {
         return 8;
      }

      @Override
      public boolean c(eek $$0) {
         return true;
      }
   }
}
