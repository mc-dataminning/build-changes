import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class doa extends dkm {
   protected final jm a;
   protected final boolean b;
   protected final fcs d;

   protected doa(dxu.d $$0, jm $$1, fcs $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends doa> a();

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public dxv b(bam $$0) {
      return this.m();
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      jh $$3 = $$2.a(this.a.g());
      dxv $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(dxv $$0) {
      return true;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return this.d;
   }

   protected abstract doc c();

   protected abstract dkm b();
}
