import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzi extends byq<cqe> {
   private static final int d = 1200;
   final float c;

   public bzi(float $$0) {
      super(ImmutableMap.of(cgb.d, cgc.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aro $$0, cqe $$1) {
      return $$1.eb().g().map($$0x -> $$0x == csl.b || $$0x == csl.c || $$0x == csl.d).orElse(true);
   }

   protected boolean a(aro $$0, cqe $$1, long $$2) {
      return $$1.eb().a(cgb.d);
   }

   protected void b(aro $$0, cqe $$1, long $$2) {
      bys.a($$1, $$1.eb().c(cgb.d).get().b(), this.c, 1);
   }

   protected void c(aro $$0, cqe $$1, long $$2) {
      Optional<jd> $$3 = $$1.eb().c(cgb.d);
      $$3.ifPresent($$1x -> {
         iu $$2x = $$1x.b();
         aro $$3x = $$0.p().a($$1x.a());
         if ($$3x != null) {
            cib $$4 = $$3x.A();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agk.c($$0, $$2x);
         }
      });
      $$1.eb().b(cgb.d);
   }
}
