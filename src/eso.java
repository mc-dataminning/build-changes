import javax.annotation.Nullable;

public abstract class eso {
   protected final doa a;

   protected eso(doa $$0) {
      this.a = $$0;
   }

   public abstract void a(dev var1, jg var2, dvd var3, @Nullable esm var4, boolean var5);

   protected int a(dev $$0, jg $$1) {
      return this.a.a($$0, $$1);
   }

   protected int a(jg $$0, dvd $$1) {
      return $$1.a(this.a) ? $$1.c(doa.f) : 0;
   }

   protected int b(dev $$0, jg $$1) {
      int $$2 = 0;

      for (jl $$3 : jl.c.a) {
         jg $$4 = $$1.a($$3);
         dvd $$5 = $$0.a_($$4);
         $$2 = Math.max($$2, this.a($$4, $$5));
         jg $$6 = $$1.d();
         if ($$5.d($$0, $$4) && !$$0.a_($$6).d($$0, $$6)) {
            jg $$7 = $$4.d();
            $$2 = Math.max($$2, this.a($$7, $$0.a_($$7)));
         } else if (!$$5.d($$0, $$4)) {
            jg $$8 = $$4.e();
            $$2 = Math.max($$2, this.a($$8, $$0.a_($$8)));
         }
      }

      return Math.max(0, $$2 - 1);
   }
}
