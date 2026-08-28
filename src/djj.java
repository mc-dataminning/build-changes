import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djj extends dfw {
   protected final ji a;
   protected final boolean b;
   protected final exp d;

   protected djj(dsz.d $$0, ji $$1, exp $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends djj> a();

   @Nullable
   @Override
   public dta a(cyb $$0) {
      dta $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dta a(dcv $$0) {
      return this.o();
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      jd $$3 = $$2.a(this.a.g());
      dta $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(dta $$0) {
      return true;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return this.d;
   }

   protected abstract djl c();

   protected abstract dfw b();
}
