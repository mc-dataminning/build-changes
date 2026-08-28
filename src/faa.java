import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record faa(ezw b, ezw c) implements ezw {
   public static final MapCodec<faa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ezx.a.fieldOf("min").forGetter(faa::c), ezx.a.fieldOf("max").forGetter(faa::d)).apply($$0, faa::new)
   );

   @Override
   public ezv b() {
      return ezx.c;
   }

   public static faa a(float $$0, float $$1) {
      return new faa(ezt.a($$0), ezt.a($$1));
   }

   @Override
   public int a(evr $$0) {
      return ayz.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(evr $$0) {
      return ayz.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<bai<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ezw c() {
      return this.b;
   }

   public ezw d() {
      return this.c;
   }
}
