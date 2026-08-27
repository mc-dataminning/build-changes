import com.mojang.serialization.Codec;

public class dno extends dnr<dpu> {
   public dno(Codec<dpu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dpu> $$0) {
      gw $$1 = $$0.e();
      cqk $$2 = $$0.b();
      dpu $$3 = $$0.f();

      for (gw $$4 : gw.a($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
         boolean $$5 = $$4.u() == $$1.u();
         boolean $$6 = $$4.v() == $$1.v();
         boolean $$7 = $$4.w() == $$1.w();
         boolean $$8 = Math.abs($$4.v() - $$1.v()) == 2;
         if ($$5 && $$6 && $$7) {
            gw $$9 = $$4.i();
            this.a($$2, $$9, csr.kF.n());
            $$3.b().ifPresent($$3x -> {
               dcq $$4x = $$2.c_($$9);
               if ($$4x instanceof dee $$5x) {
                  $$5x.a($$3x, $$3.c());
                  $$4x.e();
               }
            });
         } else if ($$6) {
            this.a($$2, $$4, csr.a.n());
         } else if ($$8 && $$5 && $$7) {
            this.a($$2, $$4, csr.F.n());
         } else if (($$5 || $$7) && !$$8) {
            this.a($$2, $$4, csr.F.n());
         } else {
            this.a($$2, $$4, csr.a.n());
         }
      }

      return true;
   }
}
