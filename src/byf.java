import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byf extends buu<clx> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public byf() {
      super(ImmutableMap.of(ccf.c, ccg.a, ccf.n, ccg.c));
   }

   protected boolean b(aqm $$0, clx $$1) {
      if ($$0.Z() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.Z();
         ji $$2 = $$1.dU().c(ccf.c).get();
         return $$2.a() == $$0.af() && $$2.b().a($$1.do(), 1.73);
      }
   }

   protected void a(aqm $$0, clx $$1, long $$2) {
      bud<clx> $$3 = $$1.dU();
      $$3.a(ccf.J, $$2);
      $$3.c(ccf.c).ifPresent($$1x -> $$3.a(ccf.n, new bux($$1x.b())));
      $$1.gD();
      this.a($$0, $$1);
      if ($$1.gC()) {
         $$1.gB();
      }
   }

   protected void a(aqm $$0, clx $$1) {
   }

   protected boolean b(aqm $$0, clx $$1, long $$2) {
      Optional<ji> $$3 = $$1.dU().c(ccf.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ji $$4 = $$3.get();
         return $$4.a() == $$0.af() && $$4.b().a($$1.do(), 1.73);
      }
   }
}
