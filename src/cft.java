import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cft extends cgh<bvx> {
   private static final int a = 200;
   private static final int b = 599;

   public cft() {
      this(200);
   }

   public cft(int $$0) {
      super($$0);
   }

   @Override
   protected void a(arx $$0, bvx $$1) {
      a($$1);
   }

   @Override
   public Set<cfb<?>> a() {
      return ImmutableSet.of(cfb.g);
   }

   public static void a(bvx $$0) {
      Optional<List<bvx>> $$1 = $$0.ec().c(cfb.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.aq().equals(bvi.aq));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bvx $$0) {
      $$0.ec().a(cfb.F, true, 599L);
   }
}
