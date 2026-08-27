import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhn extends dea {
   protected final it a;
   protected final boolean b;
   protected final evf d;

   protected dhn(drc.d $$0, it $$1, evf $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dhn> a();

   @Nullable
   @Override
   public drd a(cxb $$0) {
      drd $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().n();
   }

   public drd a(dba $$0) {
      return this.n();
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      io $$3 = $$2.a(this.a.g());
      drd $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(drd $$0) {
      return true;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return this.d;
   }

   protected abstract dhp c();

   protected abstract dea b();
}
