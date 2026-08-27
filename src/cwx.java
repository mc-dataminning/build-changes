import java.util.ArrayList;
import java.util.List;

public class cwx extends cwv {
   private static final cxa a = cxa.a(ctc.qO);
   private static final cxa b = cxa.a(ctc.pu);
   private static final cxa c = cxa.a(ctc.uv);

   public cwx(cwt $$0) {
      super($$0);
   }

   public boolean a(cou $$0, dad $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csz $$5 = $$0.a($$4);
         if (!$$5.d()) {
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

   public csz a(cou $$0, iy.a $$1) {
      List<cvq> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csz $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cvq $$6 = $$5.a(ka.Q);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      csz $$7 = new csz(ctc.uu, 3);
      $$7.b(ka.R, new cvr($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public csz a(iy.a $$0) {
      return new csz(ctc.uu);
   }

   @Override
   public cxh<?> ao_() {
      return cxh.g;
   }
}
