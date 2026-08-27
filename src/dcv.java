import com.mojang.serialization.MapCodec;

public abstract class dcv extends dco {
   protected dcv(dhm.d $$0) {
      super($$0);
   }

   private static boolean b(dhn $$0, csi $$1, hx $$2) {
      hx $$3 = $$2.c();
      dhn $$4 = $$1.a_($$3);
      if ($$4.a(cvh.dN) && $$4.c(dcn.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = eco.a($$1, $$0, $$2, $$4, $$3, ib.b, $$4.b($$1, $$3));
         return $$5 < $$1.N();
      }
   }

   @Override
   protected abstract MapCodec<? extends dcv> a();

   private static boolean c(dhn $$0, csi $$1, hx $$2) {
      hx $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(arp.a);
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cvh.j.o());
      } else {
         if ($$1.z($$2.c()) >= 9) {
            dhn $$4 = this.o();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               hx $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(cvh.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(cvh.dN))));
               }
            }
         }
      }
   }
}
