import com.mojang.serialization.MapCodec;

public abstract class deo extends deh {
   protected deo(djo.d $$0) {
      super($$0);
   }

   private static boolean b(djp $$0, cua $$1, hx $$2) {
      hx $$3 = $$2.c();
      djp $$4 = $$1.a_($$3);
      if ($$4.a(cxa.dN) && $$4.c(deg.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = eeq.a($$1, $$0, $$2, $$4, $$3, ic.b, $$4.b($$1, $$3));
         return $$5 < $$1.O();
      }
   }

   @Override
   protected abstract MapCodec<? extends deo> a();

   private static boolean c(djp $$0, cua $$1, hx $$2) {
      hx $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(asn.a);
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cxa.j.o());
      } else {
         if ($$1.A($$2.c()) >= 9) {
            djp $$4 = this.o();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               hx $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(cxa.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(cxa.dN))));
               }
            }
         }
      }
   }
}
