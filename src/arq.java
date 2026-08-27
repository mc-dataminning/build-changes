import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class arq implements aqx {
   public static final aqx.a a = new aqx.a("synchronize_registries");
   private final List<asy> b;
   private final jd<akq> c;

   public arq(List<asy> $$0, jd<akq> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zb<?>> $$0) {
      $$0.accept(new aay(this.b));
   }

   private void a(Consumer<zb<?>> $$0, Set<asy> $$1) {
      DynamicOps<ux> $$2 = this.c.a().a(uo.a);
      jn.a($$2, this.c.c(akq.b), $$1, ($$1x, $$2x) -> $$0.accept(new aax($$1x, $$2x)));
      $$0.accept(new zq(awj.a(this.c)));
   }

   public void a(List<asy> $$0, Consumer<zb<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public aqx.a a() {
      return a;
   }
}
