import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bnz extends bkp<caz> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bnz() {
      super(ImmutableMap.of(brz.c, bsa.a, brz.n, bsa.c));
   }

   protected boolean b(akk $$0, caz $$1) {
      if ($$0.V() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.V();
         hd $$2 = $$1.dM().c(brz.c).get();
         return $$2.a() == $$0.ac() && $$2.b().a($$1.di(), 1.73);
      }
   }

   protected void a(akk $$0, caz $$1, long $$2) {
      bjy<caz> $$3 = $$1.dM();
      $$3.a(brz.I, $$2);
      $$3.c(brz.c).ifPresent($$1x -> $$3.a(brz.n, new bks($$1x.b())));
      $$1.gp();
      this.a($$0, $$1);
      if ($$1.go()) {
         $$1.gn();
      }
   }

   protected void a(akk $$0, caz $$1) {
   }

   protected boolean b(akk $$0, caz $$1, long $$2) {
      Optional<hd> $$3 = $$1.dM().c(brz.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hd $$4 = $$3.get();
         return $$4.a() == $$0.ac() && $$4.b().a($$1.di(), 1.73);
      }
   }
}
