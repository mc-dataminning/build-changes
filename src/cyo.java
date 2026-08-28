import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cyo(List<xh> e, List<xh> f) implements cyy {
   public static final cyo a = new cyo(List.of());
   public static final int b = 256;
   private static final ye g = ye.a.a(n.f).b(true);
   public static final Codec<cyo> c = xj.g.sizeLimitedListOf(256).xmap(cyo::new, cyo::a);
   public static final zf<ws, cyo> d = xj.b.a(zd.c(256)).a(cyo::new, cyo::a);

   public cyo(List<xh> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xk.a($$0x.f(), g)));
   }

   public cyo(List<xh> e, List<xh> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public cyo a(xh $$0) {
      return new cyo(ad.a(this.e, $$0));
   }

   @Override
   public void a(cvt.b $$0, Consumer<xh> $$1, cxp $$2) {
      this.f.forEach($$1);
   }

   public List<xh> a() {
      return this.e;
   }

   public List<xh> b() {
      return this.f;
   }
}
