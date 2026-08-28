import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byb extends buu<clx> {
   private long c;

   public byb() {
      super(ImmutableMap.of(ccf.r, ccg.a, ccf.h, ccg.a), 350, 350);
   }

   protected boolean a(aqm $$0, clx $$1) {
      return this.a($$1);
   }

   protected boolean a(aqm $$0, clx $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(aqm $$0, clx $$1, long $$2) {
      bsa $$3 = $$1.dU().c(ccf.r).get();
      buw.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dT().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(aqm $$0, clx $$1, long $$2) {
      clx $$3 = (clx)$$1.dU().c(ccf.r).get();
      if (!($$1.g($$3) > 5.0)) {
         buw.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gF();
            $$3.gF();
            this.a($$0, $$1, $$3);
         } else if ($$1.dT().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(aqm $$0, clx $$1, clx $$2) {
      Optional<ja> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<clx> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            afy.c($$0, $$3.get());
         }
      }
   }

   protected void d(aqm $$0, clx $$1, long $$2) {
      $$1.dU().b(ccf.r);
   }

   private boolean a(clx $$0) {
      bud<clx> $$1 = $$0.dU();
      Optional<bsa> $$2 = $$1.c(ccf.r).filter($$0x -> $$0x.al() == bsm.bj);
      return $$2.isEmpty() ? false : buw.a($$1, ccf.r, bsm.bj) && $$0.X_() && $$2.get().X_();
   }

   private Optional<ja> b(aqm $$0, clx $$1) {
      return $$0.y().a($$0x -> $$0x.a(cej.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dq(), 48);
   }

   private boolean a(clx $$0, ja $$1, jj<cei> $$2) {
      eov $$3 = $$0.K().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<clx> b(aqm $$0, clx $$1, clx $$2) {
      clx $$3 = $$1.b($$0, $$2);
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

   private void a(aqm $$0, clx $$1, ja $$2) {
      ji $$3 = ji.a($$0.af(), $$2);
      $$1.dU().a(ccf.b, $$3);
   }
}
