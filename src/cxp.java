import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cxp(List<wz> e, List<wz> f) implements cxy {
   public static final cxp a = new cxp(List.of());
   public static final int b = 256;
   private static final xw g = xw.a.a(n.f).b(true);
   public static final Codec<cxp> c = xb.g.sizeLimitedListOf(256).xmap(cxp::new, cxp::a);
   public static final yx<wk, cxp> d = xb.b.a(yv.c(256)).a(cxp::new, cxp::a);

   public cxp(List<wz> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xc.a($$0x.f(), g)));
   }

   public cxp(List<wz> e, List<wz> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public cxp a(wz $$0) {
      return new cxp(ad.a(this.e, $$0));
   }

   @Override
   public void a(cul.b $$0, Consumer<wz> $$1, cwm $$2) {
      this.f.forEach($$1);
   }

   public List<wz> a() {
      return this.e;
   }

   public List<wz> b() {
      return this.f;
   }
}
