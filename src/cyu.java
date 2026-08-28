import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cyu(List<xi> e, List<xi> f) implements cze {
   public static final cyu a = new cyu(List.of());
   public static final int b = 256;
   private static final yf g = yf.a.a(n.f).b(true);
   public static final Codec<cyu> c = xk.g.sizeLimitedListOf(256).xmap(cyu::new, cyu::a);
   public static final zg<wt, cyu> d = xk.b.a(ze.c(256)).a(cyu::new, cyu::a);

   public cyu(List<xi> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xl.a($$0x.f(), g)));
   }

   public cyu(List<xi> e, List<xi> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public cyu a(xi $$0) {
      return new cyu(ae.a(this.e, $$0));
   }

   @Override
   public void a(cvx.b $$0, Consumer<xi> $$1, cxt $$2) {
      this.f.forEach($$1);
   }

   public List<xi> a() {
      return this.e;
   }

   public List<xi> b() {
      return this.f;
   }
}
