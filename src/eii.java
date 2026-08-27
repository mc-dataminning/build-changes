import com.mojang.serialization.Codec;
import java.util.Optional;

public class eii extends egp {
   public static final Codec<eii> d = a(eii::new);

   public eii(egp.c $$0) {
      super($$0);
   }

   @Override
   public Optional<egp.b> a(egp.a $$0) {
      return a($$0, dvz.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(ehh $$0, egp.a $$1) {
      in $$2 = new in($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new eih.a($$2));
   }

   @Override
   public egy<?> e() {
      return egy.a;
   }
}
