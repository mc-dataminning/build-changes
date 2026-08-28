import com.mojang.serialization.Codec;

public class ehh extends efy<eij> {
   public ehh(Codec<eij> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ega<eij> $$0) {
      dhg $$1 = $$0.b();
      ji $$2 = $$0.e();
      ji.a $$3 = new ji.a();
      ji.a $$4 = new ji.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(ecs.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(jn.a, 1);
            dhk $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, djo.eb.m(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, djo.ea.m(), 2);
               dwx $$11 = $$1.a_($$4);
               if ($$11.b(drb.c)) {
                  $$1.a($$4, $$11.b(drb.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
