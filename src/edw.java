import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class edw extends eef<egf> {
   private static final ImmutableList<dhy> a = ImmutableList.of(dia.F, dia.fn, dia.fo, dia.fp, dia.fq, dia.cv, dia.ct);
   private static final jl[] b = jl.values();
   private static final double c = 0.9;

   public edw(Codec<egf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egf> $$0) {
      boolean $$1 = false;
      azr $$2 = $$0.d();
      dfs $$3 = $$0.b();
      egf $$4 = $$0.f();
      jg $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (jg $$13 : jg.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            jg $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(dew $$0, jg $$1, egf $$2) {
      dvd $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (jl $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).l();
            if ($$5 && $$4 != jl.b || !$$5 && $$4 == jl.b) {
               return false;
            }
         }

         return true;
      }
   }
}
