import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class brq extends bof<cfd> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public brq() {
      super(ImmutableMap.of(bvq.c, bvr.a, bvq.n, bvr.c));
   }

   protected boolean b(ane $$0, cfd $$1) {
      if ($$0.X() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.X();
         ig $$2 = $$1.dN().c(bvq.c).get();
         return $$2.a() == $$0.ae() && $$2.b().a($$1.dj(), 1.73);
      }
   }

   protected void a(ane $$0, cfd $$1, long $$2) {
      bno<cfd> $$3 = $$1.dN();
      $$3.a(bvq.J, $$2);
      $$3.c(bvq.c).ifPresent($$1x -> $$3.a(bvq.n, new boi($$1x.b())));
      $$1.gu();
      this.a($$0, $$1);
      if ($$1.gt()) {
         $$1.gs();
      }
   }

   protected void a(ane $$0, cfd $$1) {
   }

   protected boolean b(ane $$0, cfd $$1, long $$2) {
      Optional<ig> $$3 = $$1.dN().c(bvq.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ig $$4 = $$3.get();
         return $$4.a() == $$0.ae() && $$4.b().a($$1.dj(), 1.73);
      }
   }
}
