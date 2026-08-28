import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dil extends dey {
   protected final je a;
   protected final boolean b;
   protected final ewj d;

   protected dil(dsa.d $$0, je $$1, ewj $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dil> a();

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dsb a(dby $$0) {
      return this.o();
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      iz $$3 = $$2.a(this.a.g());
      dsb $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(dsb $$0) {
      return true;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return this.d;
   }

   protected abstract din c();

   protected abstract dey b();
}
