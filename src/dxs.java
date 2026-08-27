import com.mojang.serialization.Codec;

public class dxs extends dxv<dzy> {
   public dxs(Codec<dzy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxx<dzy> $$0) {
      ib $$1 = $$0.e();
      czs $$2 = $$0.b();
      dzy $$3 = $$0.f();

      for (ib $$4 : ib.a($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
         boolean $$5 = $$4.u() == $$1.u();
         boolean $$6 = $$4.v() == $$1.v();
         boolean $$7 = $$4.w() == $$1.w();
         boolean $$8 = Math.abs($$4.v() - $$1.v()) == 2;
         if ($$5 && $$6 && $$7) {
            ib $$9 = $$4.i();
            this.a($$2, $$9, dca.kF.n());
            $$3.b().ifPresent($$3x -> {
               dmf $$4x = $$2.c_($$9);
               if ($$4x instanceof dnv $$5x) {
                  $$5x.a($$3x, $$3.c());
                  $$4x.e();
               }
            });
         } else if ($$6) {
            this.a($$2, $$4, dca.a.n());
         } else if ($$8 && $$5 && $$7) {
            this.a($$2, $$4, dca.F.n());
         } else if (($$5 || $$7) && !$$8) {
            this.a($$2, $$4, dca.F.n());
         } else {
            this.a($$2, $$4, dca.a.n());
         }
      }

      return true;
   }
}
