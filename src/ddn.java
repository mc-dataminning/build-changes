import java.util.Map;

public class ddn extends ded {
   public ddn(ddc $$0) {
      super("", $$0, dee.a(Map.of('#', ddl.a(czc.rB), 'x', ddl.a(czc.sX)), "###", "#x#", "###"), new cyy(czc.vo));
   }

   @Override
   public boolean a(ddd $$0, div $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cyy $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            eyb $$3 = czl.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.d() ? false : $$3.g < 4;
            }
         }
      }
   }

   @Override
   public cyy a(ddd $$0, jg.a $$1) {
      cyy $$2 = c($$0).c(1);
      $$2.b(kj.O, dbv.b);
      return $$2;
   }

   private static cyy c(ddd $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cyy $$2 = $$0.a($$1);
         if ($$2.c(kj.M)) {
            return $$2;
         }
      }

      return cyy.k;
   }

   @Override
   public boolean al_() {
      return true;
   }

   @Override
   public ddz<ddn> a() {
      return ddz.f;
   }
}
