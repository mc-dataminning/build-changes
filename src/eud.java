import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eud(eup b, eqj c) implements etu {
   public static final MapCodec<eud> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(euq.a.fieldOf("value").forGetter(eud::c), eqj.a.fieldOf("range").forGetter(eud::d)).apply($$0, eud::new)
   );

   @Override
   public etv b() {
      return etw.t;
   }

   @Override
   public Set<etd<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eqk $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static etu.a a(eup $$0, eqj $$1) {
      return () -> new eud($$0, $$1);
   }

   public eup c() {
      return this.b;
   }

   public eqj d() {
      return this.c;
   }
}
