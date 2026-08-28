import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class ccy extends bzn<crl> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public ccy() {
      super(ImmutableMap.of(cgy.c, cgz.a, cgy.o, cgz.c));
   }

   protected boolean b(aru $$0, crl $$1) {
      if ($$0.ae() - this.e < 300L) {
         return false;
      } else if ($$0.A.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.ae();
         jf $$2 = $$1.ec().c(cgy.c).get();
         return $$2.a() == $$0.aj() && $$2.b().a($$1.dt(), 1.73);
      }
   }

   protected void a(aru $$0, crl $$1, long $$2) {
      byw<crl> $$3 = $$1.ec();
      $$3.a(cgy.K, $$2);
      $$3.c(cgy.c).ifPresent($$1x -> $$3.a(cgy.o, new bzq($$1x.b())));
      $$1.gJ();
      this.a($$0, $$1);
      if ($$1.gH()) {
         $$1.gG();
      }
   }

   protected void a(aru $$0, crl $$1) {
   }

   protected boolean b(aru $$0, crl $$1, long $$2) {
      Optional<jf> $$3 = $$1.ec().c(cgy.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jf $$4 = $$3.get();
         return $$4.a() == $$0.aj() && $$4.b().a($$1.dt(), 1.73);
      }
   }
}
