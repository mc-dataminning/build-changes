import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class caf extends bwy<cog> {
   private long c;

   public caf() {
      super(ImmutableMap.of(cej.r, cek.a, cej.h, cek.a), 350, 350);
   }

   protected boolean a(arc $$0, cog $$1) {
      return this.a($$1);
   }

   protected boolean a(arc $$0, cog $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(arc $$0, cog $$1, long $$2) {
      bua $$3 = $$1.ec().c(cej.r).get();
      bxa.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dZ().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(arc $$0, cog $$1, long $$2) {
      cog $$3 = (cog)$$1.ec().c(cej.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bxa.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gF();
            $$3.gF();
            this.a($$0, $$1, $$3);
         } else if ($$1.dZ().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(arc $$0, cog $$1, cog $$2) {
      Optional<ji> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cog> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.A().b($$3.get());
            agc.c($$0, $$3.get());
         }
      }
   }

   protected void d(arc $$0, cog $$1, long $$2) {
      $$1.ec().b(cej.r);
   }

   private boolean a(cog $$0) {
      bwh<cog> $$1 = $$0.ec();
      Optional<bua> $$2 = $$1.c(cej.r).filter($$0x -> $$0x.aq() == buq.bC);
      return $$2.isEmpty() ? false : bxa.a($$1, cej.r, buq.bC) && $$0.X_() && $$2.get().X_();
   }

   private Optional<ji> b(arc $$0, cog $$1) {
      return $$0.A().a($$0x -> $$0x.a(cgn.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dw(), 48);
   }

   private boolean a(cog $$0, ji $$1, jr<cgm> $$2) {
      etl $$3 = $$0.L().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cog> b(arc $$0, cog $$1, cog $$2) {
      cog $$3 = $$1.b($$0, $$2);
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

   private void a(arc $$0, cog $$1, ji $$2) {
      jq $$3 = jq.a($$0.ai(), $$2);
      $$1.ec().a(cej.b, $$3);
   }
}
