import java.util.Map;

public class czr extends dab {
   public czr(czh $$0) {
      super("", $$0, dac.a(Map.of('#', czp.a(cvo.qP), 'x', czp.a(cvo.rV)), "###", "#x#", "###"), new cvl(cvo.ul));
   }

   @Override
   public boolean a(czi $$0, dds $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cvl $$2 = a($$0);
         if ($$2.f()) {
            return false;
         } else {
            erv $$3 = cvx.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cvl a(czi $$0, jp.a $$1) {
      cvl $$2 = a($$0).c(1);
      $$2.b(kr.F, cym.b);
      return $$2;
   }

   private static cvl a(czi $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cvl $$2 = $$0.a($$1);
         if ($$2.a(cvo.rV)) {
            return $$2;
         }
      }

      return cvl.k;
   }

   @Override
   public boolean ar_() {
      return true;
   }

   @Override
   public czy<?> as_() {
      return czy.f;
   }
}
