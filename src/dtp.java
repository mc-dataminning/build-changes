import com.mojang.serialization.Codec;

public class dtp extends dts<dvv> {
   public dtp(Codec<dvv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtu<dvv> $$0) {
      hz $$1 = $$0.e();
      cwi $$2 = $$0.b();
      dvv $$3 = $$0.f();

      for (hz $$4 : hz.a($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
         boolean $$5 = $$4.u() == $$1.u();
         boolean $$6 = $$4.v() == $$1.v();
         boolean $$7 = $$4.w() == $$1.w();
         boolean $$8 = Math.abs($$4.v() - $$1.v()) == 2;
         if ($$5 && $$6 && $$7) {
            hz $$9 = $$4.i();
            this.a($$2, $$9, cyq.kF.o());
            $$3.b().ifPresent($$3x -> {
               dit $$4x = $$2.c_($$9);
               if ($$4x instanceof dki $$5x) {
                  $$5x.a($$3x, $$3.c());
                  $$4x.e();
               }
            });
         } else if ($$6) {
            this.a($$2, $$4, cyq.a.o());
         } else if ($$8 && $$5 && $$7) {
            this.a($$2, $$4, cyq.F.o());
         } else if (($$5 || $$7) && !$$8) {
            this.a($$2, $$4, cyq.F.o());
         } else {
            this.a($$2, $$4, cyq.a.o());
         }
      }

      return true;
   }
}
