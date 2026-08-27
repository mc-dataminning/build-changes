import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dgj extends dgi implements dcy {
   protected dgj(dpx.d $$0, ir $$1, ety $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dgj> a();

   protected dpy a(dpy $$0, dpy $$1) {
      return $$1;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dgk $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, els.c, els.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return new csd(this.c());
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      Optional<im> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      Optional<im> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dpy $$5 = $$0.a_($$4.get());
         ((dgk)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<im> a(cza $$0, im $$1, dcv $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dpy $$0, cvl $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().p()) ? false : $$2;
   }

   @Override
   protected dcv b() {
      return this;
   }
}
