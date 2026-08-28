import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dad(List<xv> e, List<xv> f) implements dan {
   public static final dad a = new dad(List.of());
   public static final int b = 256;
   private static final ys g = ys.a.a(n.f).b(true);
   public static final Codec<dad> c = xx.g.sizeLimitedListOf(256).xmap(dad::new, dad::a);
   public static final zt<xg, dad> d = xx.b.a(zr.c(256)).a(dad::new, dad::a);

   public dad(List<xv> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xy.a($$0x.f(), g)));
   }

   public dad(List<xv> e, List<xv> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public dad a(xv $$0) {
      return new dad(ae.a(this.e, $$0));
   }

   @Override
   public void a(cxg.b $$0, Consumer<xv> $$1, czc $$2) {
      this.f.forEach($$1);
   }

   public List<xv> a() {
      return this.e;
   }

   public List<xv> b() {
      return this.f;
   }
}
