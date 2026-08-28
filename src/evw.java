import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class evw extends ewd {
   public evw(drb $$0) {
      super($$0);
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, @Nullable ewb $$3, boolean $$4) {
      int $$5 = this.c($$0, $$1);
      if ($$2.c(drb.f) != $$5) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.b(drb.f, Integer.valueOf($$5)), 2);
         }

         Set<jj> $$6 = Sets.newHashSet();
         $$6.add($$1);

         for (jo $$7 : jo.values()) {
            $$6.add($$1.a($$7));
         }

         for (jj $$8 : $$6) {
            $$0.a($$8, this.a);
         }
      }
   }

   private int c(dhp $$0, jj $$1) {
      int $$2 = this.a($$0, $$1);
      return $$2 == 15 ? $$2 : Math.max($$2, this.b($$0, $$1));
   }
}
