import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzi extends bvx<cnc> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bzi() {
      super(ImmutableMap.of(cdi.c, cdj.a, cdi.n, cdj.c));
   }

   protected boolean b(arg $$0, cnc $$1) {
      if ($$0.aa() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.aa();
         jm $$2 = $$1.dX().c(cdi.c).get();
         return $$2.a() == $$0.ag() && $$2.b().a($$1.dq(), 1.73);
      }
   }

   protected void a(arg $$0, cnc $$1, long $$2) {
      bvg<cnc> $$3 = $$1.dX();
      $$3.a(cdi.J, $$2);
      $$3.c(cdi.c).ifPresent($$1x -> $$3.a(cdi.n, new bwa($$1x.b())));
      $$1.gD();
      this.a($$0, $$1);
      if ($$1.gC()) {
         $$1.gB();
      }
   }

   protected void a(arg $$0, cnc $$1) {
   }

   protected boolean b(arg $$0, cnc $$1, long $$2) {
      Optional<jm> $$3 = $$1.dX().c(cdi.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jm $$4 = $$3.get();
         return $$4.a() == $$0.ag() && $$4.b().a($$1.dq(), 1.73);
      }
   }
}
