import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class ccw extends bzl<crj> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public ccw() {
      super(ImmutableMap.of(cgw.c, cgx.a, cgw.o, cgx.c));
   }

   protected boolean b(ars $$0, crj $$1) {
      if ($$0.ae() - this.e < 300L) {
         return false;
      } else if ($$0.A.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.ae();
         je $$2 = $$1.ec().c(cgw.c).get();
         return $$2.a() == $$0.aj() && $$2.b().a($$1.dt(), 1.73);
      }
   }

   protected void a(ars $$0, crj $$1, long $$2) {
      byu<crj> $$3 = $$1.ec();
      $$3.a(cgw.K, $$2);
      $$3.c(cgw.c).ifPresent($$1x -> $$3.a(cgw.o, new bzo($$1x.b())));
      $$1.gJ();
      this.a($$0, $$1);
      if ($$1.gH()) {
         $$1.gG();
      }
   }

   protected void a(ars $$0, crj $$1) {
   }

   protected boolean b(ars $$0, crj $$1, long $$2) {
      Optional<je> $$3 = $$1.ec().c(cgw.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         je $$4 = $$3.get();
         return $$4.a() == $$0.aj() && $$4.b().a($$1.dt(), 1.73);
      }
   }
}
