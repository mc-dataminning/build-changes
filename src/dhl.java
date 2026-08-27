import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhl extends ddy {
   protected final it a;
   protected final boolean b;
   protected final evd d;

   protected dhl(dra.d $$0, it $$1, evd $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dhl> a();

   @Nullable
   @Override
   public drb a(cwz $$0) {
      drb $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().n();
   }

   public drb a(day $$0) {
      return this.n();
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      io $$3 = $$2.a(this.a.g());
      drb $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(drb $$0) {
      return true;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return this.d;
   }

   protected abstract dhn c();

   protected abstract ddy b();
}
