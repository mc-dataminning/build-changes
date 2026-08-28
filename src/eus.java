import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eus(euo b, euo c) implements euo {
   public static final MapCodec<eus> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eup.a.fieldOf("min").forGetter(eus::c), eup.a.fieldOf("max").forGetter(eus::d)).apply($$0, eus::new)
   );

   @Override
   public eun b() {
      return eup.c;
   }

   public static eus a(float $$0, float $$1) {
      return new eus(eum.a($$0), eum.a($$1));
   }

   @Override
   public int a(eqj $$0) {
      return ayz.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eqj $$0) {
      return ayz.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<etc<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public euo c() {
      return this.b;
   }

   public euo d() {
      return this.c;
   }
}
