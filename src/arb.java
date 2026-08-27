import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class arb implements aqi {
   public static final aqi.a a = new aqi.a("synchronize_registries");
   private final List<asj> b;
   private final is<akc> c;

   public arb(List<asj> $$0, is<akc> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<yn<?>> $$0) {
      $$0.accept(new aak(this.b));
   }

   private void a(Consumer<yn<?>> $$0, Set<asj> $$1) {
      DynamicOps<uj> $$2 = this.c.a().a(ua.a);
      jc.a($$2, this.c.c(akc.b), $$1, ($$1x, $$2x) -> $$0.accept(new aaj($$1x, $$2x)));
      $$0.accept(new zc(avu.a(this.c)));
   }

   public void a(List<asj> $$0, Consumer<yn<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public aqi.a a() {
      return a;
   }
}
