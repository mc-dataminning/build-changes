import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byn extends bvg<cmi> {
   private long c;

   public byn() {
      super(ImmutableMap.of(ccr.r, ccs.a, ccr.h, ccs.a), 350, 350);
   }

   protected boolean a(are $$0, cmi $$1) {
      return this.a($$1);
   }

   protected boolean a(are $$0, cmi $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(are $$0, cmi $$1, long $$2) {
      bsm $$3 = $$1.dS().c(ccr.r).get();
      bvi.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.el().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(are $$0, cmi $$1, long $$2) {
      cmi $$3 = (cmi)$$1.dS().c(ccr.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bvi.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gH();
            $$3.gH();
            this.a($$0, $$1, $$3);
         } else if ($$1.el().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(are $$0, cmi $$1, cmi $$2) {
      Optional<iz> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cmi> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            ags.c($$0, $$3.get());
         }
      }
   }

   protected void d(are $$0, cmi $$1, long $$2) {
      $$1.dS().b(ccr.r);
   }

   private boolean a(cmi $$0) {
      bup<cmi> $$1 = $$0.dS();
      Optional<bsm> $$2 = $$1.c(ccr.r).filter($$0x -> $$0x.ak() == bsy.bj);
      return $$2.isEmpty() ? false : bvi.a($$1, ccr.r, bsy.bj) && $$0.X_() && $$2.get().X_();
   }

   private Optional<iz> b(are $$0, cmi $$1) {
      return $$0.y().a($$0x -> $$0x.a(cev.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dp(), 48);
   }

   private boolean a(cmi $$0, iz $$1, ji<ceu> $$2) {
      eoh $$3 = $$0.K().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cmi> b(are $$0, cmi $$1, cmi $$2) {
      cmi $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.du(), $$1.dw(), $$1.dA(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(are $$0, cmi $$1, iz $$2) {
      jh $$3 = jh.a($$0.af(), $$2);
      $$1.dS().a(ccr.b, $$3);
   }
}
