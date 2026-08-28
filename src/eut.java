import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class eut extends eva {
   public eut(dqk $$0) {
      super($$0);
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, @Nullable euy $$3, boolean $$4) {
      int $$5 = this.c($$0, $$1);
      if ($$2.c(dqk.f) != $$5) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.b(dqk.f, Integer.valueOf($$5)), 2);
         }

         Set<jh> $$6 = Sets.newHashSet();
         $$6.add($$1);

         for (jm $$7 : jm.values()) {
            $$6.add($$1.a($$7));
         }

         for (jh $$8 : $$6) {
            $$0.a($$8, this.a);
         }
      }
   }

   private int c(dgz $$0, jh $$1) {
      int $$2 = this.a($$0, $$1);
      return $$2 == 15 ? $$2 : Math.max($$2, this.b($$0, $$1));
   }
}
