import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record co(cs.d c, Optional<br> d) implements bs {
   public static final MapCodec<co> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axe.a(cs.d.d, "blocks_set_on_fire", cs.d.c).forGetter(co::b), axe.a(br.a, "entity_struck").forGetter(co::c)).apply($$0, co::new)
   );

   public static co a(cs.d $$0) {
      return new co($$0, Optional.empty());
   }

   @Override
   public MapCodec<co> a() {
      return bt.a;
   }

   @Override
   public boolean a(bql $$0, aqe $$1, @Nullable etf $$2) {
      return !($$0 instanceof brd $$3) ? false : this.c.d($$3.r()) && (this.d.isEmpty() || $$3.u().anyMatch($$2x -> this.d.get().a($$1, $$2, $$2x)));
   }

   public cs.d b() {
      return this.c;
   }

   public Optional<br> c() {
      return this.d;
   }
}
