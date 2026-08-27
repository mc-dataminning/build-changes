import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bb {
   public static final Codec<bb> a = ejx.a.listOf().xmap(bb::new, $$0 -> $$0.b);
   private final List<ejv> b;
   private final Predicate<egw> c;

   bb(List<ejv> $$0) {
      this.b = $$0;
      this.c = ejx.a($$0);
   }

   public static bb a(ejv... $$0) {
      return new bb(List.of($$0));
   }

   public boolean a(egw $$0) {
      return this.c.test($$0);
   }

   public void a(ehf $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         ejv $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
