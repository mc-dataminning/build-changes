import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class atj implements aso {
   public static final aso.a a = new aso.a("synchronize_registries");
   private final List<aur> b;
   private final jx<aly> c;

   public atj(List<aur> $$0, jx<aly> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zr<?>> $$0) {
      $$0.accept(new abs(this.b));
   }

   private void a(Consumer<zr<?>> $$0, Set<aur> $$1) {
      DynamicOps<vj> $$2 = this.c.a().a(va.a);
      kh.a($$2, this.c.c(aly.b), $$1, ($$1x, $$2x) -> $$0.accept(new abq($$1x, $$2x)));
      $$0.accept(new aai(ayc.a(this.c)));
   }

   public void a(List<aur> $$0, Consumer<zr<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public aso.a a() {
      return a;
   }
}
