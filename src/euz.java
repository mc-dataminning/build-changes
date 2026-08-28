import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euz(euv b, euv c) implements euv {
   public static final MapCodec<euz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(euw.a.fieldOf("min").forGetter(euz::c), euw.a.fieldOf("max").forGetter(euz::d)).apply($$0, euz::new)
   );

   @Override
   public euu b() {
      return euw.c;
   }

   public static euz a(float $$0, float $$1) {
      return new euz(eus.a($$0), eus.a($$1));
   }

   @Override
   public int a(eqo $$0) {
      return aye.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eqo $$0) {
      return aye.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<eth<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public euv c() {
      return this.b;
   }

   public euv d() {
      return this.c;
   }
}
