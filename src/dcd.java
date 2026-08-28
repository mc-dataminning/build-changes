import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dcd(List<wy> e, List<wy> f) implements dcp {
   public static final dcd a = new dcd(List.of());
   public static final int b = 256;
   private static final xv g = xv.a.a(o.f).b(true);
   public static final Codec<dcd> c = xa.a.sizeLimitedListOf(256).xmap(dcd::new, dcd::a);
   public static final yw<wj, dcd> d = xa.b.a(yu.c(256)).a(dcd::new, dcd::a);

   public dcd(List<wy> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xb.a($$0x.f(), g)));
   }

   public dcd(List<wy> e, List<wy> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public dcd a(wy $$0) {
      return new dcd(ag.a(this.e, $$0));
   }

   @Override
   public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
      this.f.forEach($$1);
   }

   public List<wy> a() {
      return this.e;
   }

   public List<wy> b() {
      return this.f;
   }
}
