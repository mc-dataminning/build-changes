import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eup(eul b, eul c) implements eul {
   public static final MapCodec<eup> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eum.a.fieldOf("min").forGetter(eup::c), eum.a.fieldOf("max").forGetter(eup::d)).apply($$0, eup::new)
   );

   @Override
   public euk b() {
      return eum.c;
   }

   public static eup a(float $$0, float $$1) {
      return new eup(euj.a($$0), euj.a($$1));
   }

   @Override
   public int a(eqg $$0) {
      return ayx.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eqg $$0) {
      return ayx.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<esz<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eul c() {
      return this.b;
   }

   public eul d() {
      return this.c;
   }
}
