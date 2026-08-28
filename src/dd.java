import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dd(dh.d c, Optional<bv> d) implements bw {
   public static final MapCodec<dd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dh.d.d.optionalFieldOf("blocks_set_on_fire", dh.d.c).forGetter(dd::b), bv.a.optionalFieldOf("entity_struck").forGetter(dd::c))
            .apply($$0, dd::new)
   );

   public static dd a(dh.d $$0) {
      return new dd($$0, Optional.empty());
   }

   @Override
   public MapCodec<dd> a() {
      return bx.a;
   }

   @Override
   public boolean a(bsr $$0, aqu $$1, @Nullable exa $$2) {
      return !($$0 instanceof btm $$3) ? false : this.c.d($$3.s()) && (this.d.isEmpty() || $$3.t().anyMatch($$2x -> this.d.get().a($$1, $$2, $$2x)));
   }

   public dh.d b() {
      return this.c;
   }

   public Optional<bv> c() {
      return this.d;
   }
}
