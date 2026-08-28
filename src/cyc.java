import java.util.ArrayList;
import java.util.List;

public class cyc extends cya {
   private static final cyf a = cyf.a(cuf.qO);
   private static final cyf b = cyf.a(cuf.pu);
   private static final cyf c = cyf.a(cuf.uv);

   public cyc(cxx $$0) {
      super($$0);
   }

   public boolean a(cxy $$0, dcf $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuc $$5 = $$0.a($$4);
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

   public cuc a(cxy $$0, jl.a $$1) {
      List<cwu> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuc $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cwu $$6 = $$5.a(kn.T);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cuc $$7 = new cuc(cuf.uu, 3);
      $$7.b(kn.U, new cwv($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cuc a(jl.a $$0) {
      return new cuc(cuf.uu);
   }

   @Override
   public cyn<?> ap_() {
      return cyn.g;
   }
}
