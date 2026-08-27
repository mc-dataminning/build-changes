import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cuk(List<wi> d, List<wi> e) implements cus {
   public static final cuk a = new cuk(List.of());
   private static final int f = 256;
   private static final xf g = xf.a.a(n.f).b(true);
   public static final Codec<cuk> b = awu.a(wk.g.listOf(), 256).xmap(cuk::new, cuk::a);
   public static final yg<vt, cuk> c = wk.b.a(ye.c(256)).a(cuk::new, cuk::a);

   public cuk(List<wi> $$0) {
      this($$0, Lists.transform($$0, $$0x -> wl.a($$0x.f(), g)));
   }

   public cuk a(wi $$0) {
      return new cuk(ac.a(this.d, $$0));
   }

   @Override
   public void a(Consumer<wi> $$0, cti $$1) {
      this.e.forEach($$0);
   }

   public List<wi> a() {
      return this.d;
   }

   public List<wi> b() {
      return this.e;
   }
}
