import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class epk implements epm {
   private static final epk b = new epk();
   public static final MapCodec<epk> a = MapCodec.unit(b);

   @Override
   public uf a(azl $$0, @Nullable uf $$1) {
      return new uf();
   }

   @Override
   public epn<?> a() {
      return epn.a;
   }
}
