import com.mojang.serialization.Codec;

public class ejr extends ekk<emg> {
   public ejr(Codec<emg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<emg> $$0) {
      iv $$1 = $$0.e();
      dkw $$2 = $$0.b();
      azx $$3 = $$0.d();
      emg $$4 = $$0.f();
      if ($$1.v() < $$2.K_() + 5) {
         return false;
      } else {
         int $$5 = 2 + $$3.a(2);
         int $$6 = 2 + $$3.a(2);

         for (iv $$7 : iv.c($$1.b(-$$5, 0, -$$6), $$1.b($$5, 1, $$6))) {
            int $$8 = $$1.u() - $$7.u();
            int $$9 = $$1.w() - $$7.w();
            if ((float)($$8 * $$8 + $$9 * $$9) <= $$3.i() * 10.0F - $$3.i() * 6.0F) {
               this.a($$2, $$7, $$3, $$4);
            } else if ((double)$$3.i() < 0.031) {
               this.a($$2, $$7, $$3, $$4);
            }
         }

         return true;
      }
   }

   private boolean a(djy $$0, iv $$1, azx $$2) {
      iv $$3 = $$1.e();
      ebe $$4 = $$0.a_($$3);
      return $$4.a(dne.lk) ? $$2.h() : $$4.c($$0, $$3, jb.b);
   }

   private void a(djy $$0, iv $$1, azx $$2, emg $$3) {
      if ($$0.v($$1) && this.a($$0, $$1, $$2)) {
         $$0.a($$1, $$3.b.a($$2, $$1), 260);
      }
   }
}
