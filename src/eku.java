import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eku(jv<dke> b, jv<dke> c, ekz d, int e, int f, float g) {
   public static final Codec<eku> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kg.a(mc.f).fieldOf("can_grow_through").forGetter($$0x -> $$0x.b),
               kg.a(mc.f).fieldOf("muddy_roots_in").forGetter($$0x -> $$0x.c),
               ekz.a.fieldOf("muddy_roots_provider").forGetter($$0x -> $$0x.d),
               Codec.intRange(1, 12).fieldOf("max_root_width").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 64).fieldOf("max_root_length").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("random_skew_chance").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eku::new)
   );

   public jv<dke> a() {
      return this.b;
   }

   public jv<dke> b() {
      return this.c;
   }

   public ekz c() {
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
