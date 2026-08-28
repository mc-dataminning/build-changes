import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dv(Optional<Boolean> c, Optional<cuu> d) implements bw {
   public static final MapCodec<dv> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("sheared").forGetter(dv::b), cuu.q.optionalFieldOf("color").forGetter(dv::c)).apply($$0, dv::new)
   );

   @Override
   public MapCodec<dv> a() {
      return bx.f;
   }

   @Override
   public boolean a(btz $$0, arm $$1, @Nullable ezh $$2) {
      if ($$0 instanceof chi $$3) {
         return this.c.isPresent() && $$3.y() != this.c.get() ? false : !this.d.isPresent() || $$3.t() == this.d.get();
      } else {
         return false;
      }
   }

   public static dv a(cuu $$0) {
      return new dv(Optional.of(false), Optional.of($$0));
   }

   public Optional<Boolean> b() {
      return this.c;
   }

   public Optional<cuu> c() {
      return this.d;
   }
}
