import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bqx extends bnm<cee> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bqx() {
      super(ImmutableMap.of(bux.c, buy.a, bux.n, buy.c));
   }

   protected boolean b(amp $$0, cee $$1) {
      if ($$0.W() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.W();
         id $$2 = $$1.dO().c(bux.c).get();
         return $$2.a() == $$0.ad() && $$2.b().a($$1.dk(), 1.73);
      }
   }

   protected void a(amp $$0, cee $$1, long $$2) {
      bmv<cee> $$3 = $$1.dO();
      $$3.a(bux.I, $$2);
      $$3.c(bux.c).ifPresent($$1x -> $$3.a(bux.n, new bnp($$1x.b())));
      $$1.gt();
      this.a($$0, $$1);
      if ($$1.gs()) {
         $$1.gr();
      }
   }

   protected void a(amp $$0, cee $$1) {
   }

   protected boolean b(amp $$0, cee $$1, long $$2) {
      Optional<id> $$3 = $$1.dO().c(bux.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         id $$4 = $$3.get();
         return $$4.a() == $$0.ad() && $$4.b().a($$1.dk(), 1.73);
      }
   }
}
