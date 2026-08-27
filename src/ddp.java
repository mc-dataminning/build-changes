import com.mojang.serialization.MapCodec;

public abstract class ddp extends ddi {
   protected ddp(dio.d $$0) {
      super($$0);
   }

   private static boolean b(dip $$0, ctb $$1, hv $$2) {
      hv $$3 = $$2.c();
      dip $$4 = $$1.a_($$3);
      if ($$4.a(cwb.dN) && $$4.c(ddh.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = edq.a($$1, $$0, $$2, $$4, $$3, ia.b, $$4.b($$1, $$3));
         return $$5 < $$1.N();
      }
   }

   @Override
   protected abstract MapCodec<? extends ddp> a();

   private static boolean c(dip $$0, ctb $$1, hv $$2) {
      hv $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(arw.a);
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cwb.j.o());
      } else {
         if ($$1.z($$2.c()) >= 9) {
            dip $$4 = this.o();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               hv $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(cwb.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(cwb.dN))));
               }
            }
         }
      }
   }
}
