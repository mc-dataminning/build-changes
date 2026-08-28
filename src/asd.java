import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class asd implements ark {
   public static final ark.a a = new ark.a("synchronize_registries");
   private final List<atl> b;
   private final jt<ala> c;

   public asd(List<atl> $$0, jt<ala> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zg<?>> $$0) {
      $$0.accept(new abg(this.b));
   }

   private void a(Consumer<zg<?>> $$0, Set<atl> $$1) {
      DynamicOps<uy> $$2 = this.c.a().a(up.a);
      kd.a($$2, this.c.c(ala.b), $$1, ($$1x, $$2x) -> $$0.accept(new abe($$1x, $$2x)));
      $$0.accept(new zx(awx.a(this.c)));
   }

   public void a(List<atl> $$0, Consumer<zg<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public ark.a a() {
      return a;
   }
}
