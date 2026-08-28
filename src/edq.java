import com.mojang.serialization.Codec;

public class edq extends edu<efx> {
   public edq(Codec<efx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<efx> $$0) {
      jf $$1 = $$0.e();
      dfg $$2 = $$0.b();
      efx $$3 = $$0.f();

      for (jf $$4 : jf.c($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
         boolean $$5 = $$4.u() == $$1.u();
         boolean $$6 = $$4.v() == $$1.v();
         boolean $$7 = $$4.w() == $$1.w();
         boolean $$8 = Math.abs($$4.v() - $$1.v()) == 2;
         if ($$5 && $$6 && $$7) {
            jf $$9 = $$4.j();
            this.a($$2, $$9, dho.kF.n());
            $$3.b().ifPresent($$3x -> {
               if ($$2.c_($$9) instanceof dtn $$5x) {
                  $$5x.a($$3x, $$3.c());
               }
            });
         } else if ($$6) {
            this.a($$2, $$4, dho.a.n());
         } else if ($$8 && $$5 && $$7) {
            this.a($$2, $$4, dho.F.n());
         } else if (($$5 || $$7) && !$$8) {
            this.a($$2, $$4, dho.F.n());
         } else {
            this.a($$2, $$4, dho.a.n());
         }
      }

      return true;
   }
}
