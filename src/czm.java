import java.util.ArrayList;
import java.util.List;

public class czm extends czk {
   private static final czp a = czp.a(cvo.qP);
   private static final czp b = czp.a(cvo.pv);
   private static final czp c = czp.a(cvo.ux);

   public czm(czh $$0) {
      super($$0);
   }

   public boolean a(czi $$0, dds $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvl $$5 = $$0.a($$4);
         if (!$$5.f()) {
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

   public cvl a(czi $$0, jp.a $$1) {
      List<cye> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvl $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cye $$6 = $$5.a(kr.W);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cvl $$7 = new cvl(cvo.uw, 3);
      $$7.b(kr.X, new cyf($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cvl a(jp.a $$0) {
      return new cvl(cvo.uw);
   }

   @Override
   public czy<?> as_() {
      return czy.g;
   }
}
