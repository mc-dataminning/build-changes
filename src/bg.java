import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bg {
   public static final Codec<bg> a = exh.e.listOf().xmap(bg::new, $$0 -> $$0.b);
   private final List<exh> b;
   private final Predicate<etw> c;

   bg(List<exh> $$0) {
      this.b = $$0;
      this.c = ad.a($$0);
   }

   public static bg a(exh... $$0) {
      return new bg(List.of($$0));
   }

   public boolean a(etw $$0) {
      return this.c.test($$0);
   }

   public void a(euc $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         exh $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
