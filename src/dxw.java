import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class dxw extends dye<eae> {
   private static final ImmutableList<dch> a = ImmutableList.of(dcj.F, dcj.fn, dcj.fo, dcj.fp, dcj.fq, dcj.cv, dcj.ct);
   private static final ij[] b = ij.values();
   private static final double c = 0.9;

   public dxw(Codec<eae> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyg<eae> $$0) {
      boolean $$1 = false;
      axt $$2 = $$0.d();
      dab $$3 = $$0.b();
      eae $$4 = $$0.f();
      id $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (id $$13 : id.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            id $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(czh $$0, id $$1, eae $$2) {
      dpi $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (ij $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).i();
            if ($$5 && $$4 != ij.b || !$$5 && $$4 == ij.b) {
               return false;
            }
         }

         return true;
      }
   }
}
