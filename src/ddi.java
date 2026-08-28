import java.util.ArrayList;
import java.util.List;

public class ddi extends ddr {
   public ddi(ddo $$0) {
      super($$0);
   }

   public boolean a(ddp $$0, djh $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czk $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(axk.bP)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$5.h() instanceof cyj)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public czk a(ddp $$0, jh.a $$1) {
      List<cyj> $$2 = new ArrayList<>();
      czk $$3 = czk.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czk $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axk.bP)) {
               if (!$$3.f()) {
                  return czk.k;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cyj $$6)) {
                  return czk.k;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? dbx.a($$3, $$2) : czk.k;
   }

   @Override
   public del<ddi> a() {
      return del.c;
   }
}
