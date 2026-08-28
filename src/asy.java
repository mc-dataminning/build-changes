import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class asy implements asd {
   public static final asd.a a = new asd.a("synchronize_registries");
   private final List<aug> b;
   private final jw<alq> c;

   public asy(List<aug> $$0, jw<alq> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zo<?>> $$0) {
      $$0.accept(new abp(this.b));
   }

   private void a(Consumer<zo<?>> $$0, Set<aug> $$1) {
      DynamicOps<vg> $$2 = this.c.a().a(ux.a);
      kg.a($$2, this.c.c(alq.b), $$1, ($$1x, $$2x) -> $$0.accept(new abn($$1x, $$2x)));
      $$0.accept(new aaf(axr.a(this.c)));
   }

   public void a(List<aug> $$0, Consumer<zo<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public asd.a a() {
      return a;
   }
}
