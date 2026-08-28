import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dio extends dfb {
   protected final je a;
   protected final boolean b;
   protected final ewm d;

   protected dio(dsd.d $$0, je $$1, ewm $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dio> a();

   @Nullable
   @Override
   public dse a(cyc $$0) {
      dse $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dse a(dcb $$0) {
      return this.o();
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      iz $$3 = $$2.a(this.a.g());
      dse $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(dse $$0) {
      return true;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return this.d;
   }

   protected abstract diq c();

   protected abstract dfb b();
}
