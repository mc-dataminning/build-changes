import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class ejp extends ejy<ely> {
   private static final ImmutableList<dmr> a = ImmutableList.of(dmt.I, dmt.fM, dmt.fN, dmt.fO, dmt.fP, dmt.cG, dmt.cD);
   private static final jb[] b = jb.values();
   private static final double c = 0.9;

   public ejp(Codec<ely> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eka<ely> $$0) {
      boolean $$1 = false;
      azv $$2 = $$0.d();
      dkl $$3 = $$0.b();
      ely $$4 = $$0.f();
      iv $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (iv $$13 : iv.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            iv $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(djn $$0, iv $$1, ely $$2) {
      eat $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (jb $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).l();
            if ($$5 && $$4 != jb.b || !$$5 && $$4 == jb.b) {
               return false;
            }
         }

         return true;
      }
   }
}
