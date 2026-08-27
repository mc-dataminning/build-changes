import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dfl extends dby {
   protected final ih a;
   protected final boolean b;
   protected final est d;

   protected dfl(doy.d $$0, ih $$1, est $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dfl> a();

   @Nullable
   @Override
   public doz a(cuo $$0) {
      doz $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().n();
   }

   public doz a(cyy $$0) {
      return this.n();
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      ib $$3 = $$2.a(this.a.g());
      doz $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(doz $$0) {
      return true;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return this.d;
   }

   protected abstract dfn c();

   protected abstract dby b();
}
