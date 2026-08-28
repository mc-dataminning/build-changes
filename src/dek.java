import java.util.ArrayList;
import java.util.List;

public class dek extends deh {
   private static final den d = den.a(dae.rE);
   private static final den e = den.a(dae.qi);
   private static final den f = den.a(dae.vF);

   public dek(dee $$0) {
      super($$0);
   }

   public boolean a(def $$0, djz $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         int $$3 = 0;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            daa $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if (d.a($$5)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else if (e.a($$5)) {
                  if (++$$3 > 3) {
                     return false;
                  }
               } else if (!f.a($$5)) {
                  return false;
               }
            }
         }

         return $$2 && $$3 >= 1;
      }
   }

   public daa a(def $$0, ji.a $$1) {
      List<dco> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         daa $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (e.a($$5)) {
               $$3++;
            } else if (f.a($$5)) {
               dco $$6 = $$5.a(kl.ai);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      daa $$7 = new daa(dae.vE, 3);
      $$7.b(kl.aj, new dcp($$3, $$2));
      return $$7;
   }

   @Override
   public dfb<dek> a() {
      return dfb.g;
   }
}
