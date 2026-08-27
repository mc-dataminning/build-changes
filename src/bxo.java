import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxo extends buh<clj> {
   private long c;

   public bxo() {
      super(ImmutableMap.of(cbs.r, cbt.a, cbs.h, cbt.a), 350, 350);
   }

   protected boolean a(aqm $$0, clj $$1) {
      return this.a($$1);
   }

   protected boolean a(aqm $$0, clj $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(aqm $$0, clj $$1, long $$2) {
      bro $$3 = $$1.dS().c(cbs.r).get();
      buj.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.el().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(aqm $$0, clj $$1, long $$2) {
      clj $$3 = (clj)$$1.dS().c(cbs.r).get();
      if (!($$1.g($$3) > 5.0)) {
         buj.a($$1, $$3, 0.5F, 2);
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

   private void a(aqm $$0, clj $$1, clj $$2) {
      Optional<io> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<clj> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            aga.c($$0, $$3.get());
         }
      }
   }

   protected void d(aqm $$0, clj $$1, long $$2) {
      $$1.dS().b(cbs.r);
   }

   private boolean a(clj $$0) {
      btq<clj> $$1 = $$0.dS();
      Optional<bro> $$2 = $$1.c(cbs.r).filter($$0x -> $$0x.ak() == bsa.bj);
      return $$2.isEmpty() ? false : buj.a($$1, cbs.r, bsa.bj) && $$0.X_() && $$2.get().X_();
   }

   private Optional<io> b(aqm $$0, clj $$1) {
      return $$0.y().a($$0x -> $$0x.a(cdw.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dp(), 48);
   }

   private boolean a(clj $$0, io $$1, ix<cdv> $$2) {
      eni $$3 = $$0.K().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<clj> b(aqm $$0, clj $$1, clj $$2) {
      clj $$3 = $$1.b($$0, $$2);
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

   private void a(aqm $$0, clj $$1, io $$2) {
      iw $$3 = iw.a($$0.ae(), $$2);
      $$1.dS().a(cbs.b, $$3);
   }
}
