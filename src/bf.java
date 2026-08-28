import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bf {
   public static final Codec<bf> a = euh.e.listOf().xmap(bf::new, $$0 -> $$0.b);
   private final List<euh> b;
   private final Predicate<eqw> c;

   bf(List<euh> $$0) {
      this.b = $$0;
      this.c = ac.a($$0);
   }

   public static bf a(euh... $$0) {
      return new bf(List.of($$0));
   }

   public boolean a(eqw $$0) {
      return this.c.test($$0);
   }

   public void a(erc $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         euh $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
