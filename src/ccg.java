import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class ccg extends byv<cqo> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public ccg() {
      super(ImmutableMap.of(cgg.c, cgh.a, cgg.o, cgh.c));
   }

   protected boolean b(arq $$0, cqo $$1) {
      if ($$0.ae() - this.e < 300L) {
         return false;
      } else if ($$0.A.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.ae();
         jd $$2 = $$1.ec().c(cgg.c).get();
         return $$2.a() == $$0.aj() && $$2.b().a($$1.dt(), 1.73);
      }
   }

   protected void a(arq $$0, cqo $$1, long $$2) {
      bye<cqo> $$3 = $$1.ec();
      $$3.a(cgg.K, $$2);
      $$3.c(cgg.c).ifPresent($$1x -> $$3.a(cgg.o, new byy($$1x.b())));
      $$1.gG();
      this.a($$0, $$1);
      if ($$1.gE()) {
         $$1.gD();
      }
   }

   protected void a(arq $$0, cqo $$1) {
   }

   protected boolean b(arq $$0, cqo $$1, long $$2) {
      Optional<jd> $$3 = $$1.ec().c(cgg.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jd $$4 = $$3.get();
         return $$4.a() == $$0.aj() && $$4.b().a($$1.dt(), 1.73);
      }
   }
}
