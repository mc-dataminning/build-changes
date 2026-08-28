import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class atb implements asg {
   public static final asg.a a = new asg.a("synchronize_registries");
   private final List<auj> b;
   private final jx<als> c;

   public atb(List<auj> $$0, jx<als> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zq<?>> $$0) {
      $$0.accept(new abr(this.b));
   }

   private void a(Consumer<zq<?>> $$0, Set<auj> $$1) {
      DynamicOps<vi> $$2 = this.c.a().a(uz.a);
      kh.a($$2, this.c.c(als.b), $$1, ($$1x, $$2x) -> $$0.accept(new abp($$1x, $$2x)));
      $$0.accept(new aah(axu.a(this.c)));
   }

   public void a(List<auj> $$0, Consumer<zq<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public asg.a a() {
      return a;
   }
}
