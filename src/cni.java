import com.google.common.collect.Lists;
import java.util.List;

public class cni extends cnf {
   private static final cnk a = cnk.a(ckm.tB);

   public cni(cnc $$0) {
      super($$0);
   }

   public boolean a(cgd $$0, cqz $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ckj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof ciy) {
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

   public ckj a(cgd $$0, ip $$1) {
      List<Integer> $$2 = Lists.newArrayList();
      ckj $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ckj $$5 = $$0.a($$4);
         cke $$6 = $$5.d();
         if ($$6 instanceof ciy) {
            $$2.add(((ciy)$$6).d().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a("Explosion").b("FadeColors", $$2);
         return $$3;
      } else {
         return ckj.b;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cnq<?> aq_() {
      return cnq.i;
   }
}
