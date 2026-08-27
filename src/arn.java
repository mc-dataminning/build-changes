import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class arn implements aqu {
   public static final aqu.a a = new aqu.a("synchronize_registries");
   private final List<asv> b;
   private final jc<ako> c;

   public arn(List<asv> $$0, jc<ako> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<yz<?>> $$0) {
      $$0.accept(new aaw(this.b));
   }

   private void a(Consumer<yz<?>> $$0, Set<asv> $$1) {
      DynamicOps<uv> $$2 = this.c.a().a(um.a);
      jm.a($$2, this.c.c(ako.b), $$1, ($$1x, $$2x) -> $$0.accept(new aav($$1x, $$2x)));
      $$0.accept(new zo(awg.a(this.c)));
   }

   public void a(List<asv> $$0, Consumer<yz<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public aqu.a a() {
      return a;
   }
}
