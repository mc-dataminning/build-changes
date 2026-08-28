import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cym(List<xd> e, List<xd> f) implements cyw {
   public static final cym a = new cym(List.of());
   public static final int b = 256;
   private static final ya g = ya.a.a(n.f).b(true);
   public static final Codec<cym> c = xf.g.sizeLimitedListOf(256).xmap(cym::new, cym::a);
   public static final zb<wo, cym> d = xf.b.a(yz.c(256)).a(cym::new, cym::a);

   public cym(List<xd> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xg.a($$0x.f(), g)));
   }

   public cym(List<xd> e, List<xd> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public cym a(xd $$0) {
      return new cym(ad.a(this.e, $$0));
   }

   @Override
   public void a(cvk.b $$0, Consumer<xd> $$1, cxh $$2) {
      this.f.forEach($$1);
   }

   public List<xd> a() {
      return this.e;
   }

   public List<xd> b() {
      return this.f;
   }
}
