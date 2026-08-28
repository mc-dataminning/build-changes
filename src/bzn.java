import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzn extends bwc<cnh> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bzn() {
      super(ImmutableMap.of(cdn.c, cdo.a, cdn.n, cdo.c));
   }

   protected boolean b(arh $$0, cnh $$1) {
      if ($$0.aa() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.aa();
         jm $$2 = $$1.dX().c(cdn.c).get();
         return $$2.a() == $$0.ag() && $$2.b().a($$1.dq(), 1.73);
      }
   }

   protected void a(arh $$0, cnh $$1, long $$2) {
      bvl<cnh> $$3 = $$1.dX();
      $$3.a(cdn.J, $$2);
      $$3.c(cdn.c).ifPresent($$1x -> $$3.a(cdn.n, new bwf($$1x.b())));
      $$1.gE();
      this.a($$0, $$1);
      if ($$1.gD()) {
         $$1.gC();
      }
   }

   protected void a(arh $$0, cnh $$1) {
   }

   protected boolean b(arh $$0, cnh $$1, long $$2) {
      Optional<jm> $$3 = $$1.dX().c(cdn.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jm $$4 = $$3.get();
         return $$4.a() == $$0.ag() && $$4.b().a($$1.dq(), 1.73);
      }
   }
}
