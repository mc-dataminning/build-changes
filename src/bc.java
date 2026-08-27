import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bc {
   public static final Codec<bc> a = elw.a.listOf().xmap(bc::new, $$0 -> $$0.b);
   private final List<elu> b;
   private final Predicate<eiv> c;

   bc(List<elu> $$0) {
      this.b = $$0;
      this.c = elw.a($$0);
   }

   public static bc a(elu... $$0) {
      return new bc(List.of($$0));
   }

   public boolean a(eiv $$0) {
      return this.c.test($$0);
   }

   public void a(eje $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         elu $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
