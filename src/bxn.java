import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxn extends bug<cll> {
   private long c;

   public bxn() {
      super(ImmutableMap.of(cbr.r, cbs.a, cbr.h, cbs.a), 350, 350);
   }

   protected boolean a(aqt $$0, cll $$1) {
      return this.a($$1);
   }

   protected boolean a(aqt $$0, cll $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(aqt $$0, cll $$1, long $$2) {
      brp $$3 = $$1.dZ().c(cbr.r).get();
      bui.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.et().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(aqt $$0, cll $$1, long $$2) {
      cll $$3 = (cll)$$1.dZ().c(cbr.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bui.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gP();
            $$3.gP();
            this.a($$0, $$1, $$3);
         } else if ($$1.et().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(aqt $$0, cll $$1, cll $$2) {
      Optional<ir> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cll> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            agi.c($$0, $$3.get());
         }
      }
   }

   protected void d(aqt $$0, cll $$1, long $$2) {
      $$1.dZ().b(cbr.r);
   }

   private boolean a(cll $$0) {
      btp<cll> $$1 = $$0.dZ();
      Optional<brp> $$2 = $$1.c(cbr.r).filter($$0x -> $$0x.ak() == bsb.bn);
      return $$2.isEmpty() ? false : bui.a($$1, cbr.r, bsb.bn) && $$0.Y_() && $$2.get().Y_();
   }

   private Optional<ir> b(aqt $$0, cll $$1) {
      return $$0.y().a($$0x -> $$0x.a(cdv.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.du(), 48);
   }

   private boolean a(cll $$0, ir $$1, ja<cdu> $$2) {
      eps $$3 = $$0.J().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cll> b(aqt $$0, cll $$1, cll $$2) {
      cll $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dz(), $$1.dB(), $$1.dF(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(aqt $$0, cll $$1, ir $$2) {
      iz $$3 = iz.a($$0.af(), $$2);
      $$1.dZ().a(cbr.b, $$3);
   }
}
