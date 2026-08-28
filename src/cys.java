import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class cys extends cyp {
   private static final cyu a = cyu.a(cur.uv);

   public cys(cym $$0) {
      super($$0);
   }

   public boolean a(cyn $$0, dcu $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof cth) {
               $$2 = true;
            } else {
               if (!a.a($$5)) {
                  return false;
               }

               if ($$3) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$3 && $$2;
   }

   public cuo a(cyn $$0, jo.a $$1) {
      IntList $$2 = new IntArrayList();
      cuo $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuo $$5 = $$0.a($$4);
         cuj $$6 = $$5.g();
         if ($$6 instanceof cth) {
            $$2.add(((cth)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kq.U, cxj.a, $$2, cxj::a);
         return $$3;
      } else {
         return cuo.l;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public czc<?> ap_() {
      return czc.i;
   }
}
