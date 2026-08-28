import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cxl(List<xo> e, List<xo> f) implements cxu {
   public static final cxl a = new cxl(List.of());
   public static final int b = 256;
   private static final yl g = yl.a.a(n.f).b(true);
   public static final Codec<cxl> c = xq.g.sizeLimitedListOf(256).xmap(cxl::new, cxl::a);
   public static final zm<wz, cxl> d = xq.b.a(zk.c(256)).a(cxl::new, cxl::a);

   public cxl(List<xo> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xr.a($$0x.f(), g)));
   }

   public cxl(List<xo> e, List<xo> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public cxl a(xo $$0) {
      return new cxl(ac.a(this.e, $$0));
   }

   @Override
   public void a(cuj.b $$0, Consumer<xo> $$1, cwh $$2) {
      this.f.forEach($$1);
   }

   public List<xo> a() {
      return this.e;
   }

   public List<xo> b() {
      return this.f;
   }
}
