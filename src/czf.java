import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record czf(List<xj> e, List<xj> f) implements czp {
   public static final czf a = new czf(List.of());
   public static final int b = 256;
   private static final yg g = yg.a.a(n.f).b(true);
   public static final Codec<czf> c = xl.g.sizeLimitedListOf(256).xmap(czf::new, czf::a);
   public static final zh<wu, czf> d = xl.b.a(zf.c(256)).a(czf::new, czf::a);

   public czf(List<xj> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xm.a($$0x.f(), g)));
   }

   public czf(List<xj> e, List<xj> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public czf a(xj $$0) {
      return new czf(ae.a(this.e, $$0));
   }

   @Override
   public void a(cwi.b $$0, Consumer<xj> $$1, cye $$2) {
      this.f.forEach($$1);
   }

   public List<xj> a() {
      return this.e;
   }

   public List<xj> b() {
      return this.f;
   }
}
