import javax.annotation.Nullable;

public abstract class erz {
   protected final dnm a;

   protected erz(dnm $$0) {
      this.a = $$0;
   }

   public abstract void a(deg var1, je var2, duo var3, @Nullable erx var4, boolean var5);

   protected int a(deg $$0, je $$1) {
      return this.a.a($$0, $$1);
   }

   protected int a(je $$0, duo $$1) {
      return $$1.a(this.a) ? $$1.c(dnm.f) : 0;
   }

   protected int b(deg $$0, je $$1) {
      int $$2 = 0;

      for (jj $$3 : jj.c.a) {
         je $$4 = $$1.a($$3);
         duo $$5 = $$0.a_($$4);
         $$2 = Math.max($$2, this.a($$4, $$5));
         je $$6 = $$1.d();
         if ($$5.d($$0, $$4) && !$$0.a_($$6).d($$0, $$6)) {
            je $$7 = $$4.d();
            $$2 = Math.max($$2, this.a($$7, $$0.a_($$7)));
         } else if (!$$5.d($$0, $$4)) {
            je $$8 = $$4.e();
            $$2 = Math.max($$2, this.a($$8, $$0.a_($$8)));
         }
      }

      return Math.max(0, $$2 - 1);
   }
}
