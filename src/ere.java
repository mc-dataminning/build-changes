import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class ere extends erl {
   public ere(dmy $$0) {
      super($$0);
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, @Nullable erj $$3) {
      int $$4 = this.c($$0, $$1);
      if ($$2.c(dmy.f) != $$4) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.b(dmy.f, Integer.valueOf($$4)), 2);
         }

         Set<je> $$5 = Sets.newHashSet();
         $$5.add($$1);

         for (jj $$6 : jj.values()) {
            $$5.add($$1.a($$6));
         }

         for (je $$7 : $$5) {
            $$0.a($$7, this.a);
         }
      }
   }

   private int c(dds $$0, je $$1) {
      int $$2 = this.a($$0, $$1);
      return $$2 == 15 ? $$2 : Math.max($$2, this.b($$0, $$1));
   }
}
