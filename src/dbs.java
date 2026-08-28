import java.util.ArrayList;
import java.util.List;

public class dbs extends dcb {
   public dbs(dby $$0) {
      super($$0);
   }

   public boolean a(dbz $$0, dhp $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxy $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(axi.bO)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$5.h() instanceof cww)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cxy a(dbz $$0, ju.a $$1) {
      List<cww> $$2 = new ArrayList<>();
      cxy $$3 = cxy.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxy $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axi.bO)) {
               if (!$$3.f()) {
                  return cxy.k;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cww $$6)) {
                  return cxy.k;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? daj.a($$3, $$2) : cxy.k;
   }

   @Override
   public dcv<dbs> a() {
      return dcv.c;
   }
}
