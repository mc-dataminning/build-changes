import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bsy extends btl<bjg> {
   private static final int a = 200;
   private static final int c = 599;

   public bsy() {
      this(200);
   }

   public bsy(int $$0) {
      super($$0);
   }

   @Override
   protected void a(akr $$0, bjg $$1) {
      a($$1);
   }

   @Override
   public Set<bsh<?>> a() {
      return ImmutableSet.of(bsh.g);
   }

   public static void a(bjg $$0) {
      Optional<List<bjg>> $$1 = $$0.dN().c(bsh.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ah().equals(biu.ac));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(bjg $$0) {
      $$0.dN().a(bsh.F, true, 599L);
   }
}
