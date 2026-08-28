public class daf extends czk {
   public daf(czh $$0) {
      super($$0);
   }

   public boolean a(czi $$0, dds $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvl $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (dgv.a($$5.h()) instanceof dnv) {
               $$2++;
            } else {
               if (!($$5.h() instanceof cuf)) {
                  return false;
               }

               $$3++;
            }

            if ($$3 > 1 || $$2 > 1) {
               return false;
            }
         }
      }

      return $$2 == 1 && $$3 == 1;
   }

   public cvl a(czi $$0, jp.a $$1) {
      cvl $$2 = cvl.k;
      cuf $$3 = (cuf)cvo.rj;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvl $$5 = $$0.a($$4);
         if (!$$5.f()) {
            cvg $$6 = $$5.h();
            if (dgv.a($$6) instanceof dnv) {
               $$2 = $$5;
            } else if ($$6 instanceof cuf) {
               $$3 = (cuf)$$6;
            }
         }
      }

      dgv $$7 = dnv.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public czy<?> as_() {
      return czy.m;
   }
}
