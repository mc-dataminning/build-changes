import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cai extends bxb<coj> {
   private long c;

   public cai() {
      super(ImmutableMap.of(cem.r, cen.a, cem.h, cen.a), 350, 350);
   }

   protected boolean a(ard $$0, coj $$1) {
      return this.a($$1);
   }

   protected boolean a(ard $$0, coj $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(ard $$0, coj $$1, long $$2) {
      bud $$3 = $$1.eb().c(cem.r).get();
      bxd.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dY().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(ard $$0, coj $$1, long $$2) {
      coj $$3 = (coj)$$1.eb().c(cem.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bxd.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gI();
            $$3.gI();
            this.a($$0, $$1, $$3);
         } else if ($$1.dY().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(ard $$0, coj $$1, coj $$2) {
      Optional<ji> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<coj> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.A().b($$3.get());
            agd.c($$0, $$3.get());
         }
      }
   }

   protected void d(ard $$0, coj $$1, long $$2) {
      $$1.eb().b(cem.r);
   }

   private boolean a(coj $$0) {
      bwk<coj> $$1 = $$0.eb();
      Optional<bud> $$2 = $$1.c(cem.r).filter($$0x -> $$0x.aq() == but.bC);
      return $$2.isEmpty() ? false : bxd.a($$1, cem.r, but.bC) && $$0.X_() && $$2.get().X_();
   }

   private Optional<ji> b(ard $$0, coj $$1) {
      return $$0.A().a($$0x -> $$0x.a(cgq.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dv(), 48);
   }

   private boolean a(coj $$0, ji $$1, jr<cgp> $$2) {
      eto $$3 = $$0.P().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<coj> b(ard $$0, coj $$1, coj $$2) {
      coj $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dA(), $$1.dC(), $$1.dG(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(ard $$0, coj $$1, ji $$2) {
      jq $$3 = jq.a($$0.ai(), $$2);
      $$1.eb().a(cem.b, $$3);
   }
}
