import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class eyd extends eyk {
   public eyd(dta $$0) {
      super($$0);
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, @Nullable eyi $$3, boolean $$4) {
      int $$5 = this.c($$0, $$1);
      if ($$2.c(dta.f) != $$5) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.b(dta.f, Integer.valueOf($$5)), 2);
         }

         Set<iv> $$6 = Sets.newHashSet();
         $$6.add($$1);

         for (jb $$7 : jb.values()) {
            $$6.add($$1.a($$7));
         }

         for (iv $$8 : $$6) {
            $$0.a($$8, this.a);
         }
      }
   }

   private int c(djm $$0, iv $$1) {
      int $$2 = this.a($$0, $$1);
      return $$2 == 15 ? $$2 : Math.max($$2, this.b($$0, $$1));
   }
}
