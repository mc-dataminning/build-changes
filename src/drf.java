import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class drf extends dno {
   protected final jc a;
   protected final boolean b;
   protected final fgw d;

   protected drf(ebp.d $$0, jc $$1, fgw $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends drf> a();

   @Nullable
   @Override
   public ebq a(ded $$0) {
      ebq $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public ebq b(bai $$0) {
      return this.m();
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      iw $$3 = $$2.a(this.a.g());
      ebq $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(ebq $$0) {
      return true;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.d;
   }

   protected abstract drh c();

   protected abstract dno b();
}
