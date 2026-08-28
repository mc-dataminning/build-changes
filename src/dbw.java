import java.util.ArrayList;
import java.util.List;

public class dbw extends dbt {
   private static final dbz c = dbz.a(cxs.rm);
   private static final dbz d = dbz.a(cxs.pQ);
   private static final dbz e = dbz.a(cxs.vl);

   public dbw(dbq $$0) {
      super($$0);
   }

   public boolean a(dbr $$0, dhh $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         int $$3 = 0;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxo $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if (c.a($$5)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else if (d.a($$5)) {
                  if (++$$3 > 3) {
                     return false;
                  }
               } else if (!e.a($$5)) {
                  return false;
               }
            }
         }

         return $$2 && $$3 >= 1;
      }
   }

   public cxo a(dbr $$0, js.a $$1) {
      List<dad> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxo $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (d.a($$5)) {
               $$3++;
            } else if (e.a($$5)) {
               dad $$6 = $$5.a(ku.ae);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cxo $$7 = new cxo(cxs.vk, 3);
      $$7.b(ku.af, new dae($$3, $$2));
      return $$7;
   }

   @Override
   public dcn<dbw> a() {
      return dcn.g;
   }
}
