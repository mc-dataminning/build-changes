import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class eka extends ekk<emk> {
   private static final ImmutableList<dnc> a = ImmutableList.of(dne.I, dne.fM, dne.fN, dne.fO, dne.fP, dne.cG, dne.cD);
   private static final jb[] b = jb.values();
   private static final double c = 0.9;

   public eka(Codec<emk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<emk> $$0) {
      boolean $$1 = false;
      azx $$2 = $$0.d();
      dkw $$3 = $$0.b();
      emk $$4 = $$0.f();
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

   private static boolean a(djy $$0, iv $$1, emk $$2) {
      ebe $$3 = $$0.a_($$1);
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
