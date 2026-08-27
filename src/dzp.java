import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class dzp extends dzx<ebx> {
   private static final ImmutableList<ddy> a = ImmutableList.of(dea.F, dea.fn, dea.fo, dea.fp, dea.fq, dea.cv, dea.ct);
   private static final it[] b = it.values();
   private static final double c = 0.9;

   public dzp(Codec<ebx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<ebx> $$0) {
      boolean $$1 = false;
      ayk $$2 = $$0.d();
      dbs $$3 = $$0.b();
      ebx $$4 = $$0.f();
      io $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (io $$13 : io.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            io $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(day $$0, io $$1, ebx $$2) {
      drb $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (it $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).i();
            if ($$5 && $$4 != it.b || !$$5 && $$4 == it.b) {
               return false;
            }
         }

         return true;
      }
   }
}
