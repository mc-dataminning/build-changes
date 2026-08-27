import com.mojang.serialization.Codec;

public class dkl extends dko<dmr> {
   public dkl(Codec<dmr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dmr> $$0) {
      gu $$1 = $$0.e();
      cng $$2 = $$0.b();
      dmr $$3 = $$0.f();

      for (gu $$4 : gu.a($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
         boolean $$5 = $$4.u() == $$1.u();
         boolean $$6 = $$4.v() == $$1.v();
         boolean $$7 = $$4.w() == $$1.w();
         boolean $$8 = Math.abs($$4.v() - $$1.v()) == 2;
         if ($$5 && $$6 && $$7) {
            gu $$9 = $$4.i();
            this.a($$2, $$9, cpo.kF.n());
            $$3.b().ifPresent($$3x -> {
               czn $$4x = $$2.c_($$9);
               if ($$4x instanceof dbb $$5x) {
                  $$5x.a($$3x, $$3.c());
                  $$4x.e();
               }
            });
         } else if ($$6) {
            this.a($$2, $$4, cpo.a.n());
         } else if ($$8 && $$5 && $$7) {
            this.a($$2, $$4, cpo.F.n());
         } else if (($$5 || $$7) && !$$8) {
            this.a($$2, $$4, cpo.F.n());
         } else {
            this.a($$2, $$4, cpo.a.n());
         }
      }

      return true;
   }
}
