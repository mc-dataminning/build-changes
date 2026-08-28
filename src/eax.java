import com.mojang.serialization.Codec;

public class eax extends eba<edd> {
   public eax(Codec<edd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebc<edd> $$0) {
      iz $$1 = $$0.e();
      dcv $$2 = $$0.b();
      edd $$3 = $$0.f();

      for (iz $$4 : iz.c($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
         boolean $$5 = $$4.u() == $$1.u();
         boolean $$6 = $$4.v() == $$1.v();
         boolean $$7 = $$4.w() == $$1.w();
         boolean $$8 = Math.abs($$4.v() - $$1.v()) == 2;
         if ($$5 && $$6 && $$7) {
            iz $$9 = $$4.i();
            this.a($$2, $$9, dfd.kF.o());
            $$3.b().ifPresent($$3x -> {
               dpj $$4x = $$2.c_($$9);
               if ($$4x instanceof dqz $$5x) {
                  $$5x.a($$3x, $$3.c());
                  $$4x.e();
               }
            });
         } else if ($$6) {
            this.a($$2, $$4, dfd.a.o());
         } else if ($$8 && $$5 && $$7) {
            this.a($$2, $$4, dfd.F.o());
         } else if (($$5 || $$7) && !$$8) {
            this.a($$2, $$4, dfd.F.o());
         } else {
            this.a($$2, $$4, dfd.a.o());
         }
      }

      return true;
   }
}
