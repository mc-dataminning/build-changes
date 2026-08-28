import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class epw extends eoc {
   public static final MapCodec<epw> d = a(epw::new);

   public epw(eoc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eoc.b> a(eoc.a $$0) {
      return a($$0, edi.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(eou $$0, eoc.a $$1) {
      jh $$2 = new jh($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new epv.a($$2));
   }

   @Override
   public eol<?> e() {
      return eol.a;
   }
}
