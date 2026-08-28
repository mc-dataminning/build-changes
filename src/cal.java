import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cal extends bxa<coi> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public cal() {
      super(ImmutableMap.of(cel.c, cem.a, cel.n, cem.c));
   }

   protected boolean b(ard $$0, coi $$1) {
      if ($$0.ad() - this.e < 300L) {
         return false;
      } else if ($$0.A.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.ad();
         jq $$2 = $$1.eb().c(cel.c).get();
         return $$2.a() == $$0.ai() && $$2.b().a($$1.dt(), 1.73);
      }
   }

   protected void a(ard $$0, coi $$1, long $$2) {
      bwj<coi> $$3 = $$1.eb();
      $$3.a(cel.J, $$2);
      $$3.c(cel.c).ifPresent($$1x -> $$3.a(cel.n, new bxd($$1x.b())));
      $$1.gH();
      this.a($$0, $$1);
      if ($$1.gG()) {
         $$1.gF();
      }
   }

   protected void a(ard $$0, coi $$1) {
   }

   protected boolean b(ard $$0, coi $$1, long $$2) {
      Optional<jq> $$3 = $$1.eb().c(cel.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jq $$4 = $$3.get();
         return $$4.a() == $$0.ai() && $$4.b().a($$1.dt(), 1.73);
      }
   }
}
