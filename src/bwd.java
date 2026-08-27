import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bwd extends bsw<cjy> {
   private long c;

   public bwd() {
      super(ImmutableMap.of(cah.r, cai.a, cah.h, cai.a), 350, 350);
   }

   protected boolean a(aqe $$0, cjy $$1) {
      return this.a($$1);
   }

   protected boolean a(aqe $$0, cjy $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(aqe $$0, cjy $$1, long $$2) {
      bqf $$3 = $$1.dQ().c(cah.r).get();
      bsy.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.ej().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(aqe $$0, cjy $$1, long $$2) {
      cjy $$3 = (cjy)$$1.dQ().c(cah.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bsy.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gG();
            $$3.gG();
            this.a($$0, $$1, $$3);
         } else if ($$1.ej().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(aqe $$0, cjy $$1, cjy $$2) {
      Optional<im> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cjy> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            afu.c($$0, $$3.get());
         }
      }
   }

   protected void d(aqe $$0, cjy $$1, long $$2) {
      $$1.dQ().b(cah.r);
   }

   private boolean a(cjy $$0) {
      bsf<cjy> $$1 = $$0.dQ();
      Optional<bqf> $$2 = $$1.c(cah.r).filter($$0x -> $$0x.ai() == bqr.bi);
      return $$2.isEmpty() ? false : bsy.a($$1, cah.r, bqr.bi) && $$0.X_() && $$2.get().X_();
   }

   private Optional<im> b(aqe $$0, cjy $$1) {
      return $$0.y().a($$0x -> $$0x.a(ccl.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dn(), 48);
   }

   private boolean a(cjy $$0, im $$1, iv<cck> $$2) {
      emf $$3 = $$0.K().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cjy> b(aqe $$0, cjy $$1, cjy $$2) {
      cjy $$3 = $$1.b($$0, $$2);
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

   private void a(aqe $$0, cjy $$1, im $$2) {
      iu $$3 = iu.a($$0.ae(), $$2);
      $$1.dQ().a(cah.b, $$3);
   }
}
