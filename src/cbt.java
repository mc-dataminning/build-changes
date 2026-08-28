import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cbt extends byi<cpu> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public cbt() {
      super(ImmutableMap.of(cft.c, cfu.a, cft.o, cfu.c));
   }

   protected boolean b(arn $$0, cpu $$1) {
      if ($$0.ae() - this.e < 300L) {
         return false;
      } else if ($$0.A.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.ae();
         jr $$2 = $$1.eb().c(cft.c).get();
         return $$2.a() == $$0.aj() && $$2.b().a($$1.dt(), 1.73);
      }
   }

   protected void a(arn $$0, cpu $$1, long $$2) {
      bxr<cpu> $$3 = $$1.eb();
      $$3.a(cft.K, $$2);
      $$3.c(cft.c).ifPresent($$1x -> $$3.a(cft.o, new byl($$1x.b())));
      $$1.gE();
      this.a($$0, $$1);
      if ($$1.gD()) {
         $$1.gC();
      }
   }

   protected void a(arn $$0, cpu $$1) {
   }

   protected boolean b(arn $$0, cpu $$1, long $$2) {
      Optional<jr> $$3 = $$1.eb().c(cft.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jr $$4 = $$3.get();
         return $$4.a() == $$0.aj() && $$4.b().a($$1.dt(), 1.73);
      }
   }
}
