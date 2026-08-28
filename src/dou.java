import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dou extends dob {
   public static final MapCodec<dou> b = b(dou::new);

   @Override
   public MapCodec<dou> a() {
      return b;
   }

   protected dou(dsc.d $$0) {
      super(dmc.b.d, $$0);
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, @Nullable btq $$3, cuq $$4) {
      dot.a($$0, $$1);
   }
}
