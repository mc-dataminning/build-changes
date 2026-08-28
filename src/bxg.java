import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxg extends bwo<cnt> {
   private static final int d = 1200;
   final float c;

   public bxg(float $$0) {
      super(ImmutableMap.of(cdz.d, cea.a), 1200);
      this.c = $$0;
   }

   protected boolean a(arm $$0, cnt $$1) {
      return $$1.ed().g().map($$0x -> $$0x == cpz.b || $$0x == cpz.c || $$0x == cpz.d).orElse(true);
   }

   protected boolean a(arm $$0, cnt $$1, long $$2) {
      return $$1.ed().a(cdz.d);
   }

   protected void b(arm $$0, cnt $$1, long $$2) {
      bwq.a($$1, $$1.ed().c(cdz.d).get().b(), this.c, 1);
   }

   protected void c(arm $$0, cnt $$1, long $$2) {
      Optional<jo> $$3 = $$1.ed().c(cdz.d);
      $$3.ifPresent($$1x -> {
         jg $$2x = $$1x.b();
         arm $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cfz $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agr.c($$0, $$2x);
         }
      });
      $$1.ed().b(cdz.d);
   }
}
