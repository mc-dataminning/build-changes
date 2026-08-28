import com.mojang.serialization.MapCodec;

public abstract class dsg extends drz {
   protected dsg(dxu.d $$0) {
      super($$0);
   }

   private static boolean b(dxv $$0, dhl $$1, jh $$2) {
      jh $$3 = $$2.d();
      dxv $$4 = $$1.a_($$3);
      if ($$4.a(dko.ea) && $$4.c(dry.c) == 1) {
         return true;
      } else if ($$4.y().e() == 8) {
         return false;
      } else {
         int $$5 = eto.a($$0, $$4, jm.b, $$4.g());
         return $$5 < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends dsg> a();

   private static boolean c(dxv $$0, dhl $$1, jh $$2) {
      jh $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(aya.a);
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dko.j.m());
      } else {
         if ($$1.A($$2.d()) >= 9) {
            dxv $$4 = this.m();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               jh $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dko.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.b(c, Boolean.valueOf($$1.a_($$6.d()).a(dko.ea))));
               }
            }
         }
      }
   }
}
