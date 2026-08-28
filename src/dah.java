import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dah(List<xv> e, List<xv> f) implements dar {
   public static final dah a = new dah(List.of());
   public static final int b = 256;
   private static final ys g = ys.a.a(n.f).b(true);
   public static final Codec<dah> c = xx.g.sizeLimitedListOf(256).xmap(dah::new, dah::a);
   public static final zt<xg, dah> d = xx.b.a(zr.c(256)).a(dah::new, dah::a);

   public dah(List<xv> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xy.a($$0x.f(), g)));
   }

   public dah(List<xv> e, List<xv> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public dah a(xv $$0) {
      return new dah(ae.a(this.e, $$0));
   }

   @Override
   public void a(cxk.b $$0, Consumer<xv> $$1, czg $$2) {
      this.f.forEach($$1);
   }

   public List<xv> a() {
      return this.e;
   }

   public List<xv> b() {
      return this.f;
   }
}
