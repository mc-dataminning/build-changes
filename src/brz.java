import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class brz extends brh<cih> {
   private static final int d = 1200;
   final float c;

   public brz(float $$0) {
      super(ImmutableMap.of(bys.d, byt.a), 1200);
      this.c = $$0;
   }

   protected boolean a(apf $$0, cih $$1) {
      return $$1.dP().g().map($$0x -> $$0x == ckj.b || $$0x == ckj.c || $$0x == ckj.d).orElse(true);
   }

   protected boolean a(apf $$0, cih $$1, long $$2) {
      return $$1.dP().a(bys.d);
   }

   protected void b(apf $$0, cih $$1, long $$2) {
      brj.a($$1, $$1.dP().c(bys.d).get().b(), this.c, 1);
   }

   protected void c(apf $$0, cih $$1, long $$2) {
      Optional<ik> $$3 = $$1.dP().c(bys.d);
      $$3.ifPresent($$1x -> {
         ib $$2x = $$1x.b();
         apf $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cas $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            aew.c($$0, $$2x);
         }
      });
      $$1.dP().b(bys.d);
   }
}
