import com.mojang.serialization.Codec;

public class edg extends eca<eeo> {
   public edg(Codec<eeo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eeo> $$0) {
      boolean $$1 = false;
      ayv $$2 = $$0.d();
      ddq $$3 = $$0.b();
      jd $$4 = $$0.e();
      eeo $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dyv.a.d, $$4.u() + $$6, $$4.w() + $$7);
      jd $$9 = new jd($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dfy.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dta $$11 = $$10 ? dfy.bx.o() : dfy.bw.o();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dta $$12 = $$11.a(dod.d, dtw.a);
               jd $$13 = $$9.c();
               if ($$3.a_($$13).a(dfy.G)) {
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
