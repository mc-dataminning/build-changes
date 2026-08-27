import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class ard implements aqk {
   public static final aqk.a a = new aqk.a("synchronize_registries");
   private final List<asl> b;
   private final iu<ake> c;

   public ard(List<asl> $$0, iu<ake> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<yp<?>> $$0) {
      $$0.accept(new aam(this.b));
   }

   private void a(Consumer<yp<?>> $$0, Set<asl> $$1) {
      DynamicOps<ul> $$2 = this.c.a().a(uc.a);
      je.a($$2, this.c.c(ake.b), $$1, ($$1x, $$2x) -> $$0.accept(new aal($$1x, $$2x)));
      $$0.accept(new ze(avw.a(this.c)));
   }

   public void a(List<asl> $$0, Consumer<yp<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public aqk.a a() {
      return a;
   }
}
