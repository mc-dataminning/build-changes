import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byu extends bvj<cml> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public byu() {
      super(ImmutableMap.of(ccu.c, ccv.a, ccu.n, ccv.c));
   }

   protected boolean b(arf $$0, cml $$1) {
      if ($$0.Z() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.Z();
         jh $$2 = $$1.dS().c(ccu.c).get();
         return $$2.a() == $$0.af() && $$2.b().a($$1.dn(), 1.73);
      }
   }

   protected void a(arf $$0, cml $$1, long $$2) {
      bus<cml> $$3 = $$1.dS();
      $$3.a(ccu.J, $$2);
      $$3.c(ccu.c).ifPresent($$1x -> $$3.a(ccu.n, new bvm($$1x.b())));
      $$1.gF();
      this.a($$0, $$1);
      if ($$1.gE()) {
         $$1.gD();
      }
   }

   protected void a(arf $$0, cml $$1) {
   }

   protected boolean b(arf $$0, cml $$1, long $$2) {
      Optional<jh> $$3 = $$1.dS().c(ccu.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jh $$4 = $$3.get();
         return $$4.a() == $$0.af() && $$4.b().a($$1.dn(), 1.73);
      }
   }
}
