import java.util.ArrayList;
import java.util.List;

public class dei extends def {
   private static final del d = del.a(dac.rE);
   private static final del e = del.a(dac.qi);
   private static final del f = del.a(dac.vF);

   public dei(dec $$0) {
      super($$0);
   }

   public boolean a(ded $$0, djx $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         int $$3 = 0;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czy $$5 = $$0.a($$4);
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

   public czy a(ded $$0, jh.a $$1) {
      List<dcm> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czy $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (e.a($$5)) {
               $$3++;
            } else if (f.a($$5)) {
               dcm $$6 = $$5.a(kk.ai);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      czy $$7 = new czy(dac.vE, 3);
      $$7.b(kk.aj, new dcn($$3, $$2));
      return $$7;
   }

   @Override
   public dez<dei> a() {
      return dez.g;
   }
}
