public class fmx extends fod {
   private final Runnable c;
   protected final fmx.a a;
   private final wz r;
   private final boolean s;
   private fjf u = fjf.a;
   protected int b;
   private fio v;

   public fmx(Runnable $$0, fmx.a $$1, wz $$2, wz $$3, boolean $$4) {
      super($$2);
      this.c = $$0;
      this.a = $$1;
      this.r = $$3;
      this.s = $$4;
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.u = fjf.a(this.o, this.r, this.m - 50);
      int $$0 = (this.u.a() + 1) * 9;
      this.c(fim.a(wz.c("selectWorld.backupJoinConfirmButton"), $$0x -> this.a.proceed(true, this.v.a())).a(this.m / 2 - 155, 100 + $$0, 150, 20).a());
      this.c(fim.a(wz.c("selectWorld.backupJoinSkipButton"), $$0x -> this.a.proceed(false, this.v.a())).a(this.m / 2 - 155 + 160, 100 + $$0, 150, 20).a());
      this.c(fim.a(wy.e, $$0x -> this.c.run()).a(this.m / 2 - 155 + 80, 124 + $$0, 150, 20).a());
      this.v = fio.a(wz.c("selectWorld.backupEraseCache"), this.o).a(this.m / 2 - 155 + 80, 76 + $$0).a();
      if (this.s) {
         this.c(this.v);
      }
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 50, 16777215);
      this.u.a($$0, this.m / 2, 70);
   }

   @Override
   public boolean aJ_() {
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
