import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bth extends bpw<cgu> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bth() {
      super(ImmutableMap.of(bxh.c, bxi.a, bxh.n, bxi.c));
   }

   protected boolean b(aov $$0, cgu $$1) {
      if ($$0.X() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.X();
         ii $$2 = $$1.dO().c(bxh.c).get();
         return $$2.a() == $$0.ae() && $$2.b().a($$1.dk(), 1.73);
      }
   }

   protected void a(aov $$0, cgu $$1, long $$2) {
      bpf<cgu> $$3 = $$1.dO();
      $$3.a(bxh.J, $$2);
      $$3.c(bxh.c).ifPresent($$1x -> $$3.a(bxh.n, new bpz($$1x.b())));
      $$1.gv();
      this.a($$0, $$1);
      if ($$1.gu()) {
         $$1.gt();
      }
   }

   protected void a(aov $$0, cgu $$1) {
   }

   protected boolean b(aov $$0, cgu $$1, long $$2) {
      Optional<ii> $$3 = $$1.dO().c(bxh.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ii $$4 = $$3.get();
         return $$4.a() == $$0.ae() && $$4.b().a($$1.dk(), 1.73);
      }
   }
}
