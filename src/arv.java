import javax.annotation.Nullable;

public class arv {
   @Nullable
   protected static iw a(asb $$0, int $$1, int $$2) {
      boolean $$3 = $$0.F_().h();
      edx $$4 = $$0.d(jz.a($$1), jz.a($$2));
      int $$5 = $$3 ? $$0.m().g().a($$0) : $$4.a(ehp.a.e, $$1 & 15, $$2 & 15);
      if ($$5 < $$0.K_()) {
         return null;
      } else {
         int $$6 = $$4.a(ehp.a.b, $$1 & 15, $$2 & 15);
         if ($$6 <= $$5 && $$6 > $$4.a(ehp.a.d, $$1 & 15, $$2 & 15)) {
            return null;
         } else {
            iw.a $$7 = new iw.a();

            for (int $$8 = $$5 + 1; $$8 >= $$0.K_(); $$8--) {
               $$7.d($$1, $$8, $$2);
               ebq $$9 = $$0.a_($$7);
               if (!$$9.y().c()) {
                  break;
               }

               if (dno.a($$9.g($$0, $$7), jc.b)) {
                  return $$7.d().j();
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public static iw a(asb $$0, djo $$1) {
      if (ac.a($$1)) {
         return null;
      } else {
         for (int $$2 = $$1.d(); $$2 <= $$1.f(); $$2++) {
            for (int $$3 = $$1.e(); $$3 <= $$1.g(); $$3++) {
               iw $$4 = a($$0, $$2, $$3);
               if ($$4 != null) {
                  return $$4;
               }
            }
         }

         return null;
      }
   }
}
