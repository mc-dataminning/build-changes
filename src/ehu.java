import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehu(js<dhm> b, js<dhm> c, ehz d, int e, int f, float g) {
   public static final Codec<ehu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kd.a(lw.f).fieldOf("can_grow_through").forGetter($$0x -> $$0x.b),
               kd.a(lw.f).fieldOf("muddy_roots_in").forGetter($$0x -> $$0x.c),
               ehz.a.fieldOf("muddy_roots_provider").forGetter($$0x -> $$0x.d),
               Codec.intRange(1, 12).fieldOf("max_root_width").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 64).fieldOf("max_root_length").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("random_skew_chance").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ehu::new)
   );

   public js<dhm> a() {
      return this.b;
   }

   public js<dhm> b() {
      return this.c;
   }

   public ehz c() {
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
