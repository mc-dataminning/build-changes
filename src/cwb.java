import javax.annotation.Nullable;

public abstract class cwb extends csq {
   protected final hc a;
   protected final boolean b;
   protected final eib c;

   protected cwb(dfd.d $$0, hc $$1, eib $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.c = $$2;
      this.b = $$3;
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      dfe $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.b()) && !$$1.a(this.a()) ? this.a($$0.q()) : this.a().n();
   }

   public dfe a(cpr $$0) {
      return this.n();
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      gw $$3 = $$2.a(this.a.g());
      dfe $$4 = $$1.a_($$3);
      return !this.h($$4) ? false : $$4.a(this.b()) || $$4.a(this.a()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean h(dfe $$0) {
      return true;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return this.c;
   }

   protected abstract cwd b();

   protected abstract csq a();
}
