import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bj {
   public static final Codec<bj> a = fec.e.listOf().xmap(bj::new, $$0 -> $$0.b);
   private final List<fec> b;
   private final Predicate<fat> c;

   bj(List<fec> $$0) {
      this.b = $$0;
      this.c = ag.a($$0);
   }

   public static bj a(fec... $$0) {
      return new bj(List.of($$0));
   }

   public boolean a(fat $$0) {
      return this.c.test($$0);
   }

   public void a(faz $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         fec $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
