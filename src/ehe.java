import com.mojang.serialization.Codec;

public class ehe extends efy<eim> {
   public ehe(Codec<eim> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ega<eim> $$0) {
      boolean $$1 = false;
      azh $$2 = $$0.d();
      dhg $$3 = $$0.b();
      ji $$4 = $$0.e();
      eim $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(ecs.a.d, $$4.u() + $$6, $$4.w() + $$7);
      ji $$9 = new ji($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(djo.J)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dwx $$11 = $$10 ? djo.bE.m() : djo.bD.m();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dwx $$12 = $$11.b(drx.d, dxs.a);
               ji $$13 = $$9.d();
               if ($$3.a_($$13).a(djo.J)) {
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
