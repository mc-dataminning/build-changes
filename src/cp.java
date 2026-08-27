import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record cp(ct.d c, Optional<br> d) implements bs {
   public static final MapCodec<cp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axh.a(ct.d.d, "blocks_set_on_fire", ct.d.c).forGetter(cp::b), axh.a(br.a, "entity_struck").forGetter(cp::c)).apply($$0, cp::new)
   );

   public static cp a(ct.d $$0) {
      return new cp($$0, Optional.empty());
   }

   @Override
   public MapCodec<cp> a() {
      return bt.a;
   }

   @Override
   public boolean a(brh $$0, aqh $$1, @Nullable etp $$2) {
      return !($$0 instanceof brz $$3) ? false : this.c.d($$3.r()) && (this.d.isEmpty() || $$3.u().anyMatch($$2x -> this.d.get().a($$1, $$2, $$2x)));
   }

   public ct.d b() {
      return this.c;
   }

   public Optional<br> c() {
      return this.d;
   }
}
