import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxq extends buj<cll> {
   private long c;

   public bxq() {
      super(ImmutableMap.of(cbu.r, cbv.a, cbu.h, cbv.a), 350, 350);
   }

   protected boolean a(aqn $$0, cll $$1) {
      return this.a($$1);
   }

   protected boolean a(aqn $$0, cll $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(aqn $$0, cll $$1, long $$2) {
      brq $$3 = $$1.dS().c(cbu.r).get();
      bul.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.el().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(aqn $$0, cll $$1, long $$2) {
      cll $$3 = (cll)$$1.dS().c(cbu.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bul.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gG();
            $$3.gG();
            this.a($$0, $$1, $$3);
         } else if ($$1.el().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(aqn $$0, cll $$1, cll $$2) {
      Optional<io> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cll> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            agb.c($$0, $$3.get());
         }
      }
   }

   protected void d(aqn $$0, cll $$1, long $$2) {
      $$1.dS().b(cbu.r);
   }

   private boolean a(cll $$0) {
      bts<cll> $$1 = $$0.dS();
      Optional<brq> $$2 = $$1.c(cbu.r).filter($$0x -> $$0x.ak() == bsc.bj);
      return $$2.isEmpty() ? false : bul.a($$1, cbu.r, bsc.bj) && $$0.X_() && $$2.get().X_();
   }

   private Optional<io> b(aqn $$0, cll $$1) {
      return $$0.y().a($$0x -> $$0x.a(cdy.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dp(), 48);
   }

   private boolean a(cll $$0, io $$1, ix<cdx> $$2) {
      enk $$3 = $$0.K().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cll> b(aqn $$0, cll $$1, cll $$2) {
      cll $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.du(), $$1.dw(), $$1.dA(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(aqn $$0, cll $$1, io $$2) {
      iw $$3 = iw.a($$0.ae(), $$2);
      $$1.dS().a(cbu.b, $$3);
   }
}
