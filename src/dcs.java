import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dcs extends czf {
   protected final ih a;
   protected final boolean b;
   protected final epo d;

   protected dcs(dmd.d $$0, ih $$1, epo $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dcs> a();

   @Nullable
   @Override
   public dme a(crx $$0) {
      dme $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dme a(cwf $$0) {
      return this.o();
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      ib $$3 = $$2.a(this.a.g());
      dme $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(dme $$0) {
      return true;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return this.d;
   }

   protected abstract dcu c();

   protected abstract czf b();
}
