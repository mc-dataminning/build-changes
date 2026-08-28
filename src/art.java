import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class art implements ara {
   public static final ara.a a = new ara.a("synchronize_registries");
   private final List<atb> b;
   private final jq<akt> c;

   public art(List<atb> $$0, jq<akt> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zb<?>> $$0) {
      $$0.accept(new aaz(this.b));
   }

   private void a(Consumer<zb<?>> $$0, Set<atb> $$1) {
      DynamicOps<uu> $$2 = this.c.a().a(ul.a);
      ka.a($$2, this.c.c(akt.b), $$1, ($$1x, $$2x) -> $$0.accept(new aax($$1x, $$2x)));
      $$0.accept(new zq(awn.a(this.c)));
   }

   public void a(List<atb> $$0, Consumer<zb<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public ara.a a() {
      return a;
   }
}
