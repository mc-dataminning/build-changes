import java.util.ArrayList;
import java.util.List;

public class day extends dav {
   private static final dbb c = dbb.a(cwu.rv);
   private static final dbb d = dbb.a(cwu.pZ);
   private static final dbb e = dbb.a(cwu.vu);

   public day(das $$0) {
      super($$0);
   }

   public boolean a(dat $$0, dgj $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         int $$3 = 0;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwq $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if (c.a($$5)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else if (d.a($$5)) {
                  if (++$$3 > 3) {
                     return false;
                  }
               } else if (!e.a($$5)) {
                  return false;
               }
            }
         }

         return $$2 && $$3 >= 1;
      }
   }

   public cwq a(dat $$0, jt.a $$1) {
      List<czf> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwq $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (d.a($$5)) {
               $$3++;
            } else if (e.a($$5)) {
               czf $$6 = $$5.a(kv.ae);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cwq $$7 = new cwq(cwu.vt, 3);
      $$7.b(kv.af, new czg($$3, $$2));
      return $$7;
   }

   @Override
   public dbp<day> a() {
      return dbp.g;
   }
}
