import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record czj(List<wp> e, List<wp> f) implements czt {
   public static final czj a = new czj(List.of());
   public static final int b = 256;
   private static final xm g = xm.a.a(n.f).b(true);
   public static final Codec<czj> c = wr.g.sizeLimitedListOf(256).xmap(czj::new, czj::a);
   public static final yn<wa, czj> d = wr.b.a(yl.c(256)).a(czj::new, czj::a);

   public czj(List<wp> $$0) {
      this($$0, Lists.transform($$0, $$0x -> ws.a($$0x.f(), g)));
   }

   public czj(List<wp> e, List<wp> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public czj a(wp $$0) {
      return new czj(af.a(this.e, $$0));
   }

   @Override
   public void a(cwm.b $$0, Consumer<wp> $$1, cyi $$2) {
      this.f.forEach($$1);
   }

   public List<wp> a() {
      return this.e;
   }

   public List<wp> b() {
      return this.f;
   }
}
