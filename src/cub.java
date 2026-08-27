import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cub(List<wg> d, List<wg> e) implements cuj {
   public static final cub a = new cub(List.of());
   private static final int f = 64;
   private static final xd g = xd.a.a(n.f).b(true);
   public static final Codec<cub> b = aws.a(wi.g.listOf(), 64).xmap(cub::new, cub::a);
   public static final ye<vr, cub> c = wi.b.a(yc.c(64)).a(cub::new, cub::a);

   public cub(List<wg> $$0) {
      this($$0, Lists.transform($$0, $$0x -> wj.a($$0x.f(), g)));
   }

   public cub a(wg $$0) {
      return new cub(ac.a(this.d, $$0));
   }

   @Override
   public void a(Consumer<wg> $$0, csz $$1) {
      this.e.forEach($$0);
   }

   public List<wg> a() {
      return this.d;
   }

   public List<wg> b() {
      return this.e;
   }
}
