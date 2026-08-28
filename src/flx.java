public class flx extends fnd {
   private final Runnable c;
   protected final flx.a a;
   private final wu q;
   private final boolean r;
   private fif s = fif.a;
   protected int b;
   private fho u;

   public flx(Runnable $$0, flx.a $$1, wu $$2, wu $$3, boolean $$4) {
      super($$2);
      this.c = $$0;
      this.a = $$1;
      this.q = $$3;
      this.r = $$4;
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.s = fif.a(this.o, this.q, this.m - 50);
      int $$0 = (this.s.a() + 1) * 9;
      this.c(fhm.a(wu.c("selectWorld.backupJoinConfirmButton"), $$0x -> this.a.proceed(true, this.u.a())).a(this.m / 2 - 155, 100 + $$0, 150, 20).a());
      this.c(fhm.a(wu.c("selectWorld.backupJoinSkipButton"), $$0x -> this.a.proceed(false, this.u.a())).a(this.m / 2 - 155 + 160, 100 + $$0, 150, 20).a());
      this.c(fhm.a(wt.e, $$0x -> this.c.run()).a(this.m / 2 - 155 + 80, 124 + $$0, 150, 20).a());
      this.u = fho.a(wu.c("selectWorld.backupEraseCache"), this.o).a(this.m / 2 - 155 + 80, 76 + $$0).a();
      if (this.r) {
         this.c(this.u);
      }
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 50, 16777215);
      this.s.a($$0, this.m / 2, 70);
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
