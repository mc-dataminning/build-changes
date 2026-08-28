import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cbj extends bxy<cpi> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public cbj() {
      super(ImmutableMap.of(cfj.c, cfk.a, cfj.n, cfk.c));
   }

   protected boolean b(ash $$0, cpi $$1) {
      if ($$0.ac() - this.e < 300L) {
         return false;
      } else if ($$0.A.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.ac();
         jp $$2 = $$1.ec().c(cfj.c).get();
         return $$2.a() == $$0.ah() && $$2.b().a($$1.du(), 1.73);
      }
   }

   protected void a(ash $$0, cpi $$1, long $$2) {
      bxh<cpi> $$3 = $$1.ec();
      $$3.a(cfj.J, $$2);
      $$3.c(cfj.c).ifPresent($$1x -> $$3.a(cfj.n, new byb($$1x.b())));
      $$1.gD();
      this.a($$0, $$1);
      if ($$1.gC()) {
         $$1.gB();
      }
   }

   protected void a(ash $$0, cpi $$1) {
   }

   protected boolean b(ash $$0, cpi $$1, long $$2) {
      Optional<jp> $$3 = $$1.ec().c(cfj.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jp $$4 = $$3.get();
         return $$4.a() == $$0.ah() && $$4.b().a($$1.du(), 1.73);
      }
   }
}
