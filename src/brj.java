import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class brj extends boc<cev> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private long e;

   public brj() {
      super(ImmutableMap.of(bvn.r, bvo.a, bvn.h, bvo.a), 350, 350);
   }

   protected boolean a(and $$0, cev $$1) {
      return this.a($$1);
   }

   protected boolean a(and $$0, cev $$1, long $$2) {
      return $$2 <= this.e && this.a($$1);
   }

   protected void b(and $$0, cev $$1, long $$2) {
      blq $$3 = $$1.dO().c(bvn.r).get();
      boe.a($$1, $$3, 0.5F);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.eg().a(50);
      this.e = $$2 + (long)$$4;
   }

   protected void c(and $$0, cev $$1, long $$2) {
      cev $$3 = (cev)$$1.dO().c(bvn.r).get();
      if (!($$1.f($$3) > 5.0)) {
         boe.a($$1, $$3, 0.5F);
         if ($$2 >= this.e) {
            $$1.gv();
            $$3.gv();
            this.a($$0, $$1, $$3);
         } else if ($$1.eg().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(and $$0, cev $$1, cev $$2) {
      Optional<hx> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cev> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            adi.c($$0, $$3.get());
         }
      }
   }

   protected void d(and $$0, cev $$1, long $$2) {
      $$1.dO().b(bvn.r);
   }

   private boolean a(cev $$0) {
      bnl<cev> $$1 = $$0.dO();
      Optional<blq> $$2 = $$1.c(bvn.r).filter($$0x -> $$0x.ai() == blz.bg);
      return $$2.isEmpty() ? false : boe.a($$1, bvn.r, blz.bg) && $$0.Y_() && $$2.get().Y_();
   }

   private Optional<hx> b(and $$0, cev $$1) {
      return $$0.y().a($$0x -> $$0x.a(bxq.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dm(), 48);
   }

   private boolean a(cev $$0, hx $$1, ih<bxp> $$2) {
      efg $$3 = $$0.N().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cev> b(and $$0, cev $$1, cev $$2) {
      cev $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dr(), $$1.dt(), $$1.dx(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(and $$0, cev $$1, hx $$2) {
      ig $$3 = ig.a($$0.ae(), $$2);
      $$1.dO().a(bvn.b, $$3);
   }
}
