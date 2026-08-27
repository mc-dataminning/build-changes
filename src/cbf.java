import java.util.List;

public class cbf implements cpk {
   private static final int a = 1200;
   private int b;

   @Override
   public int a(aks $$0, boolean $$1, boolean $$2) {
      if ($$2 && $$0.X().b(cpt.e)) {
         this.b--;
         if (this.b > 0) {
            return 0;
         } else {
            this.b = 1200;
            cbw $$3 = $$0.i();
            if ($$3 == null) {
               return 0;
            } else {
               ase $$4 = $$0.z;
               int $$5 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               int $$6 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               gw $$7 = $$3.dl().b($$5, 0, $$6);
               int $$8 = 10;
               if (!$$0.b($$7.u() - 10, $$7.w() - 10, $$7.u() + 10, $$7.w() + 10)) {
                  return 0;
               } else {
                  if (cqi.a(bkc.c.a, $$0, $$7, biw.m)) {
                     if ($$0.a($$7, 2)) {
                        return this.a($$0, $$7);
                     }

                     if ($$0.a().a($$7, aqf.m).b()) {
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

   private int a(aks $$0, gw $$1) {
      int $$2 = 48;
      if ($$0.w().a($$0x -> $$0x.a(bul.n), $$1, 48, buh.b.b) > 4L) {
         List<buw> $$3 = $$0.a(buw.class, new ehk($$1).c(48.0, 8.0, 48.0));
         if ($$3.size() < 5) {
            return this.a($$1, $$0);
         }
      }

      return 0;
   }

   private int b(aks $$0, gw $$1) {
      int $$2 = 16;
      List<buw> $$3 = $$0.a(buw.class, new ehk($$1).c(16.0, 8.0, 16.0));
      return $$3.size() < 1 ? this.a($$1, $$0) : 0;
   }

   private int a(gw $$0, aks $$1) {
      buw $$2 = biw.m.a((cpx)$$1);
      if ($$2 == null) {
         return 0;
      } else {
         $$2.a($$1, $$1.d_($$0), bjm.a, null, null);
         $$2.a($$0, 0.0F, 0.0F);
         $$1.a_($$2);
         return 1;
      }
   }
}
