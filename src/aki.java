import javax.annotation.Nullable;

public class aki {
   @Nullable
   protected static gw a(akn $$0, int $$1, int $$2) {
      boolean $$3 = $$0.x_().h();
      dhl $$4 = $$0.d(hz.a($$1), hz.a($$2));
      int $$5 = $$3 ? $$0.k().g().a($$0) : $$4.a(dkn.a.e, $$1 & 15, $$2 & 15);
      if ($$5 < $$0.C_()) {
         return null;
      } else {
         int $$6 = $$4.a(dkn.a.b, $$1 & 15, $$2 & 15);
         if ($$6 <= $$5 && $$6 > $$4.a(dkn.a.d, $$1 & 15, $$2 & 15)) {
            return null;
         } else {
            gw.a $$7 = new gw.a();

            for (int $$8 = $$5 + 1; $$8 >= $$0.C_(); $$8--) {
               $$7.d($$1, $$8, $$2);
               dfe $$9 = $$0.a_($$7);
               if (!$$9.u().c()) {
                  break;
               }

               if (csq.a($$9.k($$0, $$7), hc.b)) {
                  return $$7.c().i();
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public static gw a(akn $$0, cox $$1) {
      if (aa.a($$1)) {
         return null;
      } else {
         for (int $$2 = $$1.d(); $$2 <= $$1.f(); $$2++) {
            for (int $$3 = $$1.e(); $$3 <= $$1.g(); $$3++) {
               gw $$4 = a($$0, $$2, $$3);
               if ($$4 != null) {
                  return $$4;
               }
            }
         }

         return null;
      }
   }
}
