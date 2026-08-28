import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfc extends cfq<bvg> {
   private static final int a = 200;
   private static final int b = 599;

   public cfc() {
      this(200);
   }

   public cfc(int $$0) {
      super($$0);
   }

   @Override
   protected void a(arc $$0, bvg $$1) {
      a($$1);
   }

   @Override
   public Set<cek<?>> a() {
      return ImmutableSet.of(cek.g);
   }

   public static void a(bvg $$0) {
      Optional<List<bvg>> $$1 = $$0.ec().c(cek.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.aq().equals(bur.aq));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bvg $$0) {
      $$0.ec().a(cek.F, true, 599L);
   }
}
