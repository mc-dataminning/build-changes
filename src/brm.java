import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class brm extends bof<cfd> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private long e;

   public brm() {
      super(ImmutableMap.of(bvq.r, bvr.a, bvq.h, bvr.a), 350, 350);
   }

   protected boolean a(ane $$0, cfd $$1) {
      return this.a($$1);
   }

   protected boolean a(ane $$0, cfd $$1, long $$2) {
      return $$2 <= this.e && this.a($$1);
   }

   protected void b(ane $$0, cfd $$1, long $$2) {
      blr $$3 = $$1.dN().c(bvq.r).get();
      boh.a($$1, $$3, 0.5F);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.eg().a(50);
      this.e = $$2 + (long)$$4;
   }

   protected void c(ane $$0, cfd $$1, long $$2) {
      cfd $$3 = (cfd)$$1.dN().c(bvq.r).get();
      if (!($$1.f($$3) > 5.0)) {
         boh.a($$1, $$3, 0.5F);
         if ($$2 >= this.e) {
            $$1.gw();
            $$3.gw();
            this.a($$0, $$1, $$3);
         } else if ($$1.eg().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(ane $$0, cfd $$1, cfd $$2) {
      Optional<hx> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cfd> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            adj.c($$0, $$3.get());
         }
      }
   }

   protected void d(ane $$0, cfd $$1, long $$2) {
      $$1.dN().b(bvq.r);
   }

   private boolean a(cfd $$0) {
      bno<cfd> $$1 = $$0.dN();
      Optional<blr> $$2 = $$1.c(bvq.r).filter($$0x -> $$0x.ai() == bmc.bh);
      return $$2.isEmpty() ? false : boh.a($$1, bvq.r, bmc.bh) && $$0.Y_() && $$2.get().Y_();
   }

   private Optional<hx> b(ane $$0, cfd $$1) {
      return $$0.y().a($$0x -> $$0x.a(bxu.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dl(), 48);
   }

   private boolean a(cfd $$0, hx $$1, ih<bxt> $$2) {
      efo $$3 = $$0.N().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cfd> b(ane $$0, cfd $$1, cfd $$2) {
      cfd $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dq(), $$1.ds(), $$1.dw(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(ane $$0, cfd $$1, hx $$2) {
      ig $$3 = ig.a($$0.ae(), $$2);
      $$1.dN().a(bvq.b, $$3);
   }
}
