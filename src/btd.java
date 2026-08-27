import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class btd extends bsl<cjn> {
   private static final int d = 1200;
   final float c;

   public btd(float $$0) {
      super(ImmutableMap.of(bzw.d, bzx.a), 1200);
      this.c = $$0;
   }

   protected boolean a(apu $$0, cjn $$1) {
      return $$1.dP().g().map($$0x -> $$0x == clp.b || $$0x == clp.c || $$0x == clp.d).orElse(true);
   }

   protected boolean a(apu $$0, cjn $$1, long $$2) {
      return $$1.dP().a(bzw.d);
   }

   protected void b(apu $$0, cjn $$1, long $$2) {
      bsn.a($$1, $$1.dP().c(bzw.d).get().b(), this.c, 1);
   }

   protected void c(apu $$0, cjn $$1, long $$2) {
      Optional<im> $$3 = $$1.dP().c(bzw.d);
      $$3.ifPresent($$1x -> {
         id $$2x = $$1x.b();
         apu $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cbw $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            afk.c($$0, $$2x);
         }
      });
      $$1.dP().b(bzw.d);
   }
}
