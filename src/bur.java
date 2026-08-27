import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bur extends brg<cif> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bur() {
      super(ImmutableMap.of(byr.c, bys.a, byr.n, bys.c));
   }

   protected boolean b(apf $$0, cif $$1) {
      if ($$0.X() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.X();
         ik $$2 = $$1.dP().c(byr.c).get();
         return $$2.a() == $$0.ad() && $$2.b().a($$1.dk(), 1.73);
      }
   }

   protected void a(apf $$0, cif $$1, long $$2) {
      bqp<cif> $$3 = $$1.dP();
      $$3.a(byr.J, $$2);
      $$3.c(byr.c).ifPresent($$1x -> $$3.a(byr.n, new brj($$1x.b())));
      $$1.gC();
      this.a($$0, $$1);
      if ($$1.gB()) {
         $$1.gA();
      }
   }

   protected void a(apf $$0, cif $$1) {
   }

   protected boolean b(apf $$0, cif $$1, long $$2) {
      Optional<ik> $$3 = $$1.dP().c(byr.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ik $$4 = $$3.get();
         return $$4.a() == $$0.ad() && $$4.b().a($$1.dk(), 1.73);
      }
   }
}
