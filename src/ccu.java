import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class ccu extends bzn<crl> {
   private long c;

   public ccu() {
      super(ImmutableMap.of(cgy.s, cgz.a, cgy.h, cgz.a), 350, 350);
   }

   protected boolean a(aru $$0, crl $$1) {
      return this.a($$1);
   }

   protected boolean a(aru $$0, crl $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(aru $$0, crl $$1, long $$2) {
      bwl $$3 = $$1.ec().c(cgy.s).get();
      bzp.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dY().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(aru $$0, crl $$1, long $$2) {
      crl $$3 = (crl)$$1.ec().c(cgy.s).get();
      if (!($$1.g($$3) > 5.0)) {
         bzp.a($$1, $$3, 0.5F, 2);
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

   private void a(aru $$0, crl $$1, crl $$2) {
      Optional<iw> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<crl> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.A().b($$3.get());
            agq.c($$0, $$3.get());
         }
      }
   }

   protected void d(aru $$0, crl $$1, long $$2) {
      $$1.ec().b(cgy.s);
   }

   private boolean a(crl $$0) {
      byw<crl> $$1 = $$0.ec();
      Optional<bwl> $$2 = $$1.c(cgy.s).filter($$0x -> $$0x.an() == bxe.bE);
      return $$2.isEmpty() ? false : bzp.a($$1, cgy.s, bxe.bE) && $$0.X_() && $$2.get().X_();
   }

   private Optional<iw> b(aru $$0, crl $$1) {
      return $$0.A().a($$0x -> $$0x.a(cjc.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dv(), 48);
   }

   private boolean a(crl $$0, iw $$1, jg<cjb> $$2) {
      eye $$3 = $$0.O().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<crl> b(aru $$0, crl $$1, crl $$2) {
      crl $$3 = $$1.b($$0, $$2);
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

   private void a(aru $$0, crl $$1, iw $$2) {
      jf $$3 = jf.a($$0.aj(), $$2);
      $$1.ec().a(cgy.b, $$3);
   }
}
