import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class ccl extends bza<cqy> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public ccl() {
      super(ImmutableMap.of(cgl.c, cgm.a, cgl.o, cgm.c));
   }

   protected boolean b(arq $$0, cqy $$1) {
      if ($$0.ae() - this.e < 300L) {
         return false;
      } else if ($$0.A.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.ae();
         je $$2 = $$1.eb().c(cgl.c).get();
         return $$2.a() == $$0.aj() && $$2.b().a($$1.ds(), 1.73);
      }
   }

   protected void a(arq $$0, cqy $$1, long $$2) {
      byj<cqy> $$3 = $$1.eb();
      $$3.a(cgl.K, $$2);
      $$3.c(cgl.c).ifPresent($$1x -> $$3.a(cgl.o, new bzd($$1x.b())));
      $$1.gI();
      this.a($$0, $$1);
      if ($$1.gG()) {
         $$1.gF();
      }
   }

   protected void a(arq $$0, cqy $$1) {
   }

   protected boolean b(arq $$0, cqy $$1, long $$2) {
      Optional<je> $$3 = $$1.eb().c(cgl.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         je $$4 = $$3.get();
         return $$4.a() == $$0.aj() && $$4.b().a($$1.ds(), 1.73);
      }
   }
}
