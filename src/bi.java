import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bi {
   public static final Codec<bi> a = fcq.e.listOf().xmap(bi::new, $$0 -> $$0.b);
   private final List<fcq> b;
   private final Predicate<ezh> c;

   bi(List<fcq> $$0) {
      this.b = $$0;
      this.c = af.a($$0);
   }

   public static bi a(fcq... $$0) {
      return new bi(List.of($$0));
   }

   public boolean a(ezh $$0) {
      return this.c.test($$0);
   }

   public void a(ezn $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         fcq $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
