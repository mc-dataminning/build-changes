import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cka(int e, int f, alc g, Optional<xd> h, Optional<xd> i) {
   public static final Codec<cka> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aym.a(1, 16).fieldOf("width").forGetter(cka::b),
               aym.a(1, 16).fieldOf("height").forGetter(cka::c),
               alc.a.fieldOf("asset_id").forGetter(cka::d),
               xf.a.optionalFieldOf("title").forGetter(cka::e),
               xf.a.optionalFieldOf("author").forGetter(cka::f)
            )
            .apply($$0, cka::new)
   );
   public static final zb<wo, cka> b = zb.a(yz.g, cka::b, yz.g, cka::c, alc.b, cka::d, xf.e, cka::e, xf.e, cka::f, cka::new);
   public static final Codec<jn<cka>> c = aky.a(lv.X, a);
   public static final zb<wo, jn<cka>> d = yz.a(lv.X, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public alc d() {
      return this.g;
   }

   public Optional<xd> e() {
      return this.h;
   }

   public Optional<xd> f() {
      return this.i;
   }
}
