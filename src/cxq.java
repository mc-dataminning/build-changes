import java.util.ArrayList;
import java.util.List;

public class cxq extends cxo {
   private static final cxt a = cxt.a(ctt.qO);
   private static final cxt b = cxt.a(ctt.pu);
   private static final cxt c = cxt.a(ctt.uv);

   public cxq(cxm $$0) {
      super($$0);
   }

   public boolean a(cpl $$0, daz $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ctq $$5 = $$0.a($$4);
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

   public ctq a(cpl $$0, iz.a $$1) {
      List<cwj> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ctq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cwj $$6 = $$5.a(kb.S);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      ctq $$7 = new ctq(ctt.uu, 3);
      $$7.b(kb.T, new cwk($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public ctq a(iz.a $$0) {
      return new ctq(ctt.uu);
   }

   @Override
   public cya<?> ap_() {
      return cya.g;
   }
}
