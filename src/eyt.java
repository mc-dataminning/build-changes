import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class eyt extends eza {
   public eyt(dtn $$0) {
      super($$0);
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, @Nullable eyy $$3, boolean $$4) {
      int $$5 = this.c($$0, $$1);
      if ($$2.c(dtn.f) != $$5) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.b(dtn.f, Integer.valueOf($$5)), 2);
         }

         Set<iw> $$6 = Sets.newHashSet();
         $$6.add($$1);

         for (jc $$7 : jc.values()) {
            $$6.add($$1.a($$7));
         }

         for (iw $$8 : $$6) {
            $$0.a($$8, this.a);
         }
      }
   }

   private int c(djz $$0, iw $$1) {
      int $$2 = this.a($$0, $$1);
      return $$2 == 15 ? $$2 : Math.max($$2, this.b($$0, $$1));
   }
}
