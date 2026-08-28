import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exs(exo b, exo c) implements exo {
   public static final MapCodec<exs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(exp.a.fieldOf("min").forGetter(exs::c), exp.a.fieldOf("max").forGetter(exs::d)).apply($$0, exs::new)
   );

   @Override
   public exn b() {
      return exp.c;
   }

   public static exs a(float $$0, float $$1) {
      return new exs(exl.a($$0), exl.a($$1));
   }

   @Override
   public int a(eth $$0) {
      return azd.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eth $$0) {
      return azd.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<ewa<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public exo c() {
      return this.b;
   }

   public exo d() {
      return this.c;
   }
}
