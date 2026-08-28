import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eoh extends enz {
   @Override
   public eoa d() {
      return eoc.b;
   }

   @Override
   public eoa e() {
      return eoc.c;
   }

   @Override
   public ctv a() {
      return cud.qz;
   }

   @Override
   public void a(dcd $$0, ja $$1, eob $$2, aym $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avf.Cb, avg.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
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
   protected boolean a(dcd $$0) {
      return $$0.ab().b(dbz.U);
   }

   @Override
   protected void a(dce $$0, ja $$1, dsh $$2) {
      dpn $$3 = $$2.t() ? $$0.c_($$1) : null;
      dff.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dcg $$0) {
      return 4;
   }

   @Override
   public dsh b(eob $$0) {
      return dfh.G.o().a(djv.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eoa $$0) {
      return $$0 == eoc.c || $$0 == eoc.b;
   }

   @Override
   public int c(dcg $$0) {
      return 1;
   }

   @Override
   public int a(dcg $$0) {
      return 5;
   }

   @Override
   public boolean a(eob $$0, dbj $$1, ja $$2, eoa $$3, jf $$4) {
      return $$4 == jf.a && !$$3.a(awa.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<ave> j() {
      return Optional.of(avf.di);
   }

   public static class a extends eoh {
      @Override
      protected void a(dsi.a<eoa, eob> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eob $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eob $$0) {
         return false;
      }
   }

   public static class b extends eoh {
      @Override
      public int d(eob $$0) {
         return 8;
      }

      @Override
      public boolean c(eob $$0) {
         return true;
      }
   }
}
