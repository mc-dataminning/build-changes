import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class dtr extends dtz<dvz> {
   private static final ImmutableList<cys> a = ImmutableList.of(cyu.F, cyu.fn, cyu.fo, cyu.fp, cyu.fq, cyu.cv, cyu.ct);
   private static final ie[] b = ie.values();
   private static final double c = 0.9;

   public dtr(Codec<dvz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<dvz> $$0) {
      boolean $$1 = false;
      awp $$2 = $$0.d();
      cwm $$3 = $$0.b();
      dvz $$4 = $$0.f();
      hz $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (hz $$13 : hz.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            hz $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(cvs $$0, hz $$1, dvz $$2) {
      dlj $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (ie $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).i();
            if ($$5 && $$4 != ie.b || !$$5 && $$4 == ie.b) {
               return false;
            }
         }

         return true;
      }
   }
}
