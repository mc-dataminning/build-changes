import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dg(dk.d c, Optional<bx> d) implements by {
   public static final MapCodec<dg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dk.d.d.optionalFieldOf("blocks_set_on_fire", dk.d.c).forGetter(dg::b), bx.a.optionalFieldOf("entity_struck").forGetter(dg::c))
            .apply($$0, dg::new)
   );

   public static dg a(dk.d $$0) {
      return new dg($$0, Optional.empty());
   }

   @Override
   public MapCodec<dg> a() {
      return bz.a;
   }

   @Override
   public boolean a(bum $$0, ard $$1, @Nullable fbb $$2) {
      return !($$0 instanceof bvh $$3) ? false : this.c.d($$3.m()) && (this.d.isEmpty() || $$3.p().anyMatch($$2x -> this.d.get().a($$1, $$2, $$2x)));
   }

   public dk.d b() {
      return this.c;
   }

   public Optional<bx> c() {
      return this.d;
   }
}
