import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgi extends dcv {
   protected final ir a;
   protected final boolean b;
   protected final ety d;

   protected dgi(dpx.d $$0, ir $$1, ety $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dgi> a();

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().n();
   }

   public dpy a(czv $$0) {
      return this.n();
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      im $$3 = $$2.a(this.a.g());
      dpy $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(dpy $$0) {
      return true;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return this.d;
   }

   protected abstract dgk c();

   protected abstract dcv b();
}
