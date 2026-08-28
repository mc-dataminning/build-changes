import java.util.Map;

public class cyh extends cyq {
   public cyh(cxx $$0) {
      super("", $$0, cyr.a(Map.of('#', cyf.a(cuf.qO), 'x', cyf.a(cuf.rU)), "###", "#x#", "###"), new cuc(cuf.uj));
   }

   @Override
   public boolean a(cxy $$0, dcf $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cuc $$2 = a($$0);
         if ($$2.e()) {
            return false;
         } else {
            epw $$3 = cuk.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cuc a(cxy $$0, jl.a $$1) {
      cuc $$2 = a($$0).c(1);
      $$2.b(kn.D, cxc.b);
      return $$2;
   }

   private static cuc a(cxy $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cuc $$2 = $$0.a($$1);
         if ($$2.a(cuf.rU)) {
            return $$2;
         }
      }

      return cuc.l;
   }

   @Override
   public boolean ao_() {
      return true;
   }

   @Override
   public cyn<?> ap_() {
      return cyn.f;
   }
}
