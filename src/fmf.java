public class fmf extends fnl {
   private final Runnable c;
   protected final fmf.a a;
   private final wu q;
   private final boolean r;
   private fin s = fin.a;
   protected int b;
   private fhw u;

   public fmf(Runnable $$0, fmf.a $$1, wu $$2, wu $$3, boolean $$4) {
      super($$2);
      this.c = $$0;
      this.a = $$1;
      this.q = $$3;
      this.r = $$4;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.s = fin.a(this.o, this.q, this.m - 50);
      int $$0 = (this.s.a() + 1) * 9;
      this.c(fhu.a(wu.c("selectWorld.backupJoinConfirmButton"), $$0x -> this.a.proceed(true, this.u.a())).a(this.m / 2 - 155, 100 + $$0, 150, 20).a());
      this.c(fhu.a(wu.c("selectWorld.backupJoinSkipButton"), $$0x -> this.a.proceed(false, this.u.a())).a(this.m / 2 - 155 + 160, 100 + $$0, 150, 20).a());
      this.c(fhu.a(wt.e, $$0x -> this.c.run()).a(this.m / 2 - 155 + 80, 124 + $$0, 150, 20).a());
      this.u = fhw.a(wu.c("selectWorld.backupEraseCache"), this.o).a(this.m / 2 - 155 + 80, 76 + $$0).a();
      if (this.r) {
         this.c(this.u);
      }
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 50, 16777215);
      this.s.a($$0, this.m / 2, 70);
   }

   @Override
   public boolean aF_() {
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
