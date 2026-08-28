import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class exr extends exy {
   public exr(dso $$0) {
      super($$0);
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, @Nullable exw $$3, boolean $$4) {
      int $$5 = this.c($$0, $$1);
      if ($$2.c(dso.f) != $$5) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.b(dso.f, Integer.valueOf($$5)), 2);
         }

         Set<iu> $$6 = Sets.newHashSet();
         $$6.add($$1);

         for (ja $$7 : ja.values()) {
            $$6.add($$1.a($$7));
         }

         for (iu $$8 : $$6) {
            $$0.a($$8, this.a);
         }
      }
   }

   private int c(dja $$0, iu $$1) {
      int $$2 = this.a($$0, $$1);
      return $$2 == 15 ? $$2 : Math.max($$2, this.b($$0, $$1));
   }
}
