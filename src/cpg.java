import com.google.common.collect.Lists;
import java.util.List;

public class cpg extends cpd {
   private static final cpi a = cpi.a(cmk.uo);

   public cpg(cpb $$0) {
      super($$0);
   }

   public boolean a(cia $$0, csy $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof ckw) {
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

   public cmh a(cia $$0, is $$1) {
      List<Integer> $$2 = Lists.newArrayList();
      cmh $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmh $$5 = $$0.a($$4);
         cmc $$6 = $$5.d();
         if ($$6 instanceof ckw) {
            $$2.add(((ckw)$$6).d().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a("Explosion").b("FadeColors", $$2);
         return $$3;
      } else {
         return cmh.f;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cpp<?> ar_() {
      return cpp.i;
   }
}
