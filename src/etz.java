import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etz(eul b, eqf c) implements etq {
   public static final MapCodec<etz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eum.a.fieldOf("value").forGetter(etz::c), eqf.a.fieldOf("range").forGetter(etz::d)).apply($$0, etz::new)
   );

   @Override
   public etr b() {
      return ets.t;
   }

   @Override
   public Set<esz<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eqg $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static etq.a a(eul $$0, eqf $$1) {
      return () -> new etz($$0, $$1);
   }

   public eul c() {
      return this.b;
   }

   public eqf d() {
      return this.c;
   }
}
