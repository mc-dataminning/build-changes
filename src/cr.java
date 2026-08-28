import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record cr(cv.d c, Optional<bx> d) implements by {
   public static final MapCodec<cr> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cv.d.d.optionalFieldOf("blocks_set_on_fire", cv.d.c).forGetter(cr::b), bx.a.optionalFieldOf("entity_struck").forGetter(cr::c))
            .apply($$0, cr::new)
   );

   public static cr a(cv.d $$0) {
      return new cr($$0, Optional.empty());
   }

   @Override
   public MapCodec<cr> a() {
      return bz.a;
   }

   @Override
   public boolean a(bwf $$0, arq $$1, @Nullable feq $$2) {
      return !($$0 instanceof bxd $$3) ? false : this.c.d($$3.g()) && (this.d.isEmpty() || $$3.j().anyMatch($$2x -> this.d.get().a($$1, $$2, $$2x)));
   }

   public cv.d b() {
      return this.c;
   }

   public Optional<bx> c() {
      return this.d;
   }
}
