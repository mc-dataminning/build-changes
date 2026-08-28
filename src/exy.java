import javax.annotation.Nullable;

public abstract class exy {
   protected final dso a;

   protected exy(dso $$0) {
      this.a = $$0;
   }

   public abstract void a(dja var1, iu var2, eah var3, @Nullable exw var4, boolean var5);

   protected int a(dja $$0, iu $$1) {
      return this.a.a($$0, $$1);
   }

   protected int a(iu $$0, eah $$1) {
      return $$1.a(this.a) ? $$1.c(dso.f) : 0;
   }

   protected int b(dja $$0, iu $$1) {
      int $$2 = 0;

      for (ja $$3 : ja.c.a) {
         iu $$4 = $$1.a($$3);
         eah $$5 = $$0.a_($$4);
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
