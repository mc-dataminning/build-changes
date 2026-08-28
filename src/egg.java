import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class egg extends egp<eip> {
   private static final ImmutableList<dkd> a = ImmutableList.of(dkf.I, dkf.fI, dkf.fJ, dkf.fK, dkf.fL, dkf.cD, dkf.cA);
   private static final jm[] b = jm.values();
   private static final double c = 0.9;

   public egg(Codec<eip> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egr<eip> $$0) {
      boolean $$1 = false;
      bac $$2 = $$0.d();
      dhx $$3 = $$0.b();
      eip $$4 = $$0.f();
      jh $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (jh $$13 : jh.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            jh $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(dha $$0, jh $$1, eip $$2) {
      dxo $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (jm $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).l();
            if ($$5 && $$4 != jm.b || !$$5 && $$4 == jm.b) {
               return false;
            }
         }

         return true;
      }
   }
}
