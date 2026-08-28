import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bg {
   public static final Codec<bg> a = eva.e.listOf().xmap(bg::new, $$0 -> $$0.b);
   private final List<eva> b;
   private final Predicate<erp> c;

   bg(List<eva> $$0) {
      this.b = $$0;
      this.c = ad.a($$0);
   }

   public static bg a(eva... $$0) {
      return new bg(List.of($$0));
   }

   public boolean a(erp $$0) {
      return this.c.test($$0);
   }

   public void a(erv $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         eva $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
