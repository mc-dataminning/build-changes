import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class ass implements arx {
   public static final arx.a a = new arx.a("synchronize_registries");
   private final List<aua> b;
   private final ju<all> c;

   public ass(List<aua> $$0, ju<all> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zk<?>> $$0) {
      $$0.accept(new abl(this.b));
   }

   private void a(Consumer<zk<?>> $$0, Set<aua> $$1) {
      DynamicOps<vc> $$2 = this.c.a().a(ut.a);
      ke.a($$2, this.c.c(all.b), $$1, ($$1x, $$2x) -> $$0.accept(new abj($$1x, $$2x)));
      $$0.accept(new aab(axl.a(this.c)));
   }

   public void a(List<aua> $$0, Consumer<zk<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public arx.a a() {
      return a;
   }
}
