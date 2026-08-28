import javax.annotation.Nullable;

public abstract class exf {
   protected final dsb a;

   protected exf(dsb $$0) {
      this.a = $$0;
   }

   public abstract void a(dip var1, iu var2, dzo var3, @Nullable exd var4, boolean var5);

   protected int a(dip $$0, iu $$1) {
      return this.a.a($$0, $$1);
   }

   protected int a(iu $$0, dzo $$1) {
      return $$1.a(this.a) ? $$1.c(dsb.f) : 0;
   }

   protected int b(dip $$0, iu $$1) {
      int $$2 = 0;

      for (ja $$3 : ja.c.a) {
         iu $$4 = $$1.a($$3);
         dzo $$5 = $$0.a_($$4);
         $$2 = Math.max($$2, this.a($$4, $$5));
         iu $$6 = $$1.d();
         if ($$5.d($$0, $$4) && !$$0.a_($$6).d($$0, $$6)) {
            iu $$7 = $$4.d();
            $$2 = Math.max($$2, this.a($$7, $$0.a_($$7)));
         } else if (!$$5.d($$0, $$4)) {
            iu $$8 = $$4.e();
            $$2 = Math.max($$2, this.a($$8, $$0.a_($$8)));
         }
      }

      return Math.max(0, $$2 - 1);
   }
}
