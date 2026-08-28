import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record elr(jw<dku> b, jw<dku> c, elw d, int e, int f, float g) {
   public static final Codec<elr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kh.a(me.f).fieldOf("can_grow_through").forGetter($$0x -> $$0x.b),
               kh.a(me.f).fieldOf("muddy_roots_in").forGetter($$0x -> $$0x.c),
               elw.a.fieldOf("muddy_roots_provider").forGetter($$0x -> $$0x.d),
               Codec.intRange(1, 12).fieldOf("max_root_width").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 64).fieldOf("max_root_length").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("random_skew_chance").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, elr::new)
   );

   public jw<dku> a() {
      return this.b;
   }

   public jw<dku> b() {
      return this.c;
   }

   public elw c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }
}
