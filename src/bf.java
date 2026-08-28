import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bf {
   public static final Codec<bf> a = etp.a.listOf().xmap(bf::new, $$0 -> $$0.b);
   private final List<etn> b;
   private final Predicate<eqd> c;

   bf(List<etn> $$0) {
      this.b = $$0;
      this.c = ac.a($$0);
   }

   public static bf a(etn... $$0) {
      return new bf(List.of($$0));
   }

   public boolean a(eqd $$0) {
      return this.c.test($$0);
   }

   public void a(eqj $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         etn $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
