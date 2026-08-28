import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cxn(List<xp> e, List<xp> f) implements cxw {
   public static final cxn a = new cxn(List.of());
   public static final int b = 256;
   private static final ym g = ym.a.a(n.f).b(true);
   public static final Codec<cxn> c = xr.g.sizeLimitedListOf(256).xmap(cxn::new, cxn::a);
   public static final zn<xa, cxn> d = xr.b.a(zl.c(256)).a(cxn::new, cxn::a);

   public cxn(List<xp> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xs.a($$0x.f(), g)));
   }

   public cxn(List<xp> e, List<xp> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public cxn a(xp $$0) {
      return new cxn(ac.a(this.e, $$0));
   }

   @Override
   public void a(cul.b $$0, Consumer<xp> $$1, cwj $$2) {
      this.f.forEach($$1);
   }

   public List<xp> a() {
      return this.e;
   }

   public List<xp> b() {
      return this.f;
   }
}
