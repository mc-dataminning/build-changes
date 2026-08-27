import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class dnj extends dnr<dpr> {
   private static final ImmutableList<csq> a = ImmutableList.of(csr.F, csr.fn, csr.fo, csr.fp, csr.fq, csr.cv, csr.ct);
   private static final hc[] b = hc.values();
   private static final double c = 0.9;

   public dnj(Codec<dpr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dpr> $$0) {
      boolean $$1 = false;
      arx $$2 = $$0.d();
      cqk $$3 = $$0.b();
      dpr $$4 = $$0.f();
      gw $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (gw $$13 : gw.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            gw $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(cpr $$0, gw $$1, dpr $$2) {
      dfe $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (hc $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).i();
            if ($$5 && $$4 != hc.b || !$$5 && $$4 == hc.b) {
               return false;
            }
         }

         return true;
      }
   }
}
