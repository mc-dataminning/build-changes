import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bnw extends bkq<cba> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private long e;

   public bnw() {
      super(ImmutableMap.of(bsa.r, bsb.a, bsa.h, bsb.a), 350, 350);
   }

   protected boolean a(akk $$0, cba $$1) {
      return this.a($$1);
   }

   protected boolean a(akk $$0, cba $$1, long $$2) {
      return $$2 <= this.e && this.a($$1);
   }

   protected void b(akk $$0, cba $$1, long $$2) {
      bid $$3 = $$1.dM().c(bsa.r).get();
      bks.a($$1, $$3, 0.5F);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.ee().a(50);
      this.e = $$2 + (long)$$4;
   }

   protected void c(akk $$0, cba $$1, long $$2) {
      cba $$3 = (cba)$$1.dM().c(bsa.r).get();
      if (!($$1.f($$3) > 5.0)) {
         bks.a($$1, $$3, 0.5F);
         if ($$2 >= this.e) {
            $$1.gq();
            $$3.gq();
            this.a($$0, $$1, $$3);
         } else if ($$1.ee().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(akk $$0, cba $$1, cba $$2) {
      Optional<gu> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cba> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.w().b($$3.get());
            aav.c($$0, $$3.get());
         }
      }
   }

   protected void d(akk $$0, cba $$1, long $$2) {
      $$1.dM().b(bsa.r);
   }

   private boolean a(cba $$0) {
      bjz<cba> $$1 = $$0.dM();
      Optional<bid> $$2 = $$1.c(bsa.r).filter($$0x -> $$0x.ag() == bim.bf);
      return $$2.isEmpty() ? false : bks.a($$1, bsa.r, bim.bf) && $$0.P_() && $$2.get().P_();
   }

   private Optional<gu> b(akk $$0, cba $$1) {
      return $$0.w().a($$0x -> $$0x.a(buc.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dk(), 48);
   }

   private boolean a(cba $$0, gu $$1, he<bub> $$2) {
      eas $$3 = $$0.H().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cba> b(akk $$0, cba $$1, cba $$2) {
      cba $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dp(), $$1.dr(), $$1.dv(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(akk $$0, cba $$1, gu $$2) {
      hd $$3 = hd.a($$0.ac(), $$2);
      $$1.dM().a(bsa.b, $$3);
   }
}
