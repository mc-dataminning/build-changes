import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bh {
   public static final Codec<bh> a = exy.e.listOf().xmap(bh::new, $$0 -> $$0.b);
   private final List<exy> b;
   private final Predicate<eun> c;

   bh(List<exy> $$0) {
      this.b = $$0;
      this.c = ae.a($$0);
   }

   public static bh a(exy... $$0) {
      return new bh(List.of($$0));
   }

   public boolean a(eun $$0) {
      return this.c.test($$0);
   }

   public void a(eut $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         exy $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
