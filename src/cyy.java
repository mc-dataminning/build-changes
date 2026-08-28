import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cyy(List<xl> e, List<xl> f) implements czi {
   public static final cyy a = new cyy(List.of());
   public static final int b = 256;
   private static final yi g = yi.a.a(n.f).b(true);
   public static final Codec<cyy> c = xn.g.sizeLimitedListOf(256).xmap(cyy::new, cyy::a);
   public static final zj<ww, cyy> d = xn.b.a(zh.c(256)).a(cyy::new, cyy::a);

   public cyy(List<xl> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xo.a($$0x.f(), g)));
   }

   public cyy(List<xl> e, List<xl> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public cyy a(xl $$0) {
      return new cyy(ae.a(this.e, $$0));
   }

   @Override
   public void a(cwb.b $$0, Consumer<xl> $$1, cxx $$2) {
      this.f.forEach($$1);
   }

   public List<xl> a() {
      return this.e;
   }

   public List<xl> b() {
      return this.f;
   }
}
