import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record egi(egf b, egf c) implements egf {
   public static final Codec<egi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egg.a.fieldOf("min").forGetter(egi::c), egg.a.fieldOf("max").forGetter(egi::d)).apply($$0, egi::new)
   );

   @Override
   public ege b() {
      return egg.c;
   }

   public static egi a(float $$0, float $$1) {
      return new egi(egd.a($$0), egd.a($$1));
   }

   @Override
   public int a(ecl $$0) {
      return ars.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(ecl $$0) {
      return ars.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<eet<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public egf c() {
      return this.b;
   }

   public egf d() {
      return this.c;
   }
}
