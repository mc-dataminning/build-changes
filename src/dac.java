import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dac extends cwp {
   protected final ic a;
   protected final boolean b;
   protected final eml d;

   protected dac(djf.d $$0, ic $$1, eml $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dac> a();

   @Nullable
   @Override
   public djg a(cpg $$0) {
      djg $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public djg a(ctp $$0) {
      return this.o();
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      hx $$3 = $$2.a(this.a.g());
      djg $$4 = $$1.a_($$3);
      return !this.h($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean h(djg $$0) {
      return true;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return this.d;
   }

   protected abstract dae c();

   protected abstract cwp b();
}
