import javax.annotation.Nullable;

public abstract class cvw extends csl {
   protected final ha a;
   protected final boolean b;
   protected final ehw c;

   protected cvw(dey.d $$0, ha $$1, ehw $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.c = $$2;
      this.b = $$3;
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      dez $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.b()) && !$$1.a(this.a()) ? this.a($$0.q()) : this.a().n();
   }

   public dez a(cpm $$0) {
      return this.n();
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      gu $$3 = $$2.a(this.a.g());
      dez $$4 = $$1.a_($$3);
      return !this.h($$4) ? false : $$4.a(this.b()) || $$4.a(this.a()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean h(dez $$0) {
      return true;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return this.c;
   }

   protected abstract cvy b();

   protected abstract csl a();
}
