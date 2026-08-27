import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class btl extends bqa<cgy> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public btl() {
      super(ImmutableMap.of(bxl.c, bxm.a, bxl.n, bxm.c));
   }

   protected boolean b(aow $$0, cgy $$1) {
      if ($$0.X() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.X();
         ii $$2 = $$1.dO().c(bxl.c).get();
         return $$2.a() == $$0.ad() && $$2.b().a($$1.dk(), 1.73);
      }
   }

   protected void a(aow $$0, cgy $$1, long $$2) {
      bpj<cgy> $$3 = $$1.dO();
      $$3.a(bxl.J, $$2);
      $$3.c(bxl.c).ifPresent($$1x -> $$3.a(bxl.n, new bqd($$1x.b())));
      $$1.gv();
      this.a($$0, $$1);
      if ($$1.gu()) {
         $$1.gt();
      }
   }

   protected void a(aow $$0, cgy $$1) {
   }

   protected boolean b(aow $$0, cgy $$1, long $$2) {
      Optional<ii> $$3 = $$1.dO().c(bxl.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ii $$4 = $$3.get();
         return $$4.a() == $$0.ad() && $$4.b().a($$1.dk(), 1.73);
      }
   }
}
