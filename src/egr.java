import com.mojang.serialization.Codec;

public class egr extends egv<eiy> {
   public egr(Codec<eiy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egx<eiy> $$0) {
      jh $$1 = $$0.e();
      dif $$2 = $$0.b();
      eiy $$3 = $$0.f();

      for (jh $$4 : jh.c($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
         boolean $$5 = $$4.u() == $$1.u();
         boolean $$6 = $$4.v() == $$1.v();
         boolean $$7 = $$4.w() == $$1.w();
         boolean $$8 = Math.abs($$4.v() - $$1.v()) == 2;
         if ($$5 && $$6 && $$7) {
            jh $$9 = $$4.j();
            this.a($$2, $$9, dkn.la.m());
            $$3.b().ifPresent($$3x -> {
               if ($$2.c_($$9) instanceof dwp $$5x) {
                  $$5x.a($$3x, $$3.c());
               }
            });
         } else if ($$6) {
            this.a($$2, $$4, dkn.a.m());
         } else if ($$8 && $$5 && $$7) {
            this.a($$2, $$4, dkn.I.m());
         } else if (($$5 || $$7) && !$$8) {
            this.a($$2, $$4, dkn.I.m());
         } else {
            this.a($$2, $$4, dkn.a.m());
         }
      }

      return true;
   }
}
