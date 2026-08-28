import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class epd extends emi {
   public static final MapCodec<epd> d = a(epd::new);

   public epd(emi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<emi.b> a(emi.a $$0) {
      return a($$0, ebq.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(ena $$0, emi.a $$1) {
      $$0.a(new epc($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public emr<?> e() {
      return emr.o;
   }
}
