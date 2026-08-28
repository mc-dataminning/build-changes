import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bh {
   public static final Codec<bh> a = exn.e.listOf().xmap(bh::new, $$0 -> $$0.b);
   private final List<exn> b;
   private final Predicate<euc> c;

   bh(List<exn> $$0) {
      this.b = $$0;
      this.c = ae.a($$0);
   }

   public static bh a(exn... $$0) {
      return new bh(List.of($$0));
   }

   public boolean a(euc $$0) {
      return this.c.test($$0);
   }

   public void a(eui $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         exn $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
