import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record de(di.d c, Optional<bv> d) implements bw {
   public static final MapCodec<de> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(di.d.d.optionalFieldOf("blocks_set_on_fire", di.d.c).forGetter(de::b), bv.a.optionalFieldOf("entity_struck").forGetter(de::c))
            .apply($$0, de::new)
   );

   public static de a(di.d $$0) {
      return new de($$0, Optional.empty());
   }

   @Override
   public MapCodec<de> a() {
      return bx.a;
   }

   @Override
   public boolean a(btz $$0, arm $$1, @Nullable ezh $$2) {
      return !($$0 instanceof buu $$3) ? false : this.c.d($$3.o()) && (this.d.isEmpty() || $$3.q().anyMatch($$2x -> this.d.get().a($$1, $$2, $$2x)));
   }

   public di.d b() {
      return this.c;
   }

   public Optional<bv> c() {
      return this.d;
   }
}
