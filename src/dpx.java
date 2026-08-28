import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dpx extends dpw implements dmi {
   protected dpx(eag.d $$0, ja $$1, ffk $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dpx> a();

   protected eah a(eah $$0, eah $$1) {
      return $$1;
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      dpy $$8 = this.c();
      if ($$4 == this.a && !$$6.a(this) && !$$6.a($$8)) {
         return this.a($$0, $$8.b($$7));
      } else {
         if (this.b) {
            $$2.a($$3, ewp.c, ewp.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return new czd(this.c());
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      Optional<iu> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      Optional<iu> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         eah $$5 = $$0.a_($$4.get());
         ((dpy)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<iu> a(dig $$0, iu $$1, dmf $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(eah $$0, dcw $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().h()) ? false : $$2;
   }

   @Override
   protected dmf b() {
      return this;
   }
}
