import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cay extends bxr<cpd> {
   private long c;

   public cay() {
      super(ImmutableMap.of(cfc.r, cfd.a, cfc.h, cfd.a), 350, 350);
   }

   protected boolean a(ard $$0, cpd $$1) {
      return this.a($$1);
   }

   protected boolean a(ard $$0, cpd $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(ard $$0, cpd $$1, long $$2) {
      buq $$3 = $$1.ea().c(cfc.r).get();
      bxt.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dX().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(ard $$0, cpd $$1, long $$2) {
      cpd $$3 = (cpd)$$1.ea().c(cfc.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bxt.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gH();
            $$3.gH();
            this.a($$0, $$1, $$3);
         } else if ($$1.dX().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(ard $$0, cpd $$1, cpd $$2) {
      Optional<ji> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cpd> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.A().b($$3.get());
            agc.c($$0, $$3.get());
         }
      }
   }

   protected void d(ard $$0, cpd $$1, long $$2) {
      $$1.ea().b(cfc.r);
   }

   private boolean a(cpd $$0) {
      bxa<cpd> $$1 = $$0.ea();
      Optional<buq> $$2 = $$1.c(cfc.r).filter($$0x -> $$0x.aq() == bvi.bC);
      return $$2.isEmpty() ? false : bxt.a($$1, cfc.r, bvi.bC) && $$0.S_() && $$2.get().S_();
   }

   private Optional<ji> b(ard $$0, cpd $$1) {
      return $$0.A().a($$0x -> $$0x.a(chg.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.du(), 48);
   }

   private boolean a(cpd $$0, ji $$1, jr<chf> $$2) {
      euk $$3 = $$0.O().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cpd> b(ard $$0, cpd $$1, cpd $$2) {
      cpd $$3 = $$1.b($$0, $$2);
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

   private void a(ard $$0, cpd $$1, ji $$2) {
      jq $$3 = jq.a($$0.aj(), $$2);
      $$1.ea().a(cfc.b, $$3);
   }
}
