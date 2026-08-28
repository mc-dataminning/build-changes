import java.util.ArrayList;
import java.util.List;

public class ddl extends ddu {
   public ddl(ddr $$0) {
      super($$0);
   }

   public boolean a(dds $$0, djm $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czn $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(axk.bP)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$5.h() instanceof cym)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public czn a(dds $$0, jh.a $$1) {
      List<cym> $$2 = new ArrayList<>();
      czn $$3 = czn.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czn $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axk.bP)) {
               if (!$$3.f()) {
                  return czn.k;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cym $$6)) {
                  return czn.k;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? dca.a($$3, $$2) : czn.k;
   }

   @Override
   public deo<ddl> a() {
      return deo.c;
   }
}
