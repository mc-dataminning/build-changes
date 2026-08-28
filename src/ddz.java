import java.util.Map;

public class ddz extends dep {
   public ddz(ddo $$0) {
      super("", $$0, deq.a(Map.of('#', ddx.a(czo.rE), 'x', ddx.a(czo.tc)), "###", "#x#", "###"), new czk(czo.vt));
   }

   @Override
   public boolean a(ddp $$0, djh $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         czk $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            eyq $$3 = czx.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.d() ? false : $$3.g < 4;
            }
         }
      }
   }

   @Override
   public czk a(ddp $$0, jh.a $$1) {
      czk $$2 = c($$0).c(1);
      $$2.b(kk.O, dch.b);
      return $$2;
   }

   private static czk c(ddp $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         czk $$2 = $$0.a($$1);
         if ($$2.c(kk.M)) {
            return $$2;
         }
      }

      return czk.k;
   }

   @Override
   public boolean am_() {
      return true;
   }

   @Override
   public del<ddz> a() {
      return del.f;
   }
}
