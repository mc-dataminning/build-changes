import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bwz extends bts<cku> {
   private long c;

   public bwz() {
      super(ImmutableMap.of(cbd.r, cbe.a, cbd.h, cbe.a), 350, 350);
   }

   protected boolean a(aqh $$0, cku $$1) {
      return this.a($$1);
   }

   protected boolean a(aqh $$0, cku $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(aqh $$0, cku $$1, long $$2) {
      brb $$3 = $$1.dQ().c(cbd.r).get();
      btu.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.ej().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(aqh $$0, cku $$1, long $$2) {
      cku $$3 = (cku)$$1.dQ().c(cbd.r).get();
      if (!($$1.g($$3) > 5.0)) {
         btu.a($$1, $$3, 0.5F, 2);
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

   private void a(aqh $$0, cku $$1, cku $$2) {
      Optional<in> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cku> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            afw.c($$0, $$3.get());
         }
      }
   }

   protected void d(aqh $$0, cku $$1, long $$2) {
      $$1.dQ().b(cbd.r);
   }

   private boolean a(cku $$0) {
      btb<cku> $$1 = $$0.dQ();
      Optional<brb> $$2 = $$1.c(cbd.r).filter($$0x -> $$0x.ai() == brn.bi);
      return $$2.isEmpty() ? false : btu.a($$1, cbd.r, brn.bi) && $$0.X_() && $$2.get().X_();
   }

   private Optional<in> b(aqh $$0, cku $$1) {
      return $$0.y().a($$0x -> $$0x.a(cdh.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dn(), 48);
   }

   private boolean a(cku $$0, in $$1, iw<cdg> $$2) {
      emo $$3 = $$0.K().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cku> b(aqh $$0, cku $$1, cku $$2) {
      cku $$3 = $$1.b($$0, $$2);
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

   private void a(aqh $$0, cku $$1, in $$2) {
      iv $$3 = iv.a($$0.ae(), $$2);
      $$1.dQ().a(cbd.b, $$3);
   }
}
