import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class ask implements arr {
   public static final arr.a a = new arr.a("synchronize_registries");
   private final List<ats> b;
   private final jp<alk> c;

   public ask(List<ats> $$0, jp<alk> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zs<?>> $$0) {
      $$0.accept(new abq(this.b));
   }

   private void a(Consumer<zs<?>> $$0, Set<ats> $$1) {
      DynamicOps<vo> $$2 = this.c.a().a(vf.a);
      jz.a($$2, this.c.c(alk.b), $$1, ($$1x, $$2x) -> $$0.accept(new abo($$1x, $$2x)));
      $$0.accept(new aah(axe.a(this.c)));
   }

   public void a(List<ats> $$0, Consumer<zs<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public arr.a a() {
      return a;
   }
}
