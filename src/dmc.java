import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmc extends diq {
   protected final jm a;
   protected final boolean b;
   protected final fas d;

   protected dmc(dvu.d $$0, jm $$1, fas $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dmc> a();

   @Nullable
   @Override
   public dvv a(dad $$0) {
      dvv $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public dvv b(azu $$0) {
      return this.m();
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      jh $$3 = $$2.a(this.a.g());
      dvv $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(dvv $$0) {
      return true;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return this.d;
   }

   protected abstract dme c();

   protected abstract diq b();
}
