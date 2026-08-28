import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bze extends bvx<cnc> {
   private long c;

   public bze() {
      super(ImmutableMap.of(cdi.r, cdj.a, cdi.h, cdj.a), 350, 350);
   }

   protected boolean a(arg $$0, cnc $$1) {
      return this.a($$1);
   }

   protected boolean a(arg $$0, cnc $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(arg $$0, cnc $$1, long $$2) {
      btc $$3 = $$1.dX().c(cdi.r).get();
      bvz.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dV().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(arg $$0, cnc $$1, long $$2) {
      cnc $$3 = (cnc)$$1.dX().c(cdi.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bvz.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gF();
            $$3.gF();
            this.a($$0, $$1, $$3);
         } else if ($$1.dV().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(arg $$0, cnc $$1, cnc $$2) {
      Optional<je> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cnc> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            agn.c($$0, $$3.get());
         }
      }
   }

   protected void d(arg $$0, cnc $$1, long $$2) {
      $$1.dX().b(cdi.r);
   }

   private boolean a(cnc $$0) {
      bvg<cnc> $$1 = $$0.dX();
      Optional<btc> $$2 = $$1.c(cdi.r).filter($$0x -> $$0x.ao() == btq.bj);
      return $$2.isEmpty() ? false : bvz.a($$1, cdi.r, btq.bj) && $$0.aa_() && $$2.get().aa_();
   }

   private Optional<je> b(arg $$0, cnc $$1) {
      return $$0.y().a($$0x -> $$0x.a(cfm.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.ds(), 48);
   }

   private boolean a(cnc $$0, je $$1, jn<cfl> $$2) {
      eqp $$3 = $$0.P().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cnc> b(arg $$0, cnc $$1, cnc $$2) {
      cnc $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dx(), $$1.dz(), $$1.dD(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(arg $$0, cnc $$1, je $$2) {
      jm $$3 = jm.a($$0.ag(), $$2);
      $$1.dX().a(cdi.b, $$3);
   }
}
