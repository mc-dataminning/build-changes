import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dcg(List<wy> e, List<wy> f) implements dcs {
   public static final dcg a = new dcg(List.of());
   public static final int b = 256;
   private static final xv g = xv.a.a(o.f).b(true);
   public static final Codec<dcg> c = xa.a.sizeLimitedListOf(256).xmap(dcg::new, dcg::a);
   public static final yw<wj, dcg> d = xa.b.a(yu.c(256)).a(dcg::new, dcg::a);

   public dcg(List<wy> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xb.a($$0x.f(), g)));
   }

   public dcg(List<wy> e, List<wy> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public dcg a(wy $$0) {
      return new dcg(ag.a(this.e, $$0));
   }

   @Override
   public void a(czj.b $$0, Consumer<wy> $$1, dbc $$2, kf $$3) {
      this.f.forEach($$1);
   }

   public List<wy> a() {
      return this.e;
   }

   public List<wy> b() {
      return this.f;
   }
}
