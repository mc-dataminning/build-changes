import java.util.List;

public class clt implements dbs {
   private static final int a = 1200;
   private int b;

   @Override
   public int a(aqm $$0, boolean $$1, boolean $$2) {
      if ($$2 && $$0.ab().b(dcb.e)) {
         this.b--;
         if (this.b > 0) {
            return 0;
         } else {
            this.b = 1200;
            cmk $$3 = $$0.j();
            if ($$3 == null) {
               return 0;
            } else {
               ayo $$4 = $$0.z;
               int $$5 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               int $$6 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               ja $$7 = $$3.dq().b($$5, 0, $$6);
               int $$8 = 10;
               if (!$$0.b($$7.u() - 10, $$7.w() - 10, $$7.u() + 10, $$7.w() + 10)) {
                  return 0;
               } else {
                  if (btx.a(bsm.p, $$0, $$7)) {
                     if ($$0.a($$7, 2)) {
                        return this.a($$0, $$7);
                     }

                     if ($$0.a().a($$7, awi.n).b()) {
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

   private int a(aqm $$0, ja $$1) {
      int $$2 = 48;
      if ($$0.y().a($$0x -> $$0x.a(cej.n), $$1, 48, cef.b.b) > 4L) {
         List<ceu> $$3 = $$0.a(ceu.class, new ewa($$1).c(48.0, 8.0, 48.0));
         if ($$3.size() < 5) {
            return this.a($$1, $$0);
         }
      }

      return 0;
   }

   private int b(aqm $$0, ja $$1) {
      int $$2 = 16;
      List<ceu> $$3 = $$0.a(ceu.class, new ewa($$1).c(16.0, 8.0, 16.0));
      return $$3.size() < 1 ? this.a($$1, $$0) : 0;
   }

   private int a(ja $$0, aqm $$1) {
      ceu $$2 = bsm.p.a((dcf)$$1);
      if ($$2 == null) {
         return 0;
      } else {
         $$2.a($$1, $$1.d_($$0), btf.a, null);
         $$2.a($$0, 0.0F, 0.0F);
         $$1.a_($$2);
         return 1;
      }
   }
}
