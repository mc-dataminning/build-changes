import com.mojang.serialization.Codec;

public class efl extends eef<egt> {
   public efl(Codec<egt> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egt> $$0) {
      boolean $$1 = false;
      azr $$2 = $$0.d();
      dfs $$3 = $$0.b();
      jg $$4 = $$0.e();
      egt $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(eaz.a.d, $$4.u() + $$6, $$4.w() + $$7);
      jg $$9 = new jg($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dia.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dvd $$11 = $$10 ? dia.bx.m() : dia.bw.m();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dvd $$12 = $$11.b(dqe.d, dvz.a);
               jg $$13 = $$9.d();
               if ($$3.a_($$13).a(dia.G)) {
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
