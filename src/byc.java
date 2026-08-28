import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byc extends buv<cly> {
   private long c;

   public byc() {
      super(ImmutableMap.of(ccg.r, cch.a, ccg.h, cch.a), 350, 350);
   }

   protected boolean a(aqm $$0, cly $$1) {
      return this.a($$1);
   }

   protected boolean a(aqm $$0, cly $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(aqm $$0, cly $$1, long $$2) {
      bsb $$3 = $$1.dV().c(ccg.r).get();
      bux.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dU().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(aqm $$0, cly $$1, long $$2) {
      cly $$3 = (cly)$$1.dV().c(ccg.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bux.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gE();
            $$3.gE();
            this.a($$0, $$1, $$3);
         } else if ($$1.dU().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(aqm $$0, cly $$1, cly $$2) {
      Optional<ja> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cly> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            afy.c($$0, $$3.get());
         }
      }
   }

   protected void d(aqm $$0, cly $$1, long $$2) {
      $$1.dV().b(ccg.r);
   }

   private boolean a(cly $$0) {
      bue<cly> $$1 = $$0.dV();
      Optional<bsb> $$2 = $$1.c(ccg.r).filter($$0x -> $$0x.am() == bsn.bj);
      return $$2.isEmpty() ? false : bux.a($$1, ccg.r, bsn.bj) && $$0.X_() && $$2.get().X_();
   }

   private Optional<ja> b(aqm $$0, cly $$1) {
      return $$0.y().a($$0x -> $$0x.a(cek.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dr(), 48);
   }

   private boolean a(cly $$0, ja $$1, jj<cej> $$2) {
      eox $$3 = $$0.J().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cly> b(aqm $$0, cly $$1, cly $$2) {
      cly $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dw(), $$1.dy(), $$1.dC(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(aqm $$0, cly $$1, ja $$2) {
      ji $$3 = ji.a($$0.af(), $$2);
      $$1.dV().a(ccg.b, $$3);
   }
}
