import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bg {
   public static final Codec<bg> a = ewe.e.listOf().xmap(bg::new, $$0 -> $$0.b);
   private final List<ewe> b;
   private final Predicate<est> c;

   bg(List<ewe> $$0) {
      this.b = $$0;
      this.c = ad.a($$0);
   }

   public static bg a(ewe... $$0) {
      return new bg(List.of($$0));
   }

   public boolean a(est $$0) {
      return this.c.test($$0);
   }

   public void a(esz $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         ewe $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
