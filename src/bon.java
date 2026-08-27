import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bon extends bld<cbn> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bon() {
      super(ImmutableMap.of(bsn.c, bso.a, bsn.n, bso.c));
   }

   protected boolean b(akt $$0, cbn $$1) {
      if ($$0.V() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.V();
         hd $$2 = $$1.dN().c(bsn.c).get();
         return $$2.a() == $$0.ac() && $$2.b().a($$1.dj(), 1.73);
      }
   }

   protected void a(akt $$0, cbn $$1, long $$2) {
      bkm<cbn> $$3 = $$1.dN();
      $$3.a(bsn.I, $$2);
      $$3.c(bsn.c).ifPresent($$1x -> $$3.a(bsn.n, new blg($$1x.b())));
      $$1.gt();
      this.a($$0, $$1);
      if ($$1.gs()) {
         $$1.gr();
      }
   }

   protected void a(akt $$0, cbn $$1) {
   }

   protected boolean b(akt $$0, cbn $$1, long $$2) {
      Optional<hd> $$3 = $$1.dN().c(bsn.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hd $$4 = $$3.get();
         return $$4.a() == $$0.ac() && $$4.b().a($$1.dj(), 1.73);
      }
   }
}
