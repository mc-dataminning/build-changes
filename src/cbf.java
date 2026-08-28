import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cbf extends bxy<cpi> {
   private long c;

   public cbf() {
      super(ImmutableMap.of(cfj.r, cfk.a, cfj.h, cfk.a), 350, 350);
   }

   protected boolean a(ash $$0, cpi $$1) {
      return this.a($$1);
   }

   protected boolean a(ash $$0, cpi $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(ash $$0, cpi $$1, long $$2) {
      bva $$3 = $$1.ec().c(cfj.r).get();
      bya.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dZ().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(ash $$0, cpi $$1, long $$2) {
      cpi $$3 = (cpi)$$1.ec().c(cfj.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bya.a($$1, $$3, 0.5F, 2);
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

   private void a(ash $$0, cpi $$1, cpi $$2) {
      Optional<jh> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cpi> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.z().b($$3.get());
            ahj.c($$0, $$3.get());
         }
      }
   }

   protected void d(ash $$0, cpi $$1, long $$2) {
      $$1.ec().b(cfj.r);
   }

   private boolean a(cpi $$0) {
      bxh<cpi> $$1 = $$0.ec();
      Optional<bva> $$2 = $$1.c(cfj.r).filter($$0x -> $$0x.aq() == bvq.bD);
      return $$2.isEmpty() ? false : bya.a($$1, cfj.r, bvq.bD) && $$0.Y_() && $$2.get().Y_();
   }

   private Optional<jh> b(ash $$0, cpi $$1) {
      return $$0.z().a($$0x -> $$0x.a(chn.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dw(), 48);
   }

   private boolean a(cpi $$0, jh $$1, jq<chm> $$2) {
      euk $$3 = $$0.L().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cpi> b(ash $$0, cpi $$1, cpi $$2) {
      cpi $$3 = $$1.b($$0, $$2);
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

   private void a(ash $$0, cpi $$1, jh $$2) {
      jp $$3 = jp.a($$0.ah(), $$2);
      $$1.ec().a(cfj.b, $$3);
   }
}
