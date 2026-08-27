import com.mojang.serialization.MapCodec;

public abstract class djx extends djq {
   protected djx(dph.d $$0) {
      super($$0);
   }

   private static boolean b(dpi $$0, czj $$1, id $$2) {
      id $$3 = $$2.c();
      dpi $$4 = $$1.a_($$3);
      if ($$4.a(dcj.dN) && $$4.c(djp.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = eks.a($$1, $$0, $$2, $$4, $$3, ij.b, $$4.b($$1, $$3));
         return $$5 < $$1.P();
      }
   }

   @Override
   protected abstract MapCodec<? extends djx> a();

   private static boolean c(dpi $$0, czj $$1, id $$2) {
      id $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(avj.a);
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dcj.j.n());
      } else {
         if ($$1.A($$2.c()) >= 9) {
            dpi $$4 = this.n();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               id $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dcj.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(dcj.dN))));
               }
            }
         }
      }
   }
}
