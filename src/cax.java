import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cax extends bxq<cpa> {
   private long c;

   public cax() {
      super(ImmutableMap.of(cfb.r, cfc.a, cfb.h, cfc.a), 350, 350);
   }

   protected boolean a(arx $$0, cpa $$1) {
      return this.a($$1);
   }

   protected boolean a(arx $$0, cpa $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(arx $$0, cpa $$1, long $$2) {
      bus $$3 = $$1.ec().c(cfb.r).get();
      bxs.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dZ().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(arx $$0, cpa $$1, long $$2) {
      cpa $$3 = (cpa)$$1.ec().c(cfb.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bxs.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gE();
            $$3.gE();
            this.a($$0, $$1, $$3);
         } else if ($$1.dZ().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(arx $$0, cpa $$1, cpa $$2) {
      Optional<jh> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cpa> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.A().b($$3.get());
            agy.c($$0, $$3.get());
         }
      }
   }

   protected void d(arx $$0, cpa $$1, long $$2) {
      $$1.ec().b(cfb.r);
   }

   private boolean a(cpa $$0) {
      bwz<cpa> $$1 = $$0.ec();
      Optional<bus> $$2 = $$1.c(cfb.r).filter($$0x -> $$0x.aq() == bvi.bD);
      return $$2.isEmpty() ? false : bxs.a($$1, cfb.r, bvi.bD) && $$0.Y_() && $$2.get().Y_();
   }

   private Optional<jh> b(arx $$0, cpa $$1) {
      return $$0.A().a($$0x -> $$0x.a(chf.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dw(), 48);
   }

   private boolean a(cpa $$0, jh $$1, jq<che> $$2) {
      eue $$3 = $$0.L().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cpa> b(arx $$0, cpa $$1, cpa $$2) {
      cpa $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dB(), $$1.dD(), $$1.dH(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(arx $$0, cpa $$1, jh $$2) {
      jp $$3 = jp.a($$0.ai(), $$2);
      $$1.ec().a(cfb.b, $$3);
   }
}
