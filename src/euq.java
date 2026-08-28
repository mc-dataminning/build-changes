import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euq(eum b, eum c) implements eum {
   public static final MapCodec<euq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eun.a.fieldOf("min").forGetter(euq::c), eun.a.fieldOf("max").forGetter(euq::d)).apply($$0, euq::new)
   );

   @Override
   public eul b() {
      return eun.c;
   }

   public static euq a(float $$0, float $$1) {
      return new euq(euk.a($$0), euk.a($$1));
   }

   @Override
   public int a(eqh $$0) {
      return ayy.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eqh $$0) {
      return ayy.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<eta<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eum c() {
      return this.b;
   }

   public eum d() {
      return this.c;
   }
}
