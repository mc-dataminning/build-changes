import java.util.List;

public class cek implements csv {
   private static final int a = 1200;
   private int b;

   @Override
   public int a(amz $$0, boolean $$1, boolean $$2) {
      if ($$2 && $$0.Z().b(cte.e)) {
         this.b--;
         if (this.b > 0) {
            return 0;
         } else {
            this.b = 1200;
            cfb $$3 = $$0.j();
            if ($$3 == null) {
               return 0;
            } else {
               aup $$4 = $$0.z;
               int $$5 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               int $$6 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               hx $$7 = $$3.dm().b($$5, 0, $$6);
               int $$8 = 10;
               if (!$$0.b($$7.u() - 10, $$7.w() - 10, $$7.u() + 10, $$7.w() + 10)) {
                  return 0;
               } else {
                  if (ctt.a(bmz.c.a, $$0, $$7, blt.n)) {
                     if ($$0.a($$7, 2)) {
                        return this.a($$0, $$7);
                     }

                     if ($$0.a().a($$7, asm.m).b()) {
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

   private int a(amz $$0, hx $$1) {
      int $$2 = 48;
      if ($$0.y().a($$0x -> $$0x.a(bxk.n), $$1, 48, bxg.b.b) > 4L) {
         List<bxv> $$3 = $$0.a(bxv.class, new elh($$1).c(48.0, 8.0, 48.0));
         if ($$3.size() < 5) {
            return this.a($$1, $$0);
         }
      }

      return 0;
   }

   private int b(amz $$0, hx $$1) {
      int $$2 = 16;
      List<bxv> $$3 = $$0.a(bxv.class, new elh($$1).c(16.0, 8.0, 16.0));
      return $$3.size() < 1 ? this.a($$1, $$0) : 0;
   }

   private int a(hx $$0, amz $$1) {
      bxv $$2 = blt.n.a((cti)$$1);
      if ($$2 == null) {
         return 0;
      } else {
         $$2.a($$1, $$1.d_($$0), bmj.a, null, null);
         $$2.a($$0, 0.0F, 0.0F);
         $$1.a_($$2);
         return 1;
      }
   }
}
