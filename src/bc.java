import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bc {
   public static final Codec<bc> a = emd.a.listOf().xmap(bc::new, $$0 -> $$0.b);
   private final List<emb> b;
   private final Predicate<ejc> c;

   bc(List<emb> $$0) {
      this.b = $$0;
      this.c = emd.a($$0);
   }

   public static bc a(emb... $$0) {
      return new bc(List.of($$0));
   }

   public boolean a(ejc $$0) {
      return this.c.test($$0);
   }

   public void a(ejl $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         emb $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
