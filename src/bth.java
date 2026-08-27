import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bth extends bqa<cgy> {
   private long c;

   public bth() {
      super(ImmutableMap.of(bxl.r, bxm.a, bxl.h, bxm.a), 350, 350);
   }

   protected boolean a(aow $$0, cgy $$1) {
      return this.a($$1);
   }

   protected boolean a(aow $$0, cgy $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(aow $$0, cgy $$1, long $$2) {
      bnl $$3 = $$1.dO().c(bxl.r).get();
      bqc.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.eh().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(aow $$0, cgy $$1, long $$2) {
      cgy $$3 = (cgy)$$1.dO().c(bxl.r).get();
      if (!($$1.f($$3) > 5.0)) {
         bqc.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gx();
            $$3.gx();
            this.a($$0, $$1, $$3);
         } else if ($$1.eh().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(aow $$0, cgy $$1, cgy $$2) {
      Optional<hz> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cgy> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            aep.c($$0, $$3.get());
         }
      }
   }

   protected void d(aow $$0, cgy $$1, long $$2) {
      $$1.dO().b(bxl.r);
   }

   private boolean a(cgy $$0) {
      bpj<cgy> $$1 = $$0.dO();
      Optional<bnl> $$2 = $$1.c(bxl.r).filter($$0x -> $$0x.ai() == bnw.bh);
      return $$2.isEmpty() ? false : bqc.a($$1, bxl.r, bnw.bh) && $$0.Y_() && $$2.get().Y_();
   }

   private Optional<hz> b(aow $$0, cgy $$1) {
      return $$0.y().a($$0x -> $$0x.a(bzp.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dm(), 48);
   }

   private boolean a(cgy $$0, hz $$1, ij<bzo> $$2) {
      ehl $$3 = $$0.N().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cgy> b(aow $$0, cgy $$1, cgy $$2) {
      cgy $$3 = $$1.b($$0, $$2);
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

   private void a(aow $$0, cgy $$1, hz $$2) {
      ii $$3 = ii.a($$0.ad(), $$2);
      $$1.dO().a(bxl.b, $$3);
   }
}
