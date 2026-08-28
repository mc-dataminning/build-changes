import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cxm(List<xp> e, List<xp> f) implements cxv {
   public static final cxm a = new cxm(List.of());
   public static final int b = 256;
   private static final ym g = ym.a.a(n.f).b(true);
   public static final Codec<cxm> c = xr.g.sizeLimitedListOf(256).xmap(cxm::new, cxm::a);
   public static final zn<xa, cxm> d = xr.b.a(zl.c(256)).a(cxm::new, cxm::a);

   public cxm(List<xp> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xs.a($$0x.f(), g)));
   }

   public cxm(List<xp> e, List<xp> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public cxm a(xp $$0) {
      return new cxm(ac.a(this.e, $$0));
   }

   @Override
   public void a(cuk.b $$0, Consumer<xp> $$1, cwi $$2) {
      this.f.forEach($$1);
   }

   public List<xp> a() {
      return this.e;
   }

   public List<xp> b() {
      return this.f;
   }
}
