import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dx(Optional<Boolean> c, Optional<cvn> d) implements by {
   public static final MapCodec<dx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("sheared").forGetter(dx::b), cvn.q.optionalFieldOf("color").forGetter(dx::c)).apply($$0, dx::new)
   );

   @Override
   public MapCodec<dx> a() {
      return bz.f;
   }

   @Override
   public boolean a(bum $$0, ard $$1, @Nullable fbb $$2) {
      if ($$0 instanceof chv $$3) {
         return this.c.isPresent() && $$3.x() != this.c.get() ? false : !this.d.isPresent() || $$3.t() == this.d.get();
      } else {
         return false;
      }
   }

   public static dx a(cvn $$0) {
      return new dx(Optional.of(false), Optional.of($$0));
   }

   public Optional<Boolean> b() {
      return this.c;
   }

   public Optional<cvn> c() {
      return this.d;
   }
}
