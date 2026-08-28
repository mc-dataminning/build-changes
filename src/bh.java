import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bh {
   public static final Codec<bh> a = exr.e.listOf().xmap(bh::new, $$0 -> $$0.b);
   private final List<exr> b;
   private final Predicate<eug> c;

   bh(List<exr> $$0) {
      this.b = $$0;
      this.c = ae.a($$0);
   }

   public static bh a(exr... $$0) {
      return new bh(List.of($$0));
   }

   public boolean a(eug $$0) {
      return this.c.test($$0);
   }

   public void a(eum $$0) {
      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         exr $$2 = this.b.get($$1);
         $$2.a($$0.a("[" + $$1 + "]"));
      }
   }
}
