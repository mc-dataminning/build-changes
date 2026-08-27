import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxu extends buj<cll> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bxu() {
      super(ImmutableMap.of(cbu.c, cbv.a, cbu.n, cbv.c));
   }

   protected boolean b(aqn $$0, cll $$1) {
      if ($$0.Y() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.Y();
         iw $$2 = $$1.dS().c(cbu.c).get();
         return $$2.a() == $$0.ae() && $$2.b().a($$1.dn(), 1.73);
      }
   }

   protected void a(aqn $$0, cll $$1, long $$2) {
      bts<cll> $$3 = $$1.dS();
      $$3.a(cbu.J, $$2);
      $$3.c(cbu.c).ifPresent($$1x -> $$3.a(cbu.n, new bum($$1x.b())));
      $$1.gE();
      this.a($$0, $$1);
      if ($$1.gD()) {
         $$1.gC();
      }
   }

   protected void a(aqn $$0, cll $$1) {
   }

   protected boolean b(aqn $$0, cll $$1, long $$2) {
      Optional<iw> $$3 = $$1.dS().c(cbu.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iw $$4 = $$3.get();
         return $$4.a() == $$0.ae() && $$4.b().a($$1.dn(), 1.73);
      }
   }
}
