import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evu(evq b, evq c) implements evq {
   public static final Codec<evu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(evr.a.fieldOf("min").forGetter(evu::c), evr.a.fieldOf("max").forGetter(evu::d)).apply($$0, evu::new)
   );

   @Override
   public evp b() {
      return evr.c;
   }

   public static evu a(float $$0, float $$1) {
      return new evu(evo.a($$0), evo.a($$1));
   }

   @Override
   public int a(erp $$0) {
      return aym.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(erp $$0) {
      return aym.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<eud<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public evq c() {
      return this.b;
   }

   public evq d() {
      return this.c;
   }
}
