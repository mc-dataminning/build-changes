import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlk extends dhy {
   protected final jl a;
   protected final boolean b;
   protected final fab d;

   protected dlk(dvc.d $$0, jl $$1, fab $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dlk> a();

   @Nullable
   @Override
   public dvd a(czm $$0) {
      dvd $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().m();
   }

   public dvd a(dew $$0) {
      return this.m();
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jg $$3 = $$2.a(this.a.g());
      dvd $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(dvd $$0) {
      return true;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return this.d;
   }

   protected abstract dlm c();

   protected abstract dhy b();
}
