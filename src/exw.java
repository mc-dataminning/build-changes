import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exw(exs b, exs c) implements exs {
   public static final MapCodec<exw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ext.a.fieldOf("min").forGetter(exw::c), ext.a.fieldOf("max").forGetter(exw::d)).apply($$0, exw::new)
   );

   @Override
   public exr b() {
      return ext.c;
   }

   public static exw a(float $$0, float $$1) {
      return new exw(exp.a($$0), exp.a($$1));
   }

   @Override
   public int a(etl $$0) {
      return azf.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(etl $$0) {
      return azf.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<ewe<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public exs c() {
      return this.b;
   }

   public exs d() {
      return this.c;
   }
}
