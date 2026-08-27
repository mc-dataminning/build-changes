import com.mojang.serialization.Codec;

public class dox extends dnr<dqf> {
   public dox(Codec<dqf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dqf> $$0) {
      boolean $$1 = false;
      arx $$2 = $$0.d();
      cqk $$3 = $$0.b();
      gw $$4 = $$0.e();
      dqf $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dkn.a.d, $$4.u() + $$6, $$4.w() + $$7);
      gw $$9 = new gw($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(csr.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dfe $$11 = $$10 ? csr.bx.n() : csr.bw.n();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dfe $$12 = $$11.a(dax.b, dga.a);
               gw $$13 = $$9.c();
               if ($$3.a_($$13).a(csr.G)) {
                  $$3.a($$9, $$11, 2);
                  $$3.a($$13, $$12, 2);
               }
            } else {
               $$3.a($$9, $$11, 2);
            }

            $$1 = true;
         }
      }

      return $$1;
   }
}
