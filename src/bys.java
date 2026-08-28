import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bys extends bvh<cmk> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bys() {
      super(ImmutableMap.of(ccs.c, cct.a, ccs.n, cct.c));
   }

   protected boolean b(aqu $$0, cmk $$1) {
      if ($$0.Z() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.Z();
         jl $$2 = $$1.dT().c(ccs.c).get();
         return $$2.a() == $$0.af() && $$2.b().a($$1.dm(), 1.73);
      }
   }

   protected void a(aqu $$0, cmk $$1, long $$2) {
      buq<cmk> $$3 = $$1.dT();
      $$3.a(ccs.J, $$2);
      $$3.c(ccs.c).ifPresent($$1x -> $$3.a(ccs.n, new bvk($$1x.b())));
      $$1.gz();
      this.a($$0, $$1);
      if ($$1.gy()) {
         $$1.gx();
      }
   }

   protected void a(aqu $$0, cmk $$1) {
   }

   protected boolean b(aqu $$0, cmk $$1, long $$2) {
      Optional<jl> $$3 = $$1.dT().c(ccs.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jl $$4 = $$3.get();
         return $$4.a() == $$0.af() && $$4.b().a($$1.dm(), 1.73);
      }
   }
}
