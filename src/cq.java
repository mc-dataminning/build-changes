import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record cq(cu.d c, Optional<bs> d) implements bt {
   public static final MapCodec<cq> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axu.a(cu.d.d, "blocks_set_on_fire", cu.d.c).forGetter(cq::b), axu.a(bs.a, "entity_struck").forGetter(cq::c)).apply($$0, cq::new)
   );

   public static cq a(cu.d $$0) {
      return new cq($$0, Optional.empty());
   }

   @Override
   public MapCodec<cq> a() {
      return bu.a;
   }

   @Override
   public boolean a(brv $$0, aqt $$1, @Nullable ewu $$2) {
      return !($$0 instanceof bsn $$3) ? false : this.c.d($$3.r()) && (this.d.isEmpty() || $$3.t().anyMatch($$2x -> this.d.get().a($$1, $$2, $$2x)));
   }

   public cu.d b() {
      return this.c;
   }

   public Optional<bs> c() {
      return this.d;
   }
}
