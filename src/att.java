import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class att implements asy {
   public static final asy.a a = new asy.a("synchronize_registries");
   private final List<avc> b;
   private final jx<ami> c;

   public att(List<avc> $$0, jx<ami> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<aac<?>> $$0) {
      $$0.accept(new acd(this.b));
   }

   private void a(Consumer<aac<?>> $$0, Set<avc> $$1) {
      DynamicOps<vu> $$2 = this.c.a().a(vl.a);
      kh.a($$2, this.c.c(ami.b), $$1, ($$1x, $$2x) -> $$0.accept(new acb($$1x, $$2x)));
      $$0.accept(new aat(aym.a(this.c)));
   }

   public void a(List<avc> $$0, Consumer<aac<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public asy.a a() {
      return a;
   }
}
