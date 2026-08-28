import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dpw extends dmf {
   protected final ja a;
   protected final boolean b;
   protected final ffk d;

   protected dpw(eag.d $$0, ja $$1, ffk $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dpw> a();

   @Nullable
   @Override
   public eah a(dcw $$0) {
      eah $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public eah b(azv $$0) {
      return this.m();
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      iu $$3 = $$2.a(this.a.g());
      eah $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(eah $$0) {
      return true;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.d;
   }

   protected abstract dpy c();

   protected abstract dmf b();
}
