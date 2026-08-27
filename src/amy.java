import javax.annotation.Nullable;

public class amy {
   @Nullable
   protected static hx a(and $$0, int $$1, int $$2) {
      boolean $$3 = $$0.E_().h();
      dlo $$4 = $$0.d(iz.a($$1), iz.a($$2));
      int $$5 = $$3 ? $$0.l().g().a($$0) : $$4.a(doq.a.e, $$1 & 15, $$2 & 15);
      if ($$5 < $$0.J_()) {
         return null;
      } else {
         int $$6 = $$4.a(doq.a.b, $$1 & 15, $$2 & 15);
         if ($$6 <= $$5 && $$6 > $$4.a(doq.a.d, $$1 & 15, $$2 & 15)) {
            return null;
         } else {
            hx.a $$7 = new hx.a();

            for (int $$8 = $$5 + 1; $$8 >= $$0.J_(); $$8--) {
               $$7.d($$1, $$8, $$2);
               djh $$9 = $$0.a_($$7);
               if (!$$9.u().c()) {
                  break;
               }

               if (cwq.a($$9.k($$0, $$7), ic.b)) {
                  return $$7.c().i();
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public static hx a(and $$0, csw $$1) {
      if (aa.a($$1)) {
         return null;
      } else {
         for (int $$2 = $$1.d(); $$2 <= $$1.f(); $$2++) {
            for (int $$3 = $$1.e(); $$3 <= $$1.g(); $$3++) {
               hx $$4 = a($$0, $$2, $$3);
               if ($$4 != null) {
                  return $$4;
               }
            }
         }

         return null;
      }
   }
}
