import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public interface bsf {
   void a(bsd var1, ctq var2);

   ctq a(bsd var1);

   void a(bsd var1, float var2);

   default void a(akn $$0, epk $$1) {
      this.a($$0, $$1, 0L);
   }

   default void a(akn $$0, epk $$1, long $$2) {
      akm<epm> $$3 = akm.a(lf.aU, $$0);
      if (!$$3.equals(epf.a)) {
         epm $$4 = $$1.a().o().be().b($$3);
         if ($$4 != epm.a) {
            List<ctq> $$5 = $$4.a($$1, $$2);
            List<bsd> $$6 = new ArrayList<>();

            for (ctq $$7 : $$5) {
               bsd $$8 = this.a($$7, $$6);
               if ($$8 != null) {
                  ctq $$9 = $$8.f() ? $$7.c(1) : $$7;
                  this.a($$8, $$9);
                  this.a($$8, 0.085F);
                  $$6.add($$8);
               }
            }
         }
      }
   }

   @Nullable
   default bsd a(ctq $$0, List<bsd> $$1) {
      css $$2 = css.c_($$0);
      if ($$2 != null) {
         bsd $$3 = $$2.m();
         if (!$$1.contains($$3)) {
            return $$3;
         }
      } else if (!$$1.contains(bsd.a)) {
         return bsd.a;
      }

      return null;
   }
}
