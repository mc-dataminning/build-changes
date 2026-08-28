import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class ate implements asj {
   public static final asj.a a = new asj.a("synchronize_registries");
   private final List<aul> b;
   private final jm<alr> c;

   public ate(List<aul> $$0, jm<alr> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zh<?>> $$0) {
      $$0.accept(new abi(this.b));
   }

   private void a(Consumer<zh<?>> $$0, Set<aul> $$1) {
      DynamicOps<uy> $$2 = this.c.a().a(un.a);
      jw.a($$2, this.c.c(alr.b), $$1, ($$1x, $$2x) -> $$0.accept(new abg($$1x, $$2x)));
      $$0.accept(new zy(axv.a(this.c)));
   }

   public void a(List<aul> $$0, Consumer<zh<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public asj.a a() {
      return a;
   }
}
