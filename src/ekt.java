import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ekt(ekq b, ekq c) implements ekq {
   public static final Codec<ekt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekr.a.fieldOf("min").forGetter(ekt::c), ekr.a.fieldOf("max").forGetter(ekt::d)).apply($$0, ekt::new)
   );

   @Override
   public ekp b() {
      return ekr.c;
   }

   public static ekt a(float $$0, float $$1) {
      return new ekt(eko.a($$0), eko.a($$1));
   }

   @Override
   public int a(egw $$0) {
      return auo.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(egw $$0) {
      return auo.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<eje<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ekq c() {
      return this.b;
   }

   public ekq d() {
      return this.c;
   }
}
