import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cwl(List<wx> e, List<wx> f) implements cwu {
   public static final cwl a = new cwl(List.of());
   public static final int b = 256;
   private static final xu g = xu.a.a(n.f).b(true);
   public static final Codec<cwl> c = wz.g.sizeLimitedListOf(256).xmap(cwl::new, cwl::a);
   public static final yv<wi, cwl> d = wz.b.a(yt.c(256)).a(cwl::new, cwl::a);

   public cwl(List<wx> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xa.a($$0x.f(), g)));
   }

   public cwl a(wx $$0) {
      return new cwl(ac.a(this.e, $$0));
   }

   @Override
   public void a(Consumer<wx> $$0, cvh $$1) {
      this.f.forEach($$0);
   }

   public List<wx> a() {
      return this.e;
   }

   public List<wx> b() {
      return this.f;
   }
}
