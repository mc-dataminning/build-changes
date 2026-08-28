import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class ers extends erz {
   public ers(dnm $$0) {
      super($$0);
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, @Nullable erx $$3, boolean $$4) {
      int $$5 = this.c($$0, $$1);
      if ($$2.c(dnm.f) != $$5) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.b(dnm.f, Integer.valueOf($$5)), 2);
         }

         Set<je> $$6 = Sets.newHashSet();
         $$6.add($$1);

         for (jj $$7 : jj.values()) {
            $$6.add($$1.a($$7));
         }

         for (je $$8 : $$6) {
            $$0.a($$8, this.a);
         }
      }
   }

   private int c(deg $$0, je $$1) {
      int $$2 = this.a($$0, $$1);
      return $$2 == 15 ? $$2 : Math.max($$2, this.b($$0, $$1));
   }
}
