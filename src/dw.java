import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dw(Optional<Boolean> c, Optional<cwm> d) implements bx {
   public static final MapCodec<dw> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("sheared").forGetter(dw::b), cwm.q.optionalFieldOf("color").forGetter(dw::c)).apply($$0, dw::new)
   );

   @Override
   public MapCodec<dw> a() {
      return by.f;
   }

   @Override
   public boolean a(bvk $$0, ash $$1, @Nullable fby $$2) {
      if ($$0 instanceof cit $$3) {
         return this.c.isPresent() && $$3.x() != this.c.get() ? false : !this.d.isPresent() || $$3.t() == this.d.get();
      } else {
         return false;
      }
   }

   public static dw a(cwm $$0) {
      return new dw(Optional.of(false), Optional.of($$0));
   }

   public Optional<Boolean> b() {
      return this.c;
   }

   public Optional<cwm> c() {
      return this.d;
   }
}
