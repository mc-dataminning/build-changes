import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cbb extends bxq<cpa> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public cbb() {
      super(ImmutableMap.of(cfb.c, cfc.a, cfb.n, cfc.c));
   }

   protected boolean b(arx $$0, cpa $$1) {
      if ($$0.ad() - this.e < 300L) {
         return false;
      } else if ($$0.A.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.ad();
         jp $$2 = $$1.ec().c(cfb.c).get();
         return $$2.a() == $$0.ai() && $$2.b().a($$1.du(), 1.73);
      }
   }

   protected void a(arx $$0, cpa $$1, long $$2) {
      bwz<cpa> $$3 = $$1.ec();
      $$3.a(cfb.J, $$2);
      $$3.c(cfb.c).ifPresent($$1x -> $$3.a(cfb.n, new bxt($$1x.b())));
      $$1.gD();
      this.a($$0, $$1);
      if ($$1.gC()) {
         $$1.gB();
      }
   }

   protected void a(arx $$0, cpa $$1) {
   }

   protected boolean b(arx $$0, cpa $$1, long $$2) {
      Optional<jp> $$3 = $$1.ec().c(cfb.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jp $$4 = $$3.get();
         return $$4.a() == $$0.ai() && $$4.b().a($$1.du(), 1.73);
      }
   }
}
