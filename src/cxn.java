import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cxn(List<xe> e, List<xe> f) implements cxx {
   public static final cxn a = new cxn(List.of());
   public static final int b = 256;
   private static final yb g = yb.a.a(n.f).b(true);
   public static final Codec<cxn> c = axu.a(xg.g.listOf(), 256).xmap(cxn::new, cxn::a);
   public static final zc<wp, cxn> d = xg.b.a(za.c(256)).a(cxn::new, cxn::a);

   public cxn(List<xe> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xh.a($$0x.f(), g)));
   }

   public cxn a(xe $$0) {
      return new cxn(ad.a(this.e, $$0));
   }

   @Override
   public void a(Consumer<xe> $$0, cwi $$1) {
      this.f.forEach($$0);
   }

   public List<xe> a() {
      return this.e;
   }

   public List<xe> b() {
      return this.f;
   }
}
