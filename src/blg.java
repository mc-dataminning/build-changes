import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class blg extends bko<cay> {
   private static final int d = 1200;
   final float c;

   public blg(float $$0) {
      super(ImmutableMap.of(bry.d, brz.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aki $$0, cay $$1) {
      return $$1.dM().g().map($$0x -> $$0x == ccw.b || $$0x == ccw.c || $$0x == ccw.d).orElse(true);
   }

   protected boolean a(aki $$0, cay $$1, long $$2) {
      return $$1.dM().a(bry.d);
   }

   protected void b(aki $$0, cay $$1, long $$2) {
      bkq.a($$1, $$1.dM().c(bry.d).get().b(), this.c, 1);
   }

   protected void c(aki $$0, cay $$1, long $$2) {
      Optional<he> $$3 = $$1.dM().c(bry.d);
      $$3.ifPresent($$1x -> {
         gv $$2x = $$1x.b();
         aki $$3x = $$0.n().a($$1x.a());
         if ($$3x != null) {
            btw $$4 = $$3x.w();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            aau.c($$0, $$2x);
         }
      });
      $$1.dM().b(bry.d);
   }
}
