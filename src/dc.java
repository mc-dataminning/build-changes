import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record dc(boolean c) implements bt {
   public static final MapCodec<dc> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("is_potato").forGetter(dc::b)).apply($$0, dc::new));

   @Override
   public MapCodec<dc> a() {
      return b;
   }

   @Override
   public boolean a(brv $$0, aqt $$1, @Nullable ewu $$2) {
      return $$0.dV() == this.c;
   }

   public boolean b() {
      return this.c;
   }
}
