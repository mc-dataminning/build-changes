import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class aqn implements apv {
   public static final apv.a a = new apv.a("synchronize_registries");
   private final List<arv> b;
   private final is<ajq> c;

   public aqn(List<arv> $$0, is<ajq> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<yb<?>> $$0) {
      $$0.accept(new zy(this.b));
   }

   private void a(Consumer<yb<?>> $$0, Set<arv> $$1) {
      DynamicOps<tx> $$2 = this.c.a().a(to.a);
      jc.a($$2, this.c.c(ajq.b), $$1, ($$1x, $$2x) -> $$0.accept(new zx($$1x, $$2x)));
      $$0.accept(new yq(avg.a(this.c)));
   }

   public void a(List<arv> $$0, Consumer<yb<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public apv.a a() {
      return a;
   }
}
