import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxp extends bwx<coc> {
   private static final int d = 1200;
   final float c;

   public bxp(float $$0) {
      super(ImmutableMap.of(cei.d, cej.a), 1200);
      this.c = $$0;
   }

   protected boolean a(arq $$0, coc $$1) {
      return $$1.ee().g().map($$0x -> $$0x == cqi.b || $$0x == cqi.c || $$0x == cqi.d).orElse(true);
   }

   protected boolean a(arq $$0, coc $$1, long $$2) {
      return $$1.ee().a(cei.d);
   }

   protected void b(arq $$0, coc $$1, long $$2) {
      bwz.a($$1, $$1.ee().c(cei.d).get().b(), this.c, 1);
   }

   protected void c(arq $$0, coc $$1, long $$2) {
      Optional<jp> $$3 = $$1.ee().c(cei.d);
      $$3.ifPresent($$1x -> {
         jh $$2x = $$1x.b();
         arq $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cgi $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agv.c($$0, $$2x);
         }
      });
      $$1.ee().b(cei.d);
   }
}
