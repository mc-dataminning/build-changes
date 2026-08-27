import com.google.common.collect.Lists;
import java.util.List;

public class cpw extends cpt {
   private static final cpy a = cpy.a(cna.uo);

   public cpw(cpr $$0) {
      super($$0);
   }

   public boolean a(ciq $$0, cto $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmx $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof clm) {
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

   public cmx a(ciq $$0, iu $$1) {
      List<Integer> $$2 = Lists.newArrayList();
      cmx $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmx $$5 = $$0.a($$4);
         cms $$6 = $$5.d();
         if ($$6 instanceof clm) {
            $$2.add(((clm)$$6).d().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a("Explosion").b("FadeColors", $$2);
         return $$3;
      } else {
         return cmx.f;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cqf<?> ar_() {
      return cqf.i;
   }
}
