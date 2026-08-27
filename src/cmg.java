import com.google.common.collect.Lists;
import java.util.List;

public class cmg extends cmd {
   private static final cmi a = cmi.a(cjk.tB);

   public cmg(cma $$0) {
      super($$0);
   }

   public boolean a(cfb $$0, cpx $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof chw) {
               $$2 = true;
            } else {
               if (!a.a($$5)) {
                  return false;
               }

               if ($$3) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$3 && $$2;
   }

   public cjh a(cfb $$0, hu $$1) {
      List<Integer> $$2 = Lists.newArrayList();
      cjh $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjh $$5 = $$0.a($$4);
         cjc $$6 = $$5.d();
         if ($$6 instanceof chw) {
            $$2.add(((chw)$$6).d().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a("Explosion").b("FadeColors", $$2);
         return $$3;
      } else {
         return cjh.b;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmo<?> an_() {
      return cmo.i;
   }
}
