import java.util.List;

public class cav implements coy {
   private static final int a = 1200;
   private int b;

   @Override
   public int a(akk $$0, boolean $$1, boolean $$2) {
      if ($$2 && $$0.X().b(cph.e)) {
         this.b--;
         if (this.b > 0) {
            return 0;
         } else {
            this.b = 1200;
            cbm $$3 = $$0.i();
            if ($$3 == null) {
               return 0;
            } else {
               aru $$4 = $$0.z;
               int $$5 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               int $$6 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               gu $$7 = $$3.dk().b($$5, 0, $$6);
               int $$8 = 10;
               if (!$$0.b($$7.u() - 10, $$7.w() - 10, $$7.u() + 10, $$7.w() + 10)) {
                  return 0;
               } else {
                  if (cpw.a(bjs.c.a, $$0, $$7, bim.m)) {
                     if ($$0.a($$7, 2)) {
                        return this.a($$0, $$7);
                     }

                     if ($$0.a().a($$7, apw.f).b()) {
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

   private int a(akk $$0, gu $$1) {
      int $$2 = 48;
      if ($$0.w().a($$0x -> $$0x.a(bub.n), $$1, 48, btx.b.b) > 4L) {
         List<bum> $$3 = $$0.a(bum.class, new egy($$1).c(48.0, 8.0, 48.0));
         if ($$3.size() < 5) {
            return this.a($$1, $$0);
         }
      }

      return 0;
   }

   private int b(akk $$0, gu $$1) {
      int $$2 = 16;
      List<bum> $$3 = $$0.a(bum.class, new egy($$1).c(16.0, 8.0, 16.0));
      return $$3.size() < 1 ? this.a($$1, $$0) : 0;
   }

   private int a(gu $$0, akk $$1) {
      bum $$2 = bim.m.a((cpl)$$1);
      if ($$2 == null) {
         return 0;
      } else {
         $$2.a($$1, $$1.d_($$0), bjc.a, null, null);
         $$2.a($$0, 0.0F, 0.0F);
         $$1.a_($$2);
         return 1;
      }
   }
}
