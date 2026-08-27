import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bc {
   public static final Codec<bc> a = env.a.listOf().xmap(bc::new, $$0 -> $$0.b);
   private final List<ent> b;
   private final Predicate<eku> c;

   bc(List<ent> $$0) {
      this.b = $$0;
      this.c = ac.a($$0);
   }

   public static bc a(ent... $$0) {
      return new bc(List.of($$0));
   }

   public boolean a(eku $$0) {
      return this.c.test($$0);
   }

   public void a(eld $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         ent $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
