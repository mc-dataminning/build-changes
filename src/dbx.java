import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dbx extends dbt {
   private static final dbz c = dbz.a(cxs.vl);

   public dbx(dbq $$0) {
      super($$0);
   }

   public boolean a(dbr $$0, dhh $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxo $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cwm) {
                  $$2 = true;
               } else {
                  if (!c.a($$5)) {
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
   }

   public cxo a(dbr $$0, js.a $$1) {
      IntList $$2 = new IntArrayList();
      cxo $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxo $$5 = $$0.a($$4);
         if ($$5.h() instanceof cwm $$7) {
            $$2.add($$7.b().f());
         } else if (c.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(ku.ae, dad.a, $$2, dad::a);
         return $$3;
      } else {
         return cxo.j;
      }
   }

   @Override
   public dcn<dbx> a() {
      return dcn.i;
   }
}
