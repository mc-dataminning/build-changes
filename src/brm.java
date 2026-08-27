import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class brm extends bob<ceu> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public brm() {
      super(ImmutableMap.of(bvm.c, bvn.a, bvm.n, bvn.c));
   }

   protected boolean b(and $$0, ceu $$1) {
      if ($$0.X() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.X();
         ig $$2 = $$1.dO().c(bvm.c).get();
         return $$2.a() == $$0.ae() && $$2.b().a($$1.dk(), 1.73);
      }
   }

   protected void a(and $$0, ceu $$1, long $$2) {
      bnk<ceu> $$3 = $$1.dO();
      $$3.a(bvm.I, $$2);
      $$3.c(bvm.c).ifPresent($$1x -> $$3.a(bvm.n, new boe($$1x.b())));
      $$1.gt();
      this.a($$0, $$1);
      if ($$1.gs()) {
         $$1.gr();
      }
   }

   protected void a(and $$0, ceu $$1) {
   }

   protected boolean b(and $$0, ceu $$1, long $$2) {
      Optional<ig> $$3 = $$1.dO().c(bvm.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ig $$4 = $$3.get();
         return $$4.a() == $$0.ae() && $$4.b().a($$1.dk(), 1.73);
      }
   }
}
