import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cbf extends bxu<cpe> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public cbf() {
      super(ImmutableMap.of(cff.c, cfg.a, cff.n, cfg.c));
   }

   protected boolean b(ash $$0, cpe $$1) {
      if ($$0.ac() - this.e < 300L) {
         return false;
      } else if ($$0.A.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.ac();
         jp $$2 = $$1.eb().c(cff.c).get();
         return $$2.a() == $$0.ah() && $$2.b().a($$1.dt(), 1.73);
      }
   }

   protected void a(ash $$0, cpe $$1, long $$2) {
      bxd<cpe> $$3 = $$1.eb();
      $$3.a(cff.J, $$2);
      $$3.c(cff.c).ifPresent($$1x -> $$3.a(cff.n, new bxx($$1x.b())));
      $$1.gB();
      this.a($$0, $$1);
      if ($$1.gA()) {
         $$1.gz();
      }
   }

   protected void a(ash $$0, cpe $$1) {
   }

   protected boolean b(ash $$0, cpe $$1, long $$2) {
      Optional<jp> $$3 = $$1.eb().c(cff.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jp $$4 = $$3.get();
         return $$4.a() == $$0.ah() && $$4.b().a($$1.dt(), 1.73);
      }
   }
}
