import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byv extends bvk<cmm> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public byv() {
      super(ImmutableMap.of(ccv.c, ccw.a, ccv.n, ccw.c));
   }

   protected boolean b(arf $$0, cmm $$1) {
      if ($$0.Z() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.Z();
         jh $$2 = $$1.dS().c(ccv.c).get();
         return $$2.a() == $$0.af() && $$2.b().a($$1.dn(), 1.73);
      }
   }

   protected void a(arf $$0, cmm $$1, long $$2) {
      but<cmm> $$3 = $$1.dS();
      $$3.a(ccv.J, $$2);
      $$3.c(ccv.c).ifPresent($$1x -> $$3.a(ccv.n, new bvn($$1x.b())));
      $$1.gF();
      this.a($$0, $$1);
      if ($$1.gE()) {
         $$1.gD();
      }
   }

   protected void a(arf $$0, cmm $$1) {
   }

   protected boolean b(arf $$0, cmm $$1, long $$2) {
      Optional<jh> $$3 = $$1.dS().c(ccv.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jh $$4 = $$3.get();
         return $$4.a() == $$0.af() && $$4.b().a($$1.dn(), 1.73);
      }
   }
}
