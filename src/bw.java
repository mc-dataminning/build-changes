import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bw(Optional<Boolean> d) implements bs {
   public static final bw b = new bw(Optional.empty());
   public static final MapCodec<bw> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(avp.a(Codec.BOOL, "in_open_water").forGetter(bw::b)).apply($$0, bw::new));

   public static bw a(boolean $$0) {
      return new bw(Optional.of($$0));
   }

   @Override
   public bs.a a() {
      return bs.b.c;
   }

   @Override
   public boolean a(bno $$0, aov $$1, @Nullable ens $$2) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         return $$0 instanceof chv $$3 ? this.d.get() == $$3.q() : false;
      }
   }

   public Optional<Boolean> b() {
      return this.d;
   }
}
