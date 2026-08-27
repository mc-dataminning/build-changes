import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bb {
   public static final Codec<bb> a = ejq.a.listOf().xmap(bb::new, $$0 -> $$0.b);
   private final List<ejo> b;
   private final Predicate<egp> c;

   bb(List<ejo> $$0) {
      this.b = $$0;
      this.c = ejq.a($$0);
   }

   public static bb a(ejo... $$0) {
      return new bb(List.of($$0));
   }

   public boolean a(egp $$0) {
      return this.c.test($$0);
   }

   public void a(egy $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         ejo $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
