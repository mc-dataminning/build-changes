import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cho extends cic<bxu> {
   private static final int a = 200;
   private static final int b = 599;

   public cho() {
      this(200);
   }

   public cho(int $$0) {
      super($$0);
   }

   @Override
   protected void a(ars $$0, bxu $$1) {
      a($$1);
   }

   @Override
   public Set<cgw<?>> a() {
      return ImmutableSet.of(cgw.g);
   }

   public static void a(bxu $$0) {
      Optional<List<bxu>> $$1 = $$0.ec().c(cgw.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.an().equals(bxc.aq));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bxu $$0) {
      $$0.ec().a(cgw.G, true, 599L);
   }
}
