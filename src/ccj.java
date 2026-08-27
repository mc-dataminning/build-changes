import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ccj extends ccx<bso> {
   private static final int a = 200;
   private static final int c = 599;

   public ccj() {
      this(200);
   }

   public ccj(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aqt $$0, bso $$1) {
      a($$1);
   }

   @Override
   public Set<cbr<?>> a() {
      return ImmutableSet.of(cbr.g);
   }

   public static void a(bso $$0) {
      Optional<List<bso>> $$1 = $$0.dZ().c(cbr.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ak().equals(bsb.ah));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bso $$0) {
      $$0.dZ().a(cbr.F, true, 599L);
   }
}
