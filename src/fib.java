public class fib extends fjo {
   private final Runnable c;
   protected final fib.a a;
   private final wg d;
   private final boolean o;
   private fei p = fei.a;
   protected int b;
   private fdr q;

   public fib(Runnable $$0, fib.a $$1, wg $$2, wg $$3, boolean $$4) {
      super($$2);
      this.c = $$0;
      this.a = $$1;
      this.d = $$3;
      this.o = $$4;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.p = fei.a(this.m, this.d, this.k - 50);
      int $$0 = (this.p.a() + 1) * 9;
      this.c(fdp.a(wg.c("selectWorld.backupJoinConfirmButton"), $$0x -> this.a.proceed(true, this.q.a())).a(this.k / 2 - 155, 100 + $$0, 150, 20).a());
      this.c(fdp.a(wg.c("selectWorld.backupJoinSkipButton"), $$0x -> this.a.proceed(false, this.q.a())).a(this.k / 2 - 155 + 160, 100 + $$0, 150, 20).a());
      this.c(fdp.a(wf.e, $$0x -> this.c.run()).a(this.k / 2 - 155 + 80, 124 + $$0, 150, 20).a());
      this.q = fdr.a(wg.c("selectWorld.backupEraseCache"), this.m).a(this.k / 2 - 155 + 80, 76 + $$0).a();
      if (this.o) {
         this.c(this.q);
      }
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 50, 16777215);
      this.p.a($$0, this.k / 2, 70);
   }

   @Override
   public boolean aE_() {
      return false;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.c.run();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   public interface a {
      void proceed(boolean var1, boolean var2);
   }
}
