import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dcr(List<xa> e, List<xa> f) implements ddd {
   public static final dcr a = new dcr(List.of());
   public static final int b = 256;
   private static final xx g = xx.a.a(o.f).b(true);
   public static final Codec<dcr> c = xc.a.sizeLimitedListOf(256).xmap(dcr::new, dcr::a);
   public static final yy<wl, dcr> d = xc.b.a(yw.c(256)).a(dcr::new, dcr::a);

   public dcr(List<xa> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xd.a($$0x.f(), g)));
   }

   public dcr(List<xa> e, List<xa> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public dcr a(xa $$0) {
      return new dcr(ag.a(this.e, $$0));
   }

   @Override
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      this.f.forEach($$1);
   }

   public List<xa> a() {
      return this.e;
   }

   public List<xa> b() {
      return this.f;
   }
}
