import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class asc implements arj {
   public static final arj.a a = new arj.a("synchronize_registries");
   private final List<atk> b;
   private final jt<akz> c;

   public asc(List<atk> $$0, jt<akz> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zf<?>> $$0) {
      $$0.accept(new abf(this.b));
   }

   private void a(Consumer<zf<?>> $$0, Set<atk> $$1) {
      DynamicOps<ux> $$2 = this.c.a().a(uo.a);
      kd.a($$2, this.c.c(akz.b), $$1, ($$1x, $$2x) -> $$0.accept(new abd($$1x, $$2x)));
      $$0.accept(new zw(aww.a(this.c)));
   }

   public void a(List<atk> $$0, Consumer<zf<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public arj.a a() {
      return a;
   }
}
