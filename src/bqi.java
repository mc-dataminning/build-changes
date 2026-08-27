import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bqi extends bnc<cdm> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private long e;

   public bqi() {
      super(ImmutableMap.of(bum.r, bun.a, bum.h, bun.a), 350, 350);
   }

   protected boolean a(ami $$0, cdm $$1) {
      return this.a($$1);
   }

   protected boolean a(ami $$0, cdm $$1, long $$2) {
      return $$2 <= this.e && this.a($$1);
   }

   protected void b(ami $$0, cdm $$1, long $$2) {
      bkq $$3 = $$1.dP().c(bum.r).get();
      bne.a($$1, $$3, 0.5F);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.eh().a(50);
      this.e = $$2 + (long)$$4;
   }

   protected void c(ami $$0, cdm $$1, long $$2) {
      cdm $$3 = (cdm)$$1.dP().c(bum.r).get();
      if (!($$1.f($$3) > 5.0)) {
         bne.a($$1, $$3, 0.5F);
         if ($$2 >= this.e) {
            $$1.gw();
            $$3.gw();
            this.a($$0, $$1, $$3);
         } else if ($$1.eh().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(ami $$0, cdm $$1, cdm $$2) {
      Optional<hx> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cdm> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.x().b($$3.get());
            aco.c($$0, $$3.get());
         }
      }
   }

   protected void d(ami $$0, cdm $$1, long $$2) {
      $$1.dP().b(bum.r);
   }

   private boolean a(cdm $$0) {
      bml<cdm> $$1 = $$0.dP();
      Optional<bkq> $$2 = $$1.c(bum.r).filter($$0x -> $$0x.ai() == bkz.bf);
      return $$2.isEmpty() ? false : bne.a($$1, bum.r, bkz.bf) && $$0.Y_() && $$2.get().Y_();
   }

   private Optional<hx> b(ami $$0, cdm $$1) {
      return $$0.x().a($$0x -> $$0x.a(bwo.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dn(), 48);
   }

   private boolean a(cdm $$0, hx $$1, ig<bwn> $$2) {
      edm $$3 = $$0.N().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cdm> b(ami $$0, cdm $$1, cdm $$2) {
      cdm $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.ds(), $$1.du(), $$1.dy(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(ami $$0, cdm $$1, hx $$2) {
      ie $$3 = ie.a($$0.ad(), $$2);
      $$1.dP().a(bum.b, $$3);
   }
}
