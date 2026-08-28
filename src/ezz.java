import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezz(ezv b, ezv c) implements ezv {
   public static final MapCodec<ezz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ezw.a.fieldOf("min").forGetter(ezz::c), ezw.a.fieldOf("max").forGetter(ezz::d)).apply($$0, ezz::new)
   );

   @Override
   public ezu b() {
      return ezw.c;
   }

   public static ezz a(float $$0, float $$1) {
      return new ezz(ezs.a($$0), ezs.a($$1));
   }

   @Override
   public int a(evq $$0) {
      return ayz.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(evq $$0) {
      return ayz.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<bai<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ezv c() {
      return this.b;
   }

   public ezv d() {
      return this.c;
   }
}
