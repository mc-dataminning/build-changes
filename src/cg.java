import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record cg(ck.d c, Optional<bp> d) implements bq {
   public static final MapCodec<cg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(atw.a(ck.d.d, "blocks_set_on_fire", ck.d.c).forGetter(cg::b), atw.a(bp.a, "entity_struck").forGetter(cg::c)).apply($$0, cg::new)
   );

   public static cg a(ck.d $$0) {
      return new cg($$0, Optional.empty());
   }

   @Override
   public bq.a a() {
      return bq.b.b;
   }

   @Override
   public boolean a(blv $$0, and $$1, @Nullable elt $$2) {
      return !($$0 instanceof bmk $$3) ? false : this.c.d($$3.s()) && (this.d.isEmpty() || $$3.u().anyMatch($$2x -> this.d.get().a($$1, $$2, $$2x)));
   }

   public ck.d b() {
      return this.c;
   }

   public Optional<bp> c() {
      return this.d;
   }
}
