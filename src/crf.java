import java.util.List;

public class crf implements djj {
   private static final int a = 1200;
   private int b;

   @Override
   public void a(ars $$0, boolean $$1, boolean $$2) {
      if ($$2 && $$0.O().c(djt.f)) {
         this.b--;
         if (this.b <= 0) {
            this.b = 1200;
            crx $$3 = $$0.k();
            if ($$3 != null) {
               azx $$4 = $$0.A;
               int $$5 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               int $$6 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               iv $$7 = $$3.dv().b($$5, 0, $$6);
               int $$8 = 10;
               if ($$0.b($$7.u() - 10, $$7.w() - 10, $$7.u() + 10, $$7.w() + 10)) {
                  if (byp.a(bxc.v, $$0, $$7)) {
                     if ($$0.a($$7, 2)) {
                        this.a($$0, $$7);
                     } else if ($$0.b().a($$7, axp.n).b()) {
                        this.b($$0, $$7);
                     }
                  }
               }
            }
         }
      }
   }

   private void a(ars $$0, iv $$1) {
      int $$2 = 48;
      if ($$0.A().a($$0x -> $$0x.a(cja.n), $$1, 48, ciw.b.b) > 4L) {
         List<cjn> $$3 = $$0.a(cjn.class, new ffl($$1).c(48.0, 8.0, 48.0));
         if ($$3.size() < 5) {
            this.a($$1, $$0, false);
         }
      }
   }

   private void b(ars $$0, iv $$1) {
      int $$2 = 16;
      List<cjn> $$3 = $$0.a(cjn.class, new ffl($$1).c(16.0, 8.0, 16.0));
      if ($$3.isEmpty()) {
         this.a($$1, $$0, true);
      }
   }

   private void a(iv $$0, ars $$1, boolean $$2) {
      cjn $$3 = bxc.v.a($$1, bxb.a);
      if ($$3 != null) {
         $$3.a($$1, $$1.d_($$0), bxb.a, null);
         if ($$2) {
            $$3.gc();
         }

         $$3.a($$0, 0.0F, 0.0F);
         $$1.a_($$3);
      }
   }
}
