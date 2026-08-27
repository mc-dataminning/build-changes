import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bny extends bko<cay> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bny() {
      super(ImmutableMap.of(bry.c, brz.a, bry.n, brz.c));
   }

   protected boolean b(aki $$0, cay $$1) {
      if ($$0.V() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.V();
         he $$2 = $$1.dM().c(bry.c).get();
         return $$2.a() == $$0.ac() && $$2.b().a($$1.di(), 1.73);
      }
   }

   protected void a(aki $$0, cay $$1, long $$2) {
      bjx<cay> $$3 = $$1.dM();
      $$3.a(bry.I, $$2);
      $$3.c(bry.c).ifPresent($$1x -> $$3.a(bry.n, new bkr($$1x.b())));
      $$1.go();
      this.a($$0, $$1);
      if ($$1.gn()) {
         $$1.gm();
      }
   }

   protected void a(aki $$0, cay $$1) {
   }

   protected boolean b(aki $$0, cay $$1, long $$2) {
      Optional<he> $$3 = $$1.dM().c(bry.c);
      if (!$$3.isPresent()) {
         return false;
      } else {
         he $$4 = $$3.get();
         return $$4.a() == $$0.ac() && $$4.b().a($$1.di(), 1.73);
      }
   }
}
