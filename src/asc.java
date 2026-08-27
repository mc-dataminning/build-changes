import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class asc implements arj {
   public static final arj.a a = new arj.a("synchronize_registries");
   private final List<atk> b;
   private final jh<alc> c;

   public asc(List<atk> $$0, jh<alc> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zl<?>> $$0) {
      $$0.accept(new abi(this.b));
   }

   private void a(Consumer<zl<?>> $$0, Set<atk> $$1) {
      DynamicOps<vh> $$2 = this.c.a().a(uy.a);
      jr.a($$2, this.c.c(alc.b), $$1, ($$1x, $$2x) -> $$0.accept(new abh($$1x, $$2x)));
      $$0.accept(new aaa(aww.a(this.c)));
   }

   public void a(List<atk> $$0, Consumer<zl<?>> $$1) {
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
