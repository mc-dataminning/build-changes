import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cyp(List<xe> e, List<xe> f) implements cyz {
   public static final cyp a = new cyp(List.of());
   public static final int b = 256;
   private static final yb g = yb.a.a(n.f).b(true);
   public static final Codec<cyp> c = xg.g.sizeLimitedListOf(256).xmap(cyp::new, cyp::a);
   public static final zc<wp, cyp> d = xg.b.a(za.c(256)).a(cyp::new, cyp::a);

   public cyp(List<xe> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xh.a($$0x.f(), g)));
   }

   public cyp(List<xe> e, List<xe> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public cyp a(xe $$0) {
      return new cyp(ad.a(this.e, $$0));
   }

   @Override
   public void a(cvn.b $$0, Consumer<xe> $$1, cxk $$2) {
      this.f.forEach($$1);
   }

   public List<xe> a() {
      return this.e;
   }

   public List<xe> b() {
      return this.f;
   }
}
