import java.util.ArrayList;
import java.util.List;

public class cya extends cxy {
   private static final cyd a = cyd.a(cud.qO);
   private static final cyd b = cyd.a(cud.pu);
   private static final cyd c = cyd.a(cud.uv);

   public cya(cxv $$0) {
      super($$0);
   }

   public boolean a(cxw $$0, dcd $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cua $$5 = $$0.a($$4);
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

   public cua a(cxw $$0, jl.a $$1) {
      List<cws> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cua $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cws $$6 = $$5.a(kn.T);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cua $$7 = new cua(cud.uu, 3);
      $$7.b(kn.U, new cwt($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cua a(jl.a $$0) {
      return new cua(cud.uu);
   }

   @Override
   public cyl<?> ap_() {
      return cyl.g;
   }
}
