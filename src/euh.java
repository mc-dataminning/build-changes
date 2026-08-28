import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class euh extends esn {
   public static final MapCodec<euh> d = a(euh::new);

   public euh(esn.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esn.b> a(esn.a $$0) {
      return a($$0, ehp.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(etf $$0, esn.a $$1) {
      iw $$2 = new iw($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new eug.a($$2));
   }

   @Override
   public esw<?> e() {
      return esw.a;
   }
}
