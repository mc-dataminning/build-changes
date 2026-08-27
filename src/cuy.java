import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cuy(List<ws> d, List<ws> e) implements cvg {
   public static final cuy a = new cuy(List.of());
   private static final int f = 256;
   private static final xp g = xp.a.a(n.f).b(true);
   public static final Codec<cuy> b = axe.a(wu.g.listOf(), 256).xmap(cuy::new, cuy::a);
   public static final yq<wd, cuy> c = wu.b.a(yo.c(256)).a(cuy::new, cuy::a);

   public cuy(List<ws> $$0) {
      this($$0, Lists.transform($$0, $$0x -> wv.a($$0x.f(), g)));
   }

   public cuy a(ws $$0) {
      return new cuy(ac.a(this.d, $$0));
   }

   @Override
   public void a(Consumer<ws> $$0, ctu $$1) {
      this.e.forEach($$0);
   }

   public List<ws> a() {
      return this.d;
   }

   public List<ws> b() {
      return this.e;
   }
}
