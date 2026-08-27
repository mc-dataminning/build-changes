import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddp extends dac {
   protected final ih a;
   protected final boolean b;
   protected final eqm d;

   protected ddp(dna.d $$0, ih $$1, eqm $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends ddp> a();

   @Nullable
   @Override
   public dnb a(csu $$0) {
      dnb $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dnb a(cxc $$0) {
      return this.o();
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      ib $$3 = $$2.a(this.a.g());
      dnb $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(dnb $$0) {
      return true;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return this.d;
   }

   protected abstract ddr c();

   protected abstract dac b();
}
