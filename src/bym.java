import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bym extends bvf<cmi> {
   private long c;

   public bym() {
      super(ImmutableMap.of(ccq.r, ccr.a, ccq.h, ccr.a), 350, 350);
   }

   protected boolean a(aqt $$0, cmi $$1) {
      return this.a($$1);
   }

   protected boolean a(aqt $$0, cmi $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(aqt $$0, cmi $$1, long $$2) {
      bsk $$3 = $$1.dU().c(ccq.r).get();
      bvh.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dT().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(aqt $$0, cmi $$1, long $$2) {
      cmi $$3 = (cmi)$$1.dU().c(ccq.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bvh.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gD();
            $$3.gD();
            this.a($$0, $$1, $$3);
         } else if ($$1.dT().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(aqt $$0, cmi $$1, cmi $$2) {
      Optional<jd> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cmi> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            age.c($$0, $$3.get());
         }
      }
   }

   protected void d(aqt $$0, cmi $$1, long $$2) {
      $$1.dU().b(ccq.r);
   }

   private boolean a(cmi $$0) {
      buo<cmi> $$1 = $$0.dU();
      Optional<bsk> $$2 = $$1.c(ccq.r).filter($$0x -> $$0x.am() == bsw.bj);
      return $$2.isEmpty() ? false : bvh.a($$1, ccq.r, bsw.bj) && $$0.X_() && $$2.get().X_();
   }

   private Optional<jd> b(aqt $$0, cmi $$1) {
      return $$0.y().a($$0x -> $$0x.a(ceu.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dq(), 48);
   }

   private boolean a(cmi $$0, jd $$1, jm<cet> $$2) {
      epm $$3 = $$0.J().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cmi> b(aqt $$0, cmi $$1, cmi $$2) {
      cmi $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dv(), $$1.dx(), $$1.dB(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(aqt $$0, cmi $$1, jd $$2) {
      jl $$3 = jl.a($$0.af(), $$2);
      $$1.dU().a(ccq.b, $$3);
   }
}
