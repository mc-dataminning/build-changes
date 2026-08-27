import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bvd extends bvq<bll> {
   private static final int a = 200;
   private static final int c = 599;

   public bvd() {
      this(200);
   }

   public bvd(int $$0) {
      super($$0);
   }

   @Override
   protected void a(ami $$0, bll $$1) {
      a($$1);
   }

   @Override
   public Set<bum<?>> a() {
      return ImmutableSet.of(bum.g);
   }

   public static void a(bll $$0) {
      Optional<List<bll>> $$1 = $$0.dP().c(bum.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ai().equals(bkz.ac));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bll $$0) {
      $$0.dP().a(bum.F, true, 599L);
   }
}
