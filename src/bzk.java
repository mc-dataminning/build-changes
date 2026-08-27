import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bzk extends bzy<bpp> {
   private static final int a = 200;
   private static final int c = 599;

   public bzk() {
      this(200);
   }

   public bzk(int $$0) {
      super($$0);
   }

   @Override
   protected void a(apf $$0, bpp $$1) {
      a($$1);
   }

   @Override
   public Set<bys<?>> a() {
      return ImmutableSet.of(bys.g);
   }

   public static void a(bpp $$0) {
      Optional<List<bpp>> $$1 = $$0.dP().c(bys.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ai().equals(bpd.ag));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bpp $$0) {
      $$0.dP().a(bys.F, true, 599L);
   }
}
