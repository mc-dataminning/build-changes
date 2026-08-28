import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class arv implements arc {
   public static final arc.a a = new arc.a("synchronize_registries");
   private final List<atd> b;
   private final jq<akt> c;

   public arv(List<atd> $$0, jq<akt> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zb<?>> $$0) {
      $$0.accept(new aaz(this.b));
   }

   private void a(Consumer<zb<?>> $$0, Set<atd> $$1) {
      DynamicOps<uu> $$2 = this.c.a().a(ul.a);
      ka.a($$2, this.c.c(akt.b), $$1, ($$1x, $$2x) -> $$0.accept(new aax($$1x, $$2x)));
      $$0.accept(new zq(awp.a(this.c)));
   }

   public void a(List<atd> $$0, Consumer<zb<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public arc.a a() {
      return a;
   }
}
