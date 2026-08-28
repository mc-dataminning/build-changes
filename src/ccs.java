import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class ccs extends bzl<crj> {
   private long c;

   public ccs() {
      super(ImmutableMap.of(cgw.s, cgx.a, cgw.h, cgx.a), 350, 350);
   }

   protected boolean a(ars $$0, crj $$1) {
      return this.a($$1);
   }

   protected boolean a(ars $$0, crj $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(ars $$0, crj $$1, long $$2) {
      bwj $$3 = $$1.ec().c(cgw.s).get();
      bzn.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dY().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(ars $$0, crj $$1, long $$2) {
      crj $$3 = (crj)$$1.ec().c(cgw.s).get();
      if (!($$1.g($$3) > 5.0)) {
         bzn.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gK();
            $$3.gK();
            this.a($$0, $$1, $$3);
         } else if ($$1.dY().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(ars $$0, crj $$1, crj $$2) {
      Optional<iv> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<crj> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.A().b($$3.get());
            ago.c($$0, $$3.get());
         }
      }
   }

   protected void d(ars $$0, crj $$1, long $$2) {
      $$1.ec().b(cgw.s);
   }

   private boolean a(crj $$0) {
      byu<crj> $$1 = $$0.ec();
      Optional<bwj> $$2 = $$1.c(cgw.s).filter($$0x -> $$0x.an() == bxc.bE);
      return $$2.isEmpty() ? false : bzn.a($$1, cgw.s, bxc.bE) && $$0.X_() && $$2.get().X_();
   }

   private Optional<iv> b(ars $$0, crj $$1) {
      return $$0.A().a($$0x -> $$0x.a(cja.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dv(), 48);
   }

   private boolean a(crj $$0, iv $$1, jf<ciz> $$2) {
      eyc $$3 = $$0.O().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<crj> b(ars $$0, crj $$1, crj $$2) {
      crj $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dA(), $$1.dC(), $$1.dG(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(ars $$0, crj $$1, iv $$2) {
      je $$3 = je.a($$0.aj(), $$2);
      $$1.ec().a(cgw.b, $$3);
   }
}
