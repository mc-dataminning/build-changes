import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byr extends bvg<cmi> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public byr() {
      super(ImmutableMap.of(ccr.c, ccs.a, ccr.n, ccs.c));
   }

   protected boolean b(are $$0, cmi $$1) {
      if ($$0.Z() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.Z();
         jh $$2 = $$1.dS().c(ccr.c).get();
         return $$2.a() == $$0.af() && $$2.b().a($$1.dn(), 1.73);
      }
   }

   protected void a(are $$0, cmi $$1, long $$2) {
      bup<cmi> $$3 = $$1.dS();
      $$3.a(ccr.J, $$2);
      $$3.c(ccr.c).ifPresent($$1x -> $$3.a(ccr.n, new bvj($$1x.b())));
      $$1.gF();
      this.a($$0, $$1);
      if ($$1.gE()) {
         $$1.gD();
      }
   }

   protected void a(are $$0, cmi $$1) {
   }

   protected boolean b(are $$0, cmi $$1, long $$2) {
      Optional<jh> $$3 = $$1.dS().c(ccr.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jh $$4 = $$3.get();
         return $$4.a() == $$0.af() && $$4.b().a($$1.dn(), 1.73);
      }
   }
}
