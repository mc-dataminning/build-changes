import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class asz implements ase {
   public static final ase.a a = new ase.a("synchronize_registries");
   private final List<auh> b;
   private final jx<alr> c;

   public asz(List<auh> $$0, jx<alr> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zp<?>> $$0) {
      $$0.accept(new abq(this.b));
   }

   private void a(Consumer<zp<?>> $$0, Set<auh> $$1) {
      DynamicOps<vh> $$2 = this.c.a().a(uy.a);
      kh.a($$2, this.c.c(alr.b), $$1, ($$1x, $$2x) -> $$0.accept(new abo($$1x, $$2x)));
      $$0.accept(new aag(axs.a(this.c)));
   }

   public void a(List<auh> $$0, Consumer<zp<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public ase.a a() {
      return a;
   }
}
