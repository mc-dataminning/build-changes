import com.mojang.serialization.MapCodec;

public abstract class dlp extends dli {
   protected dlp(dra.d $$0) {
      super($$0);
   }

   private static boolean b(drb $$0, dba $$1, io $$2) {
      io $$3 = $$2.c();
      drb $$4 = $$1.a_($$3);
      if ($$4.a(dea.dN) && $$4.c(dlh.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = eml.a($$1, $$0, $$2, $$4, $$3, it.b, $$4.b($$1, $$3));
         return $$5 < $$1.P();
      }
   }

   @Override
   protected abstract MapCodec<? extends dlp> a();

   private static boolean c(drb $$0, dba $$1, io $$2) {
      io $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(awb.a);
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dea.j.n());
      } else {
         if ($$1.A($$2.c()) >= 9) {
            drb $$4 = this.n();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               io $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dea.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(dea.dN))));
               }
            }
         }
      }
   }
}
