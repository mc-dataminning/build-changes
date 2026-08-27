import javax.annotation.Nullable;

public class alv {
   @Nullable
   protected static ht a(ama $$0, int $$1, int $$2) {
      boolean $$3 = $$0.D_().h();
      djd $$4 = $$0.d(iu.a($$1), iu.a($$2));
      int $$5 = $$3 ? $$0.k().g().a($$0) : $$4.a(dmf.a.e, $$1 & 15, $$2 & 15);
      if ($$5 < $$0.I_()) {
         return null;
      } else {
         int $$6 = $$4.a(dmf.a.b, $$1 & 15, $$2 & 15);
         if ($$6 <= $$5 && $$6 > $$4.a(dmf.a.d, $$1 & 15, $$2 & 15)) {
            return null;
         } else {
            ht.a $$7 = new ht.a();

            for (int $$8 = $$5 + 1; $$8 >= $$0.I_(); $$8--) {
               $$7.d($$1, $$8, $$2);
               dgw $$9 = $$0.a_($$7);
               if (!$$9.u().c()) {
                  break;
               }

               if (cut.a($$9.k($$0, $$7), hx.b)) {
                  return $$7.c().i();
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public static ht a(ama $$0, cqz $$1) {
      if (aa.a($$1)) {
         return null;
      } else {
         for (int $$2 = $$1.d(); $$2 <= $$1.f(); $$2++) {
            for (int $$3 = $$1.e(); $$3 <= $$1.g(); $$3++) {
               ht $$4 = a($$0, $$2, $$3);
               if ($$4 != null) {
                  return $$4;
               }
            }
         }

         return null;
      }
   }
}
