import com.mojang.serialization.Codec;

public class eaw extends eaz<edc> {
   public eaw(Codec<edc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebb<edc> $$0) {
      iz $$1 = $$0.e();
      dcu $$2 = $$0.b();
      edc $$3 = $$0.f();

      for (iz $$4 : iz.c($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
         boolean $$5 = $$4.u() == $$1.u();
         boolean $$6 = $$4.v() == $$1.v();
         boolean $$7 = $$4.w() == $$1.w();
         boolean $$8 = Math.abs($$4.v() - $$1.v()) == 2;
         if ($$5 && $$6 && $$7) {
            iz $$9 = $$4.i();
            this.a($$2, $$9, dfc.kF.o());
            $$3.b().ifPresent($$3x -> {
               dpi $$4x = $$2.c_($$9);
               if ($$4x instanceof dqy $$5x) {
                  $$5x.a($$3x, $$3.c());
                  $$4x.e();
               }
            });
         } else if ($$6) {
            this.a($$2, $$4, dfc.a.o());
         } else if ($$8 && $$5 && $$7) {
            this.a($$2, $$4, dfc.F.o());
         } else if (($$5 || $$7) && !$$8) {
            this.a($$2, $$4, dfc.F.o());
         } else {
            this.a($$2, $$4, dfc.a.o());
         }
      }

      return true;
   }
}
