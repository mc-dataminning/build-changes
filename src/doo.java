import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doo extends dnv {
   public static final MapCodec<doo> b = b(doo::new);

   @Override
   public MapCodec<doo> a() {
      return b;
   }

   protected doo(drw.d $$0) {
      super(dlw.b.d, $$0);
   }

   @Override
   public void a(dbt $$0, iz $$1, drx $$2, @Nullable btk $$3, cuk $$4) {
      don.a($$0, $$1);
   }
}
