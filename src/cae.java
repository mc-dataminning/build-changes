import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cae extends bwt<cny> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public cae() {
      super(ImmutableMap.of(cee.c, cef.a, cee.n, cef.c));
   }

   protected boolean b(arn $$0, cny $$1) {
      if ($$0.aa() - this.e < 300L) {
         return false;
      } else if ($$0.A.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.aa();
         jp $$2 = $$1.ed().c(cee.c).get();
         return $$2.a() == $$0.ag() && $$2.b().a($$1.dv(), 1.73);
      }
   }

   protected void a(arn $$0, cny $$1, long $$2) {
      bwc<cny> $$3 = $$1.ed();
      $$3.a(cee.J, $$2);
      $$3.c(cee.c).ifPresent($$1x -> $$3.a(cee.n, new bww($$1x.b())));
      $$1.gJ();
      this.a($$0, $$1);
      if ($$1.gI()) {
         $$1.gH();
      }
   }

   protected void a(arn $$0, cny $$1) {
   }

   protected boolean b(arn $$0, cny $$1, long $$2) {
      Optional<jp> $$3 = $$1.ed().c(cee.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jp $$4 = $$3.get();
         return $$4.a() == $$0.ag() && $$4.b().a($$1.dv(), 1.73);
      }
   }
}
