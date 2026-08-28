import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bg {
   public static final Codec<bg> a = euw.e.listOf().xmap(bg::new, $$0 -> $$0.b);
   private final List<euw> b;
   private final Predicate<erl> c;

   bg(List<euw> $$0) {
      this.b = $$0;
      this.c = ad.a($$0);
   }

   public static bg a(euw... $$0) {
      return new bg(List.of($$0));
   }

   public boolean a(erl $$0) {
      return this.c.test($$0);
   }

   public void a(err $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         euw $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
