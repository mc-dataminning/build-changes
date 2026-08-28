import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cwy(List<wu> e, List<wu> f) implements cxh {
   public static final cwy a = new cwy(List.of());
   public static final int b = 256;
   private static final xr g = xr.a.a(n.f).b(true);
   public static final Codec<cwy> c = ww.g.sizeLimitedListOf(256).xmap(cwy::new, cwy::a);
   public static final ys<wf, cwy> d = ww.b.a(yq.c(256)).a(cwy::new, cwy::a);

   public cwy(List<wu> $$0) {
      this($$0, Lists.transform($$0, $$0x -> wx.a($$0x.f(), g)));
   }

   public cwy(List<wu> e, List<wu> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public cwy a(wu $$0) {
      return new cwy(ac.a(this.e, $$0));
   }

   @Override
   public void a(ctx.b $$0, Consumer<wu> $$1, cvv $$2) {
      this.f.forEach($$1);
   }

   public List<wu> a() {
      return this.e;
   }

   public List<wu> b() {
      return this.f;
   }
}
