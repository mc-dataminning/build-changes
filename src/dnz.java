import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dnz extends dkl {
   protected final jm a;
   protected final boolean b;
   protected final fcr d;

   protected dnz(dxt.d $$0, jm $$1, fcr $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dnz> a();

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      dxu $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public dxu b(bam $$0) {
      return this.m();
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      jh $$3 = $$2.a(this.a.g());
      dxu $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(dxu $$0) {
      return true;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return this.d;
   }

   protected abstract dob c();

   protected abstract dkl b();
}
