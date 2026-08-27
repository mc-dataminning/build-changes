import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eew extends eeo {
   @Override
   public eep d() {
      return eer.b;
   }

   @Override
   public eep e() {
      return eer.c;
   }

   @Override
   public cms a() {
      return cna.qw;
   }

   @Override
   public void a(cto $$0, hx $$1, eeq $$2, auu $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, arr.AR, ars.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
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
   protected boolean a(cto $$0) {
      return $$0.Z().b(ctk.U);
   }

   @Override
   protected void a(ctp $$0, hx $$1, djg $$2) {
      dgu $$3 = $$2.t() ? $$0.c_($$1) : null;
      cwp.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(ctr $$0) {
      return 4;
   }

   @Override
   public djg b(eeq $$0) {
      return cwr.G.o().a(dbe.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eep $$0) {
      return $$0 == eer.c || $$0 == eer.b;
   }

   @Override
   public int c(ctr $$0) {
      return 1;
   }

   @Override
   public int a(ctr $$0) {
      return 5;
   }

   @Override
   public boolean a(eeq $$0, csu $$1, hx $$2, eep $$3, ic $$4) {
      return $$4 == ic.a && !$$3.a(asl.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<arq> j() {
      return Optional.of(arr.cK);
   }

   public static class a extends eew {
      @Override
      protected void a(djh.a<eep, eeq> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eeq $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eeq $$0) {
         return false;
      }
   }

   public static class b extends eew {
      @Override
      public int d(eeq $$0) {
         return 8;
      }

      @Override
      public boolean c(eeq $$0) {
         return true;
      }
   }
}
