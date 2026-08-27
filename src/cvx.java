import javax.annotation.Nullable;

public abstract class cvx extends csm {
   protected final ha a;
   protected final boolean b;
   protected final ehx c;

   protected cvx(dez.d $$0, ha $$1, ehx $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.c = $$2;
      this.b = $$3;
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      dfa $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.b()) && !$$1.a(this.a()) ? this.a($$0.q()) : this.a().n();
   }

   public dfa a(cpn $$0) {
      return this.n();
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      gu $$3 = $$2.a(this.a.g());
      dfa $$4 = $$1.a_($$3);
      return !this.h($$4) ? false : $$4.a(this.b()) || $$4.a(this.a()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean h(dfa $$0) {
      return true;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return this.c;
   }

   protected abstract cvz b();

   protected abstract csm a();
}
