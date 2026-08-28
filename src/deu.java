import java.util.ArrayList;
import java.util.List;

public class deu extends der {
   private static final dex d = dex.a(dao.rE);
   private static final dex e = dex.a(dao.qi);
   private static final dex f = dex.a(dao.vF);

   public deu(deo $$0) {
      super($$0);
   }

   public boolean a(dep $$0, dkj $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         int $$3 = 0;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            dak $$5 = $$0.a($$4);
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

   public dak a(dep $$0, ji.a $$1) {
      List<dcy> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         dak $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (e.a($$5)) {
               $$3++;
            } else if (f.a($$5)) {
               dcy $$6 = $$5.a(kl.ai);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      dak $$7 = new dak(dao.vE, 3);
      $$7.b(kl.aj, new dcz($$3, $$2));
      return $$7;
   }

   @Override
   public dfl<deu> a() {
      return dfl.g;
   }
}
