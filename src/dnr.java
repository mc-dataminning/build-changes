import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dnr extends dkd {
   protected final jm a;
   protected final boolean b;
   protected final fcl d;

   protected dnr(dxn.d $$0, jm $$1, fcl $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dnr> a();

   @Nullable
   @Override
   public dxo a(dax $$0) {
      dxo $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public dxo b(bac $$0) {
      return this.m();
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      jh $$3 = $$2.a(this.a.g());
      dxo $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(dxo $$0) {
      return true;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return this.d;
   }

   protected abstract dnt c();

   protected abstract dkd b();
}
