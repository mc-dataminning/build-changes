import javax.annotation.Nullable;

public class arm {
   @Nullable
   protected static iv a(ars $$0, int $$1, int $$2) {
      boolean $$3 = $$0.F_().h();
      edl $$4 = $$0.d(jy.a($$1), jy.a($$2));
      int $$5 = $$3 ? $$0.m().g().a($$0) : $$4.a(ehd.a.e, $$1 & 15, $$2 & 15);
      if ($$5 < $$0.K_()) {
         return null;
      } else {
         int $$6 = $$4.a(ehd.a.b, $$1 & 15, $$2 & 15);
         if ($$6 <= $$5 && $$6 > $$4.a(ehd.a.d, $$1 & 15, $$2 & 15)) {
            return null;
         } else {
            iv.a $$7 = new iv.a();

            for (int $$8 = $$5 + 1; $$8 >= $$0.K_(); $$8--) {
               $$7.d($$1, $$8, $$2);
               ebe $$9 = $$0.a_($$7);
               if (!$$9.y().c()) {
                  break;
               }

               if (dnc.a($$9.g($$0, $$7), jb.b)) {
                  return $$7.d().j();
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public static iv a(ars $$0, djc $$1) {
      if (ac.a($$1)) {
         return null;
      } else {
         for (int $$2 = $$1.d(); $$2 <= $$1.f(); $$2++) {
            for (int $$3 = $$1.e(); $$3 <= $$1.g(); $$3++) {
               iv $$4 = a($$0, $$2, $$3);
               if ($$4 != null) {
                  return $$4;
               }
            }
         }

         return null;
      }
   }
}
