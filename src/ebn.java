import com.mojang.serialization.Codec;

public class ebn extends ece<eep> {
   public ebn(Codec<eep> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecg<eep> $$0) {
      jd $$1 = $$0.e();
      dds $$2 = $$0.b();
      ayw $$3 = $$0.d();
      if ($$1.v() > $$2.z_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dga.G) && !$$2.a_($$1.e()).a(dga.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (ji $$5 : ji.values()) {
            if ($$5 != ji.a && $$2.a_($$1.a($$5)).a(dga.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dga.mW.o(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  jd $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dtc $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(dga.G) || $$10.a(dga.iC) || $$10.a(dga.dO)) {
                     for (ji $$11 : ji.values()) {
                        dtc $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dga.mW)) {
                           $$2.a($$9, dga.mW.o(), 2);
                           break;
                        }
                     }
                  }
               }
            }

            return true;
         }
      }
   }
}
