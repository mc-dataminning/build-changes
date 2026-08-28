import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cxk(List<xo> e, List<xo> f) implements cxt {
   public static final cxk a = new cxk(List.of());
   public static final int b = 256;
   private static final yl g = yl.a.a(n.f).b(true);
   public static final Codec<cxk> c = xq.g.sizeLimitedListOf(256).xmap(cxk::new, cxk::a);
   public static final zm<wz, cxk> d = xq.b.a(zk.c(256)).a(cxk::new, cxk::a);

   public cxk(List<xo> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xr.a($$0x.f(), g)));
   }

   public cxk(List<xo> e, List<xo> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public cxk a(xo $$0) {
      return new cxk(ac.a(this.e, $$0));
   }

   @Override
   public void a(cui.b $$0, Consumer<xo> $$1, cwg $$2) {
      this.f.forEach($$1);
   }

   public List<xo> a() {
      return this.e;
   }

   public List<xo> b() {
      return this.f;
   }
}
