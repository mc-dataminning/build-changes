import com.mojang.serialization.MapCodec;

public abstract class dge extends dfx {
   protected dge(dle.d $$0) {
      super($$0);
   }

   private static boolean b(dlf $$0, cvq $$1, hz $$2) {
      hz $$3 = $$2.c();
      dlf $$4 = $$1.a_($$3);
      if ($$4.a(cyq.dN) && $$4.c(dfw.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = egg.a($$1, $$0, $$2, $$4, $$3, ie.b, $$4.b($$1, $$3));
         return $$5 < $$1.O();
      }
   }

   @Override
   protected abstract MapCodec<? extends dge> a();

   private static boolean c(dlf $$0, cvq $$1, hz $$2) {
      hz $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(aue.a);
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cyq.j.o());
      } else {
         if ($$1.A($$2.c()) >= 9) {
            dlf $$4 = this.o();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               hz $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(cyq.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(cyq.dN))));
               }
            }
         }
      }
   }
}
