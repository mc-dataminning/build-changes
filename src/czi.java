import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record czi(List<wo> e, List<wo> f) implements czs {
   public static final czi a = new czi(List.of());
   public static final int b = 256;
   private static final xl g = xl.a.a(n.f).b(true);
   public static final Codec<czi> c = wq.g.sizeLimitedListOf(256).xmap(czi::new, czi::a);
   public static final ym<vz, czi> d = wq.b.a(yk.c(256)).a(czi::new, czi::a);

   public czi(List<wo> $$0) {
      this($$0, Lists.transform($$0, $$0x -> wr.a($$0x.f(), g)));
   }

   public czi(List<wo> e, List<wo> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public czi a(wo $$0) {
      return new czi(af.a(this.e, $$0));
   }

   @Override
   public void a(cwl.b $$0, Consumer<wo> $$1, cyh $$2) {
      this.f.forEach($$1);
   }

   public List<wo> a() {
      return this.e;
   }

   public List<wo> b() {
      return this.f;
   }
}
