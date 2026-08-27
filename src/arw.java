import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class arw implements ard {
   public static final ard.a a = new ard.a("synchronize_registries");
   private final List<ate> b;
   private final je<akw> c;

   public arw(List<ate> $$0, je<akw> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<ze<?>> $$0) {
      $$0.accept(new abc(this.b));
   }

   private void a(Consumer<ze<?>> $$0, Set<ate> $$1) {
      DynamicOps<va> $$2 = this.c.a().a(ur.a);
      jo.a($$2, this.c.c(akw.b), $$1, ($$1x, $$2x) -> $$0.accept(new aba($$1x, $$2x)));
      $$0.accept(new zt(awp.a(this.c)));
   }

   public void a(List<ate> $$0, Consumer<ze<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public ard.a a() {
      return a;
   }
}
