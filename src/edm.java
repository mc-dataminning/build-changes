import com.mojang.serialization.Codec;

public class edm extends ecd<eeo> {
   public edm(Codec<eeo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecf<eeo> $$0) {
      dds $$1 = $$0.b();
      jd $$2 = $$0.e();
      jd.a $$3 = new jd.a();
      jd.a $$4 = new jd.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dyy.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(ji.a, 1);
            ddw $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, dga.dO.o(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, dga.dN.o(), 2);
               dtc $$11 = $$1.a_($$4);
               if ($$11.b(dnj.c)) {
                  $$1.a($$4, $$11.a(dnj.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
