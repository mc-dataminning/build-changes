import java.util.List;

public class bxx implements clz {
   private static final int a = 1200;
   private int b;

   @Override
   public int a(aif $$0, boolean $$1, boolean $$2) {
      if ($$2 && $$0.X().b(cmi.e)) {
         this.b--;
         if (this.b > 0) {
            return 0;
         } else {
            this.b = 1200;
            byo $$3 = $$0.i();
            if ($$3 == null) {
               return 0;
            } else {
               apf $$4 = $$0.z;
               int $$5 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               int $$6 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               gu $$7 = $$3.di().b($$5, 0, $$6);
               int $$8 = 10;
               if (!$$0.b($$7.u() - 10, $$7.w() - 10, $$7.u() + 10, $$7.w() + 10)) {
                  return 0;
               } else {
                  if (cmx.a(bgu.c.a, $$0, $$7, bfn.m)) {
                     if ($$0.a($$7, 2)) {
                        return this.a($$0, $$7);
                     }

                     if ($$0.a().a($$7, anh.f).b()) {
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

   private int a(aif $$0, gu $$1) {
      int $$2 = 48;
      if ($$0.w().a($$0x -> $$0x.a(brd.n), $$1, 48, bqz.b.b) > 4L) {
         List<bro> $$3 = $$0.a(bro.class, new eed($$1).c(48.0, 8.0, 48.0));
         if ($$3.size() < 5) {
            return this.a($$1, $$0);
         }
      }

      return 0;
   }

   private int b(aif $$0, gu $$1) {
      int $$2 = 16;
      List<bro> $$3 = $$0.a(bro.class, new eed($$1).c(16.0, 8.0, 16.0));
      return $$3.size() < 1 ? this.a($$1, $$0) : 0;
   }

   private int a(gu $$0, aif $$1) {
      bro $$2 = bfn.m.a((cmm)$$1);
      if ($$2 == null) {
         return 0;
      } else {
         $$2.a($$1, $$1.d_($$0), bgd.a, null, null);
         $$2.a($$0, 0.0F, 0.0F);
         $$1.a_($$2);
         return 1;
      }
   }
}
