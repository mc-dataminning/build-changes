import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class atc implements ash {
   public static final ash.a a = new ash.a("synchronize_registries");
   private final List<auk> b;
   private final jx<alu> c;

   public atc(List<auk> $$0, jx<alu> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zs<?>> $$0) {
      $$0.accept(new abt(this.b));
   }

   private void a(Consumer<zs<?>> $$0, Set<auk> $$1) {
      DynamicOps<vk> $$2 = this.c.a().a(vb.a);
      kh.a($$2, this.c.c(alu.b), $$1, ($$1x, $$2x) -> $$0.accept(new abr($$1x, $$2x)));
      $$0.accept(new aaj(axv.a(this.c)));
   }

   public void a(List<auk> $$0, Consumer<zs<?>> $$1) {
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
