import com.mojang.serialization.Codec;

public class dni extends dnl<dpo> {
   public dni(Codec<dpo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dpo> $$0) {
      gv $$1 = $$0.e();
      cqe $$2 = $$0.b();
      dpo $$3 = $$0.f();

      for (gv $$4 : gv.a($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
         boolean $$5 = $$4.u() == $$1.u();
         boolean $$6 = $$4.v() == $$1.v();
         boolean $$7 = $$4.w() == $$1.w();
         boolean $$8 = Math.abs($$4.v() - $$1.v()) == 2;
         if ($$5 && $$6 && $$7) {
            gv $$9 = $$4.i();
            this.a($$2, $$9, csl.kF.n());
            $$3.b().ifPresent($$3x -> {
               dck $$4x = $$2.c_($$9);
               if ($$4x instanceof ddy $$5x) {
                  $$5x.a($$3x, $$3.c());
                  $$4x.e();
               }
            });
         } else if ($$6) {
            this.a($$2, $$4, csl.a.n());
         } else if ($$8 && $$5 && $$7) {
            this.a($$2, $$4, csl.F.n());
         } else if (($$5 || $$7) && !$$8) {
            this.a($$2, $$4, csl.F.n());
         } else {
            this.a($$2, $$4, csl.a.n());
         }
      }

      return true;
   }
}
