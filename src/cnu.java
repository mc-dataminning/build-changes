import java.util.List;

public class cnu implements den {
   private static final int a = 1200;
   private int b;

   @Override
   public int a(arn $$0, boolean $$1, boolean $$2) {
      if ($$2 && $$0.ac().b(dex.e)) {
         this.b--;
         if (this.b > 0) {
            return 0;
         } else {
            this.b = 1200;
            com $$3 = $$0.j();
            if ($$3 == null) {
               return 0;
            } else {
               azs $$4 = $$0.A;
               int $$5 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               int $$6 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               jh $$7 = $$3.dx().b($$5, 0, $$6);
               int $$8 = 10;
               if (!$$0.b($$7.u() - 10, $$7.w() - 10, $$7.u() + 10, $$7.w() + 10)) {
                  return 0;
               } else {
                  if (bvw.a(bul.p, $$0, $$7)) {
                     if ($$0.a($$7, 2)) {
                        return this.a($$0, $$7);
                     }

                     if ($$0.a().a($$7, axm.n).b()) {
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

   private int a(arn $$0, jh $$1) {
      int $$2 = 48;
      if ($$0.y().a($$0x -> $$0x.a(cgi.n), $$1, 48, cge.b.b) > 4L) {
         List<cgu> $$3 = $$0.a(cgu.class, new ezi($$1).c(48.0, 8.0, 48.0));
         if ($$3.size() < 5) {
            return this.a($$1, $$0);
         }
      }

      return 0;
   }

   private int b(arn $$0, jh $$1) {
      int $$2 = 16;
      List<cgu> $$3 = $$0.a(cgu.class, new ezi($$1).c(16.0, 8.0, 16.0));
      return $$3.size() < 1 ? this.a($$1, $$0) : 0;
   }

   private int a(jh $$0, arn $$1) {
      cgu $$2 = bul.p.a($$1, buk.a);
      if ($$2 == null) {
         return 0;
      } else {
         $$2.a($$1, $$1.d_($$0), buk.a, null);
         $$2.a($$0, 0.0F, 0.0F);
         $$1.a_($$2);
         return 1;
      }
   }
}
