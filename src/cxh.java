import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cxh(List<xl> e, List<xl> f) implements cxq {
   public static final cxh a = new cxh(List.of());
   public static final int b = 256;
   private static final yi g = yi.a.a(n.f).b(true);
   public static final Codec<cxh> c = xn.g.sizeLimitedListOf(256).xmap(cxh::new, cxh::a);
   public static final zj<ww, cxh> d = xn.b.a(zh.c(256)).a(cxh::new, cxh::a);

   public cxh(List<xl> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xo.a($$0x.f(), g)));
   }

   public cxh(List<xl> e, List<xl> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public cxh a(xl $$0) {
      return new cxh(ac.a(this.e, $$0));
   }

   @Override
   public void a(cuf.b $$0, Consumer<xl> $$1, cwd $$2) {
      this.f.forEach($$1);
   }

   public List<xl> a() {
      return this.e;
   }

   public List<xl> b() {
      return this.f;
   }
}
