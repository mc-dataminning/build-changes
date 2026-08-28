import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eyg extends exy {
   @Override
   public exz d() {
      return eyb.b;
   }

   @Override
   public exz e() {
      return eyb.c;
   }

   @Override
   public dag a() {
      return dao.rp;
   }

   @Override
   public void a(dkj $$0, iw $$1, eya $$2, bai $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awy.Dg, awz.i, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(lz.ao, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lx h() {
      return lz.l;
   }

   @Override
   protected boolean a(asb $$0) {
      return $$0.O().c(dkf.W);
   }

   @Override
   protected void a(dkk $$0, iw $$1, ebq $$2) {
      dyo $$3 = $$2.x() ? $$0.c_($$1) : null;
      dno.a($$2, $$0, $$1, $$3);
   }

   @Override
   protected void a(dkj $$0, iw $$1, bxe $$2, bxx $$3) {
      $$3.a(bxy.d);
   }

   @Override
   public int b(dkm $$0) {
      return 4;
   }

   @Override
   public ebq b(eya $$0) {
      return dnq.J.m().b(dsk.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(exz $$0) {
      return $$0 == eyb.c || $$0 == eyb.b;
   }

   @Override
   public int c(dkm $$0) {
      return 1;
   }

   @Override
   public int a(dkm $$0) {
      return 5;
   }

   @Override
   public boolean a(eya $$0, djn $$1, iw $$2, exz $$3, jc $$4) {
      return $$4 == jc.a && !$$3.a(axs.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awx> j() {
      return Optional.of(awy.dj);
   }

   public static class a extends eyg {
      @Override
      protected void a(ebr.a<exz, eya> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eya $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eya $$0) {
         return false;
      }
   }

   public static class b extends eyg {
      @Override
      public int d(eya $$0) {
         return 8;
      }

      @Override
      public boolean c(eya $$0) {
         return true;
      }
   }
}
