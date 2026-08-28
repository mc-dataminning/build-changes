import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dct(List<xc> e, List<xc> f) implements ddf {
   public static final dct a = new dct(List.of());
   public static final int b = 256;
   private static final xz g = xz.a.a(o.f).b(true);
   public static final Codec<dct> c = xe.a.sizeLimitedListOf(256).xmap(dct::new, dct::a);
   public static final za<wn, dct> d = xe.b.a(yy.c(256)).a(dct::new, dct::a);

   public dct(List<xc> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xf.a($$0x.f(), g)));
   }

   public dct(List<xc> e, List<xc> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public dct a(xc $$0) {
      return new dct(ag.a(this.e, $$0));
   }

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      this.f.forEach($$1);
   }

   public List<xc> a() {
      return this.e;
   }

   public List<xc> b() {
      return this.f;
   }
}
