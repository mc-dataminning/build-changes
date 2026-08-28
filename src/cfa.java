import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfa extends cfo<bve> {
   private static final int a = 200;
   private static final int b = 599;

   public cfa() {
      this(200);
   }

   public cfa(int $$0) {
      super($$0);
   }

   @Override
   protected void a(arq $$0, bve $$1) {
      a($$1);
   }

   @Override
   public Set<cei<?>> a() {
      return ImmutableSet.of(cei.g);
   }

   public static void a(bve $$0) {
      Optional<List<bve>> $$1 = $$0.ee().c(cei.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ar().equals(bup.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bve $$0) {
      $$0.ee().a(cei.F, true, 599L);
   }
}
