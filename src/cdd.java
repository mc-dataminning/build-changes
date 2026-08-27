import java.util.List;

public class cdd implements crn {
   private static final int a = 1200;
   private int b;

   @Override
   public int a(ame $$0, boolean $$1, boolean $$2) {
      if ($$2 && $$0.Y().b(crw.e)) {
         this.b--;
         if (this.b > 0) {
            return 0;
         } else {
            this.b = 1200;
            cdu $$3 = $$0.i();
            if ($$3 == null) {
               return 0;
            } else {
               ats $$4 = $$0.z;
               int $$5 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               int $$6 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               ht $$7 = $$3.dn().b($$5, 0, $$6);
               int $$8 = 10;
               if (!$$0.b($$7.u() - 10, $$7.w() - 10, $$7.u() + 10, $$7.w() + 10)) {
                  return 0;
               } else {
                  if (csl.a(bma.c.a, $$0, $$7, bku.m)) {
                     if ($$0.a($$7, 2)) {
                        return this.a($$0, $$7);
                     }

                     if ($$0.a().a($$7, arr.m).b()) {
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

   private int a(ame $$0, ht $$1) {
      int $$2 = 48;
      if ($$0.x().a($$0x -> $$0x.a(bwj.n), $$1, 48, bwf.b.b) > 4L) {
         List<bwu> $$3 = $$0.a(bwu.class, new ejp($$1).c(48.0, 8.0, 48.0));
         if ($$3.size() < 5) {
            return this.a($$1, $$0);
         }
      }

      return 0;
   }

   private int b(ame $$0, ht $$1) {
      int $$2 = 16;
      List<bwu> $$3 = $$0.a(bwu.class, new ejp($$1).c(16.0, 8.0, 16.0));
      return $$3.size() < 1 ? this.a($$1, $$0) : 0;
   }

   private int a(ht $$0, ame $$1) {
      bwu $$2 = bku.m.a((csa)$$1);
      if ($$2 == null) {
         return 0;
      } else {
         $$2.a($$1, $$1.d_($$0), blk.a, null, null);
         $$2.a($$0, 0.0F, 0.0F);
         $$1.a_($$2);
         return 1;
      }
   }
}
