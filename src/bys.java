import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bys extends bvh<cmj> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bys() {
      super(ImmutableMap.of(ccs.c, cct.a, ccs.n, cct.c));
   }

   protected boolean b(are $$0, cmj $$1) {
      if ($$0.Z() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.Z();
         jh $$2 = $$1.dS().c(ccs.c).get();
         return $$2.a() == $$0.af() && $$2.b().a($$1.dn(), 1.73);
      }
   }

   protected void a(are $$0, cmj $$1, long $$2) {
      buq<cmj> $$3 = $$1.dS();
      $$3.a(ccs.J, $$2);
      $$3.c(ccs.c).ifPresent($$1x -> $$3.a(ccs.n, new bvk($$1x.b())));
      $$1.gF();
      this.a($$0, $$1);
      if ($$1.gE()) {
         $$1.gD();
      }
   }

   protected void a(are $$0, cmj $$1) {
   }

   protected boolean b(are $$0, cmj $$1, long $$2) {
      Optional<jh> $$3 = $$1.dS().c(ccs.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jh $$4 = $$3.get();
         return $$4.a() == $$0.af() && $$4.b().a($$1.dn(), 1.73);
      }
   }
}
