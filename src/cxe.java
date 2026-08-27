import com.google.common.collect.Lists;
import java.util.List;

public class cxe extends cxm {
   public cxe(cxk $$0) {
      super($$0);
   }

   public boolean a(cpj $$0, dax $$1) {
      cto $$2 = cto.i;
      List<cto> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cto $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awe.bz)) {
               if (!$$2.e()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.g() instanceof csi)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.e() && !$$3.isEmpty();
   }

   public cto a(cpj $$0, iz.a $$1) {
      List<csi> $$2 = Lists.newArrayList();
      cto $$3 = cto.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cto $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awe.bz)) {
               if (!$$3.e()) {
                  return cto.i;
               }

               $$3 = $$5.s();
            } else {
               if (!($$5.g() instanceof csi $$6)) {
                  return cto.i;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.e() && !$$2.isEmpty() ? cwg.a($$3, $$2) : cto.i;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cxy<?> ao_() {
      return cxy.c;
   }
}
