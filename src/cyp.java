import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class cyp extends cym {
   private static final cyr a = cyr.a(cur.uv);

   public cyp(cyk $$0) {
      super($$0);
   }

   public boolean a(cqj $$0, dbx $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof cti) {
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

   public cuo a(cqj $$0, jk.a $$1) {
      IntList $$2 = new IntArrayList();
      cuo $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuo $$5 = $$0.a($$4);
         cuj $$6 = $$5.g();
         if ($$6 instanceof cti) {
            $$2.add(((cti)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(km.T, cxh.a, $$2, cxh::a);
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
   public cyy<?> ao_() {
      return cyy.i;
   }
}
