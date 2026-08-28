import com.mojang.serialization.Codec;

public class eja extends ehr<ekc> {
   public eja(Codec<ekc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ekc> $$0) {
      dio $$1 = $$0.b();
      jj $$2 = $$0.e();
      jj.a $$3 = new jj.a();
      jj.a $$4 = new jj.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(eel.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(jo.a, 1);
            dis $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, dkw.eb.m(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, dkw.ea.m(), 2);
               dym $$11 = $$1.a_($$4);
               if ($$11.b(dsk.c)) {
                  $$1.a($$4, $$11.b(dsk.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
