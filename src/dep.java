import java.util.Map;

public class dep extends dff {
   public dep(dee $$0) {
      super("", $$0, dfg.a(Map.of('#', den.a(dae.rE), 'x', den.a(dae.tc)), "###", "#x#", "###"), new daa(dae.vt));
   }

   @Override
   public boolean a(def $$0, djz $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         daa $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            ezl $$3 = dan.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.d() ? false : $$3.g < 4;
            }
         }
      }
   }

   @Override
   public daa a(def $$0, ji.a $$1) {
      daa $$2 = c($$0).c(1);
      $$2.b(kl.O, dcx.b);
      return $$2;
   }

   private static daa c(def $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         daa $$2 = $$0.a($$1);
         if ($$2.c(kl.M)) {
            return $$2;
         }
      }

      return daa.k;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public dfb<dep> a() {
      return dfb.f;
   }
}
