import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bj {
   public static final Codec<bj> a = fdc.e.listOf().xmap(bj::new, $$0 -> $$0.b);
   private final List<fdc> b;
   private final Predicate<ezt> c;

   bj(List<fdc> $$0) {
      this.b = $$0;
      this.c = ag.a($$0);
   }

   public static bj a(fdc... $$0) {
      return new bj(List.of($$0));
   }

   public boolean a(ezt $$0) {
      return this.c.test($$0);
   }

   public void a(ezz $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         fdc $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
