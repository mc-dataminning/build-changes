import javax.annotation.Nullable;

public class arb {
   @Nullable
   protected static je a(arg $$0, int $$1, int $$2) {
      boolean $$3 = $$0.B_().h();
      dwg $$4 = $$0.d(kg.a($$1), kg.a($$2));
      int $$5 = $$3 ? $$0.l().g().a($$0) : $$4.a(dzw.a.e, $$1 & 15, $$2 & 15);
      if ($$5 < $$0.G_()) {
         return null;
      } else {
         int $$6 = $$4.a(dzw.a.b, $$1 & 15, $$2 & 15);
         if ($$6 <= $$5 && $$6 > $$4.a(dzw.a.d, $$1 & 15, $$2 & 15)) {
            return null;
         } else {
            je.a $$7 = new je.a();

            for (int $$8 = $$5 + 1; $$8 >= $$0.G_(); $$8--) {
               $$7.d($$1, $$8, $$2);
               dua $$9 = $$0.a_($$7);
               if (!$$9.y().c()) {
                  break;
               }

               if (dgv.a($$9.g($$0, $$7), jj.b)) {
                  return $$7.d().j();
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public static je a(arg $$0, dcy $$1) {
      if (ab.a($$1)) {
         return null;
      } else {
         for (int $$2 = $$1.d(); $$2 <= $$1.f(); $$2++) {
            for (int $$3 = $$1.e(); $$3 <= $$1.g(); $$3++) {
               je $$4 = a($$0, $$2, $$3);
               if ($$4 != null) {
                  return $$4;
               }
            }
         }

         return null;
      }
   }
}
