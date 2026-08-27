import javax.annotation.Nullable;

public abstract class cwi extends csx {
   protected final hc a;
   protected final boolean b;
   protected final eii c;

   protected cwi(dfk.d $$0, hc $$1, eii $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.c = $$2;
      this.b = $$3;
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      dfl $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.b()) && !$$1.a(this.a()) ? this.a($$0.q()) : this.a().n();
   }

   public dfl a(cpy $$0) {
      return this.n();
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      gw $$3 = $$2.a(this.a.g());
      dfl $$4 = $$1.a_($$3);
      return !this.h($$4) ? false : $$4.a(this.b()) || $$4.a(this.a()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean h(dfl $$0) {
      return true;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return this.c;
   }

   protected abstract cwk b();

   protected abstract csx a();
}
