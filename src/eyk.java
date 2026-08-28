import javax.annotation.Nullable;

public abstract class eyk {
   protected final dta a;

   protected eyk(dta $$0) {
      this.a = $$0;
   }

   public abstract void a(djm var1, iv var2, eat var3, @Nullable eyi var4, boolean var5);

   protected int a(djm $$0, iv $$1) {
      return this.a.a($$0, $$1);
   }

   protected int a(iv $$0, eat $$1) {
      return $$1.a(this.a) ? $$1.c(dta.f) : 0;
   }

   protected int b(djm $$0, iv $$1) {
      int $$2 = 0;

      for (jb $$3 : jb.c.a) {
         iv $$4 = $$1.a($$3);
         eat $$5 = $$0.a_($$4);
         $$2 = Math.max($$2, this.a($$4, $$5));
         iv $$6 = $$1.d();
         if ($$5.d($$0, $$4) && !$$0.a_($$6).d($$0, $$6)) {
            iv $$7 = $$4.d();
            $$2 = Math.max($$2, this.a($$7, $$0.a_($$7)));
         } else if (!$$5.d($$0, $$4)) {
            iv $$8 = $$4.e();
            $$2 = Math.max($$2, this.a($$8, $$0.a_($$8)));
         }
      }

      return Math.max(0, $$2 - 1);
   }
}
