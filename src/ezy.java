import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezy(ezu b, ezu c) implements ezu {
   public static final MapCodec<ezy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ezv.a.fieldOf("min").forGetter(ezy::c), ezv.a.fieldOf("max").forGetter(ezy::d)).apply($$0, ezy::new)
   );

   @Override
   public ezt b() {
      return ezv.c;
   }

   public static ezy a(float $$0, float $$1) {
      return new ezy(ezr.a($$0), ezr.a($$1));
   }

   @Override
   public int a(evp $$0) {
      return ayy.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(evp $$0) {
      return ayy.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<bah<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ezu c() {
      return this.b;
   }

   public ezu d() {
      return this.c;
   }
}
