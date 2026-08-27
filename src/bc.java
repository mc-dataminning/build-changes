import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bc {
   public static final Codec<bc> a = eqn.a.listOf().xmap(bc::new, $$0 -> $$0.b);
   private final List<eql> b;
   private final Predicate<enk> c;

   bc(List<eql> $$0) {
      this.b = $$0;
      this.c = ac.a($$0);
   }

   public static bc a(eql... $$0) {
      return new bc(List.of($$0));
   }

   public boolean a(enk $$0) {
      return this.c.test($$0);
   }

   public void a(ent $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         eql $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
