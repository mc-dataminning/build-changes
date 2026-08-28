import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dbl(List<ww> e, List<ww> f) implements dbx {
   public static final dbl a = new dbl(List.of());
   public static final int b = 256;
   private static final xt g = xt.a.a(n.f).b(true);
   public static final Codec<dbl> c = wy.a.sizeLimitedListOf(256).xmap(dbl::new, dbl::a);
   public static final yu<wh, dbl> d = wy.b.a(ys.c(256)).a(dbl::new, dbl::a);

   public dbl(List<ww> $$0) {
      this($$0, Lists.transform($$0, $$0x -> wz.a($$0x.f(), g)));
   }

   public dbl(List<ww> e, List<ww> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public dbl a(ww $$0) {
      return new dbl(af.a(this.e, $$0));
   }

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      this.f.forEach($$1);
   }

   public List<ww> a() {
      return this.e;
   }

   public List<ww> b() {
      return this.f;
   }
}
