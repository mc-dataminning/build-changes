import java.util.List;

public class cqu implements diy {
   private static final int a = 1200;
   private int b;

   @Override
   public void a(arq $$0, boolean $$1, boolean $$2) {
      if ($$2 && $$0.O().c(dji.f)) {
         this.b--;
         if (this.b <= 0) {
            this.b = 1200;
            crm $$3 = $$0.k();
            if ($$3 != null) {
               azv $$4 = $$0.A;
               int $$5 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               int $$6 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               iv $$7 = $$3.du().b($$5, 0, $$6);
               int $$8 = 10;
               if ($$0.b($$7.u() - 10, $$7.w() - 10, $$7.u() + 10, $$7.w() + 10)) {
                  if (bye.a(bwr.u, $$0, $$7)) {
                     if ($$0.a($$7, 2)) {
                        this.a($$0, $$7);
                     } else if ($$0.b().a($$7, axn.n).b()) {
                        this.b($$0, $$7);
                     }
                  }
               }
            }
         }
      }
   }

   private void a(arq $$0, iv $$1) {
      int $$2 = 48;
      if ($$0.A().a($$0x -> $$0x.a(cip.n), $$1, 48, cil.b.b) > 4L) {
         List<cjc> $$3 = $$0.a(cjc.class, new fex($$1).c(48.0, 8.0, 48.0));
         if ($$3.size() < 5) {
            this.a($$1, $$0, false);
         }
      }
   }

   private void b(arq $$0, iv $$1) {
      int $$2 = 16;
      List<cjc> $$3 = $$0.a(cjc.class, new fex($$1).c(16.0, 8.0, 16.0));
      if ($$3.isEmpty()) {
         this.a($$1, $$0, true);
      }
   }

   private void a(iv $$0, arq $$1, boolean $$2) {
      cjc $$3 = bwr.u.a($$1, bwq.a);
      if ($$3 != null) {
         $$3.a($$1, $$1.d_($$0), bwq.a, null);
         if ($$2) {
            $$3.gb();
         }

         $$3.a($$0, 0.0F, 0.0F);
         $$1.a_($$3);
      }
   }
}
