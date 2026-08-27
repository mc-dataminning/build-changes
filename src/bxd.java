import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxd extends bts<cku> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bxd() {
      super(ImmutableMap.of(cbd.c, cbe.a, cbd.n, cbe.c));
   }

   protected boolean b(aqh $$0, cku $$1) {
      if ($$0.Y() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.Y();
         iv $$2 = $$1.dQ().c(cbd.c).get();
         return $$2.a() == $$0.ae() && $$2.b().a($$1.dl(), 1.73);
      }
   }

   protected void a(aqh $$0, cku $$1, long $$2) {
      btb<cku> $$3 = $$1.dQ();
      $$3.a(cbd.J, $$2);
      $$3.c(cbd.c).ifPresent($$1x -> $$3.a(cbd.n, new btv($$1x.b())));
      $$1.gE();
      this.a($$0, $$1);
      if ($$1.gD()) {
         $$1.gC();
      }
   }

   protected void a(aqh $$0, cku $$1) {
   }

   protected boolean b(aqh $$0, cku $$1, long $$2) {
      Optional<iv> $$3 = $$1.dQ().c(cbd.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iv $$4 = $$3.get();
         return $$4.a() == $$0.ae() && $$4.b().a($$1.dl(), 1.73);
      }
   }
}
