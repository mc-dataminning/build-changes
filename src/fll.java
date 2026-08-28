public class fll extends fmy {
   private final Runnable c;
   protected final fll.a a;
   private final xl d;
   private final boolean r;
   private fhs s = fhs.a;
   protected int b;
   private fhb u;

   public fll(Runnable $$0, fll.a $$1, xl $$2, xl $$3, boolean $$4) {
      super($$2);
      this.c = $$0;
      this.a = $$1;
      this.d = $$3;
      this.r = $$4;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.s = fhs.a(this.p, this.d, this.n - 50);
      int $$0 = (this.s.a() + 1) * 9;
      this.c(fgz.a(xl.c("selectWorld.backupJoinConfirmButton"), $$0x -> this.a.proceed(true, this.u.a())).a(this.n / 2 - 155, 100 + $$0, 150, 20).a());
      this.c(fgz.a(xl.c("selectWorld.backupJoinSkipButton"), $$0x -> this.a.proceed(false, this.u.a())).a(this.n / 2 - 155 + 160, 100 + $$0, 150, 20).a());
      this.c(fgz.a(xk.e, $$0x -> this.c.run()).a(this.n / 2 - 155 + 80, 124 + $$0, 150, 20).a());
      this.u = fhb.a(xl.c("selectWorld.backupEraseCache"), this.p).a(this.n / 2 - 155 + 80, 76 + $$0).a();
      if (this.r) {
         this.c(this.u);
      }
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      this.s.a($$0, this.n / 2, 70);
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
