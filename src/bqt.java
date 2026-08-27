import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bqt extends bnm<cee> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private long e;

   public bqt() {
      super(ImmutableMap.of(bux.r, buy.a, bux.h, buy.a), 350, 350);
   }

   protected boolean a(amp $$0, cee $$1) {
      return this.a($$1);
   }

   protected boolean a(amp $$0, cee $$1, long $$2) {
      return $$2 <= this.e && this.a($$1);
   }

   protected void b(amp $$0, cee $$1, long $$2) {
      bla $$3 = $$1.dO().c(bux.r).get();
      bno.a($$1, $$3, 0.5F);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.eg().a(50);
      this.e = $$2 + (long)$$4;
   }

   protected void c(amp $$0, cee $$1, long $$2) {
      cee $$3 = (cee)$$1.dO().c(bux.r).get();
      if (!($$1.f($$3) > 5.0)) {
         bno.a($$1, $$3, 0.5F);
         if ($$2 >= this.e) {
            $$1.gv();
            $$3.gv();
            this.a($$0, $$1, $$3);
         } else if ($$1.eg().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(amp $$0, cee $$1, cee $$2) {
      Optional<hv> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cee> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.x().b($$3.get());
            acv.c($$0, $$3.get());
         }
      }
   }

   protected void d(amp $$0, cee $$1, long $$2) {
      $$1.dO().b(bux.r);
   }

   private boolean a(cee $$0) {
      bmv<cee> $$1 = $$0.dO();
      Optional<bla> $$2 = $$1.c(bux.r).filter($$0x -> $$0x.ai() == blj.bg);
      return $$2.isEmpty() ? false : bno.a($$1, bux.r, blj.bg) && $$0.Y_() && $$2.get().Y_();
   }

   private Optional<hv> b(amp $$0, cee $$1) {
      return $$0.x().a($$0x -> $$0x.a(bxa.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dm(), 48);
   }

   private boolean a(cee $$0, hv $$1, ie<bwz> $$2) {
      eeo $$3 = $$0.N().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cee> b(amp $$0, cee $$1, cee $$2) {
      cee $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dr(), $$1.dt(), $$1.dx(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(amp $$0, cee $$1, hv $$2) {
      id $$3 = id.a($$0.ad(), $$2);
      $$1.dO().a(bux.b, $$3);
   }
}
