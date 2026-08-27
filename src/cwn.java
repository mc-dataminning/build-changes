import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cwn(List<wx> e, List<wx> f) implements cww {
   public static final cwn a = new cwn(List.of());
   public static final int b = 256;
   private static final xu g = xu.a.a(n.f).b(true);
   public static final Codec<cwn> c = wz.g.sizeLimitedListOf(256).xmap(cwn::new, cwn::a);
   public static final yv<wi, cwn> d = wz.b.a(yt.c(256)).a(cwn::new, cwn::a);

   public cwn(List<wx> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xa.a($$0x.f(), g)));
   }

   public cwn a(wx $$0) {
      return new cwn(ac.a(this.e, $$0));
   }

   @Override
   public void a(Consumer<wx> $$0, cvj $$1) {
      this.f.forEach($$0);
   }

   public List<wx> a() {
      return this.e;
   }

   public List<wx> b() {
      return this.f;
   }
}
