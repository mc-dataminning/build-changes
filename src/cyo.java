import java.util.ArrayList;
import java.util.List;

public class cyo extends cym {
   private static final cyr a = cyr.a(cur.qO);
   private static final cyr b = cyr.a(cur.pu);
   private static final cyr c = cyr.a(cur.uv);

   public cyo(cyk $$0) {
      super($$0);
   }

   public boolean a(cqj $$0, dbx $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (a.a($$5)) {
               if ($$2) {
                  return false;
               }

               $$2 = true;
            } else if (b.a($$5)) {
               if (++$$3 > 3) {
                  return false;
               }
            } else if (!c.a($$5)) {
               return false;
            }
         }
      }

      return $$2 && $$3 >= 1;
   }

   public cuo a(cqj $$0, jk.a $$1) {
      List<cxh> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cxh $$6 = $$5.a(km.T);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cuo $$7 = new cuo(cur.uu, 3);
      $$7.b(km.U, new cxi($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cuo a(jk.a $$0) {
      return new cuo(cur.uu);
   }

   @Override
   public cyy<?> ao_() {
      return cyy.g;
   }
}
