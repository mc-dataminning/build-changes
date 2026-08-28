import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dpq extends dma {
   protected final ja a;
   protected final boolean b;
   protected final ffc d;

   protected dpq(dzy.d $$0, ja $$1, ffc $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dpq> a();

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public dzz b(azv $$0) {
      return this.m();
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      iu $$3 = $$2.a(this.a.g());
      dzz $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(dzz $$0) {
      return true;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.d;
   }

   protected abstract dps c();

   protected abstract dma b();
}
