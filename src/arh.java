import javax.annotation.Nullable;

public class arh {
   @Nullable
   protected static jj a(arn $$0, int $$1, int $$2) {
      boolean $$3 = $$0.B_().h();
      eat $$4 = $$0.d(kl.a($$1), kl.a($$2));
      int $$5 = $$3 ? $$0.m().g().a($$0) : $$4.a(eel.a.e, $$1 & 15, $$2 & 15);
      if ($$5 < $$0.G_()) {
         return null;
      } else {
         int $$6 = $$4.a(eel.a.b, $$1 & 15, $$2 & 15);
         if ($$6 <= $$5 && $$6 > $$4.a(eel.a.d, $$1 & 15, $$2 & 15)) {
            return null;
         } else {
            jj.a $$7 = new jj.a();

            for (int $$8 = $$5 + 1; $$8 >= $$0.G_(); $$8--) {
               $$7.d($$1, $$8, $$2);
               dym $$9 = $$0.a_($$7);
               if (!$$9.y().c()) {
                  break;
               }

               if (dku.a($$9.g($$0, $$7), jo.b)) {
                  return $$7.d().j();
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public static jj a(arn $$0, dgw $$1) {
      if (ab.a($$1)) {
         return null;
      } else {
         for (int $$2 = $$1.d(); $$2 <= $$1.f(); $$2++) {
            for (int $$3 = $$1.e(); $$3 <= $$1.g(); $$3++) {
               jj $$4 = a($$0, $$2, $$3);
               if ($$4 != null) {
                  return $$4;
               }
            }
         }

         return null;
      }
   }
}
