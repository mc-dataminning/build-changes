import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class boh extends bkx<cbh> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public boh() {
      super(ImmutableMap.of(bsh.c, bsi.a, bsh.n, bsi.c));
   }

   protected boolean b(akq $$0, cbh $$1) {
      if ($$0.V() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.V();
         hd $$2 = $$1.dN().c(bsh.c).get();
         return $$2.a() == $$0.ac() && $$2.b().a($$1.dj(), 1.73);
      }
   }

   protected void a(akq $$0, cbh $$1, long $$2) {
      bkg<cbh> $$3 = $$1.dN();
      $$3.a(bsh.I, $$2);
      $$3.c(bsh.c).ifPresent($$1x -> $$3.a(bsh.n, new bla($$1x.b())));
      $$1.gs();
      this.a($$0, $$1);
      if ($$1.gr()) {
         $$1.gq();
      }
   }

   protected void a(akq $$0, cbh $$1) {
   }

   protected boolean b(akq $$0, cbh $$1, long $$2) {
      Optional<hd> $$3 = $$1.dN().c(bsh.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hd $$4 = $$3.get();
         return $$4.a() == $$0.ac() && $$4.b().a($$1.dj(), 1.73);
      }
   }
}
