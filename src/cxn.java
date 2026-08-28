import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cxn(List<wy> e, List<wy> f) implements cxw {
   public static final cxn a = new cxn(List.of());
   public static final int b = 256;
   private static final xv g = xv.a.a(n.f).b(true);
   public static final Codec<cxn> c = xa.g.sizeLimitedListOf(256).xmap(cxn::new, cxn::a);
   public static final yw<wj, cxn> d = xa.b.a(yu.c(256)).a(cxn::new, cxn::a);

   public cxn(List<wy> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xb.a($$0x.f(), g)));
   }

   public cxn(List<wy> e, List<wy> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public cxn a(wy $$0) {
      return new cxn(ad.a(this.e, $$0));
   }

   @Override
   public void a(cuj.b $$0, Consumer<wy> $$1, cwk $$2) {
      this.f.forEach($$1);
   }

   public List<wy> a() {
      return this.e;
   }

   public List<wy> b() {
      return this.f;
   }
}
