import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eop extends eoh {
   @Override
   public eoi d() {
      return eok.b;
   }

   @Override
   public eoi e() {
      return eok.c;
   }

   @Override
   public cty a() {
      return cug.qz;
   }

   @Override
   public void a(dcg $$0, ja $$1, eoj $$2, ayo $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avh.Cb, avi.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(lj.al, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lh h() {
      return lj.l;
   }

   @Override
   protected boolean a(dcg $$0) {
      return $$0.ab().b(dcc.U);
   }

   @Override
   protected void a(dch $$0, ja $$1, dsl $$2) {
      dpq $$3 = $$2.t() ? $$0.c_($$1) : null;
      dfi.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dcj $$0) {
      return 4;
   }

   @Override
   public dsl b(eoj $$0) {
      return dfk.G.o().a(djy.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eoi $$0) {
      return $$0 == eok.c || $$0 == eok.b;
   }

   @Override
   public int c(dcj $$0) {
      return 1;
   }

   @Override
   public int a(dcj $$0) {
      return 5;
   }

   @Override
   public boolean a(eoj $$0, dbm $$1, ja $$2, eoi $$3, jf $$4) {
      return $$4 == jf.a && !$$3.a(awc.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avg> j() {
      return Optional.of(avh.di);
   }

   public static class a extends eop {
      @Override
      protected void a(dsm.a<eoi, eoj> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eoj $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eoj $$0) {
         return false;
      }
   }

   public static class b extends eop {
      @Override
      public int d(eoj $$0) {
         return 8;
      }

      @Override
      public boolean c(eoj $$0) {
         return true;
      }
   }
}
