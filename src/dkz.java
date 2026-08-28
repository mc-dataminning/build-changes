import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dkz extends dhm {
   protected final jk a;
   protected final boolean b;
   protected final ezq d;

   protected dkz(dur.d $$0, jk $$1, ezq $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dkz> a();

   @Nullable
   @Override
   public dus a(czn $$0) {
      dus $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().n();
   }

   public dus a(dek $$0) {
      return this.n();
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jf $$3 = $$2.a(this.a.g());
      dus $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(dus $$0) {
      return true;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return this.d;
   }

   protected abstract dlb c();

   protected abstract dhm b();
}
