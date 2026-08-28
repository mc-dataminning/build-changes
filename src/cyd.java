import java.util.ArrayList;
import java.util.List;

public class cyd extends cyb {
   private static final cyg a = cyg.a(cug.qO);
   private static final cyg b = cyg.a(cug.pu);
   private static final cyg c = cyg.a(cug.uv);

   public cyd(cxy $$0) {
      super($$0);
   }

   public boolean a(cxz $$0, dcg $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cud $$5 = $$0.a($$4);
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

   public cud a(cxz $$0, jl.a $$1) {
      List<cwv> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cud $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cwv $$6 = $$5.a(kn.T);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cud $$7 = new cud(cug.uu, 3);
      $$7.b(kn.U, new cww($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cud a(jl.a $$0) {
      return new cud(cug.uu);
   }

   @Override
   public cyo<?> ap_() {
      return cyo.g;
   }
}
