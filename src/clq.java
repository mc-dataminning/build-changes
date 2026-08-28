import java.util.List;

public class clq implements dbq {
   private static final int a = 1200;
   private int b;

   @Override
   public int a(aqk $$0, boolean $$1, boolean $$2) {
      if ($$2 && $$0.ab().b(dbz.e)) {
         this.b--;
         if (this.b > 0) {
            return 0;
         } else {
            this.b = 1200;
            cmh $$3 = $$0.j();
            if ($$3 == null) {
               return 0;
            } else {
               aym $$4 = $$0.z;
               int $$5 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               int $$6 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               ja $$7 = $$3.dp().b($$5, 0, $$6);
               int $$8 = 10;
               if (!$$0.b($$7.u() - 10, $$7.w() - 10, $$7.u() + 10, $$7.w() + 10)) {
                  return 0;
               } else {
                  if (btu.a(bsj.p, $$0, $$7)) {
                     if ($$0.a($$7, 2)) {
                        return this.a($$0, $$7);
                     }

                     if ($$0.a().a($$7, awg.n).b()) {
                        return this.b($$0, $$7);
                     }
                  }

                  return 0;
               }
            }
         }
      } else {
         return 0;
      }
   }

   private int a(aqk $$0, ja $$1) {
      int $$2 = 48;
      if ($$0.y().a($$0x -> $$0x.a(ceg.n), $$1, 48, cec.b.b) > 4L) {
         List<cer> $$3 = $$0.a(cer.class, new evu($$1).c(48.0, 8.0, 48.0));
         if ($$3.size() < 5) {
            return this.a($$1, $$0);
         }
      }

      return 0;
   }

   private int b(aqk $$0, ja $$1) {
      int $$2 = 16;
      List<cer> $$3 = $$0.a(cer.class, new evu($$1).c(16.0, 8.0, 16.0));
      return $$3.size() < 1 ? this.a($$1, $$0) : 0;
   }

   private int a(ja $$0, aqk $$1) {
      cer $$2 = bsj.p.a((dcd)$$1);
      if ($$2 == null) {
         return 0;
      } else {
         $$2.a($$1, $$1.d_($$0), btc.a, null);
         $$2.a($$0, 0.0F, 0.0F);
         $$1.a_($$2);
         return 1;
      }
   }
}
