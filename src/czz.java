import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record czz(List<xk> e, List<xk> f) implements daj {
   public static final czz a = new czz(List.of());
   public static final int b = 256;
   private static final yh g = yh.a.a(n.f).b(true);
   public static final Codec<czz> c = xm.g.sizeLimitedListOf(256).xmap(czz::new, czz::a);
   public static final zi<wv, czz> d = xm.b.a(zg.c(256)).a(czz::new, czz::a);

   public czz(List<xk> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xn.a($$0x.f(), g)));
   }

   public czz(List<xk> e, List<xk> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public czz a(xk $$0) {
      return new czz(ae.a(this.e, $$0));
   }

   @Override
   public void a(cxc.b $$0, Consumer<xk> $$1, cyy $$2) {
      this.f.forEach($$1);
   }

   public List<xk> a() {
      return this.e;
   }

   public List<xk> b() {
      return this.f;
   }
}
