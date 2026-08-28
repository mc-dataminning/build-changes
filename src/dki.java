import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dki extends dgv {
   protected final jj a;
   protected final boolean b;
   protected final eyx d;

   protected dki(dtz.d $$0, jj $$1, eyx $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dki> a();

   @Nullable
   @Override
   public dua a(cyw $$0) {
      dua $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dua a(ddt $$0) {
      return this.o();
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      je $$3 = $$2.a(this.a.g());
      dua $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(dua $$0) {
      return true;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return this.d;
   }

   protected abstract dkk c();

   protected abstract dgv b();
}
