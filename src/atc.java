import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class atc implements ash {
   public static final ash.a a = new ash.a("synchronize_registries");
   private final List<auj> b;
   private final jl<alp> c;

   public atc(List<auj> $$0, jl<alp> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zf<?>> $$0) {
      $$0.accept(new abg(this.b));
   }

   private void a(Consumer<zf<?>> $$0, Set<auj> $$1) {
      DynamicOps<uw> $$2 = this.c.a().a(un.a);
      jv.a($$2, this.c.c(alp.b), $$1, ($$1x, $$2x) -> $$0.accept(new abe($$1x, $$2x)));
      $$0.accept(new zw(axt.a(this.c)));
   }

   public void a(List<auj> $$0, Consumer<zf<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public ash.a a() {
      return a;
   }
}
