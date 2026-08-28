import java.util.Map;

public class dds extends dei {
   public dds(ddh $$0) {
      super("", $$0, dej.a(Map.of('#', ddq.a(czh.rE), 'x', ddq.a(czh.tc)), "###", "#x#", "###"), new czd(czh.vt));
   }

   @Override
   public boolean a(ddi $$0, dja $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         czd $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            eyj $$3 = czq.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.d() ? false : $$3.g < 4;
            }
         }
      }
   }

   @Override
   public czd a(ddi $$0, jg.a $$1) {
      czd $$2 = c($$0).c(1);
      $$2.b(kj.O, dca.b);
      return $$2;
   }

   private static czd c(ddi $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         czd $$2 = $$0.a($$1);
         if ($$2.c(kj.M)) {
            return $$2;
         }
      }

      return czd.k;
   }

   @Override
   public boolean am_() {
      return true;
   }

   @Override
   public dee<dds> a() {
      return dee.f;
   }
}
