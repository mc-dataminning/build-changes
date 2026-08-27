import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddn extends daa {
   protected final ih a;
   protected final boolean b;
   protected final eqk d;

   protected ddn(dmy.d $$0, ih $$1, eqk $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends ddn> a();

   @Nullable
   @Override
   public dmz a(css $$0) {
      dmz $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dmz a(cxa $$0) {
      return this.o();
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      ib $$3 = $$2.a(this.a.g());
      dmz $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(dmz $$0) {
      return true;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return this.d;
   }

   protected abstract ddp c();

   protected abstract daa b();
}
