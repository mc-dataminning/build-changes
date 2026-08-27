import com.google.common.collect.Lists;
import java.util.List;

public class cob extends cok {
   public cob(coh $$0) {
      super($$0);
   }

   public boolean a(chh $$0, csf $$1) {
      clo $$2 = clo.b;
      List<clo> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clo $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof ckg) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof ckd)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public clo a(chh $$0, it $$1) {
      List<ckd> $$2 = Lists.newArrayList();
      clo $$3 = clo.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clo $$5 = $$0.a($$4);
         if (!$$5.b()) {
            clj $$6 = $$5.d();
            if ($$6 instanceof ckg) {
               if (!$$3.b()) {
                  return clo.b;
               }

               $$3 = $$5.p();
            } else {
               if (!($$6 instanceof ckd)) {
                  return clo.b;
               }

               $$2.add((ckd)$$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? ckg.a($$3, $$2) : clo.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cox<?> as_() {
      return cox.c;
   }
}
