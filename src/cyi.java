import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cyi(List<xd> e, List<xd> f) implements cyr {
   public static final cyi a = new cyi(List.of());
   public static final int b = 256;
   private static final ya g = ya.a.a(n.f).b(true);
   public static final Codec<cyi> c = xf.g.sizeLimitedListOf(256).xmap(cyi::new, cyi::a);
   public static final zb<wo, cyi> d = xf.b.a(yz.c(256)).a(cyi::new, cyi::a);

   public cyi(List<xd> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xg.a($$0x.f(), g)));
   }

   public cyi(List<xd> e, List<xd> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public cyi a(xd $$0) {
      return new cyi(ad.a(this.e, $$0));
   }

   @Override
   public void a(cvg.b $$0, Consumer<xd> $$1, cxf $$2) {
      this.f.forEach($$1);
   }

   public List<xd> a() {
      return this.e;
   }

   public List<xd> b() {
      return this.f;
   }
}
