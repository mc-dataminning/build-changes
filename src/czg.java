import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record czg(List<wo> e, List<wo> f) implements czq {
   public static final czg a = new czg(List.of());
   public static final int b = 256;
   private static final xl g = xl.a.a(n.f).b(true);
   public static final Codec<czg> c = wq.g.sizeLimitedListOf(256).xmap(czg::new, czg::a);
   public static final ym<vz, czg> d = wq.b.a(yk.c(256)).a(czg::new, czg::a);

   public czg(List<wo> $$0) {
      this($$0, Lists.transform($$0, $$0x -> wr.a($$0x.f(), g)));
   }

   public czg(List<wo> e, List<wo> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public czg a(wo $$0) {
      return new czg(af.a(this.e, $$0));
   }

   @Override
   public void a(cwj.b $$0, Consumer<wo> $$1, cyf $$2) {
      this.f.forEach($$1);
   }

   public List<wo> a() {
      return this.e;
   }

   public List<wo> b() {
      return this.f;
   }
}
