import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ekp extends eiw {
   public static final MapCodec<ekp> d = a(ekp::new);

   public ekp(eiw.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eiw.b> a(eiw.a $$0) {
      return a($$0, dyf.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(ejo $$0, eiw.a $$1) {
      ja $$2 = new ja($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new eko.a($$2));
   }

   @Override
   public ejf<?> e() {
      return ejf.a;
   }
}
