import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class asu implements arz {
   public static final arz.a a = new arz.a("synchronize_registries");
   private final List<auc> b;
   private final jv<aln> c;

   public asu(List<auc> $$0, jv<aln> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zl<?>> $$0) {
      $$0.accept(new abm(this.b));
   }

   private void a(Consumer<zl<?>> $$0, Set<auc> $$1) {
      DynamicOps<vd> $$2 = this.c.a().a(uu.a);
      kf.a($$2, this.c.c(aln.b), $$1, ($$1x, $$2x) -> $$0.accept(new abk($$1x, $$2x)));
      $$0.accept(new aac(axn.a(this.c)));
   }

   public void a(List<auc> $$0, Consumer<zl<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public arz.a a() {
      return a;
   }
}
