import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bc {
   public static final Codec<bc> a = ers.a.listOf().xmap(bc::new, $$0 -> $$0.b);
   private final List<erq> b;
   private final Predicate<eol> c;

   bc(List<erq> $$0) {
      this.b = $$0;
      this.c = ac.a($$0);
   }

   public static bc a(erq... $$0) {
      return new bc(List.of($$0));
   }

   public boolean a(eol $$0) {
      return this.c.test($$0);
   }

   public void a(eor $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         erq $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
