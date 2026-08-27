import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eex extends eep {
   @Override
   public eeq d() {
      return ees.b;
   }

   @Override
   public eeq e() {
      return ees.c;
   }

   @Override
   public cmt a() {
      return cnb.qw;
   }

   @Override
   public void a(ctp $$0, hx $$1, eer $$2, auv $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, ars.AR, art.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
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
   protected boolean a(ctp $$0) {
      return $$0.Z().b(ctl.U);
   }

   @Override
   protected void a(ctq $$0, hx $$1, djh $$2) {
      dgv $$3 = $$2.t() ? $$0.c_($$1) : null;
      cwq.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(cts $$0) {
      return 4;
   }

   @Override
   public djh b(eer $$0) {
      return cws.G.o().a(dbf.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eeq $$0) {
      return $$0 == ees.c || $$0 == ees.b;
   }

   @Override
   public int c(cts $$0) {
      return 1;
   }

   @Override
   public int a(cts $$0) {
      return 5;
   }

   @Override
   public boolean a(eer $$0, csv $$1, hx $$2, eeq $$3, ic $$4) {
      return $$4 == ic.a && !$$3.a(asm.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<arr> j() {
      return Optional.of(ars.cK);
   }

   public static class a extends eex {
      @Override
      protected void a(dji.a<eeq, eer> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eer $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eer $$0) {
         return false;
      }
   }

   public static class b extends eex {
      @Override
      public int d(eer $$0) {
         return 8;
      }

      @Override
      public boolean c(eer $$0) {
         return true;
      }
   }
}
