import com.google.common.collect.Lists;
import java.util.List;

public class cmw extends cnf {
   public cmw(cnc $$0) {
      super($$0);
   }

   public boolean a(cgd $$0, cqz $$1) {
      ckj $$2 = ckj.b;
      List<ckj> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ckj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cjb) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof ciy)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public ckj a(cgd $$0, ip $$1) {
      List<ciy> $$2 = Lists.newArrayList();
      ckj $$3 = ckj.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ckj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cke $$6 = $$5.d();
            if ($$6 instanceof cjb) {
               if (!$$3.b()) {
                  return ckj.b;
               }

               $$3 = $$5.p();
            } else {
               if (!($$6 instanceof ciy)) {
                  return ckj.b;
               }

               $$2.add((ciy)$$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? cjb.a($$3, $$2) : ckj.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cnq<?> aq_() {
      return cnq.c;
   }
}
