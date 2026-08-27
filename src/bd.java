import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bd {
   public static final Codec<bd> a = euw.a.listOf().xmap(bd::new, $$0 -> $$0.b);
   private final List<euu> b;
   private final Predicate<erp> c;

   bd(List<euu> $$0) {
      this.b = $$0;
      this.c = ad.a($$0);
   }

   public static bd a(euu... $$0) {
      return new bd(List.of($$0));
   }

   public boolean a(erp $$0) {
      return this.c.test($$0);
   }

   public void a(erv $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         euu $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
