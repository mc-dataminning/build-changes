import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bnu extends bko<cay> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private long e;

   public bnu() {
      super(ImmutableMap.of(bry.r, brz.a, bry.h, brz.a), 350, 350);
   }

   protected boolean a(aki $$0, cay $$1) {
      return this.a($$1);
   }

   protected boolean a(aki $$0, cay $$1, long $$2) {
      return $$2 <= this.e && this.a($$1);
   }

   protected void b(aki $$0, cay $$1, long $$2) {
      bib $$3 = $$1.dM().c(bry.r).get();
      bkq.a($$1, $$3, 0.5F);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.ee().a(50);
      this.e = $$2 + (long)$$4;
   }

   protected void c(aki $$0, cay $$1, long $$2) {
      cay $$3 = (cay)$$1.dM().c(bry.r).get();
      if (!($$1.f($$3) > 5.0)) {
         bkq.a($$1, $$3, 0.5F);
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

   private void a(aki $$0, cay $$1, cay $$2) {
      Optional<gv> $$3 = this.b($$0, $$1);
      if (!$$3.isPresent()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cay> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.w().b($$3.get());
            aau.c($$0, $$3.get());
         }
      }
   }

   protected void d(aki $$0, cay $$1, long $$2) {
      $$1.dM().b(bry.r);
   }

   private boolean a(cay $$0) {
      bjx<cay> $$1 = $$0.dM();
      Optional<bib> $$2 = $$1.c(bry.r).filter($$0x -> $$0x.ag() == bik.bf);
      return !$$2.isPresent() ? false : bkq.a($$1, bry.r, bik.bf) && $$0.P_() && $$2.get().P_();
   }

   private Optional<gv> b(aki $$0, cay $$1) {
      return $$0.w().a($$0x -> $$0x.a(bua.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dk(), 48);
   }

   private boolean a(cay $$0, gv $$1, hf<btz> $$2) {
      eaq $$3 = $$0.H().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cay> b(aki $$0, cay $$1, cay $$2) {
      cay $$3 = $$1.b($$0, $$2);
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

   private void a(aki $$0, cay $$1, gv $$2) {
      he $$3 = he.a($$0.ac(), $$2);
      $$1.dM().a(bry.b, $$3);
   }
}
