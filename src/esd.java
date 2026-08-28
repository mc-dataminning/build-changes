import javax.annotation.Nullable;

public abstract class esd {
   protected final dnp a;

   protected esd(dnp $$0) {
      this.a = $$0;
   }

   public abstract void a(dej var1, jf var2, dus var3, @Nullable esb var4, boolean var5);

   protected int a(dej $$0, jf $$1) {
      return this.a.a($$0, $$1);
   }

   protected int a(jf $$0, dus $$1) {
      return $$1.a(this.a) ? $$1.c(dnp.f) : 0;
   }

   protected int b(dej $$0, jf $$1) {
      int $$2 = 0;

      for (jk $$3 : jk.c.a) {
         jf $$4 = $$1.a($$3);
         dus $$5 = $$0.a_($$4);
         $$2 = Math.max($$2, this.a($$4, $$5));
         jf $$6 = $$1.d();
         if ($$5.d($$0, $$4) && !$$0.a_($$6).d($$0, $$6)) {
            jf $$7 = $$4.d();
            $$2 = Math.max($$2, this.a($$7, $$0.a_($$7)));
         } else if (!$$5.d($$0, $$4)) {
            jf $$8 = $$4.e();
            $$2 = Math.max($$2, this.a($$8, $$0.a_($$8)));
         }
      }

      return Math.max(0, $$2 - 1);
   }
}
