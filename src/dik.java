import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dik extends dex {
   protected final je a;
   protected final boolean b;
   protected final ewi d;

   protected dik(drz.d $$0, je $$1, ewi $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dik> a();

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      dsa $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dsa a(dbx $$0) {
      return this.o();
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      iz $$3 = $$2.a(this.a.g());
      dsa $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(dsa $$0) {
      return true;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return this.d;
   }

   protected abstract dim c();

   protected abstract dex b();
}
