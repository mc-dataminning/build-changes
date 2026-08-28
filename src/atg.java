import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class atg implements asl {
   public static final asl.a a = new asl.a("synchronize_registries");
   private final List<aun> b;
   private final jn<alt> c;

   public atg(List<aun> $$0, jn<alt> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zj<?>> $$0) {
      $$0.accept(new abk(this.b));
   }

   private void a(Consumer<zj<?>> $$0, Set<aun> $$1) {
      DynamicOps<va> $$2 = this.c.a().a(uo.a);
      jx.a($$2, this.c.c(alt.b), $$1, ($$1x, $$2x) -> $$0.accept(new abi($$1x, $$2x)));
      $$0.accept(new aaa(axx.a(this.c)));
   }

   public void a(List<aun> $$0, Consumer<zj<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public asl.a a() {
      return a;
   }
}
