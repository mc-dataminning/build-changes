import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bb {
   public static final Codec<bb> a = ekg.a.listOf().xmap(bb::new, $$0 -> $$0.b);
   private final List<eke> b;
   private final Predicate<ehf> c;

   bb(List<eke> $$0) {
      this.b = $$0;
      this.c = ekg.a($$0);
   }

   public static bb a(eke... $$0) {
      return new bb(List.of($$0));
   }

   public boolean a(ehf $$0) {
      return this.c.test($$0);
   }

   public void a(eho $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         eke $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
