import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bh {
   public static final Codec<bh> a = ezy.e.listOf().xmap(bh::new, $$0 -> $$0.b);
   private final List<ezy> b;
   private final Predicate<ewp> c;

   bh(List<ezy> $$0) {
      this.b = $$0;
      this.c = ae.a($$0);
   }

   public static bh a(ezy... $$0) {
      return new bh(List.of($$0));
   }

   public boolean a(ewp $$0) {
      return this.c.test($$0);
   }

   public void a(ewv $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         ezy $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
