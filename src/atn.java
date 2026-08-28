import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class atn implements ass {
   public static final ass.a a = new ass.a("synchronize_registries");
   private final List<auu> b;
   private final jn<ama> c;

   public atn(List<auu> $$0, jn<ama> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zo<?>> $$0) {
      $$0.accept(new abr(this.b));
   }

   private void a(Consumer<zo<?>> $$0, Set<auu> $$1) {
      DynamicOps<va> $$2 = this.c.a().a(uo.a);
      jx.a($$2, this.c.c(ama.b), $$1, ($$1x, $$2x) -> $$0.accept(new abp($$1x, $$2x)));
      $$0.accept(new aah(aye.a(this.c)));
   }

   public void a(List<auu> $$0, Consumer<zo<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public ass.a a() {
      return a;
   }
}
