import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bj {
   public static final Codec<bj> a = fdq.e.listOf().xmap(bj::new, $$0 -> $$0.b);
   private final List<fdq> b;
   private final Predicate<fah> c;

   bj(List<fdq> $$0) {
      this.b = $$0;
      this.c = ag.a($$0);
   }

   public static bj a(fdq... $$0) {
      return new bj(List.of($$0));
   }

   public boolean a(fah $$0) {
      return this.c.test($$0);
   }

   public void a(fan $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         fdq $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
