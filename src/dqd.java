import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dqd extends dmm {
   protected final jb a;
   protected final boolean b;
   protected final ffr d;

   protected dqd(ean.d $$0, jb $$1, ffr $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dqd> a();

   @Nullable
   @Override
   public eao a(ddd $$0) {
      eao $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public eao b(azv $$0) {
      return this.m();
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      iv $$3 = $$2.a(this.a.g());
      eao $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(eao $$0) {
      return true;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.d;
   }

   protected abstract dqf c();

   protected abstract dmm b();
}
