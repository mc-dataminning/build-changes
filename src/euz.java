import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class euz extends evg {
   public euz(dql $$0) {
      super($$0);
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, @Nullable eve $$3, boolean $$4) {
      int $$5 = this.c($$0, $$1);
      if ($$2.c(dql.f) != $$5) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.b(dql.f, Integer.valueOf($$5)), 2);
         }

         Set<ji> $$6 = Sets.newHashSet();
         $$6.add($$1);

         for (jn $$7 : jn.values()) {
            $$6.add($$1.a($$7));
         }

         for (ji $$8 : $$6) {
            $$0.a($$8, this.a);
         }
      }
   }

   private int c(dgz $$0, ji $$1) {
      int $$2 = this.a($$0, $$1);
      return $$2 == 15 ? $$2 : Math.max($$2, this.b($$0, $$1));
   }
}
