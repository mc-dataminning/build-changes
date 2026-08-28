import java.util.List;

public class crh implements djl {
   private static final int a = 1200;
   private int b;

   @Override
   public void a(aru $$0, boolean $$1, boolean $$2) {
      if ($$2 && $$0.O().c(djv.f)) {
         this.b--;
         if (this.b <= 0) {
            this.b = 1200;
            crz $$3 = $$0.k();
            if ($$3 != null) {
               azz $$4 = $$0.A;
               int $$5 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               int $$6 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               iw $$7 = $$3.dv().b($$5, 0, $$6);
               int $$8 = 10;
               if ($$0.b($$7.u() - 10, $$7.w() - 10, $$7.u() + 10, $$7.w() + 10)) {
                  if (byr.a(bxe.v, $$0, $$7)) {
                     if ($$0.a($$7, 2)) {
                        this.a($$0, $$7);
                     } else if ($$0.b().a($$7, axr.n).b()) {
                        this.b($$0, $$7);
                     }
                  }
               }
            }
         }
      }
   }

   private void a(aru $$0, iw $$1) {
      int $$2 = 48;
      if ($$0.A().a($$0x -> $$0x.a(cjc.n), $$1, 48, ciy.b.b) > 4L) {
         List<cjp> $$3 = $$0.a(cjp.class, new ffn($$1).c(48.0, 8.0, 48.0));
         if ($$3.size() < 5) {
            this.a($$1, $$0, false);
         }
      }
   }

   private void b(aru $$0, iw $$1) {
      int $$2 = 16;
      List<cjp> $$3 = $$0.a(cjp.class, new ffn($$1).c(16.0, 8.0, 16.0));
      if ($$3.isEmpty()) {
         this.a($$1, $$0, true);
      }
   }

   private void a(iw $$0, aru $$1, boolean $$2) {
      cjp $$3 = bxe.v.a($$1, bxd.a);
      if ($$3 != null) {
         $$3.a($$1, $$1.d_($$0), bxd.a, null);
         if ($$2) {
            $$3.gc();
         }

         $$3.a($$0, 0.0F, 0.0F);
         $$1.a_($$3);
      }
   }
}
