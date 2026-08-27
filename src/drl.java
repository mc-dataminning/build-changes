import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record drl(hj<csk> b, hj<csk> c, drq d, int e, int f, float g) {
   public static final Codec<drl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hu.a(jd.e).fieldOf("can_grow_through").forGetter($$0x -> $$0x.b),
               hu.a(jd.e).fieldOf("muddy_roots_in").forGetter($$0x -> $$0x.c),
               drq.a.fieldOf("muddy_roots_provider").forGetter($$0x -> $$0x.d),
               Codec.intRange(1, 12).fieldOf("max_root_width").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 64).fieldOf("max_root_length").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("random_skew_chance").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, drl::new)
   );

   public hj<csk> a() {
      return this.b;
   }

   public hj<csk> b() {
      return this.c;
   }

   public drq c() {
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
