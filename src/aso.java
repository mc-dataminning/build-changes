import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class aso implements arv {
   public static final arv.a a = new arv.a("synchronize_registries");
   private final List<atw> b;
   private final jp<alo> c;

   public aso(List<atw> $$0, jp<alo> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zw<?>> $$0) {
      $$0.accept(new abu(this.b));
   }

   private void a(Consumer<zw<?>> $$0, Set<atw> $$1) {
      DynamicOps<vp> $$2 = this.c.a().a(vg.a);
      jz.a($$2, this.c.c(alo.b), $$1, ($$1x, $$2x) -> $$0.accept(new abs($$1x, $$2x)));
      $$0.accept(new aal(axi.a(this.c)));
   }

   public void a(List<atw> $$0, Consumer<zw<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public arv.a a() {
      return a;
   }
}
