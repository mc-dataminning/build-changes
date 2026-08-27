import com.google.common.collect.Lists;
import java.util.List;

public class cll extends clt {
   public cll(aer $$0, clr $$1) {
      super($$0, $$1);
   }

   public boolean a(ces $$0, cpm $$1) {
      ciy $$2 = ciy.b;
      List<ciy> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof chq) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof chn)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public ciy a(ces $$0, hs $$1) {
      List<chn> $$2 = Lists.newArrayList();
      ciy $$3 = ciy.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cit $$6 = $$5.d();
            if ($$6 instanceof chq) {
               if (!$$3.b()) {
                  return ciy.b;
               }

               $$3 = $$5.p();
            } else {
               if (!($$6 instanceof chn)) {
                  return ciy.b;
               }

               $$2.add((chn)$$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? chq.a($$3, $$2) : ciy.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmd<?> aj_() {
      return cmd.c;
   }
}
