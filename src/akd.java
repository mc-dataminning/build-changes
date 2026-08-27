import javax.annotation.Nullable;

public class akd {
   @Nullable
   protected static gv a(aki $$0, int $$1, int $$2) {
      boolean $$3 = $$0.x_().h();
      dhf $$4 = $$0.d(hy.a($$1), hy.a($$2));
      int $$5 = $$3 ? $$0.k().g().a($$0) : $$4.a(dkh.a.e, $$1 & 15, $$2 & 15);
      if ($$5 < $$0.C_()) {
         return null;
      } else {
         int $$6 = $$4.a(dkh.a.b, $$1 & 15, $$2 & 15);
         if ($$6 <= $$5 && $$6 > $$4.a(dkh.a.d, $$1 & 15, $$2 & 15)) {
            return null;
         } else {
            gv.a $$7 = new gv.a();

            for (int $$8 = $$5 + 1; $$8 >= $$0.C_(); $$8--) {
               $$7.d($$1, $$8, $$2);
               dey $$9 = $$0.a_($$7);
               if (!$$9.u().c()) {
                  break;
               }

               if (csk.a($$9.k($$0, $$7), hb.b)) {
                  return $$7.c().i();
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public static gv a(aki $$0, cor $$1) {
      if (aa.a($$1)) {
         return null;
      } else {
         for (int $$2 = $$1.d(); $$2 <= $$1.f(); $$2++) {
            for (int $$3 = $$1.e(); $$3 <= $$1.g(); $$3++) {
               gv $$4 = a($$0, $$2, $$3);
               if ($$4 != null) {
                  return $$4;
               }
            }
         }

         return null;
      }
   }
}
