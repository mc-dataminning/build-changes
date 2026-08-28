import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record feq(fem b, fem c) implements fem {
   public static final MapCodec<feq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fen.a.fieldOf("min").forGetter(feq::c), fen.a.fieldOf("max").forGetter(feq::d)).apply($$0, feq::new)
   );

   @Override
   public fel b() {
      return fen.c;
   }

   public static feq a(float $$0, float $$1) {
      return new feq(fej.a($$0), fej.a($$1));
   }

   @Override
   public int a(fah $$0) {
      return azo.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(fah $$0) {
      return azo.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<baz<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fem c() {
      return this.b;
   }

   public fem d() {
      return this.c;
   }
}
