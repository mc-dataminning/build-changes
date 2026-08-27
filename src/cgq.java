import java.util.List;

public class cgq implements cva {
   private static final int a = 1200;
   private int b;

   @Override
   public int a(aov $$0, boolean $$1, boolean $$2) {
      if ($$2 && $$0.Z().b(cvj.e)) {
         this.b--;
         if (this.b > 0) {
            return 0;
         } else {
            this.b = 1200;
            chh $$3 = $$0.j();
            if ($$3 == null) {
               return 0;
            } else {
               awo $$4 = $$0.z;
               int $$5 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               int $$6 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               hz $$7 = $$3.dm().b($$5, 0, $$6);
               int $$8 = 10;
               if (!$$0.b($$7.u() - 10, $$7.w() - 10, $$7.u() + 10, $$7.w() + 10)) {
                  return 0;
               } else {
                  if (cvy.a(boz.c.a, $$0, $$7, bnu.o)) {
                     if ($$0.a($$7, 2)) {
                        return this.a($$0, $$7);
                     }

                     if ($$0.a().a($$7, auk.m).b()) {
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

   private int a(aov $$0, hz $$1) {
      int $$2 = 48;
      if ($$0.y().a($$0x -> $$0x.a(bzl.n), $$1, 48, bzh.b.b) > 4L) {
         List<bzw> $$3 = $$0.a(bzw.class, new enn($$1).c(48.0, 8.0, 48.0));
         if ($$3.size() < 5) {
            return this.a($$1, $$0);
         }
      }

      return 0;
   }

   private int b(aov $$0, hz $$1) {
      int $$2 = 16;
      List<bzw> $$3 = $$0.a(bzw.class, new enn($$1).c(16.0, 8.0, 16.0));
      return $$3.size() < 1 ? this.a($$1, $$0) : 0;
   }

   private int a(hz $$0, aov $$1) {
      bzw $$2 = bnu.o.a((cvn)$$1);
      if ($$2 == null) {
         return 0;
      } else {
         $$2.a($$1, $$1.d_($$0), bok.a, null, null);
         $$2.a($$0, 0.0F, 0.0F);
         $$1.a_($$2);
         return 1;
      }
   }
}
