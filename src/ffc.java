import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ffc(fey b, fey c) implements fey {
   public static final MapCodec<ffc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fez.a.fieldOf("min").forGetter(ffc::c), fez.a.fieldOf("max").forGetter(ffc::d)).apply($$0, ffc::new)
   );

   @Override
   public fex b() {
      return fez.c;
   }

   public static ffc a(float $$0, float $$1) {
      return new ffc(fev.a($$0), fev.a($$1));
   }

   @Override
   public int a(fat $$0) {
      return azz.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(fat $$0) {
      return azz.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<bbk<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fey c() {
      return this.b;
   }

   public fey d() {
      return this.c;
   }
}
