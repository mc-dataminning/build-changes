import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euq(evd b, eqv c) implements euh {
   public static final MapCodec<euq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eve.a.fieldOf("value").forGetter(euq::c), eqv.a.fieldOf("range").forGetter(euq::d)).apply($$0, euq::new)
   );

   @Override
   public eui b() {
      return euj.r;
   }

   @Override
   public Set<etp<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eqw $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static euh.a a(evd $$0, eqv $$1) {
      return () -> new euq($$0, $$1);
   }

   public evd c() {
      return this.b;
   }

   public eqv d() {
      return this.c;
   }
}
