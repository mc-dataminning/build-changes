import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record czh(List<wp> e, List<wp> f) implements czr {
   public static final czh a = new czh(List.of());
   public static final int b = 256;
   private static final xm g = xm.a.a(n.f).b(true);
   public static final Codec<czh> c = wr.g.sizeLimitedListOf(256).xmap(czh::new, czh::a);
   public static final yn<wa, czh> d = wr.b.a(yl.c(256)).a(czh::new, czh::a);

   public czh(List<wp> $$0) {
      this($$0, Lists.transform($$0, $$0x -> ws.a($$0x.f(), g)));
   }

   public czh(List<wp> e, List<wp> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public czh a(wp $$0) {
      return new czh(af.a(this.e, $$0));
   }

   @Override
   public void a(cwk.b $$0, Consumer<wp> $$1, cyg $$2) {
      this.f.forEach($$1);
   }

   public List<wp> a() {
      return this.e;
   }

   public List<wp> b() {
      return this.f;
   }
}
