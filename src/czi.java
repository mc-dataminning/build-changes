import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record czi(List<wp> e, List<wp> f) implements czs {
   public static final czi a = new czi(List.of());
   public static final int b = 256;
   private static final xm g = xm.a.a(n.f).b(true);
   public static final Codec<czi> c = wr.g.sizeLimitedListOf(256).xmap(czi::new, czi::a);
   public static final yn<wa, czi> d = wr.b.a(yl.c(256)).a(czi::new, czi::a);

   public czi(List<wp> $$0) {
      this($$0, Lists.transform($$0, $$0x -> ws.a($$0x.f(), g)));
   }

   public czi(List<wp> e, List<wp> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public czi a(wp $$0) {
      return new czi(af.a(this.e, $$0));
   }

   @Override
   public void a(cwl.b $$0, Consumer<wp> $$1, cyh $$2) {
      this.f.forEach($$1);
   }

   public List<wp> a() {
      return this.e;
   }

   public List<wp> b() {
      return this.f;
   }
}
