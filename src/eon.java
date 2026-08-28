import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eon extends eof {
   @Override
   public eog d() {
      return eoi.b;
   }

   @Override
   public eog e() {
      return eoi.c;
   }

   @Override
   public ctx a() {
      return cuf.qz;
   }

   @Override
   public void a(dcf $$0, ja $$1, eoh $$2, ayo $$3) {
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
   protected boolean a(dcf $$0) {
      return $$0.ab().b(dcb.U);
   }

   @Override
   protected void a(dcg $$0, ja $$1, dsk $$2) {
      dpp $$3 = $$2.t() ? $$0.c_($$1) : null;
      dfh.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dci $$0) {
      return 4;
   }

   @Override
   public dsk b(eoh $$0) {
      return dfj.G.o().a(djx.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eog $$0) {
      return $$0 == eoi.c || $$0 == eoi.b;
   }

   @Override
   public int c(dci $$0) {
      return 1;
   }

   @Override
   public int a(dci $$0) {
      return 5;
   }

   @Override
   public boolean a(eoh $$0, dbl $$1, ja $$2, eog $$3, jf $$4) {
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

   public static class a extends eon {
      @Override
      protected void a(dsl.a<eog, eoh> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eoh $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eoh $$0) {
         return false;
      }
   }

   public static class b extends eon {
      @Override
      public int d(eoh $$0) {
         return 8;
      }

      @Override
      public boolean c(eoh $$0) {
         return true;
      }
   }
}
