import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public interface bsd {
   void a(bsb var1, cto var2);

   cto a(bsb var1);

   void a(bsb var1, float var2);

   default void a(akm $$0, epi $$1) {
      this.a($$0, $$1, 0L);
   }

   default void a(akm $$0, epi $$1, long $$2) {
      akl<epk> $$3 = akl.a(lf.aU, $$0);
      if (!$$3.equals(epd.a)) {
         epk $$4 = $$1.a().o().be().b($$3);
         if ($$4 != epk.a) {
            List<cto> $$5 = $$4.a($$1, $$2);
            List<bsb> $$6 = new ArrayList<>();

            for (cto $$7 : $$5) {
               bsb $$8 = this.a($$7, $$6);
               if ($$8 != null) {
                  cto $$9 = $$8.f() ? $$7.c(1) : $$7;
                  this.a($$8, $$9);
                  this.a($$8, 0.085F);
                  $$6.add($$8);
               }
            }
         }
      }
   }

   @Nullable
   default bsb a(cto $$0, List<bsb> $$1) {
      csq $$2 = csq.c_($$0);
      if ($$2 != null) {
         bsb $$3 = $$2.l();
         if (!$$1.contains($$3)) {
            return $$3;
         }
      } else if (!$$1.contains(bsb.a)) {
         return bsb.a;
      }

      return null;
   }
}
