import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bun extends brg<cif> {
   private long c;

   public bun() {
      super(ImmutableMap.of(byr.r, bys.a, byr.h, bys.a), 350, 350);
   }

   protected boolean a(apf $$0, cif $$1) {
      return this.a($$1);
   }

   protected boolean a(apf $$0, cif $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(apf $$0, cif $$1, long $$2) {
      bor $$3 = $$1.dP().c(byr.r).get();
      bri.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.ei().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(apf $$0, cif $$1, long $$2) {
      cif $$3 = (cif)$$1.dP().c(byr.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bri.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gE();
            $$3.gE();
            this.a($$0, $$1, $$3);
         } else if ($$1.ei().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(apf $$0, cif $$1, cif $$2) {
      Optional<ib> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cif> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            aew.c($$0, $$3.get());
         }
      }
   }

   protected void d(apf $$0, cif $$1, long $$2) {
      $$1.dP().b(byr.r);
   }

   private boolean a(cif $$0) {
      bqp<cif> $$1 = $$0.dP();
      Optional<bor> $$2 = $$1.c(byr.r).filter($$0x -> $$0x.ai() == bpc.bi);
      return $$2.isEmpty() ? false : bri.a($$1, byr.r, bpc.bi) && $$0.W_() && $$2.get().W_();
   }

   private Optional<ib> b(apf $$0, cif $$1) {
      return $$0.y().a($$0x -> $$0x.a(cav.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dm(), 48);
   }

   private boolean a(cif $$0, ib $$1, il<cau> $$2) {
      ejc $$3 = $$0.K().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cif> b(apf $$0, cif $$1, cif $$2) {
      cif $$3 = $$1.b($$0, $$2);
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

   private void a(apf $$0, cif $$1, ib $$2) {
      ik $$3 = ik.a($$0.ad(), $$2);
      $$1.dP().a(byr.b, $$3);
   }
}
