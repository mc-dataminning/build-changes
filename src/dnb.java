import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dnb extends djn {
   protected final jn a;
   protected final boolean b;
   protected final fbv d;

   protected dnb(dwx.d $$0, jn $$1, fbv $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dnb> a();

   @Nullable
   @Override
   public dwy a(dah $$0) {
      dwy $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public dwy b(azh $$0) {
      return this.m();
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      ji $$3 = $$2.a(this.a.g());
      dwy $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(dwy $$0) {
      return true;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return this.d;
   }

   protected abstract dnd c();

   protected abstract djn b();
}
