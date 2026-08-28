import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class eyr extends eyy {
   public eyr(dtl $$0) {
      super($$0);
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, @Nullable eyw $$3, boolean $$4) {
      int $$5 = this.c($$0, $$1);
      if ($$2.c(dtl.f) != $$5) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.b(dtl.f, Integer.valueOf($$5)), 2);
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

   private int c(djx $$0, iv $$1) {
      int $$2 = this.a($$0, $$1);
      return $$2 == 15 ? $$2 : Math.max($$2, this.b($$0, $$1));
   }
}
