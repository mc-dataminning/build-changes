import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cdd extends bzw<cru> {
   private long c;

   public cdd() {
      super(ImmutableMap.of(chh.s, chi.a, chh.h, chi.a), 350, 350);
   }

   protected boolean a(asb $$0, cru $$1) {
      return this.a($$1);
   }

   protected boolean a(asb $$0, cru $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(asb $$0, cru $$1, long $$2) {
      bwu $$3 = $$1.ec().c(chh.s).get();
      bzy.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dY().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(asb $$0, cru $$1, long $$2) {
      cru $$3 = (cru)$$1.ec().c(chh.s).get();
      if (!($$1.g($$3) > 5.0)) {
         bzy.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gL();
            $$3.gL();
            this.a($$0, $$1, $$3);
         } else if ($$1.dY().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(asb $$0, cru $$1, cru $$2) {
      Optional<iw> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cru> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.A().b($$3.get());
            agx.c($$0, $$3.get());
         }
      }
   }

   protected void d(asb $$0, cru $$1, long $$2) {
      $$1.ec().b(chh.s);
   }

   private boolean a(cru $$0) {
      bzf<cru> $$1 = $$0.ec();
      Optional<bwu> $$2 = $$1.c(chh.s).filter($$0x -> $$0x.an() == bxn.bE);
      return $$2.isEmpty() ? false : bzy.a($$1, chh.s, bxn.bE) && $$0.X_() && $$2.get().X_();
   }

   private Optional<iw> b(asb $$0, cru $$1) {
      return $$0.A().a($$0x -> $$0x.a(cjl.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dv(), 48);
   }

   private boolean a(cru $$0, iw $$1, jg<cjk> $$2) {
      eyo $$3 = $$0.N().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cru> b(asb $$0, cru $$1, cru $$2) {
      cru $$3 = $$1.b($$0, $$2);
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

   private void a(asb $$0, cru $$1, iw $$2) {
      jf $$3 = jf.a($$0.aj(), $$2);
      $$1.ec().a(chh.b, $$3);
   }
}
