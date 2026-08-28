import java.util.Map;

public class dcj extends dcz {
   public dcj(dby $$0) {
      super("", $$0, dda.a(Map.of('#', dch.a(cyc.rz), 'x', dch.a(cyc.sV)), "###", "#x#", "###"), new cxy(cyc.vm));
   }

   @Override
   public boolean a(dbz $$0, dhp $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cxy $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            ewn $$3 = cyl.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.e() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cxy a(dbz $$0, ju.a $$1) {
      cxy $$2 = c($$0).c(1);
      $$2.b(kx.O, das.b);
      return $$2;
   }

   private static cxy c(dbz $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cxy $$2 = $$0.a($$1);
         if ($$2.c(kx.M)) {
            return $$2;
         }
      }

      return cxy.k;
   }

   @Override
   public boolean al_() {
      return true;
   }

   @Override
   public dcv<dcj> a() {
      return dcv.f;
   }
}
