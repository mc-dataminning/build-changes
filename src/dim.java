import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dim extends dez {
   protected final je a;
   protected final boolean b;
   protected final ewk d;

   protected dim(dsb.d $$0, je $$1, ewk $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dim> a();

   @Nullable
   @Override
   public dsc a(cya $$0) {
      dsc $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dsc a(dbz $$0) {
      return this.o();
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      iz $$3 = $$2.a(this.a.g());
      dsc $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(dsc $$0) {
      return true;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return this.d;
   }

   protected abstract dio c();

   protected abstract dez b();
}
