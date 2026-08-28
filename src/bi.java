import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bi {
   public static final Codec<bi> a = fci.e.listOf().xmap(bi::new, $$0 -> $$0.b);
   private final List<fci> b;
   private final Predicate<eyz> c;

   bi(List<fci> $$0) {
      this.b = $$0;
      this.c = af.a($$0);
   }

   public static bi a(fci... $$0) {
      return new bi(List.of($$0));
   }

   public boolean a(eyz $$0) {
      return this.c.test($$0);
   }

   public void a(ezf $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         fci $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
