import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlv extends dij {
   protected final jm a;
   protected final boolean b;
   protected final fal d;

   protected dlv(dvn.d $$0, jm $$1, fal $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dlv> a();

   @Nullable
   @Override
   public dvo a(czw $$0) {
      dvo $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public dvo b(azv $$0) {
      return this.m();
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      jh $$3 = $$2.a(this.a.g());
      dvo $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(dvo $$0) {
      return true;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return this.d;
   }

   protected abstract dlx c();

   protected abstract dij b();
}
