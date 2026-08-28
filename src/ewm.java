import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ewm extends ewe {
   @Override
   public ewf d() {
      return ewh.b;
   }

   @Override
   public ewf e() {
      return ewh.c;
   }

   @Override
   public cyu a() {
      return czc.rm;
   }

   @Override
   public void a(div $$0, iu $$1, ewg $$2, azv $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awn.Dd, awo.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(lx.ao, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lv h() {
      return lx.l;
   }

   @Override
   protected boolean a(arq $$0) {
      return $$0.O().c(dir.V);
   }

   @Override
   protected void a(diw $$0, iu $$1, dzz $$2) {
      dwx $$3 = $$2.x() ? $$0.c_($$1) : null;
      dma.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(diy $$0) {
      return 4;
   }

   @Override
   public dzz b(ewg $$0) {
      return dmc.J.m().b(dqv.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ewf $$0) {
      return $$0 == ewh.c || $$0 == ewh.b;
   }

   @Override
   public int c(diy $$0) {
      return 1;
   }

   @Override
   public int a(diy $$0) {
      return 5;
   }

   @Override
   public boolean a(ewg $$0, dib $$1, iu $$2, ewf $$3, ja $$4) {
      return $$4 == ja.a && !$$3.a(axh.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awm> j() {
      return Optional.of(awn.dj);
   }

   public static class a extends ewm {
      @Override
      protected void a(eaa.a<ewf, ewg> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ewg $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ewg $$0) {
         return false;
      }
   }

   public static class b extends ewm {
      @Override
      public int d(ewg $$0) {
         return 8;
      }

      @Override
      public boolean c(ewg $$0) {
         return true;
      }
   }
}
