import javax.annotation.Nullable;

public abstract class ewd {
   protected final drb a;

   protected ewd(drb $$0) {
      this.a = $$0;
   }

   public abstract void a(dhp var1, jj var2, dym var3, @Nullable ewb var4, boolean var5);

   protected int a(dhp $$0, jj $$1) {
      return this.a.a($$0, $$1);
   }

   protected int a(jj $$0, dym $$1) {
      return $$1.a(this.a) ? $$1.c(drb.f) : 0;
   }

   protected int b(dhp $$0, jj $$1) {
      int $$2 = 0;

      for (jo $$3 : jo.c.a) {
         jj $$4 = $$1.a($$3);
         dym $$5 = $$0.a_($$4);
         $$2 = Math.max($$2, this.a($$4, $$5));
         jj $$6 = $$1.d();
         if ($$5.d($$0, $$4) && !$$0.a_($$6).d($$0, $$6)) {
            jj $$7 = $$4.d();
            $$2 = Math.max($$2, this.a($$7, $$0.a_($$7)));
         } else if (!$$5.d($$0, $$4)) {
            jj $$8 = $$4.e();
            $$2 = Math.max($$2, this.a($$8, $$0.a_($$8)));
         }
      }

      return Math.max(0, $$2 - 1);
   }
}
