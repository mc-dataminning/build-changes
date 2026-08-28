import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class esh extends eso {
   public esh(doa $$0) {
      super($$0);
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, @Nullable esm $$3, boolean $$4) {
      int $$5 = this.c($$0, $$1);
      if ($$2.c(doa.f) != $$5) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.b(doa.f, Integer.valueOf($$5)), 2);
         }

         Set<jg> $$6 = Sets.newHashSet();
         $$6.add($$1);

         for (jl $$7 : jl.values()) {
            $$6.add($$1.a($$7));
         }

         for (jg $$8 : $$6) {
            $$0.a($$8, this.a);
         }
      }
   }

   private int c(dev $$0, jg $$1) {
      int $$2 = this.a($$0, $$1);
      return $$2 == 15 ? $$2 : Math.max($$2, this.b($$0, $$1));
   }
}
