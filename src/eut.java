import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eut(eup b, eup c) implements eup {
   public static final MapCodec<eut> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(euq.a.fieldOf("min").forGetter(eut::c), euq.a.fieldOf("max").forGetter(eut::d)).apply($$0, eut::new)
   );

   @Override
   public euo b() {
      return euq.c;
   }

   public static eut a(float $$0, float $$1) {
      return new eut(eun.a($$0), eun.a($$1));
   }

   @Override
   public int a(eqk $$0) {
      return ayz.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eqk $$0) {
      return ayz.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<etd<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eup c() {
      return this.b;
   }

   public eup d() {
      return this.c;
   }
}
