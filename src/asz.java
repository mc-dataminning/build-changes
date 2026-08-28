import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class asz implements ase {
   public static final ase.a a = new ase.a("synchronize_registries");
   private final List<aug> b;
   private final jz<alm> c;

   public asz(List<aug> $$0, jz<alm> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zc<?>> $$0) {
      $$0.accept(new abd(this.b));
   }

   private void a(Consumer<zc<?>> $$0, Set<aug> $$1) {
      DynamicOps<ut> $$2 = this.c.a().a(uk.a);
      kj.a($$2, this.c.c(alm.b), $$1, ($$1x, $$2x) -> $$0.accept(new abb($$1x, $$2x)));
      $$0.accept(new zt(axr.a(this.c)));
   }

   public void a(List<aug> $$0, Consumer<zc<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public ase.a a() {
      return a;
   }
}
