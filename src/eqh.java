import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eqh extends epz {
   @Override
   public eqa d() {
      return eqc.b;
   }

   @Override
   public eqa e() {
      return eqc.c;
   }

   @Override
   public cvg a() {
      return cvo.qA;
   }

   @Override
   public void a(dds $$0, je $$1, eqb $$2, azk $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awd.Ci, awe.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(ln.al, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public ll h() {
      return ln.l;
   }

   @Override
   protected boolean a(dds $$0) {
      return $$0.ac().b(ddo.U);
   }

   @Override
   protected void a(ddt $$0, je $$1, dua $$2) {
      dre $$3 = $$2.x() ? $$0.c_($$1) : null;
      dgv.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(ddv $$0) {
      return 4;
   }

   @Override
   public dua b(eqb $$0) {
      return dgx.G.o().b(dll.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eqa $$0) {
      return $$0 == eqc.c || $$0 == eqc.b;
   }

   @Override
   public int c(ddv $$0) {
      return 1;
   }

   @Override
   public int a(ddv $$0) {
      return 5;
   }

   @Override
   public boolean a(eqb $$0, dcx $$1, je $$2, eqa $$3, jj $$4) {
      return $$4 == jj.a && !$$3.a(awy.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awc> j() {
      return Optional.of(awd.di);
   }

   public static class a extends eqh {
      @Override
      protected void a(dub.a<eqa, eqb> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eqb $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eqb $$0) {
         return false;
      }
   }

   public static class b extends eqh {
      @Override
      public int d(eqb $$0) {
         return 8;
      }

      @Override
      public boolean c(eqb $$0) {
         return true;
      }
   }
}
