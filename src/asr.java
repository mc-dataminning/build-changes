import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class asr implements arw {
   public static final arw.a a = new arw.a("synchronize_registries");
   private final List<atz> b;
   private final ju<alk> c;

   public asr(List<atz> $$0, ju<alk> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zk<?>> $$0) {
      $$0.accept(new abl(this.b));
   }

   private void a(Consumer<zk<?>> $$0, Set<atz> $$1) {
      DynamicOps<vc> $$2 = this.c.a().a(ut.a);
      ke.a($$2, this.c.c(alk.b), $$1, ($$1x, $$2x) -> $$0.accept(new abj($$1x, $$2x)));
      $$0.accept(new aab(axk.a(this.c)));
   }

   public void a(List<atz> $$0, Consumer<zk<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public arw.a a() {
      return a;
   }
}
