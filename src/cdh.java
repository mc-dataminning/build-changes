import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cdh extends bzw<cru> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public cdh() {
      super(ImmutableMap.of(chh.c, chi.a, chh.o, chi.c));
   }

   protected boolean b(asb $$0, cru $$1) {
      if ($$0.ae() - this.e < 300L) {
         return false;
      } else if ($$0.A.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.ae();
         jf $$2 = $$1.ec().c(chh.c).get();
         return $$2.a() == $$0.aj() && $$2.b().a($$1.dt(), 1.73);
      }
   }

   protected void a(asb $$0, cru $$1, long $$2) {
      bzf<cru> $$3 = $$1.ec();
      $$3.a(chh.K, $$2);
      $$3.c(chh.c).ifPresent($$1x -> $$3.a(chh.o, new bzz($$1x.b())));
      $$1.gJ();
      this.a($$0, $$1);
      if ($$1.gH()) {
         $$1.gG();
      }
   }

   protected void a(asb $$0, cru $$1) {
   }

   protected boolean b(asb $$0, cru $$1, long $$2) {
      Optional<jf> $$3 = $$1.ec().c(chh.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jf $$4 = $$3.get();
         return $$4.a() == $$0.aj() && $$4.b().a($$1.dt(), 1.73);
      }
   }
}
