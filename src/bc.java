import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bc {
   public static final Codec<bc> a = erj.a.listOf().xmap(bc::new, $$0 -> $$0.b);
   private final List<erh> b;
   private final Predicate<eoa> c;

   bc(List<erh> $$0) {
      this.b = $$0;
      this.c = ac.a($$0);
   }

   public static bc a(erh... $$0) {
      return new bc(List.of($$0));
   }

   public boolean a(eoa $$0) {
      return this.c.test($$0);
   }

   public void a(eoj $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         erh $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
