import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dai(List<xv> e, List<xv> f) implements das {
   public static final dai a = new dai(List.of());
   public static final int b = 256;
   private static final ys g = ys.a.a(n.f).b(true);
   public static final Codec<dai> c = xx.g.sizeLimitedListOf(256).xmap(dai::new, dai::a);
   public static final zt<xg, dai> d = xx.b.a(zr.c(256)).a(dai::new, dai::a);

   public dai(List<xv> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xy.a($$0x.f(), g)));
   }

   public dai(List<xv> e, List<xv> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public dai a(xv $$0) {
      return new dai(ae.a(this.e, $$0));
   }

   @Override
   public void a(cxl.b $$0, Consumer<xv> $$1, czh $$2) {
      this.f.forEach($$1);
   }

   public List<xv> a() {
      return this.e;
   }

   public List<xv> b() {
      return this.f;
   }
}
