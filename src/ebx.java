import com.mojang.serialization.Codec;

public class ebx extends eca<eej> {
   public ebx(Codec<eej> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eej> $$0) {
      ir $$1 = $$0.e();
      dcv $$2 = $$0.b();
      eej $$3 = $$0.f();

      for (ir $$4 : ir.c($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
         boolean $$5 = $$4.u() == $$1.u();
         boolean $$6 = $$4.v() == $$1.v();
         boolean $$7 = $$4.w() == $$1.w();
         boolean $$8 = Math.abs($$4.v() - $$1.v()) == 2;
         if ($$5 && $$6 && $$7) {
            ir $$9 = $$4.i();
            this.a($$2, $$9, dfe.lD.n());
            $$3.b().ifPresent($$3x -> {
               dqc $$4x = $$2.c_($$9);
               if ($$4x instanceof drx $$5x) {
                  $$5x.a($$3x, $$3.c());
                  $$4x.e();
               }
            });
         } else if ($$6) {
            this.a($$2, $$4, dfe.a.n());
         } else if ($$8 && $$5 && $$7) {
            this.a($$2, $$4, dfe.ak.n());
         } else if (($$5 || $$7) && !$$8) {
            this.a($$2, $$4, dfe.ak.n());
         } else {
            this.a($$2, $$4, dfe.a.n());
         }
      }

      return true;
   }
}
