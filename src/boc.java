import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class boc extends bks<cbc> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public boc() {
      super(ImmutableMap.of(bsc.c, bsd.a, bsc.n, bsd.c));
   }

   protected boolean b(akn $$0, cbc $$1) {
      if ($$0.V() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.V();
         hf $$2 = $$1.dM().c(bsc.c).get();
         return $$2.a() == $$0.ac() && $$2.b().a($$1.di(), 1.73);
      }
   }

   protected void a(akn $$0, cbc $$1, long $$2) {
      bkb<cbc> $$3 = $$1.dM();
      $$3.a(bsc.I, $$2);
      $$3.c(bsc.c).ifPresent($$1x -> $$3.a(bsc.n, new bkv($$1x.b())));
      $$1.gp();
      this.a($$0, $$1);
      if ($$1.go()) {
         $$1.gn();
      }
   }

   protected void a(akn $$0, cbc $$1) {
   }

   protected boolean b(akn $$0, cbc $$1, long $$2) {
      Optional<hf> $$3 = $$1.dM().c(bsc.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hf $$4 = $$3.get();
         return $$4.a() == $$0.ac() && $$4.b().a($$1.di(), 1.73);
      }
   }
}
