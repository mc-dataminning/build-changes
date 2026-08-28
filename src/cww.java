import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cww(List<wu> e, List<wu> f) implements cxf {
   public static final cww a = new cww(List.of());
   public static final int b = 256;
   private static final xr g = xr.a.a(n.f).b(true);
   public static final Codec<cww> c = ww.g.sizeLimitedListOf(256).xmap(cww::new, cww::a);
   public static final ys<wf, cww> d = ww.b.a(yq.c(256)).a(cww::new, cww::a);

   public cww(List<wu> $$0) {
      this($$0, Lists.transform($$0, $$0x -> wx.a($$0x.f(), g)));
   }

   public cww(List<wu> e, List<wu> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public cww a(wu $$0) {
      return new cww(ac.a(this.e, $$0));
   }

   @Override
   public void a(ctv.b $$0, Consumer<wu> $$1, cvt $$2) {
      this.f.forEach($$1);
   }

   public List<wu> a() {
      return this.e;
   }

   public List<wu> b() {
      return this.f;
   }
}
