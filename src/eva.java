import javax.annotation.Nullable;

public abstract class eva {
   protected final dqk a;

   protected eva(dqk $$0) {
      this.a = $$0;
   }

   public abstract void a(dgz var1, jh var2, dxo var3, @Nullable euy var4, boolean var5);

   protected int a(dgz $$0, jh $$1) {
      return this.a.a($$0, $$1);
   }

   protected int a(jh $$0, dxo $$1) {
      return $$1.a(this.a) ? $$1.c(dqk.f) : 0;
   }

   protected int b(dgz $$0, jh $$1) {
      int $$2 = 0;

      for (jm $$3 : jm.c.a) {
         jh $$4 = $$1.a($$3);
         dxo $$5 = $$0.a_($$4);
         $$2 = Math.max($$2, this.a($$4, $$5));
         jh $$6 = $$1.d();
         if ($$5.d($$0, $$4) && !$$0.a_($$6).d($$0, $$6)) {
            jh $$7 = $$4.d();
            $$2 = Math.max($$2, this.a($$7, $$0.a_($$7)));
         } else if (!$$5.d($$0, $$4)) {
            jh $$8 = $$4.e();
            $$2 = Math.max($$2, this.a($$8, $$0.a_($$8)));
         }
      }

      return Math.max(0, $$2 - 1);
   }
}
