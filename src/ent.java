import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ent implements env {
   private static final ent b = new ent();
   public static final MapCodec<ent> a = MapCodec.unit(b);

   @Override
   public ua a(ayv $$0, @Nullable ua $$1) {
      return new ua();
   }

   @Override
   public enw<?> a() {
      return enw.a;
   }
}
