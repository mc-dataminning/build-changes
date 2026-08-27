import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvr extends bsg<cjg> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bvr() {
      super(ImmutableMap.of(bzr.c, bzs.a, bzr.n, bzs.c));
   }

   protected boolean b(aps $$0, cjg $$1) {
      if ($$0.Y() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.Y();
         ik $$2 = $$1.dP().c(bzr.c).get();
         return $$2.a() == $$0.ae() && $$2.b().a($$1.dk(), 1.73);
      }
   }

   protected void a(aps $$0, cjg $$1, long $$2) {
      brp<cjg> $$3 = $$1.dP();
      $$3.a(bzr.J, $$2);
      $$3.c(bzr.c).ifPresent($$1x -> $$3.a(bzr.n, new bsj($$1x.b())));
      $$1.gC();
      this.a($$0, $$1);
      if ($$1.gB()) {
         $$1.gA();
      }
   }

   protected void a(aps $$0, cjg $$1) {
   }

   protected boolean b(aps $$0, cjg $$1, long $$2) {
      Optional<ik> $$3 = $$1.dP().c(bzr.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ik $$4 = $$3.get();
         return $$4.a() == $$0.ae() && $$4.b().a($$1.dk(), 1.73);
      }
   }
}
