import com.google.common.collect.Lists;
import java.util.List;

public class cim extends ciu {
   public cim(acq $$0, cis $$1) {
      super($$0, $$1);
   }

   public boolean a(cbt $$0, cmm $$1) {
      cfz $$2 = cfz.b;
      List<cfz> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cfz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cer) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof ceo)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public cfz a(cbt $$0, hs $$1) {
      List<ceo> $$2 = Lists.newArrayList();
      cfz $$3 = cfz.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cfz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cfu $$6 = $$5.d();
            if ($$6 instanceof cer) {
               if (!$$3.b()) {
                  return cfz.b;
               }

               $$3 = $$5.p();
            } else {
               if (!($$6 instanceof ceo)) {
                  return cfz.b;
               }

               $$2.add((ceo)$$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? cer.a($$3, $$2) : cfz.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cje<?> aj_() {
      return cje.c;
   }
}
