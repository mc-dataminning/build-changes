import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bqm extends bnc<cdm> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bqm() {
      super(ImmutableMap.of(bum.c, bun.a, bum.n, bun.c));
   }

   protected boolean b(ami $$0, cdm $$1) {
      if ($$0.W() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.W();
         ie $$2 = $$1.dP().c(bum.c).get();
         return $$2.a() == $$0.ad() && $$2.b().a($$1.dl(), 1.73);
      }
   }

   protected void a(ami $$0, cdm $$1, long $$2) {
      bml<cdm> $$3 = $$1.dP();
      $$3.a(bum.I, $$2);
      $$3.c(bum.c).ifPresent($$1x -> $$3.a(bum.n, new bnf($$1x.b())));
      $$1.gu();
      this.a($$0, $$1);
      if ($$1.gt()) {
         $$1.gs();
      }
   }

   protected void a(ami $$0, cdm $$1) {
   }

   protected boolean b(ami $$0, cdm $$1, long $$2) {
      Optional<ie> $$3 = $$1.dP().c(bum.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ie $$4 = $$3.get();
         return $$4.a() == $$0.ad() && $$4.b().a($$1.dl(), 1.73);
      }
   }
}
