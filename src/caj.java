import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class caj extends cax<bqo> {
   private static final int a = 200;
   private static final int c = 599;

   public caj() {
      this(200);
   }

   public caj(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aps $$0, bqo $$1) {
      a($$1);
   }

   @Override
   public Set<bzr<?>> a() {
      return ImmutableSet.of(bzr.g);
   }

   public static void a(bqo $$0) {
      Optional<List<bqo>> $$1 = $$0.dP().c(bzr.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ai().equals(bqb.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bqo $$0) {
      $$0.dP().a(bzr.F, true, 599L);
   }
}
