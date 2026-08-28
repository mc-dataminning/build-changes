import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record czy(List<wp> e, List<wp> f) implements dai {
   public static final czy a = new czy(List.of());
   public static final int b = 256;
   private static final xm g = xm.a.a(n.f).b(true);
   public static final Codec<czy> c = wr.a.sizeLimitedListOf(256).xmap(czy::new, czy::a);
   public static final yn<wa, czy> d = wr.b.a(yl.c(256)).a(czy::new, czy::a);

   public czy(List<wp> $$0) {
      this($$0, Lists.transform($$0, $$0x -> ws.a($$0x.f(), g)));
   }

   public czy(List<wp> e, List<wp> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public czy a(wp $$0) {
      return new czy(af.a(this.e, $$0));
   }

   @Override
   public void a(cxd.b $$0, Consumer<wp> $$1, cyx $$2) {
      this.f.forEach($$1);
   }

   public List<wp> a() {
      return this.e;
   }

   public List<wp> b() {
      return this.f;
   }
}
