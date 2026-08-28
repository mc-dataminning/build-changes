import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmz extends djl {
   protected final jn a;
   protected final boolean b;
   protected final fbt d;

   protected dmz(dwv.d $$0, jn $$1, fbt $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dmz> a();

   @Nullable
   @Override
   public dww a(daf $$0) {
      dww $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public dww b(azh $$0) {
      return this.m();
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      ji $$3 = $$2.a(this.a.g());
      dww $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(dww $$0) {
      return true;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return this.d;
   }

   protected abstract dnb c();

   protected abstract djl b();
}
