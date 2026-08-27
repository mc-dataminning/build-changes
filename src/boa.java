import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class boa extends bkq<cba> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public boa() {
      super(ImmutableMap.of(bsa.c, bsb.a, bsa.n, bsb.c));
   }

   protected boolean b(akk $$0, cba $$1) {
      if ($$0.V() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.V();
         hd $$2 = $$1.dM().c(bsa.c).get();
         return $$2.a() == $$0.ac() && $$2.b().a($$1.di(), 1.73);
      }
   }

   protected void a(akk $$0, cba $$1, long $$2) {
      bjz<cba> $$3 = $$1.dM();
      $$3.a(bsa.I, $$2);
      $$3.c(bsa.c).ifPresent($$1x -> $$3.a(bsa.n, new bkt($$1x.b())));
      $$1.go();
      this.a($$0, $$1);
      if ($$1.gn()) {
         $$1.gm();
      }
   }

   protected void a(akk $$0, cba $$1) {
   }

   protected boolean b(akk $$0, cba $$1, long $$2) {
      Optional<hd> $$3 = $$1.dM().c(bsa.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hd $$4 = $$3.get();
         return $$4.a() == $$0.ac() && $$4.b().a($$1.di(), 1.73);
      }
   }
}
