import com.mojang.serialization.Codec;

public class dnt extends dnw<dpz> {
   public dnt(Codec<dpz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dpz> $$0) {
      gw $$1 = $$0.e();
      cqp $$2 = $$0.b();
      dpz $$3 = $$0.f();

      for (gw $$4 : gw.a($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
         boolean $$5 = $$4.u() == $$1.u();
         boolean $$6 = $$4.v() == $$1.v();
         boolean $$7 = $$4.w() == $$1.w();
         boolean $$8 = Math.abs($$4.v() - $$1.v()) == 2;
         if ($$5 && $$6 && $$7) {
            gw $$9 = $$4.i();
            this.a($$2, $$9, csw.kF.n());
            $$3.b().ifPresent($$3x -> {
               dcv $$4x = $$2.c_($$9);
               if ($$4x instanceof dej $$5x) {
                  $$5x.a($$3x, $$3.c());
                  $$4x.e();
               }
            });
         } else if ($$6) {
            this.a($$2, $$4, csw.a.n());
         } else if ($$8 && $$5 && $$7) {
            this.a($$2, $$4, csw.F.n());
         } else if (($$5 || $$7) && !$$8) {
            this.a($$2, $$4, csw.F.n());
         } else {
            this.a($$2, $$4, csw.a.n());
         }
      }

      return true;
   }
}
