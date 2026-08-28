import com.mojang.serialization.Codec;

public class ecy extends edc<eff> {
   public ecy(Codec<eff> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ede<eff> $$0) {
      je $$1 = $$0.e();
      dep $$2 = $$0.b();
      eff $$3 = $$0.f();

      for (je $$4 : je.c($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
         boolean $$5 = $$4.u() == $$1.u();
         boolean $$6 = $$4.v() == $$1.v();
         boolean $$7 = $$4.w() == $$1.w();
         boolean $$8 = Math.abs($$4.v() - $$1.v()) == 2;
         if ($$5 && $$6 && $$7) {
            je $$9 = $$4.j();
            this.a($$2, $$9, dgx.kF.o());
            $$3.b().ifPresent($$3x -> {
               if ($$2.c_($$9) instanceof dsw $$5x) {
                  $$5x.a($$3x, $$3.c());
               }
            });
         } else if ($$6) {
            this.a($$2, $$4, dgx.a.o());
         } else if ($$8 && $$5 && $$7) {
            this.a($$2, $$4, dgx.F.o());
         } else if (($$5 || $$7) && !$$8) {
            this.a($$2, $$4, dgx.F.o());
         } else {
            this.a($$2, $$4, dgx.a.o());
         }
      }

      return true;
   }
}
