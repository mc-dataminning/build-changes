import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edx(jb<ddy> b, jb<ddy> c, eec d, int e, int f, float g) {
   public static final Codec<edx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jm.a(lf.f).fieldOf("can_grow_through").forGetter($$0x -> $$0x.b),
               jm.a(lf.f).fieldOf("muddy_roots_in").forGetter($$0x -> $$0x.c),
               eec.a.fieldOf("muddy_roots_provider").forGetter($$0x -> $$0x.d),
               Codec.intRange(1, 12).fieldOf("max_root_width").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 64).fieldOf("max_root_length").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("random_skew_chance").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, edx::new)
   );

   public jb<ddy> a() {
      return this.b;
   }

   public jb<ddy> b() {
      return this.c;
   }

   public eec c() {
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
