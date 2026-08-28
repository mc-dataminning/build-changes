import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record cs(cw.d c, Optional<by> d) implements bz {
   public static final MapCodec<cs> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cw.d.d.optionalFieldOf("blocks_set_on_fire", cw.d.c).forGetter(cs::b), by.a.optionalFieldOf("entity_struck").forGetter(cs::c))
            .apply($$0, cs::new)
   );

   public static cs a(cw.d $$0) {
      return new cs($$0, Optional.empty());
   }

   @Override
   public MapCodec<cs> a() {
      return ca.a;
   }

   @Override
   public boolean a(bwi $$0, arq $$1, @Nullable fex $$2) {
      return !($$0 instanceof bxi $$3) ? false : this.c.d($$3.g()) && (this.d.isEmpty() || $$3.j().anyMatch($$2x -> this.d.get().a($$1, $$2, $$2x)));
   }

   public cw.d b() {
      return this.c;
   }

   public Optional<by> c() {
      return this.d;
   }
}
