import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dnt extends dke {
   protected final jn a;
   protected final boolean b;
   protected final fcr d;

   protected dnt(dxp.d $$0, jn $$1, fcr $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dnt> a();

   @Nullable
   @Override
   public dxq a(dax $$0) {
      dxq $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public dxq b(azh $$0) {
      return this.m();
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      ji $$3 = $$2.a(this.a.g());
      dxq $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(dxq $$0) {
      return true;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.d;
   }

   protected abstract dnv c();

   protected abstract dke b();
}
