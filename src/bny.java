import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bny extends bks<cbc> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private long e;

   public bny() {
      super(ImmutableMap.of(bsc.r, bsd.a, bsc.h, bsd.a), 350, 350);
   }

   protected boolean a(akn $$0, cbc $$1) {
      return this.a($$1);
   }

   protected boolean a(akn $$0, cbc $$1, long $$2) {
      return $$2 <= this.e && this.a($$1);
   }

   protected void b(akn $$0, cbc $$1, long $$2) {
      big $$3 = $$1.dM().c(bsc.r).get();
      bku.a($$1, $$3, 0.5F);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.ee().a(50);
      this.e = $$2 + (long)$$4;
   }

   protected void c(akn $$0, cbc $$1, long $$2) {
      cbc $$3 = (cbc)$$1.dM().c(bsc.r).get();
      if (!($$1.f($$3) > 5.0)) {
         bku.a($$1, $$3, 0.5F);
         if ($$2 >= this.e) {
            $$1.gr();
            $$3.gr();
            this.a($$0, $$1, $$3);
         } else if ($$1.ee().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(akn $$0, cbc $$1, cbc $$2) {
      Optional<gw> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cbc> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.w().b($$3.get());
            aay.c($$0, $$3.get());
         }
      }
   }

   protected void d(akn $$0, cbc $$1, long $$2) {
      $$1.dM().b(bsc.r);
   }

   private boolean a(cbc $$0) {
      bkb<cbc> $$1 = $$0.dM();
      Optional<big> $$2 = $$1.c(bsc.r).filter($$0x -> $$0x.ag() == bip.bf);
      return $$2.isEmpty() ? false : bku.a($$1, bsc.r, bip.bf) && $$0.P_() && $$2.get().P_();
   }

   private Optional<gw> b(akn $$0, cbc $$1) {
      return $$0.w().a($$0x -> $$0x.a(bue.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dk(), 48);
   }

   private boolean a(cbc $$0, gw $$1, hg<bud> $$2) {
      eaw $$3 = $$0.H().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cbc> b(akn $$0, cbc $$1, cbc $$2) {
      cbc $$3 = $$1.b($$0, $$2);
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

   private void a(akn $$0, cbc $$1, gw $$2) {
      hf $$3 = hf.a($$0.ac(), $$2);
      $$1.dM().a(bsc.b, $$3);
   }
}
