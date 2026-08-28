import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dqv extends dne {
   protected final jc a;
   protected final boolean b;
   protected final fgm d;

   protected dqv(ebf.d $$0, jc $$1, fgm $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dqv> a();

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public ebg b(azz $$0) {
      return this.m();
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      iw $$3 = $$2.a(this.a.g());
      ebg $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(ebg $$0) {
      return true;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.d;
   }

   protected abstract dqx c();

   protected abstract dne b();
}
