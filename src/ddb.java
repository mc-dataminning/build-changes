import java.util.ArrayList;
import java.util.List;

public class ddb extends ddk {
   public ddb(ddh $$0) {
      super($$0);
   }

   public boolean a(ddi $$0, dja $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czd $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(axk.bP)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$5.h() instanceof cyc)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public czd a(ddi $$0, jg.a $$1) {
      List<cyc> $$2 = new ArrayList<>();
      czd $$3 = czd.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czd $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axk.bP)) {
               if (!$$3.f()) {
                  return czd.k;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cyc $$6)) {
                  return czd.k;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? dbq.a($$3, $$2) : czd.k;
   }

   @Override
   public dee<ddb> a() {
      return dee.c;
   }
}
