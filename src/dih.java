import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dih extends deu {
   protected final je a;
   protected final boolean b;
   protected final ewf d;

   protected dih(drw.d $$0, je $$1, ewf $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dih> a();

   @Nullable
   @Override
   public drx a(cxv $$0) {
      drx $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().n();
   }

   public drx a(dbu $$0) {
      return this.n();
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      iz $$3 = $$2.a(this.a.g());
      drx $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(drx $$0) {
      return true;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return this.d;
   }

   protected abstract dij c();

   protected abstract deu b();
}
