import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class dum extends duu<dwu> {
   private static final ImmutableList<czf> a = ImmutableList.of(czh.F, czh.fn, czh.fo, czh.fp, czh.fq, czh.cv, czh.ct);
   private static final ih[] b = ih.values();
   private static final double c = 0.9;

   public dum(Codec<dwu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(duw<dwu> $$0) {
      boolean $$1 = false;
      awt $$2 = $$0.d();
      cwz $$3 = $$0.b();
      dwu $$4 = $$0.f();
      ib $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (ib $$13 : ib.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            ib $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(cwf $$0, ib $$1, dwu $$2) {
      dme $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (ih $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).i();
            if ($$5 && $$4 != ih.b || !$$5 && $$4 == ih.b) {
               return false;
            }
         }

         return true;
      }
   }
}
