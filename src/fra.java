import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fra(int b) implements frd {
   public static final MapCodec<fra> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("default").forGetter(fra::b)).apply($$0, fra::new));

   @Override
   public int a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2) {
      return dca.a($$0, this.b);
   }

   @Override
   public MapCodec<fra> a() {
      return a;
   }
}
