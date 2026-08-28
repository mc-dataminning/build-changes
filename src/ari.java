import javax.annotation.Nullable;

public class ari {
   @Nullable
   protected static jh a(arn $$0, int $$1, int $$2) {
      boolean $$3 = $$0.D_().h();
      dxp $$4 = $$0.d(kj.a($$1), kj.a($$2));
      int $$5 = $$3 ? $$0.l().g().a($$0) : $$4.a(ebf.a.e, $$1 & 15, $$2 & 15);
      if ($$5 < $$0.I_()) {
         return null;
      } else {
         int $$6 = $$4.a(ebf.a.b, $$1 & 15, $$2 & 15);
         if ($$6 <= $$5 && $$6 > $$4.a(ebf.a.d, $$1 & 15, $$2 & 15)) {
            return null;
         } else {
            jh.a $$7 = new jh.a();

            for (int $$8 = $$5 + 1; $$8 >= $$0.I_(); $$8--) {
               $$7.d($$1, $$8, $$2);
               dvj $$9 = $$0.a_($$7);
               if (!$$9.y().c()) {
                  break;
               }

               if (die.a($$9.g($$0, $$7), jm.b)) {
                  return $$7.d().j();
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public static jh a(arn $$0, deh $$1) {
      if (ab.a($$1)) {
         return null;
      } else {
         for (int $$2 = $$1.d(); $$2 <= $$1.f(); $$2++) {
            for (int $$3 = $$1.e(); $$3 <= $$1.g(); $$3++) {
               jh $$4 = a($$0, $$2, $$3);
               if ($$4 != null) {
                  return $$4;
               }
            }
         }

         return null;
      }
   }
}
