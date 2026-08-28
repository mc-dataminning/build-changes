import com.mojang.serialization.Codec;

public class eaq extends eat<ecw> {
   public eaq(Codec<ecw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eav<ecw> $$0) {
      iz $$1 = $$0.e();
      dco $$2 = $$0.b();
      ecw $$3 = $$0.f();

      for (iz $$4 : iz.c($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
         boolean $$5 = $$4.u() == $$1.u();
         boolean $$6 = $$4.v() == $$1.v();
         boolean $$7 = $$4.w() == $$1.w();
         boolean $$8 = Math.abs($$4.v() - $$1.v()) == 2;
         if ($$5 && $$6 && $$7) {
            iz $$9 = $$4.i();
            this.a($$2, $$9, dew.kF.n());
            $$3.b().ifPresent($$3x -> {
               dpc $$4x = $$2.c_($$9);
               if ($$4x instanceof dqs $$5x) {
                  $$5x.a($$3x, $$3.c());
                  $$4x.e();
               }
            });
         } else if ($$6) {
            this.a($$2, $$4, dew.a.n());
         } else if ($$8 && $$5 && $$7) {
            this.a($$2, $$4, dew.F.n());
         } else if (($$5 || $$7) && !$$8) {
            this.a($$2, $$4, dew.F.n());
         } else {
            this.a($$2, $$4, dew.a.n());
         }
      }

      return true;
   }
}
