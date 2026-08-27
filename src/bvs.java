import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvs extends bsl<cjn> {
   private long c;

   public bvs() {
      super(ImmutableMap.of(bzw.r, bzx.a, bzw.h, bzx.a), 350, 350);
   }

   protected boolean a(apu $$0, cjn $$1) {
      return this.a($$1);
   }

   protected boolean a(apu $$0, cjn $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(apu $$0, cjn $$1, long $$2) {
      bpu $$3 = $$1.dP().c(bzw.r).get();
      bsn.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.ei().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(apu $$0, cjn $$1, long $$2) {
      cjn $$3 = (cjn)$$1.dP().c(bzw.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bsn.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gE();
            $$3.gE();
            this.a($$0, $$1, $$3);
         } else if ($$1.ei().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(apu $$0, cjn $$1, cjn $$2) {
      Optional<id> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cjn> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            afk.c($$0, $$3.get());
         }
      }
   }

   protected void d(apu $$0, cjn $$1, long $$2) {
      $$1.dP().b(bzw.r);
   }

   private boolean a(cjn $$0) {
      bru<cjn> $$1 = $$0.dP();
      Optional<bpu> $$2 = $$1.c(bzw.r).filter($$0x -> $$0x.ai() == bqg.bi);
      return $$2.isEmpty() ? false : bsn.a($$1, bzw.r, bqg.bi) && $$0.X_() && $$2.get().X_();
   }

   private Optional<id> b(apu $$0, cjn $$1) {
      return $$0.y().a($$0x -> $$0x.a(cca.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dm(), 48);
   }

   private boolean a(cjn $$0, id $$1, in<cbz> $$2) {
      elp $$3 = $$0.K().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cjn> b(apu $$0, cjn $$1, cjn $$2) {
      cjn $$3 = $$1.b($$0, $$2);
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

   private void a(apu $$0, cjn $$1, id $$2) {
      im $$3 = im.a($$0.ae(), $$2);
      $$1.dP().a(bzw.b, $$3);
   }
}
