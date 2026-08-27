import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bte extends btr<bjm> {
   private static final int a = 200;
   private static final int c = 599;

   public bte() {
      this(200);
   }

   public bte(int $$0) {
      super($$0);
   }

   @Override
   protected void a(akt $$0, bjm $$1) {
      a($$1);
   }

   @Override
   public Set<bsn<?>> a() {
      return ImmutableSet.of(bsn.g);
   }

   public static void a(bjm $$0) {
      Optional<List<bjm>> $$1 = $$0.dN().c(bsn.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ag().equals(bja.ac));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bjm $$0) {
      $$0.dN().a(bsn.F, true, 599L);
   }
}
