import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class erw extends esd {
   public erw(dnp $$0) {
      super($$0);
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, @Nullable esb $$3, boolean $$4) {
      int $$5 = this.c($$0, $$1);
      if ($$2.c(dnp.f) != $$5) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.b(dnp.f, Integer.valueOf($$5)), 2);
         }

         Set<jf> $$6 = Sets.newHashSet();
         $$6.add($$1);

         for (jk $$7 : jk.values()) {
            $$6.add($$1.a($$7));
         }

         for (jf $$8 : $$6) {
            $$0.a($$8, this.a);
         }
      }
   }

   private int c(dej $$0, jf $$1) {
      int $$2 = this.a($$0, $$1);
      return $$2 == 15 ? $$2 : Math.max($$2, this.b($$0, $$1));
   }
}
