import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record df(dj.d c, Optional<bw> d) implements bx {
   public static final MapCodec<df> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dj.d.d.optionalFieldOf("blocks_set_on_fire", dj.d.c).forGetter(df::b), bw.a.optionalFieldOf("entity_struck").forGetter(df::c))
            .apply($$0, df::new)
   );

   public static df a(dj.d $$0) {
      return new df($$0, Optional.empty());
   }

   @Override
   public MapCodec<df> a() {
      return by.a;
   }

   @Override
   public boolean a(bvk $$0, ash $$1, @Nullable fby $$2) {
      return !($$0 instanceof bwf $$3) ? false : this.c.d($$3.m()) && (this.d.isEmpty() || $$3.p().anyMatch($$2x -> this.d.get().a($$1, $$2, $$2x)));
   }

   public dj.d b() {
      return this.c;
   }

   public Optional<bw> c() {
      return this.d;
   }
}
