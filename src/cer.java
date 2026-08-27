import java.util.List;

public class cer implements ctc {
   private static final int a = 1200;
   private int b;

   @Override
   public int a(and $$0, boolean $$1, boolean $$2) {
      if ($$2 && $$0.Z().b(ctl.e)) {
         this.b--;
         if (this.b > 0) {
            return 0;
         } else {
            this.b = 1200;
            cfi $$3 = $$0.j();
            if ($$3 == null) {
               return 0;
            } else {
               auv $$4 = $$0.z;
               int $$5 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               int $$6 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               hx $$7 = $$3.dm().b($$5, 0, $$6);
               int $$8 = 10;
               if (!$$0.b($$7.u() - 10, $$7.w() - 10, $$7.u() + 10, $$7.w() + 10)) {
                  return 0;
               } else {
                  if (cua.a(bnf.c.a, $$0, $$7, blz.n)) {
                     if ($$0.a($$7, 2)) {
                        return this.a($$0, $$7);
                     }

                     if ($$0.a().a($$7, ass.m).b()) {
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

   private int a(and $$0, hx $$1) {
      int $$2 = 48;
      if ($$0.y().a($$0x -> $$0x.a(bxq.n), $$1, 48, bxm.b.b) > 4L) {
         List<byb> $$3 = $$0.a(byb.class, new elo($$1).c(48.0, 8.0, 48.0));
         if ($$3.size() < 5) {
            return this.a($$1, $$0);
         }
      }

      return 0;
   }

   private int b(and $$0, hx $$1) {
      int $$2 = 16;
      List<byb> $$3 = $$0.a(byb.class, new elo($$1).c(16.0, 8.0, 16.0));
      return $$3.size() < 1 ? this.a($$1, $$0) : 0;
   }

   private int a(hx $$0, and $$1) {
      byb $$2 = blz.n.a((ctp)$$1);
      if ($$2 == null) {
         return 0;
      } else {
         $$2.a($$1, $$1.d_($$0), bmp.a, null, null);
         $$2.a($$0, 0.0F, 0.0F);
         $$1.a_($$2);
         return 1;
      }
   }
}
