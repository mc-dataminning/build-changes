import java.util.Map;

public class den extends dfd {
   public den(dec $$0) {
      super("", $$0, dfe.a(Map.of('#', del.a(dac.rE), 'x', del.a(dac.tc)), "###", "#x#", "###"), new czy(dac.vt));
   }

   @Override
   public boolean a(ded $$0, djx $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         czy $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            ezj $$3 = dal.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.d() ? false : $$3.g < 4;
            }
         }
      }
   }

   @Override
   public czy a(ded $$0, jh.a $$1) {
      czy $$2 = c($$0).c(1);
      $$2.b(kk.O, dcv.b);
      return $$2;
   }

   private static czy c(ded $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         czy $$2 = $$0.a($$1);
         if ($$2.c(kk.M)) {
            return $$2;
         }
      }

      return czy.k;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public dez<den> a() {
      return dez.f;
   }
}
