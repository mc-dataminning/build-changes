import javax.annotation.Nullable;

public abstract class euh {
   protected final dpr a;

   protected euh(dpr $$0) {
      this.a = $$0;
   }

   public abstract void a(dgg var1, ji var2, dwv var3, @Nullable euf var4, boolean var5);

   protected int a(dgg $$0, ji $$1) {
      return this.a.a($$0, $$1);
   }

   protected int a(ji $$0, dwv $$1) {
      return $$1.a(this.a) ? $$1.c(dpr.f) : 0;
   }

   protected int b(dgg $$0, ji $$1) {
      int $$2 = 0;

      for (jn $$3 : jn.c.a) {
         ji $$4 = $$1.a($$3);
         dwv $$5 = $$0.a_($$4);
         $$2 = Math.max($$2, this.a($$4, $$5));
         ji $$6 = $$1.d();
         if ($$5.d($$0, $$4) && !$$0.a_($$6).d($$0, $$6)) {
            ji $$7 = $$4.d();
            $$2 = Math.max($$2, this.a($$7, $$0.a_($$7)));
         } else if (!$$5.d($$0, $$4)) {
            ji $$8 = $$4.e();
            $$2 = Math.max($$2, this.a($$8, $$0.a_($$8)));
         }
      }

      return Math.max(0, $$2 - 1);
   }
}
