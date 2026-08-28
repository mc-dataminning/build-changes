import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record du(Optional<Boolean> c, Optional<cum> d) implements bw {
   public static final MapCodec<du> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("sheared").forGetter(du::b), cum.q.optionalFieldOf("color").forGetter(du::c)).apply($$0, du::new)
   );

   @Override
   public MapCodec<du> a() {
      return bx.f;
   }

   @Override
   public boolean a(btr $$0, arj $$1, @Nullable eyw $$2) {
      if ($$0 instanceof cgz $$3) {
         return this.c.isPresent() && $$3.y() != this.c.get() ? false : !this.d.isPresent() || $$3.t() == this.d.get();
      } else {
         return false;
      }
   }

   public static du a(cum $$0) {
      return new du(Optional.of(false), Optional.of($$0));
   }

   public Optional<Boolean> b() {
      return this.c;
   }

   public Optional<cum> c() {
      return this.d;
   }
}
