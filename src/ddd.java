import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record ddd(List<xg> e, List<xg> f) implements ddp {
   public static final ddd a = new ddd(List.of());
   public static final int b = 256;
   private static final yd g = yd.a.a(o.f).b(true);
   public static final Codec<ddd> c = xi.a.sizeLimitedListOf(256).xmap(ddd::new, ddd::a);
   public static final ze<wp, ddd> d = xi.b.a(zc.c(256)).a(ddd::new, ddd::a);

   public ddd(List<xg> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xj.a($$0x.f(), g)));
   }

   public ddd(List<xg> e, List<xg> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public ddd a(xg $$0) {
      return new ddd(ag.a(this.e, $$0));
   }

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      this.f.forEach($$1);
   }

   public List<xg> a() {
      return this.e;
   }

   public List<xg> b() {
      return this.f;
   }
}
