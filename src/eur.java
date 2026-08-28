import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eur(eun b, eun c) implements eun {
   public static final MapCodec<eur> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(euo.a.fieldOf("min").forGetter(eur::c), euo.a.fieldOf("max").forGetter(eur::d)).apply($$0, eur::new)
   );

   @Override
   public eum b() {
      return euo.c;
   }

   public static eur a(float $$0, float $$1) {
      return new eur(eul.a($$0), eul.a($$1));
   }

   @Override
   public int a(eqi $$0) {
      return ayz.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eqi $$0) {
      return ayz.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<etb<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eun c() {
      return this.b;
   }

   public eun d() {
      return this.c;
   }
}
