import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class aso implements art {
   public static final art.a a = new art.a("synchronize_registries");
   private final List<atw> b;
   private final jy<ald> c;

   public aso(List<atw> $$0, jy<ald> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<yv<?>> $$0) {
      $$0.accept(new aaw(this.b));
   }

   private void a(Consumer<yv<?>> $$0, Set<atw> $$1) {
      DynamicOps<un> $$2 = this.c.a().a(ue.a);
      ki.a($$2, this.c.c(ald.b), $$1, ($$1x, $$2x) -> $$0.accept(new aau($$1x, $$2x)));
      $$0.accept(new zm(axh.a(this.c)));
   }

   public void a(List<atw> $$0, Consumer<yv<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public art.a a() {
      return a;
   }
}
