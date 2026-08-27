import javax.annotation.Nullable;

public abstract class cvv extends csk {
   protected final hb a;
   protected final boolean b;
   protected final ehy c;

   protected cvv(dex.d $$0, hb $$1, ehy $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.c = $$2;
      this.b = $$3;
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      dey $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.b()) && !$$1.a(this.a()) ? this.a($$0.q()) : this.a().n();
   }

   public dey a(cpl $$0) {
      return this.n();
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      gv $$3 = $$2.a(this.a.g());
      dey $$4 = $$1.a_($$3);
      return !this.h($$4) ? false : $$4.a(this.b()) || $$4.a(this.a()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean h(dey $$0) {
      return true;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return this.c;
   }

   protected abstract cvx b();

   protected abstract csk a();
}
