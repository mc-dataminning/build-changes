import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bb {
   public static final Codec<bb> a = ejf.a.listOf().xmap(bb::new, $$0 -> $$0.b);
   private final List<ejd> b;
   private final Predicate<ege> c;

   bb(List<ejd> $$0) {
      this.b = $$0;
      this.c = ejf.a($$0);
   }

   public static bb a(ejd... $$0) {
      return new bb(List.of($$0));
   }

   public boolean a(ege $$0) {
      return this.c.test($$0);
   }

   public void a(egn $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         ejd $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
